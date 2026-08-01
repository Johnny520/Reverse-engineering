package p000;

import java.util.Random;

/* JADX INFO: renamed from: m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0467m extends AbstractC0049az {
    @Override // p000.AbstractC0049az
    /* JADX INFO: renamed from: a */
    public final int mo478a(int i) {
        return ((-i) >> 31) & (mo1772d().nextInt() >>> (32 - i));
    }

    @Override // p000.AbstractC0049az
    /* JADX INFO: renamed from: b */
    public final int mo479b() {
        return mo1772d().nextInt();
    }

    /* JADX INFO: renamed from: d */
    public abstract Random mo1772d();
}
