.class public final La/Cf;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/J1;

.field public final synthetic b:Landroidx/transition/e;


# direct methods
.method public constructor <init>(Landroidx/transition/e;La/J1;)V
    .locals 0

    iput-object p1, p0, La/Cf;->b:Landroidx/transition/e;

    iput-object p2, p0, La/Cf;->a:La/J1;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, La/Cf;->a:La/J1;

    invoke-virtual {v0, p1}, La/ge;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La/Cf;->b:Landroidx/transition/e;

    iget-object v0, v0, Landroidx/transition/e;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, La/Cf;->b:Landroidx/transition/e;

    iget-object v0, v0, Landroidx/transition/e;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
