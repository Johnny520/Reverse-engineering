package fun.box001.internal.dexformat.writer.data;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: l.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0193a implements Comparable {

    /* JADX INFO: renamed from: e */
    private static final ConcurrentHashMap f705e = null;

    /* JADX INFO: renamed from: a */
    private final String f706a;

    /* JADX INFO: renamed from: b */
    private final C0195c f707b;

    /* JADX INFO: renamed from: c */
    private final C0194b f708c;

    /* JADX INFO: renamed from: d */
    private C0194b f709d;

    static {
        f705e = new ConcurrentHashMap(10000, 0.75f);
    }

    private C0193a(String r1, C0195c r2, C0194b r3) {
        if (r1 == null) goto L10;
        if (r2 == null) goto L8;
        this.f706a = r1;
        this.f707b = r2;
        this.f708c = r3;
        this.f709d = null;
        return;
    L8:
        throw new NullPointerException("returnType == null");
    L10:
        throw new NullPointerException("descriptor == null");
    }

    /* JADX INFO: renamed from: b */
    public static C0193a m453b(String r11) {
        C0193a r0 = (C0193a) f705e.get(r11);
        if (r0 == null) goto L5;
        return r0;
    L5:
        int r02 = r11.length();
        int r1 = 0;
        if (r11.charAt(0) != '(') goto L59;
        int r5 = 0;
        int r3 = 1;
    L9:
        if (r3 >= r02) goto L19;
        char r7 = r11.charAt(r3);
        if (r7 == ')') goto L20;
        if (r7 < 'A') goto L18;
        if (r7 > 'Z') goto L18;
        r5 = r5 + 1;
    L18:
        r3 = r3 + 1;
    L20:
        if (r3 == 0) goto L57;
        if (r3 == (r02 - 1)) goto L57;
        if (r11.indexOf(41, r3 + 1) != (-1)) goto L55;
        C0195c[] r03 = new C0195c[r5];
        int r72 = 0;
        int r52 = 1;
    L26:
        char r8 = r11.charAt(r52);
        if (r8 == ')') goto L28;
        int r9 = r52;
    L43:
        if (r8 != '[') goto L46;
        r9 = r9 + 1;
        r8 = r11.charAt(r9);
        goto L43
    L46:
        if (r8 != 'L') goto L52;
        int r82 = r11.indexOf(59, r9);
        if (r82 == (-1)) goto L51;
        int r83 = r82 + 1;
    L53:
        r03[r72] = C0195c.m465i(r11.substring(r52, r83));
        r72 = r72 + 1;
        r52 = r83;
        goto L26
    L51:
        throw new IllegalArgumentException("bad descriptor");
    L52:
        r83 = r9 + 1;
        goto L53
    L28:
        String r2 = r11.substring(r52 + 1);
        C0195c r32 = C0195c.f762g;
        if (r2.equals("V") == false) goto L33;
        C0195c r22 = C0195c.f770o;     // Catch: NullPointerException -> L39
    L34:
        C0194b r33 = new C0194b(r72);
    L35:
        if (r1 >= r72) goto L38;
        r33.m523z(r1, r03[r1]);
        r1 = r1 + 1;
        goto L35
    L38:
        return new C0193a(r11, r22, r33);
    L33:
        r22 = C0195c.m465i(r2);
    L40:
        throw new NullPointerException("descriptor == null");
    L55:
        throw new IllegalArgumentException("bad descriptor");
    L57:
        throw new IllegalArgumentException("bad descriptor");
    L19:
        r3 = 0;
        goto L20
    L59:
        throw new IllegalArgumentException("bad descriptor");
    }

    /* JADX INFO: renamed from: f */
    public static C0193a m454f(String r2) {
        if (r2 == null) goto L11;
        ConcurrentHashMap r0 = f705e;
        C0193a r1 = (C0193a) r0.get(r2);
        if (r1 == null) goto L6;
        return r1;
    L6:
        C0193a r22 = m453b(r2);
        C0193a r02 = (C0193a) r0.putIfAbsent(r22.f706a, r22);
        if (r02 != null) goto L9;
        return r22;
    L9:
        return r02;
    L11:
        throw new NullPointerException("descriptor == null");
    }

    /* JADX INFO: renamed from: a */
    public final int m455a(C0193a r9) {
        if (this != r9) goto L5;
        return 0;
    L5:
        int r1 = this.f707b.m467b(r9.f707b);
        if (r1 == 0) goto L8;
        return r1;
    L8:
        C0194b r12 = this.f708c;
        int r2 = r12.m504B();
        C0194b r92 = r9.f708c;
        int r3 = r92.m504B();
        int r4 = Math.min(r2, r3);
        int r5 = 0;
    L9:
        if (r5 >= r4) goto L14;
        int r6 = r12.m515r(r5).m467b(r92.m515r(r5));
        if (r6 != 0) goto L12;
        r5 = r5 + 1;
        goto L9
    L12:
        return r6;
    L14:
        if (r2 >= r3) goto L17;
        return -1;
    L17:
        if (r2 <= r3) goto L20;
        return 1;
    L20:
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final C0194b m456c() {
        if (this.f709d != null) goto L14;
        C0194b r0 = this.f708c;
        int r1 = r0.m504B();
        C0194b r2 = new C0194b(r1);
        int r3 = 0;
        boolean r4 = false;
    L5:
        if (r3 >= r1) goto L10;
        C0195c r5 = r0.m515r(r3);
        if (r5.m473k() == false) goto L9;
        r5 = C0195c.f767l;
        r4 = true;
    L9:
        r2.m523z(r3, r5);
        r3 = r3 + 1;
        goto L5
    L10:
        if (r4 == false) goto L12;
        r0 = r2;
    L12:
        this.f709d = r0;
    L14:
        return this.f709d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return m455a((C0193a) r1);
    }

    /* JADX INFO: renamed from: d */
    public final C0194b m457d() {
        return this.f708c;
    }

    /* JADX INFO: renamed from: e */
    public final C0195c m458e() {
        return this.f707b;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof C0193a) == true) goto L9;
        return false;
    L9:
        String r22 = ((C0193a) r2).f706a;
        return this.f706a.equals(r22);
    }

    /* JADX INFO: renamed from: g */
    public final C0193a m459g(C0195c r4) {
        String r0 = "(" + r4.m471h() + this.f706a.substring(1);
        C0194b r42 = this.f708c.m464J(r4);
        r42.m536g();
        C0193a r1 = new C0193a(r0, this.f707b, r42);
        C0193a r43 = (C0193a) f705e.putIfAbsent(r0, r1);
        if (r43 != null) goto L5;
        return r1;
    L5:
        return r43;
    }

    public final int hashCode() {
        return this.f706a.hashCode();
    }

    public final String toString() {
        return this.f706a;
    }
}
