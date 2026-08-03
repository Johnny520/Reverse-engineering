package Yue;

import android.view.LifecycleOwner;
import androidx.activity.OnBackPressedDispatcher;

/* JADX INFO: renamed from: Yue.ۥۣۡۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6548 {

    /* JADX INFO: renamed from: Yue.ۥۣۡۡۤ$ۥ */
    public static final class C1010 extends AbstractC6546 {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC5124<AbstractC6546, C8107> f2143;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super Yue.ۥۣۡۡۢ, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1010(boolean z, InterfaceC5124<? super AbstractC6546, C8107> interfaceC5124) {
            super(z);
            this.f2143 = interfaceC5124;
        }

        @Override // Yue.AbstractC6546
        public void handleOnBackPressed() {
            this.f2143.invoke(this);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final AbstractC6546 m3015(@InterfaceC6399 OnBackPressedDispatcher onBackPressedDispatcher, @InterfaceC6489 LifecycleOwner lifecycleOwner, boolean z, @InterfaceC6399 InterfaceC5124<? super AbstractC6546, C8107> interfaceC5124) {
        C5499.m17103(onBackPressedDispatcher, "<this>");
        C5499.m17103(interfaceC5124, "onBackPressed");
        C1010 c1010 = new C1010(z, interfaceC5124);
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.m28633(lifecycleOwner, c1010);
        } else {
            onBackPressedDispatcher.m28632(c1010);
        }
        return c1010;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ AbstractC6546 m3016(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z, InterfaceC5124 interfaceC5124, int i, Object obj) {
        if ((i & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return m3015(onBackPressedDispatcher, lifecycleOwner, z, interfaceC5124);
    }
}
