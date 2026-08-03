package p000a;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: a.lb */
/* JADX INFO: loaded from: classes.dex */
public final class C0690lb extends AbstractC0417X1 {

    /* JADX INFO: renamed from: b */
    public final int f2555b;

    /* JADX INFO: renamed from: c */
    public final int f2556c;

    /* JADX INFO: renamed from: d */
    public final String f2557d;

    /* JADX INFO: renamed from: e */
    public final int f2558e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f2559f;

    /* JADX INFO: renamed from: g */
    public final C0233Me f2560g;

    /* JADX INFO: renamed from: h */
    public final C0233Me f2561h;

    /* JADX INFO: renamed from: i */
    public final C0233Me f2562i;

    /* JADX INFO: renamed from: a.lb$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C0690lb m1552a(DexKitBridge dexKitBridge, C0754p c0754p) {
            C0631i9.m1482e(dexKitBridge, "bridge");
            int iM780b = c0754p.m780b(10);
            int i = iM780b != 0 ? c0754p.f981b.getInt(iM780b + c0754p.f980a) : 0;
            if ((i & 131072) > 0) {
                i = (i ^ 131072) | 32;
            }
            int i2 = i;
            int iM780b2 = c0754p.m780b(4);
            int i3 = iM780b2 != 0 ? c0754p.f981b.getInt(iM780b2 + c0754p.f980a) : 0;
            int iM780b3 = c0754p.m780b(6);
            int i4 = iM780b3 != 0 ? c0754p.f981b.getInt(iM780b3 + c0754p.f980a) : 0;
            int iM780b4 = c0754p.m780b(8);
            int i5 = iM780b4 != 0 ? c0754p.f981b.getInt(iM780b4 + c0754p.f980a) : 0;
            int iM780b5 = c0754p.m780b(12);
            String strM782d = iM780b5 != 0 ? c0754p.m782d(iM780b5 + c0754p.f980a) : null;
            if (strM782d == null) {
                strM782d = "";
            }
            String str = strM782d;
            int iM780b6 = c0754p.m780b(14);
            int i6 = iM780b6 != 0 ? c0754p.f981b.getInt(iM780b6 + c0754p.f980a) : 0;
            ArrayList arrayList = new ArrayList();
            int iM780b7 = c0754p.m780b(16);
            int iM784f = iM780b7 != 0 ? c0754p.m784f(iM780b7) : 0;
            for (int i7 = 0; i7 < iM784f; i7++) {
                int iM780b8 = c0754p.m780b(16);
                arrayList.add(Integer.valueOf(iM780b8 != 0 ? c0754p.f981b.getInt((i7 * 4) + c0754p.m783e(iM780b8)) : 0));
            }
            C0413Wf c0413Wf = C0413Wf.f1577a;
            return new C0690lb(dexKitBridge, i3, i4, i5, i2, str, i6, arrayList);
        }
    }

    public C0690lb() {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0690lb(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, ArrayList arrayList) {
        super(dexKitBridge, i, i2);
        this.f2555b = i3;
        this.f2556c = i4;
        this.f2557d = str;
        this.f2558e = i5;
        this.f2559f = arrayList;
        this.f2560g = new C0233Me(new C0926y0(this, 2));
        new C0233Me(new C0728nb(dexKitBridge, this, i2, 0));
        new C0233Me(new C0728nb(dexKitBridge, this, i2, 2));
        new C0233Me(new C0728nb(dexKitBridge, this, i2, 1));
        new C0233Me(new C0709mb(dexKitBridge, this, i2, i, 5));
        new C0233Me(new C0709mb(dexKitBridge, this, i2, i, 0));
        new C0233Me(new C0709mb(dexKitBridge, this, i2, i, 4));
        new C0233Me(new C0709mb(dexKitBridge, this, i2, i, 3));
        new C0233Me(new C0709mb(dexKitBridge, this, i2, i, 1));
        new C0233Me(new C0709mb(dexKitBridge, this, i2, i, 2));
        this.f2561h = new C0233Me(new C0709mb(dexKitBridge, this, i2, i, 7));
        this.f2562i = new C0233Me(new C0709mb(dexKitBridge, this, i2, i, 6));
    }

    /* JADX INFO: renamed from: b */
    public final C0570f5 m1551b() {
        return (C0570f5) this.f2560g.m625a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0690lb) && C0631i9.m1478a(((C0690lb) obj).f2557d, this.f2557d);
    }

    public final int hashCode() {
        return this.f2557d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f2556c;
        if (i != 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(m1551b().f2129d);
        sb.append(" ");
        sb.append(m1551b().f2126a);
        sb.append(".");
        sb.append(m1551b().f2127b);
        sb.append("(");
        sb.append(C0834t3.m1952p0(m1551b().f2128c, ", ", null, 62));
        sb.append(")");
        String string = sb.toString();
        C0631i9.m1481d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
