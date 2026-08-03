.class public LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۣۥ$ۥ۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# static fields
.field public static final ۥ۟۟:I = 0xa0


# instance fields
.field public final ۥ:LYue/ۥۢۥۣۥ$ۥ۟;

.field public ۥ۟:LYue/ۥۢۥۦ;


# direct methods
.method public constructor <init>(Landroid/view/View;LYue/ۥۢۥۣۥ$ۥ۟;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۥۣۥ$ۥ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟;

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۟ۥ(Landroid/view/View;)LYue/ۥۢۥۦ;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p2, LYue/ۥۢۥۦ$ۥ۟;

    invoke-direct {p2, p1}, LYue/ۥۢۥۦ$ۥ۟;-><init>(LYue/ۥۢۥۦ;)V

    invoke-virtual {p2}, LYue/ۥۢۥۦ$ۥ۟;->ۥ()LYue/ۥۢۥۦ;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;->ۥ۟:LYue/ۥۢۥۦ;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 15

    move-object v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v9, v8}, LYue/ۥۢۥۦ;->ۥ۟۟ۢ۟(Landroid/view/WindowInsets;Landroid/view/View;)LYue/ۥۢۥۦ;

    move-result-object v0

    iput-object v0, v7, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;->ۥ۟:LYue/ۥۢۥۦ;

    invoke-static/range {p1 .. p2}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۠۠(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {v9, v8}, LYue/ۥۢۥۦ;->ۥ۟۟ۢ۟(Landroid/view/WindowInsets;Landroid/view/View;)LYue/ۥۢۥۦ;

    move-result-object v10

    iget-object v0, v7, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;->ۥ۟:LYue/ۥۢۥۦ;

    if-nez v0, :cond_1

    invoke-static/range {p1 .. p1}, LYue/ۥۢۤۤۦ;->ۥ۟۟ۥ(Landroid/view/View;)LYue/ۥۢۥۦ;

    move-result-object v0

    iput-object v0, v7, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;->ۥ۟:LYue/ۥۢۥۦ;

    :cond_1
    iget-object v0, v7, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;->ۥ۟:LYue/ۥۢۥۦ;

    if-nez v0, :cond_2

    iput-object v10, v7, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;->ۥ۟:LYue/ۥۢۥۦ;

    invoke-static/range {p1 .. p2}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۠۠(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-static/range {p1 .. p1}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۠ۡ(Landroid/view/View;)LYue/ۥۢۥۣۥ$ۥ۟;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, v0, LYue/ۥۢۥۣۥ$ۥ۟;->mDispachedInsets:Landroid/view/WindowInsets;

    invoke-static {v0, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static/range {p1 .. p2}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۠۠(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    return-object v0

    :cond_3
    iget-object v0, v7, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;->ۥ۟:LYue/ۥۢۥۦ;

    invoke-static {v10, v0}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥۣ۟۟۟(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ;)I

    move-result v5

    if-nez v5, :cond_4

    invoke-static/range {p1 .. p2}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۠۠(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    return-object v0

    :cond_4
    iget-object v4, v7, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;->ۥ۟:LYue/ۥۢۥۦ;

    invoke-static {v5, v10, v4}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۟ۥ(ILYue/ۥۢۥۦ;LYue/ۥۢۥۦ;)Landroid/view/animation/Interpolator;

    move-result-object v0

    new-instance v11, LYue/ۥۢۥۣۥ;

    const-wide/16 v1, 0xa0

    invoke-direct {v11, v5, v0, v1, v2}, LYue/ۥۢۥۣۥ;-><init>(ILandroid/view/animation/Interpolator;J)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, LYue/ۥۢۥۣۥ;->ۥۣ۟۟۟(F)V

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v11}, LYue/ۥۢۥۣۥ;->ۥ۟()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v12

    invoke-static {v10, v4, v5}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۟ۤ(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ;I)LYue/ۥۢۥۣۥ$ۥ;

    move-result-object v13

    const/4 v0, 0x0

    invoke-static {v8, v11, v9, v0}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۟ۨ(Landroid/view/View;LYue/ۥۢۥۣۥ;Landroid/view/WindowInsets;Z)V

    new-instance v14, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;

    move-object v0, v14

    move-object v1, p0

    move-object v2, v11

    move-object v3, v10

    move-object/from16 v6, p1

    invoke-direct/range {v0 .. v6}, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ;-><init>(LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;LYue/ۥۢۥۣۥ;LYue/ۥۢۥۦ;LYue/ۥۢۥۦ;ILandroid/view/View;)V

    invoke-virtual {v12, v14}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ۟;

    invoke-direct {v0, p0, v11, v8}, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ۟;-><init>(LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;LYue/ۥۢۥۣۥ;Landroid/view/View;)V

    invoke-virtual {v12, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v6, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ۟۟;

    move-object v0, v6

    move-object/from16 v2, p1

    move-object v3, v11

    move-object v4, v13

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ۟۟;-><init>(LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;Landroid/view/View;LYue/ۥۢۥۣۥ;LYue/ۥۢۥۣۥ$ۥ;Landroid/animation/ValueAnimator;)V

    invoke-static {v8, v6}, LYue/ۥۣۣۡ۟;->ۥ(Landroid/view/View;Ljava/lang/Runnable;)LYue/ۥۣۣۡ۟;

    iput-object v10, v7, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;->ۥ۟:LYue/ۥۢۥۦ;

    invoke-static/range {p1 .. p2}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۠۠(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
