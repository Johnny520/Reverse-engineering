package com.android.dx.util;

import androidx.activity.AbstractC0053;
import bsh.C2633;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;
import p144.C7547;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ByteArray {
    private final byte[] bytes;
    private final int size;
    private final int start;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface GetCursor {
        int getCursor();
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class MyDataInputStream extends DataInputStream {
        private final MyInputStream wrapped;

        public MyDataInputStream(MyInputStream myInputStream) {
            super(myInputStream);
            this.wrapped = myInputStream;
        }
    }

    public ByteArray(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            C2633.m5343("bytes == null");
            throw null;
        }
        if (i < 0) {
            C5925.m11310("start < 0");
            throw null;
        }
        if (i2 < i) {
            C5925.m11310("end < start");
            throw null;
        }
        if (i2 > bArr.length) {
            C5925.m11310("end > bytes.length");
            throw null;
        }
        this.bytes = bArr;
        this.start = i;
        this.size = i2 - i;
    }

    private void checkOffsets(int i, int i2) {
        if (i < 0 || i2 < i || i2 > this.size) {
            C7547.m12776(AbstractC0053.m149(i, i2, "bad range: ", "..", "; actual size "), this.size);
        }
    }

    private int getByte0(int i) {
        return this.bytes[this.start + i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getUnsignedByte0(int i) {
        return this.bytes[this.start + i] & DefaultClassResolver.NAME;
    }

    public int getByte(int i) {
        checkOffsets(i, i + 1);
        return getByte0(i);
    }

    public void getBytes(byte[] bArr, int i) {
        int length = bArr.length - i;
        int i2 = this.size;
        if (length >= i2) {
            System.arraycopy(this.bytes, this.start, bArr, i, i2);
        } else {
            C7547.m12772("(out.length - offset) < size()");
        }
    }

    public int getInt(int i) {
        checkOffsets(i, i + 4);
        return getUnsignedByte0(i + 3) | (getByte0(i) << 24) | (getUnsignedByte0(i + 1) << 16) | (getUnsignedByte0(i + 2) << 8);
    }

    public long getLong(int i) {
        checkOffsets(i, i + 8);
        int byte0 = (getByte0(i) << 24) | (getUnsignedByte0(i + 1) << 16) | (getUnsignedByte0(i + 2) << 8) | getUnsignedByte0(i + 3);
        return (((long) (getUnsignedByte0(i + 7) | (getByte0(i + 4) << 24) | (getUnsignedByte0(i + 5) << 16) | (getUnsignedByte0(i + 6) << 8))) & 4294967295L) | (((long) byte0) << 32);
    }

    public int getShort(int i) {
        checkOffsets(i, i + 2);
        return getUnsignedByte0(i + 1) | (getByte0(i) << 8);
    }

    public int getUnsignedByte(int i) {
        checkOffsets(i, i + 1);
        return getUnsignedByte0(i);
    }

    public int getUnsignedShort(int i) {
        checkOffsets(i, i + 2);
        return getUnsignedByte0(i + 1) | (getUnsignedByte0(i) << 8);
    }

    public MyDataInputStream makeDataInputStream() {
        return new MyDataInputStream(makeInputStream());
    }

    public MyInputStream makeInputStream() {
        return new MyInputStream();
    }

    public int size() {
        return this.size;
    }

    public ByteArray slice(int i, int i2) {
        checkOffsets(i, i2);
        return new ByteArray(Arrays.copyOfRange(this.bytes, i, i2));
    }

    public int underlyingOffset(int i) {
        return this.start + i;
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public class MyInputStream extends InputStream {
        private int cursor = 0;
        private int mark = 0;

        public MyInputStream() {
        }

        @Override // java.io.InputStream
        public int available() {
            return ByteArray.this.size - this.cursor;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.mark = this.cursor;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            int i3 = ByteArray.this.size - this.cursor;
            if (i2 > i3) {
                i2 = i3;
            }
            System.arraycopy(ByteArray.this.bytes, ByteArray.this.start + this.cursor, bArr, i, i2);
            this.cursor += i2;
            return i2;
        }

        @Override // java.io.InputStream
        public void reset() {
            this.cursor = this.mark;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.cursor >= ByteArray.this.size) {
                return -1;
            }
            int unsignedByte0 = ByteArray.this.getUnsignedByte0(this.cursor);
            this.cursor++;
            return unsignedByte0;
        }
    }

    public ByteArray(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }
}
