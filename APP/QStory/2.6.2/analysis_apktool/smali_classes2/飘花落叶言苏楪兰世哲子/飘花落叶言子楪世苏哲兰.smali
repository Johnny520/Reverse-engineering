.class public final synthetic L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 10
    iput p2, p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    iput p1, p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p1, p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    iget-object p0, p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/widget/TextView;

    .line 11
    .line 12
    new-instance p1, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-direct {p1}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 15
    .line 16
    .line 17
    const-wide/16 v2, 0x12c

    .line 18
    .line 19
    invoke-virtual {p1, v2, v3}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏楪兰(J)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    check-cast v2, Landroid/view/ViewGroup;

    .line 30
    .line 31
    invoke-static {v2, p1}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(Landroid/view/ViewGroup;L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏兰哲世;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    instance-of v2, p1, Ljava/lang/Boolean;

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    check-cast p1, Ljava/lang/Boolean;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object p1, v0

    .line 46
    :goto_0
    if-eqz p1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move p1, v1

    .line 54
    :goto_1
    if-eqz p1, :cond_2

    .line 55
    .line 56
    const v2, 0x7fffffff

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    const/4 v0, 0x2

    .line 67
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 73
    .line 74
    .line 75
    :goto_2
    xor-int/2addr p1, v1

    .line 76
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_0
    check-cast p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪苏世兰哲;

    .line 85
    .line 86
    new-instance p1, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;

    .line 87
    .line 88
    invoke-virtual {p0}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-direct {p1, p0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;-><init>(Landroid/content/Context;)V

    .line 93
    .line 94
    .line 95
    new-instance p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰哲苏;

    .line 96
    .line 97
    invoke-direct {p0, p1}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p1, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 101
    .line 102
    iput-object p0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世哲兰苏楪:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;

    .line 103
    .line 104
    iget-object p0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子苏楪世哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 105
    .line 106
    if-nez p0, :cond_3

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_3
    new-instance p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏兰世;

    .line 110
    .line 111
    const/4 v1, 0x0

    .line 112
    invoke-direct {p0, v0, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;I)V

    .line 113
    .line 114
    .line 115
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲(Ljava/lang/Runnable;)V

    .line 116
    .line 117
    .line 118
    :goto_3
    new-instance p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰苏哲;

    .line 119
    .line 120
    const/4 v1, 0x3

    .line 121
    invoke-direct {p0, p1, v1}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;I)V

    .line 122
    .line 123
    .line 124
    iput-object p0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世兰哲楪苏:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏世兰哲;

    .line 125
    .line 126
    iget-boolean p1, v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:Z

    .line 127
    .line 128
    if-eqz p1, :cond_4

    .line 129
    .line 130
    iget-object p1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世兰哲苏楪:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 131
    .line 132
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世哲苏兰楪()V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_1
    check-cast p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;

    .line 140
    .line 141
    iget-object p0, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    new-instance p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏兰世;

    .line 149
    .line 150
    invoke-direct {p1, p0, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;I)V

    .line 151
    .line 152
    .line 153
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲(Ljava/lang/Runnable;)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :pswitch_2
    check-cast p0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;

    .line 158
    .line 159
    iget-object p1, p0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p1, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏兰哲;

    .line 162
    .line 163
    iput-object v0, p1, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏哲兰;

    .line 164
    .line 165
    iget-object p0, p0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p0, Landroid/widget/EditText;

    .line 168
    .line 169
    if-eqz p0, :cond_5

    .line 170
    .line 171
    const-string p1, "\u671f\u5f85\u4f60\u7684\u8bc4\u8bba"

    .line 172
    .line 173
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_5
    const-string p0, "inputEdit"

    .line 178
    .line 179
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v0

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
