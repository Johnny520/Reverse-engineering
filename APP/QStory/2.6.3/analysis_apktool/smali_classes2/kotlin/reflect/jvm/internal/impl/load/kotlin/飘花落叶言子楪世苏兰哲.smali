.class public final Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:I

.field public final 飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/AnnotatedCallableKind;

.field public final 飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子世楪苏哲兰;

.field public final 飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

.field public final 飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世兰苏哲;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子世楪苏哲兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/AnnotatedCallableKind;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世兰苏哲;

    .line 5
    .line 6
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子世楪苏哲兰;

    .line 7
    .line 8
    iput-object p3, p0, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 9
    .line 10
    iput-object p4, p0, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/AnnotatedCallableKind;

    .line 11
    .line 12
    iput p5, p0, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    instance-of v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    move-object v3, v0

    .line 9
    check-cast v3, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;

    .line 10
    .line 11
    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;->getContextParameterCount()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    instance-of v3, v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    move-object v3, v0

    .line 21
    check-cast v3, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;

    .line 22
    .line 23
    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;->getContextParameterCount()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v3, v2

    .line 29
    :goto_0
    iget-object v4, p0, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子世楪苏哲兰;

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    move-object v1, v0

    .line 35
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;

    .line 36
    .line 37
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;->hasReceiverType()Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-nez v6, :cond_2

    .line 42
    .line 43
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;->hasReceiverTypeId()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_6

    .line 48
    .line 49
    :cond_2
    :goto_1
    move v2, v5

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    instance-of v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;

    .line 52
    .line 53
    if-eqz v1, :cond_4

    .line 54
    .line 55
    move-object v1, v0

    .line 56
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;

    .line 57
    .line 58
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;->hasReceiverType()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-nez v6, :cond_2

    .line 63
    .line 64
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;->hasReceiverTypeId()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_6

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    instance-of v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Constructor;

    .line 72
    .line 73
    if-eqz v1, :cond_7

    .line 74
    .line 75
    move-object v1, v4

    .line 76
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪兰哲世苏;

    .line 77
    .line 78
    iget-object v6, v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Class$Kind;

    .line 79
    .line 80
    sget-object v7, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Class$Kind;->ENUM_CLASS:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Class$Kind;

    .line 81
    .line 82
    if-ne v6, v7, :cond_5

    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    goto :goto_2

    .line 86
    :cond_5
    iget-boolean v1, v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲:Z

    .line 87
    .line 88
    if-eqz v1, :cond_6

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_6
    :goto_2
    add-int/2addr v3, v2

    .line 92
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:I

    .line 93
    .line 94
    add-int/2addr v3, v1

    .line 95
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世兰苏哲;

    .line 96
    .line 97
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/AnnotatedCallableKind;

    .line 98
    .line 99
    invoke-virtual {v1, v4, v0, p0, v3}, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子世楪苏哲兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/AnnotatedCallableKind;I)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_7
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v2, "Unsupported message: "

    .line 113
    .line 114
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0
.end method
