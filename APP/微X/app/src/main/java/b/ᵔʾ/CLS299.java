// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˆٴ.CLS66;
import b.יᐧ.CLS163.CLS161;
import b.יᐧ.CLS163.CLS162;
import b.יᐧ.CLS163;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS466;
import java.io.File;

public final class CLS299 {
    public final CLS163 FLD3109;
    public static final CLS299 FLD3110;

    static {
        CLS299.FLD3110 = new CLS299();
    }

    public CLS299() {
        public final class CLS1245 implements CLS162 {
            public final CLS299 FLD3108;

            @Override  // b.יᐧ.CLS163$CLS162
            public final void MTH3162() {
            }

            @Override  // b.יᐧ.CLS163$CLS162
            public final void MTH3163(CLS163 ﾞᐧ0) {
                CLS161 ﾞᐧ$ٴـ0 = (CLS161)ﾞᐧ0.FLD1573.poll();
                long v = (long)(((Long)(ﾞᐧ$ٴـ0 == null ? null : ﾞᐧ$ٴـ0.FLD1571)));
                CLS299.this.getClass();
                ContentValues contentValues0 = CLS371.MTH5368(CLS371.FLD3470.MTH5361(v));
                if(contentValues0 == null) {
                    ﾞᐧ0.MTH3166();
                    return;
                }
                int v1 = (int)contentValues0.getAsInteger("type");
                String s = contentValues0.getAsString("content");
                String s1 = contentValues0.getAsString("talker");
                String s2 = contentValues0.getAsString("imgPath");
                long v2 = contentValues0.containsKey("msgSvrId") ? ((long)contentValues0.getAsLong("msgSvrId")) : 0L;
                switch(v1) {
                    case 3: {
                        CLS466.MTH6539(0, v, v2, ((CLS0)new CLS1259(this, ﾞᐧ0, s1, 0)), s2);
                        return;
                    }
                    case 43: 
                    case 62: {
                        CLS466.MTH6507(s2, ((CLS12)new CLS1251(this, ﾞᐧ0, s1, 0)), false, 500);
                        return;
                    }
                    case 0x41000031: {
                        CLS66.MTH1411(CLS392.MTH5633(s, "msg"), v, ((CLS12)new CLS1251(this, ﾞᐧ0, s1, 1)));
                        return;
                    }
                    default: {
                        ﾞᐧ0.MTH3166();
                    }
                }
            }
        }

        CLS1245 יᐧ$ˆٴ0 = new CLS1245(this);
        CLS163 ﾞᐧ0 = new CLS163();
        ﾞᐧ0.FLD1574 = יᐧ$ˆٴ0;
        this.FLD3109 = ﾞᐧ0;
    }

    public static void MTH4857(CLS299 יᐧ0, String s, File file0) {
        יᐧ0.getClass();
        if(CLS31.MTH1001(file0)) {
            try {
                if(CLS21.FLD76.MTH830("hasWriteStoragePermission", new Object[0])) {
                    String s1 = CLS27.MTH895().MTH925("auto_download_chat_media_save_path", "");
                    if(!TextUtils.isEmpty(s1)) {
                        CLS31.MTH978(file0, new File(new File(new File(s1), s), CLS31.MTH1034(file0.getName())));
                        return;
                    }
                }
                CLS31.MTH968(file0, CLS31.MTH1034(file0.getName()), new String[]{s});
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    public final void MTH4858(long v, long v1) {
        CLS163 ﾞᐧ0 = this.FLD3109;
        CLS161 ﾞᐧ$ٴـ0 = new CLS161(v1, v);
        ﾞᐧ0.FLD1573.offer(ﾞᐧ$ٴـ0);
        if(!ﾞᐧ0.MTH3167() && !ﾞᐧ0.FLD1578) {
            ﾞᐧ0.FLD1578 = true;
            ﾞᐧ0.MTH3165().postDelayed(ﾞᐧ0.FLD1576, v1);
        }
    }
}

