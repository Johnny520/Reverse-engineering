package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public enum c42 {
    f1137j("http/1.0"),
    f1138k("http/1.1"),
    f1139l("spdy/3.1"),
    f1140m("h2"),
    f1141n("h2_prior_knowledge"),
    f1142o("quic"),
    f1143p("h3");


    /* JADX INFO: renamed from: i */
    public static final i51 f1136i = new i51(14);

    /* JADX INFO: renamed from: h */
    public final String f1145h;

    c42(String str) {
        this.f1145h = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f1145h;
    }
}
