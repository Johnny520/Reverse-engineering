.class public LYue/ۥ۟ۡۤ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۡۤ$ۥ;


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    api = 0x1a
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۡۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥ۟ۡۤ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۡۤ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۡۤ$ۥ۟;->ۥ:LYue/ۥ۟ۡۤ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAutoSizeMaxTextSize()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۤ$ۥ۟;->ۥ:LYue/ۥ۟ۡۤ;

    invoke-static {v0}, LYue/ۥ۟ۡۤ;->access$001(LYue/ۥ۟ۡۤ;)I

    move-result v0

    return v0
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۤ$ۥ۟;->ۥ:LYue/ۥ۟ۡۤ;

    invoke-static {v0}, LYue/ۥ۟ۡۤ;->access$101(LYue/ۥ۟ۡۤ;)I

    move-result v0

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۤ$ۥ۟;->ۥ:LYue/ۥ۟ۡۤ;

    invoke-static {v0}, LYue/ۥ۟ۡۤ;->access$201(LYue/ۥ۟ۡۤ;)I

    move-result v0

    return v0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۤ$ۥ۟;->ۥ:LYue/ۥ۟ۡۤ;

    invoke-static {v0}, LYue/ۥ۟ۡۤ;->access$301(LYue/ۥ۟ۡۤ;)[I

    move-result-object v0

    return-object v0
.end method

.method public getAutoSizeTextType()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۤ$ۥ۟;->ۥ:LYue/ۥ۟ۡۤ;

    invoke-static {v0}, LYue/ۥ۟ۡۤ;->access$401(LYue/ۥ۟ۡۤ;)I

    move-result v0

    return v0
.end method

.method public setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۤ$ۥ۟;->ۥ:LYue/ۥ۟ۡۤ;

    invoke-static {v0, p1, p2, p3, p4}, LYue/ۥ۟ۡۤ;->access$601(LYue/ۥ۟ۡۤ;IIII)V

    return-void
.end method

.method public setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۤ$ۥ۟;->ۥ:LYue/ۥ۟ۡۤ;

    invoke-static {v0, p1, p2}, LYue/ۥ۟ۡۤ;->access$701(LYue/ۥ۟ۡۤ;[II)V

    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۤ$ۥ۟;->ۥ:LYue/ۥ۟ۡۤ;

    invoke-static {v0, p1}, LYue/ۥ۟ۡۤ;->access$801(LYue/ۥ۟ۡۤ;I)V

    return-void
.end method

.method public ۥ()Landroid/view/textclassifier/TextClassifier;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۤ$ۥ۟;->ۥ:LYue/ۥ۟ۡۤ;

    invoke-static {v0}, LYue/ۥ۟ۡۤ;->access$501(LYue/ۥ۟ۡۤ;)Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟(Landroid/view/textclassifier/TextClassifier;)V
    .locals 1
    .param p1    # Landroid/view/textclassifier/TextClassifier;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۟ۡۤ$ۥ۟;->ۥ:LYue/ۥ۟ۡۤ;

    invoke-static {v0, p1}, LYue/ۥ۟ۡۤ;->access$901(LYue/ۥ۟ۡۤ;Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method public ۥ۟۟(I)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟۟(I)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟۟۟(IF)V
    .locals 0

    return-void
.end method
