.class public final Landroidx/fragment/app/a$c$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/a$c;->d(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Z

.field public final synthetic d:Landroidx/fragment/app/f$c;

.field public final synthetic e:Landroidx/fragment/app/a$c;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;ZLandroidx/fragment/app/f$c;Landroidx/fragment/app/a$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/a$c$a;->a:Landroid/view/ViewGroup;

    iput-object p2, p0, Landroidx/fragment/app/a$c$a;->b:Landroid/view/View;

    iput-boolean p3, p0, Landroidx/fragment/app/a$c$a;->c:Z

    iput-object p4, p0, Landroidx/fragment/app/a$c$a;->d:Landroidx/fragment/app/f$c;

    iput-object p5, p0, Landroidx/fragment/app/a$c$a;->e:Landroidx/fragment/app/a$c;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    const-string v0, "anim"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/fragment/app/a$c$a;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Landroidx/fragment/app/a$c$a;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-boolean v1, p0, Landroidx/fragment/app/a$c$a;->c:Z

    iget-object v2, p0, Landroidx/fragment/app/a$c$a;->d:Landroidx/fragment/app/f$c;

    if-eqz v1, :cond_0

    iget-object v1, v2, Landroidx/fragment/app/f$c;->a:Landroidx/fragment/app/f$c$b;

    const-string v3, "viewToAnimate"

    invoke-static {v0, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, p1}, Landroidx/fragment/app/f$c$b;->a(Landroid/view/View;Landroid/view/ViewGroup;)V

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/a$c$a;->e:Landroidx/fragment/app/a$c;

    iget-object v0, p1, Landroidx/fragment/app/a$c;->c:Landroidx/fragment/app/a$b;

    iget-object v0, v0, Landroidx/fragment/app/a$f;->a:Landroidx/fragment/app/f$c;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/f$c;->c(Landroidx/fragment/app/f$a;)V

    const/4 p1, 0x2

    invoke-static {p1}, La/e7;->J(I)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Animator from operation "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has ended."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method
