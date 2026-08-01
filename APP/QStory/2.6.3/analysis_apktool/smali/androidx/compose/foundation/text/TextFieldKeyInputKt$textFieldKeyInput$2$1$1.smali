.class final synthetic Landroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2$1$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
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


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "process-ZmokQxo(Landroid/view/KeyEvent;)Z"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    const-class v3, Landroidx/compose/foundation/text/飘花落叶言子苏世哲兰楪;

    .line 6
    .line 7
    const-string v4, "process"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    iget-object p1, p1, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/KeyEvent;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2$1$1;->invoke-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final invoke-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Boolean;
    .locals 10

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/foundation/text/飘花落叶言子苏世哲兰楪;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/foundation/text/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/compose/foundation/text/selection/飘花落叶言子苏世楪哲兰;

    .line 6
    .line 7
    iget-boolean v1, p0, Landroidx/compose/foundation/text/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世哲兰苏:Z

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    if-nez v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {v2}, Ljava/lang/Character;->isISOControl(I)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_4

    .line 26
    .line 27
    iget-object v2, p0, Landroidx/compose/foundation/text/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪苏哲世兰:Landroidx/compose/foundation/text/飘花落叶言子世苏哲兰楪;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    const/high16 v6, -0x80000000

    .line 37
    .line 38
    and-int/2addr v6, v5

    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    const v6, 0x7fffffff

    .line 42
    .line 43
    .line 44
    and-int/2addr v5, v6

    .line 45
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    iput-object v5, v2, Landroidx/compose/foundation/text/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/lang/Integer;

    .line 50
    .line 51
    move-object v2, v4

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object v6, v2, Landroidx/compose/foundation/text/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/lang/Integer;

    .line 54
    .line 55
    if-eqz v6, :cond_3

    .line 56
    .line 57
    iput-object v4, v2, Landroidx/compose/foundation/text/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-static {v2, v5}, Landroid/view/KeyCharacterMap;->getDeadChar(II)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    if-nez v2, :cond_1

    .line 72
    .line 73
    move-object v6, v4

    .line 74
    :cond_1
    if-eqz v6, :cond_2

    .line 75
    .line 76
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    :cond_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    goto :goto_0

    .line 85
    :cond_3
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    :goto_0
    if-eqz v2, :cond_4

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    new-instance v5, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    new-instance v5, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;

    .line 109
    .line 110
    invoke-direct {v5, v2, v3}, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    move-object v5, v4

    .line 115
    :goto_1
    const/4 v2, 0x0

    .line 116
    if-eqz v5, :cond_6

    .line 117
    .line 118
    if-eqz v1, :cond_5

    .line 119
    .line 120
    invoke-static {v5}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏楪世兰哲(Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏哲兰(Ljava/util/List;)V

    .line 125
    .line 126
    .line 127
    iput-object v4, v0, Landroidx/compose/foundation/text/selection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Float;

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_5
    :goto_2
    move v3, v2

    .line 131
    goto :goto_3

    .line 132
    :cond_6
    invoke-static {p1}, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Landroid/view/KeyEvent;)I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    const/4 v5, 0x2

    .line 137
    if-ne v4, v5, :cond_5

    .line 138
    .line 139
    iget-object v4, p0, Landroidx/compose/foundation/text/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪苏哲兰世:Landroidx/compose/foundation/text/飘花落叶言子世哲兰楪苏;

    .line 140
    .line 141
    invoke-virtual {v4, p1}, Landroidx/compose/foundation/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/KeyCommand;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-eqz p1, :cond_5

    .line 146
    .line 147
    invoke-virtual {p1}, Landroidx/compose/foundation/text/KeyCommand;->getEditsText()Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_7

    .line 152
    .line 153
    if-nez v1, :cond_7

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_7
    new-instance v1, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 157
    .line 158
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-boolean v3, v1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 162
    .line 163
    new-instance v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪哲兰世苏;

    .line 164
    .line 165
    const/4 v4, 0x4

    .line 166
    invoke-direct {v2, p1, p0, v1, v4}, Landroidx/compose/foundation/lazy/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 167
    .line 168
    .line 169
    new-instance p1, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲兰苏楪;

    .line 170
    .line 171
    iget-object v5, p0, Landroidx/compose/foundation/text/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 172
    .line 173
    iget-object v6, p0, Landroidx/compose/foundation/text/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/text/input/飘花落叶言子楪哲苏兰世;

    .line 174
    .line 175
    iget-object v7, p0, Landroidx/compose/foundation/text/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 176
    .line 177
    invoke-virtual {v7}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏()Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-direct {p1, v5, v6, v7, v0}, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲兰苏楪;-><init>(Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;Landroidx/compose/ui/text/input/飘花落叶言子楪哲苏兰世;Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;Landroidx/compose/foundation/text/selection/飘花落叶言子苏世楪哲兰;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, p1}, Landroidx/compose/foundation/lazy/飘花落叶言子楪哲兰世苏;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    iget-wide v6, p1, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰哲苏:J

    .line 188
    .line 189
    iget-wide v8, v5, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:J

    .line 190
    .line 191
    invoke-static {v6, v7, v8, v9}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    iget-object v2, p1, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 196
    .line 197
    if-eqz v0, :cond_8

    .line 198
    .line 199
    iget-object v0, v5, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 200
    .line 201
    invoke-static {v2, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-nez v0, :cond_9

    .line 206
    .line 207
    :cond_8
    iget-object v0, p0, Landroidx/compose/foundation/text/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪苏兰世哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 208
    .line 209
    iget-wide v6, p1, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰哲苏:J

    .line 210
    .line 211
    invoke-static {v5, v2, v6, v7, v4}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;JI)Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-interface {v0, p1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    :cond_9
    iget-object p0, p0, Landroidx/compose/foundation/text/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪苏世兰哲:Landroidx/compose/foundation/text/飘花落叶言子哲楪苏世兰;

    .line 219
    .line 220
    if-eqz p0, :cond_a

    .line 221
    .line 222
    iput-boolean v3, p0, Landroidx/compose/foundation/text/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪世兰苏哲:Z

    .line 223
    .line 224
    :cond_a
    iget-boolean v3, v1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 225
    .line 226
    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    return-object p0
.end method
