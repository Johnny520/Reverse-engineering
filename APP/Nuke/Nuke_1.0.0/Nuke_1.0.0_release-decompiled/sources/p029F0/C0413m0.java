package p029F0;

import p154e2.C2023b;

/* JADX INFO: renamed from: F0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0413m0 {

    /* JADX INFO: renamed from: a */
    public final C2023b f1242a;

    /* JADX INFO: renamed from: b */
    public C0373K f1243b;

    /* JADX INFO: renamed from: c */
    public final C0411l0 f1244c = new C0411l0(this, 2);

    /* JADX INFO: renamed from: d */
    public final C0411l0 f1245d = new C0411l0(this, 0);

    /* JADX INFO: renamed from: e */
    public final C0411l0 f1246e = new C0411l0(this, 1);

    public C0413m0(C2023b c2023b) {
        this.f1242a = c2023b;
    }

    /* JADX INFO: renamed from: a */
    public final C0373K m675a() {
        C0373K c0373k = this.f1243b;
        if (c0373k != null) {
            return c0373k;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
