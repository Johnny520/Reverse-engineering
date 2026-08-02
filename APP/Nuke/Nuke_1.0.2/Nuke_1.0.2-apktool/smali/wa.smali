.class public final synthetic Lwa;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lxm0;ZLd9;Lcl;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwa;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwa;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lwa;->i:Z

    .line 10
    .line 11
    iput-object p3, p0, Lwa;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lwa;->l:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(ZLgu2;Lgu2;Lgu2;)V
    .locals 1

    .line 16
    const/4 v0, 0x1

    iput v0, p0, Lwa;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lwa;->i:Z

    iput-object p2, p0, Lwa;->j:Ljava/lang/Object;

    iput-object p3, p0, Lwa;->k:Ljava/lang/Object;

    iput-object p4, p0, Lwa;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwa;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    iget-object v3, p0, Lwa;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lwa;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, Lwa;->j:Ljava/lang/Object;

    .line 12
    .line 13
    iget-boolean p0, p0, Lwa;->i:Z

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v5, Lgu2;

    .line 19
    .line 20
    check-cast v4, Lgu2;

    .line 21
    .line 22
    check-cast v3, Lgu2;

    .line 23
    .line 24
    check-cast p1, Lca2;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-virtual {p1, v0}, Lca2;->c(F)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v4}, Lgu2;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p1, v0}, Lca2;->k(F)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v3}, Lgu2;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p1, v0}, Lca2;->l(F)V

    .line 66
    .line 67
    .line 68
    if-eqz p0, :cond_0

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const/4 v2, 0x0

    .line 72
    :goto_0
    const p0, 0x3f51eb85    # 0.82f

    .line 73
    .line 74
    .line 75
    invoke-static {p0, v2}, Lrb3;->a(FF)J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    invoke-virtual {p1, v2, v3}, Lca2;->r(J)V

    .line 80
    .line 81
    .line 82
    return-object v1

    .line 83
    :pswitch_0
    check-cast v5, Lxm0;

    .line 84
    .line 85
    check-cast v4, Ld9;

    .line 86
    .line 87
    check-cast v3, Lcl;

    .line 88
    .line 89
    check-cast p1, Lt61;

    .line 90
    .line 91
    invoke-virtual {p1}, Lt61;->a()V

    .line 92
    .line 93
    .line 94
    iget-object p1, p1, Lt61;->h:Lsp;

    .line 95
    .line 96
    invoke-interface {v5}, Lxm0;->a()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_1
    if-eqz p0, :cond_2

    .line 110
    .line 111
    invoke-interface {p1}, Lnc0;->a0()J

    .line 112
    .line 113
    .line 114
    move-result-wide v5

    .line 115
    iget-object p0, p1, Lsp;->i:Lb5;

    .line 116
    .line 117
    invoke-virtual {p0}, Lb5;->u()J

    .line 118
    .line 119
    .line 120
    move-result-wide v7

    .line 121
    invoke-virtual {p0}, Lb5;->q()Lqp;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-interface {v0}, Lqp;->l()V

    .line 126
    .line 127
    .line 128
    :try_start_0
    iget-object v0, p0, Lb5;->i:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Ln4;

    .line 131
    .line 132
    const/high16 v9, -0x40800000    # -1.0f

    .line 133
    .line 134
    invoke-virtual {v0, v9, v2, v5, v6}, Ln4;->A(FFJ)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v4, v3}, Lsp;->e(Ld9;Lcl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    .line 139
    .line 140
    invoke-static {p0, v7, v8}, Lvi0;->r(Lb5;J)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :catchall_0
    move-exception p1

    .line 145
    invoke-static {p0, v7, v8}, Lvi0;->r(Lb5;J)V

    .line 146
    .line 147
    .line 148
    throw p1

    .line 149
    :cond_2
    invoke-virtual {p1, v4, v3}, Lsp;->e(Ld9;Lcl;)V

    .line 150
    .line 151
    .line 152
    :goto_1
    return-object v1

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
