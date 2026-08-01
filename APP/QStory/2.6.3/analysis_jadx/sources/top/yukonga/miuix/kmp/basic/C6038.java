package top.yukonga.miuix.kmp.basic;

import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.window.area.AbstractC2567;
import io.ktor.util.C4211;
import java.util.List;
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;
import p053.AbstractC6561;
import p205.C7898;
import p207.AbstractC7914;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6038 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6035 f16507;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ float f16508;

    public C6038(float f, C6035 c6035) {
        this.f16508 = f;
        this.f16507 = c6035;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1106(InterfaceC1653 interfaceC1653, List list, final long j) {
        C6034 c6034;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC1655 interfaceC1655 = (InterfaceC1655) list.get(i);
            if (AbstractC4395.m8907(AbstractC1670.m3114(interfaceC1655), "navigationIcon")) {
                final AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(C7898.m13336(0, 0, 0, 0, 10, j));
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    InterfaceC1655 interfaceC16552 = (InterfaceC1655) list.get(i2);
                    if (AbstractC4395.m8907(AbstractC1670.m3114(interfaceC16552), "actionIcons")) {
                        final AbstractC1724 abstractC1724Mo30552 = interfaceC16552.mo3055(C7898.m13336(0, 0, 0, 0, 10, j));
                        int iM13337 = (C7898.m13337(j) - abstractC1724Mo3055.f4999) - abstractC1724Mo30552.f4999;
                        int size3 = list.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            InterfaceC1655 interfaceC16553 = (InterfaceC1655) list.get(i3);
                            if (AbstractC4395.m8907(AbstractC1670.m3114(interfaceC16553), "title")) {
                                double d = ((double) iM13337) * 0.9d;
                                if (Double.isNaN(d)) {
                                    C5925.m11310("Cannot round NaN value.");
                                    return null;
                                }
                                final AbstractC1724 abstractC1724Mo30553 = interfaceC16553.mo3055(C7898.m13336(0, d > 2.147483647E9d ? Integer.MAX_VALUE : d < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(d), 0, 0, 8, j));
                                int size4 = list.size();
                                for (int i4 = 0; i4 < size4; i4++) {
                                    InterfaceC1655 interfaceC16554 = (InterfaceC1655) list.get(i4);
                                    if (AbstractC4395.m8907(AbstractC1670.m3114(interfaceC16554), "largeTitle")) {
                                        final AbstractC1724 abstractC1724Mo30554 = interfaceC16554.mo3055(C7898.m13336(0, 0, 0, Integer.MAX_VALUE, 2, j));
                                        final int iMo1343 = interfaceC1653.mo1343(56.0f);
                                        int iMax = Math.max(iMo1343, abstractC1724Mo30554.f4997);
                                        float f = this.f16508;
                                        float fM5071 = 1.0f;
                                        if (f > 0.0f) {
                                            C6026 c6026 = this.f16507.f16485;
                                            float fM11395 = (c6026 == null || (c6034 = c6026.f16457) == null) ? 0.0f : c6034.m11395();
                                            if (!Float.isNaN(fM11395)) {
                                                fM5071 = 1.0f - AbstractC2567.m5071(Math.abs(fM11395) / f, 0.0f, 1.0f);
                                            }
                                        }
                                        return interfaceC1653.mo1495(C7898.m13337(j), AbstractC6561.m12058(((int) Math.round(((double) (iMax - iMo1343)) * ((double) fM5071))) + iMo1343), AbstractC4339.m8776(), new InterfaceC6558() { // from class: top.yukonga.miuix.kmp.basic.飘花落叶言子苏楪兰世哲
                                            @Override // p052.InterfaceC6558
                                            public final Object invoke(Object obj) {
                                                int iM133372;
                                                AbstractC1708 abstractC1708 = (AbstractC1708) obj;
                                                abstractC1708.getClass();
                                                int i5 = iMo1343 / 2;
                                                AbstractC1724 abstractC1724 = abstractC1724Mo3055;
                                                AbstractC1708.m3132(abstractC1708, abstractC1724, 0, i5 - (abstractC1724.f4997 / 2));
                                                long j2 = j;
                                                int iM133373 = C7898.m13337(j2);
                                                AbstractC1724 abstractC17242 = abstractC1724Mo30553;
                                                int i6 = abstractC17242.f4999;
                                                int i7 = (iM133373 - i6) / 2;
                                                int i8 = abstractC1724.f4999;
                                                AbstractC1724 abstractC17243 = abstractC1724Mo30552;
                                                if (i7 >= i8) {
                                                    if (i6 + i7 > C7898.m13337(j2) - abstractC17243.f4999) {
                                                        iM133372 = (C7898.m13337(j2) - abstractC17243.f4999) - (abstractC17242.f4999 + i7);
                                                    }
                                                    AbstractC1708.m3132(abstractC1708, abstractC17242, i7, i5 - (abstractC17242.f4997 / 2));
                                                    AbstractC1708.m3132(abstractC1708, abstractC17243, C7898.m13337(j2) - abstractC17243.f4999, i5 - (abstractC17243.f4997 / 2));
                                                    AbstractC1708.m3132(abstractC1708, abstractC1724Mo30554, 0, 0);
                                                    return C5176.f14739;
                                                }
                                                iM133372 = i8 - i7;
                                                i7 += iM133372;
                                                AbstractC1708.m3132(abstractC1708, abstractC17242, i7, i5 - (abstractC17242.f4997 / 2));
                                                AbstractC1708.m3132(abstractC1708, abstractC17243, C7898.m13337(j2) - abstractC17243.f4999, i5 - (abstractC17243.f4997 / 2));
                                                AbstractC1708.m3132(abstractC1708, abstractC1724Mo30554, 0, 0);
                                                return C5176.f14739;
                                            }
                                        });
                                    }
                                }
                                AbstractC7914.m13410("Collection contains no element matching the predicate.");
                                C4211.m8602();
                                return null;
                            }
                        }
                        AbstractC7914.m13410("Collection contains no element matching the predicate.");
                        C4211.m8602();
                        return null;
                    }
                }
                AbstractC7914.m13410("Collection contains no element matching the predicate.");
                C4211.m8602();
                return null;
            }
        }
        AbstractC7914.m13410("Collection contains no element matching the predicate.");
        C4211.m8602();
        return null;
    }
}
