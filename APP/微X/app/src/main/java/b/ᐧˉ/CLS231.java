// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import org.json.JSONObject;

public final class CLS231 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2255;
    public final CLS210 FLD2256;

    public CLS231(CLS210 ˋʼ0, int v) {
        this.FLD2255 = v;
        this.FLD2256 = ˋʼ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS210 ˋʼ0 = this.FLD2256;
        switch(this.FLD2255) {
            case 0: {
                String s1 = CLS34.MTH1074(new StringBuilder(), ˋʼ0.FLD1998, 4100600029213676341L);
                ˋʼ0.FLD2017.MTH922(Boolean.valueOf(z), s1);
                return;
            }
            case 1: {
                ˋʼ0.getClass();
                try {
                    if(ˋʼ0.FLD2018 == null) {
                        ˋʼ0.FLD2018 = new JSONObject();
                    }
                    ˋʼ0.FLD2018.put("chatroom", z);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 2: {
                ˋʼ0.getClass();
                try {
                    if(ˋʼ0.FLD2018 == null) {
                        ˋʼ0.FLD2018 = new JSONObject();
                    }
                    ˋʼ0.FLD2018.put("private", z);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 3: {
                ˋʼ0.getClass();
                try {
                    if(ˋʼ0.FLD2018 == null) {
                        ˋʼ0.FLD2018 = new JSONObject();
                    }
                    ˋʼ0.FLD2018.put("chatroom", z);
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 4: {
                ˋʼ0.getClass();
                try {
                    if(ˋʼ0.FLD2018 == null) {
                        ˋʼ0.FLD2018 = new JSONObject();
                    }
                    ˋʼ0.FLD2018.put("private", z);
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            default: {
                String s = CLS34.MTH1074(new StringBuilder(), ˋʼ0.FLD1998, 4100627156227117877L);
                ˋʼ0.FLD2017.MTH922(Boolean.valueOf(z), s);
            }
        }
    }
}

