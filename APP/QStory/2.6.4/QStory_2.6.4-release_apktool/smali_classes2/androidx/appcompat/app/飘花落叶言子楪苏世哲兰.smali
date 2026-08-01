.class public final Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;
.super Landroid/os/Handler;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 21
    const/4 v0, 0x0

    iput v0, p0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 22
    iput-object p2, p0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method public constructor <init>(L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;Landroid/os/Looper;)V
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
    const-string p1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u545c\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c\u545c"

    .line 12
    .line 13
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {p0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
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
    check-cast p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;

    .line 21
    .line 22
    iget-wide v2, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:J

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
    iget-object p0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Landroid/widget/TextView;

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
    const-string v0, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u545c"

    .line 46
    .line 47
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5"

    .line 62
    .line 63
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_0
    iget-object v0, p0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;

    .line 81
    .line 82
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 83
    .line 84
    .line 85
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 86
    .line 87
    instance-of p1, p0, Ljava/lang/String;

    .line 88
    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    check-cast p0, Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    const v1, 0x10cbb

    .line 98
    .line 99
    .line 100
    if-eq p1, v1, :cond_1

    .line 101
    .line 102
    const v1, 0x4b8cc42

    .line 103
    .line 104
    .line 105
    if-eq p1, v1, :cond_0

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    const-string p1, "\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u545c"

    .line 109
    .line 110
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_2

    .line 119
    .line 120
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_1
    const-string p1, "\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c\u55b5"

    .line 125
    .line 126
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_2

    .line 135
    .line 136
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    :goto_0
    iget-object p1, v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Landroid/widget/TextView;

    .line 141
    .line 142
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    instance-of p1, p0, [I

    .line 147
    .line 148
    if-eqz p1, :cond_4

    .line 149
    .line 150
    check-cast p0, [I

    .line 151
    .line 152
    const/4 p1, 0x0

    .line 153
    aget p1, p0, p1

    .line 154
    .line 155
    aget p0, p0, v1

    .line 156
    .line 157
    iget-object v0, v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Landroid/widget/ProgressBar;

    .line 158
    .line 159
    if-eqz v0, :cond_4

    .line 160
    .line 161
    if-lez p0, :cond_4

    .line 162
    .line 163
    invoke-virtual {v0, p0}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 167
    .line 168
    .line 169
    :cond_4
    :goto_1
    return-void

    .line 170
    :pswitch_1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 171
    .line 172
    const/4 v2, -0x3

    .line 173
    if-eq v0, v2, :cond_6

    .line 174
    .line 175
    const/4 v2, -0x2

    .line 176
    if-eq v0, v2, :cond_6

    .line 177
    .line 178
    const/4 v2, -0x1

    .line 179
    if-eq v0, v2, :cond_6

    .line 180
    .line 181
    if-eq v0, v1, :cond_5

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_5
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p0, Landroid/content/DialogInterface;

    .line 187
    .line 188
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, Landroid/content/DialogInterface$OnClickListener;

    .line 195
    .line 196
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    check-cast p0, Landroid/content/DialogInterface;

    .line 205
    .line 206
    iget p1, p1, Landroid/os/Message;->what:I

    .line 207
    .line 208
    invoke-interface {v0, p0, p1}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 209
    .line 210
    .line 211
    :goto_2
    return-void

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
