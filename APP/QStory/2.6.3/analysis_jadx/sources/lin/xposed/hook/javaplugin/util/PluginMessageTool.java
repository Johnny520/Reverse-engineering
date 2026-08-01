package lin.xposed.hook.javaplugin.util;

import android.util.Log;
import com.android.dx.io.Opcodes;
import de.robv.android.xposed.XposedHelpers;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginMessageTool {
    private static String bytes2HexStr(byte[] bArr) {
        return (String) XposedHelpers.callStaticMethod(AbstractC6337.m11866(AbstractC8405.m13972(728)), AbstractC8405.m13972(729), new Class[]{byte[].class}, new Object[]{bArr});
    }

    public static String getAudioUrl(String str, Object obj) {
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(100);
            byteBufferAllocate.put(hexStr2Bytes(AbstractC8405.m13972(718)));
            byteBufferAllocate.put(int2Bytes(new BigInteger(str).intValue()));
            byteBufferAllocate.put(hexStr2Bytes(AbstractC8405.m13973("喵呜喵喵喵喵呜呜~喵呜喵喵喵喵喵呜~喵呜喵喵呜喵喵喵~喵呜喵呜呜呜喵喵")));
            byteBufferAllocate.put(((String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(719), obj)).getBytes());
            byteBufferAllocate.put(hexStr2Bytes(AbstractC8405.m13973("喵呜喵喵喵喵呜呜~喵呜喵喵喵呜呜呜~喵呜喵喵呜喵呜喵~喵呜喵呜呜呜喵喵")));
            byteBufferAllocate.put(int2Bytes((int) (System.currentTimeMillis() / 1000)));
            byteBufferAllocate.put(hexStr2Bytes(AbstractC8405.m13972(720)));
            byteBufferAllocate.flip();
            return String.format(AbstractC8405.m13972(721) + AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(722), obj), bytes2HexStr(byteBufferAllocate.array()));
        } catch (Exception e) {
            Log.d(AbstractC8405.m13972(723), String.valueOf(e));
            return "";
        }
    }

    public static String getVideoUrl(String str, Object obj) {
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(256);
            byteBufferAllocate.put(hexStr2Bytes(AbstractC8405.m13972(724)));
            byteBufferAllocate.put(int2Bytes(new BigInteger(str).intValue()));
            byteBufferAllocate.put(hexStr2Bytes(AbstractC8405.m13973("喵呜喵喵喵喵呜呜~喵呜喵喵喵喵喵呜~喵呜喵喵喵喵呜喵~喵呜喵呜呜喵喵呜~喵喵呜喵喵呜喵喵~喵呜喵呜呜喵呜喵")));
            byteBufferAllocate.put(((String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(719), obj)).getBytes());
            byteBufferAllocate.put(hexStr2Bytes(AbstractC8405.m13973("喵呜喵喵喵喵呜呜~喵呜喵喵喵呜呜呜~喵呜喵喵呜喵呜喵~喵呜喵呜呜呜喵喵")));
            long jCurrentTimeMillis = System.currentTimeMillis();
            byteBufferAllocate.put(int2Bytes((int) (jCurrentTimeMillis / 1000)));
            byteBufferAllocate.put(hexStr2Bytes(AbstractC8405.m13972(725)));
            byteBufferAllocate.flip();
            return String.format(AbstractC8405.m13972(726) + jCurrentTimeMillis + AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜呜喵喵喵~喵喵喵喵呜喵呜喵~喵呜喵呜呜呜喵喵"), bytes2HexStr(byteBufferAllocate.array()));
        } catch (Exception e) {
            Log.d(AbstractC8405.m13972(727), String.valueOf(e));
            return "";
        }
    }

    private static byte[] hexStr2Bytes(String str) {
        return (byte[]) XposedHelpers.callStaticMethod(AbstractC6337.m11866(AbstractC8405.m13972(728)), AbstractC8405.m13972(730), new Class[]{String.class}, new Object[]{str});
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
