.class public final Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;
.super Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子世兰苏楪哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final 飘花落叶言子世兰楪哲苏:[I

.field public 飘花落叶言子世兰楪苏哲:Z

.field public 飘花落叶言子世哲兰楪苏:Landroidx/compose/ui/window/飘花落叶言子楪苏哲兰世;

.field public final 飘花落叶言子世哲兰苏楪:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

.field public final 飘花落叶言子世哲楪兰苏:Landroidx/compose/runtime/飘花落叶言子楪兰苏哲世;

.field public 飘花落叶言子世哲楪苏兰:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;

.field public final 飘花落叶言子世哲苏兰楪:Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;

.field public final 飘花落叶言子世哲苏楪兰:Landroid/graphics/Rect;

.field public final 飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/window/飘花落叶言子楪兰哲世苏;

.field public final 飘花落叶言子世楪兰苏哲:Z

.field public final 飘花落叶言子世楪哲兰苏:Landroid/view/View;

.field public 飘花落叶言子世楪哲苏兰:Ljava/lang/String;

.field public 飘花落叶言子世楪苏兰哲:Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

.field public 飘花落叶言子世楪苏哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子世苏兰哲楪:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

.field public final 飘花落叶言子世苏兰楪哲:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

.field public 飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/unit/LayoutDirection;

.field public 飘花落叶言子世苏哲楪兰:Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;

.field public final 飘花落叶言子世苏楪兰哲:Landroid/view/WindowManager$LayoutParams;

.field public final 飘花落叶言子世苏楪哲兰:Landroid/view/WindowManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/window/PopupLayout$Companion$onCommitAffectingPopupPosition$1;->INSTANCE:Landroidx/compose/ui/window/PopupLayout$Companion$onCommitAffectingPopupPosition$1;

    .line 2
    .line 3
    sput-object v0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰苏楪哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;Ljava/lang/String;Landroid/view/View;L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;Ljava/util/UUID;Z)V
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
    new-instance v0, Landroidx/compose/ui/window/飘花落叶言子楪兰苏哲世;

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
    new-instance v0, Landroidx/compose/ui/window/飘花落叶言子楪兰苏世哲;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance v0, Landroidx/compose/ui/window/飘花落叶言子楪兰哲世苏;

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
    invoke-direct {p0, v1}, Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 36
    .line 37
    iput-object p2, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

    .line 38
    .line 39
    iput-object p3, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲苏兰:Ljava/lang/String;

    .line 40
    .line 41
    iput-object p4, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲兰苏:Landroid/view/View;

    .line 42
    .line 43
    iput-boolean p8, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲:Z

    .line 44
    .line 45
    iput-object v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/window/飘花落叶言子楪兰哲世苏;

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
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪哲兰:Landroid/view/WindowManager;

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
    iget-object p2, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

    .line 75
    .line 76
    invoke-static {p4}, Landroidx/compose/ui/window/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)Z

    .line 77
    .line 78
    .line 79
    move-result p3

    .line 80
    iget-boolean p8, p2, Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 81
    .line 82
    iget p2, p2, Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:I

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
    iget-object p2, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

    .line 100
    .line 101
    iget p2, p2, Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰哲苏:I

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
    const p3, 0x24120040

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
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪兰哲:Landroid/view/WindowManager$LayoutParams;

    .line 138
    .line 139
    iput-object p6, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏哲楪兰:Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;

    .line 140
    .line 141
    sget-object p1, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 142
    .line 143
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/unit/LayoutDirection;

    .line 144
    .line 145
    const/4 p1, 0x0

    .line 146
    invoke-static {p1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    iput-object p2, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏兰楪哲:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 151
    .line 152
    invoke-static {p1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏兰哲楪:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 157
    .line 158
    new-instance p1, Landroidx/compose/ui/window/PopupLayout$canCalculatePosition$2;

    .line 159
    .line 160
    invoke-direct {p1, p0}, Landroidx/compose/ui/window/PopupLayout$canCalculatePosition$2;-><init>(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;)V

    .line 161
    .line 162
    .line 163
    invoke-static {p1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Landroidx/compose/runtime/飘花落叶言子楪兰苏哲世;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏:Landroidx/compose/runtime/飘花落叶言子楪兰苏哲世;

    .line 168
    .line 169
    new-instance p1, Landroid/graphics/Rect;

    .line 170
    .line 171
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 172
    .line 173
    .line 174
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲苏楪兰:Landroid/graphics/Rect;

    .line 175
    .line 176
    new-instance p1, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;

    .line 177
    .line 178
    new-instance p2, Landroidx/compose/ui/window/PopupLayout$snapshotStateObserver$1;

    .line 179
    .line 180
    invoke-direct {p2, p0}, Landroidx/compose/ui/window/PopupLayout$snapshotStateObserver$1;-><init>(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;)V

    .line 181
    .line 182
    .line 183
    invoke-direct {p1, p2}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 184
    .line 185
    .line 186
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲苏兰楪:Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;

    .line 187
    .line 188
    const p1, 0x1020002

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, p1}, Landroid/view/View;->setId(I)V

    .line 192
    .line 193
    .line 194
    invoke-static {p4}, Landroidx/lifecycle/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    const p2, 0x240903cc

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    invoke-static {p4}, Landroidx/lifecycle/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰哲苏(Landroid/view/View;)Landroidx/lifecycle/飘花落叶言子苏兰世楪哲;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    const p2, 0x240903d0

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-static {p4}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Landroid/view/View;)L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰哲苏;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    const p2, 0x240903cf

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    new-instance p1, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    const-string p2, "Popup:"

    .line 227
    .line 228
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    const p2, 0x240900f6

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    const/4 p1, 0x0

    .line 245
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 246
    .line 247
    .line 248
    const/high16 p1, 0x41000000    # 8.0f

    .line 249
    .line 250
    invoke-interface {p5, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏楪兰哲世(F)F

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    invoke-virtual {p0, p1}, Landroid/view/View;->setElevation(F)V

    .line 255
    .line 256
    .line 257
    new-instance p1, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪哲苏兰世;

    .line 258
    .line 259
    const/4 p2, 0x3

    .line 260
    invoke-direct {p1, p2}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪哲苏兰世;-><init>(I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 264
    .line 265
    .line 266
    sget-object p1, Landroidx/compose/ui/window/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 267
    .line 268
    invoke-static {p1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰苏楪:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 273
    .line 274
    const/4 p1, 0x2

    .line 275
    new-array p1, p1, [I

    .line 276
    .line 277
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰楪哲苏:[I

    .line 278
    .line 279
    return-void
.end method

.method private final getContent()L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰苏楪:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 10
    .line 11
    return-object p0
.end method

.method private final getDisplayBounds()L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    iget v0, v0, Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0x200

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲兰苏:Landroid/view/View;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲苏楪兰:Landroid/graphics/Rect;

    .line 10
    .line 11
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/window/飘花落叶言子楪兰哲世苏;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    invoke-virtual {p0, v2, v1}, Landroidx/compose/ui/window/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    new-instance p0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;

    .line 26
    .line 27
    iget v0, v2, Landroid/graphics/Rect;->left:I

    .line 28
    .line 29
    iget v1, v2, Landroid/graphics/Rect;->top:I

    .line 30
    .line 31
    iget v3, v2, Landroid/graphics/Rect;->right:I

    .line 32
    .line 33
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 34
    .line 35
    invoke-direct {p0, v0, v1, v3, v2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;-><init>(IIII)V

    .line 36
    .line 37
    .line 38
    return-object p0
.end method

.method public static synthetic getParams$ui$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final getParentLayoutCoordinates()Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏兰哲楪:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 10
    .line 11
    return-object p0
.end method

.method private final setContent(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰苏楪:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final setParentLayoutCoordinates(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏兰哲楪:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final synthetic 飘花落叶言子楪苏兰哲世(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;)Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->getParentLayoutCoordinates()Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    iget-boolean v0, v0, Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

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
    move-result p0

    .line 37
    return p0

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
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 74
    .line 75
    if-eqz p0, :cond_4

    .line 76
    .line 77
    invoke-interface {p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

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
    move-result p0

    .line 85
    return p0
.end method

.method public final getCanCalculatePosition()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏:Landroidx/compose/runtime/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/runtime/飘花落叶言子楪兰苏哲世;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final getParams$ui()Landroid/view/WindowManager$LayoutParams;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪兰哲:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getParentLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/unit/LayoutDirection;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPopupContentSize-bOM6tXw()L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏兰楪哲:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    return-object p0
.end method

.method public final getPositionProvider()Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏哲楪兰:Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    return-object p0
.end method

.method public getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰楪苏哲:Z

    .line 2
    .line 3
    return p0
.end method

.method public getSubCompositionView()Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final getTestTag()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲苏兰:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic getViewRoot()Landroid/view/View;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲苏兰楪:Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲兰苏()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

    .line 10
    .line 11
    iget-boolean v0, v0, Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰:Z

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
    iget-object v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏:Landroidx/compose/ui/window/飘花落叶言子楪苏哲兰世;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 27
    .line 28
    new-instance v1, Landroidx/compose/ui/window/飘花落叶言子楪苏哲兰世;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Landroidx/compose/ui/window/飘花落叶言子楪苏哲兰世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏:Landroidx/compose/ui/window/飘花落叶言子楪苏哲兰世;

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏:Landroidx/compose/ui/window/飘花落叶言子楪苏哲兰世;

    .line 36
    .line 37
    invoke-static {p0, v0}, Landroidx/compose/ui/window/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;Landroidx/compose/ui/window/飘花落叶言子楪苏哲兰世;)V

    .line 38
    .line 39
    .line 40
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
    iget-object v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲苏兰楪:Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;

    .line 5
    .line 6
    iget-object v1, v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲:Landroidx/compose/runtime/snapshots/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰()V

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
    iget-object v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏:Landroidx/compose/ui/window/飘花落叶言子楪苏哲兰世;

    .line 23
    .line 24
    invoke-static {p0, v0}, Landroidx/compose/ui/window/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;Landroidx/compose/ui/window/飘花落叶言子楪苏哲兰世;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏:Landroidx/compose/ui/window/飘花落叶言子楪苏哲兰世;

    .line 29
    .line 30
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    iget-boolean v0, v0, Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲兰苏:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

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
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 65
    .line 66
    if-eqz p0, :cond_3

    .line 67
    .line 68
    invoke-interface {p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

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
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 82
    .line 83
    if-eqz p0, :cond_3

    .line 84
    .line 85
    invoke-interface {p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

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
    move-result p0

    .line 93
    return p0
.end method

.method public setLayoutDirection(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setParentLayoutDirection(Landroidx/compose/ui/unit/LayoutDirection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/unit/LayoutDirection;

    .line 2
    .line 3
    return-void
.end method

.method public final setPopupContentSize-fhxjrPA(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏兰楪哲:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setPositionProvider(Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏哲楪兰:Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    return-void
.end method

.method public final setTestTag(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲苏兰:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 5

    .line 1
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    const v0, -0x331e2520

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p2, 0x6

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    :goto_0
    or-int/2addr v0, p2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v0, p2

    .line 26
    :goto_1
    and-int/lit8 v2, v0, 0x3

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x1

    .line 30
    if-eq v2, v1, :cond_2

    .line 31
    .line 32
    move v1, v4

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move v1, v3

    .line 35
    :goto_2
    and-int/2addr v0, v4

    .line 36
    invoke-virtual {p1, v0, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-direct {p0}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->getContent()L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v0, p1, v1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_3
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 55
    .line 56
    .line 57
    :goto_3
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    new-instance v0, Landroidx/compose/ui/window/PopupLayout$Content$4;

    .line 64
    .line 65
    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/window/PopupLayout$Content$4;-><init>(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;I)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p1, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 69
    .line 70
    :cond_4
    return-void
.end method

.method public final 飘花落叶言子楪哲世兰苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;Ljava/lang/String;Landroidx/compose/ui/unit/LayoutDirection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iput-object p3, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲苏兰:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iput-object p2, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

    .line 18
    .line 19
    iget-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲兰苏:Landroid/view/View;

    .line 20
    .line 21
    invoke-static {p1}, Landroidx/compose/ui/window/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-boolean p3, p2, Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 26
    .line 27
    iget p2, p2, Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:I

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
    iget-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪兰哲:Landroid/view/WindowManager$LayoutParams;

    .line 43
    .line 44
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 45
    .line 46
    iget-object p2, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/window/飘花落叶言子楪兰哲世苏;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object p2, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪哲兰:Landroid/view/WindowManager;

    .line 52
    .line 53
    invoke-interface {p2, p0, p1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    sget-object p1, Landroidx/compose/ui/window/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:[I

    .line 57
    .line 58
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    aget p1, p1, p2

    .line 63
    .line 64
    const/4 p2, 0x1

    .line 65
    if-eq p1, p2, :cond_4

    .line 66
    .line 67
    const/4 p3, 0x2

    .line 68
    if-ne p1, p3, :cond_3

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_4
    const/4 p2, 0x0

    .line 76
    :goto_2
    invoke-super {p0, p2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰(Landroidx/compose/runtime/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;->setParentCompositionContext(Landroidx/compose/runtime/飘花落叶言子楪苏兰哲世;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->setContent(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰楪苏哲:Z

    .line 9
    .line 10
    return-void
.end method

.method public final 飘花落叶言子楪哲兰世苏()V
    .locals 13

    .line 1
    iget-object v3, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪苏兰:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    if-nez v3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->getPopupContentSize-bOM6tXw()L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-wide v6, v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:J

    .line 13
    .line 14
    invoke-direct {p0}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->getDisplayBounds()L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v1, v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:I

    .line 19
    .line 20
    iget v2, v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

    .line 21
    .line 22
    sub-int/2addr v1, v2

    .line 23
    iget v2, v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:I

    .line 24
    .line 25
    iget v0, v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:I

    .line 26
    .line 27
    sub-int/2addr v2, v0

    .line 28
    int-to-long v0, v1

    .line 29
    const/16 v8, 0x20

    .line 30
    .line 31
    shl-long/2addr v0, v8

    .line 32
    int-to-long v4, v2

    .line 33
    const-wide v9, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v4, v9

    .line 39
    or-long/2addr v4, v0

    .line 40
    new-instance v1, Lkotlin/jvm/internal/Ref$LongRef;

    .line 41
    .line 42
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 43
    .line 44
    .line 45
    const-wide/16 v11, 0x0

    .line 46
    .line 47
    iput-wide v11, v1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 48
    .line 49
    new-instance v0, Landroidx/compose/ui/window/PopupLayout$updatePosition$1;

    .line 50
    .line 51
    move-object v2, p0

    .line 52
    invoke-direct/range {v0 .. v7}, Landroidx/compose/ui/window/PopupLayout$updatePosition$1;-><init>(Lkotlin/jvm/internal/Ref$LongRef;Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;JJ)V

    .line 53
    .line 54
    .line 55
    iget-object p0, v2, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲苏兰楪:Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;

    .line 56
    .line 57
    sget-object v3, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰苏楪哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 58
    .line 59
    invoke-virtual {p0, v2, v3, v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 60
    .line 61
    .line 62
    iget-wide v0, v1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 63
    .line 64
    shr-long v6, v0, v8

    .line 65
    .line 66
    long-to-int p0, v6

    .line 67
    iget-object v3, v2, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪兰哲:Landroid/view/WindowManager$LayoutParams;

    .line 68
    .line 69
    iput p0, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 70
    .line 71
    and-long/2addr v0, v9

    .line 72
    long-to-int p0, v0

    .line 73
    iput p0, v3, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 74
    .line 75
    iget-object p0, v2, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

    .line 76
    .line 77
    iget-boolean p0, p0, Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰苏哲:Z

    .line 78
    .line 79
    iget-object v0, v2, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/window/飘花落叶言子楪兰哲世苏;

    .line 80
    .line 81
    if-eqz p0, :cond_1

    .line 82
    .line 83
    shr-long v6, v4, v8

    .line 84
    .line 85
    long-to-int p0, v6

    .line 86
    and-long/2addr v4, v9

    .line 87
    long-to-int v1, v4

    .line 88
    invoke-virtual {v0, v2, p0, v1}, Landroidx/compose/ui/window/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;II)V

    .line 89
    .line 90
    .line 91
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget-object p0, v2, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪哲兰:Landroid/view/WindowManager;

    .line 95
    .line 96
    invoke-interface {p0, v2, v3}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    :goto_0
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰()V
    .locals 11

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->getParentLayoutCoordinates()Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-interface {v0}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏世兰()Z

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
    invoke-interface {v0}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏兰世哲()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    iget-boolean v3, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲:Z

    .line 23
    .line 24
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    invoke-interface {v0, v4, v5}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-interface {v0, v4, v5}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(J)J

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
    new-instance v5, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;

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
    invoke-direct {v5, v8, v3, v0, v1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;-><init>(IIII)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪苏兰:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;

    .line 89
    .line 90
    invoke-virtual {v5, v0}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_3

    .line 95
    .line 96
    iput-object v5, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪苏兰:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;

    .line 97
    .line 98
    invoke-virtual {p0}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏()V

    .line 99
    .line 100
    .line 101
    :cond_3
    :goto_2
    return-void
.end method

.method public final 飘花落叶言子楪哲苏兰世(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->setParentLayoutCoordinates(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏世兰()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(II)V
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->getDisplayBounds()L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget p2, p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:I

    .line 11
    .line 12
    iget v0, p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

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
    iget v1, p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:I

    .line 22
    .line 23
    iget p1, p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:I

    .line 24
    .line 25
    sub-int/2addr v1, p1

    .line 26
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-super {p0, p2, p1}, Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲(II)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(ZIIII)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object p3, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪兰哲:Landroid/view/WindowManager$LayoutParams;

    .line 22
    .line 23
    iput p2, p3, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p3, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 30
    .line 31
    iget-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/window/飘花落叶言子楪兰哲世苏;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪哲兰:Landroid/view/WindowManager;

    .line 37
    .line 38
    invoke-interface {p1, p0, p3}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
