// Decompiled by JEB v5.42.0.202606242140

package c.יⁱ;

import android.app.Activity;
import android.view.View;
import c.ˏᵎ.CLS142.CLS141;
import c.ˏᵎ.CLS163.CLS162;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS194;
import c.ᵔʼ.CLS316.CLS311;
import c.ᵔʼ.CLS316.CLS312;
import c.ᵔʼ.CLS316;

public class CLS254 {
    public CLS316 FLD1004;

    public void MTH3331() {
        public class CLS576 implements CLS312 {
            public final CLS254 FLD1003;

            @Override  // c.ᵔʼ.CLS316$CLS312
            public void MTH4542(View view0, float f) {
                CLS194.MTH2881().MTH2893("themes", "DrawerLayout_onDrawerSlide", new Object[]{view0, f});
            }

            @Override  // c.ᵔʼ.CLS316$CLS312
            public void MTH4543(View view0) {
                CLS194.MTH2881().MTH2893("themes", "DrawerLayout_onDrawerClosed", new Object[]{view0});
            }

            @Override  // c.ᵔʼ.CLS316$CLS312
            public void MTH4544(int v) {
            }

            @Override  // c.ᵔʼ.CLS316$CLS312
            public void MTH4545(View view0) {
                CLS194.MTH2881().MTH2893("themes", "DrawerLayout_onDrawerOpened", new Object[]{view0});
            }
        }

        CLS194.MTH2881().MTH2905("DrawerLayout_toggleDrawer", ((CLS141)new CLS575(this))).MTH2905("DrawerLayout_closeDrawer", ((CLS141)new CLS578(this))).MTH2905("DrawerLayout_addView", ((CLS141)new CLS582(this))).MTH2905("DrawerLayout_addContentView", ((CLS141)new CLS579(this))).MTH2899("DrawerLayout_getDrawerObject", ((CLS162)new CLS573(this))).MTH2905("DrawerLayout_create", ((CLS141)new CLS580(this))).MTH2899("DrawerLayout_getLayoutParams", ((CLS162)new CLS577())).MTH2905("DrawerLayout_setMargins", ((CLS141)new CLS574()));
    }

    private void MTH3332(Object[] arr_object) {
        CLS316 ᵔʼ0 = this.FLD1004;
        if(ᵔʼ0 == null) {
            return;
        }
        ᵔʼ0.addView(((View)arr_object[0]));
    }

    private void MTH3334(Object[] arr_object) {
        CLS316 ᵔʼ0 = this.FLD1004;
        if(ᵔʼ0 == null) {
            return;
        }
        ((Activity)arr_object[0]).addContentView(ᵔʼ0, new CLS311(-1, -1));
    }

    private void MTH3336(Object[] arr_object) {
        if(this.FLD1004 == null) {
            return;
        }
        if(!this.FLD1004.MTH4646((((Boolean)arr_object[0]).booleanValue() ? 5 : 3))) {
            return;
        }
        this.FLD1004.MTH4635();
    }

    private Object MTH3338(Object[] arr_object) {
        return this.FLD1004;
    }

    public static void MTH3339(Object[] arr_object) {
        ((CLS311)arr_object[0]).setMargins(((int)(((Integer)arr_object[1]))), ((int)(((Integer)arr_object[2]))), ((int)(((Integer)arr_object[3]))), ((int)(((Integer)arr_object[4]))));
    }

    private void MTH3340(Object[] arr_object) {
        CLS316 ᵔʼ0 = new CLS316(((Activity)arr_object[0]));
        this.FLD1004 = ᵔʼ0;
        ᵔʼ0.setFocusable(true);
        this.FLD1004.setFocusableInTouchMode(true);
        this.FLD1004.MTH4659(((CLS312)new CLS576(this)));
    }

    private void MTH3342(Object[] arr_object) {
        try {
            if(this.FLD1004 == null) {
                return;
            }
            int v = ((Boolean)arr_object[0]).booleanValue() ? 5 : 3;
            if(this.FLD1004.MTH4646(v)) {
                this.FLD1004.MTH4635();
                return;
            }
            this.FLD1004.MTH4639(v);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public static Object MTH3344(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        boolean z = ((Boolean)arr_object[1]).booleanValue();
        CLS311 ᵔʼ$ˈᴵ0 = new CLS311(v, -1);
        ᵔʼ$ˈᴵ0.FLD1456 = z ? 0x800005 : 0x800003;
        return ᵔʼ$ˈᴵ0;
    }
}

