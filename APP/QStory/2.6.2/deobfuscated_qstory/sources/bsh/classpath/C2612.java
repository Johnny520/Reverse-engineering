package bsh.classpath;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2612 extends AbstractC2607 {
    public C2612(URL url) {
        this.f7800 = url;
    }

    public final String toString() {
        return "Jar: " + this.f7800;
    }

    @Override // bsh.classpath.AbstractC2607
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final byte[] mo5099(String str) {
        String str2 = "/" + str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ClassFileLocator.CLASS_FILE_EXTENSION;
        try {
            URLClassLoader uRLClassLoader = new URLClassLoader(new URL[]{(URL) this.f7800});
            try {
                DataInputStream dataInputStream = new DataInputStream(uRLClassLoader.loadClass(str).getResourceAsStream(str2));
                try {
                    byte[] bArr = new byte[dataInputStream.available()];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    uRLClassLoader.close();
                    return bArr;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    uRLClassLoader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | ClassNotFoundException unused) {
            return new byte[0];
        }
    }
}
