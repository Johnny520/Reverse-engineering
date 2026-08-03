.class public final LYue/ۥۢۦۣۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nZipFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n1045#2:460\n*S KotlinDebug\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n156#1:460\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nZipFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n1045#2:460\n*S KotlinDebug\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n156#1:460\n*E\n"
.end annotation


# static fields
.field public static final ۥ:I = 0x4034b50

.field public static final ۥ۟:I = 0x2014b50

.field public static final ۥ۟۟:I = 0x6054b50

.field public static final ۥ۟۟۟:I = 0x7064b50

.field public static final ۥ۟۟۟۟:I = 0x6064b50

.field public static final ۥ۟۟۟۠:I = 0x8

.field public static final ۥ۟۟۟ۡ:I = 0x0

.field public static final ۥ۟۟۟ۢ:I = 0x1

.field public static final ۥۣ۟۟۟:I = 0x1

.field public static final ۥ۟۟۟ۤ:J = 0xffffffffL

.field public static final ۥ۟۟۟ۥ:I = 0x1

.field public static final ۥ۟۟۟ۦ:I = 0x5455


# direct methods
.method public static final ۥ(Ljava/util/List;)Ljava/util/Map;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e6\u06e3\u06e6;",
            ">;)",
            "Ljava/util/Map<",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            "LYue/\u06e5\u06e2\u06e6\u06e3\u06e6;",
            ">;"
        }
    .end annotation

    sget-object v0, LYue/ۥۣۡۧۧ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۧۧ$ۥ;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "/"

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, LYue/ۥۣۡۧۧ$ۥ;->ۥ۟۟۟ۢ(LYue/ۥۣۡۧۧ$ۥ;Ljava/lang/String;ZILjava/lang/Object;)LYue/ۥۣۡۧۧ;

    move-result-object v0

    new-instance v1, LYue/ۥۢۦۣۦ;

    const/16 v19, 0x1fc

    const/16 v20, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    move-object v5, v1

    move-object v6, v0

    invoke-direct/range {v5 .. v20}, LYue/ۥۢۦۣۦ;-><init>(LYue/ۥۣۡۧۧ;ZLjava/lang/String;JJJILjava/lang/Long;JILYue/ۥ۟ۨۥۢ;)V

    invoke-static {v0, v1}, LYue/ۥۢۢۢۡ;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۣۡۦ۠;

    move-result-object v0

    filled-new-array {v0}, [LYue/ۥۣۡۦ۠;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۨۧۧ;->ۥ۟۟ۤۡ([LYue/ۥۣۡۦ۠;)Ljava/util/Map;

    move-result-object v0

    new-instance v1, LYue/ۥۢۦۣۨ$ۥ;

    invoke-direct {v1}, LYue/ۥۢۦۣۨ$ۥ;-><init>()V

    move-object/from16 v2, p0

    invoke-static {v2, v1}, LYue/ۥ۟ۥۢ۠;->ۥۣ۟ۡۨ(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۦۣۦ;

    invoke-virtual {v2}, LYue/ۥۢۦۣۦ;->ۥ()LYue/ۥۣۡۧۧ;

    move-result-object v3

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۢۦۣۦ;

    if-nez v3, :cond_0

    :goto_1
    invoke-virtual {v2}, LYue/ۥۢۦۣۦ;->ۥ()LYue/ۥۣۡۧۧ;

    move-result-object v3

    invoke-virtual {v3}, LYue/ۥۣۡۧۧ;->ۥ۟۟۠ۥ()LYue/ۥۣۡۧۧ;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYue/ۥۢۦۣۦ;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, LYue/ۥۢۦۣۦ;->ۥ۟()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2}, LYue/ۥۢۦۣۦ;->ۥ()LYue/ۥۣۡۧۧ;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v15, LYue/ۥۢۦۣۦ;

    const/16 v18, 0x1fc

    const/16 v19, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v20, 0x0

    move-object v4, v15

    move-object v5, v3

    move-object/from16 v22, v15

    move-object/from16 v15, v16

    move-wide/from16 v16, v20

    invoke-direct/range {v4 .. v19}, LYue/ۥۢۦۣۦ;-><init>(LYue/ۥۣۡۧۧ;ZLjava/lang/String;JJJILjava/lang/Long;JILYue/ۥ۟ۨۥۢ;)V

    move-object/from16 v4, v22

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, LYue/ۥۢۦۣۦ;->ۥ۟()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2}, LYue/ۥۢۦۣۦ;->ۥ()LYue/ۥۣۡۧۧ;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v2, v4

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public static final ۥ۟(II)Ljava/lang/Long;
    .locals 8

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v7, Ljava/util/GregorianCalendar;

    invoke-direct {v7}, Ljava/util/GregorianCalendar;-><init>()V

    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    shr-int/lit8 v0, p0, 0x9

    and-int/lit8 v0, v0, 0x7f

    add-int/lit16 v1, v0, 0x7bc

    shr-int/lit8 v0, p0, 0x5

    and-int/lit8 v0, v0, 0xf

    and-int/lit8 v3, p0, 0x1f

    shr-int/lit8 p0, p1, 0xb

    and-int/lit8 v4, p0, 0x1f

    shr-int/lit8 p0, p1, 0x5

    and-int/lit8 v5, p0, 0x3f

    and-int/lit8 p0, p1, 0x1f

    shl-int/lit8 v6, p0, 0x1

    add-int/lit8 v2, v0, -0x1

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x10

    invoke-static {v1}, LYue/ۥۣ۟ۤۨ;->ۥ(I)I

    move-result v1

    invoke-static {p0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    const-string v1, "toString(this, checkRadix(radix))"

    invoke-static {p0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟(LYue/ۥۣۡۧۧ;LYue/ۥ۠ۡۨۤ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۢۦۣۧ;
    .locals 18
    .param p0    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۠ۡۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            "LYue/\u06e5\u06e0\u06e1\u06e8\u06e4;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06e2\u06e6\u06e3\u06e6;",
            "Ljava/lang/Boolean;",
            ">;)",
            "LYue/\u06e5\u06e2\u06e6\u06e3\u06e7;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "zipPath"

    invoke-static {v0, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "fileSystem"

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "predicate"

    invoke-static {v2, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۡۤ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۧۧ;

    move-result-object v3

    :try_start_0
    invoke-virtual {v3}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۤۤ()J

    move-result-wide v4

    const/16 v6, 0x16

    int-to-long v6, v6

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-ltz v8, :cond_9

    const-wide/32 v8, 0x10000

    sub-long v8, v4, v8

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    :goto_0
    invoke-virtual {v3, v4, v5}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۤۥ(J)LYue/ۥۣۢ۟ۦ;

    move-result-object v10

    invoke-static {v10}, LYue/ۥۣۡۡ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;

    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    invoke-interface {v10}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۥ()I

    move-result v11

    const v12, 0x6054b50

    if-ne v11, v12, :cond_7

    invoke-static {v10}, LYue/ۥۢۦۣۨ;->ۥ۟۟۟ۡ(LYue/ۥۣۣ۟۠;)LYue/ۥ۠ۡ۠ۡ;

    move-result-object v8

    invoke-virtual {v8}, LYue/ۥ۠ۡ۠ۡ;->ۥ۟()I

    move-result v9

    int-to-long v11, v9

    invoke-interface {v10, v11, v12}, LYue/ۥۣۣ۟۠;->ۥ۟۟۟ۥ(J)Ljava/lang/String;

    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    :try_start_2
    invoke-interface {v10}, LYue/ۥۣۢ۟ۦ;->close()V

    const/16 v10, 0x14

    int-to-long v10, v10

    sub-long/2addr v4, v10

    cmp-long v10, v4, v6

    const/4 v11, 0x0

    if-lez v10, :cond_3

    invoke-virtual {v3, v4, v5}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۤۥ(J)LYue/ۥۣۢ۟ۦ;

    move-result-object v4

    invoke-static {v4}, LYue/ۥۣۡۡ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    invoke-interface {v4}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۥ()I

    move-result v5

    const v10, 0x7064b50

    if-ne v5, v10, :cond_2

    invoke-interface {v4}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۥ()I

    move-result v5

    invoke-interface {v4}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦۢ()J

    move-result-wide v12

    invoke-interface {v4}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۥ()I

    move-result v10

    const/4 v14, 0x1

    if-ne v10, v14, :cond_1

    if-nez v5, :cond_1

    invoke-virtual {v3, v12, v13}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۤۥ(J)LYue/ۥۣۢ۟ۦ;

    move-result-object v5

    invoke-static {v5}, LYue/ۥۣۡۡ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-interface {v5}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۥ()I

    move-result v10

    const v12, 0x6064b50

    if-ne v10, v12, :cond_0

    invoke-static {v5, v8}, LYue/ۥۢۦۣۨ;->ۥ۟۟۟ۥ(LYue/ۥۣۣ۟۠;LYue/ۥ۠ۡ۠ۡ;)LYue/ۥ۠ۡ۠ۡ;

    move-result-object v8

    sget-object v10, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-static {v5, v11}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v1, v0

    goto :goto_1

    :cond_0
    :try_start_6
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bad zip: expected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12}, LYue/ۥۢۦۣۨ;->ۥ۟۟(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10}, LYue/ۥۢۦۣۨ;->ۥ۟۟(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_1
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_8
    invoke-static {v5, v1}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "unsupported zip: spanned"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_2
    sget-object v5, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    invoke-static {v4, v11}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v1, v0

    goto/16 :goto_9

    :goto_3
    :try_start_a
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    move-exception v0

    move-object v2, v0

    :try_start_b
    invoke-static {v4, v1}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2

    :cond_3
    :goto_4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8}, LYue/ۥ۠ۡ۠ۡ;->ۥ()J

    move-result-wide v12

    invoke-virtual {v3, v12, v13}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۤۥ(J)LYue/ۥۣۢ۟ۦ;

    move-result-object v5

    invoke-static {v5}, LYue/ۥۣۡۡ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;

    move-result-object v5
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :try_start_c
    invoke-virtual {v8}, LYue/ۥ۠ۡ۠ۡ;->ۥ۟۟()J

    move-result-wide v12

    :goto_5
    cmp-long v10, v6, v12

    if-gez v10, :cond_6

    invoke-static {v5}, LYue/ۥۢۦۣۨ;->ۥ۟۟۟۠(LYue/ۥۣۣ۟۠;)LYue/ۥۢۦۣۦ;

    move-result-object v10

    invoke-virtual {v10}, LYue/ۥۢۦۣۦ;->ۥ۟۟۟ۢ()J

    move-result-wide v14

    invoke-virtual {v8}, LYue/ۥ۠ۡ۠ۡ;->ۥ()J

    move-result-wide v16

    cmp-long v14, v14, v16

    if-gez v14, :cond_5

    invoke-interface {v2, v10}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v4, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :catchall_5
    move-exception v0

    move-object v1, v0

    goto :goto_7

    :cond_4
    :goto_6
    const-wide/16 v14, 0x1

    add-long/2addr v6, v14

    goto :goto_5

    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "bad zip: local file header offset >= central directory offset"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    sget-object v2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :try_start_d
    invoke-static {v5, v11}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v4}, LYue/ۥۢۦۣۨ;->ۥ(Ljava/util/List;)Ljava/util/Map;

    move-result-object v2

    new-instance v4, LYue/ۥۢۦۣۧ;

    invoke-direct {v4, v0, v1, v2, v9}, LYue/ۥۢۦۣۧ;-><init>(LYue/ۥۣۡۧۧ;LYue/ۥ۠ۡۨۤ;Ljava/util/Map;Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    invoke-static {v3, v11}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v4

    :goto_7
    :try_start_e
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :catchall_6
    move-exception v0

    move-object v2, v0

    :try_start_f
    invoke-static {v5, v1}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2

    :catchall_7
    move-exception v0

    goto :goto_8

    :cond_7
    invoke-interface {v10}, LYue/ۥۣۢ۟ۦ;->close()V

    const-wide/16 v10, -0x1

    add-long/2addr v4, v10

    cmp-long v10, v4, v8

    if-ltz v10, :cond_8

    goto/16 :goto_0

    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v1, "not a zip: end of central directory signature not found"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_8
    invoke-interface {v10}, LYue/ۥۣۢ۟ۦ;->close()V

    throw v0

    :cond_9
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not a zip: size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۤۤ()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    :goto_9
    :try_start_10
    throw v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    :catchall_8
    move-exception v0

    move-object v2, v0

    invoke-static {v3, v1}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public static synthetic ۥ۟۟۟۟(LYue/ۥۣۡۧۧ;LYue/ۥ۠ۡۨۤ;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)LYue/ۥۢۦۣۧ;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    sget-object p2, LYue/ۥۢۦۣۨ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۢۦۣۨ$ۥ۟;

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥۢۦۣۨ;->ۥ۟۟۟(LYue/ۥۣۡۧۧ;LYue/ۥ۠ۡۨۤ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۢۦۣۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥۣۣ۟۠;)LYue/ۥۢۦۣۦ;
    .locals 29
    .param p0    # LYue/ۥۣۣ۟۠;
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

    move-object/from16 v8, p0

    const-string v0, "<this>"

    invoke-static {v8, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۥ()I

    move-result v0

    const v1, 0x2014b50

    if-ne v0, v1, :cond_7

    const-wide/16 v0, 0x4

    invoke-interface {v8, v0, v1}, LYue/ۥۣۣ۟۠;->skip(J)V

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v0

    const v1, 0xffff

    and-int v2, v0, v1

    const/4 v9, 0x1

    and-int/2addr v0, v9

    if-nez v0, :cond_6

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v0

    and-int v20, v0, v1

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v0

    and-int/2addr v0, v1

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v2

    and-int/2addr v2, v1

    invoke-static {v2, v0}, LYue/ۥۢۦۣۨ;->ۥ۟(II)Ljava/lang/Long;

    move-result-object v21

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۥ()I

    move-result v0

    int-to-long v2, v0

    const-wide v4, 0xffffffffL

    and-long v14, v2, v4

    new-instance v10, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;

    invoke-direct {v10}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;-><init>()V

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۥ()I

    move-result v0

    int-to-long v2, v0

    and-long/2addr v2, v4

    iput-wide v2, v10, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    new-instance v11, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;

    invoke-direct {v11}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;-><init>()V

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۥ()I

    move-result v0

    int-to-long v2, v0

    and-long/2addr v2, v4

    iput-wide v2, v11, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v0

    and-int/2addr v0, v1

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v2

    and-int v12, v2, v1

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v2

    and-int v13, v2, v1

    const-wide/16 v1, 0x8

    invoke-interface {v8, v1, v2}, LYue/ۥۣۣ۟۠;->skip(J)V

    new-instance v7, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;

    invoke-direct {v7}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;-><init>()V

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۥ()I

    move-result v1

    int-to-long v1, v1

    and-long/2addr v1, v4

    iput-wide v1, v7, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    int-to-long v0, v0

    invoke-interface {v8, v0, v1}, LYue/ۥۣۣ۟۠;->ۥ۟۟۟ۥ(J)Ljava/lang/String;

    move-result-object v6

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v1, 0x0

    invoke-static {v6, v2, v2, v3, v1}, LYue/ۥۢ۠ۢۥ;->ۥ۟۠ۦۧ(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-wide v1, v11, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    cmp-long v0, v1, v4

    const-wide/16 v18, 0x0

    const/16 v1, 0x8

    if-nez v0, :cond_0

    int-to-long v3, v1

    move-wide/from16 v24, v3

    goto :goto_0

    :cond_0
    move-wide/from16 v24, v18

    :goto_0
    iget-wide v2, v10, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    const-wide v22, 0xffffffffL

    cmp-long v0, v2, v22

    if-nez v0, :cond_1

    int-to-long v2, v1

    add-long v3, v24, v2

    :goto_1
    move-object/from16 v24, v6

    goto :goto_2

    :cond_1
    move-wide/from16 v3, v24

    goto :goto_1

    :goto_2
    iget-wide v5, v7, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    cmp-long v0, v5, v22

    if-nez v0, :cond_2

    int-to-long v0, v1

    add-long/2addr v3, v0

    :cond_2
    move-wide/from16 v22, v3

    new-instance v6, LYue/ۥۡۦۢۥ$ۥ;

    invoke-direct {v6}, LYue/ۥۡۦۢۥ$ۥ;-><init>()V

    new-instance v5, LYue/ۥۢۦۣۨ$ۥ۟۟;

    move-object v0, v5

    const/4 v4, 0x0

    move-object v1, v6

    move-wide/from16 v25, v14

    const/4 v14, 0x0

    const/4 v15, 0x2

    move-wide/from16 v2, v22

    move-object v15, v4

    move-object v4, v11

    move-object v9, v5

    move-object/from16 v5, p0

    move-object v14, v6

    move-object/from16 v27, v24

    move-object v6, v10

    move-object/from16 v28, v7

    invoke-direct/range {v0 .. v7}, LYue/ۥۢۦۣۨ$ۥ۟۟;-><init>(LYue/ۥۡۦۢۥ$ۥ;JLYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;LYue/ۥۣۣ۟۠;LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;)V

    invoke-static {v8, v12, v9}, LYue/ۥۢۦۣۨ;->ۥ۟۟۟ۢ(LYue/ۥۣۣ۟۠;ILYue/ۥۣ۠ۢۢ;)V

    cmp-long v0, v22, v18

    if-lez v0, :cond_4

    iget-boolean v0, v14, LYue/ۥۡۦۢۥ$ۥ;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "bad zip: zip64 extra required but absent"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_3
    int-to-long v0, v13

    invoke-interface {v8, v0, v1}, LYue/ۥۣۣ۟۠;->ۥ۟۟۟ۥ(J)Ljava/lang/String;

    move-result-object v13

    sget-object v0, LYue/ۥۣۡۧۧ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۧۧ$ۥ;

    const-string v1, "/"

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v15}, LYue/ۥۣۡۧۧ$ۥ;->ۥ۟۟۟ۢ(LYue/ۥۣۡۧۧ$ۥ;Ljava/lang/String;ZILjava/lang/Object;)LYue/ۥۣۡۧۧ;

    move-result-object v0

    move-object/from16 v2, v27

    invoke-virtual {v0, v2}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡ۠(Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object v0

    const/4 v4, 0x2

    invoke-static {v2, v1, v3, v4, v15}, LYue/ۥۢ۠ۢۤ;->ۥ۟۠ۡۡ(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v12

    new-instance v1, LYue/ۥۢۦۣۦ;

    iget-wide v2, v10, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    iget-wide v4, v11, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    move-object/from16 v6, v28

    iget-wide v6, v6, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    move-object v10, v1

    move-object v11, v0

    move-wide/from16 v14, v25

    move-wide/from16 v16, v2

    move-wide/from16 v18, v4

    move-wide/from16 v22, v6

    invoke-direct/range {v10 .. v23}, LYue/ۥۢۦۣۦ;-><init>(LYue/ۥۣۡۧۧ;ZLjava/lang/String;JJJILjava/lang/Long;J)V

    return-object v1

    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "bad zip: filename contains 0x00"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unsupported zip: general purpose bit flag="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, LYue/ۥۢۦۣۨ;->ۥ۟۟(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "bad zip: expected "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, LYue/ۥۢۦۣۨ;->ۥ۟۟(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, LYue/ۥۢۦۣۨ;->ۥ۟۟(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥۣۣ۟۠;)LYue/ۥ۠ۡ۠ۡ;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v2

    and-int/2addr v2, v1

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v3

    and-int/2addr v3, v1

    int-to-long v5, v3

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v3

    and-int/2addr v3, v1

    int-to-long v3, v3

    cmp-long v3, v5, v3

    if-nez v3, :cond_0

    if-nez v0, :cond_0

    if-nez v2, :cond_0

    const-wide/16 v2, 0x4

    invoke-interface {p0, v2, v3}, LYue/ۥۣۣ۟۠;->skip(J)V

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۥ()I

    move-result v0

    int-to-long v2, v0

    const-wide v7, 0xffffffffL

    and-long/2addr v7, v2

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result p0

    and-int v9, p0, v1

    new-instance p0, LYue/ۥ۠ۡ۠ۡ;

    move-object v4, p0

    invoke-direct/range {v4 .. v9}, LYue/ۥ۠ۡ۠ۡ;-><init>(JJI)V

    return-object p0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "unsupported zip: spanned"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۣۣ۟۠;ILYue/ۥۣ۠ۢۢ;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e3\u06e3\u06e0;",
            "I",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Long;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    int-to-long v0, p1

    :goto_0
    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_4

    const-wide/16 v4, 0x4

    cmp-long p1, v0, v4

    if-ltz p1, :cond_3

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result p1

    const v4, 0xffff

    and-int/2addr p1, v4

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v4

    int-to-long v4, v4

    const-wide/32 v6, 0xffff

    and-long/2addr v4, v6

    const/4 v6, 0x4

    int-to-long v6, v6

    sub-long/2addr v0, v6

    cmp-long v6, v0, v4

    if-ltz v6, :cond_2

    invoke-interface {p0, v4, v5}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦۥ(J)V

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟۟ۡ()LYue/ۥۣ۟ۢۨ;

    move-result-object v6

    invoke-virtual {v6}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-interface {p2, v8, v9}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟۟ۡ()LYue/ۥۣ۟ۢۨ;

    move-result-object v8

    invoke-virtual {v8}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v8

    add-long/2addr v8, v4

    sub-long/2addr v8, v6

    cmp-long v2, v8, v2

    if-ltz v2, :cond_1

    if-lez v2, :cond_0

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟۟ۡ()LYue/ۥۣ۟ۢۨ;

    move-result-object p1

    invoke-virtual {p1, v8, v9}, LYue/ۥۣ۟ۢۨ;->skip(J)V

    :cond_0
    sub-long/2addr v0, v4

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "unsupported zip: too many bytes processed for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "bad zip: truncated value in extra field"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "bad zip: truncated header in extra field"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    return-void
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥۣۣ۟۠;LYue/ۥ۠ۡۨ;)LYue/ۥ۠ۡۨ;
    .locals 1
    .param p0    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۠ۡۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "basicMetadata"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYue/ۥۢۦۣۨ;->ۥ۟۟۟ۤ(LYue/ۥۣۣ۟۠;LYue/ۥ۠ۡۨ;)LYue/ۥ۠ۡۨ;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final ۥ۟۟۟ۤ(LYue/ۥۣۣ۟۠;LYue/ۥ۠ۡۨ;)LYue/ۥ۠ۡۨ;
    .locals 17

    move-object/from16 v0, p0

    new-instance v1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {v1}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual/range {p1 .. p1}, LYue/ۥ۠ۡۨ;->ۥ۟۟۟ۡ()Ljava/lang/Long;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    iput-object v3, v1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    new-instance v3, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {v3}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    new-instance v4, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {v4}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۥ()I

    move-result v5

    const v6, 0x4034b50

    if-ne v5, v6, :cond_3

    const-wide/16 v5, 0x2

    invoke-interface {v0, v5, v6}, LYue/ۥۣۣ۟۠;->skip(J)V

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v5

    const v6, 0xffff

    and-int v7, v5, v6

    and-int/lit8 v5, v5, 0x1

    if-nez v5, :cond_2

    const-wide/16 v7, 0x12

    invoke-interface {v0, v7, v8}, LYue/ۥۣۣ۟۠;->skip(J)V

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v5

    int-to-long v7, v5

    const-wide/32 v9, 0xffff

    and-long/2addr v7, v9

    invoke-interface/range {p0 .. p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦ۠()S

    move-result v5

    and-int/2addr v5, v6

    invoke-interface {v0, v7, v8}, LYue/ۥۣۣ۟۠;->skip(J)V

    if-nez p1, :cond_1

    int-to-long v3, v5

    invoke-interface {v0, v3, v4}, LYue/ۥۣۣ۟۠;->skip(J)V

    return-object v2

    :cond_1
    new-instance v2, LYue/ۥۢۦۣۨ$ۥ۟۟۟;

    invoke-direct {v2, v0, v1, v3, v4}, LYue/ۥۢۦۣۨ$ۥ۟۟۟;-><init>(LYue/ۥۣۣ۟۠;LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;)V

    invoke-static {v0, v5, v2}, LYue/ۥۢۦۣۨ;->ۥ۟۟۟ۢ(LYue/ۥۣۣ۟۠;ILYue/ۥۣ۠ۢۢ;)V

    new-instance v0, LYue/ۥ۠ۡۨ;

    invoke-virtual/range {p1 .. p1}, LYue/ۥ۠ۡۨ;->ۥ۟۟۟ۥ()Z

    move-result v7

    invoke-virtual/range {p1 .. p1}, LYue/ۥ۠ۡۨ;->ۥ۟۟۟ۤ()Z

    move-result v8

    invoke-virtual/range {p1 .. p1}, LYue/ۥ۠ۡۨ;->ۥ۟۟۟ۢ()Ljava/lang/Long;

    move-result-object v10

    iget-object v2, v4, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    move-object v11, v2

    check-cast v11, Ljava/lang/Long;

    iget-object v1, v1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Ljava/lang/Long;

    iget-object v1, v3, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Ljava/lang/Long;

    const/16 v15, 0x80

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    move-object v6, v0

    invoke-direct/range {v6 .. v16}, LYue/ۥ۠ۡۨ;-><init>(ZZLYue/ۥۣۡۧۧ;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;ILYue/ۥ۟ۨۥۢ;)V

    return-object v0

    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unsupported zip: general purpose bit flag="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v7}, LYue/ۥۢۦۣۨ;->ۥ۟۟(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bad zip: expected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6}, LYue/ۥۢۦۣۨ;->ۥ۟۟(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, LYue/ۥۢۦۣۨ;->ۥ۟۟(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final ۥ۟۟۟ۥ(LYue/ۥۣۣ۟۠;LYue/ۥ۠ۡ۠ۡ;)LYue/ۥ۠ۡ۠ۡ;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0xc

    invoke-interface {p0, v0, v1}, LYue/ۥۣۣ۟۠;->skip(J)V

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۥ()I

    move-result v0

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۥ()I

    move-result v1

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦۢ()J

    move-result-wide v3

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦۢ()J

    move-result-wide v5

    cmp-long v2, v3, v5

    if-nez v2, :cond_0

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    const-wide/16 v0, 0x8

    invoke-interface {p0, v0, v1}, LYue/ۥۣۣ۟۠;->skip(J)V

    invoke-interface {p0}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦۢ()J

    move-result-wide v5

    new-instance p0, LYue/ۥ۠ۡ۠ۡ;

    invoke-virtual {p1}, LYue/ۥ۠ۡ۠ۡ;->ۥ۟()I

    move-result v7

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, LYue/ۥ۠ۡ۠ۡ;-><init>(JJI)V

    return-object p0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "unsupported zip: spanned"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟۟ۦ(LYue/ۥۣۣ۟۠;)V
    .locals 1
    .param p0    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, LYue/ۥۢۦۣۨ;->ۥ۟۟۟ۤ(LYue/ۥۣۣ۟۠;LYue/ۥ۠ۡۨ;)LYue/ۥ۠ۡۨ;

    return-void
.end method
