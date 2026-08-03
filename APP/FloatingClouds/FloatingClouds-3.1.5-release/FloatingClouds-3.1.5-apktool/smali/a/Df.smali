.class public final La/Df;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroidx/transition/e;


# direct methods
.method public constructor <init>(Landroidx/transition/e;)V
    .locals 0

    iput-object p1, p0, La/Df;->a:Landroidx/transition/e;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, La/Df;->a:Landroidx/transition/e;

    invoke-virtual {v0}, Landroidx/transition/e;->m()V

    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method
