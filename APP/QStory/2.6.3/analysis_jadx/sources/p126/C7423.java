package p126;

import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1251;
import java.util.Arrays;
import kotlin.collections.AbstractC4347;
import p018.AbstractC6253;
import p070.AbstractC6900;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7423 extends AbstractC6253 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f20119;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f20120;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f20121;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC6900[] f20123 = new AbstractC6900[16];

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int[] f20122 = new int[16];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object[] f20118 = new Object[16];

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m12650(InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7430 interfaceC7430) {
        if (this.f20121 != 0) {
            C0920 c0920 = new C0920(this);
            C7423 c7423 = (C7423) c0920.f2610;
            while (true) {
                AbstractC6900 abstractC6900 = c7423.f20123[c0920.f2613];
                C1230 c1230Mo12180 = abstractC6900.mo12180(c0920);
                InterfaceC1356 interfaceC13562 = interfaceC1356;
                C1235 c12352 = c1235;
                C1251 c12512 = c1251;
                InterfaceC7430 interfaceC74302 = interfaceC7430;
                try {
                    abstractC6900.mo12182(c0920, interfaceC13562, c12352, c12512, interfaceC74302);
                    int i = c0920.f2613;
                    int i2 = c7423.f20121;
                    if (i < i2) {
                        AbstractC6900 abstractC69002 = c7423.f20123[i];
                        c0920.f2612 += abstractC69002.f18404;
                        c0920.f2611 += abstractC69002.f18403;
                        int i3 = i + 1;
                        c0920.f2613 = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        interfaceC1356 = interfaceC13562;
                        c1235 = c12352;
                        c1251 = c12512;
                        interfaceC7430 = interfaceC74302;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        m12651();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m12651() {
        this.f20121 = 0;
        this.f20119 = 0;
        Arrays.fill(this.f20118, 0, this.f20120, (Object) null);
        this.f20120 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m12652(AbstractC6900 abstractC6900) {
        int i = this.f20121;
        AbstractC6900[] abstractC6900Arr = this.f20123;
        if (i == abstractC6900Arr.length) {
            AbstractC6900[] abstractC6900Arr2 = new AbstractC6900[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(abstractC6900Arr, 0, abstractC6900Arr2, 0, i);
            this.f20123 = abstractC6900Arr2;
        }
        int i2 = this.f20119;
        int i3 = abstractC6900.f18404;
        int i4 = abstractC6900.f18403;
        int i5 = i2 + i3;
        int[] iArr = this.f20122;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            AbstractC4347.m8836(0, 0, length, iArr, iArr2);
            this.f20122 = iArr2;
        }
        int i7 = this.f20120 + i4;
        Object[] objArr = this.f20118;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f20118 = objArr2;
        }
        AbstractC6900[] abstractC6900Arr3 = this.f20123;
        int i9 = this.f20121;
        this.f20121 = i9 + 1;
        abstractC6900Arr3[i9] = abstractC6900;
        this.f20119 += abstractC6900.f18404;
        this.f20120 += i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean m12653() {
        return this.f20121 == 0;
    }
}
