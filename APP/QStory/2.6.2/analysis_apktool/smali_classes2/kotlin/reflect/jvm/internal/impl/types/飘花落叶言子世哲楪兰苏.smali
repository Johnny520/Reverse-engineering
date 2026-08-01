.class public final Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Iterable;
.implements L飘花落叶言世子哲苏楪兰/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;

.field public static final 飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;

    .line 7
    .line 8
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;

    .line 9
    .line 10
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;-><init>(Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪苏哲兰世;

    .line 5
    .line 6
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪苏哲兰世;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const-class v1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪苏哲兰世;

    .line 28
    .line 29
    sget-object v2, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget-object v2, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 49
    .line 50
    invoke-virtual {v2}, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    const/4 v5, 0x1

    .line 59
    if-eq v2, v5, :cond_0

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 63
    .line 64
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    check-cast v2, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪哲苏世兰;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    iget v3, v2, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:I

    .line 70
    .line 71
    if-ne v3, v1, :cond_1

    .line 72
    .line 73
    new-instance v2, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪哲苏世兰;

    .line 74
    .line 75
    invoke-direct {v2, v1, v0}, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪哲苏世兰;-><init>(ILkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪苏哲兰世;)V

    .line 76
    .line 77
    .line 78
    iput-object v2, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    new-instance v5, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世哲苏兰;

    .line 82
    .line 83
    const/16 v6, 0x14

    .line 84
    .line 85
    new-array v6, v6, [Ljava/lang/Object;

    .line 86
    .line 87
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v6, v5, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 91
    .line 92
    iput v4, v5, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:I

    .line 93
    .line 94
    iget-object v2, v2, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪苏哲兰世;

    .line 95
    .line 96
    invoke-virtual {v5, v3, v2}, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(ILkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪苏哲兰世;)V

    .line 97
    .line 98
    .line 99
    iput-object v5, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 100
    .line 101
    :goto_1
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 102
    .line 103
    invoke-virtual {v2, v1, v0}, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪苏哲兰世;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catch_0
    move-exception p0

    .line 108
    const-string p1, "OneElementArrayMap"

    .line 109
    .line 110
    invoke-static {v2, v5, p1}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;ILjava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {p1, p0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    throw v3

    .line 118
    :cond_2
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 119
    .line 120
    instance-of v5, v2, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪苏哲兰世;

    .line 121
    .line 122
    if-eqz v5, :cond_3

    .line 123
    .line 124
    new-instance v2, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪哲苏世兰;

    .line 125
    .line 126
    invoke-direct {v2, v1, v0}, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪哲苏世兰;-><init>(ILkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪苏哲兰世;)V

    .line 127
    .line 128
    .line 129
    iput-object v2, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_3
    const-string p0, "EmptyArrayMap"

    .line 133
    .line 134
    invoke-static {v2, v4, p0}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;ILjava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v3

    .line 142
    :cond_4
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;ILjava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "Race condition happened, the size of ArrayMap is "

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p1, " but it isn\'t an `"

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 p1, 0x60

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p1, 0xa

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    new-instance p2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v1, "Type: "

    .line 44
    .line 45
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    new-instance p2, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;

    .line 71
    .line 72
    iget-object v1, v1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    .line 74
    const-string v2, "[\n"

    .line 75
    .line 76
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    new-instance v2, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-static {p0, p1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const/4 v3, 0x0

    .line 93
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_3

    .line 98
    .line 99
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    add-int/lit8 v5, v3, 0x1

    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    if-ltz v3, :cond_2

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    check-cast v7, Ljava/lang/Iterable;

    .line 113
    .line 114
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    :cond_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-eqz v8, :cond_1

    .line 123
    .line 124
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    move-object v9, v8

    .line 129
    check-cast v9, Ljava/util/Map$Entry;

    .line 130
    .line 131
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    check-cast v9, Ljava/lang/Number;

    .line 136
    .line 137
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-ne v9, v3, :cond_0

    .line 142
    .line 143
    move-object v6, v8

    .line 144
    :cond_1
    check-cast v6, Ljava/util/Map$Entry;

    .line 145
    .line 146
    new-instance v7, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v8, "  "

    .line 149
    .line 150
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const/16 v6, 0x5b

    .line 157
    .line 158
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v3, "]: "

    .line 165
    .line 166
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move v3, v5

    .line 186
    goto :goto_0

    .line 187
    :cond_2
    invoke-static {}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏兰楪哲()V

    .line 188
    .line 189
    .line 190
    throw v6

    .line 191
    :cond_3
    const-string p0, "]"

    .line 192
    .line 193
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    const-string p2, "Content: "

    .line 204
    .line 205
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    return-object p0
.end method


# virtual methods
.method public final isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-virtual {p0}, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-virtual {p0}, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
