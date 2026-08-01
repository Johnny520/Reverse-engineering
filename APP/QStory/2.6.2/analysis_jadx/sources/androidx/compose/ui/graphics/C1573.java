package androidx.compose.ui.graphics;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.jar.asm.Opcodes;
import p033.AbstractC6325;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1573 implements InterfaceC1580 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f4632;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public InterfaceC1569 f4633;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public long f4634;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public float f4635;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f4636;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f4637;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AbstractC1581 f4638;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f4639;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C1606 f4640;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public LayoutDirection f4641;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC7895 f4642;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public long f4643;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f4644;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public long f4646;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public long f4647;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f4648;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f4649;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f4652;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f4650 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4651 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public float f4645 = 1.0f;

    public C1573() {
        long j = AbstractC1579.f4657;
        this.f4646 = j;
        this.f4647 = j;
        this.f4635 = 8.0f;
        this.f4634 = C1615.f4726;
        this.f4633 = AbstractC1581.f4661;
        this.f4643 = 9205357640488583168L;
        this.f4642 = AbstractC6325.m11859();
        this.f4641 = LayoutDirection.Ltr;
        this.f4639 = 3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m2842(boolean z) {
        if (this.f4632 != z) {
            this.f4652 |= 16384;
            this.f4632 = z;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2843(float f) {
        if (this.f4635 == f) {
            return;
        }
        this.f4652 |= 2048;
        this.f4635 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2844(long j) {
        if (C1599.m2939(this.f4646, j)) {
            return;
        }
        this.f4652 |= 64;
        this.f4646 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2845(float f) {
        if (this.f4645 == f) {
            return;
        }
        this.f4652 |= 4;
        this.f4645 = f;
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1246() {
        return this.f4642.mo1246();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2846() {
        m2855(1.0f);
        m2856(1.0f);
        m2845(1.0f);
        m2847(0.0f);
        m2848(0.0f);
        m2849(0.0f);
        long j = AbstractC1579.f4657;
        m2844(j);
        m2850(j);
        m2853(0.0f);
        m2857(0.0f);
        m2843(8.0f);
        m2851(C1615.f4726);
        m2852(AbstractC1581.f4661);
        m2842(false);
        m2854(null);
        if (this.f4639 != 3) {
            this.f4652 |= Opcodes.ASM8;
            this.f4639 = 3;
        }
        this.f4643 = 9205357640488583168L;
        this.f4638 = null;
        this.f4652 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m2847(float f) {
        if (this.f4644 == f) {
            return;
        }
        this.f4652 |= 8;
        this.f4644 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m2848(float f) {
        if (this.f4648 == f) {
            return;
        }
        this.f4652 |= 16;
        this.f4648 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m2849(float f) {
        if (this.f4649 == f) {
            return;
        }
        this.f4652 |= 32;
        this.f4649 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m2850(long j) {
        if (C1599.m2939(this.f4647, j)) {
            return;
        }
        this.f4652 |= 128;
        this.f4647 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m2851(long j) {
        if (C1615.m2975(this.f4634, j)) {
            return;
        }
        this.f4652 |= 4096;
        this.f4634 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m2852(InterfaceC1569 interfaceC1569) {
        if (AbstractC4394.m8917(this.f4633, interfaceC1569)) {
            return;
        }
        this.f4652 |= 8192;
        this.f4633 = interfaceC1569;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m2853(float f) {
        if (this.f4637 == f) {
            return;
        }
        this.f4652 |= 256;
        this.f4637 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m2854(C1606 c1606) {
        if (AbstractC4394.m8917(this.f4640, c1606)) {
            return;
        }
        this.f4652 |= 131072;
        this.f4640 = c1606;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m2855(float f) {
        if (this.f4650 == f) {
            return;
        }
        this.f4652 |= 1;
        this.f4650 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2856(float f) {
        if (this.f4651 == f) {
            return;
        }
        this.f4652 |= 2;
        this.f4651 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m2857(float f) {
        if (this.f4636 == f) {
            return;
        }
        this.f4652 |= 512;
        this.f4636 = f;
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1247() {
        return this.f4642.mo1247();
    }
}
