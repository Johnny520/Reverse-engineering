.class public final Lxhss/ᲈᛶᲀᲈ;
.super Lxhss/ᛸᛶᲈᛶ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Ljava/io/Serializable;


# static fields
.field public static final ᛷᛴᛷᛱ:Lxhss/ᲈᛶᲀᲈ;


# instance fields
.field public ᛱᛱᛲᲇ:[Ljava/lang/Object;

.field public ᛳᲁᲇᛸ:I

.field public ᲇᛴᲇᛵ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᲈᛶᲀᲈ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lxhss/ᲈᛶᲀᲈ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lxhss/ᲈᛶᲀᲈ;->ᲇᛴᲇᛵ:Z

    .line 9
    .line 10
    sput-object v0, Lxhss/ᲈᛶᲀᲈ;->ᛷᛴᛷᛱ:Lxhss/ᲈᛶᲀᲈ;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    .line 6
    new-array p1, p1, [Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "capacity must be non-negative."

    .line 12
    .line 13
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public static final synthetic ᛳᲁᲇᛸ(Lxhss/ᲈᛶᲀᲈ;)I
    .locals 0

    .line 1
    iget p0, p0, Ljava/util/AbstractList;->modCount:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxhss/ᲈᛶᲀᲈ;->ᲇᛶᛴᲀ()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 5
    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    if-gt p1, v0, :cond_0

    .line 9
    .line 10
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    add-int/2addr v0, v1

    .line 14
    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 15
    .line 16
    invoke-virtual {p0, p1, v1}, Lxhss/ᲈᛶᲀᲈ;->ᲀᲇᛳᲁ(II)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 20
    .line 21
    aput-object p2, p0, p1

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 25
    .line 26
    const-string p2, "index: "

    .line 27
    .line 28
    const-string v1, ", size: "

    .line 29
    .line 30
    invoke-static {p1, v0, p2, v1}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᲈᛶ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p0
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 3

    .line 38
    invoke-virtual {p0}, Lxhss/ᲈᛶᲀᲈ;->ᲇᛶᛴᲀ()V

    .line 39
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 40
    iget v1, p0, Ljava/util/AbstractList;->modCount:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Ljava/util/AbstractList;->modCount:I

    .line 41
    invoke-virtual {p0, v0, v2}, Lxhss/ᲈᛶᲀᲈ;->ᲀᲇᛳᲁ(II)V

    .line 42
    iget-object p0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    aput-object p1, p0, v0

    return v2
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxhss/ᲈᛶᲀᲈ;->ᲇᛶᛴᲀ()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 5
    .line 6
    if-ltz p1, :cond_1

    .line 7
    .line 8
    if-gt p1, v0, :cond_1

    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, p1, p2, v0}, Lxhss/ᲈᛶᲀᲈ;->ᲇᛴᲇᛵ(ILjava/util/Collection;I)V

    .line 15
    .line 16
    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_1
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 24
    .line 25
    const-string p2, "index: "

    .line 26
    .line 27
    const-string v1, ", size: "

    .line 28
    .line 29
    invoke-static {p1, v0, p2, v1}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᲈᛶ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 2

    .line 37
    invoke-virtual {p0}, Lxhss/ᲈᛶᲀᲈ;->ᲇᛶᛴᲀ()V

    .line 38
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    .line 39
    iget v1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    invoke-virtual {p0, v1, p1, v0}, Lxhss/ᲈᛶᲀᲈ;->ᲇᛴᲇᛵ(ILjava/util/Collection;I)V

    if-lez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public final clear()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxhss/ᲈᛶᲀᲈ;->ᲇᛶᛴᲀ()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iget v1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lxhss/ᲈᛶᲀᲈ;->ᛸᛲᲀᛵ(II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    if-eq p1, p0, :cond_3

    .line 2
    .line 3
    instance-of v0, p1, Ljava/util/List;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    check-cast p1, Ljava/util/List;

    .line 9
    .line 10
    iget-object v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 11
    .line 12
    iget p0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eq p0, v2, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move v2, v1

    .line 22
    :goto_0
    if-ge v2, p0, :cond_3

    .line 23
    .line 24
    aget-object v3, v0, v2

    .line 25
    .line 26
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-static {v3, v4}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    :goto_1
    return v1

    .line 41
    :cond_3
    const/4 p0, 0x1

    .line 42
    return p0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 8
    .line 9
    aget-object p0, p0, p1

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 13
    .line 14
    const-string v1, "index: "

    .line 15
    .line 16
    const-string v2, ", size: "

    .line 17
    .line 18
    invoke-static {p1, v0, v1, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᲈᛶ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 2
    .line 3
    iget p0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, p0, :cond_1

    .line 9
    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move v4, v2

    .line 22
    :goto_1
    add-int/2addr v1, v4

    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return v1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 7
    .line 8
    aget-object v1, v1, v0

    .line 9
    .line 10
    invoke-static {v1, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p0, -0x1

    .line 21
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

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

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lxhss/ᲈᛶᲀᲈ;->listIterator(I)Ljava/util/ListIterator;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    :goto_0
    if-ltz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    invoke-static {v1, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return v0

    .line 18
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 p0, -0x1

    .line 22
    return p0
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 27
    invoke-virtual {p0, v0}, Lxhss/ᲈᛶᲀᲈ;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    return-object p0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    if-gt p1, v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lxhss/ᲈᛳᛲᛶ;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lxhss/ᲈᛳᛲᛶ;-><init>(Lxhss/ᲈᛶᲀᲈ;I)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 14
    .line 15
    const-string v1, "index: "

    .line 16
    .line 17
    const-string v2, ", size: "

    .line 18
    .line 19
    invoke-static {p1, v0, v1, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᲈᛶ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxhss/ᲈᛶᲀᲈ;->ᲇᛶᛴᲀ()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lxhss/ᲈᛶᲀᲈ;->indexOf(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-ltz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    if-ltz p1, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxhss/ᲈᛶᲀᲈ;->ᲇᛶᛴᲀ()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v1, v0, p1, v1}, Lxhss/ᲈᛶᲀᲈ;->ᛸᛷᲈᲈ(IILjava/util/Collection;Z)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-lez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    return v1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxhss/ᲈᛶᲀᲈ;->ᲇᛶᛴᲀ()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {p0, v1, v0, p1, v2}, Lxhss/ᲈᛶᲀᲈ;->ᛸᛷᲈᲈ(IILjava/util/Collection;Z)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-lez p0, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    return v1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxhss/ᲈᛶᲀᲈ;->ᲇᛶᛴᲀ()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 5
    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    if-ge p1, v0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 11
    .line 12
    aget-object v0, p0, p1

    .line 13
    .line 14
    aput-object p2, p0, p1

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 18
    .line 19
    const-string p2, "index: "

    .line 20
    .line 21
    const-string v1, ", size: "

    .line 22
    .line 23
    invoke-static {p1, v0, p2, v1}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᲈᛶ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p0
.end method

.method public final subList(II)Ljava/util/List;
    .locals 7

    .line 1
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lxhss/ᛶᛵᛱ;->ᛱᛱᛲᲇ(III)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lxhss/ᛷᲁᲇᛳ;

    .line 7
    .line 8
    iget-object v2, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 9
    .line 10
    sub-int v4, p2, p1

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    move-object v6, p0

    .line 14
    move v3, p1

    .line 15
    invoke-direct/range {v1 .. v6}, Lxhss/ᛷᲁᲇᛳ;-><init>([Ljava/lang/Object;IILxhss/ᛷᲁᲇᛳ;Lxhss/ᲈᛶᲀᲈ;)V

    .line 16
    .line 17
    .line 18
    return-object v1
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 2

    .line 30
    iget-object v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    iget p0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 31
    array-length v1, v0

    invoke-static {p0, v1}, Lxhss/ᛵᛶᲀᲇ;->ᛱᛱᛲᲇ(II)V

    const/4 v1, 0x0

    .line 32
    invoke-static {v0, v1, p0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    iget v1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 3
    .line 4
    iget-object v2, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {v2, v3, v1, p0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;IILjava/lang/Class;)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-static {v3, v3, v1, v2, p1}, Lxhss/ᛲᛷᲁᲁ;->ᛳᲈᲈᛲ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget p0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 22
    .line 23
    array-length v0, p1

    .line 24
    if-ge p0, v0, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    aput-object v0, p1, p0

    .line 28
    .line 29
    :cond_1
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 5
    .line 6
    invoke-static {v0, v1, v2, p0}, Lxhss/ᛵᛶᲀᲇ;->ᛸᛲᲀᛵ([Ljava/lang/Object;IILxhss/ᛸᛶᲈᛶ;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final ᛱᛱᛲᲇ(I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxhss/ᲈᛶᲀᲈ;->ᲇᛶᛴᲀ()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 5
    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    if-ge p1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lxhss/ᲈᛶᲀᲈ;->ᛸᛴᛶᛳ(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 16
    .line 17
    const-string v1, "index: "

    .line 18
    .line 19
    const-string v2, ", size: "

    .line 20
    .line 21
    invoke-static {p1, v0, v1, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᲈᛶ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p0
.end method

.method public final ᛷᛴᛷᛱ(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 6
    .line 7
    invoke-virtual {p0, p1, v1}, Lxhss/ᲈᛶᲀᲈ;->ᲀᲇᛳᲁ(II)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 11
    .line 12
    aput-object p2, p0, p1

    .line 13
    .line 14
    return-void
.end method

.method public final ᛷᛵᛵᲈ()I
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    return p0
.end method

.method public final ᛸᛲᲀᛵ(II)V
    .locals 3

    .line 1
    if-lez p2, :cond_0

    .line 2
    .line 3
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 10
    .line 11
    add-int v1, p1, p2

    .line 12
    .line 13
    iget v2, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 14
    .line 15
    invoke-static {p1, v1, v2, v0, v0}, Lxhss/ᛲᛷᲁᲁ;->ᛳᲈᲈᛲ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 19
    .line 20
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 21
    .line 22
    sub-int v1, v0, p2

    .line 23
    .line 24
    invoke-static {p1, v1, v0}, Lxhss/ᛵᛶᲀᲇ;->ᲀᲇᛳᲁ([Ljava/lang/Object;II)V

    .line 25
    .line 26
    .line 27
    iget p1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 28
    .line 29
    sub-int/2addr p1, p2

    .line 30
    iput p1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 31
    .line 32
    return-void
.end method

.method public final ᛸᛴᛶᛳ(I)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 6
    .line 7
    iget-object v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 8
    .line 9
    aget-object v1, v0, p1

    .line 10
    .line 11
    add-int/lit8 v2, p1, 0x1

    .line 12
    .line 13
    iget v3, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 14
    .line 15
    invoke-static {p1, v2, v3, v0, v0}, Lxhss/ᛲᛷᲁᲁ;->ᛳᲈᲈᛲ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 19
    .line 20
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 21
    .line 22
    add-int/lit8 v2, v0, -0x1

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    aput-object v3, p1, v2

    .line 26
    .line 27
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    iput v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 30
    .line 31
    return-object v1
.end method

.method public final ᛸᛷᲈᲈ(IILjava/util/Collection;Z)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 4
    .line 5
    if-ge v0, p2, :cond_1

    .line 6
    .line 7
    add-int v3, p1, v0

    .line 8
    .line 9
    aget-object v2, v2, v3

    .line 10
    .line 11
    invoke-interface {p3, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ne v2, p4, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 18
    .line 19
    add-int/lit8 v4, v1, 0x1

    .line 20
    .line 21
    add-int/2addr v1, p1

    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    aget-object v3, v2, v3

    .line 25
    .line 26
    aput-object v3, v2, v1

    .line 27
    .line 28
    move v1, v4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    sub-int p3, p2, v1

    .line 34
    .line 35
    add-int/2addr p2, p1

    .line 36
    iget p4, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 37
    .line 38
    add-int/2addr p1, v1

    .line 39
    invoke-static {p1, p2, p4, v2, v2}, Lxhss/ᛲᛷᲁᲁ;->ᛳᲈᲈᛲ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 43
    .line 44
    iget p2, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 45
    .line 46
    sub-int p4, p2, p3

    .line 47
    .line 48
    invoke-static {p1, p4, p2}, Lxhss/ᛵᛶᲀᲇ;->ᲀᲇᛳᲁ([Ljava/lang/Object;II)V

    .line 49
    .line 50
    .line 51
    if-lez p3, :cond_2

    .line 52
    .line 53
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 54
    .line 55
    add-int/lit8 p1, p1, 0x1

    .line 56
    .line 57
    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 58
    .line 59
    :cond_2
    iget p1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 60
    .line 61
    sub-int/2addr p1, p3

    .line 62
    iput p1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 63
    .line 64
    return p3
.end method

.method public final ᲀᲇᛳᲁ(II)V
    .locals 5

    .line 1
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    add-int/2addr v0, p2

    .line 4
    if-ltz v0, :cond_4

    .line 5
    .line 6
    iget-object v1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    if-le v0, v2, :cond_3

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    shr-int/lit8 v3, v2, 0x1

    .line 13
    .line 14
    add-int/2addr v2, v3

    .line 15
    sub-int v3, v2, v0

    .line 16
    .line 17
    if-gez v3, :cond_0

    .line 18
    .line 19
    move v2, v0

    .line 20
    :cond_0
    const v3, 0x7ffffff7

    .line 21
    .line 22
    .line 23
    sub-int v4, v2, v3

    .line 24
    .line 25
    if-lez v4, :cond_2

    .line 26
    .line 27
    if-le v0, v3, :cond_1

    .line 28
    .line 29
    const v2, 0x7fffffff

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v2, v3

    .line 34
    :cond_2
    :goto_0
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 39
    .line 40
    :cond_3
    iget v0, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 41
    .line 42
    add-int v2, p1, p2

    .line 43
    .line 44
    invoke-static {v2, p1, v0, v1, v1}, Lxhss/ᛲᛷᲁᲁ;->ᛳᲈᲈᛲ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget p1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 48
    .line 49
    add-int/2addr p1, p2

    .line 50
    iput p1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 51
    .line 52
    return-void

    .line 53
    :cond_4
    new-instance p0, Ljava/lang/OutOfMemoryError;

    .line 54
    .line 55
    invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p0
.end method

.method public final ᲇᛴᲇᛵ(ILjava/util/Collection;I)V
    .locals 4

    .line 1
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 6
    .line 7
    invoke-virtual {p0, p1, p3}, Lxhss/ᲈᛶᲀᲈ;->ᲀᲇᛳᲁ(II)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-ge v0, p3, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lxhss/ᲈᛶᲀᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 18
    .line 19
    add-int v2, p1, v0

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    aput-object v3, v1, v2

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public final ᲇᛶᛴᲀ()V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lxhss/ᲈᛶᲀᲈ;->ᲇᛴᲇᛵ:Z

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
