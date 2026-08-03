.class public abstract LYue/ۥۢۥۡۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۥۡۦ;


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥۡۤۡ۠;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥۣ۟۟۟(LYue/ۥۢۥۡ۠;)LYue/ۥۡۤۡ۠;
    .locals 0

    iget-object p1, p0, LYue/ۥۢۥۡۡ;->ۥۣ۟۟۠:LYue/ۥۡۤۡ۠;

    if-nez p1, :cond_0

    new-instance p1, LYue/ۥۡۤۡ۠;

    invoke-direct {p1}, LYue/ۥۡۤۡ۠;-><init>()V

    iput-object p1, p0, LYue/ۥۢۥۡۡ;->ۥۣ۟۟۠:LYue/ۥۡۤۡ۠;

    :cond_0
    iget-object p1, p0, LYue/ۥۢۥۡۡ;->ۥۣ۟۟۠:LYue/ۥۡۤۡ۠;

    return-object p1
.end method

.method public ۥ۟۟۠۠(LYue/ۥۢۥۡ۠;LYue/ۥ۟ۤۨۡ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    return-void
.end method

.method public ۥۣ۟۟۠(LYue/ۥۢۥۡ۠;LYue/ۥۣ۠۠۠;)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟ۡۥ(LYue/ۥۢۥۡ۠;LYue/ۥ۟ۤۨۡ;LYue/ۥۣۡۨۡ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    return-void
.end method

.method public ۥ۟۟ۡۨ(LYue/ۥۢۥۡ۠;LYue/ۥ۠۠۠۟;LYue/ۥ۟ۤۨۡ;)LYue/ۥۣۡۨۢ;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    new-instance p1, LYue/ۥۣ۠ۤۡ;

    invoke-direct {p1}, LYue/ۥۣ۠ۤۡ;-><init>()V

    return-object p1
.end method

.method public ۥ۟۟ۢ۟(LYue/ۥۢۥۡ۠;LYue/ۥۣ۠۠۠;)V
    .locals 1

    new-instance v0, LYue/ۥۡۤۤ;

    check-cast p2, LYue/ۥۡۤۡ۠;

    invoke-direct {v0, p2}, LYue/ۥۡۤۤ;-><init>(LYue/ۥۡۤۡ۠;)V

    invoke-interface {p1, v0}, LYue/ۥۢۥۡ۠;->ۥ۟۟۟ۡ(LYue/ۥۣ۠۠۠;)V

    return-void
.end method
