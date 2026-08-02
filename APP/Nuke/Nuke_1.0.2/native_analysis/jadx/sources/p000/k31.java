package p000;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k31 {
    /* JADX INFO: renamed from: a */
    public String mo25a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            o41 o41Var = new o41(stringWriter);
            o41Var.f7477o = 1;
            v53.f11747z.getClass();
            q31.m4050e(o41Var, this);
            return stringWriter.toString();
        } catch (IOException e) {
            C0676s.m4650i(e);
            return null;
        }
    }
}
