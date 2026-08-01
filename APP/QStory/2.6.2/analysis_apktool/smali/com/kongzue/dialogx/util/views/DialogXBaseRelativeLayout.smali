.class public Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;
.super Landroid/widget/RelativeLayout;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final synthetic 飘花落叶言子世苏哲楪兰:I


# instance fields
.field public 飘花落叶言子世楪兰哲苏:Z

.field public 飘花落叶言子世楪兰苏哲:Landroid/graphics/Rect;

.field public 飘花落叶言子世楪哲兰苏:Ljava/lang/ref/WeakReference;

.field public 飘花落叶言子世楪哲苏兰:F

.field public 飘花落叶言子世楪苏兰哲:F

.field public 飘花落叶言子世楪苏哲兰:Z

.field public final 飘花落叶言子世苏楪兰哲:[I

.field public 飘花落叶言子世苏楪哲兰:F

.field public final 飘花落叶言子楪兰世哲苏:Z

.field public final 飘花落叶言子楪兰世苏哲:Z

.field public 飘花落叶言子楪兰哲世苏:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

.field public final 飘花落叶言子楪兰哲苏世:Z

.field public 飘花落叶言子楪兰苏世哲:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;

.field public 飘花落叶言子楪兰苏哲世:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世苏兰哲;

.field public 飘花落叶言子楪哲兰世苏:Ljava/lang/ref/WeakReference;

.field public 飘花落叶言子楪哲兰苏世:Z

.field public 飘花落叶言子楪哲苏兰世:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏世兰;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 6
    .line 7
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰世苏哲:Z

    .line 8
    .line 9
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰世哲苏:Z

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰哲苏世:Z

    .line 13
    .line 14
    new-instance v1, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪兰苏哲:Landroid/graphics/Rect;

    .line 20
    .line 21
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪兰哲苏:Z

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    new-array v1, v1, [I

    .line 25
    .line 26
    iput-object v1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世苏楪兰哲:[I

    .line 27
    .line 28
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v2, 0x1d

    .line 31
    .line 32
    if-lt v1, v2, :cond_0

    .line 33
    .line 34
    invoke-static {p0}, Landroidx/core/view/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-boolean v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰哲苏世:Z

    .line 38
    .line 39
    if-nez v2, :cond_6

    .line 40
    .line 41
    const/4 v2, 0x2

    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    sget-object v4, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[I

    .line 49
    .line 50
    invoke-virtual {v3, p2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2, p1, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    iput-boolean v3, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰世苏哲:Z

    .line 59
    .line 60
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    iput-boolean v3, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 65
    .line 66
    invoke-virtual {p2, v2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    iput-boolean v3, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰世哲苏:Z

    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 73
    .line 74
    .line 75
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰哲苏世:Z

    .line 76
    .line 77
    :cond_1
    iget-boolean p2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰世苏哲:Z

    .line 78
    .line 79
    if-eqz p2, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 85
    .line 86
    .line 87
    :cond_2
    const/4 p2, 0x0

    .line 88
    invoke-virtual {p0, p2}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪世苏哲兰(F)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    if-eqz p2, :cond_3

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    iget-object p2, p2, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 102
    .line 103
    sget-object v3, Lcom/kongzue/dialogx/DialogX$IMPL_MODE;->VIEW:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 104
    .line 105
    if-eq p2, v3, :cond_3

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 108
    .line 109
    .line 110
    :cond_3
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v0}, Landroid/view/View;->setDefaultFocusHighlightEnabled(Z)V

    .line 117
    .line 118
    .line 119
    new-instance p1, Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 120
    .line 121
    const/16 p2, 0xe

    .line 122
    .line 123
    invoke-direct {p1, p0, p2}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 124
    .line 125
    .line 126
    new-instance p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

    .line 127
    .line 128
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 129
    .line 130
    .line 131
    iput-boolean v0, p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 132
    .line 133
    iput-object p0, p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 134
    .line 135
    iput-object p1, p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 142
    .line 143
    new-instance p1, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;

    .line 144
    .line 145
    iget-object v0, p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 146
    .line 147
    sget-object v3, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 148
    .line 149
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    iget-object v3, p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 154
    .line 155
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    iget-object v4, p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 160
    .line 161
    invoke-virtual {v4}, Landroid/view/View;->getPaddingEnd()I

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    iget-object v5, p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 166
    .line 167
    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 172
    .line 173
    .line 174
    iput v0, p1, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 175
    .line 176
    iput v3, p1, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 177
    .line 178
    iput v4, p1, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 179
    .line 180
    iput v5, p1, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:I

    .line 181
    .line 182
    iget-object v0, p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 183
    .line 184
    new-instance v3, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;

    .line 185
    .line 186
    invoke-direct {v3, p2, v2, p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v0, v3}, Landroidx/core/view/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世哲苏兰(Landroid/view/View;Landroidx/core/view/飘花落叶言子世楪苏兰哲;)V

    .line 190
    .line 191
    .line 192
    const/16 v0, 0x1e

    .line 193
    .line 194
    if-lt v1, v0, :cond_4

    .line 195
    .line 196
    iget-object v0, p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 197
    .line 198
    new-instance v1, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;

    .line 199
    .line 200
    invoke-direct {v1, p2, p1}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;-><init>(Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v0, v1}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰苏世(Landroid/view/View;Landroidx/core/view/飘花落叶言子苏哲世楪兰;)V

    .line 204
    .line 205
    .line 206
    :cond_4
    iget-object v0, p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 207
    .line 208
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    iget-object v1, p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 213
    .line 214
    if-eqz v0, :cond_5

    .line 215
    .line 216
    invoke-virtual {v1}, Landroid/view/View;->requestApplyInsets()V

    .line 217
    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_5
    new-instance v0, Landroidx/compose/ui/platform/飘花落叶言子兰世楪苏哲;

    .line 221
    .line 222
    const/4 v2, 0x3

    .line 223
    invoke-direct {v0, p2, v2, p1}, Landroidx/compose/ui/platform/飘花落叶言子兰世楪苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 227
    .line 228
    .line 229
    :goto_0
    iput-object p2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰哲世苏:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

    .line 230
    .line 231
    :cond_6
    return-void
.end method


# virtual methods
.method public final callOnClick()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-super {p0}, Landroid/view/View;->callOnClick()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x4

    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰世哲苏:Z

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰苏哲世:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世苏兰哲;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-object p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪哲兰世苏:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰苏哲世:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世苏兰哲;

    .line 44
    .line 45
    invoke-interface {p0}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0
.end method

.method public getFitSystemBarUtils()Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰哲世苏:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOnSafeInsetsChangeListener()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏世兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪哲苏兰世:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪哲兰世苏:Ljava/lang/ref/WeakReference;

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
    check-cast p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 12
    .line 13
    return-object p0
.end method

.method public getRootPaddingBottom()I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世苏楪兰哲:[I

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    aget p0, p0, v0

    .line 5
    .line 6
    return p0
.end method

.method public getRootPaddingLeft()I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世苏楪兰哲:[I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget p0, p0, v0

    .line 5
    .line 6
    return p0
.end method

.method public getRootPaddingRight()I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世苏楪兰哲:[I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    aget p0, p0, v0

    .line 5
    .line 6
    return p0
.end method

.method public getRootPaddingTop()I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世苏楪兰哲:[I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aget p0, p0, v0

    .line 5
    .line 6
    return p0
.end method

.method public getSafeHeight()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪兰苏哲:Landroid/graphics/Rect;

    .line 6
    .line 7
    iget v1, p0, Landroid/graphics/Rect;->bottom:I

    .line 8
    .line 9
    sub-int/2addr v0, v1

    .line 10
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 11
    .line 12
    sub-int/2addr v0, p0

    .line 13
    int-to-float p0, v0

    .line 14
    return p0
.end method

.method public getUnsafePlace()Landroid/graphics/Rect;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪兰苏哲:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUseAreaHeight()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getRootPaddingBottom()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    sub-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public getUseAreaWidth()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getRootPaddingRight()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    sub-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子世楪哲苏兰()V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 43
    .line 44
    and-int/lit8 v0, v0, 0x30

    .line 45
    .line 46
    const/16 v1, 0x10

    .line 47
    .line 48
    if-ne v0, v1, :cond_2

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const/4 v0, 0x0

    .line 53
    :goto_0
    iput-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪兰哲苏:Z

    .line 54
    .line 55
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰世苏哲:Z

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 5
    .line 6
    and-int/lit8 p1, p1, 0x30

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪兰哲苏:Z

    .line 16
    .line 17
    if-eq v0, p1, :cond_1

    .line 18
    .line 19
    sget-object p1, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/DialogX$THEME;

    .line 20
    .line 21
    sget-object v0, Lcom/kongzue/dialogx/DialogX$THEME;->AUTO:Lcom/kongzue/dialogx/DialogX$THEME;

    .line 22
    .line 23
    if-ne p1, v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪哲兰()V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰哲苏世()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰哲世苏:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v3, v0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲兰苏;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, v0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲兰苏;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iput-object v1, v0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲兰苏;

    .line 33
    .line 34
    iput-object v1, v0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 35
    .line 36
    iput-object v1, v0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 37
    .line 38
    iput-object v1, v0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 39
    .line 40
    :cond_2
    iput-object v1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪兰哲世苏:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

    .line 41
    .line 42
    iput-object v1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪哲苏兰世:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏世兰;

    .line 43
    .line 44
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪苏哲兰:Z

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eq v0, p0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/high16 v1, 0x40a00000    # 5.0f

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(F)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    int-to-float v0, v0

    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪苏兰哲:F

    .line 43
    .line 44
    sub-float/2addr v1, v2

    .line 45
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    cmpg-float v1, v1, v0

    .line 50
    .line 51
    if-gtz v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪哲苏兰:F

    .line 58
    .line 59
    sub-float/2addr v1, v2

    .line 60
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    cmpg-float v0, v1, v0

    .line 65
    .line 66
    if-gtz v0, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->callOnClick()Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    iput-boolean v1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪苏哲兰:Z

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iput v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪苏兰哲:F

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iput v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪哲苏兰:F

    .line 85
    .line 86
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    instance-of v0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    return p0

    .line 99
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const-string v1, "input_method"

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const/4 v2, 0x2

    .line 116
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 117
    .line 118
    .line 119
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    return p0
.end method

.method public final performClick()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final requestFocus(ILandroid/graphics/Rect;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_0
    const/16 v0, 0x82

    .line 18
    .line 19
    if-ne p1, v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪哲兰苏:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪哲兰苏:Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eq v0, p0, :cond_1

    .line 38
    .line 39
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪哲兰苏:Ljava/lang/ref/WeakReference;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    if-eq v0, p0, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x1

    .line 64
    return p0

    .line 65
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    return p0
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世苏楪哲兰:F

    .line 2
    .line 3
    const/high16 v1, 0x437f0000    # 255.0f

    .line 4
    .line 5
    mul-float/2addr v0, v1

    .line 6
    float-to-int v0, v0

    .line 7
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setVisibility(I)V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpl-float v0, v0, v1

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const v0, 0x3c23d70a    # 0.01f

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(IIII)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    sget-object v0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v0, v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏哲世兰;

    .line 18
    .line 19
    const-string v1, "DialogXSafetyArea"

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v0, v0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 28
    .line 29
    if-eqz v0, :cond_e

    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    instance-of v1, v0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    if-eqz v1, :cond_c

    .line 39
    .line 40
    move-object v1, v0

    .line 41
    check-cast v1, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->getDialogXSafetyMode()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    and-int/lit8 v3, v1, 0x1

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    move v3, v4

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move v3, v2

    .line 55
    :goto_0
    and-int/lit8 v5, v1, 0x2

    .line 56
    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    move v5, v4

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move v5, v2

    .line 62
    :goto_1
    and-int/lit8 v6, v1, 0x4

    .line 63
    .line 64
    if-eqz v6, :cond_3

    .line 65
    .line 66
    move v6, v4

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    move v6, v2

    .line 69
    :goto_2
    and-int/lit8 v1, v1, 0x8

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    move v4, v2

    .line 75
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    if-eqz v5, :cond_5

    .line 79
    .line 80
    move v1, p1

    .line 81
    goto :goto_4

    .line 82
    :cond_5
    move v1, v2

    .line 83
    :goto_4
    if-eqz v3, :cond_6

    .line 84
    .line 85
    move v7, p2

    .line 86
    goto :goto_5

    .line 87
    :cond_6
    move v7, v2

    .line 88
    :goto_5
    if-eqz v4, :cond_7

    .line 89
    .line 90
    move v8, p3

    .line 91
    goto :goto_6

    .line 92
    :cond_7
    move v8, v2

    .line 93
    :goto_6
    if-eqz v6, :cond_8

    .line 94
    .line 95
    move v9, p4

    .line 96
    goto :goto_7

    .line 97
    :cond_8
    move v9, v2

    .line 98
    :goto_7
    invoke-virtual {v0, v1, v7, v8, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 99
    .line 100
    .line 101
    if-eqz v3, :cond_9

    .line 102
    .line 103
    move p2, v2

    .line 104
    :cond_9
    if-eqz v5, :cond_a

    .line 105
    .line 106
    move p1, v2

    .line 107
    :cond_a
    if-eqz v4, :cond_b

    .line 108
    .line 109
    move p3, v2

    .line 110
    :cond_b
    if-eqz v6, :cond_e

    .line 111
    .line 112
    goto :goto_8

    .line 113
    :cond_c
    const v0, 0x2409008a

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Landroid/view/ViewGroup;

    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏哲世兰;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    if-eqz v0, :cond_d

    .line 132
    .line 133
    invoke-virtual {v0, v2, v2, v2, p4}, Landroid/view/View;->setPadding(IIII)V

    .line 134
    .line 135
    .line 136
    :cond_d
    :goto_8
    move p4, v2

    .line 137
    :cond_e
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 138
    .line 139
    if-eqz v0, :cond_f

    .line 140
    .line 141
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    .line 142
    .line 143
    .line 144
    :cond_f
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(IIII)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世苏楪兰哲:[I

    .line 3
    .line 4
    aput p1, p0, v0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    aput p2, p0, p1

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    aput p3, p0, p1

    .line 11
    .line 12
    const/4 p1, 0x3

    .line 13
    aput p4, p0, p1

    .line 14
    .line 15
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪哲兰世苏:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 11
    .line 12
    sget-object v0, Lcom/kongzue/dialogx/DialogX$IMPL_MODE;->VIEW:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 13
    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    invoke-virtual {p0, p1}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪兰苏哲:Landroid/graphics/Rect;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世楪兰苏哲:Landroid/graphics/Rect;

    .line 32
    .line 33
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 34
    .line 35
    iget v1, p1, Landroid/graphics/Rect;->top:I

    .line 36
    .line 37
    iget v2, p1, Landroid/graphics/Rect;->right:I

    .line 38
    .line 39
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 40
    .line 41
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪世哲兰苏(IIII)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(F)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世苏楪哲兰:F

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/high16 v0, 0x437f0000    # 255.0f

    .line 18
    .line 19
    mul-float/2addr p1, v0

    .line 20
    float-to-int p1, p1

    .line 21
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
