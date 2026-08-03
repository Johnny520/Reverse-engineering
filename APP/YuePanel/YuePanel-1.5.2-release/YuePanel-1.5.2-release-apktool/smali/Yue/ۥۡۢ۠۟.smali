.class public LYue/ۥۡۢ۠۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۡ۠ۧ;
.implements LYue/ۥۣۢ۠۠;


# instance fields
.field public ۥ:LYue/ۥۡۥۤۨ;


# direct methods
.method public constructor <init>(LYue/ۥۡۥۤۨ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۢ۠۟;->ۥ:LYue/ۥۡۥۤۨ;

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۢۦۢۤ;)Z
    .locals 3

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟۟ۨ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟۟ۦ()Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    new-instance v0, LYue/ۥۡۥۤۨ;

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1}, LYue/ۥۡۥۤۨ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LYue/ۥۡۢ۠۟;->ۥ:LYue/ۥۡۥۤۨ;

    invoke-virtual {p1, v0}, LYue/ۥۡۥۤۨ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public ۥ۟(LYue/ۥۢۦ۠ۨ;)Z
    .locals 2

    invoke-interface {p1}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۟ۨ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-interface {p1}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۟ۦ()Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۟ۨ()Z

    move-result v0

    if-eqz v0, :cond_1

    check-cast p1, LYue/ۥۢ۟ۨۤ;

    invoke-interface {p1}, LYue/ۥۢ۟ۨۤ;->getName()LYue/ۥۡۥۤۨ;

    move-result-object p1

    goto :goto_0

    :cond_1
    check-cast p1, LYue/ۥ۠ۡ;

    invoke-interface {p1}, LYue/ۥ۠ۡ;->getName()LYue/ۥۡۥۤۨ;

    move-result-object p1

    :goto_0
    iget-object v0, p0, LYue/ۥۡۢ۠۟;->ۥ:LYue/ۥۡۥۤۨ;

    invoke-virtual {v0, p1}, LYue/ۥۡۥۤۨ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method
