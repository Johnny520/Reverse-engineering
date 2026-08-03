.class public final synthetic La/id;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La/id;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v1, p1

    check-cast v1, La/fd;

    const-string v0, "ctx"

    invoke-static {v1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La/a5;->a:Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "contact_list_fields_v2"

    if-eqz v0, :cond_1

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_1
    :goto_0
    move-object v4, v2

    :goto_1
    const-string v5, "displayListField"

    const-string v6, "snapshotField"

    const-string v7, "adapterField"

    if-nez v4, :cond_3

    :cond_2
    :goto_2
    move-object v4, v2

    goto :goto_3

    :cond_3
    const-string v0, ""

    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v8}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v9}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v9}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v0}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    new-instance v4, La/a5$c;

    invoke-direct {v4, v8, v9, v0}, La/a5$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    const/16 v8, 0xc

    const-string v9, "com.tencent.mm.plugin.mvvmlist.MvvmList"

    const-string v10, "com.tencent.mm.ui.contact.address.AddressLiveList"

    const-string v11, " adapter="

    const-string v12, " snapshot="

    const-string v13, "RuleSystem"

    if-eqz v4, :cond_6

    sget-object v0, La/Cd;->a:La/Cd;

    iget-object v14, v1, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v14, v9}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_5

    iget-object v0, v1, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v10}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :cond_5
    if-eqz v0, :cond_6

    iget-object v1, v4, La/a5$c;->a:Ljava/lang/String;

    iget-object v3, v4, La/a5$c;->b:Ljava/lang/String;

    iget-object v9, v4, La/a5$c;->c:Ljava/lang/String;

    const-string v10, "CONTACT_LIST_FIELDS via=CACHE display="

    invoke-static {v10, v1, v12, v3, v11}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v13, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v1, La/cd;->c:La/cd;

    iget-object v3, v4, La/a5$c;->a:Ljava/lang/String;

    new-instance v9, La/mc;

    invoke-direct {v9, v5, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, La/mc;

    iget-object v5, v4, La/a5$c;->b:Ljava/lang/String;

    invoke-direct {v3, v6, v5}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, La/mc;

    iget-object v4, v4, La/a5$c;->c:Ljava/lang/String;

    invoke-direct {v5, v7, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v9, v3, v5}, [La/mc;

    move-result-object v3

    invoke-static {v3}, La/ba;->E([La/mc;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v8}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto/16 :goto_24

    :cond_6
    sget-object v0, La/w1;->l:Lorg/luckypray/dexkit/DexKitBridge;

    sget-object v18, La/cd;->b:La/cd;

    if-eqz v0, :cond_32

    invoke-static {}, La/Cd;->h()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    sget-object v15, La/Y5;->a:La/Y5;

    if-eqz v0, :cond_b

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/lb;

    :try_start_1
    iget-object v0, v0, La/lb;->i:La/Me;

    invoke-virtual {v0}, La/Me;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_5
    instance-of v2, v0, La/wd$a;

    if-eqz v2, :cond_7

    const/4 v0, 0x0

    :cond_7
    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_9

    :cond_8
    const/4 v2, 0x0

    const/16 v8, 0xc

    goto :goto_4

    :cond_9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/Yf;

    iget-object v2, v2, La/Yf;->a:La/r6;

    invoke-virtual {v2}, La/r6;->b()La/Y4;

    move-result-object v8

    iget-object v8, v8, La/Y4;->a:Ljava/lang/String;

    invoke-static {v8, v9}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-virtual {v2}, La/r6;->c()La/b3;

    move-result-object v8

    invoke-virtual {v8}, La/b3;->b()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, La/Cd;->e(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_a

    iget v8, v2, La/r6;->c:I

    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v8

    if-nez v8, :cond_a

    invoke-virtual {v2}, La/r6;->b()La/Y4;

    move-result-object v0

    iget-object v0, v0, La/Y4;->b:Ljava/lang/String;

    const-string v4, "SNAPSHOT_FIELD located via submitReset usingFields: "

    invoke-static {v4, v0}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v13, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    invoke-virtual {v2}, La/r6;->b()La/Y4;

    move-result-object v0

    iget-object v0, v0, La/Y4;->b:Ljava/lang/String;

    move-object v2, v0

    :goto_6
    move-object/from16 v21, v10

    move-object/from16 v20, v15

    goto/16 :goto_a

    :cond_b
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, La/lb;

    :try_start_2
    iget-object v0, v4, La/lb;->i:La/Me;

    invoke-virtual {v0}, La/Me;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_8
    instance-of v8, v0, La/wd$a;

    if-eqz v8, :cond_c

    const/4 v0, 0x0

    :cond_c
    check-cast v0, Ljava/util/List;

    const-string v8, "."

    if-eqz v0, :cond_d

    new-instance v14, Ljava/util/ArrayList;

    move-object/from16 v19, v2

    move-object/from16 v20, v4

    const/16 v2, 0xa

    invoke-static {v0, v2}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/Yf;

    iget-object v4, v2, La/Yf;->a:La/r6;

    invoke-virtual {v4}, La/r6;->b()La/Y4;

    move-result-object v4

    iget-object v4, v4, La/Y4;->a:Ljava/lang/String;

    iget-object v2, v2, La/Yf;->a:La/r6;

    invoke-virtual {v2}, La/r6;->b()La/Y4;

    move-result-object v2

    iget-object v2, v2, La/Y4;->b:Ljava/lang/String;

    move-object/from16 v21, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v21

    goto :goto_9

    :cond_d
    move-object/from16 v19, v2

    move-object/from16 v20, v4

    move-object v14, v15

    :cond_e
    invoke-virtual/range {v20 .. v20}, La/lb;->b()La/f5;

    move-result-object v0

    iget-object v0, v0, La/f5;->a:Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, La/lb;->b()La/f5;

    move-result-object v2

    iget-object v2, v2, La/f5;->b:Ljava/lang/String;

    const/16 v4, 0x3e

    move-object/from16 v20, v15

    const-string v15, ", "

    move-object/from16 v21, v10

    const/4 v10, 0x0

    invoke-static {v14, v15, v10, v4}, La/t3;->p0(Ljava/util/Collection;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object v4

    const-string v10, "SNAPSHOT_FIELD diag: method="

    const-string v14, " usingFields=["

    invoke-static {v10, v0, v8, v2, v14}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "]"

    invoke-static {v0, v4, v2}, La/z;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v13, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    move-object/from16 v2, v19

    move-object/from16 v15, v20

    move-object/from16 v10, v21

    goto/16 :goto_7

    :cond_f
    const/4 v2, 0x0

    goto/16 :goto_6

    :goto_a
    sget-object v19, La/dd;->c:La/dd;

    if-nez v2, :cond_10

    invoke-static {}, La/Cd;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const-string v1, "CONTACT_LIST_FIELDS FAIL snapshotField: methods="

    const-string v2, " on com.tencent.mm.plugin.mvvmlist.MvvmList"

    invoke-static {v0, v1, v2}, La/z;->c(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v13, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    new-instance v1, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const-string v2, "SNAPSHOT_FIELD_NOT_FOUND"

    const-string v3, "F004_contact_list_fields"

    const-string v4, "submitReset(List,boolean) usingFields scan failed on com.tencent.mm.plugin.mvvmlist.MvvmList"

    const-string v5, ""

    invoke-direct/range {v1 .. v7}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v14, La/gd;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v1

    invoke-direct/range {v14 .. v21}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    :goto_b
    move-object v0, v14

    goto/16 :goto_24

    :cond_10
    :try_start_3
    const-string v0, "java.util.ArrayList"

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v9, v0, v4, v8}, La/w1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/util/List;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_c

    :catch_1
    move-exception v0

    const-string v4, "DK_SEARCH_FAILED F004_contact_list_fields arrayList"

    filled-new-array {v13, v4, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    move-object/from16 v0, v20

    :goto_c
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    const/4 v8, 0x2

    const/16 v10, 0x1f

    if-eq v4, v8, :cond_11

    new-instance v1, La/kd;

    const/4 v3, 0x4

    invoke-direct {v1, v3}, La/kd;-><init>(I)V

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v10}, La/t3;->p0(Ljava/util/Collection;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "CONTACT_LIST_FIELDS FAIL arrayListCount="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " fields=["

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] snapshot="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v13, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->e([Ljava/lang/Object;)V

    new-instance v17, La/j6;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "MvvmList final ArrayList count="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " (expected 2), snapshot="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const-string v5, "F004_contact_list_fields"

    const-string v7, ""

    const-string v4, "ARRAY_LIST_COUNT_UNEXPECTED"

    move-object/from16 v3, v17

    invoke-direct/range {v3 .. v9}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v14, La/gd;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v14 .. v21}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    goto/16 :goto_b

    :cond_11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v14, v8

    check-cast v14, La/r6;

    invoke-virtual {v14}, La/r6;->b()La/Y4;

    move-result-object v14

    iget-object v14, v14, La/Y4;->b:Ljava/lang/String;

    invoke-static {v14, v2}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_12

    goto :goto_d

    :cond_13
    const/4 v8, 0x0

    :goto_d
    check-cast v8, La/r6;

    if-eqz v8, :cond_14

    invoke-virtual {v8}, La/r6;->b()La/Y4;

    move-result-object v4

    iget-object v4, v4, La/Y4;->b:Ljava/lang/String;

    goto :goto_e

    :cond_14
    const/4 v4, 0x0

    :goto_e
    if-nez v4, :cond_15

    new-instance v1, La/kd;

    const/4 v3, 0x5

    invoke-direct {v1, v3}, La/kd;-><init>(I)V

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v10}, La/t3;->p0(Ljava/util/Collection;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "CONTACT_LIST_FIELDS FAIL displayField: snapshot="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " arrayLists="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v13, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    new-instance v17, La/j6;

    const-string v0, "no ArrayList field besides snapshot="

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const-string v5, "F004_contact_list_fields"

    const-string v7, ""

    const-string v4, "DISPLAY_FIELD_NOT_FOUND"

    move-object/from16 v3, v17

    invoke-direct/range {v3 .. v9}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v14, La/gd;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v14 .. v21}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    goto/16 :goto_b

    :cond_15
    iget-object v8, v1, La/fd;->b:Ljava/lang/ClassLoader;

    :try_start_4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v10, 0x0

    invoke-static {v9, v10, v0, v10}, La/w1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/util/List;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_f

    :catch_2
    move-exception v0

    const-string v10, "DK_SEARCH_FAILED F004_contact_list_fields adapter"

    filled-new-array {v13, v10, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    move-object/from16 v0, v20

    :goto_f
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/16 v15, 0x2e

    if-eqz v10, :cond_20

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/r6;

    invoke-virtual {v10}, La/r6;->c()La/b3;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, La/b3;->b()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v23, v10

    const/16 v10, 0x2f

    invoke-static {v14, v10, v15}, La/Ae;->F(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v10

    :goto_11
    const-string v14, "["

    const/4 v15, 0x0

    invoke-static {v10, v14, v15}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v14

    const/4 v15, 0x1

    move-object/from16 v24, v0

    const-string v0, "substring(...)"

    if-eqz v14, :cond_16

    invoke-virtual {v10, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, v24

    goto :goto_11

    :cond_16
    const-string v14, "L"

    const/4 v15, 0x0

    invoke-static {v10, v14, v15}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v14

    if-eqz v14, :cond_17

    const/4 v14, 0x1

    invoke-virtual {v10, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_17
    const-string v0, ";"

    invoke-virtual {v10, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {v10}, La/Ce;->W(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    :cond_18
    invoke-static {v8, v10}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_19

    move-object/from16 v0, v24

    goto :goto_10

    :cond_19
    :goto_12
    if-eqz v0, :cond_1f

    const-class v10, Ljava/lang/Object;

    invoke-virtual {v0, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1f

    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v10

    const-string v14, "getInterfaces(...)"

    invoke-static {v10, v14}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v14, v10

    move-object/from16 v22, v0

    const/4 v15, 0x0

    :goto_13
    const-string v0, "android.support.v7.widget.RecyclerView$Adapter"

    move-object/from16 v25, v8

    const-string v8, "androidx.recyclerview.widget.RecyclerView$Adapter"

    if-ge v15, v14, :cond_1b

    aget-object v26, v10, v15

    move-object/from16 v27, v10

    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1d

    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_14

    :cond_1a
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v8, v25

    move-object/from16 v10, v27

    goto :goto_13

    :cond_1b
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1d

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_14

    :cond_1c
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v8, v25

    goto :goto_12

    :cond_1d
    :goto_14
    invoke-virtual/range {v23 .. v23}, La/r6;->b()La/Y4;

    move-result-object v0

    iget-object v0, v0, La/Y4;->b:Ljava/lang/String;

    invoke-virtual/range {v23 .. v23}, La/r6;->c()La/b3;

    move-result-object v8

    invoke-virtual {v8}, La/b3;->b()Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v14, "ADAPTER_FIELD located via type structure: "

    invoke-direct {v10, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ("

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v13, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    invoke-virtual/range {v23 .. v23}, La/r6;->b()La/Y4;

    move-result-object v0

    iget-object v0, v0, La/Y4;->b:Ljava/lang/String;

    :cond_1e
    :goto_15
    move-object v8, v0

    goto/16 :goto_20

    :cond_1f
    move-object/from16 v25, v8

    move-object/from16 v0, v24

    move-object/from16 v8, v25

    goto/16 :goto_10

    :cond_20
    :try_start_5
    const-string v0, "void"

    const/4 v10, 0x0

    invoke-static {v10}, La/w1;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/16 v14, 0x8

    invoke-static {v9, v0, v8, v10, v14}, La/w1;->x(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_16

    :catch_3
    move-exception v0

    const-string v8, "DK_SEARCH_FAILED F004_contact_list_fields adapterRef"

    filled-new-array {v13, v8, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    move-object/from16 v0, v20

    :goto_16
    new-instance v8, Ljava/util/LinkedHashSet;

    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_17
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/lb;

    :try_start_6
    iget-object v0, v0, La/lb;->i:La/Me;

    invoke-virtual {v0}, La/Me;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_18

    :catchall_2
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_18
    instance-of v14, v0, La/wd$a;

    if-eqz v14, :cond_21

    const/4 v0, 0x0

    :cond_21
    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_22

    goto :goto_17

    :cond_22
    new-instance v14, Ljava/util/ArrayList;

    move-object/from16 v17, v10

    const/16 v15, 0xa

    invoke-static {v0, v15}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v14, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_23

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/Yf;

    iget-object v10, v10, La/Yf;->a:La/r6;

    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_19

    :cond_23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_25

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, La/r6;

    move-object/from16 v24, v10

    invoke-virtual {v15}, La/r6;->b()La/Y4;

    move-result-object v10

    iget-object v10, v10, La/Y4;->a:Ljava/lang/String;

    invoke-static {v10, v9}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_24

    iget v10, v15, La/r6;->c:I

    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v10

    if-nez v10, :cond_24

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_24
    move-object/from16 v10, v24

    const/16 v15, 0xa

    goto :goto_1a

    :cond_25
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_26

    goto :goto_1d

    :cond_26
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_28

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, La/r6;

    invoke-virtual {v14}, La/r6;->c()La/b3;

    move-result-object v14

    invoke-virtual {v14}, La/b3;->b()Ljava/lang/String;

    move-result-object v14

    sget-object v15, La/Cd;->a:La/Cd;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v14}, La/Cd;->e(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_29

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_27
    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_28

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/r6;

    invoke-virtual {v10}, La/r6;->c()La/b3;

    move-result-object v14

    invoke-virtual {v14}, La/b3;->b()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v20, v10

    const/16 v10, 0x2e

    const/16 v15, 0x2f

    invoke-static {v14, v15, v10}, La/Ae;->F(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, La/Cd;->e(Ljava/lang/String;)Z

    move-result v22

    if-nez v22, :cond_27

    const-string v10, "int"

    invoke-virtual {v14, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_27

    const-string v10, "boolean"

    invoke-virtual {v14, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_27

    invoke-virtual/range {v20 .. v20}, La/r6;->b()La/Y4;

    move-result-object v10

    iget-object v10, v10, La/Y4;->b:Ljava/lang/String;

    invoke-virtual {v8, v10}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    :cond_28
    :goto_1d
    const/16 v15, 0x2f

    move-object/from16 v10, v17

    const/16 v15, 0x2e

    goto/16 :goto_17

    :cond_29
    const/16 v15, 0x2f

    goto :goto_1b

    :cond_2a
    instance-of v0, v8, Ljava/util/List;

    if-eqz v0, :cond_2c

    check-cast v8, Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2b

    :goto_1e
    const/4 v10, 0x0

    goto :goto_1f

    :cond_2b
    const/4 v15, 0x0

    invoke-interface {v8, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    goto :goto_1f

    :cond_2c
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_2d

    goto :goto_1e

    :cond_2d
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    :goto_1f
    move-object v0, v10

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1e

    const-string v8, "ADAPTER_FIELD located via submitUIChange refs: "

    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    filled-new-array {v13, v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, La/x1;->b([Ljava/lang/Object;)V

    goto/16 :goto_15

    :goto_20
    if-nez v8, :cond_2e

    const-string v0, "CONTACT_LIST_FIELDS FAIL adapterField on com.tencent.mm.plugin.mvvmlist.MvvmList (type structure scan empty)"

    filled-new-array {v13, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    new-instance v1, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const-string v2, "ADAPTER_FIELD_NOT_FOUND"

    const-string v3, "F004_contact_list_fields"

    const-string v4, "no RecyclerView.Adapter field in com.tencent.mm.plugin.mvvmlist.MvvmList"

    const-string v5, ""

    invoke-direct/range {v1 .. v7}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v14, La/gd;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v1

    invoke-direct/range {v14 .. v21}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    goto/16 :goto_b

    :cond_2e
    const-string v0, "putContactListFields: display="

    :try_start_7
    sget-object v10, La/w1;->p:Landroid/content/Context;

    if-eqz v10, :cond_30

    const-string v14, "dexkit_scan_cache"

    const/4 v15, 0x0

    invoke-virtual {v10, v14, v15}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v10

    if-eqz v10, :cond_30

    new-instance v14, Lorg/json/JSONObject;

    invoke-direct {v14}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v14, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v14

    invoke-virtual {v14, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v14

    invoke-virtual {v14, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v14

    invoke-interface {v10}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v10

    invoke-virtual {v14}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v10, v3, v15}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v10

    invoke-interface {v10}, Landroid/content/SharedPreferences$Editor;->apply()V

    sget-object v10, La/a5;->a:Ljava/lang/Object;

    if-eqz v10, :cond_2f

    invoke-static {v10}, La/ba;->I(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v10

    invoke-virtual {v14}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v14

    const-string v15, "toString(...)"

    invoke-static {v14, v15}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v10, v3, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_21

    :catchall_3
    move-exception v0

    goto :goto_22

    :cond_2f
    const/4 v10, 0x0

    :goto_21
    sput-object v10, La/a5;->a:Ljava/lang/Object;

    const-string v3, "DexKitCache"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_23

    :goto_22
    const-string v3, "DexKitCache: putContactListFields failed"

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    :cond_30
    :goto_23
    const-string v0, "CONTACT_LIST_FIELDS via=DEXKIT display="

    invoke-static {v0, v4, v12, v2, v11}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v13, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    iget-object v0, v1, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v9}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_31

    iget-object v0, v1, La/fd;->b:Ljava/lang/ClassLoader;

    move-object/from16 v1, v21

    invoke-static {v0, v1}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_31

    sget-object v19, La/dd;->d:La/dd;

    new-instance v0, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-string v1, "CLASS_LOAD_FAILED"

    const-string v2, "F004_contact_list_fields"

    const-string v3, "forName(com.tencent.mm.plugin.mvvmlist.MvvmList / com.tencent.mm.ui.contact.address.AddressLiveList) failed"

    const-string v4, ""

    invoke-direct/range {v0 .. v6}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v14, La/gd;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v0

    invoke-direct/range {v14 .. v21}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    goto/16 :goto_b

    :cond_31
    sget-object v1, La/cd;->a:La/cd;

    new-instance v3, La/mc;

    invoke-direct {v3, v5, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, La/mc;

    invoke-direct {v4, v6, v2}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, La/mc;

    invoke-direct {v2, v7, v8}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v2}, [La/mc;

    move-result-object v2

    invoke-static {v2}, La/ba;->E([La/mc;)Ljava/util/Map;

    move-result-object v2

    const/16 v3, 0xc

    const/4 v10, 0x0

    invoke-static {v0, v1, v10, v2, v3}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto :goto_24

    :cond_32
    sget-object v19, La/dd;->b:La/dd;

    new-instance v0, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-string v1, "DK_NOT_READY"

    const-string v2, "F004_contact_list_fields"

    const-string v3, "DkBridge not initialized"

    const-string v4, ""

    invoke-direct/range {v0 .. v6}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v14, La/gd;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v0

    invoke-direct/range {v14 .. v21}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    goto/16 :goto_b

    :goto_24
    return-object v0
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    const-string v0, "yj5.j"

    const-string v1, "com.tencent.mm.storage.e9"

    const-string v2, "null cannot be cast to non-null type kotlin.Any"

    const-string v5, "ym5.q"

    const-string v6, "com.tencent.mm.plugin.sns.ui.improve.component.h2"

    const-string v8, "RuleSystem"

    const-string v9, ""

    const-string v11, "ctx"

    move-object/from16 v12, p0

    iget v13, v12, La/id;->a:I

    packed-switch v13, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "ae4.p"

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/id;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, La/Cd;->a:La/Cd;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La/a5;->a:Ljava/lang/Object;

    if-eqz v1, :cond_1

    const-string v6, "contact_add_mask_v1"

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_1
    :goto_0
    const/4 v6, 0x0

    :goto_1
    if-nez v6, :cond_2

    :goto_2
    const/4 v9, 0x0

    goto :goto_3

    :cond_2
    const-string v1, "entryClassName"

    invoke-virtual {v6, v1, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v11, "adapterClassName"

    invoke-virtual {v6, v11, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v13, "builderClassName"

    invoke-virtual {v6, v13, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "clickListenerClassName"

    invoke-virtual {v6, v14, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v1}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v11}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v11}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v13}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v13}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v6}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v6}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_2

    :cond_3
    new-instance v9, La/a5$a;

    invoke-static {v11}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v13}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v6}, La/i9;->b(Ljava/lang/Object;)V

    invoke-direct {v9, v1, v11, v13, v6}, La/a5$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    if-eqz v9, :cond_5

    iget-object v1, v9, La/a5$a;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_4

    const/4 v1, 0x0

    :cond_4
    if-nez v1, :cond_6

    :cond_5
    const-string v1, "ah5.b0"

    :cond_6
    if-eqz v9, :cond_8

    iget-object v6, v9, La/a5$a;->c:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v11

    if-nez v11, :cond_7

    const/4 v6, 0x0

    :cond_7
    if-nez v6, :cond_9

    :cond_8
    const-string v6, "ym5.r"

    :cond_9
    if-eqz v9, :cond_c

    iget-object v11, v9, La/a5$a;->b:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v13

    if-nez v13, :cond_a

    const/4 v11, 0x0

    :cond_a
    if-nez v11, :cond_b

    goto :goto_4

    :cond_b
    move-object v5, v11

    :cond_c
    :goto_4
    if-eqz v9, :cond_e

    iget-object v11, v9, La/a5$a;->d:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v13

    if-nez v13, :cond_d

    const/4 v11, 0x0

    :cond_d
    if-nez v11, :cond_f

    :cond_e
    const-string v11, "ym5.i"

    :cond_f
    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v13

    sget-object v18, La/cd;->b:La/cd;

    if-nez v13, :cond_10

    sget-object v19, La/dd;->d:La/dd;

    new-instance v17, La/j6;

    const-string v0, "forName("

    const-string v2, ") failed"

    invoke-static {v0, v1, v2}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    const-string v4, "F004_contact_add_mask"

    const-string v6, ""

    const-string v3, "CLASS_LOAD_FAILED"

    move-object/from16 v2, v17

    invoke-direct/range {v2 .. v8}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v14, La/gd;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v14 .. v21}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    goto :goto_6

    :cond_10
    invoke-static {v0, v6}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v14

    invoke-static {v0, v5}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v15

    invoke-static {v0, v11}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v9, :cond_11

    sget-object v18, La/cd;->c:La/cd;

    :cond_11
    move-object/from16 v3, v18

    if-eqz v9, :cond_12

    const/4 v4, 0x1

    goto :goto_5

    :cond_12
    const/4 v4, 0x0

    :goto_5
    const-string v9, "CONTACT_ADD_MASK_RESOLVED entry="

    const-string v7, " builder="

    const-string v10, " adapter="

    invoke-static {v9, v1, v7, v6, v10}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " click="

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " path="

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " cache="

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v8, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {v14, v2}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La/mc;

    const-string v4, "builderClass"

    invoke-direct {v1, v4, v14}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v15, v2}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, La/mc;

    const-string v5, "adapterClass"

    invoke-direct {v4, v5, v15}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v2}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, La/mc;

    const-string v5, "clickListenerClass"

    invoke-direct {v2, v5, v0}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v4, v2}, [La/mc;

    move-result-object v0

    invoke-static {v0}, La/ba;->E([La/mc;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-static {v13, v3, v1, v0, v2}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v14

    :goto_6
    return-object v14

    :pswitch_2
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v5}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_3
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, La/Cd;->a:La/Cd;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "wx8076_locator_helper"

    invoke-virtual {v1, v3}, La/Cd;->c(Ljava/lang/String;)La/md;

    move-result-object v3

    instance-of v4, v3, La/g3;

    if-eqz v4, :cond_13

    check-cast v3, La/g3;

    goto :goto_7

    :cond_13
    const/4 v3, 0x0

    :goto_7
    const-string v4, "wx8076_conv_storage_iface"

    invoke-virtual {v1, v4}, La/Cd;->c(Ljava/lang/String;)La/md;

    move-result-object v4

    instance-of v5, v4, La/g3;

    if-eqz v5, :cond_14

    check-cast v4, La/g3;

    goto :goto_8

    :cond_14
    const/4 v4, 0x0

    :goto_8
    const-string v5, "wx8076_conv_getter"

    invoke-virtual {v1, v5}, La/Cd;->c(Ljava/lang/String;)La/md;

    move-result-object v5

    instance-of v6, v5, La/qb;

    if-eqz v6, :cond_15

    check-cast v5, La/qb;

    goto :goto_9

    :cond_15
    const/4 v5, 0x0

    :goto_9
    const-string v6, "convGetter"

    const-string v7, "helper"

    const-string v10, " getter="

    const-string v11, " iface="

    if-eqz v3, :cond_1b

    if-eqz v4, :cond_1b

    if-eqz v5, :cond_1b

    invoke-static {v3, v0}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object v3

    invoke-static {v4, v0}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object v4

    invoke-virtual {v1, v5, v0}, La/Cd;->b(La/qb;La/fd;)La/gd;

    move-result-object v1

    iget-boolean v5, v3, La/gd;->a:Z

    if-eqz v5, :cond_1b

    iget-boolean v5, v4, La/gd;->a:Z

    if-eqz v5, :cond_1b

    iget-boolean v5, v1, La/gd;->a:Z

    if-eqz v5, :cond_1b

    iget-object v0, v3, La/gd;->b:Ljava/lang/Class;

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_a

    :cond_16
    const/4 v3, 0x0

    :goto_a
    iget-object v4, v4, La/gd;->b:Ljava/lang/Class;

    if-eqz v4, :cond_17

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    goto :goto_b

    :cond_17
    const/4 v5, 0x0

    :goto_b
    iget-object v1, v1, La/gd;->f:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v13

    goto :goto_c

    :cond_18
    const/4 v13, 0x0

    :goto_c
    const-string v14, "CONV_STORAGE_RESOLVED via=RuleSystem helper="

    invoke-static {v14, v3, v11, v5, v10}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v8, v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {v4}, La/i9;->b(Ljava/lang/Object;)V

    sget-object v3, La/cd;->c:La/cd;

    invoke-static {v0, v2}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, La/mc;

    invoke-direct {v2, v7, v0}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v1, :cond_1a

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_19

    goto :goto_d

    :cond_19
    move-object v9, v0

    :cond_1a
    :goto_d
    new-instance v0, La/mc;

    invoke-direct {v0, v6, v9}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v0}, [La/mc;

    move-result-object v0

    invoke-static {v0}, La/ba;->E([La/mc;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-static {v4, v3, v1, v0, v2}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto :goto_e

    :cond_1b
    sget-object v1, La/Rb;->a:La/Rb;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0}, La/Rb;->g(Ljava/lang/ClassLoader;)La/Rb$a;

    move-result-object v0

    sget-object v1, La/cd;->b:La/cd;

    if-eqz v0, :cond_1c

    iget-object v2, v0, La/Rb$a;->b:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, La/Rb$a;->a:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v9, "CONV_STORAGE_RESOLVED via=ObfResolver helper="

    invoke-static {v9, v3, v11, v5, v10}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v0, v0, La/Rb$a;->c:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v8, v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, La/x1;->b([Ljava/lang/Object;)V

    new-instance v3, La/mc;

    invoke-direct {v3, v7, v2}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, La/mc;

    invoke-direct {v2, v6, v0}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v2}, [La/mc;

    move-result-object v0

    invoke-static {v0}, La/ba;->E([La/mc;)Ljava/util/Map;

    move-result-object v0

    const/4 v2, 0x0

    const/16 v3, 0xc

    invoke-static {v4, v1, v2, v0, v3}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto :goto_e

    :cond_1c
    sget-object v24, La/dd;->c:La/dd;

    new-instance v2, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    const-string v3, "CONV_STORAGE_UNRESOLVED"

    const-string v4, "F010_conv_storage_pair"

    const-string v5, "both RuleSystem and ObfuscatedClassResolver failed"

    const-string v6, ""

    invoke-direct/range {v2 .. v8}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v19, La/gd;

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v23, v1

    move-object/from16 v22, v2

    invoke-direct/range {v19 .. v26}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    move-object/from16 v0, v19

    :goto_e
    return-object v0

    :pswitch_4
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "zn3.t0"

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_5
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "com.tencent.mm.ui.mvvm.list.SelectContactMvvmList"

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_6
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "com.tencent.mm.storage.f9"

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_7
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/a5;->e()La/a5$e;

    move-result-object v2

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    if-eqz v2, :cond_1d

    iget-object v1, v2, La/a5$e;->c:Ljava/lang/String;

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    goto :goto_f

    :cond_1d
    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :goto_f
    return-object v0

    :pswitch_8
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_9
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, La/Rb;->a:La/Rb;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0}, La/Rb;->g(Ljava/lang/ClassLoader;)La/Rb$a;

    move-result-object v0

    if-eqz v0, :cond_1e

    iget-object v10, v0, La/Rb$a;->a:Ljava/lang/Class;

    goto :goto_10

    :cond_1e
    const/4 v10, 0x0

    :goto_10
    return-object v10

    :pswitch_a
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "zn3.o0"

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_b
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "dj4.m0"

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_c
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v6}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_d
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v6}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_e
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, La/Rb;->a:La/Rb;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0}, La/Rb;->k(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_f
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI"

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_10
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "com.tencent.mm.plugin.fts.ui.f0"

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_11
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v6}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_12
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v18, 0x0

    return-object v18

    :pswitch_13
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "com.tencent.mm.ui.FindMoreFriendsUI"

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_14
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->m:Ljava/lang/Class;

    return-object v0

    :pswitch_15
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->m:Ljava/lang/Class;

    return-object v0

    :pswitch_16
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, La/Rb;->a:La/Rb;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0}, La/Rb;->k(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_17
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "d53.b"

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_18
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v6}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_19
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "xm3.t0"

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_1a
    move-object/from16 v1, p1

    check-cast v1, La/fd;

    invoke-static {v1, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, La/Cd;->a:La/Cd;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/w1;->H()Z

    move-result v2

    const-string v3, "legacyDataItem"

    const-string v5, "FORWARD_DATA_ITEM_RESOLVED cls="

    const-string v6, "ri5.j"

    iget-object v1, v1, La/fd;->b:Ljava/lang/ClassLoader;

    if-eqz v2, :cond_24

    :try_start_1
    const-string v2, "j5.j"

    invoke-static {v2}, La/w1;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_11

    :catch_1
    sget-object v2, La/Y5;->a:La/Y5;

    :goto_11
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_22

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    sget-object v10, La/Cd;->a:La/Cd;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v7}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    if-eqz v7, :cond_21

    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v10

    const-string v11, "getDeclaredFields(...)"

    invoke-static {v10, v11}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v11, v10

    const/4 v13, 0x0

    :goto_12
    if-ge v13, v11, :cond_21

    aget-object v14, v10, v13

    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v15

    const/16 v19, 0x1

    const-class v4, Ljava/lang/String;

    invoke-static {v15, v4}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_20

    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v4

    if-nez v4, :cond_20

    goto :goto_13

    :cond_20
    add-int/lit8 v13, v13, 0x1

    goto :goto_12

    :cond_21
    const/16 v19, 0x1

    const/4 v7, 0x0

    :goto_13
    if-eqz v7, :cond_1f

    goto :goto_14

    :cond_22
    const/4 v7, 0x0

    :goto_14
    if-eqz v7, :cond_24

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, " path=DEXKIT_PRIMARY"

    invoke-static {v5, v0, v2}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v8, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v0, La/cd;->a:La/cd;

    invoke-static {v1, v6}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_23

    goto :goto_15

    :cond_23
    move-object v9, v1

    :goto_15
    new-instance v1, La/mc;

    invoke-direct {v1, v3, v9}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, La/aa;->D(La/mc;)Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0xc

    invoke-static {v7, v0, v2, v1, v3}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto :goto_17

    :cond_24
    invoke-static {v1, v0}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_25

    invoke-static {v1, v6}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :cond_25
    sget-object v2, La/cd;->b:La/cd;

    if-eqz v0, :cond_27

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v7, " path=LITERAL_FALLBACK"

    invoke-static {v5, v4, v7}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v8, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {v1, v6}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_26

    goto :goto_16

    :cond_26
    move-object v9, v1

    :goto_16
    new-instance v1, La/mc;

    invoke-direct {v1, v3, v9}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, La/aa;->D(La/mc;)Ljava/util/Map;

    move-result-object v1

    const/4 v3, 0x0

    const/16 v4, 0xc

    invoke-static {v0, v2, v3, v1, v4}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto :goto_17

    :cond_27
    sget-object v24, La/dd;->c:La/dd;

    new-instance v3, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const-string v4, "FORWARD_DATA_ITEM_NOT_FOUND"

    const-string v5, "forward_data_item"

    const-string v6, "all strategies failed"

    const-string v7, ""

    invoke-direct/range {v3 .. v9}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v19, La/gd;

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v23, v2

    move-object/from16 v22, v3

    invoke-direct/range {v19 .. v26}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    move-object/from16 v0, v19

    :goto_17
    return-object v0

    :pswitch_1b
    move-object/from16 v1, p1

    check-cast v1, La/fd;

    invoke-static {v1, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v1, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_1c
    move-object/from16 v0, p1

    check-cast v0, La/fd;

    invoke-static {v0, v11}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, La/Cd;->a:La/Cd;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "sns_recycler_adapter_v1"

    invoke-static {v1}, La/a5;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_28

    const-string v2, "classNames"

    invoke-static {v2, v1}, La/a5;->g(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v1

    goto :goto_18

    :cond_28
    sget-object v1, La/Y5;->a:La/Y5;

    :goto_18
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const-string v3, "viewHolderSuffix"

    const-string v4, "albumHelper"

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    if-nez v2, :cond_2d

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_29
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v5, La/Cd;->a:La/Cd;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v2}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    if-eqz v2, :cond_29

    goto :goto_19

    :cond_2a
    const/4 v2, 0x0

    :goto_19
    if-eqz v2, :cond_2d

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v1}, La/Be;->U(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v5, ".k"

    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    if-eqz v0, :cond_2b

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    goto :goto_1a

    :cond_2b
    const/4 v6, 0x0

    :goto_1a
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v10, "SNS_ALBUM_RESOLVED adapter="

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " helper="

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " path=DEXKIT_RULE"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v8, v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v5, La/cd;->a:La/cd;

    if-nez v0, :cond_2c

    goto :goto_1b

    :cond_2c
    move-object v9, v0

    :goto_1b
    new-instance v0, La/mc;

    invoke-direct {v0, v4, v9}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v4, 0x2e

    invoke-static {v1, v4}, La/Be;->T(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    const-string v4, ".b"

    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, La/mc;

    invoke-direct {v4, v3, v1}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v4}, [La/mc;

    move-result-object v0

    invoke-static {v0}, La/ba;->E([La/mc;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v3, 0xc

    invoke-static {v2, v5, v1, v0, v3}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto/16 :goto_1f

    :cond_2d
    const-string v1, "xc4.k"

    invoke-static {v0, v1}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "xc4.i"

    invoke-static {v0, v2}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sget-object v23, La/cd;->b:La/cd;

    if-nez v1, :cond_2e

    if-eqz v0, :cond_2f

    :cond_2e
    move-object/from16 v2, v23

    goto :goto_1c

    :cond_2f
    sget-object v24, La/dd;->c:La/dd;

    new-instance v0, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-string v1, "SNS_ALBUM_NOT_FOUND"

    const-string v2, "sns_album_classes"

    const-string v3, "all strategies failed"

    const-string v4, ""

    invoke-direct/range {v0 .. v6}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v19, La/gd;

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v22, v0

    invoke-direct/range {v19 .. v26}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    move-object/from16 v0, v19

    goto :goto_1f

    :goto_1c
    const-string v5, "SNS_ALBUM_RESOLVED helper=xc4.k adapter=xc4.i path=LITERAL_FALLBACK"

    filled-new-array {v8, v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/x1;->b([Ljava/lang/Object;)V

    if-nez v1, :cond_30

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    move-object v5, v0

    goto :goto_1d

    :cond_30
    move-object v5, v1

    :goto_1d
    if-nez v1, :cond_31

    move-object v1, v9

    :cond_31
    new-instance v6, La/mc;

    invoke-direct {v6, v4, v1}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-nez v0, :cond_32

    goto :goto_1e

    :cond_32
    move-object v9, v0

    :goto_1e
    new-instance v0, La/mc;

    const-string v1, "albumAdapter"

    invoke-direct {v0, v1, v9}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, La/mc;

    const-string v4, "zc4.b"

    invoke-direct {v1, v3, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6, v0, v1}, [La/mc;

    move-result-object v0

    invoke-static {v0}, La/ba;->E([La/mc;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v3, 0xc

    invoke-static {v5, v2, v1, v0, v3}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    :goto_1f
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
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
