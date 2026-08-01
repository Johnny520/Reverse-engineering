package p037T;

import java.io.IOException;
import java.io.StringWriter;
import p042W.AbstractC0352x;
import p042W.C0348t;
import p051b0.C0494c;

/* JADX INFO: renamed from: T.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0264o {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public int mo487a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C0494c c0494c = new C0494c(stringWriter);
            c0494c.f1569f = true;
            C0348t c0348t = AbstractC0352x.f800a;
            C0258i.m475d(c0494c, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
