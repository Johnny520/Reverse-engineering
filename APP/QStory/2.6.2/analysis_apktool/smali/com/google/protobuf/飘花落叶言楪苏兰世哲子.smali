.class public final Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;


# instance fields
.field public 飘花落叶言子楪世哲苏兰:Z

.field public 飘花落叶言子楪世苏兰哲:Z

.field public final 飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世哲兰()Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;-><init>(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰苏世哲()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世哲兰()Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰苏世哲()V

    return-void
.end method

.method public static 飘花落叶言子世楪兰苏哲(Ljava/util/Map$Entry;Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子世兰楪哲苏()Lcom/google/protobuf/WireFormat$JavaType;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lcom/google/protobuf/WireFormat$JavaType;->MESSAGE:Lcom/google/protobuf/WireFormat$JavaType;

    .line 12
    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->isPacked()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    instance-of v1, v0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    check-cast v0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/ByteString;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 46
    .line 47
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->getNumber()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    invoke-virtual {p1, p0, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏哲楪兰(ILcom/google/protobuf/ByteString;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 60
    .line 61
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->getNumber()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    check-cast v0, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 66
    .line 67
    invoke-virtual {p1, p0, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏楪兰哲(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子世楪哲兰苏(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public static 飘花落叶言子世楪哲兰苏(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 5

    .line 1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏兰世哲()Lcom/google/protobuf/WireFormat$FieldType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->getNumber()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_4

    .line 14
    .line 15
    check-cast p1, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->isPacked()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_0
    const/4 p0, 0x2

    .line 36
    invoke-virtual {p2, v1, p0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏兰哲楪(II)V

    .line 37
    .line 38
    .line 39
    move p0, v3

    .line 40
    move v1, p0

    .line 41
    :goto_0
    if-ge p0, v2, :cond_1

    .line 42
    .line 43
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v0, v4}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    add-int/2addr v1, v4

    .line 52
    add-int/lit8 p0, p0, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p2, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世哲楪兰苏(I)V

    .line 56
    .line 57
    .line 58
    :goto_1
    if-ge v3, v2, :cond_3

    .line 59
    .line 60
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p2, v0, p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子世楪哲苏兰(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    :goto_2
    if-ge v3, v2, :cond_3

    .line 71
    .line 72
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p2, v0, v1, p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子世楪苏兰哲(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/WireFormat$FieldType;ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    :goto_3
    return-void

    .line 83
    :cond_4
    instance-of p0, p1, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 84
    .line 85
    if-eqz p0, :cond_5

    .line 86
    .line 87
    check-cast p1, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p2, v0, v1, p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子世楪苏兰哲(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/WireFormat$FieldType;ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_5
    invoke-static {p2, v0, v1, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子世楪苏兰哲(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/WireFormat$FieldType;ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public static 飘花落叶言子世楪哲苏兰(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪苏兰子世哲;->飘花落叶言子楪世苏兰哲:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    instance-of p1, p2, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    check-cast p2, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;

    .line 18
    .line 19
    invoke-interface {p2}, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;->getNumber()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰苏哲(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    check-cast p2, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰苏哲(I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    check-cast p2, Ljava/lang/Long;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide p1

    .line 43
    const/4 v0, 0x1

    .line 44
    shl-long v0, p1, v0

    .line 45
    .line 46
    const/16 v2, 0x3f

    .line 47
    .line 48
    shr-long/2addr p1, v2

    .line 49
    xor-long/2addr p1, v0

    .line 50
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世哲苏兰楪(J)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_2
    check-cast p2, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    shl-int/lit8 p2, p1, 0x1

    .line 61
    .line 62
    shr-int/lit8 p1, p1, 0x1f

    .line 63
    .line 64
    xor-int/2addr p1, p2

    .line 65
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世哲楪兰苏(I)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_3
    check-cast p2, Ljava/lang/Long;

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide p1

    .line 75
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲苏兰(J)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_4
    check-cast p2, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪苏哲兰(I)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_5
    check-cast p2, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世哲楪兰苏(I)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_6
    instance-of p1, p2, Lcom/google/protobuf/ByteString;

    .line 100
    .line 101
    if-eqz p1, :cond_1

    .line 102
    .line 103
    check-cast p2, Lcom/google/protobuf/ByteString;

    .line 104
    .line 105
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰苏哲世(Lcom/google/protobuf/ByteString;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_1
    check-cast p2, [B

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    array-length p1, p2

    .line 115
    invoke-virtual {p0, p2, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰世哲苏([BI)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :pswitch_7
    instance-of p1, p2, Lcom/google/protobuf/ByteString;

    .line 120
    .line 121
    if-eqz p1, :cond_2

    .line 122
    .line 123
    check-cast p2, Lcom/google/protobuf/ByteString;

    .line 124
    .line 125
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪兰苏哲世(Lcom/google/protobuf/ByteString;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_2
    check-cast p2, Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏兰楪哲(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :pswitch_8
    check-cast p2, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 136
    .line 137
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏楪哲兰(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :pswitch_9
    check-cast p2, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 142
    .line 143
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-interface {p2, p0}, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :pswitch_a
    check-cast p2, Ljava/lang/Boolean;

    .line 151
    .line 152
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    int-to-byte p1, p1

    .line 157
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲兰苏世(B)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :pswitch_b
    check-cast p2, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪苏哲兰(I)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :pswitch_c
    check-cast p2, Ljava/lang/Long;

    .line 172
    .line 173
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 174
    .line 175
    .line 176
    move-result-wide p1

    .line 177
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲苏兰(J)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :pswitch_d
    check-cast p2, Ljava/lang/Integer;

    .line 182
    .line 183
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰苏哲(I)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :pswitch_e
    check-cast p2, Ljava/lang/Long;

    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 194
    .line 195
    .line 196
    move-result-wide p1

    .line 197
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世哲苏兰楪(J)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :pswitch_f
    check-cast p2, Ljava/lang/Long;

    .line 202
    .line 203
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 204
    .line 205
    .line 206
    move-result-wide p1

    .line 207
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世哲苏兰楪(J)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :pswitch_10
    check-cast p2, Ljava/lang/Float;

    .line 212
    .line 213
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪苏哲兰(I)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :pswitch_11
    check-cast p2, Ljava/lang/Double;

    .line 229
    .line 230
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 231
    .line 232
    .line 233
    move-result-wide p1

    .line 234
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 238
    .line 239
    .line 240
    move-result-wide p1

    .line 241
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪哲苏兰(J)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static 飘花落叶言子世楪苏兰哲(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/WireFormat$FieldType;ILjava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/WireFormat$FieldType;->GROUP:Lcom/google/protobuf/WireFormat$FieldType;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    check-cast p3, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-virtual {p0, p2, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏兰哲楪(II)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p3, p0}, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x4

    .line 15
    invoke-virtual {p0, p2, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏兰哲楪(II)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/WireFormat$FieldType;->getWireType()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p0, p2, v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏兰哲楪(II)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p1, p3}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子世楪哲苏兰(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static 飘花落叶言子世楪苏哲兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏兰世哲()Lcom/google/protobuf/WireFormat$FieldType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰世苏哲(Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->getNumber()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏兰世哲()Lcom/google/protobuf/WireFormat$FieldType;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Lcom/google/protobuf/WireFormat$FieldType;->getJavaType()Lcom/google/protobuf/WireFormat$JavaType;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    filled-new-array {v1, p0, p1}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string p1, "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"

    .line 43
    .line 44
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0
.end method

.method public static 飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/WireFormat$FieldType;ILjava/lang/Object;)I
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏兰哲世(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget-object v0, Lcom/google/protobuf/WireFormat$FieldType;->GROUP:Lcom/google/protobuf/WireFormat$FieldType;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    mul-int/lit8 p1, p1, 0x2

    .line 10
    .line 11
    :cond_0
    invoke-static {p0, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, p1

    .line 16
    return p0
.end method

.method public static 飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    instance-of v0, p0, [B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, [B

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    new-array v0, v0, [B

    .line 9
    .line 10
    array-length v1, p0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    return-object p0
.end method

.method public static 飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;Ljava/util/Map$Entry;ZZ)V
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    instance-of p3, p1, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 14
    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    check-cast p1, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, v0, p1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    if-eqz p2, :cond_1

    .line 28
    .line 29
    instance-of p2, p1, Ljava/util/List;

    .line 30
    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    new-instance p2, Ljava/util/ArrayList;

    .line 34
    .line 35
    check-cast p1, Ljava/util/List;

    .line 36
    .line 37
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0, p2}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-virtual {p0, v0, p1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;ZZ)Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;
    .locals 4

    .line 1
    invoke-static {}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世哲兰()Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲苏兰(I)Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-static {v0, v3, p1, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;Ljava/util/Map$Entry;ZZ)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲兰苏()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/util/Map$Entry;

    .line 39
    .line 40
    invoke-static {v0, v1, p1, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;Ljava/util/Map$Entry;ZZ)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    return-object v0
.end method

.method public static 飘花落叶言子楪兰世苏哲(Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪苏兰子世哲;->飘花落叶言子楪世苏哲兰:[I

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/WireFormat$FieldType;->getJavaType()Lcom/google/protobuf/WireFormat$JavaType;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    aget p0, v0, p0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    const/4 v1, 0x0

    .line 20
    packed-switch p0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    return v1

    .line 24
    :pswitch_0
    instance-of p0, p1, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 25
    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    instance-of p0, p1, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return v1

    .line 34
    :cond_1
    :goto_0
    return v0

    .line 35
    :pswitch_1
    instance-of p0, p1, Ljava/lang/Integer;

    .line 36
    .line 37
    if-nez p0, :cond_3

    .line 38
    .line 39
    instance-of p0, p1, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;

    .line 40
    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    return v1

    .line 45
    :cond_3
    :goto_1
    return v0

    .line 46
    :pswitch_2
    instance-of p0, p1, Lcom/google/protobuf/ByteString;

    .line 47
    .line 48
    if-nez p0, :cond_5

    .line 49
    .line 50
    instance-of p0, p1, [B

    .line 51
    .line 52
    if-eqz p0, :cond_4

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    return v1

    .line 56
    :cond_5
    :goto_2
    return v0

    .line 57
    :pswitch_3
    instance-of p0, p1, Ljava/lang/String;

    .line 58
    .line 59
    return p0

    .line 60
    :pswitch_4
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 61
    .line 62
    return p0

    .line 63
    :pswitch_5
    instance-of p0, p1, Ljava/lang/Double;

    .line 64
    .line 65
    return p0

    .line 66
    :pswitch_6
    instance-of p0, p1, Ljava/lang/Float;

    .line 67
    .line 68
    return p0

    .line 69
    :pswitch_7
    instance-of p0, p1, Ljava/lang/Long;

    .line 70
    .line 71
    return p0

    .line 72
    :pswitch_8
    instance-of p0, p1, Ljava/lang/Integer;

    .line 73
    .line 74
    return p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static 飘花落叶言子楪哲兰苏世(Ljava/util/Map$Entry;)Z
    .locals 7

    .line 1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子世兰楪哲苏()Lcom/google/protobuf/WireFormat$JavaType;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lcom/google/protobuf/WireFormat$JavaType;->MESSAGE:Lcom/google/protobuf/WireFormat$JavaType;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne v1, v2, :cond_6

    .line 15
    .line 16
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-string v1, "Wrong object type used with protocol message reflection."

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    move v4, v2

    .line 36
    :goto_0
    if-ge v4, v0, :cond_6

    .line 37
    .line 38
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    instance-of v6, v5, Lcom/google/protobuf/飘花落叶言世苏哲子兰楪;

    .line 43
    .line 44
    if-eqz v6, :cond_0

    .line 45
    .line 46
    check-cast v5, Lcom/google/protobuf/飘花落叶言世苏哲子兰楪;

    .line 47
    .line 48
    invoke-interface {v5}, Lcom/google/protobuf/飘花落叶言世苏哲子兰楪;->isInitialized()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    instance-of v5, v5, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 54
    .line 55
    if-eqz v5, :cond_2

    .line 56
    .line 57
    move v5, v3

    .line 58
    :goto_1
    if-nez v5, :cond_1

    .line 59
    .line 60
    return v2

    .line 61
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-static {v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return v2

    .line 68
    :cond_3
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    instance-of v0, p0, Lcom/google/protobuf/飘花落叶言世苏哲子兰楪;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    check-cast p0, Lcom/google/protobuf/飘花落叶言世苏哲子兰楪;

    .line 77
    .line 78
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏哲子兰楪;->isInitialized()Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    return p0

    .line 83
    :cond_4
    instance-of p0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 84
    .line 85
    if-eqz p0, :cond_5

    .line 86
    .line 87
    return v3

    .line 88
    :cond_5
    invoke-static {v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return v2

    .line 92
    :cond_6
    return v3
.end method

.method public static 飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)I
    .locals 5

    .line 1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏兰世哲()Lcom/google/protobuf/WireFormat$FieldType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->getNumber()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_4

    .line 14
    .line 15
    check-cast p1, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->isPacked()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    return v3

    .line 35
    :cond_0
    move p0, v3

    .line 36
    :goto_0
    if-ge v3, v2, :cond_1

    .line 37
    .line 38
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v0, v4}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    add-int/2addr p0, v4

    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏兰哲世(I)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    add-int/2addr p1, p0

    .line 55
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世兰苏(I)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    add-int/2addr p0, p1

    .line 60
    return p0

    .line 61
    :cond_2
    move p0, v3

    .line 62
    :goto_1
    if-ge v3, v2, :cond_3

    .line 63
    .line 64
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v0, v1, v4}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/WireFormat$FieldType;ILjava/lang/Object;)I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    add-int/2addr p0, v4

    .line 73
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    return p0

    .line 77
    :cond_4
    invoke-static {v0, v1, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/WireFormat$FieldType;ILjava/lang/Object;)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    return p0
.end method

.method public static 飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)I
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪苏兰子世哲;->飘花落叶言子楪世苏兰哲:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aget p0, v0, p0

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    packed-switch p0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    const-string p0, "There is no way to get here, but the compiler thinks otherwise."

    .line 16
    .line 17
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :pswitch_0
    instance-of p0, p1, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    check-cast p1, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;

    .line 27
    .line 28
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;->getNumber()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    int-to-long p0, p0

    .line 33
    invoke-static {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲苏兰世(J)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    int-to-long p0, p0

    .line 45
    invoke-static {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲苏兰世(J)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :pswitch_1
    check-cast p1, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide p0

    .line 56
    invoke-static {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏兰世哲(J)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    return p0

    .line 61
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏哲兰世(I)I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    return p0

    .line 72
    :pswitch_3
    check-cast p1, Ljava/lang/Long;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    sget-boolean p0, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 78
    .line 79
    return v1

    .line 80
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-boolean p0, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 86
    .line 87
    return v0

    .line 88
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世兰苏(I)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    return p0

    .line 99
    :pswitch_6
    instance-of p0, p1, Lcom/google/protobuf/ByteString;

    .line 100
    .line 101
    if-eqz p0, :cond_1

    .line 102
    .line 103
    check-cast p1, Lcom/google/protobuf/ByteString;

    .line 104
    .line 105
    sget-boolean p0, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->size()I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世兰苏(I)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    :goto_0
    add-int/2addr p1, p0

    .line 116
    return p1

    .line 117
    :cond_1
    check-cast p1, [B

    .line 118
    .line 119
    sget-boolean p0, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 120
    .line 121
    array-length p0, p1

    .line 122
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世兰苏(I)I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    goto :goto_0

    .line 127
    :pswitch_7
    instance-of p0, p1, Lcom/google/protobuf/ByteString;

    .line 128
    .line 129
    if-eqz p0, :cond_2

    .line 130
    .line 131
    check-cast p1, Lcom/google/protobuf/ByteString;

    .line 132
    .line 133
    sget-boolean p0, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->size()I

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世兰苏(I)I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    goto :goto_0

    .line 144
    :cond_2
    check-cast p1, Ljava/lang/String;

    .line 145
    .line 146
    sget-boolean p0, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 147
    .line 148
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言苏楪世哲兰子;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世兰苏(I)I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    goto :goto_0

    .line 157
    :pswitch_8
    instance-of p0, p1, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 158
    .line 159
    if-eqz p0, :cond_3

    .line 160
    .line 161
    check-cast p1, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 162
    .line 163
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世苏哲兰()I

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    return p0

    .line 168
    :cond_3
    check-cast p1, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 169
    .line 170
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    return p0

    .line 175
    :pswitch_9
    check-cast p1, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 176
    .line 177
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;->getSerializedSize()I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    return p0

    .line 182
    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    sget-boolean p0, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 188
    .line 189
    const/4 p0, 0x1

    .line 190
    return p0

    .line 191
    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    sget-boolean p0, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 197
    .line 198
    return v0

    .line 199
    :pswitch_c
    check-cast p1, Ljava/lang/Long;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    sget-boolean p0, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 205
    .line 206
    return v1

    .line 207
    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    int-to-long p0, p0

    .line 214
    invoke-static {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲苏兰世(J)I

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    return p0

    .line 219
    :pswitch_e
    check-cast p1, Ljava/lang/Long;

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 222
    .line 223
    .line 224
    move-result-wide p0

    .line 225
    invoke-static {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲苏兰世(J)I

    .line 226
    .line 227
    .line 228
    move-result p0

    .line 229
    return p0

    .line 230
    :pswitch_f
    check-cast p1, Ljava/lang/Long;

    .line 231
    .line 232
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 233
    .line 234
    .line 235
    move-result-wide p0

    .line 236
    invoke-static {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲苏兰世(J)I

    .line 237
    .line 238
    .line 239
    move-result p0

    .line 240
    return p0

    .line 241
    :pswitch_10
    check-cast p1, Ljava/lang/Float;

    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    sget-boolean p0, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 247
    .line 248
    return v0

    .line 249
    :pswitch_11
    check-cast p1, Ljava/lang/Double;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    sget-boolean p0, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 255
    .line 256
    return v1

    .line 257
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static 飘花落叶言子楪苏兰哲世(Ljava/util/Map$Entry;)I
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子世兰楪哲苏()Lcom/google/protobuf/WireFormat$JavaType;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sget-object v3, Lcom/google/protobuf/WireFormat$JavaType;->MESSAGE:Lcom/google/protobuf/WireFormat$JavaType;

    .line 16
    .line 17
    if-ne v2, v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->isPacked()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    instance-of v0, v1, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 32
    .line 33
    const/4 v2, 0x3

    .line 34
    const/4 v3, 0x2

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    check-cast v1, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 39
    .line 40
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 45
    .line 46
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->getNumber()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {v4}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏兰哲世(I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    mul-int/2addr v0, v3

    .line 55
    invoke-static {v3, p0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世苏兰(II)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    add-int/2addr p0, v0

    .line 60
    invoke-static {v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏兰哲世(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世苏哲兰()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    add-int/2addr v1, v0

    .line 69
    add-int/2addr v1, p0

    .line 70
    return v1

    .line 71
    :cond_0
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 76
    .line 77
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->getNumber()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    check-cast v1, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 82
    .line 83
    invoke-static {v4}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏兰哲世(I)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    mul-int/2addr v0, v3

    .line 88
    invoke-static {v3, p0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世苏兰(II)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    add-int/2addr p0, v0

    .line 93
    invoke-static {v2, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏世兰哲(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    add-int/2addr v0, p0

    .line 98
    return v0

    .line 99
    :cond_1
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    return p0
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 12
    .line 13
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;
    .locals 6

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 7
    .line 8
    iget v2, v1, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_0
    if-ge v3, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲苏兰(I)Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    iget-object v5, v4, Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;->飘花落叶言子楪哲苏兰世:Ljava/lang/Comparable;

    .line 18
    .line 19
    check-cast v5, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 20
    .line 21
    iget-object v4, v4, Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v0, v5, v4}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲兰苏()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Ljava/util/Map$Entry;

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v0, v3, v2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    iget-boolean p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲苏兰:Z

    .line 64
    .line 65
    iput-boolean p0, v0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲苏兰:Z

    .line 66
    .line 67
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {p1, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子世楪苏哲兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏哲兰世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 22
    .line 23
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 28
    .line 29
    :goto_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const-string p0, "addRepeatedField() can only be called on repeated fields."

    .line 34
    .line 35
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final 飘花落叶言子楪兰世哲苏()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/util/Collections;->emptyIterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-boolean p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲苏兰:Z

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    new-instance p0, Lcom/google/protobuf/飘花落叶言世子兰苏哲楪;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->entrySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroidx/collection/飘花落叶言子楪世苏哲兰;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/collection/飘花落叶言子楪世苏哲兰;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {p0, v0}, Lcom/google/protobuf/飘花落叶言世子兰苏哲楪;-><init>(Ljava/util/Iterator;)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->entrySet()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Landroidx/collection/飘花落叶言子楪世苏哲兰;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/collection/飘花落叶言子楪世苏哲兰;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public final 飘花落叶言子楪兰哲世苏(Ljava/util/Map$Entry;)V
    .locals 6

    .line 1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of v1, p1, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 18
    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏哲兰世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p1, Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    new-instance p0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    :cond_0
    move-object v2, p0

    .line 41
    check-cast v2, Ljava/util/List;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    :goto_0
    if-ge v4, v1, :cond_1

    .line 45
    .line 46
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-static {v5}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    add-int/lit8 v4, v4, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {v3, v0, p0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    const-string p0, "Lazy fields can not be repeated"

    .line 65
    .line 66
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子世兰楪哲苏()Lcom/google/protobuf/WireFormat$JavaType;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    sget-object v4, Lcom/google/protobuf/WireFormat$JavaType;->MESSAGE:Lcom/google/protobuf/WireFormat$JavaType;

    .line 75
    .line 76
    if-ne v2, v4, :cond_8

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏哲兰世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-nez v2, :cond_5

    .line 83
    .line 84
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {v3, v0, p1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    const/4 p1, 0x1

    .line 94
    iput-boolean p1, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲苏兰:Z

    .line 95
    .line 96
    :cond_4
    return-void

    .line 97
    :cond_5
    if-eqz v1, :cond_6

    .line 98
    .line 99
    check-cast p1, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    :cond_6
    invoke-interface {v0, v2}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪兰苏世哲(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-eqz p0, :cond_7

    .line 110
    .line 111
    check-cast v2, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 112
    .line 113
    invoke-interface {v2}, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;->toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;->build()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {v3, v0, p0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_7
    invoke-interface {v0, v2, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_8
    if-nez v1, :cond_9

    .line 133
    .line 134
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {v3, v0, p0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_9
    const-string p0, "Lazy fields must be message-valued"

    .line 143
    .line 144
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method public final 飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    instance-of v0, p2, Ljava/util/List;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p2, Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    :goto_0
    if-ge v2, v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-static {p1, v3}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子世楪苏哲兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object p2, v1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "Wrong object type used with protocol message reflection."

    .line 41
    .line 42
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    invoke-static {p1, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子世楪苏哲兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    instance-of v0, p2, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    iput-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲苏兰:Z

    .line 55
    .line 56
    :cond_3
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 57
    .line 58
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final 飘花落叶言子楪兰苏世哲()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏兰哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 7
    .line 8
    iget v1, v0, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲苏兰(I)Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v3, v3, Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 18
    .line 19
    instance-of v4, v3, Lcom/google/protobuf/GeneratedMessageLite;

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    check-cast v3, Lcom/google/protobuf/GeneratedMessageLite;

    .line 24
    .line 25
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageLite;->makeImmutable()V

    .line 26
    .line 27
    .line 28
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲兰苏()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_4

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    instance-of v3, v2, Lcom/google/protobuf/GeneratedMessageLite;

    .line 56
    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    check-cast v2, Lcom/google/protobuf/GeneratedMessageLite;

    .line 60
    .line 61
    invoke-virtual {v2}, Lcom/google/protobuf/GeneratedMessageLite;->makeImmutable()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世兰哲苏()V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x1

    .line 69
    iput-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏兰哲:Z

    .line 70
    .line 71
    return-void
.end method

.method public final 飘花落叶言子楪兰苏哲世(Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 2
    .line 3
    iget v0, v0, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    iget-object v2, p1, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 7
    .line 8
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲苏兰(I)Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {p0, v2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰哲世苏(Ljava/util/Map$Entry;)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲兰苏()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ljava/util/Map$Entry;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰哲世苏(Ljava/util/Map$Entry;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪哲世兰苏(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)I
    .locals 2

    .line 1
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏哲兰世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    check-cast p0, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_1
    const-string p0, "getRepeatedField() can only be called on repeated fields."

    .line 23
    .line 24
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return v1
.end method

.method public final 飘花落叶言子楪哲世苏兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏哲兰世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    check-cast p0, Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 23
    .line 24
    .line 25
    throw p0

    .line 26
    :cond_1
    const-string p0, "getRepeatedField() can only be called on repeated fields."

    .line 27
    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言子楪哲兰世苏()Z
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 2
    .line 3
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲苏兰(I)Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {v3}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪哲兰苏世(Ljava/util/Map$Entry;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲兰苏()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/util/Map$Entry;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪哲兰苏世(Ljava/util/Map$Entry;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    :goto_1
    return v1

    .line 50
    :cond_3
    const/4 p0, 0x1

    .line 51
    return p0
.end method

.method public final 飘花落叶言子楪哲苏世兰()I
    .locals 5

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 2
    .line 3
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v1, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲苏兰(I)Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, v3, Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;->飘花落叶言子楪哲苏兰世:Ljava/lang/Comparable;

    .line 14
    .line 15
    check-cast v4, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 16
    .line 17
    iget-object v3, v3, Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v4, v3}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    add-int/2addr v2, v3

    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲兰苏()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/util/Map$Entry;

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v1, v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    add-int/2addr v2, v0

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    return v2
.end method

.method public final 飘花落叶言子楪哲苏兰世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    return v1

    .line 19
    :cond_1
    const-string p0, "hasField() can only be called on non-repeated fields."

    .line 20
    .line 21
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return v1
.end method

.method public final 飘花落叶言子楪苏兰世哲()I
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 2
    .line 3
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v1, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲苏兰(I)Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {v3}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏兰哲世(Ljava/util/Map$Entry;)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    add-int/2addr v2, v3

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲兰苏()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/util/Map$Entry;

    .line 40
    .line 41
    invoke-static {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏兰哲世(Ljava/util/Map$Entry;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    add-int/2addr v2, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    return v2
.end method

.method public final 飘花落叶言子楪苏哲世兰()Ljava/util/Map;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲苏兰:Z

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-static {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲苏兰(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;ZZ)Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-boolean p0, p0, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪兰世苏哲:Z

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世兰哲苏()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-object v0

    .line 21
    :cond_1
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪兰世苏哲:Z

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲兰世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of p1, p0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    return-object p0
.end method
