package p135j2;

import p010a9.InterfaceC0188p;
import p024b9.C1055q;
import p049d9.AbstractC1925a;

/* JADX INFO: renamed from: j2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3503b {

    /* JADX INFO: renamed from: a */
    public static final C3547m f9719a = new C3547m(a.f9721y);

    /* JADX INFO: renamed from: b */
    public static final C3547m f9720b = new C3547m(b.f9722y);

    /* JADX INFO: renamed from: j2.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a extends C1055q implements InterfaceC0188p {

        /* JADX INFO: renamed from: y */
        public static final a f9721y = new a();

        public a() {
            super(2, AbstractC1925a.class, "min", "min(II)I", 1);
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m13044y(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        /* JADX INFO: renamed from: y */
        public final Integer m13044y(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }
    }

    /* JADX INFO: renamed from: j2.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class b extends C1055q implements InterfaceC0188p {

        /* JADX INFO: renamed from: y */
        public static final b f9722y = new b();

        public b() {
            super(2, AbstractC1925a.class, "max", "max(II)I", 1);
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m13045y(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        /* JADX INFO: renamed from: y */
        public final Integer m13045y(int i10, int i11) {
            return Integer.valueOf(Math.max(i10, i11));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C3547m m13041a() {
        return f9719a;
    }

    /* JADX INFO: renamed from: b */
    public static final C3547m m13042b() {
        return f9720b;
    }

    /* JADX INFO: renamed from: c */
    public static final int m13043c(AbstractC3499a abstractC3499a, int i10, int i11) {
        return ((Number) abstractC3499a.m13036a().invoke(Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }
}
