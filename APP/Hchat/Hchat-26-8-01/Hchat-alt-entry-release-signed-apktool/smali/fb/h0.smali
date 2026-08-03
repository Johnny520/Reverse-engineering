.class public final synthetic Lfb/h0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lh0/l;ZZ)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lfb/h0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lfb/h0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lfb/h0;->h:Z

    .line 10
    .line 11
    iput-boolean p3, p0, Lfb/h0;->i:Z

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/String;I)V
    .locals 0

    .line 14
    iput p4, p0, Lfb/h0;->g:I

    iput-boolean p1, p0, Lfb/h0;->h:Z

    iput-boolean p2, p0, Lfb/h0;->i:Z

    iput-object p3, p0, Lfb/h0;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lfb/h0;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-boolean v3, p0, Lfb/h0;->i:Z

    .line 6
    .line 7
    iget-boolean v4, p0, Lfb/h0;->h:Z

    .line 8
    .line 9
    iget-object v5, p0, Lfb/h0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v5, Lh0/l;

    .line 15
    .line 16
    check-cast p1, Lf2/y;

    .line 17
    .line 18
    invoke-interface {v5}, Lh0/l;->a()J

    .line 19
    .line 20
    .line 21
    move-result-wide v8

    .line 22
    sget-object v0, Lh0/h0;->c:Lf2/x;

    .line 23
    .line 24
    new-instance v6, Lh0/g0;

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    sget-object v4, Lw/g0;->h:Lw/g0;

    .line 29
    .line 30
    :goto_0
    move-object v7, v4

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    sget-object v4, Lw/g0;->i:Lw/g0;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    if-eqz v3, :cond_1

    .line 36
    .line 37
    sget-object v3, Lh0/f0;->g:Lh0/f0;

    .line 38
    .line 39
    :goto_2
    move-object v10, v3

    .line 40
    goto :goto_3

    .line 41
    :cond_1
    sget-object v3, Lh0/f0;->i:Lh0/f0;

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :goto_3
    const-wide v3, 0x7fffffff7fffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    and-long/2addr v3, v8

    .line 50
    const-wide v11, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    cmp-long v3, v3, v11

    .line 56
    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    move v11, v2

    .line 60
    goto :goto_4

    .line 61
    :cond_2
    move v11, v1

    .line 62
    :goto_4
    invoke-direct/range {v6 .. v11}, Lh0/g0;-><init>(Lw/g0;JLh0/f0;Z)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, v0, v6}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 69
    .line 70
    return-object p1

    .line 71
    :pswitch_0
    check-cast v5, Ljava/lang/String;

    .line 72
    .line 73
    check-cast p1, Lfb/l0;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object p1, p1, Lfb/l0;->a:Ljava/lang/String;

    .line 79
    .line 80
    if-eqz v4, :cond_3

    .line 81
    .line 82
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    :cond_3
    if-eqz v3, :cond_4

    .line 92
    .line 93
    invoke-static {p1, v5, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    goto :goto_5

    .line 98
    :cond_4
    invoke-virtual {p1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    :goto_5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1

    .line 107
    :pswitch_1
    check-cast v5, Ljava/lang/String;

    .line 108
    .line 109
    check-cast p1, Lt7/b;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    sget-object v0, Lfb/n0;->a:Ljava/util/Set;

    .line 115
    .line 116
    invoke-static {p1}, Lfb/n0;->R(Lt7/b;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    new-instance v1, Ldg/n;

    .line 121
    .line 122
    const/4 v6, 0x6

    .line 123
    invoke-direct {v1, v0, v6}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 124
    .line 125
    .line 126
    new-instance v0, Lfb/h0;

    .line 127
    .line 128
    invoke-direct {v0, v4, v3, v5, v2}, Lfb/h0;-><init>(ZZLjava/lang/String;I)V

    .line 129
    .line 130
    .line 131
    new-instance v3, Lng/i;

    .line 132
    .line 133
    invoke-direct {v3, v1, v2, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 134
    .line 135
    .line 136
    new-instance v0, Lb0/d0;

    .line 137
    .line 138
    const/16 v1, 0xe

    .line 139
    .line 140
    invoke-direct {v0, p1, v1}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 141
    .line 142
    .line 143
    invoke-static {v3, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    return-object p1

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
