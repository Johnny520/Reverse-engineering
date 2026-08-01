package kotlin.p008io;

import com.bumptech.glide.AbstractC3889;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5213 extends AbstractC3889 {
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final void m9429(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        charset.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        charsetEncoderOnUnmappableCharacter.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        byteBufferAllocate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                C6755.m11870("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static File m9430(File file) {
        C5209 c5209M7294 = AbstractC3889.m7294(file);
        File file2 = c5209M7294.f13300;
        List<File> list = c5209M7294.f13299;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file3 : list) {
            String name = file3.getName();
            if (!AbstractC5227.m9466(name, ".")) {
                if (!AbstractC5227.m9466(name, "..")) {
                    arrayList.add(file3);
                } else if (arrayList.isEmpty() || AbstractC5227.m9466(((File) AbstractC5176.m9367(arrayList)).getName(), "..")) {
                    arrayList.add(file3);
                }
            }
        }
        String str = File.separator;
        str.getClass();
        File file4 = new File(AbstractC5176.m9369(arrayList, str, null, null, null, 62));
        String path = file4.getPath();
        path.getClass();
        if (AbstractC3889.m7312(path) > 0) {
            return file4;
        }
        String string = file2.toString();
        string.getClass();
        if (string.length() != 0) {
            char c = File.separatorChar;
            if (!AbstractC5976.m10718(string, c)) {
                return new File(string + c + file4);
            }
        }
        return new File(string + file4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static String m9431(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        int iM10724 = AbstractC5976.m10724(name, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, 0, 6);
        return iM10724 == -1 ? "" : name.substring(iM10724 + 1, name.length());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static void m9432(File file, File file2) throws IOException {
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists() && !file2.delete()) {
            throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new FileSystemException(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[8192];
                for (int i = fileInputStream.read(bArr); i >= 0; i = fileInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, i);
                }
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }
}
