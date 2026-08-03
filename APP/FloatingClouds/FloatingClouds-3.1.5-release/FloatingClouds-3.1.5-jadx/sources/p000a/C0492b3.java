package p000a;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: a.b3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0492b3 extends AbstractC0417X1 {

    /* JADX INFO: renamed from: b */
    public final int f1826b;

    /* JADX INFO: renamed from: c */
    public final String f1827c;

    /* JADX INFO: renamed from: d */
    public final Integer f1828d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f1829e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f1830f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f1831g;

    /* JADX INFO: renamed from: h */
    public final C0233Me f1832h;

    /* JADX INFO: renamed from: i */
    public final C0233Me f1833i;

    /* JADX INFO: renamed from: j */
    public final C0233Me f1834j;

    /* JADX INFO: renamed from: a.b3$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C0492b3 m1196a(DexKitBridge dexKitBridge, C0526d c0526d) {
            char c = 4;
            C0631i9.m1482e(dexKitBridge, "bridge");
            int iM780b = c0526d.m780b(4);
            int i = iM780b != 0 ? c0526d.f981b.getInt(iM780b + c0526d.f980a) : 0;
            int iM780b2 = c0526d.m780b(6);
            int i2 = iM780b2 != 0 ? c0526d.f981b.getInt(iM780b2 + c0526d.f980a) : 0;
            int iM780b3 = c0526d.m780b(8);
            if (iM780b3 != 0) {
                c0526d.m782d(iM780b3 + c0526d.f980a);
            }
            int iM780b4 = c0526d.m780b(10);
            int i3 = iM780b4 != 0 ? c0526d.f981b.getInt(iM780b4 + c0526d.f980a) : 0;
            int iM780b5 = c0526d.m780b(12);
            String strM782d = iM780b5 != 0 ? c0526d.m782d(iM780b5 + c0526d.f980a) : null;
            if (strM782d == null) {
                strM782d = "";
            }
            int iM780b6 = c0526d.m780b(14);
            int i4 = iM780b6 != 0 ? c0526d.f981b.getInt(iM780b6 + c0526d.f980a) : 0;
            Integer numValueOf = i4 != -1 ? Integer.valueOf(i4) : null;
            ArrayList arrayList = new ArrayList();
            int iM780b7 = c0526d.m780b(16);
            int iM784f = iM780b7 != 0 ? c0526d.m784f(iM780b7) : 0;
            for (int i5 = 0; i5 < iM784f; i5++) {
                int iM780b8 = c0526d.m780b(16);
                arrayList.add(Integer.valueOf(iM780b8 != 0 ? c0526d.f981b.getInt((i5 * 4) + c0526d.m783e(iM780b8)) : 0));
            }
            C0413Wf c0413Wf = C0413Wf.f1577a;
            ArrayList arrayList2 = new ArrayList();
            int iM780b9 = c0526d.m780b(18);
            int iM784f2 = iM780b9 != 0 ? c0526d.m784f(iM780b9) : 0;
            for (int i6 = 0; i6 < iM784f2; i6++) {
                int iM780b10 = c0526d.m780b(18);
                arrayList2.add(Integer.valueOf(iM780b10 != 0 ? c0526d.f981b.getInt((i6 * 4) + c0526d.m783e(iM780b10)) : 0));
            }
            C0413Wf c0413Wf2 = C0413Wf.f1577a;
            ArrayList arrayList3 = new ArrayList();
            int iM780b11 = c0526d.m780b(20);
            int iM784f3 = iM780b11 != 0 ? c0526d.m784f(iM780b11) : 0;
            int i7 = 0;
            while (i7 < iM784f3) {
                int iM780b12 = c0526d.m780b(20);
                char c2 = c;
                arrayList3.add(Integer.valueOf(iM780b12 != 0 ? c0526d.f981b.getInt((i7 * 4) + c0526d.m783e(iM780b12)) : 0));
                i7++;
                c = c2;
            }
            C0413Wf c0413Wf3 = C0413Wf.f1577a;
            return new C0492b3(dexKitBridge, i, i2, i3, strM782d, numValueOf, arrayList, arrayList2, arrayList3);
        }
    }

    /* JADX INFO: renamed from: a.b3$b */
    public static final class b extends AbstractC0859u9 implements InterfaceC0064D7<C0492b3, CharSequence> {

        /* JADX INFO: renamed from: b */
        public static final b f1835b = new b(1);

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000a.InterfaceC0064D7
        /* JADX INFO: renamed from: f */
        public final CharSequence mo53f(C0492b3 c0492b3) {
            C0492b3 c0492b32 = c0492b3;
            C0631i9.m1482e(c0492b32, "it");
            return c0492b32.m1195b();
        }
    }

    public C0492b3() {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0492b3(DexKitBridge dexKitBridge, int i, int i2, int i3, String str, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(dexKitBridge, i, i2);
        this.f1826b = i3;
        this.f1827c = str;
        this.f1828d = num;
        this.f1829e = arrayList;
        this.f1830f = arrayList2;
        this.f1831g = arrayList3;
        this.f1832h = new C0233Me(new C0926y0(this, 1));
        this.f1833i = new C0233Me(new C0511c3(this, dexKitBridge, i2));
        this.f1834j = new C0233Me(new C0511c3(dexKitBridge, this, i2, 1));
        new C0233Me(new C0511c3(dexKitBridge, this, i2, 2));
        new C0233Me(new C0511c3(dexKitBridge, this, i2, 0));
        new C0233Me(new C0709mb(dexKitBridge, this, i2, i, 8));
    }

    /* JADX INFO: renamed from: b */
    public final String m1195b() {
        return ((C0420X4) this.f1832h.m625a()).f1585a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0492b3) {
            return C0631i9.m1478a(this.f1827c, ((C0492b3) obj).f1827c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1827c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f1826b;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append("class " + m1195b());
        C0492b3 c0492b3 = (C0492b3) this.f1833i.m625a();
        if (c0492b3 != null) {
            sb.append(" extends ");
            sb.append(c0492b3.m1195b());
        }
        if (this.f1829e.size() > 0) {
            sb.append(" implements ");
            sb.append(C0834t3.m1952p0((C0530d3) this.f1834j.m625a(), ", ", b.f1835b, 30));
        }
        String string = sb.toString();
        C0631i9.m1481d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
