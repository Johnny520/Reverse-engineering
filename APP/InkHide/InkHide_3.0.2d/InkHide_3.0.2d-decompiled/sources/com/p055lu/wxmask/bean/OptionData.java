package com.p055lu.wxmask.bean;

import org.json.JSONException;
import org.json.JSONObject;
import p006D.AbstractC0079h;
import p027N0.AbstractC0221e;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;

/* JADX INFO: loaded from: classes.dex */
public final class OptionData {
    public static final Companion Companion = new Companion(null);
    private boolean antiRevokeMessage;
    private int chatHistoryQuickUnhideClickCount;
    private int chatHistoryQuickUnhideDurationMs;
    private boolean closeFriendQuickDisplay;
    private boolean customLocalFriendAvatar;
    private boolean disableSelfSnsLongPressHidePrompt;
    private boolean disableWechatHotUpdate;
    private boolean enableChattingKey;
    private boolean enableSearchCommand;
    private boolean hiddenMessageVibrate;
    private int hiddenMessageVibrateMode;
    private boolean hideChatHistory;
    private boolean hideCloseFriend;
    private boolean hideContactFriend;
    private boolean hideConversationUnreadBadge;
    private boolean hideMainSearch;
    private boolean hideMainSearchStrong;
    private boolean hideSelfSnsPosts;
    private boolean hideSingleSearch;
    private boolean hideSnsCloseFriendPosts;
    private boolean hideSnsGroupIcon;
    private boolean hideSnsLike;
    private boolean hideStorageChatHistory;
    private boolean hideTextStatusFriend;
    private boolean hideTopBarUnreadBold;
    private boolean hideVoipCall;
    private boolean quickAddMaskList;
    private String quickAddMenuTitle;
    private int quickDisplayClickCount;
    private int quickDisplayLongPressMs;
    private String readTraceCommandPrefix;
    private boolean readTraceMessage;
    private String readTraceServerUrl;
    private String searchCommandText;
    private String searchListCommandText;
    private boolean shakeHideTemporary;
    private String tripleTapPassword;
    private boolean useFullscreenConfigUi;
    private boolean viewWxDbPw;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.lu.wxmask.bean.OptionData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0221e abstractC0221e) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final OptionData fromJson(String str) {
            JSONObject jSONObject;
            AbstractC0223g.m418e(str, "jsonText");
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            boolean zOptBoolean = jSONObject.optBoolean("hideMainSearch", false);
            boolean zOptBoolean2 = jSONObject.optBoolean("hideSingleSearch", false);
            boolean zOptBoolean3 = jSONObject.optBoolean("hideMainSearchStrong", false);
            boolean zOptBoolean4 = jSONObject.optBoolean("hideCloseFriend", true);
            boolean zOptBoolean5 = jSONObject.optBoolean("hideChatHistory", false);
            int iM183g = AbstractC0079h.m183g(jSONObject.optInt("chatHistoryQuickUnhideClickCount", 3), 2, 8);
            int iM183g2 = AbstractC0079h.m183g(jSONObject.optInt("chatHistoryQuickUnhideDurationMs", 1500), 300, 5000);
            boolean zOptBoolean6 = jSONObject.optBoolean("hideStorageChatHistory", false);
            boolean zOptBoolean7 = jSONObject.optBoolean("hideTextStatusFriend", false);
            boolean zOptBoolean8 = jSONObject.optBoolean("hideConversationUnreadBadge", false);
            boolean zOptBoolean9 = jSONObject.optBoolean("hideContactFriend", false);
            boolean zOptBoolean10 = jSONObject.optBoolean("hideTopBarUnreadBold", false);
            boolean zOptBoolean11 = jSONObject.optBoolean("hiddenMessageVibrate", false);
            int iM183g3 = AbstractC0079h.m183g(jSONObject.optInt("hiddenMessageVibrateMode", 1), 0, 3);
            boolean zOptBoolean12 = jSONObject.optBoolean("closeFriendQuickDisplay", true);
            boolean zOptBoolean13 = jSONObject.optBoolean("shakeHideTemporary", true);
            boolean zOptBoolean14 = jSONObject.optBoolean("enableSearchCommand", true);
            String strOptString = jSONObject.optString("searchCommandText", "#hide");
            String str2 = AbstractC0307q.m534d0(strOptString) ? "#hide" : strOptString;
            String strOptString2 = jSONObject.optString("searchListCommandText", "#list");
            String str3 = AbstractC0307q.m534d0(strOptString2) ? "#list" : strOptString2;
            int iM183g4 = AbstractC0079h.m183g(jSONObject.optInt("quickDisplayClickCount", 3), 2, 8);
            int iM183g5 = AbstractC0079h.m183g(jSONObject.optInt("quickDisplayLongPressMs", 500), 200, 3000);
            boolean zOptBoolean15 = jSONObject.optBoolean("quickAddMaskList", true);
            String strOptString3 = jSONObject.optString("quickAddMenuTitle", "加入名单");
            AbstractC0223g.m417d(strOptString3, "optString(...)");
            boolean zOptBoolean16 = jSONObject.optBoolean("hideSnsLike", false);
            boolean zOptBoolean17 = jSONObject.optBoolean("hideSnsGroupIcon", false);
            boolean zOptBoolean18 = jSONObject.optBoolean("hideSnsCloseFriendPosts", false);
            boolean zOptBoolean19 = jSONObject.optBoolean("hideSelfSnsPosts", false);
            boolean zOptBoolean20 = jSONObject.optBoolean("disableSelfSnsLongPressHidePrompt", false);
            boolean zOptBoolean21 = jSONObject.optBoolean("antiRevokeMessage", true);
            boolean zOptBoolean22 = jSONObject.optBoolean("readTraceMessage", false);
            String strOptString4 = jSONObject.optString("readTraceCommandPrefix", "#read");
            String str4 = AbstractC0307q.m534d0(strOptString4) ? "#read" : strOptString4;
            String strOptString5 = jSONObject.optString("readTraceServerUrl", "https://read.spint.kdns.fr");
            String str5 = AbstractC0307q.m534d0(strOptString5) ? "https://read.spint.kdns.fr" : strOptString5;
            boolean zOptBoolean23 = jSONObject.optBoolean("disableWechatHotUpdate", false);
            boolean zOptBoolean24 = jSONObject.optBoolean("customLocalFriendAvatar", false);
            boolean zOptBoolean25 = jSONObject.optBoolean("useFullscreenConfigUi", false);
            String strOptString6 = jSONObject.optString("tripleTapPassword", "");
            AbstractC0223g.m417d(strOptString6, "optString(...)");
            return new OptionData(zOptBoolean, zOptBoolean2, zOptBoolean3, zOptBoolean4, zOptBoolean5, iM183g, iM183g2, zOptBoolean6, zOptBoolean7, zOptBoolean8, zOptBoolean9, zOptBoolean10, zOptBoolean11, iM183g3, zOptBoolean12, zOptBoolean13, zOptBoolean14, str2, str3, iM183g4, iM183g5, zOptBoolean15, strOptString3, zOptBoolean16, zOptBoolean17, zOptBoolean18, zOptBoolean19, zOptBoolean20, zOptBoolean21, zOptBoolean22, str4, str5, zOptBoolean23, zOptBoolean24, zOptBoolean25, strOptString6, jSONObject.optBoolean("viewWxDbPw", false), jSONObject.optBoolean("enableChattingKey", true), jSONObject.optBoolean("hideVoipCall", false), null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String toJson(OptionData optionData) throws JSONException {
            AbstractC0223g.m418e(optionData, "data");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("hideMainSearch", optionData.getHideMainSearch());
            jSONObject.put("hideSingleSearch", optionData.getHideSingleSearch());
            jSONObject.put("hideMainSearchStrong", optionData.getHideMainSearchStrong());
            jSONObject.put("hideCloseFriend", optionData.getHideCloseFriend());
            jSONObject.put("hideChatHistory", optionData.getHideChatHistory());
            jSONObject.put("chatHistoryQuickUnhideClickCount", AbstractC0079h.m183g(optionData.getChatHistoryQuickUnhideClickCount(), 2, 8));
            jSONObject.put("chatHistoryQuickUnhideDurationMs", AbstractC0079h.m183g(optionData.getChatHistoryQuickUnhideDurationMs(), 300, 5000));
            jSONObject.put("hideStorageChatHistory", optionData.getHideStorageChatHistory());
            jSONObject.put("hideTextStatusFriend", optionData.getHideTextStatusFriend());
            jSONObject.put("hideConversationUnreadBadge", optionData.getHideConversationUnreadBadge());
            jSONObject.put("hideContactFriend", optionData.getHideContactFriend());
            jSONObject.put("hideTopBarUnreadBold", optionData.getHideTopBarUnreadBold());
            jSONObject.put("hiddenMessageVibrate", optionData.getHiddenMessageVibrate());
            jSONObject.put("hiddenMessageVibrateMode", AbstractC0079h.m183g(optionData.getHiddenMessageVibrateMode(), 0, 3));
            jSONObject.put("closeFriendQuickDisplay", optionData.getCloseFriendQuickDisplay());
            jSONObject.put("shakeHideTemporary", optionData.getShakeHideTemporary());
            jSONObject.put("enableSearchCommand", optionData.getEnableSearchCommand());
            String searchCommandText = optionData.getSearchCommandText();
            if (AbstractC0307q.m534d0(searchCommandText)) {
                searchCommandText = "#hide";
            }
            jSONObject.put("searchCommandText", searchCommandText);
            String searchListCommandText = optionData.getSearchListCommandText();
            if (AbstractC0307q.m534d0(searchListCommandText)) {
                searchListCommandText = "#list";
            }
            jSONObject.put("searchListCommandText", searchListCommandText);
            jSONObject.put("quickDisplayClickCount", AbstractC0079h.m183g(optionData.getQuickDisplayClickCount(), 2, 8));
            jSONObject.put("quickDisplayLongPressMs", AbstractC0079h.m183g(optionData.getQuickDisplayLongPressMs(), 200, 3000));
            jSONObject.put("quickAddMaskList", optionData.getQuickAddMaskList());
            jSONObject.put("quickAddMenuTitle", optionData.getQuickAddMenuTitle());
            jSONObject.put("hideSnsLike", optionData.getHideSnsLike());
            jSONObject.put("hideSnsGroupIcon", optionData.getHideSnsGroupIcon());
            jSONObject.put("hideSnsCloseFriendPosts", optionData.getHideSnsCloseFriendPosts());
            jSONObject.put("hideSelfSnsPosts", optionData.getHideSelfSnsPosts());
            jSONObject.put("disableSelfSnsLongPressHidePrompt", optionData.getDisableSelfSnsLongPressHidePrompt());
            jSONObject.put("antiRevokeMessage", optionData.getAntiRevokeMessage());
            jSONObject.put("readTraceMessage", optionData.getReadTraceMessage());
            String readTraceCommandPrefix = optionData.getReadTraceCommandPrefix();
            if (AbstractC0307q.m534d0(readTraceCommandPrefix)) {
                readTraceCommandPrefix = "#read";
            }
            jSONObject.put("readTraceCommandPrefix", readTraceCommandPrefix);
            String readTraceServerUrl = optionData.getReadTraceServerUrl();
            if (AbstractC0307q.m534d0(readTraceServerUrl)) {
                readTraceServerUrl = "https://read.spint.kdns.fr";
            }
            jSONObject.put("readTraceServerUrl", readTraceServerUrl);
            jSONObject.put("disableWechatHotUpdate", optionData.getDisableWechatHotUpdate());
            jSONObject.put("customLocalFriendAvatar", optionData.getCustomLocalFriendAvatar());
            jSONObject.put("useFullscreenConfigUi", optionData.getUseFullscreenConfigUi());
            jSONObject.put("tripleTapPassword", optionData.getTripleTapPassword());
            jSONObject.put("viewWxDbPw", optionData.getViewWxDbPw());
            jSONObject.put("enableChattingKey", optionData.getEnableChattingKey());
            jSONObject.put("hideVoipCall", optionData.getHideVoipCall());
            String string = jSONObject.toString();
            AbstractC0223g.m417d(string, "toString(...)");
            return string;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 boolean)
  (r2v0 boolean)
  (r3v0 boolean)
  (r4v0 boolean)
  (r5v0 boolean)
  (r6v0 int)
  (r7v0 int)
  (r8v0 boolean)
  (r9v0 boolean)
  (r10v0 boolean)
  (r11v0 boolean)
  (r12v0 boolean)
  (r13v0 boolean)
  (r14v0 int)
  (r15v0 boolean)
  (r16v0 boolean)
  (r17v0 boolean)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 int)
  (r21v0 int)
  (r22v0 boolean)
  (r23v0 java.lang.String)
  (r24v0 boolean)
  (r25v0 boolean)
  (r26v0 boolean)
  (r27v0 boolean)
  (r28v0 boolean)
  (r29v0 boolean)
  (r30v0 boolean)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 boolean)
  (r34v0 boolean)
  (r35v0 boolean)
  (r36v0 java.lang.String)
  (r37v0 boolean)
  (r38v0 boolean)
  (r39v0 boolean)
 A[MD:(boolean, boolean, boolean, boolean, boolean, int, int, boolean, boolean, boolean, boolean, boolean, boolean, int, boolean, boolean, boolean, java.lang.String, java.lang.String, int, int, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean, boolean, boolean):void (m)] (LINE:1) call: com.lu.wxmask.bean.OptionData.<init>(boolean, boolean, boolean, boolean, boolean, int, int, boolean, boolean, boolean, boolean, boolean, boolean, int, boolean, boolean, boolean, java.lang.String, java.lang.String, int, int, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean, boolean, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ OptionData(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, int i3, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i4, boolean z13, boolean z14, boolean z15, String str, String str2, int i5, int i6, boolean z16, String str3, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, String str4, String str5, boolean z24, boolean z25, boolean z26, String str6, boolean z27, boolean z28, boolean z29, AbstractC0221e abstractC0221e) {
        this(z2, z3, z4, z5, z6, i2, i3, z7, z8, z9, z10, z11, z12, i4, z13, z14, z15, str, str2, i5, i6, z16, str3, z17, z18, z19, z20, z21, z22, z23, str4, str5, z24, z25, z26, str6, z27, z28, z29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getAntiRevokeMessage() {
        return this.antiRevokeMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getChatHistoryQuickUnhideClickCount() {
        return this.chatHistoryQuickUnhideClickCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getChatHistoryQuickUnhideDurationMs() {
        return this.chatHistoryQuickUnhideDurationMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getCloseFriendQuickDisplay() {
        return this.closeFriendQuickDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getCustomLocalFriendAvatar() {
        return this.customLocalFriendAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getDisableSelfSnsLongPressHidePrompt() {
        return this.disableSelfSnsLongPressHidePrompt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getDisableWechatHotUpdate() {
        return this.disableWechatHotUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getEnableChattingKey() {
        return this.enableChattingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getEnableSearchCommand() {
        return this.enableSearchCommand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHiddenMessageVibrate() {
        return this.hiddenMessageVibrate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getHiddenMessageVibrateMode() {
        return this.hiddenMessageVibrateMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideChatHistory() {
        return this.hideChatHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideCloseFriend() {
        return this.hideCloseFriend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideContactFriend() {
        return this.hideContactFriend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideConversationUnreadBadge() {
        return this.hideConversationUnreadBadge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideMainSearch() {
        return this.hideMainSearch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideMainSearchStrong() {
        return this.hideMainSearchStrong;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideSelfSnsPosts() {
        return this.hideSelfSnsPosts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideSingleSearch() {
        return this.hideSingleSearch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideSnsCloseFriendPosts() {
        return this.hideSnsCloseFriendPosts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideSnsGroupIcon() {
        return this.hideSnsGroupIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideSnsLike() {
        return this.hideSnsLike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideStorageChatHistory() {
        return this.hideStorageChatHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideTextStatusFriend() {
        return this.hideTextStatusFriend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideTopBarUnreadBold() {
        return this.hideTopBarUnreadBold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHideVoipCall() {
        return this.hideVoipCall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getQuickAddMaskList() {
        return this.quickAddMaskList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getQuickAddMenuTitle() {
        return this.quickAddMenuTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getQuickDisplayClickCount() {
        return this.quickDisplayClickCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getQuickDisplayLongPressMs() {
        return this.quickDisplayLongPressMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getReadTraceCommandPrefix() {
        return this.readTraceCommandPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getReadTraceMessage() {
        return this.readTraceMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getReadTraceServerUrl() {
        return this.readTraceServerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSearchCommandText() {
        return this.searchCommandText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSearchListCommandText() {
        return this.searchListCommandText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getShakeHideTemporary() {
        return this.shakeHideTemporary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTripleTapPassword() {
        return this.tripleTapPassword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getUseFullscreenConfigUi() {
        return this.useFullscreenConfigUi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getViewWxDbPw() {
        return this.viewWxDbPw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isHideFriendEnabled() {
        return this.hideCloseFriend || this.hideContactFriend || this.hideVoipCall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setAntiRevokeMessage(boolean z2) {
        this.antiRevokeMessage = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setChatHistoryQuickUnhideClickCount(int i2) {
        this.chatHistoryQuickUnhideClickCount = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setChatHistoryQuickUnhideDurationMs(int i2) {
        this.chatHistoryQuickUnhideDurationMs = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setCloseFriendQuickDisplay(boolean z2) {
        this.closeFriendQuickDisplay = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setCustomLocalFriendAvatar(boolean z2) {
        this.customLocalFriendAvatar = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setDisableSelfSnsLongPressHidePrompt(boolean z2) {
        this.disableSelfSnsLongPressHidePrompt = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setDisableWechatHotUpdate(boolean z2) {
        this.disableWechatHotUpdate = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setEnableChattingKey(boolean z2) {
        this.enableChattingKey = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setEnableSearchCommand(boolean z2) {
        this.enableSearchCommand = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHiddenMessageVibrate(boolean z2) {
        this.hiddenMessageVibrate = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHiddenMessageVibrateMode(int i2) {
        this.hiddenMessageVibrateMode = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideChatHistory(boolean z2) {
        this.hideChatHistory = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideCloseFriend(boolean z2) {
        this.hideCloseFriend = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideContactFriend(boolean z2) {
        this.hideContactFriend = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideConversationUnreadBadge(boolean z2) {
        this.hideConversationUnreadBadge = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideMainSearch(boolean z2) {
        this.hideMainSearch = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideMainSearchStrong(boolean z2) {
        this.hideMainSearchStrong = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideSelfSnsPosts(boolean z2) {
        this.hideSelfSnsPosts = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideSingleSearch(boolean z2) {
        this.hideSingleSearch = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideSnsCloseFriendPosts(boolean z2) {
        this.hideSnsCloseFriendPosts = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideSnsGroupIcon(boolean z2) {
        this.hideSnsGroupIcon = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideSnsLike(boolean z2) {
        this.hideSnsLike = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideStorageChatHistory(boolean z2) {
        this.hideStorageChatHistory = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideTextStatusFriend(boolean z2) {
        this.hideTextStatusFriend = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideTopBarUnreadBold(boolean z2) {
        this.hideTopBarUnreadBold = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHideVoipCall(boolean z2) {
        this.hideVoipCall = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setQuickAddMaskList(boolean z2) {
        this.quickAddMaskList = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setQuickAddMenuTitle(String str) {
        AbstractC0223g.m418e(str, "<set-?>");
        this.quickAddMenuTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setQuickDisplayClickCount(int i2) {
        this.quickDisplayClickCount = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setQuickDisplayLongPressMs(int i2) {
        this.quickDisplayLongPressMs = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setReadTraceCommandPrefix(String str) {
        AbstractC0223g.m418e(str, "<set-?>");
        this.readTraceCommandPrefix = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setReadTraceMessage(boolean z2) {
        this.readTraceMessage = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setReadTraceServerUrl(String str) {
        AbstractC0223g.m418e(str, "<set-?>");
        this.readTraceServerUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSearchCommandText(String str) {
        AbstractC0223g.m418e(str, "<set-?>");
        this.searchCommandText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSearchListCommandText(String str) {
        AbstractC0223g.m418e(str, "<set-?>");
        this.searchListCommandText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setShakeHideTemporary(boolean z2) {
        this.shakeHideTemporary = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setTripleTapPassword(String str) {
        AbstractC0223g.m418e(str, "<set-?>");
        this.tripleTapPassword = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUseFullscreenConfigUi(boolean z2) {
        this.useFullscreenConfigUi = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setViewWxDbPw(boolean z2) {
        this.viewWxDbPw = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private OptionData(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, int i3, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i4, boolean z13, boolean z14, boolean z15, String str, String str2, int i5, int i6, boolean z16, String str3, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, String str4, String str5, boolean z24, boolean z25, boolean z26, String str6, boolean z27, boolean z28, boolean z29) {
        this.hideMainSearch = z2;
        this.hideSingleSearch = z3;
        this.hideMainSearchStrong = z4;
        this.hideCloseFriend = z5;
        this.hideChatHistory = z6;
        this.chatHistoryQuickUnhideClickCount = i2;
        this.chatHistoryQuickUnhideDurationMs = i3;
        this.hideStorageChatHistory = z7;
        this.hideTextStatusFriend = z8;
        this.hideConversationUnreadBadge = z9;
        this.hideContactFriend = z10;
        this.hideTopBarUnreadBold = z11;
        this.hiddenMessageVibrate = z12;
        this.hiddenMessageVibrateMode = i4;
        this.closeFriendQuickDisplay = z13;
        this.shakeHideTemporary = z14;
        this.enableSearchCommand = z15;
        this.searchCommandText = str;
        this.searchListCommandText = str2;
        this.quickDisplayClickCount = i5;
        this.quickDisplayLongPressMs = i6;
        this.quickAddMaskList = z16;
        this.quickAddMenuTitle = str3;
        this.hideSnsLike = z17;
        this.hideSnsGroupIcon = z18;
        this.hideSnsCloseFriendPosts = z19;
        this.hideSelfSnsPosts = z20;
        this.disableSelfSnsLongPressHidePrompt = z21;
        this.antiRevokeMessage = z22;
        this.readTraceMessage = z23;
        this.readTraceCommandPrefix = str4;
        this.readTraceServerUrl = str5;
        this.disableWechatHotUpdate = z24;
        this.customLocalFriendAvatar = z25;
        this.useFullscreenConfigUi = z26;
        this.tripleTapPassword = str6;
        this.viewWxDbPw = z27;
        this.enableChattingKey = z28;
        this.hideVoipCall = z29;
    }
}
