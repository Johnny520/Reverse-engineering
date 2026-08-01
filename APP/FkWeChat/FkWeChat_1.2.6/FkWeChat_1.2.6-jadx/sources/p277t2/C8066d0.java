package p277t2;

import p010a9.InterfaceC0188p;
import p024b9.AbstractC1067w;

/* JADX INFO: renamed from: t2.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8066d0 {

    /* JADX INFO: renamed from: a */
    public static final C8066d0 f26934a = new C8066d0();

    /* JADX INFO: renamed from: b */
    public static final C8072g0 f26935b = new C8072g0("TestTagsAsResourceId", false, b.f26939r, null, 8, null);

    /* JADX INFO: renamed from: c */
    public static final C8072g0 f26936c = new C8072g0("AccessibilityClassName", true, a.f26938r, null, 8, null);

    /* JADX INFO: renamed from: d */
    public static final int f26937d = 8;

    /* JADX INFO: renamed from: a */
    public final C8072g0 m31061a() {
        return f26936c;
    }

    /* JADX INFO: renamed from: b */
    public final C8072g0 m31062b() {
        return f26935b;
    }

    /* JADX INFO: renamed from: t2.d0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public static final a f26938r = new a();

        public a() {
            super(2);
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    /* JADX INFO: renamed from: t2.d0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public static final b f26939r = new b();

        public b() {
            super(2);
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m31064a((Boolean) obj, ((Boolean) obj2).booleanValue());
        }

        /* JADX INFO: renamed from: a */
        public final Boolean m31064a(Boolean bool, boolean z10) {
            return bool;
        }
    }
}
