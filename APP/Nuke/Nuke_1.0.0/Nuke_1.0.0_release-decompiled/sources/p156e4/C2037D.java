package p156e4;

import java.io.IOException;

/* JADX INFO: renamed from: e4.D */
/* JADX INFO: loaded from: classes.dex */
public final class C2037D extends IOException {

    /* JADX INFO: renamed from: d */
    public final EnumC2039b f6782d;

    public C2037D(EnumC2039b enumC2039b) {
        super("stream was reset: " + enumC2039b);
        this.f6782d = enumC2039b;
    }
}
