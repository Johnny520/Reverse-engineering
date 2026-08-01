.class public final Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

.field public final 飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;
    .locals 10

    .line 1
    const-string v0, "messageType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;

    .line 13
    .line 14
    if-nez v1, :cond_a

    .line 15
    .line 16
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v1, Lcom/google/protobuf/飘花落叶言世兰子哲楪苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 22
    .line 23
    const-class v1, Lcom/google/protobuf/GeneratedMessageLite;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    sget-object v2, Lcom/google/protobuf/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 33
    .line 34
    sget-object v2, Lcom/google/protobuf/飘花落叶言世兰子哲楪苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string p0, "Message classes must extend GeneratedMessage or GeneratedMessageLite"

    .line 46
    .line 47
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_1
    :goto_0
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Lcom/google/protobuf/飘花落叶言世楪苏哲兰子;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世楪苏哲兰子;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-interface {v4}, Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;->飘花落叶言子楪世苏哲兰()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    const-string v2, "Protobuf runtime is not correctly loaded."

    .line 64
    .line 65
    if-eqz p0, :cond_4

    .line 66
    .line 67
    sget-object p0, Lcom/google/protobuf/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_2

    .line 74
    .line 75
    sget-object p0, Lcom/google/protobuf/飘花落叶言世兰子哲楪苏;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言苏子兰哲世楪;

    .line 76
    .line 77
    sget-object v1, Lcom/google/protobuf/飘花落叶言楪苏世哲兰子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏世哲子兰;

    .line 78
    .line 79
    invoke-interface {v4}, Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    new-instance v3, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;

    .line 84
    .line 85
    invoke-direct {v3, p0, v1, v2}, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;-><init>(Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    sget-object p0, Lcom/google/protobuf/飘花落叶言世兰子哲楪苏;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;

    .line 90
    .line 91
    sget-object v1, Lcom/google/protobuf/飘花落叶言楪苏世哲兰子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

    .line 92
    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    invoke-interface {v4}, Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    new-instance v3, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;

    .line 100
    .line 101
    invoke-direct {v3, p0, v1, v2}, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;-><init>(Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    invoke-static {v2}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-object v3

    .line 109
    :cond_4
    sget-object p0, Lcom/google/protobuf/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 110
    .line 111
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    const/4 v1, 0x1

    .line 116
    if-eqz p0, :cond_6

    .line 117
    .line 118
    sget-object v5, Lcom/google/protobuf/飘花落叶言世哲楪子苏兰;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世哲子兰苏楪;

    .line 119
    .line 120
    sget-object v6, Lcom/google/protobuf/飘花落叶言世楪子兰苏哲;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世楪子哲兰苏;

    .line 121
    .line 122
    sget-object v7, Lcom/google/protobuf/飘花落叶言世兰子哲楪苏;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言苏子兰哲世楪;

    .line 123
    .line 124
    sget-object p0, Lcom/google/protobuf/飘花落叶言世楪苏哲子兰;->飘花落叶言子楪世苏哲兰:[I

    .line 125
    .line 126
    invoke-interface {v4}, Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;->getSyntax()Lcom/google/protobuf/ProtoSyntax;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    aget p0, p0, v2

    .line 135
    .line 136
    if-eq p0, v1, :cond_5

    .line 137
    .line 138
    sget-object v3, Lcom/google/protobuf/飘花落叶言楪苏世哲兰子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏世哲子兰;

    .line 139
    .line 140
    :cond_5
    move-object v8, v3

    .line 141
    sget-object v9, Lcom/google/protobuf/飘花落叶言世苏楪子哲兰;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世苏子兰哲楪;

    .line 142
    .line 143
    invoke-static/range {v4 .. v9}, Lcom/google/protobuf/飘花落叶言世苏兰楪子哲;->飘花落叶言子世楪哲苏兰(Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;Lcom/google/protobuf/飘花落叶言世哲子苏兰楪;Lcom/google/protobuf/飘花落叶言世楪子苏兰哲;Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;Lcom/google/protobuf/飘花落叶言世苏子哲兰楪;)Lcom/google/protobuf/飘花落叶言世苏兰楪子哲;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    goto :goto_2

    .line 148
    :cond_6
    sget-object v5, Lcom/google/protobuf/飘花落叶言世哲楪子苏兰;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世哲子苏兰楪;

    .line 149
    .line 150
    sget-object v6, Lcom/google/protobuf/飘花落叶言世楪子兰苏哲;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪子苏兰哲;

    .line 151
    .line 152
    sget-object v7, Lcom/google/protobuf/飘花落叶言世兰子哲楪苏;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;

    .line 153
    .line 154
    sget-object p0, Lcom/google/protobuf/飘花落叶言世楪苏哲子兰;->飘花落叶言子楪世苏哲兰:[I

    .line 155
    .line 156
    invoke-interface {v4}, Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;->getSyntax()Lcom/google/protobuf/ProtoSyntax;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    aget p0, p0, v8

    .line 165
    .line 166
    if-eq p0, v1, :cond_8

    .line 167
    .line 168
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪苏世哲兰子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

    .line 169
    .line 170
    if-eqz p0, :cond_7

    .line 171
    .line 172
    move-object v8, p0

    .line 173
    goto :goto_1

    .line 174
    :cond_7
    invoke-static {v2}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return-object v3

    .line 178
    :cond_8
    move-object v8, v3

    .line 179
    :goto_1
    sget-object v9, Lcom/google/protobuf/飘花落叶言世苏楪子哲兰;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世苏子哲兰楪;

    .line 180
    .line 181
    invoke-static/range {v4 .. v9}, Lcom/google/protobuf/飘花落叶言世苏兰楪子哲;->飘花落叶言子世楪哲苏兰(Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;Lcom/google/protobuf/飘花落叶言世哲子苏兰楪;Lcom/google/protobuf/飘花落叶言世楪子苏兰哲;Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;Lcom/google/protobuf/飘花落叶言世苏子哲兰楪;)Lcom/google/protobuf/飘花落叶言世苏兰楪子哲;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    :goto_2
    invoke-virtual {v0, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    check-cast p0, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;

    .line 190
    .line 191
    if-eqz p0, :cond_9

    .line 192
    .line 193
    return-object p0

    .line 194
    :cond_9
    return-object v3

    .line 195
    :cond_a
    return-object v1
.end method
