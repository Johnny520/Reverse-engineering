package org.apache.commons.compress.archivers.zip;

import androidx.core.view.C3075;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import kotlinx.serialization.protobuf.internal.C6349;
import p373.C9731;
import p373.C9732;
import p373.C9733;
import p393.C9820;
import p395.AbstractC9825;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6427 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f15755;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f15756;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C3075 f15757;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6349 f15758 = new C6349();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C3075 f15759;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C3075 f15760;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6428 f15761;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f15762;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6413 f15763;

    public C6427(int i, int i2, C6413 c6413) {
        if (i != 4096 && i != 8192) {
            C6755.m11869("The dictionary size must be 4096 or 8192");
            throw null;
        }
        if (i2 != 2 && i2 != 3) {
            C6755.m11869("The number of trees must be 2 or 3");
            throw null;
        }
        this.f15762 = i;
        this.f15756 = i2;
        this.f15755 = i2;
        this.f15763 = c6413;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15763.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C6349 c6349 = this.f15758;
        if (c6349.f15592 == c6349.f15591) {
            try {
                m11525();
            } catch (IllegalArgumentException e) {
                throw new IOException("bad IMPLODE stream", e);
            }
        }
        int i = c6349.f15592;
        if (i == c6349.f15591) {
            return -1;
        }
        byte b = c6349.f15593[i];
        c6349.f15592 = (i + 1) % 32768;
        return b & DefaultClassResolver.NAME;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11525() throws IOException {
        if (this.f15761 == null) {
            C9733 c9733M15104 = C9732.m15104();
            C6413 c6413 = this.f15763;
            c9733M15104.f25563 = new C9820(new C9731(c6413));
            C9732 c9732 = new C9732(c9733M15104);
            try {
                if (this.f15756 == 3) {
                    this.f15759 = C3075.m4700(c9732, 256);
                }
                this.f15760 = C3075.m4700(c9732, 64);
                this.f15757 = C3075.m4700(c9732, 64);
                c9732.m15106();
                c9732.close();
                this.f15761 = new C6428(c6413, ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                try {
                    c9732.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        int iM15162 = (int) this.f15761.m15162(1);
        if (iM15162 == -1) {
            return;
        }
        C6349 c6349 = this.f15758;
        if (iM15162 == 1) {
            C3075 c3075 = this.f15759;
            C6428 c6428 = this.f15761;
            int iM4702 = c3075 != null ? c3075.m4702(c6428) : (int) c6428.m15162(8);
            if (iM4702 == -1) {
                return;
            }
            byte[] bArr = c6349.f15593;
            int i = c6349.f15591;
            bArr[i] = (byte) iM4702;
            c6349.f15591 = (i + 1) % 32768;
            return;
        }
        int i2 = this.f15762 == 4096 ? 6 : 7;
        int iM11526 = (int) this.f15761.m11526(i2);
        int iM47022 = this.f15757.m4702(this.f15761);
        if (iM47022 != -1 || iM11526 > 0) {
            int i3 = (iM47022 << i2) | iM11526;
            int iM47023 = this.f15760.m4702(this.f15761);
            if (iM47023 == 63) {
                long jM11526 = this.f15761.m11526(8);
                if (jM11526 == -1) {
                    return;
                } else {
                    iM47023 = AbstractC9825.m15160(iM47023, jM11526);
                }
            }
            int i4 = iM47023 + this.f15755;
            int i5 = c6349.f15591 - (i3 + 1);
            int i6 = i4 + i5;
            while (i5 < i6) {
                byte[] bArr2 = c6349.f15593;
                int i7 = c6349.f15591;
                bArr2[i7] = bArr2[(i5 + 32768) % 32768];
                c6349.f15591 = (i7 + 1) % 32768;
                i5++;
            }
        }
    }
}
