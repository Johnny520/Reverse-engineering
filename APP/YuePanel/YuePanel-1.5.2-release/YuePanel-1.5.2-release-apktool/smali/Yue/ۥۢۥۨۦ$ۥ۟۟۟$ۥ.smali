.class public LYue/ۥۢۥۨۦ$ۥ۟۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/WindowInsetsAnimationControlListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟(IJLandroid/view/animation/Interpolator;Landroid/os/CancellationSignal;LYue/ۥۢۥۤۨ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public ۥ:LYue/ۥۢۥۥۨ;

.field public final synthetic ۥ۟:LYue/ۥۢۥۤۨ;

.field public final synthetic ۥ۟۟:LYue/ۥۢۥۨۦ$ۥ۟۟۟;


# direct methods
.method public constructor <init>(LYue/ۥۢۥۨۦ$ۥ۟۟۟;LYue/ۥۢۥۤۨ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟$ۥ;->ۥ۟۟:LYue/ۥۢۥۨۦ$ۥ۟۟۟;

    iput-object p2, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟$ۥ;->ۥ۟:LYue/ۥۢۥۤۨ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟$ۥ;->ۥ:LYue/ۥۢۥۥۨ;

    return-void
.end method


# virtual methods
.method public onCancelled(Landroid/view/WindowInsetsAnimationController;)V
    .locals 1
    .param p1    # Landroid/view/WindowInsetsAnimationController;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟$ۥ;->ۥ۟:LYue/ۥۢۥۤۨ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟$ۥ;->ۥ:LYue/ۥۢۥۥۨ;

    :goto_0
    invoke-interface {v0, p1}, LYue/ۥۢۥۤۨ;->ۥ۟۟(LYue/ۥۢۥۥۨ;)V

    return-void
.end method

.method public onFinished(Landroid/view/WindowInsetsAnimationController;)V
    .locals 1
    .param p1    # Landroid/view/WindowInsetsAnimationController;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟$ۥ;->ۥ۟:LYue/ۥۢۥۤۨ;

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟$ۥ;->ۥ:LYue/ۥۢۥۥۨ;

    invoke-interface {p1, v0}, LYue/ۥۢۥۤۨ;->ۥ۟(LYue/ۥۢۥۥۨ;)V

    return-void
.end method

.method public onReady(Landroid/view/WindowInsetsAnimationController;I)V
    .locals 1
    .param p1    # Landroid/view/WindowInsetsAnimationController;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    new-instance v0, LYue/ۥۢۥۥۨ;

    invoke-direct {v0, p1}, LYue/ۥۢۥۥۨ;-><init>(Landroid/view/WindowInsetsAnimationController;)V

    iput-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟$ۥ;->ۥ:LYue/ۥۢۥۥۨ;

    iget-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟$ۥ;->ۥ۟:LYue/ۥۢۥۤۨ;

    invoke-interface {p1, v0, p2}, LYue/ۥۢۥۤۨ;->ۥ(LYue/ۥۢۥۥۨ;I)V

    return-void
.end method
