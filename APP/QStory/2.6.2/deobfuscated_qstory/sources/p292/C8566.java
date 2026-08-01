package p292;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3065;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p007.AbstractC6136;
import p144.C7546;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final short[] f23893 = new short[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8568 f23894;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8568 f23895;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8568 f23896;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f23897;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8554 f23898;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ByteBuffer f23899;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8568 f23900;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8568 f23901;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8568 f23902;

    public C8566(File file) throws IOException {
        this.f23898 = new C8554();
        this.f23897 = 0;
        this.f23896 = new C8568(this, 3);
        this.f23895 = new C8568(this, 4);
        this.f23894 = new C8568(this, 5);
        this.f23901 = new C8568(this, 2);
        this.f23900 = new C8568(this, 0);
        this.f23902 = new C8568(this, 1);
        String name = file.getName();
        if (!name.endsWith(".zip") && !name.endsWith(".jar") && !name.endsWith(".apk")) {
            if (!file.getName().endsWith(".dex")) {
                C7546.m12739(file, "unknown output extension: ");
                throw null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                m14115(fileInputStream);
                fileInputStream.close();
                return;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ZipFile zipFile = new ZipFile(file);
        ZipEntry entry = zipFile.getEntry("classes.dex");
        if (entry == null) {
            C7546.m12739(file, "Expected classes.dex in ");
            throw null;
        }
        InputStream inputStream = zipFile.getInputStream(entry);
        try {
            m14115(inputStream);
            inputStream.close();
            zipFile.close();
        } catch (Throwable th3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14111(int i, int i2) {
        if (i < 0 || i >= i2) {
            C7546.m12743(AbstractC6136.m11559(i, i2, "index:", ", length="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        r0[r1] = new p292.C8563(r2, r9, r14);
        r1 = r1 + 1;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p292.C8567 m14112(p292.C8550 r21) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p292.C8566.m14112(飘花落叶言楪子哲兰苏世.飘花落叶言子楪世哲兰苏):飘花落叶言楪子哲兰苏世.飘花落叶言子楪苏哲世兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8549 m14113(C8548 c8548) {
        int i = c8548.f23808;
        if (i == 0) {
            C5919.m11249("offset == 0");
            return null;
        }
        C8565 c8565M14114 = m14114(i);
        int iM6852 = AbstractC3065.m6852(c8565M14114);
        int iM68522 = AbstractC3065.m6852(c8565M14114);
        int iM68523 = AbstractC3065.m6852(c8565M14114);
        int iM68524 = AbstractC3065.m6852(c8565M14114);
        C8551[] c8551Arr = new C8551[iM6852];
        int iM68525 = 0;
        for (int i2 = 0; i2 < iM6852; i2++) {
            iM68525 += AbstractC3065.m6852(c8565M14114);
            c8551Arr[i2] = new C8551(iM68525, AbstractC3065.m6852(c8565M14114));
        }
        C8551[] c8551Arr2 = new C8551[iM68522];
        int iM68526 = 0;
        for (int i3 = 0; i3 < iM68522; i3++) {
            iM68526 += AbstractC3065.m6852(c8565M14114);
            c8551Arr2[i3] = new C8551(iM68526, AbstractC3065.m6852(c8565M14114));
        }
        return new C8549(c8551Arr, c8551Arr2, c8565M14114.m14105(iM68523), c8565M14114.m14105(iM68524));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8565 m14114(int i) {
        if (i < 0 || i >= this.f23899.capacity()) {
            C7546.m12747(AbstractC0053.m148(i, "position=", " length="), this.f23899.capacity());
            return null;
        }
        ByteBuffer byteBufferDuplicate = this.f23899.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        return new C8565(this, "section", byteBufferDuplicate);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14115(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                this.f23899 = byteBufferWrap;
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                this.f23898.m14090(this);
                return;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8565 m14116(int i, String str) {
        if ((i & 3) != 0) {
            C5919.m11250("Not four byte aligned!");
            return null;
        }
        int i2 = this.f23897 + i;
        ByteBuffer byteBufferDuplicate = this.f23899.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        C8565 c8565 = new C8565(this, str, byteBufferDuplicate);
        this.f23897 = i2;
        return c8565;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14117(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        ByteBuffer byteBufferDuplicate = this.f23899.duplicate();
        while (byteBufferDuplicate.hasRemaining()) {
            int iMin = Math.min(8192, byteBufferDuplicate.remaining());
            byteBufferDuplicate.get(bArr, 0, iMin);
            outputStream.write(bArr, 0, iMin);
        }
    }

    public C8566(int i) {
        this.f23898 = new C8554();
        this.f23897 = 0;
        this.f23896 = new C8568(this, 3);
        this.f23895 = new C8568(this, 4);
        this.f23894 = new C8568(this, 5);
        this.f23901 = new C8568(this, 2);
        this.f23900 = new C8568(this, 0);
        this.f23902 = new C8568(this, 1);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[i]);
        this.f23899 = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public C8566(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C8554 c8554 = new C8554();
        this.f23898 = c8554;
        this.f23897 = 0;
        this.f23896 = new C8568(this, 3);
        this.f23895 = new C8568(this, 4);
        this.f23894 = new C8568(this, 5);
        this.f23901 = new C8568(this, 2);
        this.f23900 = new C8568(this, 0);
        this.f23902 = new C8568(this, 1);
        this.f23899 = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8554.m14090(this);
    }
}
