package Yue;

import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.4")
@InterfaceC7507({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class C8014 implements InterfaceC5611 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1403 f23813 = new C1403(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public final Object f23814;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final String f23815;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final EnumC5613 f23816;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean f23817;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6489
    public volatile List<? extends InterfaceC5609> f23818;

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۡ$ۥ */
    public static final class C1403 {

        /* JADX INFO: renamed from: Yue.ۥۣۢۢۡ$ۥ$ۥ, reason: contains not printable characters */
        public /* synthetic */ class C8015 {

            /* JADX INFO: renamed from: ۥ */
            public static final /* synthetic */ int[] f3192;

            static {
                int[] iArr = new int[EnumC5613.values().length];
                try {
                    iArr[EnumC5613.f13572.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5613.f13573.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5613.f13574.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f3192 = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣۢۢۡ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1403(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final String m4031(@InterfaceC6399 InterfaceC5611 interfaceC5611) {
            C5499.m17103(interfaceC5611, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i = C8015.f3192[interfaceC5611.mo17393().ordinal()];
            if (i == 2) {
                sb.append("in ");
            } else if (i == 3) {
                sb.append("out ");
            }
            sb.append(interfaceC5611.getName());
            String string = sb.toString();
            C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1403() {
        }
    }

    public C8014(@InterfaceC6489 Object obj, @InterfaceC6399 String str, @InterfaceC6399 EnumC5613 enumC5613, boolean z) {
        C5499.m17103(str, "name");
        C5499.m17103(enumC5613, "variance");
        this.f23814 = obj;
        this.f23815 = str;
        this.f23816 = enumC5613;
        this.f23817 = z;
    }

    /* JADX INFO: renamed from: ۥ */
    public static /* synthetic */ void m4029() {
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C8014) {
            C8014 c8014 = (C8014) obj;
            if (C5499.m17094(this.f23814, c8014.f23814) && C5499.m17094(getName(), c8014.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // Yue.InterfaceC5611
    @InterfaceC6399
    public String getName() {
        return this.f23815;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends Yue.ۥ۠ۦۣۤ>, java.util.List<Yue.ۥ۠ۦۣۤ> */
    @Override // Yue.InterfaceC5611
    @InterfaceC6399
    public List<InterfaceC5609> getUpperBounds() {
        List list = this.f23818;
        if (list != null) {
            return list;
        }
        List<InterfaceC5609> listM10715 = C3879.m10715(C7071.m22007(Object.class));
        this.f23818 = listM10715;
        return listM10715;
    }

    public int hashCode() {
        Object obj = this.f23814;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return f23813.m4031(this);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m4030(@InterfaceC6399 List<? extends InterfaceC5609> list) {
        C5499.m17103(list, "upperBounds");
        if (this.f23818 == null) {
            this.f23818 = list;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    @Override // Yue.InterfaceC5611
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo17392() {
        return this.f23817;
    }

    @Override // Yue.InterfaceC5611
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public EnumC5613 mo17393() {
        return this.f23816;
    }
}
