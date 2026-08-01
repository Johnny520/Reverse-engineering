// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˊﾞ.CLS612;
import java.io.File;
import java.util.ArrayList;

public final class CLS1210 implements CLS17 {
    public final int FLD2852;
    public final Activity FLD2853;
    public final CLS29 FLD2854;
    public final CLS12 FLD2855;

    public CLS1210(CLS29 ˎᵢ0, Activity activity0, CLS12 ᵔʾ0, int v) {
        this.FLD2852 = v;
        this.FLD2854 = ˎᵢ0;
        this.FLD2853 = activity0;
        this.FLD2855 = ᵔʾ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        if(this.FLD2852 == 0) {
            Activity activity0 = this.FLD2853;
            File file0 = (File)arr_object[0];
            if(file0 != null) {
                String s = file0.getAbsolutePath();
                this.FLD2854.MTH922(s, "mp3_last_dir");
            }
            ArrayList arrayList0 = new ArrayList();
            int v = (int)(((Integer)arr_object[2]));
            if(v == 1) {
                arrayList0 = (ArrayList)arr_object[1];
            }
            else if(v == 2) {
                for(Object object0: ((ArrayList)arr_object[1])) {
                    Uri uri0 = (Uri)object0;
                    try {
                        String s1 = CLS31.MTH985(activity0, uri0);
                        String s2 = CLS31.MTH1023(uri0);
                        if(TextUtils.isEmpty(s2)) {
                            s2 = "wx_tmp_" + Long.toHexString(System.currentTimeMillis());
                        }
                        File file1 = new File(activity0.getCacheDir(), CLS31.MTH979(s2, s1));
                        CLS31.MTH1037(activity0.getContentResolver().openInputStream(uri0), file1);
                        CLS31.MTH996(file1.getAbsolutePath());
                        arrayList0.add(file1);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
            this.FLD2855.MTH791(arrayList0);
            return;
        }
        CLS612 ᵔʾ0 = new CLS612(arr_object, this.FLD2854, this.FLD2853, this.FLD2855, 25);
        CLS40.FLD157.MTH1124(((CLS39)ᵔʾ0));
    }
}

