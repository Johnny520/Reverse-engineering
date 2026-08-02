.class public final synthetic Li0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lxk1;

.field public final synthetic j:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lxk1;Lxk1;I)V
    .locals 0

    .line 1
    iput p3, p0, Li0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Li0;->i:Lxk1;

    .line 4
    .line 5
    iput-object p2, p0, Li0;->j:Lxk1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Li0;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, La83;->a:La83;

    .line 5
    .line 6
    iget-object v3, p0, Li0;->j:Lxk1;

    .line 7
    .line 8
    iget-object p0, p0, Li0;->i:Lxk1;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Ls81;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/util/List;

    .line 23
    .line 24
    new-instance v4, Lye;

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    invoke-direct {v4, v5}, Lye;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    new-instance v7, Lzh;

    .line 35
    .line 36
    const/4 v8, 0x2

    .line 37
    invoke-direct {v7, v8, v4, v0}, Lzh;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance v4, Ly0;

    .line 41
    .line 42
    const/4 v8, 0x6

    .line 43
    invoke-direct {v4, v0, v8, v1}, Ly0;-><init>(Ljava/util/List;IZ)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lz0;

    .line 47
    .line 48
    invoke-direct {v1, v0, p0, v3, v5}, Lz0;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    new-instance p0, Lkw;

    .line 52
    .line 53
    const v0, 0x799532c4

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, v0, v5, v1}, Lkw;-><init>(IZLun0;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v6, v7, v4, p0}, Ls81;->b(ILin0;Lin0;Lkw;)V

    .line 60
    .line 61
    .line 62
    return-object v2

    .line 63
    :pswitch_0
    check-cast p1, Lzq;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_1

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Lzq;

    .line 89
    .line 90
    iget-object v4, v4, Lzq;->a:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v5, p1, Lzq;->a:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v4, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_0

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    const/4 v1, -0x1

    .line 105
    :goto_1
    if-ltz v1, :cond_2

    .line 106
    .line 107
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Ljava/util/List;

    .line 112
    .line 113
    invoke-static {v0}, Ldu;->H0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Ljava/util/List;

    .line 126
    .line 127
    invoke-static {v0, p1}, Ldu;->y0(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    :goto_2
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    const/4 p0, 0x0

    .line 135
    invoke-interface {v3, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    return-object v2

    .line 139
    :pswitch_1
    check-cast p1, Ljava/util/Set;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-interface {v3, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    return-object v2

    .line 153
    :pswitch_2
    check-cast p1, Ljava/util/Set;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 162
    .line 163
    invoke-interface {v3, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    return-object v2

    .line 167
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-interface {v3, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    return-object v2

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
