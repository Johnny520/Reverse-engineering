.class public abstract Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public static 飘花落叶言子楪世兰哲苏(Ljava/io/ObjectOutputStream;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/io/DataOutputStream;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    invoke-static {v0, p1, p0}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeOrigin(Ljava/io/DataOutput;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static 飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    :goto_0
    const/16 v2, 0xa

    .line 10
    .line 11
    const/16 v3, 0x20

    .line 12
    .line 13
    if-ge v1, v0, :cond_3

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eq v4, v3, :cond_2

    .line 20
    .line 21
    if-ne v4, v2, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->codePointAt(I)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-static {v4}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲(I)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_3

    .line 33
    .line 34
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/2addr v2, v1

    .line 39
    move v1, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    :goto_2
    if-le v0, v1, :cond_7

    .line 45
    .line 46
    add-int/lit8 v4, v0, -0x1

    .line 47
    .line 48
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eq v5, v3, :cond_6

    .line 53
    .line 54
    if-ne v5, v2, :cond_4

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_4
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_5

    .line 62
    .line 63
    add-int/lit8 v4, v0, -0x2

    .line 64
    .line 65
    invoke-virtual {p0, v4}, Ljava/lang/String;->codePointAt(I)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    const/4 v5, 0x2

    .line 70
    goto :goto_3

    .line 71
    :cond_5
    invoke-virtual {p0, v4}, Ljava/lang/String;->codePointAt(I)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    const/4 v5, 0x1

    .line 76
    :goto_3
    invoke-static {v4}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲(I)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_7

    .line 81
    .line 82
    sub-int/2addr v0, v5

    .line 83
    goto :goto_2

    .line 84
    :cond_6
    :goto_4
    add-int/lit8 v0, v0, -0x1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_7
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method

.method public static 飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "\""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/16 v3, 0x22

    .line 14
    .line 15
    if-ge v1, v2, :cond_5

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v4, 0xc

    .line 22
    .line 23
    if-eq v2, v4, :cond_4

    .line 24
    .line 25
    const/16 v4, 0xd

    .line 26
    .line 27
    if-eq v2, v4, :cond_3

    .line 28
    .line 29
    if-eq v2, v3, :cond_2

    .line 30
    .line 31
    const/16 v3, 0x5c

    .line 32
    .line 33
    if-eq v2, v3, :cond_1

    .line 34
    .line 35
    packed-switch v2, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    if-ltz v2, :cond_0

    .line 39
    .line 40
    const/16 v3, 0x1f

    .line 41
    .line 42
    if-gt v2, v3, :cond_0

    .line 43
    .line 44
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v3, "\\u%04x"

    .line 53
    .line 54
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :pswitch_0
    const-string v2, "\\n"

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :pswitch_1
    const-string v2, "\\t"

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :pswitch_2
    const-string v2, "\\b"

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    const-string v2, "\\\\"

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    const-string v2, "\\\""

    .line 91
    .line 92
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    const-string v2, "\\r"

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    const-string v2, "\\f"

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_5
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/io/ObjectInputStream;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lcom/typesafe/config/impl/SerializedConfigValue;->readOrigin(Ljava/io/DataInput;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏兰哲(I)Z
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0xa0

    .line 10
    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    const/16 v0, 0x2007

    .line 14
    .line 15
    if-eq p0, v0, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x202f

    .line 18
    .line 19
    if-eq p0, v0, :cond_0

    .line 20
    .line 21
    const v0, 0xfeff

    .line 22
    .line 23
    .line 24
    if-eq p0, v0, :cond_0

    .line 25
    .line 26
    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x1

    .line 32
    return p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    if-eqz p0, :cond_1

    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    return v0

    .line 12
    :cond_1
    if-ne p0, p1, :cond_2

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_2
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method
