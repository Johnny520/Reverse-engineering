package Yue;

import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5384 extends IOException {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f13229;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final String f13230;

    public C5384(String str, int i, String str2) {
        super(str + ". Status=" + i + ", URL=[" + str2 + "]");
        this.f13229 = i;
        this.f13230 = str2;
    }

    /* JADX INFO: renamed from: ۥ */
    public int m2140() {
        return this.f13229;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public String m2141() {
        return this.f13230;
    }
}
