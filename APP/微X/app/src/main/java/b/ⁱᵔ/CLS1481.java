// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS4;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS81;
import b.ⁱʾ.CLS341.CLS339;
import b.ⁱʾ.CLS341;
import b.ⁱʾ.CLS344.CLS342;
import b.ⁱʾ.CLS344;
import b.ⁱʾ.CLS347.CLS345;
import b.ⁱʾ.CLS347;
import b.ⁱʾ.CLS353.CLS351;
import b.ⁱʾ.CLS353;
import b.ⁱˉ.CLS370;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS1624.CLS540;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629.CLS548;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1630.CLS550;
import java.util.ArrayList;

public final class CLS1481 implements CLS4, CLS17, CLS39, CLS411, CLS539, CLS540, CLS548, CLS550 {
    public final int FLD4425;
    public final Object FLD4426;

    public CLS1481(int v, Object object0) {
        this.FLD4425 = v;
        this.FLD4426 = object0;
        super();
    }

    @Override  // b.ﾞˎ.CLS1624$CLS540
    public final void onQueryTextChange(String s) {
        Object object0 = this.FLD4426;
        switch(this.FLD4425) {
            case 2: {
                CLS341 ـﹳ0 = ((CLS341[])object0)[0];
                ـﹳ0.getClass();
                new CLS339(ـﹳ0).filter(s);
                return;
            }
            case 3: {
                ((CLS347)object0).getClass();
                new CLS345(((CLS347)object0)).filter(s);
                return;
            }
            case 4: {
                ((CLS353)object0).getClass();
                new CLS351(((CLS353)object0)).filter(s);
                return;
            }
            default: {
                ((CLS344)object0).getClass();
                new CLS342(((CLS344)object0)).filter(s);
            }
        }
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        Object object0 = this.FLD4426;
        if(this.FLD4425 == 9) {
            ((CLS1282)object0).FLD3507.FLD4096.MTH5050();
            ArrayList arrayList0 = ((CLS1282)object0).FLD3507.FLD4096.MTH5051();
            CLS404.MTH5896(((CLS1282)object0).FLD3507.FLD4088, arrayList0, null);
            return;
        }
        ((CLS13)object0).MTH770(null);
    }

    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS81 יᐧ0 = (CLS81)this.FLD4426;
        if(!TextUtils.isEmpty(s)) {
            יᐧ0.FLD307 = s;
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        Bundle bundle0 = (Bundle)this.FLD4426;
        try {
            switch(s) {
                case "delete": {
                    bundle0.putBoolean("deleteFlag", true);
                    return;
                }
                case "set_private": {
                    bundle0.putBoolean("deleteFlag", false);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        ((CLS1629)this.FLD4426).MTH7381("radio_front");
        ((CLS1629)this.FLD4426).MTH7381("radio_back");
        CLS523.MTH7147(linearLayout0, ((CLS18)(((CLS1629)this.FLD4426))), true);
        long v = CLS27.MTH895().MTH938("sight_front_camera_enable", false) ? 0x38E9060D2B3CD335L : 4100815640866902837L;
        ((CLS1629)this.FLD4426).MTH7375(CLS370.MTH5289(v));
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS412$CLS411
    public final void MTH5992(int v) {
        ArrayList arrayList0 = (ArrayList)this.FLD4426;
        try {
            CLS66.MTH1459(((long)((ContentValues)arrayList0.get(v)).getAsLong("snsId")));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS4
    public final void MTH776(String s) {
        ((CLS1626)this.FLD4426).MTH800(CLS443.FLD4310.replaceAll("\\|", "\n"));
    }
}

