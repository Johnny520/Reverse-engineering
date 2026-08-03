.class public LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤ۠ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public ۥ:Z

.field public final ۥ۟:Landroid/graphics/Matrix;

.field public final ۥ۟۟:Z

.field public final ۥ۟۟۟:Z

.field public final ۥ۟۟۟۟:Landroid/view/View;

.field public final ۥ۟۟۟۠:LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۠;

.field public final ۥ۟۟۟ۡ:LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;

.field public final ۥ۟۟۟ۢ:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Landroid/view/View;LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۠;LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;Landroid/graphics/Matrix;ZZ)V
    .locals 1

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟:Landroid/graphics/Matrix;

    iput-boolean p5, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟:Z

    iput-boolean p6, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟:Z

    iput-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/View;

    iput-object p2, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟۠:LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۠;

    iput-object p3, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;

    iput-object p4, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟ۢ:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-boolean p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ:Z

    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-boolean p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟ۢ:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ(Landroid/graphics/Matrix;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/View;

    sget v1, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟ۧ:I

    invoke-virtual {p1, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/View;

    sget v1, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟:I

    invoke-virtual {p1, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_1
    :goto_0
    iget-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/View;

    invoke-static {p1, v0}, LYue/ۥۢۤۨ;->ۥ۟۟۟(Landroid/view/View;Landroid/graphics/Matrix;)V

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟۠:LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۠;

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/View;

    invoke-virtual {p1, v0}, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۠;->ۥ(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationPause(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;

    invoke-virtual {p1}, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public onAnimationResume(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/View;

    invoke-static {p1}, LYue/ۥ۟ۤ۠ۧ;->ۥ۟۟ۡۤ(Landroid/view/View;)V

    return-void
.end method

.method public final ۥ(Landroid/graphics/Matrix;)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/View;

    sget v0, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟ۧ:I

    iget-object v1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟۠:LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۠;

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/View;

    invoke-virtual {p1, v0}, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۠;->ۥ(Landroid/view/View;)V

    return-void
.end method
