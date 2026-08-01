.class public final synthetic Ls0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/a;
.implements LM0/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ls0/J;


# direct methods
.method public synthetic constructor <init>(Ls0/J;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls0/x;->a:I

    iput-object p1, p0, Ls0/x;->b:Ls0/J;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ls0/x;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 7
    .line 8
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getDisableSelfSnsLongPressHidePrompt()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :pswitch_1
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 20
    .line 21
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideSelfSnsPosts()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :pswitch_2
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 33
    .line 34
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideSnsLike()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :pswitch_3
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 46
    .line 47
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideSnsGroupIcon()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0

    .line 58
    :pswitch_4
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 59
    .line 60
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideSnsCloseFriendPosts()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :pswitch_5
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 72
    .line 73
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideTopBarUnreadBold()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0

    .line 84
    :pswitch_6
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 85
    .line 86
    invoke-virtual {v0}, Ls0/J;->N()V

    .line 87
    .line 88
    .line 89
    sget-object v0, LE0/i;->a:LE0/i;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_7
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 93
    .line 94
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHiddenMessageVibrate()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0

    .line 105
    :pswitch_8
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 106
    .line 107
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideConversationUnreadBadge()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0

    .line 118
    :pswitch_9
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 119
    .line 120
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideTextStatusFriend()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    return-object v0

    .line 131
    :pswitch_a
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 132
    .line 133
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 134
    .line 135
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideStorageChatHistory()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    return-object v0

    .line 144
    :pswitch_b
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 145
    .line 146
    invoke-virtual {v0}, Ls0/J;->L()V

    .line 147
    .line 148
    .line 149
    sget-object v0, LE0/i;->a:LE0/i;

    .line 150
    .line 151
    return-object v0

    .line 152
    :pswitch_c
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 153
    .line 154
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideChatHistory()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    return-object v0

    .line 165
    :pswitch_d
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 166
    .line 167
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 168
    .line 169
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideContactFriend()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    return-object v0

    .line 178
    :pswitch_e
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 179
    .line 180
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 181
    .line 182
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideVoipCall()Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0

    .line 191
    :pswitch_f
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 192
    .line 193
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 194
    .line 195
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideCloseFriend()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    return-object v0

    .line 204
    nop

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_0
        :pswitch_e
        :pswitch_0
        :pswitch_0
        :pswitch_d
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ls0/x;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 13
    .line 14
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/lu/wxmask/bean/OptionData;->setDisableSelfSnsLongPressHidePrompt(Z)V

    .line 17
    .line 18
    .line 19
    sget-object p1, LE0/i;->a:LE0/i;

    .line 20
    .line 21
    return-object p1

    .line 22
    :sswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 29
    .line 30
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lcom/lu/wxmask/bean/OptionData;->setHideSnsLike(Z)V

    .line 33
    .line 34
    .line 35
    sget-object p1, LE0/i;->a:LE0/i;

    .line 36
    .line 37
    return-object p1

    .line 38
    :sswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 45
    .line 46
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lcom/lu/wxmask/bean/OptionData;->setHideSnsGroupIcon(Z)V

    .line 49
    .line 50
    .line 51
    sget-object p1, LE0/i;->a:LE0/i;

    .line 52
    .line 53
    return-object p1

    .line 54
    :sswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 61
    .line 62
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Lcom/lu/wxmask/bean/OptionData;->setHideSnsCloseFriendPosts(Z)V

    .line 65
    .line 66
    .line 67
    sget-object p1, LE0/i;->a:LE0/i;

    .line 68
    .line 69
    return-object p1

    .line 70
    :sswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 77
    .line 78
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Lcom/lu/wxmask/bean/OptionData;->setHideTopBarUnreadBold(Z)V

    .line 81
    .line 82
    .line 83
    sget-object p1, LE0/i;->a:LE0/i;

    .line 84
    .line 85
    return-object p1

    .line 86
    :sswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 93
    .line 94
    iget-object v1, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 95
    .line 96
    invoke-virtual {v1, p1}, Lcom/lu/wxmask/bean/OptionData;->setHiddenMessageVibrate(Z)V

    .line 97
    .line 98
    .line 99
    if-eqz p1, :cond_0

    .line 100
    .line 101
    invoke-virtual {v0}, Ls0/J;->N()V

    .line 102
    .line 103
    .line 104
    :cond_0
    sget-object p1, LE0/i;->a:LE0/i;

    .line 105
    .line 106
    return-object p1

    .line 107
    :sswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 114
    .line 115
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 116
    .line 117
    invoke-virtual {v0, p1}, Lcom/lu/wxmask/bean/OptionData;->setHideConversationUnreadBadge(Z)V

    .line 118
    .line 119
    .line 120
    sget-object p1, LE0/i;->a:LE0/i;

    .line 121
    .line 122
    return-object p1

    .line 123
    :sswitch_6
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 124
    .line 125
    check-cast p1, Lt0/c;

    .line 126
    .line 127
    invoke-static {v0, p1}, Ls0/J;->k(Ls0/J;Lt0/c;)V

    .line 128
    .line 129
    .line 130
    sget-object p1, LE0/i;->a:LE0/i;

    .line 131
    .line 132
    return-object p1

    .line 133
    :sswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 140
    .line 141
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 142
    .line 143
    invoke-virtual {v0, p1}, Lcom/lu/wxmask/bean/OptionData;->setHideStorageChatHistory(Z)V

    .line 144
    .line 145
    .line 146
    sget-object p1, LE0/i;->a:LE0/i;

    .line 147
    .line 148
    return-object p1

    .line 149
    :sswitch_8
    check-cast p1, Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 156
    .line 157
    iget-object v1, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 158
    .line 159
    invoke-virtual {v1, p1}, Lcom/lu/wxmask/bean/OptionData;->setHideChatHistory(Z)V

    .line 160
    .line 161
    .line 162
    if-eqz p1, :cond_1

    .line 163
    .line 164
    invoke-virtual {v0}, Ls0/J;->L()V

    .line 165
    .line 166
    .line 167
    :cond_1
    sget-object p1, LE0/i;->a:LE0/i;

    .line 168
    .line 169
    return-object p1

    .line 170
    :sswitch_9
    check-cast p1, Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 177
    .line 178
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 179
    .line 180
    invoke-virtual {v0, p1}, Lcom/lu/wxmask/bean/OptionData;->setHideContactFriend(Z)V

    .line 181
    .line 182
    .line 183
    sget-object p1, LE0/i;->a:LE0/i;

    .line 184
    .line 185
    return-object p1

    .line 186
    :sswitch_a
    check-cast p1, Ljava/lang/Boolean;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 193
    .line 194
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 195
    .line 196
    invoke-virtual {v0, p1}, Lcom/lu/wxmask/bean/OptionData;->setHideCloseFriend(Z)V

    .line 197
    .line 198
    .line 199
    sget-object p1, LE0/i;->a:LE0/i;

    .line 200
    .line 201
    return-object p1

    .line 202
    :sswitch_b
    check-cast p1, Ljava/lang/Boolean;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 209
    .line 210
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 211
    .line 212
    invoke-virtual {v0, p1}, Lcom/lu/wxmask/bean/OptionData;->setHideVoipCall(Z)V

    .line 213
    .line 214
    .line 215
    sget-object p1, LE0/i;->a:LE0/i;

    .line 216
    .line 217
    return-object p1

    .line 218
    :sswitch_c
    check-cast p1, Ljava/lang/Boolean;

    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    iget-object v0, p0, Ls0/x;->b:Ls0/J;

    .line 225
    .line 226
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 227
    .line 228
    invoke-virtual {v0, p1}, Lcom/lu/wxmask/bean/OptionData;->setHideTextStatusFriend(Z)V

    .line 229
    .line 230
    .line 231
    sget-object p1, LE0/i;->a:LE0/i;

    .line 232
    .line 233
    return-object p1

    .line 234
    nop

    .line 235
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_c
        0x3 -> :sswitch_b
        0x4 -> :sswitch_a
        0x6 -> :sswitch_9
        0x9 -> :sswitch_8
        0xb -> :sswitch_7
        0xe -> :sswitch_6
        0xf -> :sswitch_5
        0x11 -> :sswitch_4
        0x14 -> :sswitch_3
        0x16 -> :sswitch_2
        0x18 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method
