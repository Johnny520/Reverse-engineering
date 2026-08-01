.class public final Lcom/example/dyhelper/ui/GestureAreaView;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final ξ:Lw90;

.field public static final ο:Lx90;

.field public static final π:Ljava/util/List;

.field public static final ρ:Ljava/util/List;

.field public static final σ:Ljava/util/List;

.field public static final τ:Ljava/util/List;

.field public static final υ:Ljava/util/List;

.field public static final φ:Ljava/util/Set;


# instance fields
.field public final ε:Landroid/graphics/Paint;

.field public final ζ:Landroid/graphics/Paint;

.field public final η:Landroid/graphics/Paint;

.field public final θ:Landroid/graphics/Paint;

.field public final ι:Ljava/lang/Object;

.field public κ:Ljava/lang/String;

.field public final λ:Ljava/util/LinkedHashMap;

.field public μ:Lw90;

.field public ν:La80;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    .line 1
    new-instance v0, Lw90;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    const/4 v8, 0x0

    .line 5
    const v1, 0x3eaaaaab

    .line 6
    .line 7
    .line 8
    const v2, 0x3f2aaaab

    .line 9
    .line 10
    .line 11
    const v3, 0x3eaaaaab

    .line 12
    .line 13
    .line 14
    const v4, 0x3f2aaaab

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x0

    .line 19
    invoke-direct/range {v0 .. v8}, Lw90;-><init>(FFFFFFFF)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 23
    .line 24
    new-instance v0, Lx90;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, v1, v1}, Lx90;-><init>(ZZ)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->ο:Lx90;

    .line 31
    .line 32
    const-string v9, "\u5e95\u90e8\u533a\u57df"

    .line 33
    .line 34
    const-string v10, "\u53f3\u4e0b\u533a\u57df"

    .line 35
    .line 36
    const-string v2, "\u5de6\u4e0a\u533a\u57df"

    .line 37
    .line 38
    const-string v3, "\u9876\u90e8\u533a\u57df"

    .line 39
    .line 40
    const-string v4, "\u53f3\u4e0a\u533a\u57df"

    .line 41
    .line 42
    const-string v5, "\u5de6\u4fa7\u4e92\u52a8\u533a"

    .line 43
    .line 44
    const-string v6, "\u4e2d\u95f4\u533a\u57df"

    .line 45
    .line 46
    const-string v7, "\u53f3\u4fa7\u4e92\u52a8\u533a"

    .line 47
    .line 48
    const-string v8, "\u5de6\u4e0b\u533a\u57df"

    .line 49
    .line 50
    filled-new-array/range {v2 .. v10}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->π:Ljava/util/List;

    .line 59
    .line 60
    const-string v0, "double_tap"

    .line 61
    .line 62
    const-string v1, "long_press"

    .line 63
    .line 64
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->ρ:Ljava/util/List;

    .line 73
    .line 74
    const/high16 v0, 0x3f000000    # 0.5f

    .line 75
    .line 76
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const/high16 v0, 0x3f400000    # 0.75f

    .line 81
    .line 82
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    const/high16 v0, 0x3f800000    # 1.0f

    .line 87
    .line 88
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 93
    .line 94
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 99
    .line 100
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    const/high16 v0, 0x40000000    # 2.0f

    .line 105
    .line 106
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    const/high16 v0, 0x40400000    # 3.0f

    .line 111
    .line 112
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    const/high16 v0, 0x40800000    # 4.0f

    .line 117
    .line 118
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    const/high16 v0, 0x40a00000    # 5.0f

    .line 123
    .line 124
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    filled-new-array/range {v1 .. v9}, [Ljava/lang/Float;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    sput-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->σ:Ljava/util/List;

    .line 137
    .line 138
    const-string v5, "\u6253\u5f00\u4f5c\u8005\u4e3b\u9875"

    .line 139
    .line 140
    const-string v6, "\u5173\u6ce8\u4f5c\u8005"

    .line 141
    .line 142
    const-string v1, "\u70b9\u8d5e\u4f5c\u54c1"

    .line 143
    .line 144
    const-string v2, "\u6253\u5f00\u8bc4\u8bba\u533a"

    .line 145
    .line 146
    const-string v3, "\u6536\u85cf\u4f5c\u54c1"

    .line 147
    .line 148
    const-string v4, "\u5206\u4eab\u4f5c\u54c1"

    .line 149
    .line 150
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    sput-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->τ:Ljava/util/List;

    .line 159
    .line 160
    const-string v19, "\u6a21\u5757\u83dc\u5355"

    .line 161
    .line 162
    const-string v20, "\u4e0d\u611f\u5174\u8da3"

    .line 163
    .line 164
    const-string v1, "\u65e0"

    .line 165
    .line 166
    const-string v2, "\u53d1\u5e03\u6309\u94ae"

    .line 167
    .line 168
    const-string v3, "\u89c2\u770b\u5386\u53f2\u8bb0\u5f55"

    .line 169
    .line 170
    const-string v4, "\u4e0b\u8f7d\u4f5c\u54c1"

    .line 171
    .line 172
    const-string v5, "\u4e0b\u8f7d\u97f3\u9891"

    .line 173
    .line 174
    const-string v6, "\u6dfb\u52a0\u4f5c\u54c1\u4e66\u7b7e"

    .line 175
    .line 176
    const-string v7, "\u6dfb\u52a0\u4e2a\u4eba\u4e3b\u9875\u4e66\u7b7e"

    .line 177
    .line 178
    const-string v8, "\u4fee\u6539\u500d\u901f"

    .line 179
    .line 180
    const-string v9, "\u70b9\u8d5e\u4f5c\u54c1"

    .line 181
    .line 182
    const-string v10, "\u6253\u5f00\u8bc4\u8bba\u533a"

    .line 183
    .line 184
    const-string v11, "\u6536\u85cf\u4f5c\u54c1"

    .line 185
    .line 186
    const-string v12, "\u5206\u4eab\u4f5c\u54c1"

    .line 187
    .line 188
    const-string v13, "\u6253\u5f00\u4f5c\u8005\u4e3b\u9875"

    .line 189
    .line 190
    const-string v14, "\u5173\u6ce8\u4f5c\u8005"

    .line 191
    .line 192
    const-string v15, "\u4e00\u952e\u5df2\u8bfb"

    .line 193
    .line 194
    const-string v16, "\u4e00\u952e\u7eed\u706b\u82b1"

    .line 195
    .line 196
    const-string v17, "\u6e05\u723d\u6a21\u5f0f\u5f00\u5173"

    .line 197
    .line 198
    const-string v18, "\u5207\u6362\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 199
    .line 200
    filled-new-array/range {v1 .. v20}, [Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    sput-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->υ:Ljava/util/List;

    .line 209
    .line 210
    const-string v18, "\u6a21\u5757\u83dc\u5355"

    .line 211
    .line 212
    const-string v19, "\u4e0d\u611f\u5174\u8da3"

    .line 213
    .line 214
    const-string v1, "\u53d1\u5e03\u6309\u94ae"

    .line 215
    .line 216
    const-string v2, "\u89c2\u770b\u5386\u53f2\u8bb0\u5f55"

    .line 217
    .line 218
    const-string v3, "\u4e0b\u8f7d\u4f5c\u54c1"

    .line 219
    .line 220
    const-string v4, "\u4e0b\u8f7d\u97f3\u9891"

    .line 221
    .line 222
    const-string v5, "\u6dfb\u52a0\u4f5c\u54c1\u4e66\u7b7e"

    .line 223
    .line 224
    const-string v6, "\u6dfb\u52a0\u4e2a\u4eba\u4e3b\u9875\u4e66\u7b7e"

    .line 225
    .line 226
    const-string v7, "\u4fee\u6539\u500d\u901f"

    .line 227
    .line 228
    const-string v8, "\u70b9\u8d5e\u4f5c\u54c1"

    .line 229
    .line 230
    const-string v9, "\u6253\u5f00\u8bc4\u8bba\u533a"

    .line 231
    .line 232
    const-string v10, "\u6536\u85cf\u4f5c\u54c1"

    .line 233
    .line 234
    const-string v11, "\u5206\u4eab\u4f5c\u54c1"

    .line 235
    .line 236
    const-string v12, "\u6253\u5f00\u4f5c\u8005\u4e3b\u9875"

    .line 237
    .line 238
    const-string v13, "\u5173\u6ce8\u4f5c\u8005"

    .line 239
    .line 240
    const-string v14, "\u4e00\u952e\u5df2\u8bfb"

    .line 241
    .line 242
    const-string v15, "\u4e00\u952e\u7eed\u706b\u82b1"

    .line 243
    .line 244
    const-string v16, "\u6e05\u723d\u6a21\u5f0f\u5f00\u5173"

    .line 245
    .line 246
    const-string v17, "\u5207\u6362\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 247
    .line 248
    filled-new-array/range {v1 .. v19}, [Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    sput-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->φ:Ljava/util/Set;

    .line 257
    .line 258
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 347
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, Lcom/example/dyhelper/ui/GestureAreaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 345
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/example/dyhelper/ui/GestureAreaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Landroid/graphics/Paint;

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 11
    .line 12
    .line 13
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 14
    .line 15
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/example/dyhelper/ui/GestureAreaView;->ε:Landroid/graphics/Paint;

    .line 19
    .line 20
    new-instance p1, Landroid/graphics/Paint;

    .line 21
    .line 22
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 23
    .line 24
    .line 25
    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 26
    .line 27
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 28
    .line 29
    .line 30
    const/high16 v0, 0x3f800000    # 1.0f

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/example/dyhelper/ui/GestureAreaView;->ζ:Landroid/graphics/Paint;

    .line 40
    .line 41
    new-instance p1, Landroid/graphics/Paint;

    .line 42
    .line 43
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 44
    .line 45
    .line 46
    const/high16 v0, 0x41280000    # 10.5f

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/example/dyhelper/ui/GestureAreaView;->θ(F)F

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lcom/example/dyhelper/ui/GestureAreaView;->η:Landroid/graphics/Paint;

    .line 61
    .line 62
    new-instance p1, Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 68
    .line 69
    .line 70
    const/high16 p2, 0x40000000    # 2.0f

    .line 71
    .line 72
    invoke-virtual {p0, p2}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lcom/example/dyhelper/ui/GestureAreaView;->θ:Landroid/graphics/Paint;

    .line 80
    .line 81
    const-string p1, "#6E8FD9"

    .line 82
    .line 83
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance v0, Ll91;

    .line 92
    .line 93
    const-string p2, "\u5de6\u4e0a\u533a\u57df"

    .line 94
    .line 95
    invoke-direct {v0, p2, p1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    const-string p1, "#8E6BD9"

    .line 99
    .line 100
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance v1, Ll91;

    .line 109
    .line 110
    const-string p2, "\u5de6\u4fa7\u4e92\u52a8\u533a"

    .line 111
    .line 112
    invoke-direct {v1, p2, p1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    const-string p1, "#4A90D9"

    .line 116
    .line 117
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    new-instance v2, Ll91;

    .line 126
    .line 127
    const-string p2, "\u9876\u90e8\u533a\u57df"

    .line 128
    .line 129
    invoke-direct {v2, p2, p1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    const-string p1, "#42A7A2"

    .line 133
    .line 134
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    new-instance v3, Ll91;

    .line 143
    .line 144
    const-string p2, "\u53f3\u4e0a\u533a\u57df"

    .line 145
    .line 146
    invoke-direct {v3, p2, p1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    const-string p1, "#6DBB75"

    .line 150
    .line 151
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    new-instance v4, Ll91;

    .line 160
    .line 161
    const-string p2, "\u4e2d\u95f4\u533a\u57df"

    .line 162
    .line 163
    invoke-direct {v4, p2, p1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    const-string p1, "#B889D6"

    .line 167
    .line 168
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    new-instance v5, Ll91;

    .line 177
    .line 178
    const-string p2, "\u5de6\u4e0b\u533a\u57df"

    .line 179
    .line 180
    invoke-direct {v5, p2, p1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    const-string p1, "#E2A34D"

    .line 184
    .line 185
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    new-instance v6, Ll91;

    .line 194
    .line 195
    const-string p2, "\u5e95\u90e8\u533a\u57df"

    .line 196
    .line 197
    invoke-direct {v6, p2, p1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    const-string p1, "#D95F6A"

    .line 201
    .line 202
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    new-instance v7, Ll91;

    .line 211
    .line 212
    const-string p2, "\u53f3\u4fa7\u4e92\u52a8\u533a"

    .line 213
    .line 214
    invoke-direct {v7, p2, p1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    const-string p1, "#C9A23A"

    .line 218
    .line 219
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    new-instance v8, Ll91;

    .line 228
    .line 229
    const-string p2, "\u53f3\u4e0b\u533a\u57df"

    .line 230
    .line 231
    invoke-direct {v8, p2, p1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    filled-new-array/range {v0 .. v8}, [Ll91;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-static {p1}, Lex0;->Μ([Ll91;)Ljava/util/Map;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    iput-object p1, p0, Lcom/example/dyhelper/ui/GestureAreaView;->ι:Ljava/lang/Object;

    .line 243
    .line 244
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 245
    .line 246
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 247
    .line 248
    .line 249
    iput-object p1, p0, Lcom/example/dyhelper/ui/GestureAreaView;->λ:Ljava/util/LinkedHashMap;

    .line 250
    .line 251
    invoke-static {}, Li2;->σ()Lw90;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    iput-object p1, p0, Lcom/example/dyhelper/ui/GestureAreaView;->μ:Lw90;

    .line 256
    .line 257
    invoke-virtual {p0}, Lcom/example/dyhelper/ui/GestureAreaView;->β()V

    .line 258
    .line 259
    .line 260
    invoke-static {}, Lui1;->Α()Z

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    if-nez p1, :cond_0

    .line 265
    .line 266
    goto :goto_1

    .line 267
    :cond_0
    sget-object p1, Lcom/example/dyhelper/ui/GestureAreaView;->π:Ljava/util/List;

    .line 268
    .line 269
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result p2

    .line 277
    if-eqz p2, :cond_4

    .line 278
    .line 279
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    check-cast p2, Ljava/lang/String;

    .line 284
    .line 285
    sget-object p3, Lcom/example/dyhelper/ui/GestureAreaView;->ρ:Ljava/util/List;

    .line 286
    .line 287
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object p3

    .line 291
    :cond_2
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_1

    .line 296
    .line 297
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    check-cast v0, Ljava/lang/String;

    .line 302
    .line 303
    invoke-static {p2, v0}, Li2;->ω(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    const-string v2, "\u65e0"

    .line 308
    .line 309
    invoke-static {v1, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-static {v2}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    if-nez v2, :cond_3

    .line 322
    .line 323
    invoke-static {v1, v3}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    :cond_3
    iget-object v1, p0, Lcom/example/dyhelper/ui/GestureAreaView;->λ:Ljava/util/LinkedHashMap;

    .line 327
    .line 328
    invoke-virtual {v1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    check-cast v1, Ljava/util/Map;

    .line 333
    .line 334
    if-eqz v1, :cond_2

    .line 335
    .line 336
    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    goto :goto_0

    .line 340
    :cond_4
    :goto_1
    const/4 p1, 0x0

    .line 341
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 342
    .line 343
    .line 344
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x0

    .line 346
    invoke-direct {p0, p1, p2, p3}, Lcom/example/dyhelper/ui/GestureAreaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final getOnAreaSelectedListener()La80;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La80;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/ui/GestureAreaView;->ν:La80;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSelectedArea()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/ui/GestureAreaView;->κ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    int-to-float v2, v2

    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    int-to-float v3, v3

    .line 21
    const/4 v4, 0x0

    .line 22
    cmpg-float v5, v2, v4

    .line 23
    .line 24
    if-lez v5, :cond_31

    .line 25
    .line 26
    cmpg-float v5, v3, v4

    .line 27
    .line 28
    if-gtz v5, :cond_0

    .line 29
    .line 30
    goto/16 :goto_20

    .line 31
    .line 32
    :cond_0
    iget-object v5, v0, Lcom/example/dyhelper/ui/GestureAreaView;->μ:Lw90;

    .line 33
    .line 34
    invoke-static {v2, v3, v5}, Li2;->ι(FFLw90;)Lv90;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    iget v7, v6, Lv90;->β:F

    .line 39
    .line 40
    iget v8, v6, Lv90;->α:F

    .line 41
    .line 42
    iget v9, v5, Lw90;->α:F

    .line 43
    .line 44
    invoke-virtual {v6}, Lv90;->β()F

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    mul-float/2addr v10, v9

    .line 49
    add-float/2addr v10, v8

    .line 50
    iget v9, v5, Lw90;->β:F

    .line 51
    .line 52
    invoke-virtual {v6}, Lv90;->β()F

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    mul-float/2addr v11, v9

    .line 57
    add-float/2addr v11, v8

    .line 58
    iget v9, v5, Lw90;->γ:F

    .line 59
    .line 60
    invoke-virtual {v6}, Lv90;->α()F

    .line 61
    .line 62
    .line 63
    move-result v12

    .line 64
    mul-float/2addr v12, v9

    .line 65
    add-float/2addr v12, v7

    .line 66
    iget v5, v5, Lw90;->δ:F

    .line 67
    .line 68
    invoke-virtual {v6}, Lv90;->α()F

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    mul-float/2addr v9, v5

    .line 73
    add-float/2addr v9, v7

    .line 74
    sget-object v5, Lcom/example/dyhelper/ui/GestureAreaView;->π:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v13

    .line 80
    const/4 v15, 0x0

    .line 81
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v16

    .line 85
    move/from16 v17, v4

    .line 86
    .line 87
    if-eqz v16, :cond_26

    .line 88
    .line 89
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v16

    .line 93
    add-int/lit8 v19, v15, 0x1

    .line 94
    .line 95
    if-ltz v15, :cond_25

    .line 96
    .line 97
    move-object/from16 v4, v16

    .line 98
    .line 99
    check-cast v4, Ljava/lang/String;

    .line 100
    .line 101
    div-int/lit8 v14, v15, 0x3

    .line 102
    .line 103
    rem-int/lit8 v15, v15, 0x3

    .line 104
    .line 105
    if-eqz v15, :cond_2

    .line 106
    .line 107
    move/from16 v21, v7

    .line 108
    .line 109
    const/4 v7, 0x1

    .line 110
    if-eq v15, v7, :cond_1

    .line 111
    .line 112
    move/from16 v22, v11

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    move/from16 v22, v10

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    move/from16 v21, v7

    .line 119
    .line 120
    const/4 v7, 0x1

    .line 121
    move/from16 v22, v8

    .line 122
    .line 123
    :goto_1
    if-eqz v15, :cond_4

    .line 124
    .line 125
    if-eq v15, v7, :cond_3

    .line 126
    .line 127
    iget v15, v6, Lv90;->γ:F

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_3
    move v15, v11

    .line 131
    goto :goto_2

    .line 132
    :cond_4
    move v15, v10

    .line 133
    :goto_2
    if-eqz v14, :cond_6

    .line 134
    .line 135
    if-eq v14, v7, :cond_5

    .line 136
    .line 137
    move/from16 v23, v9

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_5
    move/from16 v23, v12

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_6
    move/from16 v23, v21

    .line 144
    .line 145
    :goto_3
    if-eqz v14, :cond_8

    .line 146
    .line 147
    if-eq v14, v7, :cond_7

    .line 148
    .line 149
    iget v7, v6, Lv90;->δ:F

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_7
    move v7, v9

    .line 153
    goto :goto_4

    .line 154
    :cond_8
    move v7, v12

    .line 155
    :goto_4
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 156
    .line 157
    .line 158
    move-result-object v14

    .line 159
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-static {v14}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    move-object/from16 v24, v6

    .line 167
    .line 168
    iget-object v6, v14, Lxx;->η:Ljava/lang/String;

    .line 169
    .line 170
    move-object/from16 v25, v6

    .line 171
    .line 172
    const/high16 v6, 0x40400000    # 3.0f

    .line 173
    .line 174
    invoke-virtual {v0, v6}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    move/from16 v26, v6

    .line 179
    .line 180
    new-instance v6, Landroid/graphics/RectF;

    .line 181
    .line 182
    move/from16 v27, v7

    .line 183
    .line 184
    add-float v7, v22, v26

    .line 185
    .line 186
    move/from16 v22, v8

    .line 187
    .line 188
    add-float v8, v23, v26

    .line 189
    .line 190
    sub-float v15, v15, v26

    .line 191
    .line 192
    move/from16 v23, v9

    .line 193
    .line 194
    sub-float v9, v27, v26

    .line 195
    .line 196
    invoke-direct {v6, v7, v8, v15, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    cmpg-float v7, v7, v17

    .line 204
    .line 205
    if-lez v7, :cond_9

    .line 206
    .line 207
    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    cmpg-float v7, v7, v17

    .line 212
    .line 213
    if-gtz v7, :cond_b

    .line 214
    .line 215
    :cond_9
    move/from16 v28, v10

    .line 216
    .line 217
    :cond_a
    :goto_5
    move/from16 v30, v11

    .line 218
    .line 219
    move/from16 v31, v12

    .line 220
    .line 221
    const/4 v11, 0x0

    .line 222
    goto/16 :goto_1a

    .line 223
    .line 224
    :cond_b
    iget-object v7, v0, Lcom/example/dyhelper/ui/GestureAreaView;->ι:Ljava/lang/Object;

    .line 225
    .line 226
    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    check-cast v7, Ljava/lang/Integer;

    .line 231
    .line 232
    if-eqz v7, :cond_c

    .line 233
    .line 234
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    goto :goto_6

    .line 239
    :cond_c
    const v7, -0x777778

    .line 240
    .line 241
    .line 242
    :goto_6
    sget-object v8, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 243
    .line 244
    iget-object v9, v0, Lcom/example/dyhelper/ui/GestureAreaView;->ε:Landroid/graphics/Paint;

    .line 245
    .line 246
    invoke-virtual {v9, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v9, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 250
    .line 251
    .line 252
    iget-boolean v7, v14, Lxx;->α:Z

    .line 253
    .line 254
    if-eqz v7, :cond_d

    .line 255
    .line 256
    const/16 v7, 0x48

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_d
    const/16 v7, 0x2a

    .line 260
    .line 261
    :goto_7
    invoke-virtual {v9, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 262
    .line 263
    .line 264
    const/high16 v7, 0x41200000    # 10.0f

    .line 265
    .line 266
    invoke-virtual {v0, v7}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 267
    .line 268
    .line 269
    move-result v8

    .line 270
    invoke-virtual {v0, v7}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 271
    .line 272
    .line 273
    move-result v15

    .line 274
    invoke-virtual {v1, v6, v8, v15, v9}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 275
    .line 276
    .line 277
    const/16 v8, 0xff

    .line 278
    .line 279
    invoke-virtual {v9, v8}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 280
    .line 281
    .line 282
    iget-object v8, v14, Lxx;->δ:Ljava/lang/String;

    .line 283
    .line 284
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 285
    .line 286
    .line 287
    move-result v8

    .line 288
    iget-object v9, v0, Lcom/example/dyhelper/ui/GestureAreaView;->ζ:Landroid/graphics/Paint;

    .line 289
    .line 290
    invoke-virtual {v9, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, v7}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    invoke-virtual {v0, v7}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 298
    .line 299
    .line 300
    move-result v7

    .line 301
    invoke-virtual {v1, v6, v8, v7, v9}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 302
    .line 303
    .line 304
    iget-object v7, v0, Lcom/example/dyhelper/ui/GestureAreaView;->λ:Ljava/util/LinkedHashMap;

    .line 305
    .line 306
    invoke-virtual {v7, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v7

    .line 310
    check-cast v7, Ljava/util/Map;

    .line 311
    .line 312
    if-eqz v7, :cond_e

    .line 313
    .line 314
    const-string v8, "double_tap"

    .line 315
    .line 316
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    check-cast v8, Ljava/lang/String;

    .line 321
    .line 322
    goto :goto_8

    .line 323
    :cond_e
    const/4 v8, 0x0

    .line 324
    :goto_8
    invoke-static {v8}, Li2;->μ(Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    if-eqz v7, :cond_f

    .line 329
    .line 330
    const-string v9, "long_press"

    .line 331
    .line 332
    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v7

    .line 336
    check-cast v7, Ljava/lang/String;

    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_f
    const/4 v7, 0x0

    .line 340
    :goto_9
    invoke-static {v7}, Li2;->μ(Ljava/lang/String;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    const/high16 v15, 0x42780000    # 62.0f

    .line 349
    .line 350
    invoke-virtual {v0, v15}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 351
    .line 352
    .line 353
    move-result v15

    .line 354
    cmpg-float v9, v9, v15

    .line 355
    .line 356
    if-gez v9, :cond_10

    .line 357
    .line 358
    const/4 v9, 0x1

    .line 359
    goto :goto_a

    .line 360
    :cond_10
    const/4 v9, 0x0

    .line 361
    :goto_a
    if-eqz v9, :cond_11

    .line 362
    .line 363
    const/high16 v15, 0x41180000    # 9.5f

    .line 364
    .line 365
    :goto_b
    invoke-virtual {v0, v15}, Lcom/example/dyhelper/ui/GestureAreaView;->θ(F)F

    .line 366
    .line 367
    .line 368
    move-result v15

    .line 369
    goto :goto_c

    .line 370
    :cond_11
    const v15, 0x412ccccd    # 10.8f

    .line 371
    .line 372
    .line 373
    goto :goto_b

    .line 374
    :goto_c
    move-object/from16 v26, v6

    .line 375
    .line 376
    if-eqz v9, :cond_12

    .line 377
    .line 378
    const v6, 0x4109999a    # 8.6f

    .line 379
    .line 380
    .line 381
    :goto_d
    invoke-virtual {v0, v6}, Lcom/example/dyhelper/ui/GestureAreaView;->θ(F)F

    .line 382
    .line 383
    .line 384
    move-result v6

    .line 385
    goto :goto_e

    .line 386
    :cond_12
    const v6, 0x411ccccd    # 9.8f

    .line 387
    .line 388
    .line 389
    goto :goto_d

    .line 390
    :goto_e
    if-eqz v9, :cond_13

    .line 391
    .line 392
    const v9, 0x3f99999a    # 1.2f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0, v9}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 396
    .line 397
    .line 398
    move-result v9

    .line 399
    move/from16 v27, v9

    .line 400
    .line 401
    goto :goto_f

    .line 402
    :cond_13
    const/high16 v9, 0x40000000    # 2.0f

    .line 403
    .line 404
    invoke-virtual {v0, v9}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 405
    .line 406
    .line 407
    move-result v27

    .line 408
    :goto_f
    new-instance v9, Ly90;

    .line 409
    .line 410
    iget-object v14, v14, Lxx;->ζ:Ljava/lang/String;

    .line 411
    .line 412
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 413
    .line 414
    .line 415
    move-result v14

    .line 416
    move/from16 v28, v10

    .line 417
    .line 418
    sget-object v10, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 419
    .line 420
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    invoke-direct {v9, v4, v15, v14, v10}, Ly90;-><init>(Ljava/lang/String;FILandroid/graphics/Typeface;)V

    .line 424
    .line 425
    .line 426
    new-instance v4, Ly90;

    .line 427
    .line 428
    const-string v10, "\u53cc\u51fb\uff1a"

    .line 429
    .line 430
    invoke-virtual {v10, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 435
    .line 436
    .line 437
    move-result v10

    .line 438
    sget-object v14, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 439
    .line 440
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    invoke-direct {v4, v8, v6, v10, v14}, Ly90;-><init>(Ljava/lang/String;FILandroid/graphics/Typeface;)V

    .line 444
    .line 445
    .line 446
    new-instance v8, Ly90;

    .line 447
    .line 448
    const-string v10, "\u957f\u6309\uff1a"

    .line 449
    .line 450
    invoke-virtual {v10, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v7

    .line 454
    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 455
    .line 456
    .line 457
    move-result v10

    .line 458
    invoke-direct {v8, v7, v6, v10, v14}, Ly90;-><init>(Ljava/lang/String;FILandroid/graphics/Typeface;)V

    .line 459
    .line 460
    .line 461
    filled-new-array {v9, v4, v8}, [Ly90;

    .line 462
    .line 463
    .line 464
    move-result-object v4

    .line 465
    invoke-static {v4}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 470
    .line 471
    .line 472
    move-result v6

    .line 473
    if-eqz v6, :cond_14

    .line 474
    .line 475
    :goto_10
    goto/16 :goto_5

    .line 476
    .line 477
    :cond_14
    invoke-virtual/range {v26 .. v26}, Landroid/graphics/RectF;->width()F

    .line 478
    .line 479
    .line 480
    move-result v6

    .line 481
    const/high16 v7, 0x40c00000    # 6.0f

    .line 482
    .line 483
    invoke-virtual {v0, v7}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 484
    .line 485
    .line 486
    move-result v7

    .line 487
    sub-float/2addr v6, v7

    .line 488
    cmpg-float v7, v6, v17

    .line 489
    .line 490
    if-gez v7, :cond_15

    .line 491
    .line 492
    move/from16 v6, v17

    .line 493
    .line 494
    :cond_15
    invoke-virtual/range {v26 .. v26}, Landroid/graphics/RectF;->height()F

    .line 495
    .line 496
    .line 497
    move-result v7

    .line 498
    const/high16 v8, 0x40800000    # 4.0f

    .line 499
    .line 500
    invoke-virtual {v0, v8}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 501
    .line 502
    .line 503
    move-result v8

    .line 504
    sub-float/2addr v7, v8

    .line 505
    cmpg-float v8, v7, v17

    .line 506
    .line 507
    if-gez v8, :cond_16

    .line 508
    .line 509
    move/from16 v7, v17

    .line 510
    .line 511
    :cond_16
    cmpg-float v8, v6, v17

    .line 512
    .line 513
    if-lez v8, :cond_a

    .line 514
    .line 515
    cmpg-float v9, v7, v17

    .line 516
    .line 517
    if-gtz v9, :cond_17

    .line 518
    .line 519
    goto :goto_10

    .line 520
    :cond_17
    invoke-virtual {v0, v4}, Lcom/example/dyhelper/ui/GestureAreaView;->ε(Ljava/util/List;)Ljava/util/ArrayList;

    .line 521
    .line 522
    .line 523
    move-result-object v9

    .line 524
    new-instance v10, Ljava/util/ArrayList;

    .line 525
    .line 526
    const/16 v14, 0xa

    .line 527
    .line 528
    invoke-static {v9, v14}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 529
    .line 530
    .line 531
    move-result v15

    .line 532
    invoke-direct {v10, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 536
    .line 537
    .line 538
    move-result-object v15

    .line 539
    :goto_11
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 540
    .line 541
    .line 542
    move-result v25

    .line 543
    if-eqz v25, :cond_18

    .line 544
    .line 545
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v25

    .line 549
    move-object/from16 v14, v25

    .line 550
    .line 551
    check-cast v14, Landroid/graphics/Paint$FontMetrics;

    .line 552
    .line 553
    move/from16 v25, v6

    .line 554
    .line 555
    iget v6, v14, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 556
    .line 557
    iget v14, v14, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 558
    .line 559
    sub-float/2addr v6, v14

    .line 560
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 561
    .line 562
    .line 563
    move-result-object v6

    .line 564
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move/from16 v6, v25

    .line 568
    .line 569
    const/16 v14, 0xa

    .line 570
    .line 571
    goto :goto_11

    .line 572
    :cond_18
    move/from16 v25, v6

    .line 573
    .line 574
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 575
    .line 576
    .line 577
    move-result-object v6

    .line 578
    move/from16 v14, v17

    .line 579
    .line 580
    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 581
    .line 582
    .line 583
    move-result v15

    .line 584
    if-eqz v15, :cond_19

    .line 585
    .line 586
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v15

    .line 590
    check-cast v15, Ljava/lang/Number;

    .line 591
    .line 592
    invoke-virtual {v15}, Ljava/lang/Number;->floatValue()F

    .line 593
    .line 594
    .line 595
    move-result v15

    .line 596
    add-float/2addr v14, v15

    .line 597
    goto :goto_12

    .line 598
    :cond_19
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 599
    .line 600
    .line 601
    move-result v6

    .line 602
    const/16 v16, 0x1

    .line 603
    .line 604
    add-int/lit8 v6, v6, -0x1

    .line 605
    .line 606
    int-to-float v6, v6

    .line 607
    mul-float v6, v6, v27

    .line 608
    .line 609
    add-float/2addr v6, v14

    .line 610
    cmpl-float v14, v6, v7

    .line 611
    .line 612
    if-lez v14, :cond_1e

    .line 613
    .line 614
    cmpl-float v14, v6, v17

    .line 615
    .line 616
    if-lez v14, :cond_1e

    .line 617
    .line 618
    div-float/2addr v7, v6

    .line 619
    const/high16 v6, 0x3f800000    # 1.0f

    .line 620
    .line 621
    cmpl-float v9, v7, v6

    .line 622
    .line 623
    if-lez v9, :cond_1a

    .line 624
    .line 625
    move v7, v6

    .line 626
    :cond_1a
    new-instance v6, Ljava/util/ArrayList;

    .line 627
    .line 628
    const/16 v9, 0xa

    .line 629
    .line 630
    invoke-static {v4, v9}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 631
    .line 632
    .line 633
    move-result v10

    .line 634
    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 635
    .line 636
    .line 637
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 638
    .line 639
    .line 640
    move-result-object v4

    .line 641
    :goto_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 642
    .line 643
    .line 644
    move-result v9

    .line 645
    if-eqz v9, :cond_1b

    .line 646
    .line 647
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v9

    .line 651
    check-cast v9, Ly90;

    .line 652
    .line 653
    iget v10, v9, Ly90;->β:F

    .line 654
    .line 655
    mul-float/2addr v10, v7

    .line 656
    iget-object v14, v9, Ly90;->α:Ljava/lang/String;

    .line 657
    .line 658
    iget v15, v9, Ly90;->γ:I

    .line 659
    .line 660
    iget-object v9, v9, Ly90;->δ:Landroid/graphics/Typeface;

    .line 661
    .line 662
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    move-object/from16 v30, v4

    .line 666
    .line 667
    new-instance v4, Ly90;

    .line 668
    .line 669
    invoke-direct {v4, v14, v10, v15, v9}, Ly90;-><init>(Ljava/lang/String;FILandroid/graphics/Typeface;)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    move-object/from16 v4, v30

    .line 676
    .line 677
    goto :goto_13

    .line 678
    :cond_1b
    mul-float v9, v27, v7

    .line 679
    .line 680
    invoke-virtual {v0, v6}, Lcom/example/dyhelper/ui/GestureAreaView;->ε(Ljava/util/List;)Ljava/util/ArrayList;

    .line 681
    .line 682
    .line 683
    move-result-object v4

    .line 684
    new-instance v10, Ljava/util/ArrayList;

    .line 685
    .line 686
    const/16 v7, 0xa

    .line 687
    .line 688
    invoke-static {v4, v7}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 689
    .line 690
    .line 691
    move-result v7

    .line 692
    invoke-direct {v10, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 696
    .line 697
    .line 698
    move-result-object v7

    .line 699
    :goto_14
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 700
    .line 701
    .line 702
    move-result v14

    .line 703
    if-eqz v14, :cond_1c

    .line 704
    .line 705
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v14

    .line 709
    check-cast v14, Landroid/graphics/Paint$FontMetrics;

    .line 710
    .line 711
    iget v15, v14, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 712
    .line 713
    iget v14, v14, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 714
    .line 715
    sub-float/2addr v15, v14

    .line 716
    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 717
    .line 718
    .line 719
    move-result-object v14

    .line 720
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 721
    .line 722
    .line 723
    goto :goto_14

    .line 724
    :cond_1c
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 725
    .line 726
    .line 727
    move-result-object v7

    .line 728
    move/from16 v14, v17

    .line 729
    .line 730
    :goto_15
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 731
    .line 732
    .line 733
    move-result v15

    .line 734
    if-eqz v15, :cond_1d

    .line 735
    .line 736
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v15

    .line 740
    check-cast v15, Ljava/lang/Number;

    .line 741
    .line 742
    invoke-virtual {v15}, Ljava/lang/Number;->floatValue()F

    .line 743
    .line 744
    .line 745
    move-result v15

    .line 746
    add-float/2addr v14, v15

    .line 747
    goto :goto_15

    .line 748
    :cond_1d
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 749
    .line 750
    .line 751
    move-result v7

    .line 752
    const/16 v16, 0x1

    .line 753
    .line 754
    add-int/lit8 v7, v7, -0x1

    .line 755
    .line 756
    int-to-float v7, v7

    .line 757
    mul-float/2addr v7, v9

    .line 758
    add-float/2addr v7, v14

    .line 759
    move/from16 v27, v9

    .line 760
    .line 761
    move-object v9, v4

    .line 762
    move-object v4, v6

    .line 763
    move v6, v7

    .line 764
    :cond_1e
    invoke-virtual/range {v26 .. v26}, Landroid/graphics/RectF;->centerY()F

    .line 765
    .line 766
    .line 767
    move-result v7

    .line 768
    const/high16 v20, 0x40000000    # 2.0f

    .line 769
    .line 770
    div-float v6, v6, v20

    .line 771
    .line 772
    sub-float/2addr v7, v6

    .line 773
    invoke-static {v9}, Lxh;->З(Ljava/util/List;)Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v6

    .line 777
    check-cast v6, Landroid/graphics/Paint$FontMetrics;

    .line 778
    .line 779
    iget v6, v6, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 780
    .line 781
    sub-float/2addr v7, v6

    .line 782
    sget-object v6, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 783
    .line 784
    iget-object v9, v0, Lcom/example/dyhelper/ui/GestureAreaView;->η:Landroid/graphics/Paint;

    .line 785
    .line 786
    invoke-virtual {v9, v6}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 787
    .line 788
    .line 789
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 790
    .line 791
    .line 792
    move-result-object v4

    .line 793
    const/4 v6, 0x0

    .line 794
    :goto_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 795
    .line 796
    .line 797
    move-result v14

    .line 798
    if-eqz v14, :cond_24

    .line 799
    .line 800
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v14

    .line 804
    add-int/lit8 v15, v6, 0x1

    .line 805
    .line 806
    if-ltz v6, :cond_23

    .line 807
    .line 808
    check-cast v14, Ly90;

    .line 809
    .line 810
    move-object/from16 v20, v4

    .line 811
    .line 812
    iget-object v4, v14, Ly90;->δ:Landroid/graphics/Typeface;

    .line 813
    .line 814
    invoke-virtual {v9, v4}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 815
    .line 816
    .line 817
    iget v4, v14, Ly90;->β:F

    .line 818
    .line 819
    invoke-virtual {v9, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 820
    .line 821
    .line 822
    iget v4, v14, Ly90;->γ:I

    .line 823
    .line 824
    invoke-virtual {v9, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 825
    .line 826
    .line 827
    iget-object v4, v14, Ly90;->α:Ljava/lang/String;

    .line 828
    .line 829
    const-string v14, ""

    .line 830
    .line 831
    if-gtz v8, :cond_1f

    .line 832
    .line 833
    move/from16 v29, v8

    .line 834
    .line 835
    :goto_17
    move/from16 v30, v11

    .line 836
    .line 837
    move/from16 v31, v12

    .line 838
    .line 839
    move-object v4, v14

    .line 840
    :goto_18
    const/4 v11, 0x0

    .line 841
    goto :goto_19

    .line 842
    :cond_1f
    invoke-virtual {v9, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 843
    .line 844
    .line 845
    move-result v29

    .line 846
    cmpg-float v29, v29, v25

    .line 847
    .line 848
    if-gtz v29, :cond_20

    .line 849
    .line 850
    move/from16 v29, v8

    .line 851
    .line 852
    move/from16 v30, v11

    .line 853
    .line 854
    move/from16 v31, v12

    .line 855
    .line 856
    goto :goto_18

    .line 857
    :cond_20
    move/from16 v29, v8

    .line 858
    .line 859
    const-string v8, "\u2026"

    .line 860
    .line 861
    invoke-virtual {v9, v8}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 862
    .line 863
    .line 864
    move-result v30

    .line 865
    cmpl-float v31, v30, v25

    .line 866
    .line 867
    if-lez v31, :cond_21

    .line 868
    .line 869
    goto :goto_17

    .line 870
    :cond_21
    sub-float v14, v25, v30

    .line 871
    .line 872
    move/from16 v30, v11

    .line 873
    .line 874
    move/from16 v31, v12

    .line 875
    .line 876
    const/4 v11, 0x0

    .line 877
    const/4 v12, 0x1

    .line 878
    invoke-virtual {v9, v4, v12, v14, v11}, Landroid/graphics/Paint;->breakText(Ljava/lang/String;ZF[F)I

    .line 879
    .line 880
    .line 881
    move-result v14

    .line 882
    if-gtz v14, :cond_22

    .line 883
    .line 884
    move-object v4, v8

    .line 885
    goto :goto_18

    .line 886
    :cond_22
    const/4 v11, 0x0

    .line 887
    invoke-virtual {v4, v11, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v4

    .line 891
    invoke-static {v4}, Lq02;->Г(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 892
    .line 893
    .line 894
    move-result-object v4

    .line 895
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v4

    .line 899
    invoke-static {v4, v8}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v4

    .line 903
    :goto_19
    invoke-virtual/range {v26 .. v26}, Landroid/graphics/RectF;->centerX()F

    .line 904
    .line 905
    .line 906
    move-result v8

    .line 907
    invoke-virtual {v1, v4, v8, v7, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 908
    .line 909
    .line 910
    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v4

    .line 914
    check-cast v4, Ljava/lang/Number;

    .line 915
    .line 916
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 917
    .line 918
    .line 919
    move-result v4

    .line 920
    add-float v4, v4, v27

    .line 921
    .line 922
    add-float/2addr v7, v4

    .line 923
    move v6, v15

    .line 924
    move-object/from16 v4, v20

    .line 925
    .line 926
    move/from16 v8, v29

    .line 927
    .line 928
    move/from16 v11, v30

    .line 929
    .line 930
    move/from16 v12, v31

    .line 931
    .line 932
    goto/16 :goto_16

    .line 933
    .line 934
    :cond_23
    invoke-static {}, Lyh;->х()V

    .line 935
    .line 936
    .line 937
    const/16 v18, 0x0

    .line 938
    .line 939
    throw v18

    .line 940
    :cond_24
    move/from16 v30, v11

    .line 941
    .line 942
    move/from16 v31, v12

    .line 943
    .line 944
    const/4 v11, 0x0

    .line 945
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 946
    .line 947
    .line 948
    move-result-object v4

    .line 949
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 950
    .line 951
    .line 952
    invoke-static {v4}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 953
    .line 954
    .line 955
    move-result-object v4

    .line 956
    sget-object v6, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 957
    .line 958
    invoke-virtual {v9, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 959
    .line 960
    .line 961
    const/high16 v6, 0x41280000    # 10.5f

    .line 962
    .line 963
    invoke-virtual {v0, v6}, Lcom/example/dyhelper/ui/GestureAreaView;->θ(F)F

    .line 964
    .line 965
    .line 966
    move-result v6

    .line 967
    invoke-virtual {v9, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 968
    .line 969
    .line 970
    iget-object v4, v4, Lxx;->ζ:Ljava/lang/String;

    .line 971
    .line 972
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 973
    .line 974
    .line 975
    move-result v4

    .line 976
    invoke-virtual {v9, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 977
    .line 978
    .line 979
    sget-object v4, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 980
    .line 981
    invoke-virtual {v9, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 982
    .line 983
    .line 984
    :goto_1a
    move/from16 v4, v17

    .line 985
    .line 986
    move/from16 v15, v19

    .line 987
    .line 988
    move/from16 v7, v21

    .line 989
    .line 990
    move/from16 v8, v22

    .line 991
    .line 992
    move/from16 v9, v23

    .line 993
    .line 994
    move-object/from16 v6, v24

    .line 995
    .line 996
    move/from16 v10, v28

    .line 997
    .line 998
    move/from16 v11, v30

    .line 999
    .line 1000
    move/from16 v12, v31

    .line 1001
    .line 1002
    goto/16 :goto_0

    .line 1003
    .line 1004
    :cond_25
    invoke-static {}, Lyh;->х()V

    .line 1005
    .line 1006
    .line 1007
    const/16 v18, 0x0

    .line 1008
    .line 1009
    throw v18

    .line 1010
    :cond_26
    const/16 v18, 0x0

    .line 1011
    .line 1012
    iget-object v4, v0, Lcom/example/dyhelper/ui/GestureAreaView;->κ:Ljava/lang/String;

    .line 1013
    .line 1014
    if-eqz v4, :cond_31

    .line 1015
    .line 1016
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v6

    .line 1020
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1021
    .line 1022
    .line 1023
    invoke-static {v6}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v6

    .line 1027
    iget-object v6, v6, Lxx;->ρ:Ljava/lang/String;

    .line 1028
    .line 1029
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1030
    .line 1031
    .line 1032
    move-result v6

    .line 1033
    iget-object v7, v0, Lcom/example/dyhelper/ui/GestureAreaView;->θ:Landroid/graphics/Paint;

    .line 1034
    .line 1035
    invoke-virtual {v7, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 1036
    .line 1037
    .line 1038
    const/high16 v9, 0x40000000    # 2.0f

    .line 1039
    .line 1040
    invoke-virtual {v0, v9}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 1041
    .line 1042
    .line 1043
    move-result v6

    .line 1044
    invoke-interface {v5, v4}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 1045
    .line 1046
    .line 1047
    move-result v4

    .line 1048
    if-gez v4, :cond_27

    .line 1049
    .line 1050
    move-object/from16 v14, v18

    .line 1051
    .line 1052
    goto :goto_1f

    .line 1053
    :cond_27
    div-int/lit8 v5, v4, 0x3

    .line 1054
    .line 1055
    rem-int/lit8 v4, v4, 0x3

    .line 1056
    .line 1057
    iget-object v8, v0, Lcom/example/dyhelper/ui/GestureAreaView;->μ:Lw90;

    .line 1058
    .line 1059
    invoke-static {v2, v3, v8}, Li2;->ι(FFLw90;)Lv90;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    iget v3, v2, Lv90;->β:F

    .line 1064
    .line 1065
    iget v9, v2, Lv90;->α:F

    .line 1066
    .line 1067
    iget v10, v8, Lw90;->α:F

    .line 1068
    .line 1069
    invoke-virtual {v2}, Lv90;->β()F

    .line 1070
    .line 1071
    .line 1072
    move-result v11

    .line 1073
    mul-float/2addr v11, v10

    .line 1074
    add-float/2addr v11, v9

    .line 1075
    iget v10, v8, Lw90;->β:F

    .line 1076
    .line 1077
    invoke-virtual {v2}, Lv90;->β()F

    .line 1078
    .line 1079
    .line 1080
    move-result v12

    .line 1081
    mul-float/2addr v12, v10

    .line 1082
    add-float/2addr v12, v9

    .line 1083
    iget v10, v8, Lw90;->γ:F

    .line 1084
    .line 1085
    invoke-virtual {v2}, Lv90;->α()F

    .line 1086
    .line 1087
    .line 1088
    move-result v13

    .line 1089
    mul-float/2addr v13, v10

    .line 1090
    add-float/2addr v13, v3

    .line 1091
    iget v8, v8, Lw90;->δ:F

    .line 1092
    .line 1093
    invoke-virtual {v2}, Lv90;->α()F

    .line 1094
    .line 1095
    .line 1096
    move-result v10

    .line 1097
    mul-float/2addr v10, v8

    .line 1098
    add-float/2addr v10, v3

    .line 1099
    if-eqz v4, :cond_29

    .line 1100
    .line 1101
    const/4 v8, 0x1

    .line 1102
    if-eq v4, v8, :cond_28

    .line 1103
    .line 1104
    move v9, v12

    .line 1105
    goto :goto_1b

    .line 1106
    :cond_28
    move v9, v11

    .line 1107
    goto :goto_1b

    .line 1108
    :cond_29
    const/4 v8, 0x1

    .line 1109
    :goto_1b
    if-eqz v4, :cond_2b

    .line 1110
    .line 1111
    if-eq v4, v8, :cond_2a

    .line 1112
    .line 1113
    iget v11, v2, Lv90;->γ:F

    .line 1114
    .line 1115
    goto :goto_1c

    .line 1116
    :cond_2a
    move v11, v12

    .line 1117
    :cond_2b
    :goto_1c
    if-eqz v5, :cond_2d

    .line 1118
    .line 1119
    if-eq v5, v8, :cond_2c

    .line 1120
    .line 1121
    move v3, v10

    .line 1122
    goto :goto_1d

    .line 1123
    :cond_2c
    move v3, v13

    .line 1124
    :cond_2d
    :goto_1d
    if-eqz v5, :cond_2f

    .line 1125
    .line 1126
    if-eq v5, v8, :cond_2e

    .line 1127
    .line 1128
    iget v13, v2, Lv90;->δ:F

    .line 1129
    .line 1130
    goto :goto_1e

    .line 1131
    :cond_2e
    move v13, v10

    .line 1132
    :cond_2f
    :goto_1e
    new-instance v14, Landroid/graphics/RectF;

    .line 1133
    .line 1134
    add-float/2addr v9, v6

    .line 1135
    add-float/2addr v3, v6

    .line 1136
    sub-float/2addr v11, v6

    .line 1137
    sub-float/2addr v13, v6

    .line 1138
    invoke-direct {v14, v9, v3, v11, v13}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1139
    .line 1140
    .line 1141
    :goto_1f
    if-nez v14, :cond_30

    .line 1142
    .line 1143
    goto :goto_20

    .line 1144
    :cond_30
    const/high16 v2, 0x41300000    # 11.0f

    .line 1145
    .line 1146
    invoke-virtual {v0, v2}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 1147
    .line 1148
    .line 1149
    move-result v3

    .line 1150
    invoke-virtual {v0, v2}, Lcom/example/dyhelper/ui/GestureAreaView;->α(F)F

    .line 1151
    .line 1152
    .line 1153
    move-result v0

    .line 1154
    invoke-virtual {v1, v14, v3, v0, v7}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 1155
    .line 1156
    .line 1157
    :cond_31
    :goto_20
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    if-eq v0, v2, :cond_2

    .line 15
    .line 16
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 22
    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    int-to-float v2, v2

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    int-to-float v3, v3

    .line 43
    iget-object v4, p0, Lcom/example/dyhelper/ui/GestureAreaView;->μ:Lw90;

    .line 44
    .line 45
    invoke-static {v0, p1, v2, v3, v4}, Li2;->π(FFFFLw90;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    iput-object p1, p0, Lcom/example/dyhelper/ui/GestureAreaView;->κ:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Lcom/example/dyhelper/ui/GestureAreaView;->ν:La80;

    .line 57
    .line 58
    if-eqz p0, :cond_2

    .line 59
    .line 60
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_2
    return v1
.end method

.method public final performClick()Z
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0
.end method

.method public final setGridBounds(Lw90;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Li2;->φ(Lw90;)Lw90;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/example/dyhelper/ui/GestureAreaView;->μ:Lw90;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setOnAreaSelectedListener(La80;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La80;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/ui/GestureAreaView;->ν:La80;

    .line 2
    .line 3
    return-void
.end method

.method public final setSelectedArea(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/ui/GestureAreaView;->κ:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final α(F)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

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
    return p1
.end method

.method public final β()V
    .locals 6

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/ui/GestureAreaView;->λ:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->clear()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->π:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    new-instance v2, Ll91;

    .line 25
    .line 26
    const-string v3, "double_tap"

    .line 27
    .line 28
    const-string v4, "\u65e0"

    .line 29
    .line 30
    invoke-direct {v2, v3, v4}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance v3, Ll91;

    .line 34
    .line 35
    const-string v5, "long_press"

    .line 36
    .line 37
    invoke-direct {v3, v5, v4}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    filled-new-array {v2, v3}, [Ll91;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    const/4 v4, 0x2

    .line 47
    invoke-static {v4}, Lex0;->Κ(I)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-static {v3, v2}, Lex0;->Ν(Ljava/util/HashMap;[Ll91;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    return-void
.end method

.method public final γ(Ljava/lang/String;)I
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/ui/GestureAreaView;->λ:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Map;

    .line 25
    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/Iterable;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v2}, Li2;->ρ(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v1}, Li2;->ρ(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    return v0
.end method

.method public final δ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/ui/GestureAreaView;->λ:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/Map;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/String;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    :goto_0
    invoke-static {p0}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final ε(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p1, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ly90;

    .line 27
    .line 28
    iget-object v2, v1, Ly90;->δ:Landroid/graphics/Typeface;

    .line 29
    .line 30
    iget-object v3, p0, Lcom/example/dyhelper/ui/GestureAreaView;->η:Landroid/graphics/Paint;

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 33
    .line 34
    .line 35
    iget v1, v1, Ly90;->β:F

    .line 36
    .line 37
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Landroid/graphics/Paint$FontMetrics;

    .line 41
    .line 42
    invoke-direct {v1}, Landroid/graphics/Paint$FontMetrics;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    return-object v0
.end method

.method public final ζ()V
    .locals 6

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->π:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    sget-object v2, Lcom/example/dyhelper/ui/GestureAreaView;->ρ:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/String;

    .line 43
    .line 44
    iget-object v4, p0, Lcom/example/dyhelper/ui/GestureAreaView;->λ:Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    invoke-virtual {v4, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Ljava/util/Map;

    .line 51
    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Ljava/lang/String;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const/4 v4, 0x0

    .line 62
    :goto_1
    invoke-static {v4}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    sget-object v5, Lui1;->α:Ljava/lang/Object;

    .line 67
    .line 68
    invoke-static {v1, v3}, Li2;->ω(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v3, v4}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    :goto_2
    return-void
.end method

.method public final η(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->π:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->ρ:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :goto_0
    return-void

    .line 19
    :cond_1
    iget-object v0, p0, Lcom/example/dyhelper/ui/GestureAreaView;->λ:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_2
    check-cast v1, Ljava/util/Map;

    .line 36
    .line 37
    invoke-static {p3}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final θ(F)F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

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
    const/4 v0, 0x2

    .line 10
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method
