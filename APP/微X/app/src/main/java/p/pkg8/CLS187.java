// Decompiled by JEB v5.42.0.202606242140

package p.pkg8;

import android.os.Build.VERSION;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import org.json.JSONObject;
import p.pkg1.CLS1;
import p.pkg5.CLS23;
import p.pkg5.CLS25;
import p.pkg5.CLS30;
import p.pkg5.CLS32;

public final class CLS187 implements CLS42 {
    public final int FLD342;

    public CLS187(int v) {
        this.FLD342 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // p.pkg8.CLS43$CLS42
    public final void run() {
        JSONObject jSONObject0;
        CLS51 ٴﹶ0;
        boolean z2;
        boolean z1;
        long v2;
        String s2;
        switch(this.FLD342) {
            case 0: {
                CLS52 ᐧᴵ0 = (CLS52)CLS43.FLD320.MTH883(CLS52.class);
                if(!CLS23.MTH810() || !TextUtils.isEmpty(CLS25.FLD285.MTH819()) == 0 || !CLS25.FLD285.MTH820() || !CLS25.FLD285.MTH821("sns_external_video")) {
                    CLS53.FLD362.MTH944("core", "unloadFeature", new Object[]{"vidurlparser", "vidurlparser license failed 2"});
                    CLS53.FLD362.MTH941();
                }
                else {
                    String s = CLS44.FLD328;
                    if(Build.VERSION.SDK_INT >= 21) {
                        String[] arr_s = Build.SUPPORTED_ABIS;
                        int v1 = 0;
                        while(v1 < arr_s.length) {
                            String s1 = CLS32.MTH839(arr_s[v1]);
                            if(!TextUtils.isEmpty(s1)) {
                                s2 = s1;
                                goto label_28;
                            }
                            ++v1;
                        }
                    }
                    s2 = CLS32.MTH839(Build.CPU_ABI);
                label_28:
                    if(!CLS32.MTH839(Build.CPU_ABI).equals("arm64")) {
                        v2 = s2.contains("arm") || !s2.contains("x86") ? 0xFFFFED851204CC31L : 0xFFFFED7A1204CC31L;
                    }
                    else if(s2.contains("arm")) {
                        v2 = -20302008103887L;
                    }
                    else if(s2.contains("x86")) {
                        v2 = 0xFFFFED831204CC31L;
                    }
                    else {
                        v2 = 0xFFFFED851204CC31L;
                    }
                    File file0 = new File(s, CLS30.MTH833(CLS1.MTH401(v2)));
                    ᐧᴵ0.getClass();
                    try {
                        if(!file0.exists() || file0.length() == 0L) {
                            goto label_48;
                        }
                        else {
                            z1 = true;
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS44.MTH897(throwable0);
                        z1 = false;
                    }
                    goto label_49;
                label_48:
                    z1 = false;
                label_49:
                    if(z1) {
                        try {
                            z2 = ᐧᴵ0.MTH932(new FileInputStream(file0), new FileInputStream(file0.getAbsolutePath() + "_s"));
                        }
                        catch(Throwable throwable1) {
                            CLS44.MTH897(throwable1);
                            z2 = false;
                        }
                    }
                    else {
                        z2 = false;
                    }
                    if(z2) {
                        CLS48.MTH910();
                        try {
                            ٴﹶ0 = CLS44.MTH891();
                            jSONObject0 = new JSONObject();
                            ٴﹶ0.getClass();
                        }
                        catch(Throwable throwable2) {
                            CLS44.MTH897(throwable2);
                            return;
                        }
                        try {
                            Object object0 = ٴﹶ0.MTH930(jSONObject0, "LatestVersions");
                            if(object0 != null) {
                                jSONObject0 = (JSONObject)object0;
                            }
                            goto label_68;
                        }
                        catch(Throwable throwable3) {
                            try {
                                CLS44.MTH897(throwable3);
                            label_68:
                                if(jSONObject0.has("fp_vidurlparser") && 0x1F < ((int)Long.parseLong(jSONObject0.getString("fp_vidurlparser"), 16))) {
                                    CLS53.FLD362.MTH942("core", "downloadFeaturePack", new Object[]{"vidurlparser"});
                                    return;
                                }
                            }
                            catch(Throwable throwable2) {
                                CLS44.MTH897(throwable2);
                            }
                            return;
                        }
                    }
                    CLS53.FLD362.MTH944("core", "unloadFeature", new Object[]{"vidurlparser", "vidurlparser license failed 2"});
                    CLS53.FLD362.MTH941();
                    return;
                }
                try {
                }
                catch(Throwable throwable2) {
                    CLS44.MTH897(throwable2);
                }
                return;
            }
            case 1: {
                boolean z3 = CLS23.MTH810();
                CLS25 ˋˈ1 = CLS25.FLD285;
                if(z3 && !TextUtils.isEmpty(ˋˈ1.MTH819()) != 0 && ˋˈ1.MTH820() && ˋˈ1.MTH821("sns_external_video")) {
                    CLS48.FLD341 = 0;
                    ˋˈ1.FLD287 = true;
                    return;
                }
                CLS53.FLD362.MTH944("core", "unloadFeature", new Object[]{"vidurlparser", "vidurlparser license failed"});
                CLS53.FLD362.MTH941();
                return;
            }
            default: {
                boolean z = CLS23.MTH810();
                CLS25 ˋˈ0 = CLS25.FLD285;
                if(z && !TextUtils.isEmpty(ˋˈ0.MTH819()) != 0 && ˋˈ0.MTH820() && ˋˈ0.MTH821("sns_external_video")) {
                    CLS48.FLD341 = 0;
                    ˋˈ0.FLD287 = true;
                    return;
                }
                int v = CLS48.FLD341 + 1;
                CLS48.FLD341 = v;
                if(v == 1) {
                    CLS53.FLD362.MTH944("core", "check_updates", new Object[0]);
                }
                if(CLS48.FLD341 > 5) {
                    ˋˈ0.FLD287 = false;
                }
            }
        }
    }
}

