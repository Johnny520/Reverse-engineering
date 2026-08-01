package androidx.compose.p001ui.node;

import androidx.activity.AbstractC0900;
import androidx.collection.AbstractC1081;
import androidx.collection.C1099;
import androidx.compose.p001ui.layout.C2498;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;
import p221.C8737;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2580 extends AbstractC2589 implements InterfaceC2490 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C1099 f5403;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC2492 f5404;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public LinkedHashMap f5406;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC2629 f5408;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public long f5407 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C2498 f5405 = new C2498(this);

    public AbstractC2580(AbstractC2629 abstractC2629) {
        this.f5408 = abstractC2629;
        C1099 c1099 = AbstractC1081.f1219;
        this.f5403 = new C1099();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public static final void m3759(AbstractC2580 abstractC2580, InterfaceC2492 interfaceC2492) {
        LinkedHashMap linkedHashMap;
        if (interfaceC2492 != null) {
            abstractC2580.m3701((((long) interfaceC2492.mo2034()) & 4294967295L) | (((long) interfaceC2492.mo2033()) << 32));
        } else {
            abstractC2580.m3701(0L);
        }
        if (!AbstractC5227.m9466(abstractC2580.f5404, interfaceC2492) && interfaceC2492 != null && ((((linkedHashMap = abstractC2580.f5406) != null && !linkedHashMap.isEmpty()) || !interfaceC2492.mo2032().isEmpty()) && !AbstractC5227.m9466(interfaceC2492.mo2032(), abstractC2580.f5406))) {
            C2582 c2582 = abstractC2580.f5408.f5604.f5477.f5510;
            c2582.getClass();
            c2582.f5428.m3884();
            LinkedHashMap linkedHashMap2 = abstractC2580.f5406;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                abstractC2580.f5406 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC2492.mo2032());
        }
        abstractC2580.f5404 = interfaceC2492;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2534
    public final LayoutDirection getLayoutDirection() {
        return this.f5408.f5604.f5445;
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2559, androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Object mo3616() {
        return this.f5408.mo3616();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final AbstractC2589 mo3760() {
        AbstractC2629 abstractC2629 = this.f5408.f5601;
        if (abstractC2629 != null) {
            return abstractC2629.mo3845();
        }
        return null;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final InterfaceC2492 mo3761() {
        InterfaceC2492 interfaceC2492 = this.f5404;
        if (interfaceC2492 != null) {
            return interfaceC2492;
        }
        throw AbstractC0900.m699("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public final long mo3762() {
        return this.f5407;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final AbstractC2589 mo3763() {
        AbstractC2629 abstractC2629 = this.f5408.f5602;
        if (abstractC2629 != null) {
            return abstractC2629.mo3845();
        }
        return null;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final C2583 mo3764() {
        return this.f5408.f5604;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final InterfaceC2530 mo3765() {
        return this.f5405;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final boolean mo3766() {
        return this.f5404 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public void mo3767() {
        mo3761().mo2031();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final long m3768() {
        return (((long) this.f5344) << 32) | (((long) this.f5342) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final long m3769(AbstractC2580 abstractC2580, boolean z) {
        long jM13921 = 0;
        while (!this.equals(abstractC2580)) {
            if (!this.f5495 || !z) {
                jM13921 = C8737.m13921(jM13921, this.f5407);
            }
            AbstractC2629 abstractC2629 = this.f5408.f5601;
            abstractC2629.getClass();
            this = abstractC2629.mo3845();
            this.getClass();
        }
        return jM13921;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final void m3770(long j) {
        if (!C8737.m13923(this.f5407, j)) {
            this.f5407 = j;
            AbstractC2629 abstractC2629 = this.f5408;
            C2582 c2582 = abstractC2629.f5604.f5477.f5510;
            if (c2582 != null) {
                c2582.m3777();
            }
            AbstractC2589.m3848(abstractC2629);
        }
        if (this.f5492) {
            return;
        }
        m3853(mo3761());
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final void mo3771() {
        mo3688(this.f5407, 0.0f, null);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f5408.mo1816();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f5408.mo1817();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589, androidx.compose.p001ui.layout.InterfaceC2534
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final boolean mo2057() {
        return true;
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2559
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo3688(long j, float f, InterfaceC7387 interfaceC7387) {
        m3770(j);
        if (this.f5493) {
            return;
        }
        mo3767();
    }
}
