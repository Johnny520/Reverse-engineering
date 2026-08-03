.class public LYue/ۥۢۥۦ$ۥ۟۟۟۟;
.super LYue/ۥۢۥۦ$ۥ۟۟۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1e
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟;-><init>()V

    return-void
.end method

.method public constructor <init>(LYue/ۥۢۥۦ;)V
    .locals 0
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟;-><init>(LYue/ۥۢۥۦ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟(ILYue/ۥ۠ۥۣۡ;)V
    .locals 1
    .param p2    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟;->ۥ۟۟:Landroid/view/WindowInsets$Builder;

    invoke-static {p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۨ;->ۥ(I)I

    move-result p1

    invoke-virtual {p2}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۢ()Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {v0, p1, p2}, LYue/ۥۢۥۦۨ;->ۥ(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public ۥ۟۟۟۟(ILYue/ۥ۠ۥۣۡ;)V
    .locals 1
    .param p2    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟;->ۥ۟۟:Landroid/view/WindowInsets$Builder;

    invoke-static {p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۨ;->ۥ(I)I

    move-result p1

    invoke-virtual {p2}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۢ()Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {v0, p1, p2}, LYue/ۥۢۥۧ۟;->ۥ(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public ۥ۟۟۟ۥ(IZ)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟;->ۥ۟۟:Landroid/view/WindowInsets$Builder;

    invoke-static {p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۨ;->ۥ(I)I

    move-result p1

    invoke-static {v0, p1, p2}, LYue/ۥۢۥۧ;->ۥ(Landroid/view/WindowInsets$Builder;IZ)Landroid/view/WindowInsets$Builder;

    return-void
.end method
