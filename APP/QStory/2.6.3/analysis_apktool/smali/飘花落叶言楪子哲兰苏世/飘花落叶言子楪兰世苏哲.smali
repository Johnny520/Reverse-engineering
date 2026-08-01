.class public final L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public 飘花落叶言子楪兰世苏哲:I

.field public 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:I

.field public final 飘花落叶言子楪哲苏兰世:S


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    iput v1, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 9
    .line 10
    iput v0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:I

    .line 11
    .line 12
    int-to-short p1, p1

    .line 13
    iput-short p1, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:S

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 4
    .line 5
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 6
    .line 7
    if-eq p0, p1, :cond_1

    .line 8
    .line 9
    if-ge p0, p1, :cond_0

    .line 10
    .line 11
    const/4 p0, -0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_1
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-short v0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:S

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget p0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 14
    .line 15
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    filled-new-array {v0, v1, p0}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string v0, "Section[type=%#x,off=%#x,size=%#x]"

    .line 24
    .line 25
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Z
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    if-lez p0, :cond_0

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
