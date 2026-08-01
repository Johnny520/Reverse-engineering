package p277t2;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: t2.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8079k {

    /* JADX INFO: renamed from: b */
    public static final a f26965b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f26966c = m31189k(0);

    /* JADX INFO: renamed from: d */
    public static final int f26967d = m31189k(1);

    /* JADX INFO: renamed from: e */
    public static final int f26968e = m31189k(2);

    /* JADX INFO: renamed from: f */
    public static final int f26969f = m31189k(3);

    /* JADX INFO: renamed from: g */
    public static final int f26970g = m31189k(4);

    /* JADX INFO: renamed from: h */
    public static final int f26971h = m31189k(5);

    /* JADX INFO: renamed from: i */
    public static final int f26972i = m31189k(6);

    /* JADX INFO: renamed from: j */
    public static final int f26973j = m31189k(7);

    /* JADX INFO: renamed from: k */
    public static final int f26974k = m31189k(8);

    /* JADX INFO: renamed from: a */
    public final int f26975a;

    public /* synthetic */ C8079k(int i10) {
        this.f26975a = i10;
    }

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ C8079k m31188j(int i10) {
        return new C8079k(i10);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m31190l(int i10, Object obj) {
        return (obj instanceof C8079k) && i10 == ((C8079k) obj).m31194p();
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m31191m(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: n */
    public static int m31192n(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: o */
    public static String m31193o(int i10) {
        return m31191m(i10, f26966c) ? "Button" : m31191m(i10, f26967d) ? "Checkbox" : m31191m(i10, f26968e) ? "Switch" : m31191m(i10, f26969f) ? "RadioButton" : m31191m(i10, f26970g) ? "Tab" : m31191m(i10, f26971h) ? "Image" : m31191m(i10, f26972i) ? "DropdownList" : m31191m(i10, f26973j) ? "Picker" : m31191m(i10, f26974k) ? "Carousel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31190l(this.f26975a, obj);
    }

    public int hashCode() {
        return m31192n(this.f26975a);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int m31194p() {
        return this.f26975a;
    }

    public String toString() {
        return m31193o(this.f26975a);
    }

    /* JADX INFO: renamed from: t2.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m31195a() {
            return C8079k.f26966c;
        }

        /* JADX INFO: renamed from: b */
        public final int m31196b() {
            return C8079k.f26974k;
        }

        /* JADX INFO: renamed from: c */
        public final int m31197c() {
            return C8079k.f26967d;
        }

        /* JADX INFO: renamed from: d */
        public final int m31198d() {
            return C8079k.f26972i;
        }

        /* JADX INFO: renamed from: e */
        public final int m31199e() {
            return C8079k.f26971h;
        }

        /* JADX INFO: renamed from: f */
        public final int m31200f() {
            return C8079k.f26969f;
        }

        /* JADX INFO: renamed from: g */
        public final int m31201g() {
            return C8079k.f26968e;
        }

        /* JADX INFO: renamed from: h */
        public final int m31202h() {
            return C8079k.f26970g;
        }

        /* JADX INFO: renamed from: i */
        public final int m31203i() {
            return C8079k.f26973j;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m31189k(int i10) {
        return i10;
    }
}
