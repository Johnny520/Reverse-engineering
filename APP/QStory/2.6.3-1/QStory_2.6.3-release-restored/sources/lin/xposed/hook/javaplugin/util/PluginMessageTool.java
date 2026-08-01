package lin.xposed.hook.javaplugin.util;

import android.util.Log;
import com.android.p002dx.p005io.Opcodes;
import de.robv.android.xposed.XposedHelpers;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import p049.AbstractC7165;
import p049.AbstractC7166;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginMessageTool {
    private static String bytes2HexStr(byte[] bArr) {
        return (String) XposedHelpers.callStaticMethod(AbstractC7166.m12425("com.tencent.mobileqq.utils.HexUtil"), "bytes2HexStr", new Class[]{byte[].class}, new Object[]{bArr});
    }

    public static String getAudioUrl(String str, Object obj) {
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(100);
            byteBufferAllocate.put(hexStr2Bytes("3062020101045B30590201010201010204"));
            byteBufferAllocate.put(int2Bytes(new BigInteger(str).intValue()));
            byteBufferAllocate.put(hexStr2Bytes("0424"));
            byteBufferAllocate.put(((String) AbstractC7165.m12418(String.class, "fileUuid", obj)).getBytes());
            byteBufferAllocate.put(hexStr2Bytes("0204"));
            byteBufferAllocate.put(int2Bytes((int) (System.currentTimeMillis() / 1000)));
            byteBufferAllocate.put(hexStr2Bytes("041F0000000866696C6574797065000000013100000005636F64656300000001300400"));
            byteBufferAllocate.flip();
            return String.format("http://grouptalk.c2c.qq.com/?ver=0&rkey=%s&filetype=1&voice_codec=" + AbstractC7165.m12418(Integer.TYPE, "voiceType", obj), bytes2HexStr(byteBufferAllocate.array()));
        } catch (Exception e) {
            Log.d("报错:获取语音链接", String.valueOf(e));
            return "";
        }
    }

    public static String getVideoUrl(String str, Object obj) {
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(256);
            byteBufferAllocate.put(hexStr2Bytes("3081FD0201010481F53081F20201010201000204"));
            byteBufferAllocate.put(int2Bytes(new BigInteger(str).intValue()));
            byteBufferAllocate.put(hexStr2Bytes("0481A6"));
            byteBufferAllocate.put(((String) AbstractC7165.m12418(String.class, "fileUuid", obj)).getBytes());
            byteBufferAllocate.put(hexStr2Bytes("0204"));
            long jCurrentTimeMillis = System.currentTimeMillis();
            byteBufferAllocate.put(int2Bytes((int) (jCurrentTimeMillis / 1000)));
            byteBufferAllocate.put(hexStr2Bytes("04350000000866696C657479706500000004313030330000000B646F776E656E63727970740000000130000000047175696300000001310400"));
            byteBufferAllocate.flip();
            return String.format("http://grouptalk.c2c.qq.com/qqdownload?ver=537101242&rkey=%s&filetype=1003&videotype=0&subvideotype=0&term=android&video_codec=0&filename=" + jCurrentTimeMillis + ".mp4", bytes2HexStr(byteBufferAllocate.array()));
        } catch (Exception e) {
            Log.d("报错:获取视频链接", String.valueOf(e));
            return "";
        }
    }

    private static byte[] hexStr2Bytes(String str) {
        return (byte[]) XposedHelpers.callStaticMethod(AbstractC7166.m12425("com.tencent.mobileqq.utils.HexUtil"), "hexStr2Bytes", new Class[]{String.class}, new Object[]{str});
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
