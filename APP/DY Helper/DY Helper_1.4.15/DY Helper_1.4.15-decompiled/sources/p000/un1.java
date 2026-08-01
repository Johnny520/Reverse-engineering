package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class un1 {

    /* JADX INFO: renamed from: α */
    public final android.content.res.ColorStateList f10915;

    /* JADX INFO: renamed from: β */
    public final android.content.res.Configuration f10916;

    /* JADX INFO: renamed from: γ */
    public final int f10917;

    public un1(android.content.res.ColorStateList r1, android.content.res.Configuration r2, android.content.res.Resources.Theme r3) {
            r0 = this;
            r0.<init>()
            r0.f10915 = r1
            r0.f10916 = r2
            if (r3 != 0) goto Lb
            r1 = 0
            goto Lf
        Lb:
            int r1 = r3.hashCode()
        Lf:
            r0.f10917 = r1
            return
    }
}
