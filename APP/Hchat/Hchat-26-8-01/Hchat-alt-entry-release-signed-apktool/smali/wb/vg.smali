.class public final synthetic Lwb/vg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Ldb/c;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(ILdb/c;Lfg/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/vg;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, Lwb/vg;->h:Lfg/l;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/vg;->i:Ldb/c;

    .line 10
    .line 11
    iput p1, p0, Lwb/vg;->j:I

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(ZLfg/l;Ldb/c;I)V
    .locals 0

    .line 14
    const/4 p1, 0x0

    iput p1, p0, Lwb/vg;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lwb/vg;->h:Lfg/l;

    iput-object p3, p0, Lwb/vg;->i:Ldb/c;

    iput p4, p0, Lwb/vg;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/vg;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v2, v0, Lwb/vg;->i:Ldb/c;

    .line 16
    .line 17
    iget v3, v0, Lwb/vg;->j:I

    .line 18
    .line 19
    invoke-static {v2, v3, v1}, Lwb/ho;->m7(Ldb/c;ILjava/lang/String;)Ldb/c;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, v0, Lwb/vg;->h:Lfg/l;

    .line 24
    .line 25
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :goto_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_0
    move-object/from16 v1, p1

    .line 32
    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const/16 v2, 0xa

    .line 39
    .line 40
    invoke-static {v2, v1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v2, 0x0

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    move v1, v2

    .line 53
    :goto_1
    iget-object v3, v0, Lwb/vg;->i:Ldb/c;

    .line 54
    .line 55
    invoke-static {v3}, Lwb/ho;->T6(Ldb/c;)Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    new-instance v5, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 62
    .line 63
    .line 64
    iget v4, v0, Lwb/vg;->j:I

    .line 65
    .line 66
    if-ltz v4, :cond_8

    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-ge v4, v6, :cond_8

    .line 73
    .line 74
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    check-cast v6, Ldb/a;

    .line 79
    .line 80
    iget v7, v6, Ldb/a;->a:I

    .line 81
    .line 82
    const/4 v8, 0x1

    .line 83
    if-eq v7, v1, :cond_5

    .line 84
    .line 85
    const/4 v9, 0x6

    .line 86
    if-eqz v7, :cond_2

    .line 87
    .line 88
    if-ne v7, v9, :cond_1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_1
    move v10, v2

    .line 92
    goto :goto_3

    .line 93
    :cond_2
    :goto_2
    move v10, v8

    .line 94
    :goto_3
    if-eqz v1, :cond_4

    .line 95
    .line 96
    if-ne v1, v9, :cond_3

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_3
    move v9, v2

    .line 100
    goto :goto_5

    .line 101
    :cond_4
    :goto_4
    move v9, v8

    .line 102
    :goto_5
    if-ne v10, v9, :cond_6

    .line 103
    .line 104
    const/4 v9, 0x7

    .line 105
    if-eq v7, v9, :cond_6

    .line 106
    .line 107
    if-eq v1, v9, :cond_6

    .line 108
    .line 109
    :cond_5
    move v2, v8

    .line 110
    :cond_6
    new-instance v7, Ldb/a;

    .line 111
    .line 112
    if-eqz v2, :cond_7

    .line 113
    .line 114
    iget-object v2, v6, Ldb/a;->b:Ljava/lang/String;

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_7
    const-string v2, ""

    .line 118
    .line 119
    :goto_6
    invoke-direct {v7, v1, v2}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, v4, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    const/16 v26, 0x0

    .line 126
    .line 127
    const v27, 0x37ffff

    .line 128
    .line 129
    .line 130
    const/4 v4, 0x0

    .line 131
    move-object/from16 v24, v5

    .line 132
    .line 133
    const/4 v5, 0x0

    .line 134
    const/4 v6, 0x0

    .line 135
    const/4 v7, 0x0

    .line 136
    const/4 v8, 0x0

    .line 137
    const-wide/16 v9, 0x0

    .line 138
    .line 139
    const/4 v11, 0x0

    .line 140
    const/4 v12, 0x0

    .line 141
    const/4 v13, 0x0

    .line 142
    const/4 v14, 0x0

    .line 143
    const/4 v15, 0x0

    .line 144
    const/16 v16, 0x0

    .line 145
    .line 146
    const-wide/16 v17, 0x0

    .line 147
    .line 148
    const/16 v19, 0x0

    .line 149
    .line 150
    const/16 v20, 0x0

    .line 151
    .line 152
    const/16 v21, 0x0

    .line 153
    .line 154
    const/16 v22, 0x0

    .line 155
    .line 156
    const/16 v23, 0x0

    .line 157
    .line 158
    const/16 v25, 0x0

    .line 159
    .line 160
    invoke-static/range {v3 .. v27}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    :cond_8
    iget-object v1, v0, Lwb/vg;->h:Lfg/l;

    .line 165
    .line 166
    invoke-interface {v1, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
