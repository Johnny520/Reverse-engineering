// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS6;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS481;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;

public final class CLS301 {
    public static final CLS301 FLD3148;

    static {
        CLS301.FLD3148 = new CLS301();
    }

    // 此方法包含解密的字符串
    public static void MTH4890(String s, String s1, ArrayList arrayList0, String s2, String s3, boolean z) {
        File file1;
        if(z || !CLS21.FLD76.MTH830("hasWriteStoragePermission", new Object[0])) {
            file1 = null;
        }
        else {
            File file0 = new File(CLS27.MTH895().MTH925("moment_auto_export_path", new File(CLS31.MTH1008(), "moments").getAbsolutePath()));
            CLS31.MTH1026(file0);
            file1 = CLS31.MTH1001(file0) ? new File(file0, s) : null;
        }
        if(file1 == null || !file1.canWrite()) {
            file1 = new File(CLS27.MTH900().getCacheDir(), s);
        }
        ArrayList arrayList1 = new ArrayList();
        if(!TextUtils.isEmpty(s1)) {
            File file2 = new File(file1, "text.txt");
            if(!TextUtils.isEmpty(CLS31.MTH1030(file2, s1))) {
                arrayList1.add(file2);
            }
        }
        if(!TextUtils.isEmpty(s2)) {
            File file3 = new File(file1, "video.mp4");
            if(CLS31.MTH1025(new File(s2), file3)) {
                arrayList1.add(file3);
            }
        }
        if(!TextUtils.isEmpty(s3)) {
            File file4 = new File(file1, "url.txt");
            if(!TextUtils.isEmpty(CLS31.MTH1030(new File(file1, "url.txt"), s3))) {
                arrayList1.add(file4);
            }
        }
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            for(int v = 0; v < arrayList0.size(); ++v) {
                CLS69 ʾᵢ0 = new CLS69(((String)arrayList0.get(v)));
                File file5 = new File(file1, "img_" + v + ".jpg");
                try {
                    if(CLS31.MTH1037(ʾᵢ0.MTH1554(), file5)) {
                        arrayList1.add(file5);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        if(z) {
            ArrayList arrayList2 = new ArrayList(Arrays.asList(new String[]{s}));
            CLS21.FLD76.MTH831("core", "copyToModuleDir", new Object[]{file1, 13, arrayList2});
            CLS31.MTH1035(file1);
        }
        else if(!CLS21.FLD76.MTH830("hasWriteStoragePermission", new Object[0])) {
            CLS31.MTH996(file1.getAbsolutePath());
            CLS466.MTH6535(arrayList1);
        }
    }

    public final void MTH4891(ContentValues contentValues0, long v, String s, boolean z) {
        if(((int)contentValues0.getAsInteger("type")) == 2) {
            CLS301.MTH4890(s, CLS66.MTH1424(contentValues0.getAsByteArray("content")), null, null, null, z);
        }
        if(((int)contentValues0.getAsInteger("type")) == 1) {
            CLS466.MTH6534(((CLS6)new CLS1257(this, s, CLS66.MTH1424(contentValues0.getAsByteArray("content")), z)), CLS66.MTH1508(("sns_table_" + v)));
        }
        if(((int)contentValues0.getAsInteger("type")) == 15 && CLS27.MTH894("SnsPathClass") != null) {
            CLS1246 יﹳ0 = new CLS1246(this, "sns_table_" + v, s, z, contentValues0.getAsByteArray("content"));
            CLS40.FLD157.MTH1123(((CLS39)יﹳ0), 8000L);
        }
        if(((int)contentValues0.getAsInteger("type")) == 3) {
            String s1 = CLS66.MTH1424(contentValues0.getAsByteArray("content"));
            Object object0 = CLS66.MTH1434(v);
            if(object0 != null) {
                CLS301.MTH4890(s, s1, null, null, ((String)CLS166.MTH3194(CLS166.MTH3194(CLS166.MTH3195(object0, CLS27.MTH897("snsSightMethod5"), new Object[0]), CLS27.MTH897("snsContentLinkField")), CLS27.MTH897("snsArticleFieldUrl"))), z);
            }
        }
        switch(((int)contentValues0.getAsInteger("type"))) {
            case 4: 
            case 42: {
                String s2 = CLS66.MTH1424(contentValues0.getAsByteArray("content"));
                Object object1 = CLS66.MTH1434(v);
                if(object1 != null) {
                    LinkedList linkedList0 = (LinkedList)CLS166.MTH3194(CLS166.MTH3194(CLS166.MTH3195(object1, CLS27.MTH897("snsSightMethod5"), new Object[0]), CLS27.MTH897("snsContentLinkField")), CLS27.MTH897("snsSightField3"));
                    if(linkedList0 != null && !linkedList0.isEmpty()) {
                        CLS301.MTH4890(s, s2, null, null, ((String)CLS166.MTH3194(linkedList0.get(0), CLS27.MTH897("snsArticleFieldUrl"))), z);
                    }
                }
            }
        }
    }

    public static String MTH4892(int v, String s) {
        long v1 = (long)v;
        return s + "(" + CLS371.FLD3470.MTH5311(s) + ")_" + new SimpleDateFormat("yyyy-MM-dd-HHmmss").format(new Date((CLS481.MTH6690(v1) == 10 ? v1 * 1000L : ((long)v))));
    }
}

