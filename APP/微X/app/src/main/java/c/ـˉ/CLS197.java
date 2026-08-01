// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

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
import c.ˈⁱ.CLS95;
import c.ˋﹳ.CLS107;
import c.ˋﹳ.CLS111;
import c.ˋﹳ.CLS625;
import c.ˑʼ.CLS126;
import c.ٴˈ.CLS291;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class CLS197 extends Dialog {
    public interface CLS195 {
        void MTH3176(LinearLayout arg1);
    }

    public interface CLS196 {
        void MTH3177(CLS291 arg1);
    }

    public final WeakReference FLD927;
    public CLS126 FLD928;
    public final String FLD929;
    public String FLD930;
    public CLS107 FLD931;
    public CLS111 FLD932;
    public ViewGroup FLD933;
    public CLS195 FLD934;
    public CLS195 FLD935;
    public CLS196 FLD936;
    public Toolbar FLD937;

    static {
    }

    // 此方法包含解密的字符串
    public CLS197(Activity activity0, String s) {
        super(activity0, 0x1030011);
        this.FLD929 = "";
        this.FLD927 = new WeakReference(activity0);
    }

    @Override  // android.app.Dialog
    public void dismiss() {
        super.dismiss();
        this.hide();
    }

    @Override  // android.app.Dialog
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.MTH3203();
    }

    @Override  // android.app.Dialog
    public void show() {
        try {
            this.MTH3206();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public final int MTH3184() {
        String s = CLS213.MTH3304().MTH3299("\uD8E3etThemeString", new Object[]{"\uD8E3ctionBarColor"});
        return TextUtils.isEmpty(s) ? CLS172.MTH3034() : CLS172.MTH3030(s);
    }

    public boolean MTH3186() {
        return this.getWindow().getDecorView().getVisibility() == 0;
    }

    // 此方法包含解密的字符串
    public final View MTH3188() {
        Activity activity0 = this.MTH3196();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout0.setGravity(0x30);
        linearLayout0.setOrientation(1);
        linearLayout0.setFocusableInTouchMode(true);
        linearLayout0.setLayoutParams(linearLayout$LayoutParams0);
        Menu menu0 = this.MTH3197(linearLayout0);
        CLS291 ᵔﹶ0 = new CLS291(activity0, linearLayout0, menu0);
        CLS196 ˆˊ$ˆٴ0 = this.FLD936;
        if(ˆˊ$ˆٴ0 != null) {
            try {
                ˆˊ$ˆٴ0.MTH3177(ᵔﹶ0);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        ᵔﹶ0.MTH4328();
        if(this.FLD932 != null) {
            if(!TextUtils.isEmpty(this.FLD930)) {
                menu0.add(this.FLD930).setOnMenuItemClickListener((MenuItem menuItem0) -> {
                    this.dismiss();
                    ((CLS625)this.FLD932).MTH2280();
                    return true;
                }).setShowAsAction(2);
            }
            menu0.add("").setOnMenuItemClickListener((MenuItem menuItem0) -> {
                this.dismiss();
                this.FLD932.MTH2287();
                return true;
            }).setShowAsAction(2);
            menu0.add("").setOnMenuItemClickListener((MenuItem menuItem0) -> {
                this.dismiss();
                this.FLD932.MTH2286();
                return true;
            }).setShowAsAction(2);
        }
        LinearLayout linearLayout1 = new LinearLayout(activity0);
        linearLayout1.setGravity(0x30);
        linearLayout1.setOrientation(1);
        linearLayout1.setFocusableInTouchMode(true);
        linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
        if(CLS258.MTH3771()) {
            linearLayout0.addView(linearLayout1);
        }
        CLS195 ˆˊ$ʻᵢ0 = this.FLD934;
        if(ˆˊ$ʻᵢ0 != null) {
            try {
                ˆˊ$ʻᵢ0.MTH3176(linearLayout1);
            }
            catch(Throwable throwable1) {
                CLS204.MTH3257(throwable1);
            }
        }
        this.MTH3194(linearLayout1);
        CLS258.MTH3785(linearLayout0, new ColorDrawable(CLS172.MTH3038()));
        if(this.FLD931 != null) {
            this.setOnDismissListener((DialogInterface dialogInterface0) -> try {
                this.FLD931.MTH2281();
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            });
        }
        if(CLS258.MTH3771()) {
            return linearLayout0;
        }
        this.setTitle(this.FLD929);
        return linearLayout1;
    }

    public void MTH3189(CLS195 ˆˊ$ʻᵢ0) {
        this.FLD935 = ˆˊ$ʻᵢ0;
    }

    public void MTH3190(CLS107 ˆٴ0) {
        this.FLD931 = ˆٴ0;
    }

    // 此方法包含解密的字符串
    public final Menu MTH3191(LinearLayout linearLayout0) {
        if(CLS95.MTH2029("\uD8E3ompatToolbarClass") != null) {
            try {
                CLS126 ˋˑ0 = new CLS126(this.MTH3196());
                this.FLD928 = ˋˑ0;
                ˋˑ0.MTH2435(this.MTH3184());
                if(!TextUtils.isEmpty(this.FLD929)) {
                    this.FLD928.MTH2434(this.FLD929);
                    this.FLD928.MTH2433(CLS172.MTH3028());
                }
                this.FLD928.MTH2431(linearLayout0);
                return this.FLD928.MTH2429();
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final TextView MTH3192(Toolbar toolbar0) {
        try {
            Field field0 = toolbar0.getClass().getDeclaredField("\uD8E3TitleTextView");
            field0.setAccessible(true);
            return (TextView)field0.get(toolbar0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    // 检测为 Lambda 实现
    private boolean MTH3193(MenuItem menuItem0) [...]

    public final void MTH3194(LinearLayout linearLayout0) {
        if(this.FLD935 == null) {
            return;
        }
        try {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -1);
            ScrollView scrollView0 = new ScrollView(this.MTH3196());
            LinearLayout linearLayout1 = new LinearLayout(this.MTH3196());
            linearLayout1.setOrientation(1);
            linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
            try {
                this.FLD935.MTH3176(linearLayout1);
            }
            catch(Throwable throwable1) {
                CLS204.MTH3257(throwable1);
            }
            scrollView0.addView(linearLayout1, new LinearLayout.LayoutParams(-1, -2));
            linearLayout0.addView(scrollView0, new LinearLayout.LayoutParams(-1, -2));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 检测为 Lambda 实现
    private boolean MTH3195(MenuItem menuItem0) [...]

    public final Activity MTH3196() {
        return (Activity)this.FLD927.get();
    }

    public final Menu MTH3197(LinearLayout linearLayout0) {
        if(Build.VERSION.SDK_INT >= 21) {
            try {
                this.FLD937 = new Toolbar(this.MTH3196());
                Toolbar.LayoutParams toolbar$LayoutParams0 = new Toolbar.LayoutParams(-1, -2);
                this.FLD937.setLayoutParams(toolbar$LayoutParams0);
                if(CLS172.MTH3035()) {
                    this.FLD937.setPopupTheme(0x103024B);
                }
                else {
                    this.FLD937.setPopupTheme(0x103024A);
                }
                this.FLD937.setBackgroundColor(this.MTH3184());
                if(!TextUtils.isEmpty(this.FLD929)) {
                    this.FLD937.setTitle(this.FLD929);
                    this.FLD937.setTitleTextColor(CLS172.MTH3028());
                    TextView textView0 = this.MTH3192(this.FLD937);
                    if(textView0 != null) {
                        textView0.setGravity(17);
                        textView0.setTextAlignment(4);
                    }
                }
                CLS258.MTH3794(this.FLD937, CLS172.MTH3031());
                CLS258.MTH3776(linearLayout0, this.FLD937);
                return this.FLD937.getMenu();
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return this.MTH3191(linearLayout0);
    }

    // 检测为 Lambda 实现
    private void MTH3198(DialogInterface dialogInterface0) [...]

    public void MTH3199(String s) {
        this.FLD930 = s;
    }

    public void MTH3201(CLS111 ᴵⁱ0) {
        this.FLD932 = ᴵⁱ0;
    }

    // 检测为 Lambda 实现
    private boolean MTH3202(MenuItem menuItem0) [...]

    public final void MTH3203() {
        Window window0 = this.getWindow();
        window0.getDecorView().setPadding(0, 0, 0, 0);
        int v = Build.VERSION.SDK_INT;
        if(v >= 16) {
            window0.getDecorView().setBackground(null);
        }
        WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
        windowManager$LayoutParams0.flags &= 0xFFFFFBFF;
        window0.setAttributes(windowManager$LayoutParams0);
        if(!CLS224.MTH3441()) {
            window0.setFlags(0x2000, 0x2000);
        }
        if(v >= 21) {
            window0.clearFlags(0x4000000);
            window0.addFlags(0x80000000);
            window0.setStatusBarColor(this.MTH3184());
        }
    }

    public void MTH3204(CLS195 ˆˊ$ʻᵢ0) {
        this.FLD934 = ˆˊ$ʻᵢ0;
    }

    public void MTH3205() {
        this.hide();
    }

    public void MTH3206() {
        if(this.isShowing() && this.MTH3186()) {
            return;
        }
        if(this.FLD933 == null) {
            ViewGroup viewGroup0 = (ViewGroup)this.MTH3188();
            this.FLD933 = viewGroup0;
            this.setContentView(viewGroup0);
        }
        super.show();
    }

    public void MTH3208(CLS196 ˆˊ$ˆٴ0) {
        this.FLD936 = ˆˊ$ˆٴ0;
    }
}

