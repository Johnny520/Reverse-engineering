.class public final Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;


# instance fields
.field public 飘花落叶言子楪世苏兰哲:Z

.field public final 飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;-><init>(I)V

    .line 18
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;

    .line 11
    .line 12
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static 飘花落叶言子楪世兰苏哲(Ljava/util/Map$Entry;)Z
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;

    .line 6
    .line 7
    iget-object v1, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 8
    .line 9
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;->getJavaType()Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$JavaType;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$JavaType;->MESSAGE:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$JavaType;

    .line 14
    .line 15
    if-ne v1, v2, :cond_3

    .line 16
    .line 17
    iget-boolean v0, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Z

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 43
    .line 44
    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏兰哲;->isInitialized()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    instance-of v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 60
    .line 61
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏兰哲;->isInitialized()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-nez p0, :cond_3

    .line 66
    .line 67
    :goto_0
    return v1

    .line 68
    :cond_2
    const-string p0, "Wrong object type used with protocol message reflection."

    .line 69
    .line 70
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return v1

    .line 74
    :cond_3
    const/4 p0, 0x1

    .line 75
    return p0
.end method

.method public static 飘花落叶言子楪世哲兰苏(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;Ljava/lang/Object;)I
    .locals 5

    .line 1
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 2
    .line 3
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    iget-boolean v2, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Z

    .line 6
    .line 7
    if-eqz v2, :cond_4

    .line 8
    .line 9
    iget-boolean p0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Z

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    check-cast p1, Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;Ljava/lang/Object;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    add-int/2addr v2, p1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(I)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v2

    .line 41
    invoke-static {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(I)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    :goto_1
    add-int/2addr p1, p0

    .line 46
    return p1

    .line 47
    :cond_1
    check-cast p1, Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(I)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    sget-object v4, Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;->GROUP:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 68
    .line 69
    if-ne v0, v4, :cond_2

    .line 70
    .line 71
    mul-int/lit8 v3, v3, 0x2

    .line 72
    .line 73
    :cond_2
    invoke-static {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;Ljava/lang/Object;)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    add-int/2addr p1, v3

    .line 78
    add-int/2addr v2, p1

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    return v2

    .line 81
    :cond_4
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(I)I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;->GROUP:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 86
    .line 87
    if-ne v0, v1, :cond_5

    .line 88
    .line 89
    mul-int/lit8 p0, p0, 0x2

    .line 90
    .line 91
    :cond_5
    invoke-static {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;Ljava/lang/Object;)I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    goto :goto_1
.end method

.method public static 飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;Ljava/lang/Object;)I
    .locals 4

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:[I

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
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x4

    .line 12
    const/16 v3, 0x8

    .line 13
    .line 14
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    const-string p0, "There is no way to get here, but the compiler thinks otherwise."

    .line 18
    .line 19
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return v0

    .line 23
    :pswitch_0
    instance-of p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;

    .line 28
    .line 29
    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;->getNumber()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(I)I

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
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    return p0

    .line 49
    :pswitch_1
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 50
    .line 51
    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;->getSerializedSize()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(I)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    :goto_0
    add-int/2addr p1, p0

    .line 60
    return p1

    .line 61
    :pswitch_2
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 62
    .line 63
    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;->getSerializedSize()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0

    .line 68
    :pswitch_3
    check-cast p1, Ljava/lang/Long;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide p0

    .line 74
    shl-long v0, p0, v1

    .line 75
    .line 76
    const/16 v2, 0x3f

    .line 77
    .line 78
    shr-long/2addr p0, v2

    .line 79
    xor-long/2addr p0, v0

    .line 80
    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(J)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0

    .line 85
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    shl-int/lit8 p1, p0, 0x1

    .line 92
    .line 93
    shr-int/lit8 p0, p0, 0x1f

    .line 94
    .line 95
    xor-int/2addr p0, p1

    .line 96
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(I)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    return p0

    .line 101
    :pswitch_5
    check-cast p1, Ljava/lang/Long;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    return v3

    .line 107
    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    return v2

    .line 113
    :pswitch_7
    check-cast p1, Ljava/lang/Integer;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(I)I

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    return p0

    .line 124
    :pswitch_8
    instance-of p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 125
    .line 126
    if-eqz p0, :cond_1

    .line 127
    .line 128
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 129
    .line 130
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->size()I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(I)I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->size()I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    goto :goto_0

    .line 143
    :cond_1
    check-cast p1, [B

    .line 144
    .line 145
    array-length p0, p1

    .line 146
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(I)I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    array-length p1, p1

    .line 151
    add-int/2addr p0, p1

    .line 152
    return p0

    .line 153
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 154
    .line 155
    :try_start_0
    const-string p0, "UTF-8"

    .line 156
    .line 157
    invoke-virtual {p1, p0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    array-length p1, p0

    .line 162
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(I)I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    array-length p0, p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    add-int/2addr p1, p0

    .line 168
    return p1

    .line 169
    :catch_0
    move-exception p0

    .line 170
    const-string p1, "UTF-8 not supported."

    .line 171
    .line 172
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    return v0

    .line 176
    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    return v1

    .line 182
    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    return v2

    .line 188
    :pswitch_c
    check-cast p1, Ljava/lang/Long;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    return v3

    .line 194
    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    return p0

    .line 205
    :pswitch_e
    check-cast p1, Ljava/lang/Long;

    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 208
    .line 209
    .line 210
    move-result-wide p0

    .line 211
    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(J)I

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    return p0

    .line 216
    :pswitch_f
    check-cast p1, Ljava/lang/Long;

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 219
    .line 220
    .line 221
    move-result-wide p0

    .line 222
    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(J)I

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    return p0

    .line 227
    :pswitch_10
    check-cast p1, Ljava/lang/Float;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    return v2

    .line 233
    :pswitch_11
    check-cast p1, Ljava/lang/Double;

    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    return v3

    .line 239
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

.method public static 飘花落叶言子楪苏世兰哲(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:[I

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
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const-string p0, "There is no way to get here, but the compiler thinks otherwise."

    .line 15
    .line 16
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    const-string p0, "readPrimitiveField() cannot handle enums."

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    const-string p0, "readPrimitiveField() cannot handle embedded messages."

    .line 27
    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_2
    const-string p0, "readPrimitiveField() cannot handle nested groups."

    .line 33
    .line 34
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_3
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲()J

    .line 39
    .line 40
    .line 41
    move-result-wide p0

    .line 42
    ushr-long v0, p0, v1

    .line 43
    .line 44
    const-wide/16 v2, 0x1

    .line 45
    .line 46
    and-long/2addr p0, v2

    .line 47
    neg-long p0, p0

    .line 48
    xor-long/2addr p0, v0

    .line 49
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    ushr-int/lit8 p1, p0, 0x1

    .line 59
    .line 60
    and-int/2addr p0, v1

    .line 61
    neg-int p0, p0

    .line 62
    xor-int/2addr p0, p1

    .line 63
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :pswitch_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 69
    .line 70
    .line 71
    move-result-wide p0

    .line 72
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_6
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_7
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :pswitch_8
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲世苏;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :pswitch_9
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 105
    .line 106
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:I

    .line 107
    .line 108
    sub-int/2addr v0, v1

    .line 109
    const-string v2, "UTF-8"

    .line 110
    .line 111
    if-gt p1, v0, :cond_0

    .line 112
    .line 113
    if-lez p1, :cond_0

    .line 114
    .line 115
    new-instance v0, Ljava/lang/String;

    .line 116
    .line 117
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:[B

    .line 118
    .line 119
    invoke-direct {v0, v3, v1, p1, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:I

    .line 123
    .line 124
    add-int/2addr v1, p1

    .line 125
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:I

    .line 126
    .line 127
    return-object v0

    .line 128
    :cond_0
    if-nez p1, :cond_1

    .line 129
    .line 130
    const-string p0, ""

    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_1
    new-instance v0, Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)[B

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-direct {v0, p0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-object v0

    .line 143
    :pswitch_a
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲()J

    .line 144
    .line 145
    .line 146
    move-result-wide p0

    .line 147
    const-wide/16 v2, 0x0

    .line 148
    .line 149
    cmp-long p0, p0, v2

    .line 150
    .line 151
    if-eqz p0, :cond_2

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_2
    const/4 v1, 0x0

    .line 155
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0

    .line 160
    :pswitch_b
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲()I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0

    .line 169
    :pswitch_c
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 170
    .line 171
    .line 172
    move-result-wide p0

    .line 173
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0

    .line 178
    :pswitch_d
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0

    .line 187
    :pswitch_e
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲()J

    .line 188
    .line 189
    .line 190
    move-result-wide p0

    .line 191
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    return-object p0

    .line 196
    :pswitch_f
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲()J

    .line 197
    .line 198
    .line 199
    move-result-wide p0

    .line 200
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    return-object p0

    .line 205
    :pswitch_10
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲()I

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    return-object p0

    .line 218
    :pswitch_11
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 219
    .line 220
    .line 221
    move-result-wide p0

    .line 222
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 223
    .line 224
    .line 225
    move-result-wide p0

    .line 226
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    return-object p0

    .line 231
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

.method public static 飘花落叶言子楪苏兰世哲(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:[I

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
    instance-of p1, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    check-cast p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;

    .line 18
    .line 19
    invoke-interface {p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;->getNumber()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰(I)V

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
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰(I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    check-cast p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-interface {p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;->getSerializedSize()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p2, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;->writeTo(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_2
    check-cast p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-interface {p2, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;->writeTo(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_3
    check-cast p2, Ljava/lang/Long;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 65
    .line 66
    .line 67
    move-result-wide p1

    .line 68
    const/4 v0, 0x1

    .line 69
    shl-long v0, p1, v0

    .line 70
    .line 71
    const/16 v2, 0x3f

    .line 72
    .line 73
    shr-long/2addr p1, v2

    .line 74
    xor-long/2addr p1, v0

    .line 75
    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲(J)V

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
    shl-int/lit8 p2, p1, 0x1

    .line 86
    .line 87
    shr-int/lit8 p1, p1, 0x1f

    .line 88
    .line 89
    xor-int/2addr p1, p2

    .line 90
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_5
    check-cast p2, Ljava/lang/Long;

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 97
    .line 98
    .line 99
    move-result-wide p1

    .line 100
    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲(J)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_6
    check-cast p2, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世(I)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :pswitch_7
    check-cast p2, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_8
    instance-of p1, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 125
    .line 126
    if-eqz p1, :cond_1

    .line 127
    .line 128
    check-cast p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->size()I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_1
    check-cast p2, [B

    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    array-length p1, p2

    .line 150
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏([B)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :pswitch_9
    check-cast p2, Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    const-string p1, "UTF-8"

    .line 163
    .line 164
    invoke-virtual {p2, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    array-length p2, p1

    .line 169
    invoke-virtual {p0, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏([B)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :pswitch_a
    check-cast p2, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(I)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :pswitch_b
    check-cast p2, Ljava/lang/Integer;

    .line 187
    .line 188
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世(I)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_c
    check-cast p2, Ljava/lang/Long;

    .line 197
    .line 198
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 199
    .line 200
    .line 201
    move-result-wide p1

    .line 202
    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲(J)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :pswitch_d
    check-cast p2, Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰(I)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :pswitch_e
    check-cast p2, Ljava/lang/Long;

    .line 217
    .line 218
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 219
    .line 220
    .line 221
    move-result-wide p1

    .line 222
    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲(J)V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :pswitch_f
    check-cast p2, Ljava/lang/Long;

    .line 227
    .line 228
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 229
    .line 230
    .line 231
    move-result-wide p1

    .line 232
    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲(J)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :pswitch_10
    check-cast p2, Ljava/lang/Float;

    .line 237
    .line 238
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世(I)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :pswitch_11
    check-cast p2, Ljava/lang/Double;

    .line 254
    .line 255
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 256
    .line 257
    .line 258
    move-result-wide p1

    .line 259
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 263
    .line 264
    .line 265
    move-result-wide p1

    .line 266
    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲(J)V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    nop

    .line 271
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

.method public static 飘花落叶言子楪苏哲兰世(Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:[I

    .line 5
    .line 6
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;->getJavaType()Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$JavaType;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    aget p0, v0, p0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    const/4 v1, 0x0

    .line 18
    packed-switch p0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :pswitch_0
    instance-of v1, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :pswitch_1
    instance-of p0, p1, Ljava/lang/Integer;

    .line 26
    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    instance-of p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v0, v1

    .line 35
    :cond_1
    :goto_0
    move v1, v0

    .line 36
    goto :goto_1

    .line 37
    :pswitch_2
    instance-of p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 38
    .line 39
    if-nez p0, :cond_1

    .line 40
    .line 41
    instance-of p0, p1, [B

    .line 42
    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :pswitch_3
    instance-of v1, p1, Ljava/lang/String;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :pswitch_4
    instance-of v1, p1, Ljava/lang/Boolean;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :pswitch_5
    instance-of v1, p1, Ljava/lang/Double;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :pswitch_6
    instance-of v1, p1, Ljava/lang/Float;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :pswitch_7
    instance-of v1, p1, Ljava/lang/Long;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :pswitch_8
    instance-of v1, p1, Ljava/lang/Integer;

    .line 62
    .line 63
    :goto_1
    if-eqz v1, :cond_2

    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    const-string p0, "Wrong object type used with protocol message reflection."

    .line 67
    .line 68
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    nop

    .line 73
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


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;

    .line 7
    .line 8
    iget-boolean v1, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰世苏哲:Z

    .line 9
    .line 10
    if-nez v1, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    iget-object v2, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-ge v1, v2, :cond_2

    .line 20
    .line 21
    iget-object v2, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/util/Map$Entry;

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;

    .line 34
    .line 35
    iget-boolean v3, v3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Z

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljava/util/List;

    .line 44
    .line 45
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {v2, v3}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Iterable;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Ljava/util/Map$Entry;

    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;

    .line 80
    .line 81
    iget-boolean v3, v3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Z

    .line 82
    .line 83
    if-eqz v3, :cond_3

    .line 84
    .line 85
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Ljava/util/List;

    .line 90
    .line 91
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-interface {v2, v3}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    iget-boolean v1, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰世苏哲:Z

    .line 100
    .line 101
    const/4 v2, 0x1

    .line 102
    if-nez v1, :cond_6

    .line 103
    .line 104
    iget-object v1, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/util/Map;

    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_5

    .line 111
    .line 112
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    iget-object v1, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/util/Map;

    .line 116
    .line 117
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    :goto_2
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/util/Map;

    .line 122
    .line 123
    iput-boolean v2, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰世苏哲:Z

    .line 124
    .line 125
    :cond_6
    iput-boolean v2, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Z

    .line 126
    .line 127
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;
    .locals 4

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;

    .line 8
    .line 9
    iget-object v3, v2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-ge v1, v3, :cond_0

    .line 16
    .line 17
    iget-object v2, v2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/util/Map$Entry;

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v3, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Iterable;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Ljava/util/Map$Entry;

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 6
    .line 7
    invoke-static {v0, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final 飘花落叶言子楪苏世哲兰(Ljava/util/Map$Entry;)V
    .locals 7

    .line 1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-boolean v1, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Z

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;

    .line 15
    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    :cond_0
    check-cast p1, Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    move-object v4, v1

    .line 46
    check-cast v4, Ljava/util/List;

    .line 47
    .line 48
    instance-of v5, v3, [B

    .line 49
    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    check-cast v3, [B

    .line 53
    .line 54
    array-length v5, v3

    .line 55
    new-array v5, v5, [B

    .line 56
    .line 57
    array-length v6, v3

    .line 58
    invoke-static {v3, v2, v5, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    move-object v3, v5

    .line 62
    :cond_1
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-virtual {p0, v0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    iget-object v1, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 71
    .line 72
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;->getJavaType()Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$JavaType;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    sget-object v3, Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$JavaType;->MESSAGE:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$JavaType;

    .line 77
    .line 78
    if-ne v1, v3, :cond_6

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-nez v1, :cond_5

    .line 85
    .line 86
    instance-of v1, p1, [B

    .line 87
    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    check-cast p1, [B

    .line 91
    .line 92
    array-length v1, p1

    .line 93
    new-array v1, v1, [B

    .line 94
    .line 95
    array-length v3, p1

    .line 96
    invoke-static {p1, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 97
    .line 98
    .line 99
    move-object p1, v1

    .line 100
    :cond_4
    invoke-virtual {p0, v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_5
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 105
    .line 106
    invoke-interface {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;->toBuilder()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 111
    .line 112
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;

    .line 113
    .line 114
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;

    .line 115
    .line 116
    invoke-virtual {v1, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;->build()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p0, v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_6
    instance-of v1, p1, [B

    .line 129
    .line 130
    if-eqz v1, :cond_7

    .line 131
    .line 132
    check-cast p1, [B

    .line 133
    .line 134
    array-length v1, p1

    .line 135
    new-array v1, v1, [B

    .line 136
    .line 137
    array-length v3, p1

    .line 138
    invoke-static {p1, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 139
    .line 140
    .line 141
    move-object p1, v1

    .line 142
    :cond_7
    invoke-virtual {p0, v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-boolean v0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Z

    .line 2
    .line 3
    iget-object v1, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 4
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
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    check-cast p2, Ljava/util/List;

    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object p2, v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "Wrong object type used with protocol message reflection."

    .line 42
    .line 43
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    invoke-static {v1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :goto_1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    return-void
.end method
