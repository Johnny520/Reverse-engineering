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

    public C1098Zh(Uri uri, int i, int i2, boolean z, int i3) {
        uri.getClass();
        this.f3485a = uri;
        this.f3486b = i;
        this.f3487c = i2;
        this.f3488d = z;
        this.f3489e = null;
        this.f3490f = i3;
    }

    public C1098Zh(String str, String str2) {
        this.f3485a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f3486b = 0;
        this.f3487c = 400;
        this.f3488d = false;
        this.f3489e = str2;
        this.f3490f = 0;
    }
}
