.class public final Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۟ۨ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/OnBackPressedDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣۡۡۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۤ:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method public constructor <init>(Landroidx/activity/OnBackPressedDispatcher;LYue/ۥۣۡۡۢ;)V
    .locals 1
    .param p1    # Landroidx/activity/OnBackPressedDispatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e1\u06e2;",
            ")V"
        }
    .end annotation

    const-string v0, "onBackPressedCallback"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ:Landroidx/activity/OnBackPressedDispatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:LYue/ۥۣۡۡۢ;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ:Landroidx/activity/OnBackPressedDispatcher;

    invoke-static {v0}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟(Landroidx/activity/OnBackPressedDispatcher;)LYue/ۥ۟ۡۧۡ;

    move-result-object v0

    iget-object v1, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:LYue/ۥۣۡۡۢ;

    invoke-virtual {v0, v1}, LYue/ۥ۟ۡۧۡ;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ:Landroidx/activity/OnBackPressedDispatcher;

    invoke-static {v0}, Landroidx/activity/OnBackPressedDispatcher;->ۥ(Landroidx/activity/OnBackPressedDispatcher;)LYue/ۥۣۡۡۢ;

    move-result-object v0

    iget-object v1, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:LYue/ۥۣۡۡۢ;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:LYue/ۥۣۡۡۢ;

    invoke-virtual {v0}, LYue/ۥۣۡۡۢ;->handleOnBackCancelled()V

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ:Landroidx/activity/OnBackPressedDispatcher;

    invoke-static {v0, v1}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟۠(Landroidx/activity/OnBackPressedDispatcher;LYue/ۥۣۡۡۢ;)V

    :cond_0
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:LYue/ۥۣۡۡۢ;

    invoke-virtual {v0, p0}, LYue/ۥۣۡۡۢ;->removeCancellable(LYue/ۥۣ۟ۨ;)V

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:LYue/ۥۣۡۡۢ;

    invoke-virtual {v0}, LYue/ۥۣۡۡۢ;->getEnabledChangedCallback$activity_release()LYue/ۥۣ۠۠ۨ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:LYue/ۥۣۡۡۢ;

    invoke-virtual {v0, v1}, LYue/ۥۣۡۡۢ;->setEnabledChangedCallback$activity_release(LYue/ۥۣ۠۠ۨ;)V

    return-void
.end method
