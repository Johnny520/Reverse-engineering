.class public Lcom/esotericsoftware/kryo/util/IntArray;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public items:[I

.field public ordered:Z

.field public size:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0x10

    .line 27
    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/util/IntArray;-><init>(ZI)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x1

    .line 23
    invoke-direct {p0, v0, p1}, Lcom/esotericsoftware/kryo/util/IntArray;-><init>(ZI)V

    return-void
.end method

.method public constructor <init>(Lcom/esotericsoftware/kryo/util/IntArray;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, Lcom/esotericsoftware/kryo/util/IntArray;->ordered:Z

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->ordered:Z

    .line 7
    .line 8
    iget v0, p1, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 9
    .line 10
    iput v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 11
    .line 12
    new-array v1, v0, [I

    .line 13
    .line 14
    iput-object v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 15
    .line 16
    iget-object p0, p1, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-static {p0, p1, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->ordered:Z

    .line 26
    new-array p1, p2, [I

    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    return-void
.end method

.method public constructor <init>(Z[III)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p4}, Lcom/esotericsoftware/kryo/util/IntArray;-><init>(ZI)V

    .line 30
    iput p4, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 31
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    const/4 p1, 0x0

    invoke-static {p2, p3, p0, p1, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public constructor <init>([I)V
    .locals 3

    const/4 v0, 0x0

    .line 28
    array-length v1, p1

    const/4 v2, 0x1

    invoke-direct {p0, v2, p1, v0, v1}, Lcom/esotericsoftware/kryo/util/IntArray;-><init>(Z[III)V

    return-void
.end method

.method public static varargs with([I)Lcom/esotericsoftware/kryo/util/IntArray;
    .locals 1

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/IntArray;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/util/IntArray;-><init>([I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public add(I)V
    .locals 3

    .line 58
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 59
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    array-length v2, v0

    if-ne v1, v2, :cond_0

    int-to-float v0, v1

    const/high16 v1, 0x3fe00000    # 1.75f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    const/16 v1, 0x8

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/util/IntArray;->resize(I)[I

    move-result-object v0

    .line 60
    :cond_0
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    aput p1, v0, v1

    return-void
.end method

.method public add(II)V
    .locals 4

    .line 47
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 48
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    add-int/lit8 v2, v1, 0x1

    array-length v3, v0

    if-lt v2, v3, :cond_0

    int-to-float v0, v1

    const/high16 v1, 0x3fe00000    # 1.75f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    const/16 v1, 0x8

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/util/IntArray;->resize(I)[I

    move-result-object v0

    .line 49
    :cond_0
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    aput p1, v0, v1

    add-int/lit8 p1, v1, 0x1

    .line 50
    aput p2, v0, p1

    add-int/lit8 v1, v1, 0x2

    .line 51
    iput v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    return-void
.end method

.method public add(III)V
    .locals 4

    .line 52
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 53
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    add-int/lit8 v2, v1, 0x2

    array-length v3, v0

    if-lt v2, v3, :cond_0

    int-to-float v0, v1

    const/high16 v1, 0x3fe00000    # 1.75f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    const/16 v1, 0x8

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/util/IntArray;->resize(I)[I

    move-result-object v0

    .line 54
    :cond_0
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    aput p1, v0, v1

    add-int/lit8 p1, v1, 0x1

    .line 55
    aput p2, v0, p1

    add-int/lit8 p1, v1, 0x2

    .line 56
    aput p3, v0, p1

    add-int/lit8 v1, v1, 0x3

    .line 57
    iput v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    return-void
.end method

.method public add(IIII)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x3

    .line 6
    .line 7
    array-length v3, v0

    .line 8
    if-lt v2, v3, :cond_0

    .line 9
    .line 10
    int-to-float v0, v1

    .line 11
    const v1, 0x3fe66666    # 1.8f

    .line 12
    .line 13
    .line 14
    mul-float/2addr v0, v1

    .line 15
    float-to-int v0, v0

    .line 16
    const/16 v1, 0x8

    .line 17
    .line 18
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/util/IntArray;->resize(I)[I

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 27
    .line 28
    aput p1, v0, v1

    .line 29
    .line 30
    add-int/lit8 p1, v1, 0x1

    .line 31
    .line 32
    aput p2, v0, p1

    .line 33
    .line 34
    add-int/lit8 p1, v1, 0x2

    .line 35
    .line 36
    aput p3, v0, p1

    .line 37
    .line 38
    add-int/lit8 p1, v1, 0x3

    .line 39
    .line 40
    aput p4, v0, p1

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x4

    .line 43
    .line 44
    iput v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 45
    .line 46
    return-void
.end method

.method public addAll(Lcom/esotericsoftware/kryo/util/IntArray;)V
    .locals 2

    const/4 v0, 0x0

    .line 41
    iget v1, p1, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    invoke-virtual {p0, p1, v0, v1}, Lcom/esotericsoftware/kryo/util/IntArray;->addAll(Lcom/esotericsoftware/kryo/util/IntArray;II)V

    return-void
.end method

.method public addAll(Lcom/esotericsoftware/kryo/util/IntArray;II)V
    .locals 2

    add-int v0, p2, p3

    .line 35
    iget v1, p1, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    if-gt v0, v1, :cond_0

    .line 36
    iget-object p1, p1, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/util/IntArray;->addAll([III)V

    return-void

    .line 37
    :cond_0
    const-string p0, " + "

    const-string v0, " <= "

    .line 38
    const-string v1, "offset + length must be <= size: "

    invoke-static {p2, p3, v1, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 39
    iget p1, p1, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    invoke-static {p0, p1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/StringBuilder;I)V

    return-void
.end method

.method public varargs addAll([I)V
    .locals 2

    const/4 v0, 0x0

    .line 40
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/esotericsoftware/kryo/util/IntArray;->addAll([III)V

    return-void
.end method

.method public addAll([III)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 4
    .line 5
    add-int/2addr v1, p3

    .line 6
    array-length v2, v0

    .line 7
    if-le v1, v2, :cond_0

    .line 8
    .line 9
    int-to-float v0, v1

    .line 10
    const/high16 v1, 0x3fe00000    # 1.75f

    .line 11
    .line 12
    mul-float/2addr v0, v1

    .line 13
    float-to-int v0, v0

    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/util/IntArray;->resize(I)[I

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_0
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 25
    .line 26
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    iget p1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 30
    .line 31
    add-int/2addr p1, p3

    .line 32
    iput p1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 33
    .line 34
    return-void
.end method

.method public clear()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 3
    .line 4
    return-void
.end method

.method public contains(I)Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sub-int/2addr v0, v1

    .line 5
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 6
    .line 7
    :goto_0
    if-ltz v0, :cond_1

    .line 8
    .line 9
    add-int/lit8 v2, v0, -0x1

    .line 10
    .line 11
    aget v0, p0, v0

    .line 12
    .line 13
    if-ne v0, p1, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public ensureCapacity(I)[I
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 4
    .line 5
    add-int/2addr v0, p1

    .line 6
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 7
    .line 8
    array-length p1, p1

    .line 9
    if-le v0, p1, :cond_0

    .line 10
    .line 11
    const/16 p1, 0x8

    .line 12
    .line 13
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/IntArray;->resize(I)[I

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    const-string p0, "additionalCapacity must be >= 0: "

    .line 24
    .line 25
    invoke-static {p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->ordered:Z

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
    instance-of v1, p1, Lcom/esotericsoftware/kryo/util/IntArray;

    .line 12
    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    return v2

    .line 16
    :cond_2
    check-cast p1, Lcom/esotericsoftware/kryo/util/IntArray;

    .line 17
    .line 18
    iget-boolean v1, p1, Lcom/esotericsoftware/kryo/util/IntArray;->ordered:Z

    .line 19
    .line 20
    if-nez v1, :cond_3

    .line 21
    .line 22
    return v2

    .line 23
    :cond_3
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 24
    .line 25
    iget v3, p1, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 26
    .line 27
    if-eq v1, v3, :cond_4

    .line 28
    .line 29
    return v2

    .line 30
    :cond_4
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 31
    .line 32
    iget-object p1, p1, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 33
    .line 34
    move v3, v2

    .line 35
    :goto_0
    if-ge v3, v1, :cond_6

    .line 36
    .line 37
    aget v4, p0, v3

    .line 38
    .line 39
    aget v5, p1, v3

    .line 40
    .line 41
    if-eq v4, v5, :cond_5

    .line 42
    .line 43
    return v2

    .line 44
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_6
    return v0
.end method

.method public first()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    aget p0, p0, v0

    .line 9
    .line 10
    return p0

    .line 11
    :cond_0
    const-string p0, "Array is empty."

    .line 12
    .line 13
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public get(I)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 6
    .line 7
    aget p0, p0, p1

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const-string v0, "index can\'t be >= size: "

    .line 11
    .line 12
    const-string v1, " >= "

    .line 13
    .line 14
    invoke-static {p1, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 19
    .line 20
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/StringBuilder;I)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->ordered:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 11
    .line 12
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, p0, :cond_1

    .line 17
    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    aget v3, v0, v2

    .line 21
    .line 22
    add-int/2addr v1, v3

    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return v1
.end method

.method public incr(II)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 6
    .line 7
    aget v0, p0, p1

    .line 8
    .line 9
    add-int/2addr v0, p2

    .line 10
    aput v0, p0, p1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p2, "index can\'t be >= size: "

    .line 14
    .line 15
    const-string v0, " >= "

    .line 16
    .line 17
    invoke-static {p1, p2, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 22
    .line 23
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/StringBuilder;I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public indexOf(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 2
    .line 3
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, p0, :cond_1

    .line 7
    .line 8
    aget v2, v0, v1

    .line 9
    .line 10
    if-ne v2, p1, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p0, -0x1

    .line 17
    return p0
.end method

.method public insert(II)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 2
    .line 3
    if-gt p1, v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    int-to-float v0, v0

    .line 11
    const/high16 v1, 0x3fe00000    # 1.75f

    .line 12
    .line 13
    mul-float/2addr v0, v1

    .line 14
    float-to-int v0, v0

    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/util/IntArray;->resize(I)[I

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :cond_0
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->ordered:Z

    .line 26
    .line 27
    iget v2, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    add-int/lit8 v0, p1, 0x1

    .line 32
    .line 33
    sub-int/2addr v2, p1

    .line 34
    invoke-static {v1, p1, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    aget v0, v1, p1

    .line 39
    .line 40
    aput v0, v1, v2

    .line 41
    .line 42
    :goto_0
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 43
    .line 44
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    iput v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 47
    .line 48
    aput p2, v1, p1

    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    const-string p2, "index can\'t be > size: "

    .line 52
    .line 53
    const-string v0, " > "

    .line 54
    .line 55
    invoke-static {p1, p2, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 60
    .line 61
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/StringBuilder;I)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public lastIndexOf(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 2
    .line 3
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 4
    .line 5
    add-int/lit8 p0, p0, -0x1

    .line 6
    .line 7
    :goto_0
    if-ltz p0, :cond_1

    .line 8
    .line 9
    aget v1, v0, p0

    .line 10
    .line 11
    if-ne v1, p1, :cond_0

    .line 12
    .line 13
    return p0

    .line 14
    :cond_0
    add-int/lit8 p0, p0, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 p0, -0x1

    .line 18
    return p0
.end method

.method public mul(II)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 6
    .line 7
    aget v0, p0, p1

    .line 8
    .line 9
    mul-int/2addr v0, p2

    .line 10
    aput v0, p0, p1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p2, "index can\'t be >= size: "

    .line 14
    .line 15
    const-string v0, " >= "

    .line 16
    .line 17
    invoke-static {p1, p2, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 22
    .line 23
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/StringBuilder;I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public peek()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 2
    .line 3
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 4
    .line 5
    add-int/lit8 p0, p0, -0x1

    .line 6
    .line 7
    aget p0, v0, p0

    .line 8
    .line 9
    return p0
.end method

.method public pop()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x1

    .line 6
    .line 7
    iput v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 8
    .line 9
    aget p0, v0, v1

    .line 10
    .line 11
    return p0
.end method

.method public removeAll(Lcom/esotericsoftware/kryo/util/IntArray;)Z
    .locals 9

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 4
    .line 5
    iget v2, p1, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    move v5, v0

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-ge v4, v2, :cond_2

    .line 11
    .line 12
    invoke-virtual {p1, v4}, Lcom/esotericsoftware/kryo/util/IntArray;->get(I)I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    move v7, v3

    .line 17
    :goto_1
    if-ge v7, v5, :cond_1

    .line 18
    .line 19
    aget v8, v1, v7

    .line 20
    .line 21
    if-ne v6, v8, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v7}, Lcom/esotericsoftware/kryo/util/IntArray;->removeIndex(I)I

    .line 24
    .line 25
    .line 26
    add-int/lit8 v5, v5, -0x1

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    if-eq v5, v0, :cond_3

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_3
    return v3
.end method

.method public removeIndex(I)I
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 6
    .line 7
    aget v2, v1, p1

    .line 8
    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    iput v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 12
    .line 13
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->ordered:Z

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    add-int/lit8 p0, p1, 0x1

    .line 18
    .line 19
    sub-int/2addr v0, p1

    .line 20
    invoke-static {v1, p0, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    return v2

    .line 24
    :cond_0
    aget p0, v1, v0

    .line 25
    .line 26
    aput p0, v1, p1

    .line 27
    .line 28
    return v2

    .line 29
    :cond_1
    const-string v0, "index can\'t be >= size: "

    .line 30
    .line 31
    const-string v1, " >= "

    .line 32
    .line 33
    invoke-static {p1, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 38
    .line 39
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/StringBuilder;I)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return p0
.end method

.method public removeRange(II)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 2
    .line 3
    if-ge p2, v0, :cond_2

    .line 4
    .line 5
    if-gt p1, p2, :cond_1

    .line 6
    .line 7
    sub-int v1, p2, p1

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    sub-int v2, v0, v1

    .line 12
    .line 13
    iget-boolean v3, p0, Lcom/esotericsoftware/kryo/util/IntArray;->ordered:Z

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    iget-object p2, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 18
    .line 19
    add-int/2addr v1, p1

    .line 20
    sub-int/2addr v0, v1

    .line 21
    invoke-static {p2, v1, p2, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 26
    .line 27
    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 32
    .line 33
    sub-int/2addr v0, p2

    .line 34
    invoke-static {v1, p2, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iput v2, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    const-string p0, "start can\'t be > end: "

    .line 41
    .line 42
    const-string v0, " > "

    .line 43
    .line 44
    invoke-static {p1, p2, p0, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏哲兰世(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    const-string p1, "end can\'t be >= size: "

    .line 53
    .line 54
    const-string v0, " >= "

    .line 55
    .line 56
    invoke-static {p2, p1, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 61
    .line 62
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/StringBuilder;I)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public removeValue(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v3, v1, :cond_1

    .line 8
    .line 9
    aget v4, v0, v3

    .line 10
    .line 11
    if-ne v4, p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/util/IntArray;->removeIndex(I)I

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return v2
.end method

.method public resize(I)[I
    .locals 3

    .line 1
    new-array v0, p1, [I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 4
    .line 5
    iget v2, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 6
    .line 7
    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v1, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 16
    .line 17
    return-object v0
.end method

.method public reverse()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 2
    .line 3
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 4
    .line 5
    add-int/lit8 v1, p0, -0x1

    .line 6
    .line 7
    div-int/lit8 p0, p0, 0x2

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, p0, :cond_0

    .line 11
    .line 12
    sub-int v3, v1, v2

    .line 13
    .line 14
    aget v4, v0, v2

    .line 15
    .line 16
    aget v5, v0, v3

    .line 17
    .line 18
    aput v5, v0, v2

    .line 19
    .line 20
    aput v4, v0, v3

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public set(II)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 6
    .line 7
    aput p2, p0, p1

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p2, "index can\'t be >= size: "

    .line 11
    .line 12
    const-string v0, " >= "

    .line 13
    .line 14
    invoke-static {p1, p2, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 19
    .line 20
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/StringBuilder;I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setSize(I)[I
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    if-le p1, v0, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/util/IntArray;->resize(I)[I

    .line 15
    .line 16
    .line 17
    :cond_0
    iput p1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 18
    .line 19
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    const-string p0, "newSize must be >= 0: "

    .line 23
    .line 24
    invoke-static {p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public shrink()[I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 5
    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/util/IntArray;->resize(I)[I

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 12
    .line 13
    return-object p0
.end method

.method public sort()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 5
    .line 6
    invoke-static {v0, v1, p0}, Ljava/util/Arrays;->sort([III)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public swap(II)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 2
    .line 3
    const-string v1, " >= "

    .line 4
    .line 5
    if-ge p1, v0, :cond_1

    .line 6
    .line 7
    if-ge p2, v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 10
    .line 11
    aget v0, p0, p1

    .line 12
    .line 13
    aget v1, p0, p2

    .line 14
    .line 15
    aput v1, p0, p1

    .line 16
    .line 17
    aput v0, p0, p2

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p1, "second can\'t be >= size: "

    .line 21
    .line 22
    invoke-static {p2, p1, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 27
    .line 28
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/StringBuilder;I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-string p2, "first can\'t be >= size: "

    .line 33
    .line 34
    invoke-static {p1, p2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 39
    .line 40
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/StringBuilder;I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public toArray()[I
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {p0, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p0, "[]"

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const/16 v2, 0x20

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 15
    .line 16
    .line 17
    const/16 v2, 0x5b

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aget v2, v0, v2

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    :goto_0
    iget v3, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 30
    .line 31
    if-ge v2, v3, :cond_1

    .line 32
    .line 33
    const-string v3, ", "

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    aget v3, v0, v2

    .line 39
    .line 40
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/16 p0, 0x5d

    .line 47
    .line 48
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 56
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    if-nez v0, :cond_0

    const-string p0, ""

    return-object p0

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->items:[I

    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    .line 59
    aget v2, v0, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    .line 60
    :goto_0
    iget v3, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    if-ge v2, v3, :cond_1

    .line 61
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    aget v3, v0, v2

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public truncate(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 2
    .line 3
    if-le v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 6
    .line 7
    :cond_0
    return-void
.end method
