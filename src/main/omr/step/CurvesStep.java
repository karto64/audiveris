//------------------------------------------------------------------------------------------------//
//                                                                                                //
//                                       C u r v e s S t e p                                      //
//                                                                                                //
//------------------------------------------------------------------------------------------------//
// <editor-fold defaultstate="collapsed" desc="hdr">
//  Copyright © Herve Bitteur and others 2000-2014. All rights reserved.
//  This software is released under the GNU General Public License.
//  Goto http://kenai.com/projects/audiveris to report bugs or suggestions.
//------------------------------------------------------------------------------------------------//
// </editor-fold>
package omr.step;

import omr.sheet.Sheet;
import omr.sheet.curve.Curves;
import omr.sheet.SystemInfo;

import java.util.Collection;

/**
 * Class {@code CurvesStep} retrieves all curves (slurs, wedges, endings) of a sheet.
 *
 * @author Hervé Bitteur
 */
public class CurvesStep
        extends AbstractStep
{
    //~ Constructors -------------------------------------------------------------------------------

    //-----------//
    // CurvesStep //
    //-----------//
    /**
     * Creates a new SlursStep object.
     */
    public CurvesStep ()
    {
        super(
                Steps.CURVES,
                Level.SHEET_LEVEL,
                Mandatory.MANDATORY,
                DATA_TAB,
                "Retrieve all curves");
    }

    //~ Methods ------------------------------------------------------------------------------------
    //------//
    // doit //
    //------//
    @Override
    protected void doit (Collection<SystemInfo> systems,
                         Sheet sheet)
            throws StepException
    {
        new Curves(sheet).buildCurves();
    }
}
