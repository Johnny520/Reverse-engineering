.class public LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;
.super LYue/ۥۢۥۦ$ۥۣ۟۟۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1d
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e4"
.end annotation


# instance fields
.field public ۥ۟۟۟ۨ:LYue/ۥ۠ۥۣۡ;

.field public ۥ۟۟۠:LYue/ۥ۠ۥۣۡ;

.field public ۥ۟۟۠۟:LYue/ۥ۠ۥۣۡ;


# direct methods
.method public constructor <init>(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;)V
    .locals 0
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 5
    invoke-direct {p0, p1, p2}, LYue/ۥۢۥۦ$ۥۣ۟۟۟;-><init>(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ$ۥۣ۟۟۟;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟ۨ:LYue/ۥ۠ۥۣۡ;

    .line 7
    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۠:LYue/ۥ۠ۥۣۡ;

    .line 8
    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۠۟:LYue/ۥ۠ۥۣۡ;

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
    invoke-direct {p0, p1, p2}, LYue/ۥۢۥۦ$ۥۣ۟۟۟;-><init>(LYue/ۥۢۥۦ;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟ۨ:LYue/ۥ۠ۥۣۡ;

    .line 3
    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۠:LYue/ۥ۠ۥۣۡ;

    .line 4
    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۠۟:LYue/ۥ۠ۥۣۡ;

    return-void
.end method


# virtual methods
.method public ۥۣ۟۟۟()LYue/ۥ۠ۥۣۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۠:LYue/ۥ۠ۥۣۡ;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-static {v0}, LYue/ۥۢۥۧۤ;->ۥ(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۡ(Landroid/graphics/Insets;)LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۠:LYue/ۥ۠ۥۣۡ;

    :cond_0
    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۠:LYue/ۥ۠ۥۣۡ;

    return-object v0
.end method

.method public ۥ۟۟۟ۥ()LYue/ۥ۠ۥۣۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟ۨ:LYue/ۥ۠ۥۣۡ;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-static {v0}, LYue/ۥۢۥۧۥ;->ۥ(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۡ(Landroid/graphics/Insets;)LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟ۨ:LYue/ۥ۠ۥۣۡ;

    :cond_0
    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟ۨ:LYue/ۥ۠ۥۣۡ;

    return-object v0
.end method

.method public ۥ۟۟۟ۧ()LYue/ۥ۠ۥۣۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۠۟:LYue/ۥ۠ۥۣۡ;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-static {v0}, LYue/ۥۢۥۧۢ;->ۥ(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۡ(Landroid/graphics/Insets;)LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۠۟:LYue/ۥ۠ۥۣۡ;

    :cond_0
    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;->ۥ۟۟۠۟:LYue/ۥ۠ۥۣۡ;

    return-object v0
.end method

.method public ۥ۟۟۟ۨ(IIII)LYue/ۥۢۥۦ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-static {v0, p1, p2, p3, p4}, LYue/ۥۢۥۣۧ;->ۥ(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۢۥۦ;->ۥ۟۟ۢ(Landroid/view/WindowInsets;)LYue/ۥۢۥۦ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۤ(LYue/ۥ۠ۥۣۡ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    return-void
.end method
