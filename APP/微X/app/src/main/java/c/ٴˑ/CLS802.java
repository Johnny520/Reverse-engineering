// Decompiled by JEB v5.42.0.202606242140

package c.ٴˑ;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CLS802 extends CLS299 {
    public File FLD1357;

    public CLS802(CLS299 ـᵎ0, File file0) {
        super(ـᵎ0);
        this.FLD1357 = file0;
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4373() {
        return this.FLD1357.canWrite();
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4375() {
        CLS802.MTH4420(this.FLD1357);
        return this.FLD1357.delete();
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4376() {
        return this.FLD1357.isDirectory();
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4377() {
        return this.FLD1357.canRead();
    }

    @Override  // c.ٴˑ.CLS299
    public String MTH4378() {
        return this.FLD1357.getName();
    }

    public static String MTH4414(String s) {
        int v = s.lastIndexOf(46);
        if(v >= 0) {
            String s1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s.substring(v + 1).toLowerCase());
            return s1 == null ? "application/octet-stream" : s1;
        }
        return "application/octet-stream";
    }

    @Override  // c.ٴˑ.CLS299
    public Uri MTH4379() {
        return Uri.fromFile(this.FLD1357);
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4381() {
        return this.FLD1357.isFile();
    }

    @Override  // c.ٴˑ.CLS299
    public long MTH4382() {
        return this.FLD1357.lastModified();
    }

    // 去混淆评级： 低(20)
    @Override  // c.ٴˑ.CLS299
    public String MTH4384() {
        return this.FLD1357.isDirectory() ? null : CLS802.MTH4414(this.FLD1357.getName());
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4385(String s) {
        File file0 = new File(this.FLD1357.getParentFile(), s);
        if(this.FLD1357.renameTo(file0)) {
            this.FLD1357 = file0;
            return true;
        }
        return false;
    }

    public static boolean MTH4420(File file0) {
        File[] arr_file = file0.listFiles();
        boolean z = true;
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                if(file1.isDirectory()) {
                    z &= CLS802.MTH4420(file1);
                }
                if(!file1.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file1);
                    z = false;
                }
            }
        }
        return z;
    }

    @Override  // c.ٴˑ.CLS299
    public CLS299 MTH4386(String s) {
        File file0 = new File(this.FLD1357, s);
        return !file0.isDirectory() && !file0.mkdir() ? null : new CLS802(((CLS299)this), file0);
    }

    @Override  // c.ٴˑ.CLS299
    public CLS299[] MTH4387() {
        ArrayList arrayList0 = new ArrayList();
        File[] arr_file = this.FLD1357.listFiles();
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                arrayList0.add(new CLS802(((CLS299)this), arr_file[v]));
            }
        }
        return (CLS299[])arrayList0.toArray(new CLS299[arrayList0.size()]);
    }

    @Override  // c.ٴˑ.CLS299
    public boolean MTH4390() {
        return this.FLD1357.exists();
    }

    @Override  // c.ٴˑ.CLS299
    public CLS299 MTH4391(String s, String s1) {
        String s2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(s);
        if(s2 != null) {
            s1 = s1 + "." + s2;
        }
        File file0 = new File(this.FLD1357, s1);
        try {
            file0.createNewFile();
            return new CLS802(((CLS299)this), file0);
        }
        catch(IOException iOException0) {
            Log.w("DocumentFile", "Failed to createFile: " + iOException0);
            return null;
        }
    }
}

