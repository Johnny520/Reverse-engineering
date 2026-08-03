package p000;

/* JADX INFO: renamed from: Vg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0925Vg {

    /* JADX INFO: renamed from: a */
    public static final C0882Ug f2887a = new C0882Ug();

    /* JADX INFO: renamed from: b */
    public static final C0882Ug f2888b;

    static {
        C0882Ug c0882Ug = null;
        try {
            c0882Ug = (C0882Ug) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2888b = c0882Ug;
    }
}
