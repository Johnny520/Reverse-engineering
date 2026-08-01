.class final synthetic Lkotlin/reflect/jvm/internal/ReflectKCallableImpl$_absentArguments$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "computeAbsentArguments(Lkotlin/reflect/jvm/internal/ReflectKCallable;)[Ljava/lang/Object;"

    .line 2
    .line 3
    const/4 v6, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    const-class v3, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;

    .line 6
    .line 7
    const-string v4, "computeAbsentArguments"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 170
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableImpl$_absentArguments$1;->invoke()[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()[Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪世哲苏兰;->getParameters()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪世哲苏兰;->isSuspend()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    add-int/2addr p0, v1

    .line 21
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    move v3, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    move v3, v2

    .line 35
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;

    .line 46
    .line 47
    invoke-interface {v4}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getKind()Lkotlin/reflect/KParameter$Kind;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    sget-object v6, Lkotlin/reflect/KParameter$Kind;->VALUE:Lkotlin/reflect/KParameter$Kind;

    .line 52
    .line 53
    if-eq v5, v6, :cond_2

    .line 54
    .line 55
    invoke-interface {v4}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getKind()Lkotlin/reflect/KParameter$Kind;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    sget-object v5, Lkotlin/reflect/KParameter$Kind;->CONTEXT:Lkotlin/reflect/KParameter$Kind;

    .line 60
    .line 61
    if-ne v4, v5, :cond_1

    .line 62
    .line 63
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 64
    .line 65
    if-ltz v3, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-static {}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏哲兰楪()V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    throw p0

    .line 73
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1f

    .line 74
    .line 75
    div-int/lit8 v3, v3, 0x20

    .line 76
    .line 77
    add-int v1, p0, v3

    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    new-array v1, v1, [Ljava/lang/Object;

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_7

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;

    .line 98
    .line 99
    invoke-interface {v4}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_6

    .line 104
    .line 105
    invoke-interface {v4}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getType()Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-static {v5}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世兰哲(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-nez v5, :cond_6

    .line 114
    .line 115
    invoke-interface {v4}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getIndex()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    invoke-interface {v4}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getType()Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-static {v4}, Lkotlin/reflect/jvm/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)Ljava/lang/reflect/Type;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-static {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    aput-object v4, v1, v5

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    invoke-interface {v4}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰()Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_5

    .line 139
    .line 140
    invoke-interface {v4}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getIndex()I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    invoke-interface {v4}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getType()Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-static {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪哲兰苏世(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    aput-object v4, v1, v5

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_7
    move v0, v2

    .line 156
    :goto_3
    if-ge v0, v3, :cond_8

    .line 157
    .line 158
    add-int v4, p0, v0

    .line 159
    .line 160
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    aput-object v5, v1, v4

    .line 165
    .line 166
    add-int/lit8 v0, v0, 0x1

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_8
    return-object v1
.end method
