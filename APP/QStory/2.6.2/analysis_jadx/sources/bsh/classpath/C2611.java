package bsh.classpath;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2611 extends AbstractC2607 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f7819;

    public String toString() {
        switch (this.f7819) {
            case 0:
                return "Dir: " + this.f7800;
            case 1:
            default:
                return super.toString();
            case 2:
                return "Jrt: " + this.f7800;
        }
    }

    @Override // bsh.classpath.AbstractC2607
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final byte[] mo5099(String str) {
        switch (this.f7819) {
            case 0:
                File file = new File((File) this.f7800, str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, File.separatorChar) + ClassFileLocator.CLASS_FILE_EXTENSION);
                if (!file.exists()) {
                    return null;
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                        try {
                            byte[] bArr = new byte[(int) file.length()];
                            dataInputStream.readFully(bArr);
                            dataInputStream.close();
                            dataInputStream.close();
                            fileInputStream.close();
                            return bArr;
                        } finally {
                            try {
                                break;
                            } catch (Throwable th) {
                            }
                        }
                    } finally {
                        try {
                            break;
                        } catch (Throwable th2) {
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException("Couldn't load file: " + file, e);
                }
            case 1:
                return (byte[]) this.f7800;
            default:
                try {
                    DataInputStream dataInputStream2 = new DataInputStream((InputStream) new URL(this.f7800 + ("/" + str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ClassFileLocator.CLASS_FILE_EXTENSION)).getContent());
                    try {
                        byte[] bArr2 = new byte[dataInputStream2.available()];
                        dataInputStream2.readFully(bArr2);
                        dataInputStream2.close();
                        return bArr2;
                    } finally {
                        try {
                            break;
                        } catch (Throwable th3) {
                        }
                    }
                } catch (IOException unused) {
                    return new byte[0];
                }
        }
    }
}
