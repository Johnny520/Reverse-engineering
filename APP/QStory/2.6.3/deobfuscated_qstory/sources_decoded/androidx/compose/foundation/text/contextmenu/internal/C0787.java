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
import kotlin.C5176;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p177.AbstractC7743;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0787 f2258 = new C0787();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1593(final Icon icon, InterfaceC1373 interfaceC1373, final int i) {
        C1389 c1389M2375;
        InterfaceC6554 interfaceC6554;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(2116504409);
        int i2 = (c1324.m2378(icon) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) c1324.m2383(AbstractC1835.f5336);
            boolean zM2360 = c1324.m2360(icon) | c1324.m2360(context);
            Object objM2345 = c1324.m2345();
            if (zM2360 || objM2345 == C1369.f3974) {
                objM2345 = icon.loadDrawable(context);
                c1324.m2386(objM2345);
            }
            Drawable drawable = (Drawable) objM2345;
            if (drawable == null) {
                c1389M2375 = c1324.m2375();
                if (c1389M2375 != null) {
                    interfaceC6554 = new InterfaceC6554(this, icon, i, i3) { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子世楪哲苏兰

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                        public final /* synthetic */ C0787 f2259;

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                        public final /* synthetic */ Icon f2260;

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                        public final /* synthetic */ int f2261;

                        {
                            this.f2261 = i3;
                            this.f2259 = this;
                        }

                        @Override // p052.InterfaceC6554
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.f2261;
                            C5176 c5176 = C5176.f14739;
                            Icon icon2 = this.f2260;
                            C0787 c0787 = this.f2259;
                            InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    c0787.m1593(icon2, interfaceC13732, AbstractC1367.m2471(49));
                                    break;
                                default:
                                    c0787.m1593(icon2, interfaceC13732, AbstractC1367.m2471(49));
                                    break;
                            }
                            return c5176;
                        }
                    };
                    c1389M2375.f4034 = interfaceC6554;
                }
                return;
            }
            m1594(drawable, c1324, 48);
        } else {
            c1324.m2339();
        }
        c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            interfaceC6554 = new InterfaceC6554(this, icon, i, i4) { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子世楪哲苏兰

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C0787 f2259;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ Icon f2260;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                public final /* synthetic */ int f2261;

                {
                    this.f2261 = i4;
                    this.f2259 = this;
                }

                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.f2261;
                    C5176 c5176 = C5176.f14739;
                    Icon icon2 = this.f2260;
                    C0787 c0787 = this.f2259;
                    InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            c0787.m1593(icon2, interfaceC13732, AbstractC1367.m2471(49));
                            break;
                        default:
                            c0787.m1593(icon2, interfaceC13732, AbstractC1367.m2471(49));
                            break;
                    }
                    return c5176;
                }
            };
            c1389M2375.f4034 = interfaceC6554;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1594(Drawable drawable, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(257732500);
        int i2 = (c1324.m2378(drawable) ? 4 : 2) | i;
        if (c1324.m2343(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC2129 interfaceC2129M1379 = AbstractC0619.m1379(C2125.f6276, AbstractC7743.f21004);
            boolean zM2378 = c1324.m2378(drawable);
            Object objM2345 = c1324.m2345();
            if (zM2378 || objM2345 == C1369.f3974) {
                objM2345 = new C0803(drawable, 2);
                c1324.m2386(objM2345);
            }
            AbstractC0643.m1454(AbstractC1445.m2585(interfaceC2129M1379, (InterfaceC6558) objM2345), c1324, 0);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0806(this, drawable, i);
        }
    }
}
