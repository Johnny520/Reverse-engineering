// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.text.TextUtils;
import android.webkit.WebView;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ⁱʾ.CLS359;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1626;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

public final class CLS1408 implements CLS12 {
    public final Object FLD4029;
    public final Object FLD4030;
    public final Object FLD4031;
    public final int FLD4032;
    public final Object FLD4033;
    public final ArrayList FLD4034;
    public final String[] FLD4035;
    public final Object FLD4036;
    public final CLS18 FLD4037;
    public final Object FLD4038;

    public CLS1408(SimpleDateFormat simpleDateFormat0, String[] arr_s, Activity activity0, CLS1626 ـﹳ0, CLS1626 ـﹳ1, ArrayList arrayList0, CLS396 ʿʽ0, String[] arr_s1, CLS359 ⁱˉ0) {
        this.FLD4032 = 1;
        super();
        this.FLD4036 = simpleDateFormat0;
        this.FLD4035 = arr_s;
        this.FLD4033 = activity0;
        this.FLD4038 = ـﹳ0;
        this.FLD4037 = ـﹳ1;
        this.FLD4034 = arrayList0;
        this.FLD4030 = ʿʽ0;
        this.FLD4031 = arr_s1;
        this.FLD4029 = ⁱˉ0;
    }

    public CLS1408(String[] arr_s, CLS29 ˎᵢ0, HashSet hashSet0, HashSet hashSet1, CLS1620 ˊˏ0, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, WebView webView0) {
        this.FLD4032 = 0;
        super();
        this.FLD4035 = arr_s;
        this.FLD4036 = ˎᵢ0;
        this.FLD4033 = hashSet0;
        this.FLD4038 = hashSet1;
        this.FLD4037 = ˊˏ0;
        this.FLD4034 = arrayList0;
        this.FLD4030 = arrayList1;
        this.FLD4031 = arrayList2;
        this.FLD4029 = webView0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        Object object1 = this.FLD4031;
        String[] arr_s = this.FLD4035;
        Object object2 = this.FLD4029;
        Object object3 = this.FLD4030;
        CLS18 ﾞᐧ0 = this.FLD4037;
        Object object4 = this.FLD4038;
        Object object5 = this.FLD4033;
        Object object6 = this.FLD4036;
        if(this.FLD4032 == 0) {
            ArrayList arrayList0 = this.FLD4034;
            if(!TextUtils.isEmpty(((String)object0))) {
                String s = ((String)object0).trim();
                arr_s[0] = s;
                CLS432.MTH6178(((CLS29)object6).MTH927(1, "web_img_search_src"), ((CLS12)new CLS1399(((HashSet)object5), ((HashSet)object4), ((CLS1620)ﾞᐧ0), arrayList0, ((ArrayList)object3), ((ArrayList)object1), ((CLS29)object6), ((WebView)object2))), s);
            }
            return;
        }
        SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)object6;
        Activity activity0 = (Activity)object5;
        CLS1626 ـﹳ0 = (CLS1626)object4;
        CLS1626 ـﹳ1 = (CLS1626)ﾞᐧ0;
        CLS396 ʿʽ0 = (CLS396)object3;
        String[] arr_s1 = (String[])object1;
        CLS359 ⁱˉ0 = (CLS359)object2;
        int v = (int)(((Integer)object0));
        try {
            Calendar calendar0 = Calendar.getInstance();
            calendar0.setTime(simpleDateFormat0.parse(arr_s[v]));
            new DatePickerDialog(activity0, new CLS430(arr_s, v, simpleDateFormat0, ـﹳ0, ـﹳ1, this.FLD4034, ʿʽ0, arr_s1, ⁱˉ0), calendar0.get(1), calendar0.get(2), calendar0.get(5)).show();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

