package p024b9;

import java.util.List;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p098g9.C2562p;
import p098g9.EnumC2563q;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2550d;
import p098g9.InterfaceC2560n;
import p185m8.AbstractC5081g0;
import p215oc.C5729x;
import p372z8.AbstractC9886a;

/* JADX INFO: renamed from: b9.x0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1070x0 implements InterfaceC2560n {

    /* JADX INFO: renamed from: e */
    public static final a f3221e = new a(null);

    /* JADX INFO: renamed from: a */
    public final InterfaceC2550d f3222a;

    /* JADX INFO: renamed from: b */
    public final List f3223b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2560n f3224c;

    /* JADX INFO: renamed from: d */
    public final int f3225d;

    /* JADX INFO: renamed from: b9.x0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3226a;

        static {
            int[] iArr = new int[EnumC2563q.values().length];
            try {
                iArr[EnumC2563q.f6823q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2563q.f6824r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2563q.f6825s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3226a = iArr;
        }
    }

    public C1070x0(InterfaceC2550d interfaceC2550d, List list, InterfaceC2560n interfaceC2560n, int i10) {
        interfaceC2550d.getClass();
        list.getClass();
        this.f3222a = interfaceC2550d;
        this.f3223b = list;
        this.f3224c = interfaceC2560n;
        this.f3225d = i10;
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m3874d(C1070x0 c1070x0, C2562p c2562p) {
        c2562p.getClass();
        return c1070x0.m3878f(c2562p);
    }

    @Override // p098g9.InterfaceC2560n
    /* JADX INFO: renamed from: a */
    public boolean mo3875a() {
        return (this.f3225d & 1) != 0;
    }

    @Override // p098g9.InterfaceC2560n
    /* JADX INFO: renamed from: c */
    public List mo3876c() {
        return this.f3223b;
    }

    @Override // p098g9.InterfaceC2560n
    /* JADX INFO: renamed from: e */
    public InterfaceC2550d mo3877e() {
        return this.f3222a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1070x0)) {
            return false;
        }
        C1070x0 c1070x0 = (C1070x0) obj;
        return AbstractC1061t.m3842c(mo3877e(), c1070x0.mo3877e()) && AbstractC1061t.m3842c(mo3876c(), c1070x0.mo3876c()) && AbstractC1061t.m3842c(this.f3224c, c1070x0.f3224c) && this.f3225d == c1070x0.f3225d;
    }

    /* JADX INFO: renamed from: f */
    public final String m3878f(C2562p c2562p) {
        String strValueOf;
        if (c2562p.m9085d() == null) {
            return "*";
        }
        InterfaceC2560n interfaceC2560nM9084c = c2562p.m9084c();
        C1070x0 c1070x0 = interfaceC2560nM9084c instanceof C1070x0 ? (C1070x0) interfaceC2560nM9084c : null;
        if (c1070x0 == null || (strValueOf = c1070x0.m3879g(true)) == null) {
            strValueOf = String.valueOf(c2562p.m9084c());
        }
        int i10 = b.f3226a[c2562p.m9085d().ordinal()];
        if (i10 == 1) {
            return strValueOf;
        }
        if (i10 == 2) {
            return "in ".concat(strValueOf);
        }
        if (i10 == 3) {
            return "out ".concat(strValueOf);
        }
        C5729x.m23182a();
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final String m3879g(boolean z10) {
        InterfaceC2550d interfaceC2550dMo3877e = mo3877e();
        InterfaceC2549c interfaceC2549c = interfaceC2550dMo3877e instanceof InterfaceC2549c ? (InterfaceC2549c) interfaceC2550dMo3877e : null;
        Class clsM38367b = interfaceC2549c != null ? AbstractC9886a.m38367b(interfaceC2549c) : null;
        String string = clsM38367b == null ? mo3877e().toString() : (this.f3225d & 4) != 0 ? "kotlin.Nothing" : clsM38367b.isArray() ? m3880h(clsM38367b) : (z10 && clsM38367b.isPrimitive()) ? AbstractC9886a.m38368c((InterfaceC2549c) mo3877e()).getName() : clsM38367b.getName();
        boolean zIsEmpty = mo3876c().isEmpty();
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        String strM20585s0 = zIsEmpty ? _UrlKt.FRAGMENT_ENCODE_SET : AbstractC5081g0.m20585s0(mo3876c(), ", ", "<", ">", 0, null, new InterfaceC0184l() { // from class: b9.w0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C1070x0.m3874d(this.f3219q, (C2562p) obj);
            }
        }, 24, null);
        if (mo3875a()) {
            str = "?";
        }
        String str2 = string + strM20585s0 + str;
        InterfaceC2560n interfaceC2560n = this.f3224c;
        if (!(interfaceC2560n instanceof C1070x0)) {
            return str2;
        }
        String strM3879g = ((C1070x0) interfaceC2560n).m3879g(true);
        if (AbstractC1061t.m3842c(strM3879g, str2)) {
            return str2;
        }
        if (AbstractC1061t.m3842c(strM3879g, str2.concat("?"))) {
            return str2.concat("!");
        }
        return "(" + str2 + ".." + strM3879g + ')';
    }

    /* JADX INFO: renamed from: h */
    public final String m3880h(Class cls) {
        return AbstractC1061t.m3842c(cls, boolean[].class) ? "kotlin.BooleanArray" : AbstractC1061t.m3842c(cls, char[].class) ? "kotlin.CharArray" : AbstractC1061t.m3842c(cls, byte[].class) ? "kotlin.ByteArray" : AbstractC1061t.m3842c(cls, short[].class) ? "kotlin.ShortArray" : AbstractC1061t.m3842c(cls, int[].class) ? "kotlin.IntArray" : AbstractC1061t.m3842c(cls, float[].class) ? "kotlin.FloatArray" : AbstractC1061t.m3842c(cls, long[].class) ? "kotlin.LongArray" : AbstractC1061t.m3842c(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public int hashCode() {
        return (((mo3877e().hashCode() * 31) + mo3876c().hashCode()) * 31) + Integer.hashCode(this.f3225d);
    }

    /* JADX INFO: renamed from: i */
    public final int m3881i() {
        return this.f3225d;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC2560n m3882j() {
        return this.f3224c;
    }

    public String toString() {
        return m3879g(false) + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: renamed from: b9.x0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1070x0(InterfaceC2550d interfaceC2550d, List list, boolean z10) {
        this(interfaceC2550d, list, null, z10 ? 1 : 0);
        interfaceC2550d.getClass();
        list.getClass();
    }
}
