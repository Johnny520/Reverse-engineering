.class public final LYue/ۥ۟ۡ۠;
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


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥ۟ۡ۠;->ۥ:Z

    return-void
.end method


# virtual methods
.method public mapProperties(Landroid/view/inspector/PropertyMapper;)V
    .locals 2
    .param p1    # Landroid/view/inspector/PropertyMapper;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-string v0, "backgroundTint"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥۣ۟۟ۤ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥ۟ۡ۠;->ۥ۟:I

    const-string v0, "backgroundTintMode"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥۣ۟۟ۥ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥ۟ۡ۠;->ۥ۟۟:I

    const-string v0, "checkMarkTint"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۥ۠:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥ۟ۡ۠;->ۥ۟۟۟:I

    const-string v0, "checkMarkTintMode"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۥۡ:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥ۟ۡ۠;->ۥ۟۟۟۟:I

    const-string v0, "drawableTint"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۠۟۟:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥ۟ۡ۠;->ۥ۟۟۟۠:I

    const-string v0, "drawableTintMode"

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۠۟۠:I

    invoke-static {p1, v0, v1}, LYue/ۥ۟۠ۨۧ;->ۥ(Landroid/view/inspector/PropertyMapper;Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, LYue/ۥ۟ۡ۠;->ۥ۟۟۟ۡ:I

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۟ۡ۠;->ۥ:Z

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

    check-cast p1, LYue/ۥ۟ۡ۠۟;

    invoke-virtual {p0, p1, p2}, LYue/ۥ۟ۡ۠;->ۥ(LYue/ۥ۟ۡ۠۟;Landroid/view/inspector/PropertyReader;)V

    return-void
.end method

.method public ۥ(LYue/ۥ۟ۡ۠۟;Landroid/view/inspector/PropertyReader;)V
    .locals 2
    .param p1    # LYue/ۥ۟ۡ۠۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/inspector/PropertyReader;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-boolean v0, p0, LYue/ۥ۟ۡ۠;->ۥ:Z

    if-eqz v0, :cond_0

    iget v0, p0, LYue/ۥ۟ۡ۠;->ۥ۟:I

    invoke-virtual {p1}, Landroid/view/View;->getBackgroundTintList()Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥ۟ۡ۠;->ۥ۟۟:I

    invoke-virtual {p1}, Landroid/view/View;->getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥ۟ۡ۠;->ۥ۟۟۟:I

    invoke-virtual {p1}, Landroid/widget/CheckedTextView;->getCheckMarkTintList()Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥ۟ۡ۠;->ۥ۟۟۟۟:I

    invoke-virtual {p1}, Landroid/widget/CheckedTextView;->getCheckMarkTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥ۟ۡ۠;->ۥ۟۟۟۠:I

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawableTintList()Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {p2, v0, v1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    iget v0, p0, LYue/ۥ۟ۡ۠;->ۥ۟۟۟ۡ:I

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawableTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-static {p2, v0, p1}, LYue/ۥ۟۠ۨۦ;->ۥ(Landroid/view/inspector/PropertyReader;ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-static {}, LYue/ۥ۟۠ۨۨ;->ۥ()Landroid/view/inspector/InspectionCompanion$UninitializedPropertyMapException;

    move-result-object p1

    throw p1
.end method
