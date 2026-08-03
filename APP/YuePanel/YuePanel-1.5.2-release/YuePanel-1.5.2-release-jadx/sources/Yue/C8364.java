package Yue;

import Yue.C6852;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۢۤۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC5572(name = "ViewTreeOnBackPressedDispatcherOwner")
public final class C8364 {

    /* JADX INFO: renamed from: Yue.ۥۢۤۧۢ$ۥ */
    public static final class C1502 extends AbstractC5673 implements InterfaceC5124<View, View> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1502 f24961 = new C1502();

        public C1502() {
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

    /* JADX INFO: renamed from: Yue.ۥۢۤۧۢ$ۥ۟ */
    public static final class C1503 extends AbstractC5673 implements InterfaceC5124<View, InterfaceC6549> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1503 f24962 = new C1503();

        public C1503() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final InterfaceC6549 invoke(@InterfaceC6399 View view) {
            C5499.m17103(view, "it");
            Object tag = view.getTag(C6852.C1098.f2356);
            if (tag instanceof InterfaceC6549) {
                return (InterfaceC6549) tag;
            }
            return null;
        }
    }

    @InterfaceC5572(name = "get")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public static final InterfaceC6549 m4336(@InterfaceC6399 View view) {
        C5499.m17103(view, "<this>");
        return (InterfaceC6549) C7342.m22954(C7342.m22990(C7332.m22878(view, C1502.f24961), C1503.f24962));
    }

    @InterfaceC5572(name = "set")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m4337(@InterfaceC6399 View view, @InterfaceC6399 InterfaceC6549 interfaceC6549) {
        C5499.m17103(view, "<this>");
        C5499.m17103(interfaceC6549, "onBackPressedDispatcherOwner");
        view.setTag(C6852.C1098.f2356, interfaceC6549);
    }
}
