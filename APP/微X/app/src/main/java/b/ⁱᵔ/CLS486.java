// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS43;
import b.ˈˈ.CLS580;
import b.ˈˈ.CLS78;
import b.ˑٴ.CLS766;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS347;
import b.ⁱʾ.CLS366;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS486 implements AdapterView.OnItemClickListener {
    public final CLS347 FLD4741;
    public final CLS43 FLD4742;
    public final boolean FLD4743;
    public final ArrayList FLD4744;
    public final Activity FLD4745;
    public final CLS12 FLD4746;

    public CLS486(CLS347 ᐧי0, ArrayList arrayList0, boolean z, Activity activity0, CLS43 ˆʿ0, CLS12 ᵔʾ0) {
        this.FLD4741 = ᐧי0;
        this.FLD4744 = arrayList0;
        this.FLD4743 = z;
        this.FLD4745 = activity0;
        this.FLD4742 = ˆʿ0;
        this.FLD4746 = ᵔʾ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        int v10;
        String[] arr_s1;
        String s = "";
        String s1 = (String)this.FLD4741.getItem(v);
        String s2 = "";
        new String("");
        new String("");
        new String("");
        int v2 = 0;
        if(!TextUtils.isEmpty(s1)) {
            if(s1.contains("[[") && s1.contains("]]")) {
                int v3 = s1.indexOf("[[");
                int v4 = s1.lastIndexOf("]]");
                s = s1.substring(v3 + 2, v4);
                s1 = CLS182.MTH3495(s1, 0, v3, new StringBuilder(), v4, 2);
            }
            String s3 = s1;
            String s4 = "";
            if(s3.contains("{") && s3.contains("}")) {
                int v5 = s3.indexOf("{");
                int v6 = s3.lastIndexOf("}");
                s4 = s3.substring(v5 + 1, v6);
                s3 = CLS182.MTH3495(s3, 0, v5, new StringBuilder(), v6, 1);
            }
            String s5 = "";
            if(s3.contains("((") && s3.contains("))")) {
                int v7 = s3.indexOf("((");
                int v8 = s3.lastIndexOf("))");
                s5 = s3.substring(v7 + 2, v8);
                s3 = CLS182.MTH3495(s3, 0, v7, new StringBuilder(), v8, 2);
            }
            s4.getClass();
            s.getClass();
            s5.getClass();
            s2 = s3.trim();
        }
        ArrayList arrayList0 = this.FLD4744;
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            this.FLD4742.getClass();
            HashSet hashSet0 = new HashSet();
            hashSet0.addAll(Arrays.asList(CLS502.MTH6941(this.FLD4742.MTH1162(s2))));
            hashSet0.addAll(arrayList0);
            String s6 = TextUtils.join(",", hashSet0);
            this.FLD4742.MTH1158(s2, s6);
            CLS12 ᵔʾ0 = this.FLD4746;
            if(ᵔʾ0 != null) {
                if(CLS403.FLD3893 != null && CLS403.FLD3893.isShowing()) {
                    CLS403.FLD3893.dismiss();
                }
                ᵔʾ0.MTH791(s2);
                return;
            }
        }
        boolean z = this.FLD4743;
        Activity activity0 = this.FLD4745;
        CLS43 ˆʿ0 = (CLS43)CLS40.FLD157.MTH1118(CLS43.class);
        String s7 = ˆʿ0.MTH1162(s2);
        ArrayList arrayList1 = new ArrayList();
        HashSet hashSet1 = new HashSet();
        if(!TextUtils.isEmpty(s7)) {
            String[] arr_s = CLS502.MTH6941(s7);
            for(int v9 = arr_s.length; v2 < v9; v9 = v10) {
                String s8 = arr_s[v2];
                CLS371 ʻ0 = CLS371.FLD3470;
                if(ʻ0.MTH5383(s8)) {
                    StringBuilder stringBuilder0 = new StringBuilder();
                    stringBuilder0.append(ʻ0.MTH5316(s8));
                    stringBuilder0.append(" (");
                    stringBuilder0.append(ʻ0.MTH5369(s8));
                    arr_s1 = arr_s;
                    v10 = v9;
                    arrayList1.add(new CLS78(s8, CLS182.MTH3475(4101201870095962933L, stringBuilder0)));
                }
                else {
                    arr_s1 = arr_s;
                    v10 = v9;
                    hashSet1.add(s8);
                }
                ++v2;
                arr_s = arr_s1;
            }
        }
        if(!hashSet1.isEmpty()) {
            ˆʿ0.MTH1156(s2, hashSet1);
        }
        CLS372.MTH5405(arrayList1);
        CLS366 ﾞᐧ0 = new CLS366(activity0, arrayList1);
        StringBuilder stringBuilder1 = CLS182.MTH3483(s2);
        stringBuilder1.append(" (");
        stringBuilder1.append(arrayList1.size());
        stringBuilder1.append(")");
        CLS403.FLD3895 = CLS523.MTH7162(z, activity0, stringBuilder1.toString(), ((CLS379)new CLS766(activity0, ﾞᐧ0, ˆʿ0, s2, arrayList1, 17)), ((CLS378)new CLS580(activity0, ˆʿ0, s2, arrayList1, ﾞᐧ0, s7)), null);
    }
}

