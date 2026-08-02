package p000;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fv2 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ gv2 f3151h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv2(gv2 gv2Var, int i) {
        super(i);
        this.f3151h = gv2Var;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.f3151h.f3712i.name());
        } catch (UnsupportedEncodingException e) {
            C0676s.m4650i(e);
            return null;
        }
    }
}
