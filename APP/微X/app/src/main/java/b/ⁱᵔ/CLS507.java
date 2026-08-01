// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˑٴ.CLS110;
import b.ᐧˉ.CLS1049;
import b.ⁱʾ.CLS359;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1626;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public final class CLS507 {
    public interface CLS506 {
        void MTH6975(File arg1, ArrayList arg2);
    }

    public CLS359 FLD4996;
    public CLS1624 FLD4997;
    public String FLD4998;
    public final WeakReference FLD4999;
    public File FLD5000;
    public File FLD5001;
    public final ArrayList FLD5002;
    public final HashSet FLD5003;
    public AlertDialog FLD5004;
    public CLS1626 FLD5005;
    public File FLD5006;

    public CLS507(Activity activity0) {
        this.FLD4999 = new WeakReference(activity0);
        this.FLD5002 = new ArrayList();
        this.FLD5003 = new HashSet();
    }

    public final Activity MTH6977() {
        return (Activity)this.FLD4999.get();
    }

    // 此方法包含解密的字符串
    public final void MTH6978() {
        boolean z;
        try {
            if(this.FLD5001 == null) {
                return;
            }
            this.FLD5005.MTH800("<b>" + this.FLD5001.getName() + "</b>");
            ArrayList arrayList0 = this.FLD5002;
            if(this.FLD5006 != this.FLD5001) {
                this.FLD4996.MTH5238();
                arrayList0.clear();
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("content", "|wx_prev_dir|");
                contentValues0.put("desc", "< ---");
                arrayList0.add(contentValues0);
                File[] arr_file = this.FLD5001.listFiles();
                if(arr_file != null) {
                    ArrayList arrayList1 = new ArrayList(Arrays.asList(arr_file));
                    Collections.sort(arrayList1, new CLS110(2));
                    for(Object object0: arrayList1) {
                        File file0 = (File)object0;
                        HashSet hashSet0 = this.FLD5003;
                        if(hashSet0.contains("*")) {
                            z = true;
                        }
                        else {
                            if(!hashSet0.isEmpty() && file0.isFile()) {
                                String s = file0.getName();
                                int v = s.lastIndexOf(".");
                                if(v != -1) {
                                    z = hashSet0.contains(s.substring(v + 1));
                                    goto label_30;
                                }
                            }
                            z = false;
                        }
                    label_30:
                        if((file0.isDirectory() || z) && (!file0.isDirectory() || !CLS31.MTH987(file0))) {
                            String s1 = file0.getName();
                            ContentValues contentValues1 = new ContentValues();
                            contentValues1.put("content", s1);
                            if(file0.isDirectory()) {
                                contentValues1.put("desc", "<i>" + s1 + "</i>");
                            }
                            else {
                                contentValues1.put("desc", s1);
                            }
                            contentValues1.put("path", file0.getAbsolutePath());
                            if(z) {
                                String s2 = s1.toLowerCase();
                                if(s2.endsWith(".mp3")) {
                                    contentValues1.put("mp3", file0.getAbsolutePath());
                                }
                                else if(s2.endsWith(".jpg") || s2.endsWith(".jpeg") || s2.endsWith(".png")) {
                                    contentValues1.put("img", file0.getAbsolutePath());
                                }
                                else if(s2.endsWith(".mp4")) {
                                    contentValues1.put("vid", file0.getAbsolutePath());
                                }
                                else if(s2.endsWith(".gif")) {
                                    contentValues1.put("gif", file0.getAbsolutePath());
                                }
                            }
                            arrayList0.add(contentValues1);
                        }
                    }
                    this.FLD4996.MTH5235(arrayList0);
                }
            }
            else if(this.FLD5000 != null && this.FLD5000.isFile()) {
                String s3 = this.FLD5000.getAbsolutePath();
                for(Object object1: arrayList0) {
                    ContentValues contentValues2 = (ContentValues)object1;
                    if(s3.equals(contentValues2.getAsString("path"))) {
                        this.FLD4996.MTH5233(this.FLD4996.FLD3426.indexOf(contentValues2));
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH6979(String s, CLS506 ﹳˊ$ᵔʾ0) {
        public final class CLS1589 implements CLS11 {
            public final CLS506 FLD4994;
            public final CLS507 FLD4995;

            public CLS1589(CLS506 ﹳˊ$ᵔʾ0) {
                this.FLD4994 = ﹳˊ$ᵔʾ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS507 ﹳˊ0 = CLS507.this;
                CLS506 ﹳˊ$ᵔʾ0 = this.FLD4994;
                if(ﹳˊ$ᵔʾ0 != null) {
                    try {
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object0: ﹳˊ0.FLD4996.MTH5234()) {
                            arrayList0.add(new File(((ContentValues)object0).getAsString("path")));
                        }
                        ﹳˊ$ᵔʾ0.MTH6975(ﹳˊ0.FLD5001, arrayList0);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }

        try {
            if(TextUtils.isEmpty(s)) {
                s = this.FLD4998;
            }
            if(this.FLD5004 != null && this.FLD5004.isShowing()) {
                this.FLD5004.dismiss();
            }
            String s1 = CLS27.MTH889("select");
            Activity activity0 = this.MTH6977();
            this.FLD5004 = CLS523.MTH7160(activity0, s1, ((CLS17)new CLS1049(this, activity0, s, 5)), ((CLS11)new CLS1589(this, ﹳˊ$ᵔʾ0)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

