// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.text.TextUtils;
import b.ʾᵢ.CLS25.CLS24;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS82;
import b.ᵔʾ.CLS1229;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS54 {
    public final HashMap FLD171;
    public static final CLS54 FLD172;
    public boolean FLD173;
    public final HashSet FLD174;
    public CLS24 FLD175;

    static {
        CLS54.FLD172 = new CLS54();
    }

    public CLS54() {
        this.FLD171 = new HashMap();
        this.FLD174 = new HashSet();
        CLS1229 ˆٴ0 = new CLS1229(9, this);
        CLS40.FLD157.MTH1124(((CLS39)ˆٴ0));
    }

    public final void MTH1240(ArrayList arrayList0) {
        for(Object object0: arrayList0) {
            this.FLD174.remove(((String)object0));
        }
        for(Object object1: this.FLD171.values()) {
            CLS82 יﹳ0 = (CLS82)object1;
            יﹳ0.getClass();
            for(Object object2: arrayList0) {
                יﹳ0.FLD316.remove(((String)object2));
            }
            יﹳ0.MTH1672();
        }
    }

    public final ArrayList MTH1241(CLS82 יﹳ0) {
        ArrayList arrayList0 = new ArrayList();
        if(יﹳ0 != null) {
            for(int v = 0; true; ++v) {
                try {
                    if(v >= יﹳ0.MTH1678()) {
                        break;
                    }
                    InputStream inputStream0 = this.FLD175.MTH857(יﹳ0.MTH1674(v));
                    if(inputStream0 != null) {
                        arrayList0.add(inputStream0);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                    break;
                }
            }
        }
        return arrayList0;
    }

    // This method was un-flattened
    public final void MTH1242(CLS82 יﹳ0, int v) {
        int v2;
        boolean z;
        String s = יﹳ0.MTH1674(v);
        String s1 = יﹳ0.FLD314;
        יﹳ0.FLD313.remove(v);
        Iterator iterator0 = this.MTH1248().iterator();
    alab1:
        while(true) {
            do {
                z = false;
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                CLS82 יﹳ1 = (CLS82)object0;
                if(יﹳ1.FLD314.equals(s1)) {
                    continue alab1;
                }
                int v1 = יﹳ1.MTH1678();
                v2 = 0;
            label_11:
            }
            while(v2 >= v1);
            if(!s.equals(יﹳ1.MTH1674(v2))) {
                ++v2;
                goto label_11;
            }
            z = true;
            break;
        }
        if(!z) {
            this.FLD175.MTH853(s);
        }
    }

    public final void MTH1243(CLS82 יﹳ0, File file0, int v) {
        try {
            if(CLS31.MTH990(file0, CLS25.MTH865(11, file0.getName(), CLS31.MTH986(file0)))) {
                יﹳ0.MTH1673(Math.max(1, v), file0.getName());
                this.MTH1244(יﹳ0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final void MTH1244(CLS82 יﹳ0) {
        this.FLD171.put(יﹳ0.FLD314, יﹳ0);
        this.FLD174.addAll(יﹳ0.FLD316);
        יﹳ0.MTH1672();
    }

    public static CLS54 MTH1245() {
        return CLS54.FLD172;
    }

    public final void MTH1246(CLS82 יﹳ0) {
        try {
            this.FLD171.remove(יﹳ0.FLD314);
            for(int v = 0; v < יﹳ0.MTH1678(); ++v) {
                this.MTH1242(יﹳ0, v);
            }
            this.FLD175.MTH853(יﹳ0.FLD314);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final void MTH1247(CLS82 יﹳ0, String s, int v) {
        try {
            CLS69 ʾᵢ0 = new CLS69(CLS66.MTH1483(s));
            if(CLS31.MTH1036(ʾᵢ0.MTH1554(), CLS25.MTH865(11, ʾᵢ0.MTH1555(), CLS31.MTH986(ʾᵢ0.MTH1567())))) {
                יﹳ0.MTH1673(Math.max(1, v), ʾᵢ0.MTH1555());
                this.MTH1244(יﹳ0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final ArrayList MTH1248() {
        if(!this.FLD173) {
            this.MTH1249();
        }
        return new ArrayList(this.FLD171.values());
    }

    // 此方法包含解密的字符串
    public final void MTH1249() {
        CLS24 ˉᐧ$ˆٴ0 = this.FLD175;
        if(ˉᐧ$ˆٴ0 == null) {
            this.FLD175 = CLS25.MTH862(11);
        }
        else {
            ˉᐧ$ˆٴ0.MTH858();
        }
        if(this.FLD175.MTH854()) {
            return;
        }
        boolean z = this.FLD175.MTH856("voice_db");
        HashSet hashSet0 = this.FLD174;
        HashMap hashMap0 = this.FLD171;
        if(!z) {
            if(!this.FLD175.MTH854()) {
                CLS24 ˉᐧ$ˆٴ1 = this.FLD175;
                ˉᐧ$ˆٴ1.getClass();
                for(Object object0: new ArrayList(ˉᐧ$ˆٴ1.FLD85)) {
                    String s = (String)object0;
                    if(s.endsWith(".json")) {
                        String s1 = CLS31.MTH998(this.FLD175.MTH857(s));
                        if(!TextUtils.isEmpty(s1)) {
                            try {
                                CLS82 יﹳ0 = new CLS82(new JSONObject(s1));
                                if(hashMap0.containsKey(יﹳ0.FLD314.trim()) || (יﹳ0.FLD313 == null || יﹳ0.FLD313.isEmpty())) {
                                    continue;
                                }
                                hashMap0.put(יﹳ0.FLD314, יﹳ0);
                                hashSet0.addAll(יﹳ0.FLD316);
                            }
                            catch(Throwable throwable0) {
                                CLS27.MTH893(throwable0);
                            }
                        }
                    }
                }
                this.FLD173 = true;
            }
            return;
        }
        try {
            String s2 = CLS31.MTH998(this.FLD175.MTH857("voice_db"));
            if(TextUtils.isEmpty(s2)) {
                return;
            }
            JSONArray jSONArray0 = new JSONArray(s2);
            for(int v = 0; v < jSONArray0.length(); ++v) {
                CLS82 יﹳ1 = new CLS82(jSONArray0.getJSONObject(v));
                if(!hashMap0.containsKey(יﹳ1.FLD314.trim()) && (יﹳ1.FLD313 != null && !יﹳ1.FLD313.isEmpty())) {
                    hashMap0.put(יﹳ1.FLD314, יﹳ1);
                    hashSet0.addAll(יﹳ1.FLD316);
                }
                if(!this.FLD175.MTH856(יﹳ1.FLD314)) {
                    יﹳ1.MTH1672();
                }
            }
            this.FLD175.MTH853("voice_db");
            this.FLD173 = true;
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }

    public final CLS82 MTH1250(String s) {
        if(!this.FLD173) {
            this.MTH1249();
        }
        return this.FLD171.isEmpty() ? null : ((CLS82)this.FLD171.get(s.trim()));
    }
}

