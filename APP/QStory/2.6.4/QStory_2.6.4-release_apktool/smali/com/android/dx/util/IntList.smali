.class public final Lcom/android/dx/util/IntList;
.super Lcom/android/dx/util/MutabilityControl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final EMPTY:Lcom/android/dx/util/IntList;


# instance fields
.field private size:I

.field private sorted:Z

.field private values:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/android/dx/util/IntList;->EMPTY:Lcom/android/dx/util/IntList;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    .line 22
    invoke-direct {p0, v0}, Lcom/android/dx/util/IntList;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/android/dx/util/MutabilityControl;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    :try_start_0
    new-array p1, p1, [I

    .line 6
    .line 7
    iput-object p1, p0, Lcom/android/dx/util/IntList;->values:[I
    :try_end_0
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput p1, p0, Lcom/android/dx/util/IntList;->size:I

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/android/dx/util/IntList;->sorted:Z

    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    const-string p0, "size < 0"

    .line 16
    .line 17
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0
.end method

.method private growIfNeeded()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/android/dx/util/IntList;->size:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-ne v0, v2, :cond_0

    .line 7
    .line 8
    mul-int/lit8 v2, v0, 0x3

    .line 9
    .line 10
    div-int/lit8 v2, v2, 0x2

    .line 11
    .line 12
    add-int/lit8 v2, v2, 0xa

    .line 13
    .line 14
    new-array v2, v2, [I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    .line 19
    .line 20
    iput-object v2, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static makeImmutable(I)Lcom/android/dx/util/IntList;
    .locals 2

    .line 17
    new-instance v0, Lcom/android/dx/util/IntList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 18
    invoke-virtual {v0, p0}, Lcom/android/dx/util/IntList;->add(I)V

    .line 19
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    return-object v0
.end method

.method public static makeImmutable(II)Lcom/android/dx/util/IntList;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/android/dx/util/IntList;->add(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/android/dx/util/IntList;->add(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method


# virtual methods
.method public add(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/android/dx/util/IntList;->growIfNeeded()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 8
    .line 9
    iget v1, p0, Lcom/android/dx/util/IntList;->size:I

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    iput v2, p0, Lcom/android/dx/util/IntList;->size:I

    .line 14
    .line 15
    aput p1, v0, v1

    .line 16
    .line 17
    iget-boolean v3, p0, Lcom/android/dx/util/IntList;->sorted:Z

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-le v2, v3, :cond_1

    .line 23
    .line 24
    add-int/lit8 v1, v1, -0x1

    .line 25
    .line 26
    aget v0, v0, v1

    .line 27
    .line 28
    if-lt p1, v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v3, 0x0

    .line 32
    :goto_0
    iput-boolean v3, p0, Lcom/android/dx/util/IntList;->sorted:Z

    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public binarysearch(I)I
    .locals 5

    .line 1
    iget v0, p0, Lcom/android/dx/util/IntList;->size:I

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/android/dx/util/IntList;->sorted:Z

    .line 4
    .line 5
    if-nez v1, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 11
    .line 12
    aget v2, v2, v1

    .line 13
    .line 14
    if-ne v2, p1, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    neg-int p0, v0

    .line 21
    return p0

    .line 22
    :cond_2
    const/4 v1, -0x1

    .line 23
    move v2, v0

    .line 24
    :goto_1
    add-int/lit8 v3, v1, 0x1

    .line 25
    .line 26
    if-le v2, v3, :cond_4

    .line 27
    .line 28
    sub-int v3, v2, v1

    .line 29
    .line 30
    shr-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    add-int/2addr v3, v1

    .line 33
    iget-object v4, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 34
    .line 35
    aget v4, v4, v3

    .line 36
    .line 37
    if-gt p1, v4, :cond_3

    .line 38
    .line 39
    move v2, v3

    .line 40
    goto :goto_1

    .line 41
    :cond_3
    move v1, v3

    .line 42
    goto :goto_1

    .line 43
    :cond_4
    if-eq v2, v0, :cond_6

    .line 44
    .line 45
    iget-object p0, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 46
    .line 47
    aget p0, p0, v2

    .line 48
    .line 49
    if-ne p1, p0, :cond_5

    .line 50
    .line 51
    return v2

    .line 52
    :cond_5
    neg-int p0, v2

    .line 53
    :goto_2
    add-int/lit8 p0, p0, -0x1

    .line 54
    .line 55
    return p0

    .line 56
    :cond_6
    neg-int p0, v0

    .line 57
    goto :goto_2
.end method

.method public contains(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/util/IntList;->indexOf(I)I

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

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/android/dx/util/IntList;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/android/dx/util/IntList;

    .line 12
    .line 13
    iget-boolean v1, p0, Lcom/android/dx/util/IntList;->sorted:Z

    .line 14
    .line 15
    iget-boolean v3, p1, Lcom/android/dx/util/IntList;->sorted:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lcom/android/dx/util/IntList;->size:I

    .line 21
    .line 22
    iget v3, p1, Lcom/android/dx/util/IntList;->size:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    move v1, v2

    .line 28
    :goto_0
    iget v3, p0, Lcom/android/dx/util/IntList;->size:I

    .line 29
    .line 30
    if-ge v1, v3, :cond_5

    .line 31
    .line 32
    iget-object v3, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 33
    .line 34
    aget v3, v3, v1

    .line 35
    .line 36
    iget-object v4, p1, Lcom/android/dx/util/IntList;->values:[I

    .line 37
    .line 38
    aget v4, v4, v1

    .line 39
    .line 40
    if-eq v3, v4, :cond_4

    .line 41
    .line 42
    return v2

    .line 43
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_5
    return v0
.end method

.method public get(I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/util/IntList;->size:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object p0, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 6
    .line 7
    aget p0, p0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    return p0

    .line 10
    :catch_0
    const-string p0, "n < 0"

    .line 11
    .line 12
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_0
    const-string p0, "n >= size()"

    .line 18
    .line 19
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p0, Lcom/android/dx/util/IntList;->size:I

    .line 4
    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    mul-int/lit8 v1, v1, 0x1f

    .line 8
    .line 9
    iget-object v2, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 10
    .line 11
    aget v2, v2, v0

    .line 12
    .line 13
    add-int/2addr v1, v2

    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return v1
.end method

.method public indexOf(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/util/IntList;->binarysearch(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, -0x1

    .line 9
    return p0
.end method

.method public insert(II)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/android/dx/util/IntList;->size:I

    .line 2
    .line 3
    if-gt p1, v0, :cond_3

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/android/dx/util/IntList;->growIfNeeded()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 9
    .line 10
    add-int/lit8 v1, p1, 0x1

    .line 11
    .line 12
    iget v2, p0, Lcom/android/dx/util/IntList;->size:I

    .line 13
    .line 14
    sub-int/2addr v2, p1

    .line 15
    invoke-static {v0, p1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 19
    .line 20
    aput p2, v0, p1

    .line 21
    .line 22
    iget v2, p0, Lcom/android/dx/util/IntList;->size:I

    .line 23
    .line 24
    add-int/lit8 v3, v2, 0x1

    .line 25
    .line 26
    iput v3, p0, Lcom/android/dx/util/IntList;->size:I

    .line 27
    .line 28
    iget-boolean v3, p0, Lcom/android/dx/util/IntList;->sorted:Z

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    add-int/lit8 v3, p1, -0x1

    .line 35
    .line 36
    aget v3, v0, v3

    .line 37
    .line 38
    if-le p2, v3, :cond_2

    .line 39
    .line 40
    :cond_0
    if-eq p1, v2, :cond_1

    .line 41
    .line 42
    aget p1, v0, v1

    .line 43
    .line 44
    if-ge p2, p1, :cond_2

    .line 45
    .line 46
    :cond_1
    const/4 p1, 0x1

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 p1, 0x0

    .line 49
    :goto_0
    iput-boolean p1, p0, Lcom/android/dx/util/IntList;->sorted:Z

    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    const-string p0, "n > size()"

    .line 53
    .line 54
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public mutableCopy()Lcom/android/dx/util/IntList;
    .locals 4

    .line 1
    iget v0, p0, Lcom/android/dx/util/IntList;->size:I

    .line 2
    .line 3
    new-instance v1, Lcom/android/dx/util/IntList;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 12
    .line 13
    aget v3, v3, v2

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Lcom/android/dx/util/IntList;->add(I)V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object v1
.end method

.method public pop()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/android/dx/util/IntList;->size:I

    .line 5
    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/android/dx/util/IntList;->get(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v1, p0, Lcom/android/dx/util/IntList;->size:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    iput v1, p0, Lcom/android/dx/util/IntList;->size:I

    .line 17
    .line 18
    return v0
.end method

.method public pop(I)V
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 20
    iget v0, p0, Lcom/android/dx/util/IntList;->size:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/android/dx/util/IntList;->size:I

    return-void
.end method

.method public removeIndex(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/android/dx/util/IntList;->size:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 6
    .line 7
    add-int/lit8 v2, p1, 0x1

    .line 8
    .line 9
    sub-int/2addr v0, p1

    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    invoke-static {v1, v2, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    iget p1, p0, Lcom/android/dx/util/IntList;->size:I

    .line 16
    .line 17
    add-int/lit8 p1, p1, -0x1

    .line 18
    .line 19
    iput p1, p0, Lcom/android/dx/util/IntList;->size:I

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "n >= size()"

    .line 23
    .line 24
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public set(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/android/dx/util/IntList;->size:I

    .line 5
    .line 6
    if-ge p1, v0, :cond_1

    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 9
    .line 10
    aput p2, v0, p1

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    iput-boolean p2, p0, Lcom/android/dx/util/IntList;->sorted:Z
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    if-ltz p1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "n < 0"

    .line 20
    .line 21
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    const-string p0, "n >= size()"

    .line 26
    .line 27
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public shrink(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/android/dx/util/IntList;->size:I

    .line 4
    .line 5
    if-gt p1, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 8
    .line 9
    .line 10
    iput p1, p0, Lcom/android/dx/util/IntList;->size:I

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "newSize > size"

    .line 14
    .line 15
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    const-string p0, "newSize < 0"

    .line 20
    .line 21
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public size()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/util/IntList;->size:I

    .line 2
    .line 3
    return p0
.end method

.method public sort()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/android/dx/util/IntList;->sorted:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iget v2, p0, Lcom/android/dx/util/IntList;->size:I

    .line 12
    .line 13
    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->sort([III)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lcom/android/dx/util/IntList;->sorted:Z

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget v1, p0, Lcom/android/dx/util/IntList;->size:I

    .line 4
    .line 5
    mul-int/lit8 v1, v1, 0x5

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0xa

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x7b

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    iget v2, p0, Lcom/android/dx/util/IntList;->size:I

    .line 19
    .line 20
    if-ge v1, v2, :cond_1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const-string v2, ", "

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v2, p0, Lcom/android/dx/util/IntList;->values:[I

    .line 30
    .line 31
    aget v2, v2, v1

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/16 p0, 0x7d

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public top()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/util/IntList;->size:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/android/dx/util/IntList;->get(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
