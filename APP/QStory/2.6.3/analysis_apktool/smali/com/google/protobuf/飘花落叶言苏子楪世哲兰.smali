.class public final Lcom/google/protobuf/飘花落叶言苏子楪世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

.field public final 飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p2, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言苏子楪世哲兰;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言苏子楪世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 14
    .line 15
    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰世苏哲()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "key"

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;)Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言苏子楪世哲兰;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 3

    .line 1
    check-cast p1, Lcom/google/protobuf/飘花落叶言苏子楪世哲兰;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言苏子楪世哲兰;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 5
    .line 6
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言苏子楪世哲兰;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {p0, v1}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p0, v0

    .line 18
    :goto_0
    iget-object v2, p1, Lcom/google/protobuf/飘花落叶言苏子楪世哲兰;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    iget-object p1, p1, Lcom/google/protobuf/飘花落叶言苏子楪世哲兰;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-interface {v2, p1}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1
    if-nez p0, :cond_2

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    if-nez p0, :cond_3

    .line 36
    .line 37
    const/4 p0, -0x1

    .line 38
    return p0

    .line 39
    :cond_3
    const/4 p1, 0x1

    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    return p1

    .line 43
    :cond_4
    sget-object v2, Lcom/google/protobuf/飘花落叶言世兰哲苏子楪;->飘花落叶言子楪世苏哲兰:[I

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    aget v1, v2, v1

    .line 54
    .line 55
    if-eq v1, p1, :cond_8

    .line 56
    .line 57
    const/4 p1, 0x2

    .line 58
    if-eq v1, p1, :cond_7

    .line 59
    .line 60
    const/4 p1, 0x3

    .line 61
    if-eq v1, p1, :cond_6

    .line 62
    .line 63
    const/4 p1, 0x4

    .line 64
    if-eq v1, p1, :cond_5

    .line 65
    .line 66
    :goto_1
    const/4 p0, 0x0

    .line 67
    return p0

    .line 68
    :cond_5
    check-cast p0, Ljava/lang/String;

    .line 69
    .line 70
    check-cast v0, Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    return p0

    .line 77
    :cond_6
    check-cast p0, Ljava/lang/Integer;

    .line 78
    .line 79
    check-cast v0, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    return p0

    .line 86
    :cond_7
    check-cast p0, Ljava/lang/Long;

    .line 87
    .line 88
    check-cast v0, Ljava/lang/Long;

    .line 89
    .line 90
    invoke-virtual {p0, v0}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    return p0

    .line 95
    :cond_8
    check-cast p0, Ljava/lang/Boolean;

    .line 96
    .line 97
    check-cast v0, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Boolean;)I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    return p0
.end method
