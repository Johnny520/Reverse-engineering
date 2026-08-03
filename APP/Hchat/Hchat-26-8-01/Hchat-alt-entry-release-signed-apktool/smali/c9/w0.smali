.class public final synthetic Lc9/w0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lc9/w0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lc9/w0;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lc9/w0;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lc9/w0;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lc9/w0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc9/w0;->h:Li0/a1;

    .line 7
    .line 8
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/media/MediaPlayer;

    .line 13
    .line 14
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v2, p0, Lc9/w0;->i:Li0/a1;

    .line 19
    .line 20
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :catchall_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 42
    .line 43
    .line 44
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    .line 48
    .line 49
    move-object v3, v1

    .line 50
    goto :goto_0

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    new-instance v3, Lsf/f;

    .line 53
    .line 54
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    const-string v0, "\u9884\u89c8\u64ad\u653e\u5931\u8d25"

    .line 64
    .line 65
    iget-object v3, p0, Lc9/w0;->j:Li0/a1;

    .line 66
    .line 67
    invoke-interface {v3, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    :goto_1
    return-object v1

    .line 76
    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 77
    .line 78
    iget-object v1, p0, Lc9/w0;->h:Li0/a1;

    .line 79
    .line 80
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v2, p0, Lc9/w0;->i:Li0/a1;

    .line 89
    .line 90
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, Lc9/w0;->j:Li0/a1;

    .line 94
    .line 95
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lfg/l;

    .line 100
    .line 101
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    :goto_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 108
    .line 109
    iget-object v1, p0, Lc9/w0;->h:Li0/a1;

    .line 110
    .line 111
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    const/4 v1, 0x0

    .line 115
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iget-object v2, p0, Lc9/w0;->i:Li0/a1;

    .line 120
    .line 121
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Lc9/w0;->j:Li0/a1;

    .line 125
    .line 126
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, Lfg/l;

    .line 131
    .line 132
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :pswitch_2
    const/4 v0, 0x0

    .line 137
    iget-object v1, p0, Lc9/w0;->h:Li0/a1;

    .line 138
    .line 139
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-static {}, La2/a;->p()Ldb/c;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget-object v1, p0, Lc9/w0;->i:Li0/a1;

    .line 147
    .line 148
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    sget-object v0, Lwb/xq;->b:Lwb/xq;

    .line 152
    .line 153
    iget-object v1, p0, Lc9/w0;->j:Li0/a1;

    .line 154
    .line 155
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :pswitch_3
    iget-object v0, p0, Lc9/w0;->h:Li0/a1;

    .line 160
    .line 161
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Ljava/lang/String;

    .line 166
    .line 167
    iget-object v1, p0, Lc9/w0;->i:Li0/a1;

    .line 168
    .line 169
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    sget-object v0, Lwb/h;->d:Lwb/h;

    .line 173
    .line 174
    iget-object v1, p0, Lc9/w0;->j:Li0/a1;

    .line 175
    .line 176
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :pswitch_4
    iget-object v0, p0, Lc9/w0;->h:Li0/a1;

    .line 181
    .line 182
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Ljava/lang/String;

    .line 187
    .line 188
    iget-object v1, p0, Lc9/w0;->i:Li0/a1;

    .line 189
    .line 190
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    sget-object v0, Lwb/h;->e:Lwb/h;

    .line 194
    .line 195
    iget-object v1, p0, Lc9/w0;->j:Li0/a1;

    .line 196
    .line 197
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :pswitch_5
    const-string v0, ""

    .line 202
    .line 203
    iget-object v1, p0, Lc9/w0;->h:Li0/a1;

    .line 204
    .line 205
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    const/4 v0, 0x0

    .line 209
    iget-object v1, p0, Lc9/w0;->i:Li0/a1;

    .line 210
    .line 211
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    sget-object v0, Lc9/e1;->i:Lc9/e1;

    .line 215
    .line 216
    iget-object v1, p0, Lc9/w0;->j:Li0/a1;

    .line 217
    .line 218
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
