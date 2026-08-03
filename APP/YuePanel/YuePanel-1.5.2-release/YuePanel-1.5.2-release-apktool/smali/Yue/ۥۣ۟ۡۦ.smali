.class public final LYue/ۥۣ۟ۡۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۟ۡۦ$ۥ;
    }
.end annotation


# instance fields
.field public ۥ:Landroid/widget/TextView;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public ۥ۟:Landroid/view/textclassifier/TextClassifier;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, LYue/ۥۣ۟ۡۦ;->ۥ:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public ۥ()Landroid/view/textclassifier/TextClassifier;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        api = 0x1a
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۡۦ;->ۥ۟:Landroid/view/textclassifier/TextClassifier;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۡۦ;->ۥ:Landroid/widget/TextView;

    invoke-static {v0}, LYue/ۥۣ۟ۡۦ$ۥ;->ۥ(Landroid/widget/TextView;)Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public ۥ۟(Landroid/view/textclassifier/TextClassifier;)V
    .locals 0
    .param p1    # Landroid/view/textclassifier/TextClassifier;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        api = 0x1a
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟ۡۦ;->ۥ۟:Landroid/view/textclassifier/TextClassifier;

    return-void
.end method
