package p048d8;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import p024b9.AbstractC1061t;
import p064e8.AbstractC2051d;
import p215oc.AbstractC5707c0;
import p215oc.AbstractC5712g;
import p215oc.InterfaceC5726u;
import p215oc.InterfaceC5728w;
import p231pc.AbstractC6061b;
import p299ub.C8614c;

/* JADX INFO: renamed from: d8.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1921a {
    /* JADX INFO: renamed from: a */
    public static final int m6967a(CharsetDecoder charsetDecoder, InterfaceC5728w interfaceC5728w, Appendable appendable, int i10) throws IOException {
        charsetDecoder.getClass();
        interfaceC5728w.getClass();
        appendable.getClass();
        if (AbstractC1061t.m3842c(m6972f(charsetDecoder), C8614c.f28652b)) {
            String strM23092c = AbstractC5707c0.m23092c(interfaceC5728w);
            appendable.append(strM23092c);
            return strM23092c.length();
        }
        long jM7400d = AbstractC2051d.m7400d(interfaceC5728w);
        appendable.append(AbstractC6061b.m24133a(AbstractC5712g.m23129a(interfaceC5728w), m6972f(charsetDecoder)));
        return (int) jM7400d;
    }

    /* JADX INFO: renamed from: b */
    public static final int m6968b(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, InterfaceC5726u interfaceC5726u) {
        charsetEncoder.getClass();
        charSequence.getClass();
        interfaceC5726u.getClass();
        byte[] bArrM6969c = m6969c(charsetEncoder, charSequence, i10, i11);
        InterfaceC5726u.m23180p(interfaceC5726u, bArrM6969c, 0, 0, 6, null);
        return bArrM6969c.length;
    }

    /* JADX INFO: renamed from: c */
    public static final byte[] m6969c(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11) {
        charsetEncoder.getClass();
        charSequence.getClass();
        if (!(charSequence instanceof String)) {
            return m6970d(charsetEncoder, charSequence, i10, i11);
        }
        if (i10 == 0) {
            String str = (String) charSequence;
            if (i11 == str.length()) {
                byte[] bytes = str.getBytes(charsetEncoder.charset());
                bytes.getClass();
                return bytes;
            }
        }
        byte[] bytes2 = ((String) charSequence).substring(i10, i11).getBytes(charsetEncoder.charset());
        bytes2.getClass();
        return bytes2;
    }

    /* JADX INFO: renamed from: d */
    public static final byte[] m6970d(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11) throws CharacterCodingException {
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i10, i11));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    /* JADX INFO: renamed from: e */
    public static final Charset m6971e(C8614c c8614c, String str) {
        c8614c.getClass();
        str.getClass();
        Charset charsetForName = Charset.forName(str);
        charsetForName.getClass();
        return charsetForName;
    }

    /* JADX INFO: renamed from: f */
    public static final Charset m6972f(CharsetDecoder charsetDecoder) {
        charsetDecoder.getClass();
        Charset charset = charsetDecoder.charset();
        charset.getClass();
        return charset;
    }

    /* JADX INFO: renamed from: g */
    public static final String m6973g(Charset charset) {
        charset.getClass();
        String strName = charset.name();
        strName.getClass();
        return strName;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m6974h(C8614c c8614c, String str) {
        c8614c.getClass();
        str.getClass();
        return Charset.isSupported(str);
    }
}
