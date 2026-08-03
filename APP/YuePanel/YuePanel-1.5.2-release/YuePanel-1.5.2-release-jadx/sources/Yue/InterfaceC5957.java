package Yue;

import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5957 {

    /* JADX INFO: renamed from: Yue.ۥۡ۟۟$ۥ */
    public static final class C0908 {
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public static C0909 m2619(@InterfaceC6399 InterfaceC5957 interfaceC5957) {
            return new C0909(interfaceC5957);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۟۟$ۥ۟ */
    public static final class C0909 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final InterfaceC5957 f1796;

        public C0909(@InterfaceC6399 InterfaceC5957 interfaceC5957) {
            C5499.m17103(interfaceC5957, "match");
            this.f1796 = interfaceC5957;
        }

        @InterfaceC5438
        /* JADX INFO: renamed from: ۥ */
        public final String m2620() {
            return m18720().mo2618().get(1);
        }

        @InterfaceC5438
        /* JADX INFO: renamed from: ۥ۟ */
        public final String m2621() {
            return m18720().mo2618().get(10);
        }

        @InterfaceC5438
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final String m18712() {
            return m18720().mo2618().get(2);
        }

        @InterfaceC5438
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final String m18713() {
            return m18720().mo2618().get(3);
        }

        @InterfaceC5438
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final String m18714() {
            return m18720().mo2618().get(4);
        }

        @InterfaceC5438
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final String m18715() {
            return m18720().mo2618().get(5);
        }

        @InterfaceC5438
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final String m18716() {
            return m18720().mo2618().get(6);
        }

        @InterfaceC5438
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final String m18717() {
            return m18720().mo2618().get(7);
        }

        @InterfaceC5438
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final String m18718() {
            return m18720().mo2618().get(8);
        }

        @InterfaceC5438
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final String m18719() {
            return m18720().mo2618().get(9);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final InterfaceC5957 m18720() {
            return this.f1796;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final List<String> m18721() {
            return this.f1796.mo2618().subList(1, this.f1796.mo2618().size());
        }
    }

    @InterfaceC6399
    C5458 getRange();

    @InterfaceC6399
    String getValue();

    @InterfaceC6489
    InterfaceC5957 next();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    C0909 mo2617();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    List<String> mo2618();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    InterfaceC0907 mo18711();
}
