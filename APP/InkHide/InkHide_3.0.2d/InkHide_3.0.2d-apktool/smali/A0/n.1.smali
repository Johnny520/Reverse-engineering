.class public final synthetic LA0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LA0/n;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/n;->d:Landroid/app/Activity;

    iput-object p2, p0, LA0/n;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Landroid/app/Activity;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, LA0/n;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/n;->c:Ljava/util/ArrayList;

    iput-object p2, p0, LA0/n;->d:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 7

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 p2, 0x1

    .line 3
    iget v0, p0, LA0/n;->b:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LA0/n;->c:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, LA0/n;->d:Landroid/app/Activity;

    .line 19
    .line 20
    const-string v3, "getApplicationContext(...)"

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v4, v0

    .line 29
    check-cast v4, LA0/u;

    .line 30
    .line 31
    :try_start_0
    iget-object v0, v4, LA0/u;->f:LM0/l;

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v2}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-object v0, LE0/i;->a:LE0/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    new-instance v2, LE0/d;

    .line 48
    .line 49
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object v0, v2

    .line 53
    :goto_1
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    iget-object v2, v4, LA0/u;->a:Ljava/lang/String;

    .line 60
    .line 61
    const-string v3, "unified dexkit skip callback fail"

    .line 62
    .line 63
    filled-new-array {v3, v2, v0}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v0, "unified_dexkit_scan_status_v16"

    .line 79
    .line 80
    invoke-static {v0, p2}, LA0/l;->s(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    sget-object p2, LA0/y;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 84
    .line 85
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_0
    new-instance v2, Landroid/widget/TextView;

    .line 90
    .line 91
    iget-object v4, p0, LA0/n;->d:Landroid/app/Activity;

    .line 92
    .line 93
    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 94
    .line 95
    .line 96
    const-string v0, "\u51c6\u5907\u9002\u914d..."

    .line 97
    .line 98
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    .line 100
    .line 101
    const/high16 v0, 0x41600000    # 14.0f

    .line 102
    .line 103
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 104
    .line 105
    .line 106
    const/16 v0, 0x50

    .line 107
    .line 108
    invoke-static {v0, v0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 113
    .line 114
    .line 115
    sget-object v0, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 116
    .line 117
    const/16 v0, 0xc

    .line 118
    .line 119
    invoke-static {v4, v0}, LA0/y;->b(Landroid/content/Context;I)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-virtual {v2, p1, v0, p1, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 124
    .line 125
    .line 126
    new-instance v3, Landroid/widget/LinearLayout;

    .line 127
    .line 128
    invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, p2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 132
    .line 133
    .line 134
    const/16 p2, 0x18

    .line 135
    .line 136
    invoke-static {v4, p2}, LA0/y;->b(Landroid/content/Context;I)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    const/16 v1, 0x12

    .line 141
    .line 142
    invoke-static {v4, v1}, LA0/y;->b(Landroid/content/Context;I)I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-static {v4, p2}, LA0/y;->b(Landroid/content/Context;I)I

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    const/16 v5, 0x8

    .line 151
    .line 152
    invoke-static {v4, v5}, LA0/y;->b(Landroid/content/Context;I)I

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    invoke-virtual {v3, v0, v1, p2, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 157
    .line 158
    .line 159
    new-instance p2, Landroid/widget/TextView;

    .line 160
    .line 161
    invoke-direct {p2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 162
    .line 163
    .line 164
    const-string v0, "\u6b63\u5728\u626b\u63cf\u9002\u914d"

    .line 165
    .line 166
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    .line 168
    .line 169
    const/high16 v0, 0x41900000    # 18.0f

    .line 170
    .line 171
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 172
    .line 173
    .line 174
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 175
    .line 176
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 177
    .line 178
    .line 179
    const/16 v0, 0x1c

    .line 180
    .line 181
    invoke-static {v0, v0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 189
    .line 190
    .line 191
    new-instance p2, Landroid/widget/TextView;

    .line 192
    .line 193
    invoke-direct {p2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 194
    .line 195
    .line 196
    iget-object v1, p0, LA0/n;->c:Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    new-instance v5, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    const-string v6, "\u5171 "

    .line 205
    .line 206
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    const-string v0, " \u9879\uff0c\u8bf7\u4fdd\u6301\u5fae\u4fe1\u5728\u524d\u53f0\u3002"

    .line 213
    .line 214
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    .line 223
    .line 224
    const/high16 v0, 0x41500000    # 13.0f

    .line 225
    .line 226
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 227
    .line 228
    .line 229
    const/16 v0, 0x78

    .line 230
    .line 231
    invoke-static {v0, v0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 236
    .line 237
    .line 238
    const/4 v0, 0x6

    .line 239
    invoke-static {v4, v0}, LA0/y;->b(Landroid/content/Context;I)I

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    const/16 v5, 0xe

    .line 244
    .line 245
    invoke-static {v4, v5}, LA0/y;->b(Landroid/content/Context;I)I

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    invoke-virtual {p2, p1, v0, p1, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v3, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 253
    .line 254
    .line 255
    new-instance p2, Landroid/widget/ProgressBar;

    .line 256
    .line 257
    const/4 v0, 0x0

    .line 258
    const v5, 0x1010078

    .line 259
    .line 260
    .line 261
    invoke-direct {p2, v4, v0, v5}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p2, p1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    invoke-virtual {p2, v0}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p2, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 275
    .line 276
    .line 277
    const-string v0, "progress"

    .line 278
    .line 279
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v3, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 286
    .line 287
    .line 288
    new-instance p2, Landroid/app/AlertDialog$Builder;

    .line 289
    .line 290
    invoke-direct {p2, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p2, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 294
    .line 295
    .line 296
    move-result-object p2

    .line 297
    invoke-virtual {p2, p1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 306
    .line 307
    .line 308
    new-instance p1, Ljava/lang/Thread;

    .line 309
    .line 310
    new-instance v0, LA0/o;

    .line 311
    .line 312
    invoke-direct/range {v0 .. v5}, LA0/o;-><init>(Ljava/util/ArrayList;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/app/Activity;Landroid/app/AlertDialog;)V

    .line 313
    .line 314
    .line 315
    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
