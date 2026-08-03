.class public final L۟/n1;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/n1$a;,
        L۟/n1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "L\u06df/n1$b;",
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
            "L\u06df/p0;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟:L۟/f3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u06df/f3<",
            "L\u06df/vb;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "L\u06df/p0;",
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

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, L۟/n1;->ۥ:Ljava/util/List;

    return-void

    :array_0
    .array-data 1
        -0x5t
        -0x41t
        0x41t
        0x5dt
        -0x36t
        0x2ct
        -0x1dt
        -0x49t
    .end array-data

    :array_1
    .array-data 1
        -0x69t
        -0x2at
        0x32t
        0x29t
        -0x72t
        0x4dt
    .end array-data
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, L۟/n1;->ۥ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItemViewType(I)I
    .locals 1

    .line 1
    iget-object v0, p0, L۟/n1;->ۥ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, L۟/p0;

    .line 8
    .line 9
    iget-boolean v0, p1, L۟/p0;->ۥ۠:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p1, L۟/p0;->ۥ۟ۢ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x3

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-boolean p1, p1, L۟/p0;->ۥۣ۟:Z

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const/4 p1, 0x1

    .line 32
    :goto_0
    return p1
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 4

    .line 1
    check-cast p1, L۟/n1$b;

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
    new-array v0, v0, [B

    .line 10
    .line 11
    fill-array-data v0, :array_1

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, L۟/n1;->ۥ:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, L۟/p0;

    .line 28
    .line 29
    iget-object v0, p1, L۟/n1$b;->ۥ:Landroid/widget/TextView;

    .line 30
    .line 31
    iget-object v1, p2, L۟/p0;->ۥ۟۟:Ljava/lang/CharSequence;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p2, L۟/p0;->ۥ۟ۧ:Ljava/lang/Boolean;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v0, p1, L۟/n1$b;->ۥ۟:L۟/h8;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p1, L۟/n1$b;->ۥ۟:L۟/h8;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-virtual {v0, v2}, L۟/h8;->setOnCheckedChangeListener(L۟/h8$d;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p1, L۟/n1$b;->ۥ۟:L۟/h8;

    .line 53
    .line 54
    iget-object v2, p2, L۟/p0;->ۥ۟ۧ:Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-static {v2}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {v0, v2}, L۟/h8;->ۥ(Z)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p1, L۟/n1$b;->ۥ۟:L۟/h8;

    .line 67
    .line 68
    new-instance v2, L۟/y;

    .line 69
    .line 70
    const/4 v3, 0x1

    .line 71
    invoke-direct {v2, p2, p0, v3}, L۟/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v2}, L۟/h8;->setOnCheckedChangeListener(L۟/h8$d;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 78
    .line 79
    new-instance v2, L۟/m1;

    .line 80
    .line 81
    invoke-direct {v2, p1, p2, v1}, L۟/m1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    iget-object p1, p1, L۟/n1$b;->ۥ۟:L۟/h8;

    .line 89
    .line 90
    const/16 p2, 0x8

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    :goto_0
    return-void

    .line 96
    nop

    .line 97
    :array_0
    .array-data 1
        0x37t
        0x7et
        -0x5ct
        0x3ct
        -0x6dt
        -0x42t
    .end array-data

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    nop

    .line 105
    :array_1
    .array-data 1
        0x5ft
        0x11t
        -0x38t
        0x58t
        -0xat
        -0x34t
    .end array-data
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 12

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    new-array v2, v0, [B

    .line 8
    .line 9
    fill-array-data v2, :array_1

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    const/4 v2, 0x4

    .line 21
    if-ne p2, v2, :cond_0

    .line 22
    .line 23
    new-instance p2, Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p2, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 33
    .line 34
    sget v2, L۟/ya;->ۥ۟ۥ:I

    .line 35
    .line 36
    invoke-direct {p1, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x7

    .line 43
    new-array p1, p1, [B

    .line 44
    .line 45
    fill-array-data p1, :array_2

    .line 46
    .line 47
    .line 48
    new-array v0, v0, [B

    .line 49
    .line 50
    fill-array-data v0, :array_3

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 62
    .line 63
    .line 64
    new-instance p1, L۟/n1$b;

    .line 65
    .line 66
    invoke-direct {p1, p2}, L۟/n1$b;-><init>(Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :cond_0
    new-instance v2, Landroid/widget/RelativeLayout;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-direct {v2, v3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 81
    .line 82
    const/4 v4, -0x2

    .line 83
    invoke-direct {v3, v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 87
    .line 88
    .line 89
    sget v3, L۟/ya;->ۥ۟ۥ:I

    .line 90
    .line 91
    sget v5, L۟/ya;->ۥ۟ۤ:I

    .line 92
    .line 93
    invoke-virtual {v2, v3, v5, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 94
    .line 95
    .line 96
    new-instance v6, Landroid/graphics/drawable/StateListDrawable;

    .line 97
    .line 98
    invoke-direct {v6}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 99
    .line 100
    .line 101
    new-instance v7, Landroid/graphics/drawable/ColorDrawable;

    .line 102
    .line 103
    invoke-direct {v7, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 104
    .line 105
    .line 106
    new-instance v8, Landroid/graphics/drawable/ColorDrawable;

    .line 107
    .line 108
    invoke-static {v1}, L۟/tb;->ۥ(I)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-direct {v8, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 113
    .line 114
    .line 115
    const/4 v1, 0x1

    .line 116
    new-array v9, v1, [I

    .line 117
    .line 118
    const v10, 0x10100a7

    .line 119
    .line 120
    .line 121
    const/4 v11, 0x0

    .line 122
    aput v10, v9, v11

    .line 123
    .line 124
    invoke-virtual {v6, v9, v8}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 125
    .line 126
    .line 127
    new-array v1, v1, [I

    .line 128
    .line 129
    const v8, -0x10100a7

    .line 130
    .line 131
    .line 132
    aput v8, v1, v11

    .line 133
    .line 134
    invoke-virtual {v6, v1, v7}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 138
    .line 139
    .line 140
    new-instance v1, Landroid/widget/TextView;

    .line 141
    .line 142
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-direct {v1, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 150
    .line 151
    .line 152
    const v0, -0xbbbbbc

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 156
    .line 157
    .line 158
    sget v0, L۟/ya;->ۥ۟ۦ:F

    .line 159
    .line 160
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 161
    .line 162
    .line 163
    const/16 v0, 0x10

    .line 164
    .line 165
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 166
    .line 167
    .line 168
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 169
    .line 170
    sget v6, L۟/ya;->ۥ۠:I

    .line 171
    .line 172
    invoke-direct {v0, v4, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 173
    .line 174
    .line 175
    const/16 v4, 0x9

    .line 176
    .line 177
    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 184
    .line 185
    .line 186
    new-instance v0, L۟/h8;

    .line 187
    .line 188
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-direct {v0, p1}, L۟/h8;-><init>(Landroid/content/Context;)V

    .line 193
    .line 194
    .line 195
    const/16 p1, 0x666

    .line 196
    .line 197
    invoke-virtual {v0, p1}, Landroid/view/View;->setId(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v11}, L۟/h8;->setCircle(Z)V

    .line 201
    .line 202
    .line 203
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 204
    .line 205
    const/high16 v4, 0x41a00000    # 20.0f

    .line 206
    .line 207
    invoke-static {v4}, L۟/tb;->ۥ۟۠(F)I

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    invoke-static {v4}, L۟/tb;->ۥ۟۠(F)I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    invoke-direct {p1, v6, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 216
    .line 217
    .line 218
    const/16 v4, 0xb

    .line 219
    .line 220
    invoke-virtual {p1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 221
    .line 222
    .line 223
    sget v4, L۟/ya;->ۥۣ۠:I

    .line 224
    .line 225
    sget v6, L۟/ya;->ۥ۠ۢ:I

    .line 226
    .line 227
    invoke-virtual {p1, v11, v4, v6, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 234
    .line 235
    .line 236
    const/4 p1, 0x2

    .line 237
    if-ne p2, p1, :cond_1

    .line 238
    .line 239
    const/high16 p2, 0x41500000    # 13.0f

    .line 240
    .line 241
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 242
    .line 243
    .line 244
    sget p2, L۟/ya;->ۥ۠ۡ:I

    .line 245
    .line 246
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 247
    .line 248
    .line 249
    div-int/2addr v5, p1

    .line 250
    invoke-virtual {v2, v3, v5, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 251
    .line 252
    .line 253
    :cond_1
    new-instance p1, L۟/n1$b;

    .line 254
    .line 255
    invoke-direct {p1, v2}, L۟/n1$b;-><init>(Landroid/view/View;)V

    .line 256
    .line 257
    .line 258
    :goto_0
    return-object p1

    .line 259
    :array_0
    .array-data 1
        -0x41t
        0x38t
        -0x77t
        0x58t
        -0x3at
        0x12t
    .end array-data

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    nop

    .line 267
    :array_1
    .array-data 1
        -0x31t
        0x59t
        -0x5t
        0x3dt
        -0x58t
        0x66t
    .end array-data

    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    nop

    .line 275
    :array_2
    .array-data 1
        0x3bt
        0x4bt
        -0x74t
        -0x15t
        -0x46t
        0x4ct
        0x5dt
    .end array-data

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    :array_3
    .array-data 1
        0x18t
        0xet
        -0x37t
        -0x52t
        -0x1t
        0x9t
    .end array-data
.end method

.method public final ۥ(L۟/d0$a;)V
    .locals 0

    iput-object p1, p0, L۟/n1;->ۥ۟:L۟/f3;

    return-void
.end method
