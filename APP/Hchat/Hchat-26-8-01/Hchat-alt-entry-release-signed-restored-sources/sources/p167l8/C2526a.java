package p167l8;

import android.content.ContentValues;

/* JADX INFO: renamed from: l8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2526a {

    /* JADX INFO: renamed from: a */
    public final String f8161a;

    /* JADX INFO: renamed from: b */
    public final String f8162b;

    /* JADX INFO: renamed from: c */
    public final long f8163c;

    /* JADX INFO: renamed from: d */
    public final ContentValues f8164d;

    /* JADX INFO: renamed from: e */
    public final String f8165e;

    /* JADX INFO: renamed from: f */
    public final String[] f8166f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2526a(String str, String str2, ContentValues contentValues, String str3, String[] strArr, long j3) {
        this.f8161a = str;
        this.f8162b = str2;
        this.f8163c = j3;
        this.f8164d = contentValues != null ? new ContentValues(contentValues) : null;
        this.f8165e = str3;
        this.f8166f = strArr != null ? (String[]) strArr.clone() : null;
    }
}
