.class public final La/jc$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/jc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Ljava/lang/String;)La/jc;
    .locals 51

    move-object/from16 v0, p0

    const-string v1, "jsonText"

    invoke-static {v0, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :goto_0
    new-instance v0, La/jc;

    const-string v2, "hideMainSearch"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    const-string v4, "hideMainSearchStrong"

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v4

    const-string v6, "viewWxDbPw"

    invoke-virtual {v1, v6, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    const-string v7, "hideStorageChatRecordEntry"

    invoke-virtual {v1, v7, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v7

    const-string v8, "hideStorageCache"

    invoke-virtual {v1, v8, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v8

    const-string v9, "hideSnsEntry"

    invoke-virtual {v1, v9, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v9

    const-string v10, "hideDiscoverSnsEntry"

    invoke-virtual {v1, v10, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v10

    const-string v11, "hideDiscoverEntries"

    invoke-virtual {v1, v11, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v11

    const-string v12, "hideRecentForward"

    invoke-virtual {v1, v12, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v12

    const-string v13, "hideOwnSns"

    invoke-virtual {v1, v13, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v13

    const-string v14, "showOwnSnsHideDialog"

    invoke-virtual {v1, v14, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v14

    const-string v15, "hideSnsInteraction"

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v15

    const-string v5, "hideSnsGroupIcon"

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    move/from16 v16, v5

    const-string v5, "hideMainConvList"

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    move/from16 v17, v5

    const-string v5, "hideContactList"

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    move/from16 v18, v5

    const-string v5, "hideInLabel"

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    move/from16 v19, v5

    const-string v5, "hideConversation"

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    move/from16 v20, v5

    const-string v5, "hideMaskedMessageNotification"

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    move/from16 v21, v5

    const-string v5, "blockEnterChat"

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    move/from16 v22, v5

    const-string v5, "blockContactInfo"

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    move/from16 v23, v5

    const-string v5, "enableMultiClickTempUnhide"

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    const-string v3, "multiClickCount"

    move/from16 v25, v5

    const/4 v5, 0x3

    invoke-virtual {v1, v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    const-string v5, "multiClickInterval"

    move/from16 v26, v3

    const/16 v3, 0x1f4

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    const-string v5, "enableLongPressTempUnhide"

    move/from16 v27, v3

    const/4 v3, 0x1

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    const-string v3, "longPressDuration"

    move/from16 v28, v5

    const/16 v5, 0x320

    invoke-virtual {v1, v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    const-string v5, "blockScanLogin"

    move/from16 v29, v3

    const/4 v3, 0x1

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    move/from16 v30, v5

    const-string v5, "enableLongPressAddMask"

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    move/from16 v31, v5

    const-string v5, "enableContactLongPressAddMask"

    invoke-virtual {v1, v5, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    const-string v3, "addMaskMenuText"

    move/from16 v32, v5

    const-string v5, "\u52a0\u5165\u5bc6\u53cb"

    invoke-virtual {v1, v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "optString(...)"

    invoke-static {v3, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v33, v3

    const-string v3, "blockVoipCall"

    move/from16 v34, v15

    const/4 v15, 0x1

    invoke-virtual {v1, v3, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    move/from16 v35, v3

    const-string v3, "hideTextStatus"

    invoke-virtual {v1, v3, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    const-string v15, "boldBottomTabOnMaskedMsg"

    move/from16 v36, v3

    const/4 v3, 0x0

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v15

    const-string v3, "boldBottomTabPercent"

    move/from16 v37, v15

    const/16 v15, 0x32

    invoke-virtual {v1, v3, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    const-string v15, "dotIndicatorEnabled"

    move/from16 v38, v3

    const/4 v3, 0x0

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v15

    const-string v3, "dotIndicatorSizePercent"

    move/from16 v39, v15

    const/16 v15, 0x64

    invoke-virtual {v1, v3, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    const-string v15, "vibrateOnMaskedMessage"

    move/from16 v40, v3

    const/4 v3, 0x1

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v15

    const-string v3, "vibrateIntensity"

    move/from16 v41, v15

    const/16 v15, 0x3c

    invoke-virtual {v1, v3, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    const-string v15, "masterEnabled"

    move/from16 v42, v3

    const/4 v3, 0x1

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v15

    move/from16 v24, v15

    const-string v15, "blockHotUpdate"

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v15

    move/from16 v43, v15

    const-string v15, "rehideOnLeaveChat"

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v15

    move/from16 v44, v15

    const-string v15, "rehideOnLeaveApp"

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    const-string v15, "cmdOpenSettings"

    move/from16 v45, v3

    const-string v3, "#jz#"

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "cmdTempUnhide"

    move-object/from16 v46, v3

    const-string v3, "#mm#"

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "actionHintEnabled"

    move-object/from16 v47, v3

    const/4 v3, 0x0

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    const-string v15, "hintTempUnhide"

    move/from16 p0, v3

    const-string v3, "\u523b\u821f\u6c42\u5251"

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v48, v15

    const-string v15, "hintAddMask"

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v49, v15

    const-string v15, "hintRemoveMask"

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v50, v15

    const-string v15, "hintAddSns"

    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-boolean v2, v0, La/jc;->a:Z

    iput-boolean v4, v0, La/jc;->b:Z

    iput-boolean v6, v0, La/jc;->c:Z

    iput-boolean v7, v0, La/jc;->d:Z

    iput-boolean v8, v0, La/jc;->e:Z

    iput-boolean v9, v0, La/jc;->f:Z

    iput-boolean v10, v0, La/jc;->g:Z

    iput-boolean v11, v0, La/jc;->h:Z

    iput-boolean v12, v0, La/jc;->i:Z

    iput-boolean v13, v0, La/jc;->j:Z

    iput-boolean v14, v0, La/jc;->k:Z

    move/from16 v2, v34

    iput-boolean v2, v0, La/jc;->l:Z

    move/from16 v2, v16

    iput-boolean v2, v0, La/jc;->m:Z

    move/from16 v2, v17

    iput-boolean v2, v0, La/jc;->n:Z

    move/from16 v2, v18

    iput-boolean v2, v0, La/jc;->o:Z

    move/from16 v2, v19

    iput-boolean v2, v0, La/jc;->p:Z

    move/from16 v2, v20

    iput-boolean v2, v0, La/jc;->q:Z

    move/from16 v2, v21

    iput-boolean v2, v0, La/jc;->r:Z

    move/from16 v2, v22

    iput-boolean v2, v0, La/jc;->s:Z

    move/from16 v2, v23

    iput-boolean v2, v0, La/jc;->t:Z

    move/from16 v2, v25

    iput-boolean v2, v0, La/jc;->u:Z

    move/from16 v2, v26

    iput v2, v0, La/jc;->v:I

    move/from16 v2, v27

    iput v2, v0, La/jc;->w:I

    move/from16 v2, v28

    iput-boolean v2, v0, La/jc;->x:Z

    move/from16 v2, v29

    iput v2, v0, La/jc;->y:I

    move/from16 v2, v30

    iput-boolean v2, v0, La/jc;->z:Z

    move/from16 v2, v31

    iput-boolean v2, v0, La/jc;->A:Z

    move/from16 v2, v32

    iput-boolean v2, v0, La/jc;->B:Z

    move-object/from16 v2, v33

    iput-object v2, v0, La/jc;->C:Ljava/lang/String;

    move/from16 v2, v35

    iput-boolean v2, v0, La/jc;->D:Z

    move/from16 v2, v36

    iput-boolean v2, v0, La/jc;->E:Z

    move/from16 v2, v37

    iput-boolean v2, v0, La/jc;->F:Z

    move/from16 v2, v38

    iput v2, v0, La/jc;->G:I

    move/from16 v2, v39

    iput-boolean v2, v0, La/jc;->H:Z

    move/from16 v2, v40

    iput v2, v0, La/jc;->I:I

    move/from16 v2, v41

    iput-boolean v2, v0, La/jc;->J:Z

    move/from16 v2, v42

    iput v2, v0, La/jc;->K:I

    move/from16 v2, v24

    iput-boolean v2, v0, La/jc;->L:Z

    move/from16 v2, v43

    iput-boolean v2, v0, La/jc;->M:Z

    move/from16 v2, v44

    iput-boolean v2, v0, La/jc;->N:Z

    move/from16 v2, v45

    iput-boolean v2, v0, La/jc;->O:Z

    move-object/from16 v2, v46

    iput-object v2, v0, La/jc;->P:Ljava/lang/String;

    move-object/from16 v2, v47

    iput-object v2, v0, La/jc;->Q:Ljava/lang/String;

    move/from16 v2, p0

    iput-boolean v2, v0, La/jc;->R:Z

    move-object/from16 v2, v48

    iput-object v2, v0, La/jc;->S:Ljava/lang/String;

    move-object/from16 v2, v49

    iput-object v2, v0, La/jc;->T:Ljava/lang/String;

    move-object/from16 v2, v50

    iput-object v2, v0, La/jc;->U:Ljava/lang/String;

    iput-object v1, v0, La/jc;->V:Ljava/lang/String;

    return-object v0
.end method

.method public static b(La/jc;)Ljava/lang/String;
    .locals 3

    const-string v0, "data"

    invoke-static {p0, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iget-boolean v1, p0, La/jc;->a:Z

    const-string v2, "hideMainSearch"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "hideMainSearchStrong"

    iget-boolean v2, p0, La/jc;->b:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->c:Z

    const-string v2, "viewWxDbPw"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->d:Z

    const-string v2, "hideStorageChatRecordEntry"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->e:Z

    const-string v2, "hideStorageCache"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->f:Z

    const-string v2, "hideSnsEntry"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->g:Z

    const-string v2, "hideDiscoverSnsEntry"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->h:Z

    const-string v2, "hideDiscoverEntries"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->i:Z

    const-string v2, "hideRecentForward"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->j:Z

    const-string v2, "hideOwnSns"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->k:Z

    const-string v2, "showOwnSnsHideDialog"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->l:Z

    const-string v2, "hideSnsInteraction"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->m:Z

    const-string v2, "hideSnsGroupIcon"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->n:Z

    const-string v2, "hideMainConvList"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->o:Z

    const-string v2, "hideContactList"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->p:Z

    const-string v2, "hideInLabel"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->q:Z

    const-string v2, "hideConversation"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->r:Z

    const-string v2, "hideMaskedMessageNotification"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->s:Z

    const-string v2, "blockEnterChat"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->t:Z

    const-string v2, "blockContactInfo"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->u:Z

    const-string v2, "enableMultiClickTempUnhide"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget v1, p0, La/jc;->v:I

    const-string v2, "multiClickCount"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget v1, p0, La/jc;->w:I

    const-string v2, "multiClickInterval"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->x:Z

    const-string v2, "enableLongPressTempUnhide"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget v1, p0, La/jc;->y:I

    const-string v2, "longPressDuration"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->z:Z

    const-string v2, "blockScanLogin"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->A:Z

    const-string v2, "enableLongPressAddMask"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->B:Z

    const-string v2, "enableContactLongPressAddMask"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-object v1, p0, La/jc;->C:Ljava/lang/String;

    const-string v2, "addMaskMenuText"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->D:Z

    const-string v2, "blockVoipCall"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->E:Z

    const-string v2, "hideTextStatus"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->F:Z

    const-string v2, "boldBottomTabOnMaskedMsg"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget v1, p0, La/jc;->G:I

    const-string v2, "boldBottomTabPercent"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->H:Z

    const-string v2, "dotIndicatorEnabled"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget v1, p0, La/jc;->I:I

    const-string v2, "dotIndicatorSizePercent"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->J:Z

    const-string v2, "vibrateOnMaskedMessage"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget v1, p0, La/jc;->K:I

    const-string v2, "vibrateIntensity"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->L:Z

    const-string v2, "masterEnabled"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->M:Z

    const-string v2, "blockHotUpdate"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->N:Z

    const-string v2, "rehideOnLeaveChat"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->O:Z

    const-string v2, "rehideOnLeaveApp"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-object v1, p0, La/jc;->P:Ljava/lang/String;

    const-string v2, "cmdOpenSettings"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, La/jc;->Q:Ljava/lang/String;

    const-string v2, "cmdTempUnhide"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-boolean v1, p0, La/jc;->R:Z

    const-string v2, "actionHintEnabled"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-object v1, p0, La/jc;->S:Ljava/lang/String;

    const-string v2, "hintTempUnhide"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, La/jc;->T:Ljava/lang/String;

    const-string v2, "hintAddMask"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, La/jc;->U:Ljava/lang/String;

    const-string v2, "hintRemoveMask"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p0, p0, La/jc;->V:Ljava/lang/String;

    const-string v1, "hintAddSns"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
