package p287;

import androidx.collection.C0276;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import kotlin.Metadata;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲苏兰;", "", "", "data", "", "totalLength", "", "", "飘花落叶言子楪世哲兰苏", "([BJ)[Ljava/lang/String;", "id", "chunks", "飘花落叶言子楪世苏兰哲", "(J[Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/Class;", "deobfuscatorClass", "飘花落叶言子楪世哲苏兰", "(J[Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;", "core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class C8404 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String[] m13968(byte[] data, long totalLength) {
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
            C0276.m848("Failed to load obfuscated strings", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m13969(long id, String[] chunks, Class<?> deobfuscatorClass) {
        chunks.getClass();
        long jM13967 = C8402.m13967(C8402.m13966(4294967295L & id));
        long j = (jM13967 >>> 32) & 65535;
        long jM139672 = C8402.m13967(jM13967);
        int i = (int) (((id >>> 32) ^ j) ^ ((jM139672 >>> 16) & 4294901760L));
        long jM13971 = m13971(i, chunks, jM139672, deobfuscatorClass);
        int i2 = (int) ((jM13971 >>> 32) & 65535);
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jM13971 = m13971(i + i3 + 1, chunks, jM13971, deobfuscatorClass);
            cArr[i3] = (char) ((jM13971 >>> 32) & 65535);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m13970(long id, String[] chunks) {
        chunks.getClass();
        long jM13967 = C8402.m13967(C8402.m13966(4294967295L & id));
        long j = (jM13967 >>> 32) & 65535;
        long jM139672 = C8402.m13967(jM13967);
        int i = (int) (((id >>> 32) ^ j) ^ ((jM139672 >>> 16) & 4294901760L));
        long jM13971 = m13971(i, chunks, jM139672, null);
        int i2 = (int) ((jM13971 >>> 32) & 65535);
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jM13971 = m13971(i + i3 + 1, chunks, jM13971, null);
            cArr[i3] = (char) ((jM13971 >>> 32) & 65535);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m13971(int i, String[] strArr, long j, Class cls) {
        long jM13967 = C8402.m13967(j);
        int i2 = i / 8191;
        if (i2 < 0 || i2 >= strArr.length) {
            C5925.m11310(AbstractC6183.m11588(i2, "Chunk index out of bounds: "));
            return 0L;
        }
        String str = strArr[i2];
        if (str == null) {
            if (cls == null) {
                C5925.m11311(AbstractC6183.m11588(i2, "Chunk is null at index: "));
                return 0L;
            }
            try {
                Object objInvoke = cls.getMethod("ensureChunkLoaded", Integer.TYPE).invoke(null, Integer.valueOf(i2));
                objInvoke.getClass();
                str = (String) objInvoke;
                strArr[i2] = str;
            } catch (Exception e) {
                C0276.m848(AbstractC6183.m11588(i2, "Failed to load chunk "), e);
                return 0L;
            }
        }
        int i3 = i - (i2 * 8191);
        if (i3 >= 0 && i3 < str.length()) {
            return (((long) str.charAt(i3)) << 32) ^ jM13967;
        }
        C5925.m11310(AbstractC6183.m11591(i3, str.length(), "Index in chunk out of bounds: ", ", chunk length: "));
        return 0L;
    }
}
