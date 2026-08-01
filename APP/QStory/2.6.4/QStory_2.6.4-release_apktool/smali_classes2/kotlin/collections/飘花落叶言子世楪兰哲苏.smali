.class public final Lkotlin/collections/飘花落叶言子世楪兰哲苏;
.super Lkotlin/collections/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public 飘花落叶言子楪兰世苏哲:I

.field public final 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:I

.field public final 飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(I[Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-ltz p1, :cond_1

    .line 8
    .line 9
    array-length v1, p2

    .line 10
    if-gt p1, v1, :cond_0

    .line 11
    .line 12
    array-length p2, p2

    .line 13
    iput p2, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 14
    .line 15
    iput p1, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰世苏哲:I

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p0, "ring buffer filled size: "

    .line 19
    .line 20
    const-string v1, " cannot be larger than the buffer size: "

    .line 21
    .line 22
    invoke-static {p1, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    array-length p1, p2

    .line 27
    invoke-static {p0, p1}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/StringBuilder;I)V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :cond_1
    const-string p0, "ring buffer filled size should not be negative but it is "

    .line 32
    .line 33
    invoke-static {p1, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    throw v0
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lkotlin/collections/飘花落叶言子楪世兰哲苏;->Companion:Lkotlin/collections/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v1}, Lkotlin/collections/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(II)V

    .line 11
    .line 12
    .line 13
    iget v0, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 14
    .line 15
    add-int/2addr v0, p1

    .line 16
    iget p1, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 17
    .line 18
    rem-int/2addr v0, p1

    .line 19
    iget-object p0, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object p0, p0, v0

    .line 22
    .line 23
    return-object p0
.end method

.method public final getSize()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lkotlin/collections/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lkotlin/collections/飘花落叶言子世楪兰苏哲;-><init>(Lkotlin/collections/飘花落叶言子世楪兰哲苏;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 62
    invoke-virtual {p0}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    invoke-virtual {p0}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_0
    invoke-virtual {p0}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget v1, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    move v3, v2

    .line 27
    :goto_0
    iget-object v4, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 28
    .line 29
    if-ge v3, v0, :cond_1

    .line 30
    .line 31
    iget v5, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 32
    .line 33
    if-ge v1, v5, :cond_1

    .line 34
    .line 35
    aget-object v4, v4, v1

    .line 36
    .line 37
    aput-object v4, p1, v3

    .line 38
    .line 39
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :goto_1
    if-ge v3, v0, :cond_2

    .line 45
    .line 46
    aget-object p0, v4, v2

    .line 47
    .line 48
    aput-object p0, p1, v3

    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    array-length p0, p1

    .line 56
    if-ge v0, p0, :cond_3

    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    aput-object p0, p1, v0

    .line 60
    .line 61
    :cond_3
    return-object p1
.end method

.method public final 飘花落叶言子楪世苏哲兰(I)V
    .locals 5

    .line 1
    if-ltz p1, :cond_3

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gt p1, v0, :cond_2

    .line 8
    .line 9
    if-lez p1, :cond_1

    .line 10
    .line 11
    iget v0, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 12
    .line 13
    add-int v1, v0, p1

    .line 14
    .line 15
    iget v2, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 16
    .line 17
    rem-int/2addr v1, v2

    .line 18
    iget-object v3, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-le v0, v1, :cond_0

    .line 22
    .line 23
    invoke-static {v3, v0, v2, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-static {v3, v0, v1, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v3, v0, v1, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iput v1, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    sub-int/2addr v0, p1

    .line 41
    iput v0, p0, Lkotlin/collections/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰世苏哲:I

    .line 42
    .line 43
    :cond_1
    return-void

    .line 44
    :cond_2
    const-string v0, "n shouldn\'t be greater than the buffer size: n = "

    .line 45
    .line 46
    const-string v1, ", size = "

    .line 47
    .line 48
    invoke-static {p1, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-static {p1, p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/StringBuilder;I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    const-string p0, "n shouldn\'t be negative but it is "

    .line 61
    .line 62
    invoke-static {p1, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method
