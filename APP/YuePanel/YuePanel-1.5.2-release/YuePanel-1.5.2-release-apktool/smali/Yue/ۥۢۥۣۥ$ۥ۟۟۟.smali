.class public LYue/ۥۢۥۣۥ$ۥ۟۟۟;
.super LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1e
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۣۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ۟۟۟۠:Landroid/view/WindowInsetsAnimation;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 0

    .line 3
    invoke-static {p1, p2, p3, p4}, LYue/ۥۢۥۤۦ;->ۥ(ILandroid/view/animation/Interpolator;J)Landroid/view/WindowInsetsAnimation;

    move-result-object p1

    invoke-direct {p0, p1}, LYue/ۥۢۥۣۥ$ۥ۟۟۟;-><init>(Landroid/view/WindowInsetsAnimation;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation;)V
    .locals 4
    .param p1    # Landroid/view/WindowInsetsAnimation;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    .line 1
    invoke-direct {p0, v3, v0, v1, v2}, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 2
    iput-object p1, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟;->ۥ۟۟۟۠:Landroid/view/WindowInsetsAnimation;

    return-void
.end method

.method public static ۥۣ۟۟۟(LYue/ۥۢۥۣۥ$ۥ;)Landroid/view/WindowInsetsAnimation$Bounds;
    .locals 1
    .param p0    # LYue/ۥۢۥۣۥ$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {}, LYue/ۥۢۥۣۨ;->ۥ()V

    invoke-virtual {p0}, LYue/ۥۢۥۣۥ$ۥ;->ۥ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۢ()Landroid/graphics/Insets;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۢۥۣۥ$ۥ;->ۥ۟()LYue/ۥ۠ۥۣۡ;

    move-result-object p0

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۢ()Landroid/graphics/Insets;

    move-result-object p0

    invoke-static {v0, p0}, LYue/ۥۢۥۣۧ;->ۥ(Landroid/graphics/Insets;Landroid/graphics/Insets;)Landroid/view/WindowInsetsAnimation$Bounds;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۤ(Landroid/view/WindowInsetsAnimation$Bounds;)LYue/ۥ۠ۥۣۡ;
    .locals 0
    .param p0    # Landroid/view/WindowInsetsAnimation$Bounds;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p0}, LYue/ۥۢۥۣۤ;->ۥ(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۡ(Landroid/graphics/Insets;)LYue/ۥ۠ۥۣۡ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۥ(Landroid/view/WindowInsetsAnimation$Bounds;)LYue/ۥ۠ۥۣۡ;
    .locals 0
    .param p0    # Landroid/view/WindowInsetsAnimation$Bounds;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p0}, LYue/ۥۢۥۤۤ;->ۥ(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۡ(Landroid/graphics/Insets;)LYue/ۥ۠ۥۣۡ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۦ(Landroid/view/View;LYue/ۥۢۥۣۥ$ۥ۟;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢۥۣۥ$ۥ۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    new-instance v0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;

    invoke-direct {v0, p1}, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;-><init>(LYue/ۥۢۥۣۥ$ۥ۟;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p0, v0}, LYue/ۥۢۥۤۥ;->ۥ(Landroid/view/View;Landroid/view/WindowInsetsAnimation$Callback;)V

    return-void
.end method


# virtual methods
.method public ۥ۟()J
    .locals 2

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟;->ۥ۟۟۟۠:Landroid/view/WindowInsetsAnimation;

    invoke-static {v0}, LYue/ۥۢۥۣۦ;->ۥ(Landroid/view/WindowInsetsAnimation;)J

    move-result-wide v0

    return-wide v0
.end method

.method public ۥ۟۟()F
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟;->ۥ۟۟۟۠:Landroid/view/WindowInsetsAnimation;

    invoke-static {v0}, LYue/ۥۢۥۤۡ;->ۥ(Landroid/view/WindowInsetsAnimation;)F

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟()F
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟;->ۥ۟۟۟۠:Landroid/view/WindowInsetsAnimation;

    invoke-static {v0}, LYue/ۥۢۥۤۢ;->ۥ(Landroid/view/WindowInsetsAnimation;)F

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟۟()Landroid/view/animation/Interpolator;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟;->ۥ۟۟۟۠:Landroid/view/WindowInsetsAnimation;

    invoke-static {v0}, LYue/ۥۢۥۤ۟;->ۥ(Landroid/view/WindowInsetsAnimation;)Landroid/view/animation/Interpolator;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۠()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟;->ۥ۟۟۟۠:Landroid/view/WindowInsetsAnimation;

    invoke-static {v0}, LYue/ۥۢۥۤ;->ۥ(Landroid/view/WindowInsetsAnimation;)I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۢ(F)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟;->ۥ۟۟۟۠:Landroid/view/WindowInsetsAnimation;

    invoke-static {v0, p1}, LYue/ۥۢۥۤ۠;->ۥ(Landroid/view/WindowInsetsAnimation;F)V

    return-void
.end method
