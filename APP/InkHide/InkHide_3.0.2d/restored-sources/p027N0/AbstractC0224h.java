package p027N0;

import java.io.Serializable;

/* JADX INFO: renamed from: N0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0224h implements Serializable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        AbstractC0229m.f569a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        AbstractC0223g.m417d(string, "renderLambdaToString(...)");
        return string;
    }
}
