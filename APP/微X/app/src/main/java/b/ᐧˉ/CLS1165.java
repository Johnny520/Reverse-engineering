// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;
import b.ᵔʾ.CLS1259;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1165 implements CLS3 {
    public final int FLD2691;
    public final CLS359 FLD2692;
    public final Activity FLD2693;
    public final CLS210 FLD2694;
    public final ArrayList FLD2695;

    public CLS1165(int v, Activity activity0, CLS359 ⁱˉ0, CLS210 ˋʼ0, ArrayList arrayList0) {
        this.FLD2691 = v;
        this.FLD2694 = ˋʼ0;
        this.FLD2693 = activity0;
        this.FLD2695 = arrayList0;
        this.FLD2692 = ⁱˉ0;
        super();
    }

    public CLS1165(Activity activity0, CLS359 ⁱˉ0, CLS210 ˋʼ0, ArrayList arrayList0) {
        this.FLD2691 = 4;
        super();
        this.FLD2694 = ˋʼ0;
        this.FLD2695 = arrayList0;
        this.FLD2693 = activity0;
        this.FLD2692 = ⁱˉ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD2693;
        CLS359 ⁱˉ0 = this.FLD2692;
        ArrayList arrayList0 = this.FLD2695;
        CLS210 ˋʼ0 = this.FLD2694;
        switch(this.FLD2691) {
            case 0: {
                ˋʼ0.getClass();
                String s1 = CLS27.MTH889("text");
                if(ˋʼ0.FLD2011.MTH6895("text_rep_nickname") && !CLS502.MTH6934(ˋʼ0.FLD1998, new String[]{"_FRIENDREQUEST_INTRO_", "_CHATROOM_INTRO_"})) {
                    StringBuilder stringBuilder0 = CLS182.MTH3483(s1);
                    stringBuilder0.append("<br>");
                    stringBuilder0.append(CLS27.MTH889("text_rep_desc"));
                    s1 = stringBuilder0.toString();
                }
                CLS523.MTH7165(activity0, CLS27.MTH889("text"), s1, "", 1, ((CLS16)new CLS1087(arrayList0, ⁱˉ0, 24)));
                return;
            }
            case 1: {
                ˋʼ0.getClass();
                CLS476.MTH6645(activity0, ((CLS7)new CLS1259(ˋʼ0, arrayList0, ⁱˉ0, 20)), null);
                return;
            }
            case 2: {
                ˋʼ0.getClass();
                try {
                    HashSet hashSet1 = new HashSet();
                    if(CLS502.MTH6934(ˋʼ0.FLD1998, new String[]{"_REDPACKETS_", "_MONEYTRANSFER_"}) && !ˋʼ0.FLD2011.MTH6895("rp_response_voice")) {
                        hashSet1.add(3);
                    }
                    CLS395.MTH5740(activity0, ((CLS7)new CLS1087(arrayList0, ⁱˉ0, 25)), hashSet1);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 3: {
                ˋʼ0.getClass();
                try {
                    ArrayList arrayList3 = new ArrayList();
                    ˋʼ0.FLD2006.MTH5313(ˋʼ0.FLD2015, arrayList3);
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList4 = new ArrayList();
                    for(Object object2: arrayList3) {
                        CLS78 ˊﾞ0 = (CLS78)object2;
                        if(!hashSet2.contains("")) {
                            hashSet2.add("");
                            arrayList4.add(ˊﾞ0);
                        }
                    }
                    CLS372.MTH5405(arrayList4);
                    CLS387.MTH5600(true, activity0, arrayList4, ((CLS2)new CLS1179(ˋʼ0, arrayList0, ⁱˉ0)));
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            default: {
                try {
                    CLS371 ʻ0 = ˋʼ0.FLD2006;
                    ArrayList arrayList1 = ʻ0.MTH5341("");
                    ArrayList arrayList2 = new ArrayList();
                    HashSet hashSet0 = new HashSet();
                    for(Object object0: arrayList0) {
                        ContentValues contentValues0 = (ContentValues)object0;
                        if(((int)contentValues0.getAsInteger("type")) == -1) {
                            hashSet0.add(contentValues0.getAsString("avatar"));
                        }
                    }
                    for(Object object1: arrayList1) {
                        String s = (String)object1;
                        if(!hashSet0.contains(s)) {
                            arrayList2.add(new CLS78(s, ʻ0.MTH5311(s)));
                        }
                    }
                    CLS387.MTH5600(true, activity0, arrayList2, ((CLS2)new CLS1184(arrayList0, ⁱˉ0)));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

