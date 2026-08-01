package lin.xposed.hook.javaplugin.util;

import android.util.Log;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import p032.AbstractC6317;
import p032.AbstractC6318;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginMessageTool {
    private static String bytes2HexStr(byte[] bArr) {
        return (String) XposedHelpers.callStaticMethod(AbstractC6318.m11838("com.tencent.mobileqq.utils.HexUtil"), "bytes2HexStr", new Class[]{byte[].class}, new Object[]{bArr});
    }

    public static String getAudioUrl(String str, Object obj) {
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(100);
            byteBufferAllocate.put(hexStr2Bytes("3062020101045B30590201010201010204"));
            byteBufferAllocate.put(int2Bytes(new BigInteger(str).intValue()));
            byteBufferAllocate.put(hexStr2Bytes("0424"));
            byteBufferAllocate.put(((String) AbstractC6317.m11831(String.class, "fileUuid", obj)).getBytes());
            byteBufferAllocate.put(hexStr2Bytes("0204"));
            byteBufferAllocate.put(int2Bytes((int) (System.currentTimeMillis() / 1000)));
            byteBufferAllocate.put(hexStr2Bytes("041F0000000866696C6574797065000000013100000005636F64656300000001300400"));
            byteBufferAllocate.flip();
            return String.format("http://grouptalk.c2c.qq.com/?ver=0&rkey=%s&filetype=1&voice_codec=" + AbstractC6317.m11831(Integer.TYPE, "voiceType", obj), bytes2HexStr(byteBufferAllocate.array()));
        } catch (Exception e) {
            Log.d("\u62a5\u9519:\u83b7\u53d6\u8bed\u97f3\u94fe\u63a5", String.valueOf(e));
            return "";
        }
    }

    public static String getVideoUrl(String str, Object obj) {
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(256);
            byteBufferAllocate.put(hexStr2Bytes("3081FD0201010481F53081F20201010201000204"));
            byteBufferAllocate.put(int2Bytes(new BigInteger(str).intValue()));
            byteBufferAllocate.put(hexStr2Bytes("0481A6"));
            byteBufferAllocate.put(((String) AbstractC6317.m11831(String.class, "fileUuid", obj)).getBytes());
            byteBufferAllocate.put(hexStr2Bytes("0204"));
            long jCurrentTimeMillis = System.currentTimeMillis();
            byteBufferAllocate.put(int2Bytes((int) (jCurrentTimeMillis / 1000)));
            byteBufferAllocate.put(hexStr2Bytes("04350000000866696C657479706500000004313030330000000B646F776E656E63727970740000000130000000047175696300000001310400"));
            byteBufferAllocate.flip();
            return String.format("http://grouptalk.c2c.qq.com/qqdownload?ver=537101242&rkey=%s&filetype=1003&videotype=0&subvideotype=0&term=android&video_codec=0&filename=" + jCurrentTimeMillis + ".mp4", bytes2HexStr(byteBufferAllocate.array()));
        } catch (Exception e) {
            Log.d("\u62a5\u9519:\u83b7\u53d6\u89c6\u9891\u94fe\u63a5", String.valueOf(e));
            return "";
        }
    }

    private static byte[] hexStr2Bytes(String str) {
        return (byte[]) XposedHelpers.callStaticMethod(AbstractC6318.m11838("com.tencent.mobileqq.utils.HexUtil"), "hexStr2Bytes", new Class[]{String.class}, new Object[]{str});
    }

    private static byte[] int2Bytes(int i) {
        byte[] bArr = new byte[4];
        int i2 = 0;
        while (i2 < 4) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> (32 - (i3 * 8))) & Opcodes.CONST_METHOD_TYPE);
            i2 = i3;
        }
        return bArr;
    }
}
