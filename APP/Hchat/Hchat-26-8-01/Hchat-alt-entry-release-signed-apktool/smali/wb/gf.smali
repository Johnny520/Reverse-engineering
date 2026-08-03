.class public final synthetic Lwb/gf;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLba/n;Lfg/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/gf;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/gf;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lwb/gf;->h:Z

    .line 10
    .line 11
    iput-object p3, p0, Lwb/gf;->j:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/gf;->k:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(ZLi0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 16
    const/4 v0, 0x1

    iput v0, p0, Lwb/gf;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lwb/gf;->h:Z

    iput-object p2, p0, Lwb/gf;->i:Ljava/lang/Object;

    iput-object p3, p0, Lwb/gf;->j:Ljava/lang/Object;

    iput-object p4, p0, Lwb/gf;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lwb/gf;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/gf;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Li0/a1;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/gf;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Li0/a1;

    .line 13
    .line 14
    iget-object v2, p0, Lwb/gf;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Li0/a1;

    .line 17
    .line 18
    iget-boolean v3, p0, Lwb/gf;->h:Z

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    xor-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v0, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ln1/a;

    .line 63
    .line 64
    const/4 v1, 0x6

    .line 65
    check-cast v0, Ln1/c;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ln1/c;->a(I)V

    .line 68
    .line 69
    .line 70
    :cond_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_0
    iget-object v0, p0, Lwb/gf;->i:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v3, v0

    .line 76
    check-cast v3, Landroid/content/Context;

    .line 77
    .line 78
    iget-object v0, p0, Lwb/gf;->j:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v4, v0

    .line 81
    check-cast v4, Lba/n;

    .line 82
    .line 83
    iget-object v0, p0, Lwb/gf;->k:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v5, v0

    .line 86
    check-cast v5, Lfg/a;

    .line 87
    .line 88
    instance-of v0, v3, Landroid/app/Activity;

    .line 89
    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    move-object v0, v3

    .line 93
    check-cast v0, Landroid/app/Activity;

    .line 94
    .line 95
    :goto_0
    move-object v2, v0

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    const/4 v0, 0x0

    .line 98
    goto :goto_0

    .line 99
    :goto_1
    if-eqz v2, :cond_3

    .line 100
    .line 101
    new-instance v1, Lc9/n0;

    .line 102
    .line 103
    const/16 v6, 0xf

    .line 104
    .line 105
    move-object v13, v5

    .line 106
    move-object v5, v3

    .line 107
    move-object v3, v4

    .line 108
    move-object v4, v13

    .line 109
    invoke-direct/range {v1 .. v6}, Lc9/n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 110
    .line 111
    .line 112
    move-object v0, v4

    .line 113
    move-object v4, v3

    .line 114
    move-object v3, v5

    .line 115
    move-object v5, v0

    .line 116
    move-object v0, v2

    .line 117
    iget-boolean v2, p0, Lwb/gf;->h:Z

    .line 118
    .line 119
    if-nez v2, :cond_2

    .line 120
    .line 121
    invoke-virtual {v1}, Lc9/n0;->invoke()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    iget-object v7, v4, Lba/n;->h:Ljava/lang/String;

    .line 126
    .line 127
    new-instance v2, Lsf/e;

    .line 128
    .line 129
    const-string v6, "\u66f4\u6362\u6c14\u6ce1"

    .line 130
    .line 131
    const-string v8, "\u91cd\u65b0\u9009\u62e9\u4e00\u5f20\u672c\u5730\u56fe\u7247"

    .line 132
    .line 133
    invoke-direct {v2, v6, v8}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    new-instance v6, Lsf/e;

    .line 137
    .line 138
    const-string v8, "\u6062\u590d\u5fae\u4fe1\u6c14\u6ce1"

    .line 139
    .line 140
    const-string v9, "\u5220\u9664\u5f53\u524d\u81ea\u5b9a\u4e49\u6c14\u6ce1"

    .line 141
    .line 142
    invoke-direct {v6, v8, v9}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    filled-new-array {v2, v6}, [Lsf/e;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    new-instance v10, Lc9/k;

    .line 154
    .line 155
    const/16 v6, 0x10

    .line 156
    .line 157
    move-object v2, v1

    .line 158
    move-object v1, v10

    .line 159
    invoke-direct/range {v1 .. v6}, Lc9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 160
    .line 161
    .line 162
    new-instance v11, Lk/s1;

    .line 163
    .line 164
    const/16 v2, 0x19

    .line 165
    .line 166
    invoke-direct {v11, v2}, Lk/s1;-><init>(I)V

    .line 167
    .line 168
    .line 169
    sget-object v12, Lwb/lv;->j:Lwb/lv;

    .line 170
    .line 171
    const-string v8, "\u7ba1\u7406\u5f53\u524d\u6c14\u6ce1\u56fe\u7247"

    .line 172
    .line 173
    move-object v6, v0

    .line 174
    invoke-static/range {v6 .. v12}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 175
    .line 176
    .line 177
    :cond_3
    :goto_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 178
    .line 179
    return-object v0

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
