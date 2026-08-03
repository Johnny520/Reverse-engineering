.class public final synthetic La/w3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s7;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La/w3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    iget v1, v0, La/w3;->a:I

    packed-switch v1, :pswitch_data_0

    const-string v6, "schedule_message"

    const-string v7, "@placeholder_foldgroup"

    const-string v2, "message_fold"

    const-string v3, "helper_entry"

    const-string v4, "conversationboxservice"

    const-string v5, "notification_messages"

    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, La/n9;->z([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    return-object v1

    :pswitch_0
    const-string v26, "facebookapp"

    const-string v27, "qqsync"

    const-string v2, "filehelper"

    const-string v3, "weixin"

    const-string v4, "qmessage"

    const-string v5, "qqmail"

    const-string v6, "newsapp"

    const-string v7, "fmessage"

    const-string v8, "tmessage"

    const-string v9, "medianote"

    const-string v10, "floatbottle"

    const-string v11, "lbsapp"

    const-string v12, "masssendapp"

    const-string v13, "blogapp"

    const-string v14, "shakeapp"

    const-string v15, "officialaccounts"

    const-string v16, "service_officialaccounts"

    const-string v17, "notifymessage"

    const-string v18, "notification_messages"

    const-string v19, "schedule_message"

    const-string v20, "message_fold"

    const-string v21, "helper_entry"

    const-string v22, "conversationboxservice"

    const-string v23, "appbrand_notify_message"

    const-string v24, "appbrandcustomerservicemsg"

    const-string v25, "opencustomerservicemsg"

    filled-new-array/range {v2 .. v27}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, La/n9;->z([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    return-object v1

    :pswitch_1
    const-string v1, "sns_recycler_adapter_v1"

    invoke-static {v1}, La/a5;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "classNames"

    invoke-static {v2, v1}, La/a5;->g(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v1, La/Y5;->a:La/Y5;

    :goto_0
    return-object v1

    :pswitch_2
    sget-object v1, La/Ed;->h:Ljava/lang/Class;

    return-object v1

    :pswitch_3
    sget-object v1, La/Ed;->g:Ljava/lang/Class;

    return-object v1

    :pswitch_4
    sget-object v1, La/a5;->a:Ljava/lang/Object;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    const-string v3, "sns_timeline_v1"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v3

    :catch_0
    :cond_2
    :goto_1
    sget-object v1, La/Y5;->a:La/Y5;

    if-eqz v2, :cond_5

    const-string v3, "classNames"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-static {v1, v3}, La/Oc;->D(II)La/f9;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, La/d9;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    move-object v4, v1

    check-cast v4, La/e9;

    iget-boolean v4, v4, La/e9;->c:Z

    if-eqz v4, :cond_4

    move-object v4, v1

    check-cast v4, La/c9;

    invoke-virtual {v4}, La/c9;->a()I

    move-result v4

    const-string v5, ""

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    move-object v1, v3

    :cond_5
    :goto_3
    return-object v1

    :pswitch_5
    sget-object v1, La/a5;->a:Ljava/lang/Object;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    const-string v3, "sns_msg_relevance_v1"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v2, v3

    :catch_1
    :cond_7
    :goto_4
    sget-object v1, La/Y5;->a:La/Y5;

    if-eqz v2, :cond_a

    const-string v3, "classNames"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    if-nez v2, :cond_8

    goto :goto_6

    :cond_8
    const/4 v1, 0x0

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-static {v1, v3}, La/Oc;->D(II)La/f9;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, La/d9;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    move-object v4, v1

    check-cast v4, La/e9;

    iget-boolean v4, v4, La/e9;->c:Z

    if-eqz v4, :cond_9

    move-object v4, v1

    check-cast v4, La/c9;

    invoke-virtual {v4}, La/c9;->a()I

    move-result v4

    const-string v5, ""

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_9
    move-object v1, v3

    :cond_a
    :goto_6
    return-object v1

    :pswitch_6
    sget-object v1, La/Ed;->e:Ljava/lang/Class;

    return-object v1

    :pswitch_7
    sget-object v1, La/Ed;->f:Ljava/lang/Class;

    return-object v1

    :pswitch_8
    sget-object v1, La/a5;->a:Ljava/lang/Object;

    const/4 v2, 0x0

    if-eqz v1, :cond_c

    const-string v3, "sns_msg_adapter_v1"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_b

    goto :goto_7

    :cond_b
    :try_start_2
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object v2, v3

    :catch_2
    :cond_c
    :goto_7
    sget-object v1, La/Y5;->a:La/Y5;

    if-eqz v2, :cond_f

    const-string v3, "classNames"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    if-nez v2, :cond_d

    goto :goto_9

    :cond_d
    const/4 v1, 0x0

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-static {v1, v3}, La/Oc;->D(II)La/f9;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, La/d9;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    move-object v4, v1

    check-cast v4, La/e9;

    iget-boolean v4, v4, La/e9;->c:Z

    if-eqz v4, :cond_e

    move-object v4, v1

    check-cast v4, La/c9;

    invoke-virtual {v4}, La/c9;->a()I

    move-result v4

    const-string v5, ""

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_e
    move-object v1, v3

    :cond_f
    :goto_9
    return-object v1

    :pswitch_9
    sget-object v1, La/Ed;->d:Ljava/lang/Class;

    return-object v1

    :pswitch_a
    sget-object v1, La/Ed;->c:Ljava/lang/Class;

    return-object v1

    :pswitch_b
    sget-object v1, La/Ed;->l:Ljava/lang/Class;

    return-object v1

    :pswitch_c
    sget-object v1, La/Ed;->o:Ljava/lang/Class;

    return-object v1

    :pswitch_d
    sget-object v1, La/Ed;->n:Ljava/lang/Class;

    return-object v1

    :pswitch_e
    sget-object v1, La/a5;->a:Ljava/lang/Object;

    const/4 v2, 0x0

    if-eqz v1, :cond_11

    const-string v3, "sns_timeline_adapter_v1"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_10

    goto :goto_a

    :cond_10
    :try_start_3
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-object v2, v3

    :catch_3
    :cond_11
    :goto_a
    sget-object v1, La/Y5;->a:La/Y5;

    if-eqz v2, :cond_14

    const-string v3, "classNames"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    if-nez v2, :cond_12

    goto :goto_c

    :cond_12
    const/4 v1, 0x0

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-static {v1, v3}, La/Oc;->D(II)La/f9;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, La/d9;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    move-object v4, v1

    check-cast v4, La/e9;

    iget-boolean v4, v4, La/e9;->c:Z

    if-eqz v4, :cond_13

    move-object v4, v1

    check-cast v4, La/c9;

    invoke-virtual {v4}, La/c9;->a()I

    move-result v4

    const-string v5, ""

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_13
    move-object v1, v3

    :cond_14
    :goto_c
    return-object v1

    :pswitch_f
    sget-object v1, La/Ed;->m:Ljava/lang/Class;

    return-object v1

    :pswitch_10
    sget-object v1, La/Ed;->k:Ljava/lang/Class;

    return-object v1

    :pswitch_11
    sget-object v1, La/Ed;->j:Ljava/lang/Class;

    return-object v1

    :pswitch_12
    sget-object v1, La/Ed;->b:Ljava/lang/Class;

    return-object v1

    :pswitch_13
    sget-object v1, La/Ed;->i:Ljava/lang/Class;

    return-object v1

    :pswitch_14
    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "NativeHideAsync"

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    new-instance v2, Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v2

    :pswitch_15
    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "MaskMuteThread"

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    new-instance v2, Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v2

    :pswitch_16
    const-string v1, "fc_options"

    invoke-static {v1}, La/n9;->s(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v1

    return-object v1

    :pswitch_17
    const-string v1, "fc_config"

    invoke-static {v1}, La/n9;->s(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v1

    return-object v1

    :pswitch_18
    new-instance v1, La/Wc;

    const-string v2, "^SELECT (FTS5MetaContact|FTS5MetaTopHits|FTS5MetaKefuContact|FTS5MetaFeature|FTS5MetaWeApp|FTS5MetaFinderFollow|FTS5MetaFavorite)\\.docid, type, subtype, entity_id, aux_index,.*"

    invoke-direct {v1, v2}, La/Wc;-><init>(Ljava/lang/String;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
