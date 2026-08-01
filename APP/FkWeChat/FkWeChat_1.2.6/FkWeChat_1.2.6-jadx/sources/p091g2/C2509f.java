package p091g2;

import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p120i2.AbstractC3167a;
import p185m8.AbstractC5102r;
import p215oc.C5729x;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;
import p376zd.C10010p0;

/* JADX INFO: renamed from: g2.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2509f {

    /* JADX INFO: renamed from: a */
    public final boolean f6768a;

    /* JADX INFO: renamed from: b */
    public final a f6769b;

    /* JADX INFO: renamed from: c */
    public final int f6770c;

    /* JADX INFO: renamed from: d */
    public final C2504a[] f6771d;

    /* JADX INFO: renamed from: e */
    public int f6772e;

    /* JADX INFO: renamed from: f */
    public final float[] f6773f;

    /* JADX INFO: renamed from: g */
    public final float[] f6774g;

    /* JADX INFO: renamed from: h */
    public final float[] f6775h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: g2.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: q */
        public static final a f6776q = new a("Lsq2", 0);

        /* JADX INFO: renamed from: r */
        public static final a f6777r = new a("Impulse", 1);

        /* JADX INFO: renamed from: s */
        public static final /* synthetic */ a[] f6778s;

        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ InterfaceC7197a f6779t;

        static {
            a[] aVarArrM9006a = m9006a();
            f6778s = aVarArrM9006a;
            f6779t = AbstractC7198b.m28437a(aVarArrM9006a);
        }

        public a(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a[] m9006a() {
            return new a[]{f6776q, f6777r};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6778s.clone();
        }
    }

    /* JADX INFO: renamed from: g2.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6780a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f6777r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f6776q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6780a = iArr;
        }
    }

    public C2509f(boolean z10, a aVar) {
        this.f6768a = z10;
        this.f6769b = aVar;
        if (z10 && aVar.equals(a.f6776q)) {
            C10010p0.m38820a("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int i10 = b.f6780a[aVar.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                C5729x.m23182a();
                throw null;
            }
            i11 = 3;
        }
        this.f6770c = i11;
        this.f6771d = new C2504a[20];
        this.f6773f = new float[20];
        this.f6774g = new float[20];
        this.f6775h = new float[3];
    }

    /* JADX INFO: renamed from: a */
    public final void m9001a(long j10, float f10) {
        int i10 = (this.f6772e + 1) % 20;
        this.f6772e = i10;
        AbstractC2511h.m9018i(this.f6771d, i10, j10, f10);
    }

    /* JADX INFO: renamed from: b */
    public final float m9002b(float[] fArr, float[] fArr2, int i10) {
        try {
            return AbstractC2511h.m9017h(fArr2, fArr, i10, 2, this.f6775h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m9003c() {
        float fM9014e;
        float[] fArr = this.f6773f;
        float[] fArr2 = this.f6774g;
        int i10 = this.f6772e;
        C2504a c2504a = this.f6771d[i10];
        if (c2504a == null) {
            return 0.0f;
        }
        int i11 = 0;
        C2504a c2504a2 = c2504a;
        while (true) {
            C2504a c2504a3 = this.f6771d[i10];
            if (c2504a3 == null) {
                break;
            }
            float fM8981b = c2504a.m8981b() - c2504a3.m8981b();
            float fAbs = Math.abs(c2504a3.m8981b() - c2504a2.m8981b());
            C2504a c2504a4 = (this.f6769b == a.f6776q || this.f6768a) ? c2504a3 : c2504a;
            if (fM8981b > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i11] = c2504a3.m8980a();
            fArr2[i11] = -fM8981b;
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            c2504a2 = c2504a4;
        }
        if (i11 < this.f6770c) {
            return 0.0f;
        }
        int i12 = b.f6780a[this.f6769b.ordinal()];
        if (i12 == 1) {
            fM9014e = AbstractC2511h.m9014e(fArr, fArr2, i11, this.f6768a);
        } else {
            if (i12 != 2) {
                C5729x.m23182a();
                return 0.0f;
            }
            fM9014e = m9002b(fArr, fArr2, i11);
        }
        return fM9014e * 1000;
    }

    /* JADX INFO: renamed from: d */
    public final float m9004d(float f10) {
        if (!(f10 > 0.0f)) {
            AbstractC3167a.m11956b("maximumVelocity should be a positive value. You specified=" + f10);
        }
        float fM9003c = m9003c();
        if (fM9003c == 0.0f || Float.isNaN(fM9003c)) {
            return 0.0f;
        }
        return fM9003c > 0.0f ? AbstractC2368o.m8581h(fM9003c, f10) : AbstractC2368o.m8577d(fM9003c, -f10);
    }

    /* JADX INFO: renamed from: e */
    public final void m9005e() {
        AbstractC5102r.m20641A(this.f6771d, null, 0, 0, 6, null);
        this.f6772e = 0;
    }

    public /* synthetic */ C2509f(boolean z10, a aVar, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? a.f6776q : aVar);
    }

    public C2509f(boolean z10) {
        this(z10, a.f6777r);
    }
}
