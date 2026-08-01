package p094v0;

import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0417H;
import androidx.fragment.app.C0437o;
import androidx.lifecycle.EnumC0479n;
import com.p055lu.magic.p056ui.LifecycleAutoViewBinding;
import com.p055lu.wxmask.SelfHook;
import com.p055lu.wxmask272.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;
import p004C.C0064h;
import p006D.AbstractC0079h;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0229m;
import p027N0.C0225i;
import p040U0.AbstractC0291a;
import p061e.AbstractActivityC0533i;
import p061e.C0524E;
import p064f0.C0556b;
import p069i.C0709q1;

/* JADX INFO: renamed from: v0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1028c extends C0556b {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ C0225i[] f3639V;

    /* JADX INFO: renamed from: S */
    public final LifecycleAutoViewBinding f3640S = new LifecycleAutoViewBinding();

    /* JADX INFO: renamed from: T */
    public final C0064h f3641T;

    /* JADX INFO: renamed from: U */
    public final int f3642U;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0225i c0225i = new C0225i();
        AbstractC0229m.f569a.getClass();
        f3639V = new C0225i[]{c0225i};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1028c() {
        byte[] bArrDecode = Base64.decode("eyJjb21taXQiOiIxMDQ4ZTRhNTY5YzgwZTE5MTExZGVjMDg5YmI0MzUzMTQ5NzA5MjY4IiwidGltZSI6MTc4NTUwMjQ0MDg5NSwiYnJhbmNoIjoiIn0=", 0);
        AbstractC0223g.m417d(bArrDecode, "decode(...)");
        JSONObject jSONObject = new JSONObject(new String(bArrDecode, AbstractC0291a.f663a));
        String str = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(jSONObject.optLong("time")));
        AbstractC0223g.m417d(str, "format(...)");
        String strOptString = jSONObject.optString("branch");
        AbstractC0223g.m417d(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString("commit");
        AbstractC0223g.m417d(strOptString2, "optString(...)");
        String strSubstring = strOptString2.substring(0, 11);
        AbstractC0223g.m417d(strSubstring, "substring(...)");
        this.f3641T = new C0064h(str, strOptString, strSubstring);
        this.f3642U = -855310;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0434l
    /* JADX INFO: renamed from: i */
    public final View mo844i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_main, viewGroup, false);
        int i2 = R.id.ivStatusIcon;
        ImageView imageView = (ImageView) AbstractC0079h.m188l(viewInflate, R.id.ivStatusIcon);
        if (imageView != null) {
            i2 = R.id.moduleStatusCard;
            if (((LinearLayout) AbstractC0079h.m188l(viewInflate, R.id.moduleStatusCard)) != null) {
                i2 = R.id.tvBranch;
                TextView textView = (TextView) AbstractC0079h.m188l(viewInflate, R.id.tvBranch);
                if (textView != null) {
                    i2 = R.id.tvBuildTime;
                    TextView textView2 = (TextView) AbstractC0079h.m188l(viewInflate, R.id.tvBuildTime);
                    if (textView2 != null) {
                        i2 = R.id.tvCommit;
                        TextView textView3 = (TextView) AbstractC0079h.m188l(viewInflate, R.id.tvCommit);
                        if (textView3 != null) {
                            i2 = R.id.tvPageTitle;
                            if (((TextView) AbstractC0079h.m188l(viewInflate, R.id.tvPageTitle)) != null) {
                                i2 = R.id.tvStatusDesc;
                                TextView textView4 = (TextView) AbstractC0079h.m188l(viewInflate, R.id.tvStatusDesc);
                                if (textView4 != null) {
                                    i2 = R.id.tvStatusTitle;
                                    TextView textView5 = (TextView) AbstractC0079h.m188l(viewInflate, R.id.tvStatusTitle);
                                    if (textView5 != null) {
                                        i2 = R.id.tvVersion;
                                        TextView textView6 = (TextView) AbstractC0079h.m188l(viewInflate, R.id.tvVersion);
                                        if (textView6 != null) {
                                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                                            C0709q1 c0709q1 = new C0709q1(linearLayout, imageView, textView, textView2, textView3, textView4, textView5, textView6);
                                            C0225i c0225i = f3639V[0];
                                            LifecycleAutoViewBinding lifecycleAutoViewBinding = this.f3640S;
                                            lifecycleAutoViewBinding.getClass();
                                            AbstractC0223g.m418e(c0225i, "property");
                                            C0417H c0417h = this.f1361N;
                                            if (c0417h == null) {
                                                throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
                                            }
                                            c0417h.m807e();
                                            if (c0417h.f1267c.f1528c == EnumC0479n.f1517a) {
                                                throw new IllegalStateException("Can't set ViewBinding after onDestroyView!");
                                            }
                                            C0417H c0417h2 = this.f1361N;
                                            if (c0417h2 == null) {
                                                throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
                                            }
                                            c0417h2.m807e();
                                            c0417h2.f1267c.m927a(lifecycleAutoViewBinding);
                                            lifecycleAutoViewBinding.f1627a = c0709q1;
                                            AbstractC0223g.m417d(linearLayout, "let(...)");
                                            return linearLayout;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0434l
    /* JADX INFO: renamed from: j */
    public final void mo845j(View view) {
        C0524E c0524eM1073j;
        AbstractC0223g.m418e(view, "view");
        C0437o c0437o = this.f1383t;
        AbstractActivityC0533i abstractActivityC0533i = c0437o == null ? null : c0437o.f1394d;
        AbstractActivityC0533i abstractActivityC0533i2 = abstractActivityC0533i != null ? abstractActivityC0533i : null;
        if (abstractActivityC0533i2 != null && (c0524eM1073j = abstractActivityC0533i2.m1073j()) != null && !c0524eM1073j.f1687E) {
            c0524eM1073j.f1687E = true;
            c0524eM1073j.m1067V(false);
        }
        m848m().getWindow().setStatusBarColor(this.f3642U);
        View decorView = m848m().getWindow().getDecorView();
        AbstractC0223g.m417d(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        if (SelfHook.getInstance().isModuleEnable()) {
            ((ImageView) m2223p().f2396b).setImageResource(R.drawable.ic_icon_check);
            ((TextView) m2223p().f2400f).setText("模块已激活");
            ((TextView) m2223p().f2399e).setText("LSPosed 已正确加载模块");
        } else {
            ((ImageView) m2223p().f2396b).setImageResource(R.drawable.ic_icon_warning);
            ((TextView) m2223p().f2400f).setText("模块未激活");
            ((TextView) m2223p().f2399e).setText("请在 LSPosed 中启用模块并重启微信");
        }
        ((TextView) m2223p().f2401g).setText("模块版本：v3.0.2d-release");
        C0709q1 c0709q1M2223p = m2223p();
        C0064h c0064h = this.f3641T;
        ((TextView) c0709q1M2223p.f2395a).setText("代码分支：".concat((String) c0064h.f309c));
        ((TextView) m2223p().f2398d).setText("提交哈希：".concat((String) c0064h.f310d));
        ((TextView) m2223p().f2397c).setText("构建时间：".concat((String) c0064h.f308b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final C0709q1 m2223p() {
        C0225i c0225i = f3639V[0];
        LifecycleAutoViewBinding lifecycleAutoViewBinding = this.f3640S;
        lifecycleAutoViewBinding.getClass();
        AbstractC0223g.m418e(c0225i, "property");
        C0709q1 c0709q1 = lifecycleAutoViewBinding.f1627a;
        if (c0709q1 != null) {
            return c0709q1;
        }
        throw new IllegalStateException("Can't access ViewBinding before onCreateView and after onDestroyView!");
    }
}
