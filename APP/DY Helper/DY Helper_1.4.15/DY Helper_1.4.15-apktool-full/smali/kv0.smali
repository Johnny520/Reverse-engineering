.class public final synthetic Lkv0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkv0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lkv0;->ζ:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lkv0;->ε:I

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Ls62;->α:Ls62;

    .line 7
    .line 8
    iget-object p0, p0, Lkv0;->ζ:Landroid/content/Context;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, La80;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-object v0, Lbv1;->α:Lbv1;

    .line 19
    .line 20
    const-string v0, "voice_replace_mp3_uri"

    .line 21
    .line 22
    invoke-static {v0}, Lui1;->Κ(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "voice_replace_mp3_name"

    .line 26
    .line 27
    invoke-static {v0}, Lui1;->Κ(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string v0, "voice_replace_audio_list"

    .line 31
    .line 32
    invoke-static {v0}, Lui1;->Κ(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v0, "\u672a\u9009\u62e9"

    .line 36
    .line 37
    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const-string p1, "\u5df2\u6e05\u9664\u66ff\u6362\u97f3\u9891"

    .line 41
    .line 42
    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    sget-object v0, Lbv1;->α:Lbv1;

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    if-ge p1, v0, :cond_0

    .line 60
    .line 61
    move p1, v0

    .line 62
    :cond_0
    const-string v0, "idle_auto_exit_minutes"

    .line 63
    .line 64
    invoke-static {p1, p0, v0}, Lbv1;->Ι(ILandroid/content/Context;Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    return-object v3

    .line 68
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    sget-object v0, Lbv1;->α:Lbv1;

    .line 75
    .line 76
    invoke-static {p1, v2, v1}, Lj81;->μ(III)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_1

    .line 88
    .line 89
    invoke-static {p0}, Li81;->Α(Landroid/content/Context;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    const-string p0, "clean_top_bar_alpha"

    .line 94
    .line 95
    invoke-static {p0, p1}, Lui1;->Η(Ljava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    invoke-static {p0}, Lbv1;->Ε(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    return-object v3

    .line 102
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    sget-object v0, Lbv1;->α:Lbv1;

    .line 109
    .line 110
    invoke-static {p1, v2, v1}, Lj81;->μ(III)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_2

    .line 122
    .line 123
    invoke-static {p0}, Li81;->Α(Landroid/content/Context;)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_2
    const-string p0, "clean_bottom_info_alpha"

    .line 128
    .line 129
    invoke-static {p0, p1}, Lui1;->Η(Ljava/lang/String;I)V

    .line 130
    .line 131
    .line 132
    invoke-static {p0}, Lbv1;->Ε(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :goto_1
    return-object v3

    .line 136
    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    sget-object v0, Lbv1;->α:Lbv1;

    .line 143
    .line 144
    invoke-static {p1, v2, v1}, Lj81;->μ(III)I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_3

    .line 156
    .line 157
    invoke-static {p0}, Li81;->Α(Landroid/content/Context;)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_3
    const-string p0, "clean_right_panel_alpha"

    .line 162
    .line 163
    invoke-static {p0, p1}, Lui1;->Η(Ljava/lang/String;I)V

    .line 164
    .line 165
    .line 166
    invoke-static {p0}, Lbv1;->Ε(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :goto_2
    return-object v3

    .line 170
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    sget-object v0, Lbv1;->α:Lbv1;

    .line 177
    .line 178
    const-string v0, "bottom_bar_text_alpha"

    .line 179
    .line 180
    invoke-static {p1, v2, v1}, Lj81;->μ(III)I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    invoke-static {p1, p0, v0}, Lbv1;->Ι(ILandroid/content/Context;Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    return-object v3

    .line 188
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    sget-object v0, Lqy0;->α:Lqy0;

    .line 194
    .line 195
    const/4 v0, 0x0

    .line 196
    invoke-static {p0, p1, v0}, Lqy0;->т(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    return-object p0

    .line 201
    :pswitch_6
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 202
    .line 203
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->α(Landroid/content/Context;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ls62;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    return-object p0

    .line 208
    nop

    .line 209
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
