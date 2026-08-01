// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ˆʿ.CLS43;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS79;
import b.ˊﾞ.CLS101;
import b.ⁱʾ.CLS1266;
import b.ⁱʾ.CLS363;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1471 implements CLS3 {
    public final int FLD4384;
    public final Object FLD4385;
    public final Object FLD4386;

    public CLS1471(CLS43 ˆʿ0, Activity activity0) {
        this.FLD4384 = 1;
        super();
        this.FLD4385 = ˆʿ0;
        this.FLD4386 = activity0;
    }

    public CLS1471(Object object0, Object object1, int v) {
        this.FLD4384 = v;
        this.FLD4386 = object0;
        this.FLD4385 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS29 ˎᵢ1;
        int v = 3;
        Object object0 = this.FLD4385;
        Object object1 = this.FLD4386;
        switch(this.FLD4384) {
            case 0: {
                CLS79 ˎᵢ0 = (CLS79)object0;
                ˎᵢ0.getClass();
                JSONArray jSONArray0 = new JSONArray();
                String[] arr_s = CLS502.MTH6941(ˎᵢ0.MTH1624());
                for(int v2 = 0; v2 < arr_s.length; ++v2) {
                    String s = arr_s[v2];
                    if(s.startsWith("wx__c_")) {
                        try {
                            JSONObject jSONObject0 = new JSONObject();
                            jSONObject0.put("c", s);
                            jSONObject0.put("n", ˎᵢ0.MTH1625(s));
                            jSONObject0.put("d", TextUtils.join(",", ˎᵢ0.MTH1655(s)));
                            jSONObject0.put("a", ˎᵢ0.FLD288.MTH938(s + "_custom_avatar_enable", false));
                            jSONArray0.put(jSONObject0);
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                    }
                }
                CLS31.MTH999(((Activity)object1), jSONArray0.toString(), CLS31.MTH979((CLS27.MTH889("appname") + "_groups"), "json"));
                return;
            }
            case 1: {
                JSONArray jSONArray1 = ((CLS43)object0).MTH1160();
                if(jSONArray1.length() != 0) {
                    CLS31.MTH999(((Activity)object1), jSONArray1.toString(), "wx_chatroom_tags.json");
                }
                return;
            }
            case 2: {
                ((CLS363)(((CLS1266)object1))).notifyDataSetChanged();
                ((CLS363)(((CLS1266)object0))).notifyDataSetChanged();
                return;
            }
            case 3: {
                CLS71 ˆٴ0 = new CLS71(((Activity)object1), null);
                ˆٴ0.MTH1572("sort_recent", ((CLS3)new CLS1477(((CLS363)object0), 0)));
                ˆٴ0.MTH1572("sort_alphabet", ((CLS3)new CLS1477(((CLS363)object0), 1)));
                ˆٴ0.MTH1572("sort_selected", ((CLS3)new CLS1477(((CLS363)object0), 2)));
                ˆٴ0.MTH1572("sort_reverse", ((CLS3)new CLS1477(((CLS363)object0), 3)));
                ˆٴ0.MTH1573();
                return;
            }
            case 4: {
                if(!((CLS1635)object1).MTH7444()) {
                    if(((CLS1635)object0).MTH7444()) {
                        ˎᵢ1 = CLS27.MTH895();
                        v = 2;
                    }
                    else {
                        ˎᵢ1 = CLS27.MTH895();
                        v = 0;
                    }
                }
                else if(((CLS1635)object0).MTH7444()) {
                    ˎᵢ1 = CLS27.MTH895();
                }
                else {
                    ˎᵢ1 = CLS27.MTH895();
                    v = 1;
                }
                ˎᵢ1.MTH922(v, "friendreq_history_type");
                return;
            }
            case 5: {
                String s1 = (String)object1;
                CLS1626 ـﹳ0 = (CLS1626)object0;
                try {
                    ArrayList arrayList0 = new ArrayList();
                    JSONObject jSONObject1 = CLS27.MTH895().MTH921("invite_key_tags");
                    if(jSONObject1.has(s1)) {
                        String[] arr_s1 = CLS502.MTH6941(jSONObject1.getString(s1));
                        for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                            arrayList0.add(CLS371.FLD3470.MTH5316(arr_s1[v1]));
                        }
                        ـﹳ0.MTH800(TextUtils.join(",", arrayList0));
                        return;
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 6: {
                String s2 = new File(CLS31.MTH1038(CLS27.MTH900()), ((String)object1)).getAbsolutePath();
                CLS101.MTH1946(CLS462.FLD4511, CLS462.FLD4513, ((String[])object0)[0], s2);
                CLS31.MTH996(s2);
                CLS466.MTH6506(new File(s2));
                return;
            }
            case 7: {
                ((CLS425)object1).FLD4096.MTH5050();
                CLS404.MTH5896(((CLS425)object1).FLD4088, ((ArrayList)object0), null);
                return;
            }
            default: {
                if(((CLS13)object1) != null) {
                    ((CLS13)object1).MTH770(((String)object0));
                }
            }
        }
    }
}

