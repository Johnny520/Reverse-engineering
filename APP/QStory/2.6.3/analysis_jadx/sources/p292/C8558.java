package p292;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3055;
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
import p009.AbstractC6183;
import p144.C7547;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final short[] f23884 = new short[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8560 f23885;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8560 f23886;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8560 f23887;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f23888;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8546 f23889;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ByteBuffer f23890;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8560 f23891;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8560 f23892;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8560 f23893;

    public C8558(File file) throws IOException {
        this.f23889 = new C8546();
        this.f23888 = 0;
        this.f23887 = new C8560(this, 3);
        this.f23886 = new C8560(this, 4);
        this.f23885 = new C8560(this, 5);
        this.f23892 = new C8560(this, 2);
        this.f23891 = new C8560(this, 0);
        this.f23893 = new C8560(this, 1);
        String name = file.getName();
        if (!name.endsWith(".zip") && !name.endsWith(".jar") && !name.endsWith(".apk")) {
            if (!file.getName().endsWith(".dex")) {
                C7547.m12768(file, "unknown output extension: ");
                throw null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                m14134(fileInputStream);
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
            C7547.m12768(file, "Expected classes.dex in ");
            throw null;
        }
        InputStream inputStream = zipFile.getInputStream(entry);
        try {
            m14134(inputStream);
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
    public static void m14130(int i, int i2) {
        if (i < 0 || i >= i2) {
            C7547.m12772(AbstractC6183.m11591(i, i2, "index:", ", length="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        r0[r1] = new p292.C8555(r2, r9, r14);
        r1 = r1 + 1;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p292.C8559 m14131(p292.C8542 r21) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p292.C8558.m14131(飘花落叶言楪子哲兰苏世.飘花落叶言子楪世哲兰苏):飘花落叶言楪子哲兰苏世.飘花落叶言子楪苏哲世兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8541 m14132(C8540 c8540) {
        int i = c8540.f23799;
        if (i == 0) {
            C5925.m11310("offset == 0");
            return null;
        }
        C8557 c8557M14133 = m14133(i);
        int iM6644 = AbstractC3055.m6644(c8557M14133);
        int iM66442 = AbstractC3055.m6644(c8557M14133);
        int iM66443 = AbstractC3055.m6644(c8557M14133);
        int iM66444 = AbstractC3055.m6644(c8557M14133);
        C8543[] c8543Arr = new C8543[iM6644];
        int iM66445 = 0;
        for (int i2 = 0; i2 < iM6644; i2++) {
            iM66445 += AbstractC3055.m6644(c8557M14133);
            c8543Arr[i2] = new C8543(iM66445, AbstractC3055.m6644(c8557M14133));
        }
        C8543[] c8543Arr2 = new C8543[iM66442];
        int iM66446 = 0;
        for (int i3 = 0; i3 < iM66442; i3++) {
            iM66446 += AbstractC3055.m6644(c8557M14133);
            c8543Arr2[i3] = new C8543(iM66446, AbstractC3055.m6644(c8557M14133));
        }
        return new C8541(c8543Arr, c8543Arr2, c8557M14133.m14124(iM66443), c8557M14133.m14124(iM66444));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8557 m14133(int i) {
        if (i < 0 || i >= this.f23890.capacity()) {
            C7547.m12776(AbstractC0053.m150(i, "position=", " length="), this.f23890.capacity());
            return null;
        }
        ByteBuffer byteBufferDuplicate = this.f23890.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        return new C8557(this, "section", byteBufferDuplicate);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14134(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                this.f23890 = byteBufferWrap;
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                this.f23889.m14109(this);
                return;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8557 m14135(int i, String str) {
        if ((i & 3) != 0) {
            C5925.m11311("Not four byte aligned!");
            return null;
        }
        int i2 = this.f23888 + i;
        ByteBuffer byteBufferDuplicate = this.f23890.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        C8557 c8557 = new C8557(this, str, byteBufferDuplicate);
        this.f23888 = i2;
        return c8557;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14136(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        ByteBuffer byteBufferDuplicate = this.f23890.duplicate();
        while (byteBufferDuplicate.hasRemaining()) {
            int iMin = Math.min(8192, byteBufferDuplicate.remaining());
            byteBufferDuplicate.get(bArr, 0, iMin);
            outputStream.write(bArr, 0, iMin);
        }
    }

    public C8558(int i) {
        this.f23889 = new C8546();
        this.f23888 = 0;
        this.f23887 = new C8560(this, 3);
        this.f23886 = new C8560(this, 4);
        this.f23885 = new C8560(this, 5);
        this.f23892 = new C8560(this, 2);
        this.f23891 = new C8560(this, 0);
        this.f23893 = new C8560(this, 1);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[i]);
        this.f23890 = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public C8558(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C8546 c8546 = new C8546();
        this.f23889 = c8546;
        this.f23888 = 0;
        this.f23887 = new C8560(this, 3);
        this.f23886 = new C8560(this, 4);
        this.f23885 = new C8560(this, 5);
        this.f23892 = new C8560(this, 2);
        this.f23891 = new C8560(this, 0);
        this.f23893 = new C8560(this, 1);
        this.f23890 = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c8546.m14109(this);
    }
}
