.class public final L۟/ac$b;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/ac;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "L\u06df/ac$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic ۥ۟۟:I


# instance fields
.field public final ۥ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u06df/j3;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟:L۟/ac;


# direct methods
.method public constructor <init>(L۟/ac;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "L\u06df/j3;",
            ">;)V"
        }
    .end annotation

    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, L۟/ac$b;->ۥ۟:L۟/ac;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p2, p0, L۟/ac$b;->ۥ:Ljava/util/List;

    return-void

    :array_0
    .array-data 1
        -0x15t
        0x13t
        0x7et
        0x29t
        0x5at
        0x31t
        -0xdt
        0x1bt
    .end array-data

    :array_1
    .array-data 1
        -0x79t
        0x7at
        0xdt
        0x5dt
        0x1et
        0x50t
    .end array-data
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, L۟/ac$b;->ۥ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 10

    .line 1
    check-cast p1, L۟/ac$c;

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    new-array v1, v0, [B

    .line 5
    .line 6
    fill-array-data v1, :array_0

    .line 7
    .line 8
    .line 9
    new-array v2, v0, [B

    .line 10
    .line 11
    fill-array-data v2, :array_1

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, L۟/ac$b;->ۥ:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, L۟/j3;

    .line 28
    .line 29
    iget-object v1, p0, L۟/ac$b;->ۥ۟:L۟/ac;

    .line 30
    .line 31
    iget-object v2, p2, L۟/j3;->ۥ۟ۡ:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2}, L۟/ta;->ۥ۠ۦ(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v3, 0x1

    .line 38
    xor-int/2addr v2, v3

    .line 39
    const/4 v4, 0x0

    .line 40
    const/16 v5, 0xb

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    iget-object v2, p1, L۟/ac$c;->ۥ:Landroid/widget/ImageView;

    .line 45
    .line 46
    new-array v6, v5, [B

    .line 47
    .line 48
    fill-array-data v6, :array_2

    .line 49
    .line 50
    .line 51
    new-array v7, v0, [B

    .line 52
    .line 53
    fill-array-data v7, :array_3

    .line 54
    .line 55
    .line 56
    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    new-array v3, v3, [Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v7, p2, L۟/j3;->ۥ۟ۡ:Ljava/lang/String;

    .line 63
    .line 64
    aput-object v7, v3, v4

    .line 65
    .line 66
    invoke-static {v2, v6, v3}, L۟/r3;->ۥ(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    iget-object v2, p1, L۟/ac$c;->ۥ:Landroid/widget/ImageView;

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    iget-object v2, p1, L۟/ac$c;->ۥ۟۠:Landroid/widget/TextView;

    .line 77
    .line 78
    iget-object v3, p2, L۟/j3;->ۥ۟۠:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    iget-object v2, p1, L۟/ac$c;->ۥ۟:Landroid/widget/TextView;

    .line 84
    .line 85
    iget-object v3, p2, L۟/j3;->ۥ۟ۢ:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    new-instance v2, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    iget-object v3, p2, L۟/j3;->ۥۣ۟:Ljava/lang/String;

    .line 96
    .line 97
    new-instance v6, L۟/cc;

    .line 98
    .line 99
    invoke-direct {v6, v2}, L۟/cc;-><init>(Ljava/lang/StringBuilder;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v3, v6}, L۟/r2;->ۥ۟(Ljava/lang/String;L۟/g3;)V

    .line 103
    .line 104
    .line 105
    iget-object v3, p2, L۟/j3;->ۥ۟ۤ:Ljava/lang/String;

    .line 106
    .line 107
    new-instance v6, L۟/dc;

    .line 108
    .line 109
    invoke-direct {v6, v2}, L۟/dc;-><init>(Ljava/lang/StringBuilder;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v3, v6}, L۟/r2;->ۥ۟(Ljava/lang/String;L۟/g3;)V

    .line 113
    .line 114
    .line 115
    sget v3, L۟/o;->ۥ:I

    .line 116
    .line 117
    iget-wide v6, p2, L۟/j3;->ۥ۟ۦ:J

    .line 118
    .line 119
    new-instance v3, Ljava/text/SimpleDateFormat;

    .line 120
    .line 121
    const/16 v8, 0x10

    .line 122
    .line 123
    new-array v8, v8, [B

    .line 124
    .line 125
    fill-array-data v8, :array_4

    .line 126
    .line 127
    .line 128
    new-array v9, v0, [B

    .line 129
    .line 130
    fill-array-data v9, :array_5

    .line 131
    .line 132
    .line 133
    invoke-static {v8, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-direct {v3, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-virtual {v3, v6}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    new-array v5, v5, [B

    .line 149
    .line 150
    fill-array-data v5, :array_6

    .line 151
    .line 152
    .line 153
    new-array v6, v0, [B

    .line 154
    .line 155
    fill-array-data v6, :array_7

    .line 156
    .line 157
    .line 158
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-static {v5, v3}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    new-instance v5, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    const-string v6, "<br>"

    .line 171
    .line 172
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    iget-object v3, p1, L۟/ac$c;->ۥ۟۟:Landroid/widget/TextView;

    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    const/16 v5, 0xd

    .line 192
    .line 193
    new-array v5, v5, [B

    .line 194
    .line 195
    fill-array-data v5, :array_8

    .line 196
    .line 197
    .line 198
    new-array v0, v0, [B

    .line 199
    .line 200
    fill-array-data v0, :array_9

    .line 201
    .line 202
    .line 203
    invoke-static {v5, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-static {v0, v2}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v2}, L۟/o;->ۥ۠۠(Ljava/lang/String;)Landroid/text/Spanned;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    .line 216
    .line 217
    iget-boolean v0, v1, L۟/ac;->ۥۣۡ:Z

    .line 218
    .line 219
    if-eqz v0, :cond_1

    .line 220
    .line 221
    iget-object v0, p1, L۟/ac$c;->ۥ۟ۡ:L۟/h8;

    .line 222
    .line 223
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 224
    .line 225
    .line 226
    iget-object v0, p1, L۟/ac$c;->ۥ۟ۡ:L۟/h8;

    .line 227
    .line 228
    iget-boolean v2, p2, L۟/j3;->ۥ:Z

    .line 229
    .line 230
    invoke-virtual {v0, v2}, L۟/h8;->ۥ(Z)V

    .line 231
    .line 232
    .line 233
    iget-object v0, p1, L۟/ac$c;->ۥ۟ۡ:L۟/h8;

    .line 234
    .line 235
    new-instance v2, L۟/w;

    .line 236
    .line 237
    invoke-direct {v2, p2}, L۟/w;-><init>(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v2}, L۟/h8;->setOnCheckedChangeListener(L۟/h8$d;)V

    .line 241
    .line 242
    .line 243
    goto :goto_1

    .line 244
    :cond_1
    iget-object v0, p1, L۟/ac$c;->ۥ۟ۡ:L۟/h8;

    .line 245
    .line 246
    const/16 v2, 0x8

    .line 247
    .line 248
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 249
    .line 250
    .line 251
    :goto_1
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 252
    .line 253
    new-instance v2, L۟/bc;

    .line 254
    .line 255
    invoke-direct {v2, v1, p1, p2}, L۟/bc;-><init>(L۟/ac;L۟/ac$c;L۟/j3;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    nop

    .line 263
    :array_0
    .array-data 1
        0x5et
        0x7t
        -0x14t
        0x2t
        0x7bt
        0x39t
    .end array-data

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    nop

    .line 271
    :array_1
    .array-data 1
        0x36t
        0x68t
        -0x80t
        0x66t
        0x1et
        0x4bt
    .end array-data

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    nop

    .line 279
    :array_2
    .array-data 1
        0x5t
        -0xdt
        0x6ct
        0x0t
        0x56t
        0x42t
        0x11t
        -0xdt
        0x4dt
        0x3bt
        0x57t
    .end array-data

    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    :array_3
    .array-data 1
        0x76t
        -0x6at
        0x18t
        0x49t
        0x3bt
        0x23t
    .end array-data

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    nop

    .line 297
    :array_4
    .array-data 1
        0x15t
        -0x40t
        0x13t
        0x7et
        -0x3ct
        0x5ft
        0x21t
        -0x6ct
        0xet
        0x63t
        -0x37t
        0x5at
        0x24t
        -0x7dt
        0x7t
        0x6at
    .end array-data

    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    :array_5
    .array-data 1
        0x6ct
        -0x47t
        0x6at
        0x7t
        -0x17t
        0x12t
    .end array-data

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    nop

    .line 317
    :array_6
    .array-data 1
        0x5dt
        0x18t
        -0x73t
        0x77t
        0x36t
        -0x78t
        0x13t
        0x59t
        -0x2ft
        0x34t
        0x7et
    .end array-data

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    :array_7
    .array-data 1
        0x3bt
        0x77t
        -0x1t
        0x1at
        0x57t
        -0x4t
    .end array-data

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    nop

    .line 335
    :array_8
    .array-data 1
        0x6ft
        0x28t
        -0x50t
        0x55t
        -0x60t
        -0x3t
        0x75t
        0x20t
        -0x35t
        0xft
        -0x4t
        -0x46t
        0x32t
    .end array-data

    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    nop

    .line 347
    :array_9
    .array-data 1
        0x1bt
        0x47t
        -0x1dt
        0x21t
        -0x2et
        -0x6ct
    .end array-data
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 13

    .line 1
    const/4 p2, 0x6

    .line 2
    new-array v0, p2, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    new-array v1, p2, [B

    .line 8
    .line 9
    fill-array-data v1, :array_1

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Landroid/widget/RelativeLayout;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    const/4 v2, -0x1

    .line 31
    const/4 v3, -0x2

    .line 32
    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 36
    .line 37
    .line 38
    sget v1, L۟/ya;->ۥ۠ۢ:I

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-virtual {v0, v4, v1, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 42
    .line 43
    .line 44
    sget-object v5, L۟/k8;->ۥۣ۟:L۟/k;

    .line 45
    .line 46
    iget-object v5, v5, L۟/k;->ۥۤۧ:Ljava/lang/String;

    .line 47
    .line 48
    const/16 v6, 0xe

    .line 49
    .line 50
    new-array v6, v6, [B

    .line 51
    .line 52
    fill-array-data v6, :array_2

    .line 53
    .line 54
    .line 55
    new-array v7, p2, [B

    .line 56
    .line 57
    fill-array-data v7, :array_3

    .line 58
    .line 59
    .line 60
    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-static {v6, v5}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const/4 v6, 0x1

    .line 68
    new-array v7, v6, [Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    aput-object v8, v7, v4

    .line 75
    .line 76
    invoke-static {v5, v7}, L۟/r3;->ۥ۠ۦ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-eqz v5, :cond_0

    .line 81
    .line 82
    const/4 v7, 0x5

    .line 83
    new-array v7, v7, [B

    .line 84
    .line 85
    fill-array-data v7, :array_4

    .line 86
    .line 87
    .line 88
    new-array v8, p2, [B

    .line 89
    .line 90
    fill-array-data v8, :array_5

    .line 91
    .line 92
    .line 93
    invoke-static {v7, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    new-array v8, v6, [Ljava/lang/Object;

    .line 98
    .line 99
    sget v9, L۟/ac;->ۥۡۤ:I

    .line 100
    .line 101
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    aput-object v9, v8, v4

    .line 106
    .line 107
    invoke-static {v5, v7, v8}, L۟/r3;->ۥ(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    :cond_0
    const/16 v7, 0x36

    .line 111
    .line 112
    new-array v7, v7, [B

    .line 113
    .line 114
    fill-array-data v7, :array_6

    .line 115
    .line 116
    .line 117
    new-array v8, p2, [B

    .line 118
    .line 119
    fill-array-data v8, :array_7

    .line 120
    .line 121
    .line 122
    invoke-static {v7, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    invoke-static {v7, v5}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    check-cast v5, Landroid/view/View;

    .line 130
    .line 131
    new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;

    .line 132
    .line 133
    const/high16 v8, 0x42c80000    # 100.0f

    .line 134
    .line 135
    invoke-static {v6, v8}, L۟/c4;->ۥۣ۟(IF)F

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    float-to-int v9, v9

    .line 140
    invoke-static {v6, v8}, L۟/c4;->ۥۣ۟(IF)F

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    float-to-int v8, v8

    .line 145
    invoke-direct {v7, v9, v8}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 146
    .line 147
    .line 148
    const/16 v8, 0x9

    .line 149
    .line 150
    invoke-virtual {v7, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 151
    .line 152
    .line 153
    const/16 v8, 0xa

    .line 154
    .line 155
    invoke-virtual {v7, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 156
    .line 157
    .line 158
    sget v9, L۟/ya;->ۥۣ۠:I

    .line 159
    .line 160
    invoke-virtual {v7, v1, v9, v1, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 164
    .line 165
    .line 166
    new-instance v5, Landroid/widget/TextView;

    .line 167
    .line 168
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-direct {v5, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 173
    .line 174
    .line 175
    sget v7, L۟/ac;->ۥۡۤ:I

    .line 176
    .line 177
    const/16 v7, 0x666

    .line 178
    .line 179
    invoke-virtual {v5, v7}, Landroid/view/View;->setId(I)V

    .line 180
    .line 181
    .line 182
    const/high16 v10, 0x41700000    # 15.0f

    .line 183
    .line 184
    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 185
    .line 186
    .line 187
    const/high16 v10, -0x1000000

    .line 188
    .line 189
    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 190
    .line 191
    .line 192
    new-instance v10, Landroid/widget/RelativeLayout$LayoutParams;

    .line 193
    .line 194
    invoke-direct {v10, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v10, v6, p2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v10, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 204
    .line 205
    .line 206
    const v2, 0x800003

    .line 207
    .line 208
    .line 209
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 210
    .line 211
    .line 212
    const/4 v2, 0x3

    .line 213
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v5, v4, v9, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 220
    .line 221
    .line 222
    new-instance v5, Landroid/widget/TextView;

    .line 223
    .line 224
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    invoke-direct {v5, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 229
    .line 230
    .line 231
    const/16 v8, 0x667

    .line 232
    .line 233
    invoke-virtual {v5, v8}, Landroid/view/View;->setId(I)V

    .line 234
    .line 235
    .line 236
    const/high16 v10, 0x41400000    # 12.0f

    .line 237
    .line 238
    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 239
    .line 240
    .line 241
    const v11, -0x777778

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 245
    .line 246
    .line 247
    new-instance v12, Landroid/widget/RelativeLayout$LayoutParams;

    .line 248
    .line 249
    invoke-direct {v12, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v6, p2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12, v2, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v5, v4, v1, v9, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 265
    .line 266
    .line 267
    new-instance v5, Landroid/widget/TextView;

    .line 268
    .line 269
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    invoke-direct {v5, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 274
    .line 275
    .line 276
    const/16 v7, 0x66

    .line 277
    .line 278
    invoke-virtual {v5, v7}, Landroid/view/View;->setId(I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 285
    .line 286
    .line 287
    new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;

    .line 288
    .line 289
    invoke-direct {v7, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v7, v6, p2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v7, v2, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v5, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 299
    .line 300
    .line 301
    const/4 p2, 0x4

    .line 302
    invoke-virtual {v5, p2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v5, v4, v9, v9, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 309
    .line 310
    .line 311
    new-instance p2, L۟/h8;

    .line 312
    .line 313
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-direct {p2, p1}, L۟/h8;-><init>(Landroid/content/Context;)V

    .line 318
    .line 319
    .line 320
    const/16 p1, 0x6666

    .line 321
    .line 322
    invoke-virtual {p2, p1}, Landroid/view/View;->setId(I)V

    .line 323
    .line 324
    .line 325
    const/16 p1, 0x8

    .line 326
    .line 327
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 328
    .line 329
    .line 330
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 331
    .line 332
    invoke-direct {p1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 333
    .line 334
    .line 335
    const/16 v2, 0xb

    .line 336
    .line 337
    invoke-virtual {p1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 338
    .line 339
    .line 340
    const/16 v2, 0xf

    .line 341
    .line 342
    invoke-virtual {p1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {p1, v4, v4, v1, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 352
    .line 353
    .line 354
    new-instance p1, L۟/ac$c;

    .line 355
    .line 356
    invoke-direct {p1, v0}, L۟/ac$c;-><init>(Landroid/widget/RelativeLayout;)V

    .line 357
    .line 358
    .line 359
    return-object p1

    .line 360
    nop

    .line 361
    :array_0
    .array-data 1
        -0x47t
        -0x54t
        0x40t
        -0x59t
        0x26t
        0x79t
    .end array-data

    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    nop

    .line 369
    :array_1
    .array-data 1
        -0x37t
        -0x33t
        0x32t
        -0x3et
        0x48t
        0xdt
    .end array-data

    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    nop

    .line 377
    :array_2
    .array-data 1
        0x18t
        -0x55t
        0x46t
        -0x5dt
        0x1ft
        -0x2dt
        0x25t
        -0x5ct
        0x66t
        -0x55t
        0x9t
        -0x9t
        0x2ct
        -0x7ft
    .end array-data

    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    nop

    .line 389
    :array_3
    .array-data 1
        0x40t
        -0xet
        0xft
        -0x32t
        0x7et
        -0x4ct
    .end array-data

    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    nop

    .line 397
    :array_4
    .array-data 1
        -0x2dt
        -0x2at
        -0x19t
        -0x1dt
        -0x29t
    .end array-data

    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    nop

    .line 405
    :array_5
    .array-data 1
        -0x60t
        -0x4dt
        -0x6dt
        -0x56t
        -0x4dt
        -0x17t
    .end array-data

    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    nop

    .line 413
    :array_6
    .array-data 1
        0x49t
        -0x5bt
        0x7ct
        0x1bt
        -0xbt
        -0x11t
        0x46t
        -0x42t
        0x7et
        0x18t
        -0x5ft
        -0x54t
        0x45t
        -0x4bt
        0x30t
        0x14t
        -0x4ct
        -0x1t
        0x53t
        -0x10t
        0x64t
        0x18t
        -0xbt
        -0x1et
        0x48t
        -0x42t
        0x3dt
        0x19t
        -0x60t
        -0x20t
        0x4bt
        -0x10t
        0x64t
        0xet
        -0x5bt
        -0x17t
        0x7t
        -0x4ft
        0x7et
        0x13t
        -0x59t
        -0x1dt
        0x4et
        -0x4ct
        0x3et
        0x1t
        -0x44t
        -0x17t
        0x50t
        -0x2t
        0x46t
        0x1et
        -0x50t
        -0x5t
    .end array-data

    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    nop

    .line 445
    :array_7
    .array-data 1
        0x27t
        -0x30t
        0x10t
        0x77t
        -0x2bt
        -0x74t
    .end array-data
.end method

.method public final ۥ()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "L\u06df/j3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, L۟/ac$b;->ۥ:Ljava/util/List;

    return-object v0
.end method
