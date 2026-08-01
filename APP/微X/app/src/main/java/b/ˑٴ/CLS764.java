// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ـˏ.CLS169;
import b.ـˏ.CLS889;
import b.ٴـ.CLS896.CLS170;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS443;
import b.ⁱᵔ.CLS466;

public final class CLS764 implements CLS12 {
    public final int FLD1035;
    public final long FLD1036;
    public final Object FLD1037;
    public final Object FLD1038;

    public CLS764(long v, String s, String s1) {
        this.FLD1035 = 2;
        super();
        this.FLD1037 = s;
        this.FLD1036 = v;
        this.FLD1038 = s1;
    }

    public CLS764(CLS629 ʻˋ0, Object object0, long v, int v1) {
        this.FLD1035 = v1;
        this.FLD1037 = ʻˋ0;
        this.FLD1038 = object0;
        this.FLD1036 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        long v = this.FLD1036;
        Object object1 = this.FLD1038;
        Object object2 = this.FLD1037;
        switch(this.FLD1035) {
            case 0: {
                CLS629 ʻˋ0 = (CLS629)object2;
                Activity activity0 = (Activity)object1;
                ʻˋ0.getClass();
                int v1 = (int)(((Integer)object0));
                try {
                    Intent intent0 = activity0.getIntent();
                    String s = intent0.getStringExtra("intent_thumbpath");
                    String s1 = intent0.getStringExtra("intent_videopath");
                    if(!TextUtils.isEmpty(s1)) {
                        CLS466.MTH6522(s1, s, "");
                        return;
                    }
                    if(v1 == 0) {
                        CLS466.MTH6527(v);
                        return;
                    }
                    CLS443.MTH6317(((CLS140)ʻˋ0).MTH3042(), v);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                CLS387.MTH5601(false, ((CLS140)(((CLS629)object2))).MTH3042(), ((CLS2)new CLS784(((CLS629)object2), ((String)object1), v)), -1);
                return;
            }
            default: {
                Object[] arr_object = {new CLS170(((CLS169)new CLS889(v, ((String)object2))), ((String)object1))};
                CLS21.FLD76.MTH818("sendMessageForwardItem", arr_object);
            }
        }
    }
}

