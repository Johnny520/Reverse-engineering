.class public final synthetic L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .line 1
    iget p1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object v0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    check-cast v0, Landroid/widget/EditText;

    .line 17
    .line 18
    new-instance p1, Ljava/io/File;

    .line 19
    .line 20
    new-instance p2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    sget-object v2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p2, v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance p2, Ljava/io/File;

    .line 35
    .line 36
    invoke-static {v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {p2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->dismiss()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_0
    check-cast p0, Landroid/widget/EditText;

    .line 66
    .line 67
    check-cast v1, Landroid/widget/RadioGroup;

    .line 68
    .line 69
    check-cast v0, Landroid/content/Context;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_0

    .line 84
    .line 85
    const-wide p0, -0x36a5213f051405a7L    # -2.3968958815414486E45

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    sget-object p2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {p1, p2, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    new-instance p1, Ljava/io/File;

    .line 110
    .line 111
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_1

    .line 119
    .line 120
    const-wide p0, -0x36a52126051405a7L    # -2.3969299097781407E45

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_1
    new-instance p1, Ljava/io/File;

    .line 134
    .line 135
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 139
    .line 140
    .line 141
    invoke-static {}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰()Ljava/util/ArrayList;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-eqz p1, :cond_2

    .line 157
    .line 158
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    check-cast p1, Ljava/lang/String;

    .line 163
    .line 164
    new-instance p2, Landroid/widget/RadioButton;

    .line 165
    .line 166
    invoke-direct {p2, v0}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 170
    .line 171
    .line 172
    const/high16 v2, 0x41800000    # 16.0f

    .line 173
    .line 174
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    const v3, 0x24060097

    .line 182
    .line 183
    .line 184
    const/4 v4, 0x0

    .line 185
    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 190
    .line 191
    .line 192
    new-instance v2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世哲苏兰;

    .line 193
    .line 194
    const/4 v3, 0x1

    .line 195
    invoke-direct {v2, p1, v3}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p2, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 202
    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_2
    :goto_1
    return-void

    .line 206
    :pswitch_1
    check-cast p0, Ljava/util/ArrayList;

    .line 207
    .line 208
    check-cast v1, Ljava/util/ArrayList;

    .line 209
    .line 210
    check-cast v0, Landroid/content/Context;

    .line 211
    .line 212
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    check-cast p0, Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    check-cast p1, Ljava/lang/String;

    .line 223
    .line 224
    invoke-static {v0, p0, p1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
