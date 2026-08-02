.class public final synthetic Lpe;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lpe;->h:I

    .line 2
    .line 3
    iput-object p3, p0, Lpe;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iput p1, p0, Lpe;->i:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lpe;->h:I

    .line 2
    .line 3
    iget v1, p0, Lpe;->i:I

    .line 4
    .line 5
    iget-object p0, p0, Lpe;->j:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/app/Activity;

    .line 11
    .line 12
    sget-object v0, Lte;->a:Lsz0;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_4

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_4

    .line 25
    .line 26
    iget-object v2, v0, Lsz0;->i:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Landroid/app/Dialog;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/app/Dialog;->isShowing()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-ne v2, v3, :cond_0

    .line 38
    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :cond_0
    const v2, 0x790b01d6

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v4, Lsz0;

    .line 52
    .line 53
    const/4 v5, 0x0

    .line 54
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    filled-new-array {v6, v1}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const v6, 0x790b01cf

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v6, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-direct {v4, v1}, Lsz0;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v1, Ll80;

    .line 80
    .line 81
    invoke-direct {v1}, Ll80;-><init>()V

    .line 82
    .line 83
    .line 84
    iget-boolean v6, v1, Ll80;->k:Z

    .line 85
    .line 86
    iget-object v7, v1, Ll80;->h:Lla1;

    .line 87
    .line 88
    if-eqz v6, :cond_1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    iget-object v6, v1, Ll80;->i:Lrc2;

    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    invoke-virtual {v6, v8}, Lrc2;->a(Landroid/os/Bundle;)V

    .line 95
    .line 96
    .line 97
    sget-object v6, Lz91;->ON_CREATE:Lz91;

    .line 98
    .line 99
    invoke-virtual {v7, v6}, Lla1;->e(Lz91;)V

    .line 100
    .line 101
    .line 102
    iput-boolean v3, v1, Ll80;->k:Z

    .line 103
    .line 104
    :goto_0
    new-instance v6, Lix;

    .line 105
    .line 106
    invoke-direct {v6, p0}, Lix;-><init>(Landroid/content/Context;)V

    .line 107
    .line 108
    .line 109
    const v8, 0x79080080

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6, v8, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    const v8, 0x79080083

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v8, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    const v8, 0x79080084

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v8, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    new-instance v8, Lhh1;

    .line 128
    .line 129
    const/16 v9, 0x1d

    .line 130
    .line 131
    invoke-direct {v8, v9, v7}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6, v8}, Lo2;->setViewCompositionStrategy(Lya3;)V

    .line 135
    .line 136
    .line 137
    new-instance v8, Ls70;

    .line 138
    .line 139
    invoke-direct {v8, v4, v2, v3}, Ls70;-><init>(Lsz0;Ljava/lang/String;I)V

    .line 140
    .line 141
    .line 142
    new-instance v2, Lkw;

    .line 143
    .line 144
    const v9, -0x1e40988f

    .line 145
    .line 146
    .line 147
    invoke-direct {v2, v9, v3, v8}, Lkw;-><init>(IZLun0;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v6, v2}, Lix;->setContent(Lmn0;)V

    .line 151
    .line 152
    .line 153
    new-instance v2, Landroid/app/Dialog;

    .line 154
    .line 155
    invoke-direct {v2, p0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v3}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v5}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v5}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v6}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 168
    .line 169
    .line 170
    new-instance p0, Lr70;

    .line 171
    .line 172
    invoke-direct {p0, v1}, Lr70;-><init>(Ll80;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 176
    .line 177
    .line 178
    iput-object v4, v0, Lsz0;->j:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v2, v0, Lsz0;->i:Ljava/lang/Object;

    .line 181
    .line 182
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 183
    .line 184
    .line 185
    iget-boolean p0, v1, Ll80;->k:Z

    .line 186
    .line 187
    if-eqz p0, :cond_3

    .line 188
    .line 189
    iget-boolean p0, v1, Ll80;->l:Z

    .line 190
    .line 191
    if-eqz p0, :cond_2

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_2
    sget-object p0, Lz91;->ON_START:Lz91;

    .line 195
    .line 196
    invoke-virtual {v7, p0}, Lla1;->e(Lz91;)V

    .line 197
    .line 198
    .line 199
    sget-object p0, Lz91;->ON_RESUME:Lz91;

    .line 200
    .line 201
    invoke-virtual {v7, p0}, Lla1;->e(Lz91;)V

    .line 202
    .line 203
    .line 204
    :cond_3
    :goto_1
    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    if-eqz p0, :cond_4

    .line 209
    .line 210
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 211
    .line 212
    invoke-direct {v0, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 216
    .line 217
    .line 218
    const v0, 0x3eb851ec    # 0.36f

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 222
    .line 223
    .line 224
    const/4 v0, -0x2

    .line 225
    invoke-virtual {p0, v0, v0}, Landroid/view/Window;->setLayout(II)V

    .line 226
    .line 227
    .line 228
    :cond_4
    :goto_2
    return-void

    .line 229
    :pswitch_0
    check-cast p0, Ljava/util/function/IntConsumer;

    .line 230
    .line 231
    invoke-interface {p0, v1}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
