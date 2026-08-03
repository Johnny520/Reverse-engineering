.class public final LYue/ۥۢۡۨۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/inspector/InspectionCompanion;


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1d
.end annotation

.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/view/inspector/InspectionCompanion;"
    }
.end annotation


# instance fields
.field public ۥ:Z

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:I

.field public ۥ۟۟۟ۡ:I

.field public ۥ۟۟۟ۢ:I

.field public ۥۣ۟۟۟:I

.field public ۥ۟۟۟ۤ:I

.field public ۥ۟۟۟ۥ:I

.field public ۥ۟۟۟ۦ:I

.field public ۥ۟۟۟ۧ:I

.field public ۥ۟۟۟ۨ:I

.field public ۥ۟۟۠:I

.field public ۥ۟۟۠۟:I

.field public ۥ۟۟۠۠:I

.field public ۥ۟۟۠ۡ:I

.field public ۥ۟۟۠ۢ:I

.field public ۥۣ۟۟۠:I

.field public ۥ۟۟۠ۤ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۢۡۨۡ;->ۥ:Z

    return-void
.end method


# virtual methods
.method public mapProperties(Landroid/view/inspector/PropertyMapper;)V
    .locals 2
    .param p1    # Landroid/view/inspector/PropertyMapper;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-string v0, "collapseContentDescription"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۥۦ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟:I

    const-string v0, "collapseIcon"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۥۧ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟:I

    const-string v0, "contentInsetEnd"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۧ۟:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟:I

    const-string v0, "contentInsetEndWithActions"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۧ۠:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟۟:I

    const-string v0, "contentInsetLeft"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۧۡ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟۠:I

    const-string v0, "contentInsetRight"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۧۢ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟ۡ:I

    const-string v0, "contentInsetStart"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥۣ۟۟ۧ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟ۢ:I

    const-string v0, "contentInsetStartWithNavigation"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۧۤ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥۣ۟۟۟:I

    const-string v0, "logo"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥۣۣ۟۠:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟ۤ:I

    const-string v0, "logoDescription"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥۣ۟۠ۤ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟ۥ:I

    const-string v0, "menu"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥۣ۟۠ۧ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟ۦ:I

    const-string v0, "navigationContentDescription"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۠ۤ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟ۧ:I

    const-string v0, "navigationIcon"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۠ۤ۟:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟ۨ:I

    const-string v0, "popupTheme"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۠ۥ۠:I

    invoke-static {p1, v0, v1}, LYue/ۥۢۡۨ۠;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۠:I

    const-string v0, "subtitle"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۠ۧۨ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۠۟:I

    const-string v0, "title"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟ۡ۠ۥ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۠۠:I

    const-string v0, "titleMarginBottom"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟ۡ۠ۧ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۠ۡ:I

    const-string v0, "titleMarginEnd"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟ۡ۠ۨ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۠ۢ:I

    const-string v0, "titleMarginStart"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟ۡۡ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢۡۨۡ;->ۥۣ۟۟۠:I

    const-string v0, "titleMarginTop"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟ۡۡ۟:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۠ۤ:I

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۢۡۨۡ;->ۥ:Z

    return-void
.end method

.method public bridge synthetic readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/inspector/PropertyReader;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۡۨۡ;->ۥ(Landroidx/appcompat/widget/Toolbar;Landroid/view/inspector/PropertyReader;)V

    return-void
.end method

.method public ۥ(Landroidx/appcompat/widget/Toolbar;Landroid/view/inspector/PropertyReader;)V
    .locals 2
    .param p1    # Landroidx/appcompat/widget/Toolbar;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/inspector/PropertyReader;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-boolean v0, p0, LYue/ۥۢۡۨۡ;->ۥ:Z

    if-eqz v0, :cond_0

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getCollapseContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getCollapseIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getContentInsetEnd()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟۟:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getContentInsetEndWithActions()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟۠:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getContentInsetLeft()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟ۡ:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getContentInsetRight()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟ۢ:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStart()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥۣ۟۟۟:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStartWithNavigation()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟ۤ:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getLogo()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟ۥ:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getLogoDescription()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟ۦ:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟ۧ:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۟ۨ:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۠:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getPopupTheme()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥۢۡۨ۟;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۠۟:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۠۠:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۠ۡ:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getTitleMarginBottom()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۠ۢ:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getTitleMarginEnd()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥۣ۟۟۠:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getTitleMarginStart()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥۢۡۨۡ;->ۥ۟۟۠ۤ:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getTitleMarginTop()I

    move-result p1

    invoke-static {p2, v0, p1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    return-void

    :cond_0
    invoke-static {}, LYue/ۥ۟۠ۨۨ;->ۥ()Landroid/view/inspector/InspectionCompanion$UninitializedPropertyMapException;

    move-result-object p1

    throw p1
.end method
