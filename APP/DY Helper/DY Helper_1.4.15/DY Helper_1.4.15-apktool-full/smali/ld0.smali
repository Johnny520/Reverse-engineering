.class public final synthetic Lld0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lld0;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lld0;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1

    .line 1
    iget p1, p0, Lld0;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lld0;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lli0;

    .line 9
    .line 10
    iget-boolean p1, p0, Lli0;->Γ:Z

    .line 11
    .line 12
    if-nez p1, :cond_5

    .line 13
    .line 14
    iget-boolean p1, p0, Lli0;->Δ:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    iget-object p1, p0, Lli0;->ψ:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {p3, p1}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lxi0;

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    invoke-virtual {p1}, Lxi0;->α()Z

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    if-nez p3, :cond_2

    .line 35
    .line 36
    iget-object p0, p0, Lli0;->α:Landroid/app/Activity;

    .line 37
    .line 38
    const-string p1, "\u540d\u79f0\u5c1a\u672a\u89e3\u6790\uff0c\u6682\u4e0d\u80fd\u9009\u62e9"

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/4 p3, 0x3

    .line 50
    invoke-virtual {p2, p3}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lli0;->τ:Lij0;

    .line 54
    .line 55
    monitor-enter p2

    .line 56
    :try_start_0
    invoke-virtual {p1}, Lxi0;->α()Z

    .line 57
    .line 58
    .line 59
    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    if-nez p3, :cond_3

    .line 61
    .line 62
    monitor-exit p2

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    :try_start_1
    iget-object p3, p2, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    iget-object p4, p1, Lxi0;->α:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p3, p4}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p3

    .line 72
    if-eqz p3, :cond_4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    iget-object p3, p2, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 76
    .line 77
    iget-object p1, p1, Lxi0;->α:Ljava/lang/String;

    .line 78
    .line 79
    invoke-interface {p3, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    .line 81
    .line 82
    :goto_0
    monitor-exit p2

    .line 83
    :goto_1
    invoke-virtual {p0}, Lli0;->θ()V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :catchall_0
    move-exception p0

    .line 88
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    throw p0

    .line 90
    :cond_5
    :goto_2
    return-void

    .line 91
    :pswitch_0
    check-cast p0, Lnd0;

    .line 92
    .line 93
    iget-object p1, p0, Lnd0;->Θ:Ljava/util/List;

    .line 94
    .line 95
    invoke-static {p3, p1}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Lxd0;

    .line 100
    .line 101
    if-nez p1, :cond_6

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_6
    iget-object p2, p0, Lnd0;->Δ:Lad0;

    .line 105
    .line 106
    sget-object p3, Lad0;->ε:Lad0;

    .line 107
    .line 108
    if-ne p2, p3, :cond_7

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Lnd0;->α(Lxd0;)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_7
    iget-object p2, p1, Lxd0;->ε:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result p3

    .line 120
    if-eqz p3, :cond_8

    .line 121
    .line 122
    iget-object p2, p1, Lxd0;->α:Ljava/lang/String;

    .line 123
    .line 124
    const-string p3, "UID "

    .line 125
    .line 126
    invoke-static {p3, p2}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    :cond_8
    new-instance p3, Landroid/app/AlertDialog$Builder;

    .line 131
    .line 132
    iget-object p4, p0, Lnd0;->α:Landroid/app/Activity;

    .line 133
    .line 134
    invoke-direct {p3, p4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 135
    .line 136
    .line 137
    const-string p4, "\u6062\u590d\u8054\u7cfb\u4eba"

    .line 138
    .line 139
    invoke-virtual {p3, p4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    new-instance p4, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string p5, "\u6062\u590d\u663e\u793a "

    .line 146
    .line 147
    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string p5, "\uff1f"

    .line 154
    .line 155
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p4

    .line 162
    invoke-virtual {p3, p4}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 163
    .line 164
    .line 165
    move-result-object p3

    .line 166
    const-string p4, "\u53d6\u6d88"

    .line 167
    .line 168
    const/4 p5, 0x0

    .line 169
    invoke-virtual {p3, p4, p5}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    const-string p4, "\u6062\u590d"

    .line 174
    .line 175
    new-instance p5, Ldd0;

    .line 176
    .line 177
    const/4 v0, 0x0

    .line 178
    invoke-direct {p5, p1, p0, p2, v0}, Ldd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p3, p4, p5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    new-instance p2, Led0;

    .line 190
    .line 191
    const/4 p3, 0x0

    .line 192
    invoke-direct {p2, p0, p1, p3}, Led0;-><init>(Lnd0;Landroid/app/AlertDialog;I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, p2}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 199
    .line 200
    .line 201
    :goto_3
    return-void

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
