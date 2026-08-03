package a;

/* JADX INFO: renamed from: a.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0488z0 extends a.X1 {
    public final java.lang.String b;
    public final a.B0 c;

    public C0488z0(org.luckypray.dexkit.DexKitBridge r2, java.lang.String r3, a.B0 r4) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0, r0)
            r1.b = r3
            r1.c = r4
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = " = "
            r0.append(r1)
            a.B0 r1 = r2.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            a.C0193i9.d(r0, r1)
            return r0
    }
}
