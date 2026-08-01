.class public final L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世哲兰苏:I

.field public final 飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 7
    .line 8
    array-length p1, p3

    .line 9
    new-array p1, p1, [Ljava/lang/String;

    .line 10
    .line 11
    iput-object p1, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    :goto_0
    array-length p2, p3

    .line 15
    if-ge p1, p2, :cond_0

    .line 16
    .line 17
    iget-object p2, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    .line 18
    .line 19
    aget-object v0, p3, p1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    aput-object v0, p2, p1

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 33
    iput-object p2, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 34
    iput-object p3, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_2

    .line 5
    .line 6
    const-class v0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    iget-object v0, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p1, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v1, p1, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object p0, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    .line 38
    .line 39
    iget-object p1, p1, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    :goto_0
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 50
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 8
    .line 9
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    mul-int/lit8 v0, v0, 0x1f

    .line 18
    .line 19
    iget-object v1, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/2addr v0, v1

    .line 26
    iput v0, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 27
    .line 28
    :cond_0
    iget p0, p0, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 29
    .line 30
    return p0
.end method
