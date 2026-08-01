package af;

import bf.AbstractC1118a;
import cf.C1556u;
import java.lang.reflect.Modifier;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p069ef.C2217b;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;

/* JADX INFO: renamed from: af.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0335h extends AbstractC1118a {

    /* JADX INFO: renamed from: n */
    public static final a f880n = new a(null);

    /* JADX INFO: renamed from: d */
    public final int f881d;

    /* JADX INFO: renamed from: e */
    public final int f882e;

    /* JADX INFO: renamed from: f */
    public final String f883f;

    /* JADX INFO: renamed from: g */
    public final int f884g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC4705l f885h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC4705l f886i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC4705l f887j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC4705l f888k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC4705l f889l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC4705l f890m;

    /* JADX INFO: renamed from: af.h$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ DexKitBridge f891r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C0335h f892s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f893t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ int f894u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DexKitBridge dexKitBridge, C0335h c0335h, int i10, int i11) {
            super(0);
            this.f891r = dexKitBridge;
            this.f892s = c0335h;
            this.f893t = i10;
            this.f894u = i11;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return this.f891r.m23359v0(this.f892s.m4018b(this.f893t, this.f894u));
        }
    }

    /* JADX INFO: renamed from: af.h$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ DexKitBridge f895r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C0335h f896s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f897t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DexKitBridge dexKitBridge, C0335h c0335h, int i10) {
            super(0);
            this.f895r = dexKitBridge;
            this.f896s = c0335h;
            this.f897t = i10;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0333f invoke() {
            DexKitBridge dexKitBridge = this.f895r;
            C0335h c0335h = this.f896s;
            return (C0333f) dexKitBridge.m23347P0(new long[]{c0335h.m4018b(this.f897t, c0335h.f881d)}).first();
        }
    }

    /* JADX INFO: renamed from: af.h$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC1067w implements InterfaceC0173a {
        public d() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2217b invoke() {
            return new C2217b(C0335h.this.m1043g());
        }
    }

    /* JADX INFO: renamed from: af.h$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ DexKitBridge f899r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C0335h f900s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f901t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ int f902u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DexKitBridge dexKitBridge, C0335h c0335h, int i10, int i11) {
            super(0);
            this.f899r = dexKitBridge;
            this.f900s = c0335h;
            this.f901t = i10;
            this.f902u = i11;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0339l invoke() {
            return this.f899r.m23348Q0(this.f900s.m4018b(this.f901t, this.f902u));
        }
    }

    /* JADX INFO: renamed from: af.h$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ DexKitBridge f903r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C0335h f904s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f905t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DexKitBridge dexKitBridge, C0335h c0335h, int i10) {
            super(0);
            this.f903r = dexKitBridge;
            this.f904s = c0335h;
            this.f905t = i10;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0333f invoke() {
            DexKitBridge dexKitBridge = this.f903r;
            C0335h c0335h = this.f904s;
            return (C0333f) dexKitBridge.m23347P0(new long[]{c0335h.m4018b(this.f905t, c0335h.f884g)}).first();
        }
    }

    /* JADX INFO: renamed from: af.h$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class g extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ DexKitBridge f906r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C0335h f907s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f908t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ int f909u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(DexKitBridge dexKitBridge, C0335h c0335h, int i10, int i11) {
            super(0);
            this.f906r = dexKitBridge;
            this.f907s = c0335h;
            this.f908t = i10;
            this.f909u = i11;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0339l invoke() {
            return this.f906r.m23350S0(this.f907s.m4018b(this.f908t, this.f909u));
        }
    }

    public C0335h(DexKitBridge dexKitBridge, int i10, int i11, int i12, int i13, String str, int i14) {
        super(dexKitBridge, i10, i11);
        this.f881d = i12;
        this.f882e = i13;
        this.f883f = str;
        this.f884g = i14;
        this.f885h = AbstractC4706m.m18787a(new d());
        this.f886i = AbstractC4706m.m18787a(new c(dexKitBridge, this, i11));
        this.f887j = AbstractC4706m.m18787a(new f(dexKitBridge, this, i11));
        this.f888k = AbstractC4706m.m18787a(new b(dexKitBridge, this, i11, i10));
        this.f889l = AbstractC4706m.m18787a(new e(dexKitBridge, this, i11, i10));
        this.f890m = AbstractC4706m.m18787a(new g(dexKitBridge, this, i11, i10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0335h) && AbstractC1061t.m3842c(((C0335h) obj).f883f, this.f883f);
    }

    /* JADX INFO: renamed from: f */
    public final String m1042f() {
        return m1044h().m7987b();
    }

    /* JADX INFO: renamed from: g */
    public final String m1043g() {
        return this.f883f;
    }

    /* JADX INFO: renamed from: h */
    public final C2217b m1044h() {
        return (C2217b) this.f885h.getValue();
    }

    public int hashCode() {
        return this.f883f.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final String m1045i() {
        return m1044h().m7989e();
    }

    /* JADX INFO: renamed from: j */
    public final String m1046j() {
        return m1044h().m7989e();
    }

    /* JADX INFO: renamed from: k */
    public final String m1047k() {
        return m1044h().m7991g();
    }

    /* JADX INFO: renamed from: l */
    public final C2217b m1048l() {
        return m1044h();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f882e;
        if (i10 > 0) {
            sb2.append(Modifier.toString(i10) + " ");
        }
        sb2.append(m1047k());
        sb2.append(" ");
        sb2.append(m1042f());
        sb2.append(".");
        sb2.append(m1046j());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: af.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0335h m1049a(DexKitBridge dexKitBridge, C1556u c1556u) {
            dexKitBridge.getClass();
            c1556u.getClass();
            int iM6140r = c1556u.m6140r();
            int iM6139q = c1556u.m6139q();
            int iM6137o = c1556u.m6137o();
            int iM6136n = c1556u.m6136n();
            String strM6138p = c1556u.m6138p();
            strM6138p.getClass();
            return new C0335h(dexKitBridge, iM6140r, iM6139q, iM6137o, iM6136n, strM6138p, c1556u.m6141s(), null);
        }

        public a() {
        }
    }

    public /* synthetic */ C0335h(DexKitBridge dexKitBridge, int i10, int i11, int i12, int i13, String str, int i14, AbstractC1043k abstractC1043k) {
        this(dexKitBridge, i10, i11, i12, i13, str, i14);
    }
}
