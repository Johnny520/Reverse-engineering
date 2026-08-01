// Decompiled by JEB v5.42.0.202606242140

package c.ˑʼ;

import android.app.Activity;
import android.view.View;
import c.ـˉ.CLS179.CLS178;
import c.ـˉ.CLS204;
import c.ـˉ.CLS213;
import c.ـˉ.CLS255.CLS254;
import c.ٴⁱ.CLS315.CLS310;
import c.ٴⁱ.CLS315.CLS314;
import c.ٴⁱ.CLS315;

public class CLS127 {
    public CLS315 FLD612;

    private void MTH2447(Object[] arr_object) {
        CLS315 ٴⁱ0 = this.FLD612;
        if(ٴⁱ0 == null) {
            return;
        }
        ٴⁱ0.addView(((View)arr_object[0]));
    }

    private void MTH2449(Object[] arr_object) {
        CLS315 ٴⁱ0 = new CLS315(((Activity)arr_object[0]));
        this.FLD612 = ٴⁱ0;
        ٴⁱ0.setFocusable(true);
        this.FLD612.setFocusableInTouchMode(true);
        this.FLD612.MTH4544(((CLS314)new CLS635(this)));
    }

    private void MTH2451(Object[] arr_object) {
        if(this.FLD612 == null) {
            return;
        }
        if(!this.FLD612.MTH4554((((Boolean)arr_object[0]).booleanValue() ? 5 : 3))) {
            return;
        }
        this.FLD612.MTH4571();
    }

    private Object MTH2452(Object[] arr_object) {
        return this.FLD612;
    }

    public void MTH2453() {
        public class CLS635 implements CLS314 {
            public final CLS127 FLD611;

            @Override  // c.ٴⁱ.CLS315$CLS314
            public void MTH4493(View view0) {
                CLS213.MTH3304().MTH3330("themes", "DrawerLayout_onDrawerOpened", new Object[]{view0});
            }

            @Override  // c.ٴⁱ.CLS315$CLS314
            public void MTH4494(int v) {
            }

            @Override  // c.ٴⁱ.CLS315$CLS314
            public void MTH4495(View view0, float f) {
                CLS213.MTH3304().MTH3330("themes", "DrawerLayout_onDrawerSlide", new Object[]{view0, f});
            }

            @Override  // c.ٴⁱ.CLS315$CLS314
            public void MTH4496(View view0) {
                CLS213.MTH3304().MTH3330("themes", "DrawerLayout_onDrawerClosed", new Object[]{view0});
            }
        }

        CLS213.MTH3304().MTH3331("DrawerLayout_toggleDrawer", ((CLS178)new CLS630(this))).MTH3331("DrawerLayout_closeDrawer", ((CLS178)new CLS638(this))).MTH3331("DrawerLayout_addView", ((CLS178)new CLS636(this))).MTH3331("DrawerLayout_addContentView", ((CLS178)new CLS637(this))).MTH3314("DrawerLayout_getDrawerObject", ((CLS254)new CLS633(this))).MTH3331("DrawerLayout_create", ((CLS178)new CLS634(this))).MTH3314("DrawerLayout_getLayoutParams", ((CLS254)new CLS632())).MTH3331("DrawerLayout_setMargins", ((CLS178)new CLS629()));
    }

    public static Object MTH2454(Object[] arr_object) {
        int v = (int)(((Integer)arr_object[0]));
        boolean z = ((Boolean)arr_object[1]).booleanValue();
        CLS310 ٴⁱ$ʿˊ0 = new CLS310(v, -1);
        ٴⁱ$ʿˊ0.FLD1375 = z ? 0x800005 : 0x800003;
        return ٴⁱ$ʿˊ0;
    }

    public static void MTH2455(Object[] arr_object) {
        ((CLS310)arr_object[0]).setMargins(((int)(((Integer)arr_object[1]))), ((int)(((Integer)arr_object[2]))), ((int)(((Integer)arr_object[3]))), ((int)(((Integer)arr_object[4]))));
    }

    private void MTH2456(Object[] arr_object) {
        try {
            if(this.FLD612 == null) {
                return;
            }
            int v = ((Boolean)arr_object[0]).booleanValue() ? 5 : 3;
            if(this.FLD612.MTH4554(v)) {
                this.FLD612.MTH4571();
                return;
            }
            this.FLD612.MTH4569(v);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    private void MTH2457(Object[] arr_object) {
        CLS315 ٴⁱ0 = this.FLD612;
        if(ٴⁱ0 == null) {
            return;
        }
        ((Activity)arr_object[0]).addContentView(ٴⁱ0, new CLS310(-1, -1));
    }
}

