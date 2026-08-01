package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/* JADX INFO: renamed from: c2 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC0076c2 extends Dialog {

    /* JADX INFO: renamed from: j */
    public static final a f628j = new a(null);

    /* JADX INFO: renamed from: k */
    public static final int f629k = 8;

    /* JADX INFO: renamed from: l */
    private static final u60 f630l = new x51(new C0003a2(0));

    /* JADX INFO: renamed from: m */
    private static final u60 f631m = new x51(new C0003a2(1));

    /* JADX INFO: renamed from: n */
    public static final String f632n = "我已知晓风险并承诺仅用于个人学习且24小时内删除，并承诺遵守上述行为红线与禁止条款，否则自愿承担一切法律后果";

    /* JADX INFO: renamed from: o */
    private static boolean f633o;

    /* JADX INFO: renamed from: d */
    private final String f634d;

    /* JADX INFO: renamed from: e */
    private Button f635e;

    /* JADX INFO: renamed from: f */
    private int f636f;

    /* JADX INFO: renamed from: g */
    private boolean f637g;

    /* JADX INFO: renamed from: h */
    private boolean f638h;

    /* JADX INFO: renamed from: i */
    private final Handler f639i;

    /* JADX INFO: renamed from: c2$c */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class c implements Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            int i = DialogC0076c2.this.f636f;
            DialogC0076c2 dialogC0076c2 = DialogC0076c2.this;
            if (i <= 0) {
                dialogC0076c2.f637g = false;
                DialogC0076c2.this.m398J();
                return;
            }
            Button button = dialogC0076c2.f635e;
            if (button != null) {
                button.setText("同意并进行测试(" + DialogC0076c2.this.f636f + "s)");
            }
            DialogC0076c2.this.f636f--;
            DialogC0076c2.this.f639i.postDelayed(this, 1000L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0076c2(Context context) {
        super(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        context.getClass();
        this.f634d = "欢迎使用本模块 \n     \n 在安装和使用本模块之前，请务必审慎阅读、充分理解以下条款。一旦您继续使用，即视为您已完全同意本协议的全部内容。 \n \n 一、模块性质与用途声明 \n \n 1. 本模块为基于互联网精神免费分享的非商业性个人技术研究作品。 \n \n 2. 本模块仅供个人学习 Android 系统架构、研究 Hook 技术及进行安全测试使用。 \n \n 3. 开发者不对本模块提供任何形式的商业技术支持和维护承诺。 \n \n 二、免责条款 \n \n 1. 设备与数据安全：本模块涉及系统底层的修改，可能导致设备变砖、无限重启、数据丢失等不可预知的风险。用户须自行承担使用本模块带来的一切软硬件故障风险，开发者概不负责。 \n \n 2. 账号与第三方风险：若用户将本模块作用于任何第三方应用程序，由此引发的第三方应用报错、功能异常或账号被封禁等后果，由用户自行承担。 \n \n 3. 法律责任：用户在使用本模块时产生的所有行为及后果均由用户自行负责。开发者不承担任何因用户不当使用而导致的直接或间接法律责任。 \n \n 三、行为红线与禁止条款 \n \n 1. 严禁商业化与倒卖：本模块永久免费。严禁任何人将其用于任何形式的商业盈利（包括但不限于打包售卖、付费进群、引流变现等）。如您在闲鱼、淘宝、酷安等平台付费获取了本模块，请立即退款并举报。 \n \n 2. 严禁黑灰产及破坏行为：严禁将本模块用于任何违法违规用途！包括但不限于：篡改或破坏其他商业软件的正常运行（如破解付费墙、拦截合法广告等损害开发者利益的行为）、窃取用户隐私数据、开发外挂脚本等。 \n \n 3. 限制传播：为避免技术被滥用，请勿将本模块随意分发至未经审核的公开平台，包括但不限于闲鱼、酷安、抖音、快手、微信、QQ、B站、微博等。 \n \n 四、知识产权与删除义务 \n \n 1. 根据《著作权法》关于个人学习研究的合理使用范畴，请您在下载测试本模块后的24 小时内将其从您的设备中彻底删除。 \n \n 2. 若本模块的任何功能无意中侵犯了您的合法权益，请联系开发者，我们将立即停止提供并删除相关代码。";
        this.f636f = 30;
        this.f637g = true;
        this.f639i = new Handler(Looper.getMainLooper());
        setCancelable(false);
        m417r();
        m399K();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    private final int m389A() {
        int i = m422w() ? 255 : 0;
        return Color.argb(120, i, i, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    private final int m390B() {
        int i;
        int i2;
        if (m422w()) {
            i = 40;
            i2 = 255;
        } else {
            i = 30;
            i2 = 0;
        }
        return Color.argb(i, i2, i2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    private final int m391C() {
        int i;
        int i2;
        if (m422w()) {
            i = 60;
            i2 = 255;
        } else {
            i = 10;
            i2 = 0;
        }
        return Color.argb(i, i2, i2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    private final int m392D() {
        int i;
        int i2;
        if (m422w()) {
            i = 100;
            i2 = 255;
        } else {
            i = 50;
            i2 = 0;
        }
        return Color.argb(i, i2, i2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    private final int m393E() {
        return Color.parseColor("#FE2C55");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    private final int m394F() {
        int i = m422w() ? 255 : 0;
        return Color.argb(80, i, i, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    private final int m395G() {
        if (m422w()) {
            return -1;
        }
        return Color.argb(255, 26, 26, 26);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    private final int m396H() {
        int i = m422w() ? 255 : 0;
        return Color.argb(150, i, i, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    private final int m397I() {
        int i = m422w() ? 255 : 0;
        return Color.argb(200, i, i, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final void m398J() {
        boolean z = !this.f637g && this.f638h;
        Button button = this.f635e;
        if (button != null) {
            button.setEnabled(z);
            if (!this.f637g) {
                button.setText(this.f638h ? "同意并进行测试" : "请先粘贴承诺内容");
            }
            button.setTextColor(z ? -1 : m389A());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(m420u(32));
            gradientDrawable.setColor(Color.argb(z ? 220 : 100, 254, 44, 85));
            button.setBackground(gradientDrawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    private final void m399K() {
        this.f639i.post(new c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final String m404e() {
        return "agreed";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final String m405f() {
        return "xp1_agreement";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    private final void m417r() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(m423x());
        linearLayout.setPadding(m420u(20), m420u(28), m420u(20), m420u(16));
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setPadding(0, 0, 0, m420u(4));
        TextView textView = new TextView(getContext());
        textView.setText("挖红薯呀-WHS");
        textView.setTextSize(22.0f);
        textView.setTextColor(m395G());
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(getContext());
        textView2.setText("3.0");
        textView2.setTextSize(13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(typeface);
        textView2.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m420u(4));
        gradientDrawable.setColor(Color.argb(255, 33, 150, 243));
        textView2.setBackground(gradientDrawable);
        textView2.setPadding(m420u(8), m420u(3), m420u(8), m420u(3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(m420u(8), 0, 0, 0);
        textView2.setLayoutParams(layoutParams);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        TextView textView3 = new TextView(getContext());
        textView3.setText("使用协议");
        textView3.setTextSize(16.0f);
        textView3.setTextColor(m396H());
        textView3.setGravity(17);
        textView3.setPadding(0, 0, 0, m420u(16));
        linearLayout.addView(textView3);
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(m420u(12));
        gradientDrawable2.setColor(m391C());
        linearLayout3.setBackground(gradientDrawable2);
        linearLayout3.setPadding(m420u(10), m420u(8), m420u(10), m420u(8));
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        TextView textView4 = new TextView(getContext());
        textView4.setText(m421v(this.f634d));
        textView4.setTextSize(13.0f);
        textView4.setTextColor(m397I());
        textView4.setLineSpacing(m420u(2), 1.0f);
        textView4.setPadding(m420u(4), 0, m420u(4), m420u(8));
        scrollView.addView(textView4);
        linearLayout3.addView(scrollView);
        linearLayout.addView(linearLayout3);
        View view = new View(getContext());
        view.setBackgroundColor(m390B());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, m420u(1));
        layoutParams2.setMargins(0, m420u(10), 0, m420u(10));
        view.setLayoutParams(layoutParams2);
        linearLayout.addView(view);
        TextView textView5 = new TextView(getContext());
        textView5.setText(f632n);
        textView5.setTextSize(12.0f);
        textView5.setTextColor(m393E());
        textView5.setTypeface(typeface);
        textView5.setPadding(m420u(4), 0, m420u(4), m420u(8));
        textView5.setTextIsSelectable(true);
        linearLayout.addView(textView5);
        EditText editText = new EditText(getContext());
        editText.setTextColor(m395G());
        editText.setHintTextColor(m394F());
        editText.setHint("请长按上方文本复制并粘贴到此处");
        editText.setTextSize(12.0f);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(m420u(12));
        gradientDrawable3.setStroke(m420u(1), m392D());
        gradientDrawable3.setColor(m391C());
        editText.setBackground(gradientDrawable3);
        editText.setPadding(m420u(12), m420u(10), m420u(12), m420u(10));
        editText.setMinLines(2);
        editText.setMaxLines(4);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(editText);
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(0, m420u(14), 0, m420u(20));
        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Button button = new Button(getContext());
        button.setText("拒绝并退出");
        button.setTextSize(14.0f);
        button.setTextColor(m425z());
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setShape(0);
        gradientDrawable4.setCornerRadius(m420u(28));
        gradientDrawable4.setColor(m424y());
        button.setBackground(gradientDrawable4);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, m420u(46), 1.0f);
        layoutParams3.setMargins(0, 0, m420u(8), 0);
        button.setLayoutParams(layoutParams3);
        button.setOnClickListener(new ViewOnClickListenerC0984z1());
        linearLayout4.addView(button);
        Button button2 = new Button(getContext());
        button2.setText("同意并进行测试(30s)");
        button2.setTextSize(14.0f);
        button2.setTextColor(m389A());
        button2.setEnabled(false);
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setShape(0);
        gradientDrawable5.setCornerRadius(m420u(28));
        gradientDrawable5.setColor(Color.argb(100, 254, 44, 85));
        button2.setBackground(gradientDrawable5);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, m420u(46), 1.0f);
        layoutParams4.setMargins(m420u(8), 0, 0, 0);
        button2.setLayoutParams(layoutParams4);
        button2.setOnClickListener(new qf0(1, button2, this));
        this.f635e = button2;
        linearLayout4.addView(button2);
        linearLayout.addView(linearLayout4);
        editText.addTextChangedListener(new b());
        setContentView(linearLayout);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(m423x()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m418s(View view) {
        Process.killProcess(Process.myPid());
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m419t(Button button, DialogC0076c2 dialogC0076c2, View view) {
        Context context = button.getContext();
        a aVar = f628j;
        context.getSharedPreferences(aVar.m430e(), 0).edit().putBoolean(aVar.m429d(), true).apply();
        dialogC0076c2.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    private final int m420u(int i) {
        return (int) (i * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    private final Spanned m421v(String str) {
        Spanned spannedFromHtml = Html.fromHtml(r41.m3381R(r41.m3381R(r41.m3381R(r41.m3381R(r41.m3381R(r41.m3381R(r41.m3381R(r41.m3381R(r41.m3381R(r41.m3381R(str, "\n \n一、", "##S##一、"), "\n \n二、", "##S##二、"), "\n \n三、", "##S##三、"), "\n \n四、", "##S##四、"), "\n \n", "\n"), "\n", "<br/>"), "##S##一、", "<br/><br/><b><font color='#FE2C55'>一、"), "##S##二、", "</font></b><br/><br/><b><font color='#FE2C55'>二、"), "##S##三、", "</font></b><br/><br/><b><font color='#FE2C55'>三、"), "##S##四、", "</font></b><br/><br/><b><font color='#FE2C55'>四、").concat("</font></b>"), 0);
        spannedFromHtml.getClass();
        return spannedFromHtml;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    private final boolean m422w() {
        return (getContext().getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    private final int m423x() {
        int i;
        int i2;
        if (m422w()) {
            i = 25;
            i2 = 20;
        } else {
            i = 250;
            i2 = 245;
        }
        return Color.argb(255, i2, i2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    private final int m424y() {
        return m422w() ? Color.argb(200, 100, 100, 110) : Color.argb(30, 0, 0, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    private final int m425z() {
        if (m422w()) {
            return -1;
        }
        return Color.argb(150, 0, 0, 0);
    }

    /* JADX INFO: renamed from: c2$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class a {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: c2.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ a(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final String m429d() {
            return (String) DialogC0076c2.f631m.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public final String m430e() {
            return (String) DialogC0076c2.f630l.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final void m431h(DialogInterface dialogInterface) {
            DialogC0076c2.f633o = false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public final boolean m432f(Context context) {
            context.getClass();
            return context.getSharedPreferences(m430e(), 0).getBoolean(m429d(), false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: g */
        public final void m433g(Activity activity) {
            activity.getClass();
            if (DialogC0076c2.f633o || m432f(activity)) {
                return;
            }
            DialogC0076c2.f633o = true;
            DialogC0076c2 dialogC0076c2 = new DialogC0076c2(activity);
            dialogC0076c2.setOnDismissListener(new DialogInterfaceOnDismissListenerC0040b2(0));
            dialogC0076c2.show();
        }

        private a() {
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    /* JADX INFO: renamed from: c2$b */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class b implements TextWatcher {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            DialogC0076c2.this.f638h = string.equals(DialogC0076c2.f632n);
            DialogC0076c2.this.m398J();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
