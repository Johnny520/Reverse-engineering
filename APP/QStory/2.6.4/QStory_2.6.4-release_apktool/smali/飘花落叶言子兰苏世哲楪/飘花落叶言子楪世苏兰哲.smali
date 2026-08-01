.class public final L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏兰哲;
.super Landroid/graphics/drawable/Animatable2$AnimationCallback;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:Lcom/google/android/material/checkbox/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Lcom/google/android/material/checkbox/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lcom/google/android/material/checkbox/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Animatable2$AnimationCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lcom/google/android/material/checkbox/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/checkbox/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Lcom/google/android/material/checkbox/飘花落叶言子楪世兰苏哲;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/material/checkbox/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final onAnimationStart(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lcom/google/android/material/checkbox/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/checkbox/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Lcom/google/android/material/checkbox/飘花落叶言子楪世兰苏哲;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/material/checkbox/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/google/android/material/checkbox/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏哲兰楪:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0, p0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
