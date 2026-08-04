.class public Landroidx/recyclerview/widget/GridLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛷᛴᛴᲁ:Ljava/util/Set;


# instance fields
.field public final ᛱᛸᲁᲇ:Lyyds/ᲀᲈᛶᲈ;

.field public final ᛲᛱᲁᛳ:Landroid/util/SparseIntArray;

.field public ᛲᲀᛵᛷ:I

.field public ᛶᲀᲈᲇ:I

.field public ᛷᛶᛷᲀ:[I

.field public ᛷᲇᛲᛱ:[Landroid/view/View;

.field public final ᛸᛴᛵᛶ:Landroid/graphics/Rect;

.field public ᲀᛲᛱᛱ:Z

.field public ᲀᛴᲁᲈ:I

.field public ᲁᛶᛴᛸ:I

.field public final ᲈᛷᲈᛶ:Landroid/util/SparseIntArray;


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
    sput-object v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛴᛴᲁ:Ljava/util/Set;

    .line 43
    .line 44
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    const/4 v0, 0x1

    .line 56
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    const/4 v0, 0x0

    .line 57
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛲᛱᛱ:Z

    const/4 v0, -0x1

    .line 58
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 59
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲈᛷᲈᛶ:Landroid/util/SparseIntArray;

    .line 60
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᛱᲁᛳ:Landroid/util/SparseIntArray;

    .line 61
    new-instance v1, Lyyds/ᲀᲈᛶᲈ;

    const/16 v2, 0x1a

    .line 62
    invoke-direct {v1, v2}, Lyyds/ᲀᲈᛶᲈ;-><init>(I)V

    .line 63
    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᛶᲈ;

    .line 64
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛸᛴᛵᛶ:Landroid/graphics/Rect;

    .line 65
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲁᛶᛴᛸ:I

    .line 66
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛶᲀᲈᲇ:I

    .line 67
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲀᛵᛷ:I

    .line 68
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛸᛴᛷᛵ(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛲᛱᛱ:Z

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseIntArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲈᛷᲈᛶ:Landroid/util/SparseIntArray;

    .line 16
    .line 17
    new-instance v1, Landroid/util/SparseIntArray;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᛱᲁᛳ:Landroid/util/SparseIntArray;

    .line 23
    .line 24
    new-instance v1, Lyyds/ᲀᲈᛶᲈ;

    .line 25
    .line 26
    const/16 v2, 0x1a

    .line 27
    .line 28
    invoke-direct {v1, v2}, Lyyds/ᲀᲈᛶᲈ;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᛶᲈ;

    .line 32
    .line 33
    new-instance v1, Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛸᛴᛵᛶ:Landroid/graphics/Rect;

    .line 39
    .line 40
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲁᛶᛴᛸ:I

    .line 41
    .line 42
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛶᲀᲈᲇ:I

    .line 43
    .line 44
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲀᛵᛷ:I

    .line 45
    .line 46
    invoke-static {p1, p2, p3, p4}, Lyyds/ᲇᲇᛵᛲ;->ᛲᛱᲁᛳ(Landroid/content/Context;Landroid/util/AttributeSet;II)Lyyds/ᲇᲁᲇᛶ;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget p1, p1, Lyyds/ᲇᲁᲇᛶ;->ᛵᛸᛸᛷ:I

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛸᛴᛷᛵ(I)V

    .line 53
    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Lyyds/ᲈᛳᲇᛲ;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲁᛸᛲᲈ(Lyyds/ᲈᛳᲇᛲ;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final ᛱᛵᛳᛳ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᲀᛱᲁ()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛴᛵᛴᲈ()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛱᛵᛳᛳ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final ᛱᛸᲁᲇ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛸᛸᛷᛱ()I

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
    invoke-virtual {p2}, Lyyds/ᲈᛳᲇᛲ;->ᛵᛸᛸᛷ()I

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
    invoke-virtual {p2}, Lyyds/ᲈᛳᲇᛲ;->ᛵᛸᛸᛷ()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sub-int/2addr v0, v1

    .line 30
    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲈᲀᛵ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v1

    .line 35
    return p0
.end method

.method public final ᛱᲀᛱᲁ()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛱᛳᲇ:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᛶᛷᲀ()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sub-int/2addr v0, v1

    .line 13
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛴᲁᲈ()I

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
    iget v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛳᲁᲁᲇ:I

    .line 20
    .line 21
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛲᛱᛱ()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sub-int/2addr v0, v1

    .line 26
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᲇᛲᛱ()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    goto :goto_0

    .line 31
    :goto_1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᲈᛶᛷ(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final ᛱᲈᛶᛷ(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛶᛷᲀ:[I

    .line 2
    .line 3
    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

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
    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛶᛷᲀ:[I

    .line 51
    .line 52
    return-void
.end method

.method public final ᛲᛱᛵᛱ()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᲀᛵᛸ:Lyyds/ᛶᛱᲇᛲ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛲᛱᛱ:Z

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

.method public final ᛲᛳᛲᛲ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I
    .locals 2

    .line 1
    iget-boolean p3, p3, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᛶᲈ;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲈᛷᲈᛶ:Landroid/util/SparseIntArray;

    .line 13
    .line 14
    const/4 p3, -0x1

    .line 15
    invoke-virtual {p0, p1, p3}, Landroid/util/SparseIntArray;->get(II)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eq p0, p3, :cond_1

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    invoke-virtual {p2, p1}, Lyyds/ᲈᲈᲁᛱ;->ᛵᛸᛸᛷ(I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-ne p0, p3, :cond_2

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
    return v1

    .line 48
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    return v1
.end method

.method public final ᛲᛳᛵᛱ(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᛶᲈ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᲀᲈᛶᲈ;->ᲀᛲᛲᲇ()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᲀᲈᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final ᛲᛶᛱᲈ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛸᛸᛷᛱ()I

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
    invoke-virtual {p2}, Lyyds/ᲈᛳᲇᛲ;->ᛵᛸᛸᛷ()I

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
    invoke-virtual {p2}, Lyyds/ᲈᛳᲇᛲ;->ᛵᛸᛸᛷ()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sub-int/2addr v0, v1

    .line 30
    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲈᲀᛵ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v1

    .line 35
    return p0
.end method

.method public final ᛲᲁᛲᛸ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;ZZ)Landroid/view/View;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᲀᲁ()I

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
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᲀᲁ()I

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
    invoke-virtual {p2}, Lyyds/ᲈᛳᲇᛲ;->ᛵᛸᛸᛷ()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲈᛵᛶᛲ()V

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 28
    .line 29
    invoke-virtual {v2}, Lyyds/ᛲᛵᲀᛳ;->ᛲᛲᲈᲈ()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 34
    .line 35
    invoke-virtual {v3}, Lyyds/ᛲᛵᲀᛳ;->ᛲᛳᛶᲁ()I

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
    invoke-virtual {p0, p3}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-static {v6}, Lyyds/ᲇᲇᛵᛲ;->ᲈᛷᲈᛶ(Landroid/view/View;)I

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
    invoke-virtual {p0, v7, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲈᲈᛱᲀ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

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
    check-cast v7, Lyyds/ᲇᲁᛲᲀ;

    .line 67
    .line 68
    iget-object v7, v7, Lyyds/ᲇᲁᛲᲀ;->ᛲᲈᲁ:Lyyds/ᛱᛸᛳᛵ;

    .line 69
    .line 70
    invoke-virtual {v7}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ()Z

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
    iget-object v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 81
    .line 82
    invoke-virtual {v7, v6}, Lyyds/ᛲᛵᲀᛳ;->ᛶᛷᛲᲁ(Landroid/view/View;)I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-ge v7, v3, :cond_4

    .line 87
    .line 88
    iget-object v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 89
    .line 90
    invoke-virtual {v7, v6}, Lyyds/ᛲᛵᲀᛳ;->ᲇᲈᛵᛷ(Landroid/view/View;)I

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

.method public final ᛲᲈᛷᛳ(II)Ljava/util/HashSet;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 7
    .line 8
    iget-object v2, v1, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲈᲁᛱ;

    .line 9
    .line 10
    iget-object v1, v1, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 11
    .line 12
    invoke-virtual {p0, p2, v2, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᛳᛲᛲ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

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

.method public final ᛲᲈᲀᛲ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;Lyyds/ᛶᲁᲀᲀ;I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᲀᛱᲁ()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lyyds/ᲈᛳᲇᛲ;->ᛵᛸᛸᛷ()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_3

    .line 9
    .line 10
    iget-boolean v0, p2, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

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
    iget v1, p3, Lyyds/ᛶᲁᲀᲀ;->ᛵᛸᛸᛷ:I

    .line 21
    .line 22
    invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲈᲈᛱᲀ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

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
    iget p4, p3, Lyyds/ᛶᲁᲀᲀ;->ᛵᛸᛸᛷ:I

    .line 31
    .line 32
    if-lez p4, :cond_3

    .line 33
    .line 34
    add-int/lit8 p4, p4, -0x1

    .line 35
    .line 36
    iput p4, p3, Lyyds/ᛶᲁᲀᲀ;->ᛵᛸᛸᛷ:I

    .line 37
    .line 38
    invoke-virtual {p0, p4, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲈᲈᛱᲀ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {p2}, Lyyds/ᲈᛳᲇᛲ;->ᛵᛸᛸᛷ()I

    .line 44
    .line 45
    .line 46
    move-result p4

    .line 47
    sub-int/2addr p4, v0

    .line 48
    iget v0, p3, Lyyds/ᛶᲁᲀᲀ;->ᛵᛸᛸᛷ:I

    .line 49
    .line 50
    :goto_2
    if-ge v0, p4, :cond_2

    .line 51
    .line 52
    add-int/lit8 v2, v0, 0x1

    .line 53
    .line 54
    invoke-virtual {p0, v2, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲈᲈᛱᲀ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

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
    iput v0, p3, Lyyds/ᛶᲁᲀᲀ;->ᛵᛸᛸᛷ:I

    .line 64
    .line 65
    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛴᛵᛴᲈ()V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final ᛲᲈᲀᛵ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I
    .locals 1

    .line 1
    iget-boolean p3, p3, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᛶᲈ;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p0}, Lyyds/ᲀᲈᛶᲈ;->ᲇᛱᛲ(II)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    invoke-virtual {p2, p1}, Lyyds/ᲈᲈᲁᛱ;->ᛵᛸᛸᛷ(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    const/4 p3, -0x1

    .line 22
    if-ne p2, p3, :cond_1

    .line 23
    .line 24
    new-instance p0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string p2, "Cannot find span size for pre layout position. "

    .line 27
    .line 28
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string p1, "GridLayoutManager"

    .line 39
    .line 40
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_1
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {p2, p0}, Lyyds/ᲀᲈᛶᲈ;->ᲇᛱᛲ(II)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0
.end method

.method public final ᛳᛴᲇᛶ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;Landroid/view/View;Lyyds/ᛱᛵᲈᛸ;)V
    .locals 9

    .line 1
    iget-object v0, p4, Lyyds/ᛱᛵᲈᛸ;->ᛲᲈᲁ:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v2, v1, Lyyds/ᛲᛶᛴᛶ;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p3, p4}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛵᛸᛲ(Landroid/view/View;Lyyds/ᛱᛵᲈᛸ;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    check-cast v1, Lyyds/ᛲᛶᛴᛶ;

    .line 16
    .line 17
    iget-object p3, v1, Lyyds/ᲇᲁᛲᲀ;->ᛲᲈᲁ:Lyyds/ᛱᛸᛳᛵ;

    .line 18
    .line 19
    invoke-virtual {p3}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ()I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    invoke-virtual {p0, p3, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲈᲀᛵ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 28
    .line 29
    iget v4, v1, Lyyds/ᛲᛶᛴᛶ;->ᛲᛴᛳᛲ:I

    .line 30
    .line 31
    iget v3, v1, Lyyds/ᛲᛶᛴᛶ;->ᲇᲇᲇᛱ:I

    .line 32
    .line 33
    if-nez p0, :cond_1

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v5, 0x1

    .line 38
    move v8, v4

    .line 39
    move v4, v2

    .line 40
    move v2, v8

    .line 41
    invoke-static/range {v2 .. v7}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v0, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    move v5, v3

    .line 52
    const/4 v3, 0x1

    .line 53
    invoke-static/range {v2 .. v7}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {v0, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final ᛳᛷᛶᛲ(Landroid/view/View;ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)Landroid/view/View;
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
    iget-object v3, v0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

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
    invoke-virtual {v3, v5}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛸᛷᛱ(Landroid/view/View;)Landroid/view/View;

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
    iget-object v6, v0, Lyyds/ᲇᲇᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 25
    .line 26
    iget-object v6, v6, Lyyds/ᲈᲇᲀᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

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
    check-cast v6, Lyyds/ᛲᛶᛴᛶ;

    .line 45
    .line 46
    iget v7, v6, Lyyds/ᛲᛶᛴᛶ;->ᛲᛴᛳᛲ:I

    .line 47
    .line 48
    iget v6, v6, Lyyds/ᛲᛶᛴᛶ;->ᲇᲇᲇᛱ:I

    .line 49
    .line 50
    add-int/2addr v6, v7

    .line 51
    invoke-super/range {p0 .. p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛳᛷᛶᛲ(Landroid/view/View;ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)Landroid/view/View;

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
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛷᛶᛱᛸ(I)I

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
    iget-boolean v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛶᲈᛴᲈ:Z

    .line 71
    .line 72
    const/4 v11, -0x1

    .line 73
    if-eq v5, v10, :cond_6

    .line 74
    .line 75
    invoke-virtual {v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᲀᲁ()I

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
    invoke-virtual {v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᲀᲁ()I

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
    iget v13, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 91
    .line 92
    if-ne v13, v9, :cond_7

    .line 93
    .line 94
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛲᛶᛵᛲ()Z

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
    invoke-virtual {v0, v5, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲈᲀᛵ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

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
    invoke-virtual {v0, v11, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲈᲀᛵ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    invoke-virtual {v0, v11}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

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
    check-cast v5, Lyyds/ᛲᛶᛴᛶ;

    .line 157
    .line 158
    iget v2, v5, Lyyds/ᛲᛶᛴᛶ;->ᛲᛴᛳᛲ:I

    .line 159
    .line 160
    move-object/from16 v18, v3

    .line 161
    .line 162
    iget v3, v5, Lyyds/ᛲᛶᛴᛶ;->ᲇᲇᲇᛱ:I

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
    iget-object v9, v0, Lyyds/ᲇᲇᛵᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᛱᛱ;

    .line 238
    .line 239
    invoke-virtual {v9, v1}, Lyyds/ᛱᛵᛱᛱ;->ᲈᲀᛲᲀ(Landroid/view/View;)Z

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    if-eqz v9, :cond_13

    .line 244
    .line 245
    iget-object v9, v0, Lyyds/ᲇᲇᛵᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛵᛱᛱ;

    .line 246
    .line 247
    invoke-virtual {v9, v1}, Lyyds/ᛱᛵᛱᛱ;->ᲈᲀᛲᲀ(Landroid/view/View;)Z

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
    iget v5, v5, Lyyds/ᛲᛶᛴᛶ;->ᛲᛴᛳᛲ:I

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

.method public final ᛳᛸᛴᛶ(Landroid/view/ViewGroup$LayoutParams;)Lyyds/ᲇᲁᛲᲀ;
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
    new-instance p0, Lyyds/ᛲᛶᛴᛶ;

    .line 8
    .line 9
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lyyds/ᲇᲁᛲᲀ;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 12
    .line 13
    .line 14
    iput v1, p0, Lyyds/ᛲᛶᛴᛶ;->ᛲᛴᛳᛲ:I

    .line 15
    .line 16
    iput v0, p0, Lyyds/ᛲᛶᛴᛶ;->ᲇᲇᲇᛱ:I

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p0, Lyyds/ᛲᛶᛴᛶ;

    .line 20
    .line 21
    invoke-direct {p0, p1}, Lyyds/ᲇᲁᛲᲀ;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    iput v1, p0, Lyyds/ᛲᛶᛴᛶ;->ᛲᛴᛳᛲ:I

    .line 25
    .line 26
    iput v0, p0, Lyyds/ᛲᛶᛴᛶ;->ᲇᲇᲇᛱ:I

    .line 27
    .line 28
    return-object p0
.end method

.method public final ᛳᲁᲁᲇ(Lyyds/ᲈᛳᲇᛲ;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛳᛷᛶᛵ(Lyyds/ᲈᛳᲇᛲ;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final ᛴᛵᛴᲈ()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᲇᛲᛱ:[Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

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
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 13
    .line 14
    new-array v0, v0, [Landroid/view/View;

    .line 15
    .line 16
    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᲇᛲᛱ:[Landroid/view/View;

    .line 17
    .line 18
    return-void
.end method

.method public final ᛴᛵᛷᛳ(ILandroid/os/Bundle;)Z
    .locals 11

    .line 1
    sget-object v0, Lyyds/ᛵᛲᛶᲁ;->ᛱᲈᲁ:Lyyds/ᛵᛲᛶᲁ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᛵᛲᛶᲁ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, -0x1

    .line 14
    if-ne p1, v0, :cond_31

    .line 15
    .line 16
    if-eq p1, v3, :cond_31

    .line 17
    .line 18
    move p1, v2

    .line 19
    :goto_0
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᲀᲁ()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ge p1, v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Landroid/view/View;->isAccessibilityFocused()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 p1, 0x0

    .line 44
    :goto_1
    if-nez p1, :cond_2

    .line 45
    .line 46
    goto/16 :goto_11

    .line 47
    .line 48
    :cond_2
    if-nez p2, :cond_3

    .line 49
    .line 50
    goto/16 :goto_11

    .line 51
    .line 52
    :cond_3
    const-string v0, "android.view.accessibility.action.ARGUMENT_DIRECTION_INT"

    .line 53
    .line 54
    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    sget-object v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛴᛴᲁ:Ljava/util/Set;

    .line 59
    .line 60
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_4

    .line 69
    .line 70
    goto/16 :goto_11

    .line 71
    .line 72
    :cond_4
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 73
    .line 74
    invoke-virtual {v0, p1}, Lyyds/ᛵᲇᛲᛱ;->ᛱᛸᲁᲇ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-nez p1, :cond_5

    .line 79
    .line 80
    goto/16 :goto_11

    .line 81
    .line 82
    :cond_5
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᛵᛸᛸᛷ()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛴᲀᛱ(I)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛳᲇᛴ(I)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-ltz v0, :cond_36

    .line 95
    .line 96
    if-gez v4, :cond_6

    .line 97
    .line 98
    goto/16 :goto_11

    .line 99
    .line 100
    :cond_6
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛸᲇᛴ(I)Ljava/util/HashSet;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛶᲀᲈᲇ:I

    .line 105
    .line 106
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-eqz v5, :cond_7

    .line 115
    .line 116
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛳᲇᛴ(I)I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    invoke-virtual {p0, v5, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲈᛷᛳ(II)Ljava/util/HashSet;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    iget v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲀᛵᛷ:I

    .line 125
    .line 126
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-nez v5, :cond_8

    .line 135
    .line 136
    :cond_7
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛶᲀᲈᲇ:I

    .line 137
    .line 138
    iput v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲀᛵᛷ:I

    .line 139
    .line 140
    :cond_8
    iget v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛶᲀᲈᲇ:I

    .line 141
    .line 142
    if-ne v5, v3, :cond_9

    .line 143
    .line 144
    move v5, v0

    .line 145
    :cond_9
    iget v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲀᛵᛷ:I

    .line 146
    .line 147
    if-ne v6, v3, :cond_a

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_a
    move v4, v6

    .line 151
    :goto_2
    const/16 v6, 0x42

    .line 152
    .line 153
    const/16 v7, 0x11

    .line 154
    .line 155
    if-eq p2, v7, :cond_1b

    .line 156
    .line 157
    const/16 v8, 0x21

    .line 158
    .line 159
    if-eq p2, v8, :cond_17

    .line 160
    .line 161
    if-eq p2, v6, :cond_11

    .line 162
    .line 163
    const/16 v8, 0x82

    .line 164
    .line 165
    if-eq p2, v8, :cond_b

    .line 166
    .line 167
    goto/16 :goto_11

    .line 168
    .line 169
    :cond_b
    add-int/2addr p1, v1

    .line 170
    :goto_3
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛸᛸᛷᛱ()I

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-ge p1, v8, :cond_10

    .line 175
    .line 176
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛴᲀᛱ(I)I

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛳᲇᛴ(I)I

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    if-ltz v8, :cond_10

    .line 185
    .line 186
    if-gez v9, :cond_c

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_c
    iget v10, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 190
    .line 191
    if-ne v10, v1, :cond_e

    .line 192
    .line 193
    if-le v8, v5, :cond_f

    .line 194
    .line 195
    if-eq v9, v4, :cond_d

    .line 196
    .line 197
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛳᲇᛴ(I)I

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    invoke-virtual {p0, v9, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲈᛷᛳ(II)Ljava/util/HashSet;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    invoke-virtual {v9, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    if-eqz v9, :cond_f

    .line 214
    .line 215
    :cond_d
    iput v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛶᲀᲈᲇ:I

    .line 216
    .line 217
    goto/16 :goto_8

    .line 218
    .line 219
    :cond_e
    if-le v8, v5, :cond_f

    .line 220
    .line 221
    if-ne v9, v4, :cond_f

    .line 222
    .line 223
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛴᲀᛱ(I)I

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    iput v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛶᲀᲈᲇ:I

    .line 228
    .line 229
    goto/16 :goto_8

    .line 230
    .line 231
    :cond_f
    add-int/lit8 p1, p1, 0x1

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_10
    :goto_4
    move p1, v3

    .line 235
    goto/16 :goto_8

    .line 236
    .line 237
    :cond_11
    add-int/2addr p1, v1

    .line 238
    :goto_5
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛸᛸᛷᛱ()I

    .line 239
    .line 240
    .line 241
    move-result v8

    .line 242
    if-ge p1, v8, :cond_10

    .line 243
    .line 244
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛴᲀᛱ(I)I

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛳᲇᛴ(I)I

    .line 249
    .line 250
    .line 251
    move-result v9

    .line 252
    if-ltz v8, :cond_10

    .line 253
    .line 254
    if-gez v9, :cond_12

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_12
    iget v10, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 258
    .line 259
    if-ne v10, v1, :cond_15

    .line 260
    .line 261
    if-ne v8, v5, :cond_13

    .line 262
    .line 263
    if-gt v9, v4, :cond_14

    .line 264
    .line 265
    :cond_13
    if-le v8, v5, :cond_16

    .line 266
    .line 267
    :cond_14
    iput v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛶᲀᲈᲇ:I

    .line 268
    .line 269
    iput v9, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲀᛵᛷ:I

    .line 270
    .line 271
    goto/16 :goto_8

    .line 272
    .line 273
    :cond_15
    if-le v9, v4, :cond_16

    .line 274
    .line 275
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛸᲇᛴ(I)Ljava/util/HashSet;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v10

    .line 283
    invoke-virtual {v8, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v8

    .line 287
    if-eqz v8, :cond_16

    .line 288
    .line 289
    iput v9, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲀᛵᛷ:I

    .line 290
    .line 291
    goto/16 :goto_8

    .line 292
    .line 293
    :cond_16
    add-int/lit8 p1, p1, 0x1

    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_17
    sub-int/2addr p1, v1

    .line 297
    :goto_6
    if-ltz p1, :cond_10

    .line 298
    .line 299
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛴᲀᛱ(I)I

    .line 300
    .line 301
    .line 302
    move-result v8

    .line 303
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛳᲇᛴ(I)I

    .line 304
    .line 305
    .line 306
    move-result v9

    .line 307
    if-ltz v8, :cond_10

    .line 308
    .line 309
    if-gez v9, :cond_18

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_18
    iget v10, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 313
    .line 314
    if-ne v10, v1, :cond_19

    .line 315
    .line 316
    if-ge v8, v5, :cond_1a

    .line 317
    .line 318
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛳᲇᛴ(I)I

    .line 319
    .line 320
    .line 321
    move-result v9

    .line 322
    invoke-virtual {p0, v9, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲈᛷᛳ(II)Ljava/util/HashSet;

    .line 323
    .line 324
    .line 325
    move-result-object v9

    .line 326
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 327
    .line 328
    .line 329
    move-result-object v10

    .line 330
    invoke-virtual {v9, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v9

    .line 334
    if-eqz v9, :cond_1a

    .line 335
    .line 336
    iput v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛶᲀᲈᲇ:I

    .line 337
    .line 338
    goto :goto_8

    .line 339
    :cond_19
    if-ge v8, v5, :cond_1a

    .line 340
    .line 341
    if-ne v9, v4, :cond_1a

    .line 342
    .line 343
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛸᲇᛴ(I)Ljava/util/HashSet;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    invoke-static {v4}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    check-cast v4, Ljava/lang/Integer;

    .line 352
    .line 353
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 354
    .line 355
    .line 356
    move-result v4

    .line 357
    iput v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛶᲀᲈᲇ:I

    .line 358
    .line 359
    goto :goto_8

    .line 360
    :cond_1a
    add-int/lit8 p1, p1, -0x1

    .line 361
    .line 362
    goto :goto_6

    .line 363
    :cond_1b
    sub-int/2addr p1, v1

    .line 364
    :goto_7
    if-ltz p1, :cond_10

    .line 365
    .line 366
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛴᲀᛱ(I)I

    .line 367
    .line 368
    .line 369
    move-result v8

    .line 370
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛳᲇᛴ(I)I

    .line 371
    .line 372
    .line 373
    move-result v9

    .line 374
    if-ltz v8, :cond_10

    .line 375
    .line 376
    if-gez v9, :cond_1c

    .line 377
    .line 378
    goto/16 :goto_4

    .line 379
    .line 380
    :cond_1c
    iget v10, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 381
    .line 382
    if-ne v10, v1, :cond_1f

    .line 383
    .line 384
    if-ne v8, v5, :cond_1d

    .line 385
    .line 386
    if-lt v9, v4, :cond_1e

    .line 387
    .line 388
    :cond_1d
    if-ge v8, v5, :cond_20

    .line 389
    .line 390
    :cond_1e
    iput v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛶᲀᲈᲇ:I

    .line 391
    .line 392
    iput v9, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲀᛵᛷ:I

    .line 393
    .line 394
    goto :goto_8

    .line 395
    :cond_1f
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛸᲇᛴ(I)Ljava/util/HashSet;

    .line 396
    .line 397
    .line 398
    move-result-object v8

    .line 399
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v10

    .line 403
    invoke-virtual {v8, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v8

    .line 407
    if-eqz v8, :cond_20

    .line 408
    .line 409
    if-ge v9, v4, :cond_20

    .line 410
    .line 411
    iput v9, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲀᛵᛷ:I

    .line 412
    .line 413
    goto :goto_8

    .line 414
    :cond_20
    add-int/lit8 p1, p1, -0x1

    .line 415
    .line 416
    goto :goto_7

    .line 417
    :goto_8
    if-ne p1, v3, :cond_30

    .line 418
    .line 419
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 420
    .line 421
    if-nez v4, :cond_30

    .line 422
    .line 423
    if-ne p2, v7, :cond_28

    .line 424
    .line 425
    if-gez v0, :cond_22

    .line 426
    .line 427
    :cond_21
    :goto_9
    move p1, v3

    .line 428
    goto/16 :goto_e

    .line 429
    .line 430
    :cond_22
    if-ne v4, v1, :cond_23

    .line 431
    .line 432
    goto :goto_9

    .line 433
    :cond_23
    new-instance p1, Ljava/util/TreeMap;

    .line 434
    .line 435
    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    .line 436
    .line 437
    .line 438
    move-result-object p2

    .line 439
    invoke-direct {p1, p2}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 440
    .line 441
    .line 442
    move p2, v2

    .line 443
    :goto_a
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛸᛸᛷᛱ()I

    .line 444
    .line 445
    .line 446
    move-result v4

    .line 447
    if-ge p2, v4, :cond_26

    .line 448
    .line 449
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛸᲇᛴ(I)Ljava/util/HashSet;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v5

    .line 461
    if-eqz v5, :cond_25

    .line 462
    .line 463
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v5

    .line 467
    check-cast v5, Ljava/lang/Integer;

    .line 468
    .line 469
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 470
    .line 471
    .line 472
    move-result v6

    .line 473
    if-gez v6, :cond_24

    .line 474
    .line 475
    goto :goto_9

    .line 476
    :cond_24
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 477
    .line 478
    .line 479
    move-result-object v6

    .line 480
    invoke-virtual {p1, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    goto :goto_b

    .line 484
    :cond_25
    add-int/lit8 p2, p2, 0x1

    .line 485
    .line 486
    goto :goto_a

    .line 487
    :cond_26
    invoke-virtual {p1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 488
    .line 489
    .line 490
    move-result-object p2

    .line 491
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 492
    .line 493
    .line 494
    move-result-object p2

    .line 495
    :cond_27
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    if-eqz v4, :cond_21

    .line 500
    .line 501
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    check-cast v4, Ljava/lang/Integer;

    .line 506
    .line 507
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    if-ge v5, v0, :cond_27

    .line 512
    .line 513
    invoke-virtual {p1, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object p1

    .line 517
    check-cast p1, Ljava/lang/Integer;

    .line 518
    .line 519
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 520
    .line 521
    .line 522
    move-result p1

    .line 523
    iput v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛶᲀᲈᲇ:I

    .line 524
    .line 525
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛳᲇᛴ(I)I

    .line 526
    .line 527
    .line 528
    move-result p2

    .line 529
    iput p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲀᛵᛷ:I

    .line 530
    .line 531
    goto/16 :goto_e

    .line 532
    .line 533
    :cond_28
    if-ne p2, v6, :cond_30

    .line 534
    .line 535
    if-gez v0, :cond_29

    .line 536
    .line 537
    goto :goto_9

    .line 538
    :cond_29
    if-ne v4, v1, :cond_2a

    .line 539
    .line 540
    goto :goto_9

    .line 541
    :cond_2a
    new-instance p1, Ljava/util/TreeMap;

    .line 542
    .line 543
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 544
    .line 545
    .line 546
    move p2, v2

    .line 547
    :goto_c
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛸᛸᛷᛱ()I

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    if-ge p2, v4, :cond_2e

    .line 552
    .line 553
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛸᲇᛴ(I)Ljava/util/HashSet;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 558
    .line 559
    .line 560
    move-result-object v4

    .line 561
    :cond_2b
    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 562
    .line 563
    .line 564
    move-result v5

    .line 565
    if-eqz v5, :cond_2d

    .line 566
    .line 567
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v5

    .line 571
    check-cast v5, Ljava/lang/Integer;

    .line 572
    .line 573
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 574
    .line 575
    .line 576
    move-result v6

    .line 577
    if-gez v6, :cond_2c

    .line 578
    .line 579
    goto/16 :goto_9

    .line 580
    .line 581
    :cond_2c
    invoke-virtual {p1, v5}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v6

    .line 585
    if-nez v6, :cond_2b

    .line 586
    .line 587
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 588
    .line 589
    .line 590
    move-result-object v6

    .line 591
    invoke-virtual {p1, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    goto :goto_d

    .line 595
    :cond_2d
    add-int/lit8 p2, p2, 0x1

    .line 596
    .line 597
    goto :goto_c

    .line 598
    :cond_2e
    invoke-virtual {p1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 599
    .line 600
    .line 601
    move-result-object p2

    .line 602
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 603
    .line 604
    .line 605
    move-result-object p2

    .line 606
    :cond_2f
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 607
    .line 608
    .line 609
    move-result v4

    .line 610
    if-eqz v4, :cond_21

    .line 611
    .line 612
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v4

    .line 616
    check-cast v4, Ljava/lang/Integer;

    .line 617
    .line 618
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 619
    .line 620
    .line 621
    move-result v5

    .line 622
    if-le v5, v0, :cond_2f

    .line 623
    .line 624
    invoke-virtual {p1, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object p1

    .line 628
    check-cast p1, Ljava/lang/Integer;

    .line 629
    .line 630
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 631
    .line 632
    .line 633
    move-result p1

    .line 634
    iput v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛶᲀᲈᲇ:I

    .line 635
    .line 636
    iput v2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲀᛵᛷ:I

    .line 637
    .line 638
    :cond_30
    :goto_e
    if-eq p1, v3, :cond_36

    .line 639
    .line 640
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛵᛷᲀ(I)V

    .line 641
    .line 642
    .line 643
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲁᛶᛴᛸ:I

    .line 644
    .line 645
    return v1

    .line 646
    :cond_31
    const v0, 0x1020037

    .line 647
    .line 648
    .line 649
    if-ne p1, v0, :cond_37

    .line 650
    .line 651
    if-eqz p2, :cond_37

    .line 652
    .line 653
    const-string p1, "android.view.accessibility.action.ARGUMENT_ROW_INT"

    .line 654
    .line 655
    invoke-virtual {p2, p1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 656
    .line 657
    .line 658
    move-result p1

    .line 659
    const-string v0, "android.view.accessibility.action.ARGUMENT_COLUMN_INT"

    .line 660
    .line 661
    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 662
    .line 663
    .line 664
    move-result p2

    .line 665
    if-eq p1, v3, :cond_36

    .line 666
    .line 667
    if-ne p2, v3, :cond_32

    .line 668
    .line 669
    goto :goto_11

    .line 670
    :cond_32
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 671
    .line 672
    iget-object v0, v0, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 673
    .line 674
    invoke-virtual {v0}, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ()I

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    move v4, v2

    .line 679
    :goto_f
    if-ge v4, v0, :cond_35

    .line 680
    .line 681
    iget-object v5, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 682
    .line 683
    iget-object v6, v5, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲈᲁᛱ;

    .line 684
    .line 685
    iget-object v5, v5, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 686
    .line 687
    invoke-virtual {p0, v4, v6, v5}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲈᲈᛱᲀ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 688
    .line 689
    .line 690
    move-result v5

    .line 691
    iget-object v6, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 692
    .line 693
    iget-object v7, v6, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲈᲁᛱ;

    .line 694
    .line 695
    iget-object v6, v6, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 696
    .line 697
    invoke-virtual {p0, v4, v7, v6}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲈᲀᛵ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 698
    .line 699
    .line 700
    move-result v6

    .line 701
    iget v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 702
    .line 703
    if-ne v7, v1, :cond_33

    .line 704
    .line 705
    if-ne v5, p2, :cond_34

    .line 706
    .line 707
    if-ne v6, p1, :cond_34

    .line 708
    .line 709
    goto :goto_10

    .line 710
    :cond_33
    if-ne v5, p1, :cond_34

    .line 711
    .line 712
    if-ne v6, p2, :cond_34

    .line 713
    .line 714
    goto :goto_10

    .line 715
    :cond_34
    add-int/lit8 v4, v4, 0x1

    .line 716
    .line 717
    goto :goto_f

    .line 718
    :cond_35
    move v4, v3

    .line 719
    :goto_10
    if-le v4, v3, :cond_36

    .line 720
    .line 721
    invoke-virtual {p0, v4, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲀᛴᛸᛷ(II)V

    .line 722
    .line 723
    .line 724
    return v1

    .line 725
    :cond_36
    :goto_11
    return v2

    .line 726
    :cond_37
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛴᛵᛷᛳ(ILandroid/os/Bundle;)Z

    .line 727
    .line 728
    .line 729
    move-result p0

    .line 730
    return p0
.end method

.method public final ᛴᛸᲁᛵ(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᛶᲈ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᲀᲈᛶᲈ;->ᲀᛲᛲᲇ()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᲀᲈᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final ᛴᲀᛱ(I)I
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v2, :cond_0

    .line 7
    .line 8
    iget-object v0, v1, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲈᲁᛱ;

    .line 9
    .line 10
    iget-object v1, v1, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲈᲀᛵ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    iget-object v0, v1, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲈᲁᛱ;

    .line 18
    .line 19
    iget-object v1, v1, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 20
    .line 21
    invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲈᲈᛱᲀ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method public final ᛵᛲᛵᲁ()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᛶᲈ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᲀᲈᛶᲈ;->ᲀᛲᛲᲇ()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᲀᲈᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final ᛵᛶᛲᲀ()Lyyds/ᲇᲁᛲᲀ;
    .locals 2

    .line 1
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const/4 v1, -0x2

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Lyyds/ᛲᛶᛴᛶ;

    .line 8
    .line 9
    invoke-direct {p0, v1, v0}, Lyyds/ᛲᛶᛴᛶ;-><init>(II)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, Lyyds/ᛲᛶᛴᛶ;

    .line 14
    .line 15
    invoke-direct {p0, v0, v1}, Lyyds/ᛲᛶᛴᛶ;-><init>(II)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final ᛵᛸᲈᛷ(Lyyds/ᲈᛳᲇᛲ;Lyyds/ᲇᛴᲇᛷ;Lyyds/ᲁᲇᛷᛳ;)V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    iget v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 6
    .line 7
    if-ge v2, v3, :cond_0

    .line 8
    .line 9
    iget v3, p2, Lyyds/ᲇᛴᲇᛷ;->ᲇᲈᛵᛷ:I

    .line 10
    .line 11
    if-ltz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lyyds/ᲈᛳᲇᛲ;->ᛵᛸᛸᛷ()I

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
    iget v3, p2, Lyyds/ᲇᛴᲇᛷ;->ᲇᲈᛵᛷ:I

    .line 22
    .line 23
    iget v4, p2, Lyyds/ᲇᛴᲇᛷ;->ᛶᛷᛲᲁ:I

    .line 24
    .line 25
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-virtual {p3, v3, v4}, Lyyds/ᲁᲇᛷᛳ;->ᛲᲈᲁ(II)V

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᛶᲈ;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    iget v3, p2, Lyyds/ᲇᛴᲇᛷ;->ᲇᲈᛵᛷ:I

    .line 40
    .line 41
    iget v4, p2, Lyyds/ᲇᛴᲇᛷ;->ᛲᛴᛳᛲ:I

    .line 42
    .line 43
    add-int/2addr v3, v4

    .line 44
    iput v3, p2, Lyyds/ᲇᛴᲇᛷ;->ᲇᲈᛵᛷ:I

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

.method public final ᛵᲈᲇᛵ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;Lyyds/ᛱᛵᲈᛸ;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᲈᲇᛵ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;Lyyds/ᛱᛵᲈᛸ;)V

    .line 2
    .line 3
    .line 4
    const-string p1, "android.widget.GridView"

    .line 5
    .line 6
    iget-object p2, p3, Lyyds/ᛱᛵᲈᛸ;->ᛲᲈᲁ:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 12
    .line 13
    iget-object p0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/4 p1, 0x1

    .line 22
    if-le p0, p1, :cond_0

    .line 23
    .line 24
    sget-object p0, Lyyds/ᛵᛲᛶᲁ;->ᛱᲈᲁ:Lyyds/ᛵᛲᛶᲁ;

    .line 25
    .line 26
    invoke-virtual {p3, p0}, Lyyds/ᛱᛵᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛵᛲᛶᲁ;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final ᛶᛸᛱᲁ(Landroid/graphics/Rect;II)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛶᛷᲀ:[I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1, p2, p3}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᛱᲁ(Landroid/graphics/Rect;II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛴᲁᲈ()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᛶᛷᲀ()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr v1, v0

    .line 17
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᲇᛲᛱ()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛲᛱᛱ()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr v2, v0

    .line 26
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

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
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 37
    .line 38
    sget-object v2, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {p3, p1, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛷᛲᲁ(III)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛶᛷᲀ:[I

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
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getMinimumWidth()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-static {p2, p3, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛷᛲᲁ(III)I

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
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 72
    .line 73
    sget-object v1, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/view/View;->getMinimumWidth()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {p2, p1, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛷᛲᲁ(III)I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛶᛷᲀ:[I

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
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-static {p3, p1, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛷᛲᲁ(III)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    :goto_0
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 101
    .line 102
    invoke-static {p0, p2, p1}, Lyyds/ᛵᲇᛲᛱ;->ᲇᲇᲇᛱ(Lyyds/ᛵᲇᛲᛱ;II)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final ᛷᛲᲈᛱ(Lyyds/ᲈᛳᲇᛲ;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲁᛸᛲᲈ(Lyyds/ᲈᛳᲇᛲ;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final ᛷᛵᲇᲀ(Lyyds/ᲈᛳᲇᛲ;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛳᛷᛶᛵ(Lyyds/ᲈᛳᲇᛲ;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final ᛷᛸᲇᛴ(I)Ljava/util/HashSet;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛴᲀᛱ(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲈᛷᛳ(II)Ljava/util/HashSet;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final ᛷᲈᛳᛲ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)V
    .locals 7

    .line 1
    iget-boolean v0, p2, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᛱᲁᛳ:Landroid/util/SparseIntArray;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲈᛷᲈᛶ:Landroid/util/SparseIntArray;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᲀᲁ()I

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
    invoke-virtual {p0, v3}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

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
    check-cast v4, Lyyds/ᛲᛶᛴᛶ;

    .line 25
    .line 26
    iget-object v5, v4, Lyyds/ᲇᲁᛲᲀ;->ᛲᲈᲁ:Lyyds/ᛱᛸᛳᛵ;

    .line 27
    .line 28
    invoke-virtual {v5}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    iget v6, v4, Lyyds/ᛲᛶᛴᛶ;->ᲇᲇᲇᛱ:I

    .line 33
    .line 34
    invoke-virtual {v2, v5, v6}, Landroid/util/SparseIntArray;->put(II)V

    .line 35
    .line 36
    .line 37
    iget v4, v4, Lyyds/ᛲᛶᛴᛶ;->ᛲᛴᛳᛲ:I

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
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛷᲈᛳᛲ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)V

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

.method public final ᛸᛴᛷᛵ(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

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
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛲᛱᛱ:Z

    .line 8
    .line 9
    if-lt p1, v0, :cond_1

    .line 10
    .line 11
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᛶᲈ;

    .line 14
    .line 15
    invoke-virtual {p1}, Lyyds/ᲀᲈᛶᲈ;->ᲀᛲᛲᲇ()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛱᛵᲈᛸ()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    const-string p0, "Span count should be at least 1. Provided "

    .line 23
    .line 24
    invoke-static {p1, p0}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final ᛸᲇᛱᲇ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᲀᛱᲁ()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛴᛵᛴᲈ()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛸᲇᛱᲇ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final ᲀᛲᛲᲇ(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᲇᲁᛲᲀ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᛲᛶᛴᛶ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᲇᲁᛲᲀ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lyyds/ᛲᛶᛴᛶ;->ᛲᛴᛳᛲ:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput p1, p0, Lyyds/ᛲᛶᛴᛶ;->ᲇᲇᲇᛱ:I

    .line 11
    .line 12
    return-object p0
.end method

.method public final ᲀᛳᲇᛴ(I)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v1, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲈᲁᛱ;

    .line 8
    .line 9
    iget-object v1, v1, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᲈᲀᛵ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    iget-object v0, v1, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲈᲁᛱ;

    .line 17
    .line 18
    iget-object v1, v1, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 19
    .line 20
    invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲈᲈᛱᲀ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public final ᲁᛵᛷᛸ(Landroid/view/View;IZ)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lyyds/ᛲᛶᛴᛶ;

    .line 6
    .line 7
    iget-object v1, v0, Lyyds/ᲇᲁᛲᲀ;->ᛵᛸᛸᛷ:Landroid/graphics/Rect;

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
    iget v1, v0, Lyyds/ᛲᛶᛴᛶ;->ᛲᛴᛳᛲ:I

    .line 32
    .line 33
    iget v4, v0, Lyyds/ᛲᛶᛴᛶ;->ᲇᲇᲇᛱ:I

    .line 34
    .line 35
    invoke-virtual {p0, v1, v4}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲈᲁᛴᛴ(II)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

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
    invoke-static {v5, v1, p2, v3, v4}, Lyyds/ᲇᲇᛵᛲ;->ᛵᲀᲈᛴ(ZIIII)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 52
    .line 53
    invoke-virtual {v1}, Lyyds/ᛲᛵᲀᛳ;->ᛱᛳᲇ()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget v3, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᛲᲈᲈ:I

    .line 58
    .line 59
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 60
    .line 61
    invoke-static {v6, v1, v3, v2, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛵᲀᲈᛴ(ZIIII)I

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
    invoke-static {v5, v1, p2, v2, v4}, Lyyds/ᲇᲇᛵᛲ;->ᛵᲀᲈᛴ(ZIIII)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 73
    .line 74
    invoke-virtual {v1}, Lyyds/ᛲᛵᲀᛳ;->ᛱᛳᲇ()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iget v2, p0, Lyyds/ᲇᲇᛵᛲ;->ᛷᛵᲇᲀ:I

    .line 79
    .line 80
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 81
    .line 82
    invoke-static {v6, v1, v2, v3, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛵᲀᲈᛴ(ZIIII)I

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
    check-cast v1, Lyyds/ᲇᲁᛲᲀ;

    .line 94
    .line 95
    if-eqz p3, :cond_1

    .line 96
    .line 97
    invoke-virtual {p0, p1, p2, v0, v1}, Lyyds/ᲇᲇᛵᛲ;->ᲀᲇᛶᲈ(Landroid/view/View;IILyyds/ᲇᲁᛲᲀ;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {p0, p1, p2, v0, v1}, Lyyds/ᲇᲇᛵᛲ;->ᲀᲇᛱᛲ(Landroid/view/View;IILyyds/ᲇᲁᛲᲀ;)Z

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

.method public final ᲇᲇᲇᛱ(Lyyds/ᲇᲁᛲᲀ;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lyyds/ᛲᛶᛴᛶ;

    .line 2
    .line 3
    return p0
.end method

.method public final ᲇᲇᲈᲀ(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᛶᲈ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᲀᲈᛶᲈ;->ᲀᛲᛲᲇ()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᲀᲈᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final ᲈᛳ(Lyyds/ᲈᛳᲇᛲ;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲈᛳ(Lyyds/ᲈᛳᲇᛲ;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛲᛱᛱ:Z

    .line 6
    .line 7
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲁᛶᛴᛸ:I

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛶᛳᛶᛵ(I)Landroid/view/View;

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
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲁᛶᛴᛸ:I

    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final ᲈᛳᛵᛴ(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᛶᲈ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᲀᲈᛶᲈ;->ᲀᛲᛲᲇ()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᲀᲈᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final ᲈᲁᛴᛴ(II)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛲᛶᛵᛲ()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛶᛷᲀ:[I

    .line 13
    .line 14
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

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
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛶᛷᲀ:[I

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

.method public final ᲈᲁᛶᛸ(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲈᲁᛶᛸ(Z)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 9
    .line 10
    const-string p1, "GridLayoutManager does not support stack from end. Consider using reverse layout"

    .line 11
    .line 12
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p0
.end method

.method public final ᲈᲁᛷᛶ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;Lyyds/ᲇᛴᲇᛷ;Lyyds/ᛷᛷᛲᲁ;)V
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
    iget-object v5, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 12
    .line 13
    invoke-virtual {v5}, Lyyds/ᛲᛵᲀᛳ;->ᛷᛵᲇᲀ()I

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
    invoke-virtual {v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᲀᲁ()I

    .line 26
    .line 27
    .line 28
    move-result v10

    .line 29
    if-lez v10, :cond_1

    .line 30
    .line 31
    iget-object v10, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛶᛷᲀ:[I

    .line 32
    .line 33
    iget v11, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

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
    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᲀᛱᲁ()V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget v11, v3, Lyyds/ᲇᛴᲇᛷ;->ᛲᛴᛳᛲ:I

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
    iget v12, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 52
    .line 53
    if-nez v11, :cond_4

    .line 54
    .line 55
    iget v12, v3, Lyyds/ᲇᛴᲇᛷ;->ᲇᲈᛵᛷ:I

    .line 56
    .line 57
    invoke-virtual {v0, v12, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲈᲈᛱᲀ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 58
    .line 59
    .line 60
    move-result v12

    .line 61
    iget v13, v3, Lyyds/ᲇᛴᲇᛷ;->ᲇᲈᛵᛷ:I

    .line 62
    .line 63
    invoke-virtual {v0, v13, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᛳᛲᛲ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

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
    iget v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 70
    .line 71
    if-ge v13, v14, :cond_8

    .line 72
    .line 73
    iget v14, v3, Lyyds/ᲇᛴᲇᛷ;->ᲇᲈᛵᛷ:I

    .line 74
    .line 75
    if-ltz v14, :cond_8

    .line 76
    .line 77
    invoke-virtual {v2}, Lyyds/ᲈᛳᲇᛲ;->ᛵᛸᛸᛷ()I

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
    iget v14, v3, Lyyds/ᲇᛴᲇᛷ;->ᲇᲈᛵᛷ:I

    .line 86
    .line 87
    invoke-virtual {v0, v14, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᛳᛲᛲ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 88
    .line 89
    .line 90
    move-result v15

    .line 91
    iget v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

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
    invoke-virtual {v3, v1}, Lyyds/ᲇᛴᲇᛷ;->ᛵᛸᛸᛷ(Lyyds/ᲈᲈᲁᛱ;)Landroid/view/View;

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
    iget-object v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᲇᛲᛱ:[Landroid/view/View;

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
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 116
    .line 117
    iget v0, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 118
    .line 119
    new-instance v2, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v3, "Item at position "

    .line 122
    .line 123
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v3, " requires "

    .line 130
    .line 131
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v3, " spans but GridLayoutManager has only "

    .line 138
    .line 139
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v0, " spans."

    .line 146
    .line 147
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v1

    .line 158
    :cond_8
    :goto_4
    if-nez v13, :cond_9

    .line 159
    .line 160
    iput-boolean v6, v4, Lyyds/ᛷᛷᛲᲁ;->ᛵᛸᛸᛷ:Z

    .line 161
    .line 162
    return-void

    .line 163
    :cond_9
    if-eqz v11, :cond_a

    .line 164
    .line 165
    move v15, v6

    .line 166
    move v14, v13

    .line 167
    const/4 v12, 0x0

    .line 168
    goto :goto_5

    .line 169
    :cond_a
    add-int/lit8 v12, v13, -0x1

    .line 170
    .line 171
    const/4 v14, -0x1

    .line 172
    const/4 v15, -0x1

    .line 173
    :goto_5
    const/4 v6, 0x0

    .line 174
    :goto_6
    if-eq v12, v14, :cond_b

    .line 175
    .line 176
    iget-object v7, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᲇᛲᛱ:[Landroid/view/View;

    .line 177
    .line 178
    aget-object v7, v7, v12

    .line 179
    .line 180
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 181
    .line 182
    .line 183
    move-result-object v16

    .line 184
    move-object/from16 v8, v16

    .line 185
    .line 186
    check-cast v8, Lyyds/ᛲᛶᛴᛶ;

    .line 187
    .line 188
    invoke-static {v7}, Lyyds/ᲇᲇᛵᛲ;->ᲈᛷᲈᛶ(Landroid/view/View;)I

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    invoke-virtual {v0, v7, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᛳᛲᛲ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    iput v7, v8, Lyyds/ᛲᛶᛴᛶ;->ᲇᲇᲇᛱ:I

    .line 197
    .line 198
    iput v6, v8, Lyyds/ᛲᛶᛴᛶ;->ᛲᛴᛳᛲ:I

    .line 199
    .line 200
    add-int/2addr v6, v7

    .line 201
    add-int/2addr v12, v15

    .line 202
    goto :goto_6

    .line 203
    :cond_b
    const/4 v1, 0x0

    .line 204
    const/4 v2, 0x0

    .line 205
    const/4 v6, 0x0

    .line 206
    :goto_7
    if-ge v2, v13, :cond_12

    .line 207
    .line 208
    iget-object v7, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᲇᛲᛱ:[Landroid/view/View;

    .line 209
    .line 210
    aget-object v7, v7, v2

    .line 211
    .line 212
    iget-object v8, v3, Lyyds/ᲇᛴᲇᛷ;->ᛷᛲᲈᛱ:Ljava/util/List;

    .line 213
    .line 214
    if-nez v8, :cond_d

    .line 215
    .line 216
    if-eqz v11, :cond_c

    .line 217
    .line 218
    const/4 v8, -0x1

    .line 219
    const/4 v12, 0x0

    .line 220
    invoke-virtual {v0, v7, v8, v12}, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ(Landroid/view/View;IZ)V

    .line 221
    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_c
    const/4 v8, -0x1

    .line 225
    const/4 v12, 0x0

    .line 226
    invoke-virtual {v0, v7, v12, v12}, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ(Landroid/view/View;IZ)V

    .line 227
    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_d
    const/4 v8, -0x1

    .line 231
    const/4 v12, 0x0

    .line 232
    if-eqz v11, :cond_e

    .line 233
    .line 234
    const/4 v14, 0x1

    .line 235
    invoke-virtual {v0, v7, v8, v14}, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ(Landroid/view/View;IZ)V

    .line 236
    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_e
    const/4 v14, 0x1

    .line 240
    invoke-virtual {v0, v7, v12, v14}, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ(Landroid/view/View;IZ)V

    .line 241
    .line 242
    .line 243
    :goto_8
    iget-object v8, v0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 244
    .line 245
    iget-object v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛸᛴᛵᛶ:Landroid/graphics/Rect;

    .line 246
    .line 247
    if-nez v8, :cond_f

    .line 248
    .line 249
    invoke-virtual {v14, v12, v12, v12, v12}, Landroid/graphics/Rect;->set(IIII)V

    .line 250
    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_f
    invoke-virtual {v8, v7}, Lyyds/ᛵᲇᛲᛱ;->ᛶᲀᲈᲇ(Landroid/view/View;)Landroid/graphics/Rect;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    invoke-virtual {v14, v8}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 258
    .line 259
    .line 260
    :goto_9
    invoke-virtual {v0, v7, v5, v12}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲁᛵᛷᛸ(Landroid/view/View;IZ)V

    .line 261
    .line 262
    .line 263
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 264
    .line 265
    invoke-virtual {v8, v7}, Lyyds/ᛲᛵᲀᛳ;->ᛲᛴᛳᛲ(Landroid/view/View;)I

    .line 266
    .line 267
    .line 268
    move-result v8

    .line 269
    if-le v8, v6, :cond_10

    .line 270
    .line 271
    move v6, v8

    .line 272
    :cond_10
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    check-cast v8, Lyyds/ᛲᛶᛴᛶ;

    .line 277
    .line 278
    iget-object v12, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 279
    .line 280
    invoke-virtual {v12, v7}, Lyyds/ᛲᛵᲀᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;)I

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    int-to-float v7, v7

    .line 285
    const/high16 v12, 0x3f800000    # 1.0f

    .line 286
    .line 287
    mul-float/2addr v7, v12

    .line 288
    iget v8, v8, Lyyds/ᛲᛶᛴᛶ;->ᲇᲇᲇᛱ:I

    .line 289
    .line 290
    int-to-float v8, v8

    .line 291
    div-float/2addr v7, v8

    .line 292
    cmpl-float v8, v7, v1

    .line 293
    .line 294
    if-lez v8, :cond_11

    .line 295
    .line 296
    move v1, v7

    .line 297
    :cond_11
    add-int/lit8 v2, v2, 0x1

    .line 298
    .line 299
    goto :goto_7

    .line 300
    :cond_12
    if-eqz v9, :cond_14

    .line 301
    .line 302
    iget v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 303
    .line 304
    int-to-float v2, v2

    .line 305
    mul-float/2addr v1, v2

    .line 306
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᲈᛶᛷ(I)V

    .line 315
    .line 316
    .line 317
    const/4 v6, 0x0

    .line 318
    const/4 v12, 0x0

    .line 319
    :goto_a
    if-ge v12, v13, :cond_14

    .line 320
    .line 321
    iget-object v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᲇᛲᛱ:[Landroid/view/View;

    .line 322
    .line 323
    aget-object v1, v1, v12

    .line 324
    .line 325
    const/high16 v2, 0x40000000    # 2.0f

    .line 326
    .line 327
    const/4 v14, 0x1

    .line 328
    invoke-virtual {v0, v1, v2, v14}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲁᛵᛷᛸ(Landroid/view/View;IZ)V

    .line 329
    .line 330
    .line 331
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 332
    .line 333
    invoke-virtual {v2, v1}, Lyyds/ᛲᛵᲀᛳ;->ᛲᛴᛳᛲ(Landroid/view/View;)I

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-le v1, v6, :cond_13

    .line 338
    .line 339
    move v6, v1

    .line 340
    :cond_13
    add-int/lit8 v12, v12, 0x1

    .line 341
    .line 342
    goto :goto_a

    .line 343
    :cond_14
    const/4 v12, 0x0

    .line 344
    :goto_b
    if-ge v12, v13, :cond_18

    .line 345
    .line 346
    iget-object v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᲇᛲᛱ:[Landroid/view/View;

    .line 347
    .line 348
    aget-object v1, v1, v12

    .line 349
    .line 350
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 351
    .line 352
    invoke-virtual {v2, v1}, Lyyds/ᛲᛵᲀᛳ;->ᛲᛴᛳᛲ(Landroid/view/View;)I

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    if-eq v2, v6, :cond_16

    .line 357
    .line 358
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    check-cast v2, Lyyds/ᛲᛶᛴᛶ;

    .line 363
    .line 364
    iget-object v5, v2, Lyyds/ᲇᲁᛲᲀ;->ᛵᛸᛸᛷ:Landroid/graphics/Rect;

    .line 365
    .line 366
    iget v7, v5, Landroid/graphics/Rect;->top:I

    .line 367
    .line 368
    iget v8, v5, Landroid/graphics/Rect;->bottom:I

    .line 369
    .line 370
    add-int/2addr v7, v8

    .line 371
    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 372
    .line 373
    add-int/2addr v7, v8

    .line 374
    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 375
    .line 376
    add-int/2addr v7, v8

    .line 377
    iget v8, v5, Landroid/graphics/Rect;->left:I

    .line 378
    .line 379
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 380
    .line 381
    add-int/2addr v8, v5

    .line 382
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 383
    .line 384
    add-int/2addr v8, v5

    .line 385
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 386
    .line 387
    add-int/2addr v8, v5

    .line 388
    iget v5, v2, Lyyds/ᛲᛶᛴᛶ;->ᛲᛴᛳᛲ:I

    .line 389
    .line 390
    iget v9, v2, Lyyds/ᛲᛶᛴᛶ;->ᲇᲇᲇᛱ:I

    .line 391
    .line 392
    invoke-virtual {v0, v5, v9}, Landroidx/recyclerview/widget/GridLayoutManager;->ᲈᲁᛴᛴ(II)I

    .line 393
    .line 394
    .line 395
    move-result v5

    .line 396
    iget v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 397
    .line 398
    const/4 v14, 0x1

    .line 399
    if-ne v9, v14, :cond_15

    .line 400
    .line 401
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 402
    .line 403
    const/4 v9, 0x0

    .line 404
    const/high16 v10, 0x40000000    # 2.0f

    .line 405
    .line 406
    invoke-static {v9, v5, v10, v8, v2}, Lyyds/ᲇᲇᛵᛲ;->ᛵᲀᲈᛴ(ZIIII)I

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    sub-int v5, v6, v7

    .line 411
    .line 412
    invoke-static {v5, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 413
    .line 414
    .line 415
    move-result v5

    .line 416
    goto :goto_c

    .line 417
    :cond_15
    const/4 v9, 0x0

    .line 418
    const/high16 v10, 0x40000000    # 2.0f

    .line 419
    .line 420
    sub-int v8, v6, v8

    .line 421
    .line 422
    invoke-static {v8, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 423
    .line 424
    .line 425
    move-result v8

    .line 426
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 427
    .line 428
    invoke-static {v9, v5, v10, v7, v2}, Lyyds/ᲇᲇᛵᛲ;->ᛵᲀᲈᛴ(ZIIII)I

    .line 429
    .line 430
    .line 431
    move-result v5

    .line 432
    move v2, v8

    .line 433
    :goto_c
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 434
    .line 435
    .line 436
    move-result-object v7

    .line 437
    check-cast v7, Lyyds/ᲇᲁᛲᲀ;

    .line 438
    .line 439
    invoke-virtual {v0, v1, v2, v5, v7}, Lyyds/ᲇᲇᛵᛲ;->ᲀᲇᛶᲈ(Landroid/view/View;IILyyds/ᲇᲁᛲᲀ;)Z

    .line 440
    .line 441
    .line 442
    move-result v7

    .line 443
    if-eqz v7, :cond_17

    .line 444
    .line 445
    invoke-virtual {v1, v2, v5}, Landroid/view/View;->measure(II)V

    .line 446
    .line 447
    .line 448
    goto :goto_d

    .line 449
    :cond_16
    const/4 v9, 0x0

    .line 450
    const/high16 v10, 0x40000000    # 2.0f

    .line 451
    .line 452
    :cond_17
    :goto_d
    add-int/lit8 v12, v12, 0x1

    .line 453
    .line 454
    goto :goto_b

    .line 455
    :cond_18
    const/4 v9, 0x0

    .line 456
    iput v6, v4, Lyyds/ᛷᛷᛲᲁ;->ᛲᲈᲁ:I

    .line 457
    .line 458
    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 459
    .line 460
    iget v2, v3, Lyyds/ᲇᛴᲇᛷ;->ᲇᲇᲇᛱ:I

    .line 461
    .line 462
    iget v12, v3, Lyyds/ᲇᛴᲇᛷ;->ᛵᛸᛸᛷ:I

    .line 463
    .line 464
    const/4 v14, 0x1

    .line 465
    if-ne v1, v14, :cond_1a

    .line 466
    .line 467
    const/4 v8, -0x1

    .line 468
    if-ne v2, v8, :cond_19

    .line 469
    .line 470
    sub-int v1, v12, v6

    .line 471
    .line 472
    move v3, v1

    .line 473
    move v1, v9

    .line 474
    move v2, v1

    .line 475
    goto :goto_f

    .line 476
    :cond_19
    add-int v1, v12, v6

    .line 477
    .line 478
    move v2, v9

    .line 479
    move v3, v12

    .line 480
    move v12, v1

    .line 481
    move v1, v2

    .line 482
    goto :goto_f

    .line 483
    :cond_1a
    const/4 v8, -0x1

    .line 484
    if-ne v2, v8, :cond_1b

    .line 485
    .line 486
    sub-int v1, v12, v6

    .line 487
    .line 488
    move v3, v9

    .line 489
    move v2, v12

    .line 490
    :goto_e
    move v12, v3

    .line 491
    goto :goto_f

    .line 492
    :cond_1b
    add-int v1, v12, v6

    .line 493
    .line 494
    move v2, v1

    .line 495
    move v3, v9

    .line 496
    move v1, v12

    .line 497
    goto :goto_e

    .line 498
    :goto_f
    move v7, v9

    .line 499
    :goto_10
    iget-object v5, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᲇᛲᛱ:[Landroid/view/View;

    .line 500
    .line 501
    if-ge v7, v13, :cond_20

    .line 502
    .line 503
    aget-object v5, v5, v7

    .line 504
    .line 505
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 506
    .line 507
    .line 508
    move-result-object v6

    .line 509
    check-cast v6, Lyyds/ᛲᛶᛴᛶ;

    .line 510
    .line 511
    iget v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛱᛲ:I

    .line 512
    .line 513
    const/4 v14, 0x1

    .line 514
    if-ne v8, v14, :cond_1d

    .line 515
    .line 516
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛲᛶᛵᛲ()Z

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    if-eqz v1, :cond_1c

    .line 521
    .line 522
    invoke-virtual {v0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛴᲁᲈ()I

    .line 523
    .line 524
    .line 525
    move-result v1

    .line 526
    iget-object v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛶᛷᲀ:[I

    .line 527
    .line 528
    iget v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 529
    .line 530
    iget v9, v6, Lyyds/ᛲᛶᛴᛶ;->ᛲᛴᛳᛲ:I

    .line 531
    .line 532
    sub-int/2addr v8, v9

    .line 533
    aget v2, v2, v8

    .line 534
    .line 535
    add-int/2addr v1, v2

    .line 536
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 537
    .line 538
    invoke-virtual {v2, v5}, Lyyds/ᛲᛵᲀᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;)I

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    sub-int v2, v1, v2

    .line 543
    .line 544
    move/from16 v17, v2

    .line 545
    .line 546
    move v2, v1

    .line 547
    move/from16 v1, v17

    .line 548
    .line 549
    goto :goto_11

    .line 550
    :cond_1c
    invoke-virtual {v0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛴᲁᲈ()I

    .line 551
    .line 552
    .line 553
    move-result v1

    .line 554
    iget-object v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛶᛷᲀ:[I

    .line 555
    .line 556
    iget v8, v6, Lyyds/ᛲᛶᛴᛶ;->ᛲᛴᛳᛲ:I

    .line 557
    .line 558
    aget v2, v2, v8

    .line 559
    .line 560
    add-int/2addr v1, v2

    .line 561
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 562
    .line 563
    invoke-virtual {v2, v5}, Lyyds/ᛲᛵᲀᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;)I

    .line 564
    .line 565
    .line 566
    move-result v2

    .line 567
    add-int/2addr v2, v1

    .line 568
    goto :goto_11

    .line 569
    :cond_1d
    invoke-virtual {v0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᲇᛲᛱ()I

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    iget-object v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛷᛶᛷᲀ:[I

    .line 574
    .line 575
    iget v9, v6, Lyyds/ᛲᛶᛴᛶ;->ᛲᛴᛳᛲ:I

    .line 576
    .line 577
    aget v8, v8, v9

    .line 578
    .line 579
    add-int/2addr v3, v8

    .line 580
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲀᛳ;

    .line 581
    .line 582
    invoke-virtual {v8, v5}, Lyyds/ᛲᛵᲀᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;)I

    .line 583
    .line 584
    .line 585
    move-result v8

    .line 586
    add-int/2addr v8, v3

    .line 587
    move v12, v8

    .line 588
    :goto_11
    invoke-static {v5, v1, v3, v2, v12}, Lyyds/ᲇᲇᛵᛲ;->ᛷᛴᛴᲁ(Landroid/view/View;IIII)V

    .line 589
    .line 590
    .line 591
    iget-object v8, v6, Lyyds/ᲇᲁᛲᲀ;->ᛲᲈᲁ:Lyyds/ᛱᛸᛳᛵ;

    .line 592
    .line 593
    invoke-virtual {v8}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ()Z

    .line 594
    .line 595
    .line 596
    move-result v8

    .line 597
    if-nez v8, :cond_1e

    .line 598
    .line 599
    iget-object v6, v6, Lyyds/ᲇᲁᛲᲀ;->ᛲᲈᲁ:Lyyds/ᛱᛸᛳᛵ;

    .line 600
    .line 601
    invoke-virtual {v6}, Lyyds/ᛱᛸᛳᛵ;->ᛷᛵᲇᲀ()Z

    .line 602
    .line 603
    .line 604
    move-result v6

    .line 605
    if-eqz v6, :cond_1f

    .line 606
    .line 607
    :cond_1e
    const/4 v14, 0x1

    .line 608
    goto :goto_12

    .line 609
    :cond_1f
    const/4 v14, 0x1

    .line 610
    goto :goto_13

    .line 611
    :goto_12
    iput-boolean v14, v4, Lyyds/ᛷᛷᛲᲁ;->ᲀᛲᛳᲀ:Z

    .line 612
    .line 613
    :goto_13
    iget-boolean v6, v4, Lyyds/ᛷᛷᛲᲁ;->ᲇᲈᛵᛷ:Z

    .line 614
    .line 615
    invoke-virtual {v5}, Landroid/view/View;->hasFocusable()Z

    .line 616
    .line 617
    .line 618
    move-result v5

    .line 619
    or-int/2addr v5, v6

    .line 620
    iput-boolean v5, v4, Lyyds/ᛷᛷᛲᲁ;->ᲇᲈᛵᛷ:Z

    .line 621
    .line 622
    add-int/lit8 v7, v7, 0x1

    .line 623
    .line 624
    goto :goto_10

    .line 625
    :cond_20
    const/4 v0, 0x0

    .line 626
    invoke-static {v5, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    return-void
.end method

.method public final ᲈᲈᛱᲀ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I
    .locals 2

    .line 1
    iget-boolean p3, p3, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᛶᲈ;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    rem-int/2addr p1, p0

    .line 13
    return p1

    .line 14
    :cond_0
    iget-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᛲᛱᲁᛳ:Landroid/util/SparseIntArray;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {p3, p1, v1}, Landroid/util/SparseIntArray;->get(II)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eq p3, v1, :cond_1

    .line 22
    .line 23
    return p3

    .line 24
    :cond_1
    invoke-virtual {p2, p1}, Lyyds/ᲈᲈᲁᛱ;->ᛵᛸᛸᛷ(I)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-ne p2, v1, :cond_2

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
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    rem-int/2addr p2, p0

    .line 57
    return p2
.end method
