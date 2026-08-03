package Yue;

import Yue.AbstractC7643;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.function.Supplier;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7643 extends AbstractC4662 {

    /* JADX INFO: renamed from: ۥ */
    public final AbstractC4662 f2978;

    /* JADX INFO: renamed from: ۥ۟ */
    public final ThreadLocal<IdentityHashMap<C4605, IdentityHashMap<C4605, Boolean>>> f2979 = ThreadLocal.withInitial(new Supplier() { // from class: Yue.ۥۣۢ۠
        @Override // java.util.function.Supplier
        public final Object get() {
            return new IdentityHashMap();
        }
    });

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ */
    public static class C1314 extends AbstractC7643 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final ThreadLocal<C6383<C4605>> f23041 = ThreadLocal.withInitial(new Supplier() { // from class: Yue.ۥۣۢ۠۟
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC7643.C1314.m24386();
            }
        });

        public C1314(AbstractC4662 abstractC4662) {
            super(abstractC4662);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ C6383 m24386() {
            return new C6383(new C4605("html"), C4605.class);
        }

        public String toString() {
            return String.format(":has(%s)", this.f2978);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return this.f2978.mo11185() * 10;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            C6383<C4605> c6383 = f23041.get();
            c6383.m19937(c46052);
            while (c6383.hasNext()) {
                C4605 c46053 = (C4605) c6383.next();
                if (c46053 != c46052 && this.f2978.m14004(c46052, c46053)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ۟ */
    @Deprecated
    public static class C1315 extends AbstractC7643 {
        public C1315(AbstractC4662 abstractC4662) {
            super(abstractC4662);
        }

        public String toString() {
            return String.format("%s > ", this.f2978);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return this.f2978.mo11185() + 1;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            C4605 c4605Mo13701;
            return (c4605 == c46052 || (c4605Mo13701 = c46052.mo13701()) == null || !m24384(c4605, c4605Mo13701)) ? false : true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ۟۟, reason: contains not printable characters */
    public static class C7644 extends AbstractC4662 {

        /* JADX INFO: renamed from: ۥ */
        public final ArrayList<AbstractC4662> f2980;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f2981;

        public C7644(AbstractC4662 abstractC4662) {
            ArrayList<AbstractC4662> arrayList = new ArrayList<>();
            this.f2980 = arrayList;
            this.f2981 = 2;
            arrayList.add(abstractC4662);
            this.f2981 += abstractC4662.mo11185();
        }

        public String toString() {
            return C7615.m23819(this.f2980, " > ");
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return this.f2981;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            if (c46052 == c4605) {
                return false;
            }
            for (int size = this.f2980.size() - 1; size >= 0; size--) {
                if (c46052 == null || !this.f2980.get(size).m14004(c4605, c46052)) {
                    return false;
                }
                c46052 = c46052.mo13701();
            }
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m24387(AbstractC4662 abstractC4662) {
            this.f2980.add(abstractC4662);
            this.f2981 += abstractC4662.mo11185();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ۟۟۟, reason: contains not printable characters */
    public static class C7645 extends AbstractC7643 {
        public C7645(AbstractC4662 abstractC4662) {
            super(abstractC4662);
        }

        public String toString() {
            return String.format("%s + ", this.f2978);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return this.f2978.mo11185() + 2;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            C4605 c4605M13799;
            return (c4605 == c46052 || (c4605M13799 = c46052.m13799()) == null || !m24384(c4605, c4605M13799)) ? false : true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C7646 extends AbstractC7643 {
        public C7646(AbstractC4662 abstractC4662) {
            super(abstractC4662);
        }

        public String toString() {
            return String.format(":is(%s)", this.f2978);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return this.f2978.mo11185() + 2;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return this.f2978.m14004(c4605, c46052);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C7647 extends AbstractC7643 {
        public C7647(AbstractC4662 abstractC4662) {
            super(abstractC4662);
        }

        public String toString() {
            return String.format(":not(%s)", this.f2978);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return this.f2978.mo11185() + 2;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return !m24384(c4605, c46052);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C7648 extends AbstractC7643 {
        public C7648(AbstractC4662 abstractC4662) {
            super(abstractC4662);
        }

        public String toString() {
            return String.format("%s ", this.f2978);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return this.f2978.mo11185() * 2;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            if (c4605 == c46052) {
                return false;
            }
            for (C4605 c4605Mo13701 = c46052.mo13701(); c4605Mo13701 != null; c4605Mo13701 = c4605Mo13701.mo13701()) {
                if (m24384(c4605, c4605Mo13701)) {
                    return true;
                }
                if (c4605Mo13701 == c4605) {
                    break;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C7649 extends AbstractC7643 {
        public C7649(AbstractC4662 abstractC4662) {
            super(abstractC4662);
        }

        public String toString() {
            return String.format("%s ~ ", this.f2978);
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return this.f2978.mo11185() * 3;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            if (c4605 == c46052) {
                return false;
            }
            for (C4605 c4605M13745 = c46052.m13745(); c4605M13745 != null && c4605M13745 != c46052; c4605M13745 = c4605M13745.m13786()) {
                if (m24384(c4605, c4605M13745)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C7650 extends AbstractC4662 {
        public String toString() {
            return "";
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo11185() {
            return 1;
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            return c4605 == c46052;
        }
    }

    public AbstractC7643(AbstractC4662 abstractC4662) {
        this.f2978 = abstractC4662;
    }

    @Override // Yue.AbstractC4662
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo11186() {
        this.f2979.get().clear();
        super.mo11186();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m24384(C4605 c4605, C4605 c46052) {
        IdentityHashMap<C4605, IdentityHashMap<C4605, Boolean>> identityHashMap = this.f2979.get();
        IdentityHashMap<C4605, Boolean> identityHashMap2 = identityHashMap.get(c4605);
        if (identityHashMap2 == null) {
            identityHashMap2 = new IdentityHashMap<>();
            identityHashMap.put(c4605, identityHashMap2);
        }
        Boolean boolValueOf = identityHashMap2.get(c46052);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.f2978.m14004(c4605, c46052));
            identityHashMap2.put(c46052, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }
}
