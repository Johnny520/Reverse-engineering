// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.database.Cursor;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ˈˈ.CLS78;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS412;
import java.util.ArrayList;

public final class CLS127 implements MenuItem.OnMenuItemClickListener {
    public final int FLD1088;
    public final CLS818 FLD1089;

    public CLS127(CLS818 ᵎⁱ0, int v) {
        this.FLD1088 = v;
        this.FLD1089 = ᵎⁱ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        CLS818 ᵎⁱ0 = this.FLD1089;
        switch(this.FLD1088) {
            case 0: {
                ᵎⁱ0.getClass();
                CLS371.FLD3470.getClass();
                ArrayList arrayList0 = new ArrayList();
                Cursor cursor0 = CLS371.FLD3470.MTH5307("select * from addr_upload2 where status = 1", null);
                if(cursor0 != null) {
                    if(cursor0.moveToFirst()) {
                        while(true) {
                            String s = CLS182.MTH3472(4101253401113580341L, cursor0);
                            String s1 = CLS182.MTH3472(4101253989524099893L, cursor0);
                            arrayList0.add(new CLS78(s, CLS34.MTH1079(4101254066833511221L, CLS182.MTH3483(CLS182.MTH3472(4101254028178805557L, cursor0)), s1, 4101254079718413109L)));
                            if(!cursor0.moveToNext()) {
                                break;
                            }
                        }
                    }
                    if(!cursor0.isClosed()) {
                        cursor0.close();
                    }
                }
                if(!arrayList0.isEmpty()) {
                    if(!CLS412.MTH6002() && !CLS27.MTH895().MTH938("add_contacts_warn_disable", false)) {
                        CLS395.MTH5745(((CLS140)ᵎⁱ0).MTH3042(), ((CLS11)new CLS816(ᵎⁱ0, arrayList0)), CLS27.MTH889("add_contacts_disclaimer"), "add_contacts_warn_disable");
                        return true;
                    }
                    CLS387.MTH5594(((CLS140)ᵎⁱ0).MTH3042(), arrayList0, true);
                }
                return true;
            }
            case 1: {
                CLS387.MTH5593(((CLS140)ᵎⁱ0).MTH3042(), ((CLS12)new CLS871(ᵎⁱ0, 1)));
                return true;
            }
            default: {
                ᵎⁱ0.getClass();
                if(!CLS412.MTH6002() && !CLS27.MTH895().MTH938("add_contacts_warn_disable", false)) {
                    CLS395.MTH5745(((CLS140)ᵎⁱ0).MTH3042(), ((CLS11)new CLS756(ᵎⁱ0)), CLS27.MTH889("add_contacts_disclaimer"), "add_contacts_warn_disable");
                    return true;
                }
                CLS387.MTH5598(((CLS140)ᵎⁱ0).MTH3042());
                return true;
            }
        }
    }
}

