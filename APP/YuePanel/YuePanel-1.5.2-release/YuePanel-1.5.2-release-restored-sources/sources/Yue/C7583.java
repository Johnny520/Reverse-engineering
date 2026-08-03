package Yue;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢ۠۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7583 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f22901 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f22902 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f22903 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f22904 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Integer f22905 = 0;

    /* JADX INFO: renamed from: ۥ */
    public HashMap<Object, InterfaceC7068> f2951 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟ */
    public HashMap<Object, C5279> f2952 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C4126 f22906;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f22907;

    /* JADX INFO: renamed from: Yue.ۥۢ۠۟۟$ۥ */
    public static /* synthetic */ class C1300 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f2953;

        static {
            int[] iArr = new int[EnumC7586.values().length];
            f2953 = iArr;
            try {
                iArr[EnumC7586.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2953[EnumC7586.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2953[EnumC7586.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2953[EnumC7586.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2953[EnumC7586.BARRIER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠۟۟$ۥ۟ */
    public enum EnumC1301 {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠۟۟$ۥ۟۟, reason: contains not printable characters */
    public enum EnumC7584 {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public enum EnumC7585 {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public enum EnumC7586 {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public C7583() {
        C4126 c4126 = new C4126(this);
        this.f22906 = c4126;
        this.f22907 = 0;
        this.f2951.put(f22905, c4126);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m3745(C4129 c4129) {
        c4129.m28195();
        this.f22906.m11810().m12723(this, c4129, 0);
        this.f22906.m11805().m12723(this, c4129, 1);
        for (Object obj : this.f2952.keySet()) {
            C5281 c5281Mo9354 = this.f2952.get(obj).mo9354();
            if (c5281Mo9354 != null) {
                InterfaceC7068 interfaceC7068M23731 = this.f2951.get(obj);
                if (interfaceC7068M23731 == null) {
                    interfaceC7068M23731 = m23731(obj);
                }
                interfaceC7068M23731.mo1093(c5281Mo9354);
            }
        }
        Iterator<Object> it = this.f2951.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC7068 interfaceC7068 = this.f2951.get(it.next());
            if (interfaceC7068 != this.f22906) {
                C4128 c4128Mo11786 = interfaceC7068.mo11786();
                c4128Mo11786.m11955(null);
                if (interfaceC7068 instanceof C5228) {
                    interfaceC7068.apply();
                }
                c4129.m4410(c4128Mo11786);
            } else {
                interfaceC7068.mo1093(c4129);
            }
        }
        Iterator<Object> it2 = this.f2952.keySet().iterator();
        while (it2.hasNext()) {
            C5279 c5279 = this.f2952.get(it2.next());
            if (c5279.mo9354() != null) {
                Iterator<Object> it3 = c5279.f12573.iterator();
                while (it3.hasNext()) {
                    c5279.mo9354().mo2055(this.f2951.get(it3.next()).mo11786());
                }
                c5279.mo264();
            }
        }
        Iterator<Object> it4 = this.f2951.keySet().iterator();
        while (it4.hasNext()) {
            this.f2951.get(it4.next()).apply();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public C3508 m3746(Object obj, EnumC7585 enumC7585) {
        C3508 c3508 = (C3508) m23738(obj, EnumC7586.BARRIER);
        c3508.m9357(enumC7585);
        return c3508;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C3190 m23729(Object... objArr) {
        C3190 c3190 = (C3190) m23738(null, EnumC7586.ALIGN_HORIZONTALLY);
        c3190.m2056(objArr);
        return c3190;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C3191 m23730(Object... objArr) {
        C3191 c3191 = (C3191) m23738(null, EnumC7586.ALIGN_VERTICALLY);
        c3191.m2056(objArr);
        return c3191;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C4126 m23731(Object obj) {
        InterfaceC7068 interfaceC7068M23733 = this.f2951.get(obj);
        if (interfaceC7068M23733 == null) {
            interfaceC7068M23733 = m23733(obj);
            this.f2951.put(obj, interfaceC7068M23733);
            interfaceC7068M23733.mo1094(obj);
        }
        if (interfaceC7068M23733 instanceof C4126) {
            return (C4126) interfaceC7068M23733;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m23732(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C4126 m23733(Object obj) {
        return new C4126(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final String m23734() {
        StringBuilder sb = new StringBuilder();
        sb.append("__HELPER_KEY_");
        int i = this.f22907;
        this.f22907 = i + 1;
        sb.append(i);
        sb.append("__");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m23735() {
        for (Object obj : this.f2951.keySet()) {
            m23731(obj).m11825(obj);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public C5228 m23736(Object obj, int i) {
        InterfaceC7068 interfaceC7068 = this.f2951.get(obj);
        Object obj2 = interfaceC7068;
        if (interfaceC7068 == null) {
            C5228 c5228 = new C5228(this);
            c5228.m16023(i);
            c5228.mo1094(obj);
            this.f2951.put(obj, c5228);
            obj2 = c5228;
        }
        return (C5228) obj2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C7583 m23737(C4400 c4400) {
        return m23744(c4400);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C5279 m23738(Object obj, EnumC7586 enumC7586) {
        C5279 c5315;
        if (obj == null) {
            obj = m23734();
        }
        C5279 c5279 = this.f2952.get(obj);
        if (c5279 == null) {
            int i = C1300.f2953[enumC7586.ordinal()];
            if (i == 1) {
                c5315 = new C5315(this);
            } else if (i == 2) {
                c5315 = new C8183(this);
            } else if (i == 3) {
                c5315 = new C3190(this);
            } else if (i == 4) {
                c5315 = new C3191(this);
            } else if (i != 5) {
                c5279 = new C5279(this, enumC7586);
                this.f2952.put(obj, c5279);
            } else {
                c5315 = new C3508(this);
            }
            c5279 = c5315;
            this.f2952.put(obj, c5279);
        }
        return c5279;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C5315 m23739(Object... objArr) {
        C5315 c5315 = (C5315) m23738(null, EnumC7586.HORIZONTAL_CHAIN);
        c5315.m2056(objArr);
        return c5315;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public C5228 m23740(Object obj) {
        return m23736(obj, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m23741(Object obj, Object obj2) {
        m23731(obj).m11825(obj2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public InterfaceC7068 m23742(Object obj) {
        return this.f2951.get(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m23743() {
        this.f2952.clear();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public C7583 m23744(C4400 c4400) {
        this.f22906.m11822(c4400);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public C7583 m23745(C4400 c4400) {
        this.f22906.m11826(c4400);
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C8183 m23746(Object... objArr) {
        C8183 c8183 = (C8183) m23738(null, EnumC7586.VERTICAL_CHAIN);
        c8183.m2056(objArr);
        return c8183;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public C5228 m23747(Object obj) {
        return m23736(obj, 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C7583 m23748(C4400 c4400) {
        return m23745(c4400);
    }
}
