package org.apache.commons.io;

import com.android.dx.io.Opcodes;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Objects;
import net.bytebuddy.pool.TypePool;
import p376.AbstractC8985;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ByteOrderMark implements Serializable {
    public static final char UTF_BOM = 65279;
    private static final long serialVersionUID = 1;
    private final int[] bytes;
    private final String charsetName;
    public static final ByteOrderMark UTF_8 = new ByteOrderMark(StandardCharsets.UTF_8.name(), 239, 187, 191);
    public static final ByteOrderMark UTF_16BE = new ByteOrderMark(StandardCharsets.UTF_16BE.name(), Opcodes.CONST_METHOD_HANDLE, Opcodes.CONST_METHOD_TYPE);
    public static final ByteOrderMark UTF_16LE = new ByteOrderMark(StandardCharsets.UTF_16LE.name(), Opcodes.CONST_METHOD_TYPE, Opcodes.CONST_METHOD_HANDLE);
    public static final ByteOrderMark UTF_32BE = new ByteOrderMark("UTF-32BE", 0, 0, Opcodes.CONST_METHOD_HANDLE, Opcodes.CONST_METHOD_TYPE);
    public static final ByteOrderMark UTF_32LE = new ByteOrderMark("UTF-32LE", Opcodes.CONST_METHOD_TYPE, Opcodes.CONST_METHOD_HANDLE, 0, 0);

    public ByteOrderMark(String str, int... iArr) {
        Objects.requireNonNull(str, "charsetName");
        Objects.requireNonNull(iArr, "bytes");
        if (str.isEmpty()) {
            C5925.m11310("No charsetName specified");
            throw null;
        }
        if (iArr.length == 0) {
            C5925.m11310("No bytes specified");
            throw null;
        }
        this.charsetName = str;
        this.bytes = (int[]) iArr.clone();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ByteOrderMark)) {
            return false;
        }
        ByteOrderMark byteOrderMark = (ByteOrderMark) obj;
        if (this.bytes.length != byteOrderMark.length()) {
            return false;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.bytes;
            if (i >= iArr.length) {
                return true;
            }
            if (iArr[i] != byteOrderMark.get(i)) {
                return false;
            }
            i++;
        }
    }

    public int get(int i) {
        return this.bytes[i];
    }

    public byte[] getBytes() {
        int length = this.bytes.length;
        byte[] bArr = AbstractC8985.f25215;
        byte[] bArr2 = new byte[length];
        int i = 0;
        while (true) {
            int[] iArr = this.bytes;
            if (i >= iArr.length) {
                return bArr2;
            }
            bArr2[i] = (byte) iArr[i];
            i++;
        }
    }

    public String getCharsetName() {
        return this.charsetName;
    }

    public int[] getRawBytes() {
        return this.bytes;
    }

    public int hashCode() {
        int iHashCode = getClass().hashCode();
        for (int i : this.bytes) {
            iHashCode += i;
        }
        return iHashCode;
    }

    public int length() {
        return this.bytes.length;
    }

    public boolean matches(int[] iArr) {
        int length;
        int[] iArr2 = this.bytes;
        if (iArr2 == iArr) {
            return true;
        }
        if (iArr == null || iArr.length < (length = iArr2.length)) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (this.bytes[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        sb.append(this.charsetName);
        sb.append(": ");
        for (int i = 0; i < this.bytes.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("0x");
            sb.append(Integer.toHexString(this.bytes[i] & Opcodes.CONST_METHOD_TYPE).toUpperCase(Locale.ROOT));
        }
        sb.append(']');
        return sb.toString();
    }
}
