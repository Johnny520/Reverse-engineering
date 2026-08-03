.class public final LIC;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LIC;

.field public static b:Ljava/util/List;

.field public static final c:Ljava/util/ArrayList;

.field public static final d:Landroid/util/LruCache;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x2d9b3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, LIC;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LIC;->a:LIC;

    sget-object v0, LKf;->a:LKf;

    sput-object v0, LIC;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, LIC;->c:Ljava/util/ArrayList;

    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    sput-object v0, LIC;->d:Landroid/util/LruCache;

    return-void
.end method

.method public static final a(LIC;LFb;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, LGC;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LGC;

    iget v1, v0, LGC;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LGC;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, LGC;

    invoke-direct {v0, p0, p1}, LGC;-><init>(LIC;LFb;)V

    :goto_0
    iget-object p0, v0, LGC;->d:Ljava/lang/Object;

    iget p1, v0, LGC;->f:I

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    :try_start_0
    invoke-static {p0}, LOj;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-wide v0, -0x2db54fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p0}, LOj;->T(Ljava/lang/Object;)V

    :try_start_1
    sget-object p0, LNs;->a:LNs;

    iput v1, v0, LGC;->f:I

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide p0, -0x16bf6fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, LNs;->e(Ljava/lang/String;LEb;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    sget-object p1, Lgc;->a:Lgc;

    if-ne p0, p1, :cond_3

    return-object p1

    :cond_3
    :goto_1
    :try_start_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, LIC;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    const-wide v0, -0x2dc97fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2dcabfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0}, Ljava/util/List;->size()I

    const-wide v0, -0x2dcb0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p0

    :catch_0
    const-wide p0, -0x2dcb7fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    const-wide p0, -0x2db4bfffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    sget-object p0, LKf;->a:LKf;

    return-object p0
.end method

.method public static final b(LIC;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;)Ljava/util/List;
    .locals 41

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v2, LEA;->a:LEA;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    move/from16 v27, v4

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    sget-object v15, LKf;->a:LKf;

    const/4 v6, 0x0

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v30, v27, 0x1

    if-ltz v27, :cond_4

    move-object/from16 v31, v5

    check-cast v31, Lio/github/cherrywechat/network/model/ThemeStoreItem;

    invoke-virtual/range {v31 .. v31}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LBA;

    iget-object v8, v8, LBA;->a:Ljava/lang/String;

    invoke-virtual/range {v31 .. v31}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    move-object v6, v7

    :cond_1
    check-cast v6, LBA;

    if-nez v6, :cond_3

    invoke-virtual/range {v31 .. v31}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v31 .. v31}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v31 .. v31}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {v31 .. v31}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getAuthor()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {v31 .. v31}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getDescription()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {v31 .. v31}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getCoverImage()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_2

    const-wide v11, -0x2db23fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    :cond_2
    move-object v11, v5

    invoke-virtual/range {v31 .. v31}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getScreenshots()Ljava/util/List;

    move-result-object v13

    invoke-virtual/range {v31 .. v31}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getPrice()D

    move-result-wide v16

    invoke-virtual/range {v31 .. v31}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getFeatured()Z

    move-result v18

    invoke-virtual/range {v31 .. v31}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getDownloadCount()I

    move-result v19

    sget-object v25, LCC;->a:LCC;

    new-instance v5, LEC;

    const-wide v20, -0x2db24fffff835L

    invoke-static/range {v20 .. v21}, LGu;->r(J)Ljava/lang/String;

    move-result-object v20

    const-wide v21, -0x2db25fffff835L

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    move-result-object v21

    const-wide v22, -0x2db26fffff835L

    invoke-static/range {v22 .. v23}, LGu;->r(J)Ljava/lang/String;

    move-result-object v22

    const v28, 0x130140

    const/16 v29, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v5 .. v29}, LEC;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;DZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LCC;ZIII)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {v31 .. v31}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    move/from16 v27, v30

    goto/16 :goto_0

    :cond_4
    invoke-static {}, Lsa;->c0()V

    throw v6

    :cond_5
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LBA;

    iget-object v7, v5, LBA;->a:Ljava/lang/String;

    iget-object v8, v5, LBA;->g:Ljava/util/ArrayList;

    invoke-interface {v1, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    if-eqz v8, :cond_7

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LDA;

    new-instance v11, Ljava/io/File;

    sget-object v12, LEA;->a:LEA;

    iget-object v10, v10, LDA;->a:Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10}, LEA;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v11, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v10

    if-eqz v10, :cond_8

    sget-object v9, LCC;->d:LCC;

    :goto_2
    move-object/from16 v36, v9

    goto :goto_4

    :cond_9
    :goto_3
    sget-object v9, LCC;->b:LCC;

    goto :goto_2

    :goto_4
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lio/github/cherrywechat/network/model/ThemeStoreItem;

    invoke-virtual {v11}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    goto :goto_5

    :cond_b
    move-object v10, v6

    :goto_5
    check-cast v10, Lio/github/cherrywechat/network/model/ThemeStoreItem;

    iget-object v9, v5, LBA;->a:Ljava/lang/String;

    iget-object v11, v5, LBA;->b:Ljava/lang/String;

    iget-object v12, v5, LBA;->c:Ljava/lang/String;

    if-eqz v10, :cond_d

    invoke-virtual {v10}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getDescription()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_c

    goto :goto_7

    :cond_c
    :goto_6
    move-object/from16 v21, v13

    goto :goto_8

    :cond_d
    :goto_7
    const-wide v13, -0x2db27fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    goto :goto_6

    :goto_8
    if-eqz v10, :cond_f

    invoke-virtual {v10}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getCoverImage()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_e

    goto :goto_a

    :cond_e
    :goto_9
    move-object/from16 v22, v13

    goto :goto_b

    :cond_f
    :goto_a
    const-wide v13, -0x2db28fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    goto :goto_9

    :goto_b
    if-eqz v10, :cond_11

    invoke-virtual {v10}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getScreenshots()Ljava/util/List;

    move-result-object v13

    if-nez v13, :cond_10

    goto :goto_c

    :cond_10
    move-object/from16 v24, v13

    goto :goto_d

    :cond_11
    :goto_c
    move-object/from16 v24, v15

    :goto_d
    if-eqz v10, :cond_12

    invoke-virtual {v10}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getPrice()D

    move-result-wide v13

    :goto_e
    move-wide/from16 v27, v13

    goto :goto_f

    :cond_12
    const-wide/16 v13, 0x0

    goto :goto_e

    :goto_f
    if-eqz v10, :cond_13

    invoke-virtual {v10}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getFeatured()Z

    move-result v13

    move/from16 v29, v13

    goto :goto_10

    :cond_13
    move/from16 v29, v4

    :goto_10
    if-eqz v10, :cond_14

    invoke-virtual {v10}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->getDownloadCount()I

    move-result v10

    move/from16 v30, v10

    goto :goto_11

    :cond_14
    move/from16 v30, v4

    :goto_11
    iget-object v10, v5, LBA;->e:Ljava/lang/String;

    iget-object v13, v5, LBA;->f:Ljava/lang/String;

    iget-object v5, v5, LBA;->d:Ljava/lang/String;

    new-instance v16, LEC;

    const v39, 0x330140

    const/16 v40, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    move-object/from16 v18, v9

    move-object/from16 v33, v5

    move-object/from16 v26, v8

    move-object/from16 v17, v9

    move-object/from16 v31, v10

    move-object/from16 v19, v11

    move-object/from16 v20, v12

    move-object/from16 v32, v13

    invoke-direct/range {v16 .. v40}, LEC;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;DZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LCC;ZIII)V

    move-object/from16 v5, v16

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_15
    const-wide v3, -0x2db29fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x2db3dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->size()I

    const-wide v3, -0x2dbc9fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_12

    :cond_16
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LCA;

    iget-object v3, v3, LCA;->a:Ljava/lang/String;

    const-wide v4, -0x2dbccfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_17

    goto/16 :goto_15

    :cond_18
    :goto_12
    const-wide v3, -0x2dbcefffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x2dbe2fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    sget-object v1, LEA;->a:LEA;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->d()LCA;

    move-result-object v1

    iget-object v3, v1, LCA;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    new-instance v7, LEC;

    iget-object v8, v1, LCA;->a:Ljava/lang/String;

    const-wide v3, -0x2dbf8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    iget-object v10, v1, LCA;->b:Ljava/lang/String;

    iget-object v11, v1, LCA;->c:Ljava/lang/String;

    iget-object v12, v1, LCA;->e:Ljava/lang/String;

    iget-object v14, v1, LCA;->f:Ljava/lang/String;

    iget-object v3, v1, LCA;->d:Ljava/lang/String;

    iget-object v4, v1, LCA;->g:Ljava/lang/String;

    iget-object v1, v1, LCA;->h:Ljava/lang/String;

    if-eqz v28, :cond_19

    sget-object v5, LCC;->e:LCC;

    :goto_13
    move-object/from16 v27, v5

    goto :goto_14

    :cond_19
    sget-object v5, LCC;->d:LCC;

    goto :goto_13

    :goto_14
    const v30, 0x30fea0

    const/16 v31, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v29, 0x0

    move-object/from16 v26, v1

    move-object/from16 v16, v3

    move-object/from16 v25, v4

    invoke-direct/range {v7 .. v31}, LEC;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;DZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LCC;ZIII)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-wide v3, -0x2dbfafffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x2db8efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x2db9cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v7, LEC;->s:LCC;

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :goto_15
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1a
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LCA;

    const-wide v4, -0x2dba6fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x2dbbafffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    iget-object v4, v3, LCA;->b:Ljava/lang/String;

    iget-object v4, v3, LCA;->a:Ljava/lang/String;

    const-wide v7, -0x2da48fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    const-wide v7, -0x2da4efffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    const-wide v4, -0x2da50fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x2da64fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x2da70fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x2da02fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    new-instance v7, LEC;

    iget-object v8, v3, LCA;->a:Ljava/lang/String;

    const-wide v4, -0x2da16fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    iget-object v10, v3, LCA;->b:Ljava/lang/String;

    iget-object v11, v3, LCA;->c:Ljava/lang/String;

    iget-object v12, v3, LCA;->e:Ljava/lang/String;

    iget-object v14, v3, LCA;->f:Ljava/lang/String;

    iget-object v4, v3, LCA;->d:Ljava/lang/String;

    iget-object v5, v3, LCA;->g:Ljava/lang/String;

    iget-object v3, v3, LCA;->h:Ljava/lang/String;

    if-eqz v28, :cond_1b

    sget-object v13, LCC;->e:LCC;

    :goto_17
    move-object/from16 v27, v13

    goto :goto_18

    :cond_1b
    sget-object v13, LCC;->d:LCC;

    goto :goto_17

    :goto_18
    const v30, 0x30fea0

    const/16 v31, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v29, 0x0

    move-object/from16 v26, v3

    move-object/from16 v16, v4

    move-object/from16 v25, v5

    invoke-direct/range {v7 .. v31}, LEC;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;DZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LCC;ZIII)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-wide v3, -0x2da18fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x2da2cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x2da38fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iget-object v3, v7, LEC;->s:LCC;

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    goto/16 :goto_16

    :cond_1c
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1d
    :goto_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_20

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LBA;

    iget-object v8, v8, LBA;->g:Ljava/util/ArrayList;

    if-eqz v8, :cond_1e

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_1e

    goto :goto_19

    :cond_1e
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LDA;

    iget-object v9, v9, LDA;->a:Ljava/lang/String;

    invoke-static {v9, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1f

    goto :goto_1a

    :cond_20
    move-object v7, v6

    :goto_1a
    check-cast v7, LBA;

    if-eqz v7, :cond_28

    iget-object v5, v7, LBA;->g:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_21
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_22

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, LDA;

    iget-object v9, v9, LDA;->a:Ljava/lang/String;

    invoke-static {v9, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_21

    goto :goto_1b

    :cond_22
    move-object v8, v6

    :goto_1b
    check-cast v8, LDA;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_23
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_24

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, LEC;

    iget-object v10, v10, LEC;->b:Ljava/lang/String;

    iget-object v11, v7, LBA;->a:Ljava/lang/String;

    invoke-static {v10, v11}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_23

    goto :goto_1c

    :cond_24
    move-object v9, v6

    :goto_1c
    move-object v10, v9

    check-cast v10, LEC;

    if-eqz v10, :cond_1a

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v5

    iget-object v11, v3, LCA;->f:Ljava/lang/String;

    iget-object v13, v3, LCA;->g:Ljava/lang/String;

    iget-object v14, v3, LCA;->h:Ljava/lang/String;

    if-eqz v8, :cond_26

    iget-object v7, v8, LDA;->b:Ljava/lang/String;

    if-nez v7, :cond_25

    goto :goto_1e

    :cond_25
    :goto_1d
    move-object v12, v7

    goto :goto_1f

    :cond_26
    :goto_1e
    iget-object v7, v3, LCA;->d:Ljava/lang/String;

    goto :goto_1d

    :goto_1f
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_27

    sget-object v3, LCC;->e:LCC;

    :goto_20
    move-object v15, v3

    goto :goto_21

    :cond_27
    sget-object v3, LCC;->d:LCC;

    goto :goto_20

    :goto_21
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v16

    const v17, 0x30febf

    invoke-static/range {v10 .. v17}, LEC;->a(LEC;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LCC;ZI)LEC;

    move-result-object v3

    invoke-virtual {v0, v5, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_16

    :cond_28
    new-instance v7, LEC;

    iget-object v8, v3, LCA;->a:Ljava/lang/String;

    iget-object v10, v3, LCA;->b:Ljava/lang/String;

    iget-object v11, v3, LCA;->c:Ljava/lang/String;

    iget-object v12, v3, LCA;->e:Ljava/lang/String;

    iget-object v14, v3, LCA;->f:Ljava/lang/String;

    iget-object v5, v3, LCA;->d:Ljava/lang/String;

    iget-object v9, v3, LCA;->g:Ljava/lang/String;

    iget-object v3, v3, LCA;->h:Ljava/lang/String;

    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_29

    sget-object v13, LCC;->e:LCC;

    :goto_22
    move-object/from16 v27, v13

    goto :goto_23

    :cond_29
    sget-object v13, LCC;->d:LCC;

    goto :goto_22

    :goto_23
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    const v30, 0x30fea2

    const/16 v31, 0x0

    move-object/from16 v25, v9

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v29, 0x0

    move-object/from16 v26, v3

    move-object/from16 v16, v5

    invoke-direct/range {v7 .. v31}, LEC;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;DZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LCC;ZIII)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_16

    :cond_2a
    new-instance v1, LWb;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, LWb;-><init>(I)V

    new-instance v2, LHC;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, LHC;-><init>(Ljava/util/Comparator;I)V

    new-instance v1, LHC;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, LHC;-><init>(Ljava/util/Comparator;I)V

    new-instance v2, LHC;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, LHC;-><init>(Ljava/util/Comparator;I)V

    invoke-static {v0, v2}, Lra;->n0(Ljava/util/List;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final c(LIC;)V
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, LIC;->c:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQC;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lhe;->a:Lhd;

    sget-object v1, LZp;->a:Lnk;

    invoke-static {v1}, LPj;->a(Lac;)LCb;

    move-result-object v1

    new-instance v2, LMC;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v2, v0, v3, v4}, LMC;-><init>(LQC;LEb;I)V

    const/4 v0, 0x3

    invoke-static {v1, v2, v0}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static d(ZLOz;)Ljava/lang/Object;
    .locals 3

    sget-object v0, LIC;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    sget-object p0, LIC;->b:Ljava/util/List;

    return-object p0

    :cond_0
    sget-object p0, Lhe;->a:Lhd;

    sget-object p0, LVc;->b:LVc;

    new-instance v0, LFC;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, LFC;-><init>(ILEb;)V

    invoke-static {p0, v0, p1}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/String;)Ljava/util/List;
    .locals 3

    :try_start_0
    sget-object v0, Lzm;->a:LAm;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v2, Lio/github/cherrywechat/network/model/ThemeStoreData;->Companion:Lio/github/cherrywechat/network/model/ThemeStoreData$Companion;

    invoke-virtual {v2}, Lio/github/cherrywechat/network/model/ThemeStoreData$Companion;->serializer()LQm;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v1

    check-cast v1, LQm;

    invoke-virtual {v0, v1, p0}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-wide v0, -0x2db04fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-class v0, Lio/github/cherrywechat/network/model/ApiResponse;

    invoke-static {v0}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v0

    invoke-virtual {v0}, LF9;->b()Ljava/lang/String;

    const-wide v0, -0x2db1ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    const/4 p0, 0x0

    :goto_0
    check-cast p0, Lio/github/cherrywechat/network/model/ApiResponse;

    sget-object v0, LKf;->a:LKf;

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v1

    if-eqz v1, :cond_1

    :goto_1
    return-object v0

    :cond_1
    invoke-virtual {p0}, Lio/github/cherrywechat/network/model/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/github/cherrywechat/network/model/ThemeStoreData;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lio/github/cherrywechat/network/model/ThemeStoreData;->getItems()Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, p0

    :cond_3
    :goto_2
    return-object v0
.end method

.method public static f(Ljava/lang/String;LCC;)V
    .locals 10

    const-wide v0, -0x2d9e2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2d9eafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LIC;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEC;

    iget-object v2, v2, LEC;->a:Ljava/lang/String;

    invoke-static {v2, p0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_1
    if-eq v1, v3, :cond_2

    sget-object p0, LIC;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, LEC;

    const/4 v8, 0x0

    const v9, 0x3bffff

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p1

    invoke-static/range {v2 .. v9}, LEC;->a(LEC;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LCC;ZI)LEC;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    sput-object v0, LIC;->b:Ljava/util/List;

    sget-object p0, LIC;->c:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LQC;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v0, -0x1a650fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1a658fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    invoke-static {v0}, LPj;->a(Lac;)LCb;

    move-result-object v0

    new-instance v1, LMC;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, p1, v2, v3}, LMC;-><init>(LQC;LEb;I)V

    const/4 p1, 0x3

    invoke-static {v0, v1, p1}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    goto :goto_2

    :cond_2
    return-void
.end method
