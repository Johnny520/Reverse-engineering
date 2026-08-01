.class public final Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰哲苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰哲苏;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰哲苏;

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
    .locals 6

    .line 1
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲()Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世兰哲苏;

    .line 35
    .line 36
    iget-object v4, v3, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 37
    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    sget-object v4, Lkotlin/reflect/jvm/internal/impl/load/java/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0, v3}, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世兰哲苏;)Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪苏世哲兰;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    new-instance v5, Lkotlin/Pair;

    .line 49
    .line 50
    invoke-direct {v5, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move-object v5, v1

    .line 55
    :goto_1
    if-eqz v5, :cond_0

    .line 56
    .line 57
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static {v2}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子哲楪苏兰世(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世兰苏哲;

    .line 71
    .line 72
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 73
    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/types/error/ErrorTypeKind;->NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION:Lkotlin/reflect/jvm/internal/impl/types/error/ErrorTypeKind;

    .line 77
    .line 78
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世兰苏哲;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    filled-new-array {v0}, [Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {p0, v0}, L飘花落叶言世苏子哲兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/types/error/ErrorTypeKind;[Ljava/lang/String;)L飘花落叶言世苏子哲兰楪/飘花落叶言子楪苏世哲兰;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    goto :goto_4

    .line 91
    :cond_4
    iget-object p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p0, L飘花落叶言世楪苏哲兰子/飘花落叶言子楪世苏哲兰;

    .line 94
    .line 95
    iget-object v3, p0, L飘花落叶言世楪苏哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲苏世;

    .line 96
    .line 97
    invoke-interface {v3}, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰()L飘花落叶言世子兰苏哲楪/飘花落叶言子楪苏世兰哲;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    sget-object v5, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    if-eqz v5, :cond_5

    .line 111
    .line 112
    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v4, v5}, L飘花落叶言世子兰苏哲楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)L飘花落叶言世楪子苏兰哲/飘花落叶言子世楪苏哲兰;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    goto :goto_2

    .line 121
    :cond_5
    move-object v4, v1

    .line 122
    :goto_2
    if-nez v4, :cond_7

    .line 123
    .line 124
    new-instance v4, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪苏哲兰世;

    .line 125
    .line 126
    iget-object v2, v2, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/annotation/Annotation;

    .line 127
    .line 128
    invoke-static {v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-static {v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-direct {v4, v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪苏哲兰世;-><init>(Ljava/lang/Class;)V

    .line 137
    .line 138
    .line 139
    iget-object v2, p0, L飘花落叶言世楪苏哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v2, v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 147
    .line 148
    if-eqz v2, :cond_6

    .line 149
    .line 150
    invoke-virtual {v2, v4}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子世苏楪兰哲(Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪苏哲兰世;)L飘花落叶言世楪子苏兰哲/飘花落叶言子世楪苏哲兰;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    if-nez v4, :cond_7

    .line 155
    .line 156
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;

    .line 157
    .line 158
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    iget-object v0, v0, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲兰苏;

    .line 163
    .line 164
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-direct {v1, v2, v0}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;-><init>(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;)V

    .line 169
    .line 170
    .line 171
    iget-object p0, p0, L飘花落叶言世楪苏哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲世兰;

    .line 172
    .line 173
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏兰哲世:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 178
    .line 179
    invoke-static {v3, v1, p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲苏世;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;)L飘花落叶言世楪子苏兰哲/飘花落叶言子世楪苏哲兰;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    goto :goto_3

    .line 184
    :cond_6
    const-string p0, "resolver"

    .line 185
    .line 186
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw v1

    .line 190
    :cond_7
    :goto_3
    invoke-virtual {v4}, L飘花落叶言世楪子苏兰哲/飘花落叶言子世楪苏哲兰;->飘花落叶言子苏楪兰世哲()Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    :goto_4
    return-object p0

    .line 195
    :pswitch_1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/descriptors/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世兰苏哲;

    .line 196
    .line 197
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/annotation/Annotation;

    .line 198
    .line 199
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
