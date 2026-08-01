.class public final synthetic Lug1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lrf1;

.field public final synthetic η:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lrf1;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p3, p0, Lug1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lug1;->ζ:Lrf1;

    .line 4
    .line 5
    iput-object p2, p0, Lug1;->η:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Lug1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lug1;->ζ:Lrf1;

    .line 7
    .line 8
    iget-object v1, v0, Lrf1;->α:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lyg1;

    .line 11
    .line 12
    iget-object p0, p0, Lug1;->η:Landroid/app/Activity;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget v0, v1, Lyg1;->γ:I

    .line 17
    .line 18
    new-instance v2, Landroid/widget/EditText;

    .line 19
    .line 20
    invoke-direct {v2, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    const-string v3, "\u706b\u661f\u4efb\u52a1\u4e92\u53d1\u6d4b\u8bd5"

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/widget/EditText;->selectAll()V

    .line 29
    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setInputType(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 39
    .line 40
    invoke-direct {v3, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    new-instance v4, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v5, "\u786e\u8ba4\u53d1\u9001 "

    .line 46
    .line 47
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v5, " \u6761\u6587\u672c"

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iget-object v4, v1, Lyg1;->β:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v5, v1, Lyg1;->δ:Ljava/util/ArrayList;

    .line 69
    .line 70
    new-instance v10, Lcf1;

    .line 71
    .line 72
    const/16 v6, 0x11

    .line 73
    .line 74
    invoke-direct {v10, v6}, Lcf1;-><init>(I)V

    .line 75
    .line 76
    .line 77
    const/16 v11, 0x1e

    .line 78
    .line 79
    const-string v6, "\n"

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x0

    .line 84
    invoke-static/range {v5 .. v11}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    const-string v6, "\n\n"

    .line 89
    .line 90
    const-string v7, "\n\n\u5c06\u771f\u5b9e\u53d1\u9001 "

    .line 91
    .line 92
    const-string v8, "\u76ee\u6807\uff1a"

    .line 93
    .line 94
    invoke-static {v8, v4, v6, v5, v7}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v0, " \u6761\u79c1\u4fe1\uff1b\u4e92\u53d1\u4efb\u52a1\u662f\u5426\u5b8c\u6210\u4ecd\u53d6\u51b3\u4e8e\u5bf9\u65b9\u56de\u590d\u548c\u670d\u52a1\u7aef\u5224\u5b9a\u3002"

    .line 102
    .line 103
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    new-instance v3, Ldd0;

    .line 119
    .line 120
    const/4 v4, 0x1

    .line 121
    invoke-direct {v3, p0, v1, v2, v4}, Ldd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 122
    .line 123
    .line 124
    const-string p0, "\u53d1\u9001"

    .line 125
    .line 126
    invoke-virtual {v0, p0, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    const-string v0, "\u53d6\u6d88"

    .line 131
    .line 132
    const/4 v1, 0x0

    .line 133
    invoke-virtual {p0, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_0
    const-string v1, "\u4e92\u53d1\u4efb\u52a1\u89e3\u6790\u5931\u8d25"

    .line 142
    .line 143
    invoke-static {p0, v0, v1}, Lwg1;->α(Landroid/app/Activity;Lrf1;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :goto_0
    return-void

    .line 147
    :pswitch_0
    iget-object v0, p0, Lug1;->ζ:Lrf1;

    .line 148
    .line 149
    iget-object v1, v0, Lrf1;->α:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v1, Lxg1;

    .line 152
    .line 153
    iget-object p0, p0, Lug1;->η:Landroid/app/Activity;

    .line 154
    .line 155
    if-eqz v1, :cond_2

    .line 156
    .line 157
    const-string v0, "DYHelper_PetElfTask_ImagePicker"

    .line 158
    .line 159
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v2, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    if-eqz v3, :cond_1

    .line 168
    .line 169
    invoke-virtual {v2}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-virtual {v4, v3}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v3}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :catchall_0
    move-exception v0

    .line 182
    goto :goto_2

    .line 183
    :cond_1
    :goto_1
    new-instance v3, Lvg1;

    .line 184
    .line 185
    invoke-direct {v3}, Landroid/app/Fragment;-><init>()V

    .line 186
    .line 187
    .line 188
    new-instance v4, Lwa;

    .line 189
    .line 190
    const/16 v5, 0x1c

    .line 191
    .line 192
    invoke-direct {v4, p0, v5, v1}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    iput-object v4, v3, Lvg1;->ε:Lwa;

    .line 196
    .line 197
    invoke-virtual {v2}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {v1, v3, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :goto_2
    const-string v1, "rc62a71041a7416a5"

    .line 210
    .line 211
    const-string v2, "\u542f\u52a8 SAF \u56fe\u7247\u9009\u62e9\u5668\u5931\u8d25"

    .line 212
    .line 213
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    const-string v0, "\u65e0\u6cd5\u6253\u5f00\u7cfb\u7edf\u56fe\u7247\u9009\u62e9\u5668"

    .line 217
    .line 218
    const/4 v1, 0x1

    .line 219
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_2
    const-string v1, "\u56fe\u7247\u4efb\u52a1\u89e3\u6790\u5931\u8d25"

    .line 228
    .line 229
    invoke-static {p0, v0, v1}, Lwg1;->α(Landroid/app/Activity;Lrf1;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :goto_3
    return-void

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
