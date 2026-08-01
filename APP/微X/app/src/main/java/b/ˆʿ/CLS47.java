// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.text.TextUtils;
import b.ʾᵢ.CLS25.CLS24;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS81;
import b.ᵔʾ.CLS1229;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS47 {
    public interface CLS46 {
    }

    public final HashMap FLD164;
    public CLS24 FLD165;
    public boolean FLD166;
    public static final CLS47 FLD167;

    static {
        CLS47.FLD167 = new CLS47();
    }

    public CLS47() {
        this.FLD164 = new HashMap();
        CLS1229 ˆٴ0 = new CLS1229(8, this);
        CLS40.FLD157.MTH1124(((CLS39)ˆٴ0));
    }

    public final void MTH1194(CLS81 יᐧ0) {
        this.FLD164.put(יᐧ0.FLD308, יᐧ0);
        יᐧ0.MTH1668();
    }

    // 此方法包含解密的字符串
    public final void MTH1195(CLS81 יᐧ0) {
        try {
            this.FLD164.remove(יᐧ0.FLD308);
            this.FLD165.MTH853(יᐧ0.FLD310 + "_amr");
            this.FLD165.MTH853(יᐧ0.FLD310 + ".wav");
            for(int v = 0; v < יᐧ0.FLD306.size(); ++v) {
                String s = יᐧ0.FLD310 + "_p" + v + "_amr";
                if(this.FLD165.MTH856(s)) {
                    this.FLD165.MTH853(s);
                }
            }
            this.FLD165.MTH853(CLS31.MTH979(יᐧ0.FLD310, "json"));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1196() {
        CLS24 ˉᐧ$ˆٴ0 = this.FLD165;
        if(ˉᐧ$ˆٴ0 == null) {
            this.FLD165 = CLS25.MTH862(3);
        }
        else {
            ˉᐧ$ˆٴ0.MTH858();
        }
        if(this.FLD165.MTH854()) {
            return;
        }
        boolean z = this.FLD165.MTH856("sounds_db");
        HashMap hashMap0 = this.FLD164;
        if(!z) {
            if(!this.FLD165.MTH854()) {
                CLS24 ˉᐧ$ˆٴ1 = this.FLD165;
                ˉᐧ$ˆٴ1.getClass();
                for(Object object0: new ArrayList(ˉᐧ$ˆٴ1.FLD85)) {
                    String s = (String)object0;
                    if(s.endsWith(".json")) {
                        String s1 = CLS31.MTH998(this.FLD165.MTH857(s));
                        if(!TextUtils.isEmpty(s1)) {
                            try {
                                CLS81 יᐧ0 = new CLS81(new JSONObject(s1));
                                if(!this.MTH1200(יᐧ0)) {
                                    continue;
                                }
                                hashMap0.put(יᐧ0.FLD308, יᐧ0);
                            }
                            catch(Throwable throwable0) {
                                CLS27.MTH893(throwable0);
                            }
                        }
                    }
                }
                this.FLD166 = true;
            }
            return;
        }
        try {
            String s2 = CLS31.MTH998(this.FLD165.MTH857("sounds_db"));
            if(TextUtils.isEmpty(s2)) {
                this.FLD166 = true;
                return;
            }
            JSONArray jSONArray0 = new JSONArray(s2);
            for(int v = 0; true; ++v) {
                if(v >= jSONArray0.length()) {
                    this.FLD165.MTH853("sounds_db");
                    this.FLD166 = true;
                    return;
                }
                try {
                    CLS81 יᐧ1 = new CLS81(jSONArray0.getJSONObject(v));
                    if(this.MTH1200(יᐧ1)) {
                        hashMap0.put(יᐧ1.FLD308, יᐧ1);
                    }
                    if(!this.FLD165.MTH856(יᐧ1.FLD310)) {
                        יᐧ1.MTH1668();
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }

    public final long MTH1197() {
        long v;
        HashSet hashSet0 = new HashSet();
        for(Object object0: this.FLD164.values()) {
            hashSet0.add(((CLS81)object0).FLD308);
        }
        do {
            v = System.currentTimeMillis();
        }
        while(hashSet0.contains(v));
        hashSet0.add(v);
        return v;
    }

    public final ArrayList MTH1198() {
        if(!this.FLD166) {
            this.MTH1196();
        }
        return new ArrayList(this.FLD164.values());
    }

    public final CLS81 MTH1199(long v) {
        if(!this.FLD166) {
            this.MTH1196();
        }
        return this.FLD164.containsKey(v) ? ((CLS81)this.FLD164.get(v)) : null;
    }

    // 此方法包含解密的字符串
    public final boolean MTH1200(CLS81 יᐧ0) {
        int v = יᐧ0.FLD312;
        if(v == 2) {
            return false;
        }
        if(v == 3 && this.FLD165.MTH856(יᐧ0.FLD310 + ".wav")) {
            return true;
        }
        if(יᐧ0.FLD312 == 1) {
            if(this.FLD165.MTH856(יᐧ0.FLD310 + "_amr")) {
                return true;
            }
            for(int v1 = 0; v1 < יᐧ0.FLD306.size(); ++v1) {
                if(!this.FLD165.MTH856(יᐧ0.FLD310 + "_p" + v1 + "_amr")) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH1201(CLS81 יᐧ0) {
        long v = יᐧ0.FLD308;
        if(!this.FLD166) {
            this.MTH1196();
        }
        if(!this.FLD164.containsKey(v)) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        try {
            if(this.FLD165.MTH856(יᐧ0.FLD310 + "_amr")) {
                arrayList0.add(this.FLD165.MTH857(יᐧ0.FLD310 + "_amr"));
                return arrayList0;
            }
            ArrayList arrayList1 = יᐧ0.FLD306;
            for(int v1 = 0; v1 < arrayList1.size(); ++v1) {
                String s = יᐧ0.FLD310 + "_p" + v1 + "_amr";
                InputStream inputStream0 = this.FLD165.MTH856(s) ? this.FLD165.MTH857(s) : null;
                if(inputStream0 != null) {
                    arrayList0.add(inputStream0);
                }
            }
            return arrayList0;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }
}

