.class public final synthetic Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .line 1
    iget p0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世哲兰;

    .line 10
    .line 11
    check-cast p2, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世哲兰;

    .line 12
    .line 13
    iget p0, p1, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 14
    .line 15
    iget p1, p1, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 16
    .line 17
    sub-int/2addr p0, p1

    .line 18
    iget p1, p2, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 19
    .line 20
    iget p2, p2, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 21
    .line 22
    sub-int/2addr p1, p2

    .line 23
    sub-int/2addr p0, p1

    .line 24
    return p0

    .line 25
    :pswitch_0
    check-cast p1, [B

    .line 26
    .line 27
    check-cast p2, [B

    .line 28
    .line 29
    array-length p0, p1

    .line 30
    array-length v0, p2

    .line 31
    if-eq p0, v0, :cond_0

    .line 32
    .line 33
    array-length p0, p1

    .line 34
    array-length p1, p2

    .line 35
    sub-int v1, p0, p1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    move p0, v1

    .line 39
    :goto_0
    array-length v0, p1

    .line 40
    if-ge p0, v0, :cond_2

    .line 41
    .line 42
    aget-byte v0, p1, p0

    .line 43
    .line 44
    aget-byte v2, p2, p0

    .line 45
    .line 46
    if-eq v0, v2, :cond_1

    .line 47
    .line 48
    sub-int v1, v0, v2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    add-int/lit8 p0, p0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    :goto_1
    return v1

    .line 55
    :pswitch_1
    check-cast p1, Ljava/io/File;

    .line 56
    .line 57
    check-cast p2, Ljava/io/File;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_4

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_4

    .line 83
    .line 84
    move v0, v2

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    :goto_2
    return v0

    .line 99
    :pswitch_2
    check-cast p1, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世兰苏;

    .line 100
    .line 101
    check-cast p2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世兰苏;

    .line 102
    .line 103
    iget-wide v3, p2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:J

    .line 104
    .line 105
    iget-wide p0, p1, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:J

    .line 106
    .line 107
    sub-long/2addr v3, p0

    .line 108
    const-wide/16 p0, 0x0

    .line 109
    .line 110
    cmp-long p0, v3, p0

    .line 111
    .line 112
    if-nez p0, :cond_5

    .line 113
    .line 114
    move v0, v1

    .line 115
    goto :goto_3

    .line 116
    :cond_5
    if-gez p0, :cond_6

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_6
    move v0, v2

    .line 120
    :goto_3
    return v0

    .line 121
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 122
    .line 123
    check-cast p2, Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {p1, p2}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    return p0

    .line 130
    :pswitch_4
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 131
    .line 132
    check-cast p2, Ljava/lang/reflect/Constructor;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    invoke-static {p1, p0}, Ljava/lang/Integer;->compare(II)I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    return p0

    .line 147
    :pswitch_5
    check-cast p1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 148
    .line 149
    check-cast p2, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 150
    .line 151
    iget-object p0, p1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪世哲兰:Landroidx/compose/ui/node/飘花落叶言子世苏哲兰楪;

    .line 152
    .line 153
    iget-object p0, p0, Landroidx/compose/ui/node/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/node/飘花落叶言子世兰楪哲苏;

    .line 154
    .line 155
    iget p0, p0, Landroidx/compose/ui/node/飘花落叶言子世兰楪哲苏;->飘花落叶言子世兰苏楪哲:F

    .line 156
    .line 157
    iget-object v0, p2, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪世哲兰:Landroidx/compose/ui/node/飘花落叶言子世苏哲兰楪;

    .line 158
    .line 159
    iget-object v0, v0, Landroidx/compose/ui/node/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/node/飘花落叶言子世兰楪哲苏;

    .line 160
    .line 161
    iget v0, v0, Landroidx/compose/ui/node/飘花落叶言子世兰楪哲苏;->飘花落叶言子世兰苏楪哲:F

    .line 162
    .line 163
    cmpg-float v1, p0, v0

    .line 164
    .line 165
    if-nez v1, :cond_7

    .line 166
    .line 167
    invoke-virtual {p1}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰哲世苏()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    invoke-virtual {p2}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰哲世苏()I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    goto :goto_4

    .line 180
    :cond_7
    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    :goto_4
    return p0

    .line 185
    :pswitch_6
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世哲楪兰苏;

    .line 186
    .line 187
    check-cast p2, Landroidx/compose/runtime/飘花落叶言子世哲楪兰苏;

    .line 188
    .line 189
    iget p0, p1, Landroidx/compose/runtime/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 190
    .line 191
    iget p1, p2, Landroidx/compose/runtime/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 192
    .line 193
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    return p0

    .line 198
    :pswitch_7
    check-cast p1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世苏哲;

    .line 199
    .line 200
    check-cast p2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世苏哲;

    .line 201
    .line 202
    iget p0, p1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 203
    .line 204
    iget p1, p2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 205
    .line 206
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    return p0

    .line 211
    :pswitch_8
    check-cast p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏世楪哲兰;

    .line 212
    .line 213
    check-cast p2, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏世楪哲兰;

    .line 214
    .line 215
    iget p0, p2, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 216
    .line 217
    iget p1, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 218
    .line 219
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    return p0

    .line 224
    nop

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
