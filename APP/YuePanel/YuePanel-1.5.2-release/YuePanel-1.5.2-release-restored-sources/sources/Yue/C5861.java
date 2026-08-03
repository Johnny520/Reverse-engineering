package Yue;

import android.content.LocusId;
import android.os.Build;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5861 {

    /* JADX INFO: renamed from: ۥ */
    public final String f1740;

    /* JADX INFO: renamed from: ۥ۟ */
    public final LocusId f1741;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۡ۠$ۥ */
    @InterfaceC7113(29)
    public static class C0886 {
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public static LocusId m2531(@InterfaceC6391 String str) {
            return new LocusId(str);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public static String m2532(@InterfaceC6391 LocusId locusId) {
            return locusId.getId();
        }
    }

    public C5861(@InterfaceC6391 String str) {
        this.f1740 = (String) C6740.m21420(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1741 = C0886.m2531(str);
        } else {
            this.f1741 = null;
        }
    }

    @InterfaceC6391
    @InterfaceC7113(29)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C5861 m18148(@InterfaceC6391 LocusId locusId) {
        C6740.m21416(locusId, "locusId cannot be null");
        return new C5861((String) C6740.m21420(C0886.m2532(locusId), "id cannot be empty"));
    }

    public boolean equals(@InterfaceC6490 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5861.class != obj.getClass()) {
            return false;
        }
        C5861 c5861 = (C5861) obj;
        String str = this.f1740;
        return str == null ? c5861.f1740 == null : str.equals(c5861.f1740);
    }

    public int hashCode() {
        String str = this.f1740;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @InterfaceC6391
    public String toString() {
        return "LocusIdCompat[" + m2530() + "]";
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public String m2529() {
        return this.f1740;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public final String m2530() {
        return this.f1740.length() + "_chars";
    }

    @InterfaceC6391
    @InterfaceC7113(29)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public LocusId m18149() {
        return this.f1741;
    }
}
