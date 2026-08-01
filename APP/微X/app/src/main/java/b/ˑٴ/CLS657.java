// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.Intent;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ⁱᵔ.CLS426;

public final class CLS657 implements CLS39 {
    public final int FLD662;
    public final String FLD663;
    public final String FLD664;
    public final CLS786 FLD665;
    public final String FLD666;
    public final int FLD667;

    public CLS657(CLS786 ᐧᵢ0, String s, String s1, String s2, int v, int v1) {
        this.FLD662 = v1;
        this.FLD665 = ᐧᵢ0;
        this.FLD664 = s;
        this.FLD666 = s1;
        this.FLD663 = s2;
        this.FLD667 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        int v = this.FLD667;
        String s = this.FLD663;
        String s1 = this.FLD666;
        String s2 = this.FLD664;
        CLS786 ᐧᵢ0 = this.FLD665;
        switch(this.FLD662) {
            case 0: {
                ᐧᵢ0.getClass();
                Intent intent1 = new Intent();
                intent1.putExtra("key_way", !CLS426.MTH6126(s2));
                intent1.putExtra("key_native_url", s1);
                intent1.putExtra("sendid", s);
                intent1.putExtra("key_username", s2);
                intent1.putExtra("auto_grab", true);
                intent1.putExtra("scene_id", v);
                intent1.setClassName(((CLS140)ᐧᵢ0).MTH3042(), CLS27.MTH897("LuckyMoneyReceiveUI"));
                ((CLS140)ᐧᵢ0).MTH3042().startActivity(intent1);
                return;
            }
            case 1: {
                ᐧᵢ0.getClass();
                Intent intent2 = new Intent();
                intent2.putExtra("key_way", !CLS426.MTH6126(s2));
                intent2.putExtra("key_native_url", s1);
                intent2.putExtra("sendid", s);
                intent2.putExtra("key_username", s2);
                intent2.putExtra("auto_grab", true);
                intent2.putExtra("scene_id", v);
                intent2.setClassName(((CLS140)ᐧᵢ0).MTH3042(), CLS27.MTH897("LuckyMoneyReceiveUI"));
                ((CLS140)ᐧᵢ0).MTH3042().startActivity(intent2);
                return;
            }
            default: {
                ᐧᵢ0.getClass();
                Intent intent0 = new Intent();
                intent0.putExtra("key_way", !CLS426.MTH6126(s2));
                intent0.putExtra("key_native_url", s1);
                intent0.putExtra("sendid", s);
                intent0.putExtra("key_username", s2);
                intent0.putExtra("auto_grab", true);
                intent0.putExtra("scene_id", v);
                intent0.setClassName(((CLS140)ᐧᵢ0).MTH3042(), CLS27.MTH897("LuckyMoneyReceiveUI"));
                ((CLS140)ᐧᵢ0).MTH3042().startActivity(intent0);
            }
        }
    }
}

