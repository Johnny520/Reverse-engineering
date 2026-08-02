.class public final synthetic Loh;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Lxk1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lxk1;I)V
    .locals 0

    .line 1
    iput p3, p0, Loh;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Loh;->i:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Loh;->j:Lxk1;

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
    .locals 10

    .line 1
    iget v0, p0, Loh;->h:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x3

    .line 5
    const v3, 0x2fd4df92

    .line 6
    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    sget-object v5, La83;->a:La83;

    .line 10
    .line 11
    iget-object v6, p0, Loh;->j:Lxk1;

    .line 12
    .line 13
    iget-object p0, p0, Loh;->i:Ljava/util/List;

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    check-cast p1, Ls81;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v0, Lrc3;->o:Lrc3;

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    new-instance v1, Ly0;

    .line 32
    .line 33
    const/16 v4, 0x8

    .line 34
    .line 35
    invoke-direct {v1, v4, p0}, Ly0;-><init>(ILjava/util/List;)V

    .line 36
    .line 37
    .line 38
    new-instance v4, Ly0;

    .line 39
    .line 40
    const/16 v9, 0x9

    .line 41
    .line 42
    invoke-direct {v4, p0, v9, v8}, Ly0;-><init>(Ljava/util/List;IZ)V

    .line 43
    .line 44
    .line 45
    new-instance v8, Lai;

    .line 46
    .line 47
    invoke-direct {v8, p0, v6, v2}, Lai;-><init>(Ljava/util/List;Lxk1;I)V

    .line 48
    .line 49
    .line 50
    new-instance p0, Lkw;

    .line 51
    .line 52
    invoke-direct {p0, v3, v7, v8}, Lkw;-><init>(IZLun0;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0, v1, v4, p0}, Ls81;->b(ILin0;Lin0;Lkw;)V

    .line 56
    .line 57
    .line 58
    return-object v5

    .line 59
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const-string v0, "hooker_debug_actions"

    .line 63
    .line 64
    sget-object v2, Ltp0;->e:Lkw;

    .line 65
    .line 66
    invoke-static {p1, v0, v2, v4}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 67
    .line 68
    .line 69
    new-instance v0, Ly1;

    .line 70
    .line 71
    invoke-direct {v0, v4, p0}, Ly1;-><init>(ILjava/util/List;)V

    .line 72
    .line 73
    .line 74
    new-instance v2, Lkw;

    .line 75
    .line 76
    const v3, -0x6cac793e

    .line 77
    .line 78
    .line 79
    invoke-direct {v2, v3, v7, v0}, Lkw;-><init>(IZLun0;)V

    .line 80
    .line 81
    .line 82
    const-string v0, "hooker_debug_summary"

    .line 83
    .line 84
    invoke-static {p1, v0, v2, v4}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_0

    .line 92
    .line 93
    const-string p0, "hooker_debug_empty"

    .line 94
    .line 95
    sget-object v0, Ltp0;->f:Lkw;

    .line 96
    .line 97
    invoke-static {p1, p0, v0, v4}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    new-instance v0, Lye;

    .line 102
    .line 103
    const/16 v2, 0x1d

    .line 104
    .line 105
    invoke-direct {v0, v2}, Lye;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    new-instance v3, Lzh;

    .line 113
    .line 114
    invoke-direct {v3, v1, v0, p0}, Lzh;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    new-instance v0, Ly0;

    .line 118
    .line 119
    const/4 v1, 0x7

    .line 120
    invoke-direct {v0, p0, v1, v8}, Ly0;-><init>(Ljava/util/List;IZ)V

    .line 121
    .line 122
    .line 123
    new-instance v1, Lai;

    .line 124
    .line 125
    invoke-direct {v1, p0, v6, v4}, Lai;-><init>(Ljava/util/List;Lxk1;I)V

    .line 126
    .line 127
    .line 128
    new-instance p0, Lkw;

    .line 129
    .line 130
    const v4, 0x799532c4

    .line 131
    .line 132
    .line 133
    invoke-direct {p0, v4, v7, v1}, Lkw;-><init>(IZLun0;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v2, v3, v0, p0}, Ls81;->b(ILin0;Lin0;Lkw;)V

    .line 137
    .line 138
    .line 139
    :goto_0
    return-object v5

    .line 140
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    sget-object v0, Lmi;->o:Lmi;

    .line 144
    .line 145
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    new-instance v2, Ly0;

    .line 150
    .line 151
    const/4 v4, 0x4

    .line 152
    invoke-direct {v2, v4, p0}, Ly0;-><init>(ILjava/util/List;)V

    .line 153
    .line 154
    .line 155
    new-instance v4, Ly0;

    .line 156
    .line 157
    invoke-direct {v4, p0, v1, v8}, Ly0;-><init>(Ljava/util/List;IZ)V

    .line 158
    .line 159
    .line 160
    new-instance v1, Lai;

    .line 161
    .line 162
    invoke-direct {v1, p0, v6, v7}, Lai;-><init>(Ljava/util/List;Lxk1;I)V

    .line 163
    .line 164
    .line 165
    new-instance p0, Lkw;

    .line 166
    .line 167
    invoke-direct {p0, v3, v7, v1}, Lkw;-><init>(IZLun0;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, v0, v2, v4, p0}, Ls81;->b(ILin0;Lin0;Lkw;)V

    .line 171
    .line 172
    .line 173
    return-object v5

    .line 174
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    sget-object v0, Lyh;->o:Lyh;

    .line 178
    .line 179
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    new-instance v1, Ly0;

    .line 184
    .line 185
    invoke-direct {v1, v4, p0}, Ly0;-><init>(ILjava/util/List;)V

    .line 186
    .line 187
    .line 188
    new-instance v4, Ly0;

    .line 189
    .line 190
    invoke-direct {v4, p0, v2, v8}, Ly0;-><init>(Ljava/util/List;IZ)V

    .line 191
    .line 192
    .line 193
    new-instance v2, Lai;

    .line 194
    .line 195
    invoke-direct {v2, p0, v6, v8}, Lai;-><init>(Ljava/util/List;Lxk1;I)V

    .line 196
    .line 197
    .line 198
    new-instance p0, Lkw;

    .line 199
    .line 200
    invoke-direct {p0, v3, v7, v2}, Lkw;-><init>(IZLun0;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, v0, v1, v4, p0}, Ls81;->b(ILin0;Lin0;Lkw;)V

    .line 204
    .line 205
    .line 206
    return-object v5

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
