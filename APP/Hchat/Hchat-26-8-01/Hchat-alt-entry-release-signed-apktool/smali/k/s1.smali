.class public final synthetic Lk/s1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk/s1;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lk/s1;->g:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const-string v4, ""

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const-string v0, "latest"

    .line 13
    .line 14
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :pswitch_0
    invoke-static {v4}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :pswitch_1
    invoke-static {v4}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :pswitch_2
    invoke-static {v4}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    :pswitch_3
    sget-object v0, Lwb/ho;->a:Log/k;

    .line 35
    .line 36
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_4
    invoke-static {v4}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0

    .line 44
    :pswitch_5
    sget-object v0, Lwb/o3;->a:Li0/m2;

    .line 45
    .line 46
    const/high16 v0, 0x3f800000    # 1.0f

    .line 47
    .line 48
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :pswitch_6
    new-instance v0, Lk/s1;

    .line 54
    .line 55
    const/16 v1, 0x17

    .line 56
    .line 57
    invoke-direct {v0, v1}, Lk/s1;-><init>(I)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_7
    sget-object v0, Lwb/o3;->a:Li0/m2;

    .line 62
    .line 63
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_8
    new-instance v0, Lu2/j;

    .line 67
    .line 68
    invoke-direct {v0, v1, v2}, Lu2/j;-><init>(J)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_9
    new-instance v0, Lu2/j;

    .line 73
    .line 74
    invoke-direct {v0, v1, v2}, Lu2/j;-><init>(J)V

    .line 75
    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_a
    sget-object v0, Lw/n;->a:Li0/m2;

    .line 79
    .line 80
    return-object v5

    .line 81
    :pswitch_b
    new-instance v0, Lf1/t0;

    .line 82
    .line 83
    const v1, 0x4dffeb3b    # 5.3670077E8f

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, Lf1/c0;->c(I)J

    .line 87
    .line 88
    .line 89
    move-result-wide v1

    .line 90
    invoke-direct {v0, v1, v2}, Lf1/t0;-><init>(J)V

    .line 91
    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    const-string v1, "CompositionLocal LocalSavedStateRegistryOwner not present"

    .line 97
    .line 98
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v0

    .line 102
    :pswitch_d
    sget-object v0, Lv0/h;->a:Li0/m2;

    .line 103
    .line 104
    return-object v5

    .line 105
    :pswitch_e
    new-instance v0, Lv0/d;

    .line 106
    .line 107
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 108
    .line 109
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-direct {v0, v1}, Lv0/d;-><init>(Ljava/util/Map;)V

    .line 113
    .line 114
    .line 115
    return-object v0

    .line 116
    :pswitch_f
    new-instance v0, Lth/n;

    .line 117
    .line 118
    invoke-direct {v0}, Lth/n;-><init>()V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_10
    new-instance v0, Lme/yun/silk/SilkCodec;

    .line 123
    .line 124
    invoke-direct {v0}, Lme/yun/silk/SilkCodec;-><init>()V

    .line 125
    .line 126
    .line 127
    return-object v0

    .line 128
    :pswitch_11
    sget-object v0, Lt0/b;->a:Li0/m2;

    .line 129
    .line 130
    sget-object v0, Lt0/a;->a:Lt0/a;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_12
    new-instance v0, Lsh/e2;

    .line 134
    .line 135
    const v1, -0x800001

    .line 136
    .line 137
    .line 138
    const/4 v2, 0x0

    .line 139
    invoke-direct {v0, v1, v2, v2}, Lsh/e2;-><init>(FFF)V

    .line 140
    .line 141
    .line 142
    return-object v0

    .line 143
    :pswitch_13
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 144
    .line 145
    return-object v0

    .line 146
    :pswitch_14
    sget-object v0, Lsh/h0;->a:Li0/u;

    .line 147
    .line 148
    return-object v5

    .line 149
    :pswitch_15
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 150
    .line 151
    return-object v0

    .line 152
    :pswitch_16
    sget-object v0, Ls3/b;->a:Li0/u;

    .line 153
    .line 154
    return-object v5

    .line 155
    :pswitch_17
    new-instance v0, Lr/z;

    .line 156
    .line 157
    invoke-direct {v0, v3, v3}, Lr/z;-><init>(II)V

    .line 158
    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_18
    new-instance v0, Lme/yun/silk/SilkCodec;

    .line 162
    .line 163
    invoke-direct {v0}, Lme/yun/silk/SilkCodec;-><init>()V

    .line 164
    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_19
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 168
    .line 169
    const-string v1, "CompositionLocal LocalLifecycleOwner not present"

    .line 170
    .line 171
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v0

    .line 175
    :pswitch_1a
    sget v0, Lm/j0;->a:F

    .line 176
    .line 177
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 178
    .line 179
    return-object v0

    .line 180
    :pswitch_1b
    sget-object v0, Lk9/r;->a:Lk9/r;

    .line 181
    .line 182
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    if-eqz v0, :cond_0

    .line 187
    .line 188
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-eqz v0, :cond_0

    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_0
    sget-object v0, Lk9/r;->g:Ljava/lang/ref/WeakReference;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, Landroid/app/Activity;

    .line 202
    .line 203
    :goto_0
    if-eqz v0, :cond_1

    .line 204
    .line 205
    sget-boolean v1, Lk9/r;->d:Z

    .line 206
    .line 207
    if-eqz v1, :cond_1

    .line 208
    .line 209
    invoke-static {v0}, Lk9/r;->q(Landroid/app/Activity;)Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-eqz v1, :cond_1

    .line 214
    .line 215
    const/4 v3, 0x1

    .line 216
    :cond_1
    sget-object v1, Lk9/r;->g:Ljava/lang/ref/WeakReference;

    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    check-cast v1, Landroid/app/Activity;

    .line 223
    .line 224
    if-eqz v1, :cond_3

    .line 225
    .line 226
    if-eqz v3, :cond_2

    .line 227
    .line 228
    if-eq v1, v0, :cond_3

    .line 229
    .line 230
    :cond_2
    invoke-static {v1}, La7/a;->l(Landroid/content/Context;)V

    .line 231
    .line 232
    .line 233
    :cond_3
    invoke-static {v5}, Lk9/r;->e(Landroid/app/Activity;)V

    .line 234
    .line 235
    .line 236
    if-eqz v3, :cond_4

    .line 237
    .line 238
    if-eqz v0, :cond_4

    .line 239
    .line 240
    invoke-static {v0}, Lk9/r;->c(Landroid/app/Activity;)V

    .line 241
    .line 242
    .line 243
    :cond_4
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 244
    .line 245
    return-object v0

    .line 246
    :pswitch_1c
    new-instance v0, Lk/w1;

    .line 247
    .line 248
    invoke-direct {v0, v3}, Lk/w1;-><init>(I)V

    .line 249
    .line 250
    .line 251
    return-object v0

    .line 252
    nop

    .line 253
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
