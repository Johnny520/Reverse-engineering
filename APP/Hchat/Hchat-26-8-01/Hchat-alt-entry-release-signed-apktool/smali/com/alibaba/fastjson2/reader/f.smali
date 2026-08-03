.class public final synthetic Lcom/alibaba/fastjson2/reader/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/alibaba/fastjson2/reader/f;->a:I

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
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->p(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :pswitch_1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 22
    .line 23
    check-cast p1, [J

    .line 24
    .line 25
    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicLongArray;-><init>([J)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 30
    .line 31
    check-cast p1, [I

    .line 32
    .line 33
    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;-><init>([I)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->s(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->h(Ljava/lang/String;)Ljava/time/ZoneId;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {p1}, Ljava/time/Duration;->parse(Ljava/lang/CharSequence;)Ljava/time/Duration;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :pswitch_6
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :pswitch_7
    check-cast p1, Ljava/util/Map;

    .line 64
    .line 65
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    :pswitch_8
    check-cast p1, Ljava/util/SortedMap;

    .line 71
    .line 72
    invoke-static {p1}, Ljava/util/Collections;->synchronizedSortedMap(Ljava/util/SortedMap;)Ljava/util/SortedMap;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :pswitch_9
    check-cast p1, Ljava/util/Map;

    .line 78
    .line 79
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :pswitch_a
    check-cast p1, Ljava/util/Collection;

    .line 85
    .line 86
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->b(Ljava/util/Collection;)Ljava/util/Collection;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :pswitch_b
    check-cast p1, Ljava/util/Collection;

    .line 92
    .line 93
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->a(Ljava/util/Collection;)Ljava/util/Collection;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1

    .line 98
    :pswitch_c
    check-cast p1, Ljava/util/Collection;

    .line 99
    .line 100
    invoke-static {p1}, Ljava/util/Collections;->synchronizedCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    return-object p1

    .line 105
    :pswitch_d
    check-cast p1, Ljava/util/List;

    .line 106
    .line 107
    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    :pswitch_e
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    return-object p1

    .line 117
    :pswitch_f
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :pswitch_10
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    return-object p1

    .line 127
    :pswitch_11
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    return-object p1

    .line 132
    :pswitch_12
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    return-object p1

    .line 137
    :pswitch_13
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    return-object p1

    .line 142
    :pswitch_14
    check-cast p1, Ljava/util/SortedSet;

    .line 143
    .line 144
    invoke-static {p1}, Ljava/util/Collections;->synchronizedSortedSet(Ljava/util/SortedSet;)Ljava/util/SortedSet;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    return-object p1

    .line 149
    :pswitch_15
    check-cast p1, Ljava/util/List;

    .line 150
    .line 151
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->g(Ljava/util/List;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    return-object p1

    .line 156
    :pswitch_16
    check-cast p1, Ljava/util/Collection;

    .line 157
    .line 158
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->i(Ljava/util/Collection;)Ljava/util/Collection;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    return-object p1

    .line 163
    :pswitch_17
    check-cast p1, Ljava/util/List;

    .line 164
    .line 165
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->l(Ljava/util/List;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    return-object p1

    .line 170
    :pswitch_18
    check-cast p1, Ljava/util/Collection;

    .line 171
    .line 172
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->f(Ljava/util/Collection;)Ljava/util/Collection;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    return-object p1

    .line 177
    :pswitch_19
    check-cast p1, Ljava/util/Set;

    .line 178
    .line 179
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    return-object p1

    .line 184
    :pswitch_1a
    check-cast p1, Ljava/util/List;

    .line 185
    .line 186
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    return-object p1

    .line 191
    :pswitch_1b
    check-cast p1, Ljava/util/Collection;

    .line 192
    .line 193
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    return-object p1

    .line 198
    :pswitch_1c
    check-cast p1, Ljava/util/Set;

    .line 199
    .line 200
    invoke-static {p1}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    return-object p1

    .line 205
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
