// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˈˈ.CLS87;
import b.יﹳ.CLS166;
import b.ـˏ.CLS894;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS466;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS734 implements CLS3 {
    public final int FLD905;
    public final Class FLD906;
    public final int FLD907;
    public final CLS629 FLD908;
    public final Object FLD909;
    public final Object FLD910;

    public CLS734(CLS629 ʻˋ0, int v, Object object0, Class class0, Object object1, int v1) {
        this.FLD905 = v1;
        this.FLD908 = ʻˋ0;
        this.FLD907 = v;
        this.FLD909 = object0;
        this.FLD906 = class0;
        this.FLD910 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS857 ﹳˋ0;
        Activity activity0;
        CLS694 ˉﹶ0;
        Activity activity1;
        Object object3;
        HashMap hashMap1;
        Object object2;
        HashMap hashMap0;
        Object object0 = this.FLD910;
        Class class0 = this.FLD906;
        Object object1 = this.FLD909;
        int v = this.FLD907;
        CLS629 ʻˋ0 = this.FLD908;
        switch(this.FLD905) {
            case 0: {
                ʻˋ0.getClass();
                try {
                    switch(v) {
                        case 1: {
                            CLS466.MTH6504(((String)CLS166.MTH3194(CLS166.MTH3194(object1, "field_favProto"), CLS27.MTH892("favProto_descField", CLS27.MTH897("favArticleField1")))));
                            return;
                        }
                        case 2: {
                            String s3 = (String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0});
                            if(!TextUtils.isEmpty(s3)) {
                                ArrayList arrayList1 = new ArrayList();
                                arrayList1.add(s3);
                                CLS466.MTH6536("", arrayList1);
                                return;
                            }
                            break;
                        }
                        case 3: {
                            CLS894 ﾞˎ1 = new CLS894();
                            ﾞˎ1.FLD1623 = CLS166.MTH3181(object0, CLS27.MTH892("favVoiceField2", "duration"));
                            String s4 = (String)CLS166.MTH3194(object0, CLS27.MTH897("favVoiceField1"));
                            if(!CLS31.MTH1024(s4)) {
                                s4 = CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0})));
                            }
                            if(CLS31.MTH1024(s4)) {
                                ﾞˎ1.FLD1620 = s4;
                                CLS387.MTH5601(false, ((CLS140)ʻˋ0).MTH3042(), ((CLS2)new CLS782(ʻˋ0, ﾞˎ1)), CLS404.MTH5907());
                                return;
                            }
                            break;
                        }
                        case 5: {
                            hashMap0 = new HashMap();
                            hashMap0.put("title", ((String)CLS166.MTH3194(object0, CLS27.MTH892("favItemTitleField", "title"))));
                            hashMap0.put("type", "1");
                            hashMap0.put("url", ((String)CLS166.MTH3194(object0, CLS27.MTH897("favArticleField1"))));
                            object2 = CLS166.MTH3192(class0, CLS27.MTH897("favThumbMethod"), new Object[]{object0});
                            CLS466.MTH6519(((String)object2), hashMap0);
                            return;
                        }
                        case 7: {
                            hashMap0 = new HashMap();
                            hashMap0.put("title", ((String)CLS166.MTH3194(object0, CLS27.MTH892("favItemTitleField", "title"))));
                            hashMap0.put("url", ((String)CLS166.MTH3194(object0, CLS27.MTH897("favArticleField2"))));
                            hashMap0.put("type", "3");
                            hashMap0.put("des", ((String)CLS166.MTH3194(object0, CLS27.MTH897("favArticleField1"))));
                            object2 = CLS166.MTH3192(class0, CLS27.MTH897("favThumbMethod"), new Object[]{object0});
                            CLS466.MTH6519(((String)object2), hashMap0);
                            return;
                        }
                        case 8: {
                        label_45:
                            String s2 = String.valueOf(CLS166.MTH3185(object1, "field_localId"));
                            CLS387.MTH5601(false, ((CLS140)ʻˋ0).MTH3042(), ((CLS2)new CLS774(s2)), -1);
                            return;
                        }
                        case 4: 
                        case 16: {
                            CLS466.MTH6522(CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0}))), CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favThumbMethod"), new Object[]{object0}))), "");
                            return;
                        label_44:
                            if(v == 18) {
                                goto label_45;
                            }
                            break;
                        }
                        default: {
                            goto label_44;
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                ʻˋ0.getClass();
                try {
                    switch(v) {
                        case 1: {
                            CLS466.MTH6504(((String)CLS166.MTH3194(CLS166.MTH3194(object1, "field_favProto"), CLS27.MTH892("favProto_descField", CLS27.MTH897("favArticleField1")))));
                            return;
                        }
                        case 2: {
                            String s6 = (String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0});
                            if(!TextUtils.isEmpty(s6)) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(s6);
                                CLS466.MTH6536("", arrayList2);
                                return;
                            }
                            break;
                        }
                        case 3: {
                            CLS894 ﾞˎ2 = new CLS894();
                            ﾞˎ2.FLD1623 = CLS166.MTH3181(object0, CLS27.MTH892("favVoiceField2", "duration"));
                            String s7 = (String)CLS166.MTH3194(object0, CLS27.MTH897("favVoiceField1"));
                            if(!CLS31.MTH1024(s7)) {
                                s7 = CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0})));
                            }
                            if(CLS31.MTH1024(s7)) {
                                ﾞˎ2.FLD1620 = s7;
                                CLS387.MTH5601(false, ((CLS140)ʻˋ0).MTH3042(), ((CLS2)new CLS781(ʻˋ0, ﾞˎ2)), CLS404.MTH5907());
                                return;
                            }
                            break;
                        }
                        case 5: {
                            hashMap1 = new HashMap();
                            hashMap1.put("title", ((String)CLS166.MTH3194(object0, CLS27.MTH892("favItemTitleField", "title"))));
                            hashMap1.put("type", "1");
                            hashMap1.put("url", ((String)CLS166.MTH3194(object0, CLS27.MTH897("favArticleField1"))));
                            object3 = CLS166.MTH3192(class0, CLS27.MTH897("favThumbMethod"), new Object[]{object0});
                            CLS466.MTH6519(((String)object3), hashMap1);
                            return;
                        }
                        case 7: {
                            hashMap1 = new HashMap();
                            hashMap1.put("title", ((String)CLS166.MTH3194(object0, CLS27.MTH892("favItemTitleField", "title"))));
                            hashMap1.put("url", ((String)CLS166.MTH3194(object0, CLS27.MTH897("favArticleField2"))));
                            hashMap1.put("type", "3");
                            hashMap1.put("des", ((String)CLS166.MTH3194(object0, CLS27.MTH897("favArticleField1"))));
                            object3 = CLS166.MTH3192(class0, CLS27.MTH897("favThumbMethod"), new Object[]{object0});
                            CLS466.MTH6519(((String)object3), hashMap1);
                            return;
                        }
                        case 8: {
                        label_88:
                            String s5 = String.valueOf(CLS166.MTH3185(object1, "field_localId"));
                            CLS387.MTH5601(false, ((CLS140)ʻˋ0).MTH3042(), ((CLS2)new CLS879(s5)), -1);
                            return;
                        }
                        case 4: 
                        case 16: {
                            CLS466.MTH6522(CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0}))), CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favThumbMethod"), new Object[]{object0}))), "");
                            return;
                        label_87:
                            if(v == 18) {
                                goto label_88;
                            }
                            break;
                        }
                        default: {
                            goto label_87;
                        }
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 2: {
                try {
                    ArrayList arrayList3 = ʻˋ0.FLD554;
                    arrayList3.clear();
                    switch(v) {
                        case 1: {
                            String s9 = (String)CLS166.MTH3194(CLS166.MTH3194(object1, "field_favProto"), CLS27.MTH892("favProto_descField", CLS27.MTH897("favArticleField1")));
                            if(ʻˋ0.FLD1445.MTH938("multi_broadcast_forward_native", true)) {
                                arrayList3.add(new CLS87(1, s9));
                                ʻˋ0.MTH2038();
                                return;
                            }
                            activity1 = ((CLS140)ʻˋ0).MTH3042();
                            ˉﹶ0 = new CLS694(ʻˋ0, s9);
                            CLS387.MTH5601(false, activity1, ((CLS2)ˉﹶ0), -1);
                            return;
                        }
                        case 2: {
                            arrayList3.add(new CLS87(3, CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0})))));
                            ʻˋ0.MTH2038();
                            return;
                        }
                        case 3: {
                            CLS894 ﾞˎ3 = new CLS894();
                            ﾞˎ3.FLD1623 = CLS166.MTH3181(object0, CLS27.MTH892("favVoiceField2", "duration"));
                            String s8 = (String)CLS166.MTH3194(object0, CLS27.MTH897("favVoiceField1"));
                            if(!CLS31.MTH1024(s8)) {
                                s8 = CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0})));
                            }
                            if(CLS31.MTH1024(s8)) {
                                ﾞˎ3.FLD1620 = s8;
                                arrayList3.add(new CLS87(ﾞˎ3));
                                ʻˋ0.MTH2038();
                                return;
                            }
                            break;
                        }
                        case 4: 
                        case 16: {
                            if(CLS31.MTH1024(CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0}))))) {
                                activity1 = ((CLS140)ʻˋ0).MTH3042();
                                ˉﹶ0 = new CLS808(ʻˋ0, object0);
                                CLS387.MTH5601(false, activity1, ((CLS2)ˉﹶ0), -1);
                                return;
                            }
                            break;
                        }
                        default: {
                            return;
                        }
                    }
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            default: {
                try {
                    ArrayList arrayList0 = ʻˋ0.FLD554;
                    arrayList0.clear();
                    switch(v) {
                        case 1: {
                            String s1 = (String)CLS166.MTH3194(CLS166.MTH3194(object1, "field_favProto"), CLS27.MTH892("favProto_descField", CLS27.MTH897("favArticleField1")));
                            if(ʻˋ0.FLD1445.MTH938("multi_broadcast_forward_native", true)) {
                                arrayList0.add(new CLS87(1, s1));
                                ʻˋ0.MTH2038();
                                return;
                            }
                            activity0 = ((CLS140)ʻˋ0).MTH3042();
                            ﹳˋ0 = new CLS857(ʻˋ0, s1);
                            CLS387.MTH5601(false, activity0, ((CLS2)ﹳˋ0), -1);
                            return;
                        }
                        case 2: {
                            arrayList0.add(new CLS87(3, CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0})))));
                            ʻˋ0.MTH2038();
                            return;
                        }
                        case 3: {
                            CLS894 ﾞˎ0 = new CLS894();
                            ﾞˎ0.FLD1623 = CLS166.MTH3181(object0, CLS27.MTH892("favVoiceField2", "duration"));
                            String s = (String)CLS166.MTH3194(object0, CLS27.MTH897("favVoiceField1"));
                            if(!CLS31.MTH1024(s)) {
                                s = CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0})));
                            }
                            if(CLS31.MTH1024(s)) {
                                ﾞˎ0.FLD1620 = s;
                                arrayList0.add(new CLS87(ﾞˎ0));
                                ʻˋ0.MTH2038();
                                return;
                            }
                            break;
                        }
                        case 4: 
                        case 16: {
                            if(CLS31.MTH1024(CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0}))))) {
                                activity0 = ((CLS140)ʻˋ0).MTH3042();
                                ﹳˋ0 = new CLS673(ʻˋ0, object0);
                                CLS387.MTH5601(false, activity0, ((CLS2)ﹳˋ0), -1);
                                return;
                            }
                            break;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

