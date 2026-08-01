package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends az {
    @Override // defpackage.az
    public final int a(int r3) {
        int r0 = d().nextInt() >>> (32 - r3);
        return ((-r3) >> 31) & r0;
    }

    @Override // defpackage.az
    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();
}
