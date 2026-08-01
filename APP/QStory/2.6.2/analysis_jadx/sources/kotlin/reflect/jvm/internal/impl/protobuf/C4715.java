package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.activity.AbstractC0053;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4715 extends AbstractC4709 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final byte[] f13780;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13781 = 0;

    public C4715(byte[] bArr) {
        this.f13780 = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4709) || size() != ((AbstractC4709) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C4715) {
            return m9418((C4715) obj, 0, size());
        }
        if (obj instanceof C4696) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        C5919.m11249(AbstractC0053.m146(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
        return false;
    }

    public final int hashCode() {
        int iMo9363 = this.f13781;
        if (iMo9363 == 0) {
            int size = size();
            iMo9363 = mo9363(size, 0, size);
            if (iMo9363 == 0) {
                iMo9363 = 1;
            }
            this.f13781 = iMo9363;
        }
        return iMo9363;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C4718(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    public int size() {
        return this.f13780.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo9356(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f13780, i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m9418(C4715 c4715, int i, int i2) {
        byte[] bArr = c4715.f13780;
        int length = bArr.length;
        byte[] bArr2 = this.f13780;
        if (i2 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 <= bArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                if (bArr2[i3] != bArr[i]) {
                    return false;
                }
                i3++;
                i++;
            }
            return true;
        }
        int length3 = bArr.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(length3);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6[r8] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r6[r8] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r6[r7] > (-65)) goto L59;
     */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo9357(int r7, int r8, int r9) {
        /*
            r6 = this;
            int r9 = r9 + r8
            byte[] r6 = r6.f13780
            if (r7 == 0) goto L95
            if (r8 < r9) goto L8
            return r7
        L8:
            byte r0 = (byte) r7
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1f
            r7 = -62
            if (r0 < r7) goto L94
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r8 <= r3) goto L1c
            goto L94
        L1c:
            r8 = r7
            goto L95
        L1f:
            r4 = -16
            if (r0 >= r4) goto L4c
            int r7 = r7 >> 8
            int r7 = ~r7
            byte r7 = (byte) r7
            if (r7 != 0) goto L37
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r7 < r9) goto L34
            int r6 = kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4704.m9367(r0, r8)
            return r6
        L34:
            r5 = r8
            r8 = r7
            r7 = r5
        L37:
            if (r7 > r3) goto L94
            r4 = -96
            if (r0 != r1) goto L3f
            if (r7 < r4) goto L94
        L3f:
            r1 = -19
            if (r0 != r1) goto L45
            if (r7 >= r4) goto L94
        L45:
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r8 <= r3) goto L1c
            goto L94
        L4c:
            int r1 = r7 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L5f
            int r7 = r8 + 1
            r1 = r6[r8]
            if (r7 < r9) goto L5d
            int r6 = kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4704.m9367(r0, r1)
            return r6
        L5d:
            r8 = 0
            goto L65
        L5f:
            int r7 = r7 >> 16
            byte r7 = (byte) r7
            r5 = r8
            r8 = r7
            r7 = r5
        L65:
            if (r8 != 0) goto L81
            int r8 = r7 + 1
            r7 = r6[r7]
            if (r8 < r9) goto L7e
            r6 = -12
            if (r0 > r6) goto L7d
            if (r1 > r3) goto L7d
            if (r7 <= r3) goto L76
            goto L7d
        L76:
            int r6 = r1 << 8
            r6 = r6 ^ r0
            int r7 = r7 << 16
            r6 = r6 ^ r7
            return r6
        L7d:
            return r2
        L7e:
            r5 = r8
            r8 = r7
            r7 = r5
        L81:
            if (r1 > r3) goto L94
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L94
            if (r8 > r3) goto L94
            int r8 = r7 + 1
            r7 = r6[r7]
            if (r7 <= r3) goto L95
        L94:
            return r2
        L95:
            int r6 = kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4704.m9365(r8, r6, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C4715.mo9357(int, int, int):int");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo9358(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f13780, i, i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final int mo9359() {
        return this.f13781;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final String mo9360() {
        byte[] bArr = this.f13780;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo9361() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo9362() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final int mo9363(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f13780[i4];
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo9364() {
        byte[] bArr = this.f13780;
        return AbstractC4704.m9365(0, bArr, bArr.length) == 0;
    }
}
