.class public abstract Lyyds/ᲀᛳᲇᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:[[Landroid/graphics/Rect;

.field public final ᛵᛸᛸᛷ:[[Landroid/graphics/Rect;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    new-instance v0, Lyyds/ᲈᛶᲈᛴ;

    invoke-direct {v0}, Lyyds/ᲈᛶᲈᛴ;-><init>()V

    invoke-direct {p0, v0}, Lyyds/ᲀᛳᲇᛱ;-><init>(Lyyds/ᲈᛶᲈᛴ;)V

    return-void
.end method

.method public constructor <init>(Lyyds/ᲈᛶᲈᛴ;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    new-array v1, v0, [[Landroid/graphics/Rect;

    .line 7
    .line 8
    iput-object v1, p0, Lyyds/ᲀᛳᲇᛱ;->ᛲᲈᲁ:[[Landroid/graphics/Rect;

    .line 9
    .line 10
    new-array v0, v0, [[Landroid/graphics/Rect;

    .line 11
    .line 12
    iput-object v0, p0, Lyyds/ᲀᛳᲇᛱ;->ᛵᛸᛸᛷ:[[Landroid/graphics/Rect;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lyyds/ᲀᛳᲇᛱ;->ᲀᛲᛳᲀ(Lyyds/ᲈᛶᲈᛴ;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract ᛵᛸᛸᛷ()Lyyds/ᲈᛶᲈᛴ;
.end method

.method public ᲀᛲᛳᲀ(Lyyds/ᲈᛶᲈᛴ;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    :goto_0
    const/16 v1, 0x200

    .line 3
    .line 4
    if-gt v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v1, p1, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lyyds/ᲈᛲᲁᛳ;->ᛲᛴᛳᛲ(I)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v0}, Lyyds/ᛲᲇᲁᛳ;->ᛶᛷᛲᲁ(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    new-array v3, v3, [Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-interface {v1, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, [Landroid/graphics/Rect;

    .line 27
    .line 28
    iget-object v3, p0, Lyyds/ᲀᛳᲇᛱ;->ᛲᲈᲁ:[[Landroid/graphics/Rect;

    .line 29
    .line 30
    aput-object v1, v3, v2

    .line 31
    .line 32
    const/16 v1, 0x8

    .line 33
    .line 34
    if-eq v0, v1, :cond_0

    .line 35
    .line 36
    iget-object v1, p1, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lyyds/ᲈᛲᲁᛳ;->ᲇᲇᲇᛱ(I)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    new-array v3, v3, [Landroid/graphics/Rect;

    .line 47
    .line 48
    invoke-interface {v1, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, [Landroid/graphics/Rect;

    .line 53
    .line 54
    iget-object v3, p0, Lyyds/ᲀᛳᲇᛱ;->ᛵᛸᛸᛷ:[[Landroid/graphics/Rect;

    .line 55
    .line 56
    aput-object v1, v3, v2

    .line 57
    .line 58
    :cond_0
    shl-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    return-void
.end method
