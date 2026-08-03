.class public final synthetic Lwb/sk;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Lv8/a;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ZLv8/a;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/sk;->g:I

    .line 2
    .line 3
    iput-boolean p1, p0, Lwb/sk;->h:Z

    .line 4
    .line 5
    iput-object p2, p0, Lwb/sk;->i:Lv8/a;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/sk;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/sk;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/sk;->l:Li0/a1;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/sk;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lwb/s0;

    .line 39
    .line 40
    iget-object v3, v3, Lwb/s0;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {v2}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1}, Lwb/ho;->y6(Ljava/lang/String;)Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    iget-boolean v1, v0, Lwb/sk;->h:Z

    .line 55
    .line 56
    iget-object v2, v0, Lwb/sk;->i:Lv8/a;

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    iget-object v1, v2, Lv8/a;->f:Ljava/util/Set;

    .line 61
    .line 62
    invoke-static {v1, v6}, Lwb/ho;->P6(Ljava/util/Set;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    const/16 v16, 0x0

    .line 67
    .line 68
    const/16 v17, 0x3fcf

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    const/4 v4, 0x0

    .line 72
    const/4 v5, 0x0

    .line 73
    const/4 v8, 0x0

    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    const-wide/16 v11, 0x0

    .line 77
    .line 78
    const/4 v13, 0x0

    .line 79
    const/4 v14, 0x0

    .line 80
    const/4 v15, 0x0

    .line 81
    invoke-static/range {v2 .. v17}, Lv8/a;->a(Lv8/a;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;I)Lv8/a;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    const/16 v16, 0x0

    .line 87
    .line 88
    const/16 v17, 0x3fbf

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    const/4 v4, 0x0

    .line 92
    const/4 v5, 0x0

    .line 93
    move-object v8, v6

    .line 94
    const/4 v6, 0x0

    .line 95
    const/4 v7, 0x0

    .line 96
    const/4 v9, 0x0

    .line 97
    const/4 v10, 0x0

    .line 98
    const-wide/16 v11, 0x0

    .line 99
    .line 100
    const/4 v13, 0x0

    .line 101
    const/4 v14, 0x0

    .line 102
    const/4 v15, 0x0

    .line 103
    invoke-static/range {v2 .. v17}, Lv8/a;->a(Lv8/a;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;I)Lv8/a;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    :goto_1
    iget-object v2, v0, Lwb/sk;->j:Li0/a1;

    .line 108
    .line 109
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    const/4 v1, 0x0

    .line 113
    iget-object v2, v0, Lwb/sk;->k:Li0/a1;

    .line 114
    .line 115
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object v1, Lwb/g;->i:Lwb/g;

    .line 119
    .line 120
    iget-object v2, v0, Lwb/sk;->l:Li0/a1;

    .line 121
    .line 122
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 126
    .line 127
    return-object v1

    .line 128
    :pswitch_0
    move-object/from16 v1, p1

    .line 129
    .line 130
    check-cast v1, Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-static {v1}, Lwb/ho;->y6(Ljava/lang/String;)Ljava/util/Set;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    iget-boolean v1, v0, Lwb/sk;->h:Z

    .line 140
    .line 141
    iget-object v2, v0, Lwb/sk;->i:Lv8/a;

    .line 142
    .line 143
    if-eqz v1, :cond_2

    .line 144
    .line 145
    iget-object v1, v2, Lv8/a;->f:Ljava/util/Set;

    .line 146
    .line 147
    invoke-static {v1, v6}, Lwb/ho;->P6(Ljava/util/Set;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    const/16 v16, 0x0

    .line 152
    .line 153
    const/16 v17, 0x3fcf

    .line 154
    .line 155
    const/4 v3, 0x0

    .line 156
    const/4 v4, 0x0

    .line 157
    const/4 v5, 0x0

    .line 158
    const/4 v8, 0x0

    .line 159
    const/4 v9, 0x0

    .line 160
    const/4 v10, 0x0

    .line 161
    const-wide/16 v11, 0x0

    .line 162
    .line 163
    const/4 v13, 0x0

    .line 164
    const/4 v14, 0x0

    .line 165
    const/4 v15, 0x0

    .line 166
    invoke-static/range {v2 .. v17}, Lv8/a;->a(Lv8/a;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;I)Lv8/a;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    goto :goto_3

    .line 171
    :cond_2
    const/16 v16, 0x0

    .line 172
    .line 173
    const/16 v17, 0x3fbf

    .line 174
    .line 175
    const/4 v3, 0x0

    .line 176
    const/4 v4, 0x0

    .line 177
    const/4 v5, 0x0

    .line 178
    move-object v8, v6

    .line 179
    const/4 v6, 0x0

    .line 180
    const/4 v7, 0x0

    .line 181
    const/4 v9, 0x0

    .line 182
    const/4 v10, 0x0

    .line 183
    const-wide/16 v11, 0x0

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const/4 v14, 0x0

    .line 187
    const/4 v15, 0x0

    .line 188
    invoke-static/range {v2 .. v17}, Lv8/a;->a(Lv8/a;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;I)Lv8/a;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    :goto_3
    iget-object v2, v0, Lwb/sk;->j:Li0/a1;

    .line 193
    .line 194
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    const/4 v1, 0x0

    .line 198
    iget-object v2, v0, Lwb/sk;->k:Li0/a1;

    .line 199
    .line 200
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    sget-object v1, Lwb/g;->i:Lwb/g;

    .line 204
    .line 205
    iget-object v2, v0, Lwb/sk;->l:Li0/a1;

    .line 206
    .line 207
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    goto :goto_2

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
