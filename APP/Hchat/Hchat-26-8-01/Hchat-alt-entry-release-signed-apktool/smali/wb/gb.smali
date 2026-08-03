.class public final synthetic Lwb/gb;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/gb;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/gb;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-boolean p2, p0, Lwb/gb;->i:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/gb;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p2, p1, 0x3

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x1

    .line 20
    if-eq p2, v0, :cond_0

    .line 21
    .line 22
    move p2, v9

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p2, v8

    .line 25
    :goto_0
    and-int/2addr p1, v9

    .line 26
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    const-string v4, "\u957f\u6309\u804a\u5929\u8bed\u97f3\u540e\u663e\u793a\u8f6c\u53d1\u5165\u53e3"

    .line 33
    .line 34
    const/16 v7, 0x6db0

    .line 35
    .line 36
    iget-object v1, p0, Lwb/gb;->h:Landroid/content/SharedPreferences;

    .line 37
    .line 38
    const-string v2, "voice_forward_chat_forward_enable"

    .line 39
    .line 40
    const-string v3, "\u804a\u5929\u8bed\u97f3\u8f6c\u53d1"

    .line 41
    .line 42
    iget-boolean v5, p0, Lwb/gb;->i:Z

    .line 43
    .line 44
    invoke-static/range {v1 .. v7}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    invoke-static {p1, v6, v8, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 49
    .line 50
    .line 51
    const-string v4, "\u957f\u6309\u804a\u5929\u8bed\u97f3\u540e\u663e\u793a\u4fdd\u5b58\u5165\u53e3"

    .line 52
    .line 53
    const-string v2, "voice_forward_chat_save_enable"

    .line 54
    .line 55
    const-string v3, "\u804a\u5929\u8bed\u97f3\u4fdd\u5b58"

    .line 56
    .line 57
    invoke-static/range {v1 .. v7}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v6, v8, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 61
    .line 62
    .line 63
    const-string v4, "\u591a\u9009\u8bed\u97f3\u540e\u663e\u793a\u9010\u6761\u8f6c\u53d1\u5165\u53e3"

    .line 64
    .line 65
    const-string v2, "voice_forward_chat_multi_forward_enable"

    .line 66
    .line 67
    const-string v3, "\u591a\u9009\u8bed\u97f3\u8f6c\u53d1"

    .line 68
    .line 69
    invoke-static/range {v1 .. v7}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v6, v8, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 73
    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    const-string v2, "voice_forward_chat_multi_merge_enable"

    .line 77
    .line 78
    const-string v3, "\u591a\u9009\u8bed\u97f3\u5408\u5e76"

    .line 79
    .line 80
    const-string v4, "\u591a\u9009\u8bed\u97f3\u540e\u5408\u6210\u4e3a\u4e00\u6761\u8bed\u97f3\uff0c\u53ef\u8f6c\u53d1\u6216\u4fdd\u5b58\u4e3a MP3"

    .line 81
    .line 82
    invoke-static/range {v1 .. v7}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 87
    .line 88
    .line 89
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 90
    .line 91
    return-object p1

    .line 92
    :pswitch_0
    move-object v5, p1

    .line 93
    check-cast v5, Li0/h0;

    .line 94
    .line 95
    check-cast p2, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    and-int/lit8 p2, p1, 0x3

    .line 102
    .line 103
    const/4 v0, 0x2

    .line 104
    const/4 v7, 0x0

    .line 105
    const/4 v8, 0x1

    .line 106
    if-eq p2, v0, :cond_2

    .line 107
    .line 108
    move p2, v8

    .line 109
    goto :goto_2

    .line 110
    :cond_2
    move p2, v7

    .line 111
    :goto_2
    and-int/2addr p1, v8

    .line 112
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_3

    .line 117
    .line 118
    const-string v3, "\u957f\u6309\u6536\u85cf\u8bed\u97f3\u540e\u663e\u793a\u8f6c\u53d1\u5165\u53e3"

    .line 119
    .line 120
    const/16 v6, 0x6db0

    .line 121
    .line 122
    iget-object v0, p0, Lwb/gb;->h:Landroid/content/SharedPreferences;

    .line 123
    .line 124
    const-string v1, "voice_forward_favorite_forward_enable"

    .line 125
    .line 126
    const-string v2, "\u6536\u85cf\u8bed\u97f3\u8f6c\u53d1"

    .line 127
    .line 128
    iget-boolean v4, p0, Lwb/gb;->i:Z

    .line 129
    .line 130
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 131
    .line 132
    .line 133
    const/4 p1, 0x0

    .line 134
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 135
    .line 136
    .line 137
    const-string v3, "\u957f\u6309\u6536\u85cf\u8bed\u97f3\u540e\u663e\u793a\u4fdd\u5b58\u5165\u53e3"

    .line 138
    .line 139
    const-string v1, "voice_forward_favorite_save_enable"

    .line 140
    .line 141
    const-string v2, "\u6536\u85cf\u8bed\u97f3\u4fdd\u5b58"

    .line 142
    .line 143
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_3
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 148
    .line 149
    .line 150
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 151
    .line 152
    return-object p1

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
