// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˆʿ.CLS44;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS82;
import b.ˈˈ.CLS91;
import b.ᵔʾ.CLS1262;
import b.ⁱʾ.CLS344;
import b.ⁱʾ.CLS359;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1464;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.io.File;
import java.util.ArrayList;

public final class CLS951 implements CLS3 {
    public final int FLD1827;
    public final Object FLD1828;
    public final int FLD1829;
    public final Object FLD1830;
    public final Object FLD1831;
    public final Object FLD1832;

    public CLS951(Activity activity0, ArrayList arrayList0, int v, CLS369 ﾞᵎ0, CLS82 יﹳ0) {
        this.FLD1827 = 1;
        super();
        this.FLD1830 = activity0;
        this.FLD1831 = arrayList0;
        this.FLD1829 = v;
        this.FLD1828 = ﾞᵎ0;
        this.FLD1832 = יﹳ0;
    }

    public CLS951(Object object0, int v, Object object1, Object object2, Object object3, int v1) {
        this.FLD1827 = v1;
        this.FLD1831 = object0;
        this.FLD1829 = v;
        this.FLD1830 = object1;
        this.FLD1828 = object2;
        this.FLD1832 = object3;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s3;
        CLS1159 ᵔﹳ0;
        String s2;
        String s1;
        int v = this.FLD1829;
        Object object0 = this.FLD1832;
        Object object1 = this.FLD1828;
        Object object2 = this.FLD1830;
        Object object3 = this.FLD1831;
        switch(this.FLD1827) {
            case 0: {
                CLS210 ˋʼ0 = (CLS210)object3;
                Activity activity0 = (Activity)object2;
                ContentValues contentValues0 = (ContentValues)object1;
                CLS359 ⁱˉ0 = (CLS359)object0;
                ˋʼ0.getClass();
                if(v == 1) {
                    String s = CLS27.MTH889("text");
                    s1 = CLS27.MTH889("modify");
                    s2 = contentValues0.getAsString("msg");
                    ᵔﹳ0 = new CLS1159(contentValues0, ⁱˉ0, 6);
                    s3 = s;
                }
                else {
                    switch(v) {
                        case -333: {
                            s3 = CLS27.MTH889("tts");
                            s1 = "";
                            s2 = contentValues0.getAsString("tts");
                            ᵔﹳ0 = new CLS934(contentValues0, 0);
                            break;
                        }
                        case -104: 
                        case -103: 
                        case -102: 
                        case -101: 
                        case -100: {
                            s3 = CLS27.MTH889("input_url");
                            s1 = "";
                            s2 = contentValues0.getAsString("url");
                            ᵔﹳ0 = new CLS1262(contentValues0, v, 2);
                            break;
                        }
                        case -49: {
                            String s5 = contentValues0.getAsString("path");
                            CLS31.MTH1014(activity0, ((CLS12)new CLS1194(contentValues0, ⁱˉ0, 5)), ((CLS12)new CLS1194(contentValues0, ⁱˉ0, 6)), new File(s5).getParent());
                            return;
                        }
                        case -33: {
                            CLS476.MTH6640(activity0, ((CLS7)new CLS1159(contentValues0, ⁱˉ0, 7)));
                            return;
                        }
                        case 101: {
                            try {
                                ArrayList arrayList0 = new ArrayList();
                                String[] arr_s = CLS502.MTH6941(contentValues0.getAsString("chatrooms"));
                                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                                    String s4 = arr_s[v1];
                                    arrayList0.add(new CLS78(s4, ˋʼ0.FLD2006.MTH5316(s4)));
                                }
                                CLS387.MTH5585(true, activity0, arrayList0, ((CLS2)new CLS986(contentValues0, ⁱˉ0)), contentValues0.getAsString("chatrooms"), -1);
                            }
                            catch(Throwable throwable0) {
                                CLS27.MTH893(throwable0);
                            }
                            return;
                        }
                        default: {
                            return;
                        }
                    }
                }
                CLS523.MTH7165(activity0, s3, s1, s2, 1, ((CLS16)ᵔﹳ0));
                return;
            }
            case 1: {
                CLS523.MTH7142(((Activity)object2), ((CLS11)new CLS1464(((ArrayList)object3), v, ((CLS369)object1), ((CLS82)object0))));
                return;
            }
            default: {
                ((ArrayList)object3).remove(v);
                ((CLS344)object2).notifyDataSetChanged();
                ((CLS44)object1).MTH1174(((CLS91)object0));
            }
        }
    }
}

