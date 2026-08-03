package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4089 implements java.util.function.Function {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ com.google.android.material.color.utilities.MaterialDynamicColors f12504;

    public /* synthetic */ C4089(com.google.android.material.color.utilities.MaterialDynamicColors r1) {
            r0 = this;
            r0.<init>()
            r0.f12504 = r1
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors r0 = r1.f12504
            com.google.android.material.color.utilities.DynamicScheme r2 = (com.google.android.material.color.utilities.DynamicScheme) r2
            com.google.android.material.color.utilities.DynamicColor r2 = r0.highestSurface(r2)
            return r2
    }
}
