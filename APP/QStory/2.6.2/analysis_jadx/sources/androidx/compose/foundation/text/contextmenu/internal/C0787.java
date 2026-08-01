package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.compose.foundation.layout.AbstractC0619;
import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.draw.AbstractC1445;
import androidx.compose.ui.platform.AbstractC1835;
import kotlin.C5175;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p177.AbstractC7742;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0787 f2257 = new C0787();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1583(final Icon icon, InterfaceC1373 interfaceC1373, final int i) {
        C1389 c1389M2365;
        InterfaceC6553 interfaceC6553;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(2116504409);
        int i2 = (c1324.m2368(icon) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) c1324.m2373(AbstractC1835.f5335);
            boolean zM2350 = c1324.m2350(icon) | c1324.m2350(context);
            Object objM2335 = c1324.m2335();
            if (zM2350 || objM2335 == C1369.f3973) {
                objM2335 = icon.loadDrawable(context);
                c1324.m2376(objM2335);
            }
            Drawable drawable = (Drawable) objM2335;
            if (drawable == null) {
                c1389M2365 = c1324.m2365();
                if (c1389M2365 != null) {
                    interfaceC6553 = new InterfaceC6553(this, icon, i, i3) { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子世楪哲苏兰

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                        public final /* synthetic */ C0787 f2258;

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                        public final /* synthetic */ Icon f2259;

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                        public final /* synthetic */ int f2260;

                        {
                            this.f2260 = i3;
                            this.f2258 = this;
                        }

                        @Override // p052.InterfaceC6553
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.f2260;
                            C5175 c5175 = C5175.f14739;
                            Icon icon2 = this.f2259;
                            C0787 c0787 = this.f2258;
                            InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    c0787.m1583(icon2, interfaceC13732, AbstractC1367.m2460(49));
                                    break;
                                default:
                                    c0787.m1583(icon2, interfaceC13732, AbstractC1367.m2460(49));
                                    break;
                            }
                            return c5175;
                        }
                    };
                    c1389M2365.f4033 = interfaceC6553;
                }
                return;
            }
            m1584(drawable, c1324, 48);
        } else {
            c1324.m2329();
        }
        c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            interfaceC6553 = new InterfaceC6553(this, icon, i, i4) { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子世楪哲苏兰

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C0787 f2258;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ Icon f2259;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                public final /* synthetic */ int f2260;

                {
                    this.f2260 = i4;
                    this.f2258 = this;
                }

                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.f2260;
                    C5175 c5175 = C5175.f14739;
                    Icon icon2 = this.f2259;
                    C0787 c0787 = this.f2258;
                    InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            c0787.m1583(icon2, interfaceC13732, AbstractC1367.m2460(49));
                            break;
                        default:
                            c0787.m1583(icon2, interfaceC13732, AbstractC1367.m2460(49));
                            break;
                    }
                    return c5175;
                }
            };
            c1389M2365.f4033 = interfaceC6553;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1584(Drawable drawable, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(257732500);
        int i2 = (c1324.m2368(drawable) ? 4 : 2) | i;
        if (c1324.m2333(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC2129 interfaceC2129M1369 = AbstractC0619.m1369(C2125.f6275, AbstractC7742.f21007);
            boolean zM2368 = c1324.m2368(drawable);
            Object objM2335 = c1324.m2335();
            if (zM2368 || objM2335 == C1369.f3973) {
                objM2335 = new C0803(drawable, 2);
                c1324.m2376(objM2335);
            }
            AbstractC0643.m1444(AbstractC1445.m2575(interfaceC2129M1369, (InterfaceC6557) objM2335), c1324, 0);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0806(this, drawable, i);
        }
    }
}
