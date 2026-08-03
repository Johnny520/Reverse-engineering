.class public final LYue/ۥ۟ۧۧۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(Ljava/lang/Thread;)Z
    .locals 0
    .param p0    # Ljava/lang/Thread;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "isSchedulerWorker"
    .end annotation

    instance-of p0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;

    return p0
.end method

.method public static final ۥ۟(Ljava/lang/Thread;)Z
    .locals 1
    .param p0    # Ljava/lang/Thread;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "mayNotBlock"
    .end annotation

    instance-of v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;

    if-eqz v0, :cond_0

    check-cast p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;

    iget-object p0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    sget-object v0, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
