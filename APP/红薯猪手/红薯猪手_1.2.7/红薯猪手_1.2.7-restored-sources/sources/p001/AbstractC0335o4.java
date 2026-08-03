package p001;

import java.io.Serializable;

/* JADX INFO: renamed from: ۟.o4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0335o4<R> implements Serializable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C0378r8.f1064.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        C0237h4.m1089("renderLambdaToString(...)", string);
        return string;
    }
}
