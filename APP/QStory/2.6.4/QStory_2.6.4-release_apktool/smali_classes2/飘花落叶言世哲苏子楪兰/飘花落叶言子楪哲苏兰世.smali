.class public L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲苏兰世;
.super L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

.field public 飘花落叶言子楪哲兰苏世:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 11

    .line 1
    const/16 p1, 0x61

    .line 2
    .line 3
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    array-length v0, p1

    .line 20
    const/4 v1, 0x0

    .line 21
    move v2, v1

    .line 22
    :goto_0
    const/16 v3, 0x62

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    const/4 v5, 0x0

    .line 26
    if-ge v2, v0, :cond_1

    .line 27
    .line 28
    aget-object v6, p1, v2

    .line 29
    .line 30
    invoke-virtual {v6, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v6, v5

    .line 56
    :goto_1
    invoke-static {v6}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-class v0, Landroid/view/ViewGroup;

    .line 61
    .line 62
    const-class v2, Ljava/util/List;

    .line 63
    .line 64
    filled-new-array {v0, v2}, [Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v6, p1, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 69
    .line 70
    iput-object v0, v6, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object v2, v6, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    new-instance v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏兰哲世;

    .line 79
    .line 80
    invoke-direct {v0, p0, v4}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏兰哲世;-><init>(L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲苏兰世;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 84
    .line 85
    .line 86
    const/16 p1, 0xa2

    .line 87
    .line 88
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const/16 v0, 0x3d

    .line 97
    .line 98
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget-object v2, p1, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 103
    .line 104
    iput-object v0, v2, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 105
    .line 106
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 107
    .line 108
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, v2, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-virtual {p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    new-instance v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏兰哲世;

    .line 119
    .line 120
    invoke-direct {v0, p0, v1}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏兰哲世;-><init>(L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲苏兰世;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 124
    .line 125
    .line 126
    const/16 p1, 0x63

    .line 127
    .line 128
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    array-length v0, p1

    .line 141
    move v2, v1

    .line 142
    :goto_2
    const/4 v6, 0x2

    .line 143
    if-ge v2, v0, :cond_3

    .line 144
    .line 145
    aget-object v7, p1, v2

    .line 146
    .line 147
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    array-length v9, v8

    .line 152
    const/4 v10, 0x3

    .line 153
    if-ne v9, v10, :cond_2

    .line 154
    .line 155
    aget-object v9, v8, v1

    .line 156
    .line 157
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    const/16 v10, 0x64

    .line 162
    .line 163
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-eqz v9, :cond_2

    .line 172
    .line 173
    aget-object v9, v8, v4

    .line 174
    .line 175
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    if-eqz v9, :cond_2

    .line 188
    .line 189
    aget-object v8, v8, v6

    .line 190
    .line 191
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 192
    .line 193
    if-ne v8, v9, :cond_2

    .line 194
    .line 195
    invoke-virtual {v7, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 196
    .line 197
    .line 198
    move-object v5, v7

    .line 199
    goto :goto_3

    .line 200
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_3
    :goto_3
    new-instance p1, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏兰哲世;

    .line 204
    .line 205
    invoke-direct {p1, p0, v6}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏兰哲世;-><init>(L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲苏兰世;I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, v5, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0xa1

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
