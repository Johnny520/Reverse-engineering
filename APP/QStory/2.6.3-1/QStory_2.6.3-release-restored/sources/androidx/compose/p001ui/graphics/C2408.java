package androidx.compose.p001ui.graphics;

import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.jar.asm.Opcodes;
import p191.AbstractC8568;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2408 implements InterfaceC2415 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f4978;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public InterfaceC2404 f4979;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public long f4980;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public float f4981;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f4982;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f4983;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AbstractC2416 f4984;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f4985;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C2441 f4986;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public LayoutDirection f4987;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC8725 f4988;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public long f4989;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f4990;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public long f4992;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public long f4993;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f4994;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f4995;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f4998;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f4996 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4997 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public float f4991 = 1.0f;

    public C2408() {
        long j = AbstractC2414.f5003;
        this.f4992 = j;
        this.f4993 = j;
        this.f4981 = 8.0f;
        this.f4980 = C2450.f5072;
        this.f4979 = AbstractC2416.f5007;
        this.f4989 = 9205357640488583168L;
        this.f4988 = AbstractC8568.m13630();
        this.f4987 = LayoutDirection.Ltr;
        this.f4985 = 3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3412(boolean z) {
        if (this.f4978 != z) {
            this.f4998 |= 16384;
            this.f4978 = z;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3413(float f) {
        if (this.f4981 == f) {
            return;
        }
        this.f4998 |= 2048;
        this.f4981 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3414(long j) {
        if (C2434.m3509(this.f4992, j)) {
            return;
        }
        this.f4998 |= 64;
        this.f4992 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3415(float f) {
        if (this.f4991 == f) {
            return;
        }
        this.f4998 |= 4;
        this.f4991 = f;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f4988.mo1816();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3416() {
        m3425(1.0f);
        m3426(1.0f);
        m3415(1.0f);
        m3417(0.0f);
        m3418(0.0f);
        m3419(0.0f);
        long j = AbstractC2414.f5003;
        m3414(j);
        m3420(j);
        m3423(0.0f);
        m3427(0.0f);
        m3413(8.0f);
        m3421(C2450.f5072);
        m3422(AbstractC2416.f5007);
        m3412(false);
        m3424(null);
        if (this.f4985 != 3) {
            this.f4998 |= Opcodes.ASM8;
            this.f4985 = 3;
        }
        this.f4989 = 9205357640488583168L;
        this.f4984 = null;
        this.f4998 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m3417(float f) {
        if (this.f4990 == f) {
            return;
        }
        this.f4998 |= 8;
        this.f4990 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m3418(float f) {
        if (this.f4994 == f) {
            return;
        }
        this.f4998 |= 16;
        this.f4994 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m3419(float f) {
        if (this.f4995 == f) {
            return;
        }
        this.f4998 |= 32;
        this.f4995 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m3420(long j) {
        if (C2434.m3509(this.f4993, j)) {
            return;
        }
        this.f4998 |= 128;
        this.f4993 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m3421(long j) {
        if (C2450.m3545(this.f4980, j)) {
            return;
        }
        this.f4998 |= 4096;
        this.f4980 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m3422(InterfaceC2404 interfaceC2404) {
        if (AbstractC5227.m9466(this.f4979, interfaceC2404)) {
            return;
        }
        this.f4998 |= 8192;
        this.f4979 = interfaceC2404;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m3423(float f) {
        if (this.f4983 == f) {
            return;
        }
        this.f4998 |= 256;
        this.f4983 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3424(C2441 c2441) {
        if (AbstractC5227.m9466(this.f4986, c2441)) {
            return;
        }
        this.f4998 |= 131072;
        this.f4986 = c2441;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m3425(float f) {
        if (this.f4996 == f) {
            return;
        }
        this.f4998 |= 1;
        this.f4996 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m3426(float f) {
        if (this.f4997 == f) {
            return;
        }
        this.f4998 |= 2;
        this.f4997 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m3427(float f) {
        if (this.f4982 == f) {
            return;
        }
        this.f4998 |= 512;
        this.f4982 = f;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f4988.mo1817();
    }
}
