package p001;

import android.content.Context;

/* JADX INFO: renamed from: ۟.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0246i extends AbstractC0484za {

    /* JADX INFO: renamed from: ۟.i$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0208f3<C0433vb> {
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final C0433vb mo7() {
            Class clsM1200;
            C0246i.this.getClass();
            String str = C0283k8.f1632.f895;
            if (str != null && (clsM1200 = C0373r3.m1200(str)) != null) {
                String str2 = C0283k8.f1632.f1603;
                "<this>";
                "hooker";
                C0373r3.m1209(clsM1200, str2, new C0320n3());
            }
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.i$b */
    public static final class b extends AbstractC0335o4 implements InterfaceC0208f3<C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final b f849 = new b();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final C0433vb mo7() {
            String str = C0283k8.f1632.f1613;
            C0237h4.m1089("ScreenshotManagerCls", str);
            C0386s3.m1225(str, C0283k8.f1632.f1614, new Object[]{Context.class, C0373r3.m1199("kotlin.jvm.functions.Function0", null, 3)}, C0260j.f867);
            return C0433vb.f1163;
        }
    }

    @Override // p001.InterfaceC0139a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo802(String str) {
        C0237h4.m1090("processName", str);
        C0192e1.m1054(EnumC0164c1.f1369, new a());
        C0192e1.m1054(EnumC0164c1.f1389, b.f849);
    }
}
