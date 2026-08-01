.class public final synthetic Landroidx/compose/ui/text/input/飘花落叶言子世楪苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/text/input/飘花落叶言子世楪哲苏兰;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/text/input/飘花落叶言子世楪哲苏兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/text/input/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/text/input/飘花落叶言子世楪哲苏兰;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/text/input/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/text/input/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/text/input/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/input/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Landroidx/compose/ui/text/input/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲世兰苏:Landroidx/compose/ui/text/input/飘花落叶言子世楪苏哲兰;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/compose/ui/text/input/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲世苏兰:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/compose/ui/text/input/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->onCheckIsTextEditor()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-ne p0, v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    new-instance p0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 40
    .line 41
    invoke-direct {p0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 45
    .line 46
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v4, v1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 50
    .line 51
    iget v5, v1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    move v7, v6

    .line 55
    :goto_0
    if-ge v7, v5, :cond_7

    .line 56
    .line 57
    aget-object v8, v4, v7

    .line 58
    .line 59
    check-cast v8, Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;

    .line 60
    .line 61
    sget-object v9, Landroidx/compose/ui/text/input/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:[I

    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    aget v9, v9, v10

    .line 68
    .line 69
    if-eq v9, v3, :cond_5

    .line 70
    .line 71
    const/4 v10, 0x2

    .line 72
    if-eq v9, v10, :cond_4

    .line 73
    .line 74
    const/4 v10, 0x3

    .line 75
    if-eq v9, v10, :cond_2

    .line 76
    .line 77
    const/4 v10, 0x4

    .line 78
    if-ne v9, v10, :cond_1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_2
    :goto_1
    iget-object v9, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 86
    .line 87
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-static {v9, v10}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    if-nez v9, :cond_6

    .line 94
    .line 95
    sget-object v9, Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;->ShowKeyboard:Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;

    .line 96
    .line 97
    if-ne v8, v9, :cond_3

    .line 98
    .line 99
    move v8, v3

    .line 100
    goto :goto_2

    .line 101
    :cond_3
    move v8, v6

    .line 102
    :goto_2
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    iput-object v8, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 110
    .line 111
    iput-object v8, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v8, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 117
    .line 118
    iput-object v8, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v8, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 121
    .line 122
    :cond_6
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_7
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()V

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 129
    .line 130
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_8

    .line 137
    .line 138
    iget-object v1, v0, Landroidx/compose/ui/text/input/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 139
    .line 140
    invoke-interface {v1}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 145
    .line 146
    iget-object v3, v0, Landroidx/compose/ui/text/input/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 147
    .line 148
    invoke-virtual {v1, v3}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 149
    .line 150
    .line 151
    :cond_8
    iget-object v1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, Ljava/lang/Boolean;

    .line 154
    .line 155
    if-eqz v1, :cond_a

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_9

    .line 162
    .line 163
    iget-object v1, v0, Landroidx/compose/ui/text/input/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 164
    .line 165
    iget-object v1, v1, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v1, Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 168
    .line 169
    invoke-virtual {v1}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子苏楪世兰哲()V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_9
    iget-object v1, v0, Landroidx/compose/ui/text/input/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 174
    .line 175
    iget-object v1, v1, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v1, Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 178
    .line 179
    invoke-virtual {v1}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子世哲兰楪苏()V

    .line 180
    .line 181
    .line 182
    :cond_a
    :goto_4
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 183
    .line 184
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-static {p0, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-eqz p0, :cond_b

    .line 191
    .line 192
    iget-object p0, v0, Landroidx/compose/ui/text/input/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 193
    .line 194
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 199
    .line 200
    iget-object v0, v0, Landroidx/compose/ui/text/input/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 201
    .line 202
    invoke-virtual {p0, v0}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 203
    .line 204
    .line 205
    :cond_b
    return-void
.end method
