.class public LYue/ۥۢۦۡۢ;
.super LYue/ۥۢۦۡۤ;
.source "SourceFile"


# instance fields
.field public ۥ۟۟ۡ:LYue/ۥۢۦۣۢ;


# direct methods
.method public constructor <init>(LYue/ۥۢۦۣۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-direct {p0, p1}, LYue/ۥۢۦۡۤ;-><init>(LYue/ۥۢۦۢۤ;)V

    iput-object p1, p0, LYue/ۥۢۦۡۢ;->ۥ۟۟ۡ:LYue/ۥۢۦۣۢ;

    return-void
.end method


# virtual methods
.method public ۥ۟۟۠()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۦ:LYue/ۥۢۦۡ;

    iget-object v1, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۥ:LYue/ۥۢۦۢۤ;

    invoke-interface {v0, v1, p0}, LYue/ۥۢۦۡ;->ۥ۟(LYue/ۥۢۦۢۤ;LYue/ۥۢۦۡ۠;)V

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۥ:LYue/ۥۢۦۢۤ;

    invoke-interface {v0}, LYue/ۥۢۦۢۤ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۥ:LYue/ۥۢۦۢۤ;

    invoke-interface {v0}, LYue/ۥۢۦۢۤ;->next()I

    :cond_0
    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->ۥ۟۟۟ۦ()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۥ:LYue/ۥۢۦۢۤ;

    invoke-interface {v0}, LYue/ۥۢۦۢۤ;->ۥ۟۟۠()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    iget-object v0, p0, LYue/ۥۢۦۡۢ;->ۥ۟۟ۡ:LYue/ۥۢۦۣۢ;

    invoke-virtual {v0}, LYue/ۥۢۦۣۢ;->ۥ۟۟۠ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۦ:LYue/ۥۢۦۡ;

    iget-object v1, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۥ:LYue/ۥۢۦۢۤ;

    invoke-interface {v0, v1, p0}, LYue/ۥۢۦۡ;->ۥ۟(LYue/ۥۢۦۢۤ;LYue/ۥۢۦۡ۠;)V

    :cond_1
    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->ۥ۟۟۟ۥ()V

    :cond_2
    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->ۥ۟۟۟ۨ()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
