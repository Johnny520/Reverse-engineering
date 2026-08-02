package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k31 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            o41 o41Var = new o41(stringWriter);
            o41Var.o = 1;
            v53.z.getClass();
            q31.e(o41Var, this);
            return stringWriter.toString();
        } catch (IOException e) {
            s.i(e);
            return null;
        }
    }
}
