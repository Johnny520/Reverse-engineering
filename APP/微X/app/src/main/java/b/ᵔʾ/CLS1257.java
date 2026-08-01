// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.text.TextUtils;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS6;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆʿ.CLS59;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS94;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS1279;
import b.ⁱᵔ.CLS1397;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS518;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class CLS1257 implements CLS6, CLS13, CLS16, CLS39 {
    public final Object FLD3194;
    public final boolean FLD3195;
    public final Serializable FLD3196;
    public final Object FLD3197;

    public CLS1257(CLS301 ᐧי0, String s, String s1, boolean z) {
        this.FLD3194 = ᐧי0;
        this.FLD3196 = s;
        this.FLD3197 = s1;
        this.FLD3195 = z;
    }

    public CLS1257(CLS301 ᐧי0, byte[] arr_b, String s, boolean z) {
        this.FLD3194 = ᐧי0;
        this.FLD3197 = arr_b;
        this.FLD3196 = s;
        this.FLD3195 = z;
    }

    public CLS1257(Object object0, Serializable serializable0, boolean z, Object object1) {
        this.FLD3194 = object0;
        this.FLD3196 = serializable0;
        this.FLD3195 = z;
        this.FLD3197 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS1397 ˈᵢ0;
        List list0 = (List)this.FLD3194;
        Class class0 = (Class)this.FLD3196;
        CLS6 ˑٴ0 = (CLS6)this.FLD3197;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            Object object0 = CLS182.MTH3492(4100876672352178997L, list0.get(v1));
            String s = (String)CLS166.MTH3192(class0, CLS27.MTH897("imageMethod6"), new Object[]{object0});
            if(CLS66.MTH1463(s)) {
                arrayList0.add(s);
            }
            else {
                arrayList2.add(object0);
                arrayList1.add(s);
            }
        }
        ProgressDialog progressDialog0 = new ProgressDialog(CLS404.MTH5891());
        progressDialog0.setMessage(CLS27.MTH889("loading_img"));
        progressDialog0.setCancelable(true);
        progressDialog0.setProgressStyle(1);
        progressDialog0.setProgress(0);
        progressDialog0.setMax(100);
        if(!this.FLD3195 || !CLS27.MTH895().MTH938("add_img_watermark", false)) {
            goto label_52;
        }
        String s1 = CLS27.MTH895().MTH925("watermark_img", "");
        CLS94 ⁱˉ0 = CLS59.FLD183.MTH1283(s1);
        if(ⁱˉ0 == null) {
            ˈᵢ0 = new CLS1397(ˑٴ0, list0, 1);
            CLS466.MTH6538(arrayList2, arrayList1, progressDialog0, ((CLS6)ˈᵢ0));
            return;
        }
        if(!arrayList2.isEmpty()) {
            CLS466.MTH6509();
            CLS466.MTH6538(arrayList2, arrayList1, progressDialog0, ((CLS6)new CLS1279(list0, ⁱˉ0, ˑٴ0, 12)));
            return;
        }
        if(!arrayList0.isEmpty()) {
            CLS466.MTH6509();
            ArrayList arrayList3 = new ArrayList();
            for(int v = 0; v < arrayList0.size(); ++v) {
                try {
                    String s2 = new File(CLS31.MTH1038(CLS27.MTH900()), "WechatForwarder_" + Long.toHexString(System.currentTimeMillis()) + "_" + v).getAbsolutePath();
                    arrayList3.add(s2);
                    Bitmap bitmap0 = CLS518.MTH7060(new CLS69(((String)arrayList0.get(v))).MTH1563());
                    if(bitmap0 != null) {
                        Bitmap bitmap1 = CLS518.MTH7057(bitmap0, ⁱˉ0);
                        CLS518.MTH7058(new File(s2), bitmap1);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            if(ˑٴ0 != null) {
                try {
                    ˑٴ0.MTH783(arrayList3);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            label_52:
                if(!arrayList2.isEmpty()) {
                    ˈᵢ0 = new CLS1397(ˑٴ0, list0, 2);
                    CLS466.MTH6538(arrayList2, arrayList1, progressDialog0, ((CLS6)ˈᵢ0));
                    return;
                }
                try {
                    ˑٴ0.MTH783(arrayList0);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
            }
        }
    }

    @Override  // b.ʻˑ.CLS13
    public final void MTH770(String s) {
        byte[] arr_b = (byte[])this.FLD3197;
        String s1 = (String)this.FLD3196;
        boolean z = this.FLD3195;
        ((CLS301)this.FLD3194).getClass();
        if(CLS31.MTH1024(s)) {
            ArrayList arrayList0 = new ArrayList();
            CLS301.MTH4890(s1, CLS66.MTH1424(arr_b), arrayList0, s, null, z);
        }
    }

    @Override  // b.ʻˑ.CLS6
    public final void MTH783(ArrayList arrayList0) {
        ((CLS301)this.FLD3194).getClass();
        ArrayList arrayList1 = CLS66.MTH1437(arrayList0);
        CLS301.MTH4890(((String)this.FLD3196), ((String)this.FLD3197), arrayList1, null, null, this.FLD3195);
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS29 ˎᵢ0 = (CLS29)this.FLD3194;
        String s1 = (String)this.FLD3196;
        Activity activity0 = (Activity)this.FLD3197;
        if(!TextUtils.isEmpty(s)) {
            ˎᵢ0.MTH922(s, s1);
            if(CLS395.FLD3768 != null && CLS395.FLD3768.isShowing()) {
                CLS395.FLD3768.dismiss();
            }
            CLS395.MTH5741(activity0, this.FLD3195);
        }
    }
}

