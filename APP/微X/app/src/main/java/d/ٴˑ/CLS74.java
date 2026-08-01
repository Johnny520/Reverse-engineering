// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import d.ˎˏ.CLS1;
import d.ˑʽ.CLS13;
import d.ˑʽ.CLS28.CLS141;
import d.ˑʽ.CLS28;
import d.יʻ.CLS63;
import d.יʻ.CLS69;
import d.ᵎʻ.CLS117;
import d.ⁱٴ.CLS123;
import d.ⁱٴ.CLS126;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class CLS74 implements View.OnClickListener {
    public final Activity FLD355;
    public final int FLD356;
    public final Object FLD357;

    public CLS74(Activity activity0, CLS91 ٴˆ0) {
        this.FLD356 = 0;
        super();
        this.FLD357 = ٴˆ0;
        this.FLD355 = activity0;
    }

    public CLS74(Activity activity0, Serializable serializable0, int v) {
        this.FLD356 = v;
        this.FLD355 = activity0;
        this.FLD357 = serializable0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD355;
        Object object0 = this.FLD357;
        switch(this.FLD356) {
            case 0: {
                ((CLS91)object0).getClass();
                CLS117 יʻ0 = new CLS117(activity0);
                LinkedHashMap linkedHashMap0 = ((CLS91)object0).FLD492;
                for(Object object1: linkedHashMap0.keySet()) {
                    String s = (String)object1;
                    HashMap hashMap0 = ((CLS91)object0).FLD493;
                    String s1 = hashMap0.containsKey(s) ? ((String)hashMap0.get(s)) : s;
                    CLS123 ᐧי0 = (CLS123)linkedHashMap0.get(s);
                    יʻ0.FLD658.put(s1, s);
                    יʻ0.FLD660.put(s, ᐧי0);
                }
                יʻ0.MTH1147();
                return;
            }
            case 1: {
                File file0 = (File)object0;
                try {
                    SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
                    File file1 = new File(activity0.getCacheDir(), "log_" + simpleDateFormat0.format(new Date()) + ".txt");
                    try {
                        CLS63.MTH770(new FileInputStream(file0), new FileOutputStream(file1));
                    }
                    catch(Throwable throwable1) {
                        CLS69.MTH797(throwable1);
                    }
                    CLS63.MTH764(file1.getAbsolutePath());
                    CLS1.MTH368(file1);
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
                return;
            }
            case 2: {
                CLS13.MTH428(activity0, ((String)object0));
                CLS13.MTH426(activity0, CLS69.MTH795("copy_to_clipboard"));
                return;
            }
            case 3: {
                CLS28.MTH533(activity0, ((CLS126)new CLS141(((double[])object0))));
                return;
            }
            default: {
                CLS13.MTH428(activity0, ((String[])object0)[1].trim());
                CLS13.MTH426(activity0, CLS69.MTH795("copy_to_clipboard"));
            }
        }
    }
}

