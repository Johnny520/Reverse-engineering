// Decompiled by JEB v5.42.0.202606242140

package c.ˑʼ;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS100;
import c.ˋʿ.CLS99;
import c.יᴵ.CLS147;
import c.ـˉ.CLS204;
import c.ـˉ.CLS258;

public class CLS126 {
    public Object FLD608;

    // 此方法包含解密的字符串
    public CLS126(Activity activity0) {
        Class class0 = CLS147.MTH2641().MTH2642("\uD8E3ompatToolbarClass");
        if(class0 == null) {
            return;
        }
        this.FLD608 = CLS99.MTH2086(class0, new Object[]{activity0, null});
    }

    // 去混淆评级： 中等(50)
    // 此方法包含解密的字符串
    public Menu MTH2429() {
        return this.FLD608 == null ? null : ((Menu)CLS99.MTH2087(this.FLD608, CLS95.MTH2012("\uD8E3oolbar_getMenu", "\uD8E3etMenu"), new Object[0]));
    }

    // 此方法包含解密的字符串
    public void MTH2430(Drawable drawable0) {
        Object object0 = this.FLD608;
        if(object0 != null && drawable0 != null) {
            try {
                CLS99.MTH2087(object0, CLS95.MTH2012("\uD8E3oolbar_setOverflowIcon", "\uD8E3etOverflowIcon"), new Object[]{drawable0});
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
    }

    public void MTH2431(LinearLayout linearLayout0) {
        Object object0 = this.FLD608;
        if(object0 == null) {
            return;
        }
        CLS258.MTH3776(linearLayout0, ((View)object0));
    }

    // 此方法包含解密的字符串
    public Drawable MTH2432() {
        Object object0 = this.FLD608;
        if(object0 == null) {
            return null;
        }
        try {
            return (Drawable)CLS99.MTH2087(object0, CLS95.MTH2012("\uD8E3oolbar_getOverflowIcon", "\uD8E3etOverflowIcon"), new Object[0]);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public void MTH2433(int v) {
        if(this.FLD608 == null) {
            return;
        }
        if(CLS95.MTH1981("\uD8E3oolbar_setTitleTextColor")) {
            CLS99.MTH2087(this.FLD608, CLS95.MTH2004("\uD8E3oolbar_setTitleTextColor"), new Object[]{v});
            return;
        }
        try {
            TextView textView0 = (TextView)CLS100.MTH2113(this.FLD608, TextView.class);
            if(textView0 == null) {
                return;
            }
            textView0.setTextColor(v);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public void MTH2434(CharSequence charSequence0) {
        Object object0 = this.FLD608;
        if(object0 == null) {
            return;
        }
        CLS99.MTH2087(object0, CLS95.MTH2012("\uD8E3oolbar_setTitle", "\uD8E3etTitle"), new Object[]{charSequence0});
    }

    // 此方法包含解密的字符串
    public void MTH2435(int v) {
        Object object0 = this.FLD608;
        if(object0 == null) {
            return;
        }
        CLS99.MTH2087(object0, "\uD8E3etBackgroundColor", new Object[]{v});
    }
}

