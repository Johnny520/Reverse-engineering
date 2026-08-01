package p310v6;

/* JADX INFO: renamed from: v6.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8844e {
    /* JADX INFO: renamed from: a */
    public static final boolean m33967a() {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        if (property != null) {
            return Boolean.parseBoolean(property);
        }
        return false;
    }
}
