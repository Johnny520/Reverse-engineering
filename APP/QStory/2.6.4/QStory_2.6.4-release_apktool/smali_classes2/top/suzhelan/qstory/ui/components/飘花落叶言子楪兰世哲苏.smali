.class public final synthetic Ltop/suzhelan/qstory/ui/components/飘花落叶言子楪兰世哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(IL飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    iput p1, p0, Ltop/suzhelan/qstory/ui/components/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p2, p0, Ltop/suzhelan/qstory/ui/components/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/ui/components/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Ltop/suzhelan/qstory/ui/components/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-interface {p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/List;
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 16
    .line 17
    :goto_0
    return-object p0

    .line 18
    :pswitch_0
    invoke-interface {p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object p0, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    sget-object v1, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;

    .line 24
    .line 25
    sget-object v6, Lcom/google/gson/LongSerializationPolicy;->DEFAULT:Lcom/google/gson/LongSerializationPolicy;

    .line 26
    .line 27
    sget-object v2, Lcom/google/gson/FieldNamingPolicy;->IDENTITY:Lcom/google/gson/FieldNamingPolicy;

    .line 28
    .line 29
    new-instance p0, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v3, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    sget-object v4, Lcom/google/gson/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世:Lcom/google/gson/飘花落叶言子楪世苏兰哲;

    .line 45
    .line 46
    sget-object v10, Lcom/google/gson/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏:Lcom/google/gson/ToNumberPolicy;

    .line 47
    .line 48
    sget-object v11, Lcom/google/gson/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰:Lcom/google/gson/ToNumberPolicy;

    .line 49
    .line 50
    new-instance v5, Ljava/util/ArrayDeque;

    .line 51
    .line 52
    invoke-direct {v5}, Ljava/util/ArrayDeque;-><init>()V

    .line 53
    .line 54
    .line 55
    move-object v7, v5

    .line 56
    sget-object v5, Lcom/google/gson/Strictness;->LENIENT:Lcom/google/gson/Strictness;

    .line 57
    .line 58
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    new-instance v9, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v12

    .line 71
    add-int/2addr v12, v8

    .line 72
    add-int/lit8 v12, v12, 0x3

    .line 73
    .line 74
    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 78
    .line 79
    .line 80
    invoke-static {v9}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    new-instance v8, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v8}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 92
    .line 93
    .line 94
    sget-boolean v8, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 95
    .line 96
    move-object v8, v0

    .line 97
    new-instance v0, Lcom/google/gson/飘花落叶言子楪苏世哲兰;

    .line 98
    .line 99
    move-object v12, v3

    .line 100
    new-instance v3, Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-direct {v3, p0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 103
    .line 104
    .line 105
    move-object p0, v7

    .line 106
    new-instance v7, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 109
    .line 110
    .line 111
    new-instance v8, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v8, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 114
    .line 115
    .line 116
    new-instance v12, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v12, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 119
    .line 120
    .line 121
    invoke-direct/range {v0 .. v12}, Lcom/google/gson/飘花落叶言子楪苏世哲兰;-><init>(Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;Lcom/google/gson/飘花落叶言子楪世苏哲兰;Ljava/util/Map;Lcom/google/gson/飘花落叶言子楪世苏兰哲;Lcom/google/gson/Strictness;Lcom/google/gson/LongSerializationPolicy;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/gson/飘花落叶言子楪哲世苏兰;Lcom/google/gson/飘花落叶言子楪哲世苏兰;Ljava/util/List;)V

    .line 122
    .line 123
    .line 124
    new-instance p0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 125
    .line 126
    const/16 v1, 0x13

    .line 127
    .line 128
    invoke-direct {p0, v1}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;-><init>(I)V

    .line 129
    .line 130
    .line 131
    const/16 v1, 0xb9e

    .line 132
    .line 133
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {p0, v1}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪哲兰苏(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    sget-object v1, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    const/4 v1, 0x0

    .line 146
    invoke-static {v1}, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Z)L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    iput-object v2, p0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 151
    .line 152
    new-instance v2, L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世苏哲兰;

    .line 153
    .line 154
    invoke-direct {v2, v0}, L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/gson/飘花落叶言子楪苏世哲兰;)V

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪兰苏哲()Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    const-class v0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;

    .line 169
    .line 170
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    const/16 v0, 0xb9f

    .line 175
    .line 176
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    check-cast p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;

    .line 183
    .line 184
    new-instance p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;

    .line 185
    .line 186
    invoke-direct {p0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 187
    .line 188
    .line 189
    const-string v0, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5~\u545c\u545c\u545c\u55b5\u545c\u55b5\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u55b5\u545c\u55b5\u545c\u545c\u55b5"

    .line 190
    .line 191
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iput-object v0, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 196
    .line 197
    invoke-virtual {p0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, v1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰苏楪哲(Z)V

    .line 201
    .line 202
    .line 203
    const/16 v0, 0xcb6

    .line 204
    .line 205
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {p0, v0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const/16 v0, 0xcb7

    .line 213
    .line 214
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    new-instance v2, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;

    .line 219
    .line 220
    const/4 v3, 0x6

    .line 221
    invoke-direct {v2, v3}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0, v0, v2}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世兰哲()V

    .line 228
    .line 229
    .line 230
    sget-object v0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;

    .line 231
    .line 232
    new-instance v2, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪苏世哲兰;

    .line 233
    .line 234
    invoke-direct {v2, p0, v1}, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;I)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 238
    .line 239
    .line 240
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 241
    .line 242
    return-object p0

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
