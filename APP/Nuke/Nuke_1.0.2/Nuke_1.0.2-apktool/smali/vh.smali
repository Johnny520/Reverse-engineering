.class public final synthetic Lvh;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lxk1;

.field public final synthetic j:Lxk1;

.field public final synthetic k:Lxk1;

.field public final synthetic l:Lxk1;

.field public final synthetic m:Lxk1;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Long;Lin0;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;)V
    .locals 1

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lvh;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvh;->n:Ljava/lang/Object;

    iput-object p2, p0, Lvh;->o:Ljava/lang/Object;

    iput-object p3, p0, Lvh;->i:Lxk1;

    iput-object p4, p0, Lvh;->j:Lxk1;

    iput-object p5, p0, Lvh;->k:Lxk1;

    iput-object p6, p0, Lvh;->l:Lxk1;

    iput-object p7, p0, Lvh;->m:Lxk1;

    iput-object p8, p0, Lvh;->p:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lkf2;Landroid/content/Context;Lxk1;Lj20;Lxk1;Lxk1;Lxk1;Lxk1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lvh;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lvh;->n:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lvh;->o:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lvh;->i:Lxk1;

    .line 12
    .line 13
    iput-object p4, p0, Lvh;->p:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lvh;->j:Lxk1;

    .line 16
    .line 17
    iput-object p6, p0, Lvh;->k:Lxk1;

    .line 18
    .line 19
    iput-object p7, p0, Lvh;->l:Lxk1;

    .line 20
    .line 21
    iput-object p8, p0, Lvh;->m:Lxk1;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lvh;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    iget-object v3, v1, Lvh;->j:Lxk1;

    .line 8
    .line 9
    iget-object v4, v1, Lvh;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v1, Lvh;->i:Lxk1;

    .line 12
    .line 13
    iget-object v6, v1, Lvh;->o:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v1, Lvh;->n:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object v10, v7

    .line 21
    check-cast v10, Lkf2;

    .line 22
    .line 23
    move-object v15, v6

    .line 24
    check-cast v15, Landroid/content/Context;

    .line 25
    .line 26
    check-cast v4, Lj20;

    .line 27
    .line 28
    :try_start_0
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v10, v0, v15}, Lrg3;->J(Lkf2;Ljava/lang/String;Landroid/content/Context;)Lj31;

    .line 35
    .line 36
    .line 37
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    new-instance v5, Lx92;

    .line 41
    .line 42
    invoke-direct {v5, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object v0, v5

    .line 46
    :goto_0
    nop

    .line 47
    instance-of v5, v0, Lx92;

    .line 48
    .line 49
    iget-object v13, v1, Lvh;->l:Lxk1;

    .line 50
    .line 51
    if-nez v5, :cond_1

    .line 52
    .line 53
    move-object v11, v0

    .line 54
    check-cast v11, Lj31;

    .line 55
    .line 56
    invoke-interface {v3}, Lgu2;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    move-object v9, v3

    .line 61
    check-cast v9, Ljava/lang/String;

    .line 62
    .line 63
    if-nez v9, :cond_0

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    new-instance v8, Lok2;

    .line 67
    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    iget-object v12, v1, Lvh;->k:Lxk1;

    .line 71
    .line 72
    iget-object v14, v1, Lvh;->m:Lxk1;

    .line 73
    .line 74
    invoke-direct/range {v8 .. v16}, Lok2;-><init>(Ljava/lang/String;Lkf2;Lj31;Lxk1;Lxk1;Lxk1;Landroid/content/Context;Lt00;)V

    .line 75
    .line 76
    .line 77
    const/4 v1, 0x3

    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-static {v4, v3, v8, v1}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 80
    .line 81
    .line 82
    :cond_1
    :goto_1
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-nez v0, :cond_2

    .line 93
    .line 94
    const v0, 0x790b01ff

    .line 95
    .line 96
    .line 97
    invoke-virtual {v15, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    :cond_2
    invoke-interface {v13, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_3
    return-object v2

    .line 108
    :pswitch_0
    check-cast v7, Ljava/lang/Long;

    .line 109
    .line 110
    check-cast v6, Lin0;

    .line 111
    .line 112
    check-cast v4, Lxk1;

    .line 113
    .line 114
    if-eqz v7, :cond_4

    .line 115
    .line 116
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 117
    .line 118
    .line 119
    move-result-wide v9

    .line 120
    new-instance v8, Lch;

    .line 121
    .line 122
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Ljava/lang/Number;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result v11

    .line 132
    invoke-interface {v3}, Lgu2;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    iget-object v0, v1, Lvh;->k:Lxk1;

    .line 143
    .line 144
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    move-object v13, v0

    .line 149
    check-cast v13, Ljava/util/Set;

    .line 150
    .line 151
    iget-object v0, v1, Lvh;->l:Lxk1;

    .line 152
    .line 153
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    move-object v14, v0

    .line 158
    check-cast v14, Ljava/util/Set;

    .line 159
    .line 160
    new-instance v15, Lfh;

    .line 161
    .line 162
    iget-object v0, v1, Lvh;->m:Lxk1;

    .line 163
    .line 164
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Ljava/lang/Boolean;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-interface {v4}, Lgu2;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, Ljava/lang/String;

    .line 179
    .line 180
    invoke-static {v1}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-direct {v15, v1, v0}, Lfh;-><init>(Ljava/lang/String;Z)V

    .line 189
    .line 190
    .line 191
    invoke-direct/range {v8 .. v15}, Lch;-><init>(JIZLjava/util/Set;Ljava/util/Set;Lfh;)V

    .line 192
    .line 193
    .line 194
    invoke-interface {v6, v8}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    :cond_4
    return-object v2

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
