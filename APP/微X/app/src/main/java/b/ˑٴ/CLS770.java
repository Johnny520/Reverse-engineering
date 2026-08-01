// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS90;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS1049;
import b.ᵔʾ.CLS1228;
import b.ᵔʾ.CLS1259;
import b.ⁱᵔ.CLS1393;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518.CLS516;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

public final class CLS770 extends CLS140 {
    public boolean FLD1061;
    public boolean FLD1062;
    public Method FLD1063;
    public String FLD1064;
    public final HashSet FLD1065;
    public boolean FLD1066;
    public CLS90 FLD1067;
    public final int FLD1068;

    public CLS770(CLS139 ﹶʼ0) {
        super(ﹶʼ0);
        this.FLD1065 = new HashSet();
        this.FLD1068 = 900000;
    }

    // 此方法包含解密的字符串
    public final void MTH2583(String s) {
        public final class CLS769 implements CLS8 {
            public final String FLD1059;
            public final CLS770 FLD1060;

            public CLS769(String s) {
                this.FLD1059 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                if(object0 == null) {
                    return;
                }
                String s = (String)object0;
                if(TextUtils.isEmpty(s)) {
                    return;
                }
                String s1 = this.FLD1059;
                CLS770 ٴʿ0 = CLS770.this;
                if(!s.startsWith("http") && !s.startsWith("www")) {
                    ٴʿ0.getClass();
                    if(TextUtils.isEmpty(s1)) {
                        s1 = ٴʿ0.FLD1447.FLD1434;
                    }
                    if(s.endsWith("gif") && CLS404.MTH5905()) {
                        CLS66.MTH1385(s1, s);
                        return;
                    }
                    CLS66.MTH1406(CLS27.MTH904(), s1, s);
                    return;
                }
                ٴʿ0.getClass();
                try {
                    if(TextUtils.isEmpty(s1)) {
                        s1 = ٴʿ0.FLD1447.FLD1434;
                    }
                    File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "wx_web_emoji_img_" + CLS502.MTH6925(s));
                    if(!CLS31.MTH1001(file0)) {
                        file0.createNewFile();
                    }
                    if(s.endsWith("gif")) {
                        CLS518.MTH7066(s, new CLS1228(ٴʿ0, file0, s1, 4));
                        return;
                    }
                    CLS518.MTH7068(s, ((CLS516)new CLS1259(ٴʿ0, file0, s1, 11)));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        Activity activity0 = ((CLS140)this).MTH3042();
        CLS769 ٴʿ$ˆٴ0 = new CLS769(this, s);
        if(CLS395.FLD3772 != null && CLS395.FLD3772.isShowing()) {
            CLS395.FLD3772.dismiss();
        }
        String s1 = CLS27.MTH889("search_image");
        ArrayList arrayList0 = new ArrayList();
        AlertDialog alertDialog0 = CLS523.MTH7160(activity0, s1, ((CLS17)new CLS1049(arrayList0, activity0, ٴʿ$ˆٴ0, 7)), ((CLS11)new CLS1393(ٴʿ$ˆٴ0, arrayList0)));
        CLS395.FLD3772 = alertDialog0;
        alertDialog0.getWindow().setSoftInputMode(5);
    }

    // 此方法包含解密的字符串
    public final void MTH2584(CLS167 ᵔʾ0, String s, String s1, Intent intent0) {
        if(!intent0.hasExtra("fromWxp") && !intent0.hasExtra("KAppId") && intent0.hasExtra("rawUrl") && (this.FLD1445.MTH938("url_open_browser_enable", false) && "webview".equalsIgnoreCase(s) && ".ui.tools.WebViewUI".equals(s1) || this.FLD1445.MTH938("article_open_browser_enable", false) && "brandservice".equalsIgnoreCase(s) && ".ui.timeline.preload.ui.TmplWebViewMMUI".equals(s1))) {
            StackTraceElement[] arr_stackTraceElement = Thread.currentThread().getStackTrace();
        alab1:
            for(int v = 0; true; ++v) {
                boolean z = false;
                if(v >= arr_stackTraceElement.length) {
                    break;
                }
                String s2 = arr_stackTraceElement[v].toString();
                for(int v1 = 0; v1 < 2; ++v1) {
                    String s3 = new String[]{".ui.chatting", "neattextview.textview"}[v1];
                    if(!TextUtils.isEmpty(s3) && s2.contains(s3)) {
                        z = true;
                        break alab1;
                    }
                }
            }
            if(!z) {
                return;
            }
            String s4 = intent0.getStringExtra("rawUrl");
            if(s4.startsWith("weixin://") || CLS502.MTH6934(s4, new String[]{"support.weixin.qq.com", "addchatroombyinvite", "addopenimchatroombyinvite"}) || intent0.hasExtra("pay_channel")) {
                return;
            }
            ᵔʾ0.MTH3207(null);
            CLS432.MTH6177(((CLS140)this).MTH3042(), Uri.parse(s4));
        }
    }

    // 此方法包含解密的字符串
    public final String MTH2585(String s, boolean z) {
        double f2;
        String s1 = "fake_amount_keep_original";
        String s2 = "fake_amount_d";
        if(z) {
            s1 = "fake_amount_keep_original_lqt";
            s2 = "fake_amount_d_lqt";
        }
        CLS29 ˎᵢ0 = this.FLD1445;
        String s3 = ˎᵢ0.MTH925(s1, "");
        if(!TextUtils.isEmpty(s3)) {
            double f = TextUtils.isDigitsOnly(s.substring(0, 1)) ? Double.parseDouble(s) : Double.parseDouble(s.substring(1));
            double f1 = Double.parseDouble(s3.substring(1).trim());
            if(s3.startsWith("-")) {
                f2 = f - f1;
                return TextUtils.isDigitsOnly(s.substring(0, 1)) ? String.format("%.2f", f2) : String.format((s.charAt(0) + "%.2f"), f2);
            }
            f2 = s3.startsWith("+") ? f + f1 : f + Double.parseDouble(s3.trim());
            return TextUtils.isDigitsOnly(s.substring(0, 1)) ? String.format("%.2f", f2) : String.format((s.charAt(0) + "%.2f"), f2);
        }
        String s4 = ˎᵢ0.MTH925(s2, "");
        if(TextUtils.isEmpty(s4)) {
            return s;
        }
        return TextUtils.isDigitsOnly(s.substring(0, 1)) ? String.format("%.2f", Double.valueOf(s4)) : String.format((s.charAt(0) + "%.2f"), Double.valueOf(s4));
    }

    // 此方法包含解密的字符串
    public final void MTH2586(String s) {
        try {
            CLS29 ˎᵢ0 = this.FLD1445;
            CLS90 ᐧⁱ0 = this.FLD1067;
            if(ᐧⁱ0 != null) {
                ᐧⁱ0.MTH1727();
            }
            CLS90 ᐧⁱ1 = new CLS90(CLS27.MTH900(), CLS31.MTH992(s));
            this.FLD1067 = ᐧⁱ1;
            int v = ˎᵢ0.MTH927(640, "float_vid_width");
            int v1 = ˎᵢ0.MTH927(480, "float_vid_height");
            ᐧⁱ1.FLD374 = Math.min(Math.max(v, 640), ᐧⁱ1.FLD369.x);
            ᐧⁱ1.FLD378 = Math.min(Math.max(v1, 480), ᐧⁱ1.FLD369.y);
            if(Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(((CLS140)this).MTH3042())) {
                Intent intent0 = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(("package:" + CLS390.MTH5619(((CLS140)this).MTH3042()))));
                Activity activity0 = this.FLD1447.MTH3015();
                if(activity0 == null) {
                    activity0 = ((CLS140)this).MTH3042();
                }
                activity0.startActivityForResult(intent0, 1000);
                return;
            }
            this.FLD1067.MTH1728();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        CLS34.MTH1072(this, 0, ʾᵢ0, "b.snsuploadui.onactivityresult");
        CLS34.MTH1072(this, 11, ʾᵢ0, "b.fav.menu.oncreate");
        CLS34.MTH1072(this, 17, ʾᵢ0, "b.fav.menu.oncreate2");
        CLS34.MTH1075(this, 0, ʾᵢ0, "sns.menu.options");
        CLS34.MTH1072(this, 18, ʾᵢ0, "sns.menu.config");
        CLS34.MTH1072(this, 19, ʾᵢ0, "b.on_MMActivity_onCreate");
        CLS34.MTH1072(this, 20, ʾᵢ0, "b.on_MMActivity_onCreate");
        CLS34.MTH1072(this, 21, ʾᵢ0, "a.chat.onresume");
        CLS34.MTH1072(this, 22, ʾᵢ0, "a.async.sqldb.insert");
        CLS34.MTH1072(this, 23, ʾᵢ0, "a.async.sqldb.update");
        CLS34.MTH1072(this, 1, ʾᵢ0, "a.on_MMActivity_onCreate");
        CLS34.MTH1072(this, 2, ʾᵢ0, "on_activity_startActivity");
        CLS34.MTH1072(this, 3, ʾᵢ0, "onlauncheruienter");
        CLS34.MTH1072(this, 4, ʾᵢ0, "getLatLng");
        CLS34.MTH1072(this, 5, ʾᵢ0, "b.settingsui.onactivityresult,b.launcherui.onactivityresult,b.mmactivity.onactivityresult,b.chattingui.onactivityresult,b.fragmentactivity.onactivityresult");
        CLS34.MTH1072(this, 6, ʾᵢ0, "before_setUnreadClass_SetContactTabUnread");
        CLS34.MTH1072(this, 7, ʾᵢ0, "onDealQBarString");
        CLS34.MTH1072(this, 8, ʾᵢ0, "on_msgClass_MsgInfoIsShowTimeMethod2");
        CLS34.MTH1072(this, 9, ʾᵢ0, "on_msgClass_MsgInfoIsShowTimeMethod3");
        CLS34.MTH1072(this, 10, ʾᵢ0, "a.ChattingDataAdapterV3_onBindView");
        CLS34.MTH1072(this, 12, ʾᵢ0, "after_msgClass_MsgInfoIsShowTimeMethod3");
        CLS34.MTH1072(this, 13, ʾᵢ0, "after_msgClass_MsgInfoIsShowTimeMethod2");
        CLS34.MTH1072(this, 14, ʾᵢ0, "on_multi_process_mmkv_getint");
        CLS34.MTH1072(this, 15, ʾᵢ0, "on_PluginHelper_startWebview");
        CLS34.MTH1072(this, 16, ʾᵢ0, "on_PluginHelper_startWebview2");
        ʾᵢ0.MTH828(CLS34.MTH1060(5, ʾᵢ0, "on_NewVoipMgrCls2_callback", 0x38EC70222B3CD335L), ((CLS35)new CLS678(6)));
        CLS21 ʾᵢ1 = CLS21.FLD76;
        CLS34.MTH1070(this, 5, ʾᵢ1, "sight_hook_2");
        CLS34.MTH1070(this, 6, ʾᵢ1, "sight_hook_3");
        CLS34.MTH1070(this, 7, ʾᵢ1, "sight_hook_4");
        CLS34.MTH1070(this, 19, ʾᵢ1, "on_exdevicerankinfoui_oncreate");
        CLS34.MTH1070(this, 2, ʾᵢ1, "on_selectconversationui_maxlimit");
        CLS34.MTH1070(this, 20, ʾᵢ1, "on_gps_update");
        CLS34.MTH1070(this, 16, ʾᵢ1, "on_videocall_ringtone");
        CLS34.MTH1070(this, 17, ʾᵢ1, "b.on_MMActivity_onCreate");
        ʾᵢ1.MTH828("on_step_modifier", ((CLS35)new CLS861(this, 18)));
        CLS832 ᵢʼ0 = new CLS832(this, 0);
        ʾᵢ1.MTH828("on_MallIndexUI_fakeAmountMethod1", ((CLS35)new CLS634(this, ᵢʼ0, 0)));
        ʾᵢ1.MTH828("on_WalletBalanceManagerUI_fakeAmountMethod2", ((CLS35)new CLS634(this, ᵢʼ0, 1)));
        CLS34.MTH1070(this, 12, ʾᵢ1, "on_MallWalletUI_fakeAmountMethod3");
        CLS34.MTH1070(this, 13, ʾᵢ1, "on_WcPayMoneyLoadingView_setMoney");
        CLS34.MTH1070(this, 14, ʾᵢ1, "on_MallWalletSectionCellView");
        CLS34.MTH1070(this, 15, ʾᵢ1, "on_RemittanceDetailUI_onSceneEnd");
        CLS34.MTH1070(this, 9, ʾᵢ1, "on_dice");
        CLS34.MTH1072(this, 24, ʾᵢ1, CLS34.MTH1060(14, ʾᵢ1, CLS34.MTH1060(13, ʾᵢ1, CLS34.MTH1060(12, ʾᵢ1, CLS34.MTH1060(11, ʾᵢ1, CLS34.MTH1060(10, ʾᵢ1, CLS34.MTH1060(9, ʾᵢ1, CLS34.MTH1060(8, ʾᵢ1, CLS34.MTH1060(7, ʾᵢ1, "emoji_max_1", 4101790688637408053L), 4101790740177015605L), 0x38EC7CFE2B3CD335L), 4101790293500416821L), 4101790345040024373L), 4101790396579631925L), 4101790512543748917L), 4101792479638770485L));
        CLS34.MTH1072(this, 25, ʾᵢ1, "b.conversation.menu.oncreate");
        CLS34.MTH1072(this, 26, ʾᵢ1, "b.conversation.menu.oncreate");
        CLS34.MTH1072(this, 27, ʾᵢ1, "b.conversation.menu.oncreate");
        CLS34.MTH1072(this, 28, ʾᵢ1, "b.conversation.menu.oncreate");
        CLS34.MTH1072(this, 29, ʾᵢ1, "b.conversation.menu.oncreate");
        CLS34.MTH1070(this, 0, ʾᵢ1, "b.conversation.menu.oncreate");
        CLS34.MTH1070(this, 1, ʾᵢ1, "b.conversation.menu.oncreate");
        ʾᵢ1.MTH828("b.StoryGalleryView.dispatchTouchEvent", ((CLS35)new CLS805(this)));
        CLS34.MTH1070(this, 10, ʾᵢ1, "a.msgitem");
        CLS34.MTH1070(this, 11, ʾᵢ1, "b.sendPat.isSendPatEnabled");
        CLS34.MTH1070(this, 4, ʾᵢ1, "chat.menu.config");
        CLS34.MTH1075(this, 9, ʾᵢ1, "chat.menu.options");
        CLS34.MTH1075(this, 10, ʾᵢ1, "chat.menu.options");
        CLS34.MTH1075(this, 11, ʾᵢ1, "chat.menu.options");
        CLS34.MTH1075(this, 12, ʾᵢ1, "chat.menu.options");
        CLS34.MTH1075(this, 13, ʾᵢ1, "chat.menu.options");
        CLS34.MTH1075(this, 14, ʾᵢ1, CLS34.MTH1068(6, ʾᵢ1, "chat.menu.options", 4101792080206811957L));
        CLS34.MTH1075(this, 15, ʾᵢ1, "chattingui.optionsmenu.options");
        CLS34.MTH1075(this, 16, ʾᵢ1, "chattingui.optionsmenu.options");
        CLS34.MTH1075(this, 17, ʾᵢ1, "chattingui.optionsmenu.options");
        CLS34.MTH1075(this, 18, ʾᵢ1, "chattingui.optionsmenu.options");
        CLS34.MTH1075(this, 19, ʾᵢ1, "chattingui.optionsmenu.options");
        CLS34.MTH1075(this, 20, ʾᵢ1, "chattingui.optionsmenu.options");
        CLS34.MTH1070(this, 8, ʾᵢ1, CLS34.MTH1068(7, ʾᵢ1, "chattingui.optionsmenu.options", 0x38EC718F2B3CD335L));
        CLS34.MTH1075(this, 1, ʾᵢ1, "plus.options");
        CLS34.MTH1075(this, 2, ʾᵢ1, "plus.options");
        CLS34.MTH1075(this, 3, ʾᵢ1, "plus.options");
        CLS34.MTH1075(this, 4, ʾᵢ1, "plus.options");
        CLS34.MTH1075(this, 5, ʾᵢ1, "plus.options");
        CLS34.MTH1075(this, 6, ʾᵢ1, "plus.options");
        CLS34.MTH1075(this, 7, ʾᵢ1, "plus.options");
        CLS34.MTH1075(this, 8, ʾᵢ1, "plus.options");
        CLS34.MTH1070(this, 3, ʾᵢ1, "plus.config");
        ʾᵢ1.MTH828("b.sqldb.insert", ((CLS35)new CLS678(15)));
    }

    // 此方法包含解密的字符串
    public static void MTH2588(TextView textView0, int v, Object object0) {
        if(v != 1 && (CLS27.MTH895().MTH938("show_realname_label_enable", false) && CLS500.FLD4928.MTH6895("show_realname") || CLS27.MTH895().MTH938("show_chatroom_mod_label", false))) {
            String s = (String)CLS166.MTH3194(object0, "field_talker");
            if(!CLS426.MTH6126(s)) {
                return;
            }
            String s1 = CLS426.MTH6109(((String)CLS166.MTH3194(object0, "field_content")));
            if(TextUtils.isEmpty(s1)) {
                return;
            }
            String s2 = CLS426.MTH6116(s, s1);
            if(TextUtils.isEmpty(s2)) {
                return;
            }
            textView0.setText(CLS426.MTH6110(s2, s, s1));
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2589(TextView textView0, int v, long v1) {
        CLS29 ˎᵢ0 = this.FLD1445;
        if(ˎᵢ0.MTH938("chat_always_show_time", false)) {
            textView0.setVisibility(0);
        }
        if(textView0.getVisibility() != 0) {
            return;
        }
        ViewParent viewParent0 = textView0.getParent();
        if(!ˎᵢ0.MTH938("show_time_centered", false) && !CLS21.FLD76.MTH830("isThemeEnable", new Object[]{"setChatTimeTVCentered"})) {
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            if(v == 1) {
                relativeLayout$LayoutParams0.addRule(21, textView0.getId());
                relativeLayout$LayoutParams0.addRule(11, textView0.getId());
                relativeLayout$LayoutParams0.setMargins(0, CLS523.MTH7137(5), CLS523.MTH7137(10), 0);
            }
            else {
                relativeLayout$LayoutParams0.addRule(10, textView0.getId());
                relativeLayout$LayoutParams0.addRule(9, textView0.getId());
                relativeLayout$LayoutParams0.setMargins(CLS523.MTH7137(10), CLS523.MTH7137(5), 0, 0);
            }
            ((ViewGroup)viewParent0).updateViewLayout(textView0, relativeLayout$LayoutParams0);
        }
        if(ˎᵢ0.MTH938("show_time_detailed", false) || CLS21.FLD76.MTH830("isThemeEnable", new Object[]{"showChatTimeTVDetailed"})) {
            String s = "yyyy-MM-dd HH:mm:ss";
            CLS21 ʾᵢ0 = CLS21.FLD76;
            if(ʾᵢ0.MTH830("isThemeEnable", new Object[]{"showChatTimeTVDetailed"})) {
                String s1 = ʾᵢ0.MTH826("getThemeString", new Object[]{"ChatTimeTVDetailedPattern"});
                if(!TextUtils.isEmpty(s1)) {
                    s = s1;
                }
            }
            else if(ˎᵢ0.MTH938("show_time_detailed", false)) {
                s = ˎᵢ0.MTH925("show_time_detailed_pattern", "yyyy-MM-dd HH:mm:ss");
            }
            textView0.setText(new SimpleDateFormat(s).format(new Date(v1)));
        }
        if(v == 1) {
            CLS21 ʾᵢ1 = CLS21.FLD76;
            if(ʾᵢ1.MTH830("isThemeEnable", new Object[]{"RightChatTimeTVTextColorEnable"})) {
                String s2 = ʾᵢ1.MTH826("getThemeString", new Object[]{"RightChatTimeTVTextColor"});
                if(!TextUtils.isEmpty(s2)) {
                    textView0.setTextColor(CLS522.MTH7110(s2));
                }
            }
            if(ʾᵢ1.MTH830("isThemeEnable", new Object[]{"RightChatTimeTVBackgroundColorEnable"})) {
                String s3 = ʾᵢ1.MTH826("getThemeString", new Object[]{"RightChatTimeTVBackgroundColor"});
                if(!TextUtils.isEmpty(s3)) {
                    CLS523.MTH7152(textView0, new ColorDrawable(CLS522.MTH7110(s3)));
                }
            }
        }
        else {
            CLS21 ʾᵢ2 = CLS21.FLD76;
            if(ʾᵢ2.MTH830("isThemeEnable", new Object[]{"LeftChatTimeTVTextColorEnable"})) {
                String s4 = ʾᵢ2.MTH826("getThemeString", new Object[]{"LeftChatTimeTVTextColor"});
                if(!TextUtils.isEmpty(s4)) {
                    textView0.setTextColor(CLS522.MTH7110(s4));
                }
            }
            if(ʾᵢ2.MTH830("isThemeEnable", new Object[]{"LeftChatTimeTVBackgroundColorEnable"})) {
                String s5 = ʾᵢ2.MTH826("getThemeString", new Object[]{"LeftChatTimeTVBackgroundColor"});
                if(!TextUtils.isEmpty(s5)) {
                    CLS523.MTH7152(textView0, new ColorDrawable(CLS522.MTH7110(s5)));
                }
            }
        }
    }
}

