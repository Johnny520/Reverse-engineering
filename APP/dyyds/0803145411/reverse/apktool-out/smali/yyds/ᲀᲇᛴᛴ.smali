.class public final Lyyds/ᲀᲇᛴᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᲈᲁ:[Landroid/graphics/Bitmap$Config;

.field public static final ᛲᛴᛳᛲ:[Landroid/graphics/Bitmap$Config;

.field public static final ᛶᛷᛲᲁ:[Landroid/graphics/Bitmap$Config;

.field public static final ᲇᲇᲇᛱ:[Landroid/graphics/Bitmap$Config;

.field public static final ᲇᲈᛵᛷ:[Landroid/graphics/Bitmap$Config;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᛵᛴᛶᛶ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᲀᲈᛶᲈ;

.field public final ᲀᛲᛳᲀ:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    filled-new-array {v0, v1}, [Landroid/graphics/Bitmap$Config;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x3

    .line 9
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, [Landroid/graphics/Bitmap$Config;

    .line 14
    .line 15
    array-length v1, v0

    .line 16
    add-int/lit8 v1, v1, -0x1

    .line 17
    .line 18
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGBA_F16:Landroid/graphics/Bitmap$Config;

    .line 19
    .line 20
    aput-object v2, v0, v1

    .line 21
    .line 22
    sput-object v0, Lyyds/ᲀᲇᛴᛴ;->ᲇᲈᛵᛷ:[Landroid/graphics/Bitmap$Config;

    .line 23
    .line 24
    sput-object v0, Lyyds/ᲀᲇᛴᛴ;->ᛲᛴᛳᛲ:[Landroid/graphics/Bitmap$Config;

    .line 25
    .line 26
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 27
    .line 28
    filled-new-array {v0}, [Landroid/graphics/Bitmap$Config;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lyyds/ᲀᲇᛴᛴ;->ᲇᲇᲇᛱ:[Landroid/graphics/Bitmap$Config;

    .line 33
    .line 34
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    .line 35
    .line 36
    filled-new-array {v0}, [Landroid/graphics/Bitmap$Config;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lyyds/ᲀᲇᛴᛴ;->ᛶᛷᛲᲁ:[Landroid/graphics/Bitmap$Config;

    .line 41
    .line 42
    sget-object v0, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    .line 43
    .line 44
    filled-new-array {v0}, [Landroid/graphics/Bitmap$Config;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sput-object v0, Lyyds/ᲀᲇᛴᛴ;->ᛱᲈᲁ:[Landroid/graphics/Bitmap$Config;

    .line 49
    .line 50
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛵᛴᛶᛶ;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Lyyds/ᛵᛴᛶᛶ;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lyyds/ᲀᲇᛴᛴ;->ᛲᲈᲁ:Lyyds/ᛵᛴᛶᛶ;

    .line 11
    .line 12
    new-instance v0, Lyyds/ᲀᲈᛶᲈ;

    .line 13
    .line 14
    const/16 v1, 0x1b

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lyyds/ᲀᲈᛶᲈ;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lyyds/ᲀᲇᛴᛴ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲈᛶᲈ;

    .line 20
    .line 21
    new-instance v0, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lyyds/ᲀᲇᛴᛴ;->ᲀᛲᛳᲀ:Ljava/util/HashMap;

    .line 27
    .line 28
    return-void
.end method

.method public static ᲀᛲᛳᲀ(ILandroid/graphics/Bitmap$Config;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, "]("

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, ")"

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "SizeConfigStrategy{groupedMap="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lyyds/ᲀᲇᛴᛴ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲈᛶᲈ;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", sortedSizes=("

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lyyds/ᲀᲇᛴᛴ;->ᲀᛲᛳᲀ:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/util/Map$Entry;

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const/16 v3, 0x5b

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v2, "], "

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {p0}, Ljava/util/HashMap;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_1

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    add-int/lit8 p0, p0, -0x2

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const-string v2, ""

    .line 85
    .line 86
    invoke-virtual {v0, p0, v1, v2}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    :cond_1
    const-string p0, ")}"

    .line 90
    .line 91
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0
.end method

.method public final ᛲᛴᛳᛲ(Landroid/graphics/Bitmap;)V
    .locals 4

    .line 1
    invoke-static {p1}, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ(Landroid/graphics/Bitmap;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lyyds/ᲀᲇᛴᛴ;->ᛲᲈᲁ:Lyyds/ᛵᛴᛶᛶ;

    .line 10
    .line 11
    iget-object v3, v2, Lyyds/ᛳᲇᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ljava/util/ArrayDeque;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lyyds/ᛷᛲᛴᛳ;

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2}, Lyyds/ᛵᛴᛶᛶ;->ᛵᛸᛸᛷ()Lyyds/ᛷᛲᛴᛳ;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    :cond_0
    check-cast v3, Lyyds/ᛳᲇᛸᲇ;

    .line 28
    .line 29
    iput v0, v3, Lyyds/ᛳᲇᛸᲇ;->ᛵᛸᛸᛷ:I

    .line 30
    .line 31
    iput-object v1, v3, Lyyds/ᛳᲇᛸᲇ;->ᲀᛲᛳᲀ:Landroid/graphics/Bitmap$Config;

    .line 32
    .line 33
    iget-object v0, p0, Lyyds/ᲀᲇᛴᛴ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲈᛶᲈ;

    .line 34
    .line 35
    invoke-virtual {v0, v3, p1}, Lyyds/ᲀᲈᛶᲈ;->ᛷᛸᲇᛶ(Lyyds/ᛷᛲᛴᛳ;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Lyyds/ᲀᲇᛴᛴ;->ᲇᲈᛵᛷ(Landroid/graphics/Bitmap$Config;)Ljava/util/NavigableMap;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    iget p1, v3, Lyyds/ᛳᲇᛸᲇ;->ᛵᛸᛸᛷ:I

    .line 47
    .line 48
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Ljava/lang/Integer;

    .line 57
    .line 58
    iget v0, v3, Lyyds/ᛳᲇᛸᲇ;->ᛵᛸᛸᛷ:I

    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const/4 v1, 0x1

    .line 65
    if-nez p1, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    add-int/2addr v1, p1

    .line 73
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final ᛲᲈᲁ(Ljava/lang/Integer;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lyyds/ᲀᲇᛴᛴ;->ᲇᲈᛵᛷ(Landroid/graphics/Bitmap$Config;)Ljava/util/NavigableMap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/4 p2, 0x1

    .line 22
    if-ne p0, p2, :cond_0

    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    sub-int/2addr p0, p2

    .line 33
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 42
    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v2, "Tried to decrement empty size, size: "

    .line 46
    .line 47
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-static {p2}, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ(Landroid/graphics/Bitmap;)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-static {p1, p2}, Lyyds/ᲀᲇᛴᛴ;->ᲀᛲᛳᲀ(ILandroid/graphics/Bitmap$Config;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string p2, ", removed: "

    .line 66
    .line 67
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p1, ", this: "

    .line 74
    .line 75
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v0
.end method

.method public final ᛵᛸᛸᛷ(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 11

    .line 1
    mul-int v0, p1, p2

    .line 2
    .line 3
    invoke-static {p3}, Lyyds/ᛱᛷᲈᛲ;->ᛶᛷᛲᲁ(Landroid/graphics/Bitmap$Config;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    mul-int/2addr v1, v0

    .line 8
    iget-object v0, p0, Lyyds/ᲀᲇᛴᛴ;->ᛲᲈᲁ:Lyyds/ᛵᛴᛶᛶ;

    .line 9
    .line 10
    iget-object v2, v0, Lyyds/ᛳᲇᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ljava/util/ArrayDeque;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lyyds/ᛷᛲᛴᛳ;

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lyyds/ᛵᛴᛶᛶ;->ᛵᛸᛸᛷ()Lyyds/ᛷᛲᛴᛳ;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :cond_0
    check-cast v3, Lyyds/ᛳᲇᛸᲇ;

    .line 27
    .line 28
    iput v1, v3, Lyyds/ᛳᲇᛸᲇ;->ᛵᛸᛸᛷ:I

    .line 29
    .line 30
    iput-object p3, v3, Lyyds/ᛳᲇᛸᲇ;->ᲀᛲᛳᲀ:Landroid/graphics/Bitmap$Config;

    .line 31
    .line 32
    sget-object v4, Landroid/graphics/Bitmap$Config;->RGBA_F16:Landroid/graphics/Bitmap$Config;

    .line 33
    .line 34
    invoke-virtual {v4, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    sget-object v4, Lyyds/ᲀᲇᛴᛴ;->ᛲᛴᛳᛲ:[Landroid/graphics/Bitmap$Config;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sget-object v4, Lyyds/ᛲᛷᛲᲀ;->ᛲᲈᲁ:[I

    .line 44
    .line 45
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    aget v4, v4, v5

    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    if-eq v4, v5, :cond_5

    .line 53
    .line 54
    const/4 v5, 0x2

    .line 55
    if-eq v4, v5, :cond_4

    .line 56
    .line 57
    const/4 v5, 0x3

    .line 58
    if-eq v4, v5, :cond_3

    .line 59
    .line 60
    const/4 v5, 0x4

    .line 61
    if-eq v4, v5, :cond_2

    .line 62
    .line 63
    filled-new-array {p3}, [Landroid/graphics/Bitmap$Config;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    sget-object v4, Lyyds/ᲀᲇᛴᛴ;->ᛱᲈᲁ:[Landroid/graphics/Bitmap$Config;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    sget-object v4, Lyyds/ᲀᲇᛴᛴ;->ᛶᛷᛲᲁ:[Landroid/graphics/Bitmap$Config;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    sget-object v4, Lyyds/ᲀᲇᛴᛴ;->ᲇᲇᲇᛱ:[Landroid/graphics/Bitmap$Config;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    sget-object v4, Lyyds/ᲀᲇᛴᛴ;->ᲇᲈᛵᛷ:[Landroid/graphics/Bitmap$Config;

    .line 78
    .line 79
    :goto_0
    array-length v5, v4

    .line 80
    const/4 v6, 0x0

    .line 81
    :goto_1
    if-ge v6, v5, :cond_a

    .line 82
    .line 83
    aget-object v7, v4, v6

    .line 84
    .line 85
    invoke-virtual {p0, v7}, Lyyds/ᲀᲇᛴᛴ;->ᲇᲈᛵᛷ(Landroid/graphics/Bitmap$Config;)Ljava/util/NavigableMap;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    invoke-interface {v8, v9}, Ljava/util/NavigableMap;->ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    check-cast v8, Ljava/lang/Integer;

    .line 98
    .line 99
    if-eqz v8, :cond_9

    .line 100
    .line 101
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    mul-int/lit8 v10, v1, 0x8

    .line 106
    .line 107
    if-gt v9, v10, :cond_9

    .line 108
    .line 109
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-ne v4, v1, :cond_7

    .line 114
    .line 115
    if-nez v7, :cond_6

    .line 116
    .line 117
    if-eqz p3, :cond_a

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    invoke-virtual {v7, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-nez v1, :cond_a

    .line 125
    .line 126
    :cond_7
    :goto_2
    invoke-virtual {v0, v3}, Lyyds/ᛳᲇᛸᲁ;->ᛲᲈᲁ(Lyyds/ᛷᛲᛴᛳ;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    check-cast v2, Lyyds/ᛷᛲᛴᛳ;

    .line 138
    .line 139
    if-nez v2, :cond_8

    .line 140
    .line 141
    invoke-virtual {v0}, Lyyds/ᛵᛴᛶᛶ;->ᛵᛸᛸᛷ()Lyyds/ᛷᛲᛴᛳ;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    :cond_8
    move-object v3, v2

    .line 146
    check-cast v3, Lyyds/ᛳᲇᛸᲇ;

    .line 147
    .line 148
    iput v1, v3, Lyyds/ᛳᲇᛸᲇ;->ᛵᛸᛸᛷ:I

    .line 149
    .line 150
    iput-object v7, v3, Lyyds/ᛳᲇᛸᲇ;->ᲀᛲᛳᲀ:Landroid/graphics/Bitmap$Config;

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_a
    :goto_3
    iget-object v0, p0, Lyyds/ᲀᲇᛴᛴ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲈᛶᲈ;

    .line 157
    .line 158
    invoke-virtual {v0, v3}, Lyyds/ᲀᲈᛶᲈ;->ᛷᛲᲈᛱ(Lyyds/ᛷᛲᛴᛳ;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Landroid/graphics/Bitmap;

    .line 163
    .line 164
    if-eqz v0, :cond_b

    .line 165
    .line 166
    iget v1, v3, Lyyds/ᛳᲇᛸᲇ;->ᛵᛸᛸᛷ:I

    .line 167
    .line 168
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {p0, v1, v0}, Lyyds/ᲀᲇᛴᛴ;->ᛲᲈᲁ(Ljava/lang/Integer;Landroid/graphics/Bitmap;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Bitmap;->reconfigure(IILandroid/graphics/Bitmap$Config;)V

    .line 176
    .line 177
    .line 178
    :cond_b
    return-object v0
.end method

.method public final ᲇᲈᛵᛷ(Landroid/graphics/Bitmap$Config;)Ljava/util/NavigableMap;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲀᲇᛴᛴ;->ᲀᛲᛳᲀ:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/NavigableMap;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/util/TreeMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-object v0
.end method
