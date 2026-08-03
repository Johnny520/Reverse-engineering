.class public final LYue/ۥ۟۠ۧۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,123:1\n91#1,14:124\n91#1,14:138\n91#1,14:152\n91#1,14:166\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n30#1:124,14\n41#1:138,14\n52#1:152,14\n62#1:166,14\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,123:1\n91#1,14:124\n91#1,14:138\n91#1,14:152\n91#1,14:166\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n30#1:124,14\n41#1:138,14\n52#1:152,14\n62#1:166,14\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(Landroid/animation/Animator;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;)Landroid/animation/Animator$AnimatorListener;
    .locals 1
    .param p0    # Landroid/animation/Animator;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Landroid/animation/Animator$AnimatorListener;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟۟;

    invoke-direct {v0, p4, p1, p3, p2}, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟۟;-><init>(LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;)V

    invoke-virtual {p0, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v0
.end method

.method public static synthetic ۥ۟(Landroid/animation/Animator;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)Landroid/animation/Animator$AnimatorListener;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    sget-object p1, LYue/ۥ۟۠ۧۡ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟۠ۧۡ$ۥ;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    sget-object p2, LYue/ۥ۟۠ۧۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۟۠ۧۡ$ۥ۟;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    sget-object p3, LYue/ۥ۟۠ۧۡ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥ۟۠ۧۡ$ۥ۟۟;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    sget-object p4, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۟۠ۧۡ$ۥ۟۟۟;

    :cond_3
    new-instance p5, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟۟;

    invoke-direct {p5, p4, p1, p3, p2}, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟۟;-><init>(LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;)V

    invoke-virtual {p0, p5}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object p5
.end method

.method public static final ۥ۟۟(Landroid/animation/Animator;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;)Landroid/animation/Animator$AnimatorPauseListener;
    .locals 1
    .param p0    # Landroid/animation/Animator;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Landroid/animation/Animator$AnimatorPauseListener;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟ۢ;

    invoke-direct {v0, p2, p1}, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟ۢ;-><init>(LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;)V

    invoke-virtual {p0, v0}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    return-object v0
.end method

.method public static synthetic ۥ۟۟۟(Landroid/animation/Animator;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)Landroid/animation/Animator$AnimatorPauseListener;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    sget-object p1, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟۠;->ۥۣ۟۟۠:LYue/ۥ۟۠ۧۡ$ۥ۟۟۟۠;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:LYue/ۥ۟۠ۧۡ$ۥ۟۟۟ۡ;

    :cond_1
    invoke-static {p0, p1, p2}, LYue/ۥ۟۠ۧۡ;->ۥ۟۟(Landroid/animation/Animator;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;)Landroid/animation/Animator$AnimatorPauseListener;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۟(Landroid/animation/Animator;LYue/ۥۣ۠ۡ۟;)Landroid/animation/Animator$AnimatorListener;
    .locals 1
    .param p0    # Landroid/animation/Animator;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Landroid/animation/Animator$AnimatorListener;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟۠ۧۡ$ۥۣ۟۟۟;

    invoke-direct {v0, p1}, LYue/ۥ۟۠ۧۡ$ۥۣ۟۟۟;-><init>(LYue/ۥۣ۠ۡ۟;)V

    invoke-virtual {p0, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۠(Landroid/animation/Animator;LYue/ۥۣ۠ۡ۟;)Landroid/animation/Animator$AnimatorListener;
    .locals 1
    .param p0    # Landroid/animation/Animator;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Landroid/animation/Animator$AnimatorListener;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟ۤ;

    invoke-direct {v0, p1}, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟ۤ;-><init>(LYue/ۥۣ۠ۡ۟;)V

    invoke-virtual {p0, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۡ(Landroid/animation/Animator;LYue/ۥۣ۠ۡ۟;)Landroid/animation/Animator$AnimatorPauseListener;
    .locals 2
    .param p0    # Landroid/animation/Animator;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Landroid/animation/Animator$AnimatorPauseListener;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, p1, v1, v0}, LYue/ۥ۟۠ۧۡ;->ۥ۟۟۟(Landroid/animation/Animator;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)Landroid/animation/Animator$AnimatorPauseListener;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۢ(Landroid/animation/Animator;LYue/ۥۣ۠ۡ۟;)Landroid/animation/Animator$AnimatorListener;
    .locals 1
    .param p0    # Landroid/animation/Animator;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Landroid/animation/Animator$AnimatorListener;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟ۥ;

    invoke-direct {v0, p1}, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟ۥ;-><init>(LYue/ۥۣ۠ۡ۟;)V

    invoke-virtual {p0, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v0
.end method

.method public static final ۥۣ۟۟۟(Landroid/animation/Animator;LYue/ۥۣ۠ۡ۟;)Landroid/animation/Animator$AnimatorPauseListener;
    .locals 2
    .param p0    # Landroid/animation/Animator;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Landroid/animation/Animator$AnimatorPauseListener;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, LYue/ۥ۟۠ۧۡ;->ۥ۟۟۟(Landroid/animation/Animator;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)Landroid/animation/Animator$AnimatorPauseListener;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۤ(Landroid/animation/Animator;LYue/ۥۣ۠ۡ۟;)Landroid/animation/Animator$AnimatorListener;
    .locals 1
    .param p0    # Landroid/animation/Animator;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/animation/Animator;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Landroid/animation/Animator$AnimatorListener;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟ۦ;

    invoke-direct {v0, p1}, LYue/ۥ۟۠ۧۡ$ۥ۟۟۟ۦ;-><init>(LYue/ۥۣ۠ۡ۟;)V

    invoke-virtual {p0, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v0
.end method
