.class public final LYue/ۥۢ۠ۦۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۦۨۨ;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06e8<",
        "TT;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥۣ۠۠ۨ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public volatile ۥ۟۟۠ۤ:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠۠ۨ;Ljava/lang/Object;)V
    .locals 1
    .param p1    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥۢ۠ۦۧ;->ۥۣ۟۟۠:LYue/ۥۣ۠۠ۨ;

    .line 3
    sget-object p1, LYue/ۥۢۢۧۧ;->ۥ:LYue/ۥۢۢۧۧ;

    iput-object p1, p0, LYue/ۥۢ۠ۦۧ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    if-nez p2, :cond_0

    move-object p2, p0

    .line 4
    :cond_0
    iput-object p2, p0, LYue/ۥۢ۠ۦۧ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۣ۠۠ۨ;Ljava/lang/Object;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, LYue/ۥۢ۠ۦۧ;-><init>(LYue/ۥۣ۠۠ۨ;Ljava/lang/Object;)V

    return-void
.end method

.method private final ۥ()Ljava/lang/Object;
    .locals 2

    new-instance v0, LYue/ۥ۠ۥۢ۟;

    invoke-virtual {p0}, LYue/ۥۢ۠ۦۧ;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥ۠ۥۢ۟;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۠ۦۧ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    sget-object v1, LYue/ۥۢۢۧۧ;->ۥ:LYue/ۥۢۢۧۧ;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LYue/ۥۢ۠ۦۧ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, LYue/ۥۢ۠ۦۧ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    if-eq v2, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LYue/ۥۢ۠ۦۧ;->ۥۣ۟۟۠:LYue/ۥۣ۠۠ۨ;

    invoke-static {v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-interface {v1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, LYue/ۥۢ۠ۦۧ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, LYue/ۥۢ۠ۦۧ;->ۥۣ۟۟۠:LYue/ۥۣ۠۠ۨ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public isInitialized()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۠ۦۧ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    sget-object v1, LYue/ۥۢۢۧۧ;->ۥ:LYue/ۥۢۢۧۧ;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢ۠ۦۧ;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢ۠ۦۧ;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    :goto_0
    return-object v0
.end method
