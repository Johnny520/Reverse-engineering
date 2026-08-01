// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.database.Cursor;
import android.os.Handler;
import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS485.CLS484;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class CLS283 {
    public final ArrayDeque FLD2938;
    public final Handler FLD2939;
    public final CLS291 FLD2940;
    public final ArrayDeque FLD2941;
    public final Pattern FLD2942;
    public boolean FLD2943;
    public final ArrayDeque FLD2944;
    public String FLD2945;
    public static final CLS283 FLD2946;
    public final Pattern FLD2947;
    public final HashSet FLD2948;
    public CLS484 FLD2949;
    public final Pattern FLD2950;
    public final ArrayDeque FLD2951;
    public final HashSet FLD2952;
    public int FLD2953;
    public boolean FLD2954;
    public final Pattern FLD2955;
    public final HashSet FLD2956;

    static {
        CLS283.FLD2946 = new CLS283();
    }

    // 此方法包含解密的字符串
    public CLS283() {
        this.FLD2954 = false;
        this.FLD2943 = false;
        this.FLD2953 = 0;
        this.FLD2941 = new ArrayDeque();
        this.FLD2951 = new ArrayDeque();
        this.FLD2944 = new ArrayDeque();
        this.FLD2948 = new HashSet();
        this.FLD2952 = new HashSet();
        this.FLD2938 = new ArrayDeque();
        this.FLD2956 = new HashSet();
        this.FLD2955 = Pattern.compile(CLS27.MTH882("zombiepattern"), 2);
        this.FLD2942 = Pattern.compile(CLS27.MTH882("zombiepattern_deleted"), 2);
        this.FLD2950 = Pattern.compile(CLS27.MTH882("zombiepattern_banned"), 2);
        this.FLD2947 = Pattern.compile(CLS27.MTH882("zombiepattern_blacklist"), 2);
        this.FLD2939 = CLS40.FLD157.MTH1121();
        this.FLD2940 = new CLS291(3, this);
    }

    // 此方法包含解密的字符串
    public final void MTH4689() {
        if(this.FLD2943) {
            return;
        }
        this.FLD2943 = true;
        this.FLD2953 = 0;
        CLS40 ﾞᵎ0 = CLS40.FLD157;
        CLS485 ᐧﾞ0 = (CLS485)ﾞᵎ0.MTH1118(CLS485.class);
        String s = CLS27.MTH889("scan_zombie");
        String s1 = CLS27.MTH889("start_zombie_scan");
        ᐧﾞ0.getClass();
        this.FLD2949 = CLS485.MTH6746("progress", s, s1);
        switch(CLS27.MTH895().MTH927((CLS412.MTH6002() ? 3 : 0), "scan_zombie_method")) {
            case 0: {
                ﾞᵎ0.MTH1123(((CLS39)new CLS1253(this, 0)), 2000L);
                return;
            }
            case 1: {
                ﾞᵎ0.MTH1123(((CLS39)new CLS1253(this, 3)), 1000L);
                return;
            }
            case 2: {
                if(CLS500.FLD4928.MTH6895("zombie_silent_search")) {
                    ﾞᵎ0.MTH1124(((CLS39)new CLS1253(this, 2)));
                    return;
                }
                break;
            }
            case 3: {
                if(CLS500.FLD4928.MTH6895("zombie_transfer_search")) {
                    ﾞᵎ0.MTH1124(((CLS39)new CLS1253(this, 1)));
                    return;
                }
                break;
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH4690() {
        this.FLD2939.removeCallbacks(this.FLD2940);
        ArrayDeque arrayDeque0 = this.FLD2951;
        HashSet hashSet0 = this.FLD2948;
        if(arrayDeque0.isEmpty()) {
            this.FLD2954 = false;
            CLS412.MTH6011(String.format(CLS27.MTH889("zombie_scan_complete"), hashSet0.size()));
            CLS27.MTH906(("zombie scan complete: found " + hashSet0.size()));
            return;
        }
        ++this.FLD2953;
        if(CLS27.MTH895().MTH938("zombie_notif_enable", false)) {
            CLS485 ᐧﾞ0 = (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
            CLS484 ᐧﾞ$ˆٴ0 = this.FLD2949;
            String s = CLS27.MTH889("zombie_found_toast");
            int v = this.FLD2953;
            ᐧﾞ0.getClass();
            CLS485.MTH6725(ᐧﾞ$ˆٴ0, String.format(s, hashSet0.size()), Math.round(v / arrayDeque0.size() * 100));
        }
        CLS1253 ᴵˆ0 = new CLS1253(this, 7);
        long v1 = (long)CLS412.MTH6005(5000, "zombie_scan_send_delay");
        CLS40.FLD157.MTH1123(((CLS39)ᴵˆ0), v1);
    }

    // 此方法包含解密的字符串
    public final void MTH4691() {
        int v = CLS412.MTH6005(5000, "zombie_scan_send_delay");
        int v1 = CLS27.MTH879(15000, "zombie_scan_backup_delay");
        this.FLD2939.postDelayed(this.FLD2940, ((long)(v1 + v)));
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH4692() {
        String s = CLS27.MTH895().MTH925("zombie_search_contacts", "");
        ArrayList arrayList0 = new ArrayList();
        List list0 = TextUtils.isEmpty(s) ? CLS283.MTH4695() : Arrays.asList(CLS502.MTH6941(s));
        arrayList0.addAll(list0);
        String s1 = CLS27.MTH895().MTH925("zombie_excl_list", "");
        CLS371.FLD3470.getClass();
        HashSet hashSet0 = new HashSet();
        String s2 = CLS27.MTH882("q_db100");
        Cursor cursor0 = CLS371.FLD3470.MTH5307(s2, null);
        if(cursor0 != null) {
            if(cursor0.moveToFirst()) {
                while(true) {
                    hashSet0.add(cursor0.getString(cursor0.getColumnIndex("username")));
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        hashSet0.addAll(Arrays.asList(CLS502.MTH6941(s1)));
        boolean z = CLS27.MTH895().MTH927((CLS412.MTH6002() ? 3 : 0), "scan_zombie_method") == 0;
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s3 = (String)object0;
            if(this.FLD2952.contains(s3) || (CLS21.FLD76.MTH830("isHidden", new Object[]{s3}) || hashSet0.contains(s3) || z && CLS372.MTH5406(s3))) {
                iterator0.remove();
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final void MTH4693() {
        long v;
        CLS1253 ᴵˆ0;
        CLS40 ﾞᵎ0;
        this.FLD2939.removeCallbacks(this.FLD2940);
        if(TextUtils.isEmpty(CLS27.MTH895().MTH925("zombie_check_chatroom", ""))) {
        label_10:
            ﾞᵎ0 = CLS40.FLD157;
            ᴵˆ0 = new CLS1253(this, 4);
            v = (long)CLS412.MTH6005(5000, "zombie_scan_send_delay");
        }
        else {
            CLS426.MTH6115(CLS27.MTH895().MTH925("zombie_check_chatroom", ""));
            if(this.FLD2938.isEmpty()) {
                this.FLD2954 = false;
                CLS412.MTH6011(String.format(CLS27.MTH889("zombie_scan_complete"), this.FLD2948.size()));
                ﾞᵎ0 = CLS40.FLD157;
                ᴵˆ0 = new CLS1225(3);
                v = 1500L;
                ﾞᵎ0.MTH1123(((CLS39)ᴵˆ0), v);
                return;
            }
            goto label_10;
        }
        ﾞᵎ0.MTH1123(((CLS39)ᴵˆ0), v);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH4694(int v, String s, String s1) {
        if(v == 10000 && !TextUtils.isEmpty(s1) && !CLS426.MTH6126(s)) {
            String s2 = CLS27.MTH895().MTH925("detect_zombie_type", "");
            if(!TextUtils.isEmpty(s2)) {
                boolean z = CLS502.MTH6935(this.FLD2942, s1);
                boolean z1 = CLS502.MTH6935(this.FLD2947, s1);
                boolean z2 = CLS502.MTH6935(this.FLD2950, s1);
                if(!z && !z1 && !z2 || z && !CLS502.MTH6934(s2, new String[]{"deleted"}) || z1 && !CLS502.MTH6934(s2, new String[]{"blacklist"}) || z2 && !CLS502.MTH6934(s2, new String[]{"banned"})) {
                    return;
                }
            }
            else if(!CLS502.MTH6935(this.FLD2955, s1)) {
                return;
            }
            this.MTH4696(s, "");
        }
    }

    // 此方法包含解密的字符串
    public static ArrayList MTH4695() {
        String s = CLS27.MTH904();
        ArrayList arrayList0 = CLS371.FLD3470.MTH5341(s);
        if(CLS27.MTH895().MTH927((CLS412.MTH6002() ? 3 : 0), "scan_zombie_method") == 0) {
            Iterator iterator0 = arrayList0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(CLS372.MTH5406(((String)object0))) {
                    iterator0.remove();
                }
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final void MTH4696(String s, String s1) {
        this.FLD2948.add(s);
        CLS27.MTH895().MTH922(TextUtils.join(",", this.FLD2948), "zombies");
        CLS412.MTH6011(String.format(CLS27.MTH889("zombie_found_toast2"), CLS371.FLD3470.MTH5311(s), s1, this.FLD2948.size()));
        if(CLS27.MTH895().MTH938("zombie_auto_delete", false) && CLS500.FLD4928.MTH6895("zombie_auto_delete")) {
            CLS1258 ⁱˏ0 = new CLS1258(0, s);
            CLS40.FLD157.MTH1123(((CLS39)ⁱˏ0), 3000L);
            return;
        }
        if(!CLS27.MTH895().MTH938("auto_label_zombies", CLS412.MTH6002())) {
            return;
        }
        String s2 = CLS27.MTH889("zombie");
        CLS279.FLD2908.MTH4651(s2, s);
    }

    // 此方法包含解密的字符串
    public final void MTH4697() {
        this.FLD2939.removeCallbacks(this.FLD2940);
        if(this.FLD2944.isEmpty()) {
            this.FLD2954 = false;
            CLS412.MTH6011(String.format(CLS27.MTH889("zombie_scan_complete"), this.FLD2948.size()));
            return;
        }
        CLS1253 ᴵˆ0 = new CLS1253(this, 5);
        int v = CLS412.MTH6005(5000, "zombie_scan_send_delay");
        CLS40.FLD157.MTH1123(((CLS39)ᴵˆ0), ((long)Math.max(1000, v)));
    }

    // 此方法包含解密的字符串
    public final void MTH4698() {
        this.FLD2939.removeCallbacks(this.FLD2940);
        ArrayDeque arrayDeque0 = this.FLD2941;
        HashSet hashSet0 = this.FLD2948;
        if(arrayDeque0.isEmpty()) {
            this.FLD2954 = false;
            CLS412.MTH6011(String.format(CLS27.MTH889("zombie_scan_complete"), hashSet0.size()));
            return;
        }
        ++this.FLD2953;
        if(CLS27.MTH895().MTH938("zombie_notif_enable", false)) {
            CLS485 ᐧﾞ0 = (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
            CLS484 ᐧﾞ$ˆٴ0 = this.FLD2949;
            String s = CLS27.MTH889("zombie_found_toast");
            int v = this.FLD2953;
            ᐧﾞ0.getClass();
            CLS485.MTH6725(ᐧﾞ$ˆٴ0, String.format(s, hashSet0.size()), Math.round(v / arrayDeque0.size() * 100));
        }
        CLS1253 ᴵˆ0 = new CLS1253(this, 6);
        long v1 = (long)CLS412.MTH6005(5000, "zombie_scan_send_delay");
        CLS40.FLD157.MTH1123(((CLS39)ᴵˆ0), v1);
    }
}

