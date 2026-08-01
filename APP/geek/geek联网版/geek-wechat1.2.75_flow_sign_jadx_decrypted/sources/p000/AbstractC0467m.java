package p000;

import java.util.Random;

/* JADX INFO: renamed from: m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0467m extends AbstractC0316hz {
    @Override // p000.AbstractC0316hz
    /* JADX INFO: renamed from: a */
    public final int mo1345a(int i) {
        return ((-i) >> 31) & (mo1789d().nextInt() >>> (32 - i));
    }

    @Override // p000.AbstractC0316hz
    /* JADX INFO: renamed from: b */
    public final int mo1346b() {
        return mo1789d().nextInt();
    }

    /* JADX INFO: renamed from: d */
    public abstract Random mo1789d();
}
