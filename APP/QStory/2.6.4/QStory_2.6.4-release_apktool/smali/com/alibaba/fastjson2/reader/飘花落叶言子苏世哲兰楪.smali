.class public final synthetic Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    check-cast p1, Ljava/util/Collection;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_4
    check-cast p1, Ljava/util/NavigableSet;

    .line 56
    .line 57
    invoke-static {p1}, Ljava/util/Collections;->synchronizedNavigableSet(Ljava/util/NavigableSet;)Ljava/util/NavigableSet;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_5
    check-cast p1, Ljava/util/SortedSet;

    .line 63
    .line 64
    invoke-static {p1}, Ljava/util/Collections;->synchronizedSortedSet(Ljava/util/SortedSet;)Ljava/util/SortedSet;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_6
    check-cast p1, Ljava/util/Set;

    .line 70
    .line 71
    invoke-static {p1}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :pswitch_7
    check-cast p1, Ljava/util/Collection;

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_8
    check-cast p1, Ljava/util/List;

    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :pswitch_9
    check-cast p1, Ljava/util/Collection;

    .line 104
    .line 105
    invoke-static {p1}, Ljava/util/Collections;->synchronizedCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :pswitch_a
    check-cast p1, Ljava/util/Collection;

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_b
    check-cast p1, Ljava/util/NavigableSet;

    .line 126
    .line 127
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableNavigableSet(Ljava/util/NavigableSet;)Ljava/util/NavigableSet;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :pswitch_c
    check-cast p1, Ljava/util/SortedSet;

    .line 133
    .line 134
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSortedSet(Ljava/util/SortedSet;)Ljava/util/SortedSet;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0

    .line 139
    :pswitch_d
    check-cast p1, Ljava/util/Set;

    .line 140
    .line 141
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    return-object p0

    .line 146
    :pswitch_e
    check-cast p1, Ljava/util/List;

    .line 147
    .line 148
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :pswitch_f
    check-cast p1, Ljava/util/Collection;

    .line 154
    .line 155
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0

    .line 160
    :pswitch_10
    check-cast p1, Ljava/util/List;

    .line 161
    .line 162
    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0

    .line 167
    :pswitch_11
    check-cast p1, Ljava/util/NavigableSet;

    .line 168
    .line 169
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableNavigableSet(Ljava/util/NavigableSet;)Ljava/util/NavigableSet;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    return-object p0

    .line 174
    :pswitch_12
    check-cast p1, Ljava/util/SortedSet;

    .line 175
    .line 176
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSortedSet(Ljava/util/SortedSet;)Ljava/util/SortedSet;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :pswitch_13
    check-cast p1, Ljava/util/Set;

    .line 182
    .line 183
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0

    .line 188
    :pswitch_14
    check-cast p1, Ljava/lang/Integer;

    .line 189
    .line 190
    new-instance p0, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 193
    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_15
    check-cast p1, Ljava/lang/Integer;

    .line 197
    .line 198
    new-instance p0, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 201
    .line 202
    .line 203
    return-object p0

    .line 204
    :pswitch_16
    check-cast p1, Ljava/lang/Integer;

    .line 205
    .line 206
    new-instance p0, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 209
    .line 210
    .line 211
    return-object p0

    .line 212
    :pswitch_17
    check-cast p1, Ljava/lang/Integer;

    .line 213
    .line 214
    new-instance p0, Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 217
    .line 218
    .line 219
    return-object p0

    .line 220
    :pswitch_18
    check-cast p1, Ljava/util/List;

    .line 221
    .line 222
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    return-object p0

    .line 227
    :pswitch_19
    new-instance p0, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 228
    .line 229
    check-cast p1, [I

    .line 230
    .line 231
    invoke-direct {p0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;-><init>([I)V

    .line 232
    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_1a
    check-cast p1, Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {p1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    return-object p0

    .line 242
    :pswitch_1b
    check-cast p1, Ljava/lang/String;

    .line 243
    .line 244
    invoke-static {p1}, Ljava/time/ZoneId;->of(Ljava/lang/String;)Ljava/time/ZoneId;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    return-object p0

    .line 249
    :pswitch_1c
    check-cast p1, Ljava/lang/String;

    .line 250
    .line 251
    invoke-static {p1}, Ljava/time/ZoneOffset;->of(Ljava/lang/String;)Ljava/time/ZoneOffset;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    return-object p0

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
