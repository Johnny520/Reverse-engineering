.class public final Lcom/lu/wxmask/bean/OptionData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lu/wxmask/bean/OptionData$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/lu/wxmask/bean/OptionData$Companion;


# instance fields
.field private antiRevokeMessage:Z

.field private chatHistoryQuickUnhideClickCount:I

.field private chatHistoryQuickUnhideDurationMs:I

.field private closeFriendQuickDisplay:Z

.field private customLocalFriendAvatar:Z

.field private disableSelfSnsLongPressHidePrompt:Z

.field private disableWechatHotUpdate:Z

.field private enableChattingKey:Z

.field private enableSearchCommand:Z

.field private hiddenMessageVibrate:Z

.field private hiddenMessageVibrateMode:I

.field private hideChatHistory:Z

.field private hideCloseFriend:Z

.field private hideContactFriend:Z

.field private hideConversationUnreadBadge:Z

.field private hideMainSearch:Z

.field private hideMainSearchStrong:Z

.field private hideSelfSnsPosts:Z

.field private hideSingleSearch:Z

.field private hideSnsCloseFriendPosts:Z

.field private hideSnsGroupIcon:Z

.field private hideSnsLike:Z

.field private hideStorageChatHistory:Z

.field private hideTextStatusFriend:Z

.field private hideTopBarUnreadBold:Z

.field private hideVoipCall:Z

.field private quickAddMaskList:Z

.field private quickAddMenuTitle:Ljava/lang/String;

.field private quickDisplayClickCount:I

.field private quickDisplayLongPressMs:I

.field private readTraceCommandPrefix:Ljava/lang/String;

.field private readTraceMessage:Z

.field private readTraceServerUrl:Ljava/lang/String;

.field private searchCommandText:Ljava/lang/String;

.field private searchListCommandText:Ljava/lang/String;

.field private shakeHideTemporary:Z

.field private tripleTapPassword:Ljava/lang/String;

.field private useFullscreenConfigUi:Z

.field private viewWxDbPw:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/lu/wxmask/bean/OptionData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/lu/wxmask/bean/OptionData$Companion;-><init>(LN0/e;)V

    sput-object v0, Lcom/lu/wxmask/bean/OptionData;->Companion:Lcom/lu/wxmask/bean/OptionData$Companion;

    return-void
.end method

.method private constructor <init>(ZZZZZIIZZZZZZIZZZLjava/lang/String;Ljava/lang/String;IIZLjava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideMainSearch:Z

    .line 4
    iput-boolean p2, p0, Lcom/lu/wxmask/bean/OptionData;->hideSingleSearch:Z

    .line 5
    iput-boolean p3, p0, Lcom/lu/wxmask/bean/OptionData;->hideMainSearchStrong:Z

    .line 6
    iput-boolean p4, p0, Lcom/lu/wxmask/bean/OptionData;->hideCloseFriend:Z

    .line 7
    iput-boolean p5, p0, Lcom/lu/wxmask/bean/OptionData;->hideChatHistory:Z

    .line 8
    iput p6, p0, Lcom/lu/wxmask/bean/OptionData;->chatHistoryQuickUnhideClickCount:I

    .line 9
    iput p7, p0, Lcom/lu/wxmask/bean/OptionData;->chatHistoryQuickUnhideDurationMs:I

    .line 10
    iput-boolean p8, p0, Lcom/lu/wxmask/bean/OptionData;->hideStorageChatHistory:Z

    .line 11
    iput-boolean p9, p0, Lcom/lu/wxmask/bean/OptionData;->hideTextStatusFriend:Z

    .line 12
    iput-boolean p10, p0, Lcom/lu/wxmask/bean/OptionData;->hideConversationUnreadBadge:Z

    .line 13
    iput-boolean p11, p0, Lcom/lu/wxmask/bean/OptionData;->hideContactFriend:Z

    .line 14
    iput-boolean p12, p0, Lcom/lu/wxmask/bean/OptionData;->hideTopBarUnreadBold:Z

    .line 15
    iput-boolean p13, p0, Lcom/lu/wxmask/bean/OptionData;->hiddenMessageVibrate:Z

    .line 16
    iput p14, p0, Lcom/lu/wxmask/bean/OptionData;->hiddenMessageVibrateMode:I

    .line 17
    iput-boolean p15, p0, Lcom/lu/wxmask/bean/OptionData;->closeFriendQuickDisplay:Z

    move/from16 p1, p16

    .line 18
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->shakeHideTemporary:Z

    move/from16 p1, p17

    .line 19
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->enableSearchCommand:Z

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/lu/wxmask/bean/OptionData;->searchCommandText:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/lu/wxmask/bean/OptionData;->searchListCommandText:Ljava/lang/String;

    move/from16 p1, p20

    .line 22
    iput p1, p0, Lcom/lu/wxmask/bean/OptionData;->quickDisplayClickCount:I

    move/from16 p1, p21

    .line 23
    iput p1, p0, Lcom/lu/wxmask/bean/OptionData;->quickDisplayLongPressMs:I

    move/from16 p1, p22

    .line 24
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->quickAddMaskList:Z

    move-object/from16 p1, p23

    .line 25
    iput-object p1, p0, Lcom/lu/wxmask/bean/OptionData;->quickAddMenuTitle:Ljava/lang/String;

    move/from16 p1, p24

    .line 26
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideSnsLike:Z

    move/from16 p1, p25

    .line 27
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideSnsGroupIcon:Z

    move/from16 p1, p26

    .line 28
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideSnsCloseFriendPosts:Z

    move/from16 p1, p27

    .line 29
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideSelfSnsPosts:Z

    move/from16 p1, p28

    .line 30
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->disableSelfSnsLongPressHidePrompt:Z

    move/from16 p1, p29

    .line 31
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->antiRevokeMessage:Z

    move/from16 p1, p30

    .line 32
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->readTraceMessage:Z

    move-object/from16 p1, p31

    .line 33
    iput-object p1, p0, Lcom/lu/wxmask/bean/OptionData;->readTraceCommandPrefix:Ljava/lang/String;

    move-object/from16 p1, p32

    .line 34
    iput-object p1, p0, Lcom/lu/wxmask/bean/OptionData;->readTraceServerUrl:Ljava/lang/String;

    move/from16 p1, p33

    .line 35
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->disableWechatHotUpdate:Z

    move/from16 p1, p34

    .line 36
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->customLocalFriendAvatar:Z

    move/from16 p1, p35

    .line 37
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->useFullscreenConfigUi:Z

    move-object/from16 p1, p36

    .line 38
    iput-object p1, p0, Lcom/lu/wxmask/bean/OptionData;->tripleTapPassword:Ljava/lang/String;

    move/from16 p1, p37

    .line 39
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->viewWxDbPw:Z

    move/from16 p1, p38

    .line 40
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->enableChattingKey:Z

    move/from16 p1, p39

    .line 41
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideVoipCall:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZZZIIZZZZZZIZZZLjava/lang/String;Ljava/lang/String;IIZLjava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZZZLN0/e;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p39}, Lcom/lu/wxmask/bean/OptionData;-><init>(ZZZZZIIZZZZZZIZZZLjava/lang/String;Ljava/lang/String;IIZLjava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZZZ)V

    return-void
.end method


# virtual methods
.method public final getAntiRevokeMessage()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->antiRevokeMessage:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getChatHistoryQuickUnhideClickCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lu/wxmask/bean/OptionData;->chatHistoryQuickUnhideClickCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getChatHistoryQuickUnhideDurationMs()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lu/wxmask/bean/OptionData;->chatHistoryQuickUnhideDurationMs:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCloseFriendQuickDisplay()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->closeFriendQuickDisplay:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getCustomLocalFriendAvatar()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->customLocalFriendAvatar:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getDisableSelfSnsLongPressHidePrompt()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->disableSelfSnsLongPressHidePrompt:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getDisableWechatHotUpdate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->disableWechatHotUpdate:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getEnableChattingKey()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->enableChattingKey:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getEnableSearchCommand()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->enableSearchCommand:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHiddenMessageVibrate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hiddenMessageVibrate:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHiddenMessageVibrateMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lu/wxmask/bean/OptionData;->hiddenMessageVibrateMode:I

    .line 2
    .line 3
    return v0
.end method

.method public final getHideChatHistory()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideChatHistory:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHideCloseFriend()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideCloseFriend:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHideContactFriend()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideContactFriend:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHideConversationUnreadBadge()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideConversationUnreadBadge:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHideMainSearch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideMainSearch:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHideMainSearchStrong()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideMainSearchStrong:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHideSelfSnsPosts()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideSelfSnsPosts:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHideSingleSearch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideSingleSearch:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHideSnsCloseFriendPosts()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideSnsCloseFriendPosts:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHideSnsGroupIcon()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideSnsGroupIcon:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHideSnsLike()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideSnsLike:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHideStorageChatHistory()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideStorageChatHistory:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHideTextStatusFriend()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideTextStatusFriend:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHideTopBarUnreadBold()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideTopBarUnreadBold:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHideVoipCall()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideVoipCall:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getQuickAddMaskList()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->quickAddMaskList:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getQuickAddMenuTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/OptionData;->quickAddMenuTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getQuickDisplayClickCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lu/wxmask/bean/OptionData;->quickDisplayClickCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getQuickDisplayLongPressMs()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lu/wxmask/bean/OptionData;->quickDisplayLongPressMs:I

    .line 2
    .line 3
    return v0
.end method

.method public final getReadTraceCommandPrefix()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/OptionData;->readTraceCommandPrefix:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReadTraceMessage()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->readTraceMessage:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getReadTraceServerUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/OptionData;->readTraceServerUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSearchCommandText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/OptionData;->searchCommandText:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSearchListCommandText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/OptionData;->searchListCommandText:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getShakeHideTemporary()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->shakeHideTemporary:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getTripleTapPassword()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/OptionData;->tripleTapPassword:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUseFullscreenConfigUi()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->useFullscreenConfigUi:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getViewWxDbPw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->viewWxDbPw:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isHideFriendEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideCloseFriend:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideContactFriend:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/lu/wxmask/bean/OptionData;->hideVoipCall:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method public final setAntiRevokeMessage(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->antiRevokeMessage:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setChatHistoryQuickUnhideClickCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lu/wxmask/bean/OptionData;->chatHistoryQuickUnhideClickCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setChatHistoryQuickUnhideDurationMs(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lu/wxmask/bean/OptionData;->chatHistoryQuickUnhideDurationMs:I

    .line 2
    .line 3
    return-void
.end method

.method public final setCloseFriendQuickDisplay(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->closeFriendQuickDisplay:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setCustomLocalFriendAvatar(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->customLocalFriendAvatar:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setDisableSelfSnsLongPressHidePrompt(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->disableSelfSnsLongPressHidePrompt:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setDisableWechatHotUpdate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->disableWechatHotUpdate:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setEnableChattingKey(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->enableChattingKey:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setEnableSearchCommand(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->enableSearchCommand:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHiddenMessageVibrate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hiddenMessageVibrate:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHiddenMessageVibrateMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lu/wxmask/bean/OptionData;->hiddenMessageVibrateMode:I

    .line 2
    .line 3
    return-void
.end method

.method public final setHideChatHistory(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideChatHistory:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideCloseFriend(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideCloseFriend:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideContactFriend(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideContactFriend:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideConversationUnreadBadge(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideConversationUnreadBadge:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideMainSearch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideMainSearch:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideMainSearchStrong(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideMainSearchStrong:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideSelfSnsPosts(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideSelfSnsPosts:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideSingleSearch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideSingleSearch:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideSnsCloseFriendPosts(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideSnsCloseFriendPosts:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideSnsGroupIcon(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideSnsGroupIcon:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideSnsLike(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideSnsLike:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideStorageChatHistory(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideStorageChatHistory:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideTextStatusFriend(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideTextStatusFriend:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideTopBarUnreadBold(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideTopBarUnreadBold:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideVoipCall(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->hideVoipCall:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setQuickAddMaskList(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->quickAddMaskList:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setQuickAddMenuTitle(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/OptionData;->quickAddMenuTitle:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setQuickDisplayClickCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lu/wxmask/bean/OptionData;->quickDisplayClickCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setQuickDisplayLongPressMs(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lu/wxmask/bean/OptionData;->quickDisplayLongPressMs:I

    .line 2
    .line 3
    return-void
.end method

.method public final setReadTraceCommandPrefix(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/OptionData;->readTraceCommandPrefix:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setReadTraceMessage(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->readTraceMessage:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setReadTraceServerUrl(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/OptionData;->readTraceServerUrl:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setSearchCommandText(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/OptionData;->searchCommandText:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setSearchListCommandText(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/OptionData;->searchListCommandText:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setShakeHideTemporary(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->shakeHideTemporary:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setTripleTapPassword(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/OptionData;->tripleTapPassword:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setUseFullscreenConfigUi(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->useFullscreenConfigUi:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setViewWxDbPw(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/bean/OptionData;->viewWxDbPw:Z

    .line 2
    .line 3
    return-void
.end method
