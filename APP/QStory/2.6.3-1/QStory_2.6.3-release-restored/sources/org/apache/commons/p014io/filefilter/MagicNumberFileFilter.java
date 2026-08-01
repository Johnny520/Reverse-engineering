package org.apache.commons.p014io.filefilter;

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
import org.apache.commons.p014io.RandomAccessFileMode;
import p025.AbstractC7012;
import p352.C9629;
import p375.AbstractC9744;
import p375.InterfaceC9740;
import p392.AbstractC9814;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class MagicNumberFileFilter extends AbstractC9744 implements Serializable {
    private static final long serialVersionUID = -547733176983104172L;
    private final long byteOffset;
    private final byte[] magicNumbers;

    public MagicNumberFileFilter(byte[] bArr, long j) {
        Objects.requireNonNull(bArr, "magicNumbers");
        if (bArr.length == 0) {
            C6755.m11869("The magic number must contain at least one byte");
            throw null;
        }
        if (j < 0) {
            C6755.m11869("The offset cannot be negative");
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
        byte[] bArr3 = AbstractC9814.f25560;
        if (length < 0) {
            C6755.m11869(AbstractC7012.m12147(length, "Size must be equal or greater than zero: "));
            return null;
        }
        if (length == 0) {
            bArr = AbstractC9814.f25560;
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
                C6755.m11866(AbstractC7012.m12150(i, length, "Unexpected read size, current: ", ", expected: "));
                return null;
            }
            bArr = bArr4;
        }
        return Boolean.valueOf(Arrays.equals(bArr2, bArr));
    }

    @Override // p375.InterfaceC9740
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

    @Override // p375.InterfaceC9740
    public InterfaceC9740 and(InterfaceC9740 interfaceC9740) {
        return new AndFileFilter(this, interfaceC9740);
    }

    @Override // p375.InterfaceC9740, java.nio.file.PathMatcher
    public /* bridge */ /* synthetic */ boolean matches(Path path) {
        return super.matches(path);
    }

    @Override // p375.InterfaceC9740
    public InterfaceC9740 negate() {
        return new NotFileFilter(this);
    }

    /* JADX INFO: renamed from: or */
    public InterfaceC9740 m517or(InterfaceC9740 interfaceC9740) {
        return new OrFileFilter(this, interfaceC9740);
    }

    @Override // p375.AbstractC9744
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

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FileFilter
    public boolean accept(File file) {
        if (!isFile(file) || !file.canRead()) {
            return false;
        }
        try {
            return ((Boolean) RandomAccessFileMode.READ_ONLY.apply(file.toPath(), new C9629(this))).booleanValue();
        } catch (IOException unused) {
            return false;
        }
    }
}
