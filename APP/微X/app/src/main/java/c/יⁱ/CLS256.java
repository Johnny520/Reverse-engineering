// Decompiled by JEB v5.42.0.202606242140

package c.יⁱ;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.ˉˆ.CLS64;
import c.ˊﹶ.CLS98;
import c.ˏי.CLS110;
import c.ˏי.CLS112;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS185;

public class CLS256 {
    public Object FLD1010;

    // 此方法包含解密的字符串
    public CLS256(Activity activity0) {
        Class class0 = CLS64.MTH1072().MTH1061("CompatToolbarClass");
        if(class0 == null) {
            return;
        }
        this.FLD1010 = CLS110.MTH1541(class0, new Object[]{activity0, null});
    }

    // 此方法包含解密的字符串
    public Drawable MTH3360() {
        Object object0 = this.FLD1010;
        if(object0 == null) {
            return null;
        }
        try {
            return (Drawable)CLS110.MTH1544(object0, CLS98.MTH1332("Toolbar_getOverflowIcon", "getOverflowIcon"), new Object[0]);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public void MTH3361(Drawable drawable0) {
        Object object0 = this.FLD1010;
        if(object0 != null && drawable0 != null) {
            try {
                CLS110.MTH1544(object0, CLS98.MTH1332("Toolbar_setOverflowIcon", "setOverflowIcon"), new Object[]{drawable0});
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public void MTH3362(int v) {
        Object object0 = this.FLD1010;
        if(object0 == null) {
            return;
        }
        CLS110.MTH1544(object0, "setBackgroundColor", new Object[]{v});
    }

    // 此方法包含解密的字符串
    public void MTH3363(CharSequence charSequence0) {
        Object object0 = this.FLD1010;
        if(object0 == null) {
            return;
        }
        CLS110.MTH1544(object0, CLS98.MTH1332("Toolbar_setTitle", "setTitle"), new Object[]{charSequence0});
    }

    public void MTH3364(LinearLayout linearLayout0) {
        Object object0 = this.FLD1010;
        if(object0 == null) {
            return;
        }
        CLS144.MTH2176(linearLayout0, ((View)object0));
    }

    // 此方法包含解密的字符串
    public void MTH3365(int v) {
        if(this.FLD1010 == null) {
            return;
        }
        if(CLS98.MTH1329("Toolbar_setTitleTextColor")) {
            CLS110.MTH1544(this.FLD1010, CLS98.MTH1289("Toolbar_setTitleTextColor"), new Object[]{v});
            return;
        }
        try {
            TextView textView0 = (TextView)CLS112.MTH1605(this.FLD1010, TextView.class);
            if(textView0 == null) {
                return;
            }
            textView0.setTextColor(v);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 去混淆评级： 中等(50)
    // 此方法包含解密的字符串
    public Menu MTH3366() {
        return this.FLD1010 == null ? null : ((Menu)CLS110.MTH1544(this.FLD1010, CLS98.MTH1332("Toolbar_getMenu", "getMenu"), new Object[0]));
    }
}

