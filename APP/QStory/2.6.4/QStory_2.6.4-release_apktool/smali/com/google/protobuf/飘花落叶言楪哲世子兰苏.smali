.class public Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言楪哲世子苏兰;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Z

.field public 飘花落叶言子楪世苏兰哲:Ljava/util/Map$Entry;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->access$600(Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;)Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰世哲苏()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;->飘花落叶言子楪世苏哲兰:Ljava/util/Iterator;

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/util/Map$Entry;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/Map$Entry;

    .line 27
    .line 28
    :cond_0
    iput-boolean p2, p0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;->飘花落叶言子楪世哲苏兰:Z

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(ILcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/Map$Entry;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->getNumber()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ge v0, p1, :cond_3

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 26
    .line 27
    iget-boolean v1, p0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;->飘花落叶言子楪世哲苏兰:Z

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子苏楪哲世兰()Lcom/google/protobuf/WireFormat$JavaType;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget-object v2, Lcom/google/protobuf/WireFormat$JavaType;->MESSAGE:Lcom/google/protobuf/WireFormat$JavaType;

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏兰世哲()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/Map$Entry;

    .line 46
    .line 47
    instance-of v1, v1, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;

    .line 48
    .line 49
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->getNumber()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/Map$Entry;

    .line 58
    .line 59
    check-cast v1, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;

    .line 60
    .line 61
    iget-object v1, v1, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲苏兰世:Ljava/util/Map$Entry;

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Lcom/google/protobuf/飘花落叶言世子哲楪兰苏;

    .line 68
    .line 69
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世子哲楪兰苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/ByteString;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p2, v0, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏哲楪兰(ILcom/google/protobuf/ByteString;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->getNumber()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/Map$Entry;

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 88
    .line 89
    invoke-virtual {p2, v0, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏楪兰哲(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/Map$Entry;

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-static {v0, v1, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子世楪哲兰苏(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 100
    .line 101
    .line 102
    :goto_1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;->飘花落叶言子楪世苏哲兰:Ljava/util/Iterator;

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_2

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Ljava/util/Map$Entry;

    .line 115
    .line 116
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/Map$Entry;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    const/4 v0, 0x0

    .line 120
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/Map$Entry;

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_3
    return-void
.end method
