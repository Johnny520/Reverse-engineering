.class final Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final Θ:Lym1;

.field public static final Ι:Lym1;


# instance fields
.field public final Α:Landroid/widget/SeekBar;

.field public final Β:Landroid/widget/TextView;

.field public final Γ:Landroid/widget/TextView;

.field public final Δ:Landroid/widget/TextView;

.field public final Ε:Landroid/widget/LinearLayout;

.field public final Ζ:Landroid/widget/TextView;

.field public final Η:Landroid/widget/LinearLayout;

.field public final ε:Z

.field public final ζ:Lxx;

.field public η:I

.field public final θ:[F

.field public ι:I

.field public κ:Z

.field public λ:Lfi;

.field public μ:Z

.field public ν:Z

.field public final ξ:Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;

.field public final ο:Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;

.field public final π:Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;

.field public final ρ:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;

.field public final σ:Ljava/util/ArrayList;

.field public final τ:Landroid/widget/TextView;

.field public final υ:Landroid/widget/TextView;

.field public final φ:Landroid/widget/EditText;

.field public final χ:Landroid/widget/TextView;

.field public final ψ:Landroid/widget/SeekBar;

.field public final ω:Landroid/widget/SeekBar;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lym1;

    .line 2
    .line 3
    const-string v1, "^#[0-9A-Fa-f]{6}$"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lym1;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Θ:Lym1;

    .line 9
    .line 10
    new-instance v0, Lym1;

    .line 11
    .line 12
    const-string v1, "^#[0-9A-Fa-f]{8}$"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lym1;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Ι:Lym1;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IZLxx;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-direct/range {p0 .. p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-boolean v3, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ε:Z

    .line 18
    .line 19
    iput-object v4, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ:Lxx;

    .line 20
    .line 21
    iput v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 22
    .line 23
    const/4 v5, 0x3

    .line 24
    new-array v6, v5, [F

    .line 25
    .line 26
    iput-object v6, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->θ:[F

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/16 v7, 0xff

    .line 36
    .line 37
    :goto_0
    iput v7, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ι:I

    .line 38
    .line 39
    const/4 v7, 0x1

    .line 40
    iput-boolean v7, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->κ:Z

    .line 41
    .line 42
    new-instance v8, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;

    .line 43
    .line 44
    invoke-direct {v8, v1, v4}, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;-><init>(Landroid/content/Context;Lxx;)V

    .line 45
    .line 46
    .line 47
    iput-object v8, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ξ:Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;

    .line 48
    .line 49
    new-instance v9, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;

    .line 50
    .line 51
    invoke-direct {v9, v1, v4}, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;-><init>(Landroid/content/Context;Lxx;)V

    .line 52
    .line 53
    .line 54
    iput-object v9, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ο:Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;

    .line 55
    .line 56
    new-instance v10, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;

    .line 57
    .line 58
    invoke-direct {v10, v1, v4}, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;-><init>(Landroid/content/Context;Lxx;)V

    .line 59
    .line 60
    .line 61
    iput-object v10, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->π:Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;

    .line 62
    .line 63
    new-instance v11, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;

    .line 64
    .line 65
    invoke-direct {v11, v1, v2, v4}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;-><init>(Landroid/content/Context;ILxx;)V

    .line 66
    .line 67
    .line 68
    new-instance v12, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;

    .line 69
    .line 70
    invoke-direct {v12, v1, v2, v4}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;-><init>(Landroid/content/Context;ILxx;)V

    .line 71
    .line 72
    .line 73
    iput-object v12, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ρ:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;

    .line 74
    .line 75
    new-instance v13, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v13, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->σ:Ljava/util/ArrayList;

    .line 81
    .line 82
    const/high16 v13, -0x1000000

    .line 83
    .line 84
    or-int/2addr v2, v13

    .line 85
    invoke-static {v2, v6}, Landroid/graphics/Color;->colorToHSV(I[F)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 89
    .line 90
    .line 91
    const/16 v2, 0xe

    .line 92
    .line 93
    invoke-static {v1, v2}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    const/16 v13, 0xc

    .line 98
    .line 99
    invoke-static {v1, v13}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    invoke-static {v1, v2}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    const/4 v15, 0x4

    .line 108
    invoke-static {v1, v15}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 109
    .line 110
    .line 111
    move-result v15

    .line 112
    invoke-virtual {v0, v6, v14, v2, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {p0 .. p1}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    const-string v6, "\u989c\u8272"

    .line 120
    .line 121
    invoke-virtual {v0, v1, v6}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ι(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 126
    .line 127
    .line 128
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 129
    .line 130
    const/16 v14, 0xc4

    .line 131
    .line 132
    invoke-static {v1, v14}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 133
    .line 134
    .line 135
    move-result v14

    .line 136
    const/4 v15, -0x1

    .line 137
    invoke-direct {v6, v15, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 138
    .line 139
    .line 140
    const/16 v14, 0xa

    .line 141
    .line 142
    invoke-static {v1, v14}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    iput v5, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 147
    .line 148
    invoke-static {v1, v13}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    iput v5, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 153
    .line 154
    invoke-virtual {v8, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {p0 .. p1}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->κ(Landroid/content/Context;)Landroid/widget/TextView;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    iput-object v5, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->τ:Landroid/widget/TextView;

    .line 165
    .line 166
    const-string v6, "\u8272\u76f8"

    .line 167
    .line 168
    invoke-virtual {v0, v1, v6, v5}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->δ(Landroid/content/Context;Ljava/lang/String;Landroid/widget/TextView;)Landroid/widget/LinearLayout;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 173
    .line 174
    .line 175
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 176
    .line 177
    const/16 v6, 0x24

    .line 178
    .line 179
    invoke-static {v1, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    invoke-direct {v5, v15, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 184
    .line 185
    .line 186
    const/4 v8, 0x5

    .line 187
    invoke-static {v1, v8}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    iput v7, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 192
    .line 193
    invoke-virtual {v9, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 197
    .line 198
    .line 199
    const/4 v5, -0x2

    .line 200
    if-eqz v3, :cond_1

    .line 201
    .line 202
    invoke-virtual/range {p0 .. p1}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->κ(Landroid/content/Context;)Landroid/widget/TextView;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    iput-object v7, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->υ:Landroid/widget/TextView;

    .line 207
    .line 208
    const-string v9, "\u900f\u660e\u5ea6"

    .line 209
    .line 210
    invoke-virtual {v0, v1, v9, v7}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->δ(Landroid/content/Context;Ljava/lang/String;Landroid/widget/TextView;)Landroid/widget/LinearLayout;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 215
    .line 216
    invoke-direct {v9, v15, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 217
    .line 218
    .line 219
    invoke-static {v1, v14}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 220
    .line 221
    .line 222
    move-result v13

    .line 223
    iput v13, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 224
    .line 225
    invoke-virtual {v2, v7, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 226
    .line 227
    .line 228
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 229
    .line 230
    invoke-static {v1, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    invoke-direct {v7, v15, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 235
    .line 236
    .line 237
    invoke-static {v1, v8}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 238
    .line 239
    .line 240
    move-result v6

    .line 241
    iput v6, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 242
    .line 243
    invoke-virtual {v10, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 247
    .line 248
    .line 249
    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {p0 .. p1}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    const-string v6, "\u989c\u8272\u9884\u89c8"

    .line 257
    .line 258
    invoke-virtual {v0, v1, v6}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ι(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 263
    .line 264
    .line 265
    new-instance v6, Landroid/widget/LinearLayout;

    .line 266
    .line 267
    invoke-direct {v6, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 268
    .line 269
    .line 270
    const/4 v7, 0x0

    .line 271
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 272
    .line 273
    .line 274
    const-string v9, "\u539f\u8272"

    .line 275
    .line 276
    invoke-virtual {v0, v1, v9, v11}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->β(Landroid/content/Context;Ljava/lang/String;Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;)Landroid/widget/LinearLayout;

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 281
    .line 282
    const/high16 v11, 0x3f800000    # 1.0f

    .line 283
    .line 284
    invoke-direct {v10, v7, v5, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 285
    .line 286
    .line 287
    invoke-static {v1, v8}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 288
    .line 289
    .line 290
    move-result v13

    .line 291
    iput v13, v10, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 292
    .line 293
    invoke-virtual {v6, v9, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 294
    .line 295
    .line 296
    const-string v9, "\u5f53\u524d"

    .line 297
    .line 298
    invoke-virtual {v0, v1, v9, v12}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->β(Landroid/content/Context;Ljava/lang/String;Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;)Landroid/widget/LinearLayout;

    .line 299
    .line 300
    .line 301
    move-result-object v9

    .line 302
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 303
    .line 304
    invoke-direct {v10, v7, v5, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 305
    .line 306
    .line 307
    invoke-static {v1, v8}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 308
    .line 309
    .line 310
    move-result v12

    .line 311
    iput v12, v10, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 312
    .line 313
    invoke-virtual {v6, v9, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 314
    .line 315
    .line 316
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 317
    .line 318
    invoke-direct {v9, v15, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 319
    .line 320
    .line 321
    const/16 v10, 0x8

    .line 322
    .line 323
    invoke-static {v1, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 324
    .line 325
    .line 326
    move-result v12

    .line 327
    iput v12, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 328
    .line 329
    invoke-virtual {v2, v6, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 330
    .line 331
    .line 332
    new-instance v6, Landroid/widget/TextView;

    .line 333
    .line 334
    invoke-direct {v6, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 335
    .line 336
    .line 337
    const-string v9, "\u989c\u8272\u4ee3\u7801"

    .line 338
    .line 339
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 340
    .line 341
    .line 342
    const/high16 v9, 0x41300000    # 11.0f

    .line 343
    .line 344
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 348
    .line 349
    .line 350
    iget-object v9, v4, Lxx;->η:Ljava/lang/String;

    .line 351
    .line 352
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 353
    .line 354
    .line 355
    move-result v9

    .line 356
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 357
    .line 358
    .line 359
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 360
    .line 361
    invoke-direct {v9, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 362
    .line 363
    .line 364
    const/16 v12, 0xc

    .line 365
    .line 366
    invoke-static {v1, v12}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 367
    .line 368
    .line 369
    move-result v13

    .line 370
    iput v13, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 371
    .line 372
    const/4 v12, 0x6

    .line 373
    invoke-static {v1, v12}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 374
    .line 375
    .line 376
    move-result v13

    .line 377
    iput v13, v9, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 378
    .line 379
    invoke-virtual {v2, v6, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 380
    .line 381
    .line 382
    new-instance v6, Landroid/widget/EditText;

    .line 383
    .line 384
    invoke-direct {v6, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 385
    .line 386
    .line 387
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 388
    .line 389
    const/16 v13, 0x2c

    .line 390
    .line 391
    invoke-static {v1, v13}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 392
    .line 393
    .line 394
    move-result v11

    .line 395
    invoke-direct {v9, v15, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v6, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 399
    .line 400
    .line 401
    const/16 v9, 0xc

    .line 402
    .line 403
    invoke-static {v1, v9}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 404
    .line 405
    .line 406
    move-result v11

    .line 407
    invoke-static {v1, v9}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 408
    .line 409
    .line 410
    move-result v9

    .line 411
    invoke-virtual {v6, v11, v7, v9, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 412
    .line 413
    .line 414
    const/high16 v9, 0x41600000    # 14.0f

    .line 415
    .line 416
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 417
    .line 418
    .line 419
    const/16 v9, 0x10

    .line 420
    .line 421
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 425
    .line 426
    .line 427
    const/4 v11, 0x1

    .line 428
    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 429
    .line 430
    .line 431
    sget-object v11, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 432
    .line 433
    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 434
    .line 435
    .line 436
    const/16 v11, 0x1091

    .line 437
    .line 438
    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setInputType(I)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v6, v12}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 442
    .line 443
    .line 444
    const-string v11, "#0123456789ABCDEFabcdef"

    .line 445
    .line 446
    invoke-static {v11}, Landroid/text/method/DigitsKeyListener;->getInstance(Ljava/lang/String;)Landroid/text/method/DigitsKeyListener;

    .line 447
    .line 448
    .line 449
    move-result-object v11

    .line 450
    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 451
    .line 452
    .line 453
    new-instance v11, Landroid/text/InputFilter$LengthFilter;

    .line 454
    .line 455
    const/4 v12, 0x7

    .line 456
    if-eqz v3, :cond_2

    .line 457
    .line 458
    const/16 v17, 0x9

    .line 459
    .line 460
    move/from16 v14, v17

    .line 461
    .line 462
    goto :goto_1

    .line 463
    :cond_2
    move v14, v12

    .line 464
    :goto_1
    invoke-direct {v11, v14}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 465
    .line 466
    .line 467
    filled-new-array {v11}, [Landroid/text/InputFilter$LengthFilter;

    .line 468
    .line 469
    .line 470
    move-result-object v11

    .line 471
    check-cast v11, [Landroid/text/InputFilter;

    .line 472
    .line 473
    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 474
    .line 475
    .line 476
    if-eqz v3, :cond_3

    .line 477
    .line 478
    const-string v11, "#AARRGGBB"

    .line 479
    .line 480
    goto :goto_2

    .line 481
    :cond_3
    const-string v11, "#RRGGBB"

    .line 482
    .line 483
    :goto_2
    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 484
    .line 485
    .line 486
    const/4 v11, 0x1

    .line 487
    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    .line 488
    .line 489
    .line 490
    iget-object v11, v4, Lxx;->ζ:Ljava/lang/String;

    .line 491
    .line 492
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 493
    .line 494
    .line 495
    move-result v11

    .line 496
    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 497
    .line 498
    .line 499
    iget-object v11, v4, Lxx;->θ:Ljava/lang/String;

    .line 500
    .line 501
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 502
    .line 503
    .line 504
    move-result v11

    .line 505
    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 506
    .line 507
    .line 508
    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 509
    .line 510
    .line 511
    move-result-object v11

    .line 512
    invoke-virtual {v6, v11}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 513
    .line 514
    .line 515
    iput-object v6, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->φ:Landroid/widget/EditText;

    .line 516
    .line 517
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 518
    .line 519
    .line 520
    new-instance v6, Landroid/widget/TextView;

    .line 521
    .line 522
    invoke-direct {v6, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 523
    .line 524
    .line 525
    if-eqz v3, :cond_4

    .line 526
    .line 527
    const-string v3, "\u8bf7\u8f93\u5165\u5b8c\u6574\u7684 #AARRGGBB"

    .line 528
    .line 529
    goto :goto_3

    .line 530
    :cond_4
    const-string v3, "\u8bf7\u8f93\u5165\u5b8c\u6574\u7684 #RRGGBB"

    .line 531
    .line 532
    :goto_3
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 533
    .line 534
    .line 535
    const/high16 v3, 0x41200000    # 10.0f

    .line 536
    .line 537
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v6, v10}, Landroid/view/View;->setVisibility(I)V

    .line 544
    .line 545
    .line 546
    iget-object v3, v4, Lxx;->ρ:Ljava/lang/String;

    .line 547
    .line 548
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 549
    .line 550
    .line 551
    move-result v3

    .line 552
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 553
    .line 554
    .line 555
    iput-object v6, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->χ:Landroid/widget/TextView;

    .line 556
    .line 557
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 558
    .line 559
    invoke-direct {v3, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 560
    .line 561
    .line 562
    invoke-static {v1, v8}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 563
    .line 564
    .line 565
    move-result v4

    .line 566
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 567
    .line 568
    invoke-virtual {v2, v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {p0 .. p1}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    const-string v3, "\u9884\u8bbe\u989c\u8272"

    .line 579
    .line 580
    invoke-virtual {v0, v1, v3}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ι(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 581
    .line 582
    .line 583
    move-result-object v3

    .line 584
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 585
    .line 586
    .line 587
    new-instance v3, Landroid/widget/LinearLayout;

    .line 588
    .line 589
    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 593
    .line 594
    .line 595
    const/4 v4, 0x2

    .line 596
    invoke-static {v1, v4}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 597
    .line 598
    .line 599
    move-result v6

    .line 600
    invoke-static {v1, v4}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 601
    .line 602
    .line 603
    move-result v8

    .line 604
    invoke-virtual {v3, v7, v6, v7, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 605
    .line 606
    .line 607
    move v6, v7

    .line 608
    :goto_4
    if-ge v6, v9, :cond_5

    .line 609
    .line 610
    sget-object v8, Lcom/example/dyhelper/ui/μ;->α:[I

    .line 611
    .line 612
    aget v8, v8, v6

    .line 613
    .line 614
    new-instance v11, Landroid/widget/FrameLayout;

    .line 615
    .line 616
    invoke-direct {v11, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 617
    .line 618
    .line 619
    const/16 v14, 0x2a

    .line 620
    .line 621
    invoke-static {v1, v14}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 622
    .line 623
    .line 624
    move-result v14

    .line 625
    new-instance v13, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 626
    .line 627
    invoke-direct {v13, v14, v14}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 628
    .line 629
    .line 630
    invoke-static {v1, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 631
    .line 632
    .line 633
    move-result v14

    .line 634
    iput v14, v13, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 635
    .line 636
    invoke-virtual {v11, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 637
    .line 638
    .line 639
    const/4 v13, 0x1

    .line 640
    invoke-virtual {v11, v13}, Landroid/view/View;->setClickable(Z)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v11, v13}, Landroid/view/View;->setFocusable(Z)V

    .line 644
    .line 645
    .line 646
    new-instance v14, Landroid/view/View;

    .line 647
    .line 648
    invoke-direct {v14, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 649
    .line 650
    .line 651
    invoke-static {v8, v13}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ε(IZ)Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v16

    .line 655
    iget-object v9, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ:Lxx;

    .line 656
    .line 657
    iget-object v9, v9, Lxx;->δ:Ljava/lang/String;

    .line 658
    .line 659
    new-instance v10, Landroid/graphics/drawable/GradientDrawable;

    .line 660
    .line 661
    invoke-direct {v10}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 662
    .line 663
    .line 664
    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 665
    .line 666
    .line 667
    move-result v5

    .line 668
    invoke-virtual {v10, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 669
    .line 670
    .line 671
    invoke-static {v1, v12}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    int-to-float v5, v5

    .line 676
    invoke-virtual {v10, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 677
    .line 678
    .line 679
    invoke-static {v1, v13}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 680
    .line 681
    .line 682
    move-result v5

    .line 683
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 684
    .line 685
    .line 686
    move-result v9

    .line 687
    invoke-virtual {v10, v5, v9}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v14, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 691
    .line 692
    .line 693
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 694
    .line 695
    invoke-direct {v5, v15, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 696
    .line 697
    .line 698
    const/4 v9, 0x3

    .line 699
    invoke-static {v1, v9}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 700
    .line 701
    .line 702
    move-result v10

    .line 703
    invoke-static {v1, v9}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 704
    .line 705
    .line 706
    move-result v13

    .line 707
    invoke-static {v1, v9}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 708
    .line 709
    .line 710
    move-result v12

    .line 711
    invoke-static {v1, v9}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 712
    .line 713
    .line 714
    move-result v15

    .line 715
    invoke-virtual {v5, v10, v13, v12, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v11, v14, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 719
    .line 720
    .line 721
    new-instance v5, Lcom/example/dyhelper/ui/ε;

    .line 722
    .line 723
    invoke-direct {v5, v0, v8}, Lcom/example/dyhelper/ui/ε;-><init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;I)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v11, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 727
    .line 728
    .line 729
    iget-object v5, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->σ:Ljava/util/ArrayList;

    .line 730
    .line 731
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 732
    .line 733
    .line 734
    move-result-object v8

    .line 735
    new-instance v10, Ll91;

    .line 736
    .line 737
    invoke-direct {v10, v8, v11}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 741
    .line 742
    .line 743
    invoke-virtual {v3, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 744
    .line 745
    .line 746
    add-int/lit8 v6, v6, 0x1

    .line 747
    .line 748
    const/4 v5, -0x2

    .line 749
    const/16 v9, 0x10

    .line 750
    .line 751
    const/16 v10, 0x8

    .line 752
    .line 753
    const/4 v12, 0x7

    .line 754
    const/16 v13, 0x2c

    .line 755
    .line 756
    const/4 v15, -0x1

    .line 757
    goto/16 :goto_4

    .line 758
    .line 759
    :cond_5
    new-instance v5, Landroid/widget/HorizontalScrollView;

    .line 760
    .line 761
    invoke-direct {v5, v1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v5, v7}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v5, v4}, Landroid/view/View;->setOverScrollMode(I)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v5, v3}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;)V

    .line 771
    .line 772
    .line 773
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 774
    .line 775
    const/4 v4, -0x2

    .line 776
    const/4 v6, -0x1

    .line 777
    invoke-direct {v3, v6, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 778
    .line 779
    .line 780
    const/16 v4, 0x8

    .line 781
    .line 782
    invoke-static {v1, v4}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 783
    .line 784
    .line 785
    move-result v6

    .line 786
    iput v6, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 787
    .line 788
    invoke-virtual {v2, v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 792
    .line 793
    .line 794
    iget v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 795
    .line 796
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    .line 797
    .line 798
    .line 799
    move-result v2

    .line 800
    iget-object v3, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ:Lxx;

    .line 801
    .line 802
    iget-object v4, v3, Lxx;->ρ:Ljava/lang/String;

    .line 803
    .line 804
    iget-object v5, v3, Lxx;->λ:Ljava/lang/String;

    .line 805
    .line 806
    iget-object v6, v3, Lxx;->ι:Ljava/lang/String;

    .line 807
    .line 808
    const-string v8, "R"

    .line 809
    .line 810
    invoke-static {v2, v1, v8, v4}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    iput-object v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Β:Landroid/widget/TextView;

    .line 815
    .line 816
    iget v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 817
    .line 818
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 819
    .line 820
    .line 821
    move-result v2

    .line 822
    const-string v4, "G"

    .line 823
    .line 824
    invoke-static {v2, v1, v4, v6}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    .line 825
    .line 826
    .line 827
    move-result-object v2

    .line 828
    iput-object v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Γ:Landroid/widget/TextView;

    .line 829
    .line 830
    iget v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 831
    .line 832
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    .line 833
    .line 834
    .line 835
    move-result v2

    .line 836
    const-string v4, "B"

    .line 837
    .line 838
    invoke-static {v2, v1, v4, v5}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    .line 839
    .line 840
    .line 841
    move-result-object v2

    .line 842
    iput-object v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Δ:Landroid/widget/TextView;

    .line 843
    .line 844
    iget v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 845
    .line 846
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    .line 847
    .line 848
    .line 849
    move-result v2

    .line 850
    iget-object v4, v3, Lxx;->ρ:Ljava/lang/String;

    .line 851
    .line 852
    new-instance v8, Lcom/example/dyhelper/ui/ζ;

    .line 853
    .line 854
    const/4 v9, 0x0

    .line 855
    invoke-direct {v8, v0, v9}, Lcom/example/dyhelper/ui/ζ;-><init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;I)V

    .line 856
    .line 857
    .line 858
    invoke-virtual {v0, v1, v2, v4, v8}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->θ(Landroid/content/Context;ILjava/lang/String;La80;)Landroid/widget/SeekBar;

    .line 859
    .line 860
    .line 861
    move-result-object v2

    .line 862
    iput-object v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ψ:Landroid/widget/SeekBar;

    .line 863
    .line 864
    iget v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 865
    .line 866
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 867
    .line 868
    .line 869
    move-result v2

    .line 870
    new-instance v4, Lcom/example/dyhelper/ui/ζ;

    .line 871
    .line 872
    const/4 v8, 0x1

    .line 873
    invoke-direct {v4, v0, v8}, Lcom/example/dyhelper/ui/ζ;-><init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;I)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v0, v1, v2, v6, v4}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->θ(Landroid/content/Context;ILjava/lang/String;La80;)Landroid/widget/SeekBar;

    .line 877
    .line 878
    .line 879
    move-result-object v2

    .line 880
    iput-object v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ω:Landroid/widget/SeekBar;

    .line 881
    .line 882
    iget v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 883
    .line 884
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    .line 885
    .line 886
    .line 887
    move-result v2

    .line 888
    new-instance v4, Lcom/example/dyhelper/ui/ζ;

    .line 889
    .line 890
    const/4 v6, 0x2

    .line 891
    invoke-direct {v4, v0, v6}, Lcom/example/dyhelper/ui/ζ;-><init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;I)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v0, v1, v2, v5, v4}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->θ(Landroid/content/Context;ILjava/lang/String;La80;)Landroid/widget/SeekBar;

    .line 895
    .line 896
    .line 897
    move-result-object v2

    .line 898
    iput-object v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Α:Landroid/widget/SeekBar;

    .line 899
    .line 900
    new-instance v2, Landroid/widget/LinearLayout;

    .line 901
    .line 902
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 903
    .line 904
    .line 905
    const/4 v11, 0x1

    .line 906
    invoke-virtual {v2, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 907
    .line 908
    .line 909
    const/16 v4, 0x8

    .line 910
    .line 911
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 912
    .line 913
    .line 914
    iget-object v4, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Β:Landroid/widget/TextView;

    .line 915
    .line 916
    const/4 v5, 0x0

    .line 917
    if-eqz v4, :cond_10

    .line 918
    .line 919
    iget-object v6, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ψ:Landroid/widget/SeekBar;

    .line 920
    .line 921
    if-eqz v6, :cond_f

    .line 922
    .line 923
    invoke-static {v1, v4, v6, v11}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->γ(Landroid/content/Context;Landroid/widget/TextView;Landroid/widget/SeekBar;Z)Landroid/widget/LinearLayout;

    .line 924
    .line 925
    .line 926
    move-result-object v4

    .line 927
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 928
    .line 929
    .line 930
    iget-object v4, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Γ:Landroid/widget/TextView;

    .line 931
    .line 932
    if-eqz v4, :cond_e

    .line 933
    .line 934
    iget-object v6, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ω:Landroid/widget/SeekBar;

    .line 935
    .line 936
    if-eqz v6, :cond_d

    .line 937
    .line 938
    invoke-static {v1, v4, v6, v11}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->γ(Landroid/content/Context;Landroid/widget/TextView;Landroid/widget/SeekBar;Z)Landroid/widget/LinearLayout;

    .line 939
    .line 940
    .line 941
    move-result-object v4

    .line 942
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 943
    .line 944
    .line 945
    iget-object v4, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Δ:Landroid/widget/TextView;

    .line 946
    .line 947
    if-eqz v4, :cond_c

    .line 948
    .line 949
    iget-object v6, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Α:Landroid/widget/SeekBar;

    .line 950
    .line 951
    if-eqz v6, :cond_b

    .line 952
    .line 953
    invoke-static {v1, v4, v6, v7}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->γ(Landroid/content/Context;Landroid/widget/TextView;Landroid/widget/SeekBar;Z)Landroid/widget/LinearLayout;

    .line 954
    .line 955
    .line 956
    move-result-object v4

    .line 957
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 958
    .line 959
    .line 960
    iput-object v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Ε:Landroid/widget/LinearLayout;

    .line 961
    .line 962
    new-instance v2, Landroid/widget/TextView;

    .line 963
    .line 964
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 965
    .line 966
    .line 967
    const-string v4, "\u2304"

    .line 968
    .line 969
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 970
    .line 971
    .line 972
    const/high16 v4, 0x41b00000    # 22.0f

    .line 973
    .line 974
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 975
    .line 976
    .line 977
    const/16 v4, 0x11

    .line 978
    .line 979
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 983
    .line 984
    .line 985
    iget-object v4, v3, Lxx;->η:Ljava/lang/String;

    .line 986
    .line 987
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 988
    .line 989
    .line 990
    move-result v4

    .line 991
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 992
    .line 993
    .line 994
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 995
    .line 996
    const/16 v6, 0x20

    .line 997
    .line 998
    invoke-static {v1, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 999
    .line 1000
    .line 1001
    move-result v8

    .line 1002
    invoke-static {v1, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1003
    .line 1004
    .line 1005
    move-result v6

    .line 1006
    invoke-direct {v4, v8, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1010
    .line 1011
    .line 1012
    iput-object v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Ζ:Landroid/widget/TextView;

    .line 1013
    .line 1014
    invoke-virtual/range {p0 .. p1}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v2

    .line 1018
    new-instance v4, Landroid/widget/LinearLayout;

    .line 1019
    .line 1020
    invoke-direct {v4, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1024
    .line 1025
    .line 1026
    const/16 v6, 0x10

    .line 1027
    .line 1028
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1029
    .line 1030
    .line 1031
    const/16 v6, 0x2c

    .line 1032
    .line 1033
    invoke-static {v1, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1034
    .line 1035
    .line 1036
    move-result v6

    .line 1037
    invoke-virtual {v4, v6}, Landroid/view/View;->setMinimumHeight(I)V

    .line 1038
    .line 1039
    .line 1040
    const/4 v11, 0x1

    .line 1041
    invoke-virtual {v4, v11}, Landroid/view/View;->setClickable(Z)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v4, v11}, Landroid/view/View;->setFocusable(Z)V

    .line 1045
    .line 1046
    .line 1047
    const-string v6, "\u5c55\u5f00 RGB \u7cbe\u786e\u8c03\u6574"

    .line 1048
    .line 1049
    invoke-virtual {v4, v6}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1050
    .line 1051
    .line 1052
    iget-object v6, v3, Lxx;->Α:Ljava/lang/String;

    .line 1053
    .line 1054
    iget-object v8, v3, Lxx;->γ:Ljava/lang/String;

    .line 1055
    .line 1056
    const/16 v9, 0xa

    .line 1057
    .line 1058
    invoke-static {v9, v1, v6, v8}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v6

    .line 1062
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1063
    .line 1064
    .line 1065
    new-instance v6, Landroid/widget/TextView;

    .line 1066
    .line 1067
    invoke-direct {v6, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1068
    .line 1069
    .line 1070
    const-string v8, "RGB \u7cbe\u786e\u8c03\u6574"

    .line 1071
    .line 1072
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1073
    .line 1074
    .line 1075
    const/high16 v8, 0x41500000    # 13.0f

    .line 1076
    .line 1077
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v6}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v8

    .line 1087
    const/4 v11, 0x1

    .line 1088
    invoke-virtual {v6, v8, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 1089
    .line 1090
    .line 1091
    iget-object v3, v3, Lxx;->ζ:Ljava/lang/String;

    .line 1092
    .line 1093
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1094
    .line 1095
    .line 1096
    move-result v3

    .line 1097
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1098
    .line 1099
    .line 1100
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 1101
    .line 1102
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1103
    .line 1104
    const/4 v9, -0x2

    .line 1105
    invoke-direct {v3, v7, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v4, v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1109
    .line 1110
    .line 1111
    iget-object v3, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Ζ:Landroid/widget/TextView;

    .line 1112
    .line 1113
    if-eqz v3, :cond_a

    .line 1114
    .line 1115
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1116
    .line 1117
    .line 1118
    new-instance v3, Lcom/example/dyhelper/ui/η;

    .line 1119
    .line 1120
    const/4 v6, 0x0

    .line 1121
    invoke-direct {v3, v6, v0}, Lcom/example/dyhelper/ui/η;-><init>(ILjava/lang/Object;)V

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1125
    .line 1126
    .line 1127
    iput-object v4, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Η:Landroid/widget/LinearLayout;

    .line 1128
    .line 1129
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1130
    .line 1131
    .line 1132
    iget-object v3, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Ε:Landroid/widget/LinearLayout;

    .line 1133
    .line 1134
    if-eqz v3, :cond_9

    .line 1135
    .line 1136
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 1137
    .line 1138
    const/4 v6, -0x1

    .line 1139
    const/4 v9, -0x2

    .line 1140
    invoke-direct {v4, v6, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1141
    .line 1142
    .line 1143
    const/16 v6, 0x8

    .line 1144
    .line 1145
    invoke-static {v1, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 1146
    .line 1147
    .line 1148
    move-result v1

    .line 1149
    iput v1, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1150
    .line 1151
    invoke-virtual {v2, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1155
    .line 1156
    .line 1157
    iget-object v1, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ξ:Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;

    .line 1158
    .line 1159
    new-instance v2, Lcom/example/dyhelper/ui/ι;

    .line 1160
    .line 1161
    invoke-direct {v2, v0}, Lcom/example/dyhelper/ui/ι;-><init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;)V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    iput-object v2, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->θ:Lcom/example/dyhelper/ui/ι;

    .line 1168
    .line 1169
    iget-object v1, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ο:Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;

    .line 1170
    .line 1171
    new-instance v2, Lcom/example/dyhelper/ui/ζ;

    .line 1172
    .line 1173
    const/4 v3, 0x3

    .line 1174
    invoke-direct {v2, v0, v3}, Lcom/example/dyhelper/ui/ζ;-><init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;I)V

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1178
    .line 1179
    .line 1180
    iput-object v2, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ζ:Lcom/example/dyhelper/ui/ζ;

    .line 1181
    .line 1182
    iget-boolean v1, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ε:Z

    .line 1183
    .line 1184
    if-eqz v1, :cond_6

    .line 1185
    .line 1186
    iget-object v1, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->π:Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;

    .line 1187
    .line 1188
    new-instance v2, Lcom/example/dyhelper/ui/ζ;

    .line 1189
    .line 1190
    const/4 v3, 0x4

    .line 1191
    invoke-direct {v2, v0, v3}, Lcom/example/dyhelper/ui/ζ;-><init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;I)V

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1195
    .line 1196
    .line 1197
    iput-object v2, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->η:Lcom/example/dyhelper/ui/ζ;

    .line 1198
    .line 1199
    :cond_6
    iget-object v1, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->φ:Landroid/widget/EditText;

    .line 1200
    .line 1201
    const-string v2, "hexInput"

    .line 1202
    .line 1203
    if-eqz v1, :cond_8

    .line 1204
    .line 1205
    new-instance v3, Lcom/example/dyhelper/ui/λ;

    .line 1206
    .line 1207
    invoke-direct {v3, v0}, Lcom/example/dyhelper/ui/λ;-><init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;)V

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1211
    .line 1212
    .line 1213
    iget-object v1, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->φ:Landroid/widget/EditText;

    .line 1214
    .line 1215
    if-eqz v1, :cond_7

    .line 1216
    .line 1217
    new-instance v2, Lcom/example/dyhelper/ui/θ;

    .line 1218
    .line 1219
    invoke-direct {v2, v0}, Lcom/example/dyhelper/ui/θ;-><init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;)V

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 1223
    .line 1224
    .line 1225
    const/4 v11, 0x1

    .line 1226
    invoke-virtual {v0, v11}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->λ(Z)V

    .line 1227
    .line 1228
    .line 1229
    return-void

    .line 1230
    :cond_7
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 1231
    .line 1232
    .line 1233
    throw v5

    .line 1234
    :cond_8
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 1235
    .line 1236
    .line 1237
    throw v5

    .line 1238
    :cond_9
    const-string v0, "advancedContent"

    .line 1239
    .line 1240
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 1241
    .line 1242
    .line 1243
    throw v5

    .line 1244
    :cond_a
    const-string v0, "advancedChevron"

    .line 1245
    .line 1246
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 1247
    .line 1248
    .line 1249
    throw v5

    .line 1250
    :cond_b
    const-string v0, "seekB"

    .line 1251
    .line 1252
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 1253
    .line 1254
    .line 1255
    throw v5

    .line 1256
    :cond_c
    const-string v0, "labelB"

    .line 1257
    .line 1258
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 1259
    .line 1260
    .line 1261
    throw v5

    .line 1262
    :cond_d
    const-string v0, "seekG"

    .line 1263
    .line 1264
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 1265
    .line 1266
    .line 1267
    throw v5

    .line 1268
    :cond_e
    const-string v0, "labelG"

    .line 1269
    .line 1270
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 1271
    .line 1272
    .line 1273
    throw v5

    .line 1274
    :cond_f
    const-string v0, "seekR"

    .line 1275
    .line 1276
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 1277
    .line 1278
    .line 1279
    throw v5

    .line 1280
    :cond_10
    const-string v0, "labelR"

    .line 1281
    .line 1282
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 1283
    .line 1284
    .line 1285
    throw v5
.end method

.method public static γ(Landroid/content/Context;Landroid/widget/TextView;Landroid/widget/SeekBar;Z)Landroid/widget/LinearLayout;
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x10

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 16
    .line 17
    const/16 v2, 0x26

    .line 18
    .line 19
    invoke-static {p0, v2}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, -0x1

    .line 24
    invoke-direct {v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 25
    .line 26
    .line 27
    if-eqz p3, :cond_0

    .line 28
    .line 29
    const/4 p3, 0x4

    .line 30
    invoke-static {p0, p3}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput p0, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public static ε(IZ)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "#%08X"

    .line 19
    .line 20
    invoke-static {p1, v0, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 26
    .line 27
    const v1, 0xffffff

    .line 28
    .line 29
    .line 30
    and-int/2addr p0, v1

    .line 31
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v0, "#%06X"

    .line 44
    .line 45
    invoke-static {p1, v0, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static η(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 7
    .line 8
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    filled-new-array {p2, p0}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 p2, 0x2

    .line 17
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p2, "%s  %3d"

    .line 22
    .line 23
    invoke-static {v1, p2, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    const/high16 p0, 0x41300000    # 11.0f

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 33
    .line 34
    .line 35
    const p0, 0x800013

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setGravity(I)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 46
    .line 47
    const/4 p2, 0x1

    .line 48
    invoke-static {p0, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 60
    .line 61
    .line 62
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 63
    .line 64
    const/16 p2, 0x3a

    .line 65
    .line 66
    invoke-static {p1, p2}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    const/4 p2, -0x1

    .line 71
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 75
    .line 76
    .line 77
    return-object v0
.end method


# virtual methods
.method public final α(IIIZ)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0xff

    .line 3
    .line 4
    invoke-static {p1, v0, v1}, Lj81;->μ(III)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {p2, v0, v1}, Lj81;->μ(III)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-static {p3, v0, v1}, Lj81;->μ(III)I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    iget v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ι:I

    .line 17
    .line 18
    invoke-static {v0, p1, p2, p3}, Landroid/graphics/Color;->argb(IIII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 23
    .line 24
    invoke-static {p1, p2, p3}, Landroid/graphics/Color;->rgb(III)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iget-object p2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->θ:[F

    .line 29
    .line 30
    invoke-static {p1, p2}, Landroid/graphics/Color;->colorToHSV(I[F)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p4}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->λ(Z)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final β(Landroid/content/Context;Ljava/lang/String;Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;)Landroid/widget/LinearLayout;
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    const/high16 p2, 0x41200000    # 10.0f

    .line 19
    .line 20
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 21
    .line 22
    .line 23
    const/16 p2, 0x11

    .line 24
    .line 25
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 26
    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ:Lxx;

    .line 33
    .line 34
    iget-object p0, p0, Lxx;->η:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 41
    .line 42
    .line 43
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 44
    .line 45
    const/4 p2, -0x2

    .line 46
    const/4 v2, -0x1

    .line 47
    invoke-direct {p0, v2, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 48
    .line 49
    .line 50
    const/4 p2, 0x5

    .line 51
    invoke-static {p1, p2}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    iput p2, p0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 56
    .line 57
    invoke-virtual {v0, v1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 58
    .line 59
    .line 60
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 61
    .line 62
    const/16 p2, 0x30

    .line 63
    .line 64
    invoke-static {p1, p2}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-direct {p0, v2, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p3, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 72
    .line 73
    .line 74
    return-object v0
.end method

.method public final δ(Landroid/content/Context;Ljava/lang/String;Landroid/widget/TextView;)Landroid/widget/LinearLayout;
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x10

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Landroid/widget/TextView;

    .line 16
    .line 17
    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    const/high16 p1, 0x41300000    # 11.0f

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ:Lxx;

    .line 32
    .line 33
    iget-object p0, p0, Lxx;->η:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 40
    .line 41
    .line 42
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 43
    .line 44
    const/4 p1, -0x2

    .line 45
    const/high16 p2, 0x3f800000    # 1.0f

    .line 46
    .line 47
    invoke-direct {p0, v1, p1, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    return-object v0
.end method

.method public final ζ(Landroid/content/Context;)Landroid/widget/LinearLayout;
    .locals 6

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0xc

    .line 11
    .line 12
    invoke-static {p1, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-static {p1, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {p1, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-static {p1, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ:Lxx;

    .line 32
    .line 33
    iget-object p0, p0, Lxx;->γ:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, p1, p0}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 40
    .line 41
    .line 42
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 43
    .line 44
    const/4 v1, -0x1

    .line 45
    const/4 v2, -0x2

    .line 46
    invoke-direct {p0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 47
    .line 48
    .line 49
    const/16 v1, 0xa

    .line 50
    .line 51
    invoke-static {p1, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iput p1, p0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method public final θ(Landroid/content/Context;ILjava/lang/String;La80;)Landroid/widget/SeekBar;
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/SeekBar;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xff

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 12
    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-virtual {v0, p2}, Landroid/widget/AbsSeekBar;->setSplitTrack(Z)V

    .line 16
    .line 17
    .line 18
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ:Lxx;

    .line 30
    .line 31
    iget-object p0, p0, Lxx;->ε:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v0, p0}, Landroid/widget/ProgressBar;->setProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, p0}, Landroid/widget/AbsSeekBar;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    .line 53
    .line 54
    .line 55
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 56
    .line 57
    const/16 p3, 0x24

    .line 58
    .line 59
    invoke-static {p1, p3}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    const/high16 p3, 0x3f800000    # 1.0f

    .line 64
    .line 65
    invoke-direct {p0, p2, p1, p3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 69
    .line 70
    .line 71
    new-instance p0, Lah;

    .line 72
    .line 73
    const/4 p1, 0x1

    .line 74
    invoke-direct {p0, p4, p1, v0}, Lah;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 78
    .line 79
    .line 80
    return-object v0
.end method

.method public final ι(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 p1, 0x41500000    # 13.0f

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 p2, 0x1

    .line 23
    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ:Lxx;

    .line 27
    .line 28
    iget-object p0, p0, Lxx;->ζ:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public final κ(Landroid/content/Context;)Landroid/widget/TextView;
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/high16 p1, 0x41300000    # 11.0f

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 13
    .line 14
    .line 15
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ:Lxx;

    .line 21
    .line 22
    iget-object p0, p0, Lxx;->η:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public final λ(Z)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->θ:[F

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iput-boolean v2, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->μ:Z

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    :try_start_0
    iget-object v4, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ξ:Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;

    .line 10
    .line 11
    aget v5, v0, v3

    .line 12
    .line 13
    aget v6, v0, v2

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    aget v8, v0, v7

    .line 17
    .line 18
    iget v9, v4, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ε:F

    .line 19
    .line 20
    cmpg-float v9, v9, v5

    .line 21
    .line 22
    if-nez v9, :cond_0

    .line 23
    .line 24
    move v9, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v9, v3

    .line 27
    :goto_0
    const/high16 v10, 0x43b40000    # 360.0f

    .line 28
    .line 29
    const/4 v11, 0x0

    .line 30
    invoke-static {v5, v11, v10}, Lj81;->λ(FFF)F

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    iput v5, v4, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ε:F

    .line 35
    .line 36
    const/high16 v5, 0x3f800000    # 1.0f

    .line 37
    .line 38
    invoke-static {v6, v11, v5}, Lj81;->λ(FFF)F

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    iput v6, v4, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ζ:F

    .line 43
    .line 44
    invoke-static {v8, v11, v5}, Lj81;->λ(FFF)F

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    iput v6, v4, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->η:F

    .line 49
    .line 50
    if-nez v9, :cond_1

    .line 51
    .line 52
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-lez v6, :cond_1

    .line 57
    .line 58
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    int-to-float v15, v6

    .line 63
    new-instance v12, Landroid/graphics/LinearGradient;

    .line 64
    .line 65
    iget v6, v4, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ε:F

    .line 66
    .line 67
    const/4 v8, 0x3

    .line 68
    new-array v8, v8, [F

    .line 69
    .line 70
    aput v6, v8, v3

    .line 71
    .line 72
    aput v5, v8, v2

    .line 73
    .line 74
    aput v5, v8, v7

    .line 75
    .line 76
    invoke-static {v8}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 77
    .line 78
    .line 79
    move-result v18

    .line 80
    sget-object v19, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 81
    .line 82
    const/4 v13, 0x0

    .line 83
    const/4 v14, 0x0

    .line 84
    const/16 v16, 0x0

    .line 85
    .line 86
    const/16 v17, -0x1

    .line 87
    .line 88
    invoke-direct/range {v12 .. v19}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 89
    .line 90
    .line 91
    iput-object v12, v4, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ι:Landroid/graphics/LinearGradient;

    .line 92
    .line 93
    :cond_1
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 94
    .line 95
    .line 96
    iget-object v4, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ο:Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;

    .line 97
    .line 98
    aget v5, v0, v3

    .line 99
    .line 100
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {v5, v11, v10}, Lj81;->λ(FFF)F

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    iput v5, v4, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ε:F

    .line 108
    .line 109
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 110
    .line 111
    .line 112
    iget-object v4, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->τ:Landroid/widget/TextView;

    .line 113
    .line 114
    const/4 v5, 0x0

    .line 115
    if-eqz v4, :cond_6

    .line 116
    .line 117
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 118
    .line 119
    const-string v7, "%d\u00b0"

    .line 120
    .line 121
    aget v0, v0, v3

    .line 122
    .line 123
    invoke-static {v0}, Ljx0;->в(F)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {v6, v7, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    .line 145
    .line 146
    iget-boolean v0, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ε:Z

    .line 147
    .line 148
    if-eqz v0, :cond_3

    .line 149
    .line 150
    iget-object v0, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->π:Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;

    .line 151
    .line 152
    iget v4, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ι:I

    .line 153
    .line 154
    iget v7, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    const/16 v8, 0xff

    .line 160
    .line 161
    invoke-static {v4, v3, v8}, Lj81;->μ(III)I

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    iput v4, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ε:I

    .line 166
    .line 167
    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    invoke-static {v7}, Landroid/graphics/Color;->blue(I)I

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    invoke-static {v4, v8, v7}, Landroid/graphics/Color;->rgb(III)I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    iput v4, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ζ:I

    .line 184
    .line 185
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 186
    .line 187
    .line 188
    iget-object v0, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->υ:Landroid/widget/TextView;

    .line 189
    .line 190
    if-eqz v0, :cond_2

    .line 191
    .line 192
    const-string v4, "%d%%"

    .line 193
    .line 194
    iget v5, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ι:I

    .line 195
    .line 196
    int-to-float v5, v5

    .line 197
    const/high16 v7, 0x437f0000    # 255.0f

    .line 198
    .line 199
    div-float/2addr v5, v7

    .line 200
    const/high16 v7, 0x42c80000    # 100.0f

    .line 201
    .line 202
    mul-float/2addr v5, v7

    .line 203
    invoke-static {v5}, Ljx0;->в(F)I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-static {v6, v4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    .line 225
    .line 226
    goto :goto_1

    .line 227
    :catchall_0
    move-exception v0

    .line 228
    goto :goto_3

    .line 229
    :cond_2
    const-string v0, "alphaValueLabel"

    .line 230
    .line 231
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw v5

    .line 235
    :cond_3
    :goto_1
    invoke-virtual {v1}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->π()V

    .line 236
    .line 237
    .line 238
    iget-object v0, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ρ:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;

    .line 239
    .line 240
    iget v2, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 241
    .line 242
    iget v4, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->ε:I

    .line 243
    .line 244
    if-ne v4, v2, :cond_4

    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_4
    iput v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->ε:I

    .line 248
    .line 249
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 250
    .line 251
    .line 252
    :goto_2
    invoke-virtual {v1}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ο()V

    .line 253
    .line 254
    .line 255
    if-eqz p1, :cond_5

    .line 256
    .line 257
    invoke-virtual {v1}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ξ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 258
    .line 259
    .line 260
    :cond_5
    iput-boolean v3, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->μ:Z

    .line 261
    .line 262
    return-void

    .line 263
    :cond_6
    :try_start_1
    const-string v0, "hueValueLabel"

    .line 264
    .line 265
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 269
    :goto_3
    iput-boolean v3, v1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->μ:Z

    .line 270
    .line 271
    throw v0
.end method

.method public final μ(Z)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->κ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    iput-boolean p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->κ:Z

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    iget-object v4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->φ:Landroid/widget/EditText;

    .line 14
    .line 15
    if-eqz v4, :cond_6

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v6, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ:Lxx;

    .line 25
    .line 26
    iget-object v7, v6, Lxx;->β:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object v6, v6, Lxx;->δ:Ljava/lang/String;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iget-object v6, v6, Lxx;->ρ:Ljava/lang/String;

    .line 34
    .line 35
    :goto_1
    if-eqz p1, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/4 v2, 0x2

    .line 39
    :goto_2
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 40
    .line 41
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    invoke-virtual {v8, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 49
    .line 50
    .line 51
    const/16 v7, 0x9

    .line 52
    .line 53
    invoke-static {v5, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    int-to-float v7, v7

    .line 58
    invoke-virtual {v8, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 59
    .line 60
    .line 61
    invoke-static {v5, v2}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    invoke-virtual {v8, v2, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->χ:Landroid/widget/TextView;

    .line 76
    .line 77
    if-eqz v2, :cond_5

    .line 78
    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    const/16 v1, 0x8

    .line 82
    .line 83
    :cond_3
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    iget-object p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->λ:Lfi;

    .line 89
    .line 90
    if-eqz p0, :cond_4

    .line 91
    .line 92
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p0, p1}, Lfi;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    :cond_4
    return-void

    .line 100
    :cond_5
    const-string p0, "hexErrorLabel"

    .line 101
    .line 102
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v3

    .line 106
    :cond_6
    const-string p0, "hexInput"

    .line 107
    .line 108
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v3
.end method

.method public final ν()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->θ:[F

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ι:I

    .line 8
    .line 9
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v1, v2, v3, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    invoke-virtual {p0, v0}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->λ(Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final ξ()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ε:Z

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ε(IZ)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "hexInput"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v3, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->φ:Landroid/widget/EditText;

    .line 13
    .line 14
    if-eqz v3, :cond_4

    .line 15
    .line 16
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v3, v2

    .line 28
    :goto_0
    invoke-static {v3, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/4 v4, 0x1

    .line 33
    if-nez v3, :cond_3

    .line 34
    .line 35
    iget-boolean v3, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->μ:Z

    .line 36
    .line 37
    iput-boolean v4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->μ:Z

    .line 38
    .line 39
    iget-object v5, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->φ:Landroid/widget/EditText;

    .line 40
    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->φ:Landroid/widget/EditText;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 59
    .line 60
    .line 61
    iput-boolean v3, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->μ:Z

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-static {v1}, Lln0;->и(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v2

    .line 68
    :cond_2
    invoke-static {v1}, Lln0;->и(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v2

    .line 72
    :cond_3
    :goto_1
    invoke-virtual {p0, v4}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->μ(Z)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_4
    invoke-static {v1}, Lln0;->и(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v2
.end method

.method public final ο()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->σ:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ll91;

    .line 18
    .line 19
    iget-object v2, v1, Ll91;->ε:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iget-object v1, v1, Ll91;->ζ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Landroid/widget/FrameLayout;

    .line 30
    .line 31
    iget v3, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x1

    .line 35
    if-ne v2, v3, :cond_0

    .line 36
    .line 37
    move v3, v5

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    move v3, v4

    .line 40
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object v7, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ζ:Lxx;

    .line 48
    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    iget-object v7, v7, Lxx;->ι:Ljava/lang/String;

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    iget-object v7, v7, Lxx;->δ:Ljava/lang/String;

    .line 55
    .line 56
    :goto_2
    if-eqz v3, :cond_2

    .line 57
    .line 58
    const/4 v5, 0x2

    .line 59
    :cond_2
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 60
    .line 61
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v9, "#00000000"

    .line 65
    .line 66
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 71
    .line 72
    .line 73
    const/16 v9, 0x9

    .line 74
    .line 75
    invoke-static {v6, v9}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    int-to-float v9, v9

    .line 80
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 81
    .line 82
    .line 83
    invoke-static {v6, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    invoke-virtual {v8, v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v2, v4}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ε(IZ)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    if-eqz v3, :cond_3

    .line 102
    .line 103
    const-string v4, "\u9884\u8bbe\u989c\u8272 "

    .line 104
    .line 105
    const-string v5, "\uff0c\u5df2\u9009\u62e9"

    .line 106
    .line 107
    invoke-static {v4, v2, v5}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    goto :goto_3

    .line 112
    :cond_3
    const-string v4, "\u9009\u62e9\u9884\u8bbe\u989c\u8272 "

    .line 113
    .line 114
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    :goto_3
    invoke-virtual {v1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v3}, Landroid/view/View;->setSelected(Z)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    return-void
.end method

.method public final π()V
    .locals 8

    .line 1
    iget v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 8
    .line 9
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget v2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 14
    .line 15
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    iget-object v4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ψ:Landroid/widget/SeekBar;

    .line 21
    .line 22
    if-eqz v4, :cond_5

    .line 23
    .line 24
    invoke-virtual {v4, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 25
    .line 26
    .line 27
    iget-object v4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ω:Landroid/widget/SeekBar;

    .line 28
    .line 29
    if-eqz v4, :cond_4

    .line 30
    .line 31
    invoke-virtual {v4, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 32
    .line 33
    .line 34
    iget-object v4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Α:Landroid/widget/SeekBar;

    .line 35
    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    invoke-virtual {v4, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 39
    .line 40
    .line 41
    iget-object v4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Β:Landroid/widget/TextView;

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const/4 v6, 0x1

    .line 56
    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v7, "R  %3d"

    .line 61
    .line 62
    invoke-static {v5, v7, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Γ:Landroid/widget/TextView;

    .line 70
    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const-string v4, "G  %3d"

    .line 86
    .line 87
    invoke-static {v5, v4, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    iget-object p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Δ:Landroid/widget/TextView;

    .line 95
    .line 96
    if-eqz p0, :cond_0

    .line 97
    .line 98
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v1, "B  %3d"

    .line 111
    .line 112
    invoke-static {v5, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_0
    const-string p0, "labelB"

    .line 121
    .line 122
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v3

    .line 126
    :cond_1
    const-string p0, "labelG"

    .line 127
    .line 128
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v3

    .line 132
    :cond_2
    const-string p0, "labelR"

    .line 133
    .line 134
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v3

    .line 138
    :cond_3
    const-string p0, "seekB"

    .line 139
    .line 140
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v3

    .line 144
    :cond_4
    const-string p0, "seekG"

    .line 145
    .line 146
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v3

    .line 150
    :cond_5
    const-string p0, "seekR"

    .line 151
    .line 152
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v3
.end method
