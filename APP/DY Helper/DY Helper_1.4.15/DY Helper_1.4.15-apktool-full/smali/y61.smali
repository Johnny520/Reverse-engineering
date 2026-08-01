.class public final synthetic Ly61;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Llh0;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Llh0;I)V
    .locals 0

    .line 1
    iput p3, p0, Ly61;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Ly61;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Ly61;->η:Llh0;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 1
    iget p1, p0, Ly61;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroid/content/Intent;

    .line 7
    .line 8
    const-string p2, "android.intent.action.SEND"

    .line 9
    .line 10
    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Ly61;->η:Llh0;

    .line 14
    .line 15
    iget-object v0, p2, Llh0;->γ:Lhh0;

    .line 16
    .line 17
    iget-object v0, v0, Lhh0;->η:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    iget-object v0, p2, Llh0;->α:Landroid/net/Uri;

    .line 23
    .line 24
    const-string v1, "android.intent.extra.STREAM"

    .line 25
    .line 26
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-virtual {p1, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Ly61;->ζ:Landroid/app/Activity;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-object p2, p2, Llh0;->β:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v2, p2, v0}, Landroid/content/ClipData;->newUri(Landroid/content/ContentResolver;Ljava/lang/CharSequence;Landroid/net/Uri;)Landroid/content/ClipData;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V

    .line 46
    .line 47
    .line 48
    :try_start_0
    const-string p2, "\u5206\u4eab\u804a\u5929\u8bb0\u5f55"

    .line 49
    .line 50
    invoke-static {p1, p2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 55
    .line 56
    .line 57
    sget-object p1, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    new-instance p2, Leo1;

    .line 62
    .line 63
    invoke-direct {p2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    move-object p1, p2

    .line 67
    :goto_0
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-eqz p1, :cond_0

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance p2, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v0, "\u65e0\u6cd5\u6253\u5f00\u5206\u4eab\u9762\u677f\uff1a"

    .line 80
    .line 81
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 96
    .line 97
    .line 98
    :cond_0
    return-void

    .line 99
    :pswitch_0
    new-instance p1, Landroid/content/Intent;

    .line 100
    .line 101
    const-string p2, "android.intent.action.VIEW"

    .line 102
    .line 103
    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object p2, p0, Ly61;->η:Llh0;

    .line 107
    .line 108
    iget-object v0, p2, Llh0;->α:Landroid/net/Uri;

    .line 109
    .line 110
    iget-object v1, p2, Llh0;->γ:Lhh0;

    .line 111
    .line 112
    iget-object v1, v1, Lhh0;->η:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 115
    .line 116
    .line 117
    const/4 v0, 0x1

    .line 118
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 119
    .line 120
    .line 121
    iget-object p0, p0, Ly61;->ζ:Landroid/app/Activity;

    .line 122
    .line 123
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iget-object v2, p2, Llh0;->β:Ljava/lang/String;

    .line 128
    .line 129
    iget-object p2, p2, Llh0;->α:Landroid/net/Uri;

    .line 130
    .line 131
    invoke-static {v1, v2, p2}, Landroid/content/ClipData;->newUri(Landroid/content/ContentResolver;Ljava/lang/CharSequence;Landroid/net/Uri;)Landroid/content/ClipData;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V

    .line 136
    .line 137
    .line 138
    :try_start_1
    const-string p2, "\u6253\u5f00\u804a\u5929\u8bb0\u5f55"

    .line 139
    .line 140
    invoke-static {p1, p2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 145
    .line 146
    .line 147
    sget-object p1, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :catchall_1
    move-exception p1

    .line 151
    new-instance p2, Leo1;

    .line 152
    .line 153
    invoke-direct {p2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    move-object p1, p2

    .line 157
    :goto_1
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    if-eqz p1, :cond_1

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    new-instance p2, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    const-string v1, "\u6ca1\u6709\u53ef\u6253\u5f00\u8be5\u6587\u4ef6\u7684\u5e94\u7528\uff1a"

    .line 170
    .line 171
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 186
    .line 187
    .line 188
    :cond_1
    return-void

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
