.class public final Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 7
    .line 8
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;
    .locals 10

    .line 1
    sget-object v0, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/16 v6, 0x2e

    .line 26
    .line 27
    if-ne v2, v6, :cond_1

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    add-int/lit8 v2, v1, -0x1

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-ne v2, v6, :cond_2

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move v2, v4

    .line 40
    move v7, v5

    .line 41
    :goto_0
    if-ge v2, v1, :cond_a

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    const/16 v9, 0x61

    .line 48
    .line 49
    if-lt v8, v9, :cond_3

    .line 50
    .line 51
    const/16 v9, 0x7a

    .line 52
    .line 53
    if-le v8, v9, :cond_5

    .line 54
    .line 55
    :cond_3
    const/16 v9, 0x41

    .line 56
    .line 57
    if-lt v8, v9, :cond_4

    .line 58
    .line 59
    const/16 v9, 0x5a

    .line 60
    .line 61
    if-le v8, v9, :cond_5

    .line 62
    .line 63
    :cond_4
    const/16 v9, 0x5f

    .line 64
    .line 65
    if-ne v8, v9, :cond_6

    .line 66
    .line 67
    :cond_5
    move v7, v4

    .line 68
    goto :goto_1

    .line 69
    :cond_6
    if-ne v8, v6, :cond_8

    .line 70
    .line 71
    if-eqz v7, :cond_7

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_7
    move v7, v5

    .line 75
    goto :goto_1

    .line 76
    :cond_8
    const/16 v9, 0x2d

    .line 77
    .line 78
    if-ne v8, v9, :cond_c

    .line 79
    .line 80
    if-eqz v7, :cond_9

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_9
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_a
    if-eqz v7, :cond_b

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_b
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-static {v3, v0, v1}, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;Ljava/lang/String;I)Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    :cond_c
    :goto_2
    if-eqz v3, :cond_d

    .line 98
    .line 99
    return-object v3

    .line 100
    :cond_d
    new-instance v0, Ljava/io/StringReader;

    .line 101
    .line 102
    invoke-direct {v0, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :try_start_0
    sget-object v1, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 106
    .line 107
    sget-object v2, Lcom/typesafe/config/ConfigSyntax;->CONF:Lcom/typesafe/config/ConfigSyntax;

    .line 108
    .line 109
    new-instance v3, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;

    .line 110
    .line 111
    sget-object v6, Lcom/typesafe/config/ConfigSyntax;->JSON:Lcom/typesafe/config/ConfigSyntax;

    .line 112
    .line 113
    if-eq v2, v6, :cond_e

    .line 114
    .line 115
    move v4, v5

    .line 116
    :cond_e
    invoke-direct {v3, v1, v0, v4}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/io/StringReader;Z)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    invoke-static {v3, v1, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 123
    .line 124
    .line 125
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    invoke-virtual {v0}, Ljava/io/StringReader;->close()V

    .line 127
    .line 128
    .line 129
    return-object p0

    .line 130
    :catchall_0
    move-exception p0

    .line 131
    invoke-virtual {v0}, Ljava/io/StringReader;->close()V

    .line 132
    .line 133
    .line 134
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 21
    .line 22
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    const/16 v0, 0x29

    .line 2
    .line 3
    iget-object v1, p0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v0, v1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    :goto_0
    add-int/2addr v0, p0

    .line 20
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Path("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/StringBuilder;)V

    .line 12
    .line 13
    .line 14
    const-string p0, ")"

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(I)Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_3

    .line 3
    .line 4
    new-instance v1, Ljava/util/Stack;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/Stack;-><init>()V

    .line 7
    .line 8
    .line 9
    move v2, p1

    .line 10
    :goto_0
    if-lez v2, :cond_1

    .line 11
    .line 12
    add-int/lit8 v2, v2, -0x1

    .line 13
    .line 14
    iget-object v3, p0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p0, "subPath lastIndex out of range "

    .line 25
    .line 26
    invoke-static {p1, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_1
    :goto_1
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ljava/lang/String;

    .line 45
    .line 46
    new-instance p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 47
    .line 48
    invoke-direct {p1, p0, v0}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/String;Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)V

    .line 49
    .line 50
    .line 51
    move-object v0, p1

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    return-object v0

    .line 54
    :cond_3
    const-string p0, "bad call to subPath"

    .line 55
    .line 56
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method public final 飘花落叶言子楪世哲兰苏()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/StringBuilder;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    new-instance v0, Ljava/util/Stack;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 10
    .line 11
    .line 12
    :goto_0
    iget-object v2, p0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    iget-object v2, p0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/lang/String;

    .line 35
    .line 36
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 37
    .line 38
    invoke-direct {v2, p0, v1}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/String;Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)V

    .line 39
    .line 40
    .line 41
    move-object v1, v2

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    return-object v1
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/StringBuilder;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v3}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    const/16 v4, 0x2d

    .line 24
    .line 25
    if-eq v3, v4, :cond_1

    .line 26
    .line 27
    const/16 v4, 0x5f

    .line 28
    .line 29
    if-ne v3, v4, :cond_3

    .line 30
    .line 31
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    :cond_3
    invoke-static {v0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_4
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :goto_2
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 52
    .line 53
    if-eqz p0, :cond_5

    .line 54
    .line 55
    const-string v0, "."

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/StringBuilder;)V

    .line 61
    .line 62
    .line 63
    :cond_5
    return-void
.end method
