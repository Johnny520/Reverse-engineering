// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS42;
import b.ˆʿ.CLS43;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS1105;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS366;
import b.ⁱᵔ.CLS1615;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS403.CLS1378;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;
import java.util.Map;

public final class CLS1234 implements CLS3 {
    public final int FLD3025;
    public final Object FLD3026;
    public final Object FLD3027;
    public final Object FLD3028;
    public final Object FLD3029;
    public final Object FLD3030;
    public final Object FLD3031;

    public CLS1234(Activity activity0, CLS43 ˆʿ0, String s, ArrayList arrayList0, CLS366 ﾞᐧ0, String s1) {
        this.FLD3025 = 2;
        super();
        this.FLD3027 = activity0;
        this.FLD3028 = ˆʿ0;
        this.FLD3029 = s;
        this.FLD3026 = arrayList0;
        this.FLD3031 = ﾞᐧ0;
        this.FLD3030 = s1;
    }

    public CLS1234(Activity activity0, CLS366 ﾞᐧ0, CLS42 ʾᵢ0, String s, ArrayList arrayList0, String[] arr_s) {
        this.FLD3025 = 3;
        super();
        this.FLD3027 = activity0;
        this.FLD3028 = ﾞᐧ0;
        this.FLD3029 = ʾᵢ0;
        this.FLD3031 = s;
        this.FLD3030 = arr_s;
        this.FLD3026 = arrayList0;
    }

    public CLS1234(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, int v) {
        this.FLD3025 = v;
        this.FLD3028 = object0;
        this.FLD3027 = object1;
        this.FLD3029 = object2;
        this.FLD3026 = object3;
        this.FLD3031 = object4;
        this.FLD3030 = object5;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s1;
        Object object0 = this.FLD3030;
        Object object1 = this.FLD3031;
        Object object2 = this.FLD3026;
        Object object3 = this.FLD3029;
        Object object4 = this.FLD3027;
        Object object5 = this.FLD3028;
        switch(this.FLD3025) {
            case 0: {
                ((CLS298)object5).getClass();
                CLS523.MTH7142(((Activity)object4), ((CLS11)new CLS1243(((ContentValues)object3), ((ArrayList)object2), ((ArrayList)object1), ((CLS335)object0))));
                return;
            }
            case 1: {
                ((CLS1105)object5).getClass();
                double f = ((double)CLS481.MTH6691("money_stat_rp_amount")) / 100.0;
                double f1 = ((double)CLS481.MTH6691("money_stat_rp_chatroom_amount")) / 100.0;
                double f2 = ((double)CLS481.MTH6691("money_stat_transfer_amount")) / 100.0;
                double f3 = ((double)((CLS1105)object5).FLD2151.MTH927(0, "money_stat_amount_acc")) / 100.0;
                ((CLS1626)object4).MTH7325(String.format(CLS27.MTH889("money_stat_result"), f));
                ((CLS1626)object3).MTH7325(String.format(CLS27.MTH889("money_stat_result"), f1));
                ((CLS1626)object2).MTH7325(String.format(CLS27.MTH889("money_stat_result"), f2));
                ((CLS1626)object1).MTH7325(String.format(CLS27.MTH889("money_stat_result"), ((double)(f + f1 + f2))));
                ((CLS1626)object0).MTH7325(String.format(CLS27.MTH889("money_stat_result"), f3));
                return;
            }
            case 2: {
                ArrayList arrayList0 = new ArrayList();
                String s5 = CLS27.MTH904();
                CLS371.FLD3470.MTH5313(s5, arrayList0);
                CLS372.MTH5405(arrayList0);
                CLS387.MTH5585(false, ((Activity)object4), arrayList0, ((CLS2)new CLS1615(((CLS43)object5), ((String)object3), ((ArrayList)object2), ((CLS366)object1))), ((String)object0), -1);
                return;
            }
            case 3: {
                CLS523.MTH7142(((Activity)object4), ((CLS11)new CLS1378(((CLS366)object5), ((CLS42)object3), ((String)object1), ((String[])object0), ((ArrayList)object2))));
                return;
            }
            default: {
                Class class0 = (Class)object5;
                Class class1 = (Class)object4;
                CLS12 ᵔʾ0 = (CLS12)object3;
                Map map0 = (Map)object2;
                Class class2 = (Class)object1;
                String s = (String)object0;
                try {
                    if(CLS27.MTH890("sendFileMethod4_b")) {
                        s1 = (String)CLS166.MTH3192(class0, CLS27.MTH897("sendFileMethod4_b"), new Object[0]);
                    }
                    else if(class1 != null) {
                        s1 = (String)CLS166.MTH3192(class1, CLS27.MTH897("sendFileMethod4"), new Object[0]);
                    }
                    else if(!TextUtils.isEmpty(CLS27.MTH897("sendFileMethod5"))) {
                        s1 = (String)CLS166.MTH3195(CLS166.MTH3192(CLS27.MTH894("dbClass1"), CLS27.MTH897("sendFileMethod5"), new Object[0]), CLS27.MTH897("sendFileMethod4"), new Object[0]);
                    }
                    else {
                        s1 = null;
                    }
                    if(!TextUtils.isEmpty(s1)) {
                        String s2 = (String)map0.get(".msg.appmsg.title");
                        String s3 = (String)map0.get(".msg.appmsg.appattach.fileext");
                        String s4 = (String)CLS166.MTH3192(class0, CLS27.MTH897("sendFileMethod2"), new Object[]{s1, s2, s3});
                        if(!TextUtils.isEmpty(CLS27.MTH897("fileOpCopyMethod_c"))) {
                            CLS166.MTH3192(class2, CLS27.MTH897("fileOpCopyMethod_c"), new Object[]{s, s4});
                        }
                        else if(!TextUtils.isEmpty(CLS27.MTH897("fileOpCopyMethod_b"))) {
                            CLS166.MTH3192(class2, CLS27.MTH897("fileOpCopyMethod_b"), new Object[]{s, s4, Boolean.FALSE});
                        }
                        else {
                            CLS166.MTH3192(class2, CLS27.MTH897("fileOpCopyMethod"), new Object[]{s, s4});
                        }
                        if(ᵔʾ0 != null) {
                            ᵔʾ0.MTH791(s);
                        }
                    }
                    else if(ᵔʾ0 != null) {
                        ᵔʾ0.MTH791(null);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

