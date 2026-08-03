.class public final synthetic Lud/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lud/e;


# direct methods
.method public synthetic constructor <init>(Lud/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Lud/c;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lud/c;->b:Lud/e;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lud/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljf/f;

    .line 7
    .line 8
    new-instance v0, Lud/r;

    .line 9
    .line 10
    iget-object v1, p0, Lud/c;->b:Lud/e;

    .line 11
    .line 12
    invoke-direct {v0, v1, p1}, Lud/r;-><init>(Lud/e;Ljf/f;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v2, p1, Ljf/f;->a:Lf/r;

    .line 21
    .line 22
    iget v3, p1, Ljf/f;->d:I

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Lf/r;->d(I)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-static {v4, v1, v3}, Ljf/a;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    iget p1, p1, Ljf/f;->e:I

    .line 33
    .line 34
    iget-object v3, v2, Lf/r;->f:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Lac/k;

    .line 37
    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-virtual {v3, p1}, Lac/k;->a(I)V

    .line 44
    .line 45
    .line 46
    iget-object p1, v3, Lac/k;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_1

    .line 55
    .line 56
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    new-instance v6, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    const/4 v7, 0x0

    .line 65
    :goto_0
    if-ge v7, v5, :cond_2

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    invoke-virtual {v2, v8}, Lf/r;->d(I)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v9}, Lac/k;->a(I)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v7, v7, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    move-object p1, v6

    .line 89
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_3

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_4

    .line 114
    .line 115
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Ljava/util/List;

    .line 120
    .line 121
    invoke-static {v3}, Lpc/d;->b(Ljava/util/List;)Lpc/d;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_4
    new-instance v4, Lpc/c;

    .line 130
    .line 131
    invoke-direct {v4, v2}, Lpc/c;-><init>(Ljava/util/ArrayList;)V

    .line 132
    .line 133
    .line 134
    :goto_3
    if-eqz v4, :cond_5

    .line 135
    .line 136
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_5
    invoke-virtual {v0, v1}, Lmd/e;->z(Ljava/util/ArrayList;)V

    .line 140
    .line 141
    .line 142
    return-object v0

    .line 143
    :pswitch_0
    check-cast p1, Ljf/d;

    .line 144
    .line 145
    iget-object v0, p0, Lud/c;->b:Lud/e;

    .line 146
    .line 147
    iget-object v1, v0, Lud/e;->k:Lud/u;

    .line 148
    .line 149
    invoke-static {v1, p1}, Lod/c;->a(Lud/u;Ljf/d;)Lod/c;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    new-instance v2, Lud/g;

    .line 154
    .line 155
    iget v3, p1, Ljf/d;->e:I

    .line 156
    .line 157
    invoke-direct {v2, v0, v1, v3}, Lud/g;-><init>(Lud/e;Lod/c;I)V

    .line 158
    .line 159
    .line 160
    new-instance v0, Ljava/util/ArrayList;

    .line 161
    .line 162
    const/4 v1, 0x2

    .line 163
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 164
    .line 165
    .line 166
    iget-object v1, p1, Ljf/d;->g:Lnc/a;

    .line 167
    .line 168
    if-eqz v1, :cond_6

    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    :cond_6
    iget-object v1, p1, Ljf/d;->a:Lf/r;

    .line 174
    .line 175
    if-eqz v1, :cond_7

    .line 176
    .line 177
    iget p1, p1, Ljf/d;->f:I

    .line 178
    .line 179
    invoke-virtual {v1, p1}, Lf/r;->d(I)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    const/4 v1, 0x0

    .line 184
    invoke-static {v1, v0, p1}, Ljf/a;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v0}, Lmd/e;->z(Ljava/util/ArrayList;)V

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_7
    const-string p1, "Annotation parser not initialized"

    .line 192
    .line 193
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    const/4 v2, 0x0

    .line 197
    :goto_4
    return-object v2

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
