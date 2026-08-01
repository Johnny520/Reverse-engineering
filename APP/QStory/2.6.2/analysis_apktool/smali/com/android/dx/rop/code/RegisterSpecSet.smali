.class public final Lcom/android/dx/rop/code/RegisterSpecSet;
.super Lcom/android/dx/util/MutabilityControl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final EMPTY:Lcom/android/dx/rop/code/RegisterSpecSet;


# instance fields
.field private size:I

.field private final specs:[Lcom/android/dx/rop/code/RegisterSpec;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/RegisterSpecSet;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/android/dx/rop/code/RegisterSpecSet;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/android/dx/rop/code/RegisterSpecSet;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecSet;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    invoke-direct {p0, v1}, Lcom/android/dx/util/MutabilityControl;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    new-array p1, p1, [Lcom/android/dx/rop/code/RegisterSpec;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 13
    .line 14
    iput v0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->size:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    instance-of v0, p1, Lcom/android/dx/rop/code/RegisterSpecSet;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lcom/android/dx/rop/code/RegisterSpecSet;

    .line 8
    .line 9
    iget-object v0, p1, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 12
    .line 13
    array-length v2, v2

    .line 14
    array-length v3, v0

    .line 15
    if-ne v2, v3, :cond_6

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpecSet;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpecSet;->size()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eq v3, p1, :cond_1

    .line 26
    .line 27
    goto :goto_3

    .line 28
    :cond_1
    move p1, v1

    .line 29
    :goto_0
    if-ge p1, v2, :cond_5

    .line 30
    .line 31
    iget-object v3, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 32
    .line 33
    aget-object v3, v3, p1

    .line 34
    .line 35
    aget-object v4, v0, p1

    .line 36
    .line 37
    if-ne v3, v4, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    if-eqz v3, :cond_4

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Lcom/android/dx/rop/code/RegisterSpec;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_3

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    :goto_2
    return v1

    .line 53
    :cond_5
    const/4 p0, 0x1

    .line 54
    return p0

    .line 55
    :cond_6
    :goto_3
    return v1
.end method

.method public findMatchingLocal(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_2

    .line 6
    .line 7
    iget-object v2, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p1, v2}, Lcom/android/dx/rop/code/RegisterSpec;->matchesVariable(Lcom/android/dx/rop/code/RegisterSpec;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public get(I)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    aget-object p0, p0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :catch_0
    const-string p0, "bogus reg"

    .line 7
    .line 8
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public get(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 0

    .line 13
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/android/dx/rop/code/RegisterSpecSet;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object p0

    return-object p0
.end method

.method public getMaxSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    iget-object v4, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 10
    .line 11
    aget-object v4, v4, v2

    .line 12
    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    move v4, v1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {v4}, Lcom/android/dx/rop/code/RegisterSpec;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    :goto_1
    mul-int/lit8 v3, v3, 0x1f

    .line 22
    .line 23
    add-int/2addr v3, v4

    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return v3
.end method

.method public intersect(Lcom/android/dx/rop/code/RegisterSpecSet;Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 7
    .line 8
    array-length v0, v0

    .line 9
    array-length v1, p1

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, -0x1

    .line 15
    iput v2, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->size:I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v1, :cond_2

    .line 19
    .line 20
    iget-object v3, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 21
    .line 22
    aget-object v3, v3, v2

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    aget-object v4, p1, v2

    .line 28
    .line 29
    invoke-virtual {v3, v4, p2}, Lcom/android/dx/rop/code/RegisterSpec;->intersect(Lcom/android/dx/rop/code/RegisterSpec;Z)Lcom/android/dx/rop/code/RegisterSpec;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-eq v4, v3, :cond_1

    .line 34
    .line 35
    iget-object v3, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 36
    .line 37
    aput-object v4, v3, v2

    .line 38
    .line 39
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_2
    if-ge v1, v0, :cond_3

    .line 43
    .line 44
    iget-object p1, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 45
    .line 46
    const/4 p2, 0x0

    .line 47
    aput-object p2, p1, v1

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    return-void
.end method

.method public localItemToSpec(Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p1, v3}, Lcom/android/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    return-object v2

    .line 24
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public mutableCopy()Lcom/android/dx/rop/code/RegisterSpecSet;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    new-instance v1, Lcom/android/dx/rop/code/RegisterSpecSet;

    .line 5
    .line 6
    invoke-direct {v1, v0}, Lcom/android/dx/rop/code/RegisterSpecSet;-><init>(I)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_1

    .line 11
    .line 12
    iget-object v3, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 13
    .line 14
    aget-object v3, v3, v2

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Lcom/android/dx/rop/code/RegisterSpecSet;->put(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget p0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->size:I

    .line 25
    .line 26
    iput p0, v1, Lcom/android/dx/rop/code/RegisterSpecSet;->size:I

    .line 27
    .line 28
    return-object v1
.end method

.method public put(Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->size:I

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 14
    .line 15
    aput-object p1, v1, v0

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x2

    .line 19
    if-lez v0, :cond_0

    .line 20
    .line 21
    add-int/lit8 v4, v0, -0x1

    .line 22
    .line 23
    aget-object v1, v1, v4

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ne v1, v3, :cond_0

    .line 32
    .line 33
    iget-object v1, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 34
    .line 35
    aput-object v2, v1, v4

    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-ne p1, v3, :cond_1

    .line 42
    .line 43
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    aput-object v2, p0, v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    :cond_1
    return-void

    .line 50
    :catch_0
    const-string p0, "spec.getReg() out of range"

    .line 51
    .line 52
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    const-string p0, "spec == null"

    .line 57
    .line 58
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public putAll(Lcom/android/dx/rop/code/RegisterSpecSet;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpecSet;->getMaxSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Lcom/android/dx/rop/code/RegisterSpecSet;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Lcom/android/dx/rop/code/RegisterSpecSet;->put(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    return-void
.end method

.method public remove(Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v1, 0x0

    .line 8
    aput-object v1, v0, p1

    .line 9
    .line 10
    const/4 p1, -0x1

    .line 11
    iput p1, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->size:I
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    const-string p0, "bogus reg"

    .line 15
    .line 16
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public size()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->size:I

    .line 2
    .line 3
    if-gez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 6
    .line 7
    array-length v0, v0

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    if-ge v1, v0, :cond_1

    .line 11
    .line 12
    iget-object v3, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 13
    .line 14
    aget-object v3, v3, v1

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iput v2, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->size:I

    .line 24
    .line 25
    return v2

    .line 26
    :cond_2
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    mul-int/lit8 v2, v0, 0x19

    .line 7
    .line 8
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/16 v2, 0x7b

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    if-ge v2, v0, :cond_2

    .line 19
    .line 20
    iget-object v4, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 21
    .line 22
    aget-object v4, v4, v2

    .line 23
    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    const-string v5, ", "

    .line 29
    .line 30
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const/4 v3, 0x1

    .line 35
    :goto_1
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/16 p0, 0x7d

    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public withOffset(I)Lcom/android/dx/rop/code/RegisterSpecSet;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    new-instance v1, Lcom/android/dx/rop/code/RegisterSpecSet;

    .line 5
    .line 6
    add-int v2, v0, p1

    .line 7
    .line 8
    invoke-direct {v1, v2}, Lcom/android/dx/rop/code/RegisterSpecSet;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v0, :cond_1

    .line 13
    .line 14
    iget-object v3, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->specs:[Lcom/android/dx/rop/code/RegisterSpec;

    .line 15
    .line 16
    aget-object v3, v3, v2

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3, p1}, Lcom/android/dx/rop/code/RegisterSpec;->withOffset(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v1, v3}, Lcom/android/dx/rop/code/RegisterSpecSet;->put(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget p1, p0, Lcom/android/dx/rop/code/RegisterSpecSet;->size:I

    .line 31
    .line 32
    iput p1, v1, Lcom/android/dx/rop/code/RegisterSpecSet;->size:I

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->isImmutable()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-object v1
.end method
