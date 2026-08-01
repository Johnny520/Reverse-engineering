.class public final Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/animation/core/飘花落叶言子哲楪世苏兰;
.implements Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 107
    new-array v0, v0, [Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;

    iput-object v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 108
    iput v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 109
    iput v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    return-void
.end method

.method public constructor <init>(IILandroidx/compose/animation/core/飘花落叶言子楪兰哲世苏;)V
    .locals 2

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    iput p1, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 112
    iput p2, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 113
    new-instance v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    new-instance v1, Landroidx/compose/animation/core/飘花落叶言子世楪兰苏哲;

    invoke-direct {v1, p1, p2, p3}, Landroidx/compose/animation/core/飘花落叶言子世楪兰苏哲;-><init>(IILandroidx/compose/animation/core/飘花落叶言子楪兰哲世苏;)V

    invoke-direct {v0, v1}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;-><init>(Landroidx/compose/animation/core/飘花落叶言子世楪苏兰哲;)V

    iput-object v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 13
    .line 14
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    sget-object v0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世兰哲:[I

    .line 19
    .line 20
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-ge v1, v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    iget v3, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 38
    .line 39
    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    iput v2, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    const/4 v3, 0x1

    .line 47
    if-ne v2, v3, :cond_1

    .line 48
    .line 49
    iget v3, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 50
    .line 51
    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    iput v2, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    const-string v4, "layout"

    .line 73
    .line 74
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_1

    .line 79
    .line 80
    new-instance v3, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲苏世兰;

    .line 81
    .line 82
    invoke-direct {v3}, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲苏世兰;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    const/4 v5, 0x0

    .line 90
    invoke-virtual {v4, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 95
    .line 96
    invoke-virtual {v3, v2}, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 97
    .line 98
    .line 99
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 103
    .line 104
    .line 105
    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世兰哲苏(III)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    add-int/2addr p1, v0

    .line 14
    add-int/2addr p2, v0

    .line 15
    invoke-interface {p0, p1, p2, p3}, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(III)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public 飘花落叶言子楪世兰苏哲()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    invoke-interface {p0}, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public 飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public 飘花落叶言子楪世苏兰哲(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    iget v1, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, p0

    .line 14
    invoke-interface {v0, p1, p2}, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public 飘花落叶言子楪兰哲苏世()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    return p0
.end method

.method public 飘花落叶言子楪兰苏哲世(JLandroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;)Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;
    .locals 6

    .line 1
    iget-object p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰苏哲世(JLandroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;)Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public 飘花落叶言子楪哲世苏兰(Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public 飘花落叶言子楪哲兰世苏()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    return p0
.end method

.method public 飘花落叶言子楪苏世兰哲()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, "OffsetApplier up called with no corresponding down"

    .line 7
    .line 8
    invoke-static {v0}, Landroidx/compose/runtime/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :goto_0
    iget v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 12
    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    iput v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 16
    .line 17
    iget-object p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    invoke-interface {p0}, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public 飘花落叶言子楪苏世哲兰(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    iget v1, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, p0

    .line 14
    invoke-interface {v0, p1, p2}, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public 飘花落叶言子楪苏兰世哲()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    invoke-interface {p0}, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public 飘花落叶言子楪苏兰哲世(JLandroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;)Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;
    .locals 6

    .line 1
    iget-object p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪苏兰哲世(JLandroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;)Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public 飘花落叶言子楪苏哲世兰(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    iget v1, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, p0

    .line 14
    invoke-interface {v0, p1, p2}, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
