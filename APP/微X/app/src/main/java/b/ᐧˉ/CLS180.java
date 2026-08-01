// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS27;
import org.json.JSONObject;

public final class CLS180 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD1746;
    public final CLS244 FLD1747;

    public CLS180(CLS244 ᴵʻ0, int v) {
        this.FLD1746 = v;
        this.FLD1747 = ᴵʻ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS244 ᴵʻ0 = this.FLD1747;
        switch(this.FLD1746) {
            case 0: {
                ᴵʻ0.getClass();
                String s = TextUtils.isEmpty(ᴵʻ0.FLD2542) ? "autoresponse_keywords_enable" : ᴵʻ0.FLD2542 + "_" + "autoresponse_keywords_enable";
                ᴵʻ0.FLD2552.MTH922(Boolean.valueOf(z), s);
                return;
            }
            case 1: {
                ᴵʻ0.getClass();
                try {
                    if(ᴵʻ0.FLD2551 == null) {
                        ᴵʻ0.FLD2551 = new JSONObject();
                    }
                    ᴵʻ0.FLD2551.put("specify_id", z);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 2: {
                ᴵʻ0.getClass();
                try {
                    if(ᴵʻ0.FLD2551 == null) {
                        ᴵʻ0.FLD2551 = new JSONObject();
                    }
                    ᴵʻ0.FLD2551.put("chatroom", z);
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 3: {
                ᴵʻ0.getClass();
                try {
                    if(ᴵʻ0.FLD2551 == null) {
                        ᴵʻ0.FLD2551 = new JSONObject();
                    }
                    ᴵʻ0.FLD2551.put("private", z);
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 4: {
                ᴵʻ0.getClass();
                try {
                    if(ᴵʻ0.FLD2551 == null) {
                        ᴵʻ0.FLD2551 = new JSONObject();
                    }
                    ᴵʻ0.FLD2551.put("specify_id", z);
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
                return;
            }
            case 5: {
                ᴵʻ0.getClass();
                try {
                    if(ᴵʻ0.FLD2551 == null) {
                        ᴵʻ0.FLD2551 = new JSONObject();
                    }
                    ᴵʻ0.FLD2551.put("chatroom", z);
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                return;
            }
            default: {
                ᴵʻ0.getClass();
                try {
                    if(ᴵʻ0.FLD2551 == null) {
                        ᴵʻ0.FLD2551 = new JSONObject();
                    }
                    ᴵʻ0.FLD2551.put("private", z);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

