.class public final Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>([Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    if-nez p1, :cond_1

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_1
    const-class v0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_2
    check-cast p1, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    iget-object p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 21
    .line 22
    iget-object p1, p1, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {p0, p1}, Ljava/util/Arrays;->deepEquals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    return p0
.end method
