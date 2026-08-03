.class public final synthetic Lwb/de;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Ljava/util/ArrayList;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:Lfg/p;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/ArrayList;Li0/a1;Li0/a1;Ljava/util/List;Ljava/util/List;Lfg/p;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p10, p0, Lwb/de;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/de;->h:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/de;->i:Ljava/util/ArrayList;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/de;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/de;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/de;->l:Ljava/util/List;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/de;->m:Ljava/util/List;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/de;->n:Lfg/p;

    .line 16
    .line 17
    iput-object p8, p0, Lwb/de;->o:Li0/a1;

    .line 18
    .line 19
    iput-object p9, p0, Lwb/de;->p:Li0/a1;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/de;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lr/d;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Li0/h0;

    .line 15
    .line 16
    move-object/from16 v3, p3

    .line 17
    .line 18
    check-cast v3, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v1, v3, 0x11

    .line 28
    .line 29
    const/16 v4, 0x10

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    if-eq v1, v4, :cond_0

    .line 33
    .line 34
    move v1, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v1, 0x0

    .line 37
    :goto_0
    and-int/2addr v3, v5

    .line 38
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    new-instance v6, Lwb/sf;

    .line 45
    .line 46
    const/16 v16, 0x1

    .line 47
    .line 48
    iget-object v7, v0, Lwb/de;->h:Ljava/util/List;

    .line 49
    .line 50
    iget-object v8, v0, Lwb/de;->i:Ljava/util/ArrayList;

    .line 51
    .line 52
    iget-object v9, v0, Lwb/de;->j:Li0/a1;

    .line 53
    .line 54
    iget-object v10, v0, Lwb/de;->k:Li0/a1;

    .line 55
    .line 56
    iget-object v11, v0, Lwb/de;->l:Ljava/util/List;

    .line 57
    .line 58
    iget-object v12, v0, Lwb/de;->m:Ljava/util/List;

    .line 59
    .line 60
    iget-object v13, v0, Lwb/de;->n:Lfg/p;

    .line 61
    .line 62
    iget-object v14, v0, Lwb/de;->o:Li0/a1;

    .line 63
    .line 64
    iget-object v15, v0, Lwb/de;->p:Li0/a1;

    .line 65
    .line 66
    invoke-direct/range {v6 .. v16}, Lwb/sf;-><init>(Ljava/util/List;Ljava/util/ArrayList;Li0/a1;Li0/a1;Ljava/util/List;Ljava/util/List;Lfg/p;Li0/a1;Li0/a1;I)V

    .line 67
    .line 68
    .line 69
    const v1, 0x12999d30

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v6, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const/16 v3, 0x30

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 84
    .line 85
    .line 86
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 87
    .line 88
    return-object v1

    .line 89
    :pswitch_0
    move-object/from16 v1, p1

    .line 90
    .line 91
    check-cast v1, Lr/d;

    .line 92
    .line 93
    move-object/from16 v2, p2

    .line 94
    .line 95
    check-cast v2, Li0/h0;

    .line 96
    .line 97
    move-object/from16 v3, p3

    .line 98
    .line 99
    check-cast v3, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    and-int/lit8 v1, v3, 0x11

    .line 109
    .line 110
    const/16 v4, 0x10

    .line 111
    .line 112
    const/4 v5, 0x1

    .line 113
    if-eq v1, v4, :cond_2

    .line 114
    .line 115
    move v1, v5

    .line 116
    goto :goto_2

    .line 117
    :cond_2
    const/4 v1, 0x0

    .line 118
    :goto_2
    and-int/2addr v3, v5

    .line 119
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_3

    .line 124
    .line 125
    new-instance v6, Lwb/sf;

    .line 126
    .line 127
    const/16 v16, 0x0

    .line 128
    .line 129
    iget-object v7, v0, Lwb/de;->h:Ljava/util/List;

    .line 130
    .line 131
    iget-object v8, v0, Lwb/de;->i:Ljava/util/ArrayList;

    .line 132
    .line 133
    iget-object v9, v0, Lwb/de;->j:Li0/a1;

    .line 134
    .line 135
    iget-object v10, v0, Lwb/de;->k:Li0/a1;

    .line 136
    .line 137
    iget-object v11, v0, Lwb/de;->l:Ljava/util/List;

    .line 138
    .line 139
    iget-object v12, v0, Lwb/de;->m:Ljava/util/List;

    .line 140
    .line 141
    iget-object v13, v0, Lwb/de;->n:Lfg/p;

    .line 142
    .line 143
    iget-object v14, v0, Lwb/de;->o:Li0/a1;

    .line 144
    .line 145
    iget-object v15, v0, Lwb/de;->p:Li0/a1;

    .line 146
    .line 147
    invoke-direct/range {v6 .. v16}, Lwb/sf;-><init>(Ljava/util/List;Ljava/util/ArrayList;Li0/a1;Li0/a1;Ljava/util/List;Ljava/util/List;Lfg/p;Li0/a1;Li0/a1;I)V

    .line 148
    .line 149
    .line 150
    const v1, -0x78911bb4

    .line 151
    .line 152
    .line 153
    invoke-static {v1, v6, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const/16 v3, 0x30

    .line 158
    .line 159
    const/4 v4, 0x0

    .line 160
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_3
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 165
    .line 166
    .line 167
    :goto_3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 168
    .line 169
    return-object v1

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
