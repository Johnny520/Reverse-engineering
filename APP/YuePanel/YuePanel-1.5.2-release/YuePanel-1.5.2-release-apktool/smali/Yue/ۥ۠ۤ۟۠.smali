.class public LYue/ۥ۠ۤ۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:Z

.field public static final ۥ۟:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06df\u06e2;",
            "I",
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06e2\u06e5\u06e3\u06df;",
            ">;",
            "LYue/\u06e5\u06e2\u06e5\u06e3\u06df;",
            ")",
            "LYue/\u06e5\u06e2\u06e5\u06e3\u06df;"
        }
    .end annotation

    if-nez p1, :cond_0

    iget v0, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۦۦ:I

    goto :goto_0

    :cond_0
    iget v0, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۦۧ:I

    :goto_0
    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_4

    if-eqz p3, :cond_1

    iget v3, p3, LYue/ۥۢۥۣ۟;->ۥ۟:I

    if-eq v0, v3, :cond_4

    :cond_1
    move v3, v1

    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_5

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYue/ۥۢۥۣ۟;

    invoke-virtual {v4}, LYue/ۥۢۥۣ۟;->ۥ۟۟۟۠()I

    move-result v5

    if-ne v5, v0, :cond_3

    if-eqz p3, :cond_2

    invoke-virtual {p3, p1, v4}, LYue/ۥۢۥۣ۟;->ۥ۟۟۟ۧ(ILYue/ۥۢۥۣ۟;)V

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_2
    move-object p3, v4

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    if-eq v0, v2, :cond_5

    return-object p3

    :cond_5
    :goto_2
    if-nez p3, :cond_9

    instance-of v0, p0, LYue/ۥ۠ۤۤۡ;

    if-eqz v0, :cond_7

    move-object v0, p0

    check-cast v0, LYue/ۥ۠ۤۤۡ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۤۡ;->ۥ۟۠ۡۧ(I)I

    move-result v0

    if-eq v0, v2, :cond_7

    move v2, v1

    :goto_3
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_7

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۢۥۣ۟;

    invoke-virtual {v3}, LYue/ۥۢۥۣ۟;->ۥ۟۟۟۠()I

    move-result v4

    if-ne v4, v0, :cond_6

    move-object p3, v3

    goto :goto_4

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    if-nez p3, :cond_8

    new-instance p3, LYue/ۥۢۥۣ۟;

    invoke-direct {p3, p1}, LYue/ۥۢۥۣ۟;-><init>(I)V

    :cond_8
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-virtual {p3, p0}, LYue/ۥۢۥۣ۟;->ۥ(LYue/ۥ۟ۧ۟ۢ;)Z

    move-result v0

    if-eqz v0, :cond_d

    instance-of v0, p0, LYue/ۥ۠ۤ۟ۧ;

    if-eqz v0, :cond_b

    move-object v0, p0

    check-cast v0, LYue/ۥ۠ۤ۟ۧ;

    invoke-virtual {v0}, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠ۡۧ()LYue/ۥ۟ۧ۟۠;

    move-result-object v2

    invoke-virtual {v0}, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠ۡۨ()I

    move-result v0

    if-nez v0, :cond_a

    const/4 v1, 0x1

    :cond_a
    invoke-virtual {v2, v1, p2, p3}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟(ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)V

    :cond_b
    if-nez p1, :cond_c

    invoke-virtual {p3}, LYue/ۥۢۥۣ۟;->ۥ۟۟۟۠()I

    move-result v0

    iput v0, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۦۦ:I

    iget-object v0, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۡۨ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟(ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)V

    iget-object v0, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢ۟:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟(ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)V

    goto :goto_5

    :cond_c
    invoke-virtual {p3}, LYue/ۥۢۥۣ۟;->ۥ۟۟۟۠()I

    move-result v0

    iput v0, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۦۧ:I

    iget-object v0, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟(ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)V

    iget-object v0, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۡ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟(ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)V

    iget-object v0, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢ۠:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟(ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)V

    :goto_5
    iget-object p0, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۤ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟(ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)V

    :cond_d
    return-object p3
.end method

.method public static ۥ۟(Ljava/util/ArrayList;I)LYue/ۥۢۥۣ۟;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06e2\u06e5\u06e3\u06df;",
            ">;I)",
            "LYue/\u06e5\u06e2\u06e5\u06e3\u06df;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۥۣ۟;

    iget v3, v2, LYue/ۥۢۥۣ۟;->ۥ۟:I

    if-ne p1, v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۥ۟۟(LYue/ۥۣ۟ۧ۟;LYue/ۥ۟ۢۦۤ$ۥ۟;)Z
    .locals 16

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, LYue/ۥۢۥۣ;->ۥ۟۠ۡۧ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_2

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۟ۧ۟ۢ;

    invoke-virtual/range {p0 .. p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۡۦ()LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۤ()LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    move-result-object v7

    invoke-virtual {v5}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۡۦ()LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    move-result-object v8

    invoke-virtual {v5}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۤ()LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    move-result-object v9

    invoke-static {v6, v7, v8, v9}, LYue/ۥ۠ۤ۟۠;->ۥ۟۟۟(LYue/ۥ۟ۧ۟ۢ$ۥ۟;LYue/ۥ۟ۧ۟ۢ$ۥ۟;LYue/ۥ۟ۧ۟ۢ$ۥ۟;LYue/ۥ۟ۧ۟ۢ$ۥ۟;)Z

    move-result v6

    if-nez v6, :cond_0

    return v3

    :cond_0
    instance-of v5, v5, LYue/ۥۣ۠ۢ۠;

    if-eqz v5, :cond_1

    return v3

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iget-object v4, v0, LYue/ۥۣ۟ۧ۟;->ۥ۟۠۟ۧ:LYue/ۥۡۡۡۦ;

    if-eqz v4, :cond_3

    iget-wide v5, v4, LYue/ۥۡۡۡۦ;->ۥ۟۟ۢۤ:J

    const-wide/16 v7, 0x1

    add-long/2addr v5, v7

    iput-wide v5, v4, LYue/ۥۡۡۡۦ;->ۥ۟۟ۢۤ:J

    :cond_3
    move v5, v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_1
    const/4 v12, 0x1

    if-ge v5, v2, :cond_14

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LYue/ۥ۟ۧ۟ۢ;

    invoke-virtual/range {p0 .. p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۡۦ()LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۤ()LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    move-result-object v15

    invoke-virtual {v13}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۡۦ()LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    move-result-object v3

    invoke-virtual {v13}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۤ()LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    move-result-object v4

    invoke-static {v14, v15, v3, v4}, LYue/ۥ۠ۤ۟۠;->ۥ۟۟۟(LYue/ۥ۟ۧ۟ۢ$ۥ۟;LYue/ۥ۟ۧ۟ۢ$ۥ۟;LYue/ۥ۟ۧ۟ۢ$ۥ۟;LYue/ۥ۟ۧ۟ۢ$ۥ۟;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, v0, LYue/ۥۣ۟ۧ۟;->ۥ۟۠ۢ:LYue/ۥ۟ۢۦۤ$ۥ;

    sget v4, LYue/ۥ۟ۢۦۤ$ۥ;->ۥ۟۟۟ۥ:I

    move-object/from16 v14, p1

    invoke-static {v13, v14, v3, v4}, LYue/ۥۣ۟ۧ۟;->ۥ۟۠ۤۦ(LYue/ۥ۟ۧ۟ۢ;LYue/ۥ۟ۢۦۤ$ۥ۟;LYue/ۥ۟ۢۦۤ$ۥ;I)Z

    goto :goto_2

    :cond_4
    move-object/from16 v14, p1

    :goto_2
    instance-of v3, v13, LYue/ۥ۠ۤ۟ۧ;

    if-eqz v3, :cond_8

    move-object v4, v13

    check-cast v4, LYue/ۥ۠ۤ۟ۧ;

    invoke-virtual {v4}, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠ۡۨ()I

    move-result v15

    if-nez v15, :cond_6

    if-nez v8, :cond_5

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :cond_5
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-virtual {v4}, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠ۡۨ()I

    move-result v15

    if-ne v15, v12, :cond_8

    if-nez v6, :cond_7

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    :cond_7
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    instance-of v4, v13, LYue/ۥ۠ۤۤۡ;

    if-eqz v4, :cond_f

    instance-of v4, v13, LYue/ۥ۟ۢۤۧ;

    if-eqz v4, :cond_c

    move-object v4, v13

    check-cast v4, LYue/ۥ۟ۢۤۧ;

    invoke-virtual {v4}, LYue/ۥ۟ۢۤۧ;->ۥ۟۠ۢۡ()I

    move-result v15

    if-nez v15, :cond_a

    if-nez v7, :cond_9

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :cond_9
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-virtual {v4}, LYue/ۥ۟ۢۤۧ;->ۥ۟۠ۢۡ()I

    move-result v15

    if-ne v15, v12, :cond_f

    if-nez v9, :cond_b

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    :cond_b
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_c
    move-object v4, v13

    check-cast v4, LYue/ۥ۠ۤۤۡ;

    if-nez v7, :cond_d

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :cond_d
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v9, :cond_e

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    :cond_e
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    :goto_3
    iget-object v4, v13, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۡۨ:LYue/ۥ۟ۧ۟۠;

    iget-object v4, v4, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۠:LYue/ۥ۟ۧ۟۠;

    if-nez v4, :cond_11

    iget-object v4, v13, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢ۟:LYue/ۥ۟ۧ۟۠;

    iget-object v4, v4, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۠:LYue/ۥ۟ۧ۟۠;

    if-nez v4, :cond_11

    if-nez v3, :cond_11

    instance-of v4, v13, LYue/ۥ۟ۢۤۧ;

    if-nez v4, :cond_11

    if-nez v10, :cond_10

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    :cond_10
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    iget-object v4, v13, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢ:LYue/ۥ۟ۧ۟۠;

    iget-object v4, v4, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۠:LYue/ۥ۟ۧ۟۠;

    if-nez v4, :cond_13

    iget-object v4, v13, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢ۠:LYue/ۥ۟ۧ۟۠;

    iget-object v4, v4, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۠:LYue/ۥ۟ۧ۟۠;

    if-nez v4, :cond_13

    iget-object v4, v13, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۡ:LYue/ۥ۟ۧ۟۠;

    iget-object v4, v4, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۠:LYue/ۥ۟ۧ۟۠;

    if-nez v4, :cond_13

    if-nez v3, :cond_13

    instance-of v3, v13, LYue/ۥ۟ۢۤۧ;

    if-nez v3, :cond_13

    if-nez v11, :cond_12

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :cond_12
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    add-int/lit8 v5, v5, 0x1

    const/4 v3, 0x0

    goto/16 :goto_1

    :cond_14
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    if-eqz v6, :cond_15

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۠ۤ۟ۧ;

    const/4 v6, 0x0

    const/4 v13, 0x0

    invoke-static {v5, v6, v3, v13}, LYue/ۥ۠ۤ۟۠;->ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;

    goto :goto_4

    :cond_15
    const/4 v6, 0x0

    const/4 v13, 0x0

    if-eqz v7, :cond_16

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۠ۤۤۡ;

    invoke-static {v5, v6, v3, v13}, LYue/ۥ۠ۤ۟۠;->ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;

    move-result-object v7

    invoke-virtual {v5, v3, v6, v7}, LYue/ۥ۠ۤۤۡ;->ۥ۟۠ۡۦ(Ljava/util/ArrayList;ILYue/ۥۢۥۣ۟;)V

    invoke-virtual {v7, v3}, LYue/ۥۢۥۣ۟;->ۥ۟۟(Ljava/util/ArrayList;)V

    const/4 v6, 0x0

    const/4 v13, 0x0

    goto :goto_5

    :cond_16
    sget-object v4, LYue/ۥ۟ۧ۟۠$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧ۟۠$ۥ۟;

    invoke-virtual {v0, v4}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۡ(LYue/ۥ۟ۧ۟۠$ۥ۟;)LYue/ۥ۟ۧ۟۠;

    move-result-object v4

    invoke-virtual {v4}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_17

    invoke-virtual {v4}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۟ۧ۟۠;

    iget-object v5, v5, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v5, v6, v3, v7}, LYue/ۥ۠ۤ۟۠;->ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;

    goto :goto_6

    :cond_17
    sget-object v4, LYue/ۥ۟ۧ۟۠$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧ۟۠$ۥ۟;

    invoke-virtual {v0, v4}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۡ(LYue/ۥ۟ۧ۟۠$ۥ۟;)LYue/ۥ۟ۧ۟۠;

    move-result-object v4

    invoke-virtual {v4}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_18

    invoke-virtual {v4}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_18

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۟ۧ۟۠;

    iget-object v5, v5, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v5, v6, v3, v7}, LYue/ۥ۠ۤ۟۠;->ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;

    goto :goto_7

    :cond_18
    sget-object v4, LYue/ۥ۟ۧ۟۠$ۥ۟;->ۥ۟۟ۡ:LYue/ۥ۟ۧ۟۠$ۥ۟;

    invoke-virtual {v0, v4}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۡ(LYue/ۥ۟ۧ۟۠$ۥ۟;)LYue/ۥ۟ۧ۟۠;

    move-result-object v4

    invoke-virtual {v4}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_19

    invoke-virtual {v4}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_19

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۟ۧ۟۠;

    iget-object v5, v5, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v5, v6, v3, v7}, LYue/ۥ۠ۤ۟۠;->ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;

    goto :goto_8

    :cond_19
    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v10, :cond_1a

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۟ۧ۟ۢ;

    invoke-static {v5, v6, v3, v7}, LYue/ۥ۠ۤ۟۠;->ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;

    goto :goto_9

    :cond_1a
    if-eqz v8, :cond_1b

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۠ۤ۟ۧ;

    invoke-static {v5, v12, v3, v7}, LYue/ۥ۠ۤ۟۠;->ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;

    goto :goto_a

    :cond_1b
    if-eqz v9, :cond_1c

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۠ۤۤۡ;

    invoke-static {v5, v12, v3, v7}, LYue/ۥ۠ۤ۟۠;->ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;

    move-result-object v6

    invoke-virtual {v5, v3, v12, v6}, LYue/ۥ۠ۤۤۡ;->ۥ۟۠ۡۦ(Ljava/util/ArrayList;ILYue/ۥۢۥۣ۟;)V

    invoke-virtual {v6, v3}, LYue/ۥۢۥۣ۟;->ۥ۟۟(Ljava/util/ArrayList;)V

    const/4 v7, 0x0

    goto :goto_b

    :cond_1c
    sget-object v4, LYue/ۥ۟ۧ۟۠$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧ۟۠$ۥ۟;

    invoke-virtual {v0, v4}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۡ(LYue/ۥ۟ۧ۟۠$ۥ۟;)LYue/ۥ۟ۧ۟۠;

    move-result-object v4

    invoke-virtual {v4}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_1d

    invoke-virtual {v4}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۟ۧ۟۠;

    iget-object v5, v5, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    const/4 v6, 0x0

    invoke-static {v5, v12, v3, v6}, LYue/ۥ۠ۤ۟۠;->ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;

    goto :goto_c

    :cond_1d
    sget-object v4, LYue/ۥ۟ۧ۟۠$ۥ۟;->ۥ۟۟۠ۨ:LYue/ۥ۟ۧ۟۠$ۥ۟;

    invoke-virtual {v0, v4}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۡ(LYue/ۥ۟ۧ۟۠$ۥ۟;)LYue/ۥ۟ۧ۟۠;

    move-result-object v4

    invoke-virtual {v4}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_1e

    invoke-virtual {v4}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۟ۧ۟۠;

    iget-object v5, v5, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    const/4 v6, 0x0

    invoke-static {v5, v12, v3, v6}, LYue/ۥ۠ۤ۟۠;->ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;

    goto :goto_d

    :cond_1e
    sget-object v4, LYue/ۥ۟ۧ۟۠$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۟ۧ۟۠$ۥ۟;

    invoke-virtual {v0, v4}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۡ(LYue/ۥ۟ۧ۟۠$ۥ۟;)LYue/ۥ۟ۧ۟۠;

    move-result-object v4

    invoke-virtual {v4}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_1f

    invoke-virtual {v4}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۟ۧ۟۠;

    iget-object v5, v5, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    const/4 v6, 0x0

    invoke-static {v5, v12, v3, v6}, LYue/ۥ۠ۤ۟۠;->ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;

    goto :goto_e

    :cond_1f
    sget-object v4, LYue/ۥ۟ۧ۟۠$ۥ۟;->ۥ۟۟ۡ:LYue/ۥ۟ۧ۟۠$ۥ۟;

    invoke-virtual {v0, v4}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۡ(LYue/ۥ۟ۧ۟۠$ۥ۟;)LYue/ۥ۟ۧ۟۠;

    move-result-object v4

    invoke-virtual {v4}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_20

    invoke-virtual {v4}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_20

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۟ۧ۟۠;

    iget-object v5, v5, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    const/4 v13, 0x0

    invoke-static {v5, v12, v3, v13}, LYue/ۥ۠ۤ۟۠;->ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;

    goto :goto_f

    :cond_20
    const/4 v13, 0x0

    if-eqz v11, :cond_21

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_21

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۟ۧ۟ۢ;

    invoke-static {v5, v12, v3, v13}, LYue/ۥ۠ۤ۟۠;->ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;

    goto :goto_10

    :cond_21
    const/4 v4, 0x0

    :goto_11
    if-ge v4, v2, :cond_23

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥ۟ۧ۟ۢ;

    invoke-virtual {v5}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۦ۠()Z

    move-result v6

    if-eqz v6, :cond_22

    iget v6, v5, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۦۦ:I

    invoke-static {v3, v6}, LYue/ۥ۠ۤ۟۠;->ۥ۟(Ljava/util/ArrayList;I)LYue/ۥۢۥۣ۟;

    move-result-object v6

    iget v5, v5, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۦۧ:I

    invoke-static {v3, v5}, LYue/ۥ۠ۤ۟۠;->ۥ۟(Ljava/util/ArrayList;I)LYue/ۥۢۥۣ۟;

    move-result-object v5

    if-eqz v6, :cond_22

    if-eqz v5, :cond_22

    const/4 v7, 0x0

    invoke-virtual {v6, v7, v5}, LYue/ۥۢۥۣ۟;->ۥ۟۟۟ۧ(ILYue/ۥۢۥۣ۟;)V

    const/4 v7, 0x2

    invoke-virtual {v5, v7}, LYue/ۥۢۥۣ۟;->ۥ۟۟۠(I)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_22
    add-int/lit8 v4, v4, 0x1

    goto :goto_11

    :cond_23
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gt v1, v12, :cond_24

    const/4 v1, 0x0

    return v1

    :cond_24
    invoke-virtual/range {p0 .. p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۡۦ()LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    move-result-object v1

    sget-object v2, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    if-ne v1, v2, :cond_28

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v2, v13

    const/4 v6, 0x0

    :cond_25
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_27

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYue/ۥۢۥۣ۟;

    invoke-virtual {v4}, LYue/ۥۢۥۣ۟;->ۥ۟۟۟ۡ()I

    move-result v5

    if-ne v5, v12, :cond_26

    goto :goto_12

    :cond_26
    const/4 v5, 0x0

    invoke-virtual {v4, v5}, LYue/ۥۢۥۣ۟;->ۥ۟۟۟ۨ(Z)V

    invoke-virtual/range {p0 .. p0}, LYue/ۥۣ۟ۧ۟;->ۥۣ۟۠ۨ()LYue/ۥ۠ۧۡۤ;

    move-result-object v7

    invoke-virtual {v4, v7, v5}, LYue/ۥۢۥۣ۟;->ۥ۟۟۟ۦ(LYue/ۥ۠ۧۡۤ;I)I

    move-result v7

    if-le v7, v6, :cond_25

    move-object v2, v4

    move v6, v7

    goto :goto_12

    :cond_27
    if-eqz v2, :cond_28

    sget-object v1, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    invoke-virtual {v0, v1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۨۨ(LYue/ۥ۟ۧ۟ۢ$ۥ۟;)V

    invoke-virtual {v0, v6}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۠ۡ۟(I)V

    invoke-virtual {v2, v12}, LYue/ۥۢۥۣ۟;->ۥ۟۟۟ۨ(Z)V

    goto :goto_13

    :cond_28
    move-object v2, v13

    :goto_13
    invoke-virtual/range {p0 .. p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۤ()LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    move-result-object v1

    sget-object v4, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    if-ne v1, v4, :cond_2c

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v3, v13

    const/4 v6, 0x0

    :cond_29
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYue/ۥۢۥۣ۟;

    invoke-virtual {v4}, LYue/ۥۢۥۣ۟;->ۥ۟۟۟ۡ()I

    move-result v5

    if-nez v5, :cond_2a

    goto :goto_14

    :cond_2a
    const/4 v5, 0x0

    invoke-virtual {v4, v5}, LYue/ۥۢۥۣ۟;->ۥ۟۟۟ۨ(Z)V

    invoke-virtual/range {p0 .. p0}, LYue/ۥۣ۟ۧ۟;->ۥۣ۟۠ۨ()LYue/ۥ۠ۧۡۤ;

    move-result-object v7

    invoke-virtual {v4, v7, v12}, LYue/ۥۢۥۣ۟;->ۥ۟۟۟ۦ(LYue/ۥ۠ۧۡۤ;I)I

    move-result v7

    if-le v7, v6, :cond_29

    move-object v3, v4

    move v6, v7

    goto :goto_14

    :cond_2b
    const/4 v5, 0x0

    if-eqz v3, :cond_2d

    sget-object v1, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    invoke-virtual {v0, v1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۠۠ۦ(LYue/ۥ۟ۧ۟ۢ$ۥ۟;)V

    invoke-virtual {v0, v6}, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟ۨ(I)V

    invoke-virtual {v3, v12}, LYue/ۥۢۥۣ۟;->ۥ۟۟۟ۨ(Z)V

    move-object v4, v3

    goto :goto_15

    :cond_2c
    const/4 v5, 0x0

    :cond_2d
    move-object v4, v13

    :goto_15
    if-nez v2, :cond_2f

    if-eqz v4, :cond_2e

    goto :goto_16

    :cond_2e
    move v3, v5

    goto :goto_17

    :cond_2f
    :goto_16
    move v3, v12

    :goto_17
    return v3
.end method

.method public static ۥ۟۟۟(LYue/ۥ۟ۧ۟ۢ$ۥ۟;LYue/ۥ۟ۧ۟ۢ$ۥ۟;LYue/ۥ۟ۧ۟ۢ$ۥ۟;LYue/ۥ۟ۧ۟ۢ$ۥ۟;)Z
    .locals 5

    sget-object v0, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p2, v0, :cond_1

    sget-object v3, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    if-eq p2, v3, :cond_1

    sget-object v4, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    if-ne p2, v4, :cond_0

    if-eq p0, v3, :cond_0

    goto :goto_0

    :cond_0
    move p0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move p0, v1

    :goto_1
    if-eq p3, v0, :cond_3

    sget-object p2, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    if-eq p3, p2, :cond_3

    sget-object v0, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    if-ne p3, v0, :cond_2

    if-eq p1, p2, :cond_2

    goto :goto_2

    :cond_2
    move p1, v2

    goto :goto_3

    :cond_3
    :goto_2
    move p1, v1

    :goto_3
    if-nez p0, :cond_5

    if-eqz p1, :cond_4

    goto :goto_4

    :cond_4
    return v2

    :cond_5
    :goto_4
    return v1
.end method
