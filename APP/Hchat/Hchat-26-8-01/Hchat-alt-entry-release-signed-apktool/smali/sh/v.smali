.class public final synthetic Lsh/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lsh/v;->g:I

    .line 2
    .line 3
    iput-object p3, p0, Lsh/v;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput p1, p0, Lsh/v;->i:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(ILi0/a1;I)V
    .locals 0

    .line 11
    iput p3, p0, Lsh/v;->g:I

    iput p1, p0, Lsh/v;->i:I

    iput-object p2, p0, Lsh/v;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lsh/v;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsh/v;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lh0/s;

    .line 9
    .line 10
    iget-object v0, v0, Lh0/s;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Li2/k0;

    .line 13
    .line 14
    iget-object v0, v0, Li2/k0;->b:Li2/o;

    .line 15
    .line 16
    iget v1, p0, Lsh/v;->i:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Li2/o;->d(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :pswitch_0
    iget-object v0, p0, Lsh/v;->h:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Li0/a1;

    .line 30
    .line 31
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/util/Set;

    .line 36
    .line 37
    iget v2, p0, Lsh/v;->i:I

    .line 38
    .line 39
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ljava/util/Set;

    .line 54
    .line 55
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v1, v2}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/util/Set;

    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v1, v2}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :goto_0
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_1
    iget-object v0, p0, Lsh/v;->h:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Li0/a1;

    .line 87
    .line 88
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Ljava/util/List;

    .line 93
    .line 94
    invoke-static {v1}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget v2, p0, Lsh/v;->i:I

    .line 99
    .line 100
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_1

    .line 108
    .line 109
    new-instance v1, Lx8/s;

    .line 110
    .line 111
    const/16 v2, 0x1f

    .line 112
    .line 113
    const/4 v3, 0x0

    .line 114
    invoke-direct {v1, v2, v3, v3}, Lx8/s;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    :cond_1
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 125
    .line 126
    return-object v0

    .line 127
    :pswitch_2
    iget-object v0, p0, Lsh/v;->h:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Li0/a1;

    .line 130
    .line 131
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    check-cast v1, Ljava/util/List;

    .line 136
    .line 137
    invoke-static {v1}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iget v2, p0, Lsh/v;->i:I

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, Lx8/s;

    .line 148
    .line 149
    add-int/lit8 v2, v2, 0x1

    .line 150
    .line 151
    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 158
    .line 159
    return-object v0

    .line 160
    :pswitch_3
    iget-object v0, p0, Lsh/v;->h:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, Li0/a1;

    .line 163
    .line 164
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, Ljava/util/List;

    .line 169
    .line 170
    invoke-static {v1}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    iget v2, p0, Lsh/v;->i:I

    .line 175
    .line 176
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    check-cast v3, Lx8/s;

    .line 181
    .line 182
    add-int/lit8 v2, v2, -0x1

    .line 183
    .line 184
    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_4
    iget-object v0, p0, Lsh/v;->h:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, Li0/a1;

    .line 196
    .line 197
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, Lfg/l;

    .line 202
    .line 203
    iget v1, p0, Lsh/v;->i:I

    .line 204
    .line 205
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
