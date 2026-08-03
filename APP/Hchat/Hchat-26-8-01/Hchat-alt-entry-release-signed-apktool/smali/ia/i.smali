.class public final synthetic Lia/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lp8/l;

.field public final synthetic i:Lia/q;

.field public final synthetic j:I

.field public final synthetic k:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(ILandroid/app/Activity;Lia/q;Lp8/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lia/i;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p4, p0, Lia/i;->h:Lp8/l;

    .line 8
    .line 9
    iput-object p3, p0, Lia/i;->i:Lia/q;

    .line 10
    .line 11
    iput p1, p0, Lia/i;->j:I

    .line 12
    .line 13
    iput-object p2, p0, Lia/i;->k:Landroid/app/Activity;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lia/q;Landroid/app/Activity;Lp8/l;II)V
    .locals 0

    .line 16
    iput p5, p0, Lia/i;->g:I

    iput-object p1, p0, Lia/i;->i:Lia/q;

    iput-object p2, p0, Lia/i;->k:Landroid/app/Activity;

    iput-object p3, p0, Lia/i;->h:Lp8/l;

    iput p4, p0, Lia/i;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lia/i;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v4, p1

    .line 7
    check-cast v4, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lia/i;->i:Lia/q;

    .line 13
    .line 14
    iget-object v0, p1, Lia/q;->a:Lb5/c;

    .line 15
    .line 16
    iget-object v8, p0, Lia/i;->h:Lp8/l;

    .line 17
    .line 18
    iget-object v9, v8, Lp8/l;->a:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v9, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v9}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 23
    .line 24
    .line 25
    move-result-object v10

    .line 26
    iget-object v1, v10, Lia/c;->b:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v1}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v11

    .line 32
    iget v12, p0, Lia/i;->j:I

    .line 33
    .line 34
    invoke-static {v12, v11}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lia/b;

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    const-wide/16 v5, 0x0

    .line 43
    .line 44
    const/16 v7, 0x17

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-static/range {v1 .. v7}, Lia/b;->a(Lia/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)Lia/b;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v11, v12, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v9, v11}, Lb5/c;->Q(Ljava/lang/String;Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p1, Lia/q;->b:Lia/a0;

    .line 59
    .line 60
    iget-object v1, p0, Lia/i;->k:Landroid/app/Activity;

    .line 61
    .line 62
    invoke-virtual {v0, v1, v8, v10}, Lia/a0;->a(Landroid/app/Activity;Lp8/l;Lia/c;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v1, v8}, Lia/q;->g(Landroid/app/Activity;Lp8/l;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 69
    .line 70
    return-object p1

    .line 71
    :pswitch_0
    iget-object v0, p0, Lia/i;->i:Lia/q;

    .line 72
    .line 73
    iget-object v1, v0, Lia/q;->a:Lb5/c;

    .line 74
    .line 75
    check-cast p1, Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    iget-object p1, p0, Lia/i;->h:Lp8/l;

    .line 85
    .line 86
    iget-object v2, p1, Lp8/l;->a:Ljava/lang/String;

    .line 87
    .line 88
    if-eqz v2, :cond_3

    .line 89
    .line 90
    invoke-virtual {v1, v2}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    iget-object v4, v3, Lia/c;->b:Ljava/util/List;

    .line 95
    .line 96
    invoke-static {v4}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    iget v5, p0, Lia/i;->j:I

    .line 101
    .line 102
    if-ltz v5, :cond_2

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-ge v5, v6, :cond_2

    .line 109
    .line 110
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    :cond_2
    invoke-virtual {v1, v2, v4}, Lb5/c;->Q(Ljava/lang/String;Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    iget-object v1, v0, Lia/q;->b:Lia/a0;

    .line 117
    .line 118
    iget-object v2, p0, Lia/i;->k:Landroid/app/Activity;

    .line 119
    .line 120
    invoke-virtual {v1, v2, p1, v3}, Lia/a0;->a(Landroid/app/Activity;Lp8/l;Lia/c;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v2, p1}, Lia/q;->g(Landroid/app/Activity;Lp8/l;)V

    .line 124
    .line 125
    .line 126
    :cond_3
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 127
    .line 128
    return-object p1

    .line 129
    :pswitch_1
    check-cast p1, Ljava/lang/Long;

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 132
    .line 133
    .line 134
    move-result-wide v4

    .line 135
    iget-object p1, p0, Lia/i;->i:Lia/q;

    .line 136
    .line 137
    iget-object v7, p1, Lia/q;->a:Lb5/c;

    .line 138
    .line 139
    iget-object v8, p0, Lia/i;->h:Lp8/l;

    .line 140
    .line 141
    iget-object v9, v8, Lp8/l;->a:Ljava/lang/String;

    .line 142
    .line 143
    if-eqz v9, :cond_4

    .line 144
    .line 145
    invoke-virtual {v7, v9}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    iget-object v0, v10, Lia/c;->b:Ljava/util/List;

    .line 150
    .line 151
    invoke-static {v0}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    iget v12, p0, Lia/i;->j:I

    .line 156
    .line 157
    invoke-static {v12, v11}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, Lia/b;

    .line 162
    .line 163
    if-eqz v0, :cond_4

    .line 164
    .line 165
    const/4 v3, 0x0

    .line 166
    const/16 v6, 0xf

    .line 167
    .line 168
    const/4 v1, 0x0

    .line 169
    const/4 v2, 0x0

    .line 170
    invoke-static/range {v0 .. v6}, Lia/b;->a(Lia/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)Lia/b;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v11, v12, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v7, v9, v11}, Lb5/c;->Q(Ljava/lang/String;Ljava/util/List;)V

    .line 178
    .line 179
    .line 180
    iget-object v0, p1, Lia/q;->b:Lia/a0;

    .line 181
    .line 182
    iget-object v1, p0, Lia/i;->k:Landroid/app/Activity;

    .line 183
    .line 184
    invoke-virtual {v0, v1, v8, v10}, Lia/a0;->a(Landroid/app/Activity;Lp8/l;Lia/c;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, v1, v8}, Lia/q;->g(Landroid/app/Activity;Lp8/l;)V

    .line 188
    .line 189
    .line 190
    :cond_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 191
    .line 192
    return-object p1

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
