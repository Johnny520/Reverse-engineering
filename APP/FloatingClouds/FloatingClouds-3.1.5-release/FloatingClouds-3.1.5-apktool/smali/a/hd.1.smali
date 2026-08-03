.class public final La/hd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/hd;

.field public static volatile b:Z

.field public static volatile c:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/hd;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/hd;->a:La/hd;

    const/4 v0, 0x1

    sput-boolean v0, La/hd;->b:Z

    return-void
.end method

.method public static a(Ljava/lang/String;La/fd;)La/gd;
    .locals 28

    move-object/from16 v2, p0

    move-object/from16 v7, p1

    sget-boolean v0, La/hd;->b:Z

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    sget-object v0, La/rb;->a:La/rb;

    invoke-virtual {v0, v2}, La/rb;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v8, v3

    goto :goto_0

    :cond_0
    move v8, v1

    :goto_0
    sget-boolean v0, La/hd;->b:Z

    if-eqz v0, :cond_2

    sget-object v4, La/rb;->a:La/rb;

    monitor-enter v4

    :try_start_0
    sget-object v0, La/rb;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    move v0, v1

    :goto_1
    monitor-exit v4

    if-eqz v0, :cond_2

    move v9, v3

    goto :goto_3

    :goto_2
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_2
    move v9, v1

    :goto_3
    sget-object v0, La/ld;->a:La/ld;

    invoke-virtual {v0, v2}, La/ld;->c(Ljava/lang/String;)La/ld$a;

    move-result-object v10

    const/4 v11, 0x0

    if-eqz v10, :cond_3

    iget-object v4, v10, La/ld$a;->g:La/D7;

    goto :goto_4

    :cond_3
    move-object v4, v11

    :goto_4
    if-eqz v4, :cond_4

    move v12, v3

    goto :goto_5

    :cond_4
    move v12, v1

    :goto_5
    sget-object v4, La/f6;->a:La/f6;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v7, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-virtual {v0, v2}, La/ld;->c(Ljava/lang/String;)La/ld$a;

    move-result-object v5

    if-eqz v5, :cond_5

    iget-object v0, v5, La/ld$a;->h:La/D7;

    goto :goto_6

    :cond_5
    move-object v0, v11

    :goto_6
    const-string v6, "ExistingBackend"

    const/16 v13, 0x1c

    if-eqz v0, :cond_8

    :try_start_2
    iget-object v0, v5, La/ld$a;->h:La/D7;

    invoke-interface {v0, v7}, La/D7;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/gd;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_7
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v14

    if-eqz v14, :cond_6

    const-string v15, "newResolverFull FAIL for "

    invoke-virtual {v15, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    filled-new-array {v6, v15, v14}, [Ljava/lang/Object;

    move-result-object v14

    invoke-static {v14}, La/x1;->a([Ljava/lang/Object;)V

    :cond_6
    instance-of v14, v0, La/wd$a;

    if-eqz v14, :cond_7

    move-object v0, v11

    :cond_7
    check-cast v0, La/gd;

    if-eqz v0, :cond_8

    iget-boolean v14, v0, La/gd;->a:Z

    if-eqz v14, :cond_8

    :goto_8
    move-object v11, v0

    goto/16 :goto_19

    :cond_8
    if-eqz v5, :cond_9

    iget-object v0, v5, La/ld$a;->g:La/D7;

    goto :goto_9

    :cond_9
    move-object v0, v11

    :goto_9
    if-eqz v0, :cond_c

    :try_start_3
    iget-object v0, v5, La/ld$a;->g:La/D7;

    invoke-interface {v0, v7}, La/D7;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_a

    :catchall_2
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_a
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_a

    const-string v14, "newResolver FAIL for "

    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    filled-new-array {v6, v14, v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/x1;->a([Ljava/lang/Object;)V

    :cond_a
    instance-of v5, v0, La/wd$a;

    if-eqz v5, :cond_b

    move-object v0, v11

    :cond_b
    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_c

    sget-object v1, La/cd;->a:La/cd;

    invoke-static {v0, v1, v11, v11, v13}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto :goto_8

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const-string v5, "com.tencent.mm.plugin.sns.ui.improve.component.h2"

    const-string v6, "ObfResolv: DexKit \u547d\u4e2d "

    const-string v14, "cl"

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_17

    :sswitch_0
    const-string v0, "F010_conv_storage_pair"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_17

    :cond_d
    sget-object v0, La/Rb;->a:La/Rb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, La/Rb;->g(Ljava/lang/ClassLoader;)La/Rb$a;

    move-result-object v0

    if-eqz v0, :cond_e

    iget-object v0, v0, La/Rb$a;->a:Ljava/lang/Class;

    goto/16 :goto_18

    :cond_e
    move-object v0, v11

    goto/16 :goto_18

    :sswitch_1
    const-string v0, "F006:contactInfoUI"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_17

    :cond_f
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->g:Ljava/lang/Class;

    goto/16 :goto_18

    :sswitch_2
    const-string v0, "F017_msg_info"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_17

    :cond_10
    const-string v0, "com.tencent.mm.storage.f9"

    invoke-static {v4, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    goto/16 :goto_18

    :sswitch_3
    const-string v0, "F017:voipMgr"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_17

    :cond_11
    sget-object v0, La/Rb;->a:La/Rb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, La/Rb;->k(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    goto/16 :goto_18

    :sswitch_4
    const-string v0, "F006:snsSelfAdapter"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_17

    :cond_12
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->n:Ljava/lang/Class;

    goto/16 :goto_18

    :sswitch_5
    const-string v0, "F010:convStorage"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_17

    :cond_13
    sget-object v0, La/Rb;->a:La/Rb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, La/Rb;->e(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    goto/16 :goto_18

    :sswitch_6
    const-string v0, "F002:contactList"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_17

    :cond_14
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->j:Ljava/lang/Class;

    goto/16 :goto_18

    :sswitch_7
    const-string v0, "F006:snsTimelineAdapter"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_17

    :cond_15
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->m:Ljava/lang/Class;

    goto/16 :goto_18

    :sswitch_8
    const-string v0, "F004:muteX3"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_17

    :cond_16
    sget-object v0, La/Rb;->a:La/Rb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v14}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/a5;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_17
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v4, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-nez v5, :cond_18

    goto :goto_b

    :cond_18
    sget-object v14, La/Rb;->a:La/Rb;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, La/Rb;->b(Ljava/lang/Class;)Z

    move-result v14

    if-eqz v14, :cond_17

    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :goto_c
    move-object v0, v5

    goto/16 :goto_18

    :cond_19
    const-string v0, "e3.x3"

    invoke-static {v4, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_40

    const-string v0, "ge3.x3"

    invoke-static {v4, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_40

    const-string v0, "sc3.x3"

    invoke-static {v4, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_40

    const-string v0, "sc3.x"

    invoke-static {v4, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    goto/16 :goto_18

    :sswitch_9
    const-string v0, "F006:mvvmList"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_17

    :cond_1a
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->l:Ljava/lang/Class;

    goto/16 :goto_18

    :sswitch_a
    const-string v0, "F006:snsCommentDetailUI"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto/16 :goto_17

    :cond_1b
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->b:Ljava/lang/Class;

    goto/16 :goto_18

    :sswitch_b
    const-string v0, "F017:incomingCallMgr"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto/16 :goto_17

    :cond_1c
    sget-object v0, La/Rb;->a:La/Rb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, La/Rb;->h(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    goto/16 :goto_18

    :sswitch_c
    const-string v0, "F006:wxRecyclerAdapter"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto/16 :goto_17

    :cond_1d
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->k:Ljava/lang/Class;

    goto/16 :goto_18

    :sswitch_d
    const-string v0, "F006:snsRecyclerAdapter"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto/16 :goto_17

    :cond_1e
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->h:Ljava/lang/Class;

    goto/16 :goto_18

    :sswitch_e
    const-string v0, "F006:commentListAdapter"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto/16 :goto_17

    :cond_1f
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->c:Ljava/lang/Class;

    goto/16 :goto_18

    :sswitch_f
    const-string v0, "F006:snsAlbumAdapter"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto/16 :goto_17

    :cond_20
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->o:Ljava/lang/Class;

    goto/16 :goto_18

    :sswitch_10
    const-string v0, "F010:convStorageHelper"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto/16 :goto_17

    :cond_21
    sget-object v0, La/Rb;->a:La/Rb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, La/Rb;->f(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    goto/16 :goto_18

    :sswitch_11
    const-string v0, "F004:muteYj0"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto/16 :goto_17

    :cond_22
    sget-object v0, La/Rb;->a:La/Rb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v14}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "conv_storage_helper_v1"

    invoke-static {v0}, La/a5;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_23

    const-string v1, "classNames"

    invoke-static {v1, v0}, La/a5;->g(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    goto :goto_d

    :cond_23
    sget-object v0, La/Y5;->a:La/Y5;

    :goto_d
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_24
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_26

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v4, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-nez v5, :cond_25

    goto :goto_e

    :cond_25
    sget-object v14, La/Rb;->a:La/Rb;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, La/Rb;->b(Ljava/lang/Class;)Z

    move-result v14

    if-eqz v14, :cond_24

    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto/16 :goto_c

    :cond_26
    const-string v0, "yj0.j1"

    invoke-static {v4, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_40

    const-string v0, "yj0.h1"

    invoke-static {v4, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_40

    const-string v0, "yj0.i1"

    invoke-static {v4, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    goto/16 :goto_18

    :sswitch_12
    const-string v0, "F006_hide_sns_entry"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    goto/16 :goto_17

    :cond_27
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->m:Ljava/lang/Class;

    goto/16 :goto_18

    :sswitch_13
    const-string v0, "F006:snsMsgRelevanceAdapter"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    goto/16 :goto_17

    :cond_28
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->e:Ljava/lang/Class;

    goto/16 :goto_18

    :sswitch_14
    const-string v0, "F010:convStoragePair"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_29

    goto/16 :goto_17

    :cond_29
    sget-object v0, La/Rb;->a:La/Rb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, La/Rb;->g(Ljava/lang/ClassLoader;)La/Rb$a;

    move-result-object v0

    if-eqz v0, :cond_e

    iget-object v0, v0, La/Rb$a;->a:Ljava/lang/Class;

    goto/16 :goto_18

    :sswitch_15
    const-string v0, "F013_timeline_adapter"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2a

    goto/16 :goto_17

    :cond_2a
    invoke-static {v4, v5}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    goto/16 :goto_18

    :sswitch_16
    const-string v0, "F003:convItem"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2b

    goto/16 :goto_17

    :cond_2b
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->i:Ljava/lang/Class;

    goto/16 :goto_18

    :sswitch_17
    const-string v0, "F005_hide_contact_label"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2c

    goto/16 :goto_17

    :cond_2c
    const-string v0, "d53.b"

    invoke-static {v4, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    goto/16 :goto_18

    :sswitch_18
    const-string v0, "F017:flutterVoip"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2d

    goto/16 :goto_17

    :cond_2d
    sget-object v0, La/Rb;->a:La/Rb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v14}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/a5;->a:Ljava/lang/Object;

    if-eqz v0, :cond_2f

    const-string v5, "flutter_voip_class_v1"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_2e

    goto :goto_f

    :cond_2e
    :try_start_4
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_10

    :catch_0
    :cond_2f
    :goto_f
    move-object v5, v11

    :goto_10
    sget-object v0, La/Y5;->a:La/Y5;

    if-eqz v5, :cond_32

    const-string v14, "classNames"

    invoke-virtual {v5, v14}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    if-nez v5, :cond_30

    goto :goto_12

    :cond_30
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    invoke-static {v1, v0}, La/Oc;->D(II)La/f9;

    move-result-object v0

    new-instance v14, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v0, v15}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, La/d9;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    move-object v15, v0

    check-cast v15, La/e9;

    iget-boolean v15, v15, La/e9;->c:Z

    if-eqz v15, :cond_31

    move-object v15, v0

    check-cast v15, La/c9;

    invoke-virtual {v15}, La/c9;->a()I

    move-result v15

    const-string v1, ""

    invoke-virtual {v5, v15, v1}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    goto :goto_11

    :cond_31
    move-object v0, v14

    :cond_32
    :goto_12
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_38

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v4, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-nez v5, :cond_33

    goto :goto_13

    :cond_33
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v14

    const-string v15, "getDeclaredMethods(...)"

    invoke-static {v14, v15}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v15, v14

    const/4 v11, 0x0

    :goto_14
    if-ge v11, v15, :cond_37

    aget-object v18, v14, v11

    invoke-virtual/range {v18 .. v18}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v13

    const-string v3, "a"

    invoke-static {v13, v3}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_35

    invoke-virtual/range {v18 .. v18}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v13, "b"

    invoke-static {v3, v13}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_34

    goto :goto_15

    :cond_34
    const/4 v13, 0x1

    goto :goto_16

    :cond_35
    :goto_15
    invoke-virtual/range {v18 .. v18}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    array-length v3, v3

    const/4 v13, 0x1

    if-lt v3, v13, :cond_36

    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto/16 :goto_c

    :cond_36
    :goto_16
    add-int/2addr v11, v13

    move v3, v13

    const/16 v13, 0x1c

    goto :goto_14

    :cond_37
    const/4 v11, 0x0

    const/16 v13, 0x1c

    goto :goto_13

    :cond_38
    const-string v0, "iq0.d"

    invoke-static {v4, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_40

    const-string v0, "com.tencent.mm.plugin.voip_cs.flutter.d"

    invoke-static {v4, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    goto/16 :goto_18

    :sswitch_19
    const-string v0, "F006:snsMsgAdapter"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_39

    goto :goto_17

    :cond_39
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->d:Ljava/lang/Class;

    goto :goto_18

    :sswitch_1a
    const-string v0, "F007_voip_mgr"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3a

    goto :goto_17

    :cond_3a
    sget-object v0, La/Rb;->a:La/Rb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, La/Rb;->k(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    goto :goto_18

    :sswitch_1b
    const-string v0, "sns_info_model"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3b

    goto :goto_17

    :cond_3b
    const-string v0, "ae4.p"

    invoke-static {v4, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    goto :goto_18

    :sswitch_1c
    const-string v0, "F006:snsTimeLineAdapter"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3c

    goto :goto_17

    :cond_3c
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->f:Ljava/lang/Class;

    goto :goto_18

    :sswitch_1d
    const-string v0, "F004_contact_add_mask"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3d

    goto :goto_17

    :cond_3d
    const-string v0, "ym5.q"

    invoke-static {v4, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    goto :goto_18

    :sswitch_1e
    const-string v0, "F008_hide_own_sns"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3e

    goto :goto_17

    :cond_3e
    invoke-static {v4, v5}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    goto :goto_18

    :sswitch_1f
    const-string v0, "F021_select_contact_mvvm_list"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3f

    :goto_17
    const/4 v0, 0x0

    goto :goto_18

    :cond_3f
    const-string v0, "com.tencent.mm.ui.mvvm.list.SelectContactMvvmList"

    invoke-static {v4, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :cond_40
    :goto_18
    if-eqz v0, :cond_41

    sget-object v1, La/cd;->b:La/cd;

    const/4 v3, 0x0

    const/16 v4, 0x1c

    invoke-static {v0, v1, v3, v3, v4}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto/16 :goto_8

    :cond_41
    sget-object v25, La/dd;->c:La/dd;

    new-instance v0, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-string v1, "NOT_FOUND"

    const-string v3, "existing backend: no resolver wired for this featureId"

    const-string v4, ""

    invoke-direct/range {v0 .. v6}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v20, La/gd;

    sget-object v24, La/cd;->b:La/cd;

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v23, v0

    invoke-direct/range {v20 .. v27}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    move-object/from16 v0, v20

    goto/16 :goto_8

    :goto_19
    if-eqz v12, :cond_42

    if-nez v8, :cond_43

    if-eqz v9, :cond_42

    goto :goto_1a

    :cond_42
    const/4 v9, 0x0

    goto :goto_1d

    :cond_43
    :goto_1a
    :try_start_5
    invoke-static {v10}, La/i9;->b(Ljava/lang/Object;)V

    iget-object v0, v10, La/ld$a;->g:La/D7;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-interface {v0, v7}, La/D7;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :goto_1b
    move-object v3, v0

    goto :goto_1c

    :catchall_3
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    goto :goto_1b

    :goto_1c
    invoke-static {v3}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_44

    const-string v1, "ResolverEngine"

    const-string v4, "newResolver invoke FAILED for "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v1, v4, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :cond_44
    instance-of v0, v3, La/wd$a;

    if-eqz v0, :cond_45

    const/4 v3, 0x0

    :cond_45
    check-cast v3, Ljava/lang/Class;

    if-eqz v3, :cond_46

    sget-object v0, La/cd;->a:La/cd;

    const/16 v4, 0x1c

    const/4 v9, 0x0

    invoke-static {v3, v0, v9, v9, v4}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    move-object v3, v0

    goto :goto_1e

    :cond_46
    const/4 v9, 0x0

    sget-object v17, La/dd;->c:La/dd;

    new-instance v15, La/j6;

    const-string v1, "NEW_PATH_NOT_FOUND"

    const-string v3, "registry newResolver returned null"

    const-string v4, ""

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    move-object v0, v15

    invoke-direct/range {v0 .. v6}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v12, La/gd;

    sget-object v16, La/cd;->b:La/cd;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v12 .. v19}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    move-object v3, v12

    goto :goto_1e

    :goto_1d
    move-object v3, v9

    :goto_1e
    if-eqz v8, :cond_47

    if-eqz v3, :cond_47

    iget-boolean v0, v3, La/gd;->a:Z

    if-eqz v0, :cond_47

    move-object v0, v3

    goto :goto_1f

    :cond_47
    move-object v0, v11

    :goto_1f
    new-instance v1, La/O8;

    const/16 v4, 0x16

    invoke-direct {v1, v4}, La/O8;-><init>(I)V

    if-eqz v3, :cond_4b

    iget-boolean v4, v11, La/gd;->a:Z

    iget-boolean v5, v3, La/gd;->a:Z

    if-ne v4, v5, :cond_4a

    iget-object v4, v11, La/gd;->b:Ljava/lang/Class;

    if-eqz v4, :cond_48

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    goto :goto_20

    :cond_48
    move-object v4, v9

    :goto_20
    iget-object v5, v3, La/gd;->b:Ljava/lang/Class;

    if-eqz v5, :cond_49

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    goto :goto_21

    :cond_49
    move-object v5, v9

    :goto_21
    invoke-static {v4, v5}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4a

    const-string v4, "PASS"

    goto :goto_22

    :cond_4a
    const-string v4, "FAIL"

    goto :goto_22

    :cond_4b
    const-string v4, "NA"

    :goto_22
    iget v5, v7, La/fd;->a:I

    invoke-virtual {v1, v11}, La/O8;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v1, v3}, La/O8;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v8, :cond_4c

    const-string v3, "NEW"

    goto :goto_23

    :cond_4c
    const-string v3, "LEGACY"

    :goto_23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "bypass7 featureId="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ver="

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " legacy="

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " new="

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " matched="

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " effective="

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ts="

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ResolverEngine"

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x7739ab6f -> :sswitch_1f
        -0x7694b5d1 -> :sswitch_1e
        -0x753ed306 -> :sswitch_1d
        -0x74266560 -> :sswitch_1c
        -0x7402fa81 -> :sswitch_1b
        -0x5facdcb9 -> :sswitch_1a
        -0x5f6065a4 -> :sswitch_19
        -0x5e9a644e -> :sswitch_18
        -0x4e5aa818 -> :sswitch_17
        -0x4b9a1eec -> :sswitch_16
        -0x449d3b1c -> :sswitch_15
        -0x43b34d10 -> :sswitch_14
        -0x403e92b7 -> :sswitch_13
        -0x358127e3 -> :sswitch_12
        -0x319b30e6 -> :sswitch_11
        -0x31814dbc -> :sswitch_10
        -0x2a587fd2 -> :sswitch_f
        -0x199c1f84 -> :sswitch_e
        -0x1921f2fe -> :sswitch_d
        0x1ae6c25 -> :sswitch_c
        0xd13a8aa -> :sswitch_b
        0xe0a7d16 -> :sswitch_a
        0x1f82bae8 -> :sswitch_9
        0x27b0ab80 -> :sswitch_8
        0x286ff2c0 -> :sswitch_7
        0x36df5a90 -> :sswitch_6
        0x43af46f6 -> :sswitch_5
        0x465cce55 -> :sswitch_4
        0x50c05f2e -> :sswitch_3
        0x5d917dbb -> :sswitch_2
        0x5f029a38 -> :sswitch_1
        0x6ddc92d3 -> :sswitch_0
    .end sparse-switch
.end method

.method public static b()V
    .locals 19

    sget-object v2, La/hd;->c:Ljava/lang/ClassLoader;

    const-string v3, "ResolverEngine"

    if-nez v2, :cond_0

    const-string v0, "[ResolverBypass] skip: defaultClassLoader not injected"

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-static {}, La/B1$a;->b()I

    move-result v0

    new-instance v4, La/fd;

    invoke-direct {v4, v0, v2}, La/fd;-><init>(ILjava/lang/ClassLoader;)V

    new-instance v5, La/hd$a;

    const-string v6, "F010_conv_storage_pair"

    invoke-static {v6, v4}, La/hd;->a(Ljava/lang/String;La/fd;)La/gd;

    move-result-object v7

    iget-object v7, v7, La/gd;->b:Ljava/lang/Class;

    sget-object v8, La/Rb;->a:La/Rb;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La/Rb;->g(Ljava/lang/ClassLoader;)La/Rb$a;

    move-result-object v8

    if-eqz v8, :cond_1

    iget-object v8, v8, La/Rb$a;->a:Ljava/lang/Class;

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    :goto_0
    const-string v9, "CLASS"

    invoke-direct {v5, v6, v9, v7, v8}, La/hd$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/Serializable;Ljava/io/Serializable;)V

    new-instance v6, La/hd$a;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {}, La/B1$a;->b()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v10, "D1:versionGate"

    const-string v11, "VERSION"

    invoke-direct {v6, v10, v11, v7, v8}, La/hd$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/Serializable;Ljava/io/Serializable;)V

    new-instance v7, La/hd$a;

    const-string v8, "F007_voip_mgr"

    invoke-static {v8, v4}, La/hd;->a(Ljava/lang/String;La/fd;)La/gd;

    move-result-object v10

    iget-object v10, v10, La/gd;->b:Ljava/lang/Class;

    invoke-static {v2}, La/Rb;->k(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v11

    invoke-direct {v7, v8, v9, v10, v11}, La/hd$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/Serializable;Ljava/io/Serializable;)V

    new-instance v8, La/hd$a;

    const-string v10, "F017_msg_info"

    invoke-static {v10, v4}, La/hd;->a(Ljava/lang/String;La/fd;)La/gd;

    move-result-object v11

    iget-object v11, v11, La/gd;->b:Ljava/lang/Class;

    const-string v12, "com.tencent.mm.storage.f9"

    invoke-static {v2, v12}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v14

    invoke-direct {v8, v10, v9, v11, v14}, La/hd$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/Serializable;Ljava/io/Serializable;)V

    new-instance v10, La/hd$a;

    const-string v11, "F021_select_contact_mvvm_list"

    invoke-static {v11, v4}, La/hd;->a(Ljava/lang/String;La/fd;)La/gd;

    move-result-object v14

    iget-object v14, v14, La/gd;->b:Ljava/lang/Class;

    const-string v15, "com.tencent.mm.ui.mvvm.list.SelectContactMvvmList"

    invoke-static {v2, v15}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v15

    invoke-direct {v10, v11, v9, v14, v15}, La/hd$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/Serializable;Ljava/io/Serializable;)V

    move-object v11, v10

    new-instance v10, La/hd$a;

    const-string v14, "F013_timeline_adapter"

    invoke-static {v14, v4}, La/hd;->a(Ljava/lang/String;La/fd;)La/gd;

    move-result-object v15

    iget-object v15, v15, La/gd;->b:Ljava/lang/Class;

    const/16 v16, 0x1

    const-string v1, "com.tencent.mm.plugin.sns.ui.improve.component.h2"

    invoke-static {v2, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v10, v14, v9, v15, v1}, La/hd$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/Serializable;Ljava/io/Serializable;)V

    move-object v1, v11

    new-instance v11, La/hd$a;

    const-string v14, "F004_contact_add_mask"

    invoke-static {v14, v4}, La/hd;->a(Ljava/lang/String;La/fd;)La/gd;

    move-result-object v4

    iget-object v4, v4, La/gd;->b:Ljava/lang/Class;

    const-string v15, "ym5.q"

    invoke-static {v2, v15}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v15

    invoke-direct {v11, v14, v9, v4, v15}, La/hd$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/Serializable;Ljava/io/Serializable;)V

    :try_start_0
    sget-object v14, La/Cd;->a:La/Cd;

    new-instance v15, La/g3;

    const-string v13, "F017_msg_info_class"

    const-string v4, "mm.storage.f9"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v17, v1

    const/16 v1, 0x1c

    move-object/from16 v18, v14

    const/4 v14, 0x0

    :try_start_1
    invoke-direct {v15, v13, v4, v14, v1}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v1, La/fd;

    invoke-direct {v1, v0, v2}, La/fd;-><init>(ILjava/lang/ClassLoader;)V

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v15, v1}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object v0

    iget-object v0, v0, La/gd;->b:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object/from16 v17, v1

    const/4 v14, 0x0

    :goto_1
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_2
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v4, "F017 RuleSystem direct FAIL"

    filled-new-array {v3, v4, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->a([Ljava/lang/Object;)V

    sget-object v1, La/Wf;->a:La/Wf;

    :cond_2
    instance-of v1, v0, La/wd$a;

    if-eqz v1, :cond_3

    const/4 v0, 0x0

    :cond_3
    invoke-static {v2, v12}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    new-instance v12, La/hd$a;

    const-string v2, "F017_rule_direct"

    invoke-direct {v12, v2, v9, v0, v1}, La/hd$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/Serializable;Ljava/io/Serializable;)V

    move-object/from16 v9, v17

    filled-new-array/range {v5 .. v12}, [La/hd$a;

    move-result-object v0

    invoke-static {v0}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sget-boolean v1, La/hd;->b:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "[ResolverBypass] === START (newPathEnabled="

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ") ==="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->b([Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v2, v14

    move v4, v2

    move v5, v4

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/hd$a;

    iget-object v7, v6, La/hd$a;->c:Ljava/io/Serializable;

    iget-object v8, v6, La/hd$a;->d:Ljava/io/Serializable;

    invoke-static {v7, v8}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    add-int/lit8 v4, v4, 0x1

    :goto_4
    iget-object v8, v6, La/hd$a;->c:Ljava/io/Serializable;

    if-nez v8, :cond_5

    iget-object v9, v6, La/hd$a;->d:Ljava/io/Serializable;

    if-nez v9, :cond_5

    move/from16 v9, v16

    goto :goto_5

    :cond_5
    move v9, v14

    :goto_5
    if-eqz v9, :cond_6

    add-int/lit8 v5, v5, 0x1

    :cond_6
    const-string v10, "null"

    if-eqz v8, :cond_9

    instance-of v11, v8, Ljava/lang/Class;

    if-eqz v11, :cond_7

    move-object v11, v8

    check-cast v11, Ljava/lang/Class;

    goto :goto_6

    :cond_7
    const/4 v11, 0x0

    :goto_6
    if-eqz v11, :cond_8

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    goto :goto_7

    :cond_8
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    :goto_7
    if-nez v8, :cond_a

    :cond_9
    move-object v8, v10

    :cond_a
    iget-object v11, v6, La/hd$a;->d:Ljava/io/Serializable;

    if-eqz v11, :cond_e

    instance-of v12, v11, Ljava/lang/Class;

    if-eqz v12, :cond_b

    move-object v12, v11

    check-cast v12, Ljava/lang/Class;

    goto :goto_8

    :cond_b
    const/4 v12, 0x0

    :goto_8
    if-eqz v12, :cond_c

    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    goto :goto_9

    :cond_c
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    :goto_9
    if-nez v11, :cond_d

    goto :goto_a

    :cond_d
    move-object v10, v11

    :cond_e
    :goto_a
    if-eqz v9, :cond_f

    const-string v9, "(both-null-consistent)"

    goto :goto_b

    :cond_f
    const-string v9, ""

    :goto_b
    iget-object v11, v6, La/hd$a;->a:Ljava/lang/String;

    iget-object v6, v6, La/hd$a;->b:Ljava/lang/String;

    if-eqz v7, :cond_10

    const-string v7, "PASS"

    goto :goto_c

    :cond_10
    const-string v7, "FAIL"

    :goto_c
    const-string v12, "[ResolverBypass] case="

    const-string v13, " kind="

    const-string v15, " result="

    invoke-static {v12, v11, v13, v6, v15}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " engine="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " legacy="

    invoke-static {v6, v7, v10}, La/z;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v3, v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, La/x1;->b([Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_11
    if-nez v4, :cond_12

    const-string v0, "verified"

    goto :goto_d

    :cond_12
    const-string v0, "MISMATCH-investigate"

    :goto_d
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[ResolverBypass] === SUMMARY pass="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " fail="

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " unresolved="

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " (thin-wrapper "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    return-void
.end method
