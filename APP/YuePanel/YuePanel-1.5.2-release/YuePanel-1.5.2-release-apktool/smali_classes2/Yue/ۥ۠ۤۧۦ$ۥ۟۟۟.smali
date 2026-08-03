.class public final LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۤۧۨ$ۥ۟۟;
.implements LYue/ۥۣ۠۠ۨ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1006:1\n90#2,13:1007\n90#2,13:1020\n90#2,13:1035\n90#2,13:1049\n37#3,2:1033\n37#3,2:1062\n563#4:1048\n563#4:1064\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n687#1:1007,13\n715#1:1020,13\n758#1:1035,13\n806#1:1049,13\n753#1:1033,2\n824#1:1062,2\n797#1:1048\n841#1:1064\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۧۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e4\u06e7\u06e8$\u06e5\u06df\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1006:1\n90#2,13:1007\n90#2,13:1020\n90#2,13:1035\n90#2,13:1049\n37#3,2:1033\n37#3,2:1062\n563#4:1048\n563#4:1064\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n687#1:1007,13\n715#1:1020,13\n758#1:1035,13\n806#1:1049,13\n753#1:1033,2\n824#1:1062,2\n797#1:1048\n841#1:1064\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۠ۤۧۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۤۧۦ;LYue/ۥ۠ۤۧۨ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۤۧۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e4\u06e7\u06e8;",
            ")V"
        }
    .end annotation

    const-string v0, "reader"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۤۧۨ;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۧ()V

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object v0
.end method

.method public ۥ۟۟()V
    .locals 0

    return-void
.end method

.method public ۥ۟۟۟(ILYue/ۥ۠ۡ۠ۢ;)V
    .locals 1
    .param p2    # LYue/ۥ۠ۡ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "errorCode"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۨۢ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۨ۠(ILYue/ۥ۠ۡ۠ۢ;)V

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۧۦ;->ۥۣ۟۟ۨ(I)LYue/ۥ۠ۤۨ;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p2}, LYue/ۥ۠ۤۨ;->ۥ۟۟ۡ۟(LYue/ۥ۠ۡ۠ۢ;)V

    :cond_1
    return-void
.end method

.method public ۥ۟۟۟۟(ZIILjava/util/List;)V
    .locals 6
    .param p4    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e4\u06e2\u06e1;",
            ">;)V"
        }
    .end annotation

    const-string p3, "headerBlock"

    invoke-static {p4, p3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {p3, p2}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۨۢ(I)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {p3, p2, p4, p1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۨ(ILjava/util/List;Z)V

    return-void

    :cond_0
    iget-object p3, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    monitor-enter p3

    :try_start_0
    invoke-virtual {p3, p2}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۧ۟(I)LYue/ۥ۠ۤۨ;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-static {p3}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۡ(LYue/ۥ۠ۤۧۦ;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p3

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p3}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۤۢ()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt p2, v0, :cond_2

    monitor-exit p3

    return-void

    :cond_2
    :try_start_2
    rem-int/lit8 v0, p2, 0x2

    invoke-virtual {p3}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۤۥ()I

    move-result v1

    rem-int/lit8 v1, v1, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v0, v1, :cond_3

    monitor-exit p3

    return-void

    :cond_3
    :try_start_3
    invoke-static {p4}, LYue/ۥۣۢۥ۟;->ۥۣ۟۟ۥ(Ljava/util/List;)LYue/ۥ۠ۤۢۢ;

    move-result-object v5

    new-instance p4, LYue/ۥ۠ۤۨ;

    const/4 v3, 0x0

    move-object v0, p4

    move v1, p2

    move-object v2, p3

    move v4, p1

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۤۨ;-><init>(ILYue/ۥ۠ۤۧۦ;ZZLYue/ۥ۠ۤۢۢ;)V

    invoke-virtual {p3, p2}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۨۥ(I)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۧ۠()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟۠ۦ(LYue/ۥ۠ۤۧۦ;)LYue/ۥۢۡ۟ۢ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۤ()LYue/ۥۢۡ۟ۡ;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, LYue/ۥ۠ۤۧۦ;->ۥۣ۟۟ۤ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "] onStream"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1, p3, p4}, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟;-><init>(Ljava/lang/String;ZLYue/ۥ۠ۤۧۦ;LYue/ۥ۠ۤۨ;)V

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۧ(LYue/ۥۢ۠ۨۦ;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p3

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_4
    :try_start_4
    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p3

    invoke-static {p4}, LYue/ۥۣۢۥ۟;->ۥۣ۟۟ۥ(Ljava/util/List;)LYue/ۥ۠ۤۢۢ;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, LYue/ۥ۠ۤۨ;->ۥ۟۟ۡ(LYue/ۥ۠ۤۢۢ;Z)V

    return-void

    :goto_0
    monitor-exit p3

    throw p1
.end method

.method public ۥ۟۟۟ۢ(IJ)V
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۧۡ()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-static {p1, v0, v1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۢۥ(LYue/ۥ۠ۤۧۦ;J)V

    const-string p2, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۧ۟(I)LYue/ۥ۠ۤۨ;

    move-result-object p1

    if-eqz p1, :cond_1

    monitor-enter p1

    :try_start_1
    invoke-virtual {p1, p2, p3}, LYue/ۥ۠ۤۨ;->ۥ(J)V

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p1

    goto :goto_0

    :catchall_1
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_1
    :goto_0
    return-void
.end method

.method public ۥۣ۟۟۟(ZLYue/ۥۡۨۥۦ;)V
    .locals 9
    .param p2    # LYue/ۥۡۨۥۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "settings"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-static {v0}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟۠ۨ(LYue/ۥ۠ۤۧۦ;)LYue/ۥۢۡ۟ۡ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v2}, LYue/ۥ۠ۤۧۦ;->ۥۣ۟۟ۤ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " applyAndAckSettings"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟۟۟;

    const/4 v5, 0x1

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟۟۟;-><init>(Ljava/lang/String;ZLYue/ۥ۠ۤۧۦ$ۥ۟۟۟;ZLYue/ۥۡۨۥۦ;)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۧ(LYue/ۥۢ۠ۨۦ;J)V

    return-void
.end method

.method public ۥ۟۟۟ۥ(ZII)V
    .locals 8

    if-eqz p1, :cond_3

    iget-object p1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    monitor-enter p1

    const/4 p3, 0x1

    const-wide/16 v0, 0x1

    if-eq p2, p3, :cond_2

    const/4 p3, 0x2

    if-eq p2, p3, :cond_1

    const/4 p3, 0x3

    if-eq p2, p3, :cond_0

    :goto_0
    :try_start_0
    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_0
    invoke-static {p1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟(LYue/ۥ۠ۤۧۦ;)J

    move-result-wide p2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۤۧۦ;J)V

    const-string p2, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟۟ۢ(LYue/ۥ۠ۤۧۦ;)J

    move-result-wide p2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۡۡ(LYue/ۥ۠ۤۧۦ;J)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟۟ۨ(LYue/ۥ۠ۤۧۦ;)J

    move-result-wide p2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۤۧۦ;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p1

    goto :goto_3

    :goto_2
    monitor-exit p1

    throw p2

    :cond_3
    iget-object p1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-static {p1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟۠ۨ(LYue/ۥ۠ۤۧۦ;)LYue/ۥۢۡ۟ۡ;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v1}, LYue/ۥ۠ۤۧۦ;->ۥۣ۟۟ۤ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ping"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    new-instance v0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟۟;

    const/4 v4, 0x1

    move-object v2, v0

    move v6, p2

    move v7, p3

    invoke-direct/range {v2 .. v7}, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟۟;-><init>(Ljava/lang/String;ZLYue/ۥ۠ۤۧۦ;II)V

    const-wide/16 p2, 0x0

    invoke-virtual {p1, v0, p2, p3}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۧ(LYue/ۥۢ۠ۨۦ;J)V

    :goto_3
    return-void
.end method

.method public ۥ۟۟۟ۦ(IIIZ)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟۟ۨ(ZILYue/ۥۣۣ۟۠;I)V
    .locals 2
    .param p3    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v0, p2}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۨۢ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v0, p2, p3, p4, p1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۧۨ(ILYue/ۥۣۣ۟۠;IZ)V

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v0, p2}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۧ۟(I)LYue/ۥ۠ۤۨ;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    sget-object v0, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡ۠ۢ;

    invoke-virtual {p1, p2, v0}, LYue/ۥ۠ۤۧۦ;->ۥ۟۠۠(ILYue/ۥ۠ۡ۠ۢ;)V

    iget-object p1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    int-to-long v0, p4

    invoke-virtual {p1, v0, v1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۠۟ۢ(J)V

    invoke-interface {p3, v0, v1}, LYue/ۥۣۣ۟۠;->skip(J)V

    return-void

    :cond_1
    invoke-virtual {v0, p3, p4}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠ۨ(LYue/ۥۣۣ۟۠;I)V

    if-eqz p1, :cond_2

    sget-object p1, LYue/ۥۣۢۥ۟;->ۥ۟:LYue/ۥ۠ۤۢۢ;

    const/4 p2, 0x1

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۤۨ;->ۥ۟۟ۡ(LYue/ۥ۠ۤۢۢ;Z)V

    :cond_2
    return-void
.end method

.method public ۥ۟۟۠۠(ILjava/lang/String;LYue/ۥۣ۟ۥۤ;Ljava/lang/String;IJ)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string p1, "origin"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "protocol"

    invoke-static {p3, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "host"

    invoke-static {p4, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۠ۢ(IILjava/util/List;)V
    .locals 0
    .param p3    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e4\u06e2\u06e1;",
            ">;)V"
        }
    .end annotation

    const-string p1, "requestHeaders"

    invoke-static {p3, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {p1, p2, p3}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۨ۟(ILjava/util/List;)V

    return-void
.end method

.method public ۥ۟۟۠ۤ(ILYue/ۥ۠ۡ۠ۢ;LYue/ۥۣ۟ۥۤ;)V
    .locals 3
    .param p2    # LYue/ۥ۠ۡ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "errorCode"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "debugData"

    invoke-static {p3, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    iget-object p2, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    monitor-enter p2

    :try_start_0
    invoke-virtual {p2}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۧ۠()Ljava/util/Map;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p3

    const/4 v0, 0x0

    new-array v1, v0, [LYue/ۥ۠ۤۨ;

    invoke-interface {p3, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    const/4 v1, 0x1

    invoke-static {p2, v1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۢ(LYue/ۥ۠ۤۧۦ;Z)V

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    check-cast p3, [LYue/ۥ۠ۤۨ;

    array-length p2, p3

    :goto_0
    if-ge v0, p2, :cond_1

    aget-object v1, p3, v0

    invoke-virtual {v1}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟ۥ()I

    move-result v2

    if-le v2, p1, :cond_0

    invoke-virtual {v1}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠ۥ()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟ۡۡ:LYue/ۥ۠ۡ۠ۢ;

    invoke-virtual {v1, v2}, LYue/ۥ۠ۤۨ;->ۥ۟۟ۡ۟(LYue/ۥ۠ۡ۠ۢ;)V

    iget-object v2, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v1}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟ۥ()I

    move-result v1

    invoke-virtual {v2, v1}, LYue/ۥ۠ۤۧۦ;->ۥۣ۟۟ۨ(I)LYue/ۥ۠ۤۨ;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1
.end method

.method public final ۥ۟۟۠ۥ(ZLYue/ۥۡۨۥۦ;)V
    .locals 11
    .param p2    # LYue/ۥۡۨۥۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "settings"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {v0}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    iget-object v1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v1}, LYue/ۥ۠ۤۧۦ;->ۥۣ۟۟ۧ()LYue/ۥ۠ۤۨ۟;

    move-result-object v1

    iget-object v2, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    monitor-enter v1

    :try_start_0
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v2}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۤۨ()LYue/ۥۡۨۥۦ;

    move-result-object v3

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, LYue/ۥۡۨۥۦ;

    invoke-direct {p1}, LYue/ۥۡۨۥۦ;-><init>()V

    invoke-virtual {p1, v3}, LYue/ۥۡۨۥۦ;->ۥ۟۟۟ۤ(LYue/ۥۡۨۥۦ;)V

    invoke-virtual {p1, p2}, LYue/ۥۡۨۥۦ;->ۥ۟۟۟ۤ(LYue/ۥۡۨۥۦ;)V

    move-object p2, p1

    :goto_0
    iput-object p2, v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-virtual {p2}, LYue/ۥۡۨۥۦ;->ۥ۟۟۟۟()I

    move-result p1

    int-to-long p1, p1

    invoke-virtual {v3}, LYue/ۥۡۨۥۦ;->ۥ۟۟۟۟()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr p1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, p1, v3

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-virtual {v2}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۧ۠()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۧ۠()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v5

    new-array v7, v6, [LYue/ۥ۠ۤۨ;

    invoke-interface {v5, v7}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [LYue/ۥ۠ۤۨ;

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_2
    :goto_1
    const/4 v5, 0x0

    :goto_2
    iget-object v7, v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v7, LYue/ۥۡۨۥۦ;

    invoke-virtual {v2, v7}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۨۧ(LYue/ۥۡۨۥۦ;)V

    invoke-static {v2}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟۠ۡ(LYue/ۥ۠ۤۧۦ;)LYue/ۥۢۡ۟ۡ;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, LYue/ۥ۠ۤۧۦ;->ۥۣ۟۟ۤ()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " onSettings"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-instance v9, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ;

    const/4 v10, 0x1

    invoke-direct {v9, v8, v10, v2, v0}, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ;-><init>(Ljava/lang/String;ZLYue/ۥ۠ۤۧۦ;LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;)V

    invoke-virtual {v7, v9, v3, v4}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۧ(LYue/ۥۢ۠ۨۦ;J)V

    sget-object v3, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v2}, LYue/ۥ۠ۤۧۦ;->ۥۣ۟۟ۧ()LYue/ۥ۠ۤۨ۟;

    move-result-object v3

    iget-object v0, v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v0, LYue/ۥۡۨۥۦ;

    invoke-virtual {v3, v0}, LYue/ۥ۠ۤۨ۟;->ۥ۟(LYue/ۥۡۨۥۦ;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_6

    :catch_0
    move-exception v0

    :try_start_4
    invoke-static {v2, v0}, LYue/ۥ۠ۤۧۦ;->ۥ۟(LYue/ۥ۠ۤۧۦ;Ljava/io/IOException;)V

    :goto_3
    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit v1

    if-eqz v5, :cond_3

    array-length v0, v5

    :goto_4
    if-ge v6, v0, :cond_3

    aget-object v1, v5, v6

    monitor-enter v1

    :try_start_5
    invoke-virtual {v1, p1, p2}, LYue/ۥ۠ۤۨ;->ۥ(J)V

    sget-object v2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    monitor-exit v1

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_3
    return-void

    :goto_5
    :try_start_6
    monitor-exit v2

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_6
    monitor-exit v1

    throw p1
.end method

.method public final ۥ۟۟۠ۦ()LYue/ۥ۠ۤۧۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۤۧۨ;

    return-object v0
.end method

.method public ۥ۟۟۠ۧ()V
    .locals 5

    sget-object v0, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۡ۠ۢ;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۤۧۨ;

    invoke-virtual {v2, p0}, LYue/ۥ۠ۤۧۨ;->ۥ۟۟۟(LYue/ۥ۠ۤۧۨ$ۥ۟۟;)V

    :cond_0
    iget-object v2, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۤۧۨ;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, p0}, LYue/ۥ۠ۤۧۨ;->ۥ۟۟(ZLYue/ۥ۠ۤۧۨ$ۥ۟۟;)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۡ۠ۢ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v0, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟ۡۢ:LYue/ۥ۠ۡ۠ۢ;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v3, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v3, v2, v0, v1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۢۨ(LYue/ۥ۠ۡ۠ۢ;LYue/ۥ۠ۡ۠ۢ;Ljava/io/IOException;)V

    :goto_0
    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۤۧۨ;

    invoke-static {v0}, LYue/ۥۣۢۥ۟;->ۥ۟۟۠(Ljava/io/Closeable;)V

    goto :goto_2

    :catchall_0
    move-exception v3

    goto :goto_3

    :catch_0
    move-exception v1

    goto :goto_1

    :catchall_1
    move-exception v3

    move-object v2, v0

    goto :goto_3

    :catch_1
    move-exception v1

    move-object v2, v0

    :goto_1
    :try_start_2
    sget-object v0, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡ۠ۢ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v2, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v2, v0, v0, v1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۢۨ(LYue/ۥ۠ۡ۠ۢ;LYue/ۥ۠ۡ۠ۢ;Ljava/io/IOException;)V

    goto :goto_0

    :goto_2
    return-void

    :goto_3
    iget-object v4, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v4, v2, v0, v1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۢۨ(LYue/ۥ۠ۡ۠ۢ;LYue/ۥ۠ۡ۠ۢ;Ljava/io/IOException;)V

    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۤۧۨ;

    invoke-static {v0}, LYue/ۥۣۢۥ۟;->ۥ۟۟۠(Ljava/io/Closeable;)V

    throw v3
.end method
