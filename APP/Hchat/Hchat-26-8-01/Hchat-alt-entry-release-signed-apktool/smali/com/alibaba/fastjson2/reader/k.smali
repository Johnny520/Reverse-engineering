.class public final synthetic Lcom/alibaba/fastjson2/reader/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/alibaba/fastjson2/reader/k;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/k;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/k;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/k;->c:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/FieldInfo;)V
    .locals 1

    .line 14
    const/4 v0, 0x2

    iput v0, p0, Lcom/alibaba/fastjson2/reader/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/k;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/k;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/k;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    iput p4, p0, Lcom/alibaba/fastjson2/reader/k;->a:I

    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/k;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/k;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/k;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/k;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lud/u;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/k;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lud/r;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/k;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Li4/c0;

    .line 17
    .line 18
    check-cast p1, Lgf/a;

    .line 19
    .line 20
    :try_start_0
    invoke-static {v0, v1, p1, v2}, Lre/c;->m(Lud/u;Lud/r;Lgf/a;Li4/c0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception v0

    .line 25
    new-instance v1, Laf/g;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v3, "Usage info collection failed with error: "

    .line 36
    .line 37
    const-string v4, " at insn: "

    .line 38
    .line 39
    invoke-static {v3, v2, v4, p1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw v1

    .line 47
    :pswitch_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/k;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lfe/a;

    .line 50
    .line 51
    iget-object v0, v0, Lfe/a;->a:Lud/u;

    .line 52
    .line 53
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/k;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lud/e;

    .line 56
    .line 57
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/k;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Lah/a;

    .line 60
    .line 61
    check-cast p1, Lnd/b0;

    .line 62
    .line 63
    invoke-virtual {p1}, Lnd/b0;->O()Lb5/k;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    new-instance v4, Lb5/k;

    .line 68
    .line 69
    iget v5, v3, Lb5/k;->b:I

    .line 70
    .line 71
    and-int/lit8 v6, v5, 0x7

    .line 72
    .line 73
    iget v3, v3, Lb5/k;->c:I

    .line 74
    .line 75
    const/4 v7, 0x3

    .line 76
    invoke-direct {v4, v6, v3, v7}, Lb5/k;-><init>(III)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Lb5/k;->g()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_0

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_0
    invoke-virtual {v4}, Lb5/k;->e()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    const/4 v6, 0x1

    .line 91
    if-nez v3, :cond_4

    .line 92
    .line 93
    and-int/lit8 v3, v5, 0x7

    .line 94
    .line 95
    if-nez v3, :cond_1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {v4}, Lb5/k;->f()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_3

    .line 103
    .line 104
    invoke-virtual {p1}, Lnd/b0;->P()Lud/e;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    if-eqz v3, :cond_2

    .line 109
    .line 110
    iget-object v0, v0, Lud/u;->s:Led/c;

    .line 111
    .line 112
    invoke-virtual {v1}, Lud/e;->Z()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v0, v1}, Led/c;->d(Ljava/lang/String;)Ljava/util/Set;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    new-instance v1, Lbe/g0;

    .line 125
    .line 126
    const/4 v4, 0x2

    .line 127
    invoke-direct {v1, v3, v4}, Lbe/g0;-><init>(Lud/e;I)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_6

    .line 135
    .line 136
    :cond_2
    invoke-virtual {v2, p1, v6}, Lah/a;->z(Lnd/b0;I)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_3
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const-string v0, " is not supported"

    .line 145
    .line 146
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_4
    :goto_0
    invoke-virtual {p1}, Lnd/b0;->P()Lud/e;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    if-eqz v3, :cond_5

    .line 159
    .line 160
    iget-object v0, v0, Lud/u;->s:Led/c;

    .line 161
    .line 162
    invoke-virtual {v1}, Lud/e;->Z()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v0, v1}, Led/c;->d(Ljava/lang/String;)Ljava/util/Set;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    new-instance v1, Lbe/g0;

    .line 175
    .line 176
    const/4 v4, 0x2

    .line 177
    invoke-direct {v1, v3, v4}, Lbe/g0;-><init>(Lud/e;I)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_5

    .line 185
    .line 186
    const/4 v6, 0x4

    .line 187
    :cond_5
    invoke-virtual {v2, p1, v6}, Lah/a;->z(Lnd/b0;I)V

    .line 188
    .line 189
    .line 190
    :cond_6
    :goto_1
    return-void

    .line 191
    :pswitch_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/k;->c:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 194
    .line 195
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/k;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v1, Ljava/lang/annotation/Annotation;

    .line 198
    .line 199
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/k;->d:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v2, Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 202
    .line 203
    check-cast p1, Ljava/lang/reflect/Method;

    .line 204
    .line 205
    invoke-static {v0, v1, v2, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->a(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Method;)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :pswitch_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/k;->d:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 212
    .line 213
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/k;->b:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v1, Ljava/lang/annotation/Annotation;

    .line 216
    .line 217
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/k;->c:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v2, Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 220
    .line 221
    check-cast p1, Ljava/lang/reflect/Method;

    .line 222
    .line 223
    invoke-static {v0, v1, v2, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->a(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/reflect/Method;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :pswitch_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/k;->b:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v0, Ljava/lang/annotation/Annotation;

    .line 230
    .line 231
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/k;->c:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v1, Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 234
    .line 235
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/k;->d:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v2, Ljava/lang/Class;

    .line 238
    .line 239
    check-cast p1, Ljava/lang/reflect/Method;

    .line 240
    .line 241
    invoke-static {v0, v1, v2, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->q(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
