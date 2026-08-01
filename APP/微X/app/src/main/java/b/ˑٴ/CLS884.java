// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS38.CLS37;
import b.ˆʿ.CLS43;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS412;
import java.lang.ref.WeakReference;

public final class CLS884 implements CLS37 {
    public final int FLD1529;
    public final CLS139 FLD1530;

    public CLS884(CLS139 ﹶʼ0, int v) {
        this.FLD1529 = v;
        this.FLD1530 = ﹶʼ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS38$CLS37
    public final Object MTH1108(Object[] arr_object) {
        Object object4;
        boolean z = true;
        CLS139 ﹶʼ0 = this.FLD1530;
        switch(this.FLD1529) {
            case 0: {
                return Boolean.valueOf(ﹶʼ0.FLD1426);
            }
            case 1: {
                ﹶʼ0.getClass();
                try {
                    Object object0 = arr_object[0];
                    if(!TextUtils.isEmpty(CLS27.MTH897("chattingUiMenuCheck"))) {
                        if(((Boolean)CLS166.MTH3195(object0, CLS27.MTH897("chattingUiMenuCheck"), new Object[0])).booleanValue()) {
                            return true;
                        }
                    }
                    else if(!TextUtils.isEmpty(CLS27.MTH897("chattingUiMenuCheckField1"))) {
                        if(CLS412.MTH6009(((Activity)CLS166.MTH3195(object0, CLS27.MTH897("chattingUIGetActivity"), new Object[0]))).endsWith("ChattingUI")) {
                            return false;
                        }
                        if(!TextUtils.isEmpty(CLS27.MTH897("ChattingComponentManagerField1"))) {
                            ﹶʼ0.FLD1429 = CLS166.MTH3194(object0, CLS27.MTH897("ChattingComponentManagerField1"));
                        }
                        Object object1 = ﹶʼ0.FLD1429;
                        if(object1 != null) {
                            return Boolean.valueOf(!((Boolean)CLS166.MTH3194(object1, CLS27.MTH897("chattingUiMenuCheckField1"))).booleanValue());
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return false;
            }
            case 2: {
                return ﹶʼ0.FLD1429;
            }
            case 3: {
                ﹶʼ0.getClass();
                Object object2 = arr_object[0];
                Intent intent0 = ((Activity)CLS166.MTH3195(object2, CLS27.MTH897("chattingUIGetActivity"), new Object[0])).getIntent();
                if(intent0.hasExtra("Chat_User")) {
                    return intent0.getStringExtra("Chat_User");
                }
                try {
                    if(TextUtils.isEmpty(CLS27.MTH897("ChattingComponentManagerField1"))) {
                        object4 = CLS166.MTH3195(object2, CLS27.MTH897("getTalkerUsernameMethod"), new Object[0]);
                    }
                    else {
                        Object object3 = CLS166.MTH3194(object2, CLS27.MTH897("ChattingComponentManagerField1"));
                        ﹶʼ0.FLD1429 = object3;
                        object4 = CLS166.MTH3195(object3, CLS27.MTH897("getTalkerUsernameMethod"), new Object[0]);
                    }
                    return (String)object4;
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                    return "";
                }
            }
            case 4: {
                return ﹶʼ0.FLD1434;
            }
            case 5: {
                CLS43 ˆʿ0 = ﹶʼ0.FLD1435;
                return ˆʿ0 != null ? ˆʿ0.MTH1165() : null;
            }
            case 6: {
                return ﹶʼ0.MTH3026();
            }
            case 7: {
                return ﹶʼ0.MTH3015();
            }
            case 8: {
                WeakReference weakReference0 = ﹶʼ0.FLD1416;
                return weakReference0 != null ? ((Activity)weakReference0.get()) : null;
            }
            case 9: {
                if(!ﹶʼ0.FLD1399 || (ﹶʼ0.FLD1432 == null || !ﹶʼ0.FLD1432.isAlive())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            case 10: {
                Object object5 = ﹶʼ0.FLD1413;
                if(object5 != null) {
                    try {
                        if(((long)(((Long)CLS166.MTH3195(object5, CLS27.MTH892("getLastQuoteMsgId", "getLastQuoteMsgId"), new Object[0])))) == 0L) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                }
                return false;
            }
            default: {
                return ﹶʼ0.FLD1423 == null ? null : ﹶʼ0.FLD1423.get();
            }
        }
    }
}

