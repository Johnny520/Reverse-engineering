.class public final La01;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Landroid/os/Handler;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static ζ:Lfb0;

.field public static η:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La01;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, La01;->β:Landroid/os/Handler;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La01;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 29
    .line 30
    const-string v2, ""

    .line 31
    .line 32
    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, La01;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 40
    .line 41
    .line 42
    sput-object v0, La01;->ε:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 43
    .line 44
    return-void
.end method

.method public static final α(Landroid/view/View;)V
    .locals 12

    .line 1
    sget-object v0, Lbe0;->α:Lbe0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbe0;->ζ()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-gtz v0, :cond_1

    .line 16
    .line 17
    :goto_0
    move-object v5, v1

    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, p0, v0}, La01;->δ(Landroid/view/View;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const/4 v2, 0x2

    .line 36
    new-array v3, v2, [I

    .line 37
    .line 38
    invoke-virtual {p0, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    int-to-float p0, p0

    .line 46
    const/high16 v4, 0x40000000    # 2.0f

    .line 47
    .line 48
    div-float/2addr p0, v4

    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-nez v5, :cond_3

    .line 58
    .line 59
    move-object v5, v1

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-nez v6, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    move-object v6, v5

    .line 73
    check-cast v6, Landroid/widget/TextView;

    .line 74
    .line 75
    new-array v7, v2, [I

    .line 76
    .line 77
    invoke-virtual {v6, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 78
    .line 79
    .line 80
    const/4 v8, 0x0

    .line 81
    aget v7, v7, v8

    .line 82
    .line 83
    aget v9, v3, v8

    .line 84
    .line 85
    sub-int/2addr v7, v9

    .line 86
    int-to-float v7, v7

    .line 87
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    int-to-float v6, v6

    .line 92
    div-float/2addr v6, v4

    .line 93
    add-float/2addr v6, v7

    .line 94
    sub-float/2addr v6, p0

    .line 95
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    move-object v9, v7

    .line 104
    check-cast v9, Landroid/widget/TextView;

    .line 105
    .line 106
    new-array v10, v2, [I

    .line 107
    .line 108
    invoke-virtual {v9, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 109
    .line 110
    .line 111
    aget v10, v10, v8

    .line 112
    .line 113
    aget v11, v3, v8

    .line 114
    .line 115
    sub-int/2addr v10, v11

    .line 116
    int-to-float v10, v10

    .line 117
    invoke-virtual {v9}, Landroid/view/View;->getWidth()I

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    int-to-float v9, v9

    .line 122
    div-float/2addr v9, v4

    .line 123
    add-float/2addr v9, v10

    .line 124
    sub-float/2addr v9, p0

    .line 125
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    invoke-static {v6, v9}, Ljava/lang/Float;->compare(FF)I

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-lez v10, :cond_6

    .line 134
    .line 135
    move-object v5, v7

    .line 136
    move v6, v9

    .line 137
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-nez v7, :cond_5

    .line 142
    .line 143
    :goto_1
    check-cast v5, Landroid/widget/TextView;

    .line 144
    .line 145
    :goto_2
    if-nez v5, :cond_7

    .line 146
    .line 147
    const-string p0, "rbe3d87ed96de26de"

    .line 148
    .line 149
    const-string v0, "\u672a\u627e\u5230\u4e2d\u592e\u6807\u9898 TextView\uff0c\u8df3\u8fc7\u53cc\u51fb\u624b\u52bf\u5b89\u88c5"

    .line 150
    .line 151
    invoke-static {p0, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_7
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 156
    .line 157
    invoke-direct {p0, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    sget-object v0, La01;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 161
    .line 162
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    sget-object p0, La01;->ε:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 166
    .line 167
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    if-lez p0, :cond_8

    .line 172
    .line 173
    invoke-static {p0}, La01;->β(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {v5, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_8
    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    if-eqz p0, :cond_9

    .line 186
    .line 187
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    :cond_9
    if-nez v1, :cond_a

    .line 192
    .line 193
    const-string v1, ""

    .line 194
    .line 195
    :cond_a
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    if-nez p0, :cond_c

    .line 200
    .line 201
    const/16 p0, 0x28

    .line 202
    .line 203
    invoke-static {v1, p0}, Lq02;->Φ(Ljava/lang/CharSequence;C)Z

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    if-eqz p0, :cond_b

    .line 208
    .line 209
    const/16 p0, 0x29

    .line 210
    .line 211
    invoke-static {v1, p0}, Lq02;->Φ(Ljava/lang/CharSequence;C)Z

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    if-eqz p0, :cond_b

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_b
    sget-object p0, La01;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 219
    .line 220
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_c
    :goto_3
    const/4 p0, 0x1

    .line 224
    invoke-virtual {v5, p0}, Landroid/view/View;->setClickable(Z)V

    .line 225
    .line 226
    .line 227
    new-instance p0, Loi0;

    .line 228
    .line 229
    const/4 v0, 0x1

    .line 230
    invoke-direct {p0, v0}, Loi0;-><init>(I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 234
    .line 235
    .line 236
    new-instance p0, Llg;

    .line 237
    .line 238
    const/4 v0, 0x5

    .line 239
    invoke-direct {p0, v0}, Llg;-><init>(I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v5, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 243
    .line 244
    .line 245
    return-void
.end method

.method public static β(I)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, La01;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v0, "\u6d88\u606f"

    .line 16
    .line 17
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, "("

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, ")"

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static γ(Z)V
    .locals 2

    .line 1
    sget-object v0, La01;->ζ:Lfb0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, La01;->β:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    sput-object v0, La01;->ζ:Lfb0;

    .line 12
    .line 13
    sget-object v0, La01;->ε:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 17
    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    sget-object v0, Lbe0;->α:Lbe0;

    .line 22
    .line 23
    invoke-virtual {v0}, Lbe0;->θ()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Lbe0;->ρ()Lae0;

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-static {}, La01;->ζ()V

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "\u4e34\u65f6\u663e\u793a\u5df2\u624b\u52a8\u53d6\u6d88 restoreImmediately="

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v0, "rbe3d87ed96de26de"

    .line 50
    .line 51
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public static δ(Landroid/view/View;Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_4

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v2, p1, p2}, La01;->δ(Landroid/view/View;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const/4 v0, 0x2

    .line 40
    new-array v2, v0, [I

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 43
    .line 44
    .line 45
    new-array v0, v0, [I

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 48
    .line 49
    .line 50
    aget v0, v0, v1

    .line 51
    .line 52
    aget v1, v2, v1

    .line 53
    .line 54
    sub-int/2addr v0, v1

    .line 55
    int-to-float v0, v0

    .line 56
    move-object v1, p0

    .line 57
    check-cast v1, Landroid/widget/TextView;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    int-to-float v1, v1

    .line 64
    const/high16 v2, 0x40000000    # 2.0f

    .line 65
    .line 66
    div-float/2addr v1, v2

    .line 67
    add-float/2addr v1, v0

    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    const/4 v0, 0x1

    .line 73
    if-ge p1, v0, :cond_3

    .line 74
    .line 75
    move p1, v0

    .line 76
    :cond_3
    int-to-float p1, p1

    .line 77
    div-float/2addr v1, p1

    .line 78
    const p1, 0x3e19999a    # 0.15f

    .line 79
    .line 80
    .line 81
    cmpg-float p1, p1, v1

    .line 82
    .line 83
    if-gtz p1, :cond_4

    .line 84
    .line 85
    const/high16 p1, 0x3f400000    # 0.75f

    .line 86
    .line 87
    cmpg-float p1, v1, p1

    .line 88
    .line 89
    if-gtz p1, :cond_4

    .line 90
    .line 91
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :cond_4
    :goto_1
    return-void
.end method

.method public static ε(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v0, "~788B5F4DE0E38014A7A1F3F88E7C9C04EDA5F6AEF63EFCCE655A148DE001A79FAC0ED051157FAA8B5C21A4618C1376FF67C513D2B9EA171EDDC206E1AAC617F550EF8436AABAFC"

    .line 4
    .line 5
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p0, v1}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    new-instance v0, Loj0;

    .line 16
    .line 17
    const/16 v1, 0x12

    .line 18
    .line 19
    invoke-direct {v0, v1}, Loj0;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const-class v1, Landroid/view/View;

    .line 23
    .line 24
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "onViewCreated"

    .line 29
    .line 30
    invoke-static {p0, v1, v0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 31
    .line 32
    .line 33
    const-string p0, "rbe3d87ed96de26de"

    .line 34
    .line 35
    const-string v0, "TitleBarUI \u53cc\u51fb\u663e\u793a Hook \u5df2\u5b89\u88c5"

    .line 36
    .line 37
    invoke-static {p0, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/ClassNotFoundException;

    .line 42
    .line 43
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {p0, v0}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0
.end method

.method public static ζ()V
    .locals 2

    .line 1
    sget-object v0, La01;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v1, La01;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Landroid/widget/TextView;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    return-void
.end method
