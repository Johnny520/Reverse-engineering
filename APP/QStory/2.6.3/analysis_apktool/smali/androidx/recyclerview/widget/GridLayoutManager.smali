.class public Landroidx/recyclerview/widget/GridLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子苏世哲楪兰:Ljava/util/Set;


# instance fields
.field public 飘花落叶言子世兰哲楪苏:I

.field public 飘花落叶言子世兰哲苏楪:[I

.field public 飘花落叶言子世兰苏哲楪:Z

.field public 飘花落叶言子苏世楪兰哲:I

.field public 飘花落叶言子苏世楪哲兰:I

.field public final 飘花落叶言子苏楪世兰哲:Landroid/util/SparseIntArray;

.field public 飘花落叶言子苏楪世哲兰:[Landroid/view/View;

.field public final 飘花落叶言子苏楪兰世哲:Landroid/graphics/Rect;

.field public 飘花落叶言子苏楪兰哲世:I

.field public final 飘花落叶言子苏楪哲世兰:Landroid/util/SparseIntArray;

.field public 飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x42

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/16 v3, 0x21

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/16 v4, 0x82

    .line 22
    .line 23
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世哲楪兰:Ljava/util/Set;

    .line 43
    .line 44
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    .line 67
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    const/4 v0, 0x0

    .line 68
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰苏哲楪:Z

    const/4 v0, -0x1

    .line 69
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 70
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪世兰哲:Landroid/util/SparseIntArray;

    .line 71
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲世兰:Landroid/util/SparseIntArray;

    .line 72
    new-instance v1, Landroidx/recyclerview/widget/飘花落叶言子楪兰苏哲世;

    .line 73
    invoke-direct {v1}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;-><init>()V

    .line 74
    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 75
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪兰世哲:Landroid/graphics/Rect;

    .line 76
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪兰哲世:I

    .line 77
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪哲兰:I

    .line 78
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪兰哲:I

    const/4 v0, 0x4

    .line 79
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子兰世哲苏(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x1

    .line 54
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    const/4 v0, 0x0

    .line 55
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰苏哲楪:Z

    const/4 v0, -0x1

    .line 56
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 57
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪世兰哲:Landroid/util/SparseIntArray;

    .line 58
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲世兰:Landroid/util/SparseIntArray;

    .line 59
    new-instance v1, Landroidx/recyclerview/widget/飘花落叶言子楪兰苏哲世;

    .line 60
    invoke-direct {v1}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;-><init>()V

    .line 61
    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 62
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪兰世哲:Landroid/graphics/Rect;

    .line 63
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪兰哲世:I

    .line 64
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪哲兰:I

    .line 65
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪兰哲:I

    .line 66
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子兰世哲苏(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰苏哲楪:Z

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseIntArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪世兰哲:Landroid/util/SparseIntArray;

    .line 16
    .line 17
    new-instance v1, Landroid/util/SparseIntArray;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲世兰:Landroid/util/SparseIntArray;

    .line 23
    .line 24
    new-instance v1, Landroidx/recyclerview/widget/飘花落叶言子楪兰苏哲世;

    .line 25
    .line 26
    invoke-direct {v1}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 30
    .line 31
    new-instance v1, Landroid/graphics/Rect;

    .line 32
    .line 33
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪兰世哲:Landroid/graphics/Rect;

    .line 37
    .line 38
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪兰哲世:I

    .line 39
    .line 40
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪哲兰:I

    .line 41
    .line 42
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪兰哲:I

    .line 43
    .line 44
    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏哲楪(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/飘花落叶言子苏世楪兰哲;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget p1, p1, Landroidx/recyclerview/widget/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子兰世哲苏(I)V

    .line 51
    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世兰哲楪苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰楪哲苏()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x1

    .line 21
    if-ge v0, v1, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sub-int/2addr v0, v1

    .line 30
    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲苏兰世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v1

    .line 35
    return p0
.end method

.method public final 飘花落叶言子世楪兰哲苏()Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;
    .locals 2

    .line 1
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const/4 v1, -0x2

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 8
    .line 9
    invoke-direct {p0, v1, v0}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;-><init>(II)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 14
    .line 15
    invoke-direct {p0, v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;-><init>(II)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final 飘花落叶言子世楪哲苏兰(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪哲世苏(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子世楪苏兰哲(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪苏哲世(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子世苏兰哲楪(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰楪哲苏()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ge v0, v1, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sub-int/2addr v0, v1

    .line 30
    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲苏兰世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v1

    .line 35
    return p0
.end method

.method public final 飘花落叶言子世苏楪兰哲(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;
    .locals 2

    .line 1
    instance-of p0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, -0x1

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 8
    .line 9
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 10
    .line 11
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 12
    .line 13
    .line 14
    iput v1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:I

    .line 15
    .line 16
    iput v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏世哲:I

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 20
    .line 21
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    iput v1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:I

    .line 25
    .line 26
    iput v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏世哲:I

    .line 27
    .line 28
    return-object p0
.end method

.method public final 飘花落叶言子世苏楪哲兰(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;
    .locals 0

    .line 1
    new-instance p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏世哲:I

    .line 11
    .line 12
    return-object p0
.end method

.method public final 飘花落叶言子兰哲世楪苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget-object v5, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 12
    .line 13
    invoke-virtual {v5}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世()I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    const/4 v6, 0x1

    .line 18
    const/high16 v8, 0x40000000    # 2.0f

    .line 19
    .line 20
    if-eq v5, v8, :cond_0

    .line 21
    .line 22
    move v9, v6

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v9, 0x0

    .line 25
    :goto_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 26
    .line 27
    .line 28
    move-result v10

    .line 29
    if-lez v10, :cond_1

    .line 30
    .line 31
    iget-object v10, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲苏楪:[I

    .line 32
    .line 33
    iget v11, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 34
    .line 35
    aget v10, v10, v11

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v10, 0x0

    .line 39
    :goto_1
    if-eqz v9, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子兰苏哲世()V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget v11, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 45
    .line 46
    if-ne v11, v6, :cond_3

    .line 47
    .line 48
    move v11, v6

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    const/4 v11, 0x0

    .line 51
    :goto_2
    iget v12, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 52
    .line 53
    if-nez v11, :cond_4

    .line 54
    .line 55
    iget v12, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 56
    .line 57
    invoke-virtual {v0, v12, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲兰世苏(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 58
    .line 59
    .line 60
    move-result v12

    .line 61
    iget v13, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 62
    .line 63
    invoke-virtual {v0, v13, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲兰苏世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 64
    .line 65
    .line 66
    move-result v13

    .line 67
    add-int/2addr v12, v13

    .line 68
    :cond_4
    const/4 v13, 0x0

    .line 69
    :goto_3
    iget v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 70
    .line 71
    if-ge v13, v14, :cond_8

    .line 72
    .line 73
    iget v14, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 74
    .line 75
    if-ltz v14, :cond_8

    .line 76
    .line 77
    invoke-virtual {v2}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 78
    .line 79
    .line 80
    move-result v15

    .line 81
    if-ge v14, v15, :cond_8

    .line 82
    .line 83
    if-lez v12, :cond_8

    .line 84
    .line 85
    iget v14, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 86
    .line 87
    invoke-virtual {v0, v14, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲兰苏世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 88
    .line 89
    .line 90
    move-result v15

    .line 91
    iget v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 92
    .line 93
    if-gt v15, v8, :cond_7

    .line 94
    .line 95
    sub-int/2addr v12, v15

    .line 96
    if-gez v12, :cond_5

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_5
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    if-nez v8, :cond_6

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_6
    iget-object v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪世哲兰:[Landroid/view/View;

    .line 107
    .line 108
    aput-object v8, v14, v13

    .line 109
    .line 110
    add-int/lit8 v13, v13, 0x1

    .line 111
    .line 112
    const/high16 v8, 0x40000000    # 2.0f

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_7
    const-string v1, " requires "

    .line 116
    .line 117
    const-string v2, " spans but GridLayoutManager has only "

    .line 118
    .line 119
    const-string v3, "Item at position "

    .line 120
    .line 121
    invoke-static {v14, v15, v3, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iget v0, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 126
    .line 127
    const-string v2, " spans."

    .line 128
    .line 129
    invoke-static {v1, v2, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_8
    :goto_4
    if-nez v13, :cond_9

    .line 138
    .line 139
    iput-boolean v6, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Z

    .line 140
    .line 141
    return-void

    .line 142
    :cond_9
    if-eqz v11, :cond_a

    .line 143
    .line 144
    move v15, v6

    .line 145
    move v14, v13

    .line 146
    const/4 v12, 0x0

    .line 147
    goto :goto_5

    .line 148
    :cond_a
    add-int/lit8 v12, v13, -0x1

    .line 149
    .line 150
    const/4 v14, -0x1

    .line 151
    const/4 v15, -0x1

    .line 152
    :goto_5
    const/4 v6, 0x0

    .line 153
    :goto_6
    if-eq v12, v14, :cond_b

    .line 154
    .line 155
    iget-object v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪世哲兰:[Landroid/view/View;

    .line 156
    .line 157
    aget-object v8, v8, v12

    .line 158
    .line 159
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 160
    .line 161
    .line 162
    move-result-object v16

    .line 163
    move-object/from16 v7, v16

    .line 164
    .line 165
    check-cast v7, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 166
    .line 167
    invoke-static {v8}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    invoke-virtual {v0, v8, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲兰苏世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    iput v8, v7, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏世哲:I

    .line 176
    .line 177
    iput v6, v7, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:I

    .line 178
    .line 179
    add-int/2addr v6, v8

    .line 180
    add-int/2addr v12, v15

    .line 181
    goto :goto_6

    .line 182
    :cond_b
    const/4 v1, 0x0

    .line 183
    const/4 v2, 0x0

    .line 184
    const/4 v6, 0x0

    .line 185
    :goto_7
    if-ge v2, v13, :cond_11

    .line 186
    .line 187
    iget-object v7, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪世哲兰:[Landroid/view/View;

    .line 188
    .line 189
    aget-object v7, v7, v2

    .line 190
    .line 191
    iget-object v8, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:Ljava/util/List;

    .line 192
    .line 193
    if-nez v8, :cond_d

    .line 194
    .line 195
    if-eqz v11, :cond_c

    .line 196
    .line 197
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世(Landroid/view/View;)V

    .line 198
    .line 199
    .line 200
    const/4 v8, 0x0

    .line 201
    goto :goto_8

    .line 202
    :cond_c
    const/4 v8, 0x0

    .line 203
    invoke-virtual {v0, v7, v8, v8}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世苏兰(Landroid/view/View;IZ)V

    .line 204
    .line 205
    .line 206
    goto :goto_8

    .line 207
    :cond_d
    const/4 v8, 0x0

    .line 208
    if-eqz v11, :cond_e

    .line 209
    .line 210
    const/4 v12, -0x1

    .line 211
    const/4 v14, 0x1

    .line 212
    invoke-virtual {v0, v7, v12, v14}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世苏兰(Landroid/view/View;IZ)V

    .line 213
    .line 214
    .line 215
    goto :goto_8

    .line 216
    :cond_e
    const/4 v14, 0x1

    .line 217
    invoke-virtual {v0, v7, v8, v14}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世苏兰(Landroid/view/View;IZ)V

    .line 218
    .line 219
    .line 220
    :goto_8
    iget-object v12, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪兰世哲:Landroid/graphics/Rect;

    .line 221
    .line 222
    invoke-virtual {v0, v12, v7}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏世兰(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v7, v5, v8}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子兰世苏哲(Landroid/view/View;IZ)V

    .line 226
    .line 227
    .line 228
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 229
    .line 230
    invoke-virtual {v8, v7}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(Landroid/view/View;)I

    .line 231
    .line 232
    .line 233
    move-result v8

    .line 234
    if-le v8, v6, :cond_f

    .line 235
    .line 236
    move v6, v8

    .line 237
    :cond_f
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    check-cast v8, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 242
    .line 243
    iget-object v12, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 244
    .line 245
    invoke-virtual {v12, v7}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏(Landroid/view/View;)I

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    int-to-float v7, v7

    .line 250
    const/high16 v12, 0x3f800000    # 1.0f

    .line 251
    .line 252
    mul-float/2addr v7, v12

    .line 253
    iget v8, v8, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏世哲:I

    .line 254
    .line 255
    int-to-float v8, v8

    .line 256
    div-float/2addr v7, v8

    .line 257
    cmpl-float v8, v7, v1

    .line 258
    .line 259
    if-lez v8, :cond_10

    .line 260
    .line 261
    move v1, v7

    .line 262
    :cond_10
    add-int/lit8 v2, v2, 0x1

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_11
    if-eqz v9, :cond_13

    .line 266
    .line 267
    iget v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 268
    .line 269
    int-to-float v2, v2

    .line 270
    mul-float/2addr v1, v2

    .line 271
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏哲世兰(I)V

    .line 280
    .line 281
    .line 282
    const/4 v6, 0x0

    .line 283
    const/4 v8, 0x0

    .line 284
    :goto_9
    if-ge v8, v13, :cond_13

    .line 285
    .line 286
    iget-object v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪世哲兰:[Landroid/view/View;

    .line 287
    .line 288
    aget-object v1, v1, v8

    .line 289
    .line 290
    const/high16 v2, 0x40000000    # 2.0f

    .line 291
    .line 292
    const/4 v14, 0x1

    .line 293
    invoke-virtual {v0, v1, v2, v14}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子兰世苏哲(Landroid/view/View;IZ)V

    .line 294
    .line 295
    .line 296
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 297
    .line 298
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(Landroid/view/View;)I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-le v1, v6, :cond_12

    .line 303
    .line 304
    move v6, v1

    .line 305
    :cond_12
    add-int/lit8 v8, v8, 0x1

    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_13
    const/4 v8, 0x0

    .line 309
    :goto_a
    if-ge v8, v13, :cond_17

    .line 310
    .line 311
    iget-object v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪世哲兰:[Landroid/view/View;

    .line 312
    .line 313
    aget-object v1, v1, v8

    .line 314
    .line 315
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 316
    .line 317
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(Landroid/view/View;)I

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    if-eq v2, v6, :cond_15

    .line 322
    .line 323
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    check-cast v2, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 328
    .line 329
    iget-object v5, v2, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲兰世苏:Landroid/graphics/Rect;

    .line 330
    .line 331
    iget v7, v5, Landroid/graphics/Rect;->top:I

    .line 332
    .line 333
    iget v9, v5, Landroid/graphics/Rect;->bottom:I

    .line 334
    .line 335
    add-int/2addr v7, v9

    .line 336
    iget v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 337
    .line 338
    add-int/2addr v7, v9

    .line 339
    iget v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 340
    .line 341
    add-int/2addr v7, v9

    .line 342
    iget v9, v5, Landroid/graphics/Rect;->left:I

    .line 343
    .line 344
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 345
    .line 346
    add-int/2addr v9, v5

    .line 347
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 348
    .line 349
    add-int/2addr v9, v5

    .line 350
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 351
    .line 352
    add-int/2addr v9, v5

    .line 353
    iget v5, v2, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:I

    .line 354
    .line 355
    iget v10, v2, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏世哲:I

    .line 356
    .line 357
    invoke-virtual {v0, v5, v10}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲苏世兰(II)I

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    iget v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 362
    .line 363
    const/4 v14, 0x1

    .line 364
    if-ne v10, v14, :cond_14

    .line 365
    .line 366
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 367
    .line 368
    const/4 v10, 0x0

    .line 369
    const/high16 v11, 0x40000000    # 2.0f

    .line 370
    .line 371
    invoke-static {v10, v5, v11, v9, v2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏兰楪哲(ZIIII)I

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    sub-int v5, v6, v7

    .line 376
    .line 377
    invoke-static {v5, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 378
    .line 379
    .line 380
    move-result v5

    .line 381
    goto :goto_b

    .line 382
    :cond_14
    const/4 v10, 0x0

    .line 383
    const/high16 v11, 0x40000000    # 2.0f

    .line 384
    .line 385
    sub-int v9, v6, v9

    .line 386
    .line 387
    invoke-static {v9, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 388
    .line 389
    .line 390
    move-result v9

    .line 391
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 392
    .line 393
    invoke-static {v10, v5, v11, v7, v2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏兰楪哲(ZIIII)I

    .line 394
    .line 395
    .line 396
    move-result v5

    .line 397
    move v2, v9

    .line 398
    :goto_b
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 399
    .line 400
    .line 401
    move-result-object v7

    .line 402
    check-cast v7, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 403
    .line 404
    invoke-virtual {v0, v1, v2, v5, v7}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲兰世楪苏(Landroid/view/View;IILandroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;)Z

    .line 405
    .line 406
    .line 407
    move-result v7

    .line 408
    if-eqz v7, :cond_16

    .line 409
    .line 410
    invoke-virtual {v1, v2, v5}, Landroid/view/View;->measure(II)V

    .line 411
    .line 412
    .line 413
    goto :goto_c

    .line 414
    :cond_15
    const/4 v10, 0x0

    .line 415
    const/high16 v11, 0x40000000    # 2.0f

    .line 416
    .line 417
    :cond_16
    :goto_c
    add-int/lit8 v8, v8, 0x1

    .line 418
    .line 419
    goto :goto_a

    .line 420
    :cond_17
    const/4 v10, 0x0

    .line 421
    iput v6, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 422
    .line 423
    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 424
    .line 425
    iget v2, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:I

    .line 426
    .line 427
    iget v8, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 428
    .line 429
    const/4 v14, 0x1

    .line 430
    if-ne v1, v14, :cond_19

    .line 431
    .line 432
    const/4 v12, -0x1

    .line 433
    if-ne v2, v12, :cond_18

    .line 434
    .line 435
    sub-int v1, v8, v6

    .line 436
    .line 437
    move v3, v1

    .line 438
    move v1, v10

    .line 439
    move v2, v1

    .line 440
    goto :goto_e

    .line 441
    :cond_18
    add-int v1, v8, v6

    .line 442
    .line 443
    move v3, v8

    .line 444
    move v2, v10

    .line 445
    move v8, v1

    .line 446
    move v1, v2

    .line 447
    goto :goto_e

    .line 448
    :cond_19
    const/4 v12, -0x1

    .line 449
    if-ne v2, v12, :cond_1a

    .line 450
    .line 451
    sub-int v1, v8, v6

    .line 452
    .line 453
    move v2, v8

    .line 454
    :goto_d
    move v3, v10

    .line 455
    move v8, v3

    .line 456
    goto :goto_e

    .line 457
    :cond_1a
    add-int v1, v8, v6

    .line 458
    .line 459
    move v2, v1

    .line 460
    move v1, v8

    .line 461
    goto :goto_d

    .line 462
    :goto_e
    move v7, v10

    .line 463
    :goto_f
    iget-object v5, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪世哲兰:[Landroid/view/View;

    .line 464
    .line 465
    if-ge v7, v13, :cond_1f

    .line 466
    .line 467
    aget-object v5, v5, v7

    .line 468
    .line 469
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 470
    .line 471
    .line 472
    move-result-object v6

    .line 473
    check-cast v6, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 474
    .line 475
    iget v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 476
    .line 477
    const/4 v14, 0x1

    .line 478
    if-ne v9, v14, :cond_1c

    .line 479
    .line 480
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲楪苏世()Z

    .line 481
    .line 482
    .line 483
    move-result v1

    .line 484
    if-eqz v1, :cond_1b

    .line 485
    .line 486
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingLeft()I

    .line 487
    .line 488
    .line 489
    move-result v1

    .line 490
    iget-object v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲苏楪:[I

    .line 491
    .line 492
    iget v9, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 493
    .line 494
    iget v10, v6, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:I

    .line 495
    .line 496
    sub-int/2addr v9, v10

    .line 497
    aget v2, v2, v9

    .line 498
    .line 499
    add-int/2addr v1, v2

    .line 500
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 501
    .line 502
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏(Landroid/view/View;)I

    .line 503
    .line 504
    .line 505
    move-result v2

    .line 506
    sub-int v2, v1, v2

    .line 507
    .line 508
    move/from16 v17, v2

    .line 509
    .line 510
    move v2, v1

    .line 511
    move/from16 v1, v17

    .line 512
    .line 513
    goto :goto_10

    .line 514
    :cond_1b
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingLeft()I

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    iget-object v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲苏楪:[I

    .line 519
    .line 520
    iget v9, v6, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:I

    .line 521
    .line 522
    aget v2, v2, v9

    .line 523
    .line 524
    add-int/2addr v1, v2

    .line 525
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 526
    .line 527
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏(Landroid/view/View;)I

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    add-int/2addr v2, v1

    .line 532
    goto :goto_10

    .line 533
    :cond_1c
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingTop()I

    .line 534
    .line 535
    .line 536
    move-result v3

    .line 537
    iget-object v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲苏楪:[I

    .line 538
    .line 539
    iget v9, v6, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:I

    .line 540
    .line 541
    aget v8, v8, v9

    .line 542
    .line 543
    add-int/2addr v3, v8

    .line 544
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 545
    .line 546
    invoke-virtual {v8, v5}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏(Landroid/view/View;)I

    .line 547
    .line 548
    .line 549
    move-result v8

    .line 550
    add-int/2addr v8, v3

    .line 551
    :goto_10
    invoke-static {v5, v1, v3, v2, v8}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子苏楪哲兰世(Landroid/view/View;IIII)V

    .line 552
    .line 553
    .line 554
    iget-object v9, v6, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 555
    .line 556
    invoke-virtual {v9}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 557
    .line 558
    .line 559
    move-result v9

    .line 560
    if-nez v9, :cond_1d

    .line 561
    .line 562
    iget-object v6, v6, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 563
    .line 564
    invoke-virtual {v6}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isUpdated()Z

    .line 565
    .line 566
    .line 567
    move-result v6

    .line 568
    if-eqz v6, :cond_1e

    .line 569
    .line 570
    :cond_1d
    const/4 v14, 0x1

    .line 571
    goto :goto_11

    .line 572
    :cond_1e
    const/4 v14, 0x1

    .line 573
    goto :goto_12

    .line 574
    :goto_11
    iput-boolean v14, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲苏兰:Z

    .line 575
    .line 576
    :goto_12
    iget-boolean v6, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏:Z

    .line 577
    .line 578
    invoke-virtual {v5}, Landroid/view/View;->hasFocusable()Z

    .line 579
    .line 580
    .line 581
    move-result v5

    .line 582
    or-int/2addr v5, v6

    .line 583
    iput-boolean v5, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏:Z

    .line 584
    .line 585
    add-int/lit8 v7, v7, 0x1

    .line 586
    .line 587
    goto :goto_f

    .line 588
    :cond_1f
    const/4 v0, 0x0

    .line 589
    invoke-static {v5, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    return-void
.end method

.method public final 飘花落叶言子兰哲世苏楪(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子兰苏哲世()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_3

    .line 9
    .line 10
    iget-boolean v0, p2, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 11
    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-ne p4, v0, :cond_0

    .line 16
    .line 17
    move p4, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p4, 0x0

    .line 20
    :goto_0
    iget v1, p3, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 21
    .line 22
    invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲兰世苏(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz p4, :cond_1

    .line 27
    .line 28
    :goto_1
    if-lez v1, :cond_3

    .line 29
    .line 30
    iget p4, p3, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 31
    .line 32
    if-lez p4, :cond_3

    .line 33
    .line 34
    add-int/lit8 p4, p4, -0x1

    .line 35
    .line 36
    iput p4, p3, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 37
    .line 38
    invoke-virtual {p0, p4, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲兰世苏(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 44
    .line 45
    .line 46
    move-result p4

    .line 47
    sub-int/2addr p4, v0

    .line 48
    iget v0, p3, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 49
    .line 50
    :goto_2
    if-ge v0, p4, :cond_2

    .line 51
    .line 52
    add-int/lit8 v2, v0, 0x1

    .line 53
    .line 54
    invoke-virtual {p0, v2, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲兰世苏(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-le v3, v1, :cond_2

    .line 59
    .line 60
    move v0, v2

    .line 61
    move v1, v3

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    iput v0, p3, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 64
    .line 65
    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏哲兰世()V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final 飘花落叶言子兰楪世哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;)V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    iget v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 6
    .line 7
    if-ge v2, v3, :cond_0

    .line 8
    .line 9
    iget v3, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 10
    .line 11
    if-ltz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ge v3, v4, :cond_0

    .line 18
    .line 19
    if-lez v0, :cond_0

    .line 20
    .line 21
    iget v3, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 22
    .line 23
    iget v4, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:I

    .line 24
    .line 25
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-virtual {p3, v3, v4}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(II)V

    .line 30
    .line 31
    .line 32
    iget-object v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰(I)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    sub-int/2addr v0, v3

    .line 39
    iget v3, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 40
    .line 41
    iget v4, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 42
    .line 43
    add-int/2addr v3, v4

    .line 44
    iput v3, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子兰苏世楪哲(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;ZZ)Landroid/view/View;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    sub-int/2addr p3, v0

    .line 13
    const/4 p4, -0x1

    .line 14
    move v0, p4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p4, 0x0

    .line 17
    move v8, p4

    .line 18
    move p4, p3

    .line 19
    move p3, v8

    .line 20
    :goto_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪苏哲()V

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 28
    .line 29
    invoke-virtual {v2}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x0

    .line 40
    move-object v5, v4

    .line 41
    :goto_1
    if-eq p3, p4, :cond_6

    .line 42
    .line 43
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-static {v6}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-ltz v7, :cond_5

    .line 52
    .line 53
    if-ge v7, v1, :cond_5

    .line 54
    .line 55
    invoke-virtual {p0, v7, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲兰世苏(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eqz v7, :cond_1

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    check-cast v7, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 67
    .line 68
    iget-object v7, v7, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 69
    .line 70
    invoke-virtual {v7}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_2

    .line 75
    .line 76
    if-nez v5, :cond_5

    .line 77
    .line 78
    move-object v5, v6

    .line 79
    goto :goto_3

    .line 80
    :cond_2
    iget-object v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 81
    .line 82
    invoke-virtual {v7, v6}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-ge v7, v3, :cond_4

    .line 87
    .line 88
    iget-object v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 89
    .line 90
    invoke-virtual {v7, v6}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-ge v7, v2, :cond_3

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    return-object v6

    .line 98
    :cond_4
    :goto_2
    if-nez v4, :cond_5

    .line 99
    .line 100
    move-object v4, v6

    .line 101
    :cond_5
    :goto_3
    add-int/2addr p3, v0

    .line 102
    goto :goto_1

    .line 103
    :cond_6
    if-eqz v4, :cond_7

    .line 104
    .line 105
    return-object v4

    .line 106
    :cond_7
    return-object v5
.end method

.method public final 飘花落叶言子哲世兰楪苏(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子兰苏哲世()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏哲兰世()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子哲世兰楪苏(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final 飘花落叶言子哲兰苏世楪()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰苏哲楪:Z

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final 飘花落叶言子哲楪苏世兰(ILandroid/os/Bundle;)Z
    .locals 11

    .line 1
    sget-object v0, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-virtual {v0}, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, -0x1

    .line 10
    if-ne p1, v0, :cond_31

    .line 11
    .line 12
    if-eq p1, v3, :cond_31

    .line 13
    .line 14
    move p1, v2

    .line 15
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ge p1, v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->isAccessibilityFocused()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 p1, 0x0

    .line 43
    :goto_1
    if-nez p1, :cond_2

    .line 44
    .line 45
    goto/16 :goto_11

    .line 46
    .line 47
    :cond_2
    if-nez p2, :cond_3

    .line 48
    .line 49
    goto/16 :goto_11

    .line 50
    .line 51
    :cond_3
    const-string v0, "android.view.accessibility.action.ARGUMENT_DIRECTION_INT"

    .line 52
    .line 53
    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    sget-object v0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世哲楪兰:Ljava/util/Set;

    .line 58
    .line 59
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    goto/16 :goto_11

    .line 70
    .line 71
    :cond_4
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世哲苏兰楪(Landroid/view/View;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-nez p1, :cond_5

    .line 78
    .line 79
    goto/16 :goto_11

    .line 80
    .line 81
    :cond_5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAbsoluteAdapterPosition()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰哲世(I)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰世哲(I)I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-ltz v0, :cond_36

    .line 94
    .line 95
    if-gez v4, :cond_6

    .line 96
    .line 97
    goto/16 :goto_11

    .line 98
    .line 99
    :cond_6
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲世苏兰(I)Ljava/util/HashSet;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    iget v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪哲兰:I

    .line 104
    .line 105
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_7

    .line 114
    .line 115
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰世哲(I)I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    invoke-virtual {p0, v5, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲世兰苏(II)Ljava/util/HashSet;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    iget v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪兰哲:I

    .line 124
    .line 125
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-nez v5, :cond_8

    .line 134
    .line 135
    :cond_7
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪哲兰:I

    .line 136
    .line 137
    iput v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪兰哲:I

    .line 138
    .line 139
    :cond_8
    iget v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪哲兰:I

    .line 140
    .line 141
    if-ne v5, v3, :cond_9

    .line 142
    .line 143
    move v5, v0

    .line 144
    :cond_9
    iget v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪兰哲:I

    .line 145
    .line 146
    if-ne v6, v3, :cond_a

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_a
    move v4, v6

    .line 150
    :goto_2
    const/16 v6, 0x42

    .line 151
    .line 152
    const/16 v7, 0x11

    .line 153
    .line 154
    if-eq p2, v7, :cond_1b

    .line 155
    .line 156
    const/16 v8, 0x21

    .line 157
    .line 158
    if-eq p2, v8, :cond_17

    .line 159
    .line 160
    if-eq p2, v6, :cond_11

    .line 161
    .line 162
    const/16 v8, 0x82

    .line 163
    .line 164
    if-eq p2, v8, :cond_b

    .line 165
    .line 166
    goto/16 :goto_11

    .line 167
    .line 168
    :cond_b
    add-int/2addr p1, v1

    .line 169
    :goto_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰楪哲苏()I

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    if-ge p1, v8, :cond_10

    .line 174
    .line 175
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰哲世(I)I

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰世哲(I)I

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    if-ltz v8, :cond_10

    .line 184
    .line 185
    if-gez v9, :cond_c

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_c
    iget v10, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 189
    .line 190
    if-ne v10, v1, :cond_e

    .line 191
    .line 192
    if-le v8, v5, :cond_f

    .line 193
    .line 194
    if-eq v9, v4, :cond_d

    .line 195
    .line 196
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰世哲(I)I

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    invoke-virtual {p0, v9, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲世兰苏(II)Ljava/util/HashSet;

    .line 201
    .line 202
    .line 203
    move-result-object v9

    .line 204
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    invoke-virtual {v9, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    if-eqz v9, :cond_f

    .line 213
    .line 214
    :cond_d
    iput v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪哲兰:I

    .line 215
    .line 216
    goto/16 :goto_8

    .line 217
    .line 218
    :cond_e
    if-le v8, v5, :cond_f

    .line 219
    .line 220
    if-ne v9, v4, :cond_f

    .line 221
    .line 222
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰哲世(I)I

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    iput v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪哲兰:I

    .line 227
    .line 228
    goto/16 :goto_8

    .line 229
    .line 230
    :cond_f
    add-int/lit8 p1, p1, 0x1

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_10
    :goto_4
    move p1, v3

    .line 234
    goto/16 :goto_8

    .line 235
    .line 236
    :cond_11
    add-int/2addr p1, v1

    .line 237
    :goto_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰楪哲苏()I

    .line 238
    .line 239
    .line 240
    move-result v8

    .line 241
    if-ge p1, v8, :cond_10

    .line 242
    .line 243
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰哲世(I)I

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰世哲(I)I

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    if-ltz v8, :cond_10

    .line 252
    .line 253
    if-gez v9, :cond_12

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_12
    iget v10, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 257
    .line 258
    if-ne v10, v1, :cond_15

    .line 259
    .line 260
    if-ne v8, v5, :cond_13

    .line 261
    .line 262
    if-gt v9, v4, :cond_14

    .line 263
    .line 264
    :cond_13
    if-le v8, v5, :cond_16

    .line 265
    .line 266
    :cond_14
    iput v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪哲兰:I

    .line 267
    .line 268
    iput v9, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪兰哲:I

    .line 269
    .line 270
    goto/16 :goto_8

    .line 271
    .line 272
    :cond_15
    if-le v9, v4, :cond_16

    .line 273
    .line 274
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲世苏兰(I)Ljava/util/HashSet;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    invoke-virtual {v8, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    if-eqz v8, :cond_16

    .line 287
    .line 288
    iput v9, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪兰哲:I

    .line 289
    .line 290
    goto/16 :goto_8

    .line 291
    .line 292
    :cond_16
    add-int/lit8 p1, p1, 0x1

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_17
    sub-int/2addr p1, v1

    .line 296
    :goto_6
    if-ltz p1, :cond_10

    .line 297
    .line 298
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰哲世(I)I

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰世哲(I)I

    .line 303
    .line 304
    .line 305
    move-result v9

    .line 306
    if-ltz v8, :cond_10

    .line 307
    .line 308
    if-gez v9, :cond_18

    .line 309
    .line 310
    goto :goto_4

    .line 311
    :cond_18
    iget v10, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 312
    .line 313
    if-ne v10, v1, :cond_19

    .line 314
    .line 315
    if-ge v8, v5, :cond_1a

    .line 316
    .line 317
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰世哲(I)I

    .line 318
    .line 319
    .line 320
    move-result v9

    .line 321
    invoke-virtual {p0, v9, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲世兰苏(II)Ljava/util/HashSet;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 326
    .line 327
    .line 328
    move-result-object v10

    .line 329
    invoke-virtual {v9, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v9

    .line 333
    if-eqz v9, :cond_1a

    .line 334
    .line 335
    iput v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪哲兰:I

    .line 336
    .line 337
    goto :goto_8

    .line 338
    :cond_19
    if-ge v8, v5, :cond_1a

    .line 339
    .line 340
    if-ne v9, v4, :cond_1a

    .line 341
    .line 342
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲世苏兰(I)Ljava/util/HashSet;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    invoke-static {v4}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    check-cast v4, Ljava/lang/Integer;

    .line 351
    .line 352
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    iput v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪哲兰:I

    .line 357
    .line 358
    goto :goto_8

    .line 359
    :cond_1a
    add-int/lit8 p1, p1, -0x1

    .line 360
    .line 361
    goto :goto_6

    .line 362
    :cond_1b
    sub-int/2addr p1, v1

    .line 363
    :goto_7
    if-ltz p1, :cond_10

    .line 364
    .line 365
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰哲世(I)I

    .line 366
    .line 367
    .line 368
    move-result v8

    .line 369
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰世哲(I)I

    .line 370
    .line 371
    .line 372
    move-result v9

    .line 373
    if-ltz v8, :cond_10

    .line 374
    .line 375
    if-gez v9, :cond_1c

    .line 376
    .line 377
    goto/16 :goto_4

    .line 378
    .line 379
    :cond_1c
    iget v10, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 380
    .line 381
    if-ne v10, v1, :cond_1f

    .line 382
    .line 383
    if-ne v8, v5, :cond_1d

    .line 384
    .line 385
    if-lt v9, v4, :cond_1e

    .line 386
    .line 387
    :cond_1d
    if-ge v8, v5, :cond_20

    .line 388
    .line 389
    :cond_1e
    iput v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪哲兰:I

    .line 390
    .line 391
    iput v9, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪兰哲:I

    .line 392
    .line 393
    goto :goto_8

    .line 394
    :cond_1f
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲世苏兰(I)Ljava/util/HashSet;

    .line 395
    .line 396
    .line 397
    move-result-object v8

    .line 398
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 399
    .line 400
    .line 401
    move-result-object v10

    .line 402
    invoke-virtual {v8, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v8

    .line 406
    if-eqz v8, :cond_20

    .line 407
    .line 408
    if-ge v9, v4, :cond_20

    .line 409
    .line 410
    iput v9, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪兰哲:I

    .line 411
    .line 412
    goto :goto_8

    .line 413
    :cond_20
    add-int/lit8 p1, p1, -0x1

    .line 414
    .line 415
    goto :goto_7

    .line 416
    :goto_8
    if-ne p1, v3, :cond_30

    .line 417
    .line 418
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 419
    .line 420
    if-nez v4, :cond_30

    .line 421
    .line 422
    if-ne p2, v7, :cond_28

    .line 423
    .line 424
    if-gez v0, :cond_22

    .line 425
    .line 426
    :cond_21
    :goto_9
    move p1, v3

    .line 427
    goto/16 :goto_e

    .line 428
    .line 429
    :cond_22
    if-ne v4, v1, :cond_23

    .line 430
    .line 431
    goto :goto_9

    .line 432
    :cond_23
    new-instance p1, Ljava/util/TreeMap;

    .line 433
    .line 434
    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    .line 435
    .line 436
    .line 437
    move-result-object p2

    .line 438
    invoke-direct {p1, p2}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 439
    .line 440
    .line 441
    move p2, v2

    .line 442
    :goto_a
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰楪哲苏()I

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    if-ge p2, v4, :cond_26

    .line 447
    .line 448
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲世苏兰(I)Ljava/util/HashSet;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 453
    .line 454
    .line 455
    move-result-object v4

    .line 456
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    if-eqz v5, :cond_25

    .line 461
    .line 462
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    check-cast v5, Ljava/lang/Integer;

    .line 467
    .line 468
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 469
    .line 470
    .line 471
    move-result v6

    .line 472
    if-gez v6, :cond_24

    .line 473
    .line 474
    goto :goto_9

    .line 475
    :cond_24
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 476
    .line 477
    .line 478
    move-result-object v6

    .line 479
    invoke-virtual {p1, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    goto :goto_b

    .line 483
    :cond_25
    add-int/lit8 p2, p2, 0x1

    .line 484
    .line 485
    goto :goto_a

    .line 486
    :cond_26
    invoke-virtual {p1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 487
    .line 488
    .line 489
    move-result-object p2

    .line 490
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 491
    .line 492
    .line 493
    move-result-object p2

    .line 494
    :cond_27
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 495
    .line 496
    .line 497
    move-result v4

    .line 498
    if-eqz v4, :cond_21

    .line 499
    .line 500
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v4

    .line 504
    check-cast v4, Ljava/lang/Integer;

    .line 505
    .line 506
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 507
    .line 508
    .line 509
    move-result v5

    .line 510
    if-ge v5, v0, :cond_27

    .line 511
    .line 512
    invoke-virtual {p1, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    check-cast p1, Ljava/lang/Integer;

    .line 517
    .line 518
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 519
    .line 520
    .line 521
    move-result p1

    .line 522
    iput v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪哲兰:I

    .line 523
    .line 524
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰世哲(I)I

    .line 525
    .line 526
    .line 527
    move-result p2

    .line 528
    iput p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪兰哲:I

    .line 529
    .line 530
    goto/16 :goto_e

    .line 531
    .line 532
    :cond_28
    if-ne p2, v6, :cond_30

    .line 533
    .line 534
    if-gez v0, :cond_29

    .line 535
    .line 536
    goto :goto_9

    .line 537
    :cond_29
    if-ne v4, v1, :cond_2a

    .line 538
    .line 539
    goto :goto_9

    .line 540
    :cond_2a
    new-instance p1, Ljava/util/TreeMap;

    .line 541
    .line 542
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 543
    .line 544
    .line 545
    move p2, v2

    .line 546
    :goto_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰楪哲苏()I

    .line 547
    .line 548
    .line 549
    move-result v4

    .line 550
    if-ge p2, v4, :cond_2e

    .line 551
    .line 552
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲世苏兰(I)Ljava/util/HashSet;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    :cond_2b
    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 561
    .line 562
    .line 563
    move-result v5

    .line 564
    if-eqz v5, :cond_2d

    .line 565
    .line 566
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v5

    .line 570
    check-cast v5, Ljava/lang/Integer;

    .line 571
    .line 572
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 573
    .line 574
    .line 575
    move-result v6

    .line 576
    if-gez v6, :cond_2c

    .line 577
    .line 578
    goto/16 :goto_9

    .line 579
    .line 580
    :cond_2c
    invoke-virtual {p1, v5}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v6

    .line 584
    if-nez v6, :cond_2b

    .line 585
    .line 586
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 587
    .line 588
    .line 589
    move-result-object v6

    .line 590
    invoke-virtual {p1, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    goto :goto_d

    .line 594
    :cond_2d
    add-int/lit8 p2, p2, 0x1

    .line 595
    .line 596
    goto :goto_c

    .line 597
    :cond_2e
    invoke-virtual {p1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 598
    .line 599
    .line 600
    move-result-object p2

    .line 601
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 602
    .line 603
    .line 604
    move-result-object p2

    .line 605
    :cond_2f
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 606
    .line 607
    .line 608
    move-result v4

    .line 609
    if-eqz v4, :cond_21

    .line 610
    .line 611
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v4

    .line 615
    check-cast v4, Ljava/lang/Integer;

    .line 616
    .line 617
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 618
    .line 619
    .line 620
    move-result v5

    .line 621
    if-le v5, v0, :cond_2f

    .line 622
    .line 623
    invoke-virtual {p1, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object p1

    .line 627
    check-cast p1, Ljava/lang/Integer;

    .line 628
    .line 629
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 630
    .line 631
    .line 632
    move-result p1

    .line 633
    iput v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪哲兰:I

    .line 634
    .line 635
    iput v2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏世楪兰哲:I

    .line 636
    .line 637
    :cond_30
    :goto_e
    if-eq p1, v3, :cond_36

    .line 638
    .line 639
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子哲世兰苏楪(I)V

    .line 640
    .line 641
    .line 642
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪兰哲世:I

    .line 643
    .line 644
    return v1

    .line 645
    :cond_31
    const v0, 0x1020037

    .line 646
    .line 647
    .line 648
    if-ne p1, v0, :cond_37

    .line 649
    .line 650
    if-eqz p2, :cond_37

    .line 651
    .line 652
    const-string p1, "android.view.accessibility.action.ARGUMENT_ROW_INT"

    .line 653
    .line 654
    invoke-virtual {p2, p1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 655
    .line 656
    .line 657
    move-result p1

    .line 658
    const-string v0, "android.view.accessibility.action.ARGUMENT_COLUMN_INT"

    .line 659
    .line 660
    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 661
    .line 662
    .line 663
    move-result p2

    .line 664
    if-eq p1, v3, :cond_36

    .line 665
    .line 666
    if-ne p2, v3, :cond_32

    .line 667
    .line 668
    goto :goto_11

    .line 669
    :cond_32
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 670
    .line 671
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 672
    .line 673
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰()I

    .line 674
    .line 675
    .line 676
    move-result v0

    .line 677
    move v4, v2

    .line 678
    :goto_f
    if-ge v4, v0, :cond_35

    .line 679
    .line 680
    iget-object v5, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 681
    .line 682
    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;

    .line 683
    .line 684
    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲世楪:Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;

    .line 685
    .line 686
    invoke-virtual {p0, v4, v6, v5}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲兰世苏(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 687
    .line 688
    .line 689
    move-result v5

    .line 690
    iget-object v6, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 691
    .line 692
    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;

    .line 693
    .line 694
    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲世楪:Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;

    .line 695
    .line 696
    invoke-virtual {p0, v4, v7, v6}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲苏兰世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 697
    .line 698
    .line 699
    move-result v6

    .line 700
    iget v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 701
    .line 702
    if-ne v7, v1, :cond_33

    .line 703
    .line 704
    if-ne v5, p2, :cond_34

    .line 705
    .line 706
    if-ne v6, p1, :cond_34

    .line 707
    .line 708
    goto :goto_10

    .line 709
    :cond_33
    if-ne v5, p1, :cond_34

    .line 710
    .line 711
    if-ne v6, p2, :cond_34

    .line 712
    .line 713
    goto :goto_10

    .line 714
    :cond_34
    add-int/lit8 v4, v4, 0x1

    .line 715
    .line 716
    goto :goto_f

    .line 717
    :cond_35
    move v4, v3

    .line 718
    :goto_10
    if-le v4, v3, :cond_36

    .line 719
    .line 720
    invoke-virtual {p0, v4, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世哲苏兰(II)V

    .line 721
    .line 722
    .line 723
    return v1

    .line 724
    :cond_36
    :goto_11
    return v2

    .line 725
    :cond_37
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子哲楪苏世兰(ILandroid/os/Bundle;)Z

    .line 726
    .line 727
    .line 728
    move-result p0

    .line 729
    return p0
.end method

.method public final 飘花落叶言子哲苏世兰楪(Landroid/graphics/Rect;II)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲苏楪:[I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲苏世兰楪(Landroid/graphics/Rect;II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingLeft()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingRight()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr v1, v0

    .line 17
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingTop()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingBottom()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr v2, v0

    .line 26
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    if-ne v0, v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    add-int/2addr p1, v2

    .line 36
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    sget-object v2, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {p3, p1, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世苏哲(III)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲苏楪:[I

    .line 49
    .line 50
    array-length v0, p3

    .line 51
    sub-int/2addr v0, v3

    .line 52
    aget p3, p3, v0

    .line 53
    .line 54
    add-int/2addr p3, v1

    .line 55
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getMinimumWidth()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-static {p2, p3, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世苏哲(III)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    add-int/2addr p1, v1

    .line 71
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    sget-object v1, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/view/View;->getMinimumWidth()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {p2, p1, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世苏哲(III)I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲苏楪:[I

    .line 84
    .line 85
    array-length v0, p1

    .line 86
    sub-int/2addr v0, v3

    .line 87
    aget p1, p1, v0

    .line 88
    .line 89
    add-int/2addr p1, v2

    .line 90
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-static {p3, p1, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世苏哲(III)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    :goto_0
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 101
    .line 102
    invoke-static {p0, p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪苏哲世兰(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final 飘花落叶言子哲苏楪世兰(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子兰苏哲世()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏哲兰世()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子哲苏楪世兰(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final 飘花落叶言子楪兰哲世苏(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪苏哲世(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子楪兰哲苏世(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪哲世苏(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子楪哲兰苏世(Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子苏世兰楪哲(Landroid/view/View;ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)Landroid/view/View;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    move-object/from16 v5, p1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object/from16 v5, p1

    .line 16
    .line 17
    invoke-virtual {v3, v5}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世苏楪兰哲(Landroid/view/View;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v6, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;

    .line 25
    .line 26
    iget-object v6, v6, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-eqz v6, :cond_2

    .line 35
    .line 36
    :goto_0
    move-object v3, v4

    .line 37
    :cond_2
    if-nez v3, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    check-cast v6, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 45
    .line 46
    iget v7, v6, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:I

    .line 47
    .line 48
    iget v6, v6, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏世哲:I

    .line 49
    .line 50
    add-int/2addr v6, v7

    .line 51
    invoke-super/range {p0 .. p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子苏世兰楪哲(Landroid/view/View;ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    if-nez v5, :cond_4

    .line 56
    .line 57
    :goto_1
    return-object v4

    .line 58
    :cond_4
    move/from16 v5, p2

    .line 59
    .line 60
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪哲苏世(I)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    const/4 v9, 0x1

    .line 65
    if-ne v5, v9, :cond_5

    .line 66
    .line 67
    move v5, v9

    .line 68
    goto :goto_2

    .line 69
    :cond_5
    const/4 v5, 0x0

    .line 70
    :goto_2
    iget-boolean v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 71
    .line 72
    const/4 v11, -0x1

    .line 73
    if-eq v5, v10, :cond_6

    .line 74
    .line 75
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    sub-int/2addr v5, v9

    .line 80
    move v10, v11

    .line 81
    move v12, v10

    .line 82
    goto :goto_3

    .line 83
    :cond_6
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    move v10, v5

    .line 88
    move v12, v9

    .line 89
    const/4 v5, 0x0

    .line 90
    :goto_3
    iget v13, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 91
    .line 92
    if-ne v13, v9, :cond_7

    .line 93
    .line 94
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲楪苏世()Z

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    if-eqz v13, :cond_7

    .line 99
    .line 100
    move v13, v9

    .line 101
    goto :goto_4

    .line 102
    :cond_7
    const/4 v13, 0x0

    .line 103
    :goto_4
    invoke-virtual {v0, v5, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲苏兰世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 104
    .line 105
    .line 106
    move-result v14

    .line 107
    move-object/from16 v16, v4

    .line 108
    .line 109
    move v8, v11

    .line 110
    move v15, v8

    .line 111
    const/4 v9, 0x0

    .line 112
    move v11, v5

    .line 113
    const/4 v4, 0x0

    .line 114
    move-object/from16 v5, v16

    .line 115
    .line 116
    :goto_5
    move-object/from16 v17, v5

    .line 117
    .line 118
    if-eq v11, v10, :cond_18

    .line 119
    .line 120
    invoke-virtual {v0, v11, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲苏兰世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    if-ne v1, v3, :cond_8

    .line 129
    .line 130
    goto/16 :goto_c

    .line 131
    .line 132
    :cond_8
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 133
    .line 134
    .line 135
    move-result v18

    .line 136
    if-eqz v18, :cond_a

    .line 137
    .line 138
    if-eq v5, v14, :cond_a

    .line 139
    .line 140
    if-eqz v16, :cond_9

    .line 141
    .line 142
    goto/16 :goto_c

    .line 143
    .line 144
    :cond_9
    move-object/from16 v18, v3

    .line 145
    .line 146
    move/from16 v19, v9

    .line 147
    .line 148
    move/from16 v21, v10

    .line 149
    .line 150
    goto/16 :goto_a

    .line 151
    .line 152
    :cond_a
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    check-cast v5, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 157
    .line 158
    iget v2, v5, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:I

    .line 159
    .line 160
    move-object/from16 v18, v3

    .line 161
    .line 162
    iget v3, v5, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏世哲:I

    .line 163
    .line 164
    add-int/2addr v3, v2

    .line 165
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 166
    .line 167
    .line 168
    move-result v19

    .line 169
    if-eqz v19, :cond_b

    .line 170
    .line 171
    if-ne v2, v7, :cond_b

    .line 172
    .line 173
    if-ne v3, v6, :cond_b

    .line 174
    .line 175
    return-object v1

    .line 176
    :cond_b
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 177
    .line 178
    .line 179
    move-result v19

    .line 180
    if-eqz v19, :cond_c

    .line 181
    .line 182
    if-eqz v16, :cond_d

    .line 183
    .line 184
    :cond_c
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 185
    .line 186
    .line 187
    move-result v19

    .line 188
    if-nez v19, :cond_e

    .line 189
    .line 190
    if-nez v17, :cond_e

    .line 191
    .line 192
    :cond_d
    move/from16 v19, v9

    .line 193
    .line 194
    move/from16 v21, v10

    .line 195
    .line 196
    goto :goto_9

    .line 197
    :cond_e
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    .line 198
    .line 199
    .line 200
    move-result v19

    .line 201
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 202
    .line 203
    .line 204
    move-result v20

    .line 205
    move/from16 v21, v10

    .line 206
    .line 207
    sub-int v10, v20, v19

    .line 208
    .line 209
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 210
    .line 211
    .line 212
    move-result v19

    .line 213
    if-eqz v19, :cond_12

    .line 214
    .line 215
    if-le v10, v9, :cond_f

    .line 216
    .line 217
    :goto_6
    move/from16 v19, v9

    .line 218
    .line 219
    goto :goto_9

    .line 220
    :cond_f
    if-ne v10, v9, :cond_11

    .line 221
    .line 222
    if-le v2, v15, :cond_10

    .line 223
    .line 224
    const/4 v10, 0x1

    .line 225
    goto :goto_7

    .line 226
    :cond_10
    const/4 v10, 0x0

    .line 227
    :goto_7
    if-ne v13, v10, :cond_11

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_11
    move/from16 v19, v9

    .line 231
    .line 232
    goto :goto_a

    .line 233
    :cond_12
    if-nez v16, :cond_11

    .line 234
    .line 235
    move/from16 v19, v9

    .line 236
    .line 237
    iget-object v9, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;

    .line 238
    .line 239
    invoke-virtual {v9, v1}, Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪苏兰世哲(Landroid/view/View;)Z

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    if-eqz v9, :cond_13

    .line 244
    .line 245
    iget-object v9, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世苏哲:Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;

    .line 246
    .line 247
    invoke-virtual {v9, v1}, Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪苏兰世哲(Landroid/view/View;)Z

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    if-eqz v9, :cond_13

    .line 252
    .line 253
    goto :goto_a

    .line 254
    :cond_13
    if-le v10, v4, :cond_14

    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_14
    if-ne v10, v4, :cond_17

    .line 258
    .line 259
    if-le v2, v8, :cond_15

    .line 260
    .line 261
    const/4 v9, 0x1

    .line 262
    goto :goto_8

    .line 263
    :cond_15
    const/4 v9, 0x0

    .line 264
    :goto_8
    if-ne v13, v9, :cond_17

    .line 265
    .line 266
    :goto_9
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 267
    .line 268
    .line 269
    move-result v9

    .line 270
    iget v5, v5, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:I

    .line 271
    .line 272
    if-eqz v9, :cond_16

    .line 273
    .line 274
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    sub-int v9, v3, v2

    .line 283
    .line 284
    move-object/from16 v16, v1

    .line 285
    .line 286
    move v15, v5

    .line 287
    move-object/from16 v5, v17

    .line 288
    .line 289
    goto :goto_b

    .line 290
    :cond_16
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    sub-int v4, v3, v2

    .line 299
    .line 300
    move v8, v5

    .line 301
    move/from16 v9, v19

    .line 302
    .line 303
    move-object v5, v1

    .line 304
    goto :goto_b

    .line 305
    :cond_17
    :goto_a
    move-object/from16 v5, v17

    .line 306
    .line 307
    move/from16 v9, v19

    .line 308
    .line 309
    :goto_b
    add-int/2addr v11, v12

    .line 310
    move-object/from16 v1, p3

    .line 311
    .line 312
    move-object/from16 v2, p4

    .line 313
    .line 314
    move-object/from16 v3, v18

    .line 315
    .line 316
    move/from16 v10, v21

    .line 317
    .line 318
    goto/16 :goto_5

    .line 319
    .line 320
    :cond_18
    :goto_c
    if-eqz v16, :cond_19

    .line 321
    .line 322
    return-object v16

    .line 323
    :cond_19
    return-object v17
.end method

.method public final 飘花落叶言子苏兰世哲楪(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)V
    .locals 7

    .line 1
    iget-boolean v0, p2, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲世兰:Landroid/util/SparseIntArray;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪世兰哲:Landroid/util/SparseIntArray;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v3, v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 25
    .line 26
    iget-object v5, v4, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 27
    .line 28
    invoke-virtual {v5}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getLayoutPosition()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    iget v6, v4, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏世哲:I

    .line 33
    .line 34
    invoke-virtual {v2, v5, v6}, Landroid/util/SparseIntArray;->put(II)V

    .line 35
    .line 36
    .line 37
    iget v4, v4, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:I

    .line 38
    .line 39
    invoke-virtual {v1, v5, v4}, Landroid/util/SparseIntArray;->put(II)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子苏兰世哲楪(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/util/SparseIntArray;->clear()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/util/SparseIntArray;->clear()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final 飘花落叶言子苏兰世楪哲(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 7
    .line 8
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final 飘花落叶言子苏兰哲楪世(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子苏兰哲楪世(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰苏哲楪:Z

    .line 6
    .line 7
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪兰哲世:I

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世楪兰苏哲(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/high16 v1, 0x4000000

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 21
    .line 22
    .line 23
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪兰哲世:I

    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子苏兰楪世哲(II)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 7
    .line 8
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final 飘花落叶言子苏哲世兰楪(II)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 7
    .line 8
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final 飘花落叶言子苏哲世楪兰(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Landroid/view/View;L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p3, p4}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子苏哲楪兰世(Landroid/view/View;L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 14
    .line 15
    iget-object p3, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 16
    .line 17
    invoke-virtual {p3}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getLayoutPosition()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-virtual {p0, p3, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲苏兰世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 26
    .line 27
    iget p2, v0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:I

    .line 28
    .line 29
    iget p3, v0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏世哲:I

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    const/4 v1, 0x1

    .line 33
    if-nez p0, :cond_1

    .line 34
    .line 35
    invoke-static {v0, p2, p3, p1, v1}, L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(ZIIII)L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p4, p0}, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    invoke-static {v0, p1, v1, p2, p3}, L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(ZIIII)L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p4, p0}, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final 飘花落叶言子苏哲兰世楪(II)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 7
    .line 8
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final 飘花落叶言子苏哲兰楪世()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 7
    .line 8
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final 飘花落叶言子苏哲楪世兰(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子苏哲楪世兰(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;)V

    .line 2
    .line 3
    .line 4
    const-class p1, Landroid/widget/GridView;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p3, p1}, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 p1, 0x1

    .line 24
    if-le p0, p1, :cond_0

    .line 25
    .line 26
    sget-object p0, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世哲苏兰;

    .line 27
    .line 28
    invoke-virtual {p3, p0}, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世哲苏兰;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final 飘花落叶言楪子世兰苏哲(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世兰苏哲(Z)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p0, "GridLayoutManager does not support stack from end. Consider using reverse layout"

    .line 9
    .line 10
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final 飘花落叶言楪子兰世哲苏(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰苏哲楪:Z

    .line 8
    .line 9
    if-lt p1, v0, :cond_1

    .line 10
    .line 11
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世苏兰楪()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    const-string p0, "Span count should be at least 1. Provided "

    .line 23
    .line 24
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final 飘花落叶言楪子兰世苏哲(Landroid/view/View;IZ)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲兰世苏:Landroid/graphics/Rect;

    .line 8
    .line 9
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 10
    .line 11
    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    .line 12
    .line 13
    add-int/2addr v2, v3

    .line 14
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 15
    .line 16
    add-int/2addr v2, v3

    .line 17
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 18
    .line 19
    add-int/2addr v2, v3

    .line 20
    iget v3, v1, Landroid/graphics/Rect;->left:I

    .line 21
    .line 22
    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 23
    .line 24
    add-int/2addr v3, v1

    .line 25
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 26
    .line 27
    add-int/2addr v3, v1

    .line 28
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 29
    .line 30
    add-int/2addr v3, v1

    .line 31
    iget v1, v0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:I

    .line 32
    .line 33
    iget v4, v0, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏世哲:I

    .line 34
    .line 35
    invoke-virtual {p0, v1, v4}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲苏世兰(II)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x1

    .line 43
    if-ne v4, v6, :cond_0

    .line 44
    .line 45
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 46
    .line 47
    invoke-static {v5, v1, p2, v3, v4}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏兰楪哲(ZIIII)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 52
    .line 53
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰哲世()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget v3, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世楪哲兰苏:I

    .line 58
    .line 59
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 60
    .line 61
    invoke-static {v6, v1, v3, v2, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏兰楪哲(ZIIII)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 67
    .line 68
    invoke-static {v5, v1, p2, v2, v4}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏兰楪哲(ZIIII)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 73
    .line 74
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰哲世()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iget v2, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世楪哲苏兰:I

    .line 79
    .line 80
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 81
    .line 82
    invoke-static {v6, v1, v2, v3, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏兰楪哲(ZIIII)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    move v7, v0

    .line 87
    move v0, p2

    .line 88
    move p2, v7

    .line 89
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 94
    .line 95
    if-eqz p3, :cond_1

    .line 96
    .line 97
    invoke-virtual {p0, p1, p2, v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲兰世楪苏(Landroid/view/View;IILandroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {p0, p1, p2, v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲兰楪世苏(Landroid/view/View;IILandroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    :goto_1
    if-eqz p0, :cond_2

    .line 107
    .line 108
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    .line 109
    .line 110
    .line 111
    :cond_2
    return-void
.end method

.method public 飘花落叶言楪子兰苏世哲(L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰哲苏;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    return-void
.end method

.method public final 飘花落叶言楪子兰苏哲世()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世楪兰苏哲:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingRight()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sub-int/2addr v0, v1

    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingLeft()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    :goto_0
    sub-int/2addr v0, v1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世楪兰哲苏:I

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingBottom()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sub-int/2addr v0, v1

    .line 26
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingTop()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    goto :goto_0

    .line 31
    :goto_1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏哲世兰(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final 飘花落叶言楪子哲世兰苏(II)Ljava/util/HashSet;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;

    .line 9
    .line 10
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲世楪:Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;

    .line 11
    .line 12
    invoke-virtual {p0, p2, v2, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲兰苏世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    move p2, p1

    .line 17
    :goto_0
    add-int v1, p1, p0

    .line 18
    .line 19
    if-ge p2, v1, :cond_0

    .line 20
    .line 21
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 p2, p2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v0
.end method

.method public final 飘花落叶言楪子哲世苏兰(I)Ljava/util/HashSet;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子苏兰哲世(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲世兰苏(II)Ljava/util/HashSet;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final 飘花落叶言楪子哲兰世苏(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 1

    .line 1
    iget-boolean p3, p3, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 6
    .line 7
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 8
    .line 9
    invoke-virtual {p2, p1, p0}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲(II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    iget-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲世兰:Landroid/util/SparseIntArray;

    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    invoke-virtual {p3, p1, v0}, Landroid/util/SparseIntArray;->get(II)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eq p3, v0, :cond_1

    .line 22
    .line 23
    return p3

    .line 24
    :cond_1
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲(I)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-ne p2, v0, :cond_2

    .line 29
    .line 30
    new-instance p0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string p2, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"

    .line 33
    .line 34
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string p1, "GridLayoutManager"

    .line 45
    .line 46
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return p0

    .line 51
    :cond_2
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 52
    .line 53
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 54
    .line 55
    invoke-virtual {p1, p2, p0}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲(II)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    return p0
.end method

.method public final 飘花落叶言楪子哲兰苏世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 1

    .line 1
    iget-boolean p3, p3, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    iget-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪世兰哲:Landroid/util/SparseIntArray;

    .line 13
    .line 14
    const/4 v0, -0x1

    .line 15
    invoke-virtual {p3, p1, v0}, Landroid/util/SparseIntArray;->get(II)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    if-eq p3, v0, :cond_1

    .line 20
    .line 21
    return p3

    .line 22
    :cond_1
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲(I)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-ne p2, v0, :cond_2

    .line 27
    .line 28
    new-instance p0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string p2, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"

    .line 31
    .line 32
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string p1, "GridLayoutManager"

    .line 43
    .line 44
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :cond_2
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 50
    .line 51
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰(I)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    return p0
.end method

.method public final 飘花落叶言楪子哲苏世兰(II)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲楪苏世()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲苏楪:[I

    .line 13
    .line 14
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 15
    .line 16
    sub-int v1, p0, p1

    .line 17
    .line 18
    aget v1, v0, v1

    .line 19
    .line 20
    sub-int/2addr p0, p1

    .line 21
    sub-int/2addr p0, p2

    .line 22
    aget p0, v0, p0

    .line 23
    .line 24
    sub-int/2addr v1, p0

    .line 25
    return v1

    .line 26
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲苏楪:[I

    .line 27
    .line 28
    add-int/2addr p2, p1

    .line 29
    aget p2, p0, p2

    .line 30
    .line 31
    aget p0, p0, p1

    .line 32
    .line 33
    sub-int/2addr p2, p0

    .line 34
    return p2
.end method

.method public final 飘花落叶言楪子哲苏兰世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 0

    .line 1
    iget-boolean p3, p3, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 6
    .line 7
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 8
    .line 9
    invoke-virtual {p2, p1, p0}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰(II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    const/4 p3, -0x1

    .line 19
    if-ne p2, p3, :cond_1

    .line 20
    .line 21
    new-instance p0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string p2, "Cannot find span size for pre layout position. "

    .line 24
    .line 25
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p1, "GridLayoutManager"

    .line 36
    .line 37
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 43
    .line 44
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 45
    .line 46
    invoke-virtual {p1, p2, p0}, Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰(II)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0
.end method

.method public final 飘花落叶言楪子苏兰世哲(I)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;

    .line 8
    .line 9
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲世楪:Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲苏兰世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;

    .line 17
    .line 18
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲世楪:Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;

    .line 19
    .line 20
    invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲兰世苏(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public final 飘花落叶言楪子苏兰哲世(I)I
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v2, :cond_0

    .line 7
    .line 8
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;

    .line 9
    .line 10
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲世楪:Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲苏兰世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;

    .line 18
    .line 19
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲世楪:Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;

    .line 20
    .line 21
    invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子哲兰世苏(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method public final 飘花落叶言楪子苏哲世兰(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲苏楪:[I

    .line 2
    .line 3
    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    array-length v3, v0

    .line 9
    add-int/lit8 v4, v1, 0x1

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    array-length v3, v0

    .line 14
    sub-int/2addr v3, v2

    .line 15
    aget v3, v0, v3

    .line 16
    .line 17
    if-eq v3, p1, :cond_1

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v0, v1, 0x1

    .line 20
    .line 21
    new-array v0, v0, [I

    .line 22
    .line 23
    :cond_1
    const/4 v3, 0x0

    .line 24
    aput v3, v0, v3

    .line 25
    .line 26
    div-int v4, p1, v1

    .line 27
    .line 28
    rem-int/2addr p1, v1

    .line 29
    move v5, v3

    .line 30
    :goto_0
    if-gt v2, v1, :cond_3

    .line 31
    .line 32
    add-int/2addr v3, p1

    .line 33
    if-lez v3, :cond_2

    .line 34
    .line 35
    sub-int v6, v1, v3

    .line 36
    .line 37
    if-ge v6, p1, :cond_2

    .line 38
    .line 39
    add-int/lit8 v6, v4, 0x1

    .line 40
    .line 41
    sub-int/2addr v3, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move v6, v4

    .line 44
    :goto_1
    add-int/2addr v5, v6

    .line 45
    aput v5, v0, v2

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲苏楪:[I

    .line 51
    .line 52
    return-void
.end method

.method public final 飘花落叶言楪子苏哲兰世()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪世哲兰:[Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    return-void

    .line 12
    :cond_1
    :goto_0
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 13
    .line 14
    new-array v0, v0, [Landroid/view/View;

    .line 15
    .line 16
    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪世哲兰:[Landroid/view/View;

    .line 17
    .line 18
    return-void
.end method
