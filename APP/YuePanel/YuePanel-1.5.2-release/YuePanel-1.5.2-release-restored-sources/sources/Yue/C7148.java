package Yue;

import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥۡۦۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5570
@InterfaceC7470(version = "1.3")
public final class C7148<T> implements Serializable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1189 f21560 = new C1189(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public final Object f21561;

    /* JADX INFO: renamed from: Yue.ۥۡۦۧۤ$ۥ */
    public static final class C1189 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۦۧۤ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1189(C4335 c4335) {
            this();
        }

        @InterfaceC5438
        @InterfaceC5572(name = "failure")
        /* JADX INFO: renamed from: ۥ */
        public final <T> Object m3439(Throwable th) {
            C5499.m17103(th, "exception");
            return C7148.m3438(C7149.m3441(th));
        }

        @InterfaceC5438
        @InterfaceC5572(name = "success")
        /* JADX INFO: renamed from: ۥ۟ */
        public final <T> Object m3440(T t) {
            return C7148.m3438(t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1189() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۧۤ$ۥ۟ */
    public static final class C1190 implements Serializable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final Throwable f21562;

        public C1190(@InterfaceC6399 Throwable th) {
            C5499.m17103(th, "exception");
            this.f21562 = th;
        }

        public boolean equals(@InterfaceC6489 Object obj) {
            return (obj instanceof C1190) && C5499.m17094(this.f21562, ((C1190) obj).f21562);
        }

        public int hashCode() {
            return this.f21562.hashCode();
        }

        @InterfaceC6399
        public String toString() {
            return "Failure(" + this.f21562 + ')';
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۡۦۧۤ.ۥ(java.lang.Object):Yue.ۥۡۦۧۤ] */
    @InterfaceC6839
    public /* synthetic */ C7148(Object obj) {
        this.f21561 = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.Object) A[MD:(java.lang.Object):void (m)] call: Yue.ۥۡۦۧۤ.<init>(java.lang.Object):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ C7148 m3437(Object obj) {
        return new C7148(obj);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟ */
    public static <T> Object m3438(@InterfaceC6489 Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m22401(Object obj, Object obj2) {
        return (obj2 instanceof C7148) && C5499.m17094(obj, ((C7148) obj2).m22410());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m22402(Object obj, Object obj2) {
        return C5499.m17094(obj, obj2);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Throwable m22403(Object obj) {
        if (obj instanceof C1190) {
            return ((C1190) obj).f21562;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final T m22404(Object obj) {
        if (m22407(obj)) {
            return null;
        }
        return obj;
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m22405() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int m22406(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m22407(Object obj) {
        return obj instanceof C1190;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m22408(Object obj) {
        return !(obj instanceof C1190);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static String m22409(Object obj) {
        if (obj instanceof C1190) {
            return ((C1190) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m22401(this.f21561, obj);
    }

    public int hashCode() {
        return m22406(this.f21561);
    }

    @InterfaceC6399
    public String toString() {
        return m22409(this.f21561);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final /* synthetic */ Object m22410() {
        return this.f21561;
    }
}
