.class public final Landroidx/fragment/app/a$a;
.super Landroidx/fragment/app/f$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final c:Landroidx/fragment/app/a$b;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/a$b;)V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/f$a;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/a$a;->c:Landroidx/fragment/app/a$b;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/ViewGroup;)V
    .locals 3

    const-string v0, "container"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/a$a;->c:Landroidx/fragment/app/a$b;

    iget-object v1, v0, Landroidx/fragment/app/a$f;->a:Landroidx/fragment/app/f$c;

    iget-object v2, v1, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/b;

    iget-object v2, v2, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->clearAnimation()V

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object p1, v0, Landroidx/fragment/app/a$f;->a:Landroidx/fragment/app/f$c;

    invoke-virtual {p1, p0}, Landroidx/fragment/app/f$c;->c(Landroidx/fragment/app/f$a;)V

    const/4 p1, 0x2

    invoke-static {p1}, La/e7;->J(I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Animation from operation "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has been cancelled."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final b(Landroid/view/ViewGroup;)V
    .locals 5

    const-string v0, "container"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/a$a;->c:Landroidx/fragment/app/a$b;

    invoke-virtual {v0}, Landroidx/fragment/app/a$f;->a()Z

    move-result v1

    iget-object v2, v0, Landroidx/fragment/app/a$f;->a:Landroidx/fragment/app/f$c;

    if-eqz v1, :cond_0

    invoke-virtual {v2, p0}, Landroidx/fragment/app/f$c;->c(Landroidx/fragment/app/f$a;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, v2, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/b;

    iget-object v3, v3, Landroidx/fragment/app/b;->G:Landroid/view/View;

    const-string v4, "context"

    invoke-static {v1, v4}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/a$b;->b(Landroid/content/Context;)Landroidx/fragment/app/c$a;

    move-result-object v0

    const-string v1, "Required value was null."

    if-eqz v0, :cond_4

    iget-object v0, v0, Landroidx/fragment/app/c$a;->a:Landroid/view/animation/Animation;

    if-eqz v0, :cond_3

    iget-object v1, v2, Landroidx/fragment/app/f$c;->a:Landroidx/fragment/app/f$c$b;

    sget-object v4, Landroidx/fragment/app/f$c$b;->a:Landroidx/fragment/app/f$c$b;

    if-eq v1, v4, :cond_1

    invoke-virtual {v3, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {v2, p0}, Landroidx/fragment/app/f$c;->c(Landroidx/fragment/app/f$a;)V

    return-void

    :cond_1
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    new-instance v1, Landroidx/fragment/app/c$b;

    invoke-direct {v1, v0, p1, v3}, Landroidx/fragment/app/c$b;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    new-instance v0, Landroidx/fragment/app/a$a$a;

    invoke-direct {v0, v2, p1, v3, p0}, Landroidx/fragment/app/a$a$a;-><init>(Landroidx/fragment/app/f$c;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/a$a;)V

    invoke-virtual {v1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v3, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 p1, 0x2

    invoke-static {p1}, La/e7;->J(I)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Animation from operation "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has started."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
