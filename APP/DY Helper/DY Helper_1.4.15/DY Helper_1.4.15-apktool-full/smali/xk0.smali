.class public abstract Lxk0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final β:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final γ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final δ:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxk0;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lxk0;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lxk0;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lxk0;->δ:Ljava/util/LinkedHashSet;

    .line 28
    .line 29
    return-void
.end method

.method public static α(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0xc8

    .line 12
    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    sget-object v0, Lxk0;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-ne v2, p0, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    :goto_0
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_4
    :goto_1
    return-void
.end method

.method public static β(Landroid/graphics/Bitmap;)Z
    .locals 7

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    div-int/lit8 v2, v0, 0x2

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    div-int/lit8 v3, v1, 0x2

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    new-instance v4, Ll91;

    .line 22
    .line 23
    invoke-direct {v4, v2, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    div-int/lit8 v2, v0, 0x4

    .line 27
    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    div-int/lit8 v3, v1, 0x4

    .line 33
    .line 34
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v5, Ll91;

    .line 39
    .line 40
    invoke-direct {v5, v2, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    mul-int/lit8 v2, v0, 0x3

    .line 44
    .line 45
    div-int/lit8 v2, v2, 0x4

    .line 46
    .line 47
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    mul-int/lit8 v3, v1, 0x3

    .line 52
    .line 53
    div-int/lit8 v3, v3, 0x4

    .line 54
    .line 55
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    new-instance v6, Ll91;

    .line 60
    .line 61
    invoke-direct {v6, v2, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    filled-new-array {v4, v5, v6}, [Ll91;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Ll91;

    .line 87
    .line 88
    iget-object v4, v3, Ll91;->ε:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v4, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    iget-object v3, v3, Ll91;->ζ:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-ltz v4, :cond_0

    .line 105
    .line 106
    if-ge v4, v0, :cond_0

    .line 107
    .line 108
    if-ltz v3, :cond_0

    .line 109
    .line 110
    if-ge v3, v1, :cond_0

    .line 111
    .line 112
    invoke-virtual {p0, v4, v3}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 113
    .line 114
    .line 115
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    if-eqz v3, :cond_0

    .line 117
    .line 118
    const/4 v4, -0x1

    .line 119
    if-eq v3, v4, :cond_0

    .line 120
    .line 121
    const/high16 v4, -0x1000000

    .line 122
    .line 123
    if-eq v3, v4, :cond_0

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    const/4 p0, 0x1

    .line 127
    return p0

    .line 128
    :catchall_0
    :goto_0
    const/4 p0, 0x0

    .line 129
    return p0
.end method

.method public static γ()V
    .locals 16

    .line 1
    sget-object v0, Lxk0;->δ:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lxk0;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lwj0;

    .line 12
    .line 13
    const/16 v1, 0x16

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lwj0;-><init>(I)V

    .line 16
    .line 17
    .line 18
    sget-object v1, Lxk0;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    invoke-static {v1, v0}, Lxh;->Ч(Ljava/util/List;La80;)Z

    .line 21
    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Landroid/view/View;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    const-string v4, "DYHelper:PhotoHook"

    .line 70
    .line 71
    const/4 v5, 0x4

    .line 72
    const/4 v6, 0x0

    .line 73
    if-eqz v3, :cond_8

    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    move-object v7, v3

    .line 80
    check-cast v7, Landroid/view/View;

    .line 81
    .line 82
    move-object v8, v7

    .line 83
    :goto_2
    const/4 v9, 0x0

    .line 84
    const-string v10, ","

    .line 85
    .line 86
    const/4 v11, 0x2

    .line 87
    const/4 v12, 0x1

    .line 88
    if-eqz v8, :cond_7

    .line 89
    .line 90
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    instance-of v14, v13, Landroid/view/ViewGroup;

    .line 95
    .line 96
    if-eqz v14, :cond_3

    .line 97
    .line 98
    check-cast v13, Landroid/view/ViewGroup;

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    move-object v13, v6

    .line 102
    :goto_3
    if-nez v13, :cond_4

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v14

    .line 109
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v14

    .line 113
    const-string v15, "RTViewPager"

    .line 114
    .line 115
    invoke-static {v14, v15, v9}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 116
    .line 117
    .line 118
    move-result v15

    .line 119
    if-nez v15, :cond_6

    .line 120
    .line 121
    const-string v15, "DetailScrollableViewPager"

    .line 122
    .line 123
    invoke-static {v14, v15, v9}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 124
    .line 125
    .line 126
    move-result v14

    .line 127
    if-eqz v14, :cond_5

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_5
    move-object v8, v13

    .line 131
    goto :goto_2

    .line 132
    :cond_6
    :goto_4
    new-array v7, v11, [I

    .line 133
    .line 134
    invoke-virtual {v8, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v8}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 146
    .line 147
    aget v9, v7, v9

    .line 148
    .line 149
    aget v11, v7, v12

    .line 150
    .line 151
    const-string v13, "awemeContainer pos=("

    .line 152
    .line 153
    const-string v14, ") screenH="

    .line 154
    .line 155
    invoke-static {v13, v9, v10, v11, v14}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    invoke-static {v4, v9, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    aget v4, v7, v12

    .line 170
    .line 171
    if-ltz v4, :cond_2

    .line 172
    .line 173
    div-int/lit8 v8, v8, 0x2

    .line 174
    .line 175
    if-ge v4, v8, :cond_2

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_7
    new-array v8, v11, [I

    .line 179
    .line 180
    invoke-virtual {v7, v8}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 181
    .line 182
    .line 183
    aget v7, v8, v9

    .line 184
    .line 185
    aget v9, v8, v12

    .line 186
    .line 187
    const-string v11, "no awemeContainer, view pos=("

    .line 188
    .line 189
    const-string v13, ")"

    .line 190
    .line 191
    invoke-static {v11, v7, v10, v9, v13}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    invoke-static {v4, v7, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    aget v4, v8, v12

    .line 199
    .line 200
    if-ltz v4, :cond_2

    .line 201
    .line 202
    :goto_5
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto/16 :goto_1

    .line 206
    .line 207
    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    const-string v3, " total, "

    .line 216
    .line 217
    const-string v7, " current aweme"

    .line 218
    .line 219
    const-string v8, "triggerScan: "

    .line 220
    .line 221
    invoke-static {v8, v0, v3, v2, v7}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-static {v4, v0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-eqz v1, :cond_9

    .line 237
    .line 238
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    check-cast v1, Landroid/view/View;

    .line 243
    .line 244
    new-instance v2, Ljb;

    .line 245
    .line 246
    const/16 v3, 0x18

    .line 247
    .line 248
    invoke-direct {v2, v1, v3}, Ljb;-><init>(Landroid/view/View;I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 252
    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_9
    return-void
.end method
