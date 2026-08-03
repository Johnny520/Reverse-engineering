.class public final synthetic Lbc/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbc/j;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lbc/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lnb/a;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lnb/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/util/List;

    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/util/Map;

    .line 20
    .line 21
    check-cast p1, Lbe/a;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/lang/String;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/util/function/Function;

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lbe/a;

    .line 42
    .line 43
    throw p1

    .line 44
    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :pswitch_2
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lnb/a;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Lnb/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lwb/yt;

    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_3
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Lca/s;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Lca/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lr8/d;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_4
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Ljava/util/List;

    .line 75
    .line 76
    check-cast p1, Ljava/lang/Integer;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Lqd/j;

    .line 87
    .line 88
    return-object p1

    .line 89
    :pswitch_5
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Lff/a;

    .line 92
    .line 93
    check-cast p1, Ljava/io/File;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    .line 99
    .line 100
    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    .line 103
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v0, p1, v1, v2}, Lff/a;->c(Ljava/io/File;Ljava/io/InputStream;Ljava/lang/String;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :catch_0
    move-exception v0

    .line 116
    goto :goto_1

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :catchall_1
    move-exception v1

    .line 123
    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    :goto_0
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 127
    :goto_1
    sget-object v1, Lff/a;->c:Lmh/b;

    .line 128
    .line 129
    const-string v2, "File open error: {}"

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-interface {v1, p1, v2, v0}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 139
    .line 140
    :goto_2
    return-object v0

    .line 141
    :pswitch_6
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, Lfb/g0;

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Lfb/g0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    check-cast p1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 150
    .line 151
    return-object p1

    .line 152
    :pswitch_7
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Lfb/g0;

    .line 155
    .line 156
    invoke-virtual {v0, p1}, Lfb/g0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    return-object p1

    .line 161
    :pswitch_8
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, Lfb/g0;

    .line 164
    .line 165
    invoke-virtual {v0, p1}, Lfb/g0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    return-object p1

    .line 170
    :pswitch_9
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 173
    .line 174
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->b(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1

    .line 179
    :pswitch_a
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 182
    .line 183
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->a(Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    return-object p1

    .line 188
    :pswitch_b
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, Ljava/lang/reflect/Type;

    .line 191
    .line 192
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->d(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    return-object p1

    .line 197
    :pswitch_c
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Ljava/lang/reflect/Method;

    .line 200
    .line 201
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->a(Ljava/lang/Object;Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    return-object p1

    .line 206
    :pswitch_d
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, Ljava/util/Iterator;

    .line 209
    .line 210
    check-cast p1, Ljava/lang/String;

    .line 211
    .line 212
    invoke-static {v0, p1}, Lbsh/StringUtil;->b(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    return-object p1

    .line 217
    :pswitch_e
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v0, Lbsh/NameSpace;

    .line 220
    .line 221
    check-cast p1, Ljava/lang/String;

    .line 222
    .line 223
    invoke-static {v0, p1}, Lbsh/Reflect;->e(Lbsh/NameSpace;Ljava/lang/String;)Lbsh/Variable;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    return-object p1

    .line 228
    :pswitch_f
    iget-object v0, p0, Lbc/j;->b:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, Lbc/k;

    .line 231
    .line 232
    check-cast p1, Lud/e;

    .line 233
    .line 234
    invoke-virtual {v0, p1}, Lbc/k;->b(Lud/e;)Lbc/l;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    return-object p1

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
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
