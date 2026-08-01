.class public Llin/xposed/hook/javaplugin/view/animation/ViewShowAnimation;
.super Landroid/view/animation/Animation;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field initialHeight:I

.field targetHeight:I

.field private final view:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/animation/ViewShowAnimation;->view:Landroid/view/View;

    .line 5
    .line 6
    iput p2, p0, Llin/xposed/hook/javaplugin/view/animation/ViewShowAnimation;->targetHeight:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .line 1
    iget-object p2, p0, Llin/xposed/hook/javaplugin/view/animation/ViewShowAnimation;->view:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget v0, p0, Llin/xposed/hook/javaplugin/view/animation/ViewShowAnimation;->initialHeight:I

    .line 8
    .line 9
    iget v1, p0, Llin/xposed/hook/javaplugin/view/animation/ViewShowAnimation;->targetHeight:I

    .line 10
    .line 11
    sub-int/2addr v1, v0

    .line 12
    int-to-float v1, v1

    .line 13
    mul-float/2addr v1, p1

    .line 14
    float-to-int p1, v1

    .line 15
    add-int/2addr v0, p1

    .line 16
    iput v0, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 17
    .line 18
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/animation/ViewShowAnimation;->view:Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public initialize(IIII)V
    .locals 0

    .line 1
    iput p2, p0, Llin/xposed/hook/javaplugin/view/animation/ViewShowAnimation;->initialHeight:I

    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/animation/Animation;->initialize(IIII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
