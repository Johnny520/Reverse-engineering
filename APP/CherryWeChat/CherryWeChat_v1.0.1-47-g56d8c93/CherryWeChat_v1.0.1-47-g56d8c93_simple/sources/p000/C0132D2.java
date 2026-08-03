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
    public static final Object f325c = null;

    /* JADX INFO: renamed from: d */
    public static final C2505sj f326d = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f327a;

    /* JADX INFO: renamed from: b */
    public final Object f328b;

    static {
        f325c = new Object();
        f326d = new C2505sj(1);
    }

    public /* synthetic */ C0132D2(int r1, Object r2) {
        this.f327a = r1;
        this.f328b = r2;
    }

    /* JADX INFO: renamed from: A */
    public void m230A(int r3, Object r4, InterfaceC2253mx r5) {
        C2230ma r0 = (C2230ma) this.f328b;
        AbstractC0043B r42 = (AbstractC0043B) r4;
        r0.m4534a0(r3, 2);
        r0.m4535b0(r42.mo63b(r5));
        r5.mo1071a(r42, r0.f7799f);
    }

    @Override // p000.InterfaceC2755yb
    /* JADX INFO: renamed from: a */
    public ClipData mo231a() {
        return AbstractC0951W5.m1812e((ContentInfo) this.f328b);
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: b */
    public void mo193b(MenuC2204lr r3, boolean r4) {
        if ((r3 instanceof SubMenuC0214Ez) == false) goto L5;
        ((SubMenuC0214Ez) r3).f631z.mo430k().m4430c(false);
    L5:
        InterfaceC0120Cr r0 = ((C0130D0) this.f328b).f306e;
        if (r0 == null) goto L9;
        r0.mo193b(r3, r4);
        return;
    }

    @Override // p000.InterfaceC2669wb
    public C2798zb build() {
        return new C2798zb(new C0132D2(AbstractC0951W5.m1817j((ContentInfo.Builder) this.f328b)));
    }

    @Override // p000.InterfaceC2713xc
    /* JADX INFO: renamed from: c */
    public void mo232c() {
        ((C1340dv) this.f328b).m2597f();
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: d */
    public boolean mo233d(MenuC2204lr r4, MenuItem r5) {
        InterfaceC0259G0 r42 = ((ActionMenuView) this.f328b).f3776A;
        if (r42 == null) goto L13;
        Toolbar r43 = ((C2268nB) r42).f7988a;
        if (r43.f3809G.m5193B() == false) goto L7;
        boolean r44 = true;
    L11:
        if (r44 == false) goto L13;
        return true;
    L7:
        InterfaceC2448rB r45 = r43.f3811I;
        if (r45 == null) goto L10;
        r44 = ((C2534tB) r45).f8839a.f8930b.onMenuItemSelected(0, r5);
        goto L11
    L10:
        r44 = false;
    L13:
        return false;
    }

    @Override // p000.InterfaceC2384pr
    /* JADX INFO: renamed from: e */
    public void mo128e(MenuC2204lr r1, MenuItem r2) {
        ((ViewOnKeyListenerC1125a7) this.f328b).f3546f.removeCallbacksAndMessages(r1);
    }

    @Override // p000.InterfaceC0835Tc
    /* JADX INFO: renamed from: f */
    public short mo234f() {
        int r0 = ((InputStream) this.f328b).read();
        if (r0 == (-1)) goto L7;
        return (short) r0;
    L7:
        throw new C0792Sc();
    }

    @Override // p000.InterfaceC1054Yg
    /* JADX INFO: renamed from: g */
    public Object mo235g() {
        switch(this.f327a) {
            case 21: goto L6;
            default: goto L4;
        };
    L4:
        C0089C2 r0 = (C0089C2) this.f328b;
        return new C1544ig((ExecutorServiceC0971Wj) r0.f196b, (ExecutorServiceC0971Wj) r0.f197c, (ExecutorServiceC0971Wj) r0.f198d, (ExecutorServiceC0971Wj) r0.f199e, (C1264cg) r0.f200f, (C1264cg) r0.f201g, (C2656w4) r0.f202h);
    L6:
        C0477L3 r1 = (C0477L3) this.f328b;
        return new RunnableC0320Hc((C0061Bb) r1.f1575c, (C2656w4) r1.f1576d);
    }

    @Override // p000.InterfaceC0835Tc
    /* JADX INFO: renamed from: h */
    public int mo236h() {
        return (mo234f() << 8) | mo234f();
    }

    @Override // p000.InterfaceC2384pr
    /* JADX INFO: renamed from: i */
    public void mo129i(MenuC2204lr r8, C2427qr r9) {
        ViewOnKeyListenerC1125a7 r0 = (ViewOnKeyListenerC1125a7) this.f328b;
        Handler r1 = r0.f3546f;
        C1081Z6 r2 = null;
        r1.removeCallbacksAndMessages(null);
        ArrayList r02 = r0.f3548h;
        int r3 = r02.size();
        int r4 = 0;
    L4:
        if (r4 >= r3) goto L9;
        if (r8 == ((C1081Z6) r02.get(r4)).f3448b) goto L10;
        r4 = r4 + 1;
    L10:
        if (r4 != (-1)) goto L12;
        return;
    L12:
        int r42 = r4 + 1;
        if (r42 >= r02.size()) goto L15;
        r2 = (C1081Z6) r02.get(r42);
    L15:
        r1.postAtTime(new RunnableC1038Y6(this, r2, r9, r8), r8, SystemClock.uptimeMillis() + 200);
        return;
    L9:
        r4 = -1;
        goto L10
    }

    @Override // p000.InterfaceC2713xc
    /* JADX INFO: renamed from: j */
    public Object mo237j() {
        C1340dv r0 = (C1340dv) this.f328b;
        r0.reset();
        return r0;
    }

    @Override // p000.InterfaceC2755yb
    /* JADX INFO: renamed from: k */
    public int mo238k() {
        return AbstractC0951W5.m1810c((ContentInfo) this.f328b);
    }

    @Override // p000.InterfaceC0835Tc
    /* JADX INFO: renamed from: l */
    public int mo239l(int r5, byte[] r6) {
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r0 >= r5) goto L8;
        r1 = ((InputStream) this.f328b).read(r6, r0, r5 - r0);
        if (r1 == (-1)) goto L8;
        r0 = r0 + r1;
    L8:
        if (r0 != 0) goto L13;
        if (r1 != (-1)) goto L13;
        throw new C0792Sc();
    L13:
        return r0;
    }

    @Override // p000.InterfaceC2755yb
    /* JADX INFO: renamed from: m */
    public ContentInfo mo240m() {
        return (ContentInfo) this.f328b;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: n */
    public void mo241n(MenuC2204lr r2) {
        InterfaceC2113jr r0 = ((ActionMenuView) this.f328b).f3783v;
        if (r0 == null) goto L6;
        r0.mo241n(r2);
        return;
    }

    @Override // p000.InterfaceC2669wb
    /* JADX INFO: renamed from: o */
    public void mo242o(Uri r2) {
        AbstractC0951W5.m1821n((ContentInfo.Builder) this.f328b, r2);
    }

    @Override // p000.InterfaceC1470gt
    public C0489LF onApplyWindowInsets(View r6, C0489LF r7) {
        C0317HF r62 = r7.f1602a;
        CoordinatorLayout r0 = (CoordinatorLayout) this.f328b;
        if (Objects.equals(r0.f3904n, r7) == true) goto L28;
        r0.f3904n = r7;
        int r2 = 0;
        boolean r3 = true;
        if (r7.m943d() <= 0) goto L7;
        boolean r1 = true;
    L8:
        r0.f3905o = r1;
        if (r1 == false) goto L11;
    L13:
        r3 = false;
    L14:
        r0.setWillNotDraw(r3);
        if (r62.mo94n() == true) goto L27;
        int r12 = r0.getChildCount();
    L18:
        if (r2 >= r12) goto L27;
        View r32 = r0.getChildAt(r2);
        WeakHashMap r4 = AbstractC2185lE.f7617a;
        if (r32.getFitsSystemWindows() == false) goto L26;
        if (((C0834Tb) r32.getLayoutParams()).f2645a == null) goto L26;
        if (r62.mo94n() == true) goto L27;
    L26:
        r2 = r2 + 1;
    L27:
        r0.requestLayout();
        goto L28
    L11:
        if (r0.getBackground() != null) goto L13;
    L7:
        r1 = false;
    L28:
        return r7;
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs r3) {
        switch(this.f327a) {
            case 14: goto L6;
            default: goto L5;
        };
    L6:
        int r1 = 1;
        return new C1484h6(r1, (C2220m6) this.f328b);
    L5:
        return new C0843Tk((C1017Xm) this.f328b);
    }

    @Override // p000.InterfaceC2755yb
    /* JADX INFO: renamed from: q */
    public int mo243q() {
        return AbstractC0951W5.m1823p((ContentInfo) this.f328b);
    }

    @Override // p000.InterfaceC0579Nd
    /* JADX INFO: renamed from: r */
    public void mo244r(EditText r7) {
        ViewOnClickListenerC0996X7 r0 = (ViewOnClickListenerC0996X7) this.f328b;
        String r72 = AbstractC2564tz.m5070e0(String.valueOf(r7.getText())).toString();
        if (r72.length() <= 0) goto L10;
        SharedPreferences r1 = AbstractC0599Nx.f1939a;
        String r2 = r1.getString(AbstractC0295Gu.m625r(-839013271337013L), AbstractC0295Gu.m625r(-839133530421301L));
        if (r2.length() == 0) goto L8;
        r72 = r2 + AbstractC0295Gu.m625r(-500535488673845L) + r72;
    L8:
        AbstractC0295Gu.m625r(-839137825388597L);
        SharedPreferences.Editor r12 = r1.edit();
        r12.putString(AbstractC0295Gu.m625r(-839159300225077L), r72);
        r12.apply();
        r0.m1889b();
        return;
    L10:
        AbstractC0213Ey.m413k(-501106719324213L, r0.getContext(), 0);
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: s */
    public boolean mo194s(MenuC2204lr r4) {
        C0130D0 r0 = (C0130D0) this.f328b;
        if (r4 != r0.f304c) goto L5;
        return false;
    L5:
        ((SubMenuC0214Ez) r4).f630A.getClass();
        r0.getClass();
        InterfaceC0120Cr r02 = r0.f306e;
        if (r02 != null) goto L8;
        return false;
    L8:
        return r02.mo194s(r4);
    }

    @Override // p000.InterfaceC2669wb
    public void setExtras(Bundle r2) {
        AbstractC0951W5.m1822o((ContentInfo.Builder) this.f328b, r2);
    }

    @Override // p000.InterfaceC0835Tc
    public long skip(long r9) {
        InputStream r0 = (InputStream) this.f328b;
        if (r9 >= 0) goto L5;
        return 0;
    L5:
        long r3 = r9;
    L7:
        if (r3 <= 0) goto L16;
        long r5 = r0.skip(r3);
        if (r5 > 0) goto L10;
        if (r0.read() == (-1)) goto L16;
        r5 = 1;
    L10:
        r3 = r3 - r5;
    L16:
        return r9 - r3;
    }

    @Override // p000.InterfaceC2669wb
    /* JADX INFO: renamed from: t */
    public void mo245t(int r2) {
        AbstractC0951W5.m1820m((ContentInfo.Builder) this.f328b, r2);
    }

    public String toString() {
        switch(this.f327a) {
            case 12: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "ContentInfoCompat{" + ((ContentInfo) this.f328b) + "}";
    }

    /* JADX INFO: renamed from: u */
    public C1118a0 mo246u(int r1) {
        return null;
    }

    /* JADX INFO: renamed from: v */
    public C1118a0 mo247v(int r1) {
        return null;
    }

    /* JADX INFO: renamed from: w */
    public void m248w() {
        ((C2104ji) this.f328b).f7403o.m5387N();
    }

    /* JADX INFO: renamed from: x */
    public boolean mo249x(int r1, int r2, Bundle r3) {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public void m250y(int r3, AbstractC2744y6 r4) {
        C2230ma r0 = (C2230ma) this.f328b;
        r0.m4534a0(r3, 2);
        r0.m4535b0(r4.size());
        C2701x6 r42 = (C2701x6) r4;
        r0.m4528U(r42.f9275d, r42.mo5222h(), r42.size());
    }

    /* JADX INFO: renamed from: z */
    public void m251z(int r3, Object r4, InterfaceC2253mx r5) {
        C2230ma r0 = (C2230ma) this.f328b;
        r0.m4534a0(r3, 3);
        r5.mo1071a((AbstractC0043B) r4, r0.f7799f);
        r0.m4534a0(r3, 4);
    }

    public C0132D2(InputStream r2, C2812zp r3) {
        this.f327a = 28;
        C1340dv r0 = new C1340dv(r2, r3);
        this.f328b = r0;
        r0.mark(5242880);
    }

    public C0132D2(C2756yc r2) {
        this.f327a = 24;
        this.f328b = Collections.unmodifiableMap(new HashMap(r2.f9385a));
    }

    public C0132D2(Context r3) {
        this.f327a = 29;
        this.f328b = new C0793Sd(r3, 4);
    }

    public C0132D2(C2230ma r2) {
        this.f327a = 9;
        AbstractC0501Ll.m982a("output", r2);
        this.f328b = r2;
        r2.f7799f = this;
    }

    public C0132D2(TextView r2) {
        this.f327a = 20;
        this.f328b = new C0108Cf(r2);
    }

    public C0132D2(EditText r3) {
        this.f327a = 19;
        this.f328b = new C0649P3(r3, 14);
    }

    public C0132D2(int r5) {
        this.f327a = r5;
        switch(r5) {
            case 2: goto L16;
            case 14: goto L14;
            case 16: goto L12;
            case 25: goto L10;
            default: goto L18;
        };
    L10:
        this.f328b = new C1017Xm(7);
        return;
    L12:
        this.f328b = new ConcurrentHashMap(16);
        return;
    L14:
        this.f328b = new C2220m6(9);
        return;
    L16:
        this.f328b = new C1198b0(this);
        return;
    L18:
        InterfaceC0421Jr r0 = (InterfaceC0421Jr) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);     // Catch: Exception -> L7
    L8:
        InterfaceC0421Jr[] r1 = {C2505sj.f8792b, r0};
        C2160kq r52 = new C2160kq();
        r52.f7538a = r1;
        Charset r02 = AbstractC0501Ll.f1637a;
        this.f328b = r52;
        return;
    L7:
        r0 = f326d;
        goto L8
    }

    public C0132D2(C0089C2 r4) {
        this.f327a = 0;
        Context r0 = (Context) r4.f196b;
        String r1 = (String) r4.f197c;
        String r2 = (String) r4.f198d;
        if (r1 == null) goto L11;
        Context r02 = r0.getApplicationContext();
        if (r2 != null) goto L7;
        PreferenceManager.getDefaultSharedPreferences(r02).edit();
    L8:
        this.f328b = (C1017Xm) r4.f202h;
        return;
    L7:
        r02.getSharedPreferences(r2, 0).edit();
        goto L8
    L11:
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    public C0132D2(ContentInfo r2) {
        this.f327a = 12;
        r2.getClass();
        this.f328b = AbstractC0951W5.m1818k(r2);
    }

    public C0132D2(ClipData r2, int r3) {
        this.f327a = 11;
        this.f328b = AbstractC0951W5.m1816i(r2, r3);
    }
}
