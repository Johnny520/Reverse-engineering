.class public final synthetic Loa2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lpa2;

.field public final synthetic η:Lqa2;


# direct methods
.method public synthetic constructor <init>(Lpa2;Lqa2;I)V
    .locals 0

    .line 1
    iput p3, p0, Loa2;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Loa2;->ζ:Lpa2;

    .line 4
    .line 5
    iput-object p2, p0, Loa2;->η:Lqa2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget p1, p0, Loa2;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Loa2;->η:Lqa2;

    .line 7
    .line 8
    iget-object p0, p0, Loa2;->ζ:Lpa2;

    .line 9
    .line 10
    iget-object p0, p0, Lpa2;->θ:Lil1;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lil1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object p1, p0, Loa2;->ζ:Lpa2;

    .line 17
    .line 18
    iget-object p1, p1, Lpa2;->ι:Lla2;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object p0, p0, Loa2;->η:Lqa2;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lla2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :pswitch_1
    iget-object p1, p0, Loa2;->ζ:Lpa2;

    .line 29
    .line 30
    iget-object p1, p1, Lpa2;->η:Lva2;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lva2;->α()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p1, Lva2;->β:Landroid/view/View;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p1, Lva2;->δ:Landroid/widget/ProgressBar;

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 51
    .line 52
    .line 53
    iget-object v2, p1, Lva2;->γ:Landroid/widget/TextView;

    .line 54
    .line 55
    iget-object p0, p0, Loa2;->η:Lqa2;

    .line 56
    .line 57
    iget-object v3, p0, Lqa2;->β:Ljava/lang/String;

    .line 58
    .line 59
    const-string v4, "\u51c6\u5907\u64ad\u653e "

    .line 60
    .line 61
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    :try_start_0
    new-instance v3, Landroid/media/MediaPlayer;

    .line 69
    .line 70
    invoke-direct {v3}, Landroid/media/MediaPlayer;-><init>()V

    .line 71
    .line 72
    .line 73
    iget-object v4, p1, Lva2;->α:Landroid/app/Activity;

    .line 74
    .line 75
    iget-object v5, p0, Lqa2;->γ:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v3, v4, v5}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 82
    .line 83
    .line 84
    new-instance v4, Lsa2;

    .line 85
    .line 86
    invoke-direct {v4, p1, p0}, Lsa2;-><init>(Lva2;Lqa2;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v4}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 90
    .line 91
    .line 92
    new-instance p0, Lta2;

    .line 93
    .line 94
    invoke-direct {p0, p1}, Lta2;-><init>(Lva2;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 98
    .line 99
    .line 100
    new-instance p0, Lua2;

    .line 101
    .line 102
    invoke-direct {p0, p1}, Lua2;-><init>(Lva2;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, p0}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 109
    .line 110
    .line 111
    iput-object v3, p1, Lva2;->ζ:Landroid/media/MediaPlayer;

    .line 112
    .line 113
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :catchall_0
    move-exception p0

    .line 117
    new-instance p1, Leo1;

    .line 118
    .line 119
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    move-object p0, p1

    .line 123
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    if-eqz p0, :cond_1

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    new-instance v3, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v4, "\u64ad\u653e\u5931\u8d25: "

    .line 136
    .line 137
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 151
    .line 152
    .line 153
    const-string p1, "rb360b99c73f2f647"

    .line 154
    .line 155
    const-string v0, "\u64ad\u653e\u66ff\u6362\u97f3\u9891\u5931\u8d25"

    .line 156
    .line 157
    invoke-static {p1, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    :cond_1
    return-void

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
