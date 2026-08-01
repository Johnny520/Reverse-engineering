package p126;

import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1251;
import com.bumptech.glide.AbstractC3065;
import java.util.Arrays;
import kotlin.collections.AbstractC4346;
import p070.AbstractC6899;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7422 extends AbstractC3065 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f20123;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f20126;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f20128;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public AbstractC6899[] f20124 = new AbstractC6899[16];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int[] f20127 = new int[16];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Object[] f20125 = new Object[16];

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final void m12623(AbstractC6899 abstractC6899) {
        int i = this.f20123;
        AbstractC6899[] abstractC6899Arr = this.f20124;
        if (i == abstractC6899Arr.length) {
            AbstractC6899[] abstractC6899Arr2 = new AbstractC6899[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(abstractC6899Arr, 0, abstractC6899Arr2, 0, i);
            this.f20124 = abstractC6899Arr2;
        }
        int i2 = this.f20128;
        int i3 = abstractC6899.f18409;
        int i4 = abstractC6899.f18408;
        int i5 = i2 + i3;
        int[] iArr = this.f20127;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            AbstractC4346.m8842(0, 0, length, iArr, iArr2);
            this.f20127 = iArr2;
        }
        int i7 = this.f20126 + i4;
        Object[] objArr = this.f20125;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f20125 = objArr2;
        }
        AbstractC6899[] abstractC6899Arr3 = this.f20124;
        int i9 = this.f20123;
        this.f20123 = i9 + 1;
        abstractC6899Arr3[i9] = abstractC6899;
        this.f20128 += abstractC6899.f18409;
        this.f20126 += i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final void m12624(InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7429 interfaceC7429) {
        if (this.f20123 != 0) {
            C0920 c0920 = new C0920(this);
            C7422 c7422 = (C7422) c0920.f2609;
            while (true) {
                AbstractC6899 abstractC6899 = c7422.f20124[c0920.f2612];
                C1230 c1230Mo12152 = abstractC6899.mo12152(c0920);
                InterfaceC1356 interfaceC13562 = interfaceC1356;
                C1235 c12352 = c1235;
                C1251 c12512 = c1251;
                InterfaceC7429 interfaceC74292 = interfaceC7429;
                try {
                    abstractC6899.mo12154(c0920, interfaceC13562, c12352, c12512, interfaceC74292);
                    int i = c0920.f2612;
                    int i2 = c7422.f20123;
                    if (i < i2) {
                        AbstractC6899 abstractC68992 = c7422.f20124[i];
                        c0920.f2611 += abstractC68992.f18409;
                        c0920.f2610 += abstractC68992.f18408;
                        int i3 = i + 1;
                        c0920.f2612 = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        interfaceC1356 = interfaceC13562;
                        c1235 = c12352;
                        c1251 = c12512;
                        interfaceC7429 = interfaceC74292;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        m12626();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final boolean m12625() {
        return this.f20123 == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final void m12626() {
        this.f20123 = 0;
        this.f20128 = 0;
        Arrays.fill(this.f20125, 0, this.f20126, (Object) null);
        this.f20126 = 0;
    }
}
