.class public final L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final 飘花落叶言子楪哲兰苏世:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:[S

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲兰世:[S

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;[S)V

    .line 7
    .line 8
    .line 9
    sput-object v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;[S)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:[S

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 5

    .line 1
    check-cast p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    move v1, v0

    .line 5
    :goto_0
    iget-object v2, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:[S

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ge v1, v3, :cond_3

    .line 9
    .line 10
    iget-object v3, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:[S

    .line 11
    .line 12
    array-length v4, v3

    .line 13
    if-ge v1, v4, :cond_3

    .line 14
    .line 15
    aget-short v2, v2, v1

    .line 16
    .line 17
    aget-short v3, v3, v1

    .line 18
    .line 19
    if-eq v2, v3, :cond_2

    .line 20
    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    return v0

    .line 24
    :cond_0
    const p0, 0xffff

    .line 25
    .line 26
    .line 27
    and-int p1, v2, p0

    .line 28
    .line 29
    and-int/2addr p0, v3

    .line 30
    if-ge p1, p0, :cond_1

    .line 31
    .line 32
    const/4 p0, -0x1

    .line 33
    return p0

    .line 34
    :cond_1
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    array-length p0, v2

    .line 40
    iget-object p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:[S

    .line 41
    .line 42
    array-length p1, p1

    .line 43
    invoke-static {p0, p1}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(II)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:[S

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v2, :cond_1

    .line 13
    .line 14
    iget-object v4, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    iget-object v4, v4, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 19
    .line 20
    aget-short v5, v1, v3

    .line 21
    .line 22
    invoke-virtual {v4, v5}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    aget-short v4, v1, v3

    .line 28
    .line 29
    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const-string p0, ")"

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
