.class public final synthetic Ls0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LN0/l;


# direct methods
.method public synthetic constructor <init>(LN0/l;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls0/r;->a:I

    iput-object p1, p0, Ls0/r;->b:LN0/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget p1, p0, Ls0/r;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ls0/r;->b:LN0/l;

    .line 7
    .line 8
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    check-cast p1, Landroid/app/AlertDialog;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    :cond_1
    const-string p1, "dialog"

    .line 31
    .line 32
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    throw p1

    .line 37
    :pswitch_0
    iget-object p1, p0, Ls0/r;->b:LN0/l;

    .line 38
    .line 39
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    check-cast p1, Landroid/app/AlertDialog;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void

    .line 61
    :cond_3
    const-string p1, "dialog"

    .line 62
    .line 63
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    throw p1

    .line 68
    :pswitch_1
    iget-object p1, p0, Ls0/r;->b:LN0/l;

    .line 69
    .line 70
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 71
    .line 72
    if-eqz p1, :cond_5

    .line 73
    .line 74
    check-cast p1, Landroid/app/AlertDialog;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_4

    .line 81
    .line 82
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    return-void

    .line 92
    :cond_5
    const-string p1, "dialog"

    .line 93
    .line 94
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const/4 p1, 0x0

    .line 98
    throw p1

    .line 99
    :pswitch_2
    iget-object p1, p0, Ls0/r;->b:LN0/l;

    .line 100
    .line 101
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 102
    .line 103
    if-eqz p1, :cond_7

    .line 104
    .line 105
    check-cast p1, Landroid/app/AlertDialog;

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-eqz p1, :cond_6

    .line 112
    .line 113
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 114
    .line 115
    const/4 v1, 0x0

    .line 116
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 120
    .line 121
    .line 122
    :cond_6
    return-void

    .line 123
    :cond_7
    const-string p1, "dialog"

    .line 124
    .line 125
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    const/4 p1, 0x0

    .line 129
    throw p1

    .line 130
    :pswitch_3
    iget-object p1, p0, Ls0/r;->b:LN0/l;

    .line 131
    .line 132
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 133
    .line 134
    if-eqz p1, :cond_9

    .line 135
    .line 136
    check-cast p1, Landroid/app/AlertDialog;

    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-eqz p1, :cond_8

    .line 143
    .line 144
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 145
    .line 146
    const/4 v1, 0x0

    .line 147
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 151
    .line 152
    .line 153
    :cond_8
    return-void

    .line 154
    :cond_9
    const-string p1, "dialog"

    .line 155
    .line 156
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const/4 p1, 0x0

    .line 160
    throw p1

    .line 161
    :pswitch_4
    iget-object p1, p0, Ls0/r;->b:LN0/l;

    .line 162
    .line 163
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 164
    .line 165
    if-eqz p1, :cond_b

    .line 166
    .line 167
    check-cast p1, Landroid/app/AlertDialog;

    .line 168
    .line 169
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    if-eqz p1, :cond_a

    .line 174
    .line 175
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 176
    .line 177
    const/4 v1, 0x0

    .line 178
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 182
    .line 183
    .line 184
    :cond_a
    return-void

    .line 185
    :cond_b
    const-string p1, "dialog"

    .line 186
    .line 187
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    const/4 p1, 0x0

    .line 191
    throw p1

    .line 192
    :pswitch_5
    iget-object p1, p0, Ls0/r;->b:LN0/l;

    .line 193
    .line 194
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 195
    .line 196
    if-eqz p1, :cond_d

    .line 197
    .line 198
    check-cast p1, Landroid/app/AlertDialog;

    .line 199
    .line 200
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    if-eqz p1, :cond_c

    .line 205
    .line 206
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 207
    .line 208
    const/4 v1, 0x0

    .line 209
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 213
    .line 214
    .line 215
    :cond_c
    return-void

    .line 216
    :cond_d
    const-string p1, "dialog"

    .line 217
    .line 218
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    const/4 p1, 0x0

    .line 222
    throw p1

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
