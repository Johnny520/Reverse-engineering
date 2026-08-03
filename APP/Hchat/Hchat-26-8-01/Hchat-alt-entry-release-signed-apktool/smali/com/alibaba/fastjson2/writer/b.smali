.class public final synthetic Lcom/alibaba/fastjson2/writer/b;
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
    iput p1, p0, Lcom/alibaba/fastjson2/writer/b;->a:I

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
    iget v0, p0, Lcom/alibaba/fastjson2/writer/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lm7/j;

    .line 7
    .line 8
    const v0, 0x1010003

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lm7/j;->X(I)Lm7/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lv7/j0;->S()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, Lud/a;

    .line 25
    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_1
    check-cast p1, Lud/a;

    .line 34
    .line 35
    new-instance p1, Ljava/util/ArrayList;

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_2
    check-cast p1, Lud/a;

    .line 43
    .line 44
    iget-object p1, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_4
    check-cast p1, Lnc/a;

    .line 60
    .line 61
    iget-object p1, p1, Lnc/a;->h:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Ljava/lang/String;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_5
    check-cast p1, Ljava/nio/file/Path;

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :pswitch_6
    check-cast p1, Lud/r;

    .line 74
    .line 75
    iget-object p1, p1, Lud/r;->l:Lud/e;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_7
    check-cast p1, Lud/m;

    .line 79
    .line 80
    invoke-interface {p1}, Lud/m;->q()Lod/d;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object p1, p1, Lod/d;->j:Lod/a;

    .line 85
    .line 86
    invoke-virtual {p1}, Lod/a;->f()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :pswitch_8
    check-cast p1, Lod/a;

    .line 92
    .line 93
    invoke-virtual {p1}, Lod/a;->k()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1

    .line 98
    :pswitch_9
    check-cast p1, Lod/a;

    .line 99
    .line 100
    invoke-virtual {p1}, Lod/a;->f()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    return-object p1

    .line 105
    :pswitch_a
    check-cast p1, Ljava/lang/Class;

    .line 106
    .line 107
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 108
    .line 109
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    return-object p1

    .line 113
    :pswitch_b
    check-cast p1, Lud/a;

    .line 114
    .line 115
    iget-object p1, p1, Lud/a;->m:Ljava/util/List;

    .line 116
    .line 117
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :pswitch_c
    check-cast p1, Lud/p;

    .line 123
    .line 124
    iget-object p1, p1, Lud/p;->k:Lpd/k;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1

    .line 131
    :pswitch_d
    check-cast p1, Ljava/lang/String;

    .line 132
    .line 133
    new-instance p1, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    return-object p1

    .line 139
    :pswitch_e
    check-cast p1, Lef/c;

    .line 140
    .line 141
    iget-object p1, p1, Lef/c;->d:Ljava/lang/String;

    .line 142
    .line 143
    return-object p1

    .line 144
    :pswitch_f
    check-cast p1, Lef/c;

    .line 145
    .line 146
    iget-object p1, p1, Lef/c;->c:Ljava/lang/String;

    .line 147
    .line 148
    return-object p1

    .line 149
    :pswitch_10
    check-cast p1, Lef/c;

    .line 150
    .line 151
    iget-object p1, p1, Lef/c;->e:Ljava/lang/String;

    .line 152
    .line 153
    return-object p1

    .line 154
    :pswitch_11
    check-cast p1, Ljava/lang/Integer;

    .line 155
    .line 156
    const/4 p1, 0x1

    .line 157
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    return-object p1

    .line 162
    :pswitch_12
    check-cast p1, Ljava/lang/Integer;

    .line 163
    .line 164
    return-object p1

    .line 165
    :pswitch_13
    check-cast p1, Ljava/lang/reflect/Method;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    return-object p1

    .line 172
    :pswitch_14
    check-cast p1, Ljava/lang/reflect/Method;

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1

    .line 179
    :pswitch_15
    check-cast p1, Ljava/lang/reflect/Method;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    return-object p1

    .line 186
    :pswitch_16
    check-cast p1, Ljava/lang/StackTraceElement;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    return-object p1

    .line 193
    :pswitch_17
    check-cast p1, Ljava/lang/StackTraceElement;

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    return-object p1

    .line 200
    :pswitch_18
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 201
    .line 202
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    return-object p1

    .line 207
    :pswitch_19
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 208
    .line 209
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    return-object p1

    .line 214
    :pswitch_1a
    check-cast p1, Ljava/lang/StackTraceElement;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    return-object p1

    .line 221
    :pswitch_1b
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 222
    .line 223
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    return-object p1

    .line 228
    :pswitch_1c
    check-cast p1, Ljava/lang/reflect/Field;

    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    return-object p1

    .line 235
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
