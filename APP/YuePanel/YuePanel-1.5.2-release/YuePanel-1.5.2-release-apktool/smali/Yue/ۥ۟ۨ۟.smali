.class public LYue/ۥ۟ۨ۟;
.super LYue/ۥۣ۟ۢ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06e2\u06df\u06e3<",
        "Landroid/database/Cursor;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۡ:LYue/ۥۣ۠ۧۥ$ۥ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "Landroid/database/Cursor;",
            ">.\u06e5;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۢ:Landroid/net/Uri;

.field public ۥۣ۟۟۠:[Ljava/lang/String;

.field public ۥ۟۟۠ۤ:Ljava/lang/String;

.field public ۥ۟۟۠ۥ:[Ljava/lang/String;

.field public ۥ۟۟۠ۦ:Ljava/lang/String;

.field public ۥ۟۟۠ۧ:Landroid/database/Cursor;

.field public ۥ۟۟۠ۨ:LYue/ۥۣ۟ۨۧ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, LYue/ۥۣ۟ۢ۟;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, LYue/ۥۣ۠ۧۥ$ۥ;

    invoke-direct {p1, p0}, LYue/ۥۣ۠ۧۥ$ۥ;-><init>(LYue/ۥۣ۠ۧۥ;)V

    iput-object p1, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۡ:LYue/ۥۣ۠ۧۥ$ۥ;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/net/Uri;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # [Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p5    # [Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1}, LYue/ۥۣ۟ۢ۟;-><init>(Landroid/content/Context;)V

    .line 4
    new-instance p1, LYue/ۥۣ۠ۧۥ$ۥ;

    invoke-direct {p1, p0}, LYue/ۥۣ۠ۧۥ$ۥ;-><init>(LYue/ۥۣ۠ۧۥ;)V

    iput-object p1, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۡ:LYue/ۥۣ۠ۧۥ$ۥ;

    .line 5
    iput-object p2, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۢ:Landroid/net/Uri;

    .line 6
    iput-object p3, p0, LYue/ۥ۟ۨ۟;->ۥۣ۟۟۠:[Ljava/lang/String;

    .line 7
    iput-object p4, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    .line 8
    iput-object p5, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۥ:[Ljava/lang/String;

    .line 9
    iput-object p6, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ۟۟۟۠(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/database/Cursor;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۨ۟;->ۥ۟۟ۢۡ(Landroid/database/Cursor;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mUri="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۢ:Landroid/net/Uri;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mProjection="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, LYue/ۥ۟ۨ۟;->ۥۣ۟۟۠:[Ljava/lang/String;

    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mSelection="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mSelectionArgs="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۥ:[Ljava/lang/String;

    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mSortOrder="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mCursor="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۧ:Landroid/database/Cursor;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "mContentChanged="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p1, p0, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۟ۢ:Z

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    return-void
.end method

.method public ۥ۟۟۠ۡ()V
    .locals 1

    invoke-super {p0}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۠ۡ()V

    invoke-virtual {p0}, LYue/ۥ۟ۨ۟;->ۥۣ۟۟۠()V

    iget-object v0, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۧ:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۧ:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۧ:Landroid/database/Cursor;

    return-void
.end method

.method public ۥ۟۟۠ۢ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۧ:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, LYue/ۥ۟ۨ۟;->ۥ۟۟ۢۡ(Landroid/database/Cursor;)V

    :cond_0
    invoke-virtual {p0}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟ۡ۟()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۧ:Landroid/database/Cursor;

    if-nez v0, :cond_2

    :cond_1
    invoke-virtual {p0}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۟ۢ()V

    :cond_2
    return-void
.end method

.method public ۥۣ۟۟۠()V
    .locals 0

    invoke-virtual {p0}, LYue/ۥۣ۠ۧۥ;->ۥ۟()Z

    return-void
.end method

.method public ۥ۟۟ۡۢ()V
    .locals 1

    invoke-super {p0}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟ۡۢ()V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۨۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۣ۟ۨۧ;->ۥ()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public bridge synthetic ۥ۟۟ۡۧ()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟ۨ۟;->ۥ۟۟ۢۧ()Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟ۡۨ(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/database/Cursor;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۨ۟;->ۥ۟۟ۢۨ(Landroid/database/Cursor;)V

    return-void
.end method

.method public ۥ۟۟ۢۡ(Landroid/database/Cursor;)V
    .locals 2

    invoke-virtual {p0}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۟ۦ()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۧ:Landroid/database/Cursor;

    iput-object p1, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۧ:Landroid/database/Cursor;

    invoke-virtual {p0}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۟ۧ()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-super {p0, p1}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۟۠(Ljava/lang/Object;)V

    :cond_2
    if-eqz v0, :cond_3

    if-eq v0, p1, :cond_3

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_3
    return-void
.end method

.method public ۥ۟۟ۢۢ()[Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨ۟;->ۥۣ۟۟۠:[Ljava/lang/String;

    return-object v0
.end method

.method public ۥۣ۟۟ۢ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟ۢۤ()[Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۥ:[Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟ۢۥ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟ۢۦ()Landroid/net/Uri;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۢ:Landroid/net/Uri;

    return-object v0
.end method

.method public ۥ۟۟ۢۧ()Landroid/database/Cursor;
    .locals 9

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟ۡۦ()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, LYue/ۥۣ۟ۨۧ;

    invoke-direct {v0}, LYue/ۥۣ۟ۨۧ;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۨۧ;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p0}, LYue/ۥۣ۠ۧۥ;->ۥۣ۟۟۟()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    iget-object v3, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۢ:Landroid/net/Uri;

    iget-object v4, p0, LYue/ۥ۟ۨ۟;->ۥۣ۟۟۠:[Ljava/lang/String;

    iget-object v5, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    iget-object v6, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۥ:[Ljava/lang/String;

    iget-object v7, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    iget-object v8, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۨۧ;

    invoke-static/range {v2 .. v8}, LYue/ۥۣ۟ۧۢ;->ۥ(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;LYue/ۥۣ۟ۨۧ;)Landroid/database/Cursor;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_0

    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    iget-object v2, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۡ:LYue/ۥۣ۠ۧۥ$ۥ;

    invoke-interface {v1, v2}, Landroid/database/Cursor;->registerContentObserver(Landroid/database/ContentObserver;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v2

    :try_start_3
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_0
    :goto_0
    monitor-enter p0

    :try_start_4
    iput-object v0, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۨۧ;

    monitor-exit p0

    return-object v1

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :goto_1
    monitor-enter p0

    :try_start_5
    iput-object v0, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۨۧ;

    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v1

    :catchall_2
    move-exception v0

    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v0

    :catchall_3
    move-exception v0

    goto :goto_2

    :cond_1
    :try_start_7
    new-instance v0, LYue/ۥۣۡۤ۟;

    invoke-direct {v0}, LYue/ۥۣۡۤ۟;-><init>()V

    throw v0

    :goto_2
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0
.end method

.method public ۥ۟۟ۢۨ(Landroid/database/Cursor;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    return-void
.end method

.method public ۥۣ۟۟([Ljava/lang/String;)V
    .locals 0
    .param p1    # [Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥ۟ۨ۟;->ۥۣ۟۟۠:[Ljava/lang/String;

    return-void
.end method

.method public ۥۣ۟۟۟(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-void
.end method

.method public ۥۣ۟۟۠([Ljava/lang/String;)V
    .locals 0
    .param p1    # [Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۥ:[Ljava/lang/String;

    return-void
.end method

.method public ۥۣ۟۟ۡ(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    return-void
.end method

.method public ۥۣ۟۟ۢ(Landroid/net/Uri;)V
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥ۟ۨ۟;->ۥ۟۟۠ۢ:Landroid/net/Uri;

    return-void
.end method
