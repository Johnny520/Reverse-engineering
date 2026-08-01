package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.io.RandomAccessFileMode;
import p009.AbstractC6183;
import p336.C8800;
import p359.AbstractC8915;
import p359.InterfaceC8911;
import p376.AbstractC8985;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class MagicNumberFileFilter extends AbstractC8915 implements Serializable {
    private static final long serialVersionUID = -547733176983104172L;
    private final long byteOffset;
    private final byte[] magicNumbers;

    public MagicNumberFileFilter(byte[] bArr, long j) {
        Objects.requireNonNull(bArr, "magicNumbers");
        if (bArr.length == 0) {
            C5925.m11310("The magic number must contain at least one byte");
            throw null;
        }
        if (j < 0) {
            C5925.m11310("The offset cannot be negative");
            throw null;
        }
        this.magicNumbers = (byte[]) bArr.clone();
        this.byteOffset = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean lambda$accept$0(RandomAccessFile randomAccessFile) throws IOException {
        byte[] bArr;
        byte[] bArr2 = this.magicNumbers;
        long j = this.byteOffset;
        int length = bArr2.length;
        randomAccessFile.seek(j);
        byte[] bArr3 = AbstractC8985.f25215;
        if (length < 0) {
            C5925.m11310(AbstractC6183.m11588(length, "Size must be equal or greater than zero: "));
            return null;
        }
        if (length == 0) {
            bArr = AbstractC8985.f25215;
        } else {
            byte[] bArr4 = new byte[length];
            int i = 0;
            while (i < length) {
                int i2 = randomAccessFile.read(bArr4, i, length - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            if (i != length) {
                C5925.m11307(AbstractC6183.m11591(i, length, "Unexpected read size, current: ", ", expected: "));
                return null;
            }
            bArr = bArr4;
        }
        return Boolean.valueOf(Arrays.equals(bArr2, bArr));
    }

    @Override // p359.InterfaceC8911
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        if (path != null && Files.isRegularFile(path, new LinkOption[0]) && Files.isReadable(path)) {
            try {
                FileChannel fileChannelOpen = FileChannel.open(path, new OpenOption[0]);
                try {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.magicNumbers.length);
                    fileChannelOpen.position(this.byteOffset);
                    int i = fileChannelOpen.read(byteBufferAllocate);
                    byte[] bArr = this.magicNumbers;
                    FileVisitResult fileVisitResult = i != bArr.length ? FileVisitResult.TERMINATE : toFileVisitResult(Arrays.equals(bArr, byteBufferAllocate.array()));
                    fileChannelOpen.close();
                    return fileVisitResult;
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        return FileVisitResult.TERMINATE;
    }

    @Override // p359.InterfaceC8911
    public InterfaceC8911 and(InterfaceC8911 interfaceC8911) {
        return new AndFileFilter(this, interfaceC8911);
    }

    @Override // p359.InterfaceC8911, java.nio.file.PathMatcher
    public /* bridge */ /* synthetic */ boolean matches(Path path) {
        return super.matches(path);
    }

    @Override // p359.InterfaceC8911
    public InterfaceC8911 negate() {
        return new NotFileFilter(this);
    }

    public InterfaceC8911 or(InterfaceC8911 interfaceC8911) {
        return new OrFileFilter(this, interfaceC8911);
    }

    @Override // p359.AbstractC8915
    public String toString() {
        return super.toString() + "(" + new String(this.magicNumbers, Charset.defaultCharset()) + "," + this.byteOffset + ")";
    }

    public MagicNumberFileFilter(byte[] bArr) {
        this(bArr, 0L);
    }

    public MagicNumberFileFilter(String str) {
        this(str, 0L);
    }

    public MagicNumberFileFilter(String str, long j) {
        this(str.getBytes(Charset.defaultCharset()), j);
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FileFilter
    public boolean accept(File file) {
        if (!isFile(file) || !file.canRead()) {
            return false;
        }
        try {
            return ((Boolean) RandomAccessFileMode.READ_ONLY.apply(file.toPath(), new C8800(this))).booleanValue();
        } catch (IOException unused) {
            return false;
        }
    }
}
