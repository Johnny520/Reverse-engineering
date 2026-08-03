package p000;

import android.net.Uri;

/* JADX INFO: renamed from: Zh */
/* JADX INFO: loaded from: classes.dex */
public final class C1098Zh {

    /* JADX INFO: renamed from: a */
    public final Uri f3485a;

    /* JADX INFO: renamed from: b */
    public final int f3486b;

    /* JADX INFO: renamed from: c */
    public final int f3487c;

    /* JADX INFO: renamed from: d */
    public final boolean f3488d;

    /* JADX INFO: renamed from: e */
    public final String f3489e;

    /* JADX INFO: renamed from: f */
    public final int f3490f;

    public C1098Zh(Uri r1, int r2, int r3, boolean r4, int r5) {
        r1.getClass();
        this.f3485a = r1;
        this.f3486b = r2;
        this.f3487c = r3;
        this.f3488d = r4;
        this.f3489e = null;
        this.f3490f = r5;
    }

    public C1098Zh(String r3, String r4) {
        this.f3485a = new Uri.Builder().scheme("systemfont").authority(r3).build();
        this.f3486b = 0;
        this.f3487c = 400;
        this.f3488d = false;
        this.f3489e = r4;
        this.f3490f = 0;
    }
}
