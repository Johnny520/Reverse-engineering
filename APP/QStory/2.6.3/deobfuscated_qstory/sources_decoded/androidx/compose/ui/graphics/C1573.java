package androidx.compose.ui.graphics;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.jar.asm.Opcodes;
import p175.AbstractC7739;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1573 implements InterfaceC1580 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f4633;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public InterfaceC1569 f4634;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public long f4635;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public float f4636;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f4637;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f4638;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AbstractC1581 f4639;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f4640;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C1606 f4641;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public LayoutDirection f4642;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC7896 f4643;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public long f4644;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f4645;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public long f4647;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public long f4648;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f4649;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f4650;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f4653;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f4651 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4652 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public float f4646 = 1.0f;

    public C1573() {
        long j = AbstractC1579.f4658;
        this.f4647 = j;
        this.f4648 = j;
        this.f4636 = 8.0f;
        this.f4635 = C1615.f4727;
        this.f4634 = AbstractC1581.f4662;
        this.f4644 = 9205357640488583168L;
        this.f4643 = AbstractC7739.m13071();
        this.f4642 = LayoutDirection.Ltr;
        this.f4640 = 3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m2852(boolean z) {
        if (this.f4633 != z) {
            this.f4653 |= 16384;
            this.f4633 = z;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2853(float f) {
        if (this.f4636 == f) {
            return;
        }
        this.f4653 |= 2048;
        this.f4636 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2854(long j) {
        if (C1599.m2949(this.f4647, j)) {
            return;
        }
        this.f4653 |= 64;
        this.f4647 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2855(float f) {
        if (this.f4646 == f) {
            return;
        }
        this.f4653 |= 4;
        this.f4646 = f;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        return this.f4643.mo1256();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2856() {
        m2865(1.0f);
        m2866(1.0f);
        m2855(1.0f);
        m2857(0.0f);
        m2858(0.0f);
        m2859(0.0f);
        long j = AbstractC1579.f4658;
        m2854(j);
        m2860(j);
        m2863(0.0f);
        m2867(0.0f);
        m2853(8.0f);
        m2861(C1615.f4727);
        m2862(AbstractC1581.f4662);
        m2852(false);
        m2864(null);
        if (this.f4640 != 3) {
            this.f4653 |= Opcodes.ASM8;
            this.f4640 = 3;
        }
        this.f4644 = 9205357640488583168L;
        this.f4639 = null;
        this.f4653 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m2857(float f) {
        if (this.f4645 == f) {
            return;
        }
        this.f4653 |= 8;
        this.f4645 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m2858(float f) {
        if (this.f4649 == f) {
            return;
        }
        this.f4653 |= 16;
        this.f4649 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m2859(float f) {
        if (this.f4650 == f) {
            return;
        }
        this.f4653 |= 32;
        this.f4650 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m2860(long j) {
        if (C1599.m2949(this.f4648, j)) {
            return;
        }
        this.f4653 |= 128;
        this.f4648 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m2861(long j) {
        if (C1615.m2985(this.f4635, j)) {
            return;
        }
        this.f4653 |= 4096;
        this.f4635 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m2862(InterfaceC1569 interfaceC1569) {
        if (AbstractC4395.m8907(this.f4634, interfaceC1569)) {
            return;
        }
        this.f4653 |= 8192;
        this.f4634 = interfaceC1569;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m2863(float f) {
        if (this.f4638 == f) {
            return;
        }
        this.f4653 |= 256;
        this.f4638 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m2864(C1606 c1606) {
        if (AbstractC4395.m8907(this.f4641, c1606)) {
            return;
        }
        this.f4653 |= 131072;
        this.f4641 = c1606;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m2865(float f) {
        if (this.f4651 == f) {
            return;
        }
        this.f4653 |= 1;
        this.f4651 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2866(float f) {
        if (this.f4652 == f) {
            return;
        }
        this.f4653 |= 2;
        this.f4652 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m2867(float f) {
        if (this.f4637 == f) {
            return;
        }
        this.f4653 |= 512;
        this.f4637 = f;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        return this.f4643.mo1257();
    }
}
