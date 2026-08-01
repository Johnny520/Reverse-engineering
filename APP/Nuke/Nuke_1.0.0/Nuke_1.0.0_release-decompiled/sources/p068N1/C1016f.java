package p068N1;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: N1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1016f extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1017g f3153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1016f(C1017g c1017g, int i5) {
        super(i5);
        this.f3153d = c1017g;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i5 = ((ByteArrayOutputStream) this).count;
        if (i5 > 0 && ((ByteArrayOutputStream) this).buf[i5 - 1] == 13) {
            i5--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i5, this.f3153d.f3155e.name());
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }
}
