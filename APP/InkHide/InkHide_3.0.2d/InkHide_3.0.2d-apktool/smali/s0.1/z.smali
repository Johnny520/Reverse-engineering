.class public final synthetic Ls0/z;
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
    iput p2, p0, Ls0/z;->a:I

    iput-object p1, p0, Ls0/z;->b:Ls0/J;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Ls0/z;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    iget-object v0, p0, Ls0/z;->b:Ls0/J;

    .line 7
    .line 8
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideSingleSearch()Z

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
    iget-object v0, p0, Ls0/z;->b:Ls0/J;

    .line 20
    .line 21
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideMainSearch()Z

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
    iget-object v0, p0, Ls0/z;->b:Ls0/J;

    .line 33
    .line 34
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getUseFullscreenConfigUi()Z

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
    iget-object v0, p0, Ls0/z;->b:Ls0/J;

    .line 46
    .line 47
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getDisableWechatHotUpdate()Z

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
    iget-object v0, p0, Ls0/z;->b:Ls0/J;

    .line 59
    .line 60
    iget-object v1, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 61
    .line 62
    invoke-virtual {v1}, Lcom/lu/wxmask/bean/OptionData;->getCustomLocalFriendAvatar()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    invoke-virtual {v0}, Lt0/c;->getActivity()Landroid/app/Activity;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_0

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    new-instance v1, Ls0/l;

    .line 76
    .line 77
    sget-object v2, LF0/s;->a:LF0/s;

    .line 78
    .line 79
    const-string v3, "\u9009\u62e9\u597d\u53cb\u5934\u50cf"

    .line 80
    .line 81
    const-string v4, "\u9009\u62e9"

    .line 82
    .line 83
    invoke-direct {v1, v0, v2, v3, v4}, Ls0/l;-><init>(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    new-instance v2, LC/d;

    .line 87
    .line 88
    const/16 v3, 0xb

    .line 89
    .line 90
    invoke-direct {v2, v3, v0}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iput-object v2, v1, Ls0/l;->n:LC/d;

    .line 94
    .line 95
    invoke-virtual {v1}, Ls0/l;->h()V

    .line 96
    .line 97
    .line 98
    :cond_1
    :goto_0
    sget-object v0, LE0/i;->a:LE0/i;

    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_5
    iget-object v0, p0, Ls0/z;->b:Ls0/J;

    .line 102
    .line 103
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getCustomLocalFriendAvatar()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0

    .line 114
    :pswitch_6
    iget-object v0, p0, Ls0/z;->b:Ls0/J;

    .line 115
    .line 116
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 117
    .line 118
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getAntiRevokeMessage()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    return-object v0

    .line 127
    :pswitch_7
    iget-object v0, p0, Ls0/z;->b:Ls0/J;

    .line 128
    .line 129
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getEnableChattingKey()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    return-object v0

    .line 140
    :pswitch_8
    iget-object v0, p0, Ls0/z;->b:Ls0/J;

    .line 141
    .line 142
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getQuickAddMaskList()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0

    .line 153
    :pswitch_9
    iget-object v0, p0, Ls0/z;->b:Ls0/J;

    .line 154
    .line 155
    invoke-virtual {v0}, Ls0/J;->Q()V

    .line 156
    .line 157
    .line 158
    sget-object v0, LE0/i;->a:LE0/i;

    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_a
    iget-object v0, p0, Ls0/z;->b:Ls0/J;

    .line 162
    .line 163
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 164
    .line 165
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getEnableSearchCommand()Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0

    .line 174
    :pswitch_b
    iget-object v0, p0, Ls0/z;->b:Ls0/J;

    .line 175
    .line 176
    iget-object v0, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 177
    .line 178
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getShakeHideTemporary()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    return-object v0

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, LE0/i;->a:LE0/i;

    .line 2
    .line 3
    iget-object v1, p0, Ls0/z;->b:Ls0/J;

    .line 4
    .line 5
    iget v2, p0, Ls0/z;->a:I

    .line 6
    .line 7
    sparse-switch v2, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lz0/b;

    .line 11
    .line 12
    invoke-static {v1, p1}, Ls0/J;->o(Ls0/J;Lz0/b;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :sswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object v1, v1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lcom/lu/wxmask/bean/OptionData;->setHideSingleSearch(Z)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :sswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget-object v1, v1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Lcom/lu/wxmask/bean/OptionData;->setHideMainSearch(Z)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :sswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iget-object v1, v1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 47
    .line 48
    invoke-virtual {v1, p1}, Lcom/lu/wxmask/bean/OptionData;->setUseFullscreenConfigUi(Z)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :sswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iget-object v1, v1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 59
    .line 60
    invoke-virtual {v1, p1}, Lcom/lu/wxmask/bean/OptionData;->setDisableWechatHotUpdate(Z)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :sswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iget-object v2, v1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 71
    .line 72
    invoke-virtual {v2, p1}, Lcom/lu/wxmask/bean/OptionData;->setCustomLocalFriendAvatar(Z)V

    .line 73
    .line 74
    .line 75
    sget-boolean v3, Lz0/i;->a:Z

    .line 76
    .line 77
    invoke-static {v2}, Lz0/g;->O(Lcom/lu/wxmask/bean/OptionData;)V

    .line 78
    .line 79
    .line 80
    if-eqz p1, :cond_1

    .line 81
    .line 82
    invoke-virtual {v1}, Lt0/c;->getActivity()Landroid/app/Activity;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-nez p1, :cond_0

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    new-instance v1, Ls0/l;

    .line 90
    .line 91
    sget-object v2, LF0/s;->a:LF0/s;

    .line 92
    .line 93
    const-string v3, "\u9009\u62e9\u597d\u53cb\u5934\u50cf"

    .line 94
    .line 95
    const-string v4, "\u9009\u62e9"

    .line 96
    .line 97
    invoke-direct {v1, p1, v2, v3, v4}, Ls0/l;-><init>(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    new-instance v2, LC/d;

    .line 101
    .line 102
    const/16 v3, 0xb

    .line 103
    .line 104
    invoke-direct {v2, v3, p1}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iput-object v2, v1, Ls0/l;->n:LC/d;

    .line 108
    .line 109
    invoke-virtual {v1}, Ls0/l;->h()V

    .line 110
    .line 111
    .line 112
    :cond_1
    :goto_0
    return-object v0

    .line 113
    :sswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    iget-object v1, v1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 120
    .line 121
    invoke-virtual {v1, p1}, Lcom/lu/wxmask/bean/OptionData;->setAntiRevokeMessage(Z)V

    .line 122
    .line 123
    .line 124
    return-object v0

    .line 125
    :sswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    iget-object v1, v1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 132
    .line 133
    invoke-virtual {v1, p1}, Lcom/lu/wxmask/bean/OptionData;->setEnableChattingKey(Z)V

    .line 134
    .line 135
    .line 136
    return-object v0

    .line 137
    :sswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    iget-object v1, v1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 144
    .line 145
    invoke-virtual {v1, p1}, Lcom/lu/wxmask/bean/OptionData;->setQuickAddMaskList(Z)V

    .line 146
    .line 147
    .line 148
    return-object v0

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
    iget-object v2, v1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 156
    .line 157
    invoke-virtual {v2, p1}, Lcom/lu/wxmask/bean/OptionData;->setEnableSearchCommand(Z)V

    .line 158
    .line 159
    .line 160
    if-eqz p1, :cond_2

    .line 161
    .line 162
    invoke-virtual {v1}, Ls0/J;->Q()V

    .line 163
    .line 164
    .line 165
    :cond_2
    return-object v0

    .line 166
    :sswitch_9
    check-cast p1, Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    iget-object v1, v1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 173
    .line 174
    invoke-virtual {v1, p1}, Lcom/lu/wxmask/bean/OptionData;->setShakeHideTemporary(Z)V

    .line 175
    .line 176
    .line 177
    return-object v0

    .line 178
    nop

    .line 179
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_9
        0x4 -> :sswitch_8
        0x6 -> :sswitch_7
        0x8 -> :sswitch_6
        0xa -> :sswitch_5
        0xc -> :sswitch_4
        0xf -> :sswitch_3
        0x11 -> :sswitch_2
        0x13 -> :sswitch_1
        0x15 -> :sswitch_0
    .end sparse-switch
.end method
