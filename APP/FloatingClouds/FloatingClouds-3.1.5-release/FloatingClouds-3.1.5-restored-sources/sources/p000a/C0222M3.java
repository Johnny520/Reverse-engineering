package p000a;

import java.util.HashSet;
import java.util.Iterator;
import p000a.C0693le;

/* JADX INFO: renamed from: a.M3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0222M3 {

    /* JADX INFO: renamed from: b */
    public final C0240N3 f745b;

    /* JADX INFO: renamed from: c */
    public final a f746c;

    /* JADX INFO: renamed from: d */
    public C0222M3 f747d;

    /* JADX INFO: renamed from: g */
    public C0693le f750g;

    /* JADX INFO: renamed from: a */
    public HashSet<C0222M3> f744a = null;

    /* JADX INFO: renamed from: e */
    public int f748e = 0;

    /* JADX INFO: renamed from: f */
    public int f749f = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: a.M3$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f751a;

        /* JADX INFO: renamed from: b */
        public static final a f752b;

        /* JADX INFO: renamed from: c */
        public static final a f753c;

        /* JADX INFO: renamed from: d */
        public static final a f754d;

        /* JADX INFO: renamed from: e */
        public static final a f755e;

        /* JADX INFO: renamed from: f */
        public static final a f756f;

        /* JADX INFO: renamed from: g */
        public static final a f757g;

        /* JADX INFO: renamed from: h */
        public static final a f758h;

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ a[] f759i;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("NONE", 0);
            a aVar2 = new a("LEFT", 1);
            f751a = aVar2;
            a aVar3 = new a("TOP", 2);
            f752b = aVar3;
            a aVar4 = new a("RIGHT", 3);
            f753c = aVar4;
            a aVar5 = new a("BOTTOM", 4);
            f754d = aVar5;
            a aVar6 = new a("BASELINE", 5);
            f755e = aVar6;
            a aVar7 = new a("CENTER", 6);
            f756f = aVar7;
            a aVar8 = new a("CENTER_X", 7);
            f757g = aVar8;
            a aVar9 = new a("CENTER_Y", 8);
            f758h = aVar9;
            f759i = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f759i.clone();
        }
    }

    public C0222M3(C0240N3 c0240n3, a aVar) {
        this.f745b = c0240n3;
        this.f746c = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m598a(C0222M3 c0222m3, int i) {
        m599b(c0222m3, i, -1, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m599b(C0222M3 c0222m3, int i, int i2, boolean z) {
        if (c0222m3 == null) {
            m605h();
            return true;
        }
        if (!z && !m604g(c0222m3)) {
            return false;
        }
        this.f747d = c0222m3;
        if (c0222m3.f744a == null) {
            c0222m3.f744a = new HashSet<>();
        }
        this.f747d.f744a.add(this);
        if (i > 0) {
            this.f748e = i;
        } else {
            this.f748e = 0;
        }
        this.f749f = i2;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m600c() {
        C0222M3 c0222m3;
        if (this.f745b.f806X == 8) {
            return 0;
        }
        int i = this.f749f;
        return (i <= -1 || (c0222m3 = this.f747d) == null || c0222m3.f745b.f806X != 8) ? this.f748e : i;
    }

    /* JADX INFO: renamed from: d */
    public final C0222M3 m601d() {
        a aVar = this.f746c;
        int iOrdinal = aVar.ordinal();
        C0240N3 c0240n3 = this.f745b;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0240n3.f783A;
            case 2:
                return c0240n3.f784B;
            case 3:
                return c0240n3.f837y;
            case 4:
                return c0240n3.f838z;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m602e() {
        HashSet<C0222M3> hashSet = this.f744a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C0222M3> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m601d().m603f()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m603f() {
        return this.f747d != null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m604g(C0222M3 c0222m3) {
        if (c0222m3 == null) {
            return false;
        }
        a aVar = a.f755e;
        a aVar2 = this.f746c;
        C0240N3 c0240n3 = c0222m3.f745b;
        a aVar3 = c0222m3.f746c;
        if (aVar3 == aVar2) {
            return aVar2 != aVar || (c0240n3.f835w && this.f745b.f835w);
        }
        int iOrdinal = aVar2.ordinal();
        a aVar4 = a.f757g;
        a aVar5 = a.f758h;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z = aVar3 == a.f751a || aVar3 == a.f753c;
                return c0240n3 instanceof C0478a8 ? z || aVar3 == aVar4 : z;
            case 2:
            case 4:
                boolean z2 = aVar3 == a.f752b || aVar3 == a.f754d;
                return c0240n3 instanceof C0478a8 ? z2 || aVar3 == aVar5 : z2;
            case 6:
                return (aVar3 == aVar || aVar3 == aVar4 || aVar3 == aVar5) ? false : true;
            default:
                throw new AssertionError(aVar2.name());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m605h() {
        HashSet<C0222M3> hashSet;
        C0222M3 c0222m3 = this.f747d;
        if (c0222m3 != null && (hashSet = c0222m3.f744a) != null) {
            hashSet.remove(this);
        }
        this.f747d = null;
        this.f748e = 0;
        this.f749f = -1;
    }

    /* JADX INFO: renamed from: i */
    public final void m606i() {
        C0693le c0693le = this.f750g;
        if (c0693le == null) {
            this.f750g = new C0693le(C0693le.a.f2592a);
        } else {
            c0693le.m1561c();
        }
    }

    public final String toString() {
        return this.f745b.f807Y + ":" + this.f746c.toString();
    }
}
