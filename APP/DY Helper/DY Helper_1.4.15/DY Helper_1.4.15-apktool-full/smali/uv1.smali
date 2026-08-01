.class public final synthetic Luv1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lvv1;


# direct methods
.method public synthetic constructor <init>(Lvv1;I)V
    .locals 0

    .line 1
    iput p2, p0, Luv1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Luv1;->ζ:Lvv1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget p1, p0, Luv1;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object p0, p0, Luv1;->ζ:Lvv1;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lvv1;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    sget-object p1, Lui1;->α:Ljava/lang/Object;

    .line 21
    .line 22
    sget-wide v2, Lui1;->θ:J

    .line 23
    .line 24
    iget-wide v4, p0, Lvv1;->ζ:J

    .line 25
    .line 26
    cmp-long p1, v2, v4

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Lvv1;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lvv1;->α:Landroid/app/Activity;

    .line 36
    .line 37
    const-string p1, "\u8d26\u53f7\u914d\u7f6e\u5df2\u5207\u6362\uff0c\u8bf7\u91cd\u65b0\u6253\u5f00"

    .line 38
    .line 39
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_1
    iget-object p1, p0, Lvv1;->δ:Ljava/util/ArrayList;

    .line 49
    .line 50
    iget-object v1, p0, Lvv1;->υ:Lsv1;

    .line 51
    .line 52
    iget-object v1, v1, Lsv1;->ι:Ljava/util/LinkedHashSet;

    .line 53
    .line 54
    invoke-static {v1}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object v2, p0, Lvv1;->ε:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    new-instance v4, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_3

    .line 84
    .line 85
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    move-object v6, v5

    .line 90
    check-cast v6, Ljava/lang/String;

    .line 91
    .line 92
    invoke-interface {v3, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-nez v6, :cond_2

    .line 97
    .line 98
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_5

    .line 116
    .line 117
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    move-object v5, v3

    .line 122
    check-cast v5, Ljava/lang/String;

    .line 123
    .line 124
    invoke-interface {v1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eqz v5, :cond_4

    .line 129
    .line 130
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_5
    invoke-static {v2, v4}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 139
    .line 140
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_8

    .line 152
    .line 153
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    check-cast v2, Ljava/lang/String;

    .line 158
    .line 159
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-lez v3, :cond_7

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_7
    const/4 v2, 0x0

    .line 175
    :goto_3
    if-eqz v2, :cond_6

    .line 176
    .line 177
    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_8
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p0, v0}, Lvv1;->γ(Z)V

    .line 186
    .line 187
    .line 188
    sget-object v0, Lwv1;->α:Ljava/util/concurrent/ExecutorService;

    .line 189
    .line 190
    new-instance v1, Lii0;

    .line 191
    .line 192
    const/16 v2, 0x1a

    .line 193
    .line 194
    invoke-direct {v1, p1, v2, p0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 198
    .line 199
    .line 200
    :goto_4
    return-void

    .line 201
    :pswitch_0
    iget-object p1, p0, Lvv1;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-nez p1, :cond_9

    .line 208
    .line 209
    invoke-virtual {p0, v1}, Lvv1;->ε(Z)V

    .line 210
    .line 211
    .line 212
    :cond_9
    return-void

    .line 213
    :pswitch_1
    iget-object p1, p0, Lvv1;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-nez p1, :cond_a

    .line 220
    .line 221
    invoke-virtual {p0, v0}, Lvv1;->ε(Z)V

    .line 222
    .line 223
    .line 224
    :cond_a
    return-void

    .line 225
    :pswitch_2
    iget-object p1, p0, Lvv1;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-nez p1, :cond_b

    .line 232
    .line 233
    iget-object p0, p0, Lvv1;->τ:Landroid/app/AlertDialog;

    .line 234
    .line 235
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 236
    .line 237
    .line 238
    :cond_b
    return-void

    .line 239
    :pswitch_3
    iget-object p1, p0, Lvv1;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-nez p1, :cond_c

    .line 246
    .line 247
    iget-object p0, p0, Lvv1;->τ:Landroid/app/AlertDialog;

    .line 248
    .line 249
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 250
    .line 251
    .line 252
    :cond_c
    return-void

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
