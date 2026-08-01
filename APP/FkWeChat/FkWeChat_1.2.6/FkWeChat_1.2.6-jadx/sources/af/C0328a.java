package af;

import af.C0329b;
import bf.AbstractC1118a;
import cf.C1527b;
import cf.C1533e;
import java.util.ArrayList;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1067w;
import p054df.C1956b;
import p069ef.C2216a;
import p172l8.AbstractC4706m;
import p172l8.C4700i0;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5114x;
import p347xe.EnumC9491b;

/* JADX INFO: renamed from: af.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0328a extends AbstractC1118a {

    /* JADX INFO: renamed from: i */
    public static final a f830i = new a(null);

    /* JADX INFO: renamed from: d */
    public final int f831d;

    /* JADX INFO: renamed from: e */
    public final String f832e;

    /* JADX INFO: renamed from: f */
    public final EnumC9491b f833f;

    /* JADX INFO: renamed from: g */
    public final List f834g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC4705l f835h;

    /* JADX INFO: renamed from: af.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0173a {
        public b() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2216a invoke() {
            return new C2216a(C0328a.this.m1004c());
        }
    }

    public C0328a(DexKitBridge dexKitBridge, int i10, int i11, String str, EnumC9491b enumC9491b, List list) {
        super(dexKitBridge, 0, 0, 6, null);
        this.f831d = i11;
        this.f832e = str;
        this.f833f = enumC9491b;
        this.f834g = list;
        this.f835h = AbstractC4706m.m18787a(new b());
    }

    /* JADX INFO: renamed from: c */
    public final String m1004c() {
        return this.f832e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("@" + C1956b.m7082d(this.f832e));
        sb2.append("(");
        int i10 = 0;
        for (Object obj : this.f834g) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC5114x.m20810y();
            }
            C0329b c0329b = (C0329b) obj;
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(c0329b);
            i10 = i11;
        }
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: af.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0328a m1005a(DexKitBridge dexKitBridge, C1533e c1533e) {
            dexKitBridge.getClass();
            c1533e.getClass();
            int iM6010p = c1533e.m6010p();
            int iM6013s = c1533e.m6013s();
            String strM6012r = c1533e.m6012r();
            strM6012r.getClass();
            EnumC9491b enumC9491bM36986a = EnumC9491b.f32239q.m36986a(c1533e.m6014t());
            ArrayList arrayList = new ArrayList();
            int iM6011q = c1533e.m6011q();
            for (int i10 = 0; i10 < iM6011q; i10++) {
                C0329b.a aVar = C0329b.f837f;
                C1527b c1527bM6008n = c1533e.m6008n(i10);
                c1527bM6008n.getClass();
                arrayList.add(aVar.m1007a(dexKitBridge, c1527bM6008n));
            }
            C4700i0 c4700i0 = C4700i0.f13910a;
            return new C0328a(dexKitBridge, iM6010p, iM6013s, strM6012r, enumC9491bM36986a, arrayList, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C0328a(DexKitBridge dexKitBridge, int i10, int i11, String str, EnumC9491b enumC9491b, List list, AbstractC1043k abstractC1043k) {
        this(dexKitBridge, i10, i11, str, enumC9491b, list);
    }
}
