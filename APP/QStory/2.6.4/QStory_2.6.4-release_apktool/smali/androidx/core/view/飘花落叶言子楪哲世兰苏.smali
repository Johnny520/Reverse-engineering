.class public final Landroidx/core/view/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Landroid/view/DisplayCutout;


# direct methods
.method public constructor <init>(Landroid/view/DisplayCutout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/core/view/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Landroid/view/DisplayCutout;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const-class v0, Landroidx/core/view/飘花落叶言子楪哲世兰苏;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Landroidx/core/view/飘花落叶言子楪哲世兰苏;

    .line 17
    .line 18
    iget-object p0, p0, Landroidx/core/view/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Landroid/view/DisplayCutout;

    .line 19
    .line 20
    iget-object p1, p1, Landroidx/core/view/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Landroid/view/DisplayCutout;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/core/view/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Landroid/view/DisplayCutout;

    .line 2
    .line 3
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰(Landroid/view/DisplayCutout;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DisplayCutoutCompat{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroidx/core/view/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Landroid/view/DisplayCutout;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, "}"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/core/view/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Landroid/view/DisplayCutout;

    .line 8
    .line 9
    invoke-static {p0}, Landroidx/core/view/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Landroid/view/DisplayCutout;)Landroid/graphics/Insets;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/graphics/Insets;)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 19
    .line 20
    return-object p0
.end method
