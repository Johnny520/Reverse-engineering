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

public final class CLS937 implements CLS3 {
    public final int FLD1759;
    public final CLS359 FLD1760;
    public final Activity FLD1761;
    public final CLS244 FLD1762;
    public final ArrayList FLD1763;

    public CLS937(CLS244 ᴵʻ0, Activity activity0, ArrayList arrayList0, CLS359 ⁱˉ0, int v) {
        this.FLD1759 = v;
        this.FLD1762 = ᴵʻ0;
        this.FLD1761 = activity0;
        this.FLD1763 = arrayList0;
        this.FLD1760 = ⁱˉ0;
        super();
    }

    public CLS937(CLS244 ᴵʻ0, ArrayList arrayList0, Activity activity0, CLS359 ⁱˉ0, int v) {
        this.FLD1759 = v;
        this.FLD1762 = ᴵʻ0;
        this.FLD1763 = arrayList0;
        this.FLD1761 = activity0;
        this.FLD1760 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD1761;
        CLS359 ⁱˉ0 = this.FLD1760;
        ArrayList arrayList0 = this.FLD1763;
        CLS244 ᴵʻ0 = this.FLD1762;
        switch(this.FLD1759) {
            case 0: {
                ᴵʻ0.getClass();
                String s1 = CLS27.MTH889("text");
                if(ᴵʻ0.FLD2538.MTH6895("text_rep_nickname") && !CLS502.MTH6934(ᴵʻ0.FLD2542, new String[]{"_FRIENDREQUEST_INTRO_", "_CHATROOM_INTRO_"})) {
                    StringBuilder stringBuilder0 = CLS182.MTH3483(s1);
                    stringBuilder0.append("<br>");
                    stringBuilder0.append(CLS27.MTH889("text_rep_desc"));
                    s1 = stringBuilder0.toString();
                }
                CLS523.MTH7165(activity0, CLS27.MTH889("text"), s1, "", 1, ((CLS16)new CLS1087(arrayList0, ⁱˉ0, 7)));
                return;
            }
            case 1: {
                ᴵʻ0.getClass();
                CLS476.MTH6645(activity0, ((CLS7)new CLS1003(ᴵʻ0, arrayList0, ⁱˉ0, 0)), null);
                return;
            }
            case 2: {
                ᴵʻ0.getClass();
                try {
                    HashSet hashSet1 = new HashSet();
                    if(CLS502.MTH6934(ᴵʻ0.FLD2542, new String[]{"_REDPACKETS_", "_MONEYTRANSFER_"}) && !ᴵʻ0.FLD2538.MTH6895("rp_response_voice")) {
                        hashSet1.add(3);
                    }
                    CLS395.MTH5740(activity0, ((CLS7)new CLS1087(arrayList0, ⁱˉ0, 5)), hashSet1);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 3: {
                ᴵʻ0.getClass();
                try {
                    ArrayList arrayList3 = new ArrayList();
                    ᴵʻ0.FLD2541.MTH5313(ᴵʻ0.FLD2546, arrayList3);
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
                    CLS387.MTH5600(true, activity0, arrayList4, ((CLS2)new CLS1122(ᴵʻ0, arrayList0, ⁱˉ0)));
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 4: {
                try {
                    CLS371 ʻ1 = ᴵʻ0.FLD2541;
                    ArrayList arrayList5 = ʻ1.MTH5341("");
                    ArrayList arrayList6 = new ArrayList();
                    HashSet hashSet3 = new HashSet();
                    for(Object object3: arrayList0) {
                        ContentValues contentValues1 = (ContentValues)object3;
                        if(((int)contentValues1.getAsInteger("type")) == -1) {
                            hashSet3.add(contentValues1.getAsString("avatar"));
                        }
                    }
                    for(Object object4: arrayList5) {
                        String s2 = (String)object4;
                        if(!hashSet3.contains(s2)) {
                            arrayList6.add(new CLS78(s2, ʻ1.MTH5311(s2)));
                        }
                    }
                    CLS387.MTH5600(true, activity0, arrayList6, ((CLS2)new CLS1123(arrayList0, ⁱˉ0)));
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 5: {
                ᴵʻ0.getClass();
                String s3 = CLS27.MTH889("text");
                if(ᴵʻ0.FLD2538.MTH6895("text_rep_nickname") && !CLS502.MTH6934(ᴵʻ0.FLD2542, new String[]{"_FRIENDREQUEST_INTRO_", "_CHATROOM_INTRO_"})) {
                    StringBuilder stringBuilder1 = CLS182.MTH3483(s3);
                    stringBuilder1.append("<br>");
                    stringBuilder1.append(CLS27.MTH889("text_rep_desc"));
                    s3 = stringBuilder1.toString();
                }
                CLS523.MTH7165(activity0, CLS27.MTH889("text"), s3, "", 1, ((CLS16)new CLS1087(arrayList0, ⁱˉ0, 9)));
                return;
            }
            case 6: {
                ᴵʻ0.getClass();
                CLS476.MTH6645(activity0, ((CLS7)new CLS1003(ᴵʻ0, arrayList0, ⁱˉ0, 1)), null);
                return;
            }
            case 7: {
                ᴵʻ0.getClass();
                try {
                    HashSet hashSet4 = new HashSet();
                    if(CLS502.MTH6934(ᴵʻ0.FLD2542, new String[]{"_REDPACKETS_", "_MONEYTRANSFER_"}) && !ᴵʻ0.FLD2538.MTH6895("rp_response_voice")) {
                        hashSet4.add(3);
                    }
                    CLS395.MTH5740(activity0, ((CLS7)new CLS1087(arrayList0, ⁱˉ0, 13)), hashSet4);
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
                return;
            }
            case 8: {
                ᴵʻ0.getClass();
                try {
                    ArrayList arrayList7 = new ArrayList();
                    ᴵʻ0.FLD2541.MTH5313(ᴵʻ0.FLD2546, arrayList7);
                    HashSet hashSet5 = new HashSet();
                    ArrayList arrayList8 = new ArrayList();
                    for(Object object5: arrayList7) {
                        CLS78 ˊﾞ1 = (CLS78)object5;
                        if(!hashSet5.contains("")) {
                            hashSet5.add("");
                            arrayList8.add(ˊﾞ1);
                        }
                    }
                    CLS372.MTH5405(arrayList8);
                    CLS387.MTH5600(true, activity0, arrayList8, ((CLS2)new CLS1204(ᴵʻ0, arrayList0, ⁱˉ0)));
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                return;
            }
            default: {
                try {
                    CLS371 ʻ0 = ᴵʻ0.FLD2541;
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
                    CLS387.MTH5600(true, activity0, arrayList2, ((CLS2)new CLS1079(arrayList0, ⁱˉ0)));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

