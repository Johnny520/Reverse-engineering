// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS758 implements CLS39 {
    public final int FLD1009;
    public final CLS839 FLD1010;

    public CLS758(CLS839 ᵢⁱ0, int v) {
        this.FLD1009 = v;
        this.FLD1010 = ᵢⁱ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS371 ʻ0;
        CLS839 ᵢⁱ0 = this.FLD1010;
        switch(this.FLD1009) {
            case 0: {
                CLS139 ﹶʼ1 = ᵢⁱ0.FLD1447;
                boolean z2 = ﹶʼ1.FLD1438.MTH6895("auto_add_members1");
                ArrayDeque arrayDeque1 = ᵢⁱ0.FLD1307;
                CLS29 ˎᵢ1 = ᵢⁱ0.FLD1445;
                if(z2) {
                    if(arrayDeque1.isEmpty()) {
                        ᵢⁱ0.FLD1301 = false;
                        ˎᵢ1.MTH922(Boolean.FALSE, "$aam_start");
                        ᵢⁱ0.MTH2899(ᵢⁱ0.FLD1303);
                    }
                    else {
                        ᵢⁱ0.MTH2905();
                    }
                }
                if(ﹶʼ1.FLD1438.MTH6895("auto_add_members2")) {
                    CLS27.MTH906(("members left: " + arrayDeque1.size()));
                    if(arrayDeque1.isEmpty()) {
                        ᵢⁱ0.FLD1301 = false;
                        ˎᵢ1.MTH922(Boolean.FALSE, "$aam_start");
                        CLS412.MTH6014(((CLS140)ᵢⁱ0).MTH3042(), CLS27.MTH889("stop") + CLS27.MTH889("aam"));
                        return;
                    }
                    ᵢⁱ0.MTH2905();
                }
                return;
            }
            case 1: {
                ArrayDeque arrayDeque2 = ᵢⁱ0.FLD1307;
                CLS29 ˎᵢ2 = ᵢⁱ0.FLD1445;
                if(arrayDeque2.isEmpty()) {
                    ᵢⁱ0.FLD1301 = false;
                    ˎᵢ2.MTH922(Boolean.FALSE, "$aam_start");
                    return;
                }
                if(!ˎᵢ2.MTH938("$aam_start", false)) {
                    ᵢⁱ0.FLD1301 = false;
                    return;
                }
                ArrayList arrayList1 = new ArrayList();
                boolean z3 = ᵢⁱ0.FLD1447.FLD1438.MTH6895("auto_add_members1");
                CLS500 ᵢﹶ1 = ᵢⁱ0.FLD1447.FLD1438;
                CLS371 ʻ1 = ᵢⁱ0.FLD1444;
                if(z3) {
                    if(TextUtils.isEmpty(ᵢⁱ0.FLD1303)) {
                        ᵢⁱ0.FLD1303 = ˎᵢ2.MTH925("$aam_chatroom", "");
                    }
                    if(!TextUtils.isEmpty(ᵢⁱ0.FLD1303)) {
                        String[] arr_s1 = CLS502.MTH6941(ʻ1.MTH5335(ᵢⁱ0.FLD1303));
                        ᵢⁱ0.MTH2902(Math.min(ˎᵢ2.MTH927(3, "$aam_nm"), ˎᵢ2.MTH927(39, "$aam_tm") - arr_s1.length), arrayList1);
                        if(arrayList1.isEmpty()) {
                            if(ʻ1.MTH5383(ᵢⁱ0.FLD1303)) {
                                ᵢⁱ0.MTH2899(ᵢⁱ0.FLD1303);
                            }
                            ᵢⁱ0.FLD1303 = "";
                        }
                    }
                }
                else if(ᵢﹶ1.MTH6895("auto_add_members2") && TextUtils.isEmpty(ᵢⁱ0.FLD1303) && !ᵢⁱ0.FLD1306.isEmpty()) {
                    ᵢⁱ0.FLD1303 = ᵢⁱ0.MTH2904();
                }
                if(!TextUtils.isEmpty(ᵢⁱ0.FLD1303)) {
                    if(ʻ1.MTH5383(ᵢⁱ0.FLD1303)) {
                        String[] arr_s2 = CLS502.MTH6941(ʻ1.MTH5335(ᵢⁱ0.FLD1303));
                        int v2 = ˎᵢ2.MTH927(39, "$aam_tm");
                        if(arr_s2.length >= v2) {
                            if(ᵢﹶ1.MTH6895("auto_add_members2")) {
                                ᵢⁱ0.FLD1303 = ᵢⁱ0.MTH2904();
                            }
                            else if(ᵢﹶ1.MTH6895("auto_add_members1")) {
                                ᵢⁱ0.MTH2899(ᵢⁱ0.FLD1303);
                                ᵢⁱ0.FLD1303 = CLS370.MTH5289(0x38EB4F562B3CD335L);
                            }
                        }
                    }
                    else {
                        ᵢⁱ0.FLD1303 = CLS370.MTH5289(0x38EB4EA92B3CD335L);
                    }
                }
                if(TextUtils.isEmpty(ᵢⁱ0.FLD1303)) {
                    if(ᵢﹶ1.MTH6895("auto_add_members1")) {
                        arrayList1.addAll(ʻ1.MTH5328(ˎᵢ2.MTH925("$aam_tag", "")));
                        ArrayList arrayList2 = ʻ1.MTH5328(ˎᵢ2.MTH925("$aam_owner_tag", ""));
                        if(!arrayList2.isEmpty()) {
                            String s6 = (String)arrayList2.get(0);
                            if(!arrayList1.contains(s6)) {
                                arrayList1.add(s6);
                            }
                        }
                        ᵢⁱ0.MTH2902(ˎᵢ2.MTH927(3, "$aam_nm"), arrayList1);
                    }
                    else if(ᵢﹶ1.MTH6895("auto_add_members2")) {
                        for(int v = 0; v < ˎᵢ2.MTH927(39, "$aam_tm") - 1; ++v) {
                            String s7 = (String)arrayDeque2.poll();
                            if(!TextUtils.isEmpty(s7)) {
                                arrayList1.add(s7);
                            }
                        }
                    }
                    if(!arrayList1.isEmpty()) {
                        ᵢⁱ0.FLD1301 = true;
                        CLS27.MTH906(("create chatroom: " + arrayList1.size()));
                        ᵢⁱ0.FLD1302.clear();
                        ᵢⁱ0.FLD1302.addAll(arrayList1);
                        CLS66.MTH1454(arrayList1);
                        return;
                    }
                }
                else {
                    ᵢⁱ0.FLD1301 = true;
                    if(ᵢﹶ1.MTH6895("auto_add_members2")) {
                        String s8 = ʻ1.MTH5335(ᵢⁱ0.FLD1303);
                        String[] arr_s3 = CLS502.MTH6941(s8);
                        int v3 = ˎᵢ2.MTH927(39, "$aam_tm") - arr_s3.length;
                        CLS27.MTH906(("has: " + arr_s3.length + " add: " + v3));
                        for(int v4 = 0; v4 < v3; ++v4) {
                            String s9 = (String)arrayDeque2.poll();
                            if(!TextUtils.isEmpty(s9) && !CLS502.MTH6934(s8, new String[]{s9})) {
                                arrayList1.add(s9);
                            }
                        }
                    }
                    CLS27.MTH906(("add members: " + arrayList1.size()));
                    CLS66.MTH1464(ᵢⁱ0.FLD1303, null, arrayList1);
                }
                return;
            }
            default: {
                CLS139 ﹶʼ0 = ᵢⁱ0.FLD1447;
                boolean z = ﹶʼ0.FLD1438.MTH6895("auto_add_members2");
                CLS29 ˎᵢ0 = ᵢⁱ0.FLD1445;
                if(z) {
                    ˎᵢ0.MTH922("", "$aam_chatroom_history");
                }
                HashSet hashSet0 = new HashSet();
                String s = ˎᵢ0.MTH925("$aam_chatroom_history", "");
                HashSet hashSet1 = new HashSet();
                if(!TextUtils.isEmpty(s)) {
                    hashSet1.addAll(Arrays.asList(CLS502.MTH6941(s)));
                }
                String s1 = ˎᵢ0.MTH925("$aam2_chatrooms", "");
                if(!TextUtils.isEmpty(s1)) {
                    hashSet1.addAll(Arrays.asList(CLS502.MTH6941(s1)));
                }
                Iterator iterator0 = hashSet1.iterator();
                while(true) {
                    boolean z1 = iterator0.hasNext();
                    ʻ0 = ᵢⁱ0.FLD1444;
                    if(!z1) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    String s2 = (String)object0;
                    if(ʻ0.MTH5383(s2)) {
                        hashSet0.addAll(Arrays.asList(CLS502.MTH6941(ʻ0.MTH5335(s2))));
                    }
                    else {
                        iterator0.remove();
                    }
                }
                ˎᵢ0.MTH922(TextUtils.join(",", hashSet1), "$aam_chatroom_history");
                hashSet0.addAll(ʻ0.MTH5328(ˎᵢ0.MTH925("$aam_tag", "")));
                String s3 = ˎᵢ0.MTH925("$aam_excl", "");
                ArrayList arrayList0 = new ArrayList();
                String s4 = "";
                CLS500 ᵢﹶ0 = ﹶʼ0.FLD1438;
                if(ᵢﹶ0.MTH6895("auto_add_members1")) {
                    s4 = ˎᵢ0.MTH925("$aam_tag_only", "");
                }
                if(TextUtils.isEmpty(s4)) {
                    arrayList0.addAll(ʻ0.MTH5341(CLS27.MTH904()));
                }
                else {
                    String[] arr_s = CLS502.MTH6941(s4);
                    for(int v1 = 0; v1 < arr_s.length; ++v1) {
                        arrayList0.addAll(ʻ0.MTH5328(arr_s[v1].trim()));
                    }
                }
                CLS27.MTH906(("total members: " + arrayList0.size()));
                if(ᵢﹶ0.MTH6895("auto_add_members2")) {
                    ArrayDeque arrayDeque0 = ᵢⁱ0.FLD1306;
                    if(arrayDeque0.isEmpty()) {
                        arrayDeque0.addAll(Arrays.asList(CLS502.MTH6941(ˎᵢ0.MTH925("$aam2_chatrooms", ""))));
                    }
                    ᵢⁱ0.FLD1303 = ᵢⁱ0.MTH2904();
                }
                HashSet hashSet2 = new HashSet();
                Iterator iterator1 = arrayList0.iterator();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    String s5 = (String)object1;
                    if(hashSet0.contains(s5) || s5.equals(CLS27.MTH904()) || CLS502.MTH6934(s3, new String[]{s5}) || hashSet2.contains(s5)) {
                        iterator1.remove();
                    }
                    hashSet2.add(s5);
                }
                CLS27.MTH906(("members left: " + arrayList0.size()));
                ᵢⁱ0.FLD1307.clear();
                ᵢⁱ0.FLD1307.addAll(arrayList0);
                CLS27.MTH906("aam start");
                CLS412.MTH6014(((CLS140)ᵢⁱ0).MTH3042(), CLS27.MTH889("start") + CLS27.MTH889("aam"));
                ᵢⁱ0.MTH2905();
            }
        }
    }
}

