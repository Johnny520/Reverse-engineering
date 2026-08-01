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
        return (String) XposedHelpers.callStaticMethod(AbstractC6318.m11838(AbstractC3056.m6668(-3937641302846604711L)), AbstractC3056.m6668(-3937641143932814759L), new Class[]{byte[].class}, new Object[]{bArr});
    }

    public static String getAudioUrl(String str, Object obj) {
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(100);
            byteBufferAllocate.put(hexStr2Bytes(AbstractC3056.m6668(-3937625974108325287L)));
            byteBufferAllocate.put(int2Bytes(new BigInteger(str).intValue()));
            byteBufferAllocate.put(hexStr2Bytes(AbstractC3056.m6668(-3937625815194535335L)));
            byteBufferAllocate.put(((String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937625871029110183L), obj)).getBytes());
            byteBufferAllocate.put(hexStr2Bytes(AbstractC3056.m6668(-3937625772244862375L)));
            byteBufferAllocate.put(int2Bytes((int) (System.currentTimeMillis() / 1000)));
            byteBufferAllocate.put(hexStr2Bytes(AbstractC3056.m6668(-3937625793719698855L)));
            byteBufferAllocate.flip();
            return String.format(AbstractC3056.m6668(-3937625514546824615L) + AbstractC6317.m11831(Integer.TYPE, AbstractC3056.m6668(-3937625149474604455L), obj), bytes2HexStr(byteBufferAllocate.array()));
        } catch (Exception e) {
            Log.d(AbstractC3056.m6668(-3937625158064539047L), String.valueOf(e));
            return AbstractC3056.m6668(-3937561979095614887L);
        }
    }

    public static String getVideoUrl(String str, Object obj) {
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(256);
            byteBufferAllocate.put(hexStr2Bytes(AbstractC3056.m6668(-3937625063575258535L)));
            byteBufferAllocate.put(int2Bytes(new BigInteger(str).intValue()));
            byteBufferAllocate.put(hexStr2Bytes(AbstractC3056.m6668(-3937624964791010727L)));
            byteBufferAllocate.put(((String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937625871029110183L), obj)).getBytes());
            byteBufferAllocate.put(hexStr2Bytes(AbstractC3056.m6668(-3937625772244862375L)));
            long jCurrentTimeMillis = System.currentTimeMillis();
            byteBufferAllocate.put(int2Bytes((int) (jCurrentTimeMillis / 1000)));
            byteBufferAllocate.put(hexStr2Bytes(AbstractC3056.m6668(-3937624857416828327L)));
            byteBufferAllocate.flip();
            return String.format(AbstractC3056.m6668(-3937624423625131431L) + jCurrentTimeMillis + AbstractC3056.m6668(-3937641341501310375L), bytes2HexStr(byteBufferAllocate.array()));
        } catch (Exception e) {
            Log.d(AbstractC3056.m6668(-3937641397335885223L), String.valueOf(e));
            return AbstractC3056.m6668(-3937561979095614887L);
        }
    }

    private static byte[] hexStr2Bytes(String str) {
        return (byte[]) XposedHelpers.callStaticMethod(AbstractC6318.m11838(AbstractC3056.m6668(-3937641302846604711L)), AbstractC3056.m6668(-3937641096688174503L), new Class[]{String.class}, new Object[]{str});
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
