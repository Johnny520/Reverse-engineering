.class public final LYue/ۥۢۥۣۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۥۣۥ$ۥ۟۟۟;,
        LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;,
        LYue/ۥۢۥۣۥ$ۥ۟۟;,
        LYue/ۥۢۥۣۥ$ۥ۟;,
        LYue/ۥۢۥۣۥ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟:Z = false

.field public static final ۥ۟۟:Ljava/lang/String; = "WindowInsetsAnimCompat"


# instance fields
.field public ۥ:LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 2
    .param p2    # Landroid/view/animation/Interpolator;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LYue/ۥۢۥۣۥ$ۥ۟۟۟;

    invoke-direct {v0, p1, p2, p3, p4}, LYue/ۥۢۥۣۥ$ۥ۟۟۟;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object v0, p0, LYue/ۥۢۥۣۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, LYue/ۥۢۥۣۥ$ۥ۟۟;

    invoke-direct {v0, p1, p2, p3, p4}, LYue/ۥۢۥۣۥ$ۥ۟۟;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object v0, p0, LYue/ۥۢۥۣۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation;)V
    .locals 4
    .param p1    # Landroid/view/WindowInsetsAnimation;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1e
    .end annotation

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    .line 5
    invoke-direct {p0, v3, v0, v1, v2}, LYue/ۥۢۥۣۥ;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 7
    new-instance v0, LYue/ۥۢۥۣۥ$ۥ۟۟۟;

    invoke-direct {v0, p1}, LYue/ۥۢۥۣۥ$ۥ۟۟۟;-><init>(Landroid/view/WindowInsetsAnimation;)V

    iput-object v0, p0, LYue/ۥۢۥۣۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;

    :cond_0
    return-void
.end method

.method public static ۥ۟۟۟ۢ(Landroid/view/View;LYue/ۥۢۥۣۥ$ۥ۟;)V
    .locals 2
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢۥۣۥ$ۥ۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, LYue/ۥۢۥۣۥ$ۥ۟۟۟;->ۥ۟۟۟ۦ(Landroid/view/View;LYue/ۥۢۥۣۥ$ۥ۟;)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥۣ۟۟۠(Landroid/view/View;LYue/ۥۢۥۣۥ$ۥ۟;)V

    :goto_0
    return-void
.end method

.method public static ۥ۟۟۟ۤ(Landroid/view/WindowInsetsAnimation;)LYue/ۥۢۥۣۥ;
    .locals 1
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1e
    .end annotation

    new-instance v0, LYue/ۥۢۥۣۥ;

    invoke-direct {v0, p0}, LYue/ۥۢۥۣۥ;-><init>(Landroid/view/WindowInsetsAnimation;)V

    return-object v0
.end method


# virtual methods
.method public ۥ()F
    .locals 1
    .annotation build LYue/ۥ۠ۢۢۧ;
        from = 0.0
        to = 1.0
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۣۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;

    invoke-virtual {v0}, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ()F

    move-result v0

    return v0
.end method

.method public ۥ۟()J
    .locals 2

    iget-object v0, p0, LYue/ۥۢۥۣۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;

    invoke-virtual {v0}, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟()J

    move-result-wide v0

    return-wide v0
.end method

.method public ۥ۟۟()F
    .locals 1
    .annotation build LYue/ۥ۠ۢۢۧ;
        from = 0.0
        to = 1.0
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۣۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;

    invoke-virtual {v0}, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟۟()F

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟()F
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۣۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;

    invoke-virtual {v0}, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟۟۟()F

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟۟()Landroid/view/animation/Interpolator;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۣۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;

    invoke-virtual {v0}, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟۟۟۟()Landroid/view/animation/Interpolator;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۠()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۣۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;

    invoke-virtual {v0}, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟۟۟۠()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۡ(F)V
    .locals 1
    .param p1    # F
        .annotation build LYue/ۥ۠ۢۢۧ;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۣۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟۟۟ۡ(F)V

    return-void
.end method

.method public ۥۣ۟۟۟(F)V
    .locals 1
    .param p1    # F
        .annotation build LYue/ۥ۠ۢۢۧ;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۣۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟۟۟ۢ(F)V

    return-void
.end method
