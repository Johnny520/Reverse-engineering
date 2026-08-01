.class public final synthetic Lhy0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Z

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;ZLjava/lang/Throwable;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lhy0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lhy0;->ζ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lhy0;->η:Z

    .line 10
    .line 11
    iput-object p3, p0, Lhy0;->θ:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;Ljava/lang/String;Z)V
    .locals 1

    .line 14
    const/4 v0, 0x3

    iput v0, p0, Lhy0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0;->θ:Ljava/lang/Object;

    iput-object p2, p0, Lhy0;->ζ:Ljava/lang/Object;

    iput-boolean p3, p0, Lhy0;->η:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLandroid/app/Activity;Lp3;)V
    .locals 1

    .line 15
    const/4 v0, 0x2

    iput v0, p0, Lhy0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lhy0;->η:Z

    iput-object p2, p0, Lhy0;->ζ:Ljava/lang/Object;

    iput-object p3, p0, Lhy0;->θ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/util/ArrayList;Landroid/app/Activity;)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lhy0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lhy0;->η:Z

    iput-object p2, p0, Lhy0;->θ:Ljava/lang/Object;

    iput-object p3, p0, Lhy0;->ζ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lhy0;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-boolean v2, p0, Lhy0;->η:Z

    .line 5
    .line 6
    iget-object v3, p0, Lhy0;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, Lhy0;->θ:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Landroid/view/View;

    .line 14
    .line 15
    check-cast v3, Ljava/lang/String;

    .line 16
    .line 17
    sget-object v0, Ldk1;->α:Ldk1;

    .line 18
    .line 19
    invoke-static {p0, v3, v2}, Ldk1;->γ(Landroid/view/View;Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    check-cast v3, Landroid/app/Activity;

    .line 24
    .line 25
    check-cast p0, Lp3;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {v3}, Landroid/app/Activity;->isDestroyed()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    sget-object v0, Lq71;->α:Lq71;

    .line 42
    .line 43
    const/16 v0, 0xc

    .line 44
    .line 45
    invoke-static {v3, v0, p0}, Lq71;->Π(Landroid/app/Activity;ILp3;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-nez p0, :cond_1

    .line 54
    .line 55
    invoke-virtual {v3}, Landroid/app/Activity;->isDestroyed()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_1

    .line 60
    .line 61
    const-string p0, "\u672a\u83b7\u5f97\u76ee\u5f55\u5199\u5165\u6388\u6743"

    .line 62
    .line 63
    invoke-static {v3, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 68
    .line 69
    .line 70
    :cond_1
    :goto_0
    return-void

    .line 71
    :pswitch_1
    check-cast v3, Landroid/app/Activity;

    .line 72
    .line 73
    check-cast p0, Ljava/lang/Throwable;

    .line 74
    .line 75
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 76
    .line 77
    invoke-direct {v0, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    const-string v1, "\u52a8\u56fe\u5408\u5e76\u5931\u8d25"

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    const-string v1, "\u52a8\u56fe\u4e0b\u8f7d\u5931\u8d25"

    .line 86
    .line 87
    :goto_1
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-nez v1, :cond_3

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :cond_3
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const-string v0, "\u786e\u5b9a"

    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    invoke-virtual {p0, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_2
    check-cast p0, Ljava/util/ArrayList;

    .line 117
    .line 118
    check-cast v3, Landroid/app/Activity;

    .line 119
    .line 120
    sget-object v0, Lqy0;->α:Lqy0;

    .line 121
    .line 122
    const-string v0, " \u4e2a\u6587\u4ef6"

    .line 123
    .line 124
    if-eqz v2, :cond_8

    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_4

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_6

    .line 142
    .line 143
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    check-cast v4, Ljava/lang/String;

    .line 148
    .line 149
    const-string v5, "_fallback"

    .line 150
    .line 151
    invoke-static {v4, v5, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-eqz v4, :cond_5

    .line 156
    .line 157
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    new-instance v1, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    const-string v2, "\u90e8\u5206\u52a8\u56fe\u5408\u5e76\u5931\u8d25\uff0c\u5df2\u964d\u7ea7\u4fdd\u5b58\u539f\u59cb\u8d44\u6e90: "

    .line 164
    .line 165
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-static {v3, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_6
    :goto_2
    invoke-static {p0}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    check-cast p0, Ljava/lang/String;

    .line 187
    .line 188
    if-nez p0, :cond_7

    .line 189
    .line 190
    const-string p0, "\u5b8c\u6210"

    .line 191
    .line 192
    :cond_7
    const-string v0, "\u52a8\u56fe\u5df2\u5408\u5e76\u4fdd\u5b58: "

    .line 193
    .line 194
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-static {v3, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_8
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    new-instance v1, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    const-string v2, "\u52a8\u56fe\u5df2\u4fdd\u5b58: "

    .line 209
    .line 210
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-static {v3, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :goto_3
    return-void

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
