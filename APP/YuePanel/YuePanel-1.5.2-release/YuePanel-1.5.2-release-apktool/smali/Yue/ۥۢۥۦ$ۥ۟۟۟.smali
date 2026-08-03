.class public LYue/ۥۢۥۦ$ۥ۟۟۟;
.super LYue/ۥۢۥۦ$ۥ۟۟۟۠;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    api = 0x1d
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ۟۟:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟۠;-><init>()V

    .line 2
    invoke-static {}, LYue/ۥۢۥۦۧ;->ۥ()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟;->ۥ۟۟:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(LYue/ۥۢۥۦ;)V
    .locals 0
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟۠;-><init>(LYue/ۥۢۥۦ;)V

    .line 4
    invoke-virtual {p1}, LYue/ۥۢۥۦ;->ۥ۟۟ۡۨ()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, LYue/ۥۢۥۦۦ;->ۥ(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, LYue/ۥۢۥۦۧ;->ۥ()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟;->ۥ۟۟:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public ۥ۟()LYue/ۥۢۥۦ;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟۠;->ۥ()V

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟;->ۥ۟۟:Landroid/view/WindowInsets$Builder;

    invoke-static {v0}, LYue/ۥۢۥۦۢ;->ۥ(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۢۥۦ;->ۥ۟۟ۢ(Landroid/view/WindowInsets;)LYue/ۥۢۥۦ;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟۠;->ۥ۟:[LYue/ۥ۠ۥۣۡ;

    invoke-virtual {v0, v1}, LYue/ۥۢۥۦ;->ۥ۟۟ۡۤ([LYue/ۥ۠ۥۣۡ;)V

    return-object v0
.end method

.method public ۥ۟۟(LYue/ۥۣ۠۟۠;)V
    .locals 1
    .param p1    # LYue/ۥۣ۠۟۠;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟;->ۥ۟۟:Landroid/view/WindowInsets$Builder;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۣ۠۟۠;->ۥ۟۟۟ۢ()Landroid/view/DisplayCutout;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {v0, p1}, LYue/ۥۢۥۦۥ;->ۥ(Landroid/view/WindowInsets$Builder;Landroid/view/DisplayCutout;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public ۥ۟۟۟۠(LYue/ۥ۠ۥۣۡ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟;->ۥ۟۟:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۢ()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LYue/ۥۢۥۦۣ;->ۥ(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥ۠ۥۣۡ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟;->ۥ۟۟:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۢ()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LYue/ۥۢۥۦ۠;->ۥ(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥ۠ۥۣۡ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟;->ۥ۟۟:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۢ()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LYue/ۥۢۥۦۡ;->ۥ(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public ۥۣ۟۟۟(LYue/ۥ۠ۥۣۡ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟;->ۥ۟۟:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۢ()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LYue/ۥۢۥۦ۟;->ۥ(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public ۥ۟۟۟ۤ(LYue/ۥ۠ۥۣۡ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟;->ۥ۟۟:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۢ()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LYue/ۥۢۥۦۤ;->ۥ(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
