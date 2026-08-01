// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.util.SparseArray;
import android.widget.LinearLayout;
import b.ʻˑ.CLS15;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS97;
import b.יᐧ.CLS151.CLS148;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS230;
import b.ⁱᵔ.CLS1395;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1626;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS783 implements CLS15, CLS17, CLS39, CLS148 {
    public final boolean FLD1111;
    public final Object FLD1112;
    public final Object FLD1113;

    public CLS783(CLS629 ʻˋ0, boolean z, File file0) {
        this.FLD1113 = ʻˋ0;
        this.FLD1111 = z;
        this.FLD1112 = file0;
    }

    public CLS783(Object object0, Object object1, boolean z) {
        this.FLD1113 = object0;
        this.FLD1112 = object1;
        this.FLD1111 = z;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        String s = (String)this.FLD1113;
        CLS15 ⁱᵔ0 = (CLS15)this.FLD1112;
        try {
            HashSet hashSet0 = CLS466.MTH6544();
            boolean z = hashSet0.contains(s);
            boolean z1 = this.FLD1111;
            if(z) {
                String s1 = CLS66.MTH1449(s);
                File file0 = new File(s1);
                if(!CLS31.MTH1027(s1)) {
                    CLS466.MTH6537(file0, ⁱᵔ0, z1);
                    return;
                }
                if(ⁱᵔ0 != null) {
                    ⁱᵔ0.MTH794();
                }
            }
            else {
                hashSet0.add(s);
                String s2 = CLS66.MTH1449(s);
                File file1 = new File(s2);
                if(!CLS31.MTH1027(s2)) {
                    CLS66.MTH1439(s);
                    CLS466.MTH6537(file1, ⁱᵔ0, z1);
                    return;
                }
                if(ⁱᵔ0 != null) {
                    ⁱᵔ0.MTH794();
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS15
    public final void MTH794() {
        String s = (String)this.FLD1113;
        CLS97 ﾞٴ0 = (CLS97)this.FLD1112;
        try {
            Class class0 = CLS27.MTH894("VideoParseInfoClass");
            Class class1 = CLS27.MTH894("C2COriginVideoDownloadTaskClass");
            Class class2 = CLS27.MTH894("OriginVideoClass1");
            Class class3 = CLS27.MTH894("CdnVideoResourceDownloaderClass");
            Class class4 = CLS27.MTH894("CdnPlayerReporterClass");
            if(class0 != null && class1 != null && class2 != null && class3 != null && class4 != null) {
                Object object0 = CLS66.MTH1453(s);
                if(object0 != null) {
                    String s1 = (String)CLS166.MTH3195(object0, CLS27.MTH897("sendVideoMethod2"), new Object[0]);
                    Object object1 = CLS166.MTH3195(CLS166.MTH3186(class0, CLS27.MTH897("VideoParseInfoClass_field1")), CLS27.MTH897("VideoParseInfoClass_parseMethod"), new Object[]{s1});
                    String s2 = (String)CLS166.MTH3194(object0, CLS27.MTH897("sendVideoClass_fileName"));
                    CLS371.FLD3470.getClass();
                    Object object2 = CLS66.MTH1448(CLS371.FLD3470.MTH5307("SELECT * FROM message WHERE imgPath = \'" + s + "\'", null));
                    Object object3 = CLS166.MTH3188(class1, new Object[]{object2, object0, CLS166.MTH3188(class4, new Object[]{System.currentTimeMillis()}), object1});
                    Object object4 = CLS166.MTH3188(class2, new Object[]{object2, s2, Boolean.TRUE});
                    Object object5 = CLS166.MTH3188(class3, new Object[]{object3});
                    if(CLS27.MTH890("CdnVideoResourceDownloaderClass_field1")) {
                        CLS166.MTH3195(CLS166.MTH3194(object5, CLS27.MTH897("CdnVideoResourceDownloaderClass_field1")), CLS27.MTH897("CdnVideoResourceDownloaderClass_method1"), new Object[]{object4});
                    }
                    else {
                        CLS166.MTH3195(object5, CLS27.MTH897("CdnVideoResourceDownloaderClass_method1"), new Object[]{object4});
                    }
                    CLS166.MTH3195(object5, CLS27.MTH897("CdnVideoResourceDownloaderClass_startMethod"), new Object[0]);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        StringBuilder stringBuilder0 = CLS182.MTH3483(s);
        stringBuilder0.append("origin");
        CLS466.MTH6537(new File(CLS66.MTH1449(stringBuilder0.toString())), ((CLS15)new CLS1395(ﾞٴ0, s, 2)), this.FLD1111);
    }

    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Activity activity0 = (Activity)this.FLD1113;
        String s = (String)this.FLD1112;
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ـﹳ0.MTH800(s);
        ـﹳ0.FLD5295 = false;
        CLS523.MTH7147(linearLayout0, ((CLS18)ـﹳ0), true);
        if(this.FLD1111) {
            ـﹳ0.MTH7324(new CLS230(activity0, s, 10));
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.יᐧ.CLS151$CLS148
    public final void MTH3131(SparseArray sparseArray0) {
        CLS629 ʻˋ0 = (CLS629)this.FLD1113;
        File file0 = (File)this.FLD1112;
        if(this.FLD1111) {
            CLS412.MTH6014(((CLS140)ʻˋ0).MTH3042(), String.format(CLS27.MTH889("export_to_folder2"), CLS371.FLD3470.MTH5316(ʻˋ0.FLD1447.FLD1434), sparseArray0.size()));
            return;
        }
        ʻˋ0.getClass();
        ArrayList arrayList0 = new ArrayList();
        File[] arr_file = file0.listFiles();
        for(int v = 0; v < arr_file.length; ++v) {
            File file1 = arr_file[v];
            if(file1.isFile()) {
                arrayList0.add(file1);
            }
        }
        CLS466.MTH6535(arrayList0);
    }
}

