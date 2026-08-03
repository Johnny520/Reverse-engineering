package Yue;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 Util.kt\nokio/-SegmentedByteString\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n43#2,7:365\n53#2:372\n56#2:373\n64#2,4:374\n68#2:379\n70#2:381\n76#2,23:382\n104#2,23:405\n131#2,2:428\n133#2,9:431\n145#2:440\n148#2:441\n151#2:442\n154#2:443\n162#2:444\n172#2,3:445\n171#2:448\n185#2,2:449\n190#2:451\n194#2:452\n198#2:453\n202#2:454\n206#2,7:455\n219#2:462\n223#2,8:463\n235#2,4:471\n244#2,5:475\n253#2,6:480\n259#2,9:487\n322#2,8:496\n131#2,2:504\n133#2,9:507\n333#2,9:516\n68#3:378\n74#3:380\n74#3:486\n1#4:430\n1#4:506\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString\n*L\n66#1:365,7\n71#1:372\n108#1:373\n110#1:374,4\n110#1:379\n110#1:381\n112#1:382,23\n114#1:405,23\n118#1:428,2\n118#1:431,9\n120#1:440\n129#1:441\n131#1:442\n133#1:443\n152#1:444\n159#1:445,3\n159#1:448\n166#1:449,2\n168#1:451\n170#1:452\n172#1:453\n174#1:454\n180#1:455,7\n183#1:462\n186#1:463,8\n188#1:471,4\n190#1:475,5\n192#1:480,6\n192#1:487,9\n194#1:496,8\n194#1:504,2\n194#1:507,9\n194#1:516,9\n110#1:378\n110#1:380\n192#1:486\n118#1:430\n194#1:506\n*E\n"})
public class C3630 implements Serializable, Comparable<C3630> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final long f6371 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final byte[] f6373;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public transient int f6374;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6489
    public transient String f6375;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0198 f6370 = new C0198(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C3630 f6372 = new C3630(new byte[0]);

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۥۤ$ۥ */
    @InterfaceC7507({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n271#2:365\n275#2,3:366\n282#2,3:369\n289#2,2:372\n295#2:374\n297#2,7:376\n1#3:375\n1#3:383\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n*L\n234#1:365\n239#1:366,3\n251#1:369,3\n259#1:372,2\n262#1:374\n262#1:376,7\n262#1:375\n*E\n"})
    public static final class C0198 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟ۥۤ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0198(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static /* synthetic */ C3630 m9866(C0198 c0198, String str, Charset charset, int i, Object obj) {
            if ((i & 1) != 0) {
                charset = C3794.f505;
            }
            return c0198.m9875(str, charset);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static /* synthetic */ C3630 m9867(C0198 c0198, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = C2963.m5678();
            }
            return c0198.m9879(bArr, i, i2);
        }

        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @InterfaceC5572(name = "-deprecated_decodeBase64")
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final C3630 m687(@InterfaceC6399 String str) {
            C5499.m17103(str, "string");
            return m9873(str);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @InterfaceC5572(name = "-deprecated_decodeHex")
        /* JADX INFO: renamed from: ۥ۟ */
        public final C3630 m688(@InterfaceC6399 String str) {
            C5499.m17103(str, "string");
            return m9874(str);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @InterfaceC5572(name = "-deprecated_encodeString")
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C3630 m9868(@InterfaceC6399 String str, @InterfaceC6399 Charset charset) {
            C5499.m17103(str, "string");
            C5499.m17103(charset, "charset");
            return m9875(str, charset);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @InterfaceC5572(name = "-deprecated_encodeUtf8")
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C3630 m9869(@InterfaceC6399 String str) {
            C5499.m17103(str, "string");
            return m9876(str);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @InterfaceC5572(name = "-deprecated_of")
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C3630 m9870(@InterfaceC6399 ByteBuffer byteBuffer) {
            C5499.m17103(byteBuffer, "buffer");
            return m9877(byteBuffer);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @InterfaceC5572(name = "-deprecated_of")
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C3630 m9871(@InterfaceC6399 byte[] bArr, int i, int i2) {
            C5499.m17103(bArr, "array");
            return m9879(bArr, i, i2);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @InterfaceC5572(name = "-deprecated_read")
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final C3630 m9872(@InterfaceC6399 InputStream inputStream, int i) {
            C5499.m17103(inputStream, "inputstream");
            return m9880(inputStream, i);
        }

        @InterfaceC5578
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final C3630 m9873(@InterfaceC6399 String str) {
            C5499.m17103(str, "<this>");
            byte[] bArrM0 = C0000.m0(str);
            if (bArrM0 != null) {
                return new C3630(bArrM0);
            }
            return null;
        }

        /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۟۟.ۥ۟(char):int */
        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final C3630 m9874(@InterfaceC6399 String str) {
            C5499.m17103(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((C2949.m5544(str.charAt(i2)) << 4) + C2949.m5544(str.charAt(i2 + 1)));
            }
            return new C3630(bArr);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "encodeString")
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final C3630 m9875(@InterfaceC6399 String str, @InterfaceC6399 Charset charset) {
            C5499.m17103(str, "<this>");
            C5499.m17103(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
            return new C3630(bytes);
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final C3630 m9876(@InterfaceC6399 String str) {
            C5499.m17103(str, "<this>");
            C3630 c3630 = new C3630(C8582.m4551(str));
            c3630.m9848(str);
            return c3630;
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "of")
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final C3630 m9877(@InterfaceC6399 ByteBuffer byteBuffer) {
            C5499.m17103(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new C3630(bArr);
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final C3630 m9878(@InterfaceC6399 byte... bArr) {
            C5499.m17103(bArr, "data");
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            C5499.m17102(bArrCopyOf, "copyOf(this, size)");
            return new C3630(bArrCopyOf);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "of")
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final C3630 m9879(@InterfaceC6399 byte[] bArr, int i, int i2) {
            C5499.m17103(bArr, "<this>");
            int iM5685 = C2963.m5685(bArr, i2);
            C2963.m5677(bArr.length, i, iM5685);
            return new C3630(C3404.m7159(bArr, i, iM5685 + i));
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "read")
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final C3630 m9880(@InterfaceC6399 InputStream inputStream, int i) throws IOException {
            C5499.m17103(inputStream, "<this>");
            if (i < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
            }
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = inputStream.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    throw new EOFException();
                }
                i2 += i3;
            }
            return new C3630(bArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0198() {
        }
    }

    public C3630(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "data");
        this.f6373 = bArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m9800(C3630 c3630, int i, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        c3630.mo9819(i, bArr, i2, i3);
    }

    @InterfaceC5578
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final C3630 m9801(@InterfaceC6399 String str) {
        return f6370.m9873(str);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final C3630 m9802(@InterfaceC6399 String str) {
        return f6370.m9874(str);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "encodeString")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final C3630 m9803(@InterfaceC6399 String str, @InterfaceC6399 Charset charset) {
        return f6370.m9875(str, charset);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final C3630 m9804(@InterfaceC6399 String str) {
        return f6370.m9876(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ int m9805(C3630 c3630, C3630 c36302, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c3630.m9834(c36302, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ int m9806(C3630 c3630, byte[] bArr, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c3630.mo9836(bArr, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static /* synthetic */ int m9807(C3630 c3630, C3630 c36302, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i2 & 2) != 0) {
            i = C2963.m5678();
        }
        return c3630.m9840(c36302, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static /* synthetic */ int m9808(C3630 c3630, byte[] bArr, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i2 & 2) != 0) {
            i = C2963.m5678();
        }
        return c3630.mo9842(bArr, i);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "of")
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final C3630 m9809(@InterfaceC6399 ByteBuffer byteBuffer) {
        return f6370.m9877(byteBuffer);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C3630 m9810(@InterfaceC6399 byte... bArr) {
        return f6370.m9878(bArr);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "of")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final C3630 m9811(@InterfaceC6399 byte[] bArr, int i, int i2) {
        return f6370.m9879(bArr, i, i2);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "read")
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final C3630 m9812(@InterfaceC6399 InputStream inputStream, int i) throws IOException {
        return f6370.m9880(inputStream, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static /* synthetic */ C3630 m9813(C3630 c3630, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = C2963.m5678();
        }
        return c3630.mo9858(i, i2);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3630) {
            C3630 c3630 = (C3630) obj;
            if (c3630.m9852() == m9824().length && c3630.mo9845(0, m9824(), 0, m9824().length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iM9825 = m9825();
        if (iM9825 != 0) {
            return iM9825;
        }
        int iHashCode = Arrays.hashCode(m9824());
        m9847(iHashCode);
        return iHashCode;
    }

    @InterfaceC6399
    public String toString() {
        String str;
        if (m9824().length == 0) {
            str = "[size=0]";
        } else {
            int iM5512 = C2949.m5512(m9824(), 64);
            if (iM5512 != -1) {
                String strM9862 = m9862();
                String strSubstring = strM9862.substring(0, iM5512);
                C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strM23998 = C7627.m23998(C7627.m23998(C7627.m23998(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (iM5512 >= strM9862.length()) {
                    return "[text=" + strM23998 + ']';
                }
                return "[size=" + m9824().length + " text=" + strM23998 + "…]";
            }
            if (m9824().length > 64) {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(m9824().length);
                sb.append(" hex=");
                int iM5684 = C2963.m5684(this, 64);
                if (iM5684 <= m9824().length) {
                    if (iM5684 < 0) {
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    sb.append((iM5684 == m9824().length ? this : new C3630(C3404.m7159(m9824(), 0, iM5684))).mo9828());
                    sb.append("…]");
                    return sb.toString();
                }
                throw new IllegalArgumentException(("endIndex > length(" + m9824().length + ')').toString());
            }
            str = "[hex=" + mo9828() + ']';
        }
        return str;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to operator function", replaceWith = @InterfaceC7097(expression = "this[index]", imports = {}))
    @InterfaceC5572(name = "-deprecated_getByte")
    /* JADX INFO: renamed from: ۥ */
    public final byte m686(int i) {
        return m9823(i);
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "size", imports = {}))
    @InterfaceC5572(name = "-deprecated_size")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m9814() {
        return m9852();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public ByteBuffer mo9815() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.f6373).asReadOnlyBuffer();
        C5499.m17102(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public String mo9816() {
        return C0000.m5444(m9824(), null, 1, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public String mo9817() {
        return C0000.m1(m9824(), C0000.m5447());
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int compareTo(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "other");
        int iM9852 = m9852();
        int iM98522 = c3630.m9852();
        int iMin = Math.min(iM9852, iM98522);
        for (int i = 0; i < iMin; i++) {
            int iM9823 = m9823(i) & 255;
            int iM98232 = c3630.m9823(i) & 255;
            if (iM9823 == iM98232) {
            }
        }
        if (iM9852 == iM98522) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo9819(int i, @InterfaceC6399 byte[] bArr, int i2, int i3) {
        C5499.m17103(bArr, "target");
        C3404.m7123(m9824(), bArr, i2, i, i3 + i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public C3630 mo9820(@InterfaceC6399 String str) throws NoSuchAlgorithmException {
        C5499.m17103(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f6373, 0, m9852());
        byte[] bArrDigest = messageDigest.digest();
        C5499.m17100(bArrDigest);
        return new C3630(bArrDigest);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final boolean m9821(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "suffix");
        return mo9844(m9852() - c3630.m9852(), c3630, 0, c3630.m9852());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final boolean m9822(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "suffix");
        return mo9845(m9852() - bArr.length, bArr, 0, bArr.length);
    }

    @InterfaceC5572(name = "getByte")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final byte m9823(int i) {
        return mo9838(i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final byte[] m9824() {
        return this.f6373;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int m9825() {
        return this.f6374;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int mo9826() {
        return m9824().length;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final String m9827() {
        return this.f6375;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public String mo9828() {
        char[] cArr = new char[m9824().length * 2];
        int i = 0;
        for (byte b : m9824()) {
            int i2 = i + 1;
            cArr[i] = C2949.m5545()[(b >> 4) & 15];
            i += 2;
            cArr[i2] = C2949.m5545()[b & 15];
        }
        return C7627.m23957(cArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public C3630 mo9829(@InterfaceC6399 String str, @InterfaceC6399 C3630 c3630) throws NoSuchAlgorithmException {
        C5499.m17103(str, "algorithm");
        C5499.m17103(c3630, C6659.f17103);
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(c3630.mo9861(), str));
            byte[] bArrDoFinal = mac.doFinal(this.f6373);
            C5499.m17102(bArrDoFinal, "doFinal(...)");
            return new C3630(bArrDoFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public C3630 m9830(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, C6659.f17103);
        return mo9829("HmacSHA1", c3630);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public C3630 m9831(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, C6659.f17103);
        return mo9829("HmacSHA256", c3630);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public C3630 m9832(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, C6659.f17103);
        return mo9829("HmacSHA512", c3630);
    }

    @InterfaceC5573
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final int m9833(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "other");
        return m9805(this, c3630, 0, 2, null);
    }

    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final int m9834(@InterfaceC6399 C3630 c3630, int i) {
        C5499.m17103(c3630, "other");
        return mo9836(c3630.mo9837(), i);
    }

    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final int m9835(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "other");
        return m9806(this, bArr, 0, 2, null);
    }

    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public int mo9836(@InterfaceC6399 byte[] bArr, int i) {
        C5499.m17103(bArr, "other");
        int length = m9824().length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax <= length) {
            while (!C2963.m5676(m9824(), iMax, bArr, 0, bArr.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public byte[] mo9837() {
        return m9824();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public byte mo9838(int i) {
        return m9824()[i];
    }

    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final int m9839(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "other");
        return m9807(this, c3630, 0, 2, null);
    }

    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final int m9840(@InterfaceC6399 C3630 c3630, int i) {
        C5499.m17103(c3630, "other");
        return mo9842(c3630.mo9837(), i);
    }

    @InterfaceC5573
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final int m9841(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "other");
        return m9808(this, bArr, 0, 2, null);
    }

    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public int mo9842(@InterfaceC6399 byte[] bArr, int i) {
        C5499.m17103(bArr, "other");
        for (int iMin = Math.min(C2963.m5684(this, i), m9824().length - bArr.length); -1 < iMin; iMin--) {
            if (C2963.m5676(m9824(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final C3630 m9843() {
        return mo9820("MD5");
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean mo9844(int i, @InterfaceC6399 C3630 c3630, int i2, int i3) {
        C5499.m17103(c3630, "other");
        return c3630.mo9845(i2, m9824(), i, i3);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public boolean mo9845(int i, @InterfaceC6399 byte[] bArr, int i2, int i3) {
        C5499.m17103(bArr, "other");
        return i >= 0 && i <= m9824().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C2963.m5676(m9824(), i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public final void m9846(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        C3630 c3630M9880 = f6370.m9880(objectInputStream, objectInputStream.readInt());
        Field declaredField = C3630.class.getDeclaredField("ۥۣ۟۟۠");
        declaredField.setAccessible(true);
        declaredField.set(this, c3630M9880.f6373);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public final void m9847(int i) {
        this.f6374 = i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final void m9848(@InterfaceC6489 String str) {
        this.f6375 = str;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public final C3630 m9849() {
        return mo9820("SHA-1");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final C3630 m9850() {
        return mo9820("SHA-256");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public final C3630 m9851() {
        return mo9820("SHA-512");
    }

    @InterfaceC5572(name = "size")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public final int m9852() {
        return mo9826();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public final boolean m9853(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "prefix");
        return mo9844(0, c3630, 0, c3630.m9852());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public final boolean m9854(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "prefix");
        return mo9845(0, bArr, 0, bArr.length);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public String mo9855(@InterfaceC6399 Charset charset) {
        C5499.m17103(charset, "charset");
        return new String(this.f6373, charset);
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final C3630 m9856() {
        return m9813(this, 0, 0, 3, null);
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public final C3630 m9857(int i) {
        return m9813(this, i, 0, 2, null);
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public C3630 mo9858(int i, int i2) {
        int iM5684 = C2963.m5684(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (iM5684 <= m9824().length) {
            if (iM5684 - i >= 0) {
                return (i == 0 && iM5684 == m9824().length) ? this : new C3630(C3404.m7159(m9824(), i, iM5684));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + m9824().length + ')').toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public C3630 mo9859() {
        for (int i = 0; i < m9824().length; i++) {
            byte b = m9824()[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrM9824 = m9824();
                byte[] bArrCopyOf = Arrays.copyOf(bArrM9824, bArrM9824.length);
                C5499.m17102(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C3630(bArrCopyOf);
            }
        }
        return this;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public C3630 mo9860() {
        for (int i = 0; i < m9824().length; i++) {
            byte b = m9824()[i];
            if (b >= 97 && b <= 122) {
                byte[] bArrM9824 = m9824();
                byte[] bArrCopyOf = Arrays.copyOf(bArrM9824, bArrM9824.length);
                C5499.m17102(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        bArrCopyOf[i2] = (byte) (b2 - 32);
                    }
                }
                return new C3630(bArrCopyOf);
            }
        }
        return this;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public byte[] mo9861() {
        byte[] bArrM9824 = m9824();
        byte[] bArrCopyOf = Arrays.copyOf(bArrM9824, bArrM9824.length);
        C5499.m17102(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public String m9862() {
        String strM9827 = m9827();
        if (strM9827 != null) {
            return strM9827;
        }
        String strM28586 = C8582.m28586(mo9837());
        m9848(strM28586);
        return strM28586;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public void mo9863(@InterfaceC6399 OutputStream outputStream) throws IOException {
        C5499.m17103(outputStream, "out");
        outputStream.write(this.f6373);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public void mo9864(@InterfaceC6399 C3600 c3600, int i, int i2) {
        C5499.m17103(c3600, "buffer");
        C2949.m5543(this, c3600, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public final void m9865(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f6373.length);
        objectOutputStream.write(this.f6373);
    }
}
