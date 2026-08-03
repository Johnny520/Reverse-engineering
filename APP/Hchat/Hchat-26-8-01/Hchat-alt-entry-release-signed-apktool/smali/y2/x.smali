.class public final Ly2/x;
.super Ly1/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final A:Li0/j1;

.field public B:Lu2/k;

.field public final C:Li0/x;

.field public final D:Landroid/graphics/Rect;

.field public final E:Lw0/s;

.field public F:Lb/b;

.field public final G:Li0/j1;

.field public H:Z

.field public final I:[I

.field public p:Lfg/a;

.field public q:Ly2/c0;

.field public r:Ljava/lang/String;

.field public final s:Landroid/view/View;

.field public final t:Z

.field public final u:Ly2/a0;

.field public final v:Landroid/view/WindowManager;

.field public final w:Landroid/view/WindowManager$LayoutParams;

.field public x:Ly2/b0;

.field public y:Lu2/m;

.field public final z:Li0/j1;


# direct methods
.method public constructor <init>(Lfg/a;Ly2/c0;Ljava/lang/String;Landroid/view/View;Lu2/c;Ly2/b0;Ljava/util/UUID;Z)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ly2/z;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 v1, 0x1d

    .line 14
    .line 15
    if-lt v0, v1, :cond_1

    .line 16
    .line 17
    new-instance v0, Ly2/y;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance v0, Ly2/a0;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {p0, v1}, Ly1/a;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Ly2/x;->p:Lfg/a;

    .line 36
    .line 37
    iput-object p2, p0, Ly2/x;->q:Ly2/c0;

    .line 38
    .line 39
    iput-object p3, p0, Ly2/x;->r:Ljava/lang/String;

    .line 40
    .line 41
    iput-object p4, p0, Ly2/x;->s:Landroid/view/View;

    .line 42
    .line 43
    iput-boolean p8, p0, Ly2/x;->t:Z

    .line 44
    .line 45
    iput-object v0, p0, Ly2/x;->u:Ly2/a0;

    .line 46
    .line 47
    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "window"

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    check-cast p1, Landroid/view/WindowManager;

    .line 61
    .line 62
    iput-object p1, p0, Ly2/x;->v:Landroid/view/WindowManager;

    .line 63
    .line 64
    new-instance p1, Landroid/view/WindowManager$LayoutParams;

    .line 65
    .line 66
    invoke-direct {p1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 67
    .line 68
    .line 69
    const p2, 0x800033

    .line 70
    .line 71
    .line 72
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 73
    .line 74
    iget-object p2, p0, Ly2/x;->q:Ly2/c0;

    .line 75
    .line 76
    invoke-static {p4}, Ly2/m;->b(Landroid/view/View;)Z

    .line 77
    .line 78
    .line 79
    move-result p3

    .line 80
    iget-boolean p8, p2, Ly2/c0;->b:Z

    .line 81
    .line 82
    iget p2, p2, Ly2/c0;->a:I

    .line 83
    .line 84
    if-eqz p8, :cond_2

    .line 85
    .line 86
    if-eqz p3, :cond_2

    .line 87
    .line 88
    or-int/lit16 p2, p2, 0x2000

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    if-eqz p8, :cond_3

    .line 92
    .line 93
    if-nez p3, :cond_3

    .line 94
    .line 95
    and-int/lit16 p2, p2, -0x2001

    .line 96
    .line 97
    :cond_3
    :goto_1
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 98
    .line 99
    iget-object p2, p0, Ly2/x;->q:Ly2/c0;

    .line 100
    .line 101
    iget p2, p2, Ly2/c0;->f:I

    .line 102
    .line 103
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 104
    .line 105
    invoke-virtual {p4}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    iput-object p2, p1, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 110
    .line 111
    const/4 p2, -0x2

    .line 112
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 113
    .line 114
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 115
    .line 116
    const/4 p2, -0x3

    .line 117
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 118
    .line 119
    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    const p3, 0x7f09000e

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {p1, p2}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    iput-object p1, p0, Ly2/x;->w:Landroid/view/WindowManager$LayoutParams;

    .line 138
    .line 139
    iput-object p6, p0, Ly2/x;->x:Ly2/b0;

    .line 140
    .line 141
    sget-object p1, Lu2/m;->g:Lu2/m;

    .line 142
    .line 143
    iput-object p1, p0, Ly2/x;->y:Lu2/m;

    .line 144
    .line 145
    const/4 p1, 0x0

    .line 146
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    iput-object p2, p0, Ly2/x;->z:Li0/j1;

    .line 151
    .line 152
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, p0, Ly2/x;->A:Li0/j1;

    .line 157
    .line 158
    new-instance p1, Ld1/c0;

    .line 159
    .line 160
    const/16 p2, 0x16

    .line 161
    .line 162
    invoke-direct {p1, p0, p2}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 163
    .line 164
    .line 165
    invoke-static {p1}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    iput-object p1, p0, Ly2/x;->C:Li0/x;

    .line 170
    .line 171
    const/16 p1, 0x8

    .line 172
    .line 173
    int-to-float p1, p1

    .line 174
    new-instance p2, Landroid/graphics/Rect;

    .line 175
    .line 176
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 177
    .line 178
    .line 179
    iput-object p2, p0, Ly2/x;->D:Landroid/graphics/Rect;

    .line 180
    .line 181
    new-instance p2, Lw0/s;

    .line 182
    .line 183
    new-instance p3, Ly2/j;

    .line 184
    .line 185
    const/4 p6, 0x2

    .line 186
    invoke-direct {p3, p0, p6}, Ly2/j;-><init>(Ly2/x;I)V

    .line 187
    .line 188
    .line 189
    invoke-direct {p2, p3}, Lw0/s;-><init>(Lfg/l;)V

    .line 190
    .line 191
    .line 192
    iput-object p2, p0, Ly2/x;->E:Lw0/s;

    .line 193
    .line 194
    const p2, 0x1020002

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0, p2}, Landroid/view/View;->setId(I)V

    .line 198
    .line 199
    .line 200
    invoke-static {p4}, Landroidx/lifecycle/d0;->a(Landroid/view/View;)Landroidx/lifecycle/q;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    const p3, 0x7f06007d

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    invoke-static {p4}, Landroidx/lifecycle/d0;->b(Landroid/view/View;)Lc9/a1;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    const p3, 0x7f060081

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-static {p4}, Lac/p;->t(Landroid/view/View;)Lu3/c;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    const p3, 0x7f060080

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    new-instance p2, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    const-string p3, "Popup:"

    .line 233
    .line 234
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p2, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    const p3, 0x7f060033

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    const/4 p2, 0x0

    .line 251
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 252
    .line 253
    .line 254
    invoke-interface {p5, p1}, Lu2/c;->x0(F)F

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    invoke-virtual {p0, p1}, Landroid/view/View;->setElevation(F)V

    .line 259
    .line 260
    .line 261
    new-instance p1, Li1/l;

    .line 262
    .line 263
    const/4 p2, 0x3

    .line 264
    invoke-direct {p1, p2}, Li1/l;-><init>(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 268
    .line 269
    .line 270
    sget-object p1, Ly2/s;->a:Ls0/d;

    .line 271
    .line 272
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    iput-object p1, p0, Ly2/x;->G:Li0/j1;

    .line 277
    .line 278
    new-array p1, p6, [I

    .line 279
    .line 280
    iput-object p1, p0, Ly2/x;->I:[I

    .line 281
    .line 282
    return-void
.end method

.method private final getContent()Lfg/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfg/p;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ly2/x;->G:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lfg/p;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getDisplayBounds()Lu2/k;
    .locals 5

    .line 1
    iget-object v0, p0, Ly2/x;->q:Ly2/c0;

    .line 2
    .line 3
    iget v0, v0, Ly2/c0;->a:I

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0x200

    .line 6
    .line 7
    iget-object v1, p0, Ly2/x;->s:Landroid/view/View;

    .line 8
    .line 9
    iget-object v2, p0, Ly2/x;->D:Landroid/graphics/Rect;

    .line 10
    .line 11
    iget-object v3, p0, Ly2/x;->u:Ly2/a0;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v3, v1, v2}, Ly2/a0;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    new-instance v0, Lu2/k;

    .line 26
    .line 27
    iget v1, v2, Landroid/graphics/Rect;->left:I

    .line 28
    .line 29
    iget v3, v2, Landroid/graphics/Rect;->top:I

    .line 30
    .line 31
    iget v4, v2, Landroid/graphics/Rect;->right:I

    .line 32
    .line 33
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 34
    .line 35
    invoke-direct {v0, v1, v3, v4, v2}, Lu2/k;-><init>(IIII)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public static synthetic getParams$ui$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final getParentLayoutCoordinates()Lv1/t;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/x;->A:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv1/t;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final synthetic m(Ly2/x;)Lv1/t;
    .locals 0

    .line 1
    invoke-direct {p0}, Ly2/x;->getParentLayoutCoordinates()Lv1/t;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final setContent(Lfg/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/p;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ly2/x;->G:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final setParentLayoutCoordinates(Lv1/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/x;->A:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Li0/h0;I)V
    .locals 5

    .line 1
    const v0, -0x331e2520

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p2

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eq v2, v1, :cond_1

    .line 23
    .line 24
    move v1, v4

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, v3

    .line 27
    :goto_1
    and-int/2addr v0, v4

    .line 28
    invoke-virtual {p1, v0, v1}, Li0/h0;->S(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-direct {p0}, Ly2/x;->getContent()Lfg/p;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v0, p1, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 47
    .line 48
    .line 49
    :goto_2
    invoke-virtual {p1}, Li0/h0;->t()Li0/r1;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    new-instance v0, La1/h;

    .line 56
    .line 57
    const/4 v1, 0x7

    .line 58
    invoke-direct {v0, p0, p2, v1}, La1/h;-><init>(Ly1/a;II)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p1, Li0/r1;->d:Lfg/p;

    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ly2/x;->q:Ly2/c0;

    .line 2
    .line 3
    iget-boolean v0, v0, Ly2/c0;->c:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x4

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v1, 0x6f

    .line 24
    .line 25
    if-ne v0, v1, :cond_5

    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x1

    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return v2

    .line 55
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-ne v1, v2, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Landroid/view/KeyEvent$DispatcherState;->isTracking(Landroid/view/KeyEvent;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_5

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCanceled()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_5

    .line 72
    .line 73
    iget-object p1, p0, Ly2/x;->p:Lfg/a;

    .line 74
    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_4
    return v2

    .line 81
    :cond_5
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    return p1
.end method

.method public final getCanCalculatePosition()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/x;->C:Li0/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/x;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final getParams$ui()Landroid/view/WindowManager$LayoutParams;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/x;->w:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getParentLayoutDirection()Lu2/m;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/x;->y:Lu2/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPopupContentSize-bOM6tXw()Lu2/l;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/x;->z:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lu2/l;

    .line 8
    .line 9
    return-object v0
.end method

.method public final getPositionProvider()Ly2/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/x;->x:Ly2/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly2/x;->H:Z

    .line 2
    .line 3
    return v0
.end method

.method public getSubCompositionView()Ly1/a;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final getTestTag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/x;->r:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic getViewRoot()Landroid/view/View;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final h(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Ly1/a;->h(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-object p2, p1, Ly2/x;->q:Ly2/c0;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    iget-object p4, p1, Ly2/x;->w:Landroid/view/WindowManager$LayoutParams;

    .line 23
    .line 24
    iput p3, p4, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    iput p2, p4, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 31
    .line 32
    iget-object p2, p1, Ly2/x;->u:Ly2/a0;

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object p2, p1, Ly2/x;->v:Landroid/view/WindowManager;

    .line 38
    .line 39
    invoke-interface {p2, p0, p4}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final i(II)V
    .locals 1

    .line 1
    iget-object p1, p0, Ly2/x;->q:Ly2/c0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ly2/x;->getDisplayBounds()Lu2/k;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget p2, p1, Lu2/k;->c:I

    .line 11
    .line 12
    iget v0, p1, Lu2/k;->a:I

    .line 13
    .line 14
    sub-int/2addr p2, v0

    .line 15
    const/high16 v0, -0x80000000

    .line 16
    .line 17
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-virtual {p1}, Lu2/k;->a()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-super {p0, p2, p1}, Ly1/a;->i(II)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final n(Li0/o;Lfg/p;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ly1/a;->setParentCompositionContext(Li0/o;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Ly2/x;->setContent(Lfg/p;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Ly2/x;->H:Z

    .line 9
    .line 10
    return-void
.end method

.method public final o(Lfg/a;Ly2/c0;Ljava/lang/String;Lu2/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/x;->p:Lfg/a;

    .line 2
    .line 3
    iput-object p3, p0, Ly2/x;->r:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p1, p0, Ly2/x;->q:Ly2/c0;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Ly2/x;->q:Ly2/c0;

    .line 18
    .line 19
    iget-object p1, p0, Ly2/x;->s:Landroid/view/View;

    .line 20
    .line 21
    invoke-static {p1}, Ly2/m;->b(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-boolean p3, p2, Ly2/c0;->b:Z

    .line 26
    .line 27
    iget p2, p2, Ly2/c0;->a:I

    .line 28
    .line 29
    if-eqz p3, :cond_1

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    or-int/lit16 p2, p2, 0x2000

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    if-eqz p3, :cond_2

    .line 37
    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    and-int/lit16 p2, p2, -0x2001

    .line 41
    .line 42
    :cond_2
    :goto_0
    iget-object p1, p0, Ly2/x;->w:Landroid/view/WindowManager$LayoutParams;

    .line 43
    .line 44
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 45
    .line 46
    iget-object p2, p0, Ly2/x;->u:Ly2/a0;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object p2, p0, Ly2/x;->v:Landroid/view/WindowManager;

    .line 52
    .line 53
    invoke-interface {p2, p0, p1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    const/4 p2, 0x1

    .line 63
    if-ne p1, p2, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-static {}, Lokio/a;->k()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_4
    const/4 p2, 0x0

    .line 71
    :goto_2
    invoke-super {p0, p2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Ly1/a;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ly2/x;->E:Lw0/s;

    .line 5
    .line 6
    invoke-virtual {v0}, Lw0/s;->d()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ly2/x;->q:Ly2/c0;

    .line 10
    .line 11
    iget-boolean v0, v0, Ly2/c0;->c:Z

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v1, 0x21

    .line 18
    .line 19
    if-ge v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Ly2/x;->F:Lb/b;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Ly2/x;->p:Lfg/a;

    .line 27
    .line 28
    new-instance v1, Lb/b;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-direct {v1, v0, v2}, Lb/b;-><init>(Lfg/a;I)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Ly2/x;->F:Lb/b;

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Ly2/x;->F:Lb/b;

    .line 37
    .line 38
    invoke-static {p0, v0}, Lai/c;->d(Ly2/x;Lb/b;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ly2/x;->E:Lw0/s;

    .line 5
    .line 6
    iget-object v1, v0, Lw0/s;->h:Lq9/a;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Lq9/a;->e()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Lw0/s;->a()V

    .line 14
    .line 15
    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v1, 0x21

    .line 19
    .line 20
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Ly2/x;->F:Lb/b;

    .line 23
    .line 24
    invoke-static {p0, v0}, Lai/c;->e(Ly2/x;Lb/b;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Ly2/x;->F:Lb/b;

    .line 29
    .line 30
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Ly2/x;->q:Ly2/c0;

    .line 2
    .line 3
    iget-boolean v0, v0, Ly2/c0;->d:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 v0, 0x1

    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    cmpg-float v1, v1, v2

    .line 27
    .line 28
    if-ltz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    int-to-float v3, v3

    .line 39
    cmpl-float v1, v1, v3

    .line 40
    .line 41
    if-gez v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    cmpg-float v1, v1, v2

    .line 48
    .line 49
    if-ltz v1, :cond_1

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    int-to-float v2, v2

    .line 60
    cmpl-float v1, v1, v2

    .line 61
    .line 62
    if-ltz v1, :cond_2

    .line 63
    .line 64
    :cond_1
    iget-object p1, p0, Ly2/x;->p:Lfg/a;

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    return v0

    .line 72
    :cond_2
    if-eqz p1, :cond_4

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/4 v2, 0x4

    .line 79
    if-ne v1, v2, :cond_4

    .line 80
    .line 81
    iget-object p1, p0, Ly2/x;->p:Lfg/a;

    .line 82
    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_3
    return v0

    .line 89
    :cond_4
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    return p1
.end method

.method public final p()V
    .locals 11

    .line 1
    invoke-direct {p0}, Ly2/x;->getParentLayoutCoordinates()Lv1/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-interface {v0}, Lv1/t;->C()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_1
    invoke-interface {v0}, Lv1/t;->F()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    iget-boolean v3, p0, Ly2/x;->t:Z

    .line 23
    .line 24
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    invoke-interface {v0, v4, v5}, Lv1/t;->P(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-interface {v0, v4, v5}, Lv1/t;->m(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    :goto_1
    const/16 v0, 0x20

    .line 38
    .line 39
    shr-long v5, v3, v0

    .line 40
    .line 41
    long-to-int v5, v5

    .line 42
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const-wide v6, 0xffffffffL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    and-long/2addr v3, v6

    .line 56
    long-to-int v3, v3

    .line 57
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    int-to-long v4, v5

    .line 66
    shl-long/2addr v4, v0

    .line 67
    int-to-long v8, v3

    .line 68
    and-long/2addr v8, v6

    .line 69
    or-long v3, v4, v8

    .line 70
    .line 71
    new-instance v5, Lu2/k;

    .line 72
    .line 73
    shr-long v8, v3, v0

    .line 74
    .line 75
    long-to-int v8, v8

    .line 76
    and-long/2addr v3, v6

    .line 77
    long-to-int v3, v3

    .line 78
    shr-long v9, v1, v0

    .line 79
    .line 80
    long-to-int v0, v9

    .line 81
    add-int/2addr v0, v8

    .line 82
    and-long/2addr v1, v6

    .line 83
    long-to-int v1, v1

    .line 84
    add-int/2addr v1, v3

    .line 85
    invoke-direct {v5, v8, v3, v0, v1}, Lu2/k;-><init>(IIII)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Ly2/x;->B:Lu2/k;

    .line 89
    .line 90
    invoke-virtual {v5, v0}, Lu2/k;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_3

    .line 95
    .line 96
    iput-object v5, p0, Ly2/x;->B:Lu2/k;

    .line 97
    .line 98
    invoke-virtual {p0}, Ly2/x;->r()V

    .line 99
    .line 100
    .line 101
    :cond_3
    :goto_2
    return-void
.end method

.method public final q(Lv1/t;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ly2/x;->setParentLayoutCoordinates(Lv1/t;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ly2/x;->p()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final r()V
    .locals 13

    .line 1
    iget-object v3, p0, Ly2/x;->B:Lu2/k;

    .line 2
    .line 3
    if-nez v3, :cond_1

    .line 4
    .line 5
    :cond_0
    move-object v2, p0

    .line 6
    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p0}, Ly2/x;->getPopupContentSize-bOM6tXw()Lu2/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-wide v6, v0, Lu2/l;->a:J

    .line 14
    .line 15
    invoke-direct {p0}, Ly2/x;->getDisplayBounds()Lu2/k;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v1, v0, Lu2/k;->c:I

    .line 20
    .line 21
    iget v2, v0, Lu2/k;->a:I

    .line 22
    .line 23
    sub-int/2addr v1, v2

    .line 24
    invoke-virtual {v0}, Lu2/k;->a()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    int-to-long v1, v1

    .line 29
    const/16 v8, 0x20

    .line 30
    .line 31
    shl-long/2addr v1, v8

    .line 32
    int-to-long v4, v0

    .line 33
    const-wide v9, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v4, v9

    .line 39
    or-long/2addr v4, v1

    .line 40
    new-instance v1, Lgg/t;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    const-wide/16 v11, 0x0

    .line 46
    .line 47
    iput-wide v11, v1, Lgg/t;->g:J

    .line 48
    .line 49
    sget-object v11, Ly2/c;->m:Ly2/c;

    .line 50
    .line 51
    new-instance v0, Ly2/w;

    .line 52
    .line 53
    move-object v2, p0

    .line 54
    invoke-direct/range {v0 .. v7}, Ly2/w;-><init>(Lgg/t;Ly2/x;Lu2/k;JJ)V

    .line 55
    .line 56
    .line 57
    iget-object v3, v2, Ly2/x;->E:Lw0/s;

    .line 58
    .line 59
    invoke-virtual {v3, p0, v11, v0}, Lw0/s;->c(Ljava/lang/Object;Lfg/l;Lfg/a;)V

    .line 60
    .line 61
    .line 62
    iget-wide v0, v1, Lgg/t;->g:J

    .line 63
    .line 64
    shr-long v6, v0, v8

    .line 65
    .line 66
    long-to-int v3, v6

    .line 67
    iget-object v6, v2, Ly2/x;->w:Landroid/view/WindowManager$LayoutParams;

    .line 68
    .line 69
    iput v3, v6, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 70
    .line 71
    and-long/2addr v0, v9

    .line 72
    long-to-int v0, v0

    .line 73
    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 74
    .line 75
    iget-object v0, v2, Ly2/x;->q:Ly2/c0;

    .line 76
    .line 77
    iget-boolean v0, v0, Ly2/c0;->e:Z

    .line 78
    .line 79
    iget-object v1, v2, Ly2/x;->u:Ly2/a0;

    .line 80
    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    shr-long v7, v4, v8

    .line 84
    .line 85
    long-to-int v0, v7

    .line 86
    and-long v3, v4, v9

    .line 87
    .line 88
    long-to-int v3, v3

    .line 89
    invoke-virtual {v1, p0, v0, v3}, Ly2/a0;->b(Ly2/x;II)V

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v0, v2, Ly2/x;->v:Landroid/view/WindowManager;

    .line 96
    .line 97
    invoke-interface {v0, p0, v6}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    return-void
.end method

.method public setLayoutDirection(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setParentLayoutDirection(Lu2/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/x;->y:Lu2/m;

    .line 2
    .line 3
    return-void
.end method

.method public final setPopupContentSize-fhxjrPA(Lu2/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/x;->z:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setPositionProvider(Ly2/b0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/x;->x:Ly2/b0;

    .line 2
    .line 3
    return-void
.end method

.method public final setTestTag(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/x;->r:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
