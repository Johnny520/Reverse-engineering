.class public LYue/ۥ۠ۢۧ۠;
.super LYue/ۥۢۡۤۧ;
.source "SourceFile"


# instance fields
.field public ۥ۟۟۟۠:LYue/ۥۢۡۤۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۢۡۤۧ;)V
    .locals 1
    .param p1    # LYue/ۥۢۡۤۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "delegate"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LYue/ۥۢۡۤۧ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۢۧ۠;->ۥ۟۟۟۠:LYue/ۥۢۡۤۧ;

    return-void
.end method


# virtual methods
.method public ۥ۟()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧ۠;->ۥ۟۟۟۠:LYue/ۥۢۡۤۧ;

    invoke-virtual {v0}, LYue/ۥۢۡۤۧ;->ۥ۟()LYue/ۥۢۡۤۧ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧ۠;->ۥ۟۟۟۠:LYue/ۥۢۡۤۧ;

    invoke-virtual {v0}, LYue/ۥۢۡۤۧ;->ۥ۟۟()LYue/ۥۢۡۤۧ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟()J
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۢۧ۠;->ۥ۟۟۟۠:LYue/ۥۢۡۤۧ;

    invoke-virtual {v0}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟۟()J

    move-result-wide v0

    return-wide v0
.end method

.method public ۥ۟۟۟۠(J)LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧ۠;->ۥ۟۟۟۠:LYue/ۥۢۡۤۧ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟۠(J)LYue/ۥۢۡۤۧ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۡ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۧ۠;->ۥ۟۟۟۠:LYue/ۥۢۡۤۧ;

    invoke-virtual {v0}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۡ()Z

    move-result v0

    return v0
.end method

.method public ۥۣ۟۟۟()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧ۠;->ۥ۟۟۟۠:LYue/ۥۢۡۤۧ;

    invoke-virtual {v0}, LYue/ۥۢۡۤۧ;->ۥۣ۟۟۟()V

    return-void
.end method

.method public ۥ۟۟۟ۤ(JLjava/util/concurrent/TimeUnit;)LYue/ۥۢۡۤۧ;
    .locals 1
    .param p3    # Ljava/util/concurrent/TimeUnit;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "unit"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۢۧ۠;->ۥ۟۟۟۠:LYue/ۥۢۡۤۧ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۤ(JLjava/util/concurrent/TimeUnit;)LYue/ۥۢۡۤۧ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۥ()J
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۢۧ۠;->ۥ۟۟۟۠:LYue/ۥۢۡۤۧ;

    invoke-virtual {v0}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۥ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۥ۟۟۟ۧ()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "delegate"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧ۠;->ۥ۟۟۟۠:LYue/ۥۢۡۤۧ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۨ(LYue/ۥۢۡۤۧ;)LYue/ۥ۠ۢۧ۠;
    .locals 1
    .param p1    # LYue/ۥۢۡۤۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "delegate"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠ۢۧ۠;->ۥ۟۟۟۠:LYue/ۥۢۡۤۧ;

    return-object p0
.end method

.method public final synthetic ۥ۟۟۠(LYue/ۥۢۡۤۧ;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠ۢۧ۠;->ۥ۟۟۟۠:LYue/ۥۢۡۤۧ;

    return-void
.end method
