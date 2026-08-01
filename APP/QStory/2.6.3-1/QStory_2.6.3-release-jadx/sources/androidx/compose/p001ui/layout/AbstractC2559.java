package androidx.compose.p001ui.layout;

import androidx.window.area.AbstractC3400;
import p068.InterfaceC7387;
import p221.C8727;
import p221.C8735;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2559 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f5342;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f5344;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f5343 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f5341 = AbstractC2560.f5345;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f5340 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m3697() {
        this.f5344 = AbstractC3400.m5650((int) (this.f5343 >> 32), C8727.m13900(this.f5341), C8727.m13896(this.f5341));
        int iM5650 = AbstractC3400.m5650((int) (this.f5343 & 4294967295L), C8727.m13899(this.f5341), C8727.m13897(this.f5341));
        this.f5342 = iM5650;
        int i = this.f5344;
        long j = this.f5343;
        this.f5340 = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM5650 - ((int) (j & 4294967295L))) / 2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public int mo3698() {
        return (int) (this.f5343 & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int mo3699() {
        return (int) (this.f5343 >> 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public Object mo3616() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m3700(long j) {
        if (C8727.m13894(this.f5341, j)) {
            return;
        }
        this.f5341 = j;
        m3697();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m3701(long j) {
        if (C8735.m13916(this.f5343, j)) {
            return;
        }
        this.f5343 = j;
        m3697();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public abstract void mo3688(long j, float f, InterfaceC7387 interfaceC7387);
}
