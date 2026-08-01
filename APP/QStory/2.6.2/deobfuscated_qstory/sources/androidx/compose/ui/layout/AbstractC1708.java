package androidx.compose.ui.layout;

import androidx.compose.ui.node.InterfaceC1737;
import androidx.compose.ui.unit.LayoutDirection;
import p052.InterfaceC6557;
import p205.C7907;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1708 implements InterfaceC7895 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f4979;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3119(AbstractC1708 abstractC1708, AbstractC1724 abstractC1724) {
        abstractC1708.getClass();
        if (abstractC1724 instanceof InterfaceC1737) {
            ((InterfaceC1737) abstractC1724).mo3154(abstractC1708.f4979);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m3120(AbstractC1708 abstractC1708, AbstractC1724 abstractC1724, int i, int i2, InterfaceC6557 interfaceC6557, int i3) {
        if ((i3 & 8) != 0) {
            interfaceC6557 = AbstractC1725.f5000;
        }
        abstractC1708.getClass();
        m3119(abstractC1708, abstractC1724);
        abstractC1724.mo3118(C7907.m13334((((long) i2) & 4294967295L) | (((long) i) << 32), abstractC1724.f4994), 0.0f, interfaceC6557);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m3122(AbstractC1708 abstractC1708, AbstractC1724 abstractC1724, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (abstractC1708.mo3081() == LayoutDirection.Ltr || abstractC1708.mo3080() == 0) {
            m3119(abstractC1708, abstractC1724);
            abstractC1724.mo3118(C7907.m13334(j, abstractC1724.f4994), 0.0f, null);
        } else {
            int iMo3080 = (abstractC1708.mo3080() - abstractC1724.f4998) - ((int) (j >> 32));
            m3119(abstractC1708, abstractC1724);
            abstractC1724.mo3118(C7907.m13334((((long) iMo3080) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), abstractC1724.f4994), 0.0f, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m3123(AbstractC1708 abstractC1708, AbstractC1724 abstractC1724, int i, int i2) {
        InterfaceC6557 interfaceC6557 = AbstractC1725.f5000;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (abstractC1708.mo3081() == LayoutDirection.Ltr || abstractC1708.mo3080() == 0) {
            m3119(abstractC1708, abstractC1724);
            abstractC1724.mo3118(C7907.m13334(j, abstractC1724.f4994), 0.0f, interfaceC6557);
        } else {
            int iMo3080 = (abstractC1708.mo3080() - abstractC1724.f4998) - ((int) (j >> 32));
            m3119(abstractC1708, abstractC1724);
            abstractC1724.mo3118(C7907.m13334((((long) iMo3080) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), abstractC1724.f4994), 0.0f, interfaceC6557);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m3124(AbstractC1708 abstractC1708, AbstractC1724 abstractC1724, long j) {
        abstractC1708.getClass();
        m3119(abstractC1708, abstractC1724);
        abstractC1724.mo3118(C7907.m13334(j, abstractC1724.f4994), 0.0f, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract int mo3080();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract LayoutDirection mo3081();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract InterfaceC1695 mo3082();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public float mo3083(AbstractC1720 abstractC1720) {
        return Float.NaN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3125(AbstractC1724 abstractC1724, int i, int i2, float f) {
        m3119(this, abstractC1724);
        abstractC1724.mo3118(C7907.m13334((((long) i2) & 4294967295L) | (((long) i) << 32), abstractC1724.f4994), f, null);
    }
}
