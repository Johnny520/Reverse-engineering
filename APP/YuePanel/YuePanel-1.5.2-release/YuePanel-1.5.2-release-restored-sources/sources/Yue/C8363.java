package Yue;

import Yue.C6852;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۢۤۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC5572(name = "ViewTreeFullyDrawnReporterOwner")
public final class C8363 {

    /* JADX INFO: renamed from: Yue.ۥۢۤۧۡ$ۥ */
    public static final class C1500 extends AbstractC5673 implements InterfaceC5124<View, View> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1500 f24959 = new C1500();

        public C1500() {
            super(1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        public final View invoke(@InterfaceC6399 View view) {
            C5499.m17103(view, "it");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۧۡ$ۥ۟ */
    public static final class C1501 extends AbstractC5673 implements InterfaceC5124<View, InterfaceC5120> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1501 f24960 = new C1501();

        public C1501() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final InterfaceC5120 invoke(@InterfaceC6399 View view) {
            C5499.m17103(view, "it");
            Object tag = view.getTag(C6852.C1098.f2355);
            if (tag instanceof InterfaceC5120) {
                return (InterfaceC5120) tag;
            }
            return null;
        }
    }

    @InterfaceC5572(name = "get")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public static final InterfaceC5120 m4334(@InterfaceC6399 View view) {
        C5499.m17103(view, "<this>");
        return (InterfaceC5120) C7342.m22954(C7342.m22990(C7332.m22878(view, C1500.f24959), C1501.f24960));
    }

    @InterfaceC5572(name = "set")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m4335(@InterfaceC6399 View view, @InterfaceC6399 InterfaceC5120 interfaceC5120) {
        C5499.m17103(view, "<this>");
        C5499.m17103(interfaceC5120, "fullyDrawnReporterOwner");
        view.setTag(C6852.C1098.f2355, interfaceC5120);
    }
}
