.class public abstract LYue/ۥۣۡۡۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1855#2,2:116\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n67#1:116,2\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1855#2,2:116\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n67#1:116,2\n*E\n"
.end annotation


# instance fields
.field private final cancellables:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "LYue/\u06e5\u06df\u06e3\u06e8;",
            ">;"
        }
    .end annotation
.end field

.field private enabledChangedCallback:LYue/ۥۣ۠۠ۨ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field

.field private isEnabled:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LYue/ۥۣۡۡۢ;->isEnabled:Z

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡۡۢ;->cancellables:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method


# virtual methods
.method public final addCancellable(LYue/ۥۣ۟ۨ;)V
    .locals 1
    .param p1    # LYue/ۥۣ۟ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "addCancellable"
    .end annotation

    const-string v0, "cancellable"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣۡۡۢ;->cancellables:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final getEnabledChangedCallback$activity_release()LYue/ۥۣ۠۠ۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۡۢ;->enabledChangedCallback:LYue/ۥۣ۠۠ۨ;

    return-object v0
.end method

.method public handleOnBackCancelled()V
    .locals 0
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    return-void
.end method

.method public abstract handleOnBackPressed()V
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation
.end method

.method public handleOnBackProgressed(LYue/ۥ۟ۢۤۥ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۢۤۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    const-string v0, "backEvent"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public handleOnBackStarted(LYue/ۥ۟ۢۤۥ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۢۤۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    const-string v0, "backEvent"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final isEnabled()Z
    .locals 1
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣۡۡۢ;->isEnabled:Z

    return v0
.end method

.method public final remove()V
    .locals 2
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۡۢ;->cancellables:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۣ۟ۨ;

    invoke-interface {v1}, LYue/ۥۣ۟ۨ;->cancel()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final removeCancellable(LYue/ۥۣ۟ۨ;)V
    .locals 1
    .param p1    # LYue/ۥۣ۟ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "removeCancellable"
    .end annotation

    const-string v0, "cancellable"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣۡۡۢ;->cancellables:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final setEnabled(Z)V
    .locals 0
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    iput-boolean p1, p0, LYue/ۥۣۡۡۢ;->isEnabled:Z

    iget-object p1, p0, LYue/ۥۣۡۡۢ;->enabledChangedCallback:LYue/ۥۣ۠۠ۨ;

    if-eqz p1, :cond_0

    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final setEnabledChangedCallback$activity_release(LYue/ۥۣ۠۠ۨ;)V
    .locals 0
    .param p1    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۡۡۢ;->enabledChangedCallback:LYue/ۥۣ۠۠ۨ;

    return-void
.end method
