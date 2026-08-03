.class public final synthetic Lwb/wk;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p9, p0, Lwb/wk;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/wk;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/wk;->i:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/wk;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/wk;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/wk;->l:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/wk;->m:Li0/a1;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/wk;->n:Li0/a1;

    .line 16
    .line 17
    iput-object p8, p0, Lwb/wk;->o:Li0/a1;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lwb/wk;->g:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "\u8bbe\u7f6e\u5df2\u4fdd\u5b58"

    .line 7
    .line 8
    iget-object v4, p0, Lwb/wk;->o:Li0/a1;

    .line 9
    .line 10
    iget-object v5, p0, Lwb/wk;->n:Li0/a1;

    .line 11
    .line 12
    iget-object v6, p0, Lwb/wk;->m:Li0/a1;

    .line 13
    .line 14
    iget-object v7, p0, Lwb/wk;->l:Li0/a1;

    .line 15
    .line 16
    iget-object v8, p0, Lwb/wk;->k:Li0/a1;

    .line 17
    .line 18
    iget-object v9, p0, Lwb/wk;->j:Li0/a1;

    .line 19
    .line 20
    iget-object v10, p0, Lwb/wk;->i:Landroid/content/Context;

    .line 21
    .line 22
    iget-object v11, p0, Lwb/wk;->h:Landroid/content/SharedPreferences;

    .line 23
    .line 24
    packed-switch v0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    sget-object v0, Lqa/g;->a:Log/k;

    .line 28
    .line 29
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v0}, Lqa/g;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v12

    .line 43
    check-cast v12, Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v12}, Lqa/g;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v12

    .line 49
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v13

    .line 53
    check-cast v13, Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v13}, Lqa/g;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v13

    .line 59
    invoke-interface {v9, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v8, v12}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v7, v13}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v11}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    const-string v8, "fake_wallet_balance_amount"

    .line 73
    .line 74
    invoke-interface {v7, v8, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v7, "fake_wallet_lqt_amount"

    .line 79
    .line 80
    invoke-interface {v0, v7, v12}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-string v7, "fake_wallet_business_amount"

    .line 85
    .line 86
    invoke-interface {v0, v7, v13}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    check-cast v6, Ljava/lang/String;

    .line 95
    .line 96
    const-string v7, "fake_wallet_balance_mode_balance"

    .line 97
    .line 98
    invoke-interface {v0, v7, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    check-cast v5, Ljava/lang/String;

    .line 107
    .line 108
    const-string v6, "fake_wallet_balance_mode_lqt"

    .line 109
    .line 110
    invoke-interface {v0, v6, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, Ljava/lang/String;

    .line 119
    .line 120
    const-string v5, "fake_wallet_balance_mode_business"

    .line 121
    .line 122
    invoke-interface {v0, v5, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 127
    .line 128
    .line 129
    invoke-static {v10, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 134
    .line 135
    .line 136
    return-object v1

    .line 137
    :pswitch_0
    invoke-interface {v11}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    check-cast v9, Ljava/lang/String;

    .line 146
    .line 147
    const-string v11, "protobuf_packet_block_types"

    .line 148
    .line 149
    invoke-interface {v0, v11, v9}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    check-cast v8, Ljava/lang/String;

    .line 158
    .line 159
    invoke-static {v8}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    const-string v9, "protobuf_packet_send_uri"

    .line 168
    .line 169
    invoke-interface {v0, v9, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    check-cast v7, Ljava/lang/String;

    .line 178
    .line 179
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    const-string v8, "protobuf_packet_send_type"

    .line 188
    .line 189
    invoke-interface {v0, v8, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    check-cast v6, Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    const-string v7, "protobuf_packet_send_func_id"

    .line 208
    .line 209
    invoke-interface {v0, v7, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    check-cast v5, Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    const-string v6, "protobuf_packet_send_route_id"

    .line 228
    .line 229
    invoke-interface {v0, v6, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    check-cast v4, Ljava/lang/String;

    .line 238
    .line 239
    const-string v5, "protobuf_packet_send_payload"

    .line 240
    .line 241
    invoke-interface {v0, v5, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 246
    .line 247
    .line 248
    invoke-static {v10, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 253
    .line 254
    .line 255
    return-object v1

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
