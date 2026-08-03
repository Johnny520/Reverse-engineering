.class public final synthetic Lwb/gl;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/gl;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/gl;->h:Li0/a1;

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
    .locals 3

    .line 1
    iget v0, p0, Lwb/gl;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 7
    .line 8
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/Number;

    .line 13
    .line 14
    :goto_0
    const/4 v2, 0x1

    .line 15
    invoke-static {v1, v2, v0}, Lp/a;->u(Ljava/lang/Number;ILi0/a1;)V

    .line 16
    .line 17
    .line 18
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 22
    .line 23
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/Number;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_1
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :pswitch_2
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 38
    .line 39
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :pswitch_3
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 46
    .line 47
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :pswitch_4
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :pswitch_5
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 61
    .line 62
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :pswitch_6
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 69
    .line 70
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :pswitch_7
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :pswitch_8
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 84
    .line 85
    sget-object v1, Lwb/mo;->a:Lwb/mo;

    .line 86
    .line 87
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_9
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 92
    .line 93
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :pswitch_a
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 100
    .line 101
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :pswitch_b
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 108
    .line 109
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :pswitch_c
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 116
    .line 117
    const/4 v1, 0x0

    .line 118
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :pswitch_d
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 123
    .line 124
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :pswitch_e
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 131
    .line 132
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :pswitch_f
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 139
    .line 140
    const/4 v1, 0x0

    .line 141
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :pswitch_10
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 146
    .line 147
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_1

    .line 153
    .line 154
    :pswitch_11
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 155
    .line 156
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 157
    .line 158
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_1

    .line 162
    .line 163
    :pswitch_12
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 164
    .line 165
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 166
    .line 167
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_1

    .line 171
    .line 172
    :pswitch_13
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 173
    .line 174
    sget-object v1, Lwb/ju;->a:Lwb/ju;

    .line 175
    .line 176
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    goto/16 :goto_1

    .line 180
    .line 181
    :pswitch_14
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 182
    .line 183
    sget-object v1, Lwb/ku;->a:Lwb/ku;

    .line 184
    .line 185
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_1

    .line 189
    .line 190
    :pswitch_15
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 191
    .line 192
    sget-object v1, Lwb/j2;->g:Lwb/j2;

    .line 193
    .line 194
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_1

    .line 198
    .line 199
    :pswitch_16
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 200
    .line 201
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 202
    .line 203
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_1

    .line 207
    .line 208
    :pswitch_17
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 209
    .line 210
    const/4 v1, 0x0

    .line 211
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_1

    .line 215
    .line 216
    :pswitch_18
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 217
    .line 218
    const/4 v1, 0x0

    .line 219
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_1

    .line 223
    .line 224
    :pswitch_19
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 225
    .line 226
    const/4 v1, 0x0

    .line 227
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    goto/16 :goto_1

    .line 231
    .line 232
    :pswitch_1a
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 233
    .line 234
    const/4 v1, 0x0

    .line 235
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    goto/16 :goto_1

    .line 239
    .line 240
    :pswitch_1b
    iget-object v0, p0, Lwb/gl;->h:Li0/a1;

    .line 241
    .line 242
    const/4 v1, 0x0

    .line 243
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    :pswitch_1c
    new-instance v0, Lwb/n5;

    .line 249
    .line 250
    new-instance v1, Lw0/l;

    .line 251
    .line 252
    const/16 v2, 0xb

    .line 253
    .line 254
    invoke-direct {v1, v2}, Lw0/l;-><init>(I)V

    .line 255
    .line 256
    .line 257
    invoke-direct {v0, v1}, Lwb/n5;-><init>(Lw0/l;)V

    .line 258
    .line 259
    .line 260
    iget-object v1, p0, Lwb/gl;->h:Li0/a1;

    .line 261
    .line 262
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    goto/16 :goto_1

    .line 266
    .line 267
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
