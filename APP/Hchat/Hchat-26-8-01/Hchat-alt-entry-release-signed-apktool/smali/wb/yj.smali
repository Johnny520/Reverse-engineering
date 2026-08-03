.class public final synthetic Lwb/yj;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/yj;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/yj;->h:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/yj;->i:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/yj;->j:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/yj;->k:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/yj;->l:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/yj;->m:Li0/a1;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Landroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lwb/yj;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/yj;->j:Li0/a1;

    iput-object p2, p0, Lwb/yj;->i:Landroid/content/Context;

    iput-object p3, p0, Lwb/yj;->h:Landroid/content/SharedPreferences;

    iput-object p4, p0, Lwb/yj;->k:Li0/a1;

    iput-object p5, p0, Lwb/yj;->l:Li0/a1;

    iput-object p6, p0, Lwb/yj;->m:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/yj;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lr/h;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v0, Lwb/p0;->v2:Ls0/d;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x3

    .line 15
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lwb/e1;

    .line 19
    .line 20
    const/16 v10, 0xe

    .line 21
    .line 22
    iget-object v4, p0, Lwb/yj;->h:Landroid/content/SharedPreferences;

    .line 23
    .line 24
    iget-object v5, p0, Lwb/yj;->i:Landroid/content/Context;

    .line 25
    .line 26
    iget-object v6, p0, Lwb/yj;->j:Li0/a1;

    .line 27
    .line 28
    iget-object v7, p0, Lwb/yj;->k:Li0/a1;

    .line 29
    .line 30
    iget-object v8, p0, Lwb/yj;->l:Li0/a1;

    .line 31
    .line 32
    iget-object v9, p0, Lwb/yj;->m:Li0/a1;

    .line 33
    .line 34
    invoke-direct/range {v3 .. v10}, Lwb/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Li0/a1;Li0/a1;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Ls0/d;

    .line 38
    .line 39
    const v4, -0x69a3595d

    .line 40
    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    invoke-direct {v0, v4, v3, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 47
    .line 48
    .line 49
    sget-object v0, Lwb/p0;->w2:Ls0/d;

    .line 50
    .line 51
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Lwb/p0;->y2:Ls0/d;

    .line 55
    .line 56
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 57
    .line 58
    .line 59
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 60
    .line 61
    return-object p1

    .line 62
    :pswitch_0
    move-object v3, p1

    .line 63
    check-cast v3, Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v2, p0, Lwb/yj;->j:Li0/a1;

    .line 69
    .line 70
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Ljava/util/List;

    .line 75
    .line 76
    new-instance v0, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :cond_0
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    move-object v4, v1

    .line 96
    check-cast v4, Lua/h;

    .line 97
    .line 98
    iget-object v4, v4, Lua/h;->e:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v4, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_0

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_2

    .line 128
    .line 129
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Lua/h;

    .line 134
    .line 135
    iget-object v1, v1, Lua/h;->b:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_2
    invoke-static {p1}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    new-instance p1, Lwb/v0;

    .line 146
    .line 147
    new-instance v0, Leb/p;

    .line 148
    .line 149
    iget-object v1, p0, Lwb/yj;->i:Landroid/content/Context;

    .line 150
    .line 151
    iget-object v4, p0, Lwb/yj;->h:Landroid/content/SharedPreferences;

    .line 152
    .line 153
    iget-object v5, p0, Lwb/yj;->k:Li0/a1;

    .line 154
    .line 155
    iget-object v6, p0, Lwb/yj;->l:Li0/a1;

    .line 156
    .line 157
    invoke-direct/range {v0 .. v6}, Leb/p;-><init>(Landroid/content/Context;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V

    .line 158
    .line 159
    .line 160
    const/4 v10, 0x1

    .line 161
    const/16 v11, 0xc0

    .line 162
    .line 163
    const-string v5, "\u6279\u91cf\u5957\u7528\u6536\u6b3e\u6a21\u677f"

    .line 164
    .line 165
    sget-object v6, Lwb/u0;->i:Lwb/u0;

    .line 166
    .line 167
    const/4 v7, 0x1

    .line 168
    move-object v4, p1

    .line 169
    move-object v9, v0

    .line 170
    invoke-direct/range {v4 .. v11}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Lwb/yj;->m:Li0/a1;

    .line 174
    .line 175
    invoke-interface {p1, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    goto :goto_0

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
