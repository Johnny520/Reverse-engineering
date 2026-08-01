.class public final Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_a

    .line 8
    .line 9
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v1, Lcom/google/protobuf/飘花落叶言世兰子哲楪苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 15
    .line 16
    const-class v1, Lcom/google/protobuf/GeneratedMessageLite;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    sget-object v2, Lcom/google/protobuf/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 26
    .line 27
    sget-object v2, Lcom/google/protobuf/飘花落叶言世兰子哲楪苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string p0, "Message classes must extend GeneratedMessage or GeneratedMessageLite"

    .line 39
    .line 40
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v3

    .line 44
    :cond_1
    :goto_0
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Lcom/google/protobuf/飘花落叶言世楪苏哲兰子;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世楪苏哲兰子;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {v4}, Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;->飘花落叶言子楪世苏哲兰()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    const-string v2, "Protobuf runtime is not correctly loaded."

    .line 57
    .line 58
    if-eqz p0, :cond_4

    .line 59
    .line 60
    sget-object p0, Lcom/google/protobuf/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    sget-object p0, Lcom/google/protobuf/飘花落叶言世兰子哲楪苏;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言苏子兰哲世楪;

    .line 69
    .line 70
    sget-object v1, Lcom/google/protobuf/飘花落叶言楪苏世哲兰子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏世哲子兰;

    .line 71
    .line 72
    invoke-interface {v4}, Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    new-instance v3, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;

    .line 77
    .line 78
    invoke-direct {v3, p0, v1, v2}, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;-><init>(Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    sget-object p0, Lcom/google/protobuf/飘花落叶言世兰子哲楪苏;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;

    .line 83
    .line 84
    sget-object v1, Lcom/google/protobuf/飘花落叶言楪苏世哲兰子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

    .line 85
    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    invoke-interface {v4}, Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    new-instance v3, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;

    .line 93
    .line 94
    invoke-direct {v3, p0, v1, v2}, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;-><init>(Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    invoke-static {v2}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-object v3

    .line 102
    :cond_4
    sget-object p0, Lcom/google/protobuf/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 103
    .line 104
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    const/4 v1, 0x1

    .line 109
    if-eqz p0, :cond_6

    .line 110
    .line 111
    sget-object v5, Lcom/google/protobuf/飘花落叶言世哲楪子苏兰;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世哲子兰苏楪;

    .line 112
    .line 113
    sget-object v6, Lcom/google/protobuf/飘花落叶言世楪子兰苏哲;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世楪子哲兰苏;

    .line 114
    .line 115
    sget-object v7, Lcom/google/protobuf/飘花落叶言世兰子哲楪苏;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言苏子兰哲世楪;

    .line 116
    .line 117
    sget-object p0, Lcom/google/protobuf/飘花落叶言世楪苏哲子兰;->飘花落叶言子楪世苏哲兰:[I

    .line 118
    .line 119
    invoke-interface {v4}, Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;->getSyntax()Lcom/google/protobuf/ProtoSyntax;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    aget p0, p0, v2

    .line 128
    .line 129
    if-eq p0, v1, :cond_5

    .line 130
    .line 131
    sget-object v3, Lcom/google/protobuf/飘花落叶言楪苏世哲兰子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏世哲子兰;

    .line 132
    .line 133
    :cond_5
    move-object v8, v3

    .line 134
    sget-object v9, Lcom/google/protobuf/飘花落叶言世苏楪子哲兰;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世苏子兰哲楪;

    .line 135
    .line 136
    invoke-static/range {v4 .. v9}, Lcom/google/protobuf/飘花落叶言世苏兰楪子哲;->飘花落叶言子世楪哲苏兰(Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;Lcom/google/protobuf/飘花落叶言世哲子苏兰楪;Lcom/google/protobuf/飘花落叶言世楪子苏兰哲;Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;Lcom/google/protobuf/飘花落叶言世苏子哲兰楪;)Lcom/google/protobuf/飘花落叶言世苏兰楪子哲;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    goto :goto_2

    .line 141
    :cond_6
    sget-object v5, Lcom/google/protobuf/飘花落叶言世哲楪子苏兰;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世哲子苏兰楪;

    .line 142
    .line 143
    sget-object v6, Lcom/google/protobuf/飘花落叶言世楪子兰苏哲;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪子苏兰哲;

    .line 144
    .line 145
    sget-object v7, Lcom/google/protobuf/飘花落叶言世兰子哲楪苏;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;

    .line 146
    .line 147
    sget-object p0, Lcom/google/protobuf/飘花落叶言世楪苏哲子兰;->飘花落叶言子楪世苏哲兰:[I

    .line 148
    .line 149
    invoke-interface {v4}, Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;->getSyntax()Lcom/google/protobuf/ProtoSyntax;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    aget p0, p0, v8

    .line 158
    .line 159
    if-eq p0, v1, :cond_8

    .line 160
    .line 161
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪苏世哲兰子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

    .line 162
    .line 163
    if-eqz p0, :cond_7

    .line 164
    .line 165
    move-object v8, p0

    .line 166
    goto :goto_1

    .line 167
    :cond_7
    invoke-static {v2}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-object v3

    .line 171
    :cond_8
    move-object v8, v3

    .line 172
    :goto_1
    sget-object v9, Lcom/google/protobuf/飘花落叶言世苏楪子哲兰;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世苏子哲兰楪;

    .line 173
    .line 174
    invoke-static/range {v4 .. v9}, Lcom/google/protobuf/飘花落叶言世苏兰楪子哲;->飘花落叶言子世楪哲苏兰(Lcom/google/protobuf/飘花落叶言世苏楪哲兰子;Lcom/google/protobuf/飘花落叶言世哲子苏兰楪;Lcom/google/protobuf/飘花落叶言世楪子苏兰哲;Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;Lcom/google/protobuf/飘花落叶言世苏子哲兰楪;)Lcom/google/protobuf/飘花落叶言世苏兰楪子哲;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    :goto_2
    sget-object p0, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世苏哲兰:[B

    .line 179
    .line 180
    invoke-virtual {v0, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    check-cast p0, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;

    .line 185
    .line 186
    if-eqz p0, :cond_9

    .line 187
    .line 188
    return-object p0

    .line 189
    :cond_9
    return-object v3

    .line 190
    :cond_a
    check-cast v1, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;

    .line 191
    .line 192
    return-object v1
.end method
