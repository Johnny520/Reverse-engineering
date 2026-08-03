package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: Q2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0691Q2 {

    /* JADX INFO: renamed from: i */
    public static final ThreadLocal f2219i = null;

    /* JADX INFO: renamed from: a */
    public final C2520sy f2220a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f2221b;

    /* JADX INFO: renamed from: c */
    public final C0132D2 f2222c;

    /* JADX INFO: renamed from: d */
    public final RunnableC0562N2 f2223d;

    /* JADX INFO: renamed from: e */
    public final C0649P3 f2224e;

    /* JADX INFO: renamed from: f */
    public boolean f2225f;

    /* JADX INFO: renamed from: g */
    public float f2226g;

    /* JADX INFO: renamed from: h */
    public C0649P3 f2227h;

    static {
        f2219i = new ThreadLocal();
    }

    public C0691Q2(C0649P3 r4) {
        this.f2220a = new C2520sy(0);
        this.f2221b = new ArrayList();
        this.f2222c = new C0132D2(5, this);
        this.f2223d = new RunnableC0562N2(0, this);
        this.f2225f = false;
        this.f2226g = 1.0f;
        this.f2224e = r4;
    }
}
