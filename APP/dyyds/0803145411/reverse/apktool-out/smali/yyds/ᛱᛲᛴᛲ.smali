.class public final Lyyds/ᛱᛲᛴᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Ljava/lang/Object;

.field public ᛲᛳᛶᲁ:Ljava/lang/Object;

.field public ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᛲᲈᲁ:I

.field public ᛵᛸᛸᛷ:I

.field public ᛶᛷᛲᲁ:Ljava/lang/Object;

.field public ᲀᛲᛳᲀ:Ljava/lang/Object;

.field public ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛲᲈᲁ:I

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const-string v0, ""

    iput-object v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 41
    iput-object v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    const/4 v1, -0x1

    .line 42
    iput v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ:I

    .line 43
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 44
    new-instance v1, Ljava/util/ArrayList;

    .line 45
    new-instance v2, Lyyds/ᲇᛳᛶᲇ;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lyyds/ᲇᛳᛶᲇ;-><init>([Ljava/lang/Object;Z)V

    .line 46
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 47
    iput-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᛱᲈᲁ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/AlertDialog;Lyyds/ᛵᲇᛲᛱ;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/TextView;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛲᲈᲁ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    iput p1, p0, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ:I

    .line 17
    .line 18
    new-instance p1, Lyyds/ᲈᛲᲈᛱ;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-direct {p1, p0, p2}, Lyyds/ᲈᛲᲈᛱ;-><init>(Lyyds/ᛱᛲᛴᛲ;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p5, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Lyyds/ᲈᛲᲈᛱ;

    .line 28
    .line 29
    invoke-direct {p1, p0, v0}, Lyyds/ᲈᛲᲈᛱ;-><init>(Lyyds/ᛱᛲᛴᛲ;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p6, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static ᲇᲇᲇᛱ(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-gt v1, v2, :cond_3

    .line 12
    .line 13
    const/16 v2, 0x26

    .line 14
    .line 15
    const/4 v3, 0x4

    .line 16
    invoke-static {p0, v2, v1, v3}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛳᛶᛳ(Ljava/lang/CharSequence;CII)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :cond_0
    const/16 v5, 0x3d

    .line 28
    .line 29
    invoke-static {p0, v5, v1, v3}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛳᛶᛳ(Ljava/lang/CharSequence;CII)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eq v3, v4, :cond_2

    .line 34
    .line 35
    if-le v3, v2, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    :goto_1
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :goto_2
    add-int/lit8 v1, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "://"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v1, "//"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/16 v2, 0x3a

    .line 45
    .line 46
    if-lez v1, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-lez v1, :cond_3

    .line 58
    .line 59
    :goto_1
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-lez v1, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    :cond_2
    const/16 v1, 0x40

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    :cond_3
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, Ljava/lang/String;

    .line 94
    .line 95
    if-eqz v1, :cond_5

    .line 96
    .line 97
    invoke-static {v1, v2}, Lyyds/ᛲᲇᛸᲇ;->ᛲᛶᛱᲈ(Ljava/lang/CharSequence;C)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    const/16 v1, 0x5b

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const/16 v1, 0x5d

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    :cond_5
    :goto_2
    iget v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ:I

    .line 129
    .line 130
    const/4 v3, -0x1

    .line 131
    if-ne v1, v3, :cond_6

    .line 132
    .line 133
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, Ljava/lang/String;

    .line 136
    .line 137
    if-eqz v1, :cond_a

    .line 138
    .line 139
    :cond_6
    invoke-virtual {p0}, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    iget-object v4, p0, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v4, Ljava/lang/String;

    .line 146
    .line 147
    if-eqz v4, :cond_9

    .line 148
    .line 149
    const-string v5, "http"

    .line 150
    .line 151
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_7

    .line 156
    .line 157
    const/16 v3, 0x50

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    const-string v5, "https"

    .line 161
    .line 162
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_8

    .line 167
    .line 168
    const/16 v3, 0x1bb

    .line 169
    .line 170
    :cond_8
    :goto_3
    if-eq v1, v3, :cond_a

    .line 171
    .line 172
    :cond_9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    :cond_a
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    const/4 v3, 0x0

    .line 187
    move v4, v3

    .line 188
    :goto_4
    if-ge v4, v2, :cond_b

    .line 189
    .line 190
    const/16 v5, 0x2f

    .line 191
    .line 192
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    check-cast v5, Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    add-int/lit8 v4, v4, 0x1

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_b
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v1, Ljava/util/ArrayList;

    .line 210
    .line 211
    if-eqz v1, :cond_10

    .line 212
    .line 213
    const/16 v1, 0x3f

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v1, Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    invoke-static {v3, v2}, Lyyds/ᛳᛵᲀ;->ᛷᛵᲇᲀ(II)Lyyds/ᲈᲈᲀᲈ;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    const/4 v3, 0x2

    .line 231
    invoke-static {v2, v3}, Lyyds/ᛳᛵᲀ;->ᛷᛲᲈᛱ(Lyyds/ᲈᲈᲀᲈ;I)Lyyds/ᲇᲁᲁᲁ;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    iget v3, v2, Lyyds/ᲇᲁᲁᲁ;->ᲀᛲᛳᲀ:I

    .line 236
    .line 237
    iget v4, v2, Lyyds/ᲇᲁᲁᲁ;->ᲇᲈᛵᛷ:I

    .line 238
    .line 239
    iget v2, v2, Lyyds/ᲇᲁᲁᲁ;->ᛲᛴᛳᛲ:I

    .line 240
    .line 241
    if-lez v2, :cond_c

    .line 242
    .line 243
    if-le v3, v4, :cond_d

    .line 244
    .line 245
    :cond_c
    if-gez v2, :cond_10

    .line 246
    .line 247
    if-gt v4, v3, :cond_10

    .line 248
    .line 249
    :cond_d
    :goto_5
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    check-cast v5, Ljava/lang/String;

    .line 254
    .line 255
    add-int/lit8 v6, v3, 0x1

    .line 256
    .line 257
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    check-cast v6, Ljava/lang/String;

    .line 262
    .line 263
    if-lez v3, :cond_e

    .line 264
    .line 265
    const/16 v7, 0x26

    .line 266
    .line 267
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    :cond_e
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    if-eqz v6, :cond_f

    .line 274
    .line 275
    const/16 v5, 0x3d

    .line 276
    .line 277
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    :cond_f
    if-eq v3, v4, :cond_10

    .line 284
    .line 285
    add-int/2addr v3, v2

    .line 286
    goto :goto_5

    .line 287
    :cond_10
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v1, Ljava/lang/String;

    .line 290
    .line 291
    if-eqz v1, :cond_11

    .line 292
    .line 293
    const/16 v1, 0x23

    .line 294
    .line 295
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    iget-object p0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast p0, Ljava/lang/String;

    .line 301
    .line 302
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    :cond_11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    return-object p0

    .line 310
    nop

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ᛲᛴᛳᛲ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaPlayer;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 17
    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v0, -0x1

    .line 23
    iput v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ:I

    .line 24
    .line 25
    return-void
.end method

.method public ᛲᲈᲁ()Lyyds/ᛱᛲᲀᛶ;
    .locals 12

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, Ljava/lang/String;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz v2, :cond_6

    .line 8
    .line 9
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x7

    .line 15
    invoke-static {v3, v3, v4, v1}, Lyyds/ᛴᛶᲀᛲ;->ᛷᛵᲇᲀ(IIILjava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v5, p0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v5, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v3, v3, v4, v5}, Lyyds/ᛴᛶᲀᛲ;->ᛷᛵᲇᲀ(IIILjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    iget-object v6, p0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v6, :cond_5

    .line 32
    .line 33
    move v7, v4

    .line 34
    move-object v4, v5

    .line 35
    move-object v5, v6

    .line 36
    invoke-virtual {p0}, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    iget-object v8, p0, Lyyds/ᛱᛲᛴᛲ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v8, Ljava/util/ArrayList;

    .line 43
    .line 44
    new-instance v9, Ljava/util/ArrayList;

    .line 45
    .line 46
    const/16 v10, 0xa

    .line 47
    .line 48
    invoke-static {v8, v10}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v11

    .line 63
    if-eqz v11, :cond_0

    .line 64
    .line 65
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    check-cast v11, Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v3, v3, v7, v11}, Lyyds/ᛴᛶᲀᛲ;->ᛷᛵᲇᲀ(IIILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    iget-object v8, p0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v8, Ljava/util/ArrayList;

    .line 82
    .line 83
    if-eqz v8, :cond_2

    .line 84
    .line 85
    new-instance v9, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-static {v8, v10}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-eqz v10, :cond_3

    .line 103
    .line 104
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    check-cast v10, Ljava/lang/String;

    .line 109
    .line 110
    if-eqz v10, :cond_1

    .line 111
    .line 112
    const/4 v11, 0x3

    .line 113
    invoke-static {v3, v3, v11, v10}, Lyyds/ᛴᛶᲀᛲ;->ᛷᛵᲇᲀ(IIILjava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    goto :goto_2

    .line 118
    :cond_1
    move-object v10, v0

    .line 119
    :goto_2
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_2
    move-object v9, v0

    .line 124
    :cond_3
    iget-object v8, p0, Lyyds/ᛱᛲᛴᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v8, Ljava/lang/String;

    .line 127
    .line 128
    if-eqz v8, :cond_4

    .line 129
    .line 130
    invoke-static {v3, v3, v7, v8}, Lyyds/ᛴᛶᲀᛲ;->ᛷᛵᲇᲀ(IIILjava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :cond_4
    move-object v8, v0

    .line 135
    invoke-virtual {p0}, Lyyds/ᛱᛲᛴᛲ;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    move-object v3, v1

    .line 140
    new-instance v1, Lyyds/ᛱᛲᲀᛶ;

    .line 141
    .line 142
    move-object v7, v9

    .line 143
    move-object v9, p0

    .line 144
    invoke-direct/range {v1 .. v9}, Lyyds/ᛱᛲᲀᛶ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return-object v1

    .line 148
    :cond_5
    const-string p0, "host == null"

    .line 149
    .line 150
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-object v0

    .line 154
    :cond_6
    const-string p0, "scheme == null"

    .line 155
    .line 156
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    return-object v0
.end method

.method public ᛵᛸᛸᛷ()I
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object p0, p0, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    const-string v0, "http"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const/16 v1, 0x50

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const-string v0, "https"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    const/16 v1, 0x1bb

    .line 31
    .line 32
    :cond_2
    :goto_0
    return v1
.end method

.method public ᲀᛲᛳᲀ()V
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/LinearLayout;

    .line 4
    .line 5
    sget-object v1, Lyyds/ᛴᛸᛴᛲ;->ᛲᲈᲁ:Lyyds/ᛴᛸᛴᛲ;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lyyds/ᛴᛸᛴᛲ;->ᛵᛸᛸᛷ()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Lyyds/ᛵᲇᛲᛱ;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    const/16 v5, 0x8

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Lyyds/ᛲᲀᛲᲈ;

    .line 41
    .line 42
    new-instance v2, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Lyyds/ᛷᛵᲇᲀ;

    .line 48
    .line 49
    const/4 v5, 0x4

    .line 50
    invoke-direct {v1, v5, p0}, Lyyds/ᛷᛵᲇᲀ;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance v5, Lyyds/ᲈᛸᛳ;

    .line 54
    .line 55
    invoke-direct {v5, p0, v4}, Lyyds/ᲈᛸᛳ;-><init>(Lyyds/ᛱᛲᛴᛲ;I)V

    .line 56
    .line 57
    .line 58
    new-instance v4, Lyyds/ᲈᛸᛳ;

    .line 59
    .line 60
    const/4 v6, 0x1

    .line 61
    invoke-direct {v4, p0, v6}, Lyyds/ᲈᛸᛳ;-><init>(Lyyds/ᛱᛲᛴᛲ;I)V

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, v2, v1, v5, v4}, Lyyds/ᛲᲀᛲᲈ;-><init>(Ljava/util/ArrayList;Lyyds/ᛷᛵᲇᲀ;Lyyds/ᲈᛸᛳ;Lyyds/ᲈᛸᛳ;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Lyyds/ᛵᲇᛲᛱ;->setAdapter(Lyyds/ᛲᛵᲇᛳ;)V

    .line 70
    .line 71
    .line 72
    new-instance p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 73
    .line 74
    invoke-direct {p0, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, p0}, Lyyds/ᛵᲇᛲᛱ;->setLayoutManager(Lyyds/ᲇᲇᛵᛲ;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public ᲇᲈᛵᛷ(Lyyds/ᛱᛲᲀᛶ;Ljava/lang/String;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lyyds/ᛱᛲᛴᛲ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v8, v3

    .line 10
    check-cast v8, Ljava/util/ArrayList;

    .line 11
    .line 12
    sget-object v3, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v9, 0x0

    .line 19
    invoke-static {v2, v9, v3}, Lyyds/ᛶᲁᛵᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;II)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v2, v4, v3}, Lyyds/ᛶᲁᛵᛲ;->ᛱᲈᲁ(Ljava/lang/String;II)I

    .line 28
    .line 29
    .line 30
    move-result v10

    .line 31
    sub-int v3, v10, v4

    .line 32
    .line 33
    const/16 v11, 0x30

    .line 34
    .line 35
    const/16 v12, 0x5b

    .line 36
    .line 37
    const/16 v13, 0x3a

    .line 38
    .line 39
    const/4 v14, -0x1

    .line 40
    const/4 v15, 0x2

    .line 41
    if-ge v3, v15, :cond_1

    .line 42
    .line 43
    :cond_0
    :goto_0
    move v3, v14

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/16 v5, 0x61

    .line 50
    .line 51
    invoke-static {v3, v5}, Lyyds/ᛷᛴᲇᛲ;->ᲀᛲᛳᲀ(II)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    const/16 v7, 0x41

    .line 56
    .line 57
    if-ltz v6, :cond_2

    .line 58
    .line 59
    const/16 v6, 0x7a

    .line 60
    .line 61
    invoke-static {v3, v6}, Lyyds/ᛷᛴᲇᛲ;->ᲀᛲᛳᲀ(II)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-lez v6, :cond_3

    .line 66
    .line 67
    :cond_2
    invoke-static {v3, v7}, Lyyds/ᛷᛴᲇᛲ;->ᲀᛲᛳᲀ(II)I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-ltz v6, :cond_0

    .line 72
    .line 73
    const/16 v6, 0x5a

    .line 74
    .line 75
    invoke-static {v3, v6}, Lyyds/ᛷᛴᲇᛲ;->ᲀᛲᛳᲀ(II)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-lez v3, :cond_3

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    add-int/lit8 v3, v4, 0x1

    .line 83
    .line 84
    :goto_1
    if-ge v3, v10, :cond_0

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-gt v5, v6, :cond_4

    .line 91
    .line 92
    const/16 v5, 0x7b

    .line 93
    .line 94
    if-ge v6, v5, :cond_4

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    if-gt v7, v6, :cond_5

    .line 98
    .line 99
    if-ge v6, v12, :cond_5

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    if-gt v11, v6, :cond_6

    .line 103
    .line 104
    if-ge v6, v13, :cond_6

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    const/16 v5, 0x2b

    .line 108
    .line 109
    if-eq v6, v5, :cond_8

    .line 110
    .line 111
    const/16 v5, 0x2d

    .line 112
    .line 113
    if-eq v6, v5, :cond_8

    .line 114
    .line 115
    const/16 v5, 0x2e

    .line 116
    .line 117
    if-ne v6, v5, :cond_7

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_7
    if-ne v6, v13, :cond_0

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_8
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    const/16 v5, 0x61

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :goto_3
    const-string v5, "http"

    .line 129
    .line 130
    const-string v6, "https"

    .line 131
    .line 132
    const/4 v7, 0x1

    .line 133
    if-eq v3, v14, :cond_b

    .line 134
    .line 135
    move-object/from16 v16, v6

    .line 136
    .line 137
    const/4 v6, 0x0

    .line 138
    move/from16 v17, v3

    .line 139
    .line 140
    move v3, v7

    .line 141
    const/4 v7, 0x6

    .line 142
    move-object/from16 v18, v5

    .line 143
    .line 144
    const-string v5, "https:"

    .line 145
    .line 146
    move-object/from16 v13, v16

    .line 147
    .line 148
    move/from16 v11, v17

    .line 149
    .line 150
    move-object/from16 v12, v18

    .line 151
    .line 152
    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_9

    .line 157
    .line 158
    iput-object v13, v0, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 159
    .line 160
    add-int/lit8 v4, v4, 0x6

    .line 161
    .line 162
    move-object/from16 v2, p2

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_9
    const/4 v6, 0x0

    .line 166
    const/4 v7, 0x5

    .line 167
    const-string v5, "http:"

    .line 168
    .line 169
    move-object/from16 v2, p2

    .line 170
    .line 171
    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_a

    .line 176
    .line 177
    iput-object v12, v0, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 178
    .line 179
    add-int/lit8 v4, v4, 0x5

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 183
    .line 184
    invoke-virtual {v2, v9, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    new-instance v2, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    const-string v3, "Expected URL scheme \'http\' or \'https\' but was \'"

    .line 191
    .line 192
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const/16 v1, 0x27

    .line 199
    .line 200
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v0

    .line 211
    :cond_b
    move-object v12, v5

    .line 212
    move-object v13, v6

    .line 213
    move v3, v7

    .line 214
    if-eqz v1, :cond_30

    .line 215
    .line 216
    iget-object v5, v1, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 217
    .line 218
    iput-object v5, v0, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 219
    .line 220
    :goto_4
    move v5, v4

    .line 221
    move v6, v9

    .line 222
    :goto_5
    const/16 v7, 0x5c

    .line 223
    .line 224
    const/16 v11, 0x2f

    .line 225
    .line 226
    move/from16 v18, v3

    .line 227
    .line 228
    if-ge v5, v10, :cond_d

    .line 229
    .line 230
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-eq v3, v11, :cond_c

    .line 235
    .line 236
    if-eq v3, v7, :cond_c

    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_c
    add-int/lit8 v6, v6, 0x1

    .line 240
    .line 241
    add-int/lit8 v5, v5, 0x1

    .line 242
    .line 243
    move/from16 v3, v18

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_d
    :goto_6
    const-string v5, " \"\'<>#"

    .line 247
    .line 248
    const-string v3, ""

    .line 249
    .line 250
    const/16 v7, 0x23

    .line 251
    .line 252
    if-ge v6, v15, :cond_11

    .line 253
    .line 254
    if-eqz v1, :cond_11

    .line 255
    .line 256
    iget-object v15, v1, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 257
    .line 258
    iget-object v11, v0, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v11, Ljava/lang/String;

    .line 261
    .line 262
    invoke-static {v15, v11}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v11

    .line 266
    if-nez v11, :cond_e

    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_e
    invoke-virtual {v1}, Lyyds/ᛱᛲᲀᛶ;->ᛲᛴᛳᛲ()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    iput-object v6, v0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 274
    .line 275
    invoke-virtual {v1}, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    iput-object v6, v0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 280
    .line 281
    iget-object v6, v1, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 282
    .line 283
    iput-object v6, v0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 284
    .line 285
    iget v6, v1, Lyyds/ᛱᛲᲀᛶ;->ᛲᛴᛳᛲ:I

    .line 286
    .line 287
    iput v6, v0, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ:I

    .line 288
    .line 289
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1}, Lyyds/ᛱᛲᲀᛶ;->ᲀᛲᛳᲀ()Ljava/util/ArrayList;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 297
    .line 298
    .line 299
    if-eq v4, v10, :cond_f

    .line 300
    .line 301
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    if-ne v6, v7, :cond_21

    .line 306
    .line 307
    :cond_f
    invoke-virtual {v1}, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    if-eqz v1, :cond_10

    .line 312
    .line 313
    const/16 v6, 0x53

    .line 314
    .line 315
    invoke-static {v9, v9, v6, v1, v5}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-static {v1}, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    goto :goto_7

    .line 324
    :cond_10
    const/4 v1, 0x0

    .line 325
    :goto_7
    iput-object v1, v0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 326
    .line 327
    goto/16 :goto_12

    .line 328
    .line 329
    :cond_11
    :goto_8
    add-int/2addr v4, v6

    .line 330
    move v1, v9

    .line 331
    move v6, v1

    .line 332
    :goto_9
    const-string v11, "@/\\?#"

    .line 333
    .line 334
    invoke-static {v4, v10, v2, v11}, Lyyds/ᛶᲁᛵᛲ;->ᲀᛲᛳᲀ(IILjava/lang/String;Ljava/lang/String;)I

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    if-eq v11, v10, :cond_12

    .line 339
    .line 340
    invoke-virtual {v2, v11}, Ljava/lang/String;->charAt(I)C

    .line 341
    .line 342
    .line 343
    move-result v15

    .line 344
    goto :goto_a

    .line 345
    :cond_12
    move v15, v14

    .line 346
    :goto_a
    if-eq v15, v14, :cond_17

    .line 347
    .line 348
    if-eq v15, v7, :cond_17

    .line 349
    .line 350
    const/16 v9, 0x2f

    .line 351
    .line 352
    if-eq v15, v9, :cond_17

    .line 353
    .line 354
    const/16 v9, 0x5c

    .line 355
    .line 356
    if-eq v15, v9, :cond_17

    .line 357
    .line 358
    const/16 v9, 0x3f

    .line 359
    .line 360
    if-eq v15, v9, :cond_17

    .line 361
    .line 362
    const/16 v9, 0x40

    .line 363
    .line 364
    if-eq v15, v9, :cond_13

    .line 365
    .line 366
    const/4 v9, 0x0

    .line 367
    goto :goto_9

    .line 368
    :cond_13
    const-string v9, " \"\':;<=>@[]^`{}|/\\?#"

    .line 369
    .line 370
    const-string v15, "%40"

    .line 371
    .line 372
    if-nez v1, :cond_16

    .line 373
    .line 374
    const/16 v7, 0x3a

    .line 375
    .line 376
    invoke-static {v2, v7, v4, v11}, Lyyds/ᛶᲁᛵᛲ;->ᲇᲈᛵᛷ(Ljava/lang/String;CII)I

    .line 377
    .line 378
    .line 379
    move-result v14

    .line 380
    const/16 v7, 0x70

    .line 381
    .line 382
    invoke-static {v4, v14, v7, v2, v9}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    if-eqz v6, :cond_14

    .line 387
    .line 388
    new-instance v6, Ljava/lang/StringBuilder;

    .line 389
    .line 390
    iget-object v7, v0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v7, Ljava/lang/String;

    .line 393
    .line 394
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    invoke-static {v6, v15, v4}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛵᲇᲀ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    :cond_14
    iput-object v4, v0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 402
    .line 403
    if-eq v14, v11, :cond_15

    .line 404
    .line 405
    add-int/lit8 v14, v14, 0x1

    .line 406
    .line 407
    const/16 v7, 0x70

    .line 408
    .line 409
    invoke-static {v14, v11, v7, v2, v9}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    iput-object v1, v0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 414
    .line 415
    move/from16 v1, v18

    .line 416
    .line 417
    goto :goto_b

    .line 418
    :cond_15
    const/16 v7, 0x70

    .line 419
    .line 420
    :goto_b
    move/from16 v6, v18

    .line 421
    .line 422
    goto :goto_c

    .line 423
    :cond_16
    const/16 v7, 0x70

    .line 424
    .line 425
    new-instance v14, Ljava/lang/StringBuilder;

    .line 426
    .line 427
    iget-object v7, v0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v7, Ljava/lang/String;

    .line 430
    .line 431
    invoke-direct {v14, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    const/16 v7, 0x70

    .line 438
    .line 439
    invoke-static {v4, v11, v7, v2, v9}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    iput-object v4, v0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 451
    .line 452
    :goto_c
    add-int/lit8 v4, v11, 0x1

    .line 453
    .line 454
    const/16 v7, 0x23

    .line 455
    .line 456
    const/4 v9, 0x0

    .line 457
    const/4 v14, -0x1

    .line 458
    goto :goto_9

    .line 459
    :cond_17
    move v1, v4

    .line 460
    :goto_d
    if-ge v1, v11, :cond_1a

    .line 461
    .line 462
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 463
    .line 464
    .line 465
    move-result v6

    .line 466
    const/16 v7, 0x3a

    .line 467
    .line 468
    if-eq v6, v7, :cond_1b

    .line 469
    .line 470
    const/16 v9, 0x5b

    .line 471
    .line 472
    if-eq v6, v9, :cond_18

    .line 473
    .line 474
    goto :goto_e

    .line 475
    :cond_18
    add-int/lit8 v1, v1, 0x1

    .line 476
    .line 477
    if-ge v1, v11, :cond_19

    .line 478
    .line 479
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 480
    .line 481
    .line 482
    move-result v6

    .line 483
    const/16 v14, 0x5d

    .line 484
    .line 485
    if-ne v6, v14, :cond_18

    .line 486
    .line 487
    :cond_19
    :goto_e
    add-int/lit8 v1, v1, 0x1

    .line 488
    .line 489
    goto :goto_d

    .line 490
    :cond_1a
    move v1, v11

    .line 491
    :cond_1b
    add-int/lit8 v6, v1, 0x1

    .line 492
    .line 493
    const/4 v7, 0x4

    .line 494
    const/16 v9, 0x22

    .line 495
    .line 496
    if-ge v6, v11, :cond_1e

    .line 497
    .line 498
    invoke-static {v4, v1, v7, v2}, Lyyds/ᛴᛶᲀᛲ;->ᛷᛵᲇᲀ(IIILjava/lang/String;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v7

    .line 502
    invoke-static {v7}, Lyyds/ᛲᛸᲇᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v7

    .line 506
    iput-object v7, v0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 507
    .line 508
    const/16 v7, 0x78

    .line 509
    .line 510
    :try_start_0
    invoke-static {v6, v11, v7, v2, v3}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v7

    .line 514
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 515
    .line 516
    .line 517
    move-result v7
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 518
    move/from16 v12, v18

    .line 519
    .line 520
    if-gt v12, v7, :cond_1c

    .line 521
    .line 522
    const/high16 v12, 0x10000

    .line 523
    .line 524
    if-ge v7, v12, :cond_1c

    .line 525
    .line 526
    goto :goto_f

    .line 527
    :catch_0
    :cond_1c
    const/4 v7, -0x1

    .line 528
    :goto_f
    iput v7, v0, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ:I

    .line 529
    .line 530
    const/4 v14, -0x1

    .line 531
    if-eq v7, v14, :cond_1d

    .line 532
    .line 533
    goto :goto_11

    .line 534
    :cond_1d
    invoke-virtual {v2, v6, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    new-instance v1, Ljava/lang/StringBuilder;

    .line 539
    .line 540
    const-string v2, "Invalid URL port: \""

    .line 541
    .line 542
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 556
    .line 557
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    throw v1

    .line 565
    :cond_1e
    const/4 v14, -0x1

    .line 566
    invoke-static {v4, v1, v7, v2}, Lyyds/ᛴᛶᲀᛲ;->ᛷᛵᲇᲀ(IIILjava/lang/String;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v6

    .line 570
    invoke-static {v6}, Lyyds/ᛲᛸᲇᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v6

    .line 574
    iput-object v6, v0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 575
    .line 576
    iget-object v6, v0, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v6, Ljava/lang/String;

    .line 579
    .line 580
    invoke-virtual {v6, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v7

    .line 584
    if-eqz v7, :cond_1f

    .line 585
    .line 586
    const/16 v14, 0x50

    .line 587
    .line 588
    goto :goto_10

    .line 589
    :cond_1f
    invoke-virtual {v6, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v6

    .line 593
    if-eqz v6, :cond_20

    .line 594
    .line 595
    const/16 v14, 0x1bb

    .line 596
    .line 597
    :cond_20
    :goto_10
    iput v14, v0, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ:I

    .line 598
    .line 599
    :goto_11
    iget-object v6, v0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast v6, Ljava/lang/String;

    .line 602
    .line 603
    if-eqz v6, :cond_2f

    .line 604
    .line 605
    move v4, v11

    .line 606
    :cond_21
    :goto_12
    const-string v1, "?#"

    .line 607
    .line 608
    invoke-static {v4, v10, v2, v1}, Lyyds/ᛶᲁᛵᛲ;->ᲀᛲᛳᲀ(IILjava/lang/String;Ljava/lang/String;)I

    .line 609
    .line 610
    .line 611
    move-result v1

    .line 612
    if-ne v4, v1, :cond_22

    .line 613
    .line 614
    goto/16 :goto_18

    .line 615
    .line 616
    :cond_22
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 617
    .line 618
    .line 619
    move-result v6

    .line 620
    const/16 v9, 0x2f

    .line 621
    .line 622
    if-eq v6, v9, :cond_23

    .line 623
    .line 624
    const/16 v9, 0x5c

    .line 625
    .line 626
    if-eq v6, v9, :cond_23

    .line 627
    .line 628
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 629
    .line 630
    .line 631
    move-result v6

    .line 632
    const/16 v18, 0x1

    .line 633
    .line 634
    add-int/lit8 v6, v6, -0x1

    .line 635
    .line 636
    invoke-virtual {v8, v6, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    goto :goto_13

    .line 640
    :cond_23
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    add-int/lit8 v4, v4, 0x1

    .line 647
    .line 648
    :goto_13
    if-ge v4, v1, :cond_2c

    .line 649
    .line 650
    const-string v6, "/\\"

    .line 651
    .line 652
    invoke-static {v4, v1, v2, v6}, Lyyds/ᛶᲁᛵᛲ;->ᲀᛲᛳᲀ(IILjava/lang/String;Ljava/lang/String;)I

    .line 653
    .line 654
    .line 655
    move-result v6

    .line 656
    if-ge v6, v1, :cond_24

    .line 657
    .line 658
    const/4 v7, 0x1

    .line 659
    goto :goto_14

    .line 660
    :cond_24
    const/4 v7, 0x0

    .line 661
    :goto_14
    const-string v9, " \"<>^`{}|/\\?#"

    .line 662
    .line 663
    const/16 v11, 0x70

    .line 664
    .line 665
    invoke-static {v4, v6, v11, v2, v9}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v4

    .line 669
    const-string v9, "."

    .line 670
    .line 671
    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v9

    .line 675
    if-nez v9, :cond_2a

    .line 676
    .line 677
    const-string v9, "%2e"

    .line 678
    .line 679
    invoke-virtual {v4, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 680
    .line 681
    .line 682
    move-result v9

    .line 683
    if-eqz v9, :cond_25

    .line 684
    .line 685
    goto/16 :goto_17

    .line 686
    .line 687
    :cond_25
    const-string v9, ".."

    .line 688
    .line 689
    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    move-result v9

    .line 693
    if-nez v9, :cond_28

    .line 694
    .line 695
    const-string v9, "%2e."

    .line 696
    .line 697
    invoke-virtual {v4, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 698
    .line 699
    .line 700
    move-result v9

    .line 701
    if-nez v9, :cond_28

    .line 702
    .line 703
    const-string v9, ".%2e"

    .line 704
    .line 705
    invoke-virtual {v4, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 706
    .line 707
    .line 708
    move-result v9

    .line 709
    if-nez v9, :cond_28

    .line 710
    .line 711
    const-string v9, "%2e%2e"

    .line 712
    .line 713
    invoke-virtual {v4, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 714
    .line 715
    .line 716
    move-result v9

    .line 717
    if-eqz v9, :cond_26

    .line 718
    .line 719
    goto :goto_16

    .line 720
    :cond_26
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 721
    .line 722
    .line 723
    move-result v9

    .line 724
    const/16 v18, 0x1

    .line 725
    .line 726
    add-int/lit8 v9, v9, -0x1

    .line 727
    .line 728
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v9

    .line 732
    check-cast v9, Ljava/lang/CharSequence;

    .line 733
    .line 734
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 735
    .line 736
    .line 737
    move-result v9

    .line 738
    if-nez v9, :cond_27

    .line 739
    .line 740
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 741
    .line 742
    .line 743
    move-result v9

    .line 744
    add-int/lit8 v9, v9, -0x1

    .line 745
    .line 746
    invoke-virtual {v8, v9, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    goto :goto_15

    .line 750
    :cond_27
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 751
    .line 752
    .line 753
    :goto_15
    if-eqz v7, :cond_2a

    .line 754
    .line 755
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 756
    .line 757
    .line 758
    goto :goto_17

    .line 759
    :cond_28
    :goto_16
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 760
    .line 761
    .line 762
    move-result v4

    .line 763
    const/16 v18, 0x1

    .line 764
    .line 765
    add-int/lit8 v4, v4, -0x1

    .line 766
    .line 767
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    check-cast v4, Ljava/lang/String;

    .line 772
    .line 773
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 774
    .line 775
    .line 776
    move-result v4

    .line 777
    if-nez v4, :cond_29

    .line 778
    .line 779
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 780
    .line 781
    .line 782
    move-result v4

    .line 783
    if-nez v4, :cond_29

    .line 784
    .line 785
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 786
    .line 787
    .line 788
    move-result v4

    .line 789
    add-int/lit8 v4, v4, -0x1

    .line 790
    .line 791
    invoke-virtual {v8, v4, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    goto :goto_17

    .line 795
    :cond_29
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    :cond_2a
    :goto_17
    if-eqz v7, :cond_2b

    .line 799
    .line 800
    add-int/lit8 v4, v6, 0x1

    .line 801
    .line 802
    goto/16 :goto_13

    .line 803
    .line 804
    :cond_2b
    move v4, v6

    .line 805
    goto/16 :goto_13

    .line 806
    .line 807
    :cond_2c
    :goto_18
    if-ge v1, v10, :cond_2d

    .line 808
    .line 809
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 810
    .line 811
    .line 812
    move-result v4

    .line 813
    const/16 v9, 0x3f

    .line 814
    .line 815
    if-ne v4, v9, :cond_2d

    .line 816
    .line 817
    const/16 v4, 0x23

    .line 818
    .line 819
    invoke-static {v2, v4, v1, v10}, Lyyds/ᛶᲁᛵᛲ;->ᲇᲈᛵᛷ(Ljava/lang/String;CII)I

    .line 820
    .line 821
    .line 822
    move-result v6

    .line 823
    add-int/lit8 v1, v1, 0x1

    .line 824
    .line 825
    const/16 v4, 0x50

    .line 826
    .line 827
    invoke-static {v1, v6, v4, v2, v5}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    invoke-static {v1}, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 832
    .line 833
    .line 834
    move-result-object v1

    .line 835
    iput-object v1, v0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 836
    .line 837
    move v1, v6

    .line 838
    :cond_2d
    if-ge v1, v10, :cond_2e

    .line 839
    .line 840
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 841
    .line 842
    .line 843
    move-result v4

    .line 844
    const/16 v5, 0x23

    .line 845
    .line 846
    if-ne v4, v5, :cond_2e

    .line 847
    .line 848
    const/16 v18, 0x1

    .line 849
    .line 850
    add-int/lit8 v1, v1, 0x1

    .line 851
    .line 852
    const/16 v4, 0x30

    .line 853
    .line 854
    invoke-static {v1, v10, v4, v2, v3}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v1

    .line 858
    iput-object v1, v0, Lyyds/ᛱᛲᛴᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 859
    .line 860
    :cond_2e
    return-void

    .line 861
    :cond_2f
    invoke-virtual {v2, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    new-instance v1, Ljava/lang/StringBuilder;

    .line 866
    .line 867
    const-string v2, "Invalid URL host: \""

    .line 868
    .line 869
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 873
    .line 874
    .line 875
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 876
    .line 877
    .line 878
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 883
    .line 884
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    throw v1

    .line 892
    :cond_30
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 893
    .line 894
    .line 895
    move-result v0

    .line 896
    const/4 v1, 0x6

    .line 897
    if-le v0, v1, :cond_31

    .line 898
    .line 899
    invoke-static {v1, v2}, Lyyds/ᛲᲇᛸᲇ;->ᛱᲀᲈᛲ(ILjava/lang/String;)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    const-string v1, "..."

    .line 904
    .line 905
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    goto :goto_19

    .line 910
    :cond_31
    move-object v0, v2

    .line 911
    :goto_19
    const-string v1, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "

    .line 912
    .line 913
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 918
    .line 919
    .line 920
    return-void
.end method
