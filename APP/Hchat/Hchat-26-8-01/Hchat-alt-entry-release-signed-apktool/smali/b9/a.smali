.class public final Lb9/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic e:I

.field public f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb9/a;->e:I

    .line 2
    .line 3
    invoke-direct {p0}, Lr8/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lb9/a;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "auto_message_forward"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "hide_chat_menu"

    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_1
    const-string v0, "hide_chat_avatar"

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_2
    const-string v0, "fake_wallet_balance"

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_3
    const-string v0, "text_speech"

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_4
    const-string v0, "auto_redpacket"

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_5
    const-string v0, "fake_scan_camera"

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_6
    const-string v0, "original_moments_upload"

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_7
    const-string v0, "message_text_color"

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_8
    const-string v0, "round_avatar"

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_9
    const-string v0, "message_bubble"

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_a
    const-string v0, "chat_time_style"

    .line 40
    .line 41
    return-object v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lr8/g;)V
    .locals 4

    .line 1
    iget v0, p0, Lb9/a;->e:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance p1, Ls8/d;

    .line 10
    .line 11
    const-string v0, "\u6309\u4f1a\u8bdd\u3001\u6d88\u606f\u7c7b\u578b\u548c\u5173\u952e\u8bcd\u81ea\u52a8\u8f6c\u53d1\u6536\u5230\u7684\u6d88\u606f"

    .line 12
    .line 13
    const-string v1, "enhance"

    .line 14
    .line 15
    const-string v2, "auto_message_forward"

    .line 16
    .line 17
    const-string v3, "\u6d88\u606f\u81ea\u52a8\u8f6c\u53d1"

    .line 18
    .line 19
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    new-instance p1, Ls8/d;

    .line 27
    .line 28
    const-string v0, "\u9690\u85cf\u804a\u5929\u6d88\u606f\u957f\u6309\u83dc\u5355\u4e2d\u7684\u6307\u5b9a\u9879\u76ee"

    .line 29
    .line 30
    const-string v1, "practical"

    .line 31
    .line 32
    const-string v2, "hide_chat_menu"

    .line 33
    .line 34
    const-string v3, "\u9690\u85cf\u804a\u5929\u83dc\u5355"

    .line 35
    .line 36
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    new-instance p1, Ls8/d;

    .line 44
    .line 45
    const-string v0, "\u5206\u522b\u9690\u85cf\u804a\u5929\u4e2d\u81ea\u5df1\u6216\u5bf9\u65b9\u7684\u5934\u50cf"

    .line 46
    .line 47
    const-string v1, "practical"

    .line 48
    .line 49
    const-string v2, "hide_chat_avatar"

    .line 50
    .line 51
    const-string v3, "\u9690\u85cf\u5934\u50cf"

    .line 52
    .line 53
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_2
    new-instance p1, Lha/k0;

    .line 61
    .line 62
    const-string v0, "\u81ea\u5b9a\u4e49\u96f6\u94b1\u3001\u96f6\u94b1\u901a\u548c\u7ecf\u8425\u8d26\u6237\u663e\u793a"

    .line 63
    .line 64
    const-string v1, "practical"

    .line 65
    .line 66
    const-string v2, "fake_wallet_balance"

    .line 67
    .line 68
    const-string v3, "\u4f2a\u9020\u96f6\u94b1"

    .line 69
    .line 70
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_3
    new-instance p1, Lha/k0;

    .line 78
    .line 79
    const-string v0, "\u81ea\u52a8\u64ad\u62a5\u5141\u8bb8\u540d\u5355\u5185\u6536\u5230\u7684\u6587\u5b57\u6216\u8bed\u97f3\u6d88\u606f"

    .line 80
    .line 81
    const-string v1, "enhance"

    .line 82
    .line 83
    const-string v2, "text_speech"

    .line 84
    .line 85
    const-string v3, "\u6587\u5b57\u8f6c\u8bed\u97f3\u64ad\u62a5"

    .line 86
    .line 87
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_4
    new-instance p1, Lib/a;

    .line 95
    .line 96
    const/4 v0, 0x2

    .line 97
    invoke-direct {p1, v0}, Lib/a;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 101
    .line 102
    .line 103
    new-instance p1, Lj8/o;

    .line 104
    .line 105
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 106
    .line 107
    .line 108
    const-class v0, Lf8/i;

    .line 109
    .line 110
    invoke-virtual {p0, v0, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :pswitch_5
    new-instance p1, Lha/k0;

    .line 115
    .line 116
    const-string v0, "\u8ba9\u76f8\u518c\u8bc6\u522b\u4e8c\u7ef4\u7801\u6309\u76f8\u673a\u626b\u7801\u6765\u6e90\u5904\u7406"

    .line 117
    .line 118
    const-string v1, "practical"

    .line 119
    .line 120
    const-string v2, "fake_scan_camera"

    .line 121
    .line 122
    const-string v3, "\u6a21\u62df\u76f8\u673a\u626b\u7801"

    .line 123
    .line 124
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :pswitch_6
    new-instance p1, Laa/g;

    .line 132
    .line 133
    const-string v0, "\u53d1\u5e03\u670b\u53cb\u5708\u56fe\u7247\u548c\u89c6\u9891\u65f6\u5c3d\u91cf\u4fdd\u7559\u539f\u59cb\u6587\u4ef6"

    .line 134
    .line 135
    const-string v1, "practical"

    .line 136
    .line 137
    const-string v2, "original_moments_upload"

    .line 138
    .line 139
    const-string v3, "\u670b\u53cb\u5708\u539f\u56fe\u4e0a\u4f20"

    .line 140
    .line 141
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :pswitch_7
    new-instance p1, Laa/g;

    .line 149
    .line 150
    const-string v0, "\u81ea\u5b9a\u4e49\u804a\u5929\u6587\u672c\u6d88\u606f\u5de6\u53f3\u4fa7\u989c\u8272"

    .line 151
    .line 152
    const-string v1, "practical"

    .line 153
    .line 154
    const-string v2, "message_text_color"

    .line 155
    .line 156
    const-string v3, "\u6d88\u606f\u6587\u672c\u989c\u8272"

    .line 157
    .line 158
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_8
    new-instance p1, Laa/g;

    .line 166
    .line 167
    const-string v0, "\u7edf\u4e00\u8bbe\u7f6e\u5fae\u4fe1\u5934\u50cf\u7684\u5706\u89d2\u5f27\u5ea6"

    .line 168
    .line 169
    const-string v1, "practical"

    .line 170
    .line 171
    const-string v2, "round_avatar"

    .line 172
    .line 173
    const-string v3, "\u5706\u89d2\u5934\u50cf"

    .line 174
    .line 175
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :pswitch_9
    new-instance p1, Laa/g;

    .line 183
    .line 184
    const-string v0, "\u5206\u522b\u66ff\u6362\u804a\u5929\u5de6\u53f3\u4fa7\u6c14\u6ce1\u5e76\u9002\u914d\u6df1\u8272\u6a21\u5f0f"

    .line 185
    .line 186
    const-string v1, "practical"

    .line 187
    .line 188
    const-string v2, "message_bubble"

    .line 189
    .line 190
    const-string v3, "\u6d88\u606f\u6c14\u6ce1"

    .line 191
    .line 192
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :pswitch_a
    new-instance p1, Laa/g;

    .line 200
    .line 201
    const-string v0, "\u81ea\u5b9a\u4e49\u6216\u9690\u85cf\u804a\u5929\u8bb0\u5f55\u4e2d\u7684\u5fae\u4fe1\u65f6\u95f4"

    .line 202
    .line 203
    const-string v1, "practical"

    .line 204
    .line 205
    const-string v2, "chat_time_style"

    .line 206
    .line 207
    const-string v3, "\u4f1a\u8bdd\u65f6\u95f4\u6837\u5f0f"

    .line 208
    .line 209
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lr8/g;)V
    .locals 13

    .line 1
    iget v0, p0, Lb9/a;->e:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x6

    .line 5
    const/16 v3, 0xb

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    const/16 v6, 0xc

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const-class v8, Lf8/e;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    new-instance v0, Le9/a;

    .line 21
    .line 22
    invoke-direct {v0, p0, v3, p1}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v8, v0}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    new-instance v0, Lb5/c;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 38
    .line 39
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 40
    .line 41
    const-string v1, "Hchat_hide_chat_menu_config"

    .line 42
    .line 43
    invoke-static {p1, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, v0, Lb5/c;->b:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, v0, Lb5/c;->c:Ljava/lang/Object;

    .line 54
    .line 55
    iput-object v0, p0, Lb9/a;->f:Ljava/lang/Object;

    .line 56
    .line 57
    new-instance p1, Li/e0;

    .line 58
    .line 59
    const/16 v0, 0x18

    .line 60
    .line 61
    invoke-direct {p1, p0, v0}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    const-string v0, "hide_chat_menu"

    .line 65
    .line 66
    const-string v1, "\u9690\u85cf\u957f\u6309\u83dc\u5355"

    .line 67
    .line 68
    invoke-static {v6, p1, v0, v1, v7}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 69
    .line 70
    .line 71
    new-instance p1, Lq9/a;

    .line 72
    .line 73
    const/4 v0, 0x7

    .line 74
    invoke-direct {p1, p0, v0}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v8, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_1
    new-instance v0, Ls9/b;

    .line 82
    .line 83
    invoke-direct {v0, p1}, Ls9/b;-><init>(Lr8/g;)V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, Lb9/a;->f:Ljava/lang/Object;

    .line 87
    .line 88
    new-instance p1, Li/e0;

    .line 89
    .line 90
    const/16 v0, 0x14

    .line 91
    .line 92
    invoke-direct {p1, p0, v0}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 93
    .line 94
    .line 95
    const-string v0, "hide_chat_avatar"

    .line 96
    .line 97
    const-string v1, "\u9690\u85cf\u5934\u50cf"

    .line 98
    .line 99
    invoke-static {v6, p1, v0, v1, v7}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 100
    .line 101
    .line 102
    new-instance p1, Lq9/a;

    .line 103
    .line 104
    invoke-direct {p1, p0, v2}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v8, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_2
    new-instance v0, Lqa/f;

    .line 112
    .line 113
    invoke-direct {v0, p1}, Lqa/f;-><init>(Lr8/g;)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, Lb9/a;->f:Ljava/lang/Object;

    .line 117
    .line 118
    new-instance p1, Li/e0;

    .line 119
    .line 120
    invoke-direct {p1, p0, v6}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 121
    .line 122
    .line 123
    const-string v0, "fake_wallet_balance"

    .line 124
    .line 125
    const-string v1, "\u4f2a\u9020\u96f6\u94b1"

    .line 126
    .line 127
    invoke-static {v6, p1, v0, v1, v7}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :pswitch_3
    new-instance v0, Lnb/w;

    .line 132
    .line 133
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 134
    .line 135
    invoke-direct {v0, p1}, Lnb/w;-><init>(Landroid/content/Context;)V

    .line 136
    .line 137
    .line 138
    iput-object v0, p0, Lb9/a;->f:Ljava/lang/Object;

    .line 139
    .line 140
    const-class p1, Landroid/view/KeyEvent;

    .line 141
    .line 142
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    const-class v0, Landroid/app/Activity;

    .line 147
    .line 148
    const-string v1, "dispatchKeyEvent"

    .line 149
    .line 150
    invoke-static {v0, v1, p1}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-nez p1, :cond_0

    .line 155
    .line 156
    const-string p1, "[Hchat:TextSpeech] \u672a\u627e\u5230 Activity.dispatchKeyEvent"

    .line 157
    .line 158
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_0
    :try_start_0
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 163
    .line 164
    new-instance v1, Lb9/e;

    .line 165
    .line 166
    const/16 v2, 0x13

    .line 167
    .line 168
    invoke-direct {v1, p0, v2}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, p1, v1}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 172
    .line 173
    .line 174
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    goto :goto_0

    .line 176
    :catchall_0
    move-exception p1

    .line 177
    new-instance v0, Lsf/f;

    .line 178
    .line 179
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    move-object p1, v0

    .line 183
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    if-eqz p1, :cond_1

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const-string v1, "[Hchat:TextSpeech] \u97f3\u91cf\u952e Hook \u5b89\u88c5\u5931\u8d25: "

    .line 194
    .line 195
    invoke-static {v1, v0, p1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    :cond_1
    :goto_1
    new-instance p1, Lke/h;

    .line 199
    .line 200
    const/16 v0, 0x1a

    .line 201
    .line 202
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v8, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :pswitch_4
    sget-object v0, Lr8/e;->a:Landroid/os/Handler;

    .line 210
    .line 211
    new-instance v0, Laa/c;

    .line 212
    .line 213
    const/16 v1, 0x16

    .line 214
    .line 215
    invoke-direct {v0, p0, v1, p1}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    const/16 v1, 0x8

    .line 219
    .line 220
    const-string v2, "auto_redpacket"

    .line 221
    .line 222
    const-string v3, "\u81ea\u52a8\u62a2\u7ea2\u5305"

    .line 223
    .line 224
    sget-object v4, Lr8/c;->j:Lr8/c;

    .line 225
    .line 226
    invoke-static {v1, v0, v2, v3, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 227
    .line 228
    .line 229
    new-instance v0, Le9/a;

    .line 230
    .line 231
    const/4 v1, 0x2

    .line 232
    invoke-direct {v0, p0, v1, p1}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0, v8, v0}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :pswitch_5
    new-instance v0, Lea/c;

    .line 240
    .line 241
    invoke-direct {v0, p1}, Lea/c;-><init>(Lr8/g;)V

    .line 242
    .line 243
    .line 244
    iput-object v0, p0, Lb9/a;->f:Ljava/lang/Object;

    .line 245
    .line 246
    invoke-virtual {v0, v4}, Lea/c;->a(Z)Z

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    if-ne p1, v5, :cond_2

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_2
    new-instance p1, Li/e0;

    .line 254
    .line 255
    invoke-direct {p1, p0, v5}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 256
    .line 257
    .line 258
    const-string v0, "fake_scan_camera"

    .line 259
    .line 260
    const-string v2, "\u6a21\u62df\u76f8\u673a\u626b\u7801"

    .line 261
    .line 262
    invoke-static {v1, p1, v0, v2, v7}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 263
    .line 264
    .line 265
    :goto_2
    new-instance p1, Lke/h;

    .line 266
    .line 267
    const/16 v0, 0x10

    .line 268
    .line 269
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, v8, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    :pswitch_6
    new-instance v0, Lha/g0;

    .line 277
    .line 278
    invoke-direct {v0, p1}, Lha/g0;-><init>(Lr8/g;)V

    .line 279
    .line 280
    .line 281
    iput-object v0, p0, Lb9/a;->f:Ljava/lang/Object;

    .line 282
    .line 283
    invoke-virtual {v0, v4}, Lha/g0;->b(Z)Z

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    if-ne p1, v5, :cond_3

    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_3
    new-instance p1, Lab/a;

    .line 291
    .line 292
    const/16 v0, 0x1c

    .line 293
    .line 294
    invoke-direct {p1, p0, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 295
    .line 296
    .line 297
    const-string v0, "original_moments_upload"

    .line 298
    .line 299
    const-string v1, "\u670b\u53cb\u5708\u539f\u56fe\u4e0a\u4f20"

    .line 300
    .line 301
    invoke-static {v6, p1, v0, v1, v7}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 302
    .line 303
    .line 304
    :goto_3
    new-instance p1, Lke/h;

    .line 305
    .line 306
    const/16 v0, 0xe

    .line 307
    .line 308
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0, v8, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :pswitch_7
    new-instance v0, Lda/h;

    .line 316
    .line 317
    invoke-direct {v0, p1}, Lda/h;-><init>(Lr8/g;)V

    .line 318
    .line 319
    .line 320
    iput-object v0, p0, Lb9/a;->f:Ljava/lang/Object;

    .line 321
    .line 322
    new-instance p1, Lab/a;

    .line 323
    .line 324
    const/16 v0, 0xd

    .line 325
    .line 326
    invoke-direct {p1, p0, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 327
    .line 328
    .line 329
    const-string v0, "message_text_color"

    .line 330
    .line 331
    const-string v1, "\u6d88\u606f\u6587\u672c\u989c\u8272"

    .line 332
    .line 333
    invoke-static {v6, p1, v0, v1, v7}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 334
    .line 335
    .line 336
    return-void

    .line 337
    :pswitch_8
    new-instance v0, Lcb/f;

    .line 338
    .line 339
    invoke-direct {v0, p1}, Lcb/f;-><init>(Lr8/g;)V

    .line 340
    .line 341
    .line 342
    iget-object p1, v0, Lcb/f;->f:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 345
    .line 346
    const-class v1, Landroid/graphics/Bitmap;

    .line 347
    .line 348
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    const-class v9, Landroid/app/Notification$Builder;

    .line 353
    .line 354
    const-string v10, "setLargeIcon"

    .line 355
    .line 356
    invoke-static {v9, v10, v1}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    if-eqz v1, :cond_5

    .line 361
    .line 362
    invoke-virtual {p1, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v11

    .line 366
    if-nez v11, :cond_4

    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_4
    :try_start_1
    sget-object v11, Lr8/i;->b:Lr8/i;

    .line 370
    .line 371
    new-instance v12, Lcb/d;

    .line 372
    .line 373
    invoke-direct {v12, v0, v4}, Lcb/d;-><init>(Lcb/f;I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v11, v1, v12}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 377
    .line 378
    .line 379
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 380
    goto :goto_4

    .line 381
    :catchall_1
    move-exception v4

    .line 382
    new-instance v11, Lsf/f;

    .line 383
    .line 384
    invoke-direct {v11, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 385
    .line 386
    .line 387
    move-object v4, v11

    .line 388
    :goto_4
    invoke-static {v4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    if-eqz v4, :cond_5

    .line 393
    .line 394
    invoke-virtual {p1, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    const-string v11, "[Hchat:RoundAvatar] \u5b89\u88c5\u901a\u77e5 Bitmap \u5934\u50cf Hook \u5931\u8d25: "

    .line 402
    .line 403
    invoke-static {v11, v1, v4}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 404
    .line 405
    .line 406
    :cond_5
    :goto_5
    const-class v1, Landroid/graphics/drawable/Icon;

    .line 407
    .line 408
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    invoke-static {v9, v10, v1}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    if-eqz v1, :cond_7

    .line 417
    .line 418
    invoke-virtual {p1, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v4

    .line 422
    if-nez v4, :cond_6

    .line 423
    .line 424
    goto :goto_7

    .line 425
    :cond_6
    :try_start_2
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 426
    .line 427
    new-instance v9, Lcb/d;

    .line 428
    .line 429
    invoke-direct {v9, v0, v5}, Lcb/d;-><init>(Lcb/f;I)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v4, v1, v9}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 433
    .line 434
    .line 435
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 436
    goto :goto_6

    .line 437
    :catchall_2
    move-exception v4

    .line 438
    new-instance v5, Lsf/f;

    .line 439
    .line 440
    invoke-direct {v5, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 441
    .line 442
    .line 443
    move-object v4, v5

    .line 444
    :goto_6
    invoke-static {v4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    if-eqz v4, :cond_7

    .line 449
    .line 450
    invoke-virtual {p1, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    const-string v1, "[Hchat:RoundAvatar] \u5b89\u88c5\u901a\u77e5 Icon \u5934\u50cf Hook \u5931\u8d25: "

    .line 458
    .line 459
    invoke-static {v1, p1, v4}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 460
    .line 461
    .line 462
    :cond_7
    :goto_7
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 463
    .line 464
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    const-class v1, Landroid/app/Notification;

    .line 468
    .line 469
    filled-new-array {p1, v1}, [Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    move-result-object v4

    .line 473
    const-class v5, Landroid/app/NotificationManager;

    .line 474
    .line 475
    const-string v9, "notify"

    .line 476
    .line 477
    invoke-static {v5, v9, v4}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    invoke-virtual {v0, v4}, Lcb/f;->e(Ljava/lang/reflect/Method;)V

    .line 482
    .line 483
    .line 484
    const-class v4, Ljava/lang/String;

    .line 485
    .line 486
    filled-new-array {v4, p1, v1}, [Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    move-result-object p1

    .line 490
    invoke-static {v5, v9, p1}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 491
    .line 492
    .line 493
    move-result-object p1

    .line 494
    invoke-virtual {v0, p1}, Lcb/f;->e(Ljava/lang/reflect/Method;)V

    .line 495
    .line 496
    .line 497
    iput-object v0, p0, Lb9/a;->f:Ljava/lang/Object;

    .line 498
    .line 499
    new-instance p1, Lab/a;

    .line 500
    .line 501
    invoke-direct {p1, p0, v3}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 502
    .line 503
    .line 504
    const-string v0, "round_avatar"

    .line 505
    .line 506
    const-string v1, "\u5706\u89d2\u5934\u50cf"

    .line 507
    .line 508
    invoke-static {v6, p1, v0, v1, v7}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 509
    .line 510
    .line 511
    new-instance p1, Lke/h;

    .line 512
    .line 513
    invoke-direct {p1, p0, v2}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {p0, v8, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 517
    .line 518
    .line 519
    return-void

    .line 520
    :pswitch_9
    new-instance v0, Lba/m;

    .line 521
    .line 522
    invoke-direct {v0, p1}, Lba/m;-><init>(Lr8/g;)V

    .line 523
    .line 524
    .line 525
    iput-object v0, p0, Lb9/a;->f:Ljava/lang/Object;

    .line 526
    .line 527
    new-instance p1, Lab/a;

    .line 528
    .line 529
    const/4 v0, 0x5

    .line 530
    invoke-direct {p1, p0, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 531
    .line 532
    .line 533
    const-string v0, "message_bubble"

    .line 534
    .line 535
    const-string v1, "\u6d88\u606f\u6c14\u6ce1"

    .line 536
    .line 537
    invoke-static {v6, p1, v0, v1, v7}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 538
    .line 539
    .line 540
    return-void

    .line 541
    :pswitch_a
    new-instance v0, Lb9/f;

    .line 542
    .line 543
    invoke-direct {v0, p1}, Lb9/f;-><init>(Lr8/g;)V

    .line 544
    .line 545
    .line 546
    iput-object v0, p0, Lb9/a;->f:Ljava/lang/Object;

    .line 547
    .line 548
    new-instance p1, Lab/a;

    .line 549
    .line 550
    invoke-direct {p1, p0, v1}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 551
    .line 552
    .line 553
    const-string v0, "chat_time_style"

    .line 554
    .line 555
    const-string v1, "\u4f1a\u8bdd\u65f6\u95f4\u6837\u5f0f"

    .line 556
    .line 557
    invoke-static {v6, p1, v0, v1, v7}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 558
    .line 559
    .line 560
    new-instance p1, Lke/h;

    .line 561
    .line 562
    const/4 v0, 0x3

    .line 563
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {p0, v8, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 567
    .line 568
    .line 569
    return-void

    .line 570
    nop

    .line 571
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lb9/a;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "\u6d88\u606f\u81ea\u52a8\u8f6c\u53d1"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "\u9690\u85cf\u957f\u6309\u83dc\u5355"

    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_1
    const-string v0, "\u9690\u85cf\u5934\u50cf"

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_2
    const-string v0, "\u4f2a\u9020\u96f6\u94b1"

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_3
    const-string v0, "\u6587\u5b57\u8f6c\u8bed\u97f3\u64ad\u62a5"

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_4
    const-string v0, "\u81ea\u52a8\u62a2\u7ea2\u5305"

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_5
    const-string v0, "\u6a21\u62df\u76f8\u673a\u626b\u7801"

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_6
    const-string v0, "\u670b\u53cb\u5708\u539f\u56fe\u4e0a\u4f20"

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_7
    const-string v0, "\u6d88\u606f\u6587\u672c\u989c\u8272"

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_8
    const-string v0, "\u5706\u89d2\u5934\u50cf"

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_9
    const-string v0, "\u6d88\u606f\u6c14\u6ce1"

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_a
    const-string v0, "\u4f1a\u8bdd\u65f6\u95f4\u6837\u5f0f"

    .line 40
    .line 41
    return-object v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
