// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS502;

public final class CLS1051 implements CLS8 {
    public final CLS210 FLD2246;

    public CLS1051(CLS210 ˋʼ0) {
        this.FLD2246 = ˋʼ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        StringBuilder stringBuilder0;
        try {
            boolean z = CLS502.MTH6934(((String)object0), new String[]{"com.android.providers.media.photopicker"});
            CLS210 ˋʼ0 = this.FLD2246;
            if(z) {
                String s = ˋʼ0.FLD2002.MTH1255(((String)object0));
                stringBuilder0 = new StringBuilder();
                stringBuilder0.append("#img ");
                stringBuilder0.append(s);
            }
            else {
                stringBuilder0 = new StringBuilder();
                stringBuilder0.append("#pic ");
                stringBuilder0.append(((String)object0));
            }
            ˋʼ0.FLD2007.MTH7277(stringBuilder0.toString());
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

