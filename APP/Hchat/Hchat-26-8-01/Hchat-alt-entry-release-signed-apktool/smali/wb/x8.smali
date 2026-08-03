.class public final synthetic Lwb/x8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/util/LinkedHashSet;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ZLjava/util/LinkedHashSet;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/x8;->g:I

    .line 2
    .line 3
    iput-boolean p1, p0, Lwb/x8;->h:Z

    .line 4
    .line 5
    iput-object p2, p0, Lwb/x8;->i:Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/x8;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/x8;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lwb/x8;->h:Z

    .line 7
    .line 8
    iget-object v1, p0, Lwb/x8;->i:Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    iget-object v2, p0, Lwb/x8;->j:Li0/a1;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/util/Set;

    .line 19
    .line 20
    invoke-static {v0, v1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/util/Set;

    .line 30
    .line 31
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_0
    iget-boolean v0, p0, Lwb/x8;->h:Z

    .line 42
    .line 43
    iget-object v1, p0, Lwb/x8;->i:Ljava/util/LinkedHashSet;

    .line 44
    .line 45
    iget-object v2, p0, Lwb/x8;->j:Li0/a1;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/util/Set;

    .line 54
    .line 55
    invoke-static {v0, v1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ljava/util/Set;

    .line 65
    .line 66
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :goto_2
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :pswitch_1
    iget-boolean v0, p0, Lwb/x8;->h:Z

    .line 75
    .line 76
    iget-object v1, p0, Lwb/x8;->i:Ljava/util/LinkedHashSet;

    .line 77
    .line 78
    iget-object v2, p0, Lwb/x8;->j:Li0/a1;

    .line 79
    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Ljava/util/Set;

    .line 87
    .line 88
    invoke-static {v0, v1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    goto :goto_3

    .line 93
    :cond_2
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Ljava/util/Set;

    .line 98
    .line 99
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :goto_3
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :pswitch_2
    iget-boolean v0, p0, Lwb/x8;->h:Z

    .line 108
    .line 109
    iget-object v1, p0, Lwb/x8;->i:Ljava/util/LinkedHashSet;

    .line 110
    .line 111
    iget-object v2, p0, Lwb/x8;->j:Li0/a1;

    .line 112
    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Ljava/util/Set;

    .line 120
    .line 121
    invoke-static {v0, v1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    goto :goto_4

    .line 126
    :cond_3
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Ljava/util/Set;

    .line 131
    .line 132
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    :goto_4
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :pswitch_3
    iget-boolean v0, p0, Lwb/x8;->h:Z

    .line 141
    .line 142
    iget-object v1, p0, Lwb/x8;->i:Ljava/util/LinkedHashSet;

    .line 143
    .line 144
    iget-object v2, p0, Lwb/x8;->j:Li0/a1;

    .line 145
    .line 146
    if-eqz v0, :cond_4

    .line 147
    .line 148
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, Ljava/util/Set;

    .line 153
    .line 154
    invoke-static {v0, v1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    goto :goto_5

    .line 159
    :cond_4
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, Ljava/util/Set;

    .line 164
    .line 165
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    :goto_5
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_1

    .line 173
    .line 174
    :pswitch_4
    iget-boolean v0, p0, Lwb/x8;->h:Z

    .line 175
    .line 176
    iget-object v1, p0, Lwb/x8;->i:Ljava/util/LinkedHashSet;

    .line 177
    .line 178
    iget-object v2, p0, Lwb/x8;->j:Li0/a1;

    .line 179
    .line 180
    if-eqz v0, :cond_5

    .line 181
    .line 182
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Ljava/util/Set;

    .line 187
    .line 188
    invoke-static {v0, v1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    goto :goto_6

    .line 193
    :cond_5
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, Ljava/util/Set;

    .line 198
    .line 199
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    :goto_6
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_1

    .line 207
    .line 208
    :pswitch_5
    iget-boolean v0, p0, Lwb/x8;->h:Z

    .line 209
    .line 210
    iget-object v1, p0, Lwb/x8;->i:Ljava/util/LinkedHashSet;

    .line 211
    .line 212
    iget-object v2, p0, Lwb/x8;->j:Li0/a1;

    .line 213
    .line 214
    if-eqz v0, :cond_6

    .line 215
    .line 216
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, Ljava/util/Set;

    .line 221
    .line 222
    invoke-static {v0, v1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    goto :goto_7

    .line 227
    :cond_6
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, Ljava/util/Set;

    .line 232
    .line 233
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    :goto_7
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_1

    .line 241
    .line 242
    :pswitch_6
    iget-boolean v0, p0, Lwb/x8;->h:Z

    .line 243
    .line 244
    iget-object v1, p0, Lwb/x8;->i:Ljava/util/LinkedHashSet;

    .line 245
    .line 246
    iget-object v2, p0, Lwb/x8;->j:Li0/a1;

    .line 247
    .line 248
    if-eqz v0, :cond_7

    .line 249
    .line 250
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    check-cast v0, Ljava/util/Set;

    .line 255
    .line 256
    invoke-static {v0, v1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    goto :goto_8

    .line 261
    :cond_7
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, Ljava/util/Set;

    .line 266
    .line 267
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    :goto_8
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_1

    .line 275
    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
