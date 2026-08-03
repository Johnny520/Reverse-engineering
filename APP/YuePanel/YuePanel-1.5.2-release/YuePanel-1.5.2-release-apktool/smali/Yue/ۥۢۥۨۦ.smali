.class public final LYue/ۥۢۥۨۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۥۨۦ$ۥ۟۟۟;,
        LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;,
        LYue/ۥۢۥۨۦ$ۥ۟۟;,
        LYue/ۥۢۥۨۦ$ۥ۟;,
        LYue/ۥۢۥۨۦ$ۥ;,
        LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;
    }
.end annotation


# static fields
.field public static final ۥ۟:I = 0x0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥ۟۟:I = 0x1

.field public static final ۥ۟۟۟:I = 0x1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:I = 0x2


# instance fields
.field public final ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/Window;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, LYue/ۥۢ۟ۢۦ;

    invoke-direct {v0, p2}, LYue/ۥۢ۟ۢۦ;-><init>(Landroid/view/View;)V

    .line 5
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt p2, v1, :cond_0

    .line 6
    new-instance p2, LYue/ۥۢۥۨۦ$ۥ۟۟۟;

    invoke-direct {p2, p1, p0, v0}, LYue/ۥۢۥۨۦ$ۥ۟۟۟;-><init>(Landroid/view/Window;LYue/ۥۢۥۨۦ;LYue/ۥۢ۟ۢۦ;)V

    iput-object p2, p0, LYue/ۥۢۥۨۦ;->ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;

    goto :goto_0

    .line 7
    :cond_0
    new-instance p2, LYue/ۥۢۥۨۦ$ۥ۟۟;

    invoke-direct {p2, p1, v0}, LYue/ۥۢۥۨۦ$ۥ۟۟;-><init>(Landroid/view/Window;LYue/ۥۢ۟ۢۦ;)V

    iput-object p2, p0, LYue/ۥۢۥۨۦ;->ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 2
    .param p1    # Landroid/view/WindowInsetsController;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1e
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;

    new-instance v1, LYue/ۥۢ۟ۢۦ;

    invoke-direct {v1, p1}, LYue/ۥۢ۟ۢۦ;-><init>(Landroid/view/WindowInsetsController;)V

    invoke-direct {v0, p1, p0, v1}, LYue/ۥۢۥۨۦ$ۥ۟۟۟;-><init>(Landroid/view/WindowInsetsController;LYue/ۥۢۥۨۦ;LYue/ۥۢ۟ۢۦ;)V

    iput-object v0, p0, LYue/ۥۢۥۨۦ;->ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;

    return-void
.end method

.method public static ۥ۟۟۟ۦ(Landroid/view/WindowInsetsController;)LYue/ۥۢۥۨۦ;
    .locals 1
    .param p0    # Landroid/view/WindowInsetsController;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1e
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, LYue/ۥۢۥۨۦ;

    invoke-direct {v0, p0}, LYue/ۥۢۥۨۦ;-><init>(Landroid/view/WindowInsetsController;)V

    return-object v0
.end method


# virtual methods
.method public ۥ(LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;)V
    .locals 1
    .param p1    # LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۨۦ;->ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;->ۥ(LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;)V

    return-void
.end method

.method public ۥ۟(IJLandroid/view/animation/Interpolator;Landroid/os/CancellationSignal;LYue/ۥۢۥۤۨ;)V
    .locals 7
    .param p4    # Landroid/view/animation/Interpolator;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p5    # Landroid/os/CancellationSignal;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p6    # LYue/ۥۢۥۤۨ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۨۦ;->ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;

    move v1, p1

    move-wide v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;->ۥ۟(IJLandroid/view/animation/Interpolator;Landroid/os/CancellationSignal;LYue/ۥۢۥۤۨ;)V

    return-void
.end method

.method public ۥ۟۟()I
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۨۦ;->ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;

    invoke-virtual {v0}, LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;->ۥ۟۟()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۨۦ;->ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;->ۥ۟۟۟(I)V

    return-void
.end method

.method public ۥ۟۟۟۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۨۦ;->ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;

    invoke-virtual {v0}, LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;->ۥ۟۟۟۟()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟۠()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۨۦ;->ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;

    invoke-virtual {v0}, LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;->ۥ۟۟۟۠()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;)V
    .locals 1
    .param p1    # LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۨۦ;->ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;->ۥ۟۟۟ۡ(LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;)V

    return-void
.end method

.method public ۥ۟۟۟ۢ(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۨۦ;->ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;->ۥ۟۟۟ۢ(Z)V

    return-void
.end method

.method public ۥۣ۟۟۟(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۨۦ;->ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;->ۥۣ۟۟۟(Z)V

    return-void
.end method

.method public ۥ۟۟۟ۤ(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۨۦ;->ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;->ۥ۟۟۟ۤ(I)V

    return-void
.end method

.method public ۥ۟۟۟ۥ(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۨۦ;->ۥ:LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;->ۥ۟۟۟ۥ(I)V

    return-void
.end method
