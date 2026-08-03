.class public LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;
.super LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# instance fields
.field public ۥ۟۟۟ۧ:LYue/ۥ۠ۥۣۡ;


# direct methods
.method public constructor <init>(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;)V
    .locals 0
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;-><init>(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;)V

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۥۣۡ;

    .line 5
    iget-object p1, p2, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۥۣۡ;

    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۥۣۡ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۢۥۦ;Landroid/view/WindowInsets;)V
    .locals 0
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/WindowInsets;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p2}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;-><init>(LYue/ۥۢۥۦ;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۥۣۡ;

    return-void
.end method


# virtual methods
.method public ۥ۟()LYue/ۥۢۥۦ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۢۥۦ;->ۥ۟۟ۢ(Landroid/view/WindowInsets;)LYue/ۥۢۥۦ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()LYue/ۥۢۥۦ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۢۥۦ;->ۥ۟۟ۢ(Landroid/view/WindowInsets;)LYue/ۥۢۥۦ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟ۤ()LYue/ۥ۠ۥۣۡ;
    .locals 4
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۥۣۡ;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v0

    iget-object v1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-virtual {v1}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v1

    iget-object v2, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-virtual {v2}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v2

    iget-object v3, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-virtual {v3}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟(IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۥۣۡ;

    :cond_0
    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۥۣۡ;

    return-object v0
.end method

.method public ۥ۟۟۠()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠ۤ(LYue/ۥ۠ۥۣۡ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۥۣۡ;

    return-void
.end method
