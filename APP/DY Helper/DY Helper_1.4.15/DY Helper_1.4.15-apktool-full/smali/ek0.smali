.class public final synthetic Lek0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lfk0;


# direct methods
.method public synthetic constructor <init>(Lfk0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lek0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lek0;->ζ:Lfk0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Lek0;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lek0;->ζ:Lfk0;

    .line 7
    .line 8
    iget-object p0, p0, Lfk0;->ο:Landroid/widget/EditText;

    .line 9
    .line 10
    const-string p1, "HH:mm:ss"

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    iget-object p0, p0, Lek0;->ζ:Lfk0;

    .line 35
    .line 36
    iget-object p0, p0, Lfk0;->ο:Landroid/widget/EditText;

    .line 37
    .line 38
    const-string p1, "MM-dd HH:mm"

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/4 p1, 0x0

    .line 55
    :goto_1
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_1
    iget-object p0, p0, Lek0;->ζ:Lfk0;

    .line 63
    .line 64
    iget-object p0, p0, Lfk0;->ο:Landroid/widget/EditText;

    .line 65
    .line 66
    const-string p1, "yyyy-MM-dd HH:mm:ss"

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    const/4 p1, 0x0

    .line 83
    :goto_2
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_2
    iget-object p0, p0, Lek0;->ζ:Lfk0;

    .line 91
    .line 92
    iget-object p1, p0, Lfk0;->κ:Landroid/widget/EditText;

    .line 93
    .line 94
    const-string v0, "{time}"

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    .line 98
    .line 99
    iget-object p0, p0, Lfk0;->ο:Landroid/widget/EditText;

    .line 100
    .line 101
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    if-eqz p0, :cond_3

    .line 111
    .line 112
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    goto :goto_3

    .line 117
    :cond_3
    const/4 p0, 0x0

    .line 118
    :goto_3
    invoke-virtual {p1, p0}, Landroid/widget/EditText;->setSelection(I)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_3
    iget-object p0, p0, Lek0;->ζ:Lfk0;

    .line 123
    .line 124
    iget-object p0, p0, Lfk0;->κ:Landroid/widget/EditText;

    .line 125
    .line 126
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-nez p1, :cond_4

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_4
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionStart()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    const/4 v1, 0x0

    .line 138
    if-gez v0, :cond_5

    .line 139
    .line 140
    move v0, v1

    .line 141
    :cond_5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-le v0, v2, :cond_6

    .line 146
    .line 147
    move v0, v2

    .line 148
    :cond_6
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-gez v2, :cond_7

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_7
    move v1, v2

    .line 156
    :goto_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-le v1, v2, :cond_8

    .line 161
    .line 162
    move v1, v2

    .line 163
    :cond_8
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    const-string v1, "\n"

    .line 172
    .line 173
    invoke-interface {p1, v2, v0, v1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 174
    .line 175
    .line 176
    const/4 v0, 0x1

    .line 177
    add-int/2addr v0, v2

    .line 178
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-le v0, p1, :cond_9

    .line 183
    .line 184
    move v0, p1

    .line 185
    :cond_9
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 189
    .line 190
    .line 191
    :goto_5
    return-void

    .line 192
    :pswitch_4
    iget-object p0, p0, Lek0;->ζ:Lfk0;

    .line 193
    .line 194
    iget-object p0, p0, Lfk0;->κ:Landroid/widget/EditText;

    .line 195
    .line 196
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    if-nez p1, :cond_a

    .line 201
    .line 202
    goto :goto_7

    .line 203
    :cond_a
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionStart()I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    const/4 v1, 0x0

    .line 208
    if-gez v0, :cond_b

    .line 209
    .line 210
    move v0, v1

    .line 211
    :cond_b
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-le v0, v2, :cond_c

    .line 216
    .line 217
    move v0, v2

    .line 218
    :cond_c
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-gez v2, :cond_d

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_d
    move v1, v2

    .line 226
    :goto_6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-le v1, v2, :cond_e

    .line 231
    .line 232
    move v1, v2

    .line 233
    :cond_e
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    const-string v1, "{time}"

    .line 242
    .line 243
    invoke-interface {p1, v2, v0, v1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 244
    .line 245
    .line 246
    const/4 v0, 0x6

    .line 247
    add-int/2addr v0, v2

    .line 248
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    if-le v0, p1, :cond_f

    .line 253
    .line 254
    move v0, p1

    .line 255
    :cond_f
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 259
    .line 260
    .line 261
    :goto_7
    return-void

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
