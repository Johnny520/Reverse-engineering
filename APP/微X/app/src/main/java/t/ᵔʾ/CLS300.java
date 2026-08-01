// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import t.ʾᵢ.CLS216;
import t.ˆʿ.CLS28;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS38.CLS37;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS43;
import t.ˆٴ.CLS73;
import t.ˊﾞ.CLS100;
import t.ˊﾞ.CLS295;
import t.ٴـ.CLS117;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS144;
import t.ⁱʾ.CLS145;
import t.ﾞٴ.CLS322;
import t.ﾞٴ.CLS326;
import t.ﾞٴ.CLS331;
import t.ﾞᐧ.CLS168;
import t.ﾞᐧ.CLS337;

public final class CLS300 implements CLS37, CLS136, CLS144 {
    public final int FLD924;
    public final Object FLD925;
    public final Object FLD926;
    public final Object FLD927;
    public final Object FLD928;

    public CLS300(Object object0, Object object1, ArrayList arrayList0, Object object2, int v) {
        this.FLD924 = v;
        this.FLD927 = object0;
        this.FLD926 = object1;
        this.FLD928 = arrayList0;
        this.FLD925 = object2;
        super();
    }

    public CLS300(CLS216 ˎﾞ0, String s, ProgressDialog progressDialog0, Activity activity0) {
        this.FLD924 = 3;
        super();
        this.FLD926 = ˎﾞ0;
        this.FLD928 = s;
        this.FLD925 = progressDialog0;
        this.FLD927 = activity0;
    }

    public CLS300(CLS331 ﾞᐧ0, Activity activity0, String s, String s1) {
        this.FLD924 = 1;
        super();
        this.FLD926 = ﾞᐧ0;
        this.FLD927 = activity0;
        this.FLD928 = s;
        this.FLD925 = s1;
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        Object object0 = this.FLD925;
        Object object1 = this.FLD928;
        Object object2 = this.FLD926;
        Object object3 = this.FLD927;
        if(this.FLD924 == 2) {
            CLS216 ˎﾞ0 = (CLS216)object3;
            ArrayList arrayList0 = (ArrayList)object2;
            ArrayList arrayList1 = (ArrayList)object1;
            CLS73 ﾞᐧ0 = (CLS73)object0;
            ˎﾞ0.getClass();
            try {
                arrayList0.clear();
                Collections.sort(arrayList1, Comparator.comparingInt(new CLS100(3)));
                for(Object object4: arrayList1) {
                    CLS295 ﾞˎ0 = (CLS295)object4;
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("desc", "<b>" + ﾞˎ0.FLD830 + "</b> " + ﾞˎ0.FLD827);
                    contentValues0.put("enabled", Boolean.valueOf(ﾞˎ0.FLD825));
                    if(!TextUtils.isEmpty(ﾞˎ0.FLD829)) {
                        contentValues0.put("img_uri", ˎﾞ0.FLD236.MTH1825(ﾞˎ0.FLD829).toString());
                        contentValues0.put("img_color", (ﾞˎ0.FLD833 ? ﾞˎ0.FLD832 : ""));
                    }
                    arrayList0.add(contentValues0);
                }
                ﾞᐧ0.MTH1561();
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
            return;
        }
        ((CLS216)object2).getClass();
        if(CLS117.FLD842.FLD841.containsKey(((String)object1))) {
            ((CLS216)object2).FLD235.MTH2365(((String)object1));
        }
        ((ProgressDialog)object0).dismiss();
        CLS28.MTH1315(((Activity)object3), CLS133.MTH2099("import_") + ": " + ((String)object1));
    }

    @Override  // t.ˆʿ.CLS38$CLS37
    public final void MTH1382(File file0) {
        Activity activity0 = (Activity)this.FLD927;
        CLS144 ˊﾞ0 = (CLS144)this.FLD926;
        CLS144 ˊﾞ1 = (CLS144)this.FLD928;
        CLS144 ˊﾞ2 = (CLS144)this.FLD925;
        if(!file0.isDirectory()) {
            String s = CLS125.MTH2032(activity0, Uri.fromFile(file0));
            String s1 = file0.getName();
            if(ˊﾞ0 != null) {
                try {
                    ˊﾞ0.MTH2170(new Object[]{file0, s, s1});
                    return;
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
            if(ˊﾞ1 != null) {
                try {
                    ˊﾞ1.MTH2170(new Object[]{CLS33.MTH1344(activity0, file0), s, s1});
                    return;
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
            }
            if(ˊﾞ2 != null) {
                try {
                    ˊﾞ2.MTH2170(new Object[]{new FileInputStream(file0), s, s1});
                }
                catch(Throwable throwable2) {
                    CLS133.MTH2113(throwable2);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS144
    public final void MTH2170(Object[] arr_object) {
        CLS331 ﾞᐧ0 = (CLS331)this.FLD926;
        Activity activity0 = (Activity)this.FLD927;
        String s = (String)this.FLD928;
        String s1 = (String)this.FLD925;
        ﾞᐧ0.getClass();
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        ImageView imageView0 = new ImageView(activity0);
        CLS337 ˎᵢ0 = new CLS337(activity0);
        ﾞᐧ0.FLD1086 = ˎᵢ0;
        ˎᵢ0.FLD1165 = false;
        ˎᵢ0.MTH2172(CLS133.MTH2099("path"));
        CLS168 ˑٴ0 = new CLS168(activity0, linearLayout0, menu0);
        if(!TextUtils.isEmpty(s) && CLS133.MTH2110("MMNewPhotoEditUI")) {
            ˑٴ0.MTH2390("edit_img", ((CLS143)new CLS326(ﾞᐧ0, imageView0, 0)));
        }
        if(!TextUtils.isEmpty(s1)) {
            ˑٴ0.MTH2390("delete", ((CLS143)new CLS322(ﾞᐧ0, activity0, imageView0, 0)));
        }
        ˑٴ0.MTH2390("select_img1", ((CLS143)new CLS326(ﾞᐧ0, imageView0, 1)));
        if(CLS123.FLD912.MTH2000("hasReadStoragePermission", new Object[0])) {
            ˑٴ0.MTH2390("select_img2", ((CLS143)new CLS326(ﾞᐧ0, imageView0, 2)));
        }
        if(CLS133.MTH2110("AlbumPreviewUI")) {
            ˑٴ0.MTH2390("select_img3", ((CLS143)new CLS326(ﾞᐧ0, imageView0, 3)));
        }
        ˑٴ0.MTH2392();
        if(!TextUtils.isEmpty(s1)) {
            ﾞᐧ0.FLD1088 = s1;
            ﾞᐧ0.FLD1086.MTH2388(s1);
            imageView0.setImageBitmap(CLS41.MTH1393(s1));
        }
        if(!TextUtils.isEmpty(s)) {
            ﾞᐧ0.FLD1089 = s;
        }
        CLS43.MTH1423(linearLayout0, ((CLS145)ﾞᐧ0.FLD1086), false);
        CLS43.MTH1419(linearLayout0, imageView0);
    }
}

