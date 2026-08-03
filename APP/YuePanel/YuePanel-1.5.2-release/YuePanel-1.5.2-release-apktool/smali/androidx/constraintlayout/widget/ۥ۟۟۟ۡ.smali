.class public Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۤ:Ljava/lang/String; = "Constraints"


# instance fields
.field public ۥۣ۟۟۠:Landroidx/constraintlayout/widget/ۥ۟۟۟۠;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x8

    .line 2
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-virtual {p0, p2}, Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ;->ۥ۟۟(Landroid/util/AttributeSet;)V

    const/16 p1, 0x8

    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    invoke-virtual {p0, p2}, Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ;->ۥ۟۟(Landroid/util/AttributeSet;)V

    const/16 p1, 0x8

    .line 8
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ;->ۥ()Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ;->ۥ۟(Landroid/util/AttributeSet;)Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 2
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$ۥ۟;

    invoke-direct {v0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$ۥ۟;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getConstraintSet()Landroidx/constraintlayout/widget/ۥ۟۟۟۠;
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟۠:Landroidx/constraintlayout/widget/ۥ۟۟۟۠;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/ۥ۟۟۟۠;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟۠:Landroidx/constraintlayout/widget/ۥ۟۟۟۠;

    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟۠:Landroidx/constraintlayout/widget/ۥ۟۟۟۠;

    invoke-virtual {v0, p0}, Landroidx/constraintlayout/widget/ۥ۟۟۟۠;->ۥ۟۟ۡۡ(Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ;)V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟۠:Landroidx/constraintlayout/widget/ۥ۟۟۟۠;

    return-object v0
.end method

.method public onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public ۥ()Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ$ۥ;
    .locals 2

    new-instance v0, Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ$ۥ;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ$ۥ;-><init>(II)V

    return-object v0
.end method

.method public ۥ۟(Landroid/util/AttributeSet;)Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ$ۥ;
    .locals 2

    new-instance v0, Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ$ۥ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/constraintlayout/widget/ۥ۟۟۟ۡ$ۥ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final ۥ۟۟(Landroid/util/AttributeSet;)V
    .locals 1

    const-string p1, "Constraints"

    const-string v0, " ################# init"

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
