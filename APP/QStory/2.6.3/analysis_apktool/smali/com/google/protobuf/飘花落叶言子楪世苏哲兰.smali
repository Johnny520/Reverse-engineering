.class public abstract Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;
.super Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    }
.end annotation


# instance fields
.field protected memoizedSize:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 6
    .line 7
    return-void
.end method

.method private static compareBytes(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p0, [B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p1, [B

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, [B

    .line 10
    .line 11
    check-cast p1, [B

    .line 12
    .line 13
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->toByteString(Ljava/lang/Object;)Lcom/google/protobuf/ByteString;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->toByteString(Ljava/lang/Object;)Lcom/google/protobuf/ByteString;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ByteString;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public static compareFields(Ljava/util/Map;Ljava/util/Map;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u4e16\u82cf\u54f2;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u4e16\u82cf\u54f2;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_8

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 32
    .line 33
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    return v2

    .line 40
    :cond_2
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰世哲苏()Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    sget-object v6, Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;->BYTES:Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 53
    .line 54
    if-ne v5, v6, :cond_6

    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世哲兰()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_5

    .line 61
    .line 62
    check-cast v3, Ljava/util/List;

    .line 63
    .line 64
    check-cast v4, Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eq v1, v5, :cond_3

    .line 75
    .line 76
    return v2

    .line 77
    :cond_3
    move v1, v2

    .line 78
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-ge v1, v5, :cond_1

    .line 83
    .line 84
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-static {v5, v6}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->compareBytes(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-nez v5, :cond_4

    .line 97
    .line 98
    return v2

    .line 99
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    invoke-static {v3, v4}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->compareBytes(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_1

    .line 107
    .line 108
    return v2

    .line 109
    :cond_6
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰哲世苏()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_7

    .line 114
    .line 115
    invoke-static {v3, v4}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->compareMapField(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-nez v1, :cond_1

    .line 120
    .line 121
    return v2

    .line 122
    :cond_7
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_1

    .line 127
    .line 128
    return v2

    .line 129
    :cond_8
    const/4 p0, 0x1

    .line 130
    return p0
.end method

.method private static compareMapField(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p0, Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->convertMapEntryListToMap(Ljava/util/List;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p1, Ljava/util/List;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->convertMapEntryListToMap(Ljava/util/List;)Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p0, p1}, Lcom/google/protobuf/MapFieldLite;->equals(Ljava/util/Map;Ljava/util/Map;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method private static convertMapEntryListToMap(Ljava/util/List;)Ljava/util/Map;
    .locals 6

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 24
    .line 25
    invoke-interface {v1}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "key"

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;)Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v4, "value"

    .line 36
    .line 37
    invoke-virtual {v2, v4}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;)Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v1, v2}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    instance-of v5, v4, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;

    .line 46
    .line 47
    if-eqz v5, :cond_1

    .line 48
    .line 49
    check-cast v4, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;

    .line 50
    .line 51
    iget-object v4, v4, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;

    .line 52
    .line 53
    invoke-virtual {v4}, Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;->getNumber()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    :cond_1
    invoke-interface {v1, v3}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 79
    .line 80
    invoke-interface {v1, v2}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    instance-of v5, v4, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;

    .line 85
    .line 86
    if-eqz v5, :cond_2

    .line 87
    .line 88
    check-cast v4, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;

    .line 89
    .line 90
    iget-object v4, v4, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;

    .line 91
    .line 92
    invoke-virtual {v4}, Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;->getNumber()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    :cond_2
    invoke-interface {v1, v3}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    return-object v0
.end method

.method public static hashFields(ILjava/util/Map;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u4e16\u82cf\u54f2;",
            "Ljava/lang/Object;",
            ">;)I"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    mul-int/lit8 p0, p0, 0x25

    .line 32
    .line 33
    iget-object v2, v1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->getNumber()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    add-int/2addr v2, p0

    .line 40
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰哲世苏()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    mul-int/lit8 v2, v2, 0x35

    .line 47
    .line 48
    invoke-static {v0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->hashMapField(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int/2addr v2, p0

    .line 53
    :goto_1
    move p0, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰世哲苏()Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    sget-object v3, Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;->ENUM:Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 60
    .line 61
    if-eq p0, v3, :cond_1

    .line 62
    .line 63
    mul-int/lit8 v2, v2, 0x35

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    :goto_2
    add-int/2addr p0, v2

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世哲兰()Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_3

    .line 76
    .line 77
    check-cast v0, Ljava/util/List;

    .line 78
    .line 79
    mul-int/lit8 v2, v2, 0x35

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const/4 v0, 0x1

    .line 86
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;

    .line 97
    .line 98
    mul-int/lit8 v0, v0, 0x1f

    .line 99
    .line 100
    invoke-interface {v1}, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;->getNumber()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    add-int/2addr v0, v1

    .line 105
    goto :goto_3

    .line 106
    :cond_2
    add-int/2addr v2, v0

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    mul-int/lit8 v2, v2, 0x35

    .line 109
    .line 110
    check-cast v0, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;

    .line 111
    .line 112
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;->getNumber()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    return p0
.end method

.method private static hashMapField(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p0, Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->convertMapEntryListToMap(Ljava/util/List;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lcom/google/protobuf/MapFieldLite;->calculateHashCodeForMap(Ljava/util/Map;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static toByteString(Ljava/lang/Object;)Lcom/google/protobuf/ByteString;
    .locals 1

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
    invoke-static {p0}, Lcom/google/protobuf/ByteString;->copyFrom([B)Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    check-cast p0, Lcom/google/protobuf/ByteString;

    .line 13
    .line 14
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    if-eq v1, v3, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->getAllFields()Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->getAllFields()Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v1, v3}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->compareFields(Ljava/util/Map;Ljava/util/Map;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_3

    .line 51
    .line 52
    return v0

    .line 53
    :cond_3
    return v2
.end method

.method public findInitializationErrors()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    invoke-static {p0, v1, v0}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public abstract synthetic getAllFields()Ljava/util/Map;
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;->getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public abstract synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
.end method

.method public abstract synthetic getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
.end method

.method public abstract synthetic getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;
.end method

.method public getInitializationErrorString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->findInitializationErrors()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪世哲苏兰(Ljava/util/List;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getMemoizedSerializedSize()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 2
    .line 3
    return p0
.end method

.method public getOneofFieldDescriptor(Lcom/google/protobuf/飘花落叶言楪世子苏哲兰;)Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "getOneofFieldDescriptor() is not implemented."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public abstract synthetic getParserForType()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
.end method

.method public abstract synthetic getRepeatedField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;I)Ljava/lang/Object;
.end method

.method public abstract synthetic getRepeatedFieldCount(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)I
.end method

.method public getSerializedSize()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->getAllFields()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0, v0}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;Ljava/util/Map;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 16
    .line 17
    return v0
.end method

.method public abstract synthetic getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;
.end method

.method public abstract synthetic hasField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Z
.end method

.method public hasOneof(Lcom/google/protobuf/飘花落叶言楪世子苏哲兰;)Z
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "hasOneof() is not implemented."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/lit16 v0, v0, 0x30b

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->getAllFields()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->hashFields(ILjava/util/Map;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    mul-int/lit8 v0, v0, 0x1d

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v0

    .line 34
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 35
    .line 36
    return v1

    .line 37
    :cond_0
    return v0
.end method

.method public isInitialized()Z
    .locals 4

    .line 1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;->getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪哲兰世苏()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子世楪哲苏兰()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {p0, v1}, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;->hasField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;->getAllFields()Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_5

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Ljava/util/Map$Entry;

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 67
    .line 68
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    sget-object v3, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 73
    .line 74
    if-ne v2, v3, :cond_2

    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世哲兰()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_2

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 103
    .line 104
    invoke-interface {v1}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->isInitialized()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_3

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 116
    .line 117
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->isInitialized()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_2

    .line 122
    .line 123
    :goto_0
    const/4 p0, 0x0

    .line 124
    return p0

    .line 125
    :cond_5
    const/4 p0, 0x1

    .line 126
    return p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 9
    invoke-super {p0}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    move-result-object p0

    return-object p0
.end method

.method public abstract synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
.end method

.method public newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Nested builder is not supported for this type."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public newUninitializedMessageException()Lcom/google/protobuf/UninitializedMessageException;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->newUninitializedMessageException(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/UninitializedMessageException;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public setMemoizedSerializedSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 2
    .line 3
    return-void
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public abstract synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/protobuf/飘花落叶言苏子楪世兰哲;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/飘花落叶言苏子楪世兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;->REPORT_ALL:Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/google/protobuf/飘花落叶言苏子楪世兰哲;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->getAllFields()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0, p1}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪哲兰苏世(Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;Ljava/util/Map;Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
