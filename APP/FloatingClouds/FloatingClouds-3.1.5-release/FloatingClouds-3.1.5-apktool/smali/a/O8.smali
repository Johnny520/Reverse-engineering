.class public final synthetic La/O8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, La/O8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V
    .locals 0

    .line 2
    iput p2, p0, La/O8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    const-class v2, Ljava/lang/String;

    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-string v5, "a"

    const-string v6, "getDeclaredMethods(...)"

    const-string v7, "cls"

    const-string v8, "com.tencent.mm.booter.notification.m0"

    sget-object v9, La/cd;->a:La/cd;

    const-string v11, "fh5.w0"

    const-string v12, "m"

    sget-object v13, La/cd;->c:La/cd;

    const-string v14, "null"

    const-string v15, "RuleSystem"

    const/16 v16, 0x2

    const-string v1, "getArgs(...)"

    const-string v0, "ctx"

    const/16 v18, 0x0

    const-string v10, "chain"

    move-object/from16 v19, v14

    move-object/from16 v14, p0

    move-object/from16 v21, v1

    iget v1, v14, La/O8;->a:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, La/fd;

    invoke-static {v1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "xc4.k"

    iget-object v1, v1, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v1, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, La/fd;

    invoke-static {v1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v1, v1, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v1, v11}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v23

    const-string v0, "fh5.w"

    invoke-static {v1, v0}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v24

    const-string v0, "fh5.a"

    invoke-static {v1, v0}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v25

    invoke-static {}, La/a5;->b()La/a5$d;

    move-result-object v0

    const-string v4, "adapterNames"

    const-string v5, "snapshotClass"

    const-string v6, "dataSourceClass"

    const-string v7, "ms"

    const-string v8, " time="

    const-string v10, " snapshot="

    const-string v11, " datasource="

    const-string v12, ""

    move-object/from16 v20, v1

    if-eqz v0, :cond_6

    iget-object v1, v0, La/a5$d;->a:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_6

    iget-object v0, v0, La/a5$d;->b:Ljava/lang/Object;

    move-object/from16 v22, v0

    move-object/from16 v21, v1

    invoke-static/range {v20 .. v25}, La/Cd;->j(Ljava/lang/ClassLoader;Ljava/util/List;Ljava/util/List;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)La/Hf;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    move-wide/from16 v26, v2

    sub-long v1, v16, v26

    iget-object v3, v0, La/Hf;->a:Ljava/io/Serializable;

    move-object/from16 v16, v3

    check-cast v16, Ljava/lang/Class;

    if-eqz v16, :cond_0

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v16

    move-object/from16 p1, v16

    move-object/from16 v16, v3

    move-object/from16 v3, p1

    :goto_0
    move-object/from16 p1, v12

    goto :goto_1

    :cond_0
    move-object/from16 v16, v3

    move-object/from16 v3, v19

    goto :goto_0

    :goto_1
    iget-object v12, v0, La/Hf;->b:Ljava/io/Serializable;

    move-object/from16 v17, v12

    check-cast v17, Ljava/lang/Class;

    if-eqz v17, :cond_1

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v35, v18

    move-object/from16 v18, v12

    move-object/from16 v12, v35

    goto :goto_2

    :cond_1
    move-object/from16 v18, v12

    move-object/from16 v12, v19

    :goto_2
    iget-object v0, v0, La/Hf;->c:Ljava/io/Serializable;

    move-object/from16 v28, v0

    check-cast v28, Ljava/lang/Class;

    if-eqz v28, :cond_2

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v28

    move-object/from16 v35, v28

    move-object/from16 v28, v0

    move-object/from16 v0, v35

    goto :goto_3

    :cond_2
    move-object/from16 v28, v0

    move-object/from16 v0, v19

    :goto_3
    const-string v14, "CONV_LIST_RESOLVER_REPORT feature=conv_list_classes path=DEXKIT_RULE fallback=false adapter="

    invoke-static {v14, v3, v11, v12, v10}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v15, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    if-eqz v16, :cond_7

    move-object/from16 v3, v16

    check-cast v3, Ljava/lang/Class;

    if-nez v18, :cond_3

    move-object/from16 v12, p1

    goto :goto_4

    :cond_3
    move-object/from16 v12, v18

    :goto_4
    new-instance v0, La/mc;

    invoke-direct {v0, v6, v12}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-nez v28, :cond_4

    move-object/from16 v12, p1

    goto :goto_5

    :cond_4
    move-object/from16 v12, v28

    :goto_5
    new-instance v1, La/mc;

    invoke-direct {v1, v5, v12}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v2, v21

    check-cast v2, Ljava/util/List;

    move-object/from16 v5, v22

    check-cast v5, Ljava/util/List;

    invoke-static {v2, v5}, La/t3;->q0(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    if-eqz v17, :cond_5

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    goto :goto_6

    :cond_5
    const/4 v6, 0x0

    :goto_6
    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, La/N1;->c0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-static {v2, v5}, La/t3;->q0(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v2

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v5}, La/t3;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    new-instance v5, La/mc;

    invoke-direct {v5, v4, v2}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v5}, [La/mc;

    move-result-object v0

    invoke-static {v0}, La/ba;->E([La/mc;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-static {v3, v9, v1, v0, v2}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto/16 :goto_16

    :cond_6
    move-wide/from16 v26, v2

    move-object/from16 p1, v12

    :cond_7
    const-string v0, "conv_adapter_structural_v1"

    invoke-static {v0}, La/a5;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_8

    :goto_7
    const/4 v0, 0x0

    goto :goto_8

    :cond_8
    :try_start_0
    new-instance v28, La/a5$d;

    const-string v1, "adapterClassNames"

    invoke-static {v1, v0}, La/a5;->g(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v29

    const-string v1, "dataSourceClassNames"

    invoke-static {v1, v0}, La/a5;->g(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v30

    sget-object v31, La/Y5;->a:La/Y5;

    move-object/from16 v32, v31

    move-object/from16 v33, v31

    move-object/from16 v34, v31

    invoke-direct/range {v28 .. v34}, La/a5$d;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, v28

    goto :goto_8

    :catchall_0
    move-exception v0

    const-string v1, "DexKitCache: parse ConvAdapterStructural failed"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    goto :goto_7

    :goto_8
    if-eqz v0, :cond_f

    iget-object v1, v0, La/a5$d;->a:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_f

    iget-object v0, v0, La/a5$d;->b:Ljava/lang/Object;

    move-object/from16 v22, v0

    move-object/from16 v21, v1

    invoke-static/range {v20 .. v25}, La/Cd;->j(Ljava/lang/ClassLoader;Ljava/util/List;Ljava/util/List;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)La/Hf;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v2, v2, v26

    iget-object v9, v0, La/Hf;->a:Ljava/io/Serializable;

    move-object v12, v9

    check-cast v12, Ljava/lang/Class;

    if-eqz v12, :cond_9

    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    goto :goto_9

    :cond_9
    move-object/from16 v12, v19

    :goto_9
    iget-object v14, v0, La/Hf;->b:Ljava/io/Serializable;

    move-object/from16 v16, v14

    check-cast v16, Ljava/lang/Class;

    if-eqz v16, :cond_a

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v35, v17

    move-object/from16 v17, v9

    move-object/from16 v9, v35

    goto :goto_a

    :cond_a
    move-object/from16 v17, v9

    move-object/from16 v9, v19

    :goto_a
    iget-object v0, v0, La/Hf;->c:Ljava/io/Serializable;

    move-object/from16 v18, v0

    check-cast v18, Ljava/lang/Class;

    if-eqz v18, :cond_b

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v20, v18

    move-object/from16 v18, v0

    move-object/from16 v0, v20

    :goto_b
    move-object/from16 v20, v14

    goto :goto_c

    :cond_b
    move-object/from16 v18, v0

    move-object/from16 v0, v19

    goto :goto_b

    :goto_c
    const-string v14, "CONV_LIST_RESOLVER_REPORT feature=conv_list_classes path=DEXKIT_STRUCTURAL fallback=false adapter="

    invoke-static {v14, v12, v11, v9, v10}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v15, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    if-eqz v17, :cond_10

    move-object/from16 v9, v17

    check-cast v9, Ljava/lang/Class;

    if-nez v20, :cond_c

    move-object/from16 v14, p1

    goto :goto_d

    :cond_c
    move-object/from16 v14, v20

    :goto_d
    new-instance v0, La/mc;

    invoke-direct {v0, v6, v14}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-nez v18, :cond_d

    move-object/from16 v12, p1

    goto :goto_e

    :cond_d
    move-object/from16 v12, v18

    :goto_e
    new-instance v1, La/mc;

    invoke-direct {v1, v5, v12}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v2, v21

    check-cast v2, Ljava/util/List;

    move-object/from16 v3, v22

    check-cast v3, Ljava/util/List;

    invoke-static {v2, v3}, La/t3;->q0(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    if-eqz v16, :cond_e

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    goto :goto_f

    :cond_e
    const/4 v5, 0x0

    :goto_f
    filled-new-array {v3, v5}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, La/N1;->c0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-static {v2, v3}, La/t3;->q0(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v3}, La/t3;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    new-instance v3, La/mc;

    invoke-direct {v3, v4, v2}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v3}, [La/mc;

    move-result-object v0

    invoke-static {v0}, La/ba;->E([La/mc;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-static {v9, v13, v1, v0, v2}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto/16 :goto_16

    :cond_f
    move-object/from16 v1, v23

    :cond_10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v2, v2, v26

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_10

    :cond_11
    move-object/from16 v0, v19

    :goto_10
    if-eqz v24, :cond_12

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    goto :goto_11

    :cond_12
    move-object/from16 v9, v19

    :goto_11
    if-eqz v25, :cond_13

    invoke-virtual/range {v25 .. v25}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v14

    goto :goto_12

    :cond_13
    move-object/from16 v14, v19

    :goto_12
    const-string v12, "CONV_LIST_RESOLVER_REPORT feature=conv_list_classes path=LITERAL_FALLBACK fallback=true adapter="

    invoke-static {v12, v0, v11, v9, v10}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v15, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v11, La/cd;->b:La/cd;

    if-eqz v1, :cond_17

    if-nez v24, :cond_14

    move-object/from16 v0, p1

    goto :goto_13

    :cond_14
    move-object/from16 v0, v24

    :goto_13
    new-instance v2, La/mc;

    invoke-direct {v2, v6, v0}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-nez v25, :cond_15

    move-object/from16 v0, p1

    goto :goto_14

    :cond_15
    move-object/from16 v0, v25

    :goto_14
    new-instance v3, La/mc;

    invoke-direct {v3, v5, v0}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v25

    if-eqz v24, :cond_16

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v26, v0

    goto :goto_15

    :cond_16
    const/16 v26, 0x0

    :goto_15
    const-string v30, "va5.a"

    const-string v31, "lr.f1"

    const-string v27, "bm3.m"

    const-string v28, "sc3.x"

    const-string v29, "sc3.x3"

    filled-new-array/range {v25 .. v31}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/N1;->c0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v5, La/mc;

    invoke-direct {v5, v4, v0}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v5}, [La/mc;

    move-result-object v0

    invoke-static {v0}, La/ba;->E([La/mc;)Ljava/util/Map;

    move-result-object v0

    const/4 v2, 0x0

    const/16 v3, 0xc

    invoke-static {v1, v11, v2, v0, v3}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto :goto_16

    :cond_17
    sget-object v12, La/dd;->c:La/dd;

    new-instance v0, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-string v1, "CONV_LIST_NOT_FOUND"

    const-string v2, "conv_list_classes"

    const-string v3, "all resolution strategies failed"

    const-string v4, ""

    invoke-direct/range {v0 .. v6}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v7, La/gd;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v10, v0

    invoke-direct/range {v7 .. v14}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    move-object v0, v7

    :goto_16
    return-object v0

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, La/fd;

    invoke-static {v1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v11}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, La/fd;

    invoke-static {v1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La/a5;->a:Ljava/lang/Object;

    const-string v2, "notification_precheck"

    if-eqz v0, :cond_18

    const-string v3, "rule_class_"

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_17

    :cond_18
    const/4 v0, 0x0

    :goto_17
    const/16 v3, 0x1c

    iget-object v1, v1, La/fd;->b:Ljava/lang/ClassLoader;

    if-eqz v0, :cond_19

    invoke-static {v1, v0}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_19

    const/4 v4, 0x0

    invoke-static {v0, v13, v4, v4, v3}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto/16 :goto_1a

    :cond_19
    const/4 v4, 0x0

    invoke-static {}, La/w1;->H()Z

    move-result v0

    const-string v5, "NOTIFICATION_PRECHECK_RESOLVED cls="

    if-eqz v0, :cond_1c

    :try_start_1
    const-string v0, "preTalkerMute"

    invoke-static {v0, v4}, La/w1;->r(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_18

    :catch_0
    sget-object v0, La/Y5;->a:La/Y5;

    :goto_18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    sget-object v6, La/Cd;->a:La/Cd;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v4}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    if-eqz v4, :cond_1a

    goto :goto_19

    :cond_1b
    const/4 v4, 0x0

    :goto_19
    if-eqz v4, :cond_1c

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, La/a5;->h(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, " via=DkBridge(string)"

    invoke-static {v5, v0, v1}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v15, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-static {v4, v9, v1, v1, v3}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto :goto_1a

    :cond_1c
    invoke-static {v1, v8}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sget-object v10, La/cd;->b:La/cd;

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " via=LITERAL_FALLBACK"

    invoke-static {v5, v1, v2}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v15, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-static {v0, v10, v1, v1, v3}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto :goto_1a

    :cond_1d
    sget-object v11, La/dd;->c:La/dd;

    new-instance v0, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-string v1, "NOTIFICATION_PRECHECK_NOT_FOUND"

    const-string v2, "notification_precheck"

    const-string v3, "no notification precheck class found"

    const-string v4, ""

    invoke-direct/range {v0 .. v6}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v6, La/gd;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, v0

    invoke-direct/range {v6 .. v13}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    move-object v0, v6

    :goto_1a
    return-object v0

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, La/fd;

    invoke-static {v1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/a5;->e()La/a5$e;

    move-result-object v0

    sget-object v6, La/cd;->b:La/cd;

    if-nez v0, :cond_1e

    sget-object v7, La/dd;->c:La/dd;

    new-instance v5, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    const-string v9, "MSG_STORAGE_CACHE_EMPTY"

    const-string v10, "F017_msg_storage"

    const-string v11, "DexKitCache.getMsgStorageInfo() returned null (scan not completed)"

    const-string v12, ""

    move-object v8, v5

    invoke-direct/range {v8 .. v14}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v2, La/gd;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v9}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    goto/16 :goto_1b

    :cond_1e
    iget-object v2, v0, La/a5$e;->a:Ljava/lang/String;

    iget-object v1, v1, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v1, v2}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    if-nez v3, :cond_1f

    sget-object v7, La/dd;->d:La/dd;

    new-instance v5, La/j6;

    const-string v0, "forName("

    const-string v1, ") failed"

    invoke-static {v0, v2, v1}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    const-string v10, "F017_msg_storage"

    const-string v12, ""

    const-string v9, "CLASS_LOAD_FAILED"

    move-object v8, v5

    invoke-direct/range {v8 .. v14}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v2, La/gd;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v9}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    goto :goto_1b

    :cond_1f
    iget-object v4, v0, La/a5$e;->c:Ljava/lang/String;

    invoke-static {v1, v4}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "MSG_STORAGE_RESOLVED storage="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " method="

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, La/a5$e;->b:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " msgInfo="

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v15, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->b([Ljava/lang/Object;)V

    const-string v2, "null cannot be cast to non-null type kotlin.Any"

    invoke-static {v1, v2}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, La/mc;

    const-string v4, "msgInfoClass"

    invoke-direct {v2, v4, v1}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, La/mc;

    const-string v4, "insertMethod"

    invoke-direct {v1, v4, v0}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v1}, [La/mc;

    move-result-object v0

    invoke-static {v0}, La/ba;->E([La/mc;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-static {v3, v13, v1, v0, v2}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v2

    :goto_1b
    return-object v2

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, La/fd;

    invoke-static {v1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v0, v8}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, La/fd;

    invoke-static {v1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "com.tencent.mm.storage.f9"

    iget-object v1, v1, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {v1, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_6
    move-object/from16 v0, p1

    check-cast v0, La/gd;

    if-nez v0, :cond_20

    const-string v0, "NA"

    goto :goto_1f

    :cond_20
    iget-object v1, v0, La/gd;->b:Ljava/lang/Class;

    if-eqz v1, :cond_21

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v14

    goto :goto_1d

    :cond_21
    iget-object v1, v0, La/gd;->f:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_23

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "#"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_22

    goto :goto_1c

    :cond_22
    move-object v14, v1

    goto :goto_1d

    :cond_23
    :goto_1c
    move-object/from16 v14, v19

    :goto_1d
    iget-boolean v1, v0, La/gd;->a:Z

    if-eqz v1, :cond_24

    const-string v1, "ok"

    goto :goto_1e

    :cond_24
    const-string v1, "fail"

    :goto_1e
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "|"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, La/gd;->d:La/cd;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1f
    return-object v0

    :pswitch_7
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0, v7}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v6}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    move/from16 v2, v18

    :goto_20
    if-ge v2, v1, :cond_27

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_25

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v6

    invoke-static {v6, v4}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_25

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    array-length v3, v3

    const/4 v6, 0x1

    if-ne v3, v6, :cond_26

    move v10, v6

    goto :goto_21

    :cond_25
    const/4 v6, 0x1

    :cond_26
    add-int/2addr v2, v6

    goto :goto_20

    :cond_27
    move/from16 v10, v18

    :goto_21
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_8
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0, v7}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v6}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    move/from16 v5, v18

    :goto_22
    if-ge v5, v1, :cond_29

    aget-object v6, v0, v5

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v7

    invoke-static {v7, v3}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_28

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    array-length v7, v7

    const/4 v8, 0x4

    if-ne v7, v8, :cond_28

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    aget-object v7, v7, v18

    invoke-static {v7, v2}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_28

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    const/16 v20, 0x1

    aget-object v7, v7, v20

    invoke-static {v7, v4}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_28

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    aget-object v7, v7, v16

    invoke-static {v7, v4}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_28

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    const/4 v7, 0x3

    aget-object v6, v6, v7

    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v7}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_28

    const/4 v10, 0x1

    goto :goto_23

    :cond_28
    const/16 v20, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_22

    :cond_29
    move/from16 v10, v18

    :goto_23
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_9
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-static {v0, v12}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v4, "x"

    invoke-static {v1, v4}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v4, "p"

    invoke-static {v1, v4}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2b

    :cond_2a
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    array-length v1, v1

    const/4 v6, 0x1

    if-ne v1, v6, :cond_2b

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    aget-object v1, v1, v18

    invoke-static {v1, v2}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2b

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-nez v1, :cond_2b

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, v3}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2b

    const/4 v10, 0x1

    goto :goto_24

    :cond_2b
    move/from16 v10, v18

    :goto_24
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_a
    const/4 v1, 0x0

    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v2

    move-object/from16 v3, v21

    invoke-static {v2, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v3, v18

    invoke-static {v2, v3}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2c

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_29

    :cond_2c
    const-string v3, "userName:"

    const-string v4, "userName"

    const-string v5, "talker"

    const-string v6, "h"

    const-string v7, "f74979h"

    filled-new-array {v6, v7, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :catch_1
    :cond_2d
    :goto_25
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_30

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v5, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/lang/String;

    if-eqz v6, :cond_2e

    check-cast v5, Ljava/lang/String;

    goto :goto_26

    :cond_2e
    move-object v5, v1

    :goto_26
    if-eqz v5, :cond_2d

    invoke-static {v5}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v6
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_1

    if-eqz v6, :cond_2f

    goto :goto_25

    :cond_2f
    move-object v10, v5

    goto :goto_28

    :cond_30
    :try_start_3
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_32

    const-string v4, "<this>"

    invoke-static {v2, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "missingDelimiterValue"

    invoke-static {v2, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v5, v4}, La/Be;->N(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_31

    goto :goto_27

    :cond_31
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "substring(...)"

    invoke-static {v2, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_27
    invoke-static {v2}, La/Be;->V(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-nez v3, :cond_32

    move-object v10, v2

    goto :goto_28

    :catchall_1
    :cond_32
    move-object v10, v1

    :goto_28
    if-eqz v10, :cond_33

    sget-object v1, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v10}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_33

    sget-object v1, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v1

    if-nez v1, :cond_33

    const-string v0, "[MuteNotifPart] SUPPRESS notification for masked user="

    const-string v1, " (a.a fallback)"

    invoke-static {v0, v10, v1}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v6, 0x1

    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    const/16 v17, -0x1

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_29

    :cond_33
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    :goto_29
    return-object v0

    :pswitch_b
    move-object/from16 v3, v21

    const/4 v1, 0x0

    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-static {v2, v3}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_34

    move-object v10, v2

    check-cast v10, Ljava/lang/String;

    goto :goto_2a

    :cond_34
    move-object v10, v1

    :goto_2a
    if-eqz v10, :cond_35

    sget-object v1, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v10}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_35

    sget-object v1, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v1

    if-nez v1, :cond_35

    const-string v0, "[MuteNotifPart] SUPPRESS notification for masked user="

    const-string v1, " (m0.b)"

    invoke-static {v0, v10, v1}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v6, 0x1

    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_2b

    :cond_35
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    :goto_2b
    return-object v0

    :pswitch_c
    move-object/from16 v3, v21

    const/4 v1, 0x0

    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    :try_start_4
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, La/t3;->n0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_36

    goto :goto_2e

    :cond_36
    const-string v3, "field_talker"

    invoke-static {v0, v3}, La/A1;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_37

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    goto :goto_2c

    :cond_37
    move-object v10, v1

    :goto_2c
    if-eqz v10, :cond_3c

    invoke-static {v10}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_38

    goto :goto_2e

    :cond_38
    sget-object v1, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v10}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_39

    goto :goto_2e

    :cond_39
    const-string v1, "field_isSend"

    invoke-static {v0, v1}, La/A1;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_3a

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_2d

    :cond_3a
    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_3b

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-eqz v0, :cond_3b

    const/4 v0, 0x1

    goto :goto_2d

    :cond_3b
    const/4 v0, 0x0

    :goto_2d
    sget-object v1, La/ca;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, La/ca$a$b;

    invoke-direct {v1, v10, v0}, La/ca$a$b;-><init>(Ljava/lang/String;Z)V

    invoke-static {v1}, La/ca;->a(La/ca$a;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    :cond_3c
    :goto_2e
    return-object v2

    :pswitch_d
    const/4 v1, 0x0

    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "FC_DEBUG"

    const-string v3, "MaskUIManager: SettingsCareModeIntro.initView FIRED!"

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Landroid/app/Activity;

    if-eqz v3, :cond_3d

    move-object v10, v0

    check-cast v10, Landroid/app/Activity;

    goto :goto_2f

    :cond_3d
    move-object v10, v1

    :goto_2f
    if-nez v10, :cond_3e

    goto :goto_30

    :cond_3e
    const v0, 0x1020002

    invoke-virtual {v10, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-nez v0, :cond_3f

    goto :goto_30

    :cond_3f
    new-instance v1, La/Rc;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v3, La/V7;

    const/4 v6, 0x1

    invoke-direct {v3, v1, v10, v6}, La/V7;-><init>(La/Rc;Landroid/app/Activity;I)V

    invoke-static {v0, v3}, La/ta;->a(Landroid/view/ViewGroup;La/V7;)V

    iget v0, v1, La/Rc;->a:I

    const-string v1, "MaskUIManager: "

    const-string v3, " long-click views"

    invoke-static {v0, v1, v3}, La/z;->c(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :goto_30
    return-object v2

    :pswitch_e
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_f
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-static {v0, v12}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "setOnItemLongClickListener"

    invoke-static {v1, v2}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_40

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    const/4 v6, 0x1

    if-ne v0, v6, :cond_40

    const/4 v10, 0x1

    goto :goto_31

    :cond_40
    const/4 v10, 0x0

    :goto_31
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_10
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, La/R8;->h(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_11
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, La/R8;->h(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_12
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, La/R8;->g(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_13
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, La/R8;->g(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_14
    move-object/from16 v3, v21

    const/4 v1, 0x0

    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x1

    invoke-static {v2, v6}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Landroid/app/Notification;

    if-eqz v3, :cond_41

    check-cast v2, Landroid/app/Notification;

    goto :goto_32

    :cond_41
    move-object v2, v1

    :goto_32
    if-eqz v2, :cond_42

    invoke-static {}, La/bh;->b()Z

    move-result v3

    if-eqz v3, :cond_42

    invoke-static {v2}, La/R8;->q(Landroid/app/Notification;)Z

    move-result v2

    if-eqz v2, :cond_42

    const-string v0, "intercept Service.startForeground"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    move-object v10, v1

    goto :goto_33

    :cond_42
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v10

    :goto_33
    return-object v10

    :pswitch_15
    move-object/from16 v3, v21

    const/4 v1, 0x0

    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x1

    invoke-static {v2, v6}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Landroid/os/Bundle;

    if-eqz v3, :cond_43

    check-cast v2, Landroid/os/Bundle;

    goto :goto_34

    :cond_43
    move-object v2, v1

    :goto_34
    if-eqz v2, :cond_45

    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v3

    if-eqz v3, :cond_45

    new-instance v4, La/Q8;

    const/4 v5, 0x0

    invoke-direct {v4, v2, v5}, La/Q8;-><init>(Landroid/os/Bundle;I)V

    const/16 v5, 0x1e

    const-string v6, ", "

    invoke-static {v3, v6, v4, v5}, La/t3;->p0(Ljava/util/Collection;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_44

    goto :goto_35

    :cond_44
    move-object v14, v3

    goto :goto_36

    :cond_45
    :goto_35
    move-object/from16 v14, v19

    :goto_36
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "TelecomManager.addNewIncomingCall extras={"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "}"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, La/R8;->r(Ljava/lang/String;)V

    if-nez v2, :cond_46

    move-object v2, v1

    goto :goto_38

    :cond_46
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v3

    const-string v4, "keySet(...)"

    invoke-static {v3, v4}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, La/M1;

    const/4 v6, 0x1

    invoke-direct {v4, v6, v3}, La/M1;-><init>(ILjava/lang/Object;)V

    new-instance v3, La/Q8;

    invoke-direct {v3, v2, v6}, La/Q8;-><init>(Landroid/os/Bundle;I)V

    new-instance v2, La/Bf;

    invoke-direct {v2, v4, v3}, La/Bf;-><init>(La/M1;La/D7;)V

    new-instance v3, La/kd;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, La/kd;-><init>(I)V

    new-instance v4, La/x6;

    invoke-direct {v4, v2, v3}, La/x6;-><init>(La/Bf;La/kd;)V

    new-instance v2, La/x6$a;

    invoke-direct {v2, v4}, La/x6$a;-><init>(La/x6;)V

    :cond_47
    invoke-virtual {v2}, La/x6$a;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_48

    invoke-virtual {v2}, La/x6$a;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, La/yh;->a(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_47

    goto :goto_37

    :cond_48
    move-object v3, v1

    :goto_37
    move-object v2, v3

    check-cast v2, Ljava/lang/String;

    :goto_38
    if-nez v2, :cond_4a

    invoke-static {}, La/bh;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_49

    sget-object v3, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v2}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_49

    goto :goto_39

    :cond_49
    move-object v2, v1

    :cond_4a
    :goto_39
    if-eqz v2, :cond_4b

    sget-object v3, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v2}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4b

    const-string v0, "intercept TelecomManager.addNewIncomingCall for blacklisted user="

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    invoke-static {v2}, La/bh;->g(Ljava/lang/String;)V

    move-object v10, v1

    goto :goto_3a

    :cond_4b
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v10

    :goto_3a
    return-object v10

    :pswitch_16
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, La/R8;->g(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_17
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, La/R8;->g(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_18
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, La/R8;->g(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_19
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, La/R8;->g(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1a
    move-object/from16 v3, v21

    const/4 v1, 0x0

    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v3, v16

    invoke-static {v2, v3}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Landroid/content/Intent;

    if-eqz v3, :cond_4c

    move-object v10, v2

    check-cast v10, Landroid/content/Intent;

    goto :goto_3b

    :cond_4c
    move-object v10, v1

    :goto_3b
    if-eqz v10, :cond_4d

    invoke-static {v10}, La/R8;->t(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_4d

    invoke-virtual {v10}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "intercept IActivityTaskManager.startActivity intent="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    const/16 v18, 0x0

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_3c

    :cond_4d
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    :goto_3c
    return-object v0

    :pswitch_1b
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-static {v0, v12}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4e

    const-string v2, "b"

    invoke-static {v1, v2}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4f

    :cond_4e
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    const/4 v6, 0x1

    if-lt v0, v6, :cond_4f

    move v10, v6

    goto :goto_3d

    :cond_4f
    move/from16 v10, v18

    :goto_3d
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1c
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v10}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, La/R8;->f(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

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
