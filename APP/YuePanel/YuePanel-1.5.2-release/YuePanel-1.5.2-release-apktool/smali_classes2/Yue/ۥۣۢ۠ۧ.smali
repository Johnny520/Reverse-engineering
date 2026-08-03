.class public final LYue/ۥۣۢ۠ۧ;
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

.field public ۥ۟۟۠ۤ:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠۠ۨ;)V
    .locals 1
    .param p1    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۢ۠ۧ;->ۥۣ۟۟۠:LYue/ۥۣ۠۠ۨ;

    sget-object p1, LYue/ۥۢۢۧۧ;->ۥ:LYue/ۥۢۢۧۧ;

    iput-object p1, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-void
.end method

.method private final ۥ()Ljava/lang/Object;
    .locals 2

    new-instance v0, LYue/ۥ۠ۥۢ۟;

    invoke-virtual {p0}, LYue/ۥۣۢ۠ۧ;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥ۠ۥۢ۟;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    sget-object v1, LYue/ۥۢۢۧۧ;->ۥ:LYue/ۥۢۢۧۧ;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۣۢ۠ۧ;->ۥۣ۟۟۠:LYue/ۥۣ۠۠ۨ;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-interface {v0}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۣۢ۠ۧ;->ۥۣ۟۟۠:LYue/ۥۣ۠۠ۨ;

    :cond_0
    iget-object v0, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-object v0
.end method

.method public isInitialized()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

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

    invoke-virtual {p0}, LYue/ۥۣۢ۠ۧ;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣۢ۠ۧ;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    :goto_0
    return-object v0
.end method
