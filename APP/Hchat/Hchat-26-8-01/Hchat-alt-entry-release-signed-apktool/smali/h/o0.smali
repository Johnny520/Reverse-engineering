.class public final Lh/o0;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lh/q0;

.field public final synthetic i:J


# direct methods
.method public synthetic constructor <init>(Lh/q0;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lh/o0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lh/o0;->h:Lh/q0;

    .line 4
    .line 5
    iput-wide p2, p0, Lh/o0;->i:J

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lh/o0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lh/f0;

    .line 7
    .line 8
    iget-object v0, p0, Lh/o0;->h:Lh/q0;

    .line 9
    .line 10
    iget-object v1, v0, Lh/q0;->z:Lh/r0;

    .line 11
    .line 12
    iget-object v1, v1, Lh/r0;->a:Lh/h1;

    .line 13
    .line 14
    iget-object v1, v1, Lh/h1;->b:Lh/f1;

    .line 15
    .line 16
    iget-wide v2, p0, Lh/o0;->i:J

    .line 17
    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object v1, v1, Lh/f1;->a:Lgg/m;

    .line 23
    .line 24
    new-instance v6, Lu2/l;

    .line 25
    .line 26
    invoke-direct {v6, v2, v3}, Lu2/l;-><init>(J)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v6}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lu2/j;

    .line 34
    .line 35
    iget-wide v6, v1, Lu2/j;->a:J

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-wide v6, v4

    .line 39
    :goto_0
    iget-object v0, v0, Lh/q0;->A:Lh/s0;

    .line 40
    .line 41
    iget-object v0, v0, Lh/s0;->a:Lh/h1;

    .line 42
    .line 43
    iget-object v0, v0, Lh/h1;->b:Lh/f1;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget-object v0, v0, Lh/f1;->a:Lgg/m;

    .line 48
    .line 49
    new-instance v1, Lu2/l;

    .line 50
    .line 51
    invoke-direct {v1, v2, v3}, Lu2/l;-><init>(J)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lu2/j;

    .line 59
    .line 60
    iget-wide v0, v0, Lu2/j;->a:J

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move-wide v0, v4

    .line 64
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    if-eq p1, v2, :cond_4

    .line 72
    .line 73
    const/4 v2, 0x2

    .line 74
    if-ne p1, v2, :cond_2

    .line 75
    .line 76
    move-wide v4, v0

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    invoke-static {}, Lokio/a;->k()V

    .line 79
    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    goto :goto_3

    .line 83
    :cond_3
    move-wide v4, v6

    .line 84
    :cond_4
    :goto_2
    new-instance p1, Lu2/j;

    .line 85
    .line 86
    invoke-direct {p1, v4, v5}, Lu2/j;-><init>(J)V

    .line 87
    .line 88
    .line 89
    :goto_3
    return-object p1

    .line 90
    :pswitch_0
    check-cast p1, Lh/f0;

    .line 91
    .line 92
    iget-object v0, p0, Lh/o0;->h:Lh/q0;

    .line 93
    .line 94
    iget-object v1, v0, Lh/q0;->E:Ly0/c;

    .line 95
    .line 96
    if-nez v1, :cond_5

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_5
    invoke-virtual {v0}, Lh/q0;->m1()Ly0/c;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-nez v1, :cond_6

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_6
    iget-object v1, v0, Lh/q0;->E:Ly0/c;

    .line 107
    .line 108
    invoke-virtual {v0}, Lh/q0;->m1()Ly0/c;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_7

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_9

    .line 124
    .line 125
    const/4 v1, 0x1

    .line 126
    if-eq p1, v1, :cond_9

    .line 127
    .line 128
    const/4 v1, 0x2

    .line 129
    if-ne p1, v1, :cond_8

    .line 130
    .line 131
    iget-object p1, v0, Lh/q0;->A:Lh/s0;

    .line 132
    .line 133
    iget-object p1, p1, Lh/s0;->a:Lh/h1;

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_8
    invoke-static {}, Lokio/a;->k()V

    .line 137
    .line 138
    .line 139
    const/4 p1, 0x0

    .line 140
    goto :goto_5

    .line 141
    :cond_9
    :goto_4
    new-instance p1, Lu2/j;

    .line 142
    .line 143
    const-wide/16 v0, 0x0

    .line 144
    .line 145
    invoke-direct {p1, v0, v1}, Lu2/j;-><init>(J)V

    .line 146
    .line 147
    .line 148
    :goto_5
    return-object p1

    .line 149
    :pswitch_1
    check-cast p1, Lh/f0;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_b

    .line 156
    .line 157
    const/4 v0, 0x1

    .line 158
    if-eq p1, v0, :cond_b

    .line 159
    .line 160
    const/4 v0, 0x2

    .line 161
    if-ne p1, v0, :cond_a

    .line 162
    .line 163
    iget-object p1, p0, Lh/o0;->h:Lh/q0;

    .line 164
    .line 165
    iget-object p1, p1, Lh/q0;->A:Lh/s0;

    .line 166
    .line 167
    iget-object p1, p1, Lh/s0;->a:Lh/h1;

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_a
    invoke-static {}, Lokio/a;->k()V

    .line 171
    .line 172
    .line 173
    const/4 p1, 0x0

    .line 174
    goto :goto_7

    .line 175
    :cond_b
    :goto_6
    new-instance p1, Lu2/l;

    .line 176
    .line 177
    iget-wide v0, p0, Lh/o0;->i:J

    .line 178
    .line 179
    invoke-direct {p1, v0, v1}, Lu2/l;-><init>(J)V

    .line 180
    .line 181
    .line 182
    :goto_7
    return-object p1

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
