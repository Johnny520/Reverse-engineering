package p261rc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p010a9.InterfaceC0173a;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: rc.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6585c {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4705l f20647a = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: rc.b
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC6585c.m26154a();
        }
    });

    /* JADX INFO: renamed from: b */
    public static final InterfaceC6583a f20648b = new a();

    /* JADX INFO: renamed from: c */
    public static final C6588f f20649c;

    /* JADX INFO: renamed from: d */
    public static final boolean f20650d;

    /* JADX INFO: renamed from: rc.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6590h {
        @Override // p261rc.InterfaceC6583a
        /* JADX INFO: renamed from: a */
        public C6588f mo26153a(C6588f c6588f) throws IOException {
            c6588f.getClass();
            if (!c6588f.m26155a().exists()) {
                throw new FileNotFoundException(c6588f.m26155a().getAbsolutePath());
            }
            File canonicalFile = c6588f.m26155a().getCanonicalFile();
            canonicalFile.getClass();
            return new C6588f(canonicalFile);
        }
    }

    /* JADX INFO: renamed from: rc.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC6586d {
    }

    static {
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        f20649c = AbstractC6589g.m26156a(property);
        String property2 = System.getProperty("os.name");
        f20650d = property2 != null ? AbstractC8611a0.m33075T(property2, "Windows", false, 2, null) : false;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC6586d m26154a() {
        try {
            Class.forName("java.nio.file.Files");
            return new C6587e();
        } catch (ClassNotFoundException unused) {
            return new b();
        }
    }
}
