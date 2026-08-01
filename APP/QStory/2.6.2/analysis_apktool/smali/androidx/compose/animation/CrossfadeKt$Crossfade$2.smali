.class final Landroidx/compose/animation/CrossfadeKt$Crossfade$2;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $animationSpec:Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;"
        }
    .end annotation
.end field

.field final synthetic $content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

.field final synthetic $modifier:Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

.field final synthetic $targetState:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;->$targetState:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;->$modifier:Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;->$animationSpec:Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;->$content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 8
    .line 9
    iput p5, p0, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;->$$changed:I

    .line 10
    .line 11
    iput p6, p0, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;->$$default:I

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 195
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;->invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 12

    .line 1
    iget-object v1, p0, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;->$targetState:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p2, p0, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;->$modifier:Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;->$animationSpec:Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;

    .line 6
    .line 7
    iget-object v4, p0, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;->$content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 8
    .line 9
    iget v2, p0, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;->$$changed:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    or-int/2addr v2, v3

    .line 13
    invoke-static {v2}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰楪苏哲(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget p0, p0, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;->$$default:I

    .line 18
    .line 19
    move-object v7, p1

    .line 20
    check-cast v7, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 21
    .line 22
    const p1, -0x997dfd0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v7, p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 26
    .line 27
    .line 28
    and-int/lit8 p1, v10, 0x6

    .line 29
    .line 30
    const/4 v2, 0x2

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    and-int/lit8 p1, v10, 0x8

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v7, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v7, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    :goto_0
    if-eqz p1, :cond_1

    .line 47
    .line 48
    const/4 p1, 0x4

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move p1, v2

    .line 51
    :goto_1
    or-int/2addr p1, v10

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move p1, v10

    .line 54
    :goto_2
    and-int/lit8 v5, p0, 0x2

    .line 55
    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    or-int/lit8 p1, p1, 0x30

    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_3
    and-int/lit8 v6, v10, 0x30

    .line 62
    .line 63
    if-nez v6, :cond_5

    .line 64
    .line 65
    invoke-virtual {v7, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_4

    .line 70
    .line 71
    const/16 v6, 0x20

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    const/16 v6, 0x10

    .line 75
    .line 76
    :goto_3
    or-int/2addr p1, v6

    .line 77
    :cond_5
    :goto_4
    and-int/lit8 v6, p0, 0x4

    .line 78
    .line 79
    if-eqz v6, :cond_6

    .line 80
    .line 81
    or-int/lit16 p1, p1, 0x180

    .line 82
    .line 83
    goto :goto_6

    .line 84
    :cond_6
    and-int/lit16 v8, v10, 0x180

    .line 85
    .line 86
    if-nez v8, :cond_8

    .line 87
    .line 88
    invoke-virtual {v7, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_7

    .line 93
    .line 94
    const/16 v8, 0x100

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_7
    const/16 v8, 0x80

    .line 98
    .line 99
    :goto_5
    or-int/2addr p1, v8

    .line 100
    :cond_8
    :goto_6
    and-int/lit16 v8, v10, 0xc00

    .line 101
    .line 102
    if-nez v8, :cond_a

    .line 103
    .line 104
    invoke-virtual {v7, v4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    if-eqz v8, :cond_9

    .line 109
    .line 110
    const/16 v8, 0x800

    .line 111
    .line 112
    goto :goto_7

    .line 113
    :cond_9
    const/16 v8, 0x400

    .line 114
    .line 115
    :goto_7
    or-int/2addr p1, v8

    .line 116
    :cond_a
    and-int/lit16 v8, p1, 0x493

    .line 117
    .line 118
    const/16 v9, 0x492

    .line 119
    .line 120
    const/4 v11, 0x0

    .line 121
    if-eq v8, v9, :cond_b

    .line 122
    .line 123
    goto :goto_8

    .line 124
    :cond_b
    move v3, v11

    .line 125
    :goto_8
    and-int/lit8 v8, p1, 0x1

    .line 126
    .line 127
    invoke-virtual {v7, v8, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_e

    .line 132
    .line 133
    if-eqz v5, :cond_c

    .line 134
    .line 135
    sget-object p2, Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;

    .line 136
    .line 137
    :cond_c
    move-object v3, p2

    .line 138
    const/4 p2, 0x0

    .line 139
    if-eqz v6, :cond_d

    .line 140
    .line 141
    const/4 v0, 0x7

    .line 142
    invoke-static {v11, v0, p2}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(IILandroidx/compose/animation/core/飘花落叶言子楪兰哲世苏;)Landroidx/compose/animation/core/飘花落叶言子苏兰楪哲世;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    :cond_d
    and-int/lit8 v5, p1, 0xe

    .line 147
    .line 148
    invoke-static {v1, p2, v7, v5, v2}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;II)Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    and-int/lit16 p2, p1, 0x3f0

    .line 153
    .line 154
    shl-int/lit8 p1, p1, 0x3

    .line 155
    .line 156
    const v5, 0xe000

    .line 157
    .line 158
    .line 159
    and-int/2addr p1, v5

    .line 160
    or-int v8, p2, p1

    .line 161
    .line 162
    const/4 v9, 0x4

    .line 163
    const/4 v5, 0x0

    .line 164
    move-object v6, v4

    .line 165
    move-object v4, v0

    .line 166
    invoke-static/range {v2 .. v9}, Landroidx/compose/animation/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;II)V

    .line 167
    .line 168
    .line 169
    move-object v2, v3

    .line 170
    move-object v3, v4

    .line 171
    goto :goto_9

    .line 172
    :cond_e
    move-object v6, v4

    .line 173
    invoke-virtual {v7}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 174
    .line 175
    .line 176
    move-object v2, p2

    .line 177
    move-object v3, v0

    .line 178
    :goto_9
    invoke-virtual {v7}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    if-eqz p1, :cond_f

    .line 183
    .line 184
    new-instance v0, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;

    .line 185
    .line 186
    move-object v4, v6

    .line 187
    move v5, v10

    .line 188
    move v6, p0

    .line 189
    invoke-direct/range {v0 .. v6}, Landroidx/compose/animation/CrossfadeKt$Crossfade$2;-><init>(Ljava/lang/Object;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;II)V

    .line 190
    .line 191
    .line 192
    iput-object v0, p1, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 193
    .line 194
    :cond_f
    return-void
.end method
