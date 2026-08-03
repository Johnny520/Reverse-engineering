.class public LYue/ۥۣ۠ۧۧ;
.super LYue/ۥۣ۠ۧۦ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠ۧۧ$ۥ۟۟;,
        LYue/ۥۣ۠ۧۧ$ۥ۟;,
        LYue/ۥۣ۠ۧۧ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟:Ljava/lang/String; = "LoaderManager"

.field public static ۥ۟۟۟:Z


# instance fields
.field public final ۥ:Landroidx/lifecycle/LifecycleOwner;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/ViewModelStore;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/ViewModelStore;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥۣ۠ۧۦ;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠ۧۧ;->ۥ:Landroidx/lifecycle/LifecycleOwner;

    invoke-static {p2}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟(Landroidx/lifecycle/ViewModelStore;)LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "LoaderManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۣ۠ۧۧ;->ۥ:Landroidx/lifecycle/LifecycleOwner;

    invoke-static {v1, v0}, LYue/ۥ۟ۨۤۤ;->ۥ(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(I)V
    .locals 2
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {v0}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟۟۠()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_2

    sget-boolean v0, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "destroyLoader in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LoaderManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟۟(I)LYue/ۥۣ۠ۧۧ$ۥ;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟(Z)LYue/ۥۣ۠ۧۥ;

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥۣ۟۟۟(I)V

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "destroyLoader must be called on the main thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Called while creating a loader"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {v0, p1, p2, p3, p4}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۟۟(I)LYue/ۥۣ۠ۧۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I)",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {v0}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟۟۠()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟۟(I)LYue/ۥۣ۠ۧۧ$ۥ;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟()LYue/ۥۣ۠ۧۥ;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Called while creating a loader"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟۠()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {v0}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟۟۟()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۡ(ILandroid/os/Bundle;LYue/ۥۣ۠ۧۦ$ۥ;)LYue/ۥۣ۠ۧۥ;
    .locals 4
    .param p2    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۧۦ$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroid/os/Bundle;",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e6$\u06e5<",
            "TD;>;)",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {v0}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟۟۠()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟۟(I)LYue/ۥۣ۠ۧۧ$ۥ;

    move-result-object v0

    sget-boolean v1, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟:Z

    const-string v2, "LoaderManager"

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initLoader in "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ": args="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟ۤ(ILandroid/os/Bundle;LYue/ۥۣ۠ۧۦ$ۥ;LYue/ۥۣ۠ۧۥ;)LYue/ۥۣ۠ۧۥ;

    move-result-object p1

    return-object p1

    :cond_1
    sget-boolean p1, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟:Z

    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "  Re-using existing loader "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object p1, p0, LYue/ۥۣ۠ۧۧ;->ۥ:Landroidx/lifecycle/LifecycleOwner;

    invoke-virtual {v0, p1, p3}, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟ۡ(Landroidx/lifecycle/LifecycleOwner;LYue/ۥۣ۠ۧۦ$ۥ;)LYue/ۥۣ۠ۧۥ;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "initLoader must be called on the main thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called while creating a loader"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۢ()V
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {v0}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟۟ۡ()V

    return-void
.end method

.method public ۥۣ۟۟۟(ILandroid/os/Bundle;LYue/ۥۣ۠ۧۦ$ۥ;)LYue/ۥۣ۠ۧۥ;
    .locals 2
    .param p2    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۧۦ$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroid/os/Bundle;",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e6$\u06e5<",
            "TD;>;)",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {v0}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟۟۠()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_2

    sget-boolean v0, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "restartLoader in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": args="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LoaderManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟۟(I)LYue/ۥۣ۠ۧۧ$ۥ;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟(Z)LYue/ۥۣ۠ۧۥ;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, p2, p3, v0}, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟ۤ(ILandroid/os/Bundle;LYue/ۥۣ۠ۧۦ$ۥ;LYue/ۥۣ۠ۧۥ;)LYue/ۥۣ۠ۧۥ;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "restartLoader must be called on the main thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called while creating a loader"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟ۤ(ILandroid/os/Bundle;LYue/ۥۣ۠ۧۦ$ۥ;LYue/ۥۣ۠ۧۥ;)LYue/ۥۣ۠ۧۥ;
    .locals 2
    .param p2    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۧۦ$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۠ۧۥ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroid/os/Bundle;",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e6$\u06e5<",
            "TD;>;",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;)",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {v0}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟۟ۤ()V

    invoke-interface {p3, p1, p2}, LYue/ۥۣ۠ۧۦ$ۥ;->ۥ۟(ILandroid/os/Bundle;)LYue/ۥۣ۠ۧۥ;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isMemberClass()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Object returned from onCreateLoader must not be a non-static inner member class: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v1, LYue/ۥۣ۠ۧۧ$ۥ;

    invoke-direct {v1, p1, p2, v0, p4}, LYue/ۥۣ۠ۧۧ$ۥ;-><init>(ILandroid/os/Bundle;LYue/ۥۣ۠ۧۥ;LYue/ۥۣ۠ۧۥ;)V

    sget-boolean p2, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟:Z

    if-eqz p2, :cond_2

    const-string p2, "LoaderManager"

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "  Created new loader "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p2, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object p2, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {p2, p1, v1}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟۟۟ۢ(ILYue/ۥۣ۠ۧۧ$ۥ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {p1}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟()V

    iget-object p1, p0, LYue/ۥۣ۠ۧۧ;->ۥ:Landroidx/lifecycle/LifecycleOwner;

    invoke-virtual {v1, p1, p3}, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟ۡ(Landroidx/lifecycle/LifecycleOwner;LYue/ۥۣ۠ۧۦ$ۥ;)LYue/ۥۣ۠ۧۥ;

    move-result-object p1

    return-object p1

    :cond_3
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Object returned from onCreateLoader must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    iget-object p2, p0, LYue/ۥۣ۠ۧۧ;->ۥ۟:LYue/ۥۣ۠ۧۧ$ۥ۟۟;

    invoke-virtual {p2}, LYue/ۥۣ۠ۧۧ$ۥ۟۟;->ۥ۟()V

    throw p1
.end method
