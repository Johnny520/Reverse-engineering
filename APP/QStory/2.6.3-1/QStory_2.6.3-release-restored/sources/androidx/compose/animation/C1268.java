package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1200;
import androidx.compose.animation.core.C1201;
import androidx.compose.animation.core.InterfaceC1157;
import androidx.compose.animation.core.InterfaceC1199;
import androidx.compose.p001ui.InterfaceC2951;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;
import p221.C8735;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1268 extends AbstractC1227 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1200 f1722;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public long f1723;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C1265 f1724;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC2230 f1725;

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public final void mo1679() {
        this.f1723 = -9223372034707292160L;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        final long j2;
        final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        if (interfaceC2488.mo2057()) {
            j2 = (((long) abstractC2559Mo3615.f5344) << 32) | (((long) abstractC2559Mo3615.f5342) & 4294967295L);
        } else {
            C1200 c1200 = this.f1722;
            int i = abstractC2559Mo3615.f5344;
            if (c1200 == null) {
                j2 = (((long) i) << 32) | (((long) abstractC2559Mo3615.f5342) & 4294967295L);
                this.f1723 = j2;
            } else {
                final long j3 = (((long) abstractC2559Mo3615.f5342) & 4294967295L) | (((long) i) << 32);
                C1201 c1201M1619 = c1200.m1619(new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p068.InterfaceC7387
                    public final InterfaceC1157 invoke(InterfaceC1199 interfaceC1199) {
                        long j4;
                        InterfaceC1157 interfaceC1157;
                        boolean zM9466 = AbstractC5227.m9466(interfaceC1199.mo1617(), this.this$0.f1724.mo1617());
                        C1268 c1268 = this.this$0;
                        if (zM9466) {
                            j4 = j3;
                            if (!C8735.m13916(c1268.f1723, -9223372034707292160L)) {
                                j4 = c1268.f1723;
                            }
                        } else {
                            InterfaceC2168 interfaceC2168 = (InterfaceC2168) c1268.f1724.f1713.m1317(interfaceC1199.mo1617());
                            j4 = interfaceC2168 != null ? ((C8735) interfaceC2168.getValue()).f22224 : 0L;
                        }
                        InterfaceC2168 interfaceC21682 = (InterfaceC2168) this.this$0.f1724.f1713.m1317(interfaceC1199.mo1616());
                        long j5 = interfaceC21682 != null ? ((C8735) interfaceC21682.getValue()).f22224 : 0L;
                        C1284 c1284 = (C1284) this.this$0.f1725.getValue();
                        return (c1284 == null || (interfaceC1157 = (InterfaceC1157) c1284.f1744.invoke(new C8735(j4), new C8735(j5))) == null) ? AbstractC1176.m1574(0.0f, 400.0f, null, 5) : interfaceC1157;
                    }
                }, new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p068.InterfaceC7387
                    public /* synthetic */ Object invoke(Object obj) {
                        return new C8735(m1452invokeYEO4UFw(obj));
                    }

                    /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
                    public final long m1452invokeYEO4UFw(Object obj) {
                        boolean zM9466 = AbstractC5227.m9466(obj, this.this$0.f1724.mo1617());
                        C1268 c1268 = this.this$0;
                        if (zM9466) {
                            return C8735.m13916(c1268.f1723, -9223372034707292160L) ? j3 : c1268.f1723;
                        }
                        InterfaceC2168 interfaceC2168 = (InterfaceC2168) c1268.f1724.f1713.m1317(obj);
                        if (interfaceC2168 != null) {
                            return ((C8735) interfaceC2168.getValue()).f22224;
                        }
                        return 0L;
                    }
                });
                this.f1724.f1712 = c1201M1619;
                j2 = ((C8735) c1201M1619.getValue()).f22224;
                this.f1723 = ((C8735) c1201M1619.getValue()).f22224;
            }
        }
        return interfaceC2488.mo2055((int) (j2 >> 32), (int) (4294967295L & j2), AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC2543 abstractC2543) {
                InterfaceC2951 interfaceC2951 = this.this$0.f1724.f1715;
                AbstractC2559 abstractC2559 = abstractC2559Mo3615;
                AbstractC2543.m3694(abstractC2543, abstractC2559Mo3615, interfaceC2951.mo4419((((long) abstractC2559.f5344) << 32) | (((long) abstractC2559.f5342) & 4294967295L), j2, LayoutDirection.Ltr));
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2543) obj);
                return C6008.f15084;
            }
        });
    }
}
