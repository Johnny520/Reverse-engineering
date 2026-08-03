.class public final Lfh/j;
.super Lx6/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:I

.field public h:Ljava/util/List;

.field public i:Lgh/a;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lfh/j;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final G(Lg6/b;)I
    .locals 4

    .line 1
    iget v0, p0, Lfh/j;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lfh/j;->h:Ljava/util/List;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lfh/m;

    .line 35
    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    :goto_1
    invoke-virtual {v3, p1}, Lfh/m;->G(Lg6/b;)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_2

    .line 43
    :cond_0
    new-instance v3, Lfh/m;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-static {v2}, Ltf/m;->O1(Ljava/util/ArrayList;)[I

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p1, v0}, Lg6/b;->f([I)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    goto :goto_3

    .line 66
    :cond_2
    move v0, v1

    .line 67
    :goto_3
    iget-object v2, p0, Lfh/j;->i:Lgh/a;

    .line 68
    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    invoke-virtual {v2, p1}, Lgh/a;->G(Lg6/b;)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    goto :goto_4

    .line 76
    :cond_3
    move v2, v1

    .line 77
    :goto_4
    const/4 v3, 0x2

    .line 78
    invoke-virtual {p1, v3}, Lg6/b;->n(I)V

    .line 79
    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    invoke-virtual {p1, v3, v2}, Lg6/b;->c(II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v1, v0}, Lg6/b;->c(II)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lg6/b;->g()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-virtual {p1, v0}, Lg6/b;->i(I)V

    .line 93
    .line 94
    .line 95
    return v0

    .line 96
    :pswitch_0
    iget-object v0, p0, Lfh/j;->h:Ljava/util/List;

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    new-instance v2, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_4

    .line 119
    .line 120
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Lfh/i;

    .line 125
    .line 126
    invoke-virtual {v3, p1}, Lfh/i;->G(Lg6/b;)I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_4
    invoke-static {v2}, Ltf/m;->O1(Ljava/util/ArrayList;)[I

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {p1, v0}, Lg6/b;->f([I)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    goto :goto_6

    .line 147
    :cond_5
    move v0, v1

    .line 148
    :goto_6
    iget-object v2, p0, Lfh/j;->i:Lgh/a;

    .line 149
    .line 150
    if-eqz v2, :cond_6

    .line 151
    .line 152
    invoke-virtual {v2, p1}, Lgh/a;->G(Lg6/b;)I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    goto :goto_7

    .line 157
    :cond_6
    move v2, v1

    .line 158
    :goto_7
    const/4 v3, 0x3

    .line 159
    invoke-virtual {p1, v3}, Lg6/b;->n(I)V

    .line 160
    .line 161
    .line 162
    const/4 v3, 0x2

    .line 163
    invoke-virtual {p1, v3, v2}, Lg6/b;->c(II)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v1, v0}, Lg6/b;->c(II)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Lg6/b;->g()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-virtual {p1, v0}, Lg6/b;->i(I)V

    .line 174
    .line 175
    .line 176
    return v0

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public k0(Lfh/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfh/j;->h:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object v0, p0, Lfh/j;->h:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
