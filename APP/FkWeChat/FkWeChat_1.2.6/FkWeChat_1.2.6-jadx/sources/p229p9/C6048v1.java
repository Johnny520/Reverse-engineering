package p229p9;

import java.util.Map;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5107t0;

/* JADX INFO: renamed from: p9.v1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6048v1 {

    /* JADX INFO: renamed from: a */
    public static final C6048v1 f19000a = new C6048v1();

    /* JADX INFO: renamed from: b */
    public static final Map f19001b;

    /* JADX INFO: renamed from: c */
    public static final h f19002c;

    /* JADX INFO: renamed from: p9.v1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6051w1 {

        /* JADX INFO: renamed from: c */
        public static final a f19003c = new a();

        public a() {
            super("inherited", false);
        }
    }

    /* JADX INFO: renamed from: p9.v1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6051w1 {

        /* JADX INFO: renamed from: c */
        public static final b f19004c = new b();

        public b() {
            super("internal", false);
        }
    }

    /* JADX INFO: renamed from: p9.v1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6051w1 {

        /* JADX INFO: renamed from: c */
        public static final c f19005c = new c();

        public c() {
            super("invisible_fake", false);
        }
    }

    /* JADX INFO: renamed from: p9.v1$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6051w1 {

        /* JADX INFO: renamed from: c */
        public static final d f19006c = new d();

        public d() {
            super("local", false);
        }
    }

    /* JADX INFO: renamed from: p9.v1$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC6051w1 {

        /* JADX INFO: renamed from: c */
        public static final e f19007c = new e();

        public e() {
            super("private", false);
        }
    }

    /* JADX INFO: renamed from: p9.v1$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f extends AbstractC6051w1 {

        /* JADX INFO: renamed from: c */
        public static final f f19008c = new f();

        public f() {
            super("private_to_this", false);
        }

        @Override // p229p9.AbstractC6051w1
        /* JADX INFO: renamed from: b */
        public String mo24102b() {
            return "private/*private to this*/";
        }
    }

    /* JADX INFO: renamed from: p9.v1$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class g extends AbstractC6051w1 {

        /* JADX INFO: renamed from: c */
        public static final g f19009c = new g();

        public g() {
            super("protected", true);
        }
    }

    /* JADX INFO: renamed from: p9.v1$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class h extends AbstractC6051w1 {

        /* JADX INFO: renamed from: c */
        public static final h f19010c = new h();

        public h() {
            super("public", true);
        }
    }

    /* JADX INFO: renamed from: p9.v1$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class i extends AbstractC6051w1 {

        /* JADX INFO: renamed from: c */
        public static final i f19011c = new i();

        public i() {
            super("unknown", false);
        }
    }

    static {
        Map mapM20761c = AbstractC5107t0.m20761c();
        mapM20761c.put(f.f19008c, 0);
        mapM20761c.put(e.f19007c, 0);
        mapM20761c.put(b.f19004c, 1);
        mapM20761c.put(g.f19009c, 1);
        h hVar = h.f19010c;
        mapM20761c.put(hVar, 2);
        f19001b = AbstractC5107t0.m20760b(mapM20761c);
        f19002c = hVar;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m24100a(AbstractC6051w1 abstractC6051w1, AbstractC6051w1 abstractC6051w12) {
        abstractC6051w1.getClass();
        abstractC6051w12.getClass();
        if (abstractC6051w1 == abstractC6051w12) {
            return 0;
        }
        Map map = f19001b;
        Integer num = (Integer) map.get(abstractC6051w1);
        Integer num2 = (Integer) map.get(abstractC6051w12);
        if (num == null || num2 == null || AbstractC1061t.m3842c(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m24101b(AbstractC6051w1 abstractC6051w1) {
        abstractC6051w1.getClass();
        return abstractC6051w1 == e.f19007c || abstractC6051w1 == f.f19008c;
    }
}
