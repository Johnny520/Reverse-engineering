.class public final synthetic L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
    check-cast p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;

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
    sget-object v2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p2, v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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
    invoke-static {v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    const/16 p0, 0x16a

    .line 86
    .line 87
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    sget-object p2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {p1, p2, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    new-instance p1, Ljava/io/File;

    .line 107
    .line 108
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_1

    .line 116
    .line 117
    const/16 p0, 0x16b

    .line 118
    .line 119
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    new-instance p1, Ljava/io/File;

    .line 128
    .line 129
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 133
    .line 134
    .line 135
    invoke-static {}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰()Ljava/util/ArrayList;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_2

    .line 151
    .line 152
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    check-cast p1, Ljava/lang/String;

    .line 157
    .line 158
    new-instance p2, Landroid/widget/RadioButton;

    .line 159
    .line 160
    invoke-direct {p2, v0}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    const/high16 v2, 0x41800000    # 16.0f

    .line 167
    .line 168
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    const v3, 0x24060097

    .line 176
    .line 177
    .line 178
    const/4 v4, 0x0

    .line 179
    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 184
    .line 185
    .line 186
    new-instance v2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世哲苏兰;

    .line 187
    .line 188
    const/4 v3, 0x1

    .line 189
    invoke-direct {v2, p1, v3}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 196
    .line 197
    .line 198
    goto :goto_0

    .line 199
    :cond_2
    :goto_1
    return-void

    .line 200
    :pswitch_1
    check-cast p0, Ljava/util/ArrayList;

    .line 201
    .line 202
    check-cast v1, Ljava/util/ArrayList;

    .line 203
    .line 204
    check-cast v0, Landroid/content/Context;

    .line 205
    .line 206
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    check-cast p0, Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    check-cast p1, Ljava/lang/String;

    .line 217
    .line 218
    invoke-static {v0, p0, p1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
