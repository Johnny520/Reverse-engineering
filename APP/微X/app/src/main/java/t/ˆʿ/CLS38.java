// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import t.ˆٴ.CLS73;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS303;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS144;
import t.ﾞٴ.CLS151;
import t.ﾞᐧ.CLS336;
import t.ﾞᐧ.CLS337;

public final class CLS38 {
    public interface CLS37 {
        void MTH1382(File arg1);
    }

    public String FLD476;
    public CLS337 FLD477;
    public CLS336 FLD478;
    public final WeakReference FLD479;
    public CLS73 FLD480;
    public File FLD481;
    public final ArrayList FLD482;
    public final HashSet FLD483;
    public AlertDialog FLD484;
    public File FLD485;
    public File FLD486;

    public CLS38(Activity activity0) {
        this.FLD479 = new WeakReference(activity0);
        this.FLD482 = new ArrayList();
        this.FLD483 = new HashSet();
    }

    // 此方法包含解密的字符串
    public final void MTH1384(String s) {
        HashSet hashSet0 = this.FLD483;
        if(s.contains(",")) {
            Collections.addAll(hashSet0, s.split(","));
            return;
        }
        hashSet0.add(s);
    }

    // 此方法包含解密的字符串
    public final void MTH1385() {
        String s;
        CLS337 ˎᵢ0;
        try {
            if(this.FLD486 == null) {
                return;
            }
            if(this.FLD481 == null) {
                ˎᵢ0 = this.FLD477;
                s = "";
            }
            else {
                ˎᵢ0 = this.FLD477;
                s = "<b>" + this.FLD481.getAbsolutePath() + "</b>";
            }
            ˎᵢ0.MTH2172(s);
            ArrayList arrayList0 = this.FLD482;
            if(this.FLD485 == this.FLD486) {
                if(this.FLD481 != null && this.FLD481.isFile()) {
                    for(Object object0: arrayList0) {
                        ContentValues contentValues0 = (ContentValues)object0;
                        if(contentValues0.containsKey("enable")) {
                            contentValues0.remove("enable");
                        }
                        if(contentValues0.getAsString("content").equals(this.FLD481.getName())) {
                            contentValues0.put("enable", Boolean.TRUE);
                        }
                    }
                }
                this.FLD480.notifyDataSetChanged();
                return;
            }
            arrayList0.clear();
            ContentValues contentValues1 = new ContentValues();
            contentValues1.put("content", "|wx_prev_dir|");
            contentValues1.put("desc", "< ---");
            arrayList0.add(contentValues1);
            File[] arr_file = this.FLD486.listFiles();
            if(arr_file != null) {
                ArrayList arrayList1 = new ArrayList(Arrays.asList(arr_file));
                Collections.sort(arrayList1, new CLS151(1));
                Iterator iterator1 = arrayList1.iterator();
                while(iterator1.hasNext()) {
                    boolean z = false;
                    Object object1 = iterator1.next();
                    File file0 = (File)object1;
                    HashSet hashSet0 = this.FLD483;
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
                        if(this.FLD481 != null && this.FLD481.isFile()) {
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
                this.FLD480.MTH1565(arrayList0);
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1386(String s, CLS37 יᐧ$ᵔʾ0) {
        public final class CLS278 implements CLS141 {
            public final CLS37 FLD474;
            public final CLS38 FLD475;

            public CLS278(CLS37 יᐧ$ᵔʾ0) {
                this.FLD474 = יᐧ$ᵔʾ0;
                super();
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2165() {
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2166() {
                CLS37 יᐧ$ᵔʾ0 = this.FLD474;
                if(יᐧ$ᵔʾ0 != null) {
                    try {
                        יᐧ$ᵔʾ0.MTH1382(CLS38.this.FLD481);
                    }
                    catch(Throwable throwable0) {
                        CLS133.MTH2113(throwable0);
                    }
                }
            }
        }

        try {
            if(TextUtils.isEmpty(s)) {
                s = this.FLD476;
            }
            if(this.FLD484 != null && this.FLD484.isShowing()) {
                this.FLD484.dismiss();
            }
            String s1 = CLS133.MTH2099("select");
            Activity activity0 = (Activity)this.FLD479.get();
            this.FLD484 = CLS43.MTH1425(activity0, s1, ((CLS144)new CLS303(this, activity0, s, 9)), ((CLS141)new CLS278(this, יᐧ$ᵔʾ0)));
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }
}

