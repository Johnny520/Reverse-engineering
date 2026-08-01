package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class cq implements an, Serializable {
    public final int a;

    public cq(int r1) {
        this.a = r1;
    }

    @Override // defpackage.an
    public final int b() {
        return this.a;
    }

    public final String toString() {
        j00.a.getClass();
        String r0 = getClass().getGenericInterfaces()[0].toString();
        if (r0.startsWith("kotlin.jvm.functions.") == false) goto L5;
        r0 = r0.substring(21);
    L5:
        ip.n("renderLambdaToString(...)", r0);
        return r0;
    }
}
