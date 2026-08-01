package p142;

import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.C2145;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.composer.gapbuffer.C2069;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.types.AbstractC5754;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8269 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f20485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f20488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8270 f20489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2159 f20490;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f20492;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f20494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2145 f20487 = new C2145();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f20486 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f20491 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f20495 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f20496 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f20493 = -1;

    public C8269(C2159 c2159, C8270 c8270) {
        this.f20490 = c2159;
        this.f20489 = c8270;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13213(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                AbstractC2209.m3067("Invalid remove index " + i);
            }
            if (this.f20495 == i) {
                this.f20494 += i2;
                return;
            }
            m13215();
            this.f20495 = i;
            this.f20494 = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13214(boolean z) {
        C2069 c2069 = this.f20490.f4199;
        int i = z ? c2069.f3907 : c2069.f3904;
        int i2 = i - this.f20485;
        if (i2 < 0) {
            AbstractC2209.m3067("Tried to seek backward");
        }
        if (i2 > 0) {
            C8252 c8252 = this.f20489.f20497;
            c8252.m13211(C8267.f20482);
            c8252.f20467[c8252.f20464 - c8252.f20468[c8252.f20466 - 1].f18749] = i2;
            this.f20485 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13215() {
        int i = this.f20494;
        if (i > 0) {
            int i2 = this.f20495;
            if (i2 >= 0) {
                m13216();
                C8252 c8252 = this.f20489.f20497;
                c8252.m13211(C8257.f20473);
                int i3 = c8252.f20464 - c8252.f20468[c8252.f20466 - 1].f18749;
                int[] iArr = c8252.f20467;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.f20495 = -1;
            } else {
                int i4 = this.f20493;
                int i5 = this.f20496;
                m13216();
                C8252 c82522 = this.f20489.f20497;
                c82522.m13211(C8276.f20503);
                int i6 = c82522.f20464 - c82522.f20468[c82522.f20466 - 1].f18749;
                int[] iArr2 = c82522.f20467;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.f20496 = -1;
                this.f20493 = -1;
            }
            this.f20494 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13216() {
        int i = this.f20492;
        if (i > 0) {
            C8252 c8252 = this.f20489.f20497;
            c8252.m13211(C8261.f20476);
            c8252.f20467[c8252.f20464 - c8252.f20468[c8252.f20466 - 1].f18749] = i;
            this.f20492 = 0;
        }
        ArrayList arrayList = this.f20491;
        if (arrayList.isEmpty()) {
            return;
        }
        C8270 c8270 = this.f20489;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        c8270.getClass();
        if (size != 0) {
            C8252 c82522 = c8270.f20497;
            c82522.m13211(C8285.f20516);
            AbstractC5754.m10425(c82522, 0, objArr);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13217() {
        m13215();
        ArrayList arrayList = this.f20491;
        if (arrayList.isEmpty()) {
            this.f20492++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
