// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS6;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS87;
import b.יᐧ.CLS151.CLS148;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS476;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public final class CLS679 implements CLS0, CLS6, CLS13, CLS17, CLS148 {
    public final int FLD739;
    public final CLS629 FLD740;

    public CLS679(CLS629 ʻˋ0, int v) {
        this.FLD739 = v;
        this.FLD740 = ʻˋ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS13, b.ʻˑ.CLS0
    public final void MTH770(String s) {
        CLS629 ʻˋ0 = this.FLD740;
        switch(this.FLD739) {
            case 0: {
                ʻˋ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    CLS87 ᐧˉ0 = new CLS87(43, 1, new CLS69(s).MTH1563());
                    ʻˋ0.FLD554.add(ᐧˉ0);
                    ʻˋ0.MTH2038();
                }
                return;
            }
            case 3: {
                ʻˋ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    String s1 = CLS66.MTH1395(s);
                    String s2 = new SimpleDateFormat("yyddMMmmHHss").format(new Date(System.currentTimeMillis()));
                    File file0 = CLS31.MTH1038(CLS27.MTH900());
                    if(CLS21.FLD76.MTH830("hasWriteStoragePermission", new Object[0])) {
                        String s3 = ʻˋ0.FLD1445.MTH925("sns_save_path", "");
                        if(!TextUtils.isEmpty(s3)) {
                            file0 = new File(s3);
                            CLS31.MTH1026(file0);
                        }
                        if(file0 != null && file0.canWrite()) {
                            CLS69 ʾᵢ0 = new CLS69(s1);
                            File file1 = new File(file0, CLS182.MTH3475(4102093887558701877L, CLS182.MTH3483(s2)));
                            if(CLS31.MTH1009(ʾᵢ0, file1)) {
                                CLS412.MTH6014(((CLS140)ʻˋ0).MTH3042(), String.format(CLS27.MTH889("saved_to"), file1.getPath()));
                                return;
                            }
                        }
                    }
                    CLS69 ʾᵢ1 = new CLS69(s1);
                    File file2 = new File(file0, CLS182.MTH3475(4102093947688244021L, CLS182.MTH3483(s2)));
                    CLS31.MTH996(file2.getAbsolutePath());
                    if(CLS31.MTH1009(ʾᵢ1, file2)) {
                        CLS466.MTH6506(file2);
                    }
                }
                return;
            }
            case 7: {
                CLS395.MTH5733(((CLS140)ʻˋ0).MTH3042(), ʻˋ0.FLD1445.MTH938("add_img_watermark", false), ((CLS3)new CLS745(ʻˋ0, s, 3)));
                return;
            }
            default: {
                ʻˋ0.getClass();
                CLS29 ˎᵢ0 = ʻˋ0.FLD1445;
                if(ˎᵢ0.MTH938("sns_img_add_img_watermark", false)) {
                    ʻˋ0.FLD552 = 0;
                    CLS466.MTH6509();
                    CLS395.MTH5733(((CLS140)ʻˋ0).MTH3042(), ˎᵢ0.MTH938("sns_img_add_img_watermark", false), ((CLS3)new CLS745(ʻˋ0, s, 2)));
                    return;
                }
                if(!TextUtils.isEmpty(s)) {
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(CLS66.MTH1410(s));
                    CLS466.MTH6536(null, arrayList0);
                }
            }
        }
    }

    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        this.FLD740.getClass();
        File file0 = (File)arr_object[0];
        String s = (String)arr_object[1];
        Uri uri0 = Uri.fromFile(file0);
        CLS476.MTH6642(((CLS140)this.FLD740).MTH3042(), uri0, s, new CLS117(this.FLD740, file0, 0));
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS6
    public final void MTH783(ArrayList arrayList0) {
        int v = 0;
        CLS629 ʻˋ0 = this.FLD740;
        switch(this.FLD739) {
            case 2: {
                ʻˋ0.getClass();
                String s = new SimpleDateFormat("yyddMMmmHHss").format(new Date(System.currentTimeMillis()));
                File file0 = CLS31.MTH1038(CLS27.MTH900());
                if(CLS21.FLD76.MTH830("hasWriteStoragePermission", new Object[0])) {
                    String s1 = ʻˋ0.FLD1445.MTH925("sns_save_path", "");
                    if(!TextUtils.isEmpty(s1)) {
                        file0 = new File(s1);
                        CLS31.MTH1026(file0);
                    }
                    if(file0 != null && file0.canWrite()) {
                        int v1 = 0;
                        while(v1 < arrayList0.size()) {
                            CLS69 ʾᵢ0 = new CLS69(((String)arrayList0.get(v1)));
                            StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                            ++v1;
                            stringBuilder0.append(v1);
                            stringBuilder0.append(".jpg");
                            CLS31.MTH1009(ʾᵢ0, new File(file0, stringBuilder0.toString()));
                        }
                        CLS412.MTH6014(((CLS140)ʻˋ0).MTH3042(), String.format(CLS27.MTH889("saved_to"), file0));
                        return;
                    }
                }
                ArrayList arrayList1 = new ArrayList();
                while(v < arrayList0.size()) {
                    CLS69 ʾᵢ1 = new CLS69(((String)arrayList0.get(v)));
                    StringBuilder stringBuilder1 = CLS182.MTH3483(s);
                    ++v;
                    stringBuilder1.append(v);
                    stringBuilder1.append(".jpg");
                    File file1 = new File(file0, stringBuilder1.toString());
                    CLS31.MTH1009(ʾᵢ1, file1);
                    CLS31.MTH996(file1.getAbsolutePath());
                    arrayList1.add(file1);
                }
                CLS466.MTH6535(arrayList1);
                return;
            }
            case 5: {
                CLS387.MTH5601(false, ((CLS140)ʻˋ0).MTH3042(), ((CLS2)new CLS686(ʻˋ0, arrayList0)), -1);
                return;
            }
            default: {
                ʻˋ0.getClass();
                for(Object object0: arrayList0) {
                    CLS87 ᐧˉ0 = new CLS87(3, CLS31.MTH992(((String)object0)));
                    ʻˋ0.FLD554.add(ᐧˉ0);
                }
                ʻˋ0.MTH2038();
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.יᐧ.CLS151$CLS148
    public final void MTH3131(SparseArray sparseArray0) {
        CLS87 ᐧˉ0;
        CLS629 ʻˋ0 = this.FLD740;
        ArrayList arrayList0 = ʻˋ0.FLD554;
        arrayList0.clear();
        for(int v = 0; v < sparseArray0.size(); ++v) {
            Bundle bundle0 = (Bundle)sparseArray0.get(sparseArray0.keyAt(v));
            int v1 = bundle0.getInt("type");
            if(v1 == -16) {
                ᐧˉ0 = new CLS87(43, 1, bundle0.getString("imgPath"));
            }
            else {
                switch(v1) {
                    case -3: {
                        String s = bundle0.getString("content");
                        long v2 = bundle0.getLong("msgSvrId");
                        long v3 = bundle0.getLong("msgId");
                        bundle0.getString("talker");
                        String s1 = bundle0.getString("imgPath");
                        ᐧˉ0 = new CLS87(3, bundle0.getInt("isSend"), v2, v3, s, s1);
                        break;
                    }
                    case 1: {
                        ᐧˉ0 = new CLS87(1, bundle0.getString("content"));
                        break;
                    }
                    case 34: {
                        String s2 = bundle0.getString("imgPath");
                        ᐧˉ0 = new CLS87(34, bundle0.getInt("voiceLength"), s2);
                        break;
                    }
                    case 49: {
                        String s3 = bundle0.getString("content");
                        String s4 = bundle0.getString("imgPath");
                        ᐧˉ0 = new CLS87(49, bundle0.getLong("msgId"), s3, s4);
                        break;
                    }
                    default: {
                        continue;
                    }
                }
            }
            arrayList0.add(ᐧˉ0);
        }
        ʻˋ0.MTH2038();
    }
}

