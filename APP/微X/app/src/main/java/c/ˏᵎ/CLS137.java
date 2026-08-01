// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toolbar.LayoutParams;
import android.widget.Toolbar;
import c.ˊﹶ.CLS98;
import c.יⁱ.CLS256;
import c.ᴵˉ.CLS283;
import c.ﹶˆ.CLS343;
import c.ﹶˆ.CLS345;
import c.ﹶˆ.CLS816;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class CLS137 extends Dialog {
    public interface CLS135 {
        void MTH2027(CLS283 arg1);
    }

    public interface CLS136 {
        void MTH2028(LinearLayout arg1);
    }

    public ViewGroup FLD586;
    public CLS345 FLD587;
    public CLS256 FLD588;
    public Toolbar FLD589;
    public String FLD590;
    public CLS135 FLD591;
    public CLS136 FLD592;
    public CLS343 FLD593;
    public final String FLD594;
    public CLS136 FLD595;
    public final WeakReference FLD596;

    static {
    }

    // 此方法包含解密的字符串
    public CLS137(Activity activity0, String s) {
        super(activity0, 0x1030011);
        this.FLD594 = "";
        this.FLD596 = new WeakReference(activity0);
    }

    @Override  // android.app.Dialog
    public void dismiss() {
        super.dismiss();
        this.hide();
    }

    @Override  // android.app.Dialog
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.MTH2058();
    }

    @Override  // android.app.Dialog
    public void show() {
        try {
            this.MTH2044();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public void MTH2034(CLS136 ʼﾞ$ﾞⁱ0) {
        this.FLD595 = ʼﾞ$ﾞⁱ0;
    }

    public void MTH2035(CLS343 ˋʼ0) {
        this.FLD593 = ˋʼ0;
    }

    // 此方法包含解密的字符串
    public final TextView MTH2037(Toolbar toolbar0) {
        try {
            Field field0 = toolbar0.getClass().getDeclaredField("mTitleTextView");
            field0.setAccessible(true);
            return (TextView)field0.get(toolbar0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public final int MTH2038() {
        String s = CLS194.MTH2881().MTH2877("getThemeString", new Object[]{"ActionBarColor"});
        return TextUtils.isEmpty(s) ? CLS226.MTH3108() : CLS226.MTH3109(s);
    }

    public final Menu MTH2040(LinearLayout linearLayout0) {
        if(Build.VERSION.SDK_INT >= 21) {
            try {
                this.FLD589 = new Toolbar(this.MTH2054());
                Toolbar.LayoutParams toolbar$LayoutParams0 = new Toolbar.LayoutParams(-1, -2);
                this.FLD589.setLayoutParams(toolbar$LayoutParams0);
                if(CLS226.MTH3102()) {
                    this.FLD589.setPopupTheme(0x103024B);
                }
                else {
                    this.FLD589.setPopupTheme(0x103024A);
                }
                this.FLD589.setBackgroundColor(this.MTH2038());
                if(!TextUtils.isEmpty(this.FLD594)) {
                    this.FLD589.setTitle(this.FLD594);
                    this.FLD589.setTitleTextColor(CLS226.MTH3100());
                    TextView textView0 = this.MTH2037(this.FLD589);
                    if(textView0 != null) {
                        textView0.setGravity(17);
                        textView0.setTextAlignment(4);
                    }
                }
                CLS144.MTH2156(this.FLD589, CLS226.MTH3104());
                CLS144.MTH2176(linearLayout0, this.FLD589);
                return this.FLD589.getMenu();
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return this.MTH2045(linearLayout0);
    }

    public void MTH2042(CLS136 ʼﾞ$ﾞⁱ0) {
        this.FLD592 = ʼﾞ$ﾞⁱ0;
    }

    // 此方法包含解密的字符串
    public final View MTH2043() {
        Activity activity0 = this.MTH2054();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout0.setGravity(0x30);
        linearLayout0.setOrientation(1);
        linearLayout0.setFocusableInTouchMode(true);
        linearLayout0.setLayoutParams(linearLayout$LayoutParams0);
        Menu menu0 = this.MTH2040(linearLayout0);
        CLS283 ˉˎ0 = new CLS283(activity0, linearLayout0, menu0);
        CLS135 ʼﾞ$ⁱˋ0 = this.FLD591;
        if(ʼﾞ$ⁱˋ0 != null) {
            try {
                ʼﾞ$ⁱˋ0.MTH2027(ˉˎ0);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        ˉˎ0.MTH3650();
        if(this.FLD593 != null) {
            if(!TextUtils.isEmpty(this.FLD590)) {
                menu0.add(this.FLD590).setOnMenuItemClickListener((MenuItem menuItem0) -> {
                    this.dismiss();
                    ((CLS816)this.FLD593).MTH4824();
                    return true;
                }).setShowAsAction(2);
            }
            menu0.add("").setOnMenuItemClickListener((MenuItem menuItem0) -> {
                this.MTH2046(null);
                this.dismiss();
                this.FLD593.MTH4826();
                return true;
            }).setShowAsAction(2);
            menu0.add("").setOnMenuItemClickListener((MenuItem menuItem0) -> {
                this.MTH2046(null);
                this.dismiss();
                this.FLD593.MTH4827();
                return true;
            }).setShowAsAction(2);
        }
        LinearLayout linearLayout1 = new LinearLayout(activity0);
        linearLayout1.setGravity(0x30);
        linearLayout1.setOrientation(1);
        linearLayout1.setFocusableInTouchMode(true);
        linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
        if(CLS144.MTH2183()) {
            linearLayout0.addView(linearLayout1);
        }
        CLS136 ʼﾞ$ﾞⁱ0 = this.FLD595;
        if(ʼﾞ$ﾞⁱ0 != null) {
            try {
                ʼﾞ$ﾞⁱ0.MTH2028(linearLayout1);
            }
            catch(Throwable throwable1) {
                CLS185.MTH2708(throwable1);
            }
        }
        this.MTH2057(linearLayout1);
        CLS144.MTH2185(linearLayout0, new ColorDrawable(CLS226.MTH3107()));
        if(this.FLD587 != null) {
            this.setOnDismissListener((DialogInterface dialogInterface0) -> {
                CLS345 ⁱˋ0 = this.FLD587;
                if(ⁱˋ0 == null) {
                    return;
                }
                try {
                    ⁱˋ0.MTH4829();
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            });
        }
        if(CLS144.MTH2183()) {
            return linearLayout0;
        }
        this.setTitle(this.FLD594);
        return linearLayout1;
    }

    public void MTH2044() {
        if(this.isShowing() && this.MTH2052()) {
            return;
        }
        if(this.FLD586 == null) {
            ViewGroup viewGroup0 = (ViewGroup)this.MTH2043();
            this.FLD586 = viewGroup0;
            this.setContentView(viewGroup0);
        }
        super.show();
    }

    // 此方法包含解密的字符串
    public final Menu MTH2045(LinearLayout linearLayout0) {
        if(CLS98.MTH1320("CompatToolbarClass") != null) {
            try {
                CLS256 ˎﹳ0 = new CLS256(this.MTH2054());
                this.FLD588 = ˎﹳ0;
                ˎﹳ0.MTH3362(this.MTH2038());
                if(!TextUtils.isEmpty(this.FLD594)) {
                    this.FLD588.MTH3363(this.FLD594);
                    this.FLD588.MTH3365(CLS226.MTH3100());
                }
                this.FLD588.MTH3364(linearLayout0);
                return this.FLD588.MTH3366();
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return null;
    }

    public void MTH2046(CLS345 ⁱˋ0) {
        this.FLD587 = ⁱˋ0;
    }

    // 检测为 Lambda 实现
    private void MTH2047(DialogInterface dialogInterface0) [...]

    public void MTH2048(String s) {
        this.FLD590 = s;
    }

    // 检测为 Lambda 实现
    private boolean MTH2049(MenuItem menuItem0) [...]

    public void MTH2050(CLS135 ʼﾞ$ⁱˋ0) {
        this.FLD591 = ʼﾞ$ⁱˋ0;
    }

    // 检测为 Lambda 实现
    private boolean MTH2051(MenuItem menuItem0) [...]

    public boolean MTH2052() {
        return this.getWindow().getDecorView().getVisibility() == 0;
    }

    public void MTH2053() {
        this.hide();
    }

    public final Activity MTH2054() {
        return (Activity)this.FLD596.get();
    }

    // 检测为 Lambda 实现
    private boolean MTH2056(MenuItem menuItem0) [...]

    public final void MTH2057(LinearLayout linearLayout0) {
        if(this.FLD592 == null) {
            return;
        }
        try {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -1);
            ScrollView scrollView0 = new ScrollView(this.MTH2054());
            LinearLayout linearLayout1 = new LinearLayout(this.MTH2054());
            linearLayout1.setOrientation(1);
            linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
            try {
                this.FLD592.MTH2028(linearLayout1);
            }
            catch(Throwable throwable1) {
                CLS185.MTH2708(throwable1);
            }
            scrollView0.addView(linearLayout1, new LinearLayout.LayoutParams(-1, -2));
            linearLayout0.addView(scrollView0, new LinearLayout.LayoutParams(-1, -2));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public final void MTH2058() {
        Window window0 = this.getWindow();
        window0.getDecorView().setPadding(0, 0, 0, 0);
        int v = Build.VERSION.SDK_INT;
        if(v >= 16) {
            window0.getDecorView().setBackground(null);
        }
        WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
        windowManager$LayoutParams0.flags &= 0xFFFFFBFF;
        window0.setAttributes(windowManager$LayoutParams0);
        if(!CLS184.MTH2693()) {
            window0.setFlags(0x2000, 0x2000);
        }
        if(v >= 21) {
            window0.clearFlags(0x4000000);
            window0.addFlags(0x80000000);
            window0.setStatusBarColor(this.MTH2038());
        }
    }
}

