package p050I3;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import nuke.data.cipher.NativeCrypto;
import p053J3.C0849j;
import p053J3.C0856q;
import p117X2.AbstractC1665j;
import p213o2.C2772a;
import p213o2.C2780i;
import p213o2.C2785n;
import p213o2.C2789r;
import p224q2.C2913d;

/* JADX INFO: renamed from: I3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0801a {

    /* JADX INFO: renamed from: a */
    public static final C2785n f2578a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2913d c2913d = C2913d.f9207f;
        C2772a c2772a = C2785n.f8792i;
        Map map = Collections.EMPTY_MAP;
        C2780i c2780i = C2785n.f8791h;
        List list = Collections.EMPTY_LIST;
        f2578a = new C2785n(c2913d, c2772a, map, true, c2780i, true, 1, list, C2785n.f8793j, C2785n.f8794k, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0856q m1406a(C0849j c0849j) {
        C2785n c2785n = f2578a;
        c2785n.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            c2785n.m4975d(c0849j, C0849j.class, c2785n.m4974c(stringWriter));
            String string = stringWriter.toString();
            AbstractC1665j.m2984d(string, "toJson(...)");
            Charset charset = StandardCharsets.UTF_8;
            AbstractC1665j.m2984d(charset, "UTF_8");
            byte[] bytes = string.getBytes(charset);
            AbstractC1665j.m2984d(bytes, "getBytes(...)");
            C0804d c0804dEncryptJsonBytes = NativeCrypto.INSTANCE.encryptJsonBytes(bytes, "nuke-client-stream-v3");
            return new C0856q(3, c0804dEncryptJsonBytes.f2590d, c0804dEncryptJsonBytes.f2587a, c0804dEncryptJsonBytes.f2588b, c0804dEncryptJsonBytes.f2589c);
        } catch (IOException e5) {
            throw new C2789r(e5);
        }
    }
}
