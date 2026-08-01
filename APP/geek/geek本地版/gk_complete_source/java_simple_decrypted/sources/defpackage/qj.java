package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class qj extends m {
    public final h9 b;

    public qj() {
        this.b = new h9(1);
    }

    @Override // defpackage.m
    public final Random d() {
        Object r0 = this.b.get();
        ip.n("get(...)", r0);
        return (Random) r0;
    }
}
