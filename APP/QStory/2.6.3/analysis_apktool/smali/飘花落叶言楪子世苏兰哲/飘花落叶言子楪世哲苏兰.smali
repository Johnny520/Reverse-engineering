.class public abstract L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Ljava/util/HashSet;

.field public static final 飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const-string v12, "do"

    .line 4
    .line 5
    const-string v13, "try"

    .line 6
    .line 7
    const-string v1, "if"

    .line 8
    .line 9
    const-string v2, "for"

    .line 10
    .line 11
    const-string v3, "while"

    .line 12
    .line 13
    const-string v4, "switch"

    .line 14
    .line 15
    const-string v5, "catch"

    .line 16
    .line 17
    const-string v6, "synchronized"

    .line 18
    .line 19
    const-string v7, "new"

    .line 20
    .line 21
    const-string v8, "return"

    .line 22
    .line 23
    const-string v9, "throw"

    .line 24
    .line 25
    const-string v10, "assert"

    .line 26
    .line 27
    const-string v11, "case"

    .line 28
    .line 29
    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 41
    .line 42
    new-instance v0, Ljava/util/HashSet;

    .line 43
    .line 44
    const-string v9, "strictfp"

    .line 45
    .line 46
    const-string v10, "default"

    .line 47
    .line 48
    const-string v1, "public"

    .line 49
    .line 50
    const-string v2, "protected"

    .line 51
    .line 52
    const-string v3, "private"

    .line 53
    .line 54
    const-string v4, "static"

    .line 55
    .line 56
    const-string v5, "final"

    .line 57
    .line 58
    const-string v6, "synchronized"

    .line 59
    .line 60
    const-string v7, "native"

    .line 61
    .line 62
    const-string v8, "abstract"

    .line 63
    .line 64
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 73
    .line 74
    .line 75
    sput-object v0, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/HashSet;

    .line 76
    .line 77
    return-void
.end method

.method public static 飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_8

    .line 16
    .line 17
    invoke-static {v2, p0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(ILjava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-le v3, v2, :cond_1

    .line 22
    .line 23
    :goto_1
    move v2, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_3

    .line 34
    .line 35
    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    const/16 v4, 0x40

    .line 39
    .line 40
    if-ne v3, v4, :cond_6

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    :goto_3
    if-ge v2, v3, :cond_5

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    invoke-static {v4}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-nez v5, :cond_4

    .line 59
    .line 60
    const/16 v5, 0x2e

    .line 61
    .line 62
    if-ne v4, v5, :cond_5

    .line 63
    .line 64
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_5
    invoke-static {v2, p0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-ge v2, v3, :cond_0

    .line 72
    .line 73
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    const/16 v5, 0x28

    .line 78
    .line 79
    if-ne v4, v5, :cond_0

    .line 80
    .line 81
    const/16 v4, 0x29

    .line 82
    .line 83
    invoke-static {p0, v2, v5, v4}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;ICC)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-gez v2, :cond_2

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_6
    const-string v4, "final"

    .line 91
    .line 92
    invoke-static {v2, p0, v4}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_7

    .line 97
    .line 98
    add-int/lit8 v2, v2, 0x5

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_7
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0
.end method

.method public static 飘花落叶言子楪世兰苏哲(ILjava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, 0x20

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 p1, 0x28

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    move v1, p1

    .line 22
    :goto_0
    if-ge v1, p0, :cond_8

    .line 23
    .line 24
    if-lez v1, :cond_0

    .line 25
    .line 26
    const/16 v2, 0x2c

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v2}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    invoke-static {v2}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    goto :goto_4

    .line 48
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    const/4 v5, 0x1

    .line 53
    sub-int/2addr v4, v5

    .line 54
    invoke-static {v4, v2}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(ILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    :goto_1
    if-lt v4, v5, :cond_2

    .line 59
    .line 60
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    const/16 v7, 0x5d

    .line 65
    .line 66
    if-ne v6, v7, :cond_2

    .line 67
    .line 68
    add-int/lit8 v6, v4, -0x1

    .line 69
    .line 70
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    const/16 v7, 0x5b

    .line 75
    .line 76
    if-ne v6, v7, :cond_2

    .line 77
    .line 78
    add-int/lit8 v4, v4, -0x2

    .line 79
    .line 80
    invoke-static {v4, v2}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(ILjava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    const/4 v5, -0x1

    .line 86
    if-gez v4, :cond_3

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    add-int/lit8 v6, v4, 0x1

    .line 90
    .line 91
    :goto_2
    if-ltz v4, :cond_4

    .line 92
    .line 93
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    invoke-static {v7}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-eqz v7, :cond_4

    .line 102
    .line 103
    add-int/lit8 v4, v4, -0x1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 107
    .line 108
    if-lt v4, v6, :cond_5

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_5
    invoke-virtual {v2, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_6

    .line 120
    .line 121
    move v5, v4

    .line 122
    :cond_6
    :goto_3
    if-gez v5, :cond_7

    .line 123
    .line 124
    invoke-static {v2}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    goto :goto_4

    .line 129
    :cond_7
    invoke-virtual {v2, p1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    add-int/2addr v3, v5

    .line 138
    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-static {v2}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :goto_4
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    add-int/lit8 v1, v1, 0x1

    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_8
    const/16 p0, 0x29

    .line 158
    .line 159
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0
.end method

.method public static 飘花落叶言子楪世哲兰苏(ILjava/util/ArrayList;)Ljava/lang/String;
    .locals 3

    .line 1
    if-gtz p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, p0, :cond_2

    .line 13
    .line 14
    if-lez v1, :cond_1

    .line 15
    .line 16
    const-string v2, ", "

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static 飘花落叶言子楪世哲苏兰(ILjava/lang/String;)I
    .locals 7

    .line 1
    invoke-static {p0, p1}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-lt p0, v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :cond_0
    const-string v0, "throws"

    .line 15
    .line 16
    invoke-static {p0, p1, v0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/16 v3, 0x7b

    .line 21
    .line 22
    if-eqz v2, :cond_b

    .line 23
    .line 24
    invoke-static {p0, p1}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-static {p0, p1, v0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_1
    add-int/lit8 p0, p0, 0x6

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v2, 0x1

    .line 42
    :goto_0
    move v4, v2

    .line 43
    :goto_1
    if-ge p0, v0, :cond_2

    .line 44
    .line 45
    invoke-static {p0, p1}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-lt p0, v0, :cond_3

    .line 50
    .line 51
    :cond_2
    :goto_2
    move p0, v1

    .line 52
    goto :goto_4

    .line 53
    :cond_3
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-ne v5, v3, :cond_4

    .line 58
    .line 59
    if-eqz v4, :cond_9

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    const/16 v6, 0x3b

    .line 63
    .line 64
    if-ne v5, v6, :cond_5

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_5
    if-eqz v4, :cond_8

    .line 68
    .line 69
    invoke-static {v5}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-nez v4, :cond_6

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_6
    :goto_3
    add-int/lit8 p0, p0, 0x1

    .line 77
    .line 78
    if-ge p0, v0, :cond_7

    .line 79
    .line 80
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    invoke-static {v4}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-nez v5, :cond_6

    .line 89
    .line 90
    const/16 v5, 0x2e

    .line 91
    .line 92
    if-eq v4, v5, :cond_6

    .line 93
    .line 94
    const/16 v5, 0x24

    .line 95
    .line 96
    if-ne v4, v5, :cond_7

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_7
    const/4 v4, 0x0

    .line 100
    goto :goto_1

    .line 101
    :cond_8
    const/16 v4, 0x2c

    .line 102
    .line 103
    if-ne v5, v4, :cond_2

    .line 104
    .line 105
    add-int/lit8 p0, p0, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_9
    :goto_4
    if-gez p0, :cond_a

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_a
    invoke-static {p0, p1}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    :cond_b
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-ge p0, v0, :cond_c

    .line 120
    .line 121
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-ne p1, v3, :cond_c

    .line 126
    .line 127
    return p0

    .line 128
    :cond_c
    :goto_5
    return v1
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/String;ICC)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge p1, v0, :cond_3

    .line 7
    .line 8
    invoke-static {p1, p0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(ILjava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-le v2, p1, :cond_0

    .line 13
    .line 14
    add-int/lit8 p1, v2, -0x1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ne v2, p2, :cond_1

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    if-ne v2, p3, :cond_2

    .line 27
    .line 28
    add-int/lit8 v1, v1, -0x1

    .line 29
    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    return p1

    .line 33
    :cond_2
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    const/4 p0, -0x1

    .line 37
    return p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    invoke-static {v0, p0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(ILjava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-gez v0, :cond_0

    .line 13
    .line 14
    return-object v2

    .line 15
    :cond_0
    :goto_0
    if-lt v0, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/16 v4, 0x5d

    .line 22
    .line 23
    if-ne v3, v4, :cond_1

    .line 24
    .line 25
    add-int/lit8 v3, v0, -0x1

    .line 26
    .line 27
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/16 v4, 0x5b

    .line 32
    .line 33
    if-ne v3, v4, :cond_1

    .line 34
    .line 35
    add-int/lit8 v0, v0, -0x2

    .line 36
    .line 37
    invoke-static {v0, p0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(ILjava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    if-gez v0, :cond_2

    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    add-int/lit8 v3, v0, 0x1

    .line 46
    .line 47
    :goto_1
    if-ltz v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-static {v4}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    add-int/lit8 v0, v0, -0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    add-int/2addr v0, v1

    .line 63
    if-lt v0, v3, :cond_4

    .line 64
    .line 65
    return-object v2

    .line 66
    :cond_4
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {v0}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_5
    return-object v2
.end method

.method public static 飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    if-ge p0, v0, :cond_1

    .line 6
    .line 7
    :goto_1
    if-ge p0, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    add-int/lit8 p0, p0, 0x1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-static {p0, p1}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(ILjava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-le v1, p0, :cond_1

    .line 27
    .line 28
    add-int/lit8 v2, p0, 0x1

    .line 29
    .line 30
    if-ge v2, v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/16 v3, 0x2f

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    move p0, v1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return p0
.end method

.method public static 飘花落叶言子楪苏世哲兰(ILjava/lang/String;)I
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz p0, :cond_e

    .line 6
    .line 7
    if-lt p0, v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_7

    .line 10
    .line 11
    :cond_0
    if-ltz p0, :cond_2

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    add-int v2, v1, p0

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-gt v2, v3, :cond_2

    .line 21
    .line 22
    const-string v3, "\"\"\""

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-virtual {p1, p0, v3, v4, v1}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-gez p0, :cond_1

    .line 36
    .line 37
    goto/16 :goto_6

    .line 38
    .line 39
    :cond_1
    add-int/2addr p0, v1

    .line 40
    return p0

    .line 41
    :cond_2
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/16 v2, 0x5c

    .line 46
    .line 47
    const/16 v3, 0x22

    .line 48
    .line 49
    if-ne v1, v3, :cond_5

    .line 50
    .line 51
    :goto_0
    add-int/lit8 p0, p0, 0x1

    .line 52
    .line 53
    :goto_1
    if-ge p0, v0, :cond_c

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-ne v1, v2, :cond_3

    .line 60
    .line 61
    add-int/lit8 p0, p0, 0x2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    if-ne v1, v3, :cond_4

    .line 65
    .line 66
    add-int/lit8 p0, p0, 0x1

    .line 67
    .line 68
    return p0

    .line 69
    :cond_4
    goto :goto_0

    .line 70
    :cond_5
    const/16 v3, 0x27

    .line 71
    .line 72
    if-ne v1, v3, :cond_8

    .line 73
    .line 74
    :goto_2
    add-int/lit8 p0, p0, 0x1

    .line 75
    .line 76
    :goto_3
    if-ge p0, v0, :cond_c

    .line 77
    .line 78
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-ne v1, v2, :cond_6

    .line 83
    .line 84
    add-int/lit8 p0, p0, 0x2

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_6
    if-ne v1, v3, :cond_7

    .line 88
    .line 89
    add-int/lit8 p0, p0, 0x1

    .line 90
    .line 91
    return p0

    .line 92
    :cond_7
    goto :goto_2

    .line 93
    :cond_8
    const/16 v2, 0x2f

    .line 94
    .line 95
    if-ne v1, v2, :cond_e

    .line 96
    .line 97
    add-int/lit8 v1, p0, 0x1

    .line 98
    .line 99
    if-ge v1, v0, :cond_e

    .line 100
    .line 101
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-ne v1, v2, :cond_b

    .line 106
    .line 107
    add-int/lit8 p0, p0, 0x2

    .line 108
    .line 109
    :goto_4
    if-ge p0, v0, :cond_a

    .line 110
    .line 111
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    const/16 v2, 0xa

    .line 116
    .line 117
    if-eq v1, v2, :cond_a

    .line 118
    .line 119
    const/16 v2, 0xd

    .line 120
    .line 121
    if-ne v1, v2, :cond_9

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_9
    add-int/lit8 p0, p0, 0x1

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_a
    :goto_5
    return p0

    .line 128
    :cond_b
    const/16 v2, 0x2a

    .line 129
    .line 130
    if-ne v1, v2, :cond_e

    .line 131
    .line 132
    const-string v1, "*/"

    .line 133
    .line 134
    add-int/lit8 p0, p0, 0x2

    .line 135
    .line 136
    invoke-virtual {p1, v1, p0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-gez p0, :cond_d

    .line 141
    .line 142
    :cond_c
    :goto_6
    return v0

    .line 143
    :cond_d
    add-int/lit8 p0, p0, 0x2

    .line 144
    .line 145
    :cond_e
    :goto_7
    return p0
.end method

.method public static 飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;
    .locals 23

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    add-int/lit8 v2, v0, -0x1

    .line 6
    .line 7
    invoke-static {v2, v1}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(ILjava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    add-int/2addr v2, v3

    .line 13
    move v4, v2

    .line 14
    :goto_0
    if-lez v4, :cond_0

    .line 15
    .line 16
    add-int/lit8 v5, v4, -0x1

    .line 17
    .line 18
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    invoke-static {v5}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    add-int/lit8 v4, v4, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    if-lt v4, v2, :cond_2

    .line 32
    .line 33
    :cond_1
    :goto_1
    const/16 v16, 0x0

    .line 34
    .line 35
    goto/16 :goto_18

    .line 36
    .line 37
    :cond_2
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    invoke-static {v7}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eqz v7, :cond_1

    .line 51
    .line 52
    sget-object v7, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 53
    .line 54
    invoke-virtual {v7, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    add-int/lit8 v7, v4, -0x1

    .line 62
    .line 63
    invoke-static {v7, v1}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(ILjava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-ltz v7, :cond_4

    .line 68
    .line 69
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    const/16 v8, 0x2e

    .line 74
    .line 75
    if-eq v7, v8, :cond_1

    .line 76
    .line 77
    const/16 v8, 0x3a

    .line 78
    .line 79
    if-eq v7, v8, :cond_1

    .line 80
    .line 81
    const/16 v8, 0x24

    .line 82
    .line 83
    if-ne v7, v8, :cond_4

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    const/16 v7, 0x28

    .line 87
    .line 88
    const/16 v8, 0x29

    .line 89
    .line 90
    invoke-static {v1, v0, v7, v8}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;ICC)I

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-gez v9, :cond_5

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    add-int/lit8 v10, v9, 0x1

    .line 98
    .line 99
    invoke-static {v10, v1}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    if-ge v11, v12, :cond_6

    .line 108
    .line 109
    const-string v12, "->"

    .line 110
    .line 111
    invoke-virtual {v1, v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-eqz v11, :cond_6

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_6
    invoke-static {v10, v1}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    if-gez v10, :cond_7

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_7
    const/16 v11, 0x7b

    .line 126
    .line 127
    const/16 v12, 0x7d

    .line 128
    .line 129
    invoke-static {v1, v10, v11, v12}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;ICC)I

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-gez v10, :cond_8

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_8
    add-int/2addr v0, v3

    .line 137
    invoke-virtual {v1, v0, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    new-instance v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;

    .line 142
    .line 143
    invoke-direct {v9}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-boolean v3, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    if-eqz v13, :cond_9

    .line 157
    .line 158
    iput-boolean v3, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 159
    .line 160
    move v8, v6

    .line 161
    const/16 v16, 0x0

    .line 162
    .line 163
    goto/16 :goto_10

    .line 164
    .line 165
    :cond_9
    new-instance v13, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    move v5, v6

    .line 175
    move v15, v5

    .line 176
    move/from16 v17, v15

    .line 177
    .line 178
    move/from16 v18, v17

    .line 179
    .line 180
    move/from16 v19, v18

    .line 181
    .line 182
    move/from16 v20, v19

    .line 183
    .line 184
    const/16 v16, 0x0

    .line 185
    .line 186
    :goto_2
    const/16 v3, 0x5d

    .line 187
    .line 188
    const/16 v12, 0x5b

    .line 189
    .line 190
    if-ge v15, v14, :cond_14

    .line 191
    .line 192
    invoke-static {v15, v0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(ILjava/lang/String;)I

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    if-le v11, v15, :cond_a

    .line 197
    .line 198
    move v15, v11

    .line 199
    :goto_3
    const/16 v11, 0x7b

    .line 200
    .line 201
    const/16 v12, 0x7d

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_a
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 205
    .line 206
    .line 207
    move-result v11

    .line 208
    if-ne v11, v7, :cond_b

    .line 209
    .line 210
    add-int/lit8 v17, v17, 0x1

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_b
    if-ne v11, v8, :cond_c

    .line 214
    .line 215
    add-int/lit8 v3, v17, -0x1

    .line 216
    .line 217
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    move/from16 v17, v3

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_c
    if-ne v11, v12, :cond_d

    .line 225
    .line 226
    add-int/lit8 v18, v18, 0x1

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_d
    if-ne v11, v3, :cond_e

    .line 230
    .line 231
    add-int/lit8 v3, v18, -0x1

    .line 232
    .line 233
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    move/from16 v18, v3

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_e
    const/16 v3, 0x7b

    .line 241
    .line 242
    if-ne v11, v3, :cond_f

    .line 243
    .line 244
    add-int/lit8 v19, v19, 0x1

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_f
    const/16 v3, 0x7d

    .line 248
    .line 249
    if-ne v11, v3, :cond_10

    .line 250
    .line 251
    add-int/lit8 v3, v19, -0x1

    .line 252
    .line 253
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    move/from16 v19, v3

    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_10
    const/16 v3, 0x3c

    .line 261
    .line 262
    if-ne v11, v3, :cond_11

    .line 263
    .line 264
    add-int/lit8 v20, v20, 0x1

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_11
    const/16 v3, 0x3e

    .line 268
    .line 269
    if-ne v11, v3, :cond_12

    .line 270
    .line 271
    add-int/lit8 v3, v20, -0x1

    .line 272
    .line 273
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    move/from16 v20, v3

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_12
    const/16 v3, 0x2c

    .line 281
    .line 282
    if-ne v11, v3, :cond_13

    .line 283
    .line 284
    if-nez v17, :cond_13

    .line 285
    .line 286
    if-nez v18, :cond_13

    .line 287
    .line 288
    if-nez v19, :cond_13

    .line 289
    .line 290
    if-nez v20, :cond_13

    .line 291
    .line 292
    invoke-virtual {v0, v5, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    add-int/lit8 v3, v15, 0x1

    .line 300
    .line 301
    move v5, v3

    .line 302
    :cond_13
    :goto_4
    add-int/lit8 v15, v15, 0x1

    .line 303
    .line 304
    goto :goto_3

    .line 305
    :cond_14
    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move v0, v6

    .line 313
    move v5, v0

    .line 314
    :goto_5
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 315
    .line 316
    .line 317
    move-result v11

    .line 318
    if-ge v5, v11, :cond_2c

    .line 319
    .line 320
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v11

    .line 324
    check-cast v11, Ljava/lang/String;

    .line 325
    .line 326
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v11

    .line 330
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 331
    .line 332
    .line 333
    move-result v14

    .line 334
    if-eqz v14, :cond_15

    .line 335
    .line 336
    iput-boolean v6, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 337
    .line 338
    move v8, v6

    .line 339
    goto/16 :goto_10

    .line 340
    .line 341
    :cond_15
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 342
    .line 343
    .line 344
    move-result v14

    .line 345
    move v15, v6

    .line 346
    move/from16 v17, v15

    .line 347
    .line 348
    move/from16 v18, v17

    .line 349
    .line 350
    move/from16 v19, v18

    .line 351
    .line 352
    move/from16 v20, v19

    .line 353
    .line 354
    :goto_6
    if-ge v15, v14, :cond_24

    .line 355
    .line 356
    invoke-static {v15, v11}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(ILjava/lang/String;)I

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    if-le v3, v15, :cond_16

    .line 361
    .line 362
    move v15, v3

    .line 363
    const/16 v3, 0x5d

    .line 364
    .line 365
    goto :goto_6

    .line 366
    :cond_16
    invoke-virtual {v11, v15}, Ljava/lang/String;->charAt(I)C

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    if-ne v3, v7, :cond_18

    .line 371
    .line 372
    add-int/lit8 v17, v17, 0x1

    .line 373
    .line 374
    :cond_17
    :goto_7
    const/16 v6, 0x3e

    .line 375
    .line 376
    goto/16 :goto_c

    .line 377
    .line 378
    :cond_18
    if-ne v3, v8, :cond_19

    .line 379
    .line 380
    add-int/lit8 v3, v17, -0x1

    .line 381
    .line 382
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    move/from16 v17, v3

    .line 387
    .line 388
    goto :goto_7

    .line 389
    :cond_19
    if-ne v3, v12, :cond_1a

    .line 390
    .line 391
    add-int/lit8 v18, v18, 0x1

    .line 392
    .line 393
    goto :goto_7

    .line 394
    :cond_1a
    const/16 v7, 0x5d

    .line 395
    .line 396
    if-ne v3, v7, :cond_1b

    .line 397
    .line 398
    add-int/lit8 v3, v18, -0x1

    .line 399
    .line 400
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    move/from16 v18, v3

    .line 405
    .line 406
    goto :goto_7

    .line 407
    :cond_1b
    const/16 v7, 0x7b

    .line 408
    .line 409
    if-ne v3, v7, :cond_1c

    .line 410
    .line 411
    add-int/lit8 v19, v19, 0x1

    .line 412
    .line 413
    goto :goto_7

    .line 414
    :cond_1c
    const/16 v7, 0x7d

    .line 415
    .line 416
    if-ne v3, v7, :cond_1d

    .line 417
    .line 418
    add-int/lit8 v3, v19, -0x1

    .line 419
    .line 420
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    move/from16 v19, v3

    .line 425
    .line 426
    goto :goto_7

    .line 427
    :cond_1d
    const/16 v7, 0x3c

    .line 428
    .line 429
    if-ne v3, v7, :cond_1e

    .line 430
    .line 431
    add-int/lit8 v20, v20, 0x1

    .line 432
    .line 433
    goto :goto_7

    .line 434
    :cond_1e
    const/16 v7, 0x3e

    .line 435
    .line 436
    if-ne v3, v7, :cond_1f

    .line 437
    .line 438
    add-int/lit8 v3, v20, -0x1

    .line 439
    .line 440
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    move/from16 v20, v3

    .line 445
    .line 446
    goto :goto_7

    .line 447
    :cond_1f
    const/16 v7, 0x3d

    .line 448
    .line 449
    if-ne v3, v7, :cond_17

    .line 450
    .line 451
    if-nez v17, :cond_17

    .line 452
    .line 453
    if-nez v18, :cond_17

    .line 454
    .line 455
    if-nez v19, :cond_17

    .line 456
    .line 457
    if-nez v20, :cond_17

    .line 458
    .line 459
    if-lez v15, :cond_20

    .line 460
    .line 461
    add-int/lit8 v3, v15, -0x1

    .line 462
    .line 463
    invoke-virtual {v11, v3}, Ljava/lang/String;->charAt(I)C

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    goto :goto_8

    .line 468
    :cond_20
    move v3, v6

    .line 469
    :goto_8
    add-int/lit8 v8, v15, 0x1

    .line 470
    .line 471
    if-ge v8, v14, :cond_21

    .line 472
    .line 473
    invoke-virtual {v11, v8}, Ljava/lang/String;->charAt(I)C

    .line 474
    .line 475
    .line 476
    move-result v22

    .line 477
    move/from16 v12, v22

    .line 478
    .line 479
    goto :goto_9

    .line 480
    :cond_21
    move v12, v6

    .line 481
    :goto_9
    if-eq v3, v7, :cond_22

    .line 482
    .line 483
    const/16 v6, 0x21

    .line 484
    .line 485
    if-eq v3, v6, :cond_22

    .line 486
    .line 487
    const/16 v6, 0x3c

    .line 488
    .line 489
    if-eq v3, v6, :cond_22

    .line 490
    .line 491
    const/16 v6, 0x3e

    .line 492
    .line 493
    if-eq v3, v6, :cond_23

    .line 494
    .line 495
    if-ne v12, v7, :cond_25

    .line 496
    .line 497
    goto :goto_a

    .line 498
    :cond_22
    const/16 v6, 0x3e

    .line 499
    .line 500
    :cond_23
    :goto_a
    move v15, v8

    .line 501
    :goto_b
    const/16 v3, 0x5d

    .line 502
    .line 503
    const/4 v6, 0x0

    .line 504
    const/16 v7, 0x28

    .line 505
    .line 506
    const/16 v8, 0x29

    .line 507
    .line 508
    const/16 v12, 0x5b

    .line 509
    .line 510
    goto/16 :goto_6

    .line 511
    .line 512
    :goto_c
    add-int/lit8 v15, v15, 0x1

    .line 513
    .line 514
    goto :goto_b

    .line 515
    :cond_24
    const/16 v6, 0x3e

    .line 516
    .line 517
    const/4 v15, -0x1

    .line 518
    :cond_25
    if-ltz v15, :cond_26

    .line 519
    .line 520
    const/4 v3, 0x0

    .line 521
    invoke-virtual {v11, v3, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v7

    .line 525
    goto :goto_d

    .line 526
    :cond_26
    move-object v7, v11

    .line 527
    :goto_d
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    if-ltz v15, :cond_27

    .line 532
    .line 533
    add-int/lit8 v15, v15, 0x1

    .line 534
    .line 535
    invoke-virtual {v11, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v7

    .line 539
    goto :goto_e

    .line 540
    :cond_27
    move-object/from16 v7, v16

    .line 541
    .line 542
    :goto_e
    if-eqz v7, :cond_29

    .line 543
    .line 544
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v7

    .line 548
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    if-eqz v0, :cond_28

    .line 553
    .line 554
    const/4 v8, 0x0

    .line 555
    iput-boolean v8, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 556
    .line 557
    goto :goto_10

    .line 558
    :cond_28
    const/4 v8, 0x0

    .line 559
    const/4 v11, 0x1

    .line 560
    iput-boolean v11, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Z

    .line 561
    .line 562
    move v0, v11

    .line 563
    goto :goto_f

    .line 564
    :cond_29
    const/4 v8, 0x0

    .line 565
    const/4 v11, 0x1

    .line 566
    if-eqz v0, :cond_2a

    .line 567
    .line 568
    iput-boolean v8, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 569
    .line 570
    goto :goto_f

    .line 571
    :cond_2a
    iget v12, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:I

    .line 572
    .line 573
    add-int/2addr v12, v11

    .line 574
    iput v12, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:I

    .line 575
    .line 576
    :goto_f
    invoke-static {v3}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v11

    .line 580
    if-nez v11, :cond_2b

    .line 581
    .line 582
    iput-boolean v8, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 583
    .line 584
    goto :goto_10

    .line 585
    :cond_2b
    iget-object v12, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 586
    .line 587
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    iget-object v3, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Ljava/util/ArrayList;

    .line 591
    .line 592
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    iget-object v3, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 596
    .line 597
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    add-int/lit8 v5, v5, 0x1

    .line 601
    .line 602
    move v6, v8

    .line 603
    const/16 v3, 0x5d

    .line 604
    .line 605
    const/16 v7, 0x28

    .line 606
    .line 607
    const/16 v8, 0x29

    .line 608
    .line 609
    const/16 v12, 0x5b

    .line 610
    .line 611
    goto/16 :goto_5

    .line 612
    .line 613
    :cond_2c
    move v8, v6

    .line 614
    const/4 v11, 0x1

    .line 615
    iput-boolean v11, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 616
    .line 617
    iget-boolean v0, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Z

    .line 618
    .line 619
    if-nez v0, :cond_2d

    .line 620
    .line 621
    iput-boolean v11, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 622
    .line 623
    :cond_2d
    :goto_10
    iget-boolean v0, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 624
    .line 625
    if-nez v0, :cond_2e

    .line 626
    .line 627
    goto/16 :goto_18

    .line 628
    .line 629
    :cond_2e
    :goto_11
    if-lez v4, :cond_39

    .line 630
    .line 631
    add-int/lit8 v0, v4, -0x1

    .line 632
    .line 633
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 634
    .line 635
    .line 636
    move-result v0

    .line 637
    const/16 v3, 0x3b

    .line 638
    .line 639
    if-eq v0, v3, :cond_39

    .line 640
    .line 641
    const/16 v3, 0x7b

    .line 642
    .line 643
    if-eq v0, v3, :cond_39

    .line 644
    .line 645
    const/16 v7, 0x7d

    .line 646
    .line 647
    if-ne v0, v7, :cond_2f

    .line 648
    .line 649
    goto/16 :goto_17

    .line 650
    .line 651
    :cond_2f
    const/16 v5, 0xd

    .line 652
    .line 653
    const/16 v6, 0xa

    .line 654
    .line 655
    if-eq v0, v6, :cond_31

    .line 656
    .line 657
    if-ne v0, v5, :cond_30

    .line 658
    .line 659
    goto :goto_12

    .line 660
    :cond_30
    add-int/lit8 v4, v4, -0x1

    .line 661
    .line 662
    goto :goto_11

    .line 663
    :cond_31
    :goto_12
    move v0, v4

    .line 664
    :goto_13
    if-lez v0, :cond_33

    .line 665
    .line 666
    add-int/lit8 v11, v0, -0x1

    .line 667
    .line 668
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 669
    .line 670
    .line 671
    move-result v11

    .line 672
    if-eq v11, v6, :cond_33

    .line 673
    .line 674
    if-ne v11, v5, :cond_32

    .line 675
    .line 676
    goto :goto_14

    .line 677
    :cond_32
    add-int/lit8 v0, v0, -0x1

    .line 678
    .line 679
    goto :goto_13

    .line 680
    :cond_33
    :goto_14
    invoke-virtual {v1, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 689
    .line 690
    .line 691
    move-result v5

    .line 692
    if-eqz v5, :cond_34

    .line 693
    .line 694
    goto :goto_17

    .line 695
    :cond_34
    const-string v5, "@"

    .line 696
    .line 697
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 698
    .line 699
    .line 700
    move-result v5

    .line 701
    if-nez v5, :cond_30

    .line 702
    .line 703
    const-string v5, "//"

    .line 704
    .line 705
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 706
    .line 707
    .line 708
    move-result v5

    .line 709
    if-nez v5, :cond_39

    .line 710
    .line 711
    const-string v5, "/*"

    .line 712
    .line 713
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 714
    .line 715
    .line 716
    move-result v5

    .line 717
    if-nez v5, :cond_39

    .line 718
    .line 719
    const-string v5, "*"

    .line 720
    .line 721
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 722
    .line 723
    .line 724
    move-result v5

    .line 725
    if-eqz v5, :cond_35

    .line 726
    .line 727
    goto :goto_17

    .line 728
    :cond_35
    const-string v5, "\\s+"

    .line 729
    .line 730
    invoke-virtual {v0, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    array-length v5, v0

    .line 735
    if-nez v5, :cond_36

    .line 736
    .line 737
    goto :goto_17

    .line 738
    :cond_36
    array-length v5, v0

    .line 739
    move v6, v8

    .line 740
    :goto_15
    if-ge v6, v5, :cond_30

    .line 741
    .line 742
    aget-object v11, v0, v6

    .line 743
    .line 744
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 745
    .line 746
    .line 747
    move-result v12

    .line 748
    if-eqz v12, :cond_37

    .line 749
    .line 750
    goto :goto_16

    .line 751
    :cond_37
    sget-object v12, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/HashSet;

    .line 752
    .line 753
    invoke-virtual {v12, v11}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result v11

    .line 757
    if-nez v11, :cond_38

    .line 758
    .line 759
    goto :goto_17

    .line 760
    :cond_38
    :goto_16
    add-int/lit8 v6, v6, 0x1

    .line 761
    .line 762
    goto :goto_15

    .line 763
    :cond_39
    :goto_17
    new-instance v0, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;

    .line 764
    .line 765
    const/16 v21, 0x1

    .line 766
    .line 767
    add-int/lit8 v10, v10, 0x1

    .line 768
    .line 769
    invoke-direct {v0, v4, v10, v2, v9}, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;-><init>(IILjava/lang/String;L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;)V

    .line 770
    .line 771
    .line 772
    return-object v0

    .line 773
    :goto_18
    return-object v16
.end method

.method public static 飘花落叶言子楪苏哲世兰(ILjava/lang/String;)I
    .locals 1

    .line 1
    :goto_0
    if-ltz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    add-int/lit8 p0, p0, -0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return p0
.end method

.method public static 飘花落叶言子楪苏哲兰世(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p0, :cond_4

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    add-int/2addr v1, p0

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-le v1, v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1, p0, p2, v0, v1}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    add-int/lit8 v1, p0, -0x1

    .line 28
    .line 29
    if-ltz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {v1}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    add-int/2addr p2, p0

    .line 47
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-ge p2, p0, :cond_3

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {p0}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_4

    .line 62
    .line 63
    :cond_3
    const/4 p0, 0x1

    .line 64
    return p0

    .line 65
    :cond_4
    :goto_0
    return v0
.end method
