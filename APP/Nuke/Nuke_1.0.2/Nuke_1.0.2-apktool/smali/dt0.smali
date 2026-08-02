.class public final synthetic Ldt0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, Ldt0;->h:I

    .line 2
    .line 3
    iput-boolean p4, p0, Ldt0;->i:Z

    .line 4
    .line 5
    iput-object p2, p0, Ldt0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Ldt0;->k:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ldt0;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Ldt0;->k:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Ldt0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iget-boolean p0, p0, Ldt0;->i:Z

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v3, Lgu2;

    .line 15
    .line 16
    check-cast v2, Lgu2;

    .line 17
    .line 18
    check-cast p1, Lca2;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    const/high16 p0, 0x3f800000    # 1.0f

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const p0, 0x3f1eb852    # 0.62f

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {p1, p0}, Lca2;->c(F)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v3}, Lgu2;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-virtual {p1, p0}, Lca2;->k(F)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Ljava/lang/Number;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-virtual {p1, p0}, Lca2;->l(F)V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :pswitch_0
    check-cast v3, Lin0;

    .line 62
    .line 63
    check-cast v2, Lxk1;

    .line 64
    .line 65
    check-cast p1, Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    if-nez p0, :cond_1

    .line 74
    .line 75
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-interface {v2, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-interface {v3, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    :goto_1
    return-object v1

    .line 85
    :pswitch_1
    check-cast v3, Lgw;

    .line 86
    .line 87
    check-cast v2, Lmn0;

    .line 88
    .line 89
    check-cast p1, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eq p0, v0, :cond_7

    .line 96
    .line 97
    sget-object p0, Lpp1;->a:Lpp1;

    .line 98
    .line 99
    invoke-static {}, Lpp1;->c()Lop1;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {v3}, Lvj;->d()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {p0, v4, v5}, Lop1;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    sget-object p0, Lst0;->a:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v3}, Lvj;->e()Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    if-nez p0, :cond_6

    .line 127
    .line 128
    invoke-virtual {v3}, Lvj;->f()Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-nez p0, :cond_2

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_2
    if-eqz v0, :cond_3

    .line 136
    .line 137
    :try_start_0
    invoke-static {v3}, Lst0;->a(Lvj;)Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    goto :goto_3

    .line 146
    :catchall_0
    move-exception p0

    .line 147
    goto :goto_2

    .line 148
    :cond_3
    invoke-static {v3}, Lst0;->c(Lvj;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    .line 151
    move-object p0, v1

    .line 152
    goto :goto_3

    .line 153
    :goto_2
    new-instance v4, Lx92;

    .line 154
    .line 155
    invoke-direct {v4, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    move-object p0, v4

    .line 159
    :goto_3
    invoke-static {p0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    if-eqz p0, :cond_6

    .line 164
    .line 165
    sget-object v4, Lpp1;->a:Lpp1;

    .line 166
    .line 167
    if-eqz v0, :cond_4

    .line 168
    .line 169
    const-string v4, "install"

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_4
    const-string v4, "uninstall"

    .line 173
    .line 174
    :goto_4
    if-eqz v0, :cond_5

    .line 175
    .line 176
    const-string v0, "Hooker switch install failed"

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_5
    const-string v0, "Hooker switch uninstall failed"

    .line 180
    .line 181
    :goto_5
    invoke-static {v3, v4, p0, v0}, Lpp1;->h(Lvj;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    :cond_6
    :goto_6
    invoke-interface {v2, v3, p1}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    :cond_7
    return-object v1

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
