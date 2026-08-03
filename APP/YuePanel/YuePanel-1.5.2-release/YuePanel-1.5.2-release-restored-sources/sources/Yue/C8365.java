package Yue;

import Yue.C6931;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۣۢۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC5572(name = "ViewTreeSavedStateRegistryOwner")
public final class C8365 {

    /* JADX INFO: renamed from: Yue.ۥۣۢۤۧ$ۥ */
    public static final class C1504 extends AbstractC5673 implements InterfaceC5124<View, View> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1504 f24963 = new C1504();

        public C1504() {
            super(1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        public final View invoke(@InterfaceC6399 View view) {
            C5499.m17103(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۤۧ$ۥ۟ */
    public static final class C1505 extends AbstractC5673 implements InterfaceC5124<View, InterfaceC7235> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1505 f24964 = new C1505();

        public C1505() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final InterfaceC7235 invoke(@InterfaceC6399 View view) {
            C5499.m17103(view, "view");
            Object tag = view.getTag(C6931.C1115.f2498);
            if (tag instanceof InterfaceC7235) {
                return (InterfaceC7235) tag;
            }
            return null;
        }
    }

    @InterfaceC5572(name = "get")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public static final InterfaceC7235 m4338(@InterfaceC6399 View view) {
        C5499.m17103(view, "<this>");
        return (InterfaceC7235) C7342.m22954(C7342.m22990(C7332.m22878(view, C1504.f24963), C1505.f24964));
    }

    @InterfaceC5572(name = "set")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m4339(@InterfaceC6399 View view, @InterfaceC6489 InterfaceC7235 interfaceC7235) {
        C5499.m17103(view, "<this>");
        view.setTag(C6931.C1115.f2498, interfaceC7235);
    }
}
