// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.ـˏ.CLS169;
import b.ـˏ.CLS889;
import b.ٴـ.CLS896.CLS170;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS432;
import java.io.File;
import java.util.ArrayList;

public final class CLS751 implements CLS16, CLS39 {
    public final int FLD980;
    public final ArrayList FLD981;
    public final String FLD982;

    public CLS751(int v, String s, ArrayList arrayList0) {
        this.FLD980 = v;
        this.FLD982 = s;
        this.FLD981 = arrayList0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        ArrayList arrayList0 = this.FLD981;
        String s = this.FLD982;
        if(this.FLD980 == 0) {
            CLS426.MTH6131(s, arrayList0, false);
            return;
        }
        File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "wx_shortvid_temp.mp4");
        if(!CLS432.MTH6185(file0.getAbsolutePath(), s)) {
            CLS27.MTH906("download failed!");
            return;
        }
        Object[] arr_object = {new CLS170(((CLS169)new CLS889(file0)), 2, arrayList0)};
        CLS21.FLD76.MTH818("sendMessageForwardItem", arr_object);
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        ArrayList arrayList0 = this.FLD981;
        String s1 = this.FLD982;
        if(this.FLD980 == 1) {
            CLS66.MTH1427(s1, CLS426.MTH6121(s1, arrayList0) + s, arrayList0);
            return;
        }
        CLS66.MTH1427(s1, CLS426.MTH6121(s1, arrayList0) + s, arrayList0);
    }
}

