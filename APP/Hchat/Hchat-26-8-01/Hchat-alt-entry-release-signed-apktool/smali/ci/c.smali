.class public final Lci/c;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILwf/c;)V
    .locals 1

    .line 13
    const/16 v0, 0x8

    iput v0, p0, Lci/c;->h:I

    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public constructor <init>(Lfg/l;Lwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lci/c;->h:I

    .line 3
    .line 4
    check-cast p1, Lyf/i;

    .line 5
    .line 6
    iput-object p1, p0, Lci/c;->j:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 14
    iput p3, p0, Lci/c;->h:I

    iput-object p1, p0, Lci/c;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 2

    .line 1
    iget v0, p0, Lci/c;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lci/c;

    .line 7
    .line 8
    iget-object v0, p0, Lci/c;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lfg/l;

    .line 11
    .line 12
    const/16 v1, 0xd

    .line 13
    .line 14
    invoke-direct {p1, v0, p2, v1}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance p1, Lci/c;

    .line 19
    .line 20
    iget-object v0, p0, Lci/c;->j:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lw/r0;

    .line 23
    .line 24
    const/16 v1, 0xc

    .line 25
    .line 26
    invoke-direct {p1, v0, p2, v1}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, Lci/c;

    .line 31
    .line 32
    iget-object v0, p0, Lci/c;->j:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lf0/j;

    .line 35
    .line 36
    const/16 v1, 0xb

    .line 37
    .line 38
    invoke-direct {p1, v0, p2, v1}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_2
    new-instance p1, Lci/c;

    .line 43
    .line 44
    iget-object v0, p0, Lci/c;->j:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ls1/l0;

    .line 47
    .line 48
    const/16 v1, 0xa

    .line 49
    .line 50
    invoke-direct {p1, v0, p2, v1}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_3
    new-instance p1, Lci/c;

    .line 55
    .line 56
    iget-object v0, p0, Lci/c;->j:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lp4/t;

    .line 59
    .line 60
    const/16 v1, 0x9

    .line 61
    .line 62
    invoke-direct {p1, v0, p2, v1}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_4
    new-instance v0, Lci/c;

    .line 67
    .line 68
    const/4 v1, 0x2

    .line 69
    invoke-direct {v0, v1, p2}, Lci/c;-><init>(ILwf/c;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, v0, Lci/c;->j:Ljava/lang/Object;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_5
    new-instance p1, Lci/c;

    .line 76
    .line 77
    iget-object v0, p0, Lci/c;->j:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Lm/l1;

    .line 80
    .line 81
    const/4 v1, 0x7

    .line 82
    invoke-direct {p1, v0, p2, v1}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    :pswitch_6
    new-instance p1, Lci/c;

    .line 87
    .line 88
    iget-object v0, p0, Lci/c;->j:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Lk/b1;

    .line 91
    .line 92
    const/4 v1, 0x6

    .line 93
    invoke-direct {p1, v0, p2, v1}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 94
    .line 95
    .line 96
    return-object p1

    .line 97
    :pswitch_7
    new-instance p1, Lci/c;

    .line 98
    .line 99
    iget-object v0, p0, Lci/c;->j:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Lk/i0;

    .line 102
    .line 103
    const/4 v1, 0x5

    .line 104
    invoke-direct {p1, v0, p2, v1}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 105
    .line 106
    .line 107
    return-object p1

    .line 108
    :pswitch_8
    new-instance p1, Lci/c;

    .line 109
    .line 110
    iget-object v0, p0, Lci/c;->j:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lk/d0;

    .line 113
    .line 114
    const/4 v1, 0x4

    .line 115
    invoke-direct {p1, v0, p2, v1}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 116
    .line 117
    .line 118
    return-object p1

    .line 119
    :pswitch_9
    new-instance p1, Lci/c;

    .line 120
    .line 121
    iget-object v0, p0, Lci/c;->j:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, Lyf/i;

    .line 124
    .line 125
    invoke-direct {p1, v0, p2}, Lci/c;-><init>(Lfg/l;Lwf/c;)V

    .line 126
    .line 127
    .line 128
    return-object p1

    .line 129
    :pswitch_a
    new-instance p1, Lci/c;

    .line 130
    .line 131
    iget-object v0, p0, Lci/c;->j:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Lci/n0;

    .line 134
    .line 135
    const/4 v1, 0x2

    .line 136
    invoke-direct {p1, v0, p2, v1}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 137
    .line 138
    .line 139
    return-object p1

    .line 140
    :pswitch_b
    new-instance p1, Lci/c;

    .line 141
    .line 142
    iget-object v0, p0, Lci/c;->j:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, Lci/k;

    .line 145
    .line 146
    const/4 v1, 0x1

    .line 147
    invoke-direct {p1, v0, p2, v1}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 148
    .line 149
    .line 150
    return-object p1

    .line 151
    :pswitch_c
    new-instance p1, Lci/c;

    .line 152
    .line 153
    iget-object v0, p0, Lci/c;->j:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lci/h0;

    .line 156
    .line 157
    const/4 v1, 0x0

    .line 158
    invoke-direct {p1, v0, p2, v1}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 159
    .line 160
    .line 161
    return-object p1

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lci/c;->h:I

    .line 2
    .line 3
    check-cast p1, Lqg/t;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lci/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lci/c;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lci/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lci/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lci/c;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lci/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lci/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lci/c;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lci/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lci/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lci/c;

    .line 54
    .line 55
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lci/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lci/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lci/c;

    .line 67
    .line 68
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lci/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, Lci/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lci/c;

    .line 80
    .line 81
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Lci/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :pswitch_5
    invoke-virtual {p0, p1, p2}, Lci/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Lci/c;

    .line 93
    .line 94
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Lci/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :pswitch_6
    invoke-virtual {p0, p1, p2}, Lci/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Lci/c;

    .line 106
    .line 107
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 108
    .line 109
    invoke-virtual {p1, p2}, Lci/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 113
    .line 114
    return-object p1

    .line 115
    :pswitch_7
    invoke-virtual {p0, p1, p2}, Lci/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Lci/c;

    .line 120
    .line 121
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 122
    .line 123
    invoke-virtual {p1, p2}, Lci/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    return-object p1

    .line 128
    :pswitch_8
    invoke-virtual {p0, p1, p2}, Lci/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p1, Lci/c;

    .line 133
    .line 134
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 135
    .line 136
    invoke-virtual {p1, p2}, Lci/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1

    .line 141
    :pswitch_9
    invoke-virtual {p0, p1, p2}, Lci/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, Lci/c;

    .line 146
    .line 147
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 148
    .line 149
    invoke-virtual {p1, p2}, Lci/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    return-object p1

    .line 154
    :pswitch_a
    invoke-virtual {p0, p1, p2}, Lci/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, Lci/c;

    .line 159
    .line 160
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 161
    .line 162
    invoke-virtual {p1, p2}, Lci/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    return-object p1

    .line 167
    :pswitch_b
    invoke-virtual {p0, p1, p2}, Lci/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    check-cast p1, Lci/c;

    .line 172
    .line 173
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 174
    .line 175
    invoke-virtual {p1, p2}, Lci/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    return-object p1

    .line 180
    :pswitch_c
    invoke-virtual {p0, p1, p2}, Lci/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    check-cast p1, Lci/c;

    .line 185
    .line 186
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 187
    .line 188
    invoke-virtual {p1, p2}, Lci/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    return-object p1

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lci/c;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lci/c;->i:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lci/c;->j:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lfg/l;

    .line 30
    .line 31
    iput v1, p0, Lci/c;->i:I

    .line 32
    .line 33
    invoke-interface {p1, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 38
    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    move-object p1, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 44
    .line 45
    :goto_1
    return-object p1

    .line 46
    :pswitch_0
    iget v0, p0, Lci/c;->i:I

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    if-ne v0, v1, :cond_3

    .line 52
    .line 53
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    goto :goto_2

    .line 66
    :cond_4
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lci/c;->j:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Lw/r0;

    .line 72
    .line 73
    iput v1, p0, Lci/c;->i:I

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v0, Lf/f0;

    .line 79
    .line 80
    invoke-direct {v0}, Lf/f0;-><init>()V

    .line 81
    .line 82
    .line 83
    iget-object v1, p1, Lw/r0;->a:Ln/k;

    .line 84
    .line 85
    iget-object v1, v1, Ln/k;->a:Ltg/r;

    .line 86
    .line 87
    new-instance v2, Lh0/l0;

    .line 88
    .line 89
    const/4 v3, 0x3

    .line 90
    invoke-direct {v2, v0, v3, p1}, Lh0/l0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {v1, v2, p0}, Ltg/r;->j(Ltg/r;Ltg/e;Lwf/c;)V

    .line 97
    .line 98
    .line 99
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 100
    .line 101
    :goto_2
    return-object p1

    .line 102
    :pswitch_1
    iget v0, p0, Lci/c;->i:I

    .line 103
    .line 104
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 105
    .line 106
    const/4 v2, 0x1

    .line 107
    if-eqz v0, :cond_6

    .line 108
    .line 109
    if-ne v0, v2, :cond_5

    .line 110
    .line 111
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_5
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 116
    .line 117
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const/4 v1, 0x0

    .line 121
    goto :goto_4

    .line 122
    :cond_6
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iget-object p1, p0, Lci/c;->j:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p1, Lf0/j;

    .line 128
    .line 129
    iput v2, p0, Lci/c;->i:I

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    new-instance v0, Lci/u;

    .line 135
    .line 136
    const/4 v2, 0x0

    .line 137
    const/4 v3, 0x1

    .line 138
    invoke-direct {v0, p1, v2, v3}, Lci/u;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 139
    .line 140
    .line 141
    invoke-static {v0, p0}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 146
    .line 147
    if-ne p1, v0, :cond_7

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_7
    move-object p1, v1

    .line 151
    :goto_3
    if-ne p1, v0, :cond_8

    .line 152
    .line 153
    move-object v1, v0

    .line 154
    :cond_8
    :goto_4
    return-object v1

    .line 155
    :pswitch_2
    iget-object v0, p0, Lci/c;->j:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Ls1/l0;

    .line 158
    .line 159
    iget v1, p0, Lci/c;->i:I

    .line 160
    .line 161
    const/4 v2, 0x2

    .line 162
    if-eqz v1, :cond_b

    .line 163
    .line 164
    const/4 v0, 0x1

    .line 165
    if-eq v1, v0, :cond_a

    .line 166
    .line 167
    if-ne v1, v2, :cond_9

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_9
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 171
    .line 172
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    const/4 p1, 0x0

    .line 176
    goto :goto_7

    .line 177
    :cond_a
    :goto_5
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_b
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    iget-object p1, v0, Ls1/l0;->x:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 185
    .line 186
    iput v2, p0, Lci/c;->i:I

    .line 187
    .line 188
    invoke-interface {p1, v0, p0}, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;->invoke(Ls1/x;Lwf/c;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 193
    .line 194
    if-ne p1, v0, :cond_c

    .line 195
    .line 196
    move-object p1, v0

    .line 197
    goto :goto_7

    .line 198
    :cond_c
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 199
    .line 200
    :goto_7
    return-object p1

    .line 201
    :pswitch_3
    iget v0, p0, Lci/c;->i:I

    .line 202
    .line 203
    const/4 v1, 0x1

    .line 204
    if-eqz v0, :cond_e

    .line 205
    .line 206
    if-ne v0, v1, :cond_d

    .line 207
    .line 208
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    move-object v7, p0

    .line 212
    goto :goto_8

    .line 213
    :cond_d
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 214
    .line 215
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    const/4 p1, 0x0

    .line 219
    move-object v7, p0

    .line 220
    goto :goto_9

    .line 221
    :cond_e
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    iget-object p1, p0, Lci/c;->j:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast p1, Lp4/t;

    .line 227
    .line 228
    iget-object p1, p1, Lp4/t;->i:Ljava/lang/Object;

    .line 229
    .line 230
    move-object v2, p1

    .line 231
    check-cast v2, Li/l;

    .line 232
    .line 233
    new-instance v3, Ljava/lang/Float;

    .line 234
    .line 235
    const/4 p1, 0x0

    .line 236
    invoke-direct {v3, p1}, Ljava/lang/Float;-><init>(F)V

    .line 237
    .line 238
    .line 239
    new-instance v0, Ljava/lang/Float;

    .line 240
    .line 241
    const/high16 v4, 0x3f000000    # 0.5f

    .line 242
    .line 243
    invoke-direct {v0, v4}, Ljava/lang/Float;-><init>(F)V

    .line 244
    .line 245
    .line 246
    const/high16 v4, 0x43c80000    # 400.0f

    .line 247
    .line 248
    invoke-static {p1, v4, v0, v1}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    iput v1, p0, Lci/c;->i:I

    .line 253
    .line 254
    const/4 v5, 0x1

    .line 255
    const/4 v6, 0x0

    .line 256
    const/16 v8, 0x8

    .line 257
    .line 258
    move-object v7, p0

    .line 259
    invoke-static/range {v2 .. v8}, Li/d;->h(Li/l;Ljava/lang/Float;Li/k;ZLfg/l;Lyf/c;I)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 264
    .line 265
    if-ne p1, v0, :cond_f

    .line 266
    .line 267
    move-object p1, v0

    .line 268
    goto :goto_9

    .line 269
    :cond_f
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 270
    .line 271
    :goto_9
    return-object p1

    .line 272
    :pswitch_4
    move-object v7, p0

    .line 273
    iget v0, v7, Lci/c;->i:I

    .line 274
    .line 275
    const/4 v1, 0x1

    .line 276
    if-eqz v0, :cond_11

    .line 277
    .line 278
    if-ne v0, v1, :cond_10

    .line 279
    .line 280
    iget-object v0, v7, Lci/c;->j:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v0, Lqg/t;

    .line 283
    .line 284
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    goto :goto_a

    .line 288
    :cond_10
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 289
    .line 290
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    const/4 p1, 0x0

    .line 294
    goto :goto_b

    .line 295
    :cond_11
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    iget-object p1, v7, Lci/c;->j:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast p1, Lqg/t;

    .line 301
    .line 302
    move-object v0, p1

    .line 303
    :cond_12
    :goto_a
    invoke-interface {v0}, Lqg/t;->n()Lwf/g;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-static {p1}, Lqg/v;->p(Lwf/g;)Z

    .line 308
    .line 309
    .line 310
    move-result p1

    .line 311
    if-eqz p1, :cond_13

    .line 312
    .line 313
    new-instance p1, Li2/z;

    .line 314
    .line 315
    const/16 v2, 0xf

    .line 316
    .line 317
    invoke-direct {p1, v2}, Li2/z;-><init>(I)V

    .line 318
    .line 319
    .line 320
    iput-object v0, v7, Lci/c;->j:Ljava/lang/Object;

    .line 321
    .line 322
    iput v1, v7, Lci/c;->i:I

    .line 323
    .line 324
    invoke-interface {p0}, Lwf/c;->getContext()Lwf/g;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    invoke-static {v2}, Li0/r;->s(Lwf/g;)Li0/d;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    invoke-virtual {v2, p1, p0}, Li0/d;->d(Lfg/l;Lwf/c;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    sget-object v2, Lxf/a;->g:Lxf/a;

    .line 337
    .line 338
    if-ne p1, v2, :cond_12

    .line 339
    .line 340
    move-object p1, v2

    .line 341
    goto :goto_b

    .line 342
    :cond_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 343
    .line 344
    :goto_b
    return-object p1

    .line 345
    :pswitch_5
    move-object v7, p0

    .line 346
    iget v0, v7, Lci/c;->i:I

    .line 347
    .line 348
    const/4 v1, 0x1

    .line 349
    if-eqz v0, :cond_15

    .line 350
    .line 351
    if-ne v0, v1, :cond_14

    .line 352
    .line 353
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    goto :goto_c

    .line 357
    :cond_14
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 358
    .line 359
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    const/4 p1, 0x0

    .line 363
    goto :goto_c

    .line 364
    :cond_15
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    iget-object p1, v7, Lci/c;->j:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast p1, Lm/l1;

    .line 370
    .line 371
    iget-object p1, p1, Lm/l1;->g:Lsg/c;

    .line 372
    .line 373
    iput v1, v7, Lci/c;->i:I

    .line 374
    .line 375
    new-instance v0, Lci/j;

    .line 376
    .line 377
    const/4 v1, 0x0

    .line 378
    const/16 v2, 0xb

    .line 379
    .line 380
    invoke-direct {v0, p1, v1, v2}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 381
    .line 382
    .line 383
    invoke-static {v0, p0}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 388
    .line 389
    if-ne p1, v0, :cond_16

    .line 390
    .line 391
    move-object p1, v0

    .line 392
    :cond_16
    :goto_c
    return-object p1

    .line 393
    :pswitch_6
    move-object v7, p0

    .line 394
    iget-object v0, v7, Lci/c;->j:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v0, Lk/b1;

    .line 397
    .line 398
    iget v1, v7, Lci/c;->i:I

    .line 399
    .line 400
    const/4 v2, 0x2

    .line 401
    const/4 v3, 0x1

    .line 402
    sget-object v4, Lxf/a;->g:Lxf/a;

    .line 403
    .line 404
    if-eqz v1, :cond_19

    .line 405
    .line 406
    if-eq v1, v3, :cond_18

    .line 407
    .line 408
    if-ne v1, v2, :cond_17

    .line 409
    .line 410
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    goto :goto_10

    .line 414
    :cond_17
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 415
    .line 416
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    const/4 v4, 0x0

    .line 420
    goto :goto_f

    .line 421
    :cond_18
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    goto :goto_e

    .line 425
    :cond_19
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    :cond_1a
    :goto_d
    iget-object p1, v0, Lk/b1;->E:Lsg/c;

    .line 429
    .line 430
    if-eqz p1, :cond_1b

    .line 431
    .line 432
    iput v3, v7, Lci/c;->i:I

    .line 433
    .line 434
    invoke-virtual {p1, p0}, Lsg/c;->f(Lwf/c;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    if-ne p1, v4, :cond_1b

    .line 439
    .line 440
    goto :goto_f

    .line 441
    :cond_1b
    :goto_e
    iget-object p1, v0, Lk/b1;->z:Lk/n1;

    .line 442
    .line 443
    if-eqz p1, :cond_1a

    .line 444
    .line 445
    new-instance p1, Li2/z;

    .line 446
    .line 447
    const/16 v1, 0xf

    .line 448
    .line 449
    invoke-direct {p1, v1}, Li2/z;-><init>(I)V

    .line 450
    .line 451
    .line 452
    iput v2, v7, Lci/c;->i:I

    .line 453
    .line 454
    invoke-virtual {p0}, Lyf/c;->getContext()Lwf/g;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    invoke-static {v1}, Li0/r;->s(Lwf/g;)Li0/d;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    new-instance v5, Li0/t0;

    .line 463
    .line 464
    const/4 v6, 0x0

    .line 465
    invoke-direct {v5, p1, v6}, Li0/t0;-><init>(Lfg/l;I)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v1, v5, p0}, Li0/d;->d(Lfg/l;Lwf/c;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    if-ne p1, v4, :cond_1c

    .line 473
    .line 474
    :goto_f
    return-object v4

    .line 475
    :cond_1c
    :goto_10
    iget-object p1, v0, Lk/b1;->z:Lk/n1;

    .line 476
    .line 477
    if-eqz p1, :cond_1a

    .line 478
    .line 479
    check-cast p1, Lk/p1;

    .line 480
    .line 481
    invoke-virtual {p1}, Lk/p1;->d()V

    .line 482
    .line 483
    .line 484
    goto :goto_d

    .line 485
    :pswitch_7
    move-object v7, p0

    .line 486
    iget v0, v7, Lci/c;->i:I

    .line 487
    .line 488
    const/4 v1, 0x1

    .line 489
    if-eqz v0, :cond_1e

    .line 490
    .line 491
    if-ne v0, v1, :cond_1d

    .line 492
    .line 493
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    goto :goto_11

    .line 497
    :cond_1d
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 498
    .line 499
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    const/4 p1, 0x0

    .line 503
    goto :goto_12

    .line 504
    :cond_1e
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    iget-object p1, v7, Lci/c;->j:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast p1, Lk/i0;

    .line 510
    .line 511
    iput v1, v7, Lci/c;->i:I

    .line 512
    .line 513
    const/4 v0, 0x0

    .line 514
    invoke-static {p1, v0, p0}, Loh/h;->k(Lx1/i;Lfg/a;Lyf/c;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object p1

    .line 518
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 519
    .line 520
    if-ne p1, v0, :cond_1f

    .line 521
    .line 522
    move-object p1, v0

    .line 523
    goto :goto_12

    .line 524
    :cond_1f
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 525
    .line 526
    :goto_12
    return-object p1

    .line 527
    :pswitch_8
    move-object v7, p0

    .line 528
    iget v0, v7, Lci/c;->i:I

    .line 529
    .line 530
    const/4 v1, 0x1

    .line 531
    if-eqz v0, :cond_21

    .line 532
    .line 533
    if-ne v0, v1, :cond_20

    .line 534
    .line 535
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 539
    .line 540
    goto :goto_13

    .line 541
    :cond_20
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 542
    .line 543
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    const/4 p1, 0x0

    .line 547
    goto :goto_13

    .line 548
    :cond_21
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    new-instance v9, Lgg/s;

    .line 552
    .line 553
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 554
    .line 555
    .line 556
    new-instance v10, Lgg/s;

    .line 557
    .line 558
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 559
    .line 560
    .line 561
    new-instance v11, Lgg/s;

    .line 562
    .line 563
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 564
    .line 565
    .line 566
    iget-object p1, v7, Lci/c;->j:Ljava/lang/Object;

    .line 567
    .line 568
    move-object v12, p1

    .line 569
    check-cast v12, Lk/d0;

    .line 570
    .line 571
    iget-object p1, v12, Lk/d0;->u:Ln/k;

    .line 572
    .line 573
    iget-object p1, p1, Ln/k;->a:Ltg/r;

    .line 574
    .line 575
    new-instance v8, Lk/c0;

    .line 576
    .line 577
    const/4 v13, 0x0

    .line 578
    invoke-direct/range {v8 .. v13}, Lk/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 579
    .line 580
    .line 581
    iput v1, v7, Lci/c;->i:I

    .line 582
    .line 583
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    invoke-static {p1, v8, p0}, Ltg/r;->j(Ltg/r;Ltg/e;Lwf/c;)V

    .line 587
    .line 588
    .line 589
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 590
    .line 591
    :goto_13
    return-object p1

    .line 592
    :pswitch_9
    move-object v7, p0

    .line 593
    iget v0, v7, Lci/c;->i:I

    .line 594
    .line 595
    const/4 v1, 0x1

    .line 596
    if-eqz v0, :cond_23

    .line 597
    .line 598
    if-ne v0, v1, :cond_22

    .line 599
    .line 600
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    goto :goto_14

    .line 604
    :cond_22
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 605
    .line 606
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    const/4 p1, 0x0

    .line 610
    goto :goto_15

    .line 611
    :cond_23
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    iget-object p1, v7, Lci/c;->j:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast p1, Lyf/i;

    .line 617
    .line 618
    iput v1, v7, Lci/c;->i:I

    .line 619
    .line 620
    invoke-interface {p1, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object p1

    .line 624
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 625
    .line 626
    if-ne p1, v0, :cond_24

    .line 627
    .line 628
    move-object p1, v0

    .line 629
    goto :goto_15

    .line 630
    :cond_24
    :goto_14
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 631
    .line 632
    :goto_15
    return-object p1

    .line 633
    :pswitch_a
    move-object v7, p0

    .line 634
    iget v0, v7, Lci/c;->i:I

    .line 635
    .line 636
    const/4 v1, 0x1

    .line 637
    if-eqz v0, :cond_26

    .line 638
    .line 639
    if-ne v0, v1, :cond_25

    .line 640
    .line 641
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 645
    .line 646
    goto :goto_16

    .line 647
    :cond_25
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 648
    .line 649
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    const/4 p1, 0x0

    .line 653
    goto :goto_16

    .line 654
    :cond_26
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 655
    .line 656
    .line 657
    iget-object p1, v7, Lci/c;->j:Ljava/lang/Object;

    .line 658
    .line 659
    check-cast p1, Lci/n0;

    .line 660
    .line 661
    iget-object v0, p1, Lci/n0;->u:Ln/k;

    .line 662
    .line 663
    iget-object v0, v0, Ln/k;->a:Ltg/r;

    .line 664
    .line 665
    new-instance v2, Lci/i;

    .line 666
    .line 667
    const/4 v3, 0x1

    .line 668
    invoke-direct {v2, p1, v3}, Lci/i;-><init>(Ljava/lang/Object;I)V

    .line 669
    .line 670
    .line 671
    iput v1, v7, Lci/c;->i:I

    .line 672
    .line 673
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 674
    .line 675
    .line 676
    invoke-static {v0, v2, p0}, Ltg/r;->j(Ltg/r;Ltg/e;Lwf/c;)V

    .line 677
    .line 678
    .line 679
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 680
    .line 681
    :goto_16
    return-object p1

    .line 682
    :pswitch_b
    move-object v7, p0

    .line 683
    iget v0, v7, Lci/c;->i:I

    .line 684
    .line 685
    const/4 v1, 0x1

    .line 686
    if-eqz v0, :cond_28

    .line 687
    .line 688
    if-ne v0, v1, :cond_27

    .line 689
    .line 690
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 694
    .line 695
    goto :goto_17

    .line 696
    :cond_27
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 697
    .line 698
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    const/4 p1, 0x0

    .line 702
    goto :goto_17

    .line 703
    :cond_28
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 704
    .line 705
    .line 706
    iget-object p1, v7, Lci/c;->j:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast p1, Lci/k;

    .line 709
    .line 710
    iget-object v0, p1, Lci/k;->u:Ln/k;

    .line 711
    .line 712
    iget-object v0, v0, Ln/k;->a:Ltg/r;

    .line 713
    .line 714
    new-instance v2, Lci/i;

    .line 715
    .line 716
    const/4 v3, 0x0

    .line 717
    invoke-direct {v2, p1, v3}, Lci/i;-><init>(Ljava/lang/Object;I)V

    .line 718
    .line 719
    .line 720
    iput v1, v7, Lci/c;->i:I

    .line 721
    .line 722
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 723
    .line 724
    .line 725
    invoke-static {v0, v2, p0}, Ltg/r;->j(Ltg/r;Ltg/e;Lwf/c;)V

    .line 726
    .line 727
    .line 728
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 729
    .line 730
    :goto_17
    return-object p1

    .line 731
    :pswitch_c
    move-object v7, p0

    .line 732
    iget v0, v7, Lci/c;->i:I

    .line 733
    .line 734
    const/4 v1, 0x1

    .line 735
    if-eqz v0, :cond_2a

    .line 736
    .line 737
    if-ne v0, v1, :cond_29

    .line 738
    .line 739
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 740
    .line 741
    .line 742
    goto :goto_18

    .line 743
    :cond_29
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 744
    .line 745
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 746
    .line 747
    .line 748
    const/4 p1, 0x0

    .line 749
    goto :goto_19

    .line 750
    :cond_2a
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 751
    .line 752
    .line 753
    iget-object p1, v7, Lci/c;->j:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast p1, Lci/h0;

    .line 756
    .line 757
    iput v1, v7, Lci/c;->i:I

    .line 758
    .line 759
    invoke-virtual {p1, p0}, Lci/h0;->e(Lyf/c;)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object p1

    .line 763
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 764
    .line 765
    if-ne p1, v0, :cond_2b

    .line 766
    .line 767
    move-object p1, v0

    .line 768
    goto :goto_19

    .line 769
    :cond_2b
    :goto_18
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 770
    .line 771
    :goto_19
    return-object p1

    .line 772
    nop

    .line 773
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
