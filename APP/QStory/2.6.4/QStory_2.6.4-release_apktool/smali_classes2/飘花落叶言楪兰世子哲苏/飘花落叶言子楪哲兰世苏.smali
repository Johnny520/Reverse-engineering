.class public final L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲兰世苏;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲兰世苏;

    .line 7
    .line 8
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)[B
    .locals 10

    .line 1
    check-cast p0, Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-array p0, v1, [B

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    new-array v2, v0, [I

    .line 18
    .line 19
    new-array v3, v0, [Ljava/lang/String;

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    move v4, v1

    .line 26
    move v5, v4

    .line 27
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_6

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    check-cast v6, Ljava/lang/String;

    .line 38
    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    add-int/lit8 v4, v4, 0x5

    .line 42
    .line 43
    const/4 v6, -0x1

    .line 44
    aput v6, v2, v5

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    invoke-static {v6}, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    aput-object v6, v3, v5

    .line 52
    .line 53
    aput v7, v2, v5

    .line 54
    .line 55
    shr-int/lit8 v6, v7, 0x7

    .line 56
    .line 57
    if-nez v6, :cond_2

    .line 58
    .line 59
    const/4 v6, 0x1

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    shr-int/lit8 v6, v7, 0xe

    .line 62
    .line 63
    if-nez v6, :cond_3

    .line 64
    .line 65
    const/4 v6, 0x2

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    shr-int/lit8 v6, v7, 0x15

    .line 68
    .line 69
    if-nez v6, :cond_4

    .line 70
    .line 71
    const/4 v6, 0x3

    .line 72
    goto :goto_1

    .line 73
    :cond_4
    shr-int/lit8 v6, v7, 0x1c

    .line 74
    .line 75
    if-nez v6, :cond_5

    .line 76
    .line 77
    const/4 v6, 0x4

    .line 78
    goto :goto_1

    .line 79
    :cond_5
    const/4 v6, 0x5

    .line 80
    :goto_1
    add-int/2addr v6, v7

    .line 81
    add-int/2addr v6, v4

    .line 82
    move v4, v6

    .line 83
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_6
    new-instance p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 87
    .line 88
    invoke-direct {p0, v4}, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;-><init>(I)V

    .line 89
    .line 90
    .line 91
    :goto_3
    if-ge v1, v0, :cond_9

    .line 92
    .line 93
    aget v4, v2, v1

    .line 94
    .line 95
    iget v5, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 96
    .line 97
    move v6, v4

    .line 98
    :goto_4
    and-int/lit8 v7, v6, -0x80

    .line 99
    .line 100
    iget-object v8, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v8, [B

    .line 103
    .line 104
    if-eqz v7, :cond_7

    .line 105
    .line 106
    add-int/lit8 v7, v5, 0x1

    .line 107
    .line 108
    and-int/lit8 v9, v6, 0x7f

    .line 109
    .line 110
    or-int/lit16 v9, v9, 0x80

    .line 111
    .line 112
    int-to-byte v9, v9

    .line 113
    aput-byte v9, v8, v5

    .line 114
    .line 115
    ushr-int/lit8 v6, v6, 0x7

    .line 116
    .line 117
    move v5, v7

    .line 118
    goto :goto_4

    .line 119
    :cond_7
    add-int/lit8 v7, v5, 0x1

    .line 120
    .line 121
    int-to-byte v6, v6

    .line 122
    aput-byte v6, v8, v5

    .line 123
    .line 124
    iput v7, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 125
    .line 126
    if-ltz v4, :cond_8

    .line 127
    .line 128
    aget-object v4, v3, v1

    .line 129
    .line 130
    invoke-virtual {p0, v4}, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_9
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p0, [B

    .line 139
    .line 140
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(I[BI)Ljava/util/LinkedHashSet;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    if-lez p2, :cond_6

    .line 7
    .line 8
    new-instance v1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 9
    .line 10
    invoke-direct {v1, p1, p0}, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;-><init>([BI)V

    .line 11
    .line 12
    .line 13
    add-int/2addr p0, p2

    .line 14
    :goto_0
    iget p1, v1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 15
    .line 16
    if-ge p1, p0, :cond_4

    .line 17
    .line 18
    iget-object p2, v1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p2, [B

    .line 21
    .line 22
    add-int/lit8 v2, p1, 0x1

    .line 23
    .line 24
    iput v2, v1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 25
    .line 26
    aget-byte v3, p2, p1

    .line 27
    .line 28
    shr-int/lit8 v4, v3, 0x7

    .line 29
    .line 30
    if-nez v4, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    and-int/lit8 v3, v3, 0x7f

    .line 34
    .line 35
    add-int/lit8 v4, p1, 0x2

    .line 36
    .line 37
    iput v4, v1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 38
    .line 39
    aget-byte v2, p2, v2

    .line 40
    .line 41
    shl-int/lit8 v2, v2, 0x7

    .line 42
    .line 43
    or-int/2addr v3, v2

    .line 44
    shr-int/lit8 v2, v3, 0xe

    .line 45
    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    and-int/lit16 v2, v3, 0x3fff

    .line 50
    .line 51
    add-int/lit8 v3, p1, 0x3

    .line 52
    .line 53
    iput v3, v1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 54
    .line 55
    aget-byte v4, p2, v4

    .line 56
    .line 57
    shl-int/lit8 v4, v4, 0xe

    .line 58
    .line 59
    or-int/2addr v2, v4

    .line 60
    shr-int/lit8 v4, v2, 0x15

    .line 61
    .line 62
    if-nez v4, :cond_2

    .line 63
    .line 64
    move v3, v2

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const v4, 0x1fffff

    .line 67
    .line 68
    .line 69
    and-int/2addr v2, v4

    .line 70
    add-int/lit8 v4, p1, 0x4

    .line 71
    .line 72
    iput v4, v1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 73
    .line 74
    aget-byte v3, p2, v3

    .line 75
    .line 76
    shl-int/lit8 v3, v3, 0x15

    .line 77
    .line 78
    or-int/2addr v3, v2

    .line 79
    shr-int/lit8 v2, v3, 0x1c

    .line 80
    .line 81
    if-nez v2, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    const v2, 0xfffffff

    .line 85
    .line 86
    .line 87
    and-int/2addr v2, v3

    .line 88
    add-int/lit8 p1, p1, 0x5

    .line 89
    .line 90
    iput p1, v1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 91
    .line 92
    aget-byte p1, p2, v4

    .line 93
    .line 94
    shl-int/lit8 p1, p1, 0x1c

    .line 95
    .line 96
    or-int v3, v2, p1

    .line 97
    .line 98
    :goto_1
    invoke-virtual {v1, v3}, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲兰世(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    if-ne p1, p0, :cond_5

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    const-string p0, "Invalid String set"

    .line 110
    .line 111
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const/4 p0, 0x0

    .line 115
    return-object p0

    .line 116
    :cond_6
    :goto_2
    return-object v0
.end method
