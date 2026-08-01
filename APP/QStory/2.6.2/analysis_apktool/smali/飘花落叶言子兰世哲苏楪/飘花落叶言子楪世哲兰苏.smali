.class public final L飘花落叶言子兰世哲苏楪/飘花落叶言子楪世哲兰苏;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世哲兰苏:Landroidx/collection/飘花落叶言子楪世兰哲苏;

.field public 飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

.field public 飘花落叶言子楪世苏兰哲:Landroid/animation/AnimatorSet;

.field public 飘花落叶言子楪世苏哲兰:L飘花落叶言子兰世哲苏楪/飘花落叶言子楪哲苏兰世;


# virtual methods
.method public final getChangingConfigurations()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "No constant state support for SDK < 24."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No constant state support for SDK < 24."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
