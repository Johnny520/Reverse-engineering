.class public final LYue/ۥ۟۟۟ۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۠ۦۡ۠;
    name = "-FileSystem"
.end annotation

.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n52#2,5:156\n52#2,21:161\n60#2,10:182\n57#2,2:192\n71#2,2:194\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,5\n66#1:161,21\n65#1:182,10\n65#1:192,2\n65#1:194,2\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n52#2,5:156\n52#2,21:161\n60#2,10:182\n57#2,2:192\n71#2,2:194\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,5\n66#1:161,21\n65#1:182,10\n65#1:192,2\n65#1:194,2\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥۡۨۢ۠;LYue/ۥ۠ۡۨۤ;LYue/ۥ۟ۡۧۡ;LYue/ۥۣۡۧۧ;ZZLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 15
    .param p0    # LYue/ۥۡۨۢ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۠ۡۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۡۧۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p6    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e2\u06e0<",
            "-",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ">;",
            "LYue/\u06e5\u06e0\u06e1\u06e8\u06e4;",
            "LYue/\u06e5\u06df\u06e1\u06e7\u06e1<",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ">;",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            "ZZ",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p3

    move/from16 v2, p5

    move-object/from16 v3, p6

    instance-of v4, v3, LYue/ۥ۟۟۟ۢ$ۥ;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, LYue/ۥ۟۟۟ۢ$ۥ;

    iget v5, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟ۡ۠:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟ۡ۠:I

    goto :goto_0

    :cond_0
    new-instance v4, LYue/ۥ۟۟۟ۢ$ۥ;

    invoke-direct {v4, v3}, LYue/ۥ۟۟۟ۢ$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object v3, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v5

    iget v6, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟ۡ۠:I

    const/4 v7, 0x0

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v6, :cond_4

    if-eq v6, v10, :cond_3

    if-eq v6, v9, :cond_2

    if-ne v6, v8, :cond_1

    invoke-static {v3}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v0, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟ۡ:Z

    iget-boolean v1, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۨ:Z

    iget-object v2, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v6, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast v6, LYue/ۥۣۡۧۧ;

    iget-object v7, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v7, LYue/ۥ۟ۡۧۡ;

    iget-object v10, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v10, LYue/ۥ۠ۡۨۤ;

    iget-object v11, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v11, LYue/ۥۡۨۢ۠;

    :try_start_0
    invoke-static {v3}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_3
    iget-boolean v0, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟ۡ:Z

    iget-boolean v1, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۨ:Z

    iget-object v2, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast v2, LYue/ۥۣۡۧۧ;

    iget-object v6, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v6, LYue/ۥ۟ۡۧۡ;

    iget-object v11, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v11, LYue/ۥ۠ۡۨۤ;

    iget-object v12, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v12, LYue/ۥۡۨۢ۠;

    invoke-static {v3}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    move-object v14, v2

    move v2, v0

    move v0, v1

    move-object v1, v14

    goto :goto_1

    :cond_4
    invoke-static {v3}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    if-nez v2, :cond_5

    iput-object v0, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    move-object/from16 v3, p1

    iput-object v3, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    move-object/from16 v6, p2

    iput-object v6, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-object v1, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    move/from16 v11, p4

    iput-boolean v11, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۨ:Z

    iput-boolean v2, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟ۡ:Z

    iput v10, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟ۡ۠:I

    invoke-virtual {p0, v1, v4}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v5, :cond_6

    return-object v5

    :cond_5
    move-object/from16 v3, p1

    move-object/from16 v6, p2

    move/from16 v11, p4

    :cond_6
    move-object v12, v0

    move v0, v11

    move-object v11, v3

    :goto_1
    invoke-virtual {v11, v1}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۡ(LYue/ۥۣۡۧۧ;)Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_7

    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟ۡ()Ljava/util/List;

    move-result-object v3

    :cond_7
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    xor-int/2addr v10, v13

    if-eqz v10, :cond_e

    move-object v10, v1

    :goto_2
    if-eqz v0, :cond_9

    invoke-virtual {v6, v10}, LYue/ۥ۟ۡۧۡ;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    goto :goto_3

    :cond_8
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "symlink cycle at "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_3
    invoke-static {v11, v10}, LYue/ۥ۟۟۟ۢ;->ۥ۟۟۟ۢ(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;)LYue/ۥۣۡۧۧ;

    move-result-object v13

    if-nez v13, :cond_d

    if-nez v0, :cond_a

    if-nez v7, :cond_e

    :cond_a
    invoke-virtual {v6, v10}, LYue/ۥ۟ۡۧۡ;->addLast(Ljava/lang/Object;)V

    :try_start_1
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v7, v6

    move-object v10, v11

    move-object v11, v12

    move-object v6, v1

    move v1, v0

    move v0, v2

    move-object v2, v3

    :cond_b
    :goto_4
    :try_start_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۣۡۧۧ;

    iput-object v11, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v10, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object v7, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-object v6, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object v2, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput-boolean v1, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۨ:Z

    iput-boolean v0, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟ۡ:Z

    iput v9, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟ۡ۠:I

    move-object p0, v11

    move-object/from16 p1, v10

    move-object/from16 p2, v7

    move-object/from16 p3, v3

    move/from16 p4, v1

    move/from16 p5, v0

    move-object/from16 p6, v4

    invoke-static/range {p0 .. p6}, LYue/ۥ۟۟۟ۢ;->ۥ(LYue/ۥۡۨۢ۠;LYue/ۥ۠ۡۨۤ;LYue/ۥ۟ۡۧۡ;LYue/ۥۣۡۧۧ;ZZLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v3, v5, :cond_b

    return-object v5

    :cond_c
    invoke-virtual {v7}, LYue/ۥ۟ۡۧۡ;->removeLast()Ljava/lang/Object;

    move v2, v0

    move-object v1, v6

    move-object v12, v11

    goto :goto_6

    :catchall_1
    move-exception v0

    move-object v7, v6

    :goto_5
    invoke-virtual {v7}, LYue/ۥ۟ۡۧۡ;->removeLast()Ljava/lang/Object;

    throw v0

    :cond_d
    add-int/lit8 v7, v7, 0x1

    move-object v10, v13

    goto :goto_2

    :cond_e
    :goto_6
    if-eqz v2, :cond_10

    const/4 v0, 0x0

    iput-object v0, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v0, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object v0, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-object v0, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object v0, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput v8, v4, LYue/ۥ۟۟۟ۢ$ۥ;->ۥ۟۟ۡ۠:I

    invoke-virtual {v12, v1, v4}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_f

    return-object v5

    :cond_f
    :goto_7
    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object v0

    :cond_10
    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object v0
.end method

.method public static final ۥ۟(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;LYue/ۥۣۡۧۧ;)V
    .locals 4
    .param p0    # LYue/ۥ۠ۡۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۢ۠(LYue/ۥۣۡۧۧ;)LYue/ۥۣۢ۟ۦ;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۡۨ(LYue/ۥۣۡۧۧ;)LYue/ۥۣۢ۟ۡ;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۣۡۡ;->ۥ۟۟۟(LYue/ۥۣۢ۟ۡ;)LYue/ۥۣۣ۟۟;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    invoke-interface {p0, p1}, LYue/ۥۣۣ۟۟;->ۥ۟۟۟ۧ(LYue/ۥۣۢ۟ۦ;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p0, :cond_0

    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    :goto_0
    move-object p0, v0

    goto :goto_2

    :catchall_1
    move-exception p2

    if-eqz p0, :cond_1

    :try_start_3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p0

    :try_start_4
    invoke-static {p2, p0}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :catchall_3
    move-exception p0

    goto :goto_3

    :cond_1
    :goto_1
    move-object p0, p2

    move-object p2, v0

    :goto_2
    if-nez p0, :cond_2

    invoke-static {p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz p1, :cond_4

    :try_start_5
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_5

    :catchall_4
    move-exception v0

    goto :goto_5

    :cond_2
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :goto_3
    if-eqz p1, :cond_3

    :try_start_7
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception p1

    invoke-static {p0, p1}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_3
    :goto_4
    move-object v3, v0

    move-object v0, p0

    move-object p0, v3

    :cond_4
    :goto_5
    if-nez v0, :cond_5

    invoke-static {p0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-void

    :cond_5
    throw v0
.end method

.method public static final ۥ۟۟(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;Z)V
    .locals 3
    .param p0    # LYue/ۥ۠ۡۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dir"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۡۧۡ;

    invoke-direct {v0}, LYue/ۥ۟ۡۧۡ;-><init>()V

    move-object v1, p1

    :goto_0
    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۠ۦ(LYue/ۥۣۡۧۧ;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, LYue/ۥ۟ۡۧۡ;->addFirst(Ljava/lang/Object;)V

    invoke-virtual {v1}, LYue/ۥۣۡۧۧ;->ۥ۟۟۠ۥ()LYue/ۥۣۡۧۧ;

    move-result-object v1

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_2

    invoke-virtual {v0}, LYue/ۥ۟ۡۧۡ;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " already exists."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LYue/ۥۣۡۧۧ;

    invoke-virtual {p0, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۟ۧ(LYue/ۥۣۡۧۧ;)V

    goto :goto_2

    :cond_3
    return-void
.end method

.method public static final ۥ۟۟۟(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;Z)V
    .locals 2
    .param p0    # LYue/ۥ۠ۡۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileOrDirectory"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟۟۟ۢ$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LYue/ۥ۟۟۟ۢ$ۥ۟;-><init>(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0}, LYue/ۥۡۨۢۢ;->ۥ۟(LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۨۢ;

    move-result-object p1

    invoke-interface {p1}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣۡۧۧ;

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0, v0, v1}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۠ۡ(LYue/ۥۣۡۧۧ;Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;)Z
    .locals 1
    .param p0    # LYue/ۥ۠ۡۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۨۤ;->ۥۣ۟۟ۡ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۨ;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;Z)LYue/ۥۡۨۢ;
    .locals 2
    .param p0    # LYue/ۥ۠ۡۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e1\u06e8\u06e4;",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            "Z)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dir"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, p2, v1}, LYue/ۥ۟۟۟ۢ$ۥ۟۟;-><init>(LYue/ۥۣۡۧۧ;LYue/ۥ۠ۡۨۤ;ZLYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0}, LYue/ۥۡۨۢۢ;->ۥ۟(LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۨۢ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۨ;
    .locals 2
    .param p0    # LYue/ۥ۠ۡۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۨۤ;->ۥۣ۟۟ۡ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۨ;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/io/FileNotFoundException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "no such file: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;)LYue/ۥۣۡۧۧ;
    .locals 1
    .param p0    # LYue/ۥ۠ۡۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۡۢ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۨ;

    move-result-object p0

    invoke-virtual {p0}, LYue/ۥ۠ۡۨ;->ۥۣ۟۟۟()LYue/ۥۣۡۧۧ;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LYue/ۥۣۡۧۧ;->ۥ۟۟۠ۥ()LYue/ۥۣۡۧۧ;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1, p0}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡ(LYue/ۥۣۡۧۧ;)LYue/ۥۣۡۧۧ;

    move-result-object p0

    return-object p0
.end method
