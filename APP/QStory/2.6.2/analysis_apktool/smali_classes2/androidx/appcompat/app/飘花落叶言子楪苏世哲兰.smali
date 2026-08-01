.class public final Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;
.super Landroid/os/Handler;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏哲兰;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 25
    iput-object p2, p0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method public constructor <init>(L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;Landroid/os/Looper;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 3
    .line 4
    iput-object p1, p0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 7
    .line 8
    .line 9
    new-instance p0, Ljava/text/SimpleDateFormat;

    .line 10
    .line 11
    const-wide p1, -0x36a507e5051405a7L    # -2.4057296117867162E45

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 1
    iget v0, p0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/Long;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;

    .line 21
    .line 22
    iget-wide v2, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:J

    .line 23
    .line 24
    sub-long/2addr v2, v0

    .line 25
    const-wide/16 v0, 0x3e8

    .line 26
    .line 27
    div-long v4, v2, v0

    .line 28
    .line 29
    mul-long/2addr v0, v4

    .line 30
    sub-long/2addr v2, v0

    .line 31
    iget-object p0, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Landroid/widget/TextView;

    .line 32
    .line 33
    new-instance p1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-wide v0, -0x36a507ec051405a7L    # -2.4057200838804424E45

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-wide v0, -0x36a507ee051405a7L    # -2.405717361621507E45

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_0
    iget-object v0, p0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏哲兰;

    .line 87
    .line 88
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 89
    .line 90
    .line 91
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 92
    .line 93
    instance-of p1, p0, Ljava/lang/String;

    .line 94
    .line 95
    if-eqz p1, :cond_3

    .line 96
    .line 97
    check-cast p0, Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    const v1, 0x10cbb

    .line 104
    .line 105
    .line 106
    if-eq p1, v1, :cond_1

    .line 107
    .line 108
    const v1, 0x4b8cc42

    .line 109
    .line 110
    .line 111
    if-eq p1, v1, :cond_0

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_0
    const-wide v1, -0x36a54d28051405a7L    # -2.3815954251952156E45

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_2

    .line 128
    .line 129
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_1
    const-wide v1, -0x36a54d2c051405a7L    # -2.3815899806773448E45

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_2

    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_2
    :goto_0
    iget-object p1, v0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Landroid/widget/TextView;

    .line 153
    .line 154
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_3
    instance-of p1, p0, [I

    .line 159
    .line 160
    if-eqz p1, :cond_4

    .line 161
    .line 162
    check-cast p0, [I

    .line 163
    .line 164
    const/4 p1, 0x0

    .line 165
    aget p1, p0, p1

    .line 166
    .line 167
    aget p0, p0, v1

    .line 168
    .line 169
    iget-object v0, v0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Landroid/widget/ProgressBar;

    .line 170
    .line 171
    if-eqz v0, :cond_4

    .line 172
    .line 173
    if-lez p0, :cond_4

    .line 174
    .line 175
    invoke-virtual {v0, p0}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 179
    .line 180
    .line 181
    :cond_4
    :goto_1
    return-void

    .line 182
    :pswitch_1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 183
    .line 184
    const/4 v2, -0x3

    .line 185
    if-eq v0, v2, :cond_6

    .line 186
    .line 187
    const/4 v2, -0x2

    .line 188
    if-eq v0, v2, :cond_6

    .line 189
    .line 190
    const/4 v2, -0x1

    .line 191
    if-eq v0, v2, :cond_6

    .line 192
    .line 193
    if-eq v0, v1, :cond_5

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_5
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast p0, Landroid/content/DialogInterface;

    .line 199
    .line 200
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 201
    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, Landroid/content/DialogInterface$OnClickListener;

    .line 207
    .line 208
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 211
    .line 212
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    check-cast p0, Landroid/content/DialogInterface;

    .line 217
    .line 218
    iget p1, p1, Landroid/os/Message;->what:I

    .line 219
    .line 220
    invoke-interface {v0, p0, p1}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 221
    .line 222
    .line 223
    :goto_2
    return-void

    .line 224
    nop

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
