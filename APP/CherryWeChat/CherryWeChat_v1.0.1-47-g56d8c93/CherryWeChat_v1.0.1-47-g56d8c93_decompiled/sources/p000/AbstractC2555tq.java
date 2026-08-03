package p000;

/* JADX INFO: renamed from: tq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2555tq {

    /* JADX INFO: renamed from: a */
    public static final C2512sq f8875a;

    /* JADX INFO: renamed from: b */
    public static final C2512sq f8876b;

    static {
        C2512sq c2512sq = null;
        try {
            c2512sq = (C2512sq) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f8875a = c2512sq;
        f8876b = new C2512sq();
    }
}
