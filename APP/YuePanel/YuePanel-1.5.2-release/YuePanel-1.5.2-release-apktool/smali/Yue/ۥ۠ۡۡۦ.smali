.class public LYue/ۥ۠ۡۡۦ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۦۣۡ;


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LYue/ۥۢۦۣۡ;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LYue/ۥ۠ۡۡۦ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۡۦ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v0}, LYue/ۥۢۦۣۡ;->close()V

    return-void
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۡۦ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v0, p1}, LYue/ۥۢۦۣۡ;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡۡۦ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v0}, LYue/ۥۢۦۣۡ;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡۡۦ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public peek()LYue/ۥۢۦ۠ۨ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۡۦ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v0}, LYue/ۥۢۦۣۡ;->peek()LYue/ۥۢۦ۠ۨ;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡۡۦ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void
.end method

.method public ۥ()LYue/ۥۢۦۣۡ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡۡۦ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    return-object v0
.end method

.method public ۥ۟(LYue/ۥۢۦۣۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۡۡۦ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    return-void
.end method

.method public ۥ۟۟۟۟()LYue/ۥۢۦ۠ۨ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۡۦ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v0}, LYue/ۥۢۦۣۡ;->ۥ۟۟۟۟()LYue/ۥۢۦ۠ۨ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۠()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۡۦ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v0}, LYue/ۥۢۦۣۡ;->ۥ۟۟۟۠()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۡۦ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v0}, LYue/ۥۢۦۣۡ;->ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;

    move-result-object v0

    return-object v0
.end method
