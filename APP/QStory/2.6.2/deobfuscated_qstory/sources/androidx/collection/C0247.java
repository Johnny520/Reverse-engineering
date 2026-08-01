package androidx.collection;

import java.util.Arrays;
import kotlin.collections.AbstractC4346;
import p144.C7546;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0247 extends AbstractC0278 {
    public C0247(int i) {
        this.f986 = i == 0 ? AbstractC0274.f979 : new int[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m791(int i, int i2) {
        if (i < 0 || i >= this.f985) {
            C7546.m12743("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f986;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m792(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f985)) {
            C7546.m12743("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f986;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            AbstractC4346.m8842(i, i + 1, i2, iArr, iArr);
        }
        this.f985--;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m793(int i) {
        int[] iArr = this.f986;
        if (iArr.length < i) {
            this.f986 = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m794(int i) {
        m793(this.f985 + 1);
        int[] iArr = this.f986;
        int i2 = this.f985;
        iArr[i2] = i;
        this.f985 = i2 + 1;
    }

    public /* synthetic */ C0247() {
        this(16);
    }
}
