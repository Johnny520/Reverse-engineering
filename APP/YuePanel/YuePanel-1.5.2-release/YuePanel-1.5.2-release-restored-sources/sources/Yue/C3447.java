package Yue;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3447 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f5566 = "AtomicFile";

    /* JADX INFO: renamed from: ۥ */
    public final File f293;

    /* JADX INFO: renamed from: ۥ۟ */
    public final File f294;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final File f5567;

    public C3447(@InterfaceC6391 File file) {
        this.f293 = file;
        this.f294 = new File(file.getPath() + ".new");
        this.f5567 = new File(file.getPath() + ".bak");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m9106(@InterfaceC6391 File file, @InterfaceC6391 File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e(f5566, "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e(f5566, "Failed to rename " + file + " to " + file2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m9107(@InterfaceC6391 FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void m522() {
        this.f293.delete();
        this.f294.delete();
        this.f5567.delete();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m523(@InterfaceC6490 FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!m9107(fileOutputStream)) {
            Log.e(f5566, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e(f5566, "Failed to close file output stream", e);
        }
        if (this.f294.delete()) {
            return;
        }
        Log.e(f5566, "Failed to delete new file " + this.f294);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m9108(@InterfaceC6490 FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!m9107(fileOutputStream)) {
            Log.e(f5566, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e(f5566, "Failed to close file output stream", e);
        }
        m9106(this.f294, this.f293);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public File m9109() {
        return this.f293;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public FileInputStream m9110() throws FileNotFoundException {
        if (this.f5567.exists()) {
            m9106(this.f5567, this.f293);
        }
        if (this.f294.exists() && this.f293.exists() && !this.f294.delete()) {
            Log.e(f5566, "Failed to delete outdated new file " + this.f294);
        }
        return new FileInputStream(this.f293);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public byte[] m9111() throws IOException {
        FileInputStream fileInputStreamM9110 = m9110();
        try {
            byte[] bArr = new byte[fileInputStreamM9110.available()];
            int i = 0;
            while (true) {
                int i2 = fileInputStreamM9110.read(bArr, i, bArr.length - i);
                if (i2 <= 0) {
                    return bArr;
                }
                i += i2;
                int iAvailable = fileInputStreamM9110.available();
                if (iAvailable > bArr.length - i) {
                    byte[] bArr2 = new byte[iAvailable + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            fileInputStreamM9110.close();
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public FileOutputStream m9112() throws IOException {
        if (this.f5567.exists()) {
            m9106(this.f5567, this.f293);
        }
        try {
            return new FileOutputStream(this.f294);
        } catch (FileNotFoundException unused) {
            if (!this.f294.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f294);
            }
            try {
                return new FileOutputStream(this.f294);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + this.f294, e);
            }
        }
    }
}
