package p000;

import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: D2 */
/* JADX INFO: loaded from: classes.dex */
public class C0132D2 implements InterfaceC0120Cr, InterfaceC2113jr, InterfaceC2384pr, InterfaceC0579Nd, InterfaceC2669wb, InterfaceC2755yb, InterfaceC1470gt, InterfaceC1233bs, InterfaceC0835Tc, InterfaceC1054Yg, InterfaceC2713xc {

    /* JADX INFO: renamed from: c */
    public static final Object f325c = new Object();

    /* JADX INFO: renamed from: d */
    public static final C2505sj f326d = new C2505sj(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f327a;

    /* JADX INFO: renamed from: b */
    public final Object f328b;

    public /* synthetic */ C0132D2(int i, Object obj) {
        this.f327a = i;
        this.f328b = obj;
    }

    /* JADX INFO: renamed from: A */
    public void m230A(int i, Object obj, InterfaceC2253mx interfaceC2253mx) throws C2273na {
        C2230ma c2230ma = (C2230ma) this.f328b;
        AbstractC0043B abstractC0043B = (AbstractC0043B) obj;
        c2230ma.m4534a0(i, 2);
        c2230ma.m4535b0(abstractC0043B.mo63b(interfaceC2253mx));
        interfaceC2253mx.mo1071a(abstractC0043B, c2230ma.f7799f);
    }

    @Override // p000.InterfaceC2755yb
    /* JADX INFO: renamed from: a */
    public ClipData mo231a() {
        return ((ContentInfo) this.f328b).getClip();
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: b */
    public void mo193b(MenuC2204lr menuC2204lr, boolean z) {
        if (menuC2204lr instanceof SubMenuC0214Ez) {
            ((SubMenuC0214Ez) menuC2204lr).f631z.mo430k().m4430c(false);
        }
        InterfaceC0120Cr interfaceC0120Cr = ((C0130D0) this.f328b).f306e;
        if (interfaceC0120Cr != null) {
            interfaceC0120Cr.mo193b(menuC2204lr, z);
        }
    }

    @Override // p000.InterfaceC2669wb
    public C2798zb build() {
        return new C2798zb(new C0132D2(((ContentInfo.Builder) this.f328b).build()));
    }

    @Override // p000.InterfaceC2713xc
    /* JADX INFO: renamed from: c */
    public void mo232c() {
        ((C1340dv) this.f328b).m2597f();
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: d */
    public boolean mo233d(MenuC2204lr menuC2204lr, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        InterfaceC0259G0 interfaceC0259G0 = ((ActionMenuView) this.f328b).f3776A;
        if (interfaceC0259G0 != null) {
            Toolbar toolbar = ((C2268nB) interfaceC0259G0).f7988a;
            if (toolbar.f3809G.m5193B()) {
                zOnMenuItemSelected = true;
            } else {
                InterfaceC2448rB interfaceC2448rB = toolbar.f3811I;
                zOnMenuItemSelected = interfaceC2448rB != null ? ((C2534tB) interfaceC2448rB).f8839a.f8930b.onMenuItemSelected(0, menuItem) : false;
            }
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC2384pr
    /* JADX INFO: renamed from: e */
    public void mo128e(MenuC2204lr menuC2204lr, MenuItem menuItem) {
        ((ViewOnKeyListenerC1125a7) this.f328b).f3546f.removeCallbacksAndMessages(menuC2204lr);
    }

    @Override // p000.InterfaceC0835Tc
    /* JADX INFO: renamed from: f */
    public short mo234f() throws IOException {
        int i = ((InputStream) this.f328b).read();
        if (i != -1) {
            return (short) i;
        }
        throw new C0792Sc();
    }

    @Override // p000.InterfaceC1054Yg
    /* JADX INFO: renamed from: g */
    public Object mo235g() {
        switch (this.f327a) {
            case 21:
                C0477L3 c0477l3 = (C0477L3) this.f328b;
                return new RunnableC0320Hc((C0061Bb) c0477l3.f1575c, (C2656w4) c0477l3.f1576d);
            default:
                C0089C2 c0089c2 = (C0089C2) this.f328b;
                return new C1544ig((ExecutorServiceC0971Wj) c0089c2.f196b, (ExecutorServiceC0971Wj) c0089c2.f197c, (ExecutorServiceC0971Wj) c0089c2.f198d, (ExecutorServiceC0971Wj) c0089c2.f199e, (C1264cg) c0089c2.f200f, (C1264cg) c0089c2.f201g, (C2656w4) c0089c2.f202h);
        }
    }

    @Override // p000.InterfaceC0835Tc
    /* JADX INFO: renamed from: h */
    public int mo236h() {
        return (mo234f() << 8) | mo234f();
    }

    @Override // p000.InterfaceC2384pr
    /* JADX INFO: renamed from: i */
    public void mo129i(MenuC2204lr menuC2204lr, C2427qr c2427qr) {
        ViewOnKeyListenerC1125a7 viewOnKeyListenerC1125a7 = (ViewOnKeyListenerC1125a7) this.f328b;
        Handler handler = viewOnKeyListenerC1125a7.f3546f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1125a7.f3548h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC2204lr == ((C1081Z6) arrayList.get(i)).f3448b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC1038Y6(this, i2 < arrayList.size() ? (C1081Z6) arrayList.get(i2) : null, c2427qr, menuC2204lr), menuC2204lr, SystemClock.uptimeMillis() + 200);
    }

    @Override // p000.InterfaceC2713xc
    /* JADX INFO: renamed from: j */
    public Object mo237j() {
        C1340dv c1340dv = (C1340dv) this.f328b;
        c1340dv.reset();
        return c1340dv;
    }

    @Override // p000.InterfaceC2755yb
    /* JADX INFO: renamed from: k */
    public int mo238k() {
        return ((ContentInfo) this.f328b).getFlags();
    }

    @Override // p000.InterfaceC0835Tc
    /* JADX INFO: renamed from: l */
    public int mo239l(int i, byte[] bArr) throws C0792Sc {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.f328b).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new C0792Sc();
        }
        return i2;
    }

    @Override // p000.InterfaceC2755yb
    /* JADX INFO: renamed from: m */
    public ContentInfo mo240m() {
        return (ContentInfo) this.f328b;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: n */
    public void mo241n(MenuC2204lr menuC2204lr) {
        InterfaceC2113jr interfaceC2113jr = ((ActionMenuView) this.f328b).f3783v;
        if (interfaceC2113jr != null) {
            interfaceC2113jr.mo241n(menuC2204lr);
        }
    }

    @Override // p000.InterfaceC2669wb
    /* JADX INFO: renamed from: o */
    public void mo242o(Uri uri) {
        ((ContentInfo.Builder) this.f328b).setLinkUri(uri);
    }

    @Override // p000.InterfaceC1470gt
    public C0489LF onApplyWindowInsets(View view, C0489LF c0489lf) {
        C0317HF c0317hf = c0489lf.f1602a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f328b;
        if (!Objects.equals(coordinatorLayout.f3904n, c0489lf)) {
            coordinatorLayout.f3904n = c0489lf;
            boolean z = c0489lf.m943d() > 0;
            coordinatorLayout.f3905o = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!c0317hf.mo94n()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                    if (childAt.getFitsSystemWindows() && ((C0834Tb) childAt.getLayoutParams()).f2645a != null && c0317hf.mo94n()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c0489lf;
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs c2428qs) {
        switch (this.f327a) {
            case 14:
                return new C1484h6(1, (C2220m6) this.f328b);
            default:
                return new C0843Tk((C1017Xm) this.f328b);
        }
    }

    @Override // p000.InterfaceC2755yb
    /* JADX INFO: renamed from: q */
    public int mo243q() {
        return ((ContentInfo) this.f328b).getSource();
    }

    @Override // p000.InterfaceC0579Nd
    /* JADX INFO: renamed from: r */
    public void mo244r(EditText editText) {
        ViewOnClickListenerC0996X7 viewOnClickListenerC0996X7 = (ViewOnClickListenerC0996X7) this.f328b;
        String string = AbstractC2564tz.m5070e0(String.valueOf(editText.getText())).toString();
        if (string.length() <= 0) {
            AbstractC0213Ey.m413k(-501106719324213L, viewOnClickListenerC0996X7.getContext(), 0);
            return;
        }
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        String string2 = sharedPreferences.getString(AbstractC0295Gu.m625r(-839013271337013L), AbstractC0295Gu.m625r(-839133530421301L));
        if (string2.length() != 0) {
            string = string2 + AbstractC0295Gu.m625r(-500535488673845L) + string;
        }
        AbstractC0295Gu.m625r(-839137825388597L);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(AbstractC0295Gu.m625r(-839159300225077L), string);
        editorEdit.apply();
        viewOnClickListenerC0996X7.m1889b();
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: s */
    public boolean mo194s(MenuC2204lr menuC2204lr) {
        C0130D0 c0130d0 = (C0130D0) this.f328b;
        if (menuC2204lr == c0130d0.f304c) {
            return false;
        }
        ((SubMenuC0214Ez) menuC2204lr).f630A.getClass();
        c0130d0.getClass();
        InterfaceC0120Cr interfaceC0120Cr = c0130d0.f306e;
        if (interfaceC0120Cr != null) {
            return interfaceC0120Cr.mo194s(menuC2204lr);
        }
        return false;
    }

    @Override // p000.InterfaceC2669wb
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f328b).setExtras(bundle);
    }

    @Override // p000.InterfaceC0835Tc
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.f328b;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j - j2;
    }

    @Override // p000.InterfaceC2669wb
    /* JADX INFO: renamed from: t */
    public void mo245t(int i) {
        ((ContentInfo.Builder) this.f328b).setFlags(i);
    }

    public String toString() {
        switch (this.f327a) {
            case 12:
                return "ContentInfoCompat{" + ((ContentInfo) this.f328b) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public C1118a0 mo246u(int i) {
        return null;
    }

    /* JADX INFO: renamed from: v */
    public C1118a0 mo247v(int i) {
        return null;
    }

    /* JADX INFO: renamed from: w */
    public void m248w() {
        ((C2104ji) this.f328b).f7403o.m5387N();
    }

    /* JADX INFO: renamed from: x */
    public boolean mo249x(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public void m250y(int i, AbstractC2744y6 abstractC2744y6) throws C2273na {
        C2230ma c2230ma = (C2230ma) this.f328b;
        c2230ma.m4534a0(i, 2);
        c2230ma.m4535b0(abstractC2744y6.size());
        C2701x6 c2701x6 = (C2701x6) abstractC2744y6;
        c2230ma.m4528U(c2701x6.f9275d, c2701x6.mo5222h(), c2701x6.size());
    }

    /* JADX INFO: renamed from: z */
    public void m251z(int i, Object obj, InterfaceC2253mx interfaceC2253mx) throws C2273na {
        C2230ma c2230ma = (C2230ma) this.f328b;
        c2230ma.m4534a0(i, 3);
        interfaceC2253mx.mo1071a((AbstractC0043B) obj, c2230ma.f7799f);
        c2230ma.m4534a0(i, 4);
    }

    public C0132D2(InputStream inputStream, C2812zp c2812zp) {
        this.f327a = 28;
        C1340dv c1340dv = new C1340dv(inputStream, c2812zp);
        this.f328b = c1340dv;
        c1340dv.mark(5242880);
    }

    public C0132D2(C2756yc c2756yc) {
        this.f327a = 24;
        this.f328b = Collections.unmodifiableMap(new HashMap(c2756yc.f9385a));
    }

    public C0132D2(Context context) {
        this.f327a = 29;
        this.f328b = new C0793Sd(context, 4);
    }

    public C0132D2(C2230ma c2230ma) {
        this.f327a = 9;
        AbstractC0501Ll.m982a("output", c2230ma);
        this.f328b = c2230ma;
        c2230ma.f7799f = this;
    }

    public C0132D2(TextView textView) {
        this.f327a = 20;
        this.f328b = new C0108Cf(textView);
    }

    public C0132D2(EditText editText) {
        this.f327a = 19;
        this.f328b = new C0649P3(editText, 14);
    }

    public C0132D2(int i) {
        InterfaceC0421Jr interfaceC0421Jr;
        this.f327a = i;
        switch (i) {
            case 2:
                this.f328b = new C1198b0(this);
                break;
            case 14:
                this.f328b = new C2220m6(9);
                break;
            case 16:
                this.f328b = new ConcurrentHashMap(16);
                break;
            case 25:
                this.f328b = new C1017Xm(7);
                break;
            default:
                try {
                    interfaceC0421Jr = (InterfaceC0421Jr) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC0421Jr = f326d;
                }
                InterfaceC0421Jr[] interfaceC0421JrArr = {C2505sj.f8792b, interfaceC0421Jr};
                C2160kq c2160kq = new C2160kq();
                c2160kq.f7538a = interfaceC0421JrArr;
                Charset charset = AbstractC0501Ll.f1637a;
                this.f328b = c2160kq;
                break;
        }
    }

    public C0132D2(C0089C2 c0089c2) {
        this.f327a = 0;
        Context context = (Context) c0089c2.f196b;
        String str = (String) c0089c2.f197c;
        String str2 = (String) c0089c2.f198d;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.f328b = (C1017Xm) c0089c2.f202h;
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    public C0132D2(ContentInfo contentInfo) {
        this.f327a = 12;
        contentInfo.getClass();
        this.f328b = AbstractC0951W5.m1818k(contentInfo);
    }

    public C0132D2(ClipData clipData, int i) {
        this.f327a = 11;
        this.f328b = AbstractC0951W5.m1816i(clipData, i);
    }
}
