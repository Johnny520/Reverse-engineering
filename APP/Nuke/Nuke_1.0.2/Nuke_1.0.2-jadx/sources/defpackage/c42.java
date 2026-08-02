package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public enum c42 {
    j("http/1.0"),
    k("http/1.1"),
    l("spdy/3.1"),
    m("h2"),
    n("h2_prior_knowledge"),
    o("quic"),
    p("h3");

    public static final i51 i = new i51(14);
    public final String h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    c42(String str) {
        this.h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return this.h;
    }
}
