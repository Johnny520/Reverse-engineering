package p142;

import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.runtime.InterfaceC2191;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.C2086;
import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import p034.AbstractC7082;
import p086.AbstractC7729;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8252 extends AbstractC7082 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f20464;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f20465;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f20466;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC7729[] f20468 = new AbstractC7729[16];

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int[] f20467 = new int[16];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object[] f20463 = new Object[16];

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m13209(InterfaceC2191 interfaceC2191, C2070 c2070, C2086 c2086, InterfaceC8259 interfaceC8259) {
        if (this.f20466 != 0) {
            C1758 c1758 = new C1758(this);
            C8252 c8252 = (C8252) c1758.f2955;
            while (true) {
                AbstractC7729 abstractC7729 = c8252.f20468[c1758.f2958];
                C2065 c2065Mo12739 = abstractC7729.mo12739(c1758);
                InterfaceC2191 interfaceC21912 = interfaceC2191;
                C2070 c20702 = c2070;
                C2086 c20862 = c2086;
                InterfaceC8259 interfaceC82592 = interfaceC8259;
                try {
                    abstractC7729.mo12741(c1758, interfaceC21912, c20702, c20862, interfaceC82592);
                    int i = c1758.f2958;
                    int i2 = c8252.f20466;
                    if (i < i2) {
                        AbstractC7729 abstractC77292 = c8252.f20468[i];
                        c1758.f2957 += abstractC77292.f18749;
                        c1758.f2956 += abstractC77292.f18748;
                        int i3 = i + 1;
                        c1758.f2958 = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        interfaceC2191 = interfaceC21912;
                        c2070 = c20702;
                        c2086 = c20862;
                        interfaceC8259 = interfaceC82592;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        m13210();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m13210() {
        this.f20466 = 0;
        this.f20464 = 0;
        Arrays.fill(this.f20463, 0, this.f20465, (Object) null);
        this.f20465 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m13211(AbstractC7729 abstractC7729) {
        int i = this.f20466;
        AbstractC7729[] abstractC7729Arr = this.f20468;
        if (i == abstractC7729Arr.length) {
            AbstractC7729[] abstractC7729Arr2 = new AbstractC7729[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(abstractC7729Arr, 0, abstractC7729Arr2, 0, i);
            this.f20468 = abstractC7729Arr2;
        }
        int i2 = this.f20464;
        int i3 = abstractC7729.f18749;
        int i4 = abstractC7729.f18748;
        int i5 = i2 + i3;
        int[] iArr = this.f20467;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            AbstractC5179.m9395(0, 0, length, iArr, iArr2);
            this.f20467 = iArr2;
        }
        int i7 = this.f20465 + i4;
        Object[] objArr = this.f20463;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f20463 = objArr2;
        }
        AbstractC7729[] abstractC7729Arr3 = this.f20468;
        int i9 = this.f20466;
        this.f20466 = i9 + 1;
        abstractC7729Arr3[i9] = abstractC7729;
        this.f20464 += abstractC7729.f18749;
        this.f20465 += i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean m13212() {
        return this.f20466 == 0;
    }
}
