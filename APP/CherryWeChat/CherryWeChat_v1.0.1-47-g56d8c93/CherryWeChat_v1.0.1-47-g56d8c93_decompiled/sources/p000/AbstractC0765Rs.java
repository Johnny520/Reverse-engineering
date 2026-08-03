package p000;

/* JADX INFO: renamed from: Rs */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0765Rs {

    /* JADX INFO: renamed from: a */
    public static final C0723Qs f2434a;

    /* JADX INFO: renamed from: b */
    public static final C0723Qs f2435b;

    static {
        C0723Qs c0723Qs = null;
        try {
            c0723Qs = (C0723Qs) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2434a = c0723Qs;
        f2435b = new C0723Qs();
    }
}
