// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ˑٴ.CLS848;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS1019;
import b.ᐧˉ.CLS1040;
import b.ᐧˉ.CLS1098;
import b.ᐧˉ.CLS954;
import b.ⁱʾ.CLS350;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS518.CLS516;
import b.ⁱᵔ.CLS518;
import b.ﾞˎ.CLS525;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1263 implements CLS378, CLS516 {
    public final Object FLD3239;
    public final Serializable FLD3240;
    public final Object FLD3241;
    public final ArrayList FLD3242;
    public final Object FLD3243;
    public final String FLD3244;
    public final ArrayList FLD3245;
    public final int FLD3246;
    public final Serializable FLD3247;
    public final Object FLD3248;

    public CLS1263(CLS1019 ˎʻ0, Activity activity0, HashSet hashSet0, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, CLS350 ᐧⁱ0, String s, int v, CLS1233 ˊˏ0) {
        this.FLD3243 = ˎʻ0;
        this.FLD3248 = activity0;
        this.FLD3247 = hashSet0;
        this.FLD3242 = arrayList0;
        this.FLD3245 = arrayList1;
        this.FLD3240 = arrayList2;
        this.FLD3241 = ᐧⁱ0;
        this.FLD3244 = s;
        this.FLD3246 = v;
        this.FLD3239 = ˊˏ0;
    }

    public CLS1263(CLS280 ʻᵎ0, CLS1228 ʾˈ0, String s, String s1, String s2, String s3, String s4, int v, ArrayList arrayList0, ArrayList arrayList1) {
        this.FLD3243 = ʻᵎ0;
        this.FLD3248 = ʾˈ0;
        this.FLD3244 = s;
        this.FLD3247 = s1;
        this.FLD3240 = s2;
        this.FLD3241 = s3;
        this.FLD3239 = s4;
        this.FLD3246 = v;
        this.FLD3242 = arrayList0;
        this.FLD3245 = arrayList1;
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        ((CLS1019)this.FLD3243).getClass();
        ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS1098(((CLS1019)this.FLD3243), ((Activity)this.FLD3248), ((HashSet)this.FLD3247), this.FLD3242, this.FLD3245, ((ArrayList)this.FLD3240), ((CLS350)this.FLD3241))));
        ʻˑ0.MTH7187("add", ((CLS3)new CLS1233(((CLS1019)this.FLD3243), this.FLD3244, ((HashSet)this.FLD3247), ((Activity)this.FLD3248), this.FLD3246, this.FLD3242, this.FLD3245, ((ArrayList)this.FLD3240), ((CLS350)this.FLD3241))));
        ʻˑ0.MTH7187("add_wxid", ((CLS3)new CLS1040(((CLS1019)this.FLD3243), ((Activity)this.FLD3248), this.FLD3244, this.FLD3246, this.FLD3245, this.FLD3242, ((ArrayList)this.FLD3240))));
        ʻˑ0.MTH7187("import_", ((CLS3)new CLS848(((CLS1019)this.FLD3243), ((CLS3)this.FLD3239), ((CLS350)this.FLD3241), ((Activity)this.FLD3248))));
        ʻˑ0.MTH7187("export_", ((CLS3)new CLS954(((Activity)this.FLD3248), this.FLD3242)));
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS518$CLS516
    public final void MTH7045(Bitmap bitmap0) {
        int v1;
        CLS12 ᵔʾ0 = (CLS12)this.FLD3248;
        String s = this.FLD3244;
        String s1 = (String)this.FLD3247;
        String s2 = (String)this.FLD3240;
        String s3 = (String)this.FLD3241;
        String s4 = (String)this.FLD3239;
        ArrayList arrayList0 = this.FLD3242;
        ArrayList arrayList1 = this.FLD3245;
        ((CLS280)this.FLD3243).getClass();
        byte[] arr_b = bitmap0 == null ? null : CLS518.MTH7054(bitmap0);
        try {
            Object object0 = CLS66.MTH1397(4);
            if(object0 == null) {
                goto label_55;
            }
            else {
                int v = this.FLD3246;
                switch(v) {
                    case 2: {
                        CLS166.MTH3195(object0, CLS27.MTH897("upSetShareTypeMethod"), new Object[]{0});
                        break;
                    }
                    case 3: {
                        CLS166.MTH3195(object0, CLS27.MTH897("upSetShareTypeMethod"), new Object[]{1});
                        break;
                    }
                    default: {
                        CLS166.MTH3195(object0, CLS27.MTH897("upSetShareTypeMethod"), new Object[]{0});
                    }
                }
                if(CLS27.MTH890("upSetTypeMethod")) {
                    CLS166.MTH3195(object0, CLS27.MTH897("upSetTypeMethod"), new Object[]{5});
                }
                else if(CLS27.MTH890("upClassField4")) {
                    CLS166.MTH3198(CLS166.MTH3194(object0, CLS27.MTH897("upClassField4")), CLS27.MTH897("upClassField5"), 5);
                }
                if(!TextUtils.isEmpty(CLS27.MTH897("upMethod3"))) {
                    CLS166.MTH3195(object0, CLS27.MTH897("upMethod3"), new Object[]{s2, "about:blank", null, ((int)(v <= 1 ? 0 : 1)), 0});
                }
                CLS166.MTH3195(object0, CLS27.MTH897("upSetContentMethod"), new Object[]{s});
                CLS166.MTH3195(object0, CLS27.MTH897("upSetMentionListMethod"), new Object[]{CLS66.MTH1504(arrayList0)});
                CLS166.MTH3195(object0, CLS27.MTH897("upSetPrivateMethod"), new Object[]{((int)(v == 1 ? 1 : 0))});
                if(CLS27.MTH890("upMethod4")) {
                    CLS166.MTH3195(object0, CLS27.MTH897("upMethod4"), new Object[]{0});
                }
                else if(CLS27.MTH890("upClass1Field2")) {
                    CLS166.MTH3198(CLS166.MTH3194(object0, CLS27.MTH897("upClass1Field2")), CLS27.MTH897("upClass1Field3"), 0);
                }
                CLS166.MTH3195(object0, CLS27.MTH897("upSetListMethod"), new Object[]{arrayList1});
                CLS166.MTH3195(object0, CLS27.MTH897("upSetLinkDescMethod"), new Object[]{s3});
                try {
                    if(CLS27.MTH890("upMusicVideoMethod1")) {
                        CLS166.MTH3195(object0, CLS27.MTH897("upMusicVideoMethod1"), new Object[]{arr_b, s1, "", s2, 3, s3, s4, "", "", ""});
                    }
                    else if(CLS27.MTH890("upMusicVideoMethod1_b")) {
                        CLS166.MTH3195(object0, CLS27.MTH897("upMusicVideoMethod1_b"), new Object[]{arr_b, s1, "", s2, 3, s3, s4, "", ""});
                    }
                    else {
                        CLS166.MTH3195(object0, "a", new Object[]{arr_b, s1, "", s2, 3, s3, s4});
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                v1 = (int)(((Integer)CLS166.MTH3195(object0, CLS27.MTH897("upCommitMethod"), new Object[0])));
                Class class0 = CLS27.MTH894("SnsPathClass");
                if(class0 != null) {
                    CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("upMethod1"), new Object[0]), CLS27.MTH897("upMethod2"), new Object[0]);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            v1 = -1;
        }
        CLS280.MTH4660(ᵔʾ0, v1);
        return;
    label_55:
        v1 = -1;
        CLS280.MTH4660(ᵔʾ0, v1);
    }
}

