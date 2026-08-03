.class public final LYue/ۥۡۡۦۤ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۦ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,210:1\n1#2:211\n268#3,26:212\n*S KotlinDebug\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n*L\n159#1:212,26\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡۦۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,210:1\n1#2:211\n268#3,26:212\n*S KotlinDebug\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n*L\n159#1:212,26\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۢۡۤۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۡۡۦۤ;


# direct methods
.method public constructor <init>(LYue/ۥۡۡۦۤ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۡۦۤ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۡۦۤ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, LYue/ۥۢۡۤۧ;

    invoke-direct {p1}, LYue/ۥۢۡۤۧ;-><init>()V

    iput-object p1, p0, LYue/ۥۡۡۦۤ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۡۤۧ;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    iget-object v0, p0, LYue/ۥۡۡۦۤ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۡۦۤ;

    invoke-static {v0}, LYue/ۥۡۡۦۤ;->ۥ۟۟۟(LYue/ۥۡۡۦۤ;)LYue/ۥۡۡۦۤ$ۥ۟۟;

    move-result-object v0

    invoke-static {v0, p0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۡۦۤ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۡۦۤ;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LYue/ۥۡۡۦۤ;->ۥ۟۟۟ۢ(LYue/ۥۡۡۦۤ;LYue/ۥۡۡۦۤ$ۥ۟۟;)V

    :cond_0
    return-void
.end method

.method public ۥ()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۦۤ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۡۤۧ;

    return-object v0
.end method

.method public ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J
    .locals 17
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    const-string v4, "sink"

    invoke-static {v0, v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_a

    iget-object v6, v1, LYue/ۥۡۡۦۤ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۡۦۤ;

    invoke-static {v6}, LYue/ۥۡۡۦۤ;->ۥ۟۟۟(LYue/ۥۡۡۦۤ;)LYue/ۥۡۡۦۤ$ۥ۟۟;

    move-result-object v6

    invoke-static {v6, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    iget-object v6, v1, LYue/ۥۡۡۦۤ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۡۦۤ;

    invoke-static {v6}, LYue/ۥۡۡۦۤ;->ۥ۟۟۟۟(LYue/ۥۡۡۦۤ;)LYue/ۥۣۣ۟۠;

    move-result-object v6

    invoke-interface {v6}, LYue/ۥۣۢ۟ۦ;->ۥ()LYue/ۥۢۡۤۧ;

    move-result-object v6

    iget-object v7, v1, LYue/ۥۡۡۦۤ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۡۤۧ;

    iget-object v8, v1, LYue/ۥۡۡۦۤ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۡۦۤ;

    invoke-virtual {v6}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۥ()J

    move-result-wide v9

    sget-object v11, LYue/ۥۢۡۤۧ;->ۥ۟۟۟:LYue/ۥۢۡۤۧ$ۥ۟;

    invoke-virtual {v7}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۥ()J

    move-result-wide v12

    invoke-virtual {v6}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۥ()J

    move-result-wide v14

    invoke-virtual {v11, v12, v13, v14, v15}, LYue/ۥۢۡۤۧ$ۥ۟;->ۥ(JJ)J

    move-result-wide v11

    sget-object v13, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v11, v12, v13}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۤ(JLjava/util/concurrent/TimeUnit;)LYue/ۥۢۡۤۧ;

    invoke-virtual {v6}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۡ()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-virtual {v6}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟۟()J

    move-result-wide v11

    invoke-virtual {v7}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۡ()Z

    move-result v16

    if-eqz v16, :cond_0

    invoke-virtual {v6}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟۟()J

    move-result-wide v14

    invoke-virtual {v7}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟۟()J

    move-result-wide v4

    invoke-static {v14, v15, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟۠(J)LYue/ۥۢۡۤۧ;

    :cond_0
    :try_start_0
    invoke-static {v8, v2, v3}, LYue/ۥۡۡۦۤ;->ۥ۟(LYue/ۥۡۡۦۤ;J)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-nez v4, :cond_1

    const-wide/16 v14, -0x1

    goto :goto_0

    :cond_1
    invoke-static {v8}, LYue/ۥۡۡۦۤ;->ۥ۟۟۟۟(LYue/ۥۡۡۦۤ;)LYue/ۥۣۣ۟۠;

    move-result-object v4

    invoke-interface {v4, v0, v2, v3}, LYue/ۥۣۢ۟ۦ;->ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J

    move-result-wide v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v6, v9, v10, v13}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۤ(JLjava/util/concurrent/TimeUnit;)LYue/ۥۢۡۤۧ;

    invoke-virtual {v7}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۡ()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v6, v11, v12}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟۠(J)LYue/ۥۢۡۤۧ;

    :cond_2
    return-wide v14

    :catchall_0
    move-exception v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v9, v10, v2}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۤ(JLjava/util/concurrent/TimeUnit;)LYue/ۥۢۡۤۧ;

    invoke-virtual {v7}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۡ()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v6, v11, v12}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟۠(J)LYue/ۥۢۡۤۧ;

    :cond_3
    throw v0

    :cond_4
    invoke-virtual {v7}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۡ()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v7}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟۟()J

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟۠(J)LYue/ۥۢۡۤۧ;

    :cond_5
    :try_start_1
    invoke-static {v8, v2, v3}, LYue/ۥۡۡۦۤ;->ۥ۟(LYue/ۥۡۡۦۤ;J)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-nez v4, :cond_6

    const-wide/16 v14, -0x1

    goto :goto_1

    :cond_6
    invoke-static {v8}, LYue/ۥۡۡۦۤ;->ۥ۟۟۟۟(LYue/ۥۡۡۦۤ;)LYue/ۥۣۣ۟۠;

    move-result-object v4

    invoke-interface {v4, v0, v2, v3}, LYue/ۥۣۢ۟ۦ;->ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J

    move-result-wide v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_1
    invoke-virtual {v6, v9, v10, v13}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۤ(JLjava/util/concurrent/TimeUnit;)LYue/ۥۢۡۤۧ;

    invoke-virtual {v7}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۡ()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v6}, LYue/ۥۢۡۤۧ;->ۥ۟()LYue/ۥۢۡۤۧ;

    :cond_7
    return-wide v14

    :catchall_1
    move-exception v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v9, v10, v2}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۤ(JLjava/util/concurrent/TimeUnit;)LYue/ۥۢۡۤۧ;

    invoke-virtual {v7}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۡ()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v6}, LYue/ۥۢۡۤۧ;->ۥ۟()LYue/ۥۢۡۤۧ;

    :cond_8
    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "closed"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "byteCount < 0: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
