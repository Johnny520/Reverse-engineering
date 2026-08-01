// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.ListView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS1;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS38.CLS37;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS44;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS73;
import b.יᐧ.CLS158.CLS157;
import b.יᐧ.CLS158;
import b.יﹳ.CLS164;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS502;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;

public final class CLS818 extends CLS140 {
    public final CLS158 FLD1220;
    public Object FLD1221;
    public ListView FLD1222;
    public final HashSet FLD1223;
    public final CLS158 FLD1224;
    public final CLS158 FLD1225;
    public final Pattern FLD1226;
    public boolean FLD1227;
    public Handler FLD1228;
    public final HashMap FLD1229;
    public List FLD1230;
    public final Pattern FLD1231;
    public final CLS73 FLD1232;
    public boolean FLD1233;
    public final CLS158 FLD1234;
    public Method FLD1235;
    public final CLS73 FLD1236;
    public CLS130 FLD1237;
    public final HashSet FLD1238;
    public boolean FLD1239;
    public int FLD1240;
    public final ArrayDeque FLD1241;
    public final HashSet FLD1242;
    public final ArrayList FLD1243;
    public final Pattern FLD1244;
    public Object FLD1245;

    // 此方法包含解密的字符串
    public CLS818(CLS139 ﹶʼ0) {
        public final class CLS812 implements CLS157 {
            public final CLS818 FLD1213;

            // 此方法包含解密的字符串
            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3145() {
                CLS818.this.FLD1227 = false;
                CLS412.MTH6014(((CLS140)CLS818.this).MTH3042(), CLS27.MTH889("friendrequest_stopped"));
            }

            // 此方法包含解密的字符串
            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3146(CLS158 ⁱʾ0) {
                CLS818 ᵎⁱ0 = CLS818.this;
                ᵎⁱ0.getClass();
                try {
                    ContentValues contentValues0 = (ContentValues)ⁱʾ0.MTH3152();
                    if(contentValues0 == null) {
                        CLS412.MTH6014(((CLS140)ᵎⁱ0).MTH3042(), CLS27.MTH889("friendrequest_stopped"));
                        return;
                    }
                    String s = contentValues0.getAsString("username");
                    ᵎⁱ0.FLD1223.add(s);
                    ᵎⁱ0.FLD1242.add(s);
                    CLS412.MTH6014(((CLS140)ᵎⁱ0).MTH3042(), String.format(CLS27.MTH889("add_friend_toast"), contentValues0.getAsString("nickname")));
                    Object[] arr_object = {null, null, ((int)contentValues0.getAsInteger("position")), 0};
                    CLS164.MTH3178(ᵎⁱ0.FLD1245, ᵎⁱ0.FLD1235, arr_object);
                    ⁱʾ0.MTH3156(((long)CLS412.MTH6015(CLS412.MTH6007(3000, ᵎⁱ0.FLD1240, ᵎⁱ0.FLD1240 - 5000), ᵎⁱ0.FLD1240 + 10000)));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS813 implements CLS157 {
            public final CLS818 FLD1214;

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3145() {
            }

            // 此方法包含解密的字符串
            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3146(CLS158 ⁱʾ0) {
                CLS818 ᵎⁱ0 = CLS818.this;
                ᵎⁱ0.getClass();
                ContentValues contentValues0 = (ContentValues)ⁱʾ0.MTH3152();
                if(contentValues0 != null) {
                    try {
                        String s = contentValues0.getAsString("talker");
                        String s1 = contentValues0.getAsString("ticket");
                        String s2 = contentValues0.getAsString("nickname");
                        HashSet hashSet0 = ᵎⁱ0.FLD1238;
                        if(!hashSet0.contains(s) && !ᵎⁱ0.FLD1444.MTH5382(s)) {
                            CLS412.MTH6014(((CLS140)ᵎⁱ0).MTH3042(), String.format(CLS27.MTH889("accept_nearby_nickname"), s2));
                            hashSet0.add(s);
                            CLS66.MTH1501(18, s, s1);
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }


        public final class CLS814 implements CLS157 {
            public final CLS818 FLD1215;

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3145() {
            }

            // 此方法包含解密的字符串
            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3146(CLS158 ⁱʾ0) {
                CLS818 ᵎⁱ0 = CLS818.this;
                ᵎⁱ0.getClass();
                ContentValues contentValues0 = (ContentValues)ⁱʾ0.MTH3152();
                if(contentValues0 != null) {
                    try {
                        String s = contentValues0.getAsString("talker");
                        String s1 = contentValues0.getAsString("ticket");
                        ᵎⁱ0.MTH2789(((int)contentValues0.getAsInteger("scene")), s, s1);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }


        public final class CLS815 implements CLS157 {
            public final CLS818 FLD1216;

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3145() {
            }

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3146(CLS158 ⁱʾ0) {
                CLS818 ᵎⁱ0 = CLS818.this;
                ᵎⁱ0.getClass();
                String s = (String)ⁱʾ0.MTH3152();
                if(!TextUtils.isEmpty(s)) {
                    CLS372.MTH5399(s, ((CLS1)new CLS858(ᵎⁱ0, s, 1)));
                }
            }
        }

        super(ﹶʼ0);
        this.FLD1240 = 5000;
        this.FLD1224 = new CLS158(((CLS157)new CLS814(this)), 25000L);
        this.FLD1225 = new CLS158(((CLS157)new CLS813(this)), 25000L);
        this.FLD1220 = new CLS158(((CLS157)new CLS815(this)), 25000L);
        this.FLD1234 = new CLS158(((CLS157)new CLS812(this)), 25000L);
        this.FLD1223 = new HashSet();
        this.FLD1242 = new HashSet();
        this.FLD1238 = new HashSet();
        this.FLD1243 = new ArrayList();
        this.FLD1241 = new ArrayDeque();
        this.FLD1232 = new CLS73(10);
        this.FLD1229 = new HashMap();
        this.FLD1244 = Pattern.compile(CLS27.MTH882("friendreqacceptpattern"), 2);
        this.FLD1226 = Pattern.compile(CLS27.MTH882("chatinvited"), 2);
        this.FLD1231 = Pattern.compile(CLS27.MTH882("newcontactpattern"), 2);
        this.FLD1236 = new CLS73();
        new SimpleDateFormat("yyyy-MM-dd");
    }

    // 此方法包含解密的字符串
    public final void MTH2789(int v, String s, String s1) {
        try {
            if(this.FLD1444.MTH5382(s)) {
                return;
            }
            if(this.FLD1445.MTH938("send_accept_reply", false)) {
                CLS858 ﹳˎ0 = new CLS858(this, s, 0);
                this.FLD1229.put(s, ﹳˎ0);
            }
            CLS66.MTH1501(v, s, s1);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2790(String s) {
        if(this.FLD1445.MTH938("auto_label_new_contact", false) && this.FLD1447.FLD1438.MTH6895("auto_label_new_contact")) {
            CLS827 ᵔᐧ0 = new CLS827(this, s, 1);
            CLS40.FLD157.MTH1123(((CLS39)ᵔᐧ0), 5000L);
        }
    }

    public final CLS44 MTH2791() {
        return (CLS44)CLS40.FLD157.MTH1118(CLS44.class);
    }

    // 此方法包含解密的字符串
    public final void MTH2792() {
        public final class CLS130 implements Runnable {
            public final CLS818 FLD1212;

            // 此方法包含解密的字符串
            @Override
            public final void run() {
                int v2;
                Handler handler0;
                CLS818 ᵎⁱ0 = CLS818.this;
                String s = ᵎⁱ0.FLD1445.MTH925("auto_remark_enable_text", "");
                try {
                    ᵎⁱ0.FLD1239 = true;
                    CLS372.MTH5408(((String)ᵎⁱ0.FLD1241.poll()), s);
                }
                catch(Throwable throwable0) {
                    if(ᵎⁱ0.FLD1228 != null) {
                        try {
                            if(ᵎⁱ0.FLD1241.isEmpty()) {
                                String[] arr_s = CLS502.MTH6941(ᵎⁱ0.FLD1445.MTH925("auto_remark_list", ""));
                                ᵎⁱ0.FLD1228.removeCallbacks(this);
                                for(int v = 0; v < arr_s.length; ++v) {
                                    String s1 = arr_s[v];
                                    if(!s.equals(ᵎⁱ0.FLD1444.MTH5323(s1))) {
                                        ᵎⁱ0.FLD1241.add(s1);
                                    }
                                }
                                if(ᵎⁱ0.FLD1241.isEmpty()) {
                                    String s2 = ᵎⁱ0.FLD1445.MTH925("auto_remark_list_temp", "");
                                    if(TextUtils.isEmpty(s2)) {
                                        ᵎⁱ0.FLD1445.MTH922("", "auto_remark_list");
                                        ᵎⁱ0.FLD1239 = false;
                                    }
                                    else {
                                        String[] arr_s1 = CLS502.MTH6941(s2);
                                        Collections.addAll(ᵎⁱ0.FLD1241, arr_s1);
                                        ᵎⁱ0.FLD1445.MTH922("", "auto_remark_list_temp");
                                        ᵎⁱ0.FLD1228.postDelayed(this, ((long)CLS412.MTH6005(10000, "auto_remark_delay")));
                                        throw throwable0;
                                    }
                                }
                                else {
                                    ᵎⁱ0.FLD1228.postDelayed(this, ((long)CLS412.MTH6005(10000, "auto_remark_delay")));
                                }
                            }
                            else {
                                ᵎⁱ0.FLD1228.postDelayed(this, ((long)CLS412.MTH6005(10000, "auto_remark_delay")));
                            }
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                        }
                    }
                    throw throwable0;
                }
                if(ᵎⁱ0.FLD1228 != null) {
                    try {
                        if(ᵎⁱ0.FLD1241.isEmpty()) {
                            String[] arr_s2 = CLS502.MTH6941(ᵎⁱ0.FLD1445.MTH925("auto_remark_list", ""));
                            ᵎⁱ0.FLD1228.removeCallbacks(this);
                            for(int v1 = 0; v1 < arr_s2.length; ++v1) {
                                String s3 = arr_s2[v1];
                                if(!s.equals(ᵎⁱ0.FLD1444.MTH5323(s3))) {
                                    ᵎⁱ0.FLD1241.add(s3);
                                }
                            }
                            if(ᵎⁱ0.FLD1241.isEmpty()) {
                                String s4 = ᵎⁱ0.FLD1445.MTH925("auto_remark_list_temp", "");
                                if(TextUtils.isEmpty(s4)) {
                                    ᵎⁱ0.FLD1445.MTH922("", "auto_remark_list");
                                    ᵎⁱ0.FLD1239 = false;
                                    return;
                                }
                                String[] arr_s3 = CLS502.MTH6941(s4);
                                Collections.addAll(ᵎⁱ0.FLD1241, arr_s3);
                                ᵎⁱ0.FLD1445.MTH922("", "auto_remark_list_temp");
                                handler0 = ᵎⁱ0.FLD1228;
                                v2 = CLS412.MTH6005(10000, "auto_remark_delay");
                            }
                            else {
                                handler0 = ᵎⁱ0.FLD1228;
                                v2 = CLS412.MTH6005(10000, "auto_remark_delay");
                            }
                        }
                        else {
                            handler0 = ᵎⁱ0.FLD1228;
                            v2 = CLS412.MTH6005(10000, "auto_remark_delay");
                        }
                        handler0.postDelayed(this, ((long)v2));
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                }
            }
        }

        if(CLS27.MTH901()) {
            return;
        }
        if(this.FLD1228 == null) {
            this.FLD1228 = CLS40.FLD157.MTH1121();
        }
        CLS130 ᵎⁱ$ˆٴ0 = this.FLD1237;
        if(ᵎⁱ$ˆٴ0 != null) {
            this.FLD1228.removeCallbacks(ᵎⁱ$ˆٴ0);
        }
        CLS130 ᵎⁱ$ˆٴ1 = new CLS130(this);
        this.FLD1237 = ᵎⁱ$ˆٴ1;
        this.FLD1228.postDelayed(ᵎⁱ$ˆٴ1, ((long)CLS412.MTH6005(10000, "auto_remark_delay")));
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        public final class CLS811 implements CLS11 {
            public final String FLD1210;
            public final CLS818 FLD1211;

            public CLS811(String s) {
                this.FLD1210 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                String s = this.FLD1210;
                boolean z = CLS426.MTH6126(s);
                CLS818 ᵎⁱ0 = CLS818.this;
                if(z) {
                    ᵎⁱ0.getClass();
                    CLS66.MTH1436(s, CLS27.MTH904());
                }
                else {
                    CLS66.MTH1507(s);
                }
                CLS412.MTH6014(((CLS140)ᵎⁱ0).MTH3042(), String.format(CLS27.MTH889("delete_contact"), ᵎⁱ0.FLD1444.MTH5316(s)));
            }
        }


        public final class CLS816 implements CLS11 {
            public final ArrayList FLD1217;
            public final CLS818 FLD1218;

            public CLS816(ArrayList arrayList0) {
                this.FLD1217 = arrayList0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS387.MTH5594(((CLS140)CLS818.this).MTH3042(), this.FLD1217, true);
            }
        }


        public final class CLS817 implements CLS11 {
            public final Activity FLD1219;

            public CLS817(Activity activity0) {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                ArrayList arrayList0 = new ArrayList();
                CLS387.MTH5594(this.FLD1219, arrayList0, false);
            }
        }

        ʾᵢ0.MTH833("b.contactinfoui.menu.options,b.singlechatinfoui.menu.options", ((CLS37)new CLS721(this, 0)));
        CLS34.MTH1077(this, 5, ʾᵢ0, "b.contactinfoui.menu.config,b.singlechatinfoui.menu.config");
        CLS34.MTH1077(this, 15, ʾᵢ0, "b.on_MMFragmentActivity_onResume,b.on_VASActivity_onResume");
        CLS34.MTH1077(this, 21, ʾᵢ0, "b.sqldb.insert");
        CLS34.MTH1077(this, 22, ʾᵢ0, "a.async.sqldb.insert");
        CLS34.MTH1077(this, 23, ʾᵢ0, "new_contact");
        CLS34.MTH1077(this, 24, ʾᵢ0, "onlauncheruienter");
        CLS34.MTH1077(this, 25, ʾᵢ0, "nearbyFriendReq");
        CLS34.MTH1077(this, 26, ʾᵢ0, "chatroomFriendReq");
        CLS34.MTH1077(this, 27, ʾᵢ0, "FriendReq");
        CLS34.MTH1077(this, 0, ʾᵢ0, "PhoneFriendReq");
        CLS34.MTH1077(this, 1, ʾᵢ0, "acceptFriendReq");
        ʾᵢ0.MTH833("dialog_remark_listnames", ((CLS37)new CLS721(this, 1)));
        CLS34.MTH1077(this, 2, ʾᵢ0, "dialogRemark");
        CLS34.MTH1077(this, 3, ʾᵢ0, "onAcceptListener");
        ʾᵢ0.MTH833("b.chatroominfoui.menu.options,b.contactinfoui.menu.options,b.singlechatinfoui.menu.options", ((CLS37)new CLS721(this, 2)));
        CLS34.MTH1077(this, 4, ʾᵢ0, "b.chatroominfoui.menu.config,b.contactinfoui.menu.config,b.singlechatinfoui.menu.config");
        ʾᵢ0.MTH833("b.chatroominfoui.menu.options,b.contactinfoui.menu.options,b.singlechatinfoui.menu.options", ((CLS37)new CLS721(this, 3)));
        ʾᵢ0.MTH833(CLS34.MTH1062(15, ʾᵢ0, "b.chatroominfoui.menu.config,b.contactinfoui.menu.config,b.singlechatinfoui.menu.config", 0x38EB34342B3CD335L), ((CLS37)new CLS721(this, 4)));
        CLS34.MTH1077(this, 6, ʾᵢ0, "plus.config");
        CLS34.MTH1077(this, 7, ʾᵢ0, "FriendReq_export");
        CLS34.MTH1077(this, 8, ʾᵢ0, "nearbyFriendReq_export");
        CLS34.MTH1077(this, 9, ʾᵢ0, "nearbyFriendReq_import");
        CLS34.MTH1077(this, 10, ʾᵢ0, "FriendReq_import");
        ʾᵢ0.MTH833("getNearbyList", ((CLS37)new CLS721(this, 5)));
        CLS34.MTH1077(this, 11, ʾᵢ0, "a.on_MMActivity_onCreate,a.on_VASActivity_onCreate");
        CLS34.MTH1077(this, 12, ʾᵢ0, "a.on_MMActivity_onCreate");
        CLS34.MTH1077(this, 13, ʾᵢ0, "accept_neighbor_friendreq");
        CLS34.MTH1077(this, 14, ʾᵢ0, "a.on_MMActivity_onCreate");
        CLS34.MTH1077(this, 16, ʾᵢ0, "b.sqldb.update");
        ʾᵢ0.MTH833("b.singlechatinfoui.menu.options", ((CLS37)new CLS721(this, 6)));
        CLS34.MTH1077(this, 17, ʾᵢ0, "b.chatroominfoui.menu.config,b.contactinfoui.menu.config,b.singlechatinfoui.menu.config");
        ʾᵢ0.MTH833("get_sf_block_vid_response", ((CLS37)new CLS721(this, 7)));
        CLS34.MTH1077(this, 18, ʾᵢ0, "on_TabAddressClass_TabResumeMethod,on_MvvmAddressUIFragment_TabResumeMethod");
        CLS34.MTH1077(this, 19, ʾᵢ0, "on_MvvmAddressUIFragmentClass2_run");
        CLS34.MTH1077(this, 20, ʾᵢ0, "new_chatroom_member");
        ʾᵢ0.MTH833(CLS34.MTH1062(18, ʾᵢ0, CLS34.MTH1062(17, ʾᵢ0, CLS34.MTH1062(16, ʾᵢ0, "on_TransferPlaceOrderClass", 0x38EB32E92B3CD335L), 4101427931404620597L), 4101427450368283445L), ((CLS37)new CLS787(2)));
        CLS34.MTH1077(this, 28, CLS21.FLD76, "a.onGetAvatar");
        CLS21.FLD76.MTH828(CLS34.MTH1062(24, CLS21.FLD76, CLS34.MTH1062(23, CLS21.FLD76, CLS34.MTH1062(22, CLS21.FLD76, CLS34.MTH1062(21, CLS21.FLD76, CLS34.MTH1062(20, CLS21.FLD76, CLS34.MTH1062(19, CLS21.FLD76, "on_contact_label_add", 4101436667368100661L), 4101436207806599989L), 4101436310885815093L), 4101436413965030197L), 4101437053915157301L), 4101438037462668085L), ((CLS35)new CLS666(this, 0)));
        CLS21.FLD76.MTH828("on_NearbyPerson_recordSightMethod1", ((CLS35)new CLS666(this, 6)));
        CLS21.FLD76.MTH828("on_NearbyPerson_onMMMenuItemSelected", ((CLS35)new CLS666(this, 7)));
        CLS21.FLD76.MTH828("on_NearbyFriendsUIItemListenerClass", ((CLS35)new CLS666(this, 8)));
        CLS21.FLD76.MTH828("on_nearbyClass_nearbyMethod", ((CLS35)new CLS666(this, 9)));
        CLS21.FLD76.MTH828("on_ContactInfoUI_onResume", ((CLS35)new CLS666(this, 10)));
        CLS21.FLD76.MTH828("on_SayHiEditUI_onCreate", ((CLS35)new CLS666(this, 11)));
        CLS21.FLD76.MTH828("on_SayHiMenuListenerClass", ((CLS35)new CLS666(this, 12)));
        CLS21.FLD76.MTH828("on_radarClass_a", ((CLS35)new CLS666(this, 13)));
        CLS21.FLD76.MTH828("b.on_verifyUserClass_a", ((CLS35)new CLS666(this, 14)));
        CLS21.FLD76.MTH828("a.on_verifyUserClass_a", ((CLS35)new CLS666(this, 1)));
        CLS21.FLD76.MTH828("on_FMessageConversationUI_onCreate", ((CLS35)new CLS666(this, 2)));
        CLS21.FLD76.MTH828("on_WorkerProfile9_a", ((CLS35)new CLS666(this, 3)));
        CLS21.FLD76.MTH828(CLS34.MTH1062(25, CLS21.FLD76, "on_search_contact_result", 4101439678140175157L), ((CLS35)new CLS666(this, 4)));
        CLS21.FLD76.MTH828("on_shake_get", ((CLS35)new CLS666(this, 5)));
        CLS21.FLD76.MTH833("chattingui.optionsmenu.options", ((CLS37)new CLS721(this, 8)));
        CLS21.FLD76.MTH833("chattingui.optionsmenu.options", ((CLS37)new CLS721(this, 9)));
        CLS34.MTH1077(this, 29, CLS21.FLD76, "chattingui.optionsmenu.config");
    }

    // 此方法包含解密的字符串
    public static void MTH2794(CLS818 ᵎⁱ0) {
        ᵎⁱ0.FLD1227 = false;
        CLS158 ⁱʾ0 = ᵎⁱ0.FLD1234;
        if(ⁱʾ0.FLD1562) {
            ⁱʾ0.FLD1562 = false;
            ⁱʾ0.MTH3153().removeCallbacks(ⁱʾ0.FLD1560);
            ⁱʾ0.MTH3151();
            if(!ⁱʾ0.MTH3154()) {
                ⁱʾ0.FLD1557.clear();
            }
            CLS412.MTH6014(((CLS140)ᵎⁱ0).MTH3042(), CLS27.MTH889("friendrequest_stopped"));
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2795(int v, int v1) {
        CLS371 ʻ0 = this.FLD1444;
        CLS158 ⁱʾ0 = this.FLD1225;
        if(!this.FLD1447.FLD1438.MTH6895("mass_accept_nearby_friend_requests")) {
            return;
        }
        try {
            HashSet hashSet0 = new HashSet();
            Cursor cursor0 = ʻ0.MTH5307(CLS27.MTH882("q_db101"), null);
            if(cursor0 == null) {
                return;
            }
            if(cursor0.moveToFirst()) {
                while(true) {
                    HashMap hashMap0 = CLS392.MTH5633(cursor0.getString(cursor0.getColumnIndex("content")), "msg");
                    if(hashMap0 != null) {
                        String s = (String)hashMap0.get(".msg.$fromusername");
                        if(!hashSet0.contains(s)) {
                            hashSet0.add(s);
                            if(!ʻ0.MTH5382(s) && (v == -1 || v == Integer.parseInt(((String)hashMap0.get(".msg.$sex"))))) {
                                String s1 = (String)hashMap0.get(".msg.$ticket");
                                String s2 = (String)hashMap0.get(".msg.$fromnickname");
                                ContentValues contentValues0 = new ContentValues();
                                contentValues0.put("talker", s);
                                contentValues0.put("ticket", s1);
                                contentValues0.put("nickname", s2);
                                ⁱʾ0.MTH3150(contentValues0);
                                ⁱʾ0.MTH3156(((long)v1));
                                ⁱʾ0.MTH3149(((long)v1));
                            }
                        }
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

