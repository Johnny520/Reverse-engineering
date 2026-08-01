.class public abstract Lio/ktor/client/plugins/cache/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;

.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const-string v2, "q"

    .line 15
    .line 16
    const/4 v3, 0x0

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
    move-object v4, v1

    .line 24
    check-cast v4, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;

    .line 25
    .line 26
    iget-object v4, v4, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v4, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v1, v3

    .line 36
    :goto_0
    check-cast v1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;

    .line 37
    .line 38
    const-wide/16 v4, 0x0

    .line 39
    .line 40
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    iget-object v0, v1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏兰楪哲世(Ljava/lang/String;)Ljava/lang/Double;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 55
    .line 56
    .line 57
    move-result-wide v8

    .line 58
    cmpg-double v1, v4, v8

    .line 59
    .line 60
    if-gtz v1, :cond_2

    .line 61
    .line 62
    cmpg-double v1, v8, v6

    .line 63
    .line 64
    if-gtz v1, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    move-object v0, v3

    .line 68
    :cond_3
    :goto_1
    new-instance v0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;

    .line 69
    .line 70
    const-string v1, "no-cache"

    .line 71
    .line 72
    invoke-direct {v0, v1}, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sput-object v0, Lio/ktor/client/plugins/cache/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;

    .line 76
    .line 77
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_5

    .line 91
    .line 92
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    move-object v8, v1

    .line 97
    check-cast v8, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;

    .line 98
    .line 99
    iget-object v8, v8, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v8, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-eqz v8, :cond_4

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_5
    move-object v1, v3

    .line 109
    :goto_2
    check-cast v1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;

    .line 110
    .line 111
    if-eqz v1, :cond_6

    .line 112
    .line 113
    iget-object v0, v1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 114
    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    invoke-static {v0}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏兰楪哲世(Ljava/lang/String;)Ljava/lang/Double;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 124
    .line 125
    .line 126
    move-result-wide v1

    .line 127
    cmpg-double v4, v4, v1

    .line 128
    .line 129
    if-gtz v4, :cond_6

    .line 130
    .line 131
    cmpg-double v1, v1, v6

    .line 132
    .line 133
    if-gtz v1, :cond_6

    .line 134
    .line 135
    move-object v3, v0

    .line 136
    :cond_6
    new-instance v0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;

    .line 137
    .line 138
    const-string v1, "only-if-cached"

    .line 139
    .line 140
    invoke-direct {v0, v1}, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    sput-object v0, Lio/ktor/client/plugins/cache/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;

    .line 144
    .line 145
    new-instance v0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;

    .line 146
    .line 147
    const-string v1, "must-revalidate"

    .line 148
    .line 149
    invoke-direct {v0, v1}, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    sput-object v0, Lio/ktor/client/plugins/cache/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;

    .line 153
    .line 154
    return-void
.end method
