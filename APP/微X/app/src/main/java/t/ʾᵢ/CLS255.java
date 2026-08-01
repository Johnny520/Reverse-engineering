// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.FileObserver;
import java.util.Collections;
import java.util.HashMap;
import t.ˆʿ.CLS275;
import t.ˆʿ.CLS38.CLS37;
import t.ˆʿ.CLS38;
import t.ˆʿ.CLS43;
import t.ˊﾞ.CLS102;
import t.ٴـ.CLS117;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS300;
import t.ᵔʾ.CLS302;
import t.ⁱʾ.CLS140;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS144;

public final class CLS255 implements CLS143 {
    public final int FLD352;
    public final Activity FLD353;
    public final CLS216 FLD354;

    public CLS255(CLS216 ˎﾞ0, Activity activity0, int v) {
        this.FLD352 = v;
        this.FLD354 = ˎﾞ0;
        this.FLD353 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        int v;
        Activity activity0 = this.FLD353;
        boolean z = false;
        CLS216 ˎﾞ0 = this.FLD354;
        switch(this.FLD352) {
            case 0: {
                CLS102 יﹳ0 = ˎﾞ0.FLD236;
                if(יﹳ0 != null) {
                    HashMap hashMap0 = יﹳ0.FLD768;
                    if(!hashMap0.isEmpty()) {
                        for(Object object0: hashMap0.values()) {
                            ((FileObserver)object0).stopWatching();
                        }
                        hashMap0.clear();
                    }
                    ˎﾞ0.FLD236.MTH1813();
                    CLS117.FLD842.MTH1908();
                    if(CLS117.MTH1906()) {
                        String s = CLS133.MTH2103().MTH2134("current_theme", "");
                        if(!ˎﾞ0.FLD236.FLD773.equals(s)) {
                            String s1 = CLS133.MTH2099("apply_current_theme");
                            Object[] arr_object = {ˎﾞ0.FLD236.FLD773};
                            String s2 = CLS133.MTH2099("apply_theme");
                            CLS211 ˎﾞ$ᐧⁱ0 = new CLS211(ˎﾞ0);
                            CLS43.MTH1425(activity0, s2, ((CLS144)new CLS275(activity0, String.format(s1, arr_object))), ((CLS141)ˎﾞ$ᐧⁱ0));
                        }
                    }
                }
                return;
            }
            case 1: {
                ˎﾞ0.getClass();
                CLS200 ˊﾞ0 = new CLS200(ˎﾞ0, activity0, 5);
                String s3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                try {
                    if(!CLS123.FLD912.MTH2000("hasReadStoragePermission", new Object[0])) {
                        z = true;
                    }
                    else if(Build.VERSION.SDK_INT >= 30) {
                        if(activity0 == null) {
                            v = 0;
                            goto label_49;
                        label_48:
                            v = 0;
                        }
                        else {
                            try {
                                Context context0 = activity0.getApplicationContext();
                                if(context0 == null) {
                                    goto label_48;
                                }
                                else {
                                    ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
                                    v = applicationInfo0 == null ? 0 : applicationInfo0.targetSdkVersion;
                                }
                            }
                            catch(Throwable throwable1) {
                                CLS133.MTH2113(throwable1);
                                v = 0;
                            }
                        }
                    label_49:
                        if(v >= 30 && !CLS133.MTH2103().MTH2131("use_internal_file_browser", false)) {
                            z = true;
                        }
                    }
                    if(z) {
                        CLS125.MTH2030(new CLS302(activity0, ˊﾞ0, ˊﾞ0), new String[]{"application/zip"});
                        return;
                    }
                    CLS38 יᐧ0 = new CLS38(activity0);
                    יᐧ0.FLD476 = s3;
                    Collections.addAll(יᐧ0.FLD483, new String[]{"zip"});
                    יᐧ0.MTH1386(null, ((CLS37)new CLS300(activity0, ˊﾞ0, null, ˊﾞ0, 0)));
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                return;
            }
            case 2: {
                ˎﾞ0.getClass();
                CLS43.MTH1422(activity0, CLS133.MTH2099("add_theme"), CLS133.MTH2099("name"), "", 1, ((CLS140)new CLS265(ˎﾞ0, 18)));
                return;
            }
            case 3: {
                if(!ˎﾞ0.MTH1137()) {
                    CLS43.MTH1430(activity0, CLS133.MTH2099("rename_theme"), ˎﾞ0.FLD236.FLD773, 1, ((CLS140)new CLS265(ˎﾞ0, 22)));
                }
                return;
            }
            default: {
                if(!ˎﾞ0.MTH1137()) {
                    CLS43.MTH1430(activity0, CLS133.MTH2099("clone_theme"), ˎﾞ0.FLD236.FLD773, 1, ((CLS140)new CLS265(ˎﾞ0, 19)));
                }
            }
        }
    }
}

