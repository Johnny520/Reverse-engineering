.class public final Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۟;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/ۥ۟۟۟;->ۥ۟۟ۡۧ(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/fragment/app/ۥ۟۟۟;

.field public final synthetic ۥ۟:Landroid/view/View;

.field public final synthetic ۥ۟۟:Z

.field public final synthetic ۥ۟۟۟:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

.field public final synthetic ۥ۟۟۟۟:Landroidx/fragment/app/ۥ۟۟۟$ۥ;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/ۥ۟۟۟;Landroid/view/View;ZLandroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;Landroidx/fragment/app/ۥ۟۟۟$ۥ;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۟;->ۥ:Landroidx/fragment/app/ۥ۟۟۟;

    iput-object p2, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۟;->ۥ۟:Landroid/view/View;

    iput-boolean p3, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۟;->ۥ۟۟:Z

    iput-object p4, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۟;->ۥ۟۟۟:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    iput-object p5, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۟;->ۥ۟۟۟۟:Landroidx/fragment/app/ۥ۟۟۟$ۥ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2
    .param p1    # Landroid/animation/Animator;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "anim"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۟;->ۥ:Landroidx/fragment/app/ۥ۟۟۟;

    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠ۡ;->ۥ۟۟۠۠()Landroid/view/ViewGroup;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۟;->ۥ۟:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-boolean p1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۟;->ۥ۟۟:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۟;->ۥ۟۟۟:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۡ()Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۟;->ۥ۟:Landroid/view/View;

    const-string v1, "viewToAnimate"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;->ۥ۟۟۟(Landroid/view/View;)V

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۟;->ۥ۟۟۟۟:Landroidx/fragment/app/ۥ۟۟۟$ۥ;

    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;->ۥ()V

    const/4 p1, 0x2

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧۨ(I)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Animator from operation "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۟;->ۥ۟۟۟:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has ended."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method
