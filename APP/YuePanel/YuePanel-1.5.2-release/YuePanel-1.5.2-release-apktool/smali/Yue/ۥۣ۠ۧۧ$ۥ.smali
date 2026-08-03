.class public LYue/ۥۣ۠ۧۧ$ۥ;
.super Landroidx/lifecycle/MutableLiveData;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۧۥ$ۥ۟۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۧۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/lifecycle/MutableLiveData<",
        "TD;>;",
        "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5$\u06e5\u06df\u06df<",
        "TD;>;"
    }
.end annotation


# instance fields
.field public final ۥ:I

.field public final ۥ۟:Landroid/os/Bundle;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public final ۥ۟۟:LYue/ۥۣ۠ۧۥ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟:Landroidx/lifecycle/LifecycleOwner;

.field public ۥ۟۟۟۟:LYue/ۥۣ۠ۧۧ$ۥ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e7$\u06e5\u06df<",
            "TD;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟۠:LYue/ۥۣ۠ۧۥ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILandroid/os/Bundle;LYue/ۥۣ۠ۧۥ;LYue/ۥۣ۠ۧۥ;)V
    .locals 0
    .param p2    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۧۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۠ۧۥ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/os/Bundle;",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    iput p1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ:I

    iput-object p2, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟:Landroid/os/Bundle;

    iput-object p3, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟:LYue/ۥۣ۠ۧۥ;

    iput-object p4, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۠:LYue/ۥۣ۠ۧۥ;

    invoke-virtual {p3, p1, p0}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۠ۤ(ILYue/ۥۣ۠ۧۥ$ۥ۟۟;)V

    return-void
.end method


# virtual methods
.method public onActive()V
    .locals 2

    sget-boolean v0, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  Starting: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LoaderManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟:LYue/ۥۣ۠ۧۥ;

    invoke-virtual {v0}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۠ۨ()V

    return-void
.end method

.method public onInactive()V
    .locals 2

    sget-boolean v0, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  Stopping: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LoaderManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟:LYue/ۥۣ۠ۧۥ;

    invoke-virtual {v0}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟ۡ()V

    return-void
.end method

.method public removeObserver(Landroidx/lifecycle/Observer;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/Observer;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/Observer<",
            "-TD;>;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Landroidx/lifecycle/LiveData;->removeObserver(Landroidx/lifecycle/Observer;)V

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟:Landroidx/lifecycle/LifecycleOwner;

    iput-object p1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۟:LYue/ۥۣ۠ۧۧ$ۥ۟;

    return-void
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۠:LYue/ۥۣ۠ۧۥ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۠ۦ()V

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۠:LYue/ۥۣ۠ۧۥ;

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "LoaderInfo{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟:LYue/ۥۣ۠ۧۥ;

    invoke-static {v1, v0}, LYue/ۥ۟ۨۤۤ;->ۥ(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(LYue/ۥۣ۠ۧۥ;Ljava/lang/Object;)V
    .locals 2
    .param p1    # LYue/ۥۣ۠ۧۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;TD;)V"
        }
    .end annotation

    sget-boolean p1, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟:Z

    const-string v0, "LoaderManager"

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onLoadComplete: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p1, v1, :cond_1

    invoke-virtual {p0, p2}, LYue/ۥۣ۠ۧۧ$ۥ;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-boolean p1, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟:Z

    if-eqz p1, :cond_2

    const-string p1, "onLoadComplete was incorrectly called on a background thread"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    invoke-virtual {p0, p2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public ۥ۟(Z)LYue/ۥۣ۠ۧۥ;
    .locals 2
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;"
        }
    .end annotation

    sget-boolean v0, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  Destroying: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LoaderManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟:LYue/ۥۣ۠ۧۥ;

    invoke-virtual {v0}, LYue/ۥۣ۠ۧۥ;->ۥ۟()Z

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟:LYue/ۥۣ۠ۧۥ;

    invoke-virtual {v0}, LYue/ۥۣ۠ۧۥ;->ۥ()V

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۟:LYue/ۥۣ۠ۧۧ$ۥ۟;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, LYue/ۥۣ۠ۧۧ$ۥ;->removeObserver(Landroidx/lifecycle/Observer;)V

    if-eqz p1, :cond_1

    invoke-virtual {v0}, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ۟۟()V

    :cond_1
    iget-object v1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟:LYue/ۥۣ۠ۧۥ;

    invoke-virtual {v1, p0}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟ۡ۠(LYue/ۥۣ۠ۧۥ$ۥ۟۟;)V

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ۟()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    if-eqz p1, :cond_4

    :cond_3
    iget-object p1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟:LYue/ۥۣ۠ۧۥ;

    invoke-virtual {p1}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۠ۦ()V

    iget-object p1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۠:LYue/ۥۣ۠ۧۥ;

    return-object p1

    :cond_4
    iget-object p1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟:LYue/ۥۣ۠ۧۥ;

    return-object p1
.end method

.method public ۥ۟۟(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mId="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mArgs="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mLoader="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟:LYue/ۥۣ۠ۧۥ;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟:LYue/ۥۣ۠ۧۥ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3, p4}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    iget-object p2, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۟:LYue/ۥۣ۠ۧۧ$ۥ۟;

    if-eqz p2, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mCallbacks="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۟:LYue/ۥۣ۠ۧۧ$ۥ۟;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object p2, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۟:LYue/ۥۣ۠ۧۧ$ۥ۟;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4, p3}, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ(Ljava/lang/String;Ljava/io/PrintWriter;)V

    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mData="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟()LYue/ۥۣ۠ۧۥ;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p2, p4}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "mStarted="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->hasActiveObservers()Z

    move-result p1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    return-void
.end method

.method public ۥ۟۟۟()LYue/ۥۣ۠ۧۥ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟:LYue/ۥۣ۠ۧۥ;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->hasActiveObservers()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۟:LYue/ۥۣ۠ۧۧ$ۥ۟;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ۟()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public ۥ۟۟۟۠()V
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟:Landroidx/lifecycle/LifecycleOwner;

    iget-object v1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۟:LYue/ۥۣ۠ۧۧ$ۥ۟;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-super {p0, v1}, Landroidx/lifecycle/LiveData;->removeObserver(Landroidx/lifecycle/Observer;)V

    invoke-virtual {p0, v0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟ۡ(Landroidx/lifecycle/LifecycleOwner;LYue/ۥۣ۠ۧۦ$ۥ;)LYue/ۥۣ۠ۧۥ;
    .locals 2
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۧۦ$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LifecycleOwner;",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e6$\u06e5<",
            "TD;>;)",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۧۧ$ۥ۟;

    iget-object v1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟:LYue/ۥۣ۠ۧۥ;

    invoke-direct {v0, v1, p2}, LYue/ۥۣ۠ۧۧ$ۥ۟;-><init>(LYue/ۥۣ۠ۧۥ;LYue/ۥۣ۠ۧۦ$ۥ;)V

    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    iget-object p2, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۟:LYue/ۥۣ۠ۧۧ$ۥ۟;

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, LYue/ۥۣ۠ۧۧ$ۥ;->removeObserver(Landroidx/lifecycle/Observer;)V

    :cond_0
    iput-object p1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟:Landroidx/lifecycle/LifecycleOwner;

    iput-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟۟۟:LYue/ۥۣ۠ۧۧ$ۥ۟;

    iget-object p1, p0, LYue/ۥۣ۠ۧۧ$ۥ;->ۥ۟۟:LYue/ۥۣ۠ۧۥ;

    return-object p1
.end method
