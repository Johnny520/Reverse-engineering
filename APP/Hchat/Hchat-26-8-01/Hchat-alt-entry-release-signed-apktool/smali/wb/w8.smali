.class public final synthetic Lwb/w8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/ArrayList;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Landroid/content/Context;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/w8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/w8;->h:Ljava/util/ArrayList;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/w8;->i:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/w8;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/w8;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/w8;->h:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const-string v0, "\u8bf7\u5148\u9009\u62e9\u76d1\u542c\u7fa4"

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iget-object v2, p0, Lwb/w8;->i:Landroid/content/Context;

    .line 18
    .line 19
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    iget-object v1, p0, Lwb/w8;->j:Li0/a1;

    .line 30
    .line 31
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_0
    iget-object v0, p0, Lwb/w8;->h:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    const-string v0, "\u8bf7\u5148\u9009\u62e9\u4f1a\u8bdd\u89c4\u5219"

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    iget-object v2, p0, Lwb/w8;->i:Landroid/content/Context;

    .line 49
    .line 50
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 59
    .line 60
    iget-object v1, p0, Lwb/w8;->j:Li0/a1;

    .line 61
    .line 62
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_1
    iget-object v0, p0, Lwb/w8;->h:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    const-string v0, "\u8bf7\u5148\u9009\u62e9\u9002\u7528\u804a\u5929"

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    iget-object v2, p0, Lwb/w8;->i:Landroid/content/Context;

    .line 80
    .line 81
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 90
    .line 91
    iget-object v1, p0, Lwb/w8;->j:Li0/a1;

    .line 92
    .line 93
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :goto_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_2
    iget-object v0, p0, Lwb/w8;->h:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    const-string v0, "\u8bf7\u5148\u9009\u62e9\u540d\u5355"

    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    iget-object v2, p0, Lwb/w8;->i:Landroid/content/Context;

    .line 111
    .line 112
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 121
    .line 122
    iget-object v1, p0, Lwb/w8;->j:Li0/a1;

    .line 123
    .line 124
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :goto_3
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_3
    iget-object v0, p0, Lwb/w8;->h:Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_4

    .line 137
    .line 138
    const-string v0, "\u8bf7\u5148\u9009\u62e9\u89c4\u5219"

    .line 139
    .line 140
    const/4 v1, 0x0

    .line 141
    iget-object v2, p0, Lwb/w8;->i:Landroid/content/Context;

    .line 142
    .line 143
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 152
    .line 153
    iget-object v1, p0, Lwb/w8;->j:Li0/a1;

    .line 154
    .line 155
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :goto_4
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_4
    iget-object v0, p0, Lwb/w8;->h:Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_5

    .line 168
    .line 169
    const-string v0, "\u8bf7\u5148\u9009\u62e9\u76d1\u542c\u7fa4"

    .line 170
    .line 171
    const/4 v1, 0x0

    .line 172
    iget-object v2, p0, Lwb/w8;->i:Landroid/content/Context;

    .line 173
    .line 174
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_5
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 183
    .line 184
    iget-object v1, p0, Lwb/w8;->j:Li0/a1;

    .line 185
    .line 186
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    :goto_5
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 190
    .line 191
    return-object v0

    .line 192
    :pswitch_5
    iget-object v0, p0, Lwb/w8;->h:Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_6

    .line 199
    .line 200
    const-string v0, "\u8bf7\u5148\u9009\u62e9\u9002\u7528\u804a\u5929"

    .line 201
    .line 202
    const/4 v1, 0x0

    .line 203
    iget-object v2, p0, Lwb/w8;->i:Landroid/content/Context;

    .line 204
    .line 205
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 210
    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_6
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 214
    .line 215
    iget-object v1, p0, Lwb/w8;->j:Li0/a1;

    .line 216
    .line 217
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    :goto_6
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 221
    .line 222
    return-object v0

    .line 223
    :pswitch_6
    iget-object v0, p0, Lwb/w8;->h:Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_7

    .line 230
    .line 231
    const-string v0, "\u8bf7\u5148\u9009\u62e9\u89c4\u5219"

    .line 232
    .line 233
    const/4 v1, 0x0

    .line 234
    iget-object v2, p0, Lwb/w8;->i:Landroid/content/Context;

    .line 235
    .line 236
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 241
    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_7
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 245
    .line 246
    iget-object v1, p0, Lwb/w8;->j:Li0/a1;

    .line 247
    .line 248
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    :goto_7
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 252
    .line 253
    return-object v0

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
