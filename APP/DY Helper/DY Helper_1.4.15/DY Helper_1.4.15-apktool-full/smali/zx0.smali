.class public final synthetic Lzx0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lf8;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lf8;I)V
    .locals 0

    .line 1
    iput p3, p0, Lzx0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lzx0;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lzx0;->η:Lf8;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lzx0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    sget-object v0, Lqy0;->α:Lqy0;

    .line 9
    .line 10
    iget-object v1, p0, Lzx0;->ζ:Landroid/app/Activity;

    .line 11
    .line 12
    iget-object p0, p0, Lzx0;->η:Lf8;

    .line 13
    .line 14
    invoke-virtual {v0, v1, p0, p1}, Lqy0;->Π(Landroid/app/Activity;Lf8;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Ls62;->α:Ls62;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v0, Lqy0;->α:Lqy0;

    .line 26
    .line 27
    iget-object v1, p0, Lzx0;->ζ:Landroid/app/Activity;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Lyh;->у(Landroid/content/Context;)Liu;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v3, v2, Liu;->β:Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v2}, Liu;->α()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    const-string v2, "DYHelper"

    .line 54
    .line 55
    const-string v3, "[DOWNLOAD-STORAGE] \u5f53\u524d\u7a7a\u95f4\u65e0\u53ef\u7528 SAF \u6388\u6743\uff0c\u6539\u7528 MediaStore"

    .line 56
    .line 57
    invoke-static {v2, v3}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    const-string p0, "\u6ca1\u6709\u9009\u62e9\u4efb\u4f55\u5185\u5bb9"

    .line 67
    .line 68
    invoke-static {v1, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    const-string v2, "dat"

    .line 73
    .line 74
    iget-object p0, p0, Lzx0;->η:Lf8;

    .line 75
    .line 76
    invoke-static {v1, p0, v2}, Lqy0;->γ(Landroid/content/Context;Lf8;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {v2}, Lq02;->ю(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {p1}, Lxh;->З(Ljava/util/List;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Lzy0;

    .line 89
    .line 90
    iget-object v3, v3, Lzy0;->α:Laz0;

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_6

    .line 97
    .line 98
    const/4 v4, 0x1

    .line 99
    if-eq v3, v4, :cond_5

    .line 100
    .line 101
    const/4 v4, 0x2

    .line 102
    if-eq v3, v4, :cond_4

    .line 103
    .line 104
    const/4 v4, 0x3

    .line 105
    if-ne v3, v4, :cond_3

    .line 106
    .line 107
    sget-object v3, Ljy0;->ι:Ljy0;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    invoke-static {}, Lγ;->κ()V

    .line 111
    .line 112
    .line 113
    const/4 p0, 0x0

    .line 114
    goto :goto_3

    .line 115
    :cond_4
    sget-object v3, Ljy0;->θ:Ljy0;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    sget-object v3, Ljy0;->ζ:Ljy0;

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_6
    sget-object v3, Ljy0;->η:Ljy0;

    .line 122
    .line 123
    :goto_1
    invoke-static {v0, v1, p0, v3, v2}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v2, "download_confirm_filename"

    .line 128
    .line 129
    const/4 v3, 0x0

    .line 130
    invoke-static {v1, v2, v3}, Lqy0;->р(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_7

    .line 135
    .line 136
    const/4 v0, 0x0

    .line 137
    invoke-static {v1, p0, p1, v0}, Lqy0;->Ξ(Landroid/app/Activity;Lf8;Ljava/util/List;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_7
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    const-string v3, "\u5c06\u4fdd\u5b58 "

    .line 146
    .line 147
    const-string v4, " \u9879\u8d44\u6e90\uff0c\u6587\u4ef6\u540d\u4f1a\u6309\u8d44\u6e90\u7c7b\u578b\u548c\u9875\u7801\u81ea\u52a8\u8ffd\u52a0\u540e\u7f00\u3002"

    .line 148
    .line 149
    invoke-static {v3, v2, v4}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iget-object v0, v0, Lfv;->β:Ljava/lang/String;

    .line 154
    .line 155
    new-instance v3, Lm3;

    .line 156
    .line 157
    const/4 v4, 0x4

    .line 158
    invoke-direct {v3, v1, p0, p1, v4}, Lm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 159
    .line 160
    .line 161
    const-string p0, "\u786e\u8ba4\u5df2\u9009\u8d44\u6e90\u6587\u4ef6\u540d"

    .line 162
    .line 163
    invoke-static {v1, p0, v2, v0, v3}, Lqy0;->ρ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)V

    .line 164
    .line 165
    .line 166
    :goto_2
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 167
    .line 168
    :goto_3
    return-object p0

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
