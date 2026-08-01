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
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3445 extends AbstractC3441 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f8166;

    public String toString() {
        switch (this.f8166) {
            case 0:
                return "Dir: " + this.f8147;
            case 1:
            default:
                return super.toString();
            case 2:
                return "Jrt: " + this.f8147;
        }
    }

    @Override // bsh.classpath.AbstractC3441
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final byte[] mo5704(String str) {
        switch (this.f8166) {
            case 0:
                File file = new File((File) this.f8147, str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, File.separatorChar) + ClassFileLocator.CLASS_FILE_EXTENSION);
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
                return (byte[]) this.f8147;
            default:
                try {
                    DataInputStream dataInputStream2 = new DataInputStream((InputStream) new URL(this.f8147 + ("/" + str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ClassFileLocator.CLASS_FILE_EXTENSION)).getContent());
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
