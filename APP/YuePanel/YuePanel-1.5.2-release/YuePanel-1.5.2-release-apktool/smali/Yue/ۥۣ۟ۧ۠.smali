.class public LYue/ۥۣ۟ۧ۠;
.super Landroid/widget/ProgressBar;
.source "SourceFile"


# static fields
.field public static final ۥ۟۟ۡ:I = 0x1f4

.field public static final ۥ۟۟ۡ۟:I = 0x1f4


# instance fields
.field public ۥۣ۟۟۠:J

.field public ۥ۟۟۠ۤ:Z

.field public ۥ۟۟۠ۥ:Z

.field public ۥ۟۟۠ۦ:Z

.field public final ۥ۟۟۠ۧ:Ljava/lang/Runnable;

.field public final ۥ۟۟۠ۨ:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, LYue/ۥۣ۟ۧ۠;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, p0, LYue/ۥۣ۟ۧ۠;->ۥۣ۟۟۠:J

    .line 4
    iput-boolean v0, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۤ:Z

    .line 5
    iput-boolean v0, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۥ:Z

    .line 6
    iput-boolean v0, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۦ:Z

    .line 7
    new-instance p1, LYue/ۥ۟ۧۢۧ;

    invoke-direct {p1, p0}, LYue/ۥ۟ۧۢۧ;-><init>(LYue/ۥۣ۟ۧ۠;)V

    iput-object p1, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۧ:Ljava/lang/Runnable;

    .line 8
    new-instance p1, LYue/ۥ۟ۧۢۨ;

    invoke-direct {p1, p0}, LYue/ۥ۟ۧۢۨ;-><init>(LYue/ۥۣ۟ۧ۠;)V

    iput-object p1, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۨ:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic ۥ(LYue/ۥۣ۟ۧ۠;)V
    .locals 0

    invoke-virtual {p0}, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۟ۥ()V

    return-void
.end method

.method public static synthetic ۥ۟(LYue/ۥۣ۟ۧ۠;)V
    .locals 0

    invoke-virtual {p0}, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۟۠()V

    return-void
.end method

.method public static synthetic ۥ۟۟(LYue/ۥۣ۟ۧ۠;)V
    .locals 0

    invoke-virtual {p0}, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۟ۢ()V

    return-void
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥۣ۟ۧ۠;)V
    .locals 0

    invoke-virtual {p0}, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۟ۡ()V

    return-void
.end method


# virtual methods
.method public onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Landroid/widget/ProgressBar;->onAttachedToWindow()V

    invoke-virtual {p0}, LYue/ۥۣ۟ۧ۠;->ۥۣ۟۟۟()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/widget/ProgressBar;->onDetachedFromWindow()V

    invoke-virtual {p0}, LYue/ۥۣ۟ۧ۠;->ۥۣ۟۟۟()V

    return-void
.end method

.method public ۥ۟۟۟۟()V
    .locals 1

    new-instance v0, LYue/ۥۣ۟ۧ۟;

    invoke-direct {v0, p0}, LYue/ۥۣ۟ۧ۟;-><init>(LYue/ۥۣ۟ۧ۠;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ۥ۟۟۟۠()V
    .locals 9
    .annotation build LYue/ۥۣۢ۟;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۦ:Z

    iget-object v1, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۨ:Ljava/lang/Runnable;

    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v1, 0x0

    iput-boolean v1, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۥ:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, LYue/ۥۣ۟ۧ۠;->ۥۣ۟۟۠:J

    sub-long/2addr v1, v3

    const-wide/16 v5, 0x1f4

    cmp-long v7, v1, v5

    if-gez v7, :cond_1

    const-wide/16 v7, -0x1

    cmp-long v3, v3, v7

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v3, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۤ:Z

    if-nez v3, :cond_2

    iget-object v3, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۧ:Ljava/lang/Runnable;

    sub-long/2addr v5, v1

    invoke-virtual {p0, v3, v5, v6}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    iput-boolean v0, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۤ:Z

    goto :goto_1

    :cond_1
    :goto_0
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final synthetic ۥ۟۟۟ۡ()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۤ:Z

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LYue/ۥۣ۟ۧ۠;->ۥۣ۟۟۠:J

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final synthetic ۥ۟۟۟ۢ()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۥ:Z

    iget-boolean v1, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۦ:Z

    if-nez v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, LYue/ۥۣ۟ۧ۠;->ۥۣ۟۟۠:J

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final ۥۣ۟۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۧ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۨ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public ۥ۟۟۟ۤ()V
    .locals 1

    new-instance v0, LYue/ۥۣ۟ۧ;

    invoke-direct {v0, p0}, LYue/ۥۣ۟ۧ;-><init>(LYue/ۥۣ۟ۧ۠;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ۥ۟۟۟ۥ()V
    .locals 3
    .annotation build LYue/ۥۣۢ۟;
    .end annotation

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LYue/ۥۣ۟ۧ۠;->ۥۣ۟۟۠:J

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۦ:Z

    iget-object v1, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۧ:Ljava/lang/Runnable;

    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iput-boolean v0, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۤ:Z

    iget-boolean v0, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۥ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۨ:Ljava/lang/Runnable;

    const-wide/16 v1, 0x1f4

    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۟ۧ۠;->ۥ۟۟۠ۥ:Z

    :cond_0
    return-void
.end method
