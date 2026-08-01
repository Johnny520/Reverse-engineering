package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: cq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0123cq implements InterfaceC0024an, Serializable {

    /* JADX INFO: renamed from: a */
    public final int f1314a;

    public AbstractC0123cq(int i) {
        this.f1314a = i;
    }

    @Override // p000.InterfaceC0024an
    /* JADX INFO: renamed from: b */
    public final int mo115b() {
        return this.f1314a;
    }

    public final String toString() {
        j00.f2515a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        AbstractC0346ip.m1502n("renderLambdaToString(...)", string);
        return string;
    }
}
