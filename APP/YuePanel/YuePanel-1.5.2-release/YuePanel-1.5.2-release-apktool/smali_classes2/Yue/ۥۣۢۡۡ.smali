.class public final LYue/ۥۣۢۡۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTickerChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TickerChannels.kt\nkotlinx/coroutines/channels/TickerChannelsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"
.end annotation


# direct methods
.method public static final synthetic ۥ(JJLYue/ۥۡۨۡ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, LYue/ۥۣۢۡۡ;->ۥ۟۟(JJLYue/ۥۡۨۡ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟(JJLYue/ۥۡۨۡ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, LYue/ۥۣۢۡۡ;->ۥ۟۟۟(JJLYue/ۥۡۨۡ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟(JJLYue/ۥۡۨۡ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "LYue/\u06e5\u06e1\u06e8\u06e1\u06e0<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, LYue/ۥۣۢۡۡ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, LYue/ۥۣۢۡۡ$ۥ;

    iget v1, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۠ۦ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۠ۦ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣۢۡۡ$ۥ;

    invoke-direct {v0, p5}, LYue/ۥۣۢۡۡ$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p5, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۠ۦ:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v5, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    iget-wide p0, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥۣ۟۟۠:J

    iget-object p2, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p2, LYue/ۥۡۨۡ۠;

    invoke-static {p5}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :cond_1
    move-object p4, p2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    iget-wide p0, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥۣ۟۟۠:J

    iget-object p2, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p2, LYue/ۥۡۨۡ۠;

    invoke-static {p5}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-wide p0, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥۣ۟۟۠:J

    iget-object p2, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    move-object p4, p2

    check-cast p4, LYue/ۥۡۨۡ۠;

    invoke-static {p5}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p5}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iput-object p4, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-wide p0, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥۣ۟۟۠:J

    iput v5, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۠ۦ:I

    invoke-static {p2, p3, v0}, LYue/ۥ۟ۨۨ۟;->ۥ۟(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    :goto_1
    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    iput-object p4, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-wide p0, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥۣ۟۟۠:J

    iput v4, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۠ۦ:I

    invoke-interface {p4, p2, v0}, LYue/ۥۡۨۡ۠;->ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    return-object v1

    :cond_7
    move-object p2, p4

    :goto_2
    iput-object p2, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-wide p0, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥۣ۟۟۠:J

    iput v3, v0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۠ۦ:I

    invoke-static {p0, p1, v0}, LYue/ۥ۟ۨۨ۟;->ۥ۟(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_1

    return-object v1
.end method

.method public static final ۥ۟۟۟(JJLYue/ۥۡۨۡ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "LYue/\u06e5\u06e1\u06e8\u06e1\u06e0<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, LYue/ۥۣۢۡۡ$ۥ۟;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, LYue/ۥۣۢۡۡ$ۥ۟;

    iget v2, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۧ:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v1, LYue/ۥۣۢۡۡ$ۥ۟;

    invoke-direct {v1, v0}, LYue/ۥۣۢۡۡ$ۥ۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object v0, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v2

    iget v3, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۧ:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v3, :cond_7

    if-eq v3, v7, :cond_6

    if-eq v3, v6, :cond_5

    if-eq v3, v5, :cond_3

    if-ne v3, v4, :cond_2

    iget-wide v7, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۤ:J

    iget-wide v9, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥۣ۟۟۠:J

    iget-object v3, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v3, LYue/ۥۡۨۡ۠;

    invoke-static {v0}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    move v11, v4

    move v0, v5

    :cond_1
    move-wide/from16 v16, v7

    move-wide v7, v9

    move-wide/from16 v9, v16

    goto/16 :goto_7

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-wide v7, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۤ:J

    iget-wide v9, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥۣ۟۟۠:J

    iget-object v3, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v3, LYue/ۥۡۨۡ۠;

    invoke-static {v0}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    move v0, v5

    :cond_4
    move-wide/from16 v16, v7

    move-wide v7, v9

    move-wide/from16 v9, v16

    goto/16 :goto_6

    :cond_5
    iget-wide v7, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۤ:J

    iget-wide v9, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥۣ۟۟۠:J

    iget-object v3, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v3, LYue/ۥۡۨۡ۠;

    invoke-static {v0}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    iget-wide v7, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۤ:J

    iget-wide v9, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥۣ۟۟۠:J

    iget-object v3, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v3, LYue/ۥۡۨۡ۠;

    invoke-static {v0}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    move-object v0, v3

    move-wide v10, v9

    goto :goto_2

    :cond_7
    invoke-static {v0}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, LYue/ۥ۟۟ۢۧ;->ۥ۟()J

    move-result-wide v8

    goto :goto_1

    :cond_8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    :goto_1
    invoke-static/range {p2 .. p3}, LYue/ۥ۠ۡۡۤ;->ۥ۟۟۟(J)J

    move-result-wide v10

    add-long/2addr v8, v10

    move-object/from16 v0, p4

    iput-object v0, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    move-wide/from16 v10, p0

    iput-wide v10, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥۣ۟۟۠:J

    iput-wide v8, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۤ:J

    iput v7, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۧ:I

    move-wide/from16 v12, p2

    invoke-static {v12, v13, v1}, LYue/ۥ۟ۨۨ۟;->ۥ۟(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_9

    return-object v2

    :cond_9
    move-wide v7, v8

    :goto_2
    invoke-static {v10, v11}, LYue/ۥ۠ۡۡۤ;->ۥ۟۟۟(J)J

    move-result-wide v9

    :goto_3
    add-long/2addr v7, v9

    sget-object v3, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    iput-object v0, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-wide v7, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥۣ۟۟۠:J

    iput-wide v9, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۤ:J

    iput v6, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۧ:I

    invoke-interface {v0, v3, v1}, LYue/ۥۡۨۡ۠;->ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_a

    return-object v2

    :cond_a
    move-object v3, v0

    move-wide/from16 v16, v7

    move-wide v7, v9

    move-wide/from16 v9, v16

    :goto_4
    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, LYue/ۥ۟۟ۢۧ;->ۥ۟()J

    move-result-wide v11

    goto :goto_5

    :cond_b
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v11

    :goto_5
    sub-long v13, v9, v11

    const-wide/16 v4, 0x0

    invoke-static {v13, v14, v4, v5}, LYue/ۥۡۦ۟;->ۥ۟۟۠ۥ(JJ)J

    move-result-wide v13

    cmp-long v15, v13, v4

    if-nez v15, :cond_c

    cmp-long v4, v7, v4

    if-eqz v4, :cond_c

    sub-long v4, v11, v9

    rem-long/2addr v4, v7

    sub-long v4, v7, v4

    add-long v9, v11, v4

    invoke-static {v4, v5}, LYue/ۥ۠ۡۡۤ;->ۥ۟۟(J)J

    move-result-wide v4

    iput-object v3, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-wide v9, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥۣ۟۟۠:J

    iput-wide v7, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۤ:J

    const/4 v0, 0x3

    iput v0, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۧ:I

    invoke-static {v4, v5, v1}, LYue/ۥ۟ۨۨ۟;->ۥ۟(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_4

    return-object v2

    :goto_6
    move v5, v0

    move-object v0, v3

    const/4 v4, 0x4

    goto :goto_3

    :cond_c
    const/4 v0, 0x3

    invoke-static {v13, v14}, LYue/ۥ۠ۡۡۤ;->ۥ۟۟(J)J

    move-result-wide v4

    iput-object v3, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-wide v9, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥۣ۟۟۠:J

    iput-wide v7, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۤ:J

    const/4 v11, 0x4

    iput v11, v1, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۧ:I

    invoke-static {v4, v5, v1}, LYue/ۥ۟ۨۨ۟;->ۥ۟(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_1

    return-object v2

    :goto_7
    move v5, v0

    move-object v0, v3

    move v4, v11

    goto :goto_3
.end method

.method public static final ۥ۟۟۟۟(JJLYue/ۥ۟ۧۦۥ;LYue/ۥۣۢۡۢ;)LYue/ۥۡۦۡۡ;
    .locals 9
    .param p4    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p5    # LYue/ۥۣۢۡۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۢۨ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06e2\u06e1\u06e3\u06e2;",
            ")",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    const-string v3, " ms"

    if-ltz v2, :cond_1

    cmp-long v0, p2, v0

    if-ltz v0, :cond_0

    sget-object v0, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object v1

    invoke-virtual {v1, p4}, LYue/ۥ۟۟۠ۨ;->plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p4

    new-instance v8, LYue/ۥۣۢۡۡ$ۥ۟۟;

    const/4 v7, 0x0

    move-object v1, v8

    move-object v2, p5

    move-wide v3, p0

    move-wide v5, p2

    invoke-direct/range {v1 .. v7}, LYue/ۥۣۢۡۡ$ۥ۟۟;-><init>(LYue/ۥۣۢۡۢ;JJLYue/ۥ۟ۧۤۢ;)V

    const/4 p0, 0x0

    invoke-static {v0, p4, p0, v8}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Expected non-negative initial delay, but has "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Expected non-negative delay, but has "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic ۥ۟۟۟۠(JJLYue/ۥ۟ۧۦۥ;LYue/ۥۣۢۡۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    move-wide p2, p0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    sget-object p4, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    sget-object p5, LYue/ۥۣۢۡۢ;->ۥۣ۟۟۠:LYue/ۥۣۢۡۢ;

    :cond_2
    invoke-static/range {p0 .. p5}, LYue/ۥۣۢۡۡ;->ۥ۟۟۟۟(JJLYue/ۥ۟ۧۦۥ;LYue/ۥۣۢۡۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method
