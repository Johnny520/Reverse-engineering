package lin.xposed.hook.javaplugin.util;

import android.util.Log;
import com.android.p002dx.p005io.Opcodes;
import de.robv.android.xposed.XposedHelpers;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginMessageTool {
    private static String bytes2HexStr(byte[] bArr) {
        return (String) XposedHelpers.callStaticMethod(AbstractC7166.m12425(AbstractC9234.m14531(728)), AbstractC9234.m14531(729), new Class[]{byte[].class}, new Object[]{bArr});
    }

    public static String getAudioUrl(String str, Object obj) {
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(100);
            byteBufferAllocate.put(hexStr2Bytes(AbstractC9234.m14531(718)));
            byteBufferAllocate.put(int2Bytes(new BigInteger(str).intValue()));
            byteBufferAllocate.put(hexStr2Bytes(AbstractC9234.m14532("喵呜喵喵喵喵呜呜~喵呜喵喵喵喵喵呜~喵呜喵喵呜喵喵喵~喵呜喵呜呜呜喵喵")));
            byteBufferAllocate.put(((String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(719), obj)).getBytes());
            byteBufferAllocate.put(hexStr2Bytes(AbstractC9234.m14532("喵呜喵喵喵喵呜呜~喵呜喵喵喵呜呜呜~喵呜喵喵呜喵呜喵~喵呜喵呜呜呜喵喵")));
            byteBufferAllocate.put(int2Bytes((int) (System.currentTimeMillis() / 1000)));
            byteBufferAllocate.put(hexStr2Bytes(AbstractC9234.m14531(720)));
            byteBufferAllocate.flip();
            return String.format(AbstractC9234.m14531(721) + AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(722), obj), bytes2HexStr(byteBufferAllocate.array()));
        } catch (Exception e) {
            Log.d(AbstractC9234.m14531(723), String.valueOf(e));
            return "";
        }
    }

    public static String getVideoUrl(String str, Object obj) {
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(256);
            byteBufferAllocate.put(hexStr2Bytes(AbstractC9234.m14531(724)));
            byteBufferAllocate.put(int2Bytes(new BigInteger(str).intValue()));
            byteBufferAllocate.put(hexStr2Bytes(AbstractC9234.m14532("喵呜喵喵喵喵呜呜~喵呜喵喵喵喵喵呜~喵呜喵喵喵喵呜喵~喵呜喵呜呜喵喵呜~喵喵呜喵喵呜喵喵~喵呜喵呜呜喵呜喵")));
            byteBufferAllocate.put(((String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(719), obj)).getBytes());
            byteBufferAllocate.put(hexStr2Bytes(AbstractC9234.m14532("喵呜喵喵喵喵呜呜~喵呜喵喵喵呜呜呜~喵呜喵喵呜喵呜喵~喵呜喵呜呜呜喵喵")));
            long jCurrentTimeMillis = System.currentTimeMillis();
            byteBufferAllocate.put(int2Bytes((int) (jCurrentTimeMillis / 1000)));
            byteBufferAllocate.put(hexStr2Bytes(AbstractC9234.m14531(725)));
            byteBufferAllocate.flip();
            return String.format(AbstractC9234.m14531(726) + jCurrentTimeMillis + AbstractC9234.m14532("喵呜喵呜呜呜喵呜~喵喵喵呜呜喵喵喵~喵喵喵喵呜喵呜喵~喵呜喵呜呜呜喵喵"), bytes2HexStr(byteBufferAllocate.array()));
        } catch (Exception e) {
            Log.d(AbstractC9234.m14531(727), String.valueOf(e));
            return "";
        }
    }

    private static byte[] hexStr2Bytes(String str) {
        return (byte[]) XposedHelpers.callStaticMethod(AbstractC7166.m12425(AbstractC9234.m14531(728)), AbstractC9234.m14531(730), new Class[]{String.class}, new Object[]{str});
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
