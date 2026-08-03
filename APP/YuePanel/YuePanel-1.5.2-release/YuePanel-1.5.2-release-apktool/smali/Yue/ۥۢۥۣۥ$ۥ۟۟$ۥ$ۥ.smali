.class public LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۢۥۣۥ;

.field public final synthetic ۥ۟:LYue/ۥۢۥۦ;

.field public final synthetic ۥ۟۟:LYue/ۥۢۥۦ;

.field public final synthetic ۥ۟۟۟:I

.field public final synthetic ۥ۟۟۟۟:Landroid/view/View;

.field public final synthetic ۥ۟۟۟۠:LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;


# direct methods
.method public constructor <init>(LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;LYue/ۥۢۥۣۥ;LYue/ۥۢۥۦ;LYue/ۥۢۥۦ;ILandroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;->ۥ۟۟۟۠:LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;

    iput-object p2, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;->ۥ:LYue/ۥۢۥۣۥ;

    iput-object p3, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;->ۥ۟:LYue/ۥۢۥۦ;

    iput-object p4, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;->ۥ۟۟:LYue/ۥۢۥۦ;

    iput p5, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;->ۥ۟۟۟:I

    iput-object p6, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;->ۥ۟۟۟۟:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;->ۥ:LYue/ۥۢۥۣۥ;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-virtual {v0, p1}, LYue/ۥۢۥۣۥ;->ۥۣ۟۟۟(F)V

    iget-object p1, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;->ۥ۟:LYue/ۥۢۥۦ;

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;->ۥ۟۟:LYue/ۥۢۥۦ;

    iget-object v1, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;->ۥ:LYue/ۥۢۥۣۥ;

    invoke-virtual {v1}, LYue/ۥۢۥۣۥ;->ۥ۟۟۟()F

    move-result v1

    iget v2, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;->ۥ۟۟۟:I

    invoke-static {p1, v0, v1, v2}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۠ۢ(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ;FI)LYue/ۥۢۥۦ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;->ۥ:LYue/ۥۢۥۣۥ;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;->ۥ۟۟۟۟:Landroid/view/View;

    invoke-static {v1, p1, v0}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۠(Landroid/view/View;LYue/ۥۢۥۦ;Ljava/util/List;)V

    return-void
.end method
