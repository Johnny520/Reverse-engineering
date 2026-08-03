package p120i3;

import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p248qf.C3544a;

/* JADX INFO: renamed from: i3.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1956a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static byte[] m4841a(ByteBuffer byteBuffer, C3544a c3544a) throws DataFormatException {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        long j3 = c3544a.f11535g;
        if (j3 > 2147483647L) {
            throw new DataFormatException(AbstractC0255e.m1018g(j3, "Entry too large: "));
        }
        int i9 = (int) j3;
        byte[] bArr = new byte[i9];
        Inflater inflater = new Inflater(true);
        inflater.setInput(byteBufferSlice);
        int iInflate = inflater.inflate(bArr);
        inflater.end();
        if (iInflate == i9) {
            return bArr;
        }
        StringBuilder sbM2258u = AbstractC0921a.m2258u(iInflate, "Unexpected size of decompressed entry: ", String.valueOf(c3544a), ", got: ", ", expected: ");
        sbM2258u.append(i9);
        throw new DataFormatException(sbM2258u.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m4842b(EditorInfo editorInfo, boolean z9) {
        editorInfo.setStylusHandwritingEnabled(z9);
    }
}
