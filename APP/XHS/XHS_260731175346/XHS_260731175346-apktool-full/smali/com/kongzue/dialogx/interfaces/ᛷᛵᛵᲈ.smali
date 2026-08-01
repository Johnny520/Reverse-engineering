.class public abstract Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛴᛷᲀᲁ;


# static fields
.field public static ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static ᛴᲈᛱᛴ:Ljava/lang/ref/WeakReference;

.field public static ᛸᛲᛷᛱ:Ljava/lang/Thread;

.field public static ᲁᛲᛴᛴ:Ljava/util/HashMap;

.field public static ᲈᛲᛵᲁ:Ljava/lang/ref/WeakReference;


# instance fields
.field public ᛱᛱᛲᲇ:Ljava/lang/ref/WeakReference;

.field public ᛳᲁᲇᛸ:Ljava/lang/ref/WeakReference;

.field public ᛳᲈᲈᛲ:Z

.field public final ᛶᲇᲈᛸ:I

.field public ᛷᛴᛷᛱ:Lxhss/ᲀᲀᲁᲀ;

.field public ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

.field public ᛷᲁᲁ:J

.field public ᛸᛲᲀᛵ:Z

.field public ᛸᛴᛶᛳ:Landroid/content/Context;

.field public final ᛸᛶᛴᲈ:I

.field public final ᛸᛶᲈᛶ:J

.field public ᛸᛷᲈᲈ:Z

.field public final ᲀᲇᛳᲁ:[I

.field public final ᲇᛴᲇᛵ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

.field public final ᲇᛶᛴᲀ:Z

.field public final ᲇᛸᛳᲁ:[I

.field public final ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛶᲇᲈᛸ:I

    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;-><init>(Lxhss/ᛴᛷᲀᲁ;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ:Z

    .line 17
    .line 18
    new-instance v1, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    new-array v1, v1, [I

    .line 25
    .line 26
    iput-object v1, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲀᲇᛳᲁ:[I

    .line 27
    .line 28
    const-wide/16 v1, -0x1

    .line 29
    .line 30
    iput-wide v1, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᲁᲁ:J

    .line 31
    .line 32
    iput-wide v1, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ:J

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    new-array v3, v3, [I

    .line 36
    .line 37
    iput-object v3, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛸᛳᲁ:[I

    .line 38
    .line 39
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᲀᛵ:Z

    .line 40
    .line 41
    sget-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 44
    .line 45
    sget v0, Lxhss/ᲇᛸᲀᛸ;->ᛸᛴᛶᛳ:I

    .line 46
    .line 47
    iput v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᛴᲈ:I

    .line 48
    .line 49
    iput-wide v1, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᲁᲁ:J

    .line 50
    .line 51
    iput-wide v1, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ:J

    .line 52
    .line 53
    sget-boolean v0, Lxhss/ᲇᛸᲀᛸ;->ᲀᲇᛳᲁ:Z

    .line 54
    .line 55
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ:Z

    .line 56
    .line 57
    return-void
.end method

.method public static ᛱᲈᛳᛴ(Landroid/view/View;)V
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_3

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 10
    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    iget-boolean v1, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛷᲈᲈ:Z

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛴᛷᛱ()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string v0, "\u5df2\u5904\u4e8e\u663e\u793a\u72b6\u6001\uff0c\u8bf7\u52ff\u91cd\u590d\u6267\u884c show() \u6307\u4ee4\u3002"

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 53
    .line 54
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object v1, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Ljava/lang/ref/WeakReference;

    .line 58
    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛴᛷᛱ()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v3, ".show on "

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲀᛷᲁᲀ()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    goto :goto_0

    .line 84
    :cond_3
    const-string v3, "window"

    .line 85
    .line 86
    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    sget-object v3, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const-string v3, ">>>"

    .line 100
    .line 101
    invoke-static {v3, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    sget-object v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 105
    .line 106
    if-nez v1, :cond_4

    .line 107
    .line 108
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 109
    .line 110
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    sput-object v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 114
    .line 115
    :cond_4
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    iget v1, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛶᲇᲈᛸ:I

    .line 119
    .line 120
    invoke-static {v1}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    const/4 v4, 0x1

    .line 125
    if-eq v1, v4, :cond_c

    .line 126
    .line 127
    const/4 v4, 0x2

    .line 128
    if-eq v1, v4, :cond_b

    .line 129
    .line 130
    const/4 v3, 0x3

    .line 131
    if-eq v1, v3, :cond_6

    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᛷᛱ()Landroid/widget/FrameLayout;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-nez v1, :cond_5

    .line 138
    .line 139
    goto/16 :goto_3

    .line 140
    .line 141
    :cond_5
    new-instance v1, Lxhss/ᛲᲇᲁᛷ;

    .line 142
    .line 143
    invoke-direct {v1, p0, v0, v2}, Lxhss/ᛲᲇᲁᛷ;-><init>(Landroid/view/View;Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;I)V

    .line 144
    .line 145
    .line 146
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᛴᛸ(Ljava/lang/Runnable;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_6
    sget-object p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛲᛴᛴ:Ljava/util/HashMap;

    .line 151
    .line 152
    if-nez p0, :cond_7

    .line 153
    .line 154
    new-instance p0, Ljava/util/HashMap;

    .line 155
    .line 156
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 157
    .line 158
    .line 159
    sput-object p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛲᛴᛴ:Ljava/util/HashMap;

    .line 160
    .line 161
    :cond_7
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛴᛷᛱ()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    new-instance v3, Lxhss/ᛳᛴᲀᲁ;

    .line 166
    .line 167
    const/16 v4, 0x10

    .line 168
    .line 169
    invoke-direct {v3, v4}, Lxhss/ᛳᛴᲀᲁ;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-interface {p0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    sget p0, Lxhss/ᲁᛶᲇᛲ;->ᛱᛱᛲᲇ:I

    .line 176
    .line 177
    new-instance p0, Landroid/content/Intent;

    .line 178
    .line 179
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛶᲇᲈᛸ()Landroid/content/ContextWrapper;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    const-class v3, Lxhss/ᲁᛶᲇᛲ;

    .line 184
    .line 185
    invoke-direct {p0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    if-nez v1, :cond_8

    .line 193
    .line 194
    const/high16 v1, 0x10000000

    .line 195
    .line 196
    invoke-virtual {p0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 197
    .line 198
    .line 199
    :cond_8
    const-string v1, "dialogXKey"

    .line 200
    .line 201
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛴᛷᛱ()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-virtual {p0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    if-nez v1, :cond_9

    .line 213
    .line 214
    :goto_1
    move v1, v2

    .line 215
    goto :goto_2

    .line 216
    :cond_9
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᲁᲁ(Landroid/app/Activity;)Landroid/widget/FrameLayout;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    if-nez v1, :cond_a

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_a
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᲁᲁ(Landroid/app/Activity;)Landroid/widget/FrameLayout;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-virtual {v1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    :goto_2
    const-string v3, "fromActivityUiStatus"

    .line 240
    .line 241
    invoke-virtual {p0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 242
    .line 243
    .line 244
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛶᲇᲈᛸ()Landroid/content/ContextWrapper;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    const-string v3, "from"

    .line 253
    .line 254
    invoke-virtual {p0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 255
    .line 256
    .line 257
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛶᲇᲈᛸ()Landroid/content/ContextWrapper;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-virtual {v1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    if-eqz p0, :cond_e

    .line 269
    .line 270
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    invoke-virtual {p0, v2, v2}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :cond_b
    new-instance p0, Lxhss/ᲁᲇᛳᛴ;

    .line 279
    .line 280
    invoke-direct {p0}, Lxhss/ᛸᛴᛴᛶ;-><init>()V

    .line 281
    .line 282
    .line 283
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 284
    .line 285
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 293
    .line 294
    .line 295
    const-string v1, "DialogX.DialogFragment \u6a21\u5f0f\u65e0\u6cd5\u652f\u6301\u975e AppCompatActivity \u542f\u52a8\u3002"

    .line 296
    .line 297
    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 298
    .line 299
    .line 300
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 301
    .line 302
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    iput-object v1, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ:Ljava/lang/ref/WeakReference;

    .line 306
    .line 307
    return-void

    .line 308
    :cond_c
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    :try_start_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_d

    .line 325
    .line 326
    invoke-static {v0, p0}, Lxhss/ᛱᛷᛵᛷ;->ᛳᲈᲈᛲ(Landroid/app/Activity;Landroid/view/View;)V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :cond_d
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    new-instance v2, Lxhss/ᛳᛵᛲᲇ;

    .line 339
    .line 340
    const/4 v3, 0x4

    .line 341
    invoke-direct {v2, v3, v0, p0}, Lxhss/ᛳᛵᛲᲇ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :catch_0
    if-eqz v0, :cond_e

    .line 349
    .line 350
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-nez v1, :cond_e

    .line 355
    .line 356
    invoke-static {v0, p0}, Lxhss/ᛱᛷᛵᛷ;->ᛳᲈᲈᛲ(Landroid/app/Activity;Landroid/view/View;)V

    .line 357
    .line 358
    .line 359
    :cond_e
    :goto_3
    return-void
.end method

.method public static ᛲᛴᲀᲈ(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const-string p0, "null"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    const-string p0, "(null)"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public static ᛳᛶᛷᲀ(Landroid/view/View;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public static ᛴᲈᛱᛴ()Landroid/app/Activity;
    .locals 1

    .line 1
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/app/Activity;

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 22
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛲᛵᲁ(Landroid/content/ContextWrapper;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroid/app/Activity;

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_3
    :goto_1
    invoke-static {}, Lxhss/ᲁᛲᲈᛵ;->ᛱᛱᛲᲇ()Landroid/app/Activity;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛲᛵᲁ(Landroid/content/ContextWrapper;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public static ᛵᛲᲁᛶ(Ljava/lang/Runnable;J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 9
    .line 10
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛸᛳᲁ()Landroid/os/Handler;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static ᛶᲇᲈᛸ()Landroid/content/ContextWrapper;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lxhss/ᲁᛲᲈᛵ;->ᛷᛵᛵᲈ()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, "DialogX \u672a\u521d\u59cb\u5316(E2)\u3002\n\u8bf7\u68c0\u67e5\u662f\u5426\u5728\u542f\u52a8\u5bf9\u8bdd\u6846\u524d\u8fdb\u884c\u521d\u59cb\u5316\u64cd\u4f5c\uff0c\u4f7f\u7528\u4ee5\u4e0b\u4ee3\u7801\u8fdb\u884c\u521d\u59cb\u5316\uff1a\nDialogX.init(context);\n\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 14
    .line 15
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :cond_0
    return-object v0
.end method

.method public static ᛷᲁᲁ(Landroid/app/Activity;)Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v0, v0, Landroid/widget/FrameLayout;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Landroid/widget/FrameLayout;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public static ᛸᛲᲀᛵ(Landroid/view/View;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᲀᛵ(Landroid/view/View;)Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public static ᛸᛴᛶᛳ(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    const-string v0, ">>>"

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static ᛸᛴᛸᛲ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛲᛴᲀᲈ(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const/16 p1, 0x8

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    const-string p1, ""

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static ᲀᲇᛳᲁ(Landroid/view/View;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛴᛷᛱ()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, ".dismiss"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 22
    .line 23
    const-string v2, ">>>"

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    sget-object v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object v1, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Ljava/lang/ref/WeakReference;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v1, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᲁᲀ;

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-interface {v1, v0}, Lxhss/ᲀᲀᲁᲀ;->ᛷᛵᛵᲈ(Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    iget v1, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛶᲇᲈᛸ:I

    .line 54
    .line 55
    invoke-static {v1}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const/4 v2, 0x1

    .line 60
    if-eq v1, v2, :cond_5

    .line 61
    .line 62
    const/4 v3, 0x2

    .line 63
    if-eq v1, v3, :cond_4

    .line 64
    .line 65
    const/4 v3, 0x3

    .line 66
    if-eq v1, v3, :cond_6

    .line 67
    .line 68
    new-instance v1, Lxhss/ᛲᲇᲁᛷ;

    .line 69
    .line 70
    invoke-direct {v1, p0, v0, v2}, Lxhss/ᛲᲇᲁᛷ;-><init>(Landroid/view/View;Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;I)V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛸᛳᲁ()Landroid/os/Handler;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    iget-object p0, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ:Ljava/lang/ref/WeakReference;

    .line 82
    .line 83
    if-eqz p0, :cond_6

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-eqz p0, :cond_6

    .line 90
    .line 91
    iget-object p0, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ:Ljava/lang/ref/WeakReference;

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Lxhss/ᲁᲇᛳᛴ;

    .line 98
    .line 99
    invoke-virtual {p0}, Lxhss/ᛸᛴᛴᛶ;->ᛷᛴᛷᛱ()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 108
    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    if-eqz v1, :cond_6

    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const-string v1, "window"

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Landroid/view/WindowManager;

    .line 128
    .line 129
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Landroid/view/View;

    .line 134
    .line 135
    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 136
    .line 137
    .line 138
    :cond_6
    :goto_0
    return-void
.end method

.method public static ᲁᛴᛴᛸ(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᛷᛱ:Ljava/lang/Thread;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᛷᛱ:Ljava/lang/Thread;

    .line 16
    .line 17
    :cond_0
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᛷᛱ:Ljava/lang/Thread;

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sput-object v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᛷᛱ:Ljava/lang/Thread;

    .line 36
    .line 37
    :cond_1
    if-ne v0, v1, :cond_2

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛸᛳᲁ()Landroid/os/Handler;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static ᲁᛴᲇᛲ(Landroid/app/Activity;)V
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    sget-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛳᲁᲇᛸ:[Ljava/lang/String;

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_2

    .line 9
    .line 10
    aget-object v3, v0, v2

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    :goto_1
    return-void

    .line 27
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :try_start_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᛷᛱ:Ljava/lang/Thread;

    .line 39
    .line 40
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    return-void

    .line 48
    :catch_0
    move-exception p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 50
    .line 51
    .line 52
    const-string p0, "DialogX.init: \u521d\u59cb\u5316\u5f02\u5e38\uff0c\u627e\u4e0d\u5230Activity\u7684\u6839\u5e03\u5c40"

    .line 53
    .line 54
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static ᲁᛷᲇᲇ(Landroid/widget/TextView;Lxhss/ᛶᛸᛸᛵ;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-nez p0, :cond_1

    .line 5
    .line 6
    :goto_0
    return-void

    .line 7
    :cond_1
    iget v0, p1, Lxhss/ᛶᛸᛸᛵ;->ᛷᛵᛵᲈ:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-lez v0, :cond_2

    .line 11
    .line 12
    int-to-float v0, v0

    .line 13
    invoke-virtual {p0, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 14
    .line 15
    .line 16
    :cond_2
    iget v0, p1, Lxhss/ᛶᛸᛸᛵ;->ᛳᲁᲇᛸ:I

    .line 17
    .line 18
    if-eq v0, v1, :cond_3

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    .line 22
    .line 23
    :cond_3
    iget v0, p1, Lxhss/ᛶᛸᛸᛵ;->ᛱᛱᛲᲇ:I

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    if-eq v0, v1, :cond_4

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 29
    .line 30
    .line 31
    :cond_4
    iget-boolean v0, p1, Lxhss/ᛶᛸᛸᛵ;->ᲇᛶᛴᲀ:Z

    .line 32
    .line 33
    if-eqz v0, :cond_5

    .line 34
    .line 35
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_5
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    iget v0, p1, Lxhss/ᛶᛸᛸᛵ;->ᛷᛴᛷᛱ:I

    .line 46
    .line 47
    if-eq v0, v1, :cond_6

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_6
    const v0, 0x7fffffff

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 57
    .line 58
    .line 59
    :goto_2
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iget-boolean p1, p1, Lxhss/ᛶᛸᛸᛵ;->ᲇᛴᲇᛵ:Z

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public static ᲁᲁᛴᲁ(Landroid/app/Activity;)V
    .locals 4

    .line 1
    sget-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    sget-object v2, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-direct {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-ne v3, p0, :cond_0

    .line 36
    .line 37
    iget-object v3, v2, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->clear()V

    .line 42
    .line 43
    .line 44
    :cond_1
    iput-object v1, v2, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Ljava/lang/ref/WeakReference;

    .line 45
    .line 46
    iput-object v1, v2, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 47
    .line 48
    sget-object v3, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    instance-of v3, v2, Lxhss/ᛳᛴᛵ;

    .line 54
    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    check-cast v2, Lxhss/ᛳᛴᛵ;

    .line 58
    .line 59
    invoke-virtual {v2}, Lxhss/ᛳᛴᛵ;->ᛴᲀᛸᛵ()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ()Landroid/app/Activity;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-ne p0, v0, :cond_4

    .line 68
    .line 69
    sget-object p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ:Ljava/lang/ref/WeakReference;

    .line 70
    .line 71
    if-eqz p0, :cond_3

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    .line 74
    .line 75
    .line 76
    :cond_3
    sput-object v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ:Ljava/lang/ref/WeakReference;

    .line 77
    .line 78
    sget-object p0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 79
    .line 80
    :cond_4
    return-void
.end method

.method public static ᲇᛸᛳᲁ()Landroid/os/Handler;
    .locals 3

    .line 1
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛲᛵᲁ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛲᛵᲁ:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/os/Handler;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    new-instance v1, Landroid/os/Handler;

    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛲᛵᲁ:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Landroid/os/Handler;

    .line 41
    .line 42
    return-object v0
.end method

.method public static ᲈᛲᛵᲁ(Landroid/content/ContextWrapper;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lxhss/ᲁᛲᲈᛵ;->ᛱᛱᛲᲇ()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    instance-of v0, p0, Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    check-cast v0, Landroid/app/Activity;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᲇᛲ(Landroid/app/Activity;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    new-instance v0, Lxhss/ᛳᛴᲀᲁ;

    .line 18
    .line 19
    const/16 v1, 0xf

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lxhss/ᛳᛴᲀᲁ;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v0}, Lxhss/ᲁᛲᲈᛵ;->ᛳᲁᲇᛸ(Landroid/content/Context;Lxhss/ᛳᛴᲀᲁ;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ:Z

    .line 3
    .line 4
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ()Landroid/app/Activity;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲀᛷᲁᲀ()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛲᛵᲁ(Landroid/content/ContextWrapper;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    const-string p0, "DialogX \u672a\u521d\u59cb\u5316(E5)\u3002\n\u8bf7\u68c0\u67e5\u662f\u5426\u5728\u542f\u52a8\u5bf9\u8bdd\u6846\u524d\u8fdb\u884c\u521d\u59cb\u5316\u64cd\u4f5c\uff0c\u4f7f\u7528\u4ee5\u4e0b\u4ee3\u7801\u8fdb\u884c\u521d\u59cb\u5316\uff1a\nDialogX.init(context);\n\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 38
    .line 39
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    iget v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛶᲇᲈᛸ:I

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    if-eq v0, v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    instance-of v0, v0, Lxhss/ᛴᛷᲀᲁ;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lxhss/ᛴᛷᲀᲁ;

    .line 61
    .line 62
    invoke-interface {v0}, Lxhss/ᛴᛷᲀᲁ;->ᲇᛴᲇᛵ()Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v1, Lcom/kongzue/dialogx/interfaces/BaseDialog$7;

    .line 67
    .line 68
    invoke-direct {v1, p0}, Lcom/kongzue/dialogx/interfaces/BaseDialog$7;-><init>(Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ(Lxhss/ᛱᲀᛲᲁ;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    const-string v1, "input_method"

    .line 89
    .line 90
    invoke-virtual {p0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const/4 v1, 0x2

    .line 101
    invoke-virtual {p0, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 102
    .line 103
    .line 104
    :cond_2
    return-void
.end method

.method public ᛱᛳᲁᲈ()Z
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x1

    .line 3
    iget v2, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᛴᲈ:I

    .line 4
    .line 5
    if-ne v2, v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lxhss/ᲁᛲᲈᛵ;->ᛷᛵᛵᲈ()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    if-ne v2, v1, :cond_2

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᛴᲈ()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 25
    .line 26
    and-int/lit8 p0, p0, 0x30

    .line 27
    .line 28
    const/16 v0, 0x10

    .line 29
    .line 30
    if-ne p0, v0, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    if-ne v2, v1, :cond_2

    .line 34
    .line 35
    :goto_0
    return v1

    .line 36
    :cond_2
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public ᛲᛴᲇᛲ()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract ᛳᛸᛵᲀ()V
.end method

.method public final ᛳᲁᲇᛸ(I)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲀᛷᲁᲀ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string p0, "DialogX \u672a\u521d\u59cb\u5316(E3)\u3002\n\u8bf7\u68c0\u67e5\u662f\u5426\u5728\u542f\u52a8\u5bf9\u8bdd\u6846\u524d\u8fdb\u884c\u521d\u59cb\u5316\u64cd\u4f5c\uff0c\u4f7f\u7528\u4ee5\u4e0b\u4ee3\u7801\u8fdb\u884c\u521d\u59cb\u5316\uff1a\nDialogX.init(context);\n\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 15
    .line 16
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ:Landroid/content/Context;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-static {v0}, Lxhss/ᲁᛷᛸᛳ;->ᛷᛵᛵᲈ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ:Landroid/content/Context;

    .line 39
    .line 40
    if-eqz p0, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    invoke-static {}, Lxhss/ᲁᛲᲈᛵ;->ᛷᛵᛵᲈ()Landroid/app/Application;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :goto_1
    invoke-static {p0}, Lxhss/ᲁᛷᛸᛳ;->ᛷᛵᛵᲈ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public final ᛳᲈᲈᛲ()Landroid/app/Activity;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ()Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    :cond_1
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Landroid/app/Activity;

    .line 29
    .line 30
    return-object p0
.end method

.method public final ᛵᛷᛲᛸ(Lxhss/ᛱᛷᛸᲁ;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    :try_start_0
    const-string v0, "setCurrentState"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛴᛷᛱ(Lxhss/ᛱᛷᛸᲁ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :catch_0
    :cond_0
    return-void
.end method

.method public abstract ᛷᛴᛷᛱ()Ljava/lang/String;
.end method

.method public final ᛸᛲᛷᛱ()Landroid/widget/FrameLayout;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲀᛷᲁᲀ()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ()Landroid/app/Activity;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const-string p0, "DialogX \u9519\u8bef\uff1a\u5728 getRootFrameLayout() \u65f6\u65e0\u6cd5\u83b7\u53d6\u7ed1\u5b9a\u7684 activity\uff0c\u8bf7\u786e\u8ba4\u662f\u5426\u6b63\u786e\u521d\u59cb\u5316\uff1a\nDialogX.init(context);\n\n\u6216\u8005\u4f7f\u7528 .show(activity) \u542f\u52a8\u5bf9\u8bdd\u6846\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 21
    .line 22
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_0
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    :cond_1
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᲁᲁ(Landroid/app/Activity;)Landroid/widget/FrameLayout;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Landroid/widget/FrameLayout;

    .line 47
    .line 48
    :goto_0
    if-nez p0, :cond_3

    .line 49
    .line 50
    new-instance p0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v1, "DialogX \u9519\u8bef\uff1a\u5728 getRootFrameLayout() \u65f6\u65e0\u6cd5\u83b7 activity("

    .line 53
    .line 54
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ") \u7684 decorView\uff0c\u8bf7\u68c0\u67e5\u8be5 activity \u662f\u5426\u6b63\u5e38\u663e\u793a\u4e14\u53ef\u4ee5\u4f7f DialogX \u57fa\u4e8e\u5176\u663e\u793a\u3002\n\u82e5\u8be5 activity \u4e0d\u53ef\u7528\uff0c\u53ef\u901a\u8fc7\u4ee5\u4e0b\u4ee3\u7801\u914d\u7f6e\u8c41\u514d DialogX \u5bf9\u8bdd\u6846\u7ed1\u5b9a\u81f3\u8be5 activity\uff0c\u4f8b\u5982\uff1a\nDialogX.unsupportedActivitiesPackageNames = new String[]{\n        \"com.bytedance.sdk.openadsdk.stub.activity\",\n        \"com.mobile.auth.gatewayauth\",\n        \"com.google.android.gms.ads\"\n};\n\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v2

    .line 73
    :cond_3
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 74
    .line 75
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Landroid/widget/FrameLayout;

    .line 83
    .line 84
    return-object p0
.end method

.method public final ᛸᛶᛴᲈ()Landroid/content/res/Resources;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_2
    invoke-static {}, Lxhss/ᲁᛲᲈᛵ;->ᛷᛵᛵᲈ()Landroid/app/Application;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-nez p0, :cond_3

    .line 45
    .line 46
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_3
    invoke-static {}, Lxhss/ᲁᛲᲈᛵ;->ᛷᛵᛵᲈ()Landroid/app/Application;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public final ᛸᛶᲈᛶ()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/view/View;

    .line 12
    .line 13
    return-object p0
.end method

.method public final ᛸᛷᲈᲈ(I)I
    .locals 1

    .line 1
    invoke-static {}, Lxhss/ᲁᛲᲈᛵ;->ᛷᛵᛵᲈ()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p0, "DialogX \u672a\u521d\u59cb\u5316(E7)\u3002\n\u8bf7\u68c0\u67e5\u662f\u5426\u5728\u542f\u52a8\u5bf9\u8bdd\u6846\u524d\u8fdb\u884c\u521d\u59cb\u5316\u64cd\u4f5c\uff0c\u4f7f\u7528\u4ee5\u4e0b\u4ee3\u7801\u8fdb\u884c\u521d\u59cb\u5316\uff1a\nDialogX.init(context);\n\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 8
    .line 9
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/high16 p0, -0x1000000

    .line 13
    .line 14
    return p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᛴᲈ()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getColor(I)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public final ᲀᛷᲁᲀ()Z
    .locals 2

    .line 1
    iget p0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛶᲇᲈᛸ:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    if-eq p0, v1, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-ne p0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_1
    :goto_0
    return v0
.end method

.method public final ᲁᛲᛴᛴ(Landroid/widget/EditText;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "input_method"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p0, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final ᲇᛴᲇᛵ()Landroidx/lifecycle/ᛷᛵᛵᲈ;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᛶᛴᲀ(F)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᛴᲈ()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p1, p0

    .line 12
    const/high16 p0, 0x3f000000    # 0.5f

    .line 13
    .line 14
    add-float/2addr p1, p0

    .line 15
    float-to-int p0, p1

    .line 16
    return p0
.end method

.method public final ᲈᛳᲀ(Z)I
    .locals 0

    .line 1
    xor-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲀᲇᛳᲁ:[I

    .line 4
    .line 5
    aget p0, p0, p1

    .line 6
    .line 7
    return p0
.end method
