package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\nokhttp3/internal/concurrent/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public abstract class AbstractC7724 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final String f3045;

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean f3046;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public C7731 f23248;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public long f23249;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC7724(@InterfaceC6399 String str, boolean z) {
        C5499.m17103(str, "name");
        this.f3045 = str;
        this.f3046 = z;
        this.f23249 = -1L;
    }

    @InterfaceC6399
    public String toString() {
        return this.f3045;
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m3819() {
        return this.f3046;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final String m3820() {
        return this.f3045;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long m24570() {
        return this.f23249;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C7731 m24571() {
        return this.f23248;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m24572(@InterfaceC6399 C7731 c7731) {
        C5499.m17103(c7731, "queue");
        C7731 c77312 = this.f23248;
        if (c77312 == c7731) {
            return;
        }
        if (c77312 != null) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.f23248 = c7731;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public abstract long mo12822();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m24573(long j) {
        this.f23249 = j;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m24574(@InterfaceC6489 C7731 c7731) {
        this.f23248 = c7731;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:5) call: Yue.ۥۢ۠ۨۦ.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ AbstractC7724(String str, boolean z, int i, C4335 c4335) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
