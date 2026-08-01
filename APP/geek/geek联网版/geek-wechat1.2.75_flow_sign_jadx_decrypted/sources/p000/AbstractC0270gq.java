package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: gq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0270gq implements InterfaceC0110cn, Serializable {

    /* JADX INFO: renamed from: a */
    public final int f2041a;

    public AbstractC0270gq(int i) {
        this.f2041a = i;
    }

    @Override // p000.InterfaceC0110cn
    /* JADX INFO: renamed from: b */
    public final int mo653b() {
        return this.f2041a;
    }

    public final String toString() {
        q00.f3767a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        AbstractC0493mp.m1856f("renderLambdaToString(...)", string);
        return string;
    }
}
