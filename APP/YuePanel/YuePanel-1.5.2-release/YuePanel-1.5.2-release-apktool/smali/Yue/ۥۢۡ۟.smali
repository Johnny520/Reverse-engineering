.class public abstract LYue/ۥۢۡ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract ۥ(Ljava/lang/Runnable;)V
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
.end method

.method public ۥ۟(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥۢۡ۟;->ۥ۟۟()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥۢۡ۟;->ۥ۟۟۟(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public abstract ۥ۟۟()Z
.end method

.method public abstract ۥ۟۟۟(Ljava/lang/Runnable;)V
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
.end method
