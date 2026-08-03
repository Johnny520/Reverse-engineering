package Yue;

import Yue.C4483;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4486 extends AbstractC5693 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final String f9435 = "PUBLIC";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final String f9436 = "SYSTEM";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final String f9437 = "name";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final String f9438 = "pubSysKey";

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final String f9439 = "publicId";

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final String f9440 = "systemId";

    public C4486(String str, String str2, String str3) {
        C8159.m26910(str);
        C8159.m26910(str2);
        C8159.m26910(str3);
        mo13684("name", str);
        mo13684(f9439, str2);
        mo13684(f9440, str3);
        m13055();
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public String mo9885() {
        return "#doctype";
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public void mo9886(Appendable appendable, int i, C4483.C0414 c0414) throws IOException {
        if (this.f16149 > 0 && c0414.m13027()) {
            appendable.append('\n');
        }
        if (c0414.m13028() != C4483.C0414.EnumC4484.html || m13050(f9439) || m13050(f9440)) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (m13050("name")) {
            appendable.append(" ").append(mo17594("name"));
        }
        if (m13050(f9438)) {
            appendable.append(" ").append(mo17594(f9438));
        }
        if (m13050(f9439)) {
            appendable.append(" \"").append(mo17594(f9439)).append(C8039.f3212);
        }
        if (m13050(f9440)) {
            appendable.append(" \"").append(mo17594(f9440)).append(C8039.f3212);
        }
        appendable.append(C8039.f23876);
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo9887(Appendable appendable, int i, C4483.C0414 c0414) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public final boolean m13050(String str) {
        return !C7615.m23815(mo17594(str));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public String m13051() {
        return mo17594("name");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public String m13052() {
        return mo17594(f9439);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public void m13053(String str) {
        if (str != null) {
            mo13684(f9438, str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public String m13054() {
        return mo17594(f9440);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public final void m13055() {
        if (m13050(f9439)) {
            mo13684(f9438, f9435);
        } else if (m13050(f9440)) {
            mo13684(f9438, f9436);
        }
    }
}
