.class public Landroidx/appcompat/widget/ۥ۟۟۟۟$ۥ۟۟۟۟;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ۥ۟۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation


# instance fields
.field public ۥ:Z

.field public ۥ۟:I

.field public final synthetic ۥ۟۟:Landroidx/appcompat/widget/ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ۥ۟۟۟۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥ۟۟:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥ:Z

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥ:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-boolean p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥ:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥ۟۟:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/widget/ۥ۟۟۟۟;->ۥ۟۟ۡۡ:Landroid/view/ViewPropertyAnimator;

    iget v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥ۟:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥ۟۟:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iput-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥ:Z

    return-void
.end method

.method public ۥ(Landroid/view/ViewPropertyAnimator;I)Landroidx/appcompat/widget/ۥ۟۟۟۟$ۥ۟۟۟۟;
    .locals 0

    iput p2, p0, Landroidx/appcompat/widget/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥ۟:I

    iget-object p2, p0, Landroidx/appcompat/widget/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥ۟۟:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    iput-object p1, p2, Landroidx/appcompat/widget/ۥ۟۟۟۟;->ۥ۟۟ۡۡ:Landroid/view/ViewPropertyAnimator;

    return-object p0
.end method
