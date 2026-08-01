package p051db;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: renamed from: db.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1942d {
    /* JADX INFO: renamed from: a */
    public final InputStream m7048a(String str) throws IOException {
        str.getClass();
        ClassLoader classLoader = C1942d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
