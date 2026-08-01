package p303;

import androidx.collection.C1123;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import kotlin.Metadata;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m151d2 = {"L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲苏兰;", "", "", "data", "", "totalLength", "", "", "飘花落叶言子楪世哲兰苏", "([BJ)[Ljava/lang/String;", "id", "chunks", "飘花落叶言子楪世苏兰哲", "(J[Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/Class;", "deobfuscatorClass", "飘花落叶言子楪世哲苏兰", "(J[Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;", "core"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class C9233 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String[] m14527(byte[] data, long totalLength) {
        data.getClass();
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(data));
            try {
                int i = (int) ((8190 + totalLength) / 8191);
                String[] strArr = new String[i];
                for (int i2 = 0; i2 < i; i2++) {
                    strArr[i2] = "";
                }
                long j = 0;
                int i3 = 0;
                while (j < totalLength) {
                    int iMin = (int) Math.min(8191L, totalLength - j);
                    char[] cArr = new char[iMin];
                    for (int i4 = 0; i4 < iMin; i4++) {
                        cArr[i4] = dataInputStream.readChar();
                    }
                    int i5 = i3 + 1;
                    strArr[i3] = new String(cArr);
                    j += (long) iMin;
                    i3 = i5;
                }
                dataInputStream.close();
                return strArr;
            } finally {
            }
        } catch (Exception e) {
            C1123.m1408("Failed to load obfuscated strings", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m14528(long id, String[] chunks, Class<?> deobfuscatorClass) {
        chunks.getClass();
        long jM14526 = C9231.m14526(C9231.m14525(4294967295L & id));
        long j = (jM14526 >>> 32) & 65535;
        long jM145262 = C9231.m14526(jM14526);
        int i = (int) (((id >>> 32) ^ j) ^ ((jM145262 >>> 16) & 4294901760L));
        long jM14530 = m14530(i, chunks, jM145262, deobfuscatorClass);
        int i2 = (int) ((jM14530 >>> 32) & 65535);
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jM14530 = m14530(i + i3 + 1, chunks, jM14530, deobfuscatorClass);
            cArr[i3] = (char) ((jM14530 >>> 32) & 65535);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m14529(long id, String[] chunks) {
        chunks.getClass();
        long jM14526 = C9231.m14526(C9231.m14525(4294967295L & id));
        long j = (jM14526 >>> 32) & 65535;
        long jM145262 = C9231.m14526(jM14526);
        int i = (int) (((id >>> 32) ^ j) ^ ((jM145262 >>> 16) & 4294901760L));
        long jM14530 = m14530(i, chunks, jM145262, null);
        int i2 = (int) ((jM14530 >>> 32) & 65535);
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jM14530 = m14530(i + i3 + 1, chunks, jM14530, null);
            cArr[i3] = (char) ((jM14530 >>> 32) & 65535);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m14530(int i, String[] strArr, long j, Class cls) {
        long jM14526 = C9231.m14526(j);
        int i2 = i / 8191;
        if (i2 < 0 || i2 >= strArr.length) {
            C6755.m11869(AbstractC7012.m12147(i2, "Chunk index out of bounds: "));
            return 0L;
        }
        String str = strArr[i2];
        if (str == null) {
            if (cls == null) {
                C6755.m11870(AbstractC7012.m12147(i2, "Chunk is null at index: "));
                return 0L;
            }
            try {
                Object objInvoke = cls.getMethod("ensureChunkLoaded", Integer.TYPE).invoke(null, Integer.valueOf(i2));
                objInvoke.getClass();
                str = (String) objInvoke;
                strArr[i2] = str;
            } catch (Exception e) {
                C1123.m1408(AbstractC7012.m12147(i2, "Failed to load chunk "), e);
                return 0L;
            }
        }
        int i3 = i - (i2 * 8191);
        if (i3 >= 0 && i3 < str.length()) {
            return (((long) str.charAt(i3)) << 32) ^ jM14526;
        }
        C6755.m11869(AbstractC7012.m12150(i3, str.length(), "Index in chunk out of bounds: ", ", chunk length: "));
        return 0L;
    }
}
