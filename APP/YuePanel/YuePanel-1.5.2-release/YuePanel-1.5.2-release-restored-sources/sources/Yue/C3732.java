package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5570
public final class C3732<T> {

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final C0242 f494 = new C0242(null);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C3733 f6677 = new C3733();

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public final Object f495;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۢ۟$ۥ */
    public static final class C0241 extends C3733 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC5568
        @InterfaceC6489
        public final Throwable f496;

        public C0241(@InterfaceC6489 Throwable th) {
            this.f496 = th;
        }

        public boolean equals(@InterfaceC6489 Object obj) {
            return (obj instanceof C0241) && C5499.m17094(this.f496, ((C0241) obj).f496);
        }

        public int hashCode() {
            Throwable th = this.f496;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // Yue.C3732.C3733
        @InterfaceC6399
        public String toString() {
            return "Closed(" + this.f496 + ')';
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۢ۟$ۥ۟ */
    @InterfaceC5495
    public static final class C0242 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۤۢ۟.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0242(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5495
        /* JADX INFO: renamed from: ۥ */
        public final <E> Object m807(@InterfaceC6489 Throwable th) {
            return C3732.m10199(new C0241(th));
        }

        @InterfaceC6399
        @InterfaceC5495
        /* JADX INFO: renamed from: ۥ۟ */
        public final <E> Object m808() {
            return C3732.m10199(C3732.f6677);
        }

        @InterfaceC6399
        @InterfaceC5495
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final <E> Object m10212(E e) {
            return C3732.m10199(e);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0242() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۢ۟$ۥ۟۟, reason: contains not printable characters */
    public static class C3733 {
        @InterfaceC6399
        public String toString() {
            return "Failed";
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥ۟ۤۢ۟.ۥ۟(java.lang.Object):Yue.ۥ۟ۤۢ۟] */
    @InterfaceC6839
    public /* synthetic */ C3732(Object obj) {
        this.f495 = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.Object) A[MD:(java.lang.Object):void (m)] call: Yue.ۥ۟ۤۢ۟.<init>(java.lang.Object):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: ۥ۟ */
    public static final /* synthetic */ C3732 m806(Object obj) {
        return new C3732(obj);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static <T> Object m10199(@InterfaceC6489 Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m10200(Object obj, Object obj2) {
        return (obj2 instanceof C3732) && C5499.m17094(obj, ((C3732) obj2).m10211());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean m10201(Object obj, Object obj2) {
        return C5499.m17094(obj, obj2);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Throwable m10202(Object obj) {
        C0241 c0241 = obj instanceof C0241 ? (C0241) obj : null;
        if (c0241 != null) {
            return c0241.f496;
        }
        return null;
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m10203() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final T m10204(Object obj) {
        if (obj instanceof C3733) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final T m10205(Object obj) throws Throwable {
        Throwable th;
        if (!(obj instanceof C3733)) {
            return obj;
        }
        if ((obj instanceof C0241) && (th = ((C0241) obj).f496) != null) {
            throw th;
        }
        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m10206(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m10207(Object obj) {
        return obj instanceof C0241;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean m10208(Object obj) {
        return obj instanceof C3733;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m10209(Object obj) {
        return !(obj instanceof C3733);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static String m10210(Object obj) {
        if (obj instanceof C0241) {
            return ((C0241) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m10200(this.f495, obj);
    }

    public int hashCode() {
        return m10206(this.f495);
    }

    @InterfaceC6399
    public String toString() {
        return m10210(this.f495);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ Object m10211() {
        return this.f495;
    }
}
