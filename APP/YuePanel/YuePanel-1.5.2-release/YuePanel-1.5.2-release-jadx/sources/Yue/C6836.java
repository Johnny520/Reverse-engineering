package Yue;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: Yue.ۥۡۥۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6836 implements InterfaceC5398 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final Pattern f2341 = Pattern.compile(" ");

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Pattern f17743 = Pattern.compile(",");

    /* JADX INFO: renamed from: ۥ */
    public final String f2342;

    public C6836(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.f2342 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f2342.equals(((C6836) obj).f2342);
    }

    public int hashCode() {
        return this.f2342.hashCode();
    }

    @Override // Yue.InterfaceC5398
    public String toString() {
        return mo2171();
    }

    @Override // Yue.InterfaceC5398
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC5398 mo2170() {
        return new C6836(mo2171());
    }

    @Override // Yue.InterfaceC5398
    /* JADX INFO: renamed from: ۥ۟ */
    public String mo2171() {
        return this.f2342;
    }

    @Override // Yue.InterfaceC5398
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo16884(String str) {
        if ("".equals(this.f2342)) {
            return true;
        }
        for (String str2 : f17743.split(f2341.matcher(str).replaceAll(""))) {
            if (this.f2342.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
