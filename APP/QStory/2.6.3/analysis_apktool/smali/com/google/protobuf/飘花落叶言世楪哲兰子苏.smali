.class public abstract Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public static 飘花落叶言子楪世兰哲苏([B)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, p0

    .line 9
    if-ge v1, v2, :cond_4

    .line 10
    .line 11
    aget-byte v2, p0, v1

    .line 12
    .line 13
    const/16 v3, 0x22

    .line 14
    .line 15
    if-eq v2, v3, :cond_3

    .line 16
    .line 17
    const/16 v3, 0x27

    .line 18
    .line 19
    if-eq v2, v3, :cond_2

    .line 20
    .line 21
    const/16 v3, 0x5c

    .line 22
    .line 23
    if-eq v2, v3, :cond_1

    .line 24
    .line 25
    packed-switch v2, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    const/16 v4, 0x20

    .line 29
    .line 30
    if-lt v2, v4, :cond_0

    .line 31
    .line 32
    const/16 v4, 0x7e

    .line 33
    .line 34
    if-gt v2, v4, :cond_0

    .line 35
    .line 36
    int-to-char v2, v2

    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    ushr-int/lit8 v3, v2, 0x6

    .line 45
    .line 46
    and-int/lit8 v3, v3, 0x3

    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x30

    .line 49
    .line 50
    int-to-char v3, v3

    .line 51
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    ushr-int/lit8 v3, v2, 0x3

    .line 55
    .line 56
    and-int/lit8 v3, v3, 0x7

    .line 57
    .line 58
    add-int/lit8 v3, v3, 0x30

    .line 59
    .line 60
    int-to-char v3, v3

    .line 61
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    and-int/lit8 v2, v2, 0x7

    .line 65
    .line 66
    add-int/lit8 v2, v2, 0x30

    .line 67
    .line 68
    int-to-char v2, v2

    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :pswitch_0
    const-string v2, "\\r"

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :pswitch_1
    const-string v2, "\\f"

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :pswitch_2
    const-string v2, "\\v"

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_3
    const-string v2, "\\n"

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :pswitch_4
    const-string v2, "\\t"

    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :pswitch_5
    const-string v2, "\\b"

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :pswitch_6
    const-string v2, "\\a"

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    const-string v2, "\\\\"

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    const-string v2, "\\\'"

    .line 122
    .line 123
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    const-string v2, "\\\""

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static 飘花落叶言子楪世兰苏哲(Ljava/lang/String;[BII)I
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    array-length v0, p0

    .line 8
    sub-int/2addr v0, p2

    .line 9
    if-gt v0, p3, :cond_0

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    array-length v0, p0

    .line 13
    invoke-static {p0, p3, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    .line 15
    .line 16
    array-length p0, p0

    .line 17
    add-int/2addr p2, p0

    .line 18
    return p2

    .line 19
    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 20
    .line 21
    const-string p1, "Not enough space in output buffer to encode UTF-8 string"

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/util/List;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-lez v2, :cond_0

    .line 27
    .line 28
    const-string v2, ", "

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/WireFormat$FieldType;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/WireFormat$FieldType;ILjava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/WireFormat$FieldType;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-static {p0, v0, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/WireFormat$FieldType;ILjava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, p1

    .line 16
    return p0
.end method

.method public static 飘花落叶言子楪兰世苏哲(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/WireFormat$FieldType;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子世楪苏兰哲(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/WireFormat$FieldType;ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p1, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/WireFormat$FieldType;

    .line 8
    .line 9
    const/4 p2, 0x2

    .line 10
    invoke-static {p0, p1, p2, p3}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子世楪苏兰哲(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/WireFormat$FieldType;ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static 飘花落叶言子楪哲世兰苏(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;I)Z
    .locals 9

    .line 1
    invoke-virtual {p3}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getMessageSetWireFormat()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v0, :cond_9

    .line 13
    .line 14
    const/16 v0, 0xb

    .line 15
    .line 16
    if-ne p5, v0, :cond_9

    .line 17
    .line 18
    move-object p5, v2

    .line 19
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲兰楪()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v4, 0xc

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v5, 0x10

    .line 29
    .line 30
    if-ne v0, v5, :cond_3

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏兰楪哲()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    instance-of v1, p2, Lcom/google/protobuf/飘花落叶言楪苏子世哲兰;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    move-object v1, p2

    .line 43
    check-cast v1, Lcom/google/protobuf/飘花落叶言楪苏子世哲兰;

    .line 44
    .line 45
    invoke-interface {p4, v1, p3, v0}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言楪苏子世哲兰;Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;I)Lcom/google/protobuf/飘花落叶言楪世兰哲苏子;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object v2, v1

    .line 50
    :cond_2
    move v1, v0

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const/16 v5, 0x1a

    .line 53
    .line 54
    if-ne v0, v5, :cond_5

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    sget-object p5, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 61
    .line 62
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    .line 63
    .line 64
    .line 65
    move-result-object p5

    .line 66
    goto :goto_0

    .line 67
    :cond_5
    if-ne v0, v4, :cond_6

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_6
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世哲楪苏兰(I)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_0

    .line 75
    .line 76
    :goto_1
    invoke-virtual {p0, v4}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰(I)V

    .line 77
    .line 78
    .line 79
    if-eqz p5, :cond_1c

    .line 80
    .line 81
    if-eqz v1, :cond_1c

    .line 82
    .line 83
    if-eqz v2, :cond_8

    .line 84
    .line 85
    iget-object p0, v2, Lcom/google/protobuf/飘花落叶言楪世兰哲苏子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 86
    .line 87
    iget-object p1, v2, Lcom/google/protobuf/飘花落叶言楪世兰哲苏子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 88
    .line 89
    invoke-interface {p4, p0}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->hasField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Z

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    if-nez p3, :cond_7

    .line 94
    .line 95
    sget-object p3, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 96
    .line 97
    new-instance p3, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 98
    .line 99
    invoke-direct {p3, p1, p2, p5}, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;-><init>(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/ByteString;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {p4, p0, p3}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->setField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;

    .line 103
    .line 104
    .line 105
    return v3

    .line 106
    :cond_7
    invoke-interface {p4, p5, p2, p0, p1}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->飘花落叶言子楪世兰苏哲(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-interface {p4, p0, p1}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->setField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;

    .line 111
    .line 112
    .line 113
    return v3

    .line 114
    :cond_8
    if-eqz p1, :cond_1c

    .line 115
    .line 116
    sget-object p0, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世兰哲苏:Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 117
    .line 118
    new-instance p0, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;

    .line 119
    .line 120
    invoke-direct {p0}, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p5}, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/ByteString;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p1, v1, p0}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世哲苏兰(ILcom/google/protobuf/飘花落叶言苏子兰楪哲世;)V

    .line 131
    .line 132
    .line 133
    return v3

    .line 134
    :cond_9
    and-int/lit8 v0, p5, 0x7

    .line 135
    .line 136
    ushr-int/lit8 v4, p5, 0x3

    .line 137
    .line 138
    iget-object v5, p3, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子世楪哲兰苏:[I

    .line 139
    .line 140
    invoke-static {v5, v4}, Ljava/util/Arrays;->binarySearch([II)I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-gez v5, :cond_a

    .line 145
    .line 146
    not-int v5, v5

    .line 147
    sub-int/2addr v5, v3

    .line 148
    :cond_a
    if-ltz v5, :cond_e

    .line 149
    .line 150
    iget-object v6, p3, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子世楪兰苏哲:[I

    .line 151
    .line 152
    aget v5, v6, v5

    .line 153
    .line 154
    if-ge v4, v5, :cond_e

    .line 155
    .line 156
    instance-of v5, p2, Lcom/google/protobuf/飘花落叶言楪苏子世哲兰;

    .line 157
    .line 158
    if-eqz v5, :cond_d

    .line 159
    .line 160
    move-object v5, p2

    .line 161
    check-cast v5, Lcom/google/protobuf/飘花落叶言楪苏子世哲兰;

    .line 162
    .line 163
    invoke-interface {p4, v5, p3, v4}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言楪苏子世哲兰;Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;I)Lcom/google/protobuf/飘花落叶言楪世兰哲苏子;

    .line 164
    .line 165
    .line 166
    move-result-object p3

    .line 167
    if-nez p3, :cond_b

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_b
    iget-object v2, p3, Lcom/google/protobuf/飘花落叶言楪世兰哲苏子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 171
    .line 172
    iget-object p3, p3, Lcom/google/protobuf/飘花落叶言楪世兰哲苏子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 173
    .line 174
    if-nez p3, :cond_f

    .line 175
    .line 176
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    sget-object v6, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 181
    .line 182
    if-eq v5, v6, :cond_c

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_c
    const-string p0, "Message-typed extension lacked default instance: "

    .line 186
    .line 187
    iget-object p1, v2, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 188
    .line 189
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    return v1

    .line 193
    :cond_d
    :goto_2
    move-object p3, v2

    .line 194
    goto :goto_3

    .line 195
    :cond_e
    invoke-interface {p4}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/MessageReflection$MergeTarget$ContainerType;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    sget-object v6, Lcom/google/protobuf/MessageReflection$MergeTarget$ContainerType;->MESSAGE:Lcom/google/protobuf/MessageReflection$MergeTarget$ContainerType;

    .line 200
    .line 201
    if-ne v5, v6, :cond_d

    .line 202
    .line 203
    invoke-virtual {p3, v4}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪哲苏兰世(I)Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 204
    .line 205
    .line 206
    move-result-object p3

    .line 207
    move-object v8, v2

    .line 208
    move-object v2, p3

    .line 209
    move-object p3, v8

    .line 210
    :cond_f
    :goto_3
    const/4 v5, 0x2

    .line 211
    if-nez v2, :cond_11

    .line 212
    .line 213
    :cond_10
    move v0, v1

    .line 214
    move v1, v3

    .line 215
    goto :goto_4

    .line 216
    :cond_11
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏兰世哲()Lcom/google/protobuf/WireFormat$FieldType;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    sget-object v7, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 221
    .line 222
    invoke-virtual {v6}, Lcom/google/protobuf/WireFormat$FieldType;->getWireType()I

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    if-ne v0, v6, :cond_12

    .line 227
    .line 228
    move v0, v1

    .line 229
    goto :goto_4

    .line 230
    :cond_12
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子世楪苏兰哲()Z

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    if-eqz v6, :cond_10

    .line 235
    .line 236
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏兰世哲()Lcom/google/protobuf/WireFormat$FieldType;

    .line 237
    .line 238
    .line 239
    if-ne v0, v5, :cond_10

    .line 240
    .line 241
    move v0, v3

    .line 242
    :goto_4
    if-eqz v1, :cond_14

    .line 243
    .line 244
    if-eqz p1, :cond_13

    .line 245
    .line 246
    invoke-virtual {p1, p5, p0}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世哲兰苏(ILcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Z

    .line 247
    .line 248
    .line 249
    move-result p0

    .line 250
    return p0

    .line 251
    :cond_13
    invoke-virtual {p0, p5}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世哲楪苏兰(I)Z

    .line 252
    .line 253
    .line 254
    move-result p0

    .line 255
    return p0

    .line 256
    :cond_14
    if-eqz v0, :cond_1a

    .line 257
    .line 258
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏兰哲()I

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏兰哲世(I)I

    .line 263
    .line 264
    .line 265
    move-result p2

    .line 266
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏兰世哲()Lcom/google/protobuf/WireFormat$FieldType;

    .line 267
    .line 268
    .line 269
    move-result-object p3

    .line 270
    sget-object p5, Lcom/google/protobuf/WireFormat$FieldType;->ENUM:Lcom/google/protobuf/WireFormat$FieldType;

    .line 271
    .line 272
    if-ne p3, p5, :cond_18

    .line 273
    .line 274
    :cond_15
    :goto_5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世兰苏哲()I

    .line 275
    .line 276
    .line 277
    move-result p3

    .line 278
    if-lez p3, :cond_19

    .line 279
    .line 280
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    .line 281
    .line 282
    .line 283
    move-result p3

    .line 284
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子世楪哲兰苏()Z

    .line 285
    .line 286
    .line 287
    move-result p5

    .line 288
    if-eqz p5, :cond_17

    .line 289
    .line 290
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲苏兰世()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 291
    .line 292
    .line 293
    move-result-object p5

    .line 294
    invoke-virtual {p5, p3}, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;->飘花落叶言子楪哲苏兰世(I)Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;

    .line 295
    .line 296
    .line 297
    move-result-object p5

    .line 298
    if-nez p5, :cond_16

    .line 299
    .line 300
    if-eqz p1, :cond_15

    .line 301
    .line 302
    invoke-virtual {p1, v4, p3}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪苏兰哲世(II)V

    .line 303
    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_16
    invoke-interface {p4, v2, p5}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->addRepeatedField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;

    .line 307
    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_17
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲苏兰世()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 311
    .line 312
    .line 313
    move-result-object p5

    .line 314
    invoke-virtual {p5, p3}, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;->飘花落叶言子楪哲兰世苏(I)Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;

    .line 315
    .line 316
    .line 317
    move-result-object p3

    .line 318
    invoke-interface {p4, v2, p3}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->addRepeatedField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;

    .line 319
    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_18
    :goto_6
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世兰苏哲()I

    .line 323
    .line 324
    .line 325
    move-result p1

    .line 326
    if-lez p1, :cond_19

    .line 327
    .line 328
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏兰世哲()Lcom/google/protobuf/WireFormat$FieldType;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    invoke-interface {p4, v2}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Lcom/google/protobuf/WireFormat$Utf8Validation;

    .line 333
    .line 334
    .line 335
    move-result-object p3

    .line 336
    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰(Lcom/google/protobuf/WireFormat$FieldType;Lcom/google/protobuf/WireFormat$Utf8Validation;)Ljava/io/Serializable;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    invoke-interface {p4, v2, p1}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->addRepeatedField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;

    .line 341
    .line 342
    .line 343
    goto :goto_6

    .line 344
    :cond_19
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏兰世哲(I)V

    .line 345
    .line 346
    .line 347
    return v3

    .line 348
    :cond_1a
    sget-object p5, Lcom/google/protobuf/飘花落叶言世苏哲兰子楪;->飘花落叶言子楪世苏哲兰:[I

    .line 349
    .line 350
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰世哲苏()Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    aget p5, p5, v0

    .line 359
    .line 360
    if-eq p5, v3, :cond_21

    .line 361
    .line 362
    if-eq p5, v5, :cond_20

    .line 363
    .line 364
    const/4 p2, 0x3

    .line 365
    if-eq p5, p2, :cond_1b

    .line 366
    .line 367
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏兰世哲()Lcom/google/protobuf/WireFormat$FieldType;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    invoke-interface {p4, v2}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Lcom/google/protobuf/WireFormat$Utf8Validation;

    .line 372
    .line 373
    .line 374
    move-result-object p2

    .line 375
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰(Lcom/google/protobuf/WireFormat$FieldType;Lcom/google/protobuf/WireFormat$Utf8Validation;)Ljava/io/Serializable;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    goto :goto_7

    .line 380
    :cond_1b
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    .line 381
    .line 382
    .line 383
    move-result p0

    .line 384
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子世楪哲兰苏()Z

    .line 385
    .line 386
    .line 387
    move-result p2

    .line 388
    if-eqz p2, :cond_1e

    .line 389
    .line 390
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲苏兰世()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 391
    .line 392
    .line 393
    move-result-object p2

    .line 394
    invoke-virtual {p2, p0}, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;->飘花落叶言子楪哲苏兰世(I)Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;

    .line 395
    .line 396
    .line 397
    move-result-object p2

    .line 398
    if-nez p2, :cond_1d

    .line 399
    .line 400
    if-eqz p1, :cond_1c

    .line 401
    .line 402
    invoke-virtual {p1, v4, p0}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪苏兰哲世(II)V

    .line 403
    .line 404
    .line 405
    :cond_1c
    return v3

    .line 406
    :cond_1d
    move-object p0, p2

    .line 407
    goto :goto_7

    .line 408
    :cond_1e
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲苏兰世()Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    invoke-virtual {p1, p0}, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;->飘花落叶言子楪哲兰世苏(I)Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    :goto_7
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世哲兰()Z

    .line 417
    .line 418
    .line 419
    move-result p1

    .line 420
    if-eqz p1, :cond_1f

    .line 421
    .line 422
    invoke-interface {p4, v2, p0}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->addRepeatedField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;

    .line 423
    .line 424
    .line 425
    return v3

    .line 426
    :cond_1f
    invoke-interface {p4, v2, p0}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->setField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;

    .line 427
    .line 428
    .line 429
    return v3

    .line 430
    :cond_20
    invoke-interface {p4, p0, p2, v2, p3}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)V

    .line 431
    .line 432
    .line 433
    return v3

    .line 434
    :cond_21
    invoke-interface {p4, p0, p2, v2, p3}, Lcom/google/protobuf/飘花落叶言世苏兰子楪哲;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)V

    .line 435
    .line 436
    .line 437
    return v3
.end method

.method public static 飘花落叶言子楪哲兰世苏(Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;I)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->hasExtendee()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const/16 p0, 0x28

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object p0, p1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 p0, 0x29

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :goto_0
    const/4 p0, -0x1

    .line 38
    if-eq p2, p0, :cond_1

    .line 39
    .line 40
    const/16 p0, 0x5b

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 p0, 0x5d

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    :cond_1
    const/16 p0, 0x2e

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public static 飘花落叶言子楪哲兰苏世(Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;Ljava/util/Map;Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 5

    .line 1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getMessageSetWireFormat()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-object v3, v2, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 46
    .line 47
    invoke-virtual {v3}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->hasExtendee()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰世哲苏()Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    sget-object v4, Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 58
    .line 59
    if-ne v3, v4, :cond_0

    .line 60
    .line 61
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世哲兰()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_0

    .line 66
    .line 67
    iget-object v2, v2, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 68
    .line 69
    invoke-virtual {v2}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->getNumber()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    check-cast v1, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 74
    .line 75
    invoke-virtual {p2, v2, v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏楪兰哲(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    invoke-static {v2, v1, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子世楪哲兰苏(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->writeAsMessageSetTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_2
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public static 飘花落叶言子楪哲苏世兰(Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Ljava/util/AbstractMap$SimpleImmutableEntry;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/WireFormat$FieldType;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/WireFormat$FieldType;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪哲苏子兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 8
    .line 9
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲兰楪()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    invoke-virtual {v2}, Lcom/google/protobuf/WireFormat$FieldType;->getWireType()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/16 v5, 0x8

    .line 21
    .line 22
    or-int/2addr v4, v5

    .line 23
    if-ne v3, v4, :cond_2

    .line 24
    .line 25
    invoke-static {p1, p2, v2, v0}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪哲苏兰世(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-virtual {v1}, Lcom/google/protobuf/WireFormat$FieldType;->getWireType()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const/16 v5, 0x10

    .line 35
    .line 36
    or-int/2addr v4, v5

    .line 37
    if-ne v3, v4, :cond_3

    .line 38
    .line 39
    invoke-static {p1, p2, v1, p0}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪哲苏兰世(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    invoke-virtual {p1, v3}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世哲楪苏兰(I)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_0

    .line 49
    .line 50
    :goto_1
    new-instance p1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 51
    .line 52
    invoke-direct {p1, v0, p0}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object p1
.end method

.method public static 飘花落叶言子楪哲苏兰世(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世楪哲苏兰子;->飘花落叶言子楪世苏哲兰:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    if-eq v0, p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x3

    .line 16
    if-eq v0, p1, :cond_0

    .line 17
    .line 18
    sget-object p1, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 19
    .line 20
    sget-object p1, Lcom/google/protobuf/WireFormat$Utf8Validation;->STRICT:Lcom/google/protobuf/WireFormat$Utf8Validation;

    .line 21
    .line 22
    invoke-virtual {p0, p2, p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰(Lcom/google/protobuf/WireFormat$FieldType;Lcom/google/protobuf/WireFormat$Utf8Validation;)Ljava/io/Serializable;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    const-string p0, "Groups are not allowed in maps."

    .line 28
    .line 29
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_2
    check-cast p3, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 44
    .line 45
    invoke-interface {p3}, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;->toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p0, p2, p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p2}, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;->buildPartial()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method

.method public static 飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 6

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
    :goto_0
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
    move-result v2

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v1, v1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;->getAllFields()Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Ljava/util/Map$Entry;

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 87
    .line 88
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    sget-object v4, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 97
    .line 98
    if-ne v3, v4, :cond_2

    .line 99
    .line 100
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世哲兰()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_3

    .line 105
    .line 106
    check-cast v1, Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const/4 v3, 0x0

    .line 113
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_2

    .line 118
    .line 119
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    check-cast v4, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 124
    .line 125
    add-int/lit8 v5, v3, 0x1

    .line 126
    .line 127
    invoke-static {p1, v2, v3}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-static {v4, v3, p2}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 132
    .line 133
    .line 134
    move v3, v5

    .line 135
    goto :goto_2

    .line 136
    :cond_3
    invoke-interface {p0, v2}, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;->hasField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_2

    .line 141
    .line 142
    check-cast v1, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 143
    .line 144
    const/4 v3, -0x1

    .line 145
    invoke-static {p1, v2, v3}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-static {v1, v2, p2}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    return-void
.end method

.method public static 飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/16 v2, 0x20

    .line 13
    .line 14
    if-lt v1, v2, :cond_1

    .line 15
    .line 16
    const/16 v2, 0x7e

    .line 17
    .line 18
    if-gt v1, v2, :cond_1

    .line 19
    .line 20
    const/16 v2, 0x27

    .line 21
    .line 22
    if-eq v1, v2, :cond_1

    .line 23
    .line 24
    const/16 v2, 0x22

    .line 25
    .line 26
    if-eq v1, v2, :cond_1

    .line 27
    .line 28
    const/16 v2, 0x5c

    .line 29
    .line 30
    if-ne v1, v2, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    :goto_1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪世兰哲苏([B)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :cond_2
    return-object p0
.end method

.method public static 飘花落叶言子楪苏兰哲世(Ljava/nio/ByteBuffer;II)Z
    .locals 6

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言苏楪世哲兰子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;

    .line 2
    .line 3
    add-int/lit8 v0, p2, -0x7

    .line 4
    .line 5
    move v1, p1

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    const-wide v4, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    and-long/2addr v2, v4

    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    cmp-long v2, v2, v4

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x8

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sub-int/2addr v1, p1

    .line 28
    add-int/2addr v1, p1

    .line 29
    :cond_1
    :goto_1
    if-lt v1, p2, :cond_2

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_2
    add-int/lit8 p1, v1, 0x1

    .line 34
    .line 35
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-gez v0, :cond_d

    .line 40
    .line 41
    const/16 v2, -0x20

    .line 42
    .line 43
    const/16 v3, -0x41

    .line 44
    .line 45
    if-ge v0, v2, :cond_5

    .line 46
    .line 47
    if-lt p1, p2, :cond_3

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    const/16 v2, -0x3e

    .line 51
    .line 52
    if-lt v0, v2, :cond_c

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-le p1, v3, :cond_4

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    add-int/lit8 v1, v1, 0x2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_5
    const/16 v4, -0x10

    .line 65
    .line 66
    if-ge v0, v4, :cond_a

    .line 67
    .line 68
    add-int/lit8 v4, p2, -0x1

    .line 69
    .line 70
    if-lt p1, v4, :cond_6

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_6
    add-int/lit8 v4, v1, 0x2

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-gt p1, v3, :cond_c

    .line 80
    .line 81
    const/16 v5, -0x60

    .line 82
    .line 83
    if-ne v0, v2, :cond_7

    .line 84
    .line 85
    if-lt p1, v5, :cond_c

    .line 86
    .line 87
    :cond_7
    const/16 v2, -0x13

    .line 88
    .line 89
    if-ne v0, v2, :cond_8

    .line 90
    .line 91
    if-ge p1, v5, :cond_c

    .line 92
    .line 93
    :cond_8
    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-le p1, v3, :cond_9

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_9
    add-int/lit8 v1, v1, 0x3

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_a
    add-int/lit8 v2, p2, -0x2

    .line 104
    .line 105
    if-lt p1, v2, :cond_b

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_b
    add-int/lit8 v2, v1, 0x2

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-gt p1, v3, :cond_c

    .line 115
    .line 116
    shl-int/lit8 v0, v0, 0x1c

    .line 117
    .line 118
    add-int/lit8 p1, p1, 0x70

    .line 119
    .line 120
    add-int/2addr p1, v0

    .line 121
    shr-int/lit8 p1, p1, 0x1e

    .line 122
    .line 123
    if-nez p1, :cond_c

    .line 124
    .line 125
    add-int/lit8 p1, v1, 0x3

    .line 126
    .line 127
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-gt v0, v3, :cond_c

    .line 132
    .line 133
    add-int/lit8 v1, v1, 0x4

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-le p1, v3, :cond_1

    .line 140
    .line 141
    :cond_c
    :goto_2
    const/4 p0, 0x0

    .line 142
    return p0

    .line 143
    :cond_d
    move v1, p1

    .line 144
    goto :goto_1
.end method

.method public static 飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;Ljava/util/Map;)I
    .locals 6

    .line 1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getMessageSetWireFormat()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v1, 0x0

    .line 22
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/util/Map$Entry;

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    iget-object v4, v3, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 47
    .line 48
    invoke-virtual {v4}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->hasExtendee()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰世哲苏()Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    sget-object v5, Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 59
    .line 60
    if-ne v4, v5, :cond_0

    .line 61
    .line 62
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世哲兰()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_0

    .line 67
    .line 68
    iget-object v3, v3, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 69
    .line 70
    invoke-virtual {v3}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->getNumber()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    check-cast v2, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 75
    .line 76
    const/4 v4, 0x1

    .line 77
    invoke-static {v4}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏兰哲世(I)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    const/4 v5, 0x2

    .line 82
    mul-int/2addr v4, v5

    .line 83
    invoke-static {v5, v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世苏兰(II)I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    add-int/2addr v3, v4

    .line 88
    const/4 v4, 0x3

    .line 89
    invoke-static {v4, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏世兰哲(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    add-int/2addr v2, v3

    .line 94
    :goto_1
    add-int/2addr v2, v1

    .line 95
    move v1, v2

    .line 96
    goto :goto_0

    .line 97
    :cond_0
    invoke-static {v3, v2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-eqz v0, :cond_2

    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->getSerializedSizeAsMessageSet()I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    :goto_2
    add-int/2addr p0, v1

    .line 113
    return p0

    .line 114
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->getSerializedSize()I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    goto :goto_2
.end method

.method public static 飘花落叶言子楪苏哲兰世(B)Z
    .locals 1

    .line 1
    const/16 v0, -0x41

    .line 2
    .line 3
    if-le p0, v0, :cond_0

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


# virtual methods
.method public abstract 飘花落叶言子楪世哲兰苏(Ljava/lang/String;[BII)I
.end method

.method public abstract 飘花落叶言子楪世苏兰哲(I[BI)Ljava/lang/String;
.end method

.method public 飘花落叶言子楪哲世苏兰(Ljava/nio/ByteBuffer;II)Z
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪苏兰哲世(Ljava/nio/ByteBuffer;II)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public abstract 飘花落叶言子楪苏兰世哲(I[BI)Z
.end method
