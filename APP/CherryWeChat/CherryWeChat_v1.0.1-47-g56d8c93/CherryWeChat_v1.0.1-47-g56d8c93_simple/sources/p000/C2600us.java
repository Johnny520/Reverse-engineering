package p000;

import android.os.Looper;
import android.view.View;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: us */
/* JADX INFO: loaded from: classes.dex */
public class C2600us {

    /* JADX INFO: renamed from: j */
    public static final Object f8976j = null;

    /* JADX INFO: renamed from: a */
    public final Object f8977a;

    /* JADX INFO: renamed from: b */
    public final C1027Xw f8978b;

    /* JADX INFO: renamed from: c */
    public int f8979c;

    /* JADX INFO: renamed from: d */
    public boolean f8980d;

    /* JADX INFO: renamed from: e */
    public volatile Object f8981e;

    /* JADX INFO: renamed from: f */
    public volatile Object f8982f;

    /* JADX INFO: renamed from: g */
    public int f8983g;

    /* JADX INFO: renamed from: h */
    public boolean f8984h;

    /* JADX INFO: renamed from: i */
    public boolean f8985i;

    static {
        f8976j = new Object();
    }

    public C2600us() {
        this.f8977a = new Object();
        this.f8978b = new C1027Xw();
        this.f8979c = 0;
        Object r0 = f8976j;
        this.f8982f = r0;
        this.f8981e = r0;
        this.f8983g = -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m5112a(String r3) {
        C0005A4.m2X().f3f.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L6;
        return;
    L6:
        throw new IllegalStateException(AbstractC2374ph.m4814k("Cannot invoke ", r3, " on a background thread"));
    }

    /* JADX INFO: renamed from: b */
    public final void m5113b(C0547Mo r3) {
        if (r3.f1768b == false) goto L26;
        int r0 = r3.f1769c;
        int r1 = this.f8983g;
        if (r0 >= r1) goto L27;
        r3.f1769c = r1;
        C0132D2 r32 = r3.f1767a;
        Object r02 = this.f8981e;
        r32.getClass();
        InterfaceC1061Yn r03 = (InterfaceC1061Yn) r02;
        DialogInterfaceOnCancelListenerC0450Kd r33 = (DialogInterfaceOnCancelListenerC0450Kd) r32.f328b;
        if (r03 != null) goto L11;
        return;
    L11:
        if (r33.f1475Y == false) goto L24;
        View r04 = r33.m2879z();
        if (r04.getParent() != null) goto L22;
        if (r33.f1479c0 != null) goto L17;
        return;
    L17:
        if (AbstractC2805zi.m5374G(3) == false) goto L19;
        Objects.toString(r33.f1479c0);
    L19:
        r33.f1479c0.setContentView(r04);
        return;
    L22:
        throw new IllegalStateException("DialogFragment can not be attached to a container view");
    L24:
        return;
    L27:
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m5114c(C0547Mo r5) {
        if (this.f8984h == false) goto L6;
        this.f8985i = true;
        return;
    L6:
        this.f8984h = true;
    L7:
        this.f8985i = false;
        if (r5 == null) goto L10;
        m5113b(r5);
        r5 = null;
    L16:
        if (this.f8985i == true) goto L7;
        this.f8984h = false;
        return;
    L10:
        C1027Xw r1 = this.f8978b;
        r1.getClass();
        C0941Vw r2 = new C0941Vw(r1);
        r1.f3271c.put(r2, Boolean.FALSE);
    L12:
        if (r2.hasNext() == false) goto L16;
        m5113b((C0547Mo) ((Map.Entry) r2.next()).getValue());
        if (this.f8985i == false) goto L12;
        goto L16
    }

    /* JADX INFO: renamed from: d */
    public final void m5115d(Object r2) {
        m5112a("setValue");
        this.f8983g++;
        this.f8981e = r2;
        m5114c(null);
    }
}
