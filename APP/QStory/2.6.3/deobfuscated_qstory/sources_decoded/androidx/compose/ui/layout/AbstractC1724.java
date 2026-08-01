package androidx.compose.ui.layout;

import androidx.window.area.AbstractC2567;
import p052.InterfaceC6558;
import p205.C7898;
import p205.C7906;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1724 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f4997;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f4999;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f4998 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f4996 = AbstractC1725.f5000;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f4995 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m3137() {
        this.f4999 = AbstractC2567.m5090((int) (this.f4998 >> 32), C7898.m13341(this.f4996), C7898.m13337(this.f4996));
        int iM5090 = AbstractC2567.m5090((int) (this.f4998 & 4294967295L), C7898.m13340(this.f4996), C7898.m13338(this.f4996));
        this.f4997 = iM5090;
        int i = this.f4999;
        long j = this.f4998;
        this.f4995 = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM5090 - ((int) (j & 4294967295L))) / 2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public int mo3138() {
        return (int) (this.f4998 & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int mo3139() {
        return (int) (this.f4998 >> 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public Object mo3056() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m3140(long j) {
        if (C7898.m13335(this.f4996, j)) {
            return;
        }
        this.f4996 = j;
        m3137();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m3141(long j) {
        if (C7906.m13357(this.f4998, j)) {
            return;
        }
        this.f4998 = j;
        m3137();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public abstract void mo3128(long j, float f, InterfaceC6558 interfaceC6558);
}
