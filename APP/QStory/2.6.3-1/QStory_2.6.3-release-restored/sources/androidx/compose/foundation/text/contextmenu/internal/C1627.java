package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.AbstractC2280;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p193.AbstractC8572;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1627 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1627 f2603 = new C1627();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2153(final Icon icon, InterfaceC2208 interfaceC2208, final int i) {
        C2224 c2224M2935;
        InterfaceC7383 interfaceC7383;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(2116504409);
        int i2 = (c2159.m2938(icon) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) c2159.m2943(AbstractC2670.f5681);
            boolean zM2920 = c2159.m2920(icon) | c2159.m2920(context);
            Object objM2905 = c2159.m2905();
            if (zM2920 || objM2905 == C2204.f4319) {
                objM2905 = icon.loadDrawable(context);
                c2159.m2946(objM2905);
            }
            Drawable drawable = (Drawable) objM2905;
            if (drawable == null) {
                c2224M2935 = c2159.m2935();
                if (c2224M2935 != null) {
                    interfaceC7383 = new InterfaceC7383(this, icon, i, i3) { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子世楪哲苏兰

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                        public final /* synthetic */ C1627 f2604;

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                        public final /* synthetic */ Icon f2605;

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                        public final /* synthetic */ int f2606;

                        {
                            this.f2606 = i3;
                            this.f2604 = this;
                        }

                        @Override // p068.InterfaceC7383
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.f2606;
                            C6008 c6008 = C6008.f15084;
                            Icon icon2 = this.f2605;
                            C1627 c1627 = this.f2604;
                            InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    c1627.m2153(icon2, interfaceC22082, AbstractC2202.m3031(49));
                                    break;
                                default:
                                    c1627.m2153(icon2, interfaceC22082, AbstractC2202.m3031(49));
                                    break;
                            }
                            return c6008;
                        }
                    };
                    c2224M2935.f4379 = interfaceC7383;
                }
                return;
            }
            m2154(drawable, c2159, 48);
        } else {
            c2159.m2899();
        }
        c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            interfaceC7383 = new InterfaceC7383(this, icon, i, i4) { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子世楪哲苏兰

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C1627 f2604;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ Icon f2605;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                public final /* synthetic */ int f2606;

                {
                    this.f2606 = i4;
                    this.f2604 = this;
                }

                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.f2606;
                    C6008 c6008 = C6008.f15084;
                    Icon icon2 = this.f2605;
                    C1627 c1627 = this.f2604;
                    InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            c1627.m2153(icon2, interfaceC22082, AbstractC2202.m3031(49));
                            break;
                        default:
                            c1627.m2153(icon2, interfaceC22082, AbstractC2202.m3031(49));
                            break;
                    }
                    return c6008;
                }
            };
            c2224M2935.f4379 = interfaceC7383;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2154(Drawable drawable, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(257732500);
        int i2 = (c2159.m2938(drawable) ? 4 : 2) | i;
        if (c2159.m2903(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC2962 interfaceC2962M1939 = AbstractC1460.m1939(C2958.f6621, AbstractC8572.f21349);
            boolean zM2938 = c2159.m2938(drawable);
            Object objM2905 = c2159.m2905();
            if (zM2938 || objM2905 == C2204.f4319) {
                objM2905 = new C1643(drawable, 2);
                c2159.m2946(objM2905);
            }
            AbstractC1484.m2014(AbstractC2280.m3145(interfaceC2962M1939, (InterfaceC7387) objM2905), c2159, 0);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1646(this, drawable, i);
        }
    }
}
