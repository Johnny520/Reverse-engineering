.class public final Lth/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lu2/c;

.field public final synthetic i:Ly0/n;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lu2/c;Ly0/n;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lth/h;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lth/h;->h:Lu2/c;

    .line 4
    .line 5
    iput-object p2, p0, Lth/h;->i:Ly0/n;

    .line 6
    .line 7
    iput-object p3, p0, Lth/h;->j:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lth/h;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lh1/d;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lb5/c;->s()Lu2/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, p0, Lth/h;->h:Lu2/c;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lb5/c;->R(Lu2/c;)V

    .line 26
    .line 27
    .line 28
    :try_start_0
    iget-object v1, p0, Lth/h;->i:Ly0/n;

    .line 29
    .line 30
    check-cast v1, Lth/l;

    .line 31
    .line 32
    iget-object v1, v1, Lth/l;->u:Lth/j;

    .line 33
    .line 34
    iget-object v1, v1, Lth/j;->b:Lb0/l;

    .line 35
    .line 36
    iget-object v2, p0, Lth/h;->j:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Lx1/h0;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lb0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1, v0}, Lb5/c;->R(Lu2/c;)V

    .line 48
    .line 49
    .line 50
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 51
    .line 52
    return-object p1

    .line 53
    :catchall_0
    move-exception v1

    .line 54
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1, v0}, Lb5/c;->R(Lu2/c;)V

    .line 59
    .line 60
    .line 61
    throw v1

    .line 62
    :pswitch_0
    check-cast p1, Lh1/d;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lb5/c;->s()Lu2/c;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-object v2, p0, Lth/h;->h:Lu2/c;

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Lb5/c;->R(Lu2/c;)V

    .line 82
    .line 83
    .line 84
    :try_start_1
    iget-object v1, p0, Lth/h;->i:Ly0/n;

    .line 85
    .line 86
    check-cast v1, Lth/i;

    .line 87
    .line 88
    iget-object v2, p0, Lth/h;->j:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Lth/e;

    .line 91
    .line 92
    invoke-static {v1, p1, v2}, Lth/i;->k1(Lth/i;Lh1/d;Lth/e;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 93
    .line 94
    .line 95
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1, v0}, Lb5/c;->R(Lu2/c;)V

    .line 100
    .line 101
    .line 102
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 103
    .line 104
    return-object p1

    .line 105
    :catchall_1
    move-exception v1

    .line 106
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1, v0}, Lb5/c;->R(Lu2/c;)V

    .line 111
    .line 112
    .line 113
    throw v1

    .line 114
    :pswitch_1
    check-cast p1, Lh1/d;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0}, Lb5/c;->s()Lu2/c;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    iget-object v2, p0, Lth/h;->h:Lu2/c;

    .line 132
    .line 133
    invoke-virtual {v1, v2}, Lb5/c;->R(Lu2/c;)V

    .line 134
    .line 135
    .line 136
    :try_start_2
    iget-object v1, p0, Lth/h;->i:Ly0/n;

    .line 137
    .line 138
    check-cast v1, Lth/i;

    .line 139
    .line 140
    iget-object v2, p0, Lth/h;->j:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, Lth/e;

    .line 143
    .line 144
    invoke-static {v1, p1, v2}, Lth/i;->k1(Lth/i;Lh1/d;Lth/e;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 145
    .line 146
    .line 147
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p1, v0}, Lb5/c;->R(Lu2/c;)V

    .line 152
    .line 153
    .line 154
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 155
    .line 156
    return-object p1

    .line 157
    :catchall_2
    move-exception v1

    .line 158
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p1, v0}, Lb5/c;->R(Lu2/c;)V

    .line 163
    .line 164
    .line 165
    throw v1

    .line 166
    :pswitch_2
    check-cast p1, Lh1/d;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0}, Lb5/c;->s()Lu2/c;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    iget-object v2, p0, Lth/h;->h:Lu2/c;

    .line 184
    .line 185
    invoke-virtual {v1, v2}, Lb5/c;->R(Lu2/c;)V

    .line 186
    .line 187
    .line 188
    :try_start_3
    iget-object v1, p0, Lth/h;->i:Ly0/n;

    .line 189
    .line 190
    check-cast v1, Lth/i;

    .line 191
    .line 192
    iget-object v2, p0, Lth/h;->j:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v2, Lth/e;

    .line 195
    .line 196
    invoke-static {v1, p1, v2}, Lth/i;->k1(Lth/i;Lh1/d;Lth/e;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 197
    .line 198
    .line 199
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {p1, v0}, Lb5/c;->R(Lu2/c;)V

    .line 204
    .line 205
    .line 206
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 207
    .line 208
    return-object p1

    .line 209
    :catchall_3
    move-exception v1

    .line 210
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-virtual {p1, v0}, Lb5/c;->R(Lu2/c;)V

    .line 215
    .line 216
    .line 217
    throw v1

    .line 218
    nop

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
