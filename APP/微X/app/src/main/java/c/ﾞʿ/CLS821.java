// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʿ;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CLS821 extends CLS367 {
    public File FLD1661;

    public CLS821(CLS367 ʾʻ0, File file0) {
        super(ʾʻ0);
        this.FLD1661 = file0;
    }

    @Override  // c.ﾞʿ.CLS367
    public CLS367 MTH5049(String s) {
        File file0 = new File(this.FLD1661, s);
        return !file0.isDirectory() && !file0.mkdir() ? null : new CLS821(((CLS367)this), file0);
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5052() {
        CLS821.MTH5112(this.FLD1661);
        return this.FLD1661.delete();
    }

    // 去混淆评级： 低(20)
    @Override  // c.ﾞʿ.CLS367
    public String MTH5053() {
        return this.FLD1661.isDirectory() ? null : CLS821.MTH5110(this.FLD1661.getName());
    }

    @Override  // c.ﾞʿ.CLS367
    public CLS367 MTH5054(String s, String s1) {
        String s2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(s);
        if(s2 != null) {
            s1 = s1 + "." + s2;
        }
        File file0 = new File(this.FLD1661, s1);
        try {
            file0.createNewFile();
            return new CLS821(((CLS367)this), file0);
        }
        catch(IOException iOException0) {
            Log.w("DocumentFile", "Failed to createFile: " + iOException0);
            return null;
        }
    }

    @Override  // c.ﾞʿ.CLS367
    public String MTH5055() {
        return this.FLD1661.getName();
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5056() {
        return this.FLD1661.exists();
    }

    @Override  // c.ﾞʿ.CLS367
    public Uri MTH5057() {
        return Uri.fromFile(this.FLD1661);
    }

    public static String MTH5110(String s) {
        int v = s.lastIndexOf(46);
        if(v >= 0) {
            String s1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s.substring(v + 1).toLowerCase());
            return s1 == null ? "application/octet-stream" : s1;
        }
        return "application/octet-stream";
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5058(String s) {
        File file0 = new File(this.FLD1661.getParentFile(), s);
        if(this.FLD1661.renameTo(file0)) {
            this.FLD1661 = file0;
            return true;
        }
        return false;
    }

    public static boolean MTH5112(File file0) {
        File[] arr_file = file0.listFiles();
        boolean z = true;
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                if(file1.isDirectory()) {
                    z &= CLS821.MTH5112(file1);
                }
                if(!file1.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file1);
                    z = false;
                }
            }
        }
        return z;
    }

    @Override  // c.ﾞʿ.CLS367
    public long MTH5059() {
        return this.FLD1661.lastModified();
    }

    @Override  // c.ﾞʿ.CLS367
    public CLS367[] MTH5060() {
        ArrayList arrayList0 = new ArrayList();
        File[] arr_file = this.FLD1661.listFiles();
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                arrayList0.add(new CLS821(((CLS367)this), arr_file[v]));
            }
        }
        return (CLS367[])arrayList0.toArray(new CLS367[arrayList0.size()]);
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5061() {
        return this.FLD1661.isDirectory();
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5064() {
        return this.FLD1661.canRead();
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5065() {
        return this.FLD1661.isFile();
    }

    @Override  // c.ﾞʿ.CLS367
    public boolean MTH5067() {
        return this.FLD1661.canWrite();
    }
}

