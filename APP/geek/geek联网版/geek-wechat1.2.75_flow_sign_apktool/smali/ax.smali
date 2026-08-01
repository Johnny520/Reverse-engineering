.class public final Lax;
.super Lgq;

# interfaces
.implements Ljm;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lax;->b:I

    .line 2
    .line 3
    iput-object p2, p0, Lax;->c:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lgq;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lax;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/activity/ComponentActivity;

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object v2, Lq00;->a:Lr00;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v2, Lua;

    .line 21
    .line 22
    const-class v3, Lx10;

    .line 23
    .line 24
    invoke-direct {v2, v3}, Lua;-><init>(Ljava/lang/Class;)V

    .line 25
    .line 26
    .line 27
    new-instance v4, Lva0;

    .line 28
    .line 29
    invoke-interface {v2}, Lta;->a()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v5, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    .line 34
    .line 35
    invoke-static {v5, v2}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v4, v2}, Lva0;-><init>(Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    new-array v4, v2, [Lva0;

    .line 46
    .line 47
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, [Lva0;

    .line 52
    .line 53
    array-length v4, v1

    .line 54
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, [Lva0;

    .line 59
    .line 60
    const-string v4, "initializers"

    .line 61
    .line 62
    invoke-static {v4, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->d()Lwa0;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-interface {v0}, Lpo;->a()Lue;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v5, "store"

    .line 74
    .line 75
    invoke-static {v5, v4}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    const-string v5, "defaultCreationExtras"

    .line 79
    .line 80
    invoke-static {v5, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v4, v4, Lwa0;->a:Ljava/util/LinkedHashMap;

    .line 84
    .line 85
    const-string v5, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 86
    .line 87
    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Lua0;

    .line 92
    .line 93
    invoke-virtual {v3, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-eqz v7, :cond_0

    .line 98
    .line 99
    const-string v0, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    .line 100
    .line 101
    invoke-static {v0, v6}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_0
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 106
    .line 107
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, Lue;->a:Ljava/util/LinkedHashMap;

    .line 111
    .line 112
    invoke-interface {v6, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 113
    .line 114
    .line 115
    sget-object v0, Lxh;->p:Lxh;

    .line 116
    .line 117
    invoke-interface {v6, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    :try_start_0
    array-length v0, v1

    .line 121
    const/4 v6, 0x0

    .line 122
    :goto_0
    if-ge v2, v0, :cond_2

    .line 123
    .line 124
    aget-object v7, v1, v2

    .line 125
    .line 126
    iget-object v7, v7, Lva0;->a:Ljava/lang/Class;

    .line 127
    .line 128
    invoke-virtual {v7, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-eqz v7, :cond_1

    .line 133
    .line 134
    new-instance v6, Lx10;

    .line 135
    .line 136
    invoke-direct {v6}, Lx10;-><init>()V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    .line 138
    .line 139
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_2
    if-eqz v6, :cond_4

    .line 143
    .line 144
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Lua0;

    .line 149
    .line 150
    if-eqz v0, :cond_3

    .line 151
    .line 152
    invoke-virtual {v0}, Lua0;->a()V

    .line 153
    .line 154
    .line 155
    :cond_3
    :goto_1
    check-cast v6, Lx10;

    .line 156
    .line 157
    return-object v6

    .line 158
    :cond_4
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 159
    .line 160
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    const-string v2, "No initializer set for given class "

    .line 165
    .line 166
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v0
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0

    .line 174
    :catch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 175
    .line 176
    const-string v1, "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."

    .line 177
    .line 178
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v0

    .line 182
    :pswitch_0
    iget-object v0, p0, Lax;->c:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v0, Landroidx/activity/a;

    .line 185
    .line 186
    invoke-virtual {v0}, Landroidx/activity/a;->b()V

    .line 187
    .line 188
    .line 189
    sget-object v0, Lxh;->n:Lxh;

    .line 190
    .line 191
    return-object v0

    .line 192
    :pswitch_1
    iget-object v0, p0, Lax;->c:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, Landroidx/activity/a;

    .line 195
    .line 196
    iget-object v1, v0, Landroidx/activity/a;->b:Lk6;

    .line 197
    .line 198
    invoke-virtual {v1}, Lk6;->size()I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    invoke-virtual {v1, v2}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    :cond_5
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    const/4 v3, 0x0

    .line 211
    if-eqz v2, :cond_6

    .line 212
    .line 213
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    move-object v4, v2

    .line 218
    check-cast v4, Lul;

    .line 219
    .line 220
    iget-boolean v4, v4, Lul;->a:Z

    .line 221
    .line 222
    if-eqz v4, :cond_5

    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_6
    move-object v2, v3

    .line 226
    :goto_2
    check-cast v2, Lul;

    .line 227
    .line 228
    iput-object v3, v0, Landroidx/activity/a;->c:Lul;

    .line 229
    .line 230
    sget-object v0, Lxh;->n:Lxh;

    .line 231
    .line 232
    return-object v0

    .line 233
    :pswitch_2
    iget-object v0, p0, Lax;->c:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Landroidx/activity/a;

    .line 236
    .line 237
    invoke-virtual {v0}, Landroidx/activity/a;->b()V

    .line 238
    .line 239
    .line 240
    sget-object v0, Lxh;->n:Lxh;

    .line 241
    .line 242
    return-object v0

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
