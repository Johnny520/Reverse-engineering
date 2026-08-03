.class public Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/recyclerview/widget/ۥ۟۟۟۠;->ۥۣ۟۟ۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;IIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

.field public final synthetic ۥ۟:I

.field public final synthetic ۥ۟۟:Landroid/view/View;

.field public final synthetic ۥ۟۟۟:I

.field public final synthetic ۥ۟۟۟۟:Landroid/view/ViewPropertyAnimator;

.field public final synthetic ۥ۟۟۟۠:Landroidx/recyclerview/widget/ۥ۟۟۟۠;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/ۥ۟۟۟۠;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ۟۟۟۠:Landroidx/recyclerview/widget/ۥ۟۟۟۠;

    iput-object p2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    iput p3, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ۟:I

    iput-object p4, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ۟۟:Landroid/view/View;

    iput p5, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ۟۟۟:I

    iput-object p6, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ۟۟۟۟:Landroid/view/ViewPropertyAnimator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ۟:I

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ۟۟:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    :cond_0
    iget p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ۟۟۟:I

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ۟۟:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    :cond_1
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ۟۟۟۟:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ۟۟۟۠:Landroidx/recyclerview/widget/ۥ۟۟۟۠;

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟ۢ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ۟۟۟۠:Landroidx/recyclerview/widget/ۥ۟۟۟۠;

    iget-object p1, p1, Landroidx/recyclerview/widget/ۥ۟۟۟۠;->ۥ۟۟۠ۦ:Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ۟۟۟۠:Landroidx/recyclerview/widget/ۥ۟۟۟۠;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/ۥ۟۟۟۠;->ۥۣ۟۟ۧ()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ۟۟۟۠:Landroidx/recyclerview/widget/ۥ۟۟۟۠;

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥ۟۟۟۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟ۢ۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    return-void
.end method
