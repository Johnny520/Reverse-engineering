// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS10;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS166;
import b.ᵔʾ.CLS307.CLS306;
import b.ᵔʾ.CLS307;
import b.ⁱᵔ.CLS371;
import java.util.ArrayList;

public final class CLS690 implements CLS10, CLS39 {
    public final long FLD780;
    public final Object FLD781;

    public CLS690(long v, String s) {
        this.FLD780 = v;
        this.FLD781 = s;
    }

    public CLS690(CLS864 ﹶ0, long v) {
        this.FLD781 = ﹶ0;
        this.FLD780 = v;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        Object object0 = ((CLS864)this.FLD781).FLD1387;
        try {
            CLS371.FLD3470.getClass();
            String s = CLS27.MTH882("q_db7");
            Object object1 = CLS66.MTH1448(CLS371.FLD3470.MTH5307(s, new String[]{String.valueOf(this.FLD780)}));
            if(object1 != null) {
                if(TextUtils.isEmpty(CLS27.MTH897("transcribeField1"))) {
                    if(!TextUtils.isEmpty(CLS27.MTH897("transcribeMethod"))) {
                        CLS166.MTH3195(object0, CLS27.MTH897("transcribeMethod"), new Object[]{object1});
                        return;
                    }
                    if((!TextUtils.isEmpty(CLS27.MTH897("transcribeMethod2")) || !TextUtils.isEmpty(CLS27.MTH897("transcribeMethod3"))) && !TextUtils.isEmpty(CLS27.MTH897("ChattingComponentManagerField1"))) {
                        Object object3 = CLS166.MTH3194(object0, CLS27.MTH897("ChattingComponentManagerField1"));
                        if(object3 != null) {
                            Class class0 = CLS27.MTH894("transcribeClass");
                            if(class0 != null) {
                                if(CLS27.MTH890("ChattingComponentManagerField1_field1")) {
                                    object3 = CLS166.MTH3194(object3, CLS27.MTH897("ChattingComponentManagerField1_field1"));
                                }
                                Object object4 = CLS166.MTH3195(object3, CLS27.MTH897("ChattingComponentManagerGetMethod"), new Object[]{class0});
                                if(!TextUtils.isEmpty(CLS27.MTH897("transcribeMethod2"))) {
                                    CLS166.MTH3195(object4, CLS27.MTH897("transcribeMethod2"), new Object[]{object1, Boolean.TRUE});
                                    return;
                                }
                                CLS166.MTH3195(object4, CLS27.MTH897("transcribeMethod3"), new Object[]{object1, Boolean.TRUE, -1, 3});
                            }
                        }
                    }
                }
                else {
                    Object object2 = CLS166.MTH3194(object0, CLS27.MTH897("transcribeField1"));
                    if(!TextUtils.isEmpty(CLS27.MTH897("transcribeMethod1"))) {
                        CLS166.MTH3195(object2, CLS27.MTH897("transcribeMethod1"), new Object[]{object1});
                        return;
                    }
                    if(!TextUtils.isEmpty(CLS27.MTH897("transcribeMethod2"))) {
                        CLS166.MTH3195(object2, CLS27.MTH897("transcribeMethod2"), new Object[]{object1, Boolean.TRUE});
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS10
    public final void MTH788(ArrayList arrayList0) {
        long v = this.FLD780;
        String s = (String)this.FLD781;
        for(Object object0: arrayList0) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(contentValues0.getAsString("type").equals("text") && (!contentValues0.containsKey("plugin") || CLS27.MTH895().MTH938("sns_mly_reply_wanjinyou", true) || !"null".equals(contentValues0.getAsString("plugin")))) {
                CLS306 ⁱʽ$ᵔʾ0 = new CLS306(1000, v, s, contentValues0.getAsString("content"));
                CLS307.FLD3187.FLD3186.MTH3150(ⁱʽ$ᵔʾ0);
                CLS307.FLD3187.FLD3186.MTH3149(1000L);
            }
        }
    }
}

