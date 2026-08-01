package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4711 extends OutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final byte[] f13775 = new byte[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f13776;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13779;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f13780 = 128;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f13778 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public byte[] f13777 = new byte[128];

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f13779 + this.f13776;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.f13777;
            int length = bArr2.length;
            int i3 = this.f13776;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f13776 += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                m9405(i4);
                System.arraycopy(bArr, i + length2, this.f13777, 0, i4);
                this.f13776 = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final synchronized AbstractC4710 m9403() {
        ArrayList arrayList;
        m9404();
        arrayList = this.f13778;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((AbstractC4710) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? AbstractC4710.f13774 : AbstractC4710.m9398(arrayList.iterator(), arrayList.size());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9404() {
        int i = this.f13776;
        byte[] bArr = this.f13777;
        int length = bArr.length;
        ArrayList arrayList = this.f13778;
        if (i >= length) {
            arrayList.add(new C4716(this.f13777));
            this.f13777 = f13775;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            arrayList.add(new C4716(bArr2));
        }
        this.f13779 += this.f13776;
        this.f13776 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m9405(int i) {
        this.f13778.add(new C4716(this.f13777));
        int length = this.f13779 + this.f13777.length;
        this.f13779 = length;
        this.f13777 = new byte[Math.max(this.f13780, Math.max(i, length >>> 1))];
        this.f13776 = 0;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f13776 == this.f13777.length) {
                m9405(1);
            }
            byte[] bArr = this.f13777;
            int i2 = this.f13776;
            this.f13776 = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
