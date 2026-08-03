.class public final LYue/ۥۢ۠ۦۡ;
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


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ:Z

    return-void
.end method


# virtual methods
.method public mapProperties(Landroid/view/inspector/PropertyMapper;)V
    .locals 2
    .param p1    # Landroid/view/inspector/PropertyMapper;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-string v0, "textOff"

    const v1, 0x1010125

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟:I

    const-string v0, "textOn"

    const v1, 0x1010124

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟:I

    const-string v0, "thumb"

    const v1, 0x1010142

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟:I

    const-string v0, "showText"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۠ۦۨ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۠ۧ۠ۥ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟۟:I

    const-string v0, "splitTrack"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥۣ۟۠ۧ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۠ۧ۠ۥ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟۠:I

    const-string v0, "switchMinWidth"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۠ۨۢ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟ۡ:I

    const-string v0, "switchPadding"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥۣ۟۠ۨ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟ۢ:I

    const-string v0, "thumbTextPadding"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟ۡ۟ۨ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۦۡ;->ۥۣ۟۟۟:I

    const-string v0, "thumbTint"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟ۡ۠:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟ۤ:I

    const-string v0, "thumbTintMode"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟ۡ۠۟:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟ۥ:I

    const-string v0, "track"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟ۡۢ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟ۦ:I

    const-string v0, "trackTint"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟ۡۢ۟:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟ۧ:I

    const-string v0, "trackTintMode"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟ۡۢ۠:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟ۨ:I

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۢ۠ۦۡ;->ۥ:Z

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

    check-cast p1, LYue/ۥۢ۠ۦ۠;

    invoke-virtual {p0, p1, p2}, LYue/ۥۢ۠ۦۡ;->ۥ(LYue/ۥۢ۠ۦ۠;Landroid/view/inspector/PropertyReader;)V

    return-void
.end method

.method public ۥ(LYue/ۥۢ۠ۦ۠;Landroid/view/inspector/PropertyReader;)V
    .locals 2
    .param p1    # LYue/ۥۢ۠ۦ۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/inspector/PropertyReader;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-boolean v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ:Z

    if-eqz v0, :cond_0

    iget v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟:I

    invoke-virtual {p1}, LYue/ۥۢ۠ۦ۠;->getTextOff()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟:I

    invoke-virtual {p1}, LYue/ۥۢ۠ۦ۠;->getTextOn()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟:I

    invoke-virtual {p1}, LYue/ۥۢ۠ۦ۠;->getThumbDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟۟:I

    invoke-virtual {p1}, LYue/ۥۢ۠ۦ۠;->getShowText()Z

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۠ۧۡ;->ۥ(Landroid/view/inspector/PropertyReader;IZ)V

    iget v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟۠:I

    invoke-virtual {p1}, LYue/ۥۢ۠ۦ۠;->getSplitTrack()Z

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۠ۧۡ;->ۥ(Landroid/view/inspector/PropertyReader;IZ)V

    iget v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟ۡ:I

    invoke-virtual {p1}, LYue/ۥۢ۠ۦ۠;->getSwitchMinWidth()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟ۢ:I

    invoke-virtual {p1}, LYue/ۥۢ۠ۦ۠;->getSwitchPadding()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥۢ۠ۦۡ;->ۥۣ۟۟۟:I

    invoke-virtual {p1}, LYue/ۥۢ۠ۦ۠;->getThumbTextPadding()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟ۤ:I

    invoke-virtual {p1}, LYue/ۥۢ۠ۦ۠;->getThumbTintList()Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟ۥ:I

    invoke-virtual {p1}, LYue/ۥۢ۠ۦ۠;->getThumbTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟ۦ:I

    invoke-virtual {p1}, LYue/ۥۢ۠ۦ۠;->getTrackDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟ۧ:I

    invoke-virtual {p1}, LYue/ۥۢ۠ۦ۠;->getTrackTintList()Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥۢ۠ۦۡ;->ۥ۟۟۟ۨ:I

    invoke-virtual {p1}, LYue/ۥۢ۠ۦ۠;->getTrackTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-static {p2, v0, p1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-static {}, LYue/ۥ۟۠ۨۨ;->ۥ()Landroid/view/inspector/InspectionCompanion$UninitializedPropertyMapException;

    move-result-object p1

    throw p1
.end method
