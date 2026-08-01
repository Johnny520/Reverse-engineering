.class public final synthetic Lyi1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/String;

.field public final synthetic η:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyi1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyi1;->η:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lyi1;->ζ:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 1

    .line 12
    const/4 v0, 0x1

    iput v0, p0, Lyi1;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyi1;->ζ:Ljava/lang/String;

    iput-object p2, p0, Lyi1;->η:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    .line 1
    iget p1, p0, Lyi1;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lyi1;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    const/4 v0, 0x0

    .line 16
    const/16 v1, 0xdac

    .line 17
    .line 18
    if-gt p2, v1, :cond_0

    .line 19
    .line 20
    const-string p2, "r242b43e72f6ccb21"

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lux;->ρ(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_5

    .line 30
    .line 31
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    add-int/lit16 p2, p2, 0xdab

    .line 36
    .line 37
    div-int/2addr p2, v1

    .line 38
    invoke-static {v1, v1}, Lp91;->ε(II)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    div-int/lit16 v2, v1, 0xdac

    .line 46
    .line 47
    rem-int/lit16 v3, v1, 0xdac

    .line 48
    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    move v3, v0

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 v3, 0x1

    .line 54
    :goto_0
    add-int/2addr v2, v3

    .line 55
    new-instance v3, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    move v2, v0

    .line 61
    :goto_1
    if-ltz v2, :cond_4

    .line 62
    .line 63
    if-ge v2, v1, :cond_4

    .line 64
    .line 65
    add-int/lit16 v4, v2, 0xdac

    .line 66
    .line 67
    if-ltz v4, :cond_3

    .line 68
    .line 69
    if-le v4, v1, :cond_2

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    move v5, v4

    .line 73
    goto :goto_3

    .line 74
    :cond_3
    :goto_2
    move v5, v1

    .line 75
    :goto_3
    invoke-virtual {p1, v2, v5}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move v2, v4

    .line 90
    goto :goto_1

    .line 91
    :cond_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    move v1, v0

    .line 96
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_6

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    add-int/lit8 v3, v1, 0x1

    .line 107
    .line 108
    if-ltz v1, :cond_5

    .line 109
    .line 110
    check-cast v2, Ljava/lang/String;

    .line 111
    .line 112
    new-instance v1, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v4, "re4c55833703f0c26"

    .line 115
    .line 116
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v1}, Lux;->ρ(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    move v1, v3

    .line 136
    goto :goto_4

    .line 137
    :cond_5
    invoke-static {}, Lyh;->х()V

    .line 138
    .line 139
    .line 140
    const/4 p0, 0x0

    .line 141
    throw p0

    .line 142
    :cond_6
    :goto_5
    const-string p1, "\u5df2\u6253\u5370\u8c03\u8bd5 JSON \u5230\u65e5\u5fd7"

    .line 143
    .line 144
    iget-object p0, p0, Lyi1;->η:Landroid/app/Activity;

    .line 145
    .line 146
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_0
    const-string p1, "clipboard"

    .line 155
    .line 156
    iget-object p2, p0, Lyi1;->η:Landroid/app/Activity;

    .line 157
    .line 158
    invoke-virtual {p2, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    instance-of v0, p1, Landroid/content/ClipboardManager;

    .line 163
    .line 164
    if-eqz v0, :cond_7

    .line 165
    .line 166
    check-cast p1, Landroid/content/ClipboardManager;

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_7
    const/4 p1, 0x0

    .line 170
    :goto_6
    if-eqz p1, :cond_8

    .line 171
    .line 172
    const-string v0, "profile_aweme_debug"

    .line 173
    .line 174
    iget-object p0, p0, Lyi1;->ζ:Ljava/lang/String;

    .line 175
    .line 176
    invoke-static {v0, p0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {p1, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 181
    .line 182
    .line 183
    :cond_8
    const-string p0, "\u5df2\u590d\u5236\u8c03\u8bd5 JSON"

    .line 184
    .line 185
    const/4 p1, 0x0

    .line 186
    invoke-static {p2, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
