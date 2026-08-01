// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.app.AlertDialog;
import android.media.MediaPlayer;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS15;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˈˊ.CLS603;
import b.ˈˊ.CLS606;
import b.ˊﾞ.CLS612;
import b.ˑٴ.CLS140;
import b.ˑٴ.CLS818;
import b.ᐧˉ.CLS1019;
import b.ᐧˉ.CLS1186;
import b.ᐧˉ.CLS174;
import b.ᐧˉ.CLS219;
import b.ⁱʾ.CLS335;
import b.ⁱᵔ.CLS1282;
import b.ⁱᵔ.CLS1481;
import b.ⁱᵔ.CLS1604;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS523;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1627 implements CLS3 {
    public final int FLD5309;
    public final Object FLD5310;

    public CLS1627(int v, Object object0) {
        this.FLD5309 = v;
        this.FLD5310 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Object object0 = this.FLD5310;
        switch(this.FLD5309) {
            case 0: {
                ((CLS556)object0).FLD5419 = ((CLS556)object0).FLD5410;
                ((CLS556)object0).MTH7431(((CLS556)object0).FLD5410);
                ((CLS556)object0).MTH7430();
                return;
            }
            case 1: {
                ((CLS603)object0).FLD463.clear();
                ((CLS603)object0).FLD466 = "";
                ((CLS603)object0).FLD464 = "";
                ((CLS603)object0).FLD465 = "";
                return;
            }
            case 2: {
                ((CLS606)object0).FLD470.clear();
                ((CLS606)object0).FLD473 = "";
                ((CLS606)object0).FLD471 = "";
                ((CLS606)object0).FLD472 = "";
                return;
            }
            case 3: {
                CLS818 ᵎⁱ0 = (CLS818)object0;
                ᵎⁱ0.getClass();
                try {
                    Activity activity0 = ((CLS140)ᵎⁱ0).MTH3042();
                    CLS29 ˎᵢ0 = CLS27.MTH895();
                    String s = CLS27.MTH889("auto_remark_enable");
                    CLS1622 ˑٴ0 = new CLS1622(activity0);
                    CLS1621 ˎᵢ1 = new CLS1621(activity0);
                    CLS523.MTH7160(activity0, s, ((CLS17)new CLS612(ˑٴ0, ˎᵢ0, ˎᵢ1, activity0, 20)), ((CLS11)new CLS1604(ˑٴ0, ˎᵢ1)));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 4: {
                ((CLS174)object0).getClass();
                ((CLS174)object0).MTH3357(CLS27.MTH889("add"), null, false);
                return;
            }
            case 5: {
                ((CLS1019)object0).getClass();
                if(((CLS1019)object0).FLD2151.MTH938("at_notification_en", false)) {
                    Activity activity1 = ((CLS219)(((CLS1019)object0))).MTH3883();
                    ((CLS1019)object0).FLD2085.getClass();
                    CLS485.MTH6726(activity1, "at");
                }
                return;
            }
            case 6: {
                ArrayList arrayList0 = (ArrayList)object0;
                if(!arrayList0.isEmpty()) {
                    try {
                        String s1 = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
                        JSONArray jSONArray0 = new JSONArray();
                        Iterator iterator0 = arrayList0.iterator();
                        while(iterator0.hasNext()) {
                            iterator0.next();
                            JSONObject jSONObject0 = new JSONObject();
                            jSONObject0.put("u", "");
                            jSONObject0.put("n", "");
                            jSONArray0.put(jSONObject0);
                        }
                        CLS27.MTH895().MTH922(jSONArray0, "deleted_contacts_" + s1);
                        return;
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                return;
            }
            case 7: {
                CLS1186 ⁱᵔ0 = new CLS1186(((CLS1625)object0), 1);
                CLS40.FLD157.MTH1116(((CLS39)ⁱᵔ0));
                return;
            }
            case 8: {
                ((CLS335)object0).notifyDataSetChanged();
                return;
            }
            case 9: {
                AlertDialog alertDialog0 = ((AlertDialog[])object0)[0];
                if(alertDialog0 != null) {
                    alertDialog0.dismiss();
                }
                return;
            }
            case 10: {
                MediaPlayer mediaPlayer0 = (MediaPlayer)object0;
                try {
                    if(mediaPlayer0.isPlaying()) {
                        mediaPlayer0.pause();
                        mediaPlayer0.stop();
                    }
                    mediaPlayer0.release();
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 11: {
                CLS21.FLD76.MTH818("selectGif", new Object[]{((CLS8)object0)});
                return;
            }
            case 12: {
                CLS66.MTH1373();
                ((CLS3)object0).MTH774();
                return;
            }
            case 13: {
                ((CLS1282)object0).getClass();
                CLS1481 יˆ0 = new CLS1481(9, ((CLS1282)object0));
                CLS40.FLD157.MTH1116(((CLS39)יˆ0));
                return;
            }
            case 14: {
                if(((CLS13)object0) != null) {
                    ((CLS13)object0).MTH770(null);
                }
                return;
            }
            default: {
                if(((CLS15)object0) != null) {
                    ((CLS15)object0).MTH794();
                }
            }
        }
    }
}

