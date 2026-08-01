package p254v4;

import org.luckypray.dexkit.DexKitBridge;
import p032F3.AbstractC0453a;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: v4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3355b extends AbstractC0453a {

    /* JADX INFO: renamed from: e */
    public final String f10423e;

    /* JADX INFO: renamed from: f */
    public final C3357d f10424f;

    public C3355b(DexKitBridge dexKitBridge, String str, C3357d c3357d) {
        super(dexKitBridge, -1, -1);
        this.f10423e = str;
        this.f10424f = c3357d;
    }

    public final String toString() {
        String str = this.f10423e + " = " + this.f10424f;
        AbstractC1665j.m2984d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
