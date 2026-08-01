package top.yukonga.miuix.kmp.basic;

import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p221.C8727;
import p223.AbstractC8743;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6868 implements InterfaceC2493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6865 f16852;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ float f16853;

    public C6868(float f, C6865 c6865) {
        this.f16853 = f;
        this.f16852 = c6865;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, final long j) {
        C6864 c6864;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC2490 interfaceC2490 = (InterfaceC2490) list.get(i);
            if (AbstractC5227.m9466(AbstractC2505.m3674(interfaceC2490), "navigationIcon")) {
                final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(C8727.m13895(0, 0, 0, 0, 10, j));
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    InterfaceC2490 interfaceC24902 = (InterfaceC2490) list.get(i2);
                    if (AbstractC5227.m9466(AbstractC2505.m3674(interfaceC24902), "actionIcons")) {
                        final AbstractC2559 abstractC2559Mo36152 = interfaceC24902.mo3615(C8727.m13895(0, 0, 0, 0, 10, j));
                        int iM13896 = (C8727.m13896(j) - abstractC2559Mo3615.f5344) - abstractC2559Mo36152.f5344;
                        int size3 = list.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            InterfaceC2490 interfaceC24903 = (InterfaceC2490) list.get(i3);
                            if (AbstractC5227.m9466(AbstractC2505.m3674(interfaceC24903), "title")) {
                                double d = ((double) iM13896) * 0.9d;
                                if (Double.isNaN(d)) {
                                    C6755.m11869("Cannot round NaN value.");
                                    return null;
                                }
                                final AbstractC2559 abstractC2559Mo36153 = interfaceC24903.mo3615(C8727.m13895(0, d > 2.147483647E9d ? Integer.MAX_VALUE : d < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(d), 0, 0, 8, j));
                                int size4 = list.size();
                                for (int i4 = 0; i4 < size4; i4++) {
                                    InterfaceC2490 interfaceC24904 = (InterfaceC2490) list.get(i4);
                                    if (AbstractC5227.m9466(AbstractC2505.m3674(interfaceC24904), "largeTitle")) {
                                        final AbstractC2559 abstractC2559Mo36154 = interfaceC24904.mo3615(C8727.m13895(0, 0, 0, Integer.MAX_VALUE, 2, j));
                                        final int iMo1903 = interfaceC2488.mo1903(56.0f);
                                        int iMax = Math.max(iMo1903, abstractC2559Mo36154.f5342);
                                        float f = this.f16853;
                                        float fM5631 = 1.0f;
                                        if (f > 0.0f) {
                                            C6856 c6856 = this.f16852.f16830;
                                            float fM11954 = (c6856 == null || (c6864 = c6856.f16802) == null) ? 0.0f : c6864.m11954();
                                            if (!Float.isNaN(fM11954)) {
                                                fM5631 = 1.0f - AbstractC3400.m5631(Math.abs(fM11954) / f, 0.0f, 1.0f);
                                            }
                                        }
                                        return interfaceC2488.mo2055(C8727.m13896(j), AbstractC7390.m12617(((int) Math.round(((double) (iMax - iMo1903)) * ((double) fM5631))) + iMo1903), AbstractC5171.m9335(), new InterfaceC7387() { // from class: top.yukonga.miuix.kmp.basic.飘花落叶言子苏楪兰世哲
                                            @Override // p068.InterfaceC7387
                                            public final Object invoke(Object obj) {
                                                int iM138962;
                                                AbstractC2543 abstractC2543 = (AbstractC2543) obj;
                                                abstractC2543.getClass();
                                                int i5 = iMo1903 / 2;
                                                AbstractC2559 abstractC2559 = abstractC2559Mo3615;
                                                AbstractC2543.m3692(abstractC2543, abstractC2559, 0, i5 - (abstractC2559.f5342 / 2));
                                                long j2 = j;
                                                int iM138963 = C8727.m13896(j2);
                                                AbstractC2559 abstractC25592 = abstractC2559Mo36153;
                                                int i6 = abstractC25592.f5344;
                                                int i7 = (iM138963 - i6) / 2;
                                                int i8 = abstractC2559.f5344;
                                                AbstractC2559 abstractC25593 = abstractC2559Mo36152;
                                                if (i7 >= i8) {
                                                    if (i6 + i7 > C8727.m13896(j2) - abstractC25593.f5344) {
                                                        iM138962 = (C8727.m13896(j2) - abstractC25593.f5344) - (abstractC25592.f5344 + i7);
                                                    }
                                                    AbstractC2543.m3692(abstractC2543, abstractC25592, i7, i5 - (abstractC25592.f5342 / 2));
                                                    AbstractC2543.m3692(abstractC2543, abstractC25593, C8727.m13896(j2) - abstractC25593.f5344, i5 - (abstractC25593.f5342 / 2));
                                                    AbstractC2543.m3692(abstractC2543, abstractC2559Mo36154, 0, 0);
                                                    return C6008.f15084;
                                                }
                                                iM138962 = i8 - i7;
                                                i7 += iM138962;
                                                AbstractC2543.m3692(abstractC2543, abstractC25592, i7, i5 - (abstractC25592.f5342 / 2));
                                                AbstractC2543.m3692(abstractC2543, abstractC25593, C8727.m13896(j2) - abstractC25593.f5344, i5 - (abstractC25593.f5342 / 2));
                                                AbstractC2543.m3692(abstractC2543, abstractC2559Mo36154, 0, 0);
                                                return C6008.f15084;
                                            }
                                        });
                                    }
                                }
                                AbstractC8743.m13969("Collection contains no element matching the predicate.");
                                C5043.m9161();
                                return null;
                            }
                        }
                        AbstractC8743.m13969("Collection contains no element matching the predicate.");
                        C5043.m9161();
                        return null;
                    }
                }
                AbstractC8743.m13969("Collection contains no element matching the predicate.");
                C5043.m9161();
                return null;
            }
        }
        AbstractC8743.m13969("Collection contains no element matching the predicate.");
        C5043.m9161();
        return null;
    }
}
