.class public final synthetic Lyyds/ᲈᲈᲁᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᲈᲈᲁᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget p0, p0, Lyyds/ᲈᲈᲁᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    check-cast p2, Landroid/app/Dialog;

    .line 12
    .line 13
    const-wide p0, -0x37f80e68a836eL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/app/Dialog;->dismiss()V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, Lyyds/ᲇᛳᲁᛷ;

    .line 28
    .line 29
    check-cast p2, Lyyds/ᲁᛶᛱᛴ;

    .line 30
    .line 31
    instance-of p0, p2, Lyyds/ᛸᛷᛶᲁ;

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    check-cast p2, Lyyds/ᛸᛷᛶᲁ;

    .line 36
    .line 37
    iget-object p0, p1, Lyyds/ᲇᛳᲁᛷ;->ᛲᲈᲁ:Lyyds/ᲁᛴᛲ;

    .line 38
    .line 39
    iget-object p0, p2, Lyyds/ᛸᛷᛶᲁ;->ᲇᲈᛵᛷ:Ljava/lang/ThreadLocal;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v1, p2, Lyyds/ᛸᛷᛶᲁ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p1, Lyyds/ᲇᛳᲁᛷ;->ᛵᛸᛸᛷ:[Ljava/lang/Object;

    .line 51
    .line 52
    iget v1, p1, Lyyds/ᲇᛳᲁᛷ;->ᲇᲈᛵᛷ:I

    .line 53
    .line 54
    aput-object v0, p0, v1

    .line 55
    .line 56
    iget-object p0, p1, Lyyds/ᲇᛳᲁᛷ;->ᲀᛲᛳᲀ:[Lyyds/ᛸᛷᛶᲁ;

    .line 57
    .line 58
    add-int/lit8 v0, v1, 0x1

    .line 59
    .line 60
    iput v0, p1, Lyyds/ᲇᛳᲁᛷ;->ᲇᲈᛵᛷ:I

    .line 61
    .line 62
    aput-object p2, p0, v1

    .line 63
    .line 64
    :cond_0
    return-object p1

    .line 65
    :pswitch_1
    check-cast p1, Lyyds/ᛸᛷᛶᲁ;

    .line 66
    .line 67
    check-cast p2, Lyyds/ᲁᛶᛱᛴ;

    .line 68
    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    move-object v0, p1

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    instance-of p0, p2, Lyyds/ᛸᛷᛶᲁ;

    .line 74
    .line 75
    if-eqz p0, :cond_2

    .line 76
    .line 77
    move-object v0, p2

    .line 78
    check-cast v0, Lyyds/ᛸᛷᛶᲁ;

    .line 79
    .line 80
    :cond_2
    :goto_0
    return-object v0

    .line 81
    :pswitch_2
    check-cast p2, Lyyds/ᲁᛶᛱᛴ;

    .line 82
    .line 83
    instance-of p0, p2, Lyyds/ᛸᛷᛶᲁ;

    .line 84
    .line 85
    if-eqz p0, :cond_6

    .line 86
    .line 87
    instance-of p0, p1, Ljava/lang/Integer;

    .line 88
    .line 89
    if-eqz p0, :cond_3

    .line 90
    .line 91
    move-object v0, p1

    .line 92
    check-cast v0, Ljava/lang/Integer;

    .line 93
    .line 94
    :cond_3
    if-eqz v0, :cond_4

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    move p0, v2

    .line 102
    :goto_1
    if-nez p0, :cond_5

    .line 103
    .line 104
    move-object p1, p2

    .line 105
    goto :goto_2

    .line 106
    :cond_5
    add-int/2addr p0, v2

    .line 107
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    :cond_6
    :goto_2
    return-object p1

    .line 112
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    check-cast p2, Ljava/lang/reflect/Field;

    .line 119
    .line 120
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eq p1, p0, :cond_7

    .line 125
    .line 126
    move v1, v2

    .line 127
    :cond_7
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    check-cast p2, Ljava/lang/reflect/Field;

    .line 139
    .line 140
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-ne p1, p0, :cond_8

    .line 145
    .line 146
    move v1, v2

    .line 147
    :cond_8
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    check-cast p2, Ljava/lang/reflect/Method;

    .line 159
    .line 160
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->isDefault()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-eq p1, p0, :cond_9

    .line 165
    .line 166
    move v1, v2

    .line 167
    :cond_9
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0

    .line 172
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    check-cast p2, Ljava/lang/reflect/Method;

    .line 179
    .line 180
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->isDefault()Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-ne p1, p0, :cond_a

    .line 185
    .line 186
    move v1, v2

    .line 187
    :cond_a
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    return-object p0

    .line 192
    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    check-cast p2, Ljava/lang/reflect/Method;

    .line 199
    .line 200
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-eq p1, p0, :cond_b

    .line 205
    .line 206
    move v1, v2

    .line 207
    :cond_b
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    return-object p0

    .line 212
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 213
    .line 214
    check-cast p2, Ljava/lang/reflect/Member;

    .line 215
    .line 216
    instance-of p0, p2, Ljava/lang/reflect/Method;

    .line 217
    .line 218
    if-eqz p0, :cond_c

    .line 219
    .line 220
    check-cast p2, Ljava/lang/reflect/Method;

    .line 221
    .line 222
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    goto :goto_3

    .line 227
    :cond_c
    instance-of p0, p2, Ljava/lang/reflect/Constructor;

    .line 228
    .line 229
    if-eqz p0, :cond_d

    .line 230
    .line 231
    check-cast p2, Ljava/lang/reflect/Constructor;

    .line 232
    .line 233
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    goto :goto_3

    .line 238
    :cond_d
    instance-of p0, p2, Ljava/lang/reflect/Field;

    .line 239
    .line 240
    if-eqz p0, :cond_e

    .line 241
    .line 242
    check-cast p2, Ljava/lang/reflect/Field;

    .line 243
    .line 244
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->toGenericString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    :goto_3
    invoke-static {p0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result p0

    .line 252
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    goto :goto_4

    .line 257
    :cond_e
    const-string p0, "Unsupported member type: "

    .line 258
    .line 259
    invoke-static {p2, p0}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :goto_4
    return-object v0

    .line 263
    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 266
    .line 267
    .line 268
    move-result p0

    .line 269
    check-cast p2, Ljava/lang/reflect/Member;

    .line 270
    .line 271
    invoke-interface {p2}, Ljava/lang/reflect/Member;->isSynthetic()Z

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    if-eq p1, p0, :cond_f

    .line 276
    .line 277
    move v1, v2

    .line 278
    :cond_f
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    return-object p0

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
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
