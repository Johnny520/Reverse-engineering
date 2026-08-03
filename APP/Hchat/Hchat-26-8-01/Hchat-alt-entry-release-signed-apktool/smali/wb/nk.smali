.class public final synthetic Lwb/nk;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lk9/j;

.field public final synthetic i:Lwb/q3;

.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lk9/j;Lwb/q3;Landroid/content/Context;Li0/a1;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/nk;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/nk;->h:Lk9/j;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/nk;->i:Lwb/q3;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/nk;->j:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/nk;->k:Li0/a1;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/nk;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lwb/nk;->h:Lk9/j;

    .line 7
    .line 8
    iget-object v0, v1, Lk9/j;->f:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v9, p0, Lwb/nk;->i:Lwb/q3;

    .line 11
    .line 12
    iget-object v2, v9, Lwb/q3;->a:Lk9/j;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v2, v2, Lk9/j;->f:Ljava/lang/String;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    :goto_0
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v1, Lk9/j;->f:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v2, p0, Lwb/nk;->j:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {v2, v0}, Lig/a;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v7, 0x0

    .line 34
    const/16 v8, 0x5f

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const-string v6, ""

    .line 41
    .line 42
    invoke-static/range {v1 .. v8}, Lk9/j;->a(Lk9/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lk9/j;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v9, v0}, Lwb/q3;->a(Lwb/q3;Lk9/j;)Lwb/q3;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, Lwb/nk;->k:Li0/a1;

    .line 51
    .line 52
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_0
    iget-object v2, p0, Lwb/nk;->h:Lk9/j;

    .line 59
    .line 60
    iget-object v0, v2, Lk9/j;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v5, "item-dark-"

    .line 69
    .line 70
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, "-"

    .line 77
    .line 78
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-instance v1, Lwb/e7;

    .line 89
    .line 90
    const/4 v6, 0x1

    .line 91
    iget-object v3, p0, Lwb/nk;->i:Lwb/q3;

    .line 92
    .line 93
    iget-object v4, p0, Lwb/nk;->j:Landroid/content/Context;

    .line 94
    .line 95
    iget-object v5, p0, Lwb/nk;->k:Li0/a1;

    .line 96
    .line 97
    invoke-direct/range {v1 .. v6}, Lwb/e7;-><init>(Lk9/j;Lwb/q3;Landroid/content/Context;Li0/a1;I)V

    .line 98
    .line 99
    .line 100
    invoke-static {v4, v0, v1}, Lwb/ho;->U0(Landroid/content/Context;Ljava/lang/String;Lfg/l;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :pswitch_1
    iget-object v1, p0, Lwb/nk;->h:Lk9/j;

    .line 105
    .line 106
    iget-object v0, v1, Lk9/j;->e:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v9, p0, Lwb/nk;->i:Lwb/q3;

    .line 109
    .line 110
    iget-object v2, v9, Lwb/q3;->a:Lk9/j;

    .line 111
    .line 112
    if-eqz v2, :cond_2

    .line 113
    .line 114
    iget-object v2, v2, Lk9/j;->e:Ljava/lang/String;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    const/4 v2, 0x0

    .line 118
    :goto_2
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_3

    .line 123
    .line 124
    iget-object v0, v1, Lk9/j;->e:Ljava/lang/String;

    .line 125
    .line 126
    iget-object v2, p0, Lwb/nk;->j:Landroid/content/Context;

    .line 127
    .line 128
    invoke-static {v2, v0}, Lig/a;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_3
    const/4 v7, 0x0

    .line 132
    const/16 v8, 0x6f

    .line 133
    .line 134
    const/4 v2, 0x0

    .line 135
    const/4 v3, 0x0

    .line 136
    const/4 v4, 0x0

    .line 137
    const-string v5, ""

    .line 138
    .line 139
    const/4 v6, 0x0

    .line 140
    invoke-static/range {v1 .. v8}, Lk9/j;->a(Lk9/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lk9/j;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {v9, v0}, Lwb/q3;->a(Lwb/q3;Lk9/j;)Lwb/q3;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-object v1, p0, Lwb/nk;->k:Li0/a1;

    .line 149
    .line 150
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :pswitch_2
    iget-object v2, p0, Lwb/nk;->h:Lk9/j;

    .line 155
    .line 156
    iget-object v0, v2, Lk9/j;->a:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 159
    .line 160
    .line 161
    move-result-wide v3

    .line 162
    new-instance v1, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v5, "item-"

    .line 165
    .line 166
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v0, "-"

    .line 173
    .line 174
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    new-instance v1, Lwb/e7;

    .line 185
    .line 186
    const/4 v6, 0x0

    .line 187
    iget-object v3, p0, Lwb/nk;->i:Lwb/q3;

    .line 188
    .line 189
    iget-object v4, p0, Lwb/nk;->j:Landroid/content/Context;

    .line 190
    .line 191
    iget-object v5, p0, Lwb/nk;->k:Li0/a1;

    .line 192
    .line 193
    invoke-direct/range {v1 .. v6}, Lwb/e7;-><init>(Lk9/j;Lwb/q3;Landroid/content/Context;Li0/a1;I)V

    .line 194
    .line 195
    .line 196
    invoke-static {v4, v0, v1}, Lwb/ho;->U0(Landroid/content/Context;Ljava/lang/String;Lfg/l;)V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_1

    .line 200
    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
