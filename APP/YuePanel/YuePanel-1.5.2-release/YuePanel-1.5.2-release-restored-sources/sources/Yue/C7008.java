package Yue;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥۡۦ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7008 extends AbstractC4485 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public File f21150;

    public C7008(@InterfaceC6490 AbstractC4485 abstractC4485, File file) {
        super(abstractC4485);
        this.f21150 = file;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static boolean m21805(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zM21805 = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zM21805 &= m21805(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    zM21805 = false;
                }
            }
        }
        return zM21805;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static String m21806(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return C5375.f13186;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(iLastIndexOf + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : C5375.f13186;
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ */
    public boolean mo1408() {
        return this.f21150.canRead();
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo1409() {
        return this.f21150.canWrite();
    }

    @Override // Yue.AbstractC4485
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ */
    public AbstractC4485 mo13034(String str) {
        File file = new File(this.f21150, str);
        if (file.isDirectory() || file.mkdir()) {
            return new C7008(this, file);
        }
        return null;
    }

    @Override // Yue.AbstractC4485
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public AbstractC4485 mo13035(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f21150, str2);
        try {
            file.createNewFile();
            return new C7008(this, file);
        } catch (IOException e) {
            Log.w("DocumentFile", "Failed to createFile: " + e);
            return null;
        }
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo13036() {
        m21805(this.f21150);
        return this.f21150.delete();
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo13037() {
        return this.f21150.exists();
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public String mo13039() {
        return this.f21150.getName();
    }

    @Override // Yue.AbstractC4485
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public String mo13041() {
        if (this.f21150.isDirectory()) {
            return null;
        }
        return m21806(this.f21150.getName());
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public Uri mo13042() {
        return Uri.fromFile(this.f21150);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo13043() {
        return this.f21150.isDirectory();
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public boolean mo13044() {
        return this.f21150.isFile();
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public boolean mo13045() {
        return false;
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public long mo13046() {
        return this.f21150.lastModified();
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public long mo13047() {
        return this.f21150.length();
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public AbstractC4485[] mo13048() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = this.f21150.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                arrayList.add(new C7008(this, file));
            }
        }
        return (AbstractC4485[]) arrayList.toArray(new AbstractC4485[arrayList.size()]);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public boolean mo13049(String str) {
        File file = new File(this.f21150.getParentFile(), str);
        if (!this.f21150.renameTo(file)) {
            return false;
        }
        this.f21150 = file;
        return true;
    }
}
