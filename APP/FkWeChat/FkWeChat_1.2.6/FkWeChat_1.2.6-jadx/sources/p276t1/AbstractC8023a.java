package p276t1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: t1.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8023a {

    /* JADX INFO: renamed from: b */
    public static final d f26742b = new d(null);

    /* JADX INFO: renamed from: c */
    public static final int f26743c = 8;

    /* JADX INFO: renamed from: d */
    public static final AbstractC8023a f26744d = new a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: e */
    public static final AbstractC8023a f26745e = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* JADX INFO: renamed from: f */
    public static final AbstractC8023a f26746f = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: a */
    public final float[] f26747a;

    /* JADX INFO: renamed from: t1.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC8023a {
        public a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* JADX INFO: renamed from: t1.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC8023a {
        public b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* JADX INFO: renamed from: t1.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC8023a {
        public c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    public AbstractC8023a(float[] fArr) {
        this.f26747a = fArr;
    }

    /* JADX INFO: renamed from: b */
    public final float[] m30834b() {
        return this.f26747a;
    }

    /* JADX INFO: renamed from: t1.a$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d {
        public /* synthetic */ d(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC8023a m30835a() {
            return AbstractC8023a.f26744d;
        }

        public d() {
        }
    }

    public /* synthetic */ AbstractC8023a(float[] fArr, AbstractC1043k abstractC1043k) {
        this(fArr);
    }
}
