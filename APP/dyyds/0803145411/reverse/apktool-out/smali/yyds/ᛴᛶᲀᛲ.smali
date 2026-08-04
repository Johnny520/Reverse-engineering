.class public abstract Lyyds/ᛴᛶᲀᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:[Ljava/lang/String;

.field public static final ᛵᛸᛸᛷ:[C

.field public static ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "decelerate"

    .line 2
    .line 3
    const-string v1, "linear"

    .line 4
    .line 5
    const-string v2, "standard"

    .line 6
    .line 7
    const-string v3, "accelerate"

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lyyds/ᛴᛶᲀᛲ;->ᛲᲈᲁ:[Ljava/lang/String;

    .line 14
    .line 15
    const/16 v0, 0x10

    .line 16
    .line 17
    new-array v0, v0, [C

    .line 18
    .line 19
    fill-array-data v0, :array_0

    .line 20
    .line 21
    .line 22
    sput-object v0, Lyyds/ᛴᛶᲀᛲ;->ᛵᛸᛸᛷ:[C

    .line 23
    .line 24
    return-void

    .line 25
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public static ᛱᛳᲇ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x1

    .line 16
    if-ne v1, v2, :cond_1

    .line 17
    .line 18
    return v3

    .line 19
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eq v1, v2, :cond_2

    .line 28
    .line 29
    return v0

    .line 30
    :cond_2
    sub-int/2addr v1, v3

    .line 31
    :goto_0
    if-ltz v1, :cond_4

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eq v2, v4, :cond_3

    .line 42
    .line 43
    return v0

    .line 44
    :cond_3
    add-int/lit8 v1, v1, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    return v3

    .line 48
    :cond_5
    :goto_1
    return v0
.end method

.method public static ᛱᲈᲁ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x1

    .line 16
    if-ne v1, v2, :cond_1

    .line 17
    .line 18
    return v3

    .line 19
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eq v1, v2, :cond_2

    .line 28
    .line 29
    return v0

    .line 30
    :cond_2
    move v2, v0

    .line 31
    :goto_0
    if-ge v2, v1, :cond_4

    .line 32
    .line 33
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eq v4, v5, :cond_3

    .line 42
    .line 43
    return v0

    .line 44
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    return v3

    .line 48
    :cond_5
    :goto_1
    return v0
.end method

.method public static ᛲᛲᲈᲈ(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᲈᛱᛸᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛲ;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lyyds/ᲀᛲᛱᲈ;

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    invoke-direct {v0, v1}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, p0, v0}, Lyyds/ᲁᛴᛲ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lyyds/ᲁᛴᛲ;

    .line 17
    .line 18
    return-object p0
.end method

.method public static ᛲᛳᛶᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;
    .locals 1

    .line 1
    invoke-static {}, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object p0, v0

    .line 9
    :goto_0
    invoke-static {p0}, Lyyds/ᛵᛶᛵᲈ;->ᛲᲈᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static ᛲᛴᛳᛲ(Ljava/lang/String;Ljava/util/ArrayList;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lyyds/ᛲᛴᛷᲁ;

    .line 23
    .line 24
    invoke-virtual {v0}, Lyyds/ᛲᛴᛷᲁ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0, p0}, Lyyds/ᛴᛶᲀᛲ;->ᛱᛳᲇ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public static varargs ᛲᲈᲁ([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v0, p0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    array-length v0, p0

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v0, :cond_1

    .line 14
    .line 15
    aget-object v3, p0, v2

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    :goto_1
    return-object v1
.end method

.method public static final ᛵᛸᛸᛷ([Lyyds/ᛷᲇᛴᛵ;Lyyds/ᛶᲀᛵᛸ;)Ljava/lang/Object;
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    sget-object p0, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v0, Lyyds/ᛷᛶᛳᛵ;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lyyds/ᛷᛶᛳᛵ;-><init>([Lyyds/ᛷᲇᛴᛵ;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lyyds/ᛸᲀᛱᛴ;

    .line 13
    .line 14
    invoke-static {p1}, Lyyds/ᛶᛶᲁᲇ;->ᛷᲈᲈᲁ(Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v2, p1}, Lyyds/ᛸᲀᛱᛴ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lyyds/ᛸᲀᛱᛴ;->ᛵᲀᲈᛴ()V

    .line 23
    .line 24
    .line 25
    array-length p1, p0

    .line 26
    new-array v3, p1, [Lyyds/ᛲᛲᛶᲁ;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    move v5, v4

    .line 30
    :goto_0
    if-ge v5, p1, :cond_1

    .line 31
    .line 32
    aget-object v6, p0, v5

    .line 33
    .line 34
    move-object v7, v6

    .line 35
    check-cast v7, Lyyds/ᛴᲈᛱᛷ;

    .line 36
    .line 37
    invoke-virtual {v7}, Lyyds/ᛴᲈᛱᛷ;->start()Z

    .line 38
    .line 39
    .line 40
    new-instance v7, Lyyds/ᛲᛲᛶᲁ;

    .line 41
    .line 42
    invoke-direct {v7, v0, v1}, Lyyds/ᛲᛲᛶᲁ;-><init>(Lyyds/ᛷᛶᛳᛵ;Lyyds/ᛸᲀᛱᛴ;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v6, v2, v7}, Lyyds/ᛷᛸ;->ᛷᲈᲈᲁ(Lyyds/ᲈᲇᲈᲇ;ZLyyds/ᛴᲀᛴᛵ;)Lyyds/ᛴᲇᛲᛱ;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    iput-object v6, v7, Lyyds/ᛲᛲᛶᲁ;->ᛱᲈᲁ:Lyyds/ᛴᲇᛲᛱ;

    .line 50
    .line 51
    aput-object v7, v3, v5

    .line 52
    .line 53
    add-int/lit8 v5, v5, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance p0, Lyyds/ᛵᲇᛳᛷ;

    .line 57
    .line 58
    invoke-direct {p0, v3}, Lyyds/ᛵᲇᛳᛷ;-><init>([Lyyds/ᛲᛲᛶᲁ;)V

    .line 59
    .line 60
    .line 61
    :goto_1
    if-ge v4, p1, :cond_2

    .line 62
    .line 63
    aget-object v0, v3, v4

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    sget-object v2, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 69
    .line 70
    sget-wide v5, Lyyds/ᛲᛲᛶᲁ;->ᛷᲈᲈᲁ:J

    .line 71
    .line 72
    invoke-virtual {v2, v0, v5, v6, p0}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-virtual {v1}, Lyyds/ᛸᲀᛱᛴ;->ᛶᛸᲀᲁ()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    instance-of p1, p1, Lyyds/ᛳᛴᲀᲈ;

    .line 83
    .line 84
    if-nez p1, :cond_3

    .line 85
    .line 86
    invoke-virtual {p0}, Lyyds/ᛵᲇᛳᛷ;->ᛵᛸᛸᛷ()V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-virtual {v1, p0}, Lyyds/ᛸᲀᛱᛴ;->ᲈᲀᛲᲀ(Lyyds/ᛳᛴᲀᲈ;)V

    .line 91
    .line 92
    .line 93
    :goto_2
    invoke-virtual {v1}, Lyyds/ᛸᲀᛱᛴ;->ᛶᲈᛴᲈ()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0
.end method

.method public static final ᛶᛷᛲᲁ([Ljava/lang/Enum;)Lyyds/ᛲᲁᲇᲁ;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛲᲁᲇᲁ;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lyyds/ᛲᲁᲇᲁ;-><init>([Ljava/lang/Enum;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final ᛷᛲᲈᛱ(Ljava/lang/String;II)Z
    .locals 2

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    if-ge v0, p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/16 v1, 0x25

    .line 10
    .line 11
    if-ne p2, v1, :cond_0

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    add-int/2addr p1, p2

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p1}, Lyyds/ᛶᲁᛵᛲ;->ᛷᛲᲈᛱ(C)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v1, -0x1

    .line 24
    if-eq p1, v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Lyyds/ᛶᲁᛵᛲ;->ᛷᛲᲈᛱ(C)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eq p0, v1, :cond_0

    .line 35
    .line 36
    return p2

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static ᛷᛵᲇᲀ(IIILjava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p0, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p2, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    :cond_1
    and-int/lit8 p2, p2, 0x4

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    const/4 v1, 0x1

    .line 21
    :goto_0
    move p2, p0

    .line 22
    :goto_1
    if-ge p2, p1, :cond_8

    .line 23
    .line 24
    invoke-virtual {p3, p2}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/16 v2, 0x2b

    .line 29
    .line 30
    const/16 v3, 0x25

    .line 31
    .line 32
    if-eq v0, v3, :cond_4

    .line 33
    .line 34
    if-ne v0, v2, :cond_3

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    add-int/lit8 p2, p2, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_4
    :goto_2
    new-instance v0, Lyyds/ᛷᛲᲈᛲ;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p3, p0, p2}, Lyyds/ᛷᛲᲈᛲ;->ᛶᛴᛱᛲ(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    :goto_3
    if-ge p2, p1, :cond_7

    .line 51
    .line 52
    invoke-virtual {p3, p2}, Ljava/lang/String;->codePointAt(I)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-ne p0, v3, :cond_5

    .line 57
    .line 58
    add-int/lit8 v4, p2, 0x2

    .line 59
    .line 60
    if-ge v4, p1, :cond_5

    .line 61
    .line 62
    add-int/lit8 v5, p2, 0x1

    .line 63
    .line 64
    invoke-virtual {p3, v5}, Ljava/lang/String;->charAt(I)C

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-static {v5}, Lyyds/ᛶᲁᛵᛲ;->ᛷᛲᲈᛱ(C)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-virtual {p3, v4}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    invoke-static {v6}, Lyyds/ᛶᲁᛵᛲ;->ᛷᛲᲈᛱ(C)I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    const/4 v7, -0x1

    .line 81
    if-eq v5, v7, :cond_6

    .line 82
    .line 83
    if-eq v6, v7, :cond_6

    .line 84
    .line 85
    shl-int/lit8 p2, v5, 0x4

    .line 86
    .line 87
    add-int/2addr p2, v6

    .line 88
    invoke-virtual {v0, p2}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 89
    .line 90
    .line 91
    invoke-static {p0}, Ljava/lang/Character;->charCount(I)I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    add-int p2, p0, v4

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    if-ne p0, v2, :cond_6

    .line 99
    .line 100
    if-eqz v1, :cond_6

    .line 101
    .line 102
    const/16 p0, 0x20

    .line 103
    .line 104
    invoke-virtual {v0, p0}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 p2, p2, 0x1

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_6
    invoke-virtual {v0, p0}, Lyyds/ᛷᛲᲈᛲ;->ᛱᲀᲈᛲ(I)V

    .line 111
    .line 112
    .line 113
    invoke-static {p0}, Ljava/lang/Character;->charCount(I)I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    add-int/2addr p2, p0

    .line 118
    goto :goto_3

    .line 119
    :cond_7
    invoke-virtual {v0}, Lyyds/ᛷᛲᲈᛲ;->ᛸᛸᛷᛱ()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :cond_8
    invoke-virtual {p3, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0
.end method

.method public static ᛷᲈᲈᲁ(Landroid/app/Activity;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public static ᲀᛲᛳᲀ(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x7f

    .line 6
    .line 7
    if-gt v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static ᲇᲇᲇᛱ(Ljava/util/ArrayList;Lyyds/ᛲᛴᛷᲁ;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lyyds/ᛲᛴᛷᲁ;

    .line 23
    .line 24
    invoke-virtual {v0}, Lyyds/ᛲᛴᛷᲁ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1}, Lyyds/ᛲᛴᛷᲁ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1, v0}, Lyyds/ᛴᛶᲀᛲ;->ᛱᛳᲇ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public static ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    and-int/lit8 v2, p2, 0x1

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move v2, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move/from16 v2, p0

    .line 13
    .line 14
    :goto_0
    and-int/lit8 v4, p2, 0x2

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move/from16 v4, p1

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v5, p2, 0x8

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    if-eqz v5, :cond_2

    .line 29
    .line 30
    move v5, v3

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move v5, v6

    .line 33
    :goto_2
    and-int/lit8 v7, p2, 0x10

    .line 34
    .line 35
    if-eqz v7, :cond_3

    .line 36
    .line 37
    move v7, v3

    .line 38
    goto :goto_3

    .line 39
    :cond_3
    move v7, v6

    .line 40
    :goto_3
    and-int/lit8 v8, p2, 0x20

    .line 41
    .line 42
    if-eqz v8, :cond_4

    .line 43
    .line 44
    move v8, v3

    .line 45
    goto :goto_4

    .line 46
    :cond_4
    move v8, v6

    .line 47
    :goto_4
    and-int/lit8 v9, p2, 0x40

    .line 48
    .line 49
    if-eqz v9, :cond_5

    .line 50
    .line 51
    goto :goto_5

    .line 52
    :cond_5
    move v3, v6

    .line 53
    :goto_5
    move v6, v2

    .line 54
    :goto_6
    if-ge v6, v4, :cond_15

    .line 55
    .line 56
    invoke-virtual {v0, v6}, Ljava/lang/String;->codePointAt(I)I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    const/16 v10, 0x20

    .line 61
    .line 62
    const/16 v11, 0x80

    .line 63
    .line 64
    const/16 v12, 0x2b

    .line 65
    .line 66
    const/16 v13, 0x25

    .line 67
    .line 68
    const/16 v14, 0x7f

    .line 69
    .line 70
    if-lt v9, v10, :cond_9

    .line 71
    .line 72
    if-eq v9, v14, :cond_9

    .line 73
    .line 74
    if-lt v9, v11, :cond_6

    .line 75
    .line 76
    if-eqz v3, :cond_9

    .line 77
    .line 78
    :cond_6
    int-to-char v15, v9

    .line 79
    invoke-static {v1, v15}, Lyyds/ᛲᲇᛸᲇ;->ᛲᛶᛱᲈ(Ljava/lang/CharSequence;C)Z

    .line 80
    .line 81
    .line 82
    move-result v15

    .line 83
    if-nez v15, :cond_9

    .line 84
    .line 85
    if-ne v9, v13, :cond_7

    .line 86
    .line 87
    if-eqz v5, :cond_9

    .line 88
    .line 89
    if-eqz v7, :cond_7

    .line 90
    .line 91
    invoke-static {v0, v6, v4}, Lyyds/ᛴᛶᲀᛲ;->ᛷᛲᲈᛱ(Ljava/lang/String;II)Z

    .line 92
    .line 93
    .line 94
    move-result v15

    .line 95
    if-eqz v15, :cond_9

    .line 96
    .line 97
    :cond_7
    if-ne v9, v12, :cond_8

    .line 98
    .line 99
    if-eqz v8, :cond_8

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_8
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    add-int/2addr v6, v9

    .line 107
    goto :goto_6

    .line 108
    :cond_9
    :goto_7
    new-instance v9, Lyyds/ᛷᛲᲈᛲ;

    .line 109
    .line 110
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v9, v0, v2, v6}, Lyyds/ᛷᛲᲈᛲ;->ᛶᛴᛱᛲ(Ljava/lang/String;II)V

    .line 114
    .line 115
    .line 116
    const/4 v2, 0x0

    .line 117
    :goto_8
    if-ge v6, v4, :cond_14

    .line 118
    .line 119
    invoke-virtual {v0, v6}, Ljava/lang/String;->codePointAt(I)I

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    if-eqz v5, :cond_a

    .line 124
    .line 125
    const/16 v13, 0x9

    .line 126
    .line 127
    if-eq v15, v13, :cond_10

    .line 128
    .line 129
    const/16 v13, 0xa

    .line 130
    .line 131
    if-eq v15, v13, :cond_10

    .line 132
    .line 133
    const/16 v13, 0xc

    .line 134
    .line 135
    if-eq v15, v13, :cond_10

    .line 136
    .line 137
    const/16 v13, 0xd

    .line 138
    .line 139
    if-ne v15, v13, :cond_a

    .line 140
    .line 141
    goto :goto_b

    .line 142
    :cond_a
    const-string v13, "+"

    .line 143
    .line 144
    if-ne v15, v10, :cond_b

    .line 145
    .line 146
    const-string v11, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    .line 147
    .line 148
    if-ne v1, v11, :cond_b

    .line 149
    .line 150
    invoke-virtual {v9, v13}, Lyyds/ᛷᛲᲈᛲ;->ᛲᲀᛲᛲ(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :goto_9
    const/16 v11, 0x80

    .line 154
    .line 155
    goto :goto_b

    .line 156
    :cond_b
    if-ne v15, v12, :cond_d

    .line 157
    .line 158
    if-eqz v8, :cond_d

    .line 159
    .line 160
    if-eqz v5, :cond_c

    .line 161
    .line 162
    goto :goto_a

    .line 163
    :cond_c
    const-string v13, "%2B"

    .line 164
    .line 165
    :goto_a
    invoke-virtual {v9, v13}, Lyyds/ᛷᛲᲈᛲ;->ᛲᲀᛲᛲ(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_9

    .line 169
    :cond_d
    if-lt v15, v10, :cond_11

    .line 170
    .line 171
    if-eq v15, v14, :cond_11

    .line 172
    .line 173
    const/16 v11, 0x80

    .line 174
    .line 175
    if-lt v15, v11, :cond_e

    .line 176
    .line 177
    if-eqz v3, :cond_12

    .line 178
    .line 179
    :cond_e
    int-to-char v13, v15

    .line 180
    invoke-static {v1, v13}, Lyyds/ᛲᲇᛸᲇ;->ᛲᛶᛱᲈ(Ljava/lang/CharSequence;C)Z

    .line 181
    .line 182
    .line 183
    move-result v13

    .line 184
    if-nez v13, :cond_12

    .line 185
    .line 186
    const/16 v13, 0x25

    .line 187
    .line 188
    if-ne v15, v13, :cond_f

    .line 189
    .line 190
    if-eqz v5, :cond_12

    .line 191
    .line 192
    if-eqz v7, :cond_f

    .line 193
    .line 194
    invoke-static {v0, v6, v4}, Lyyds/ᛴᛶᲀᛲ;->ᛷᛲᲈᛱ(Ljava/lang/String;II)Z

    .line 195
    .line 196
    .line 197
    move-result v13

    .line 198
    if-nez v13, :cond_f

    .line 199
    .line 200
    goto :goto_c

    .line 201
    :cond_f
    invoke-virtual {v9, v15}, Lyyds/ᛷᛲᲈᛲ;->ᛱᲀᲈᛲ(I)V

    .line 202
    .line 203
    .line 204
    :cond_10
    :goto_b
    const/16 v11, 0x25

    .line 205
    .line 206
    goto :goto_e

    .line 207
    :cond_11
    const/16 v11, 0x80

    .line 208
    .line 209
    :cond_12
    :goto_c
    if-nez v2, :cond_13

    .line 210
    .line 211
    new-instance v2, Lyyds/ᛷᛲᲈᛲ;

    .line 212
    .line 213
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 214
    .line 215
    .line 216
    :cond_13
    invoke-virtual {v2, v15}, Lyyds/ᛷᛲᲈᛲ;->ᛱᲀᲈᛲ(I)V

    .line 217
    .line 218
    .line 219
    :goto_d
    invoke-virtual {v2}, Lyyds/ᛷᛲᲈᛲ;->ᛲᲈᲁ()Z

    .line 220
    .line 221
    .line 222
    move-result v13

    .line 223
    if-nez v13, :cond_10

    .line 224
    .line 225
    invoke-virtual {v2}, Lyyds/ᛷᛲᲈᛲ;->ᛷᲈᲈᲁ()B

    .line 226
    .line 227
    .line 228
    move-result v13

    .line 229
    and-int/lit16 v10, v13, 0xff

    .line 230
    .line 231
    const/16 v11, 0x25

    .line 232
    .line 233
    invoke-virtual {v9, v11}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 234
    .line 235
    .line 236
    shr-int/lit8 v10, v10, 0x4

    .line 237
    .line 238
    and-int/lit8 v10, v10, 0xf

    .line 239
    .line 240
    sget-object v16, Lyyds/ᛴᛶᲀᛲ;->ᛵᛸᛸᛷ:[C

    .line 241
    .line 242
    aget-char v10, v16, v10

    .line 243
    .line 244
    invoke-virtual {v9, v10}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 245
    .line 246
    .line 247
    and-int/lit8 v10, v13, 0xf

    .line 248
    .line 249
    aget-char v10, v16, v10

    .line 250
    .line 251
    invoke-virtual {v9, v10}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 252
    .line 253
    .line 254
    const/16 v10, 0x20

    .line 255
    .line 256
    const/16 v11, 0x80

    .line 257
    .line 258
    goto :goto_d

    .line 259
    :goto_e
    invoke-static {v15}, Ljava/lang/Character;->charCount(I)I

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    add-int/2addr v6, v10

    .line 264
    move v13, v11

    .line 265
    const/16 v10, 0x20

    .line 266
    .line 267
    const/16 v11, 0x80

    .line 268
    .line 269
    goto/16 :goto_8

    .line 270
    .line 271
    :cond_14
    invoke-virtual {v9}, Lyyds/ᛷᛲᲈᛲ;->ᛸᛸᛷᛱ()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    return-object v0

    .line 276
    :cond_15
    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    return-object v0
.end method
