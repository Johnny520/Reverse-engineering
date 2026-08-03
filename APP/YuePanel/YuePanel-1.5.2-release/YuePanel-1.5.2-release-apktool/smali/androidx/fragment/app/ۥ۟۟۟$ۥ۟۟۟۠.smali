.class public final Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/ۥ۟۟۟;->ۥ۟۟ۡۧ(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

.field public final synthetic ۥ۟:Landroidx/fragment/app/ۥ۟۟۟;

.field public final synthetic ۥ۟۟:Landroid/view/View;

.field public final synthetic ۥ۟۟۟:Landroidx/fragment/app/ۥ۟۟۟$ۥ;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;Landroidx/fragment/app/ۥ۟۟۟;Landroid/view/View;Landroidx/fragment/app/ۥ۟۟۟$ۥ;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    iput-object p2, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟:Landroidx/fragment/app/ۥ۟۟۟;

    iput-object p3, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟:Landroid/view/View;

    iput-object p4, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟:Landroidx/fragment/app/ۥ۟۟۟$ۥ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ۥ(Landroidx/fragment/app/ۥ۟۟۟;Landroid/view/View;Landroidx/fragment/app/ۥ۟۟۟$ۥ;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟(Landroidx/fragment/app/ۥ۟۟۟;Landroid/view/View;Landroidx/fragment/app/ۥ۟۟۟$ۥ;)V

    return-void
.end method

.method public static final ۥ۟(Landroidx/fragment/app/ۥ۟۟۟;Landroid/view/View;Landroidx/fragment/app/ۥ۟۟۟$ۥ;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$animationInfo"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/ۥ۟۟۠ۡ;->ۥ۟۟۠۠()Landroid/view/ViewGroup;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    invoke-virtual {p2}, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;->ۥ()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 4
    .param p1    # Landroid/view/animation/Animation;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "animation"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟:Landroidx/fragment/app/ۥ۟۟۟;

    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠ۡ;->ۥ۟۟۠۠()Landroid/view/ViewGroup;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟:Landroidx/fragment/app/ۥ۟۟۟;

    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟:Landroid/view/View;

    iget-object v2, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟:Landroidx/fragment/app/ۥ۟۟۟$ۥ;

    new-instance v3, LYue/ۥ۟ۨۧۢ;

    invoke-direct {v3, v0, v1, v2}, LYue/ۥ۟ۨۧۢ;-><init>(Landroidx/fragment/app/ۥ۟۟۟;Landroid/view/View;Landroidx/fragment/app/ۥ۟۟۟$ۥ;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x2

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧۨ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Animation from operation "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has ended."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 1
    .param p1    # Landroid/view/animation/Animation;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "animation"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1
    .param p1    # Landroid/view/animation/Animation;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "animation"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x2

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧۨ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Animation from operation "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has reached onAnimationStart."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method
