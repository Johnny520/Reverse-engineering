package p213o2;

import java.io.IOException;
import java.io.StringWriter;
import p230r2.AbstractC3127c0;
import p230r2.C3137m;
import p258w2.C3391b;

/* JADX INFO: renamed from: o2.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2788q {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C3391b c3391b = new C3391b(stringWriter);
            c3391b.f10609k = 1;
            AbstractC3127c0.f9861z.getClass();
            C3137m.m5413e(c3391b, this);
            return stringWriter.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }
}
