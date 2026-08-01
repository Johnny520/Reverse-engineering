.class public final Lxhss/ᛷᛸᛵᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/util/Map;
.implements Ljava/io/Serializable;
.implements Lxhss/ᛱᛶᲈᛵ;


# static fields
.field public static final ᛳᲈᲈᛲ:Lxhss/ᛷᛸᛵᛶ;


# instance fields
.field public ᛱᛱᛲᲇ:[Ljava/lang/Object;

.field public ᛳᲁᲇᛸ:[Ljava/lang/Object;

.field public ᛷᛴᛷᛱ:[I

.field public ᛷᲁᲁ:Lxhss/ᲇᲁᛷᛶ;

.field public ᛸᛲᲀᛵ:I

.field public ᛸᛴᛶᛳ:I

.field public ᛸᛶᲈᛶ:Lxhss/ᲇᛴᛵᲈ;

.field public ᛸᛷᲈᲈ:I

.field public ᲀᲇᛳᲁ:I

.field public ᲇᛴᲇᛵ:[I

.field public ᲇᛶᛴᲀ:I

.field public ᲇᛸᛳᲁ:Z

.field public ᲈᛳᲀ:Lxhss/ᲇᛴᛵᲈ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᛷᛸᛵᛶ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lxhss/ᛷᛸᛵᛶ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛸᛳᲁ:Z

    .line 9
    .line 10
    sput-object v0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲈᲈᛲ:Lxhss/ᛷᛸᛵᛶ;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(I)V
    .locals 4

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    new-array v0, p1, [Ljava/lang/Object;

    .line 4
    .line 5
    new-array v1, p1, [I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ge p1, v2, :cond_0

    .line 9
    .line 10
    move p1, v2

    .line 11
    :cond_0
    mul-int/lit8 p1, p1, 0x3

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    new-array v3, p1, [I

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 26
    .line 27
    iput-object v1, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛴᲇᛵ:[I

    .line 28
    .line 29
    iput-object v3, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    iput v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛶᛴᲀ:I

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 36
    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    add-int/2addr p1, v2

    .line 42
    iput p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛴᛶᛳ:I

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    const-string p0, "capacity must be non-negative."

    .line 46
    .line 47
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    throw p0
.end method


# virtual methods
.method public final clear()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 5
    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-ltz v0, :cond_1

    .line 10
    .line 11
    move v2, v1

    .line 12
    :goto_0
    iget-object v3, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛴᲇᛵ:[I

    .line 13
    .line 14
    aget v4, v3, v2

    .line 15
    .line 16
    if-ltz v4, :cond_0

    .line 17
    .line 18
    iget-object v5, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 19
    .line 20
    aput v1, v5, v4

    .line 21
    .line 22
    const/4 v4, -0x1

    .line 23
    aput v4, v3, v2

    .line 24
    .line 25
    :cond_0
    if-eq v2, v0, :cond_1

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 31
    .line 32
    iget v2, p0, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lxhss/ᛵᛶᲀᲇ;->ᲀᲇᛳᲁ([Ljava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget v2, p0, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 42
    .line 43
    invoke-static {v0, v1, v2}, Lxhss/ᛵᛶᲀᲇ;->ᲀᲇᛳᲁ([Ljava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iput v1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛷᲈᲈ:I

    .line 47
    .line 48
    iput v1, p0, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 49
    .line 50
    iget v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛲᲀᛵ:I

    .line 51
    .line 52
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    iput v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛲᲀᛵ:I

    .line 55
    .line 56
    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 2
    .line 3
    :cond_0
    const/4 v1, -0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    if-ltz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛴᲇᛵ:[I

    .line 8
    .line 9
    aget v1, v1, v0

    .line 10
    .line 11
    if-ltz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 14
    .line 15
    aget-object v1, v1, v0

    .line 16
    .line 17
    invoke-static {v1, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    move v1, v0

    .line 24
    :cond_1
    if-ltz v1, :cond_2

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_2
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛶᲈᛶ:Lxhss/ᲇᛴᛵᲈ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lxhss/ᲇᛴᛵᲈ;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lxhss/ᲇᛴᛵᲈ;-><init>(Lxhss/ᛷᛸᛵᛶ;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛶᲈᛶ:Lxhss/ᲇᛴᛵᲈ;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-eq p1, p0, :cond_3

    .line 2
    .line 3
    instance-of v0, p1, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    check-cast p1, Ljava/util/Map;

    .line 9
    .line 10
    iget v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛷᲈᲈ:I

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ne v0, v2, :cond_2

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    :try_start_0
    check-cast v0, Ljava/util/Map$Entry;

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p0, v2}, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ(Ljava/lang/Object;)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-gez v2, :cond_1

    .line 49
    .line 50
    move v0, v1

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object v3, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 53
    .line 54
    aget-object v2, v3, v2

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v2, v0}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    :goto_0
    if-nez v0, :cond_0

    .line 65
    .line 66
    :catch_0
    :cond_2
    return v1

    .line 67
    :cond_3
    const/4 p0, 0x1

    .line 68
    return p0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-gez p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    iget-object p0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 10
    .line 11
    aget-object p0, p0, p1

    .line 12
    .line 13
    return-object p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    new-instance v0, Lxhss/ᲈᛴᲈᛵ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lxhss/ᲈᛴᲈᛵ;-><init>(Lxhss/ᛷᛸᛵᛶ;I)V

    .line 5
    .line 6
    .line 7
    move p0, v1

    .line 8
    :goto_0
    invoke-virtual {v0}, Lxhss/ᛵᛶᛲᛵ;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    iget v2, v0, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 15
    .line 16
    iget-object v3, v0, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lxhss/ᛷᛸᛵᛶ;

    .line 19
    .line 20
    iget v4, v3, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 21
    .line 22
    if-ge v2, v4, :cond_2

    .line 23
    .line 24
    add-int/lit8 v4, v2, 0x1

    .line 25
    .line 26
    iput v4, v0, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 27
    .line 28
    iput v2, v0, Lxhss/ᛵᛶᛲᛵ;->ᛳᲁᲇᛸ:I

    .line 29
    .line 30
    iget-object v4, v3, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 31
    .line 32
    aget-object v2, v4, v2

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    move v2, v1

    .line 42
    :goto_1
    iget-object v3, v3, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 43
    .line 44
    iget v4, v0, Lxhss/ᛵᛶᛲᛵ;->ᛳᲁᲇᛸ:I

    .line 45
    .line 46
    aget-object v3, v3, v4

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    move v3, v1

    .line 56
    :goto_2
    xor-int/2addr v2, v3

    .line 57
    invoke-virtual {v0}, Lxhss/ᛵᛶᛲᛵ;->ᛳᲁᲇᛸ()V

    .line 58
    .line 59
    .line 60
    add-int/2addr p0, v2

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 63
    .line 64
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    :cond_3
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛷᲈᲈ:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᲈᛳᲀ:Lxhss/ᲇᛴᛵᲈ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lxhss/ᲇᛴᛵᲈ;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Lxhss/ᲇᛴᛵᲈ;-><init>(Lxhss/ᛷᛸᛵᛶ;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᲈᛳᲀ:Lxhss/ᲇᛴᛵᲈ;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 15
    .line 16
    array-length v0, v0

    .line 17
    if-ltz v0, :cond_2

    .line 18
    .line 19
    new-array v0, v0, [Ljava/lang/Object;

    .line 20
    .line 21
    iput-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 22
    .line 23
    :goto_0
    if-gez p1, :cond_1

    .line 24
    .line 25
    neg-int p0, p1

    .line 26
    add-int/lit8 p0, p0, -0x1

    .line 27
    .line 28
    aget-object p1, v0, p0

    .line 29
    .line 30
    aput-object p2, v0, p0

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    aput-object p2, v0, p1

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_2
    const-string p0, "capacity must be non-negative."

    .line 37
    .line 38
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p0, v0}, Lxhss/ᛷᛸᛵᛶ;->ᲇᛴᲇᛵ(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_5

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/util/Map$Entry;

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p0, v1}, Lxhss/ᛷᛸᛵᛶ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iget-object v2, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    iget-object v2, p0, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 52
    .line 53
    array-length v2, v2

    .line 54
    if-ltz v2, :cond_4

    .line 55
    .line 56
    new-array v2, v2, [Ljava/lang/Object;

    .line 57
    .line 58
    iput-object v2, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 59
    .line 60
    :goto_1
    if-ltz v1, :cond_3

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    aput-object v0, v2, v1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    neg-int v1, v1

    .line 70
    add-int/lit8 v1, v1, -0x1

    .line 71
    .line 72
    aget-object v3, v2, v1

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {v4, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-nez v3, :cond_1

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    aput-object v0, v2, v1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    const-string p0, "capacity must be non-negative."

    .line 92
    .line 93
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_5
    :goto_2
    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-gez p1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 13
    .line 14
    aget-object v0, v0, p1

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->ᛸᛴᛶᛳ(I)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛷᲈᲈ:I

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget v1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛷᲈᲈ:I

    .line 4
    .line 5
    mul-int/lit8 v1, v1, 0x3

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x2

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const-string v1, "{"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    new-instance v1, Lxhss/ᲈᛴᲈᛵ;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, p0, v2}, Lxhss/ᲈᛴᲈᛵ;-><init>(Lxhss/ᛷᛸᛵᛶ;I)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {v1}, Lxhss/ᛵᛶᛲᛵ;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_4

    .line 28
    .line 29
    if-lez v2, :cond_0

    .line 30
    .line 31
    const-string p0, ", "

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :cond_0
    iget p0, v1, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 37
    .line 38
    iget-object v3, v1, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Lxhss/ᛷᛸᛵᛶ;

    .line 41
    .line 42
    iget v4, v3, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 43
    .line 44
    if-ge p0, v4, :cond_3

    .line 45
    .line 46
    add-int/lit8 v4, p0, 0x1

    .line 47
    .line 48
    iput v4, v1, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 49
    .line 50
    iput p0, v1, Lxhss/ᛵᛶᛲᛵ;->ᛳᲁᲇᛸ:I

    .line 51
    .line 52
    iget-object v4, v3, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 53
    .line 54
    aget-object p0, v4, p0

    .line 55
    .line 56
    const-string v4, "(this Map)"

    .line 57
    .line 58
    if-ne p0, v3, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    :goto_1
    const/16 p0, 0x3d

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget-object p0, v3, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 73
    .line 74
    iget v5, v1, Lxhss/ᛵᛶᛲᛵ;->ᛳᲁᲇᛸ:I

    .line 75
    .line 76
    aget-object p0, p0, v5

    .line 77
    .line 78
    if-ne p0, v3, :cond_2

    .line 79
    .line 80
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    :goto_2
    invoke-virtual {v1}, Lxhss/ᛵᛶᛲᛵ;->ᛳᲁᲇᛸ()V

    .line 88
    .line 89
    .line 90
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 94
    .line 95
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 96
    .line 97
    .line 98
    throw p0

    .line 99
    :cond_4
    const-string p0, "}"

    .line 100
    .line 101
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᲁᲁ:Lxhss/ᲇᲁᛷᛶ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lxhss/ᲇᲁᛷᛶ;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lxhss/ᲇᲁᛷᛶ;-><init>(Lxhss/ᛷᛸᛵᛶ;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᲁᲁ:Lxhss/ᲇᲁᛷᛶ;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public final ᛱᛱᛲᲇ()V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛸᛳᲁ:Z

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public final ᛳᲁᲇᛸ(Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    iget v3, p0, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 6
    .line 7
    if-ge v1, v3, :cond_3

    .line 8
    .line 9
    iget-object v3, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛴᲇᛵ:[I

    .line 10
    .line 11
    aget v4, v3, v1

    .line 12
    .line 13
    if-ltz v4, :cond_2

    .line 14
    .line 15
    iget-object v5, p0, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 16
    .line 17
    aget-object v6, v5, v1

    .line 18
    .line 19
    aput-object v6, v5, v2

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    aget-object v5, v0, v1

    .line 24
    .line 25
    aput-object v5, v0, v2

    .line 26
    .line 27
    :cond_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    aput v4, v3, v2

    .line 30
    .line 31
    iget-object v3, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 32
    .line 33
    add-int/lit8 v5, v2, 0x1

    .line 34
    .line 35
    aput v5, v3, v4

    .line 36
    .line 37
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    iget-object p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 43
    .line 44
    invoke-static {p1, v2, v3}, Lxhss/ᛵᛶᲀᲇ;->ᲀᲇᛳᲁ([Ljava/lang/Object;II)V

    .line 45
    .line 46
    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    iget p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 50
    .line 51
    invoke-static {v0, v2, p1}, Lxhss/ᛵᛶᲀᲇ;->ᲀᲇᛳᲁ([Ljava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    :cond_4
    iput v2, p0, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 55
    .line 56
    return-void
.end method

.method public final ᛷᛴᛷᛱ(Ljava/lang/Object;)I
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->ᲇᛶᛴᲀ(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛶᛴᲀ:I

    .line 6
    .line 7
    :goto_0
    iget-object v2, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 8
    .line 9
    aget v2, v2, v0

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    return v3

    .line 15
    :cond_0
    iget-object v4, p0, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 16
    .line 17
    add-int/lit8 v2, v2, -0x1

    .line 18
    .line 19
    aget-object v4, v4, v2

    .line 20
    .line 21
    invoke-static {v4, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    return v2

    .line 28
    :cond_1
    add-int/2addr v1, v3

    .line 29
    if-gez v1, :cond_2

    .line 30
    .line 31
    return v3

    .line 32
    :cond_2
    add-int/lit8 v2, v0, -0x1

    .line 33
    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 37
    .line 38
    array-length v0, v0

    .line 39
    add-int/lit8 v0, v0, -0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    move v0, v2

    .line 43
    goto :goto_0
.end method

.method public final ᛷᛵᛵᲈ(Ljava/lang/Object;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 2
    .line 3
    .line 4
    :goto_0
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->ᲇᛶᛴᲀ(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget v1, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛶᛴᲀ:I

    .line 9
    .line 10
    mul-int/lit8 v1, v1, 0x2

    .line 11
    .line 12
    iget-object v2, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 13
    .line 14
    array-length v2, v2

    .line 15
    div-int/lit8 v2, v2, 0x2

    .line 16
    .line 17
    if-le v1, v2, :cond_0

    .line 18
    .line 19
    move v1, v2

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    :goto_1
    iget-object v3, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 22
    .line 23
    aget v4, v3, v0

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    if-nez v4, :cond_3

    .line 27
    .line 28
    iget v1, p0, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 29
    .line 30
    iget-object v4, p0, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 31
    .line 32
    array-length v6, v4

    .line 33
    if-lt v1, v6, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0, v5}, Lxhss/ᛷᛸᛵᛶ;->ᲇᛴᲇᛵ(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    add-int/lit8 v6, v1, 0x1

    .line 40
    .line 41
    iput v6, p0, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 42
    .line 43
    aput-object p1, v4, v1

    .line 44
    .line 45
    iget-object p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛴᲇᛵ:[I

    .line 46
    .line 47
    aput v0, p1, v1

    .line 48
    .line 49
    aput v6, v3, v0

    .line 50
    .line 51
    iget p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛷᲈᲈ:I

    .line 52
    .line 53
    add-int/2addr p1, v5

    .line 54
    iput p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛷᲈᲈ:I

    .line 55
    .line 56
    iget p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛲᲀᛵ:I

    .line 57
    .line 58
    add-int/2addr p1, v5

    .line 59
    iput p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛲᲀᛵ:I

    .line 60
    .line 61
    iget p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛶᛴᲀ:I

    .line 62
    .line 63
    if-le v2, p1, :cond_2

    .line 64
    .line 65
    iput v2, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛶᛴᲀ:I

    .line 66
    .line 67
    :cond_2
    return v1

    .line 68
    :cond_3
    iget-object v3, p0, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 69
    .line 70
    add-int/lit8 v6, v4, -0x1

    .line 71
    .line 72
    aget-object v3, v3, v6

    .line 73
    .line 74
    invoke-static {v3, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_4

    .line 79
    .line 80
    neg-int p0, v4

    .line 81
    return p0

    .line 82
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    if-le v2, v1, :cond_5

    .line 85
    .line 86
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 87
    .line 88
    array-length v0, v0

    .line 89
    mul-int/lit8 v0, v0, 0x2

    .line 90
    .line 91
    invoke-virtual {p0, v0}, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ(I)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_5
    add-int/lit8 v3, v0, -0x1

    .line 96
    .line 97
    if-nez v0, :cond_6

    .line 98
    .line 99
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 100
    .line 101
    array-length v0, v0

    .line 102
    sub-int/2addr v0, v5

    .line 103
    goto :goto_1

    .line 104
    :cond_6
    move v0, v3

    .line 105
    goto :goto_1
.end method

.method public final ᛸᛴᛶᛳ(I)V
    .locals 9

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aput-object v1, v0, p1

    .line 5
    .line 6
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    aput-object v1, v0, p1

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛴᲇᛵ:[I

    .line 13
    .line 14
    aget v0, v0, p1

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    move v2, v0

    .line 18
    move v3, v1

    .line 19
    :cond_1
    add-int/lit8 v4, v0, -0x1

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 24
    .line 25
    array-length v0, v0

    .line 26
    add-int/lit8 v0, v0, -0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    move v0, v4

    .line 30
    :goto_1
    iget-object v4, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 31
    .line 32
    aget v5, v4, v0

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    iget v6, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛶᛴᲀ:I

    .line 37
    .line 38
    if-le v3, v6, :cond_3

    .line 39
    .line 40
    aput v1, v4, v2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_3
    if-nez v5, :cond_4

    .line 44
    .line 45
    aput v1, v4, v2

    .line 46
    .line 47
    :goto_2
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛴᲇᛵ:[I

    .line 48
    .line 49
    const/4 v1, -0x1

    .line 50
    aput v1, v0, p1

    .line 51
    .line 52
    iget p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛷᲈᲈ:I

    .line 53
    .line 54
    add-int/2addr p1, v1

    .line 55
    iput p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛷᲈᲈ:I

    .line 56
    .line 57
    iget p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛲᲀᛵ:I

    .line 58
    .line 59
    add-int/lit8 p1, p1, 0x1

    .line 60
    .line 61
    iput p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛲᲀᛵ:I

    .line 62
    .line 63
    return-void

    .line 64
    :cond_4
    iget-object v4, p0, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 65
    .line 66
    add-int/lit8 v6, v5, -0x1

    .line 67
    .line 68
    aget-object v4, v4, v6

    .line 69
    .line 70
    invoke-virtual {p0, v4}, Lxhss/ᛷᛸᛵᛶ;->ᲇᛶᛴᲀ(Ljava/lang/Object;)I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    sub-int/2addr v4, v0

    .line 75
    iget-object v7, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 76
    .line 77
    array-length v8, v7

    .line 78
    add-int/lit8 v8, v8, -0x1

    .line 79
    .line 80
    and-int/2addr v4, v8

    .line 81
    if-lt v4, v3, :cond_1

    .line 82
    .line 83
    aput v5, v7, v2

    .line 84
    .line 85
    iget-object v3, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛴᲇᛵ:[I

    .line 86
    .line 87
    aput v2, v3, v6

    .line 88
    .line 89
    goto :goto_0
.end method

.method public final ᲀᲇᛳᲁ(I)V
    .locals 5

    .line 1
    iget v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛲᲀᛵ:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛲᲀᛵ:I

    .line 6
    .line 7
    iget v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 8
    .line 9
    iget v1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛷᲈᲈ:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-le v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    new-array v0, p1, [I

    .line 18
    .line 19
    iput-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 20
    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    add-int/lit8 p1, p1, 0x1

    .line 26
    .line 27
    iput p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛴᛶᛳ:I

    .line 28
    .line 29
    :goto_0
    iget p1, p0, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 30
    .line 31
    if-ge v2, p1, :cond_4

    .line 32
    .line 33
    add-int/lit8 p1, v2, 0x1

    .line 34
    .line 35
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 36
    .line 37
    aget-object v0, v0, v2

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lxhss/ᛷᛸᛵᛶ;->ᲇᛶᛴᲀ(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget v1, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛶᛴᲀ:I

    .line 44
    .line 45
    :goto_1
    iget-object v3, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 46
    .line 47
    aget v4, v3, v0

    .line 48
    .line 49
    if-nez v4, :cond_1

    .line 50
    .line 51
    aput p1, v3, v0

    .line 52
    .line 53
    iget-object v1, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛴᲇᛵ:[I

    .line 54
    .line 55
    aput v0, v1, v2

    .line 56
    .line 57
    move v2, p1

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    add-int/lit8 v1, v1, -0x1

    .line 60
    .line 61
    if-ltz v1, :cond_3

    .line 62
    .line 63
    add-int/lit8 v4, v0, -0x1

    .line 64
    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    array-length v0, v3

    .line 68
    add-int/lit8 v0, v0, -0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move v0, v4

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    const-string p0, "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"

    .line 74
    .line 75
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    return-void
.end method

.method public final ᲇᛴᲇᛵ(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    iget v2, p0, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 5
    .line 6
    sub-int/2addr v1, v2

    .line 7
    iget v3, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛷᲈᲈ:I

    .line 8
    .line 9
    sub-int v3, v2, v3

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    if-ge v1, p1, :cond_0

    .line 13
    .line 14
    add-int/2addr v1, v3

    .line 15
    if-lt v1, p1, :cond_0

    .line 16
    .line 17
    array-length v1, v0

    .line 18
    div-int/lit8 v1, v1, 0x4

    .line 19
    .line 20
    if-lt v3, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, v4}, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ(Z)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    add-int/2addr v2, p1

    .line 27
    if-ltz v2, :cond_7

    .line 28
    .line 29
    array-length p1, v0

    .line 30
    if-le v2, p1, :cond_6

    .line 31
    .line 32
    array-length p1, v0

    .line 33
    shr-int/lit8 v1, p1, 0x1

    .line 34
    .line 35
    add-int/2addr p1, v1

    .line 36
    sub-int v1, p1, v2

    .line 37
    .line 38
    if-gez v1, :cond_1

    .line 39
    .line 40
    move p1, v2

    .line 41
    :cond_1
    const v1, 0x7ffffff7

    .line 42
    .line 43
    .line 44
    sub-int v3, p1, v1

    .line 45
    .line 46
    if-lez v3, :cond_3

    .line 47
    .line 48
    if-le v2, v1, :cond_2

    .line 49
    .line 50
    const p1, 0x7fffffff

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move p1, v1

    .line 55
    :cond_3
    :goto_0
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 60
    .line 61
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_1

    .line 70
    :cond_4
    const/4 v0, 0x0

    .line 71
    :goto_1
    iput-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛴᲇᛵ:[I

    .line 74
    .line 75
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᲇᛴᲇᛵ:[I

    .line 80
    .line 81
    if-ge p1, v4, :cond_5

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    move v4, p1

    .line 85
    :goto_2
    mul-int/lit8 v4, v4, 0x3

    .line 86
    .line 87
    invoke-static {v4}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iget-object v0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ:[I

    .line 92
    .line 93
    array-length v0, v0

    .line 94
    if-le p1, v0, :cond_6

    .line 95
    .line 96
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ(I)V

    .line 97
    .line 98
    .line 99
    :cond_6
    return-void

    .line 100
    :cond_7
    new-instance p0, Ljava/lang/OutOfMemoryError;

    .line 101
    .line 102
    invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V

    .line 103
    .line 104
    .line 105
    throw p0
.end method

.method public final ᲇᛶᛴᲀ(Ljava/lang/Object;)I
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    const v0, -0x61c88647

    .line 10
    .line 11
    .line 12
    mul-int/2addr p1, v0

    .line 13
    iget p0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛴᛶᛳ:I

    .line 14
    .line 15
    ushr-int p0, p1, p0

    .line 16
    .line 17
    return p0
.end method
