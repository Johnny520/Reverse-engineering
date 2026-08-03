package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8405(markerClass = {InterfaceC4774.class})
@InterfaceC7470(version = "1.9")
public final class C7826<T> {

    /* JADX INFO: renamed from: ۥ */
    public final T f3102;

    /* JADX INFO: renamed from: ۥ۟ */
    public final long f3103;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Object), (r2v0 long) A[MD:(T, long):void (m)] (LINE:1) call: Yue.ۥۢۡۤۦ.<init>(java.lang.Object, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C7826(Object obj, long j, C4335 c4335) {
        this(obj, j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥۢۡۤۦ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ C7826 m24842(C7826 c7826, Object obj, long j, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = c7826.f3102;
        }
        if ((i & 2) != 0) {
            j = c7826.f3103;
        }
        return c7826.m24843(obj, j);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7826)) {
            return false;
        }
        C7826 c7826 = (C7826) obj;
        return C5499.m17094(this.f3102, c7826.f3102) && C4555.m13400(this.f3103, c7826.f3103);
    }

    public int hashCode() {
        T t = this.f3102;
        return ((t == null ? 0 : t.hashCode()) * 31) + C4555.m13434(this.f3103);
    }

    @InterfaceC6399
    public String toString() {
        return "TimedValue(value=" + this.f3102 + ", duration=" + ((Object) C4555.m13455(this.f3103)) + ')';
    }

    /* JADX INFO: renamed from: ۥ */
    public final T m3919() {
        return this.f3102;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final long m3920() {
        return this.f3103;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C7826<T> m24843(T t, long j) {
        return new C7826<>(t, j, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final long m24844() {
        return this.f3103;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final T m24845() {
        return this.f3102;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7826(T t, long j) {
        this.f3102 = t;
        this.f3103 = j;
    }
}
