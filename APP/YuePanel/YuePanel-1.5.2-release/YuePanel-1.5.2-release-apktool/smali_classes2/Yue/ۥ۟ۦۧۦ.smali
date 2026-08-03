.class public final LYue/ۥ۟ۦۧۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:LYue/ۥۡۦ۠ۦ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    const-wide/16 v0, 0x5

    .line 6
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const/4 v3, 0x5

    invoke-direct {p0, v3, v0, v1, v2}, LYue/ۥ۟ۦۧۦ;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public constructor <init>(IJLjava/util/concurrent/TimeUnit;)V
    .locals 7
    .param p4    # Ljava/util/concurrent/TimeUnit;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "timeUnit"

    invoke-static {p4, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, LYue/ۥۡۦ۠ۦ;

    .line 4
    sget-object v2, LYue/ۥۢۡ۟ۢ;->ۥۣ۟۟۟:LYue/ۥۢۡ۟ۢ;

    move-object v1, v0

    move v3, p1

    move-wide v4, p2

    move-object v6, p4

    .line 5
    invoke-direct/range {v1 .. v6}, LYue/ۥۡۦ۠ۦ;-><init>(LYue/ۥۢۡ۟ۢ;IJLjava/util/concurrent/TimeUnit;)V

    invoke-direct {p0, v0}, LYue/ۥ۟ۦۧۦ;-><init>(LYue/ۥۡۦ۠ۦ;)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۦ۠ۦ;)V
    .locals 1
    .param p1    # LYue/ۥۡۦ۠ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "delegate"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥ۟ۦۧۦ;->ۥ:LYue/ۥۡۦ۠ۦ;

    return-void
.end method


# virtual methods
.method public final ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۦۧۦ;->ۥ:LYue/ۥۡۦ۠ۦ;

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۦ;->ۥ۟۟۟()I

    move-result v0

    return v0
.end method

.method public final ۥ۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۦۧۦ;->ۥ:LYue/ۥۡۦ۠ۦ;

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۦ;->ۥ۟۟۟۟()V

    return-void
.end method

.method public final ۥ۟۟()LYue/ۥۡۦ۠ۦ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۧۦ;->ۥ:LYue/ۥۡۦ۠ۦ;

    return-object v0
.end method

.method public final ۥ۟۟۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۦۧۦ;->ۥ:LYue/ۥۡۦ۠ۦ;

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۦ;->ۥ۟۟۟۠()I

    move-result v0

    return v0
.end method
