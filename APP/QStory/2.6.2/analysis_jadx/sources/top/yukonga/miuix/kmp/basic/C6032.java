package top.yukonga.miuix.kmp.basic;

import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import io.ktor.util.C4210;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.AbstractC4394;
import p000.AbstractC6087;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p205.C7897;
import p207.AbstractC7913;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6032 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6029 f16498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ float f16499;

    public C6032(float f, C6029 c6029) {
        this.f16499 = f;
        this.f16498 = c6029;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1105(InterfaceC1653 interfaceC1653, List list, final long j) {
        C6028 c6028;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC1655 interfaceC1655 = (InterfaceC1655) list.get(i);
            if (AbstractC4394.m8917(AbstractC1670.m3104(interfaceC1655), "navigationIcon")) {
                final AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(C7897.m13308(0, 0, 0, 0, 10, j));
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    InterfaceC1655 interfaceC16552 = (InterfaceC1655) list.get(i2);
                    if (AbstractC4394.m8917(AbstractC1670.m3104(interfaceC16552), "actionIcons")) {
                        final AbstractC1724 abstractC1724Mo30452 = interfaceC16552.mo3045(C7897.m13308(0, 0, 0, 0, 10, j));
                        int iM13309 = (C7897.m13309(j) - abstractC1724Mo3045.f4998) - abstractC1724Mo30452.f4998;
                        int size3 = list.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            InterfaceC1655 interfaceC16553 = (InterfaceC1655) list.get(i3);
                            if (AbstractC4394.m8917(AbstractC1670.m3104(interfaceC16553), "title")) {
                                double d = ((double) iM13309) * 0.9d;
                                if (Double.isNaN(d)) {
                                    C5919.m11249("Cannot round NaN value.");
                                    return null;
                                }
                                final AbstractC1724 abstractC1724Mo30453 = interfaceC16553.mo3045(C7897.m13308(0, d > 2.147483647E9d ? Integer.MAX_VALUE : d < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(d), 0, 0, 8, j));
                                int size4 = list.size();
                                for (int i4 = 0; i4 < size4; i4++) {
                                    InterfaceC1655 interfaceC16554 = (InterfaceC1655) list.get(i4);
                                    if (AbstractC4394.m8917(AbstractC1670.m3104(interfaceC16554), "largeTitle")) {
                                        final AbstractC1724 abstractC1724Mo30454 = interfaceC16554.mo3045(C7897.m13308(0, 0, 0, Integer.MAX_VALUE, 2, j));
                                        final int iMo1333 = interfaceC1653.mo1333(56.0f);
                                        int iMax = Math.max(iMo1333, abstractC1724Mo30454.f4996);
                                        float f = this.f16499;
                                        float fM11419 = 1.0f;
                                        if (f > 0.0f) {
                                            C6020 c6020 = this.f16498.f16476;
                                            float fM11335 = (c6020 == null || (c6028 = c6020.f16448) == null) ? 0.0f : c6028.m11335();
                                            if (!Float.isNaN(fM11335)) {
                                                fM11419 = 1.0f - AbstractC6087.m11419(Math.abs(fM11335) / f, 0.0f, 1.0f);
                                            }
                                        }
                                        return interfaceC1653.mo1485(C7897.m13309(j), AbstractC6560.m12006(((int) Math.round(((double) (iMax - iMo1333)) * ((double) fM11419))) + iMo1333), AbstractC4338.m8781(), new InterfaceC6557() { // from class: top.yukonga.miuix.kmp.basic.飘花落叶言子苏楪兰世哲
                                            @Override // p052.InterfaceC6557
                                            public final Object invoke(Object obj) {
                                                int iM133092;
                                                AbstractC1708 abstractC1708 = (AbstractC1708) obj;
                                                abstractC1708.getClass();
                                                int i5 = iMo1333 / 2;
                                                AbstractC1724 abstractC1724 = abstractC1724Mo3045;
                                                AbstractC1708.m3122(abstractC1708, abstractC1724, 0, i5 - (abstractC1724.f4996 / 2));
                                                long j2 = j;
                                                int iM133093 = C7897.m13309(j2);
                                                AbstractC1724 abstractC17242 = abstractC1724Mo30453;
                                                int i6 = abstractC17242.f4998;
                                                int i7 = (iM133093 - i6) / 2;
                                                int i8 = abstractC1724.f4998;
                                                AbstractC1724 abstractC17243 = abstractC1724Mo30452;
                                                if (i7 >= i8) {
                                                    if (i6 + i7 > C7897.m13309(j2) - abstractC17243.f4998) {
                                                        iM133092 = (C7897.m13309(j2) - abstractC17243.f4998) - (abstractC17242.f4998 + i7);
                                                    }
                                                    AbstractC1708.m3122(abstractC1708, abstractC17242, i7, i5 - (abstractC17242.f4996 / 2));
                                                    AbstractC1708.m3122(abstractC1708, abstractC17243, C7897.m13309(j2) - abstractC17243.f4998, i5 - (abstractC17243.f4996 / 2));
                                                    AbstractC1708.m3122(abstractC1708, abstractC1724Mo30454, 0, 0);
                                                    return C5175.f14739;
                                                }
                                                iM133092 = i8 - i7;
                                                i7 += iM133092;
                                                AbstractC1708.m3122(abstractC1708, abstractC17242, i7, i5 - (abstractC17242.f4996 / 2));
                                                AbstractC1708.m3122(abstractC1708, abstractC17243, C7897.m13309(j2) - abstractC17243.f4998, i5 - (abstractC17243.f4996 / 2));
                                                AbstractC1708.m3122(abstractC1708, abstractC1724Mo30454, 0, 0);
                                                return C5175.f14739;
                                            }
                                        });
                                    }
                                }
                                AbstractC7913.m13382("Collection contains no element matching the predicate.");
                                C4210.m8612();
                                return null;
                            }
                        }
                        AbstractC7913.m13382("Collection contains no element matching the predicate.");
                        C4210.m8612();
                        return null;
                    }
                }
                AbstractC7913.m13382("Collection contains no element matching the predicate.");
                C4210.m8612();
                return null;
            }
        }
        AbstractC7913.m13382("Collection contains no element matching the predicate.");
        C4210.m8612();
        return null;
    }
}
