package p047d7;

import java.util.Objects;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: d7.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0732o implements Comparable {

    /* JADX INFO: renamed from: j */
    public static final C0732o f2175j;

    /* JADX INFO: renamed from: k */
    public static final C0732o f2176k;

    /* JADX INFO: renamed from: l */
    public static final C0732o f2177l;

    /* JADX INFO: renamed from: m */
    public static final C0732o f2178m;

    /* JADX INFO: renamed from: n */
    public static final C0732o f2179n;

    /* JADX INFO: renamed from: o */
    public static final C0732o f2180o;

    /* JADX INFO: renamed from: p */
    public static final C0732o[] f2181p;

    /* JADX INFO: renamed from: g */
    public final String f2182g;

    /* JADX INFO: renamed from: h */
    public final int f2183h;

    /* JADX INFO: renamed from: i */
    public final int f2184i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0732o c0732o = new C0732o("V2", 1896449818, 0);
        f2175j = c0732o;
        C0732o c0732o2 = new C0732o("V3", -262969152, 1);
        f2176k = c0732o2;
        C0732o c0732o3 = new C0732o("V31", 462663009, 2);
        f2177l = c0732o3;
        C0732o c0732o4 = new C0732o("STAMP_V1", 722016414, 3);
        f2178m = c0732o4;
        C0732o c0732o5 = new C0732o("STAMP_V2", 1845461005, 4);
        f2179n = c0732o5;
        C0732o c0732o6 = new C0732o("PADDING", 1114793335, 9999);
        f2180o = c0732o6;
        f2181p = new C0732o[]{c0732o, c0732o2, c0732o3, c0732o4, c0732o5, c0732o6, new C0732o("NULL", 0, 999)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0732o(String str, int i9, int i10) {
        this.f2182g = str;
        this.f2183h = i9;
        this.f2184i = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f2184i, ((C0732o) obj).f2184i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0732o.class == obj.getClass() && this.f2183h == ((C0732o) obj).f2183h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2183h));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.f2182g;
        if (str != null) {
            return str;
        }
        return "UNKNOWN(" + AbstractC5999a.m10748k(this.f2183h, 8) + ")";
    }
}
