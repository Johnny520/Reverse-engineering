// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʾᵢ.CLS27;
import b.ˑٴ.CLS110;
import b.ᐧˉ.CLS1049;
import b.ⁱʾ.CLS335;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1626;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS442 {
    public interface CLS440 {
        void MTH6221(File arg1);
    }

    public interface CLS441 {
        void MTH6222(InputStream arg1);
    }

    public String FLD4214;
    public CLS1626 FLD4215;
    public CLS1624 FLD4216;
    public final WeakReference FLD4217;
    public CLS335 FLD4218;
    public File FLD4219;
    public final ArrayList FLD4220;
    public final HashSet FLD4221;
    public AlertDialog FLD4222;
    public File FLD4223;
    public File FLD4224;

    public CLS442(Activity activity0) {
        this.FLD4217 = new WeakReference(activity0);
        this.FLD4220 = new ArrayList();
        this.FLD4221 = new HashSet();
    }

    // 此方法包含解密的字符串
    public final void MTH6224(String s) {
        boolean z = CLS502.MTH6934(s, new String[]{","});
        HashSet hashSet0 = this.FLD4221;
        if(z) {
            Collections.addAll(hashSet0, s.split(","));
            return;
        }
        hashSet0.add(s);
    }

    // 此方法包含解密的字符串
    public final void MTH6225(String s, CLS440 ˎᵢ$ٴـ0) {
        public final class CLS1430 implements CLS11 {
            public final CLS440 FLD4212;
            public final CLS442 FLD4213;

            public CLS1430(CLS440 ˎᵢ$ٴـ0) {
                this.FLD4212 = ˎᵢ$ٴـ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS440 ˎᵢ$ٴـ0 = this.FLD4212;
                if(ˎᵢ$ٴـ0 != null) {
                    try {
                        ˎᵢ$ٴـ0.MTH6221(CLS442.this.FLD4219);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }

        try {
            if(TextUtils.isEmpty(s)) {
                s = this.FLD4214;
            }
            if(this.FLD4222 != null && this.FLD4222.isShowing()) {
                this.FLD4222.dismiss();
            }
            String s1 = CLS27.MTH889("select");
            Activity activity0 = this.MTH6227();
            this.FLD4222 = CLS523.MTH7160(activity0, s1, ((CLS17)new CLS1049(this, activity0, s, 4)), ((CLS11)new CLS1430(this, ˎᵢ$ٴـ0)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final void MTH6226(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.FLD4214 = s;
    }

    public final Activity MTH6227() {
        return (Activity)this.FLD4217.get();
    }

    public final void MTH6228(CLS440 ˎᵢ$ٴـ0) {
        this.MTH6225(this.FLD4214, ˎᵢ$ٴـ0);
    }

    // 此方法包含解密的字符串
    public final void MTH6229() {
        String s;
        CLS1626 ـﹳ0;
        try {
            if(this.FLD4224 == null) {
                return;
            }
            if(this.FLD4219 == null) {
                ـﹳ0 = this.FLD4215;
                s = "";
            }
            else {
                ـﹳ0 = this.FLD4215;
                s = "<b>" + this.FLD4219.getAbsolutePath() + "</b>";
            }
            ـﹳ0.MTH800(s);
            ArrayList arrayList0 = this.FLD4220;
            if(this.FLD4223 == this.FLD4224) {
                if(this.FLD4219 != null && this.FLD4219.isFile()) {
                    for(Object object0: arrayList0) {
                        ContentValues contentValues0 = (ContentValues)object0;
                        if(contentValues0.containsKey("enable")) {
                            contentValues0.remove("enable");
                        }
                        if(contentValues0.getAsString("content").equals(this.FLD4219.getName())) {
                            contentValues0.put("enable", Boolean.TRUE);
                        }
                    }
                }
                this.FLD4218.notifyDataSetChanged();
                return;
            }
            arrayList0.clear();
            ContentValues contentValues1 = new ContentValues();
            contentValues1.put("content", "|wx_prev_dir|");
            contentValues1.put("desc", "< ---");
            arrayList0.add(contentValues1);
            File[] arr_file = this.FLD4224.listFiles();
            if(arr_file != null) {
                ArrayList arrayList1 = new ArrayList(Arrays.asList(arr_file));
                Collections.sort(arrayList1, new CLS110(1));
                Iterator iterator1 = arrayList1.iterator();
                while(iterator1.hasNext()) {
                    boolean z = false;
                    Object object1 = iterator1.next();
                    File file0 = (File)object1;
                    HashSet hashSet0 = this.FLD4221;
                    if(hashSet0.contains("*")) {
                        z = true;
                    }
                    else if(!hashSet0.isEmpty() && file0.isFile()) {
                        String s1 = file0.getName();
                        int v = s1.lastIndexOf(".");
                        if(v != -1) {
                            z = hashSet0.contains(s1.substring(v + 1));
                        }
                    }
                    if(file0.isDirectory() || z) {
                        String s2 = file0.getName();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("content", s2);
                        contentValues2.put("desc", s2);
                        contentValues2.put("path", file0.getAbsolutePath());
                        if(this.FLD4219 != null && this.FLD4219.isFile()) {
                            contentValues2.put("enable", Boolean.TRUE);
                        }
                        if(z) {
                            String s3 = s2.toLowerCase();
                            if(s3.endsWith(".mp3")) {
                                contentValues2.put("mp3", file0.getAbsolutePath());
                            }
                            else if(s3.endsWith(".jpg") || s3.endsWith(".jpeg") || s3.endsWith(".png")) {
                                contentValues2.put("img", file0.getAbsolutePath());
                            }
                            else if(s3.endsWith(".mp4")) {
                                contentValues2.put("vid", file0.getAbsolutePath());
                            }
                            else if(s3.endsWith(".gif")) {
                                contentValues2.put("gif", file0.getAbsolutePath());
                            }
                        }
                        arrayList0.add(contentValues2);
                    }
                }
                this.FLD4218.MTH5111(arrayList0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

