package p230r2;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;
import p213o2.AbstractC2770B;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.Q */
/* JADX INFO: loaded from: classes.dex */
public class C3113Q extends AbstractC2770B {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        if (c3390a.m5630J() == 9) {
            c3390a.m5626F();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(c3390a.m5628H(), "_");
        String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        c3391b.m5655E(locale == null ? null : locale.toString());
    }
}
