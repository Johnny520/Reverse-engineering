package la;

import java.util.Arrays;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: la.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4723c extends AbstractC4721a {

    /* JADX INFO: renamed from: h */
    public static final a f14002h = new a(null);

    /* JADX INFO: renamed from: i */
    public static final C4723c f14003i;

    /* JADX INFO: renamed from: j */
    public static final C4723c f14004j;

    /* JADX INFO: renamed from: k */
    public static final C4723c f14005k;

    /* JADX INFO: renamed from: g */
    public final boolean f14006g;

    static {
        C4723c c4723c = new C4723c(2, 1, 0);
        f14003i = c4723c;
        f14004j = c4723c.m18868m();
        f14005k = new C4723c(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4723c(int[] iArr, boolean z10) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f14006g = z10;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m18863h(C4723c c4723c) {
        c4723c.getClass();
        return m18864i(c4723c.m18866k(this.f14006g));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m18864i(C4723c c4723c) {
        if ((m18843a() == 1 && m18844b() == 0) || m18843a() == 0) {
            return false;
        }
        return !m18867l(c4723c);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m18865j() {
        return this.f14006g;
    }

    /* JADX INFO: renamed from: k */
    public final C4723c m18866k(boolean z10) {
        C4723c c4723c = z10 ? f14003i : f14004j;
        return c4723c.m18867l(this) ? c4723c : this;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m18867l(C4723c c4723c) {
        if (m18843a() > c4723c.m18843a()) {
            return true;
        }
        return m18843a() >= c4723c.m18843a() && m18844b() > c4723c.m18844b();
    }

    /* JADX INFO: renamed from: m */
    public final C4723c m18868m() {
        return (m18843a() == 1 && m18844b() == 9) ? new C4723c(2, 0, 0) : new C4723c(m18843a(), m18844b() + 1, 0);
    }

    /* JADX INFO: renamed from: la.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4723c(int... iArr) {
        this(iArr, false);
        iArr.getClass();
    }
}
