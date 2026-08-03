package p052dd;

import be.C0271b;
import be.C0275d;
import be.C0279f;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.jar.Manifest;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;

/* JADX INFO: renamed from: dd.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0770a {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2844b f2320a = AbstractC2846d.m6274b(AbstractC0770a.class);

    /* JADX INFO: renamed from: b */
    public static String f2321b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static ArrayList m1987a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0279f());
        arrayList.add(new C0275d());
        arrayList.add(new C0271b(13));
        arrayList.add(new C0271b(6));
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m1988b() {
        String value;
        ClassLoader classLoader;
        if (f2321b == null) {
            try {
                classLoader = AbstractC0770a.class.getClassLoader();
            } catch (Exception e6) {
                f2320a.mo6251e("Can't get manifest file", e6);
            }
            if (classLoader != null) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/MANIFEST.MF");
                while (resources.hasMoreElements()) {
                    InputStream inputStreamOpenStream = resources.nextElement().openStream();
                    try {
                        value = new Manifest(inputStreamOpenStream).getMainAttributes().getValue("jadx-version");
                        if (value != null) {
                            if (inputStreamOpenStream != null) {
                                inputStreamOpenStream.close();
                            }
                            f2321b = value;
                        } else if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } finally {
                    }
                }
                value = "dev";
                f2321b = value;
            } else {
                value = "dev";
                f2321b = value;
            }
        }
        return f2321b;
    }
}
