package org.apache.commons.compress.archivers.zip;

import androidx.core.view.C2242;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import kotlinx.serialization.protobuf.internal.C5517;
import p357.C8902;
import p357.C8903;
import p357.C8904;
import p377.C8991;
import p379.AbstractC8996;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5597 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f15410;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f15411;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C2242 f15412;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C5517 f15413 = new C5517();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C2242 f15414;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C2242 f15415;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5598 f15416;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f15417;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5583 f15418;

    public C5597(int i, int i2, C5583 c5583) {
        if (i != 4096 && i != 8192) {
            C5925.m11310("The dictionary size must be 4096 or 8192");
            throw null;
        }
        if (i2 != 2 && i2 != 3) {
            C5925.m11310("The number of trees must be 2 or 3");
            throw null;
        }
        this.f15417 = i;
        this.f15411 = i2;
        this.f15410 = i2;
        this.f15418 = c5583;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15418.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C5517 c5517 = this.f15413;
        if (c5517.f15247 == c5517.f15246) {
            try {
                m10966();
            } catch (IllegalArgumentException e) {
                throw new IOException("bad IMPLODE stream", e);
            }
        }
        int i = c5517.f15247;
        if (i == c5517.f15246) {
            return -1;
        }
        byte b = c5517.f15248[i];
        c5517.f15247 = (i + 1) % 32768;
        return b & DefaultClassResolver.NAME;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m10966() throws IOException {
        if (this.f15416 == null) {
            C8904 c8904M14545 = C8903.m14545();
            C5583 c5583 = this.f15418;
            c8904M14545.f25218 = new C8991(new C8902(c5583));
            C8903 c8903 = new C8903(c8904M14545);
            try {
                if (this.f15411 == 3) {
                    this.f15414 = C2242.m4140(c8903, 256);
                }
                this.f15415 = C2242.m4140(c8903, 64);
                this.f15412 = C2242.m4140(c8903, 64);
                c8903.m14547();
                c8903.close();
                this.f15416 = new C5598(c5583, ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                try {
                    c8903.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        int iM14603 = (int) this.f15416.m14603(1);
        if (iM14603 == -1) {
            return;
        }
        C5517 c5517 = this.f15413;
        if (iM14603 == 1) {
            C2242 c2242 = this.f15414;
            C5598 c5598 = this.f15416;
            int iM4142 = c2242 != null ? c2242.m4142(c5598) : (int) c5598.m14603(8);
            if (iM4142 == -1) {
                return;
            }
            byte[] bArr = c5517.f15248;
            int i = c5517.f15246;
            bArr[i] = (byte) iM4142;
            c5517.f15246 = (i + 1) % 32768;
            return;
        }
        int i2 = this.f15417 == 4096 ? 6 : 7;
        int iM10967 = (int) this.f15416.m10967(i2);
        int iM41422 = this.f15412.m4142(this.f15416);
        if (iM41422 != -1 || iM10967 > 0) {
            int i3 = (iM41422 << i2) | iM10967;
            int iM41423 = this.f15415.m4142(this.f15416);
            if (iM41423 == 63) {
                long jM10967 = this.f15416.m10967(8);
                if (jM10967 == -1) {
                    return;
                } else {
                    iM41423 = AbstractC8996.m14601(iM41423, jM10967);
                }
            }
            int i4 = iM41423 + this.f15410;
            int i5 = c5517.f15246 - (i3 + 1);
            int i6 = i4 + i5;
            while (i5 < i6) {
                byte[] bArr2 = c5517.f15248;
                int i7 = c5517.f15246;
                bArr2[i7] = bArr2[(i5 + 32768) % 32768];
                c5517.f15246 = (i7 + 1) % 32768;
                i5++;
            }
        }
    }
}
