package p199n9;

import p186m9.C5135p;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5695f;

/* JADX INFO: renamed from: n9.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5524f {

    /* JADX INFO: renamed from: a */
    public final C5692c f17269a;

    /* JADX INFO: renamed from: b */
    public final String f17270b;

    /* JADX INFO: renamed from: c */
    public final boolean f17271c;

    /* JADX INFO: renamed from: d */
    public final C5691b f17272d;

    /* JADX INFO: renamed from: e */
    public final boolean f17273e;

    /* JADX INFO: renamed from: n9.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5524f {

        /* JADX INFO: renamed from: f */
        public static final a f17274f = new a();

        public a() {
            super(C5135p.f15488A, "Function", false, null, true);
        }
    }

    /* JADX INFO: renamed from: n9.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC5524f {

        /* JADX INFO: renamed from: f */
        public static final b f17275f = new b();

        public b() {
            super(C5135p.f15521x, "KFunction", true, null, false);
        }
    }

    /* JADX INFO: renamed from: n9.f$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC5524f {

        /* JADX INFO: renamed from: f */
        public static final c f17276f = new c();

        public c() {
            super(C5135p.f15521x, "KSuspendFunction", true, null, false);
        }
    }

    /* JADX INFO: renamed from: n9.f$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC5524f {

        /* JADX INFO: renamed from: f */
        public static final d f17277f = new d();

        public d() {
            super(C5135p.f15516s, "SuspendFunction", false, null, true);
        }
    }

    public AbstractC5524f(C5692c c5692c, String str, boolean z10, C5691b c5691b, boolean z11) {
        c5692c.getClass();
        str.getClass();
        this.f17269a = c5692c;
        this.f17270b = str;
        this.f17271c = z10;
        this.f17272d = c5691b;
        this.f17273e = z11;
    }

    /* JADX INFO: renamed from: a */
    public final String m22513a() {
        return this.f17270b;
    }

    /* JADX INFO: renamed from: b */
    public final C5692c m22514b() {
        return this.f17269a;
    }

    /* JADX INFO: renamed from: c */
    public final C5695f m22515c(int i10) {
        C5695f c5695fM23027j = C5695f.m23027j(this.f17270b + i10);
        c5695fM23027j.getClass();
        return c5695fM23027j;
    }

    public String toString() {
        return this.f17269a + '.' + this.f17270b + 'N';
    }
}
