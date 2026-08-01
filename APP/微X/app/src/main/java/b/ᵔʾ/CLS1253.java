// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS85;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS485.CLS484;
import b.ⁱᵔ.CLS485;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS1253 implements CLS39 {
    public final int FLD3157;
    public final CLS283 FLD3158;

    public CLS1253(CLS283 ʾˏ0, int v) {
        this.FLD3157 = v;
        this.FLD3158 = ʾˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        ArrayDeque arrayDeque1;
        ArrayDeque arrayDeque0;
        Class class0 = CLS485.class;
        CLS283 ʾˏ0 = this.FLD3158;
        switch(this.FLD3157) {
            case 0: {
                ArrayList arrayList0 = ʾˏ0.MTH4692();
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    if(s.endsWith("@openim")) {
                        iterator0.remove();
                    }
                    if(CLS371.FLD3470.MTH5356(s)) {
                        ʾˏ0.MTH4696(s, "");
                        iterator0.remove();
                    }
                }
                int v1 = arrayList0.size();
                if(v1 < 2) {
                    ʾˏ0.FLD2954 = false;
                    return;
                }
                for(int v = 0; v < v1; v += 3) {
                    ArrayList arrayList1 = new ArrayList(arrayList0.subList(v, Math.min(v1, v + 3)));
                    ʾˏ0.FLD2938.add(arrayList1);
                }
                CLS412.MTH6011(CLS27.MTH889("start_zombie_scan"));
                ʾˏ0.FLD2954 = true;
                ʾˏ0.MTH4693();
                return;
            }
            case 1: {
                Iterator iterator1 = ʾˏ0.MTH4692().iterator();
                while(true) {
                    boolean z = iterator1.hasNext();
                    arrayDeque0 = ʾˏ0.FLD2951;
                    if(!z) {
                        break;
                    }
                    Object object1 = iterator1.next();
                    String s1 = (String)object1;
                    if(ʾˏ0.FLD2952.contains(s1) || arrayDeque0.contains(s1) || ʾˏ0.FLD2948.contains(s1)) {
                        CLS412.MTH5995(("skip scan: " + s1));
                    }
                    else if(CLS371.FLD3470.MTH5356(s1)) {
                        ʾˏ0.MTH4696(s1, "");
                    }
                    else {
                        arrayDeque0.addLast(s1);
                    }
                }
                if(!arrayDeque0.isEmpty()) {
                    CLS412.MTH6011(CLS27.MTH889("start_zombie_scan"));
                    CLS27.MTH906(("start zombie scan: " + arrayDeque0.size()));
                    ʾˏ0.FLD2954 = true;
                    ʾˏ0.MTH4690();
                }
                return;
            }
            case 2: {
                Iterator iterator2 = ʾˏ0.MTH4692().iterator();
                while(true) {
                    boolean z1 = iterator2.hasNext();
                    arrayDeque1 = ʾˏ0.FLD2941;
                    if(!z1) {
                        break;
                    }
                    Object object2 = iterator2.next();
                    String s2 = (String)object2;
                    if(ʾˏ0.FLD2952.contains(s2) || arrayDeque1.contains(s2) || ʾˏ0.FLD2948.contains(s2)) {
                    }
                    else if(CLS371.FLD3470.MTH5356(s2)) {
                        ʾˏ0.MTH4696(s2, "");
                    }
                    else {
                        arrayDeque1.addLast(s2);
                    }
                }
                if(!arrayDeque1.isEmpty()) {
                    CLS412.MTH6011(CLS27.MTH889("start_zombie_scan"));
                    CLS27.MTH906(("start zombie scan: " + arrayDeque1.size()));
                    ʾˏ0.FLD2954 = true;
                    ʾˏ0.MTH4698();
                }
                return;
            }
            case 3: {
                ArrayList arrayList2 = ʾˏ0.MTH4692();
                ʾˏ0.FLD2944.addAll(arrayList2);
                ʾˏ0.FLD2954 = true;
                ʾˏ0.MTH4697();
                CLS412.MTH6011(CLS27.MTH889("start_zombie_scan"));
                CLS27.MTH906(("start zombie scan: " + ʾˏ0.FLD2944.size()));
                return;
            }
            case 4: {
                ArrayDeque arrayDeque2 = ʾˏ0.FLD2938;
                ArrayList arrayList3 = (ArrayList)arrayDeque2.poll();
                if(arrayList3 != null) {
                    HashSet hashSet0 = ʾˏ0.FLD2952;
                    hashSet0.addAll(arrayList3);
                    ʾˏ0.FLD2954 = true;
                    if(TextUtils.isEmpty(ʾˏ0.FLD2945)) {
                        String s3 = CLS27.MTH895().MTH925("zombie_check_chatroom", "");
                        ʾˏ0.FLD2945 = s3;
                        if(!CLS371.FLD3470.MTH5383(s3)) {
                            ʾˏ0.FLD2945 = "";
                        }
                    }
                    if(TextUtils.isEmpty(ʾˏ0.FLD2945)) {
                        for(int v2 = 0; v2 < 3 && arrayList3.size() < 3; ++v2) {
                            ArrayList arrayList4 = (ArrayList)arrayDeque2.poll();
                            if(arrayList4 == null) {
                                break;
                            }
                            arrayList3.addAll(arrayList4);
                        }
                        hashSet0.addAll(arrayList3);
                        CLS66.MTH1454(arrayList3);
                    }
                    else {
                        CLS66.MTH1464(ʾˏ0.FLD2945, null, arrayList3);
                    }
                    ʾˏ0.FLD2953 = arrayList3.size() + ʾˏ0.FLD2953;
                    if(CLS27.MTH895().MTH938("zombie_notif_enable", false)) {
                        CLS485 ᐧﾞ0 = (CLS485)CLS40.FLD157.MTH1118(class0);
                        CLS484 ᐧﾞ$ˆٴ0 = ʾˏ0.FLD2949;
                        String s4 = CLS27.MTH889("zombie_found_toast");
                        int v3 = ʾˏ0.FLD2953;
                        ᐧﾞ0.getClass();
                        CLS485.MTH6725(ᐧﾞ$ˆٴ0, String.format(s4, ʾˏ0.FLD2948.size()), Math.round(v3 / arrayDeque2.size() * 100));
                    }
                    ʾˏ0.MTH4691();
                }
                return;
            }
            case 5: {
                ArrayDeque arrayDeque3 = ʾˏ0.FLD2944;
                int v4 = Math.min(1, arrayDeque3.size());
                String s5 = CLS27.MTH895().MTH925("zombie_scan_msg", "") + "￀￀￀​￀";
                for(int v5 = 0; true; ++v5) {
                    if(v5 >= v4) {
                        if(CLS27.MTH895().MTH938("zombie_notif_enable", false)) {
                            CLS485 ᐧﾞ1 = (CLS485)CLS40.FLD157.MTH1118(class0);
                            CLS484 ᐧﾞ$ˆٴ1 = ʾˏ0.FLD2949;
                            String s7 = CLS27.MTH889("zombie_found_toast");
                            int v6 = ʾˏ0.FLD2953;
                            ᐧﾞ1.getClass();
                            CLS485.MTH6725(ᐧﾞ$ˆٴ1, String.format(s7, ʾˏ0.FLD2948.size()), Math.round(v6 / arrayDeque3.size() * 100));
                        }
                        ʾˏ0.MTH4691();
                        break;
                    }
                    String s6 = (String)arrayDeque3.poll();
                    if(TextUtils.isEmpty(s6)) {
                        break;
                    }
                    HashSet hashSet1 = ʾˏ0.FLD2952;
                    if(!hashSet1.contains(s6)) {
                        if(CLS371.FLD3470.MTH5356(s6)) {
                            ʾˏ0.MTH4696(s6, "");
                        }
                        else {
                            hashSet1.add(s6);
                            ʾˏ0.FLD2954 = true;
                            ++ʾˏ0.FLD2953;
                            CLS466.MTH6542(s6, s5);
                        }
                    }
                }
                return;
            }
            case 6: {
                CLS85 ـˏ0 = new CLS85(((String)ʾˏ0.FLD2941.peek()), null, "request");
                ـˏ0.FLD329 = true;
                ـˏ0.FLD334 = true;
                CLS66.MTH1462(ـˏ0);
                ʾˏ0.MTH4691();
                return;
            }
            default: {
                CLS66.MTH1520(((String)ʾˏ0.FLD2951.peek()), "wx");
                ʾˏ0.MTH4691();
            }
        }
    }
}

