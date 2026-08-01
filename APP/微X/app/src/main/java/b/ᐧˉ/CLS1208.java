// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS31;
import org.json.JSONArray;

public final class CLS1208 implements CLS16 {
    public final int FLD2842;
    public final JSONArray FLD2843;
    public final Activity FLD2844;

    public CLS1208(Activity activity0, JSONArray jSONArray0, int v) {
        this.FLD2842 = v;
        this.FLD2844 = activity0;
        this.FLD2843 = jSONArray0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        Activity activity0 = this.FLD2844;
        JSONArray jSONArray0 = this.FLD2843;
        switch(this.FLD2842) {
            case 0: {
                if(!TextUtils.isEmpty(s)) {
                    CLS31.MTH999(activity0, jSONArray0.toString(), CLS31.MTH979(s, "json"));
                }
                return;
            }
            case 1: {
                if(!TextUtils.isEmpty(s)) {
                    CLS31.MTH999(activity0, jSONArray0.toString(), CLS31.MTH979(s, "json"));
                }
                return;
            }
            default: {
                if(!TextUtils.isEmpty(s)) {
                    CLS31.MTH999(activity0, jSONArray0.toString(), CLS31.MTH979(s, "json"));
                }
            }
        }
    }
}

