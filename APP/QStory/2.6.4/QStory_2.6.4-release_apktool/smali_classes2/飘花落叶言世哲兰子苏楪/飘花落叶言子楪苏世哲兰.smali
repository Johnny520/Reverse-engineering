.class public final L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;

.field public 飘花落叶言子楪世兰苏哲:Landroid/view/WindowManager;

.field public 飘花落叶言子楪世哲兰苏:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世兰苏哲;

.field public final 飘花落叶言子楪世哲苏兰:I

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世兰哲苏;

.field public 飘花落叶言子楪苏世兰哲:Landroid/app/Activity;

.field public 飘花落叶言子楪苏世哲兰:Landroid/view/WindowManager$LayoutParams;

.field public final 飘花落叶言子楪苏哲世兰:I


# direct methods
.method public constructor <init>(L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世兰哲苏;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/16 v0, 0x32

    .line 13
    .line 14
    iput v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰:I

    .line 15
    .line 16
    iput-object p1, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世兰哲苏;

    .line 17
    .line 18
    iput p2, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Landroid/app/Activity;)V
    .locals 8

    .line 1
    iget-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:Landroid/app/Activity;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:Landroid/app/Activity;

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:Landroid/view/WindowManager;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:Landroid/view/WindowManager;

    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:Landroid/view/WindowManager$LayoutParams;

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    .line 24
    .line 25
    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 26
    .line 27
    .line 28
    const/16 v3, 0x3e8

    .line 29
    .line 30
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 31
    .line 32
    const/16 v3, 0x18

    .line 33
    .line 34
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 35
    .line 36
    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 37
    .line 38
    const/16 v3, 0x31

    .line 39
    .line 40
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 41
    .line 42
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 43
    .line 44
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 45
    .line 46
    iput-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:Landroid/view/WindowManager$LayoutParams;

    .line 47
    .line 48
    :cond_2
    iget-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;

    .line 49
    .line 50
    if-nez v0, :cond_4

    .line 51
    .line 52
    new-instance v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;

    .line 53
    .line 54
    invoke-direct {v0, p1}, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;-><init>(Landroid/app/Activity;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 61
    .line 62
    .line 63
    new-instance v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏哲兰;

    .line 64
    .line 65
    iget v4, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 66
    .line 67
    invoke-virtual {p1, v4}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    const/high16 v5, 0x41200000    # 10.0f

    .line 75
    .line 76
    iput v5, v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:F

    .line 77
    .line 78
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eq v7, v1, :cond_3

    .line 91
    .line 92
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 96
    .line 97
    :goto_0
    invoke-static {v5, v6, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    new-instance v5, Landroid/graphics/Canvas;

    .line 102
    .line 103
    invoke-direct {v5, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    invoke-virtual {v4, v3, v3, v6, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 118
    .line 119
    .line 120
    iput-object v1, v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/Bitmap;

    .line 121
    .line 122
    const/high16 v1, 0x42200000    # 40.0f

    .line 123
    .line 124
    invoke-static {p1, v1}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世(Landroid/content/Context;F)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    const/high16 v3, 0x41000000    # 8.0f

    .line 129
    .line 130
    iput v3, v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:F

    .line 131
    .line 132
    iput-boolean v2, v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Z

    .line 133
    .line 134
    iget-object v3, v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/Bitmap;

    .line 135
    .line 136
    invoke-static {v3, v1, v1}, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iput-object v1, v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/Bitmap;

    .line 141
    .line 142
    iput-boolean v2, v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Z

    .line 143
    .line 144
    const/4 v1, 0x5

    .line 145
    iput v1, v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 146
    .line 147
    iput-boolean v2, v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Z

    .line 148
    .line 149
    new-instance v1, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏兰哲;

    .line 150
    .line 151
    invoke-direct {v1, v0}, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏哲兰;)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;

    .line 155
    .line 156
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    new-instance v4, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲苏兰;

    .line 161
    .line 162
    iget v5, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰:I

    .line 163
    .line 164
    invoke-direct {v4, v0, v5, v1}, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;IL飘花落叶言世哲兰子苏楪/飘花落叶言子楪世苏兰哲;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v4}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 168
    .line 169
    .line 170
    :cond_4
    iget-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-nez v1, :cond_5

    .line 177
    .line 178
    iget-object v1, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:Landroid/view/WindowManager;

    .line 179
    .line 180
    iget-object v3, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;

    .line 181
    .line 182
    iget-object v4, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:Landroid/view/WindowManager$LayoutParams;

    .line 183
    .line 184
    invoke-interface {v1, v3, v4}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    new-instance v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世兰苏哲;

    .line 199
    .line 200
    invoke-direct {v0, p0, p1}, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世兰苏哲;-><init>(L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;Landroid/view/View;)V

    .line 201
    .line 202
    .line 203
    iput-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世兰苏哲;

    .line 204
    .line 205
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    iget-object p0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世兰苏哲;

    .line 210
    .line 211
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 212
    .line 213
    .line 214
    :cond_5
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:Landroid/app/Activity;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世兰苏哲;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:Landroid/view/WindowManager;

    .line 30
    .line 31
    iget-object p0, p0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;

    .line 32
    .line 33
    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method
