package Yue;

import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۣۢۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C8114 extends IOException {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final String f24037;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final String f24038;

    public C8114(String str, String str2, String str3) {
        super(str);
        this.f24037 = str2;
        this.f24038 = str3;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Mimetype=" + this.f24037 + ", URL=" + this.f24038;
    }

    /* JADX INFO: renamed from: ۥ */
    public String m4145() {
        return this.f24037;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public String m4146() {
        return this.f24038;
    }
}
