package p000;

import android.R;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import p000.n90;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class m90 extends Dialog {

    /* JADX INFO: renamed from: m */
    public static final C0465a f3876m = new C0465a(null);

    /* JADX INFO: renamed from: n */
    public static final int f3877n = 8;

    /* JADX INFO: renamed from: o */
    private static boolean f3878o;

    /* JADX INFO: renamed from: d */
    private final String f3879d;

    /* JADX INFO: renamed from: e */
    private final boolean f3880e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0298hw f3881f;

    /* JADX INFO: renamed from: g */
    private final Handler f3882g;

    /* JADX INFO: renamed from: h */
    private boolean f3883h;

    /* JADX INFO: renamed from: i */
    private Button f3884i;

    /* JADX INFO: renamed from: j */
    private EditText f3885j;

    /* JADX INFO: renamed from: k */
    private TextView f3886k;

    /* JADX INFO: renamed from: l */
    private ProgressBar f3887l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m90(Context context, String str, boolean z, InterfaceC0298hw interfaceC0298hw) {
        super(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        context.getClass();
        str.getClass();
        interfaceC0298hw.getClass();
        this.f3879d = str;
        this.f3880e = z;
        this.f3881f = interfaceC0298hw;
        this.f3882g = new Handler(Looper.getMainLooper());
        setCancelable(false);
        m2464i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    private final int m2450A() {
        if (m2472q()) {
            return -1;
        }
        return Color.argb(255, 26, 26, 26);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    private final int m2451B() {
        return m2472q() ? Color.argb(180, 255, 160, 120) : Color.parseColor("#B85A20");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    private final int m2452C() {
        return m2472q() ? Color.argb(220, 255, 200, 100) : Color.parseColor("#CC6A00");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    private final int m2453D() {
        return m2472q() ? Color.argb(60, 255, 180, 60) : Color.argb(30, 255, 140, 40);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    private final int m2454E() {
        int i;
        int i2;
        int i3;
        if (m2472q()) {
            i = 180;
            i2 = 60;
            i3 = 100;
        } else {
            i = 140;
            i2 = 40;
            i3 = 200;
        }
        return Color.argb(i3, 255, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m2455F() {
        String string;
        Editable text;
        String string2;
        if (this.f3883h || !this.f3880e) {
            return;
        }
        EditText editText = this.f3885j;
        if (editText == null || (text = editText.getText()) == null || (string2 = text.toString()) == null || (string = k41.m1775g0(string2).toString()) == null) {
            string = "";
        }
        boolean z = string.length() > 0;
        Button button = this.f3884i;
        if (button != null) {
            button.setEnabled(z);
            button.setTextColor(z ? -1 : m2474s());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(m2471p(32));
            gradientDrawable.setColor(Color.argb(z ? 220 : 100, 254, 44, 85));
            button.setBackground(gradientDrawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    private final void m2464i() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(m2473r());
        linearLayout.setPadding(m2471p(16), m2471p(36), m2471p(16), m2471p(16));
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        TextView textView = new TextView(getContext());
        textView.setText("授权验证");
        textView.setTextSize(20.0f);
        textView.setTextColor(m2450A());
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, m2471p(8));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(getContext());
        textView2.setText("输入你的授权码以启用模块功能");
        textView2.setTextSize(13.0f);
        textView2.setTextColor(m2481z());
        textView2.setGravity(17);
        textView2.setPadding(0, 0, 0, m2471p(16));
        linearLayout.addView(textView2);
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(getContext());
        textView3.setText("小红书账号ID");
        textView3.setTextSize(12.0f);
        textView3.setTextColor(m2480y());
        textView3.setPadding(m2471p(4), 0, 0, m2471p(4));
        linearLayout2.addView(textView3);
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(0, 0, 0, m2471p(14));
        TextView textView4 = new TextView(getContext());
        textView4.setText(this.f3880e ? this.f3879d : "⚠️ 未登录，请先登录小红书账号后再验证");
        textView4.setTextSize(14.0f);
        textView4.setTextColor(this.f3880e ? m2450A() : m2452C());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m2471p(10));
        if (this.f3880e) {
            gradientDrawable.setStroke(m2471p(1), m2477v());
            gradientDrawable.setColor(m2476u());
        } else {
            gradientDrawable.setStroke(m2471p(1), m2454E());
            gradientDrawable.setColor(m2453D());
        }
        textView4.setBackground(gradientDrawable);
        textView4.setPadding(m2471p(14), m2471p(10), m2471p(14), m2471p(10));
        textView4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        textView4.setTextIsSelectable(this.f3880e);
        linearLayout3.addView(textView4);
        Button button = new Button(getContext());
        button.setText("复制");
        button.setTextSize(12.0f);
        button.setTextColor(m2450A());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(m2471p(10));
        gradientDrawable2.setColor(Color.argb(200, 254, 44, 85));
        button.setBackground(gradientDrawable2);
        button.setPadding(m2471p(14), m2471p(10), m2471p(14), m2471p(10));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(m2471p(8), 0, 0, 0);
        button.setLayoutParams(layoutParams);
        button.setVisibility(this.f3880e ? 0 : 8);
        button.setOnClickListener(new qf0(2, button, this));
        linearLayout3.addView(button);
        linearLayout2.addView(linearLayout3);
        TextView textView5 = new TextView(getContext());
        textView5.setText("⚠️ 上方显示的小红书号仅供参考，自己核对好是否正确，否则后果自负");
        textView5.setTextSize(11.0f);
        textView5.setTextColor(Color.argb(200, 255, 80, 80));
        textView5.setGravity(17);
        textView5.setPadding(m2471p(4), 0, m2471p(4), m2471p(14));
        linearLayout2.addView(textView5);
        TextView textView6 = new TextView(getContext());
        textView6.setText("授权码");
        textView6.setTextSize(12.0f);
        textView6.setTextColor(m2480y());
        textView6.setPadding(m2471p(4), 0, 0, m2471p(4));
        linearLayout2.addView(textView6);
        EditText editText = new EditText(getContext());
        editText.setTextColor(m2450A());
        editText.setHintTextColor(Color.argb(80, m2472q() ? 255 : 0, m2472q() ? 255 : 0, m2472q() ? 255 : 0));
        editText.setHint("输入授权码");
        editText.setTextSize(16.0f);
        editText.setGravity(17);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(m2471p(12));
        gradientDrawable3.setStroke(m2471p(1), m2479x());
        gradientDrawable3.setColor(m2478w());
        editText.setBackground(gradientDrawable3);
        editText.setPadding(m2471p(14), m2471p(12), m2471p(14), m2471p(12));
        editText.setMaxLines(1);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f3885j = editText;
        linearLayout2.addView(editText);
        TextView textView7 = new TextView(getContext());
        textView7.setText("⚠️ 授权码与小红书账号绑定，请确保输入正确的授权码。如未登录，请先登录小红书后重新打开验证。");
        textView7.setTextSize(12.0f);
        textView7.setTextColor(m2451B());
        textView7.setLineSpacing(m2471p(3), 1.0f);
        textView7.setPadding(m2471p(4), m2471p(14), m2471p(4), 0);
        linearLayout2.addView(textView7);
        TextView textView8 = new TextView(getContext());
        textView8.setText("");
        textView8.setTextSize(13.0f);
        textView8.setTextColor(Color.argb(200, 255, 200, 0));
        textView8.setGravity(17);
        textView8.setPadding(0, m2471p(8), 0, 0);
        textView8.setVisibility(8);
        this.f3886k = textView8;
        linearLayout2.addView(textView8);
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(8);
        progressBar.setPadding(m2471p(40), m2471p(4), m2471p(40), m2471p(4));
        this.f3887l = progressBar;
        linearLayout2.addView(progressBar);
        scrollView.addView(linearLayout2);
        linearLayout.addView(scrollView);
        View view = new View(getContext());
        view.setBackgroundColor(m2475t());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, m2471p(1));
        layoutParams2.setMargins(0, m2471p(4), 0, m2471p(10));
        view.setLayoutParams(layoutParams2);
        linearLayout.addView(view);
        Button button2 = new Button(getContext());
        button2.setText(this.f3880e ? "验证授权" : "请先登录小红书");
        button2.setTextSize(16.0f);
        button2.setTextColor(m2474s());
        button2.setEnabled(false);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setShape(0);
        gradientDrawable4.setCornerRadius(m2471p(32));
        gradientDrawable4.setColor(Color.argb(100, 254, 44, 85));
        button2.setBackground(gradientDrawable4);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, m2471p(48));
        layoutParams3.setMargins(0, 0, 0, m2471p(24));
        button2.setLayoutParams(layoutParams3);
        button2.setOnClickListener(new ViewOnClickListenerC0363jp(this, 2));
        this.f3884i = button2;
        linearLayout.addView(button2);
        EditText editText2 = this.f3885j;
        if (editText2 != null) {
            editText2.addTextChangedListener(new C0466b());
        }
        setContentView(linearLayout);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(m2473r()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m2465j(Button button, m90 m90Var, View view) {
        Object systemService = button.getContext().getSystemService("clipboard");
        systemService.getClass();
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("xhs_id", m90Var.f3879d));
        Toast.makeText(button.getContext(), "已复制", 0).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m2466k(m90 m90Var, View view) {
        m90Var.m2467l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    private final void m2467l() {
        EditText editText;
        Editable text;
        String string;
        String string2;
        if (this.f3883h || !this.f3880e || (editText = this.f3885j) == null || (text = editText.getText()) == null || (string = text.toString()) == null || (string2 = k41.m1775g0(string).toString()) == null || string2.length() == 0) {
            return;
        }
        EditText editText2 = this.f3885j;
        if (editText2 != null) {
            Object systemService = getContext().getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText2.getWindowToken(), 0);
            }
        }
        this.f3883h = true;
        TextView textView = this.f3886k;
        if (textView != null) {
            textView.setText("正在验证...");
            textView.setTextColor(Color.argb(200, 255, 200, 0));
            textView.setVisibility(0);
        }
        ProgressBar progressBar = this.f3887l;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        Button button = this.f3884i;
        if (button != null) {
            button.setEnabled(false);
        }
        new Thread(new RunnableC0751t4(7, this, string2)).start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m2468m(m90 m90Var, String str) {
        n90 n90Var = n90.f4211a;
        Context context = m90Var.getContext();
        context.getClass();
        m90Var.f3882g.post(new RunnableC0751t4(6, m90Var, n90Var.m2675O(context, str, m90Var.f3879d)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m2469n(m90 m90Var, n90.C0504a c0504a) {
        String strConcat;
        m90Var.f3883h = false;
        ProgressBar progressBar = m90Var.f3887l;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        boolean zM2683e = c0504a.m2683e();
        TextView textView = m90Var.f3886k;
        if (zM2683e) {
            if (textView != null) {
                textView.setText("✅ 授权成功，模块已启用");
                textView.setTextColor(Color.argb(220, 0, 200, 100));
            }
            m90Var.f3882g.postDelayed(new RunnableC0912x3(5, m90Var), 800L);
            return;
        }
        if (textView != null) {
            if (p30.m3002l(c0504a.m2684f(), "invalid_key_format")) {
                strConcat = "❌ 授权码无效，请确定格式正确或有效";
            } else if (p30.m3002l(c0504a.m2684f(), "network_error")) {
                strConcat = "❌ 网络连接失败，请检查网络后重试";
            } else if (p30.m3002l(c0504a.m2684f(), "empty_response")) {
                strConcat = "❌ 服务器无响应，请稍后重试";
            } else {
                String strM2684f = c0504a.m2684f();
                if (strM2684f == null) {
                    strM2684f = "未知错误";
                }
                strConcat = "❌ 验证失败：".concat(strM2684f);
            }
            textView.setText(strConcat);
            textView.setTextColor(Color.argb(220, 255, 80, 80));
        }
        m90Var.m2455F();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m2470o(m90 m90Var) {
        try {
            m90Var.dismiss();
            m90Var.f3881f.invoke();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    private final int m2471p(int i) {
        return (int) (i * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    private final boolean m2472q() {
        return (getContext().getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    private final int m2473r() {
        int i;
        int i2;
        if (m2472q()) {
            i = 25;
            i2 = 20;
        } else {
            i = 250;
            i2 = 245;
        }
        return Color.argb(255, i2, i2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    private final int m2474s() {
        int i = m2472q() ? 255 : 0;
        return Color.argb(120, i, i, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    private final int m2475t() {
        int i;
        int i2;
        if (m2472q()) {
            i = 40;
            i2 = 255;
        } else {
            i = 30;
            i2 = 0;
        }
        return Color.argb(i, i2, i2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    private final int m2476u() {
        return m2472q() ? Color.argb(60, 254, 44, 85) : Color.argb(60, 254, 44, 85);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    private final int m2477v() {
        return m2472q() ? Color.argb(100, 254, 44, 85) : Color.argb(100, 254, 44, 85);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    private final int m2478w() {
        int i;
        int i2;
        if (m2472q()) {
            i = 60;
            i2 = 255;
        } else {
            i = 10;
            i2 = 0;
        }
        return Color.argb(i, i2, i2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    private final int m2479x() {
        int i;
        int i2;
        if (m2472q()) {
            i = 100;
            i2 = 255;
        } else {
            i = 50;
            i2 = 0;
        }
        return Color.argb(i, i2, i2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    private final int m2480y() {
        int i = m2472q() ? 255 : 0;
        return Color.argb(120, i, i, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    private final int m2481z() {
        int i;
        int i2;
        if (m2472q()) {
            i = 150;
            i2 = 255;
        } else {
            i = 140;
            i2 = 0;
        }
        return Color.argb(i, i2, i2, i2);
    }

    /* JADX INFO: renamed from: m90$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0465a {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: m90.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0465a(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final void m2483c(DialogInterface dialogInterface) {
            m90.f3878o = false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final void m2484b(Context context, String str, boolean z, InterfaceC0298hw interfaceC0298hw) {
            context.getClass();
            str.getClass();
            interfaceC0298hw.getClass();
            if (m90.f3878o) {
                return;
            }
            m90.f3878o = true;
            m90 m90Var = new m90(context, str, z, interfaceC0298hw);
            m90Var.setOnDismissListener(new DialogInterfaceOnDismissListenerC0040b2(1));
            m90Var.show();
        }

        private C0465a() {
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    /* JADX INFO: renamed from: m90$b */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0466b implements TextWatcher {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0466b() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            m90.this.m2455F();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
