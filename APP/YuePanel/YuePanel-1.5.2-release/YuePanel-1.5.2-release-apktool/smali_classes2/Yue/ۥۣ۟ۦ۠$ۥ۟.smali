.class public final LYue/ۥۣ۟ۦ۠$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۦ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۦ۠;->ۥ۟(LYue/ۥۣ۟ۦۡ;LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Z

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۠;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣ۟ۦۡ;

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥۣۣ۟۟;


# direct methods
.method public constructor <init>(LYue/ۥۣۣ۟۠;LYue/ۥۣ۟ۦۡ;LYue/ۥۣۣ۟۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۠;

    iput-object p2, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۦۡ;

    iput-object p3, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۣۣ۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥۣ۟۟۠:Z

    if-nez v0, :cond_0

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0, v1}, LYue/ۥۣۢۥ۟;->ۥ۟۟۠ۦ(LYue/ۥۣۢ۟ۦ;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥۣ۟۟۠:Z

    iget-object v0, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۦۡ;

    invoke-interface {v0}, LYue/ۥۣ۟ۦۡ;->ۥ۟۟۠۟()V

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۢ۟ۦ;->close()V

    return-void
.end method

.method public ۥ()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۢ۟ۦ;->ۥ()LYue/ۥۢۡۤۧ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J
    .locals 8
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۠;

    invoke-interface {v1, p1, p2, p3}, LYue/ۥۣۢ۟ۦ;->ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J

    move-result-wide p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v1, -0x1

    cmp-long v3, p2, v1

    if-nez v3, :cond_1

    iget-boolean p1, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥۣ۟۟۠:Z

    if-nez p1, :cond_0

    iput-boolean v0, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥۣ۟۟۠:Z

    iget-object p1, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۣۣ۟۟;

    invoke-interface {p1}, LYue/ۥۣۢ۟ۡ;->close()V

    :cond_0
    return-wide v1

    :cond_1
    iget-object v0, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۣۣ۟۟;

    invoke-interface {v0}, LYue/ۥۣۣ۟۟;->ۥ۟۟۟ۡ()LYue/ۥۣ۟ۢۨ;

    move-result-object v3

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    sub-long v4, v0, p2

    move-object v2, p1

    move-wide v6, p2

    invoke-virtual/range {v2 .. v7}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۡۡ(LYue/ۥۣ۟ۢۨ;JJ)LYue/ۥۣ۟ۢۨ;

    iget-object p1, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۣۣ۟۟;

    invoke-interface {p1}, LYue/ۥۣۣ۟۟;->ۥۣ۟۟ۢ()LYue/ۥۣۣ۟۟;

    return-wide p2

    :catch_0
    move-exception p1

    iget-boolean p2, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥۣ۟۟۠:Z

    if-nez p2, :cond_2

    iput-boolean v0, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥۣ۟۟۠:Z

    iget-object p2, p0, LYue/ۥۣ۟ۦ۠$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۦۡ;

    invoke-interface {p2}, LYue/ۥۣ۟ۦۡ;->ۥ۟۟۠۟()V

    :cond_2
    throw p1
.end method
