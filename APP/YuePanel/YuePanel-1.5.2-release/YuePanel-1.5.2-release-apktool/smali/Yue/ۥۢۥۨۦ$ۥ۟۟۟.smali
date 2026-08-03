.class public LYue/ۥۢۥۨۦ$ۥ۟۟۟;
.super LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1e
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۨۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۢۥۨۦ;

.field public final ۥ۟:Landroid/view/WindowInsetsController;

.field public final ۥ۟۟:LYue/ۥۢ۟ۢۦ;

.field public final ۥ۟۟۟:LYue/ۥۢ۟ۡ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06df\u06e1<",
            "LYue/\u06e5\u06e2\u06e5\u06e8\u06e6$\u06e5\u06df\u06df\u06df\u06e0;",
            "Landroid/view/WindowInsetsController$OnControllableInsetsChangedListener;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟۟:Landroid/view/Window;


# direct methods
.method public constructor <init>(Landroid/view/Window;LYue/ۥۢۥۨۦ;LYue/ۥۢ۟ۢۦ;)V
    .locals 1
    .param p1    # Landroid/view/Window;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۥۨۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # LYue/ۥۢ۟ۢۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, LYue/ۥۢۦ;->ۥ(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, LYue/ۥۢۥۨۦ$ۥ۟۟۟;-><init>(Landroid/view/WindowInsetsController;LYue/ۥۢۥۨۦ;LYue/ۥۢ۟ۢۦ;)V

    .line 2
    iput-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/Window;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;LYue/ۥۢۥۨۦ;LYue/ۥۢ۟ۢۦ;)V
    .locals 1
    .param p1    # Landroid/view/WindowInsetsController;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۥۨۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # LYue/ۥۢ۟ۢۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, LYue/ۥۢۥۨۦ$ۥ۟۟۟۟;-><init>()V

    .line 4
    new-instance v0, LYue/ۥۢ۟ۡ;

    invoke-direct {v0}, LYue/ۥۢ۟ۡ;-><init>()V

    iput-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۟:LYue/ۥۢ۟ۡ;

    .line 5
    iput-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    .line 6
    iput-object p2, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ:LYue/ۥۢۥۨۦ;

    .line 7
    iput-object p3, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥۢ۟ۢۦ;

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۦ(LYue/ۥۢۥۨۦ$ۥ۟۟۟;LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;Landroid/view/WindowInsetsController;I)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۟ۧ(LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;Landroid/view/WindowInsetsController;I)V

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;)V
    .locals 2
    .param p1    # LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۟:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, LYue/ۥۢۦ۟ۢ;

    invoke-direct {v0, p0, p1}, LYue/ۥۢۦ۟ۢ;-><init>(LYue/ۥۢۥۨۦ$ۥ۟۟۟;LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;)V

    iget-object v1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۟:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1, p1, v0}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    invoke-static {p1, v0}, LYue/ۥۣۢ۟۟;->ۥ(Landroid/view/WindowInsetsController;Landroid/view/WindowInsetsController$OnControllableInsetsChangedListener;)V

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

    new-instance v6, LYue/ۥۢۥۨۦ$ۥ۟۟۟$ۥ;

    invoke-direct {v6, p0, p6}, LYue/ۥۢۥۨۦ$ۥ۟۟۟$ۥ;-><init>(LYue/ۥۢۥۨۦ$ۥ۟۟۟;LYue/ۥۢۥۤۨ;)V

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    move v1, p1

    move-wide v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v6}, LYue/ۥۢۦ۟;->ۥ(Landroid/view/WindowInsetsController;IJLandroid/view/animation/Interpolator;Landroid/os/CancellationSignal;Landroid/view/WindowInsetsAnimationControlListener;)V

    return-void
.end method

.method public ۥ۟۟()I
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    invoke-static {v0}, LYue/ۥۢۦ۟ۡ;->ۥ(Landroid/view/WindowInsetsController;)I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟(I)V
    .locals 1

    and-int/lit8 v0, p1, 0x8

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥۢ۟ۢۦ;

    invoke-virtual {v0}, LYue/ۥۢ۟ۢۦ;->ۥ()V

    :cond_0
    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    and-int/lit8 p1, p1, -0x9

    invoke-static {v0, p1}, LYue/ۥۣۢ۟ۡ;->ۥ(Landroid/view/WindowInsetsController;I)V

    return-void
.end method

.method public ۥ۟۟۟۟()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, LYue/ۥۢۥۨۧ;->ۥ(Landroid/view/WindowInsetsController;II)V

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    invoke-static {v0}, LYue/ۥۢۥۨۨ;->ۥ(Landroid/view/WindowInsetsController;)I

    move-result v0

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public ۥ۟۟۟۠()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, LYue/ۥۢۥۨۧ;->ۥ(Landroid/view/WindowInsetsController;II)V

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    invoke-static {v0}, LYue/ۥۢۥۨۨ;->ۥ(Landroid/view/WindowInsetsController;)I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;)V
    .locals 1
    .param p1    # LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۟:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۢۦ۟۠;->ۥ(Ljava/lang/Object;)Landroid/view/WindowInsetsController$OnControllableInsetsChangedListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    invoke-static {v0, p1}, LYue/ۥۣۢ۟۠;->ۥ(Landroid/view/WindowInsetsController;Landroid/view/WindowInsetsController$OnControllableInsetsChangedListener;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟ۢ(Z)V
    .locals 2

    const/16 v0, 0x10

    if-eqz p1, :cond_1

    iget-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/Window;

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۟ۨ(I)V

    :cond_0
    iget-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    invoke-static {p1, v0, v0}, LYue/ۥۢۥۨۧ;->ۥ(Landroid/view/WindowInsetsController;II)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/Window;

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0}, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۠(I)V

    :cond_2
    iget-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, LYue/ۥۢۥۨۧ;->ۥ(Landroid/view/WindowInsetsController;II)V

    :goto_0
    return-void
.end method

.method public ۥۣ۟۟۟(Z)V
    .locals 2

    const/16 v0, 0x2000

    const/16 v1, 0x8

    if-eqz p1, :cond_1

    iget-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/Window;

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۟ۨ(I)V

    :cond_0
    iget-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    invoke-static {p1, v1, v1}, LYue/ۥۢۥۨۧ;->ۥ(Landroid/view/WindowInsetsController;II)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/Window;

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0}, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۠(I)V

    :cond_2
    iget-object p1, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    const/4 v0, 0x0

    invoke-static {p1, v0, v1}, LYue/ۥۢۥۨۧ;->ۥ(Landroid/view/WindowInsetsController;II)V

    :goto_0
    return-void
.end method

.method public ۥ۟۟۟ۤ(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    invoke-static {v0, p1}, LYue/ۥۢۦ۟۟;->ۥ(Landroid/view/WindowInsetsController;I)V

    return-void
.end method

.method public ۥ۟۟۟ۥ(I)V
    .locals 1

    and-int/lit8 v0, p1, 0x8

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥۢ۟ۢۦ;

    invoke-virtual {v0}, LYue/ۥۢ۟ۢۦ;->ۥ۟()V

    :cond_0
    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    and-int/lit8 p1, p1, -0x9

    invoke-static {v0, p1}, LYue/ۥۣۢ۟;->ۥ(Landroid/view/WindowInsetsController;I)V

    return-void
.end method

.method public final synthetic ۥ۟۟۟ۧ(LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;Landroid/view/WindowInsetsController;I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟:Landroid/view/WindowInsetsController;

    if-ne v0, p2, :cond_0

    iget-object p2, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ:LYue/ۥۢۥۨۦ;

    invoke-interface {p1, p2, p3}, LYue/ۥۢۥۨۦ$ۥ۟۟۟۠;->ۥ(LYue/ۥۢۥۨۦ;I)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟ۨ(I)V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    or-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method

.method public ۥ۟۟۠(I)V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    not-int p1, p1

    and-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method
