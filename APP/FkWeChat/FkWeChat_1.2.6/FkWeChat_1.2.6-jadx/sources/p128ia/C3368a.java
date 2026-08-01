package p128ia;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import la.C4723c;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5114x;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX INFO: renamed from: ia.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3368a {

    /* JADX INFO: renamed from: a */
    public final a f9157a;

    /* JADX INFO: renamed from: b */
    public final C4723c f9158b;

    /* JADX INFO: renamed from: c */
    public final String[] f9159c;

    /* JADX INFO: renamed from: d */
    public final String[] f9160d;

    /* JADX INFO: renamed from: e */
    public final String[] f9161e;

    /* JADX INFO: renamed from: f */
    public final String f9162f;

    /* JADX INFO: renamed from: g */
    public final int f9163g;

    /* JADX INFO: renamed from: h */
    public final String f9164h;

    /* JADX INFO: renamed from: i */
    public final byte[] f9165i;

    public C3368a(a aVar, C4723c c4723c, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        aVar.getClass();
        c4723c.getClass();
        this.f9157a = aVar;
        this.f9158b = c4723c;
        this.f9159c = strArr;
        this.f9160d = strArr2;
        this.f9161e = strArr3;
        this.f9162f = str;
        this.f9163g = i10;
        this.f9164h = str2;
        this.f9165i = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final String[] m12590a() {
        return this.f9159c;
    }

    /* JADX INFO: renamed from: b */
    public final String[] m12591b() {
        return this.f9160d;
    }

    /* JADX INFO: renamed from: c */
    public final a m12592c() {
        return this.f9157a;
    }

    /* JADX INFO: renamed from: d */
    public final C4723c m12593d() {
        return this.f9158b;
    }

    /* JADX INFO: renamed from: e */
    public final String m12594e() {
        String str = this.f9162f;
        if (this.f9157a == a.f9174y) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final List m12595f() {
        String[] strArr = this.f9159c;
        if (this.f9157a != a.f9173x) {
            strArr = null;
        }
        List listM20652d = strArr != null ? AbstractC5102r.m20652d(strArr) : null;
        return listM20652d == null ? AbstractC5114x.m20800o() : listM20652d;
    }

    /* JADX INFO: renamed from: g */
    public final String[] m12596g() {
        return this.f9161e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12597h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m12598i() {
        return m12597h(this.f9163g, 2);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m12599j() {
        return m12597h(this.f9163g, 16) && !m12597h(this.f9163g, 32);
    }

    public String toString() {
        return this.f9157a + " version=" + this.f9158b;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ia.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: A */
        public static final /* synthetic */ InterfaceC7197a f9166A;

        /* JADX INFO: renamed from: r */
        public static final C10111a f9167r;

        /* JADX INFO: renamed from: s */
        public static final Map f9168s;

        /* JADX INFO: renamed from: t */
        public static final a f9169t = new a("UNKNOWN", 0, 0);

        /* JADX INFO: renamed from: u */
        public static final a f9170u = new a("CLASS", 1, 1);

        /* JADX INFO: renamed from: v */
        public static final a f9171v = new a("FILE_FACADE", 2, 2);

        /* JADX INFO: renamed from: w */
        public static final a f9172w = new a("SYNTHETIC_CLASS", 3, 3);

        /* JADX INFO: renamed from: x */
        public static final a f9173x = new a("MULTIFILE_CLASS", 4, 4);

        /* JADX INFO: renamed from: y */
        public static final a f9174y = new a("MULTIFILE_CLASS_PART", 5, 5);

        /* JADX INFO: renamed from: z */
        public static final /* synthetic */ a[] f9175z;

        /* JADX INFO: renamed from: q */
        public final int f9176q;

        static {
            a[] aVarArrM12600a = m12600a();
            f9175z = aVarArrM12600a;
            f9166A = AbstractC7198b.m28437a(aVarArrM12600a);
            f9167r = new C10111a(null);
            a[] aVarArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(aVarArrValues.length), 16));
            for (a aVar : aVarArrValues) {
                linkedHashMap.put(Integer.valueOf(aVar.f9176q), aVar);
            }
            f9168s = linkedHashMap;
        }

        public a(String str, int i10, int i11) {
            this.f9176q = i11;
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a[] m12600a() {
            return new a[]{f9169t, f9170u, f9171v, f9172w, f9173x, f9174y};
        }

        /* JADX INFO: renamed from: g */
        public static final a m12602g(int i10) {
            return f9167r.m12603a(i10);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f9175z.clone();
        }

        /* JADX INFO: renamed from: ia.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10111a {
            public /* synthetic */ C10111a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m12603a(int i10) {
                a aVar = (a) a.f9168s.get(Integer.valueOf(i10));
                return aVar == null ? a.f9169t : aVar;
            }

            public C10111a() {
            }
        }
    }
}
