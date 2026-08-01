package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.node.InterfaceC2572;
import androidx.compose.p001ui.unit.LayoutDirection;
import p068.InterfaceC7387;
import p221.C8737;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2543 implements InterfaceC8725 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f5325;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3689(AbstractC2543 abstractC2543, AbstractC2559 abstractC2559) {
        abstractC2543.getClass();
        if (abstractC2559 instanceof InterfaceC2572) {
            ((InterfaceC2572) abstractC2559).mo3724(abstractC2543.f5325);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m3690(AbstractC2543 abstractC2543, AbstractC2559 abstractC2559, int i, int i2, InterfaceC7387 interfaceC7387, int i3) {
        if ((i3 & 8) != 0) {
            interfaceC7387 = AbstractC2560.f5346;
        }
        abstractC2543.getClass();
        m3689(abstractC2543, abstractC2559);
        abstractC2559.mo3688(C8737.m13921((((long) i2) & 4294967295L) | (((long) i) << 32), abstractC2559.f5340), 0.0f, interfaceC7387);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m3692(AbstractC2543 abstractC2543, AbstractC2559 abstractC2559, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (abstractC2543.mo3651() == LayoutDirection.Ltr || abstractC2543.mo3650() == 0) {
            m3689(abstractC2543, abstractC2559);
            abstractC2559.mo3688(C8737.m13921(j, abstractC2559.f5340), 0.0f, null);
        } else {
            int iMo3650 = (abstractC2543.mo3650() - abstractC2559.f5344) - ((int) (j >> 32));
            m3689(abstractC2543, abstractC2559);
            abstractC2559.mo3688(C8737.m13921((((long) iMo3650) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), abstractC2559.f5340), 0.0f, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m3693(AbstractC2543 abstractC2543, AbstractC2559 abstractC2559, int i, int i2) {
        InterfaceC7387 interfaceC7387 = AbstractC2560.f5346;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (abstractC2543.mo3651() == LayoutDirection.Ltr || abstractC2543.mo3650() == 0) {
            m3689(abstractC2543, abstractC2559);
            abstractC2559.mo3688(C8737.m13921(j, abstractC2559.f5340), 0.0f, interfaceC7387);
        } else {
            int iMo3650 = (abstractC2543.mo3650() - abstractC2559.f5344) - ((int) (j >> 32));
            m3689(abstractC2543, abstractC2559);
            abstractC2559.mo3688(C8737.m13921((((long) iMo3650) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), abstractC2559.f5340), 0.0f, interfaceC7387);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m3694(AbstractC2543 abstractC2543, AbstractC2559 abstractC2559, long j) {
        abstractC2543.getClass();
        m3689(abstractC2543, abstractC2559);
        abstractC2559.mo3688(C8737.m13921(j, abstractC2559.f5340), 0.0f, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract int mo3650();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract LayoutDirection mo3651();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract InterfaceC2530 mo3652();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public float mo3653(AbstractC2555 abstractC2555) {
        return Float.NaN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3695(AbstractC2559 abstractC2559, int i, int i2, float f) {
        m3689(this, abstractC2559);
        abstractC2559.mo3688(C8737.m13921((((long) i2) & 4294967295L) | (((long) i) << 32), abstractC2559.f5340), f, null);
    }
}
