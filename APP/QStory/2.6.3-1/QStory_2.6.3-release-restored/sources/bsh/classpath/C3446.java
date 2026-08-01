package bsh.classpath;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3446 extends AbstractC3441 {
    public C3446(URL url) {
        this.f8147 = url;
    }

    public final String toString() {
        return "Jar: " + this.f8147;
    }

    @Override // bsh.classpath.AbstractC3441
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final byte[] mo5704(String str) {
        String str2 = "/" + str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ClassFileLocator.CLASS_FILE_EXTENSION;
        try {
            URLClassLoader uRLClassLoader = new URLClassLoader(new URL[]{(URL) this.f8147});
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
