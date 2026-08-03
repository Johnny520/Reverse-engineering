package Yue;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;

/* JADX INFO: renamed from: Yue.ۥۡۦۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@FunctionalInterface
public interface InterfaceC7102 {

    /* JADX INFO: renamed from: Yue.ۥۡۦۤۨ$ۥ */
    public static class C1166 {

        /* JADX INFO: renamed from: ۥ */
        public final URL f2681;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Authenticator.RequestorType f2682;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final String f21454;

        public C1166(URL url, Authenticator.RequestorType requestorType, String str) {
            this.f2681 = url;
            this.f2682 = requestorType;
            this.f21454 = str;
        }

        /* JADX INFO: renamed from: ۥ */
        public PasswordAuthentication m3395(String str, String str2) {
            return new PasswordAuthentication(str, str2.toCharArray());
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m3396() {
            return this.f2682 == Authenticator.RequestorType.PROXY;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m22189() {
            return this.f2682 == Authenticator.RequestorType.SERVER;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public String m22190() {
            return this.f21454;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Authenticator.RequestorType m22191() {
            return this.f2682;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public URL m22192() {
            return this.f2681;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    PasswordAuthentication m3394(C1166 c1166);
}
