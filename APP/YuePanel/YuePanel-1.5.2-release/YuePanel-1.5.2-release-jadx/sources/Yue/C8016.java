package Yue;

import androidx.fragment.app.C8882;
import java.lang.annotation.Annotation;
import java.util.List;
import net.bytebuddy.description.type.TypeDescription;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.4")
public final class C8016 implements InterfaceC5609 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1404 f23819 = new C1404(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f23820 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f23821 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f23822 = 4;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5588 f23823;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final List<C5612> f23824;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6489
    public final InterfaceC5609 f23825;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f23826;

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۢ$ۥ */
    public static final class C1404 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣۢۢۢ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1404(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1404() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۢ$ۥ۟ */
    public /* synthetic */ class C1405 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f3193;

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
            f3193 = iArr;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C8017 extends AbstractC5673 implements InterfaceC5124<C5612, CharSequence> {
        public C8017() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final CharSequence invoke(@InterfaceC6399 C5612 c5612) {
            C5499.m17103(c5612, "it");
            return C8016.this.m25292(c5612);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC7470(version = "1.6")
    public C8016(@InterfaceC6399 InterfaceC5588 interfaceC5588, @InterfaceC6399 List<C5612> list, @InterfaceC6489 InterfaceC5609 interfaceC5609, int i) {
        C5499.m17103(interfaceC5588, "classifier");
        C5499.m17103(list, C8882.f29752);
        this.f23823 = interfaceC5588;
        this.f23824 = list;
        this.f23825 = interfaceC5609;
        this.f23826 = i;
    }

    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m25290() {
    }

    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ void m25291() {
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C8016) {
            C8016 c8016 = (C8016) obj;
            if (C5499.m17094(mo17390(), c8016.mo17390()) && C5499.m17094(mo17389(), c8016.mo17389()) && C5499.m17094(this.f23825, c8016.f23825) && this.f23826 == c8016.f23826) {
                return true;
            }
        }
        return false;
    }

    @Override // Yue.InterfaceC5583
    @InterfaceC6399
    public List<Annotation> getAnnotations() {
        return C3880.m10735();
    }

    public int hashCode() {
        return (((mo17390().hashCode() * 31) + mo17389().hashCode()) * 31) + Integer.hashCode(this.f23826);
    }

    @InterfaceC6399
    public String toString() {
        return m25293(false) + C7071.f2662;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final String m25292(C5612 c5612) {
        String strValueOf;
        if (c5612.m17400() == null) {
            return InterfaceC5949.f14892;
        }
        InterfaceC5609 interfaceC5609M17399 = c5612.m17399();
        C8016 c8016 = interfaceC5609M17399 instanceof C8016 ? (C8016) interfaceC5609M17399 : null;
        if (c8016 == null || (strValueOf = c8016.m25293(true)) == null) {
            strValueOf = String.valueOf(c5612.m17399());
        }
        int i = C1405.f3193[c5612.m17400().ordinal()];
        if (i == 1) {
            return strValueOf;
        }
        if (i == 2) {
            return "in " + strValueOf;
        }
        if (i != 3) {
            throw new C6380();
        }
        return "out " + strValueOf;
    }

    @Override // Yue.InterfaceC5609
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public boolean mo17388() {
        return (this.f23826 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final String m25293(boolean z) {
        String name;
        InterfaceC5588 interfaceC5588Mo17390 = mo17390();
        InterfaceC5585 interfaceC5585 = interfaceC5588Mo17390 instanceof InterfaceC5585 ? (InterfaceC5585) interfaceC5588Mo17390 : null;
        Class<?> clsM17346 = interfaceC5585 != null ? C5564.m17346(interfaceC5585) : null;
        if (clsM17346 == null) {
            name = mo17390().toString();
        } else if ((this.f23826 & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsM17346.isArray()) {
            name = m25294(clsM17346);
        } else if (z && clsM17346.isPrimitive()) {
            InterfaceC5588 interfaceC5588Mo173902 = mo17390();
            C5499.m17101(interfaceC5588Mo173902, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = C5564.m17349((InterfaceC5585) interfaceC5588Mo173902).getName();
        } else {
            name = clsM17346.getName();
        }
        String str = name + (mo17389().isEmpty() ? "" : C3888.m10923(mo17389(), ", ", "<", ">", 0, null, new C8017(), 24, null)) + (mo17388() ? TypeDescription.Generic.OfWildcardType.SYMBOL : "");
        InterfaceC5609 interfaceC5609 = this.f23825;
        if (!(interfaceC5609 instanceof C8016)) {
            return str;
        }
        String strM25293 = ((C8016) interfaceC5609).m25293(true);
        if (C5499.m17094(strM25293, str)) {
            return str;
        }
        if (C5499.m17094(strM25293, str + '?')) {
            return str + PublicSuffixDatabase.f30961;
        }
        return '(' + str + ".." + strM25293 + ')';
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final String m25294(Class<?> cls) {
        return C5499.m17094(cls, boolean[].class) ? "kotlin.BooleanArray" : C5499.m17094(cls, char[].class) ? "kotlin.CharArray" : C5499.m17094(cls, byte[].class) ? "kotlin.ByteArray" : C5499.m17094(cls, short[].class) ? "kotlin.ShortArray" : C5499.m17094(cls, int[].class) ? "kotlin.IntArray" : C5499.m17094(cls, float[].class) ? "kotlin.FloatArray" : C5499.m17094(cls, long[].class) ? "kotlin.LongArray" : C5499.m17094(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final int m25295() {
        return this.f23826;
    }

    @Override // Yue.InterfaceC5609
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public List<C5612> mo17389() {
        return this.f23824;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final InterfaceC5609 m25296() {
        return this.f23825;
    }

    @Override // Yue.InterfaceC5609
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public InterfaceC5588 mo17390() {
        return this.f23823;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8016(@InterfaceC6399 InterfaceC5588 interfaceC5588, @InterfaceC6399 List<C5612> list, boolean z) {
        this(interfaceC5588, list, null, z ? 1 : 0);
        C5499.m17103(interfaceC5588, "classifier");
        C5499.m17103(list, C8882.f29752);
    }
}
