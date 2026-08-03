package p155ka;

import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;

/* JADX INFO: renamed from: ka.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2377c implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2380f f7812g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f7813h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f7814i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f7815j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2378d f7816k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC2377c(C2380f c2380f, String str, long j3, String str2, C2378d c2378d) {
        this.f7812g = c2380f;
        this.f7813h = str;
        this.f7814i = j3;
        this.f7815j = str2;
        this.f7816k = c2378d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object c3959f;
        C2380f c2380f = this.f7812g;
        String str = this.f7813h;
        long j3 = this.f7814i;
        try {
            c2380f.m5698d(str, j3, this.f7815j, this.f7816k);
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            c2380f.f7821a.invoke("QQ点歌处理异常", thM8182b);
            C2380f.m5695e(j3, str, "处理失败");
        }
    }
}
