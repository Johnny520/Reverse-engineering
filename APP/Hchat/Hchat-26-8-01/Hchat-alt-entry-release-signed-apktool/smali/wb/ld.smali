.class public final synthetic Lwb/ld;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/ld;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ld;->h:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/ld;->i:Li0/a1;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/ld;->j:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/ld;->k:Li0/a1;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Landroid/content/Context;Li0/a1;Li0/a1;)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lwb/ld;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/ld;->i:Li0/a1;

    iput-object p2, p0, Lwb/ld;->h:Landroid/content/Context;

    iput-object p3, p0, Lwb/ld;->j:Li0/a1;

    iput-object p4, p0, Lwb/ld;->k:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/ld;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lwb/ld;->h:Landroid/content/Context;

    .line 7
    .line 8
    iget-object v0, p0, Lwb/ld;->i:Li0/a1;

    .line 9
    .line 10
    iget-object v2, p0, Lwb/ld;->j:Li0/a1;

    .line 11
    .line 12
    iget-object v3, p0, Lwb/ld;->k:Li0/a1;

    .line 13
    .line 14
    check-cast p1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v1, v0, p1}, Lfb/w;->u(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lfb/t0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object p1, p1, Lfb/t0;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    add-int/lit8 v0, p1, 0x1

    .line 45
    .line 46
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v3, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    move-object p1, v0

    .line 60
    new-instance v0, Lsf/f;

    .line 61
    .line 62
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object p1, v0

    .line 66
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_0

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_0
    const-string p1, "\u91cd\u547d\u540d\u5931\u8d25"

    .line 80
    .line 81
    :goto_1
    const/4 v0, 0x0

    .line 82
    invoke-static {v1, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 87
    .line 88
    .line 89
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 90
    .line 91
    return-object p1

    .line 92
    :pswitch_0
    check-cast p1, Lr/h;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v2, p0, Lwb/ld;->i:Li0/a1;

    .line 98
    .line 99
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Ljava/util/List;

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    const/4 v0, 0x0

    .line 110
    move v3, v0

    .line 111
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    const/4 v8, 0x3

    .line 116
    const/4 v9, 0x0

    .line 117
    const/4 v10, 0x1

    .line 118
    if-eqz v0, :cond_3

    .line 119
    .line 120
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    add-int/lit8 v11, v3, 0x1

    .line 125
    .line 126
    if-ltz v3, :cond_2

    .line 127
    .line 128
    move-object v1, v0

    .line 129
    check-cast v1, Lx8/s;

    .line 130
    .line 131
    new-instance v0, Lwb/yb;

    .line 132
    .line 133
    const/4 v4, 0x2

    .line 134
    invoke-direct {v0, v3, v4}, Lwb/yb;-><init>(II)V

    .line 135
    .line 136
    .line 137
    new-instance v4, Ls0/d;

    .line 138
    .line 139
    const v5, 0x213a919e

    .line 140
    .line 141
    .line 142
    invoke-direct {v4, v5, v0, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 143
    .line 144
    .line 145
    invoke-static {p1, v9, v4, v8}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 146
    .line 147
    .line 148
    new-instance v0, Lwb/mc;

    .line 149
    .line 150
    iget-object v4, p0, Lwb/ld;->h:Landroid/content/Context;

    .line 151
    .line 152
    iget-object v5, p0, Lwb/ld;->j:Li0/a1;

    .line 153
    .line 154
    iget-object v6, p0, Lwb/ld;->k:Li0/a1;

    .line 155
    .line 156
    invoke-direct/range {v0 .. v6}, Lwb/mc;-><init>(Lx8/s;Li0/a1;ILandroid/content/Context;Li0/a1;Li0/a1;)V

    .line 157
    .line 158
    .line 159
    new-instance v1, Ls0/d;

    .line 160
    .line 161
    const v3, 0x5846e007

    .line 162
    .line 163
    .line 164
    invoke-direct {v1, v3, v0, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 165
    .line 166
    .line 167
    invoke-static {p1, v9, v1, v8}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 168
    .line 169
    .line 170
    move v3, v11

    .line 171
    goto :goto_2

    .line 172
    :cond_2
    invoke-static {}, La/a;->Q0()V

    .line 173
    .line 174
    .line 175
    throw v9

    .line 176
    :cond_3
    sget-object v0, Lwb/p0;->u1:Ls0/d;

    .line 177
    .line 178
    invoke-static {p1, v9, v0, v8}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 179
    .line 180
    .line 181
    new-instance v0, Lwb/uf;

    .line 182
    .line 183
    const/4 v1, 0x3

    .line 184
    invoke-direct {v0, v2, v1}, Lwb/uf;-><init>(Li0/a1;I)V

    .line 185
    .line 186
    .line 187
    new-instance v1, Ls0/d;

    .line 188
    .line 189
    const v2, 0x31f31677

    .line 190
    .line 191
    .line 192
    invoke-direct {v1, v2, v0, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 193
    .line 194
    .line 195
    invoke-static {p1, v9, v1, v8}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 196
    .line 197
    .line 198
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 199
    .line 200
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
