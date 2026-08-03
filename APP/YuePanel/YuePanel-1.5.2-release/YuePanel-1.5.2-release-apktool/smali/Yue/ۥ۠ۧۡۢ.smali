.class public final LYue/ۥ۠ۧۡۢ;
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


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ:Z

    return-void
.end method


# virtual methods
.method public mapProperties(Landroid/view/inspector/PropertyMapper;)V
    .locals 3
    .param p1    # Landroid/view/inspector/PropertyMapper;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-string v0, "baselineAligned"

    const v1, 0x1010126

    invoke-static {p1, v0, v1}, LYue/ۥ۠ۧ۠ۥ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟:I

    const-string v0, "baselineAlignedChildIndex"

    const v1, 0x1010127

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟۟:I

    const-string v0, "gravity"

    const v1, 0x10100af

    invoke-static {p1, v0, v1}, LYue/ۥ۠ۧ۠ۦ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟۟۟:I

    new-instance v0, LYue/ۥ۠ۧۡۢ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۠ۧۡۢ$ۥ;-><init>(LYue/ۥ۠ۧۡۢ;)V

    const-string v1, "orientation"

    const v2, 0x10100c4

    invoke-static {p1, v1, v2, v0}, LYue/ۥۣ۟ۡ۟;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;ILjava/util/function/IntFunction;)I

    move-result v0

    iput v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟۟۟۟:I

    const-string v0, "weightSum"

    const v1, 0x1010128

    invoke-static {p1, v0, v1}, LYue/ۥ۠ۧ۠ۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟۟۟۠:I

    const-string v0, "divider"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۨۡ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟۟۟ۡ:I

    const-string v0, "dividerPadding"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥۣ۟۟ۨ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟ۡ۟ۢ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟۟۟ۢ:I

    const-string v0, "measureWithLargestChild"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥۣ۟۠ۦ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۠ۧ۠ۥ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥ۠ۧۡۢ;->ۥۣ۟۟۟:I

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۠ۦۧ:I

    new-instance v1, LYue/ۥ۠ۧۡۢ$ۥ۟;

    invoke-direct {v1, p0}, LYue/ۥ۠ۧۡۢ$ۥ۟;-><init>(LYue/ۥ۠ۧۡۢ;)V

    const-string v2, "showDividers"

    invoke-static {p1, v2, v0, v1}, LYue/ۥ۠ۧ۠ۨ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;ILjava/util/function/IntFunction;)I

    move-result p1

    iput p1, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟۟۟ۤ:I

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۠ۧۡۢ;->ۥ:Z

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

    check-cast p1, Landroidx/appcompat/widget/ۥ۟۟۟;

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۧۡۢ;->ۥ(Landroidx/appcompat/widget/ۥ۟۟۟;Landroid/view/inspector/PropertyReader;)V

    return-void
.end method

.method public ۥ(Landroidx/appcompat/widget/ۥ۟۟۟;Landroid/view/inspector/PropertyReader;)V
    .locals 2
    .param p1    # Landroidx/appcompat/widget/ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/inspector/PropertyReader;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-boolean v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ:Z

    if-eqz v0, :cond_0

    iget v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/ۥ۟۟۟;->isBaselineAligned()Z

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۠ۧۡ;->ۥ(Landroid/view/inspector/PropertyReader;IZ)V

    iget v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟۟:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/ۥ۟۟۟;->getBaselineAlignedChildIndex()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟۟۟:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/ۥ۟۟۟;->getGravity()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۠ۧۡ۟;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟۟۟۟:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/ۥ۟۟۟;->getOrientation()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟ۡ;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟۟۟۠:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/ۥ۟۟۟;->getWeightSum()F

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۠ۧۡ۠;->ۥ(Landroid/view/inspector/PropertyReader;IF)V

    iget v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟۟۟ۡ:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/ۥ۟۟۟;->getDividerDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟۟۟ۢ:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/ۥ۟۟۟;->getDividerPadding()I

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟ۡ۟۠;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    iget v0, p0, LYue/ۥ۠ۧۡۢ;->ۥۣ۟۟۟:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/ۥ۟۟۟;->isMeasureWithLargestChildEnabled()Z

    move-result v1

    invoke-static {p2, v0, v1}, LYue/ۥ۠ۧۡ;->ۥ(Landroid/view/inspector/PropertyReader;IZ)V

    iget v0, p0, LYue/ۥ۠ۧۡۢ;->ۥ۟۟۟ۤ:I

    invoke-virtual {p1}, Landroidx/appcompat/widget/ۥ۟۟۟;->getShowDividers()I

    move-result p1

    invoke-static {p2, v0, p1}, LYue/ۥ۠ۧۡۡ;->ۥ(Landroid/view/inspector/PropertyReader;II)V

    return-void

    :cond_0
    invoke-static {}, LYue/ۥ۟۠ۨۨ;->ۥ()Landroid/view/inspector/InspectionCompanion$UninitializedPropertyMapException;

    move-result-object p1

    throw p1
.end method
