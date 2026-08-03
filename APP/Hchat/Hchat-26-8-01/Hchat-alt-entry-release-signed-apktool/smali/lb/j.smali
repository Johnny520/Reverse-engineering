.class public final synthetic Llb/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Llb/k;


# direct methods
.method public synthetic constructor <init>(Llb/k;I)V
    .locals 0

    .line 1
    iput p2, p0, Llb/j;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Llb/j;->h:Llb/k;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Llb/j;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llb/j;->h:Llb/k;

    .line 7
    .line 8
    iget-object v0, v0, Llb/k;->e:Llb/i;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_7

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v2, v0, Llb/i;->a:Lr8/g;

    .line 15
    .line 16
    iget-object v3, v0, Llb/i;->b:Lia/t;

    .line 17
    .line 18
    invoke-static {v2, v3}, Lf8/i;->k0(Lr8/g;Lfg/p;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v3, v0, Llb/i;->a:Lr8/g;

    .line 23
    .line 24
    iget-object v4, v0, Llb/i;->b:Lia/t;

    .line 25
    .line 26
    invoke-static {v3, v4}, Lf8/i;->j0(Lr8/g;Lfg/p;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    move v4, v1

    .line 35
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const/4 v6, 0x1

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Ljava/lang/reflect/Method;

    .line 47
    .line 48
    invoke-virtual {v0, v5, v6}, Llb/i;->m(Ljava/lang/reflect/Method;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v1

    .line 58
    goto :goto_3

    .line 59
    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    move v3, v1

    .line 64
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_3

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Ljava/lang/reflect/Method;

    .line 75
    .line 76
    invoke-virtual {v0, v5, v1}, Llb/i;->m(Ljava/lang/reflect/Method;Z)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    add-int/lit8 v3, v3, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    if-lez v4, :cond_4

    .line 86
    .line 87
    if-gtz v3, :cond_5

    .line 88
    .line 89
    :cond_4
    iget-object v2, v0, Llb/i;->b:Lia/t;

    .line 90
    .line 91
    const-string v5, "\u957f\u6309\u590d\u8bfb\u83dc\u5355Hook\u672a\u5b89\u88c5"

    .line 92
    .line 93
    const/4 v7, 0x0

    .line 94
    invoke-virtual {v2, v5, v7}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    :cond_5
    if-lez v4, :cond_6

    .line 98
    .line 99
    if-lez v3, :cond_6

    .line 100
    .line 101
    move v2, v6

    .line 102
    goto :goto_2

    .line 103
    :cond_6
    move v2, v1

    .line 104
    :goto_2
    monitor-exit v0

    .line 105
    if-ne v2, v6, :cond_7

    .line 106
    .line 107
    move v1, v6

    .line 108
    goto :goto_4

    .line 109
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    throw v1

    .line 111
    :cond_7
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0

    .line 116
    :pswitch_0
    iget-object v0, p0, Llb/j;->h:Llb/k;

    .line 117
    .line 118
    iget-object v0, v0, Llb/k;->e:Llb/i;

    .line 119
    .line 120
    const/4 v1, 0x0

    .line 121
    if-eqz v0, :cond_9

    .line 122
    .line 123
    monitor-enter v0

    .line 124
    :try_start_2
    invoke-virtual {v0}, Llb/i;->n()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    invoke-virtual {v0}, Llb/i;->p()Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    invoke-virtual {v0}, Llb/i;->o()Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    invoke-virtual {v0}, Llb/i;->q()Z

    .line 137
    .line 138
    .line 139
    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    const/4 v6, 0x1

    .line 141
    if-eqz v2, :cond_8

    .line 142
    .line 143
    if-eqz v3, :cond_8

    .line 144
    .line 145
    if-eqz v4, :cond_8

    .line 146
    .line 147
    if-eqz v5, :cond_8

    .line 148
    .line 149
    move v2, v6

    .line 150
    goto :goto_5

    .line 151
    :cond_8
    move v2, v1

    .line 152
    :goto_5
    monitor-exit v0

    .line 153
    if-ne v2, v6, :cond_9

    .line 154
    .line 155
    move v1, v6

    .line 156
    goto :goto_6

    .line 157
    :catchall_1
    move-exception v1

    .line 158
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 159
    throw v1

    .line 160
    :cond_9
    :goto_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    return-object v0

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
