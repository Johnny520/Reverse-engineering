.class public Ld;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lyr;
.implements Lhu;
.implements La51;
.implements Lyc;
.implements Lqm0;
.implements Lqx0;


# instance fields
.field public final synthetic d:I

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, Ld;->d:I

    .line 2
    .line 3
    const/16 v0, 0x10

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lf1;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lf1;-><init>(Ld;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Ld;->e:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lsh0;

    .line 23
    .line 24
    new-array v0, v0, [Ljava/lang/ref/Reference;

    .line 25
    .line 26
    invoke-direct {p1, v0}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ld;->e:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Ld;->f:Ljava/lang/Object;

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance p1, Ljo0;

    .line 43
    .line 44
    const/16 v1, 0x15

    .line 45
    .line 46
    invoke-direct {p1, v1}, Ljo0;-><init>(I)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Ld;->e:Ljava/lang/Object;

    .line 50
    .line 51
    new-instance p1, Lfc0;

    .line 52
    .line 53
    invoke-direct {p1, v0}, Lfc0;-><init>(I)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Ld;->f:Ljava/lang/Object;

    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Ld;->e:Ljava/lang/Object;

    .line 68
    .line 69
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 70
    .line 71
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Ld;->f:Ljava/lang/Object;

    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    .line 79
    .line 80
    new-instance p1, Lsh0;

    .line 81
    .line 82
    new-array v0, v0, [Lb60;

    .line 83
    .line 84
    invoke-direct {p1, v0}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Ld;->e:Ljava/lang/Object;

    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    .line 92
    .line 93
    new-instance p1, Ljh0;

    .line 94
    .line 95
    invoke-direct {p1}, Ljh0;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, Ld;->e:Ljava/lang/Object;

    .line 99
    .line 100
    new-instance p1, Ljh0;

    .line 101
    .line 102
    invoke-direct {p1}, Ljh0;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object p1, p0, Ld;->f:Ljava/lang/Object;

    .line 106
    .line 107
    return-void

    .line 108
    :pswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-static {p1}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iput-object p1, p0, Ld;->e:Ljava/lang/Object;

    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    new-instance p1, Ltb1;

    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    invoke-direct {p1, v0}, Ltb1;-><init>(I)V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, Ld;->e:Ljava/lang/Object;

    .line 130
    .line 131
    new-instance p1, Ltb1;

    .line 132
    .line 133
    invoke-direct {p1, v0}, Ltb1;-><init>(I)V

    .line 134
    .line 135
    .line 136
    iput-object p1, p0, Ld;->f:Ljava/lang/Object;

    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 149
    iput p1, p0, Ld;->d:I

    iput-object p2, p0, Ld;->e:Ljava/lang/Object;

    iput-object p3, p0, Ld;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/view/Window;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, Ld;->d:I

    .line 162
    invoke-virtual {p1}, Landroid/view/Window;->getInsetsController()Landroid/view/WindowInsetsController;

    move-result-object v0

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 164
    iput-object v0, p0, Ld;->e:Ljava/lang/Object;

    .line 165
    iput-object p1, p0, Ld;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation$Bounds;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, Ld;->d:I

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 158
    invoke-virtual {p1}, Landroid/view/WindowInsetsAnimation$Bounds;->getLowerBound()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Li20;->b(Landroid/graphics/Insets;)Li20;

    move-result-object v0

    .line 159
    iput-object v0, p0, Ld;->e:Ljava/lang/Object;

    .line 160
    invoke-virtual {p1}, Landroid/view/WindowInsetsAnimation$Bounds;->getUpperBound()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Li20;->b(Landroid/graphics/Insets;)Li20;

    move-result-object p1

    .line 161
    iput-object p1, p0, Ld;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb60;Lxd0;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Ld;->d:I

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld;->e:Ljava/lang/Object;

    .line 144
    invoke-static {p2}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    move-result-object p1

    iput-object p1, p0, Ld;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lc4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld;->d:I

    .line 167
    iput-object p1, p0, Ld;->f:Ljava/lang/Object;

    invoke-direct {p0, v0}, Ld;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Ld;->d:I

    .line 154
    invoke-direct {p0, v0}, Ld;-><init>(I)V

    .line 155
    invoke-static {p1}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    move-result-object v0

    iput-object v0, p0, Ld;->f:Ljava/lang/Object;

    .line 156
    invoke-static {p1}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    return-void
.end method

.method public constructor <init>(Ln70;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Ld;->d:I

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld;->e:Ljava/lang/Object;

    .line 151
    sget-object p1, Ljk0;->a:Lch0;

    .line 152
    new-instance p1, Lch0;

    invoke-direct {p1}, Lch0;-><init>()V

    .line 153
    iput-object p1, p0, Ld;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ld;->d:I

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp9;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Ld;->d:I

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld;->e:Ljava/lang/Object;

    .line 146
    new-instance p1, Lg9;

    const/4 v0, 0x0

    .line 147
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 148
    iput-object p1, p0, Ld;->f:Ljava/lang/Object;

    return-void
.end method

.method public static l(Lb60;)V
    .locals 10

    .line 1
    iget v0, p0, Lb60;->Q:I

    .line 2
    .line 3
    if-lez v0, :cond_b

    .line 4
    .line 5
    iget-object v0, p0, Lb60;->J:Lf60;

    .line 6
    .line 7
    iget-object v0, v0, Lf60;->d:Lx50;

    .line 8
    .line 9
    sget-object v1, Lx50;->h:Lx50;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_a

    .line 13
    .line 14
    invoke-virtual {p0}, Lb60;->p()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_a

    .line 19
    .line 20
    invoke-virtual {p0}, Lb60;->r()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_a

    .line 25
    .line 26
    iget-boolean v0, p0, Lb60;->R:Z

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto/16 :goto_5

    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0}, Lb60;->I()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, Lb60;->I:Lmj0;

    .line 41
    .line 42
    iget-object v0, v0, Lmj0;->f:Loe0;

    .line 43
    .line 44
    iget v1, v0, Loe0;->g:I

    .line 45
    .line 46
    const/16 v3, 0x100

    .line 47
    .line 48
    and-int/2addr v1, v3

    .line 49
    if-eqz v1, :cond_a

    .line 50
    .line 51
    :goto_0
    if-eqz v0, :cond_a

    .line 52
    .line 53
    iget v1, v0, Loe0;->f:I

    .line 54
    .line 55
    and-int/2addr v1, v3

    .line 56
    if-eqz v1, :cond_9

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    move-object v4, v0

    .line 60
    move-object v5, v1

    .line 61
    :goto_1
    if-eqz v4, :cond_9

    .line 62
    .line 63
    instance-of v6, v4, Lnx;

    .line 64
    .line 65
    if-eqz v6, :cond_2

    .line 66
    .line 67
    check-cast v4, Lnx;

    .line 68
    .line 69
    invoke-static {v4, v3}, Lpf1;->O(Lrm;I)Lqj0;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-interface {v4, v6}, Lnx;->n(Lqj0;)V

    .line 74
    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_2
    iget v6, v4, Loe0;->f:I

    .line 78
    .line 79
    and-int/2addr v6, v3

    .line 80
    if-eqz v6, :cond_8

    .line 81
    .line 82
    instance-of v6, v4, Lsm;

    .line 83
    .line 84
    if-eqz v6, :cond_8

    .line 85
    .line 86
    move-object v6, v4

    .line 87
    check-cast v6, Lsm;

    .line 88
    .line 89
    iget-object v6, v6, Lsm;->s:Loe0;

    .line 90
    .line 91
    move v7, v2

    .line 92
    :goto_2
    const/4 v8, 0x1

    .line 93
    if-eqz v6, :cond_7

    .line 94
    .line 95
    iget v9, v6, Loe0;->f:I

    .line 96
    .line 97
    and-int/2addr v9, v3

    .line 98
    if-eqz v9, :cond_6

    .line 99
    .line 100
    add-int/lit8 v7, v7, 0x1

    .line 101
    .line 102
    if-ne v7, v8, :cond_3

    .line 103
    .line 104
    move-object v4, v6

    .line 105
    goto :goto_3

    .line 106
    :cond_3
    if-nez v5, :cond_4

    .line 107
    .line 108
    new-instance v5, Lsh0;

    .line 109
    .line 110
    const/16 v8, 0x10

    .line 111
    .line 112
    new-array v8, v8, [Loe0;

    .line 113
    .line 114
    invoke-direct {v5, v8}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_4
    if-eqz v4, :cond_5

    .line 118
    .line 119
    invoke-virtual {v5, v4}, Lsh0;->b(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    move-object v4, v1

    .line 123
    :cond_5
    invoke-virtual {v5, v6}, Lsh0;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    :goto_3
    iget-object v6, v6, Loe0;->i:Loe0;

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    if-ne v7, v8, :cond_8

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_8
    :goto_4
    invoke-static {v5}, Lpf1;->f(Lsh0;)Loe0;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    goto :goto_1

    .line 137
    :cond_9
    iget v1, v0, Loe0;->g:I

    .line 138
    .line 139
    and-int/2addr v1, v3

    .line 140
    if-eqz v1, :cond_a

    .line 141
    .line 142
    iget-object v0, v0, Loe0;->i:Loe0;

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_a
    :goto_5
    iput-boolean v2, p0, Lb60;->P:Z

    .line 146
    .line 147
    invoke-virtual {p0}, Lb60;->z()Lsh0;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    iget-object v0, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 152
    .line 153
    iget p0, p0, Lsh0;->f:I

    .line 154
    .line 155
    :goto_6
    if-ge v2, p0, :cond_b

    .line 156
    .line 157
    aget-object v1, v0, v2

    .line 158
    .line 159
    check-cast v1, Lb60;

    .line 160
    .line 161
    invoke-static {v1}, Ld;->l(Lb60;)V

    .line 162
    .line 163
    .line 164
    add-int/lit8 v2, v2, 0x1

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_b
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ld;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lpa1;

    .line 4
    .line 5
    return-object p0
.end method

.method public b(Liu;Lik;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ld;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    sget-object v2, Lzk;->d:Lzk;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ld;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lhu;

    .line 13
    .line 14
    new-instance v3, Luo;

    .line 15
    .line 16
    iget-object p0, p0, Ld;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lld0;

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    invoke-direct {v3, v4, p1, p0}, Luo;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v3, p2}, Lhu;->b(Liu;Lik;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-ne p0, v2, :cond_0

    .line 29
    .line 30
    move-object v1, p0

    .line 31
    :cond_0
    return-object v1

    .line 32
    :pswitch_0
    new-instance v0, Lvt0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iget-object v3, p0, Ld;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Ltd;

    .line 40
    .line 41
    new-instance v4, Lj7;

    .line 42
    .line 43
    iget-object p0, p0, Ld;->f:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Lkt0;

    .line 46
    .line 47
    const/4 v5, 0x1

    .line 48
    invoke-direct {v4, v0, p1, p0, v5}, Lj7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v4, p2}, Lod;->b(Liu;Lik;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-ne p0, v2, :cond_1

    .line 56
    .line 57
    move-object v1, p0

    .line 58
    :cond_1
    return-object v1

    .line 59
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Ld;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg9;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Ld;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lp9;

    .line 15
    .line 16
    invoke-virtual {p0}, Lp9;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public d(Lz41;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ld;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lch0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lch0;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p1, Lz41;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Leh0;

    .line 11
    .line 12
    iget-object v2, v1, Leh0;->b:[Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v3, v1, Leh0;->c:[J

    .line 15
    .line 16
    iget v1, v1, Leh0;->e:I

    .line 17
    .line 18
    :goto_0
    const v4, 0x7fffffff

    .line 19
    .line 20
    .line 21
    if-eq v1, v4, :cond_2

    .line 22
    .line 23
    aget-wide v4, v3, v1

    .line 24
    .line 25
    const/16 v6, 0x1f

    .line 26
    .line 27
    shr-long/2addr v4, v6

    .line 28
    const-wide/32 v6, 0x7fffffff

    .line 29
    .line 30
    .line 31
    and-long/2addr v4, v6

    .line 32
    long-to-int v4, v4

    .line 33
    aget-object v1, v2, v1

    .line 34
    .line 35
    iget-object v5, p0, Ld;->e:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Ln70;

    .line 38
    .line 39
    invoke-virtual {v5, v1}, Ln70;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v0, v5}, Lch0;->d(Ljava/lang/Object;)I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-ltz v6, :cond_0

    .line 48
    .line 49
    iget-object v7, v0, Lch0;->c:[I

    .line 50
    .line 51
    aget v6, v7, v6

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    const/4 v6, 0x0

    .line 55
    :goto_1
    const/4 v7, 0x7

    .line 56
    if-ne v6, v7, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Lz41;->remove(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 63
    .line 64
    invoke-virtual {v0, v6, v5}, Lch0;->g(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    move v1, v4

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    return-void
.end method

.method public e(Ljava/lang/Integer;)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Ld;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqm0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Lqm0;->e(Ljava/lang/Integer;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object p0, p0, Ld;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lz11;

    .line 13
    .line 14
    iget v1, p0, Lz11;->v:I

    .line 15
    .line 16
    if-gez v1, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    iget-object v2, p0, Lz11;->b:[I

    .line 20
    .line 21
    invoke-virtual {p0, v2, v1}, Lz11;->E([II)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {p0, p1, v1, v2}, Lp30;->p(Lz11;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0, v0}, Lye;->S(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ld;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsw;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public g(Ljava/lang/CharSequence;IILy91;)Z
    .locals 3

    .line 1
    iget v0, p4, Ly91;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Ld;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lpa1;

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    new-instance v0, Lpa1;

    .line 16
    .line 17
    instance-of v2, p1, Landroid/text/Spannable;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    check-cast p1, Landroid/text/Spannable;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    new-instance v2, Landroid/text/SpannableString;

    .line 25
    .line 26
    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v2

    .line 30
    :goto_0
    invoke-direct {v0, p1}, Lpa1;-><init>(Landroid/text/Spannable;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Ld;->e:Ljava/lang/Object;

    .line 34
    .line 35
    :cond_2
    iget-object p1, p0, Ld;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lr3;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance p1, Lz91;

    .line 43
    .line 44
    invoke-direct {p1, p4}, Lz91;-><init>(Ly91;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Ld;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Lpa1;

    .line 50
    .line 51
    const/16 p4, 0x21

    .line 52
    .line 53
    invoke-virtual {p0, p1, p2, p3, p4}, Lpa1;->setSpan(Ljava/lang/Object;III)V

    .line 54
    .line 55
    .line 56
    return v1
.end method

.method public h(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ld;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ln70;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ln70;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p2}, Ln70;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p1, p0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public i(Lvw0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ld;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lww;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public j(J)Z
    .locals 6

    .line 1
    iget-object p0, p0, Ld;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ld;

    .line 4
    .line 5
    iget-object p0, p0, Ld;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    if-ge v2, v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    move-object v4, v3

    .line 22
    check-cast v4, Lpr0;

    .line 23
    .line 24
    iget-wide v4, v4, Lpr0;->a:J

    .line 25
    .line 26
    invoke-static {v4, v5, p1, p2}, Lz60;->s(JJ)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v3, 0x0

    .line 37
    :goto_1
    check-cast v3, Lpr0;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    iget-boolean p0, v3, Lpr0;->h:Z

    .line 42
    .line 43
    return p0

    .line 44
    :cond_2
    return v1
.end method

.method public k(I)Le1;
    .locals 47

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 1
    iget-object v0, v0, Ld;->f:Ljava/lang/Object;

    check-cast v0, Lc4;

    iget-object v2, v0, Lc4;->j:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    iget-object v3, v0, Lc4;->g:Lw3;

    .line 3
    invoke-virtual {v3}, Lw3;->getViewTreeOwners()Lk3;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 4
    iget-object v4, v4, Lk3;->a:Lx90;

    .line 5
    invoke-interface {v4}, Lx90;->getLifecycle()Ls90;

    move-result-object v4

    if-eqz v4, :cond_0

    check-cast v4, Lz90;

    .line 6
    iget-object v4, v4, Lz90;->c:Lr90;

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 7
    :goto_0
    sget-object v6, Lr90;->d:Lr90;

    if-ne v4, v6, :cond_2

    .line 8
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_1

    .line 9
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    .line 10
    new-instance v5, Le1;

    invoke-direct {v5, v2}, Le1;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    move-object v7, v0

    move v4, v1

    goto/16 :goto_52

    .line 11
    :cond_2
    invoke-virtual {v0}, Lc4;->k()Lu20;

    move-result-object v4

    invoke-virtual {v4, v1}, Lu20;->b(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzz0;

    if-nez v4, :cond_3

    .line 12
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_1

    .line 13
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    .line 14
    new-instance v5, Le1;

    invoke-direct {v5, v2}, Le1;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    goto :goto_1

    .line 15
    :cond_3
    iget-object v6, v4, Lzz0;->a:Lxz0;

    .line 16
    invoke-virtual {v6}, Lxz0;->k()Lsz0;

    move-result-object v7

    iget-object v8, v6, Lxz0;->c:Lb60;

    sget-object v9, Lb01;->n:Le01;

    .line 17
    iget-object v7, v7, Lsz0;->d:Ljh0;

    .line 18
    invoke-virtual {v7, v9}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    const/4 v7, 0x0

    .line 19
    :cond_4
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v7, v9}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const/16 v9, 0x22

    if-eqz v7, :cond_6

    .line 20
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v11, v9, :cond_5

    .line 21
    invoke-static {v2}, Ls0;->e(Landroid/view/accessibility/AccessibilityManager;)Z

    move-result v11

    goto :goto_2

    :cond_5
    const/4 v11, 0x1

    :goto_2
    if-nez v11, :cond_6

    move-object v7, v0

    move v4, v1

    const/4 v5, 0x0

    goto/16 :goto_52

    .line 22
    :cond_6
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v11

    .line 23
    new-instance v12, Le1;

    invoke-direct {v12, v11}, Le1;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 24
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v14, 0x0

    if-lt v13, v9, :cond_8

    .line 25
    invoke-static {v11, v7}, Ls0;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    :cond_7
    const/16 p0, 0x0

    goto :goto_4

    .line 26
    :cond_8
    invoke-virtual {v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v15

    if-eqz v15, :cond_7

    const/16 p0, 0x0

    .line 27
    const-string v5, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"

    invoke-virtual {v15, v5, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v16

    and-int/lit8 v16, v16, -0x41

    if-eqz v7, :cond_9

    const/16 v7, 0x40

    goto :goto_3

    :cond_9
    move v7, v14

    :goto_3
    or-int v7, v16, v7

    .line 28
    invoke-virtual {v15, v5, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :goto_4
    const/4 v5, -0x1

    if-ne v1, v5, :cond_b

    .line 29
    invoke-virtual {v3}, Landroid/view/View;->getParentForAccessibility()Landroid/view/ViewParent;

    move-result-object v7

    instance-of v15, v7, Landroid/view/View;

    if-eqz v15, :cond_a

    check-cast v7, Landroid/view/View;

    goto :goto_5

    :cond_a
    move-object/from16 v7, p0

    .line 30
    :goto_5
    iput v5, v12, Le1;->b:I

    .line 31
    invoke-virtual {v11, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    goto :goto_7

    .line 32
    :cond_b
    invoke-virtual {v6}, Lxz0;->l()Lxz0;

    move-result-object v7

    if-eqz v7, :cond_c

    .line 33
    iget v7, v7, Lxz0;->g:I

    .line 34
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_6

    :cond_c
    move-object/from16 v7, p0

    :goto_6
    if-eqz v7, :cond_b5

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    .line 35
    invoke-virtual {v3}, Lw3;->getSemanticsOwner()La01;

    move-result-object v15

    invoke-virtual {v15}, La01;->a()Lxz0;

    move-result-object v15

    .line 36
    iget v15, v15, Lxz0;->g:I

    if-ne v7, v15, :cond_d

    move v7, v5

    .line 37
    :cond_d
    iput v7, v12, Le1;->b:I

    .line 38
    invoke-virtual {v11, v3, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    .line 39
    :goto_7
    iput v1, v12, Le1;->c:I

    .line 40
    invoke-virtual {v11, v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    .line 41
    invoke-virtual {v0, v4}, Lc4;->c(Lzz0;)Landroid/graphics/Rect;

    move-result-object v4

    .line 42
    invoke-virtual {v11, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 43
    iget-object v4, v0, Lc4;->N:Lsg0;

    iget-object v7, v0, Lc4;->w:Ll31;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    .line 44
    const-string v14, "android.view.View"

    invoke-virtual {v12, v14}, Le1;->f(Ljava/lang/String;)V

    .line 45
    iget-object v14, v6, Lxz0;->d:Lsz0;

    iget-object v10, v14, Lsz0;->d:Ljh0;

    .line 46
    sget-object v5, Lb01;->E:Le01;

    .line 47
    invoke-virtual {v10, v5}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    .line 48
    const-string v5, "android.widget.EditText"

    invoke-virtual {v12, v5}, Le1;->f(Ljava/lang/String;)V

    .line 49
    :cond_e
    sget-object v5, Lb01;->A:Le01;

    .line 50
    invoke-virtual {v10, v5}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    .line 51
    const-string v5, "android.widget.TextView"

    invoke-virtual {v12, v5}, Le1;->f(Ljava/lang/String;)V

    .line 52
    :cond_f
    sget-object v5, Lb01;->x:Le01;

    .line 53
    invoke-virtual {v10, v5}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_10

    move-object/from16 v5, p0

    .line 54
    :cond_10
    check-cast v5, Lxv0;

    if-eqz v5, :cond_15

    .line 55
    iget v9, v5, Lxv0;->a:I

    move-object/from16 v21, v2

    .line 56
    iget-boolean v2, v6, Lxz0;->e:Z

    if-nez v2, :cond_11

    const/4 v2, 0x4

    .line 57
    invoke-static {v2, v6}, Lxz0;->j(ILxz0;)Ljava/util/List;

    move-result-object v20

    .line 58
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->isEmpty()Z

    move-result v20

    move-object/from16 v22, v7

    if-eqz v20, :cond_16

    goto :goto_8

    :cond_11
    const/4 v2, 0x4

    move-object/from16 v22, v7

    .line 59
    :goto_8
    const-string v7, "AccessibilityNodeInfo.roleDescription"

    if-ne v9, v2, :cond_12

    const v2, 0x7f0a005f

    .line 60
    invoke-virtual {v15, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 61
    invoke-virtual {v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v9, v7, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto :goto_9

    :cond_12
    const/4 v2, 0x2

    if-ne v9, v2, :cond_13

    const v2, 0x7f0a005e

    .line 62
    invoke-virtual {v15, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 63
    invoke-virtual {v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v9, v7, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto :goto_9

    .line 64
    :cond_13
    invoke-static {v9}, Lu50;->D(I)Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x5

    if-ne v9, v7, :cond_14

    .line 65
    invoke-virtual {v6}, Lxz0;->n()Z

    move-result v7

    if-nez v7, :cond_14

    .line 66
    iget-boolean v7, v14, Lsz0;->f:Z

    if-eqz v7, :cond_16

    .line 67
    :cond_14
    invoke-virtual {v12, v2}, Le1;->f(Ljava/lang/String;)V

    goto :goto_9

    :cond_15
    move-object/from16 v21, v2

    move-object/from16 v22, v7

    .line 68
    :cond_16
    :goto_9
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 69
    invoke-virtual {v11, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 70
    invoke-static {v6}, Li4;->v(Lxz0;)Z

    move-result v2

    .line 71
    invoke-virtual {v11, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setImportantForAccessibility(Z)V

    const/16 v2, 0x22

    if-lt v13, v2, :cond_17

    .line 72
    invoke-static/range {v21 .. v21}, Ls0;->e(Landroid/view/accessibility/AccessibilityManager;)Z

    move-result v2

    :goto_a
    const/4 v7, 0x4

    goto :goto_b

    :cond_17
    const/4 v2, 0x1

    goto :goto_a

    .line 73
    :goto_b
    invoke-static {v7, v6}, Lxz0;->j(ILxz0;)Ljava/util/List;

    move-result-object v9

    .line 74
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v7

    move/from16 v18, v2

    const/4 v2, 0x0

    const/4 v13, 0x0

    :goto_c
    if-ge v13, v7, :cond_1f

    .line 75
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v21

    move/from16 v23, v7

    .line 76
    move-object/from16 v7, v21

    check-cast v7, Lxz0;

    move-object/from16 v21, v9

    .line 77
    invoke-virtual {v0}, Lc4;->k()Lu20;

    move-result-object v9

    move/from16 v24, v13

    .line 78
    iget v13, v7, Lxz0;->g:I

    .line 79
    invoke-virtual {v9, v13}, Lu20;->a(I)Z

    move-result v9

    if-eqz v9, :cond_1e

    .line 80
    invoke-virtual {v3}, Lw3;->getAndroidViewsHandler$ui()Lw6;

    move-result-object v9

    invoke-virtual {v9}, Lw6;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v9

    .line 81
    iget-object v7, v7, Lxz0;->c:Lb60;

    .line 82
    invoke-virtual {v9, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_1d

    const/4 v7, -0x1

    if-ne v13, v7, :cond_18

    goto :goto_e

    .line 83
    :cond_18
    invoke-virtual {v0}, Lc4;->k()Lu20;

    move-result-object v7

    invoke-virtual {v7, v13}, Lu20;->b(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lzz0;

    if-eqz v7, :cond_1a

    .line 84
    iget-object v7, v7, Lzz0;->a:Lxz0;

    if-eqz v7, :cond_1a

    .line 85
    invoke-virtual {v7}, Lxz0;->k()Lsz0;

    move-result-object v7

    .line 86
    sget-object v9, Lb01;->n:Le01;

    .line 87
    iget-object v7, v7, Lsz0;->d:Ljh0;

    .line 88
    invoke-virtual {v7, v9}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_19

    move-object/from16 v7, p0

    .line 89
    :cond_19
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 90
    invoke-static {v7, v9}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    goto :goto_d

    :cond_1a
    const/4 v7, 0x0

    :goto_d
    if-nez v18, :cond_1b

    if-nez v7, :cond_1c

    .line 91
    :cond_1b
    invoke-virtual {v11, v3, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 92
    :cond_1c
    invoke-virtual {v4, v13, v2}, Lsg0;->f(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    .line 93
    :cond_1d
    invoke-static {}, Lxc;->d()V

    return-object p0

    :cond_1e
    :goto_e
    add-int/lit8 v13, v24, 0x1

    move-object/from16 v9, v21

    move/from16 v7, v23

    goto :goto_c

    .line 94
    :cond_1f
    iget v2, v0, Lc4;->o:I

    iget-object v7, v12, Le1;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-ne v1, v2, :cond_20

    const/4 v2, 0x1

    .line 95
    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 96
    sget-object v2, La1;->d:La1;

    invoke-virtual {v12, v2}, Le1;->a(La1;)V

    goto :goto_f

    :cond_20
    const/4 v2, 0x0

    .line 97
    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 98
    sget-object v2, La1;->c:La1;

    invoke-virtual {v12, v2}, Le1;->a(La1;)V

    .line 99
    :goto_f
    invoke-static {v6}, Lrd0;->x(Lxz0;)Lf8;

    move-result-object v2

    if-eqz v2, :cond_43

    .line 100
    invoke-virtual {v3}, Lw3;->getFontFamilyResolver()Ljv;

    .line 101
    invoke-virtual {v3}, Lw3;->getDensity()Lym;

    move-result-object v26

    .line 102
    iget-object v13, v0, Lc4;->J:Lo8;

    .line 103
    new-instance v9, Landroid/text/SpannableString;

    move-object/from16 v21, v3

    .line 104
    iget-object v3, v2, Lf8;->e:Ljava/lang/String;

    move-object/from16 v29, v8

    iget-object v8, v2, Lf8;->d:Ljava/util/List;

    .line 105
    invoke-direct {v9, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 106
    iget-object v2, v2, Lf8;->f:Ljava/util/ArrayList;

    move-object/from16 v30, v3

    if-eqz v2, :cond_31

    .line 107
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    move-object/from16 v31, v12

    const/4 v12, 0x0

    :goto_10
    if-ge v12, v3, :cond_30

    .line 108
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v23

    move-object/from16 v32, v2

    .line 109
    move-object/from16 v2, v23

    check-cast v2, Le8;

    move/from16 v33, v3

    .line 110
    iget-object v3, v2, Le8;->a:Ljava/lang/Object;

    .line 111
    check-cast v3, Lj31;

    move/from16 v34, v12

    .line 112
    iget v12, v2, Le8;->b:I

    .line 113
    iget v2, v2, Le8;->c:I

    move-object/from16 v35, v0

    .line 114
    iget-object v0, v3, Lj31;->a:Lx61;

    .line 115
    invoke-interface {v0}, Lx61;->a()J

    move-result-wide v0

    move-object/from16 v36, v4

    move-object/from16 v37, v5

    .line 116
    iget-wide v4, v3, Lj31;->b:J

    move-wide/from16 v24, v4

    .line 117
    iget-object v4, v3, Lj31;->c:Lzv;

    .line 118
    iget-object v5, v3, Lj31;->d:Lxv;

    move-object/from16 v38, v4

    .line 119
    iget-object v4, v3, Lj31;->j:Ly61;

    move-object/from16 v39, v14

    .line 120
    iget-object v14, v3, Lj31;->k:Lfb0;

    move-object/from16 v41, v10

    move-object/from16 v40, v11

    .line 121
    iget-wide v10, v3, Lj31;->l:J

    move-wide/from16 v42, v10

    .line 122
    iget-object v10, v3, Lj31;->m:Lu61;

    .line 123
    iget-object v3, v3, Lj31;->a:Lx61;

    move-object v11, v6

    move-object/from16 v44, v7

    .line 124
    invoke-interface {v3}, Lx61;->a()J

    move-result-wide v6

    .line 125
    invoke-static {v0, v1, v6, v7}, Lff;->c(JJ)Z

    move-result v6

    const-wide/16 v45, 0x10

    if-eqz v6, :cond_21

    goto :goto_11

    :cond_21
    cmp-long v3, v0, v45

    if-eqz v3, :cond_22

    .line 126
    new-instance v3, Lsf;

    invoke-direct {v3, v0, v1}, Lsf;-><init>(J)V

    goto :goto_11

    :cond_22
    sget-object v0, Ln2;->V:Ln2;

    move-object v3, v0

    .line 127
    :goto_11
    invoke-interface {v3}, Lx61;->a()J

    move-result-wide v0

    .line 128
    invoke-static {v9, v0, v1, v12, v2}, Lv50;->q(Landroid/text/Spannable;JII)V

    move/from16 v28, v2

    move-object/from16 v23, v9

    move/from16 v27, v12

    .line 129
    invoke-static/range {v23 .. v28}, Lv50;->r(Landroid/text/Spannable;JLym;II)V

    move-object/from16 v0, v23

    move/from16 v1, v27

    if-nez v38, :cond_24

    if-eqz v5, :cond_23

    goto :goto_12

    :cond_23
    const/16 v3, 0x21

    goto :goto_19

    :cond_24
    :goto_12
    if-nez v38, :cond_25

    .line 130
    sget-object v3, Lzv;->f:Lzv;

    goto :goto_13

    :cond_25
    move-object/from16 v3, v38

    :goto_13
    if-eqz v5, :cond_26

    .line 131
    iget v5, v5, Lxv;->a:I

    goto :goto_14

    :cond_26
    const/4 v5, 0x0

    .line 132
    :goto_14
    new-instance v6, Landroid/text/style/StyleSpan;

    .line 133
    sget-object v7, Lzv;->e:Lzv;

    .line 134
    iget v3, v3, Lzv;->d:I

    .line 135
    iget v7, v7, Lzv;->d:I

    invoke-static {v3, v7}, Lp30;->r(II)I

    move-result v3

    if-ltz v3, :cond_27

    const/4 v3, 0x1

    :goto_15
    const/4 v7, 0x1

    goto :goto_16

    :cond_27
    const/4 v3, 0x0

    goto :goto_15

    :goto_16
    if-ne v5, v7, :cond_28

    const/4 v5, 0x1

    goto :goto_17

    :cond_28
    const/4 v5, 0x0

    :goto_17
    if-eqz v5, :cond_29

    if-eqz v3, :cond_29

    const/4 v3, 0x3

    goto :goto_18

    :cond_29
    if-eqz v3, :cond_2a

    const/4 v3, 0x1

    goto :goto_18

    :cond_2a
    if-eqz v5, :cond_2b

    const/4 v3, 0x2

    goto :goto_18

    :cond_2b
    const/4 v3, 0x0

    .line 136
    :goto_18
    invoke-direct {v6, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/16 v3, 0x21

    .line 137
    invoke-virtual {v0, v6, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :goto_19
    if-eqz v10, :cond_2d

    .line 138
    iget v5, v10, Lu61;->a:I

    or-int/lit8 v6, v5, 0x1

    if-ne v6, v5, :cond_2c

    .line 139
    new-instance v6, Landroid/text/style/UnderlineSpan;

    invoke-direct {v6}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-virtual {v0, v6, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_2c
    or-int/lit8 v6, v5, 0x2

    if-ne v6, v5, :cond_2d

    .line 140
    new-instance v5, Landroid/text/style/StrikethroughSpan;

    invoke-direct {v5}, Landroid/text/style/StrikethroughSpan;-><init>()V

    invoke-virtual {v0, v5, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_2d
    if-eqz v4, :cond_2e

    .line 141
    new-instance v5, Landroid/text/style/ScaleXSpan;

    .line 142
    iget v4, v4, Ly61;->a:F

    .line 143
    invoke-direct {v5, v4}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 144
    invoke-virtual {v0, v5, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 145
    :cond_2e
    invoke-static {v0, v14, v1, v2}, Lv50;->s(Landroid/text/Spannable;Lfb0;II)V

    cmp-long v4, v42, v45

    if-eqz v4, :cond_2f

    .line 146
    new-instance v4, Landroid/text/style/BackgroundColorSpan;

    invoke-static/range {v42 .. v43}, Lp30;->W(J)I

    move-result v5

    invoke-direct {v4, v5}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 147
    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_2f
    add-int/lit8 v12, v34, 0x1

    move/from16 v1, p1

    move-object v9, v0

    move-object v6, v11

    move-object/from16 v2, v32

    move/from16 v3, v33

    move-object/from16 v0, v35

    move-object/from16 v4, v36

    move-object/from16 v5, v37

    move-object/from16 v14, v39

    move-object/from16 v11, v40

    move-object/from16 v10, v41

    move-object/from16 v7, v44

    goto/16 :goto_10

    :cond_30
    :goto_1a
    move-object/from16 v35, v0

    move-object/from16 v36, v4

    move-object/from16 v37, v5

    move-object/from16 v44, v7

    move-object v0, v9

    move-object/from16 v41, v10

    move-object/from16 v40, v11

    move-object/from16 v39, v14

    move-object v11, v6

    goto :goto_1b

    :cond_31
    move-object/from16 v31, v12

    goto :goto_1a

    .line 148
    :goto_1b
    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->length()I

    move-result v1

    .line 149
    sget-object v2, Lhs;->d:Lhs;

    if-eqz v8, :cond_33

    .line 150
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_1c
    if-ge v5, v4, :cond_34

    .line 152
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 153
    move-object v7, v6

    check-cast v7, Le8;

    .line 154
    iget-object v9, v7, Le8;->a:Ljava/lang/Object;

    .line 155
    instance-of v9, v9, Lub1;

    if-eqz v9, :cond_32

    .line 156
    iget v9, v7, Le8;->b:I

    .line 157
    iget v7, v7, Le8;->c:I

    const/4 v10, 0x0

    .line 158
    invoke-static {v10, v1, v9, v7}, Lg8;->a(IIII)Z

    move-result v7

    if-eqz v7, :cond_32

    .line 159
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_32
    add-int/lit8 v5, v5, 0x1

    goto :goto_1c

    :cond_33
    move-object v3, v2

    .line 160
    :cond_34
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v4, 0x0

    :goto_1d
    if-ge v4, v1, :cond_36

    .line 161
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 162
    check-cast v5, Le8;

    .line 163
    iget-object v6, v5, Le8;->a:Ljava/lang/Object;

    .line 164
    check-cast v6, Lub1;

    .line 165
    iget v7, v5, Le8;->b:I

    .line 166
    iget v5, v5, Le8;->c:I

    .line 167
    instance-of v9, v6, Lub1;

    if-eqz v9, :cond_35

    .line 168
    new-instance v9, Landroid/text/style/TtsSpan$VerbatimBuilder;

    .line 169
    iget-object v6, v6, Lub1;->a:Ljava/lang/String;

    .line 170
    invoke-direct {v9, v6}, Landroid/text/style/TtsSpan$VerbatimBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    invoke-virtual {v9}, Landroid/text/style/TtsSpan$Builder;->build()Landroid/text/style/TtsSpan;

    move-result-object v6

    const/16 v9, 0x21

    .line 172
    invoke-virtual {v0, v6, v7, v5, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1d

    .line 173
    :cond_35
    invoke-static {}, Lxc;->j()V

    return-object p0

    .line 174
    :cond_36
    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v8, :cond_38

    .line 175
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 176
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_1e
    if-ge v5, v4, :cond_39

    .line 177
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 178
    move-object v7, v6

    check-cast v7, Le8;

    .line 179
    iget-object v9, v7, Le8;->a:Ljava/lang/Object;

    .line 180
    instance-of v9, v9, Lwa1;

    if-eqz v9, :cond_37

    .line 181
    iget v9, v7, Le8;->b:I

    .line 182
    iget v7, v7, Le8;->c:I

    const/4 v10, 0x0

    .line 183
    invoke-static {v10, v1, v9, v7}, Lg8;->a(IIII)Z

    move-result v7

    if-eqz v7, :cond_37

    .line 184
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_37
    add-int/lit8 v5, v5, 0x1

    goto :goto_1e

    :cond_38
    move-object v3, v2

    .line 185
    :cond_39
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v4, 0x0

    :goto_1f
    if-ge v4, v1, :cond_3b

    .line 186
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 187
    check-cast v5, Le8;

    .line 188
    iget-object v6, v5, Le8;->a:Ljava/lang/Object;

    .line 189
    check-cast v6, Lwa1;

    .line 190
    iget v7, v5, Le8;->b:I

    .line 191
    iget v5, v5, Le8;->c:I

    .line 192
    iget-object v9, v13, Lo8;->a:Ljava/lang/Object;

    check-cast v9, Ljava/util/WeakHashMap;

    .line 193
    invoke-virtual {v9, v6}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_3a

    .line 194
    new-instance v10, Landroid/text/style/URLSpan;

    .line 195
    iget-object v12, v6, Lwa1;->a:Ljava/lang/String;

    .line 196
    invoke-direct {v10, v12}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 197
    invoke-virtual {v9, v6, v10}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    :cond_3a
    check-cast v10, Landroid/text/style/URLSpan;

    const/16 v9, 0x21

    .line 199
    invoke-virtual {v0, v10, v7, v5, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1f

    .line 200
    :cond_3b
    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v8, :cond_3d

    .line 201
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 202
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_20
    if-ge v4, v3, :cond_3d

    .line 203
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 204
    move-object v6, v5

    check-cast v6, Le8;

    .line 205
    iget-object v7, v6, Le8;->a:Ljava/lang/Object;

    .line 206
    instance-of v7, v7, Lta0;

    if-eqz v7, :cond_3c

    .line 207
    iget v7, v6, Le8;->b:I

    .line 208
    iget v6, v6, Le8;->c:I

    const/4 v10, 0x0

    .line 209
    invoke-static {v10, v1, v7, v6}, Lg8;->a(IIII)Z

    move-result v6

    if-eqz v6, :cond_3c

    .line 210
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3c
    add-int/lit8 v4, v4, 0x1

    goto :goto_20

    .line 211
    :cond_3d
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_21
    if-ge v3, v1, :cond_42

    .line 212
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 213
    check-cast v4, Le8;

    .line 214
    iget v5, v4, Le8;->b:I

    iget-object v6, v4, Le8;->a:Ljava/lang/Object;

    iget v7, v4, Le8;->c:I

    if-eq v5, v7, :cond_41

    .line 215
    move-object v8, v6

    check-cast v8, Lta0;

    .line 216
    instance-of v9, v8, Lsa0;

    if-eqz v9, :cond_3f

    .line 217
    new-instance v4, Le8;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v6, Lsa0;

    invoke-direct {v4, v5, v7, v6}, Le8;-><init>(IILjava/lang/Object;)V

    .line 218
    iget-object v8, v13, Lo8;->b:Ljava/lang/Object;

    check-cast v8, Ljava/util/WeakHashMap;

    .line 219
    invoke-virtual {v8, v4}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_3e

    .line 220
    new-instance v9, Landroid/text/style/URLSpan;

    .line 221
    iget-object v6, v6, Lsa0;->a:Ljava/lang/String;

    .line 222
    invoke-direct {v9, v6}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 223
    invoke-virtual {v8, v4, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    :cond_3e
    check-cast v9, Landroid/text/style/URLSpan;

    const/16 v4, 0x21

    .line 225
    invoke-virtual {v0, v9, v5, v7, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_22

    .line 226
    :cond_3f
    iget-object v6, v13, Lo8;->c:Ljava/lang/Object;

    check-cast v6, Ljava/util/WeakHashMap;

    .line 227
    invoke-virtual {v6, v4}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_40

    .line 228
    new-instance v9, Lth;

    invoke-direct {v9, v8}, Lth;-><init>(Lta0;)V

    .line 229
    invoke-virtual {v6, v4, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    :cond_40
    check-cast v9, Landroid/text/style/ClickableSpan;

    const/16 v4, 0x21

    .line 231
    invoke-virtual {v0, v9, v5, v7, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_22

    :cond_41
    const/16 v4, 0x21

    :goto_22
    add-int/lit8 v3, v3, 0x1

    goto :goto_21

    .line 232
    :cond_42
    invoke-static {v0}, Lc4;->H(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/SpannableString;

    move-object/from16 v1, v44

    goto :goto_23

    :cond_43
    move-object/from16 v35, v0

    move-object/from16 v21, v3

    move-object/from16 v36, v4

    move-object/from16 v37, v5

    move-object/from16 v29, v8

    move-object/from16 v41, v10

    move-object/from16 v40, v11

    move-object/from16 v31, v12

    move-object/from16 v39, v14

    move-object v11, v6

    move-object/from16 v0, p0

    move-object v1, v7

    .line 233
    :goto_23
    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    .line 234
    sget-object v0, Lb01;->J:Le01;

    move-object/from16 v2, v41

    .line 235
    invoke-virtual {v2, v0}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_45

    move-object/from16 v3, v40

    const/4 v7, 0x1

    .line 236
    invoke-virtual {v3, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentInvalid(Z)V

    .line 237
    invoke-virtual {v2, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_44

    move-object/from16 v0, p0

    .line 238
    :cond_44
    check-cast v0, Ljava/lang/CharSequence;

    .line 239
    invoke-virtual {v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setError(Ljava/lang/CharSequence;)V

    goto :goto_24

    :cond_45
    move-object/from16 v3, v40

    .line 240
    :goto_24
    invoke-static {v11, v15}, Lrd0;->w(Lxz0;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v0

    .line 241
    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setStateDescription(Ljava/lang/CharSequence;)V

    .line 242
    invoke-static {v11}, Lrd0;->v(Lxz0;)Z

    move-result v0

    .line 243
    invoke-virtual {v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 244
    sget-object v0, Lb01;->H:Le01;

    .line 245
    invoke-virtual {v2, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_46

    move-object/from16 v0, p0

    .line 246
    :cond_46
    check-cast v0, Lp81;

    if-eqz v0, :cond_48

    .line 247
    sget-object v4, Lp81;->d:Lp81;

    if-ne v0, v4, :cond_47

    const/4 v7, 0x1

    .line 248
    invoke-virtual {v1, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    goto :goto_25

    .line 249
    :cond_47
    sget-object v4, Lp81;->e:Lp81;

    if-ne v0, v4, :cond_48

    const/4 v10, 0x0

    .line 250
    invoke-virtual {v1, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 251
    :cond_48
    :goto_25
    sget-object v0, Lb01;->G:Le01;

    .line 252
    invoke-virtual {v2, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_49

    move-object/from16 v0, p0

    .line 253
    :cond_49
    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_4c

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v37, :cond_4a

    move-object/from16 v5, v37

    const/4 v7, 0x4

    goto :goto_26

    :cond_4a
    move-object/from16 v5, v37

    .line 254
    iget v4, v5, Lxv0;->a:I

    const/4 v7, 0x4

    if-ne v4, v7, :cond_4b

    .line 255
    invoke-virtual {v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSelected(Z)V

    goto :goto_27

    .line 256
    :cond_4b
    :goto_26
    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    :goto_27
    move-object/from16 v0, v39

    goto :goto_28

    :cond_4c
    move-object/from16 v5, v37

    const/4 v7, 0x4

    goto :goto_27

    .line 257
    :goto_28
    iget-boolean v4, v0, Lsz0;->f:Z

    if-eqz v4, :cond_4d

    .line 258
    invoke-static {v7, v11}, Lxz0;->j(ILxz0;)Ljava/util/List;

    move-result-object v4

    .line 259
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_50

    .line 260
    :cond_4d
    sget-object v4, Lb01;->a:Le01;

    .line 261
    invoke-virtual {v2, v4}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_4e

    move-object/from16 v4, p0

    .line 262
    :cond_4e
    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_4f

    .line 263
    invoke-static {v4}, Lye;->K(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_29

    :cond_4f
    move-object/from16 v4, p0

    .line 264
    :goto_29
    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 265
    :cond_50
    sget-object v4, Lb01;->y:Le01;

    .line 266
    invoke-virtual {v2, v4}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_51

    move-object/from16 v4, p0

    .line 267
    :cond_51
    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_54

    move-object v6, v11

    :goto_2a
    if-eqz v6, :cond_53

    .line 268
    iget-object v7, v6, Lxz0;->d:Lsz0;

    .line 269
    sget-object v8, Lc01;->a:Le01;

    .line 270
    iget-object v9, v7, Lsz0;->d:Ljh0;

    .line 271
    invoke-virtual {v9, v8}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_52

    .line 272
    invoke-virtual {v7, v8}, Lsz0;->c(Le01;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_2b

    .line 273
    :cond_52
    invoke-virtual {v6}, Lxz0;->l()Lxz0;

    move-result-object v6

    goto :goto_2a

    :cond_53
    const/4 v6, 0x0

    :goto_2b
    if-eqz v6, :cond_54

    .line 274
    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    .line 275
    :cond_54
    sget-object v4, Lb01;->h:Le01;

    .line 276
    invoke-virtual {v2, v4}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_55

    move-object/from16 v4, p0

    .line 277
    :cond_55
    check-cast v4, Lna1;

    if-eqz v4, :cond_56

    const/4 v7, 0x1

    .line 278
    invoke-virtual {v1, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHeading(Z)V

    :cond_56
    move/from16 v4, p1

    const/4 v7, -0x1

    if-eq v4, v7, :cond_58

    .line 279
    iget v6, v11, Lxz0;->g:I

    move-object/from16 v8, v36

    .line 280
    invoke-virtual {v8, v6}, Lsg0;->d(I)I

    move-result v6

    if-eq v6, v7, :cond_57

    .line 281
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDrawingOrder(I)V

    goto :goto_2c

    .line 282
    :cond_57
    const-string v6, "AccessibilityDelegate"

    .line 283
    const-string v7, "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?"

    .line 284
    invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 285
    :cond_58
    :goto_2c
    sget-object v6, Lb01;->I:Le01;

    .line 286
    invoke-virtual {v2, v6}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v6

    .line 287
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V

    .line 288
    sget-object v6, Lb01;->L:Le01;

    .line 289
    invoke-virtual {v2, v6}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v6

    .line 290
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEditable(Z)V

    .line 291
    sget-object v6, Lb01;->M:Le01;

    .line 292
    invoke-virtual {v2, v6}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_59

    move-object/from16 v6, p0

    .line 293
    :cond_59
    check-cast v6, Ljava/lang/Integer;

    if-eqz v6, :cond_5a

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_2d

    :cond_5a
    const/4 v7, -0x1

    .line 294
    :goto_2d
    invoke-virtual {v3, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMaxTextLength(I)V

    .line 295
    invoke-static {v11}, Lrd0;->g(Lxz0;)Z

    move-result v6

    .line 296
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 297
    sget-object v6, Lb01;->k:Le01;

    .line 298
    invoke-virtual {v2, v6}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v7

    .line 299
    invoke-virtual {v3, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 300
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    move-result v7

    if-eqz v7, :cond_5c

    .line 301
    invoke-virtual {v0, v6}, Lsz0;->c(Le01;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 302
    invoke-virtual {v3, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 303
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    move-result v7

    if-eqz v7, :cond_5b

    const/4 v7, 0x2

    .line 304
    invoke-virtual {v1, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    move-object/from16 v7, v35

    .line 305
    iput v4, v7, Lc4;->p:I

    :goto_2e
    const/4 v8, 0x1

    goto :goto_2f

    :cond_5b
    move-object/from16 v7, v35

    const/4 v8, 0x1

    .line 306
    invoke-virtual {v1, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    goto :goto_2f

    :cond_5c
    move-object/from16 v7, v35

    goto :goto_2e

    .line 307
    :goto_2f
    invoke-static {v11}, Li4;->u(Lxz0;)Z

    move-result v9

    xor-int/2addr v9, v8

    .line 308
    invoke-virtual {v3, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 309
    sget-object v8, Lb01;->j:Le01;

    .line 310
    invoke-virtual {v2, v8}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_5d

    move-object/from16 v8, p0

    :cond_5d
    if-nez v8, :cond_b4

    const/4 v10, 0x0

    .line 311
    invoke-virtual {v1, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 312
    sget-object v8, Lrz0;->b:Le01;

    .line 313
    invoke-virtual {v2, v8}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_5e

    move-object/from16 v8, p0

    .line 314
    :cond_5e
    check-cast v8, Lo0;

    const/16 v9, 0x10

    if-eqz v8, :cond_66

    .line 315
    sget-object v10, Lb01;->G:Le01;

    .line 316
    invoke-virtual {v2, v10}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_5f

    move-object/from16 v10, p0

    .line 317
    :cond_5f
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v10, v12}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v5, :cond_60

    goto :goto_30

    .line 318
    :cond_60
    iget v12, v5, Lxv0;->a:I

    const/4 v13, 0x4

    if-ne v12, v13, :cond_61

    goto :goto_31

    :cond_61
    :goto_30
    if-nez v5, :cond_62

    goto :goto_32

    :cond_62
    iget v5, v5, Lxv0;->a:I

    const/4 v12, 0x3

    if-ne v5, v12, :cond_63

    :goto_31
    const/4 v5, 0x1

    goto :goto_33

    :cond_63
    :goto_32
    const/4 v5, 0x0

    :goto_33
    if-eqz v5, :cond_65

    if-eqz v5, :cond_64

    if-nez v10, :cond_64

    goto :goto_34

    :cond_64
    const/4 v5, 0x0

    goto :goto_35

    :cond_65
    :goto_34
    const/4 v5, 0x1

    .line 319
    :goto_35
    invoke-virtual {v1, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 320
    invoke-static {v11}, Lrd0;->g(Lxz0;)Z

    move-result v5

    if-eqz v5, :cond_66

    .line 321
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v5

    if-eqz v5, :cond_66

    .line 322
    new-instance v5, La1;

    .line 323
    iget-object v8, v8, Lo0;->a:Ljava/lang/String;

    move-object/from16 v10, p0

    .line 324
    invoke-direct {v5, v10, v9, v8, v10}, La1;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Ljava/lang/Class;)V

    move-object/from16 v8, v31

    .line 325
    invoke-virtual {v8, v5}, Le1;->a(La1;)V

    :goto_36
    const/4 v10, 0x0

    goto :goto_37

    :cond_66
    move-object/from16 v8, v31

    goto :goto_36

    .line 326
    :goto_37
    invoke-virtual {v1, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 327
    sget-object v5, Lrz0;->c:Le01;

    .line 328
    invoke-virtual {v2, v5}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_67

    const/4 v5, 0x0

    .line 329
    :cond_67
    check-cast v5, Lo0;

    if-eqz v5, :cond_68

    const/4 v10, 0x1

    .line 330
    invoke-virtual {v1, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 331
    invoke-static {v11}, Lrd0;->g(Lxz0;)Z

    move-result v10

    if-eqz v10, :cond_68

    .line 332
    new-instance v10, La1;

    const/16 v12, 0x20

    .line 333
    iget-object v5, v5, Lo0;->a:Ljava/lang/String;

    const/4 v13, 0x0

    .line 334
    invoke-direct {v10, v13, v12, v5, v13}, La1;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Ljava/lang/Class;)V

    .line 335
    invoke-virtual {v8, v10}, Le1;->a(La1;)V

    .line 336
    :cond_68
    sget-object v5, Lrz0;->p:Le01;

    .line 337
    invoke-virtual {v2, v5}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_69

    const/4 v5, 0x0

    .line 338
    :cond_69
    check-cast v5, Lo0;

    if-eqz v5, :cond_6a

    .line 339
    new-instance v10, La1;

    const/16 v12, 0x4000

    .line 340
    iget-object v5, v5, Lo0;->a:Ljava/lang/String;

    const/4 v13, 0x0

    .line 341
    invoke-direct {v10, v13, v12, v5, v13}, La1;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Ljava/lang/Class;)V

    .line 342
    invoke-virtual {v8, v10}, Le1;->a(La1;)V

    .line 343
    :cond_6a
    invoke-static {v11}, Lrd0;->g(Lxz0;)Z

    move-result v5

    if-eqz v5, :cond_70

    .line 344
    sget-object v5, Lrz0;->k:Le01;

    .line 345
    invoke-virtual {v2, v5}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_6b

    const/4 v5, 0x0

    .line 346
    :cond_6b
    check-cast v5, Lo0;

    if-eqz v5, :cond_6c

    .line 347
    new-instance v10, La1;

    const/high16 v12, 0x200000

    .line 348
    iget-object v5, v5, Lo0;->a:Ljava/lang/String;

    const/4 v13, 0x0

    .line 349
    invoke-direct {v10, v13, v12, v5, v13}, La1;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Ljava/lang/Class;)V

    .line 350
    invoke-virtual {v8, v10}, Le1;->a(La1;)V

    .line 351
    :cond_6c
    sget-object v5, Lrz0;->o:Le01;

    invoke-static {v0, v5}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo0;

    if-eqz v5, :cond_6d

    .line 352
    new-instance v10, La1;

    const v12, 0x1020054

    .line 353
    iget-object v5, v5, Lo0;->a:Ljava/lang/String;

    .line 354
    invoke-direct {v10, v5, v12}, La1;-><init>(Ljava/lang/String;I)V

    .line 355
    invoke-virtual {v8, v10}, Le1;->a(La1;)V

    .line 356
    :cond_6d
    sget-object v5, Lrz0;->q:Le01;

    invoke-static {v0, v5}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo0;

    if-eqz v5, :cond_6e

    .line 357
    new-instance v10, La1;

    const/high16 v12, 0x10000

    .line 358
    iget-object v5, v5, Lo0;->a:Ljava/lang/String;

    .line 359
    invoke-direct {v10, v5, v12}, La1;-><init>(Ljava/lang/String;I)V

    .line 360
    invoke-virtual {v8, v10}, Le1;->a(La1;)V

    .line 361
    :cond_6e
    sget-object v5, Lrz0;->r:Le01;

    invoke-static {v0, v5}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo0;

    if-eqz v5, :cond_70

    .line 362
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    move-result v10

    if-eqz v10, :cond_70

    .line 363
    invoke-virtual/range {v21 .. v21}, Lw3;->getClipboardManager()Le3;

    move-result-object v10

    .line 364
    iget-object v10, v10, Le3;->a:Landroid/content/ClipboardManager;

    .line 365
    invoke-virtual {v10}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    move-result-object v10

    if-eqz v10, :cond_6f

    const-string v12, "text/*"

    invoke-virtual {v10, v12}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v10

    goto :goto_38

    :cond_6f
    const/4 v10, 0x0

    :goto_38
    if-eqz v10, :cond_70

    .line 366
    new-instance v10, La1;

    const v12, 0x8000

    .line 367
    iget-object v5, v5, Lo0;->a:Ljava/lang/String;

    .line 368
    invoke-direct {v10, v5, v12}, La1;-><init>(Ljava/lang/String;I)V

    .line 369
    invoke-virtual {v8, v10}, Le1;->a(La1;)V

    .line 370
    :cond_70
    invoke-static {v11}, Lc4;->l(Lxz0;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_7a

    .line 371
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_71

    goto/16 :goto_3d

    .line 372
    :cond_71
    invoke-virtual {v7, v11}, Lc4;->j(Lxz0;)I

    move-result v5

    .line 373
    invoke-virtual {v7, v11}, Lc4;->i(Lxz0;)I

    move-result v10

    .line 374
    invoke-virtual {v3, v5, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextSelection(II)V

    .line 375
    sget-object v5, Lrz0;->j:Le01;

    invoke-static {v0, v5}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo0;

    .line 376
    new-instance v10, La1;

    if-eqz v5, :cond_72

    .line 377
    iget-object v5, v5, Lo0;->a:Ljava/lang/String;

    goto :goto_39

    :cond_72
    const/4 v5, 0x0

    :goto_39
    const/high16 v12, 0x20000

    .line 378
    invoke-direct {v10, v5, v12}, La1;-><init>(Ljava/lang/String;I)V

    .line 379
    invoke-virtual {v8, v10}, Le1;->a(La1;)V

    const/16 v5, 0x100

    .line 380
    invoke-virtual {v1, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    const/16 v5, 0x200

    .line 381
    invoke-virtual {v1, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    const/16 v5, 0xb

    .line 382
    invoke-virtual {v1, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 383
    sget-object v5, Lb01;->a:Le01;

    invoke-static {v0, v5}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_73

    .line 384
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_7a

    .line 385
    :cond_73
    sget-object v5, Lrz0;->a:Le01;

    .line 386
    invoke-virtual {v2, v5}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7a

    .line 387
    sget-object v5, Lb01;->E:Le01;

    .line 388
    invoke-virtual {v2, v5}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_74

    .line 389
    invoke-static {v0, v6}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v5

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v10}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_74

    goto :goto_3d

    .line 390
    :cond_74
    invoke-virtual/range {v29 .. v29}, Lb60;->v()Lb60;

    move-result-object v5

    :goto_3a
    if-eqz v5, :cond_76

    .line 391
    invoke-virtual {v5}, Lb60;->x()Lsz0;

    move-result-object v10

    if-eqz v10, :cond_75

    .line 392
    iget-boolean v12, v10, Lsz0;->f:Z

    const/4 v13, 0x1

    if-ne v12, v13, :cond_75

    .line 393
    sget-object v12, Lb01;->E:Le01;

    .line 394
    iget-object v10, v10, Lsz0;->d:Ljh0;

    .line 395
    invoke-virtual {v10, v12}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_75

    goto :goto_3b

    .line 396
    :cond_75
    invoke-virtual {v5}, Lb60;->v()Lb60;

    move-result-object v5

    goto :goto_3a

    :cond_76
    const/4 v5, 0x0

    :goto_3b
    if-eqz v5, :cond_79

    .line 397
    invoke-virtual {v5}, Lb60;->x()Lsz0;

    move-result-object v5

    if-eqz v5, :cond_78

    .line 398
    iget-object v5, v5, Lsz0;->d:Ljh0;

    .line 399
    invoke-virtual {v5, v6}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_77

    const/4 v5, 0x0

    .line 400
    :cond_77
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v6}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    goto :goto_3c

    :cond_78
    const/4 v5, 0x0

    :goto_3c
    if-nez v5, :cond_79

    goto :goto_3d

    .line 401
    :cond_79
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMovementGranularities()I

    move-result v5

    or-int/lit8 v5, v5, 0x14

    .line 402
    invoke-virtual {v1, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 403
    :cond_7a
    :goto_3d
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 404
    const-string v6, "androidx.compose.ui.semantics.id"

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    invoke-virtual {v8}, Le1;->e()Ljava/lang/CharSequence;

    move-result-object v6

    if-eqz v6, :cond_7c

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_7b

    goto :goto_3e

    .line 406
    :cond_7b
    sget-object v6, Lrz0;->a:Le01;

    .line 407
    invoke-virtual {v2, v6}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7c

    .line 408
    const-string v6, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 409
    :cond_7c
    :goto_3e
    sget-object v6, Lb01;->y:Le01;

    .line 410
    invoke-virtual {v2, v6}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7d

    .line 411
    const-string v6, "androidx.compose.ui.semantics.testTag"

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    :cond_7d
    sget-object v6, Lb01;->N:Le01;

    .line 413
    invoke-virtual {v2, v6}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7e

    .line 414
    const-string v6, "androidx.compose.ui.semantics.shapeType"

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 415
    const-string v6, "androidx.compose.ui.semantics.shapeRect"

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    const-string v6, "androidx.compose.ui.semantics.shapeCorners"

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 417
    const-string v6, "androidx.compose.ui.semantics.shapeRegion"

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 418
    :cond_7e
    invoke-virtual {v3, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAvailableExtraData(Ljava/util/List;)V

    .line 419
    sget-object v5, Lb01;->c:Le01;

    invoke-static {v0, v5}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lys0;

    const/4 v6, 0x0

    if-eqz v5, :cond_81

    .line 420
    sget-object v10, Lrz0;->i:Le01;

    .line 421
    invoke-virtual {v2, v10}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7f

    .line 422
    const-string v12, "android.widget.SeekBar"

    invoke-virtual {v8, v12}, Le1;->f(Ljava/lang/String;)V

    goto :goto_3f

    .line 423
    :cond_7f
    const-string v12, "android.widget.ProgressBar"

    invoke-virtual {v8, v12}, Le1;->f(Ljava/lang/String;)V

    .line 424
    :goto_3f
    sget-object v12, Lys0;->b:Lys0;

    if-eq v5, v12, :cond_80

    const/4 v13, 0x1

    .line 425
    invoke-static {v13, v6, v6, v6}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    move-result-object v5

    .line 426
    invoke-virtual {v3, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    .line 427
    :cond_80
    invoke-virtual {v2, v10}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_81

    .line 428
    invoke-static {v11}, Lrd0;->g(Lxz0;)Z

    .line 429
    :cond_81
    invoke-static {v11}, Lrd0;->g(Lxz0;)Z

    move-result v2

    if-eqz v2, :cond_82

    .line 430
    sget-object v2, Lrz0;->i:Le01;

    invoke-static {v0, v2}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo0;

    if-eqz v2, :cond_82

    .line 431
    new-instance v3, La1;

    const v5, 0x102003d

    .line 432
    iget-object v2, v2, Lo0;->a:Ljava/lang/String;

    .line 433
    invoke-direct {v3, v2, v5}, La1;-><init>(Ljava/lang/String;I)V

    .line 434
    invoke-virtual {v8, v3}, Le1;->a(La1;)V

    .line 435
    :cond_82
    invoke-static {v8, v11}, Lkl;->z(Le1;Lxz0;)V

    .line 436
    invoke-virtual {v11}, Lxz0;->k()Lsz0;

    move-result-object v2

    sget-object v3, Lb01;->g:Le01;

    .line 437
    iget-object v2, v2, Lsz0;->d:Ljh0;

    .line 438
    invoke-virtual {v2, v3}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_83

    const/4 v2, 0x0

    :cond_83
    if-nez v2, :cond_8f

    .line 439
    invoke-virtual {v11}, Lxz0;->l()Lxz0;

    move-result-object v2

    if-nez v2, :cond_85

    :cond_84
    :goto_40
    move/from16 v20, v6

    goto/16 :goto_44

    .line 440
    :cond_85
    invoke-virtual {v2}, Lxz0;->k()Lsz0;

    move-result-object v3

    sget-object v5, Lb01;->e:Le01;

    .line 441
    iget-object v3, v3, Lsz0;->d:Ljh0;

    .line 442
    invoke-virtual {v3, v5}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_86

    const/4 v3, 0x0

    :cond_86
    if-eqz v3, :cond_84

    .line 443
    invoke-virtual {v2}, Lxz0;->k()Lsz0;

    move-result-object v3

    sget-object v5, Lb01;->f:Le01;

    .line 444
    iget-object v3, v3, Lsz0;->d:Ljh0;

    .line 445
    invoke-virtual {v3, v5}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_87

    const/4 v3, 0x0

    .line 446
    :cond_87
    check-cast v3, Lxe;

    if-eqz v3, :cond_88

    .line 447
    iget v5, v3, Lxe;->a:I

    if-ltz v5, :cond_84

    .line 448
    iget v3, v3, Lxe;->b:I

    if-gez v3, :cond_88

    goto :goto_40

    .line 449
    :cond_88
    invoke-virtual {v11}, Lxz0;->k()Lsz0;

    move-result-object v3

    sget-object v5, Lb01;->G:Le01;

    .line 450
    iget-object v3, v3, Lsz0;->d:Ljh0;

    .line 451
    invoke-virtual {v3, v5}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_89

    goto :goto_40

    .line 452
    :cond_89
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v13, 0x4

    .line 453
    invoke-static {v13, v2}, Lxz0;->j(ILxz0;)Ljava/util/List;

    move-result-object v2

    .line 454
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v10, 0x0

    const/4 v12, 0x0

    :goto_41
    if-ge v10, v5, :cond_8b

    .line 455
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 456
    check-cast v13, Lxz0;

    .line 457
    invoke-virtual {v13}, Lxz0;->k()Lsz0;

    move-result-object v14

    move/from16 v20, v6

    sget-object v6, Lb01;->G:Le01;

    .line 458
    iget-object v14, v14, Lsz0;->d:Ljh0;

    .line 459
    invoke-virtual {v14, v6}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8a

    .line 460
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 461
    iget-object v6, v13, Lxz0;->c:Lb60;

    .line 462
    invoke-virtual {v6}, Lb60;->w()I

    move-result v6

    .line 463
    iget-object v13, v11, Lxz0;->c:Lb60;

    .line 464
    invoke-virtual {v13}, Lb60;->w()I

    move-result v13

    if-ge v6, v13, :cond_8a

    add-int/lit8 v12, v12, 0x1

    :cond_8a
    add-int/lit8 v10, v10, 0x1

    move/from16 v6, v20

    goto :goto_41

    :cond_8b
    move/from16 v20, v6

    .line 465
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_90

    .line 466
    invoke-static {v3}, Lkl;->i(Ljava/util/ArrayList;)Z

    move-result v2

    if-eqz v2, :cond_8c

    const/16 v23, 0x0

    goto :goto_42

    :cond_8c
    move/from16 v23, v12

    :goto_42
    if-eqz v2, :cond_8d

    move/from16 v25, v12

    goto :goto_43

    :cond_8d
    const/16 v25, 0x0

    .line 467
    :goto_43
    invoke-virtual {v11}, Lxz0;->k()Lsz0;

    move-result-object v2

    sget-object v3, Lb01;->G:Le01;

    .line 468
    iget-object v2, v2, Lsz0;->d:Ljh0;

    .line 469
    invoke-virtual {v2, v3}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_8e

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 470
    :cond_8e
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v28

    const/16 v26, 0x1

    const/16 v27, 0x0

    const/16 v24, 0x1

    .line 471
    invoke-static/range {v23 .. v28}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    move-result-object v2

    .line 472
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    goto :goto_44

    :cond_8f
    move/from16 v20, v6

    .line 473
    invoke-static {}, Lxc;->d()V

    .line 474
    :cond_90
    :goto_44
    sget-object v2, Lb01;->u:Le01;

    invoke-static {v0, v2}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhy0;

    .line 475
    sget-object v3, Lrz0;->d:Le01;

    invoke-static {v0, v3}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo0;

    if-eqz v2, :cond_99

    if-eqz v3, :cond_99

    .line 476
    invoke-virtual {v11}, Lxz0;->k()Lsz0;

    move-result-object v5

    sget-object v6, Lb01;->f:Le01;

    .line 477
    iget-object v5, v5, Lsz0;->d:Ljh0;

    .line 478
    invoke-virtual {v5, v6}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_91

    const/4 v5, 0x0

    :cond_91
    if-nez v5, :cond_94

    .line 479
    invoke-virtual {v11}, Lxz0;->k()Lsz0;

    move-result-object v5

    sget-object v6, Lb01;->e:Le01;

    .line 480
    iget-object v5, v5, Lsz0;->d:Ljh0;

    .line 481
    invoke-virtual {v5, v6}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_92

    const/4 v5, 0x0

    :cond_92
    if-eqz v5, :cond_93

    goto :goto_45

    .line 482
    :cond_93
    const-string v5, "android.widget.HorizontalScrollView"

    invoke-virtual {v8, v5}, Le1;->f(Ljava/lang/String;)V

    .line 483
    :cond_94
    :goto_45
    iget-object v5, v2, Lhy0;->b:Lhw;

    .line 484
    invoke-interface {v5}, Lhw;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    cmpl-float v5, v5, v20

    if-lez v5, :cond_95

    const/4 v13, 0x1

    .line 485
    invoke-virtual {v1, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 486
    :cond_95
    invoke-static {v11}, Lrd0;->g(Lxz0;)Z

    move-result v5

    if-eqz v5, :cond_99

    .line 487
    invoke-static {v2}, Lc4;->r(Lhy0;)Z

    move-result v5

    sget-object v6, Lk50;->e:Lk50;

    if-eqz v5, :cond_97

    .line 488
    sget-object v5, La1;->e:La1;

    invoke-virtual {v8, v5}, Le1;->a(La1;)V

    move-object/from16 v5, v29

    .line 489
    iget-object v10, v5, Lb60;->C:Lk50;

    if-ne v10, v6, :cond_96

    .line 490
    sget-object v10, La1;->h:La1;

    goto :goto_46

    .line 491
    :cond_96
    sget-object v10, La1;->j:La1;

    .line 492
    :goto_46
    invoke-virtual {v8, v10}, Le1;->a(La1;)V

    goto :goto_47

    :cond_97
    move-object/from16 v5, v29

    .line 493
    :goto_47
    invoke-static {v2}, Lc4;->q(Lhy0;)Z

    move-result v2

    if-eqz v2, :cond_99

    .line 494
    sget-object v2, La1;->f:La1;

    invoke-virtual {v8, v2}, Le1;->a(La1;)V

    .line 495
    iget-object v2, v5, Lb60;->C:Lk50;

    if-ne v2, v6, :cond_98

    .line 496
    sget-object v2, La1;->j:La1;

    goto :goto_48

    .line 497
    :cond_98
    sget-object v2, La1;->h:La1;

    .line 498
    :goto_48
    invoke-virtual {v8, v2}, Le1;->a(La1;)V

    .line 499
    :cond_99
    sget-object v2, Lb01;->v:Le01;

    invoke-static {v0, v2}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhy0;

    if-eqz v2, :cond_a0

    if-eqz v3, :cond_a0

    .line 500
    invoke-virtual {v11}, Lxz0;->k()Lsz0;

    move-result-object v3

    sget-object v5, Lb01;->f:Le01;

    .line 501
    iget-object v3, v3, Lsz0;->d:Ljh0;

    .line 502
    invoke-virtual {v3, v5}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_9a

    const/4 v3, 0x0

    :cond_9a
    if-nez v3, :cond_9d

    .line 503
    invoke-virtual {v11}, Lxz0;->k()Lsz0;

    move-result-object v3

    sget-object v5, Lb01;->e:Le01;

    .line 504
    iget-object v3, v3, Lsz0;->d:Ljh0;

    .line 505
    invoke-virtual {v3, v5}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_9b

    const/4 v3, 0x0

    :cond_9b
    if-eqz v3, :cond_9c

    goto :goto_49

    .line 506
    :cond_9c
    const-string v3, "android.widget.ScrollView"

    invoke-virtual {v8, v3}, Le1;->f(Ljava/lang/String;)V

    .line 507
    :cond_9d
    :goto_49
    iget-object v3, v2, Lhy0;->b:Lhw;

    .line 508
    invoke-interface {v3}, Lhw;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    cmpl-float v3, v3, v20

    const/4 v13, 0x1

    if-lez v3, :cond_9e

    .line 509
    invoke-virtual {v1, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 510
    :cond_9e
    invoke-static {v11}, Lrd0;->g(Lxz0;)Z

    move-result v3

    if-eqz v3, :cond_a1

    .line 511
    invoke-static {v2}, Lc4;->r(Lhy0;)Z

    move-result v3

    if-eqz v3, :cond_9f

    .line 512
    sget-object v3, La1;->e:La1;

    invoke-virtual {v8, v3}, Le1;->a(La1;)V

    .line 513
    sget-object v3, La1;->i:La1;

    invoke-virtual {v8, v3}, Le1;->a(La1;)V

    .line 514
    :cond_9f
    invoke-static {v2}, Lc4;->q(Lhy0;)Z

    move-result v2

    if-eqz v2, :cond_a1

    .line 515
    sget-object v2, La1;->f:La1;

    invoke-virtual {v8, v2}, Le1;->a(La1;)V

    .line 516
    sget-object v2, La1;->g:La1;

    invoke-virtual {v8, v2}, Le1;->a(La1;)V

    goto :goto_4a

    :cond_a0
    const/4 v13, 0x1

    .line 517
    :cond_a1
    :goto_4a
    invoke-static {v8, v11}, Lp30;->k(Le1;Lxz0;)V

    .line 518
    sget-object v2, Lb01;->d:Le01;

    invoke-static {v0, v2}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    .line 519
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPaneTitle(Ljava/lang/CharSequence;)V

    .line 520
    invoke-static {v11}, Lrd0;->g(Lxz0;)Z

    move-result v2

    if-eqz v2, :cond_ae

    .line 521
    sget-object v2, Lrz0;->s:Le01;

    invoke-static {v0, v2}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo0;

    if-eqz v2, :cond_a2

    .line 522
    new-instance v3, La1;

    const/high16 v5, 0x40000

    .line 523
    iget-object v2, v2, Lo0;->a:Ljava/lang/String;

    .line 524
    invoke-direct {v3, v2, v5}, La1;-><init>(Ljava/lang/String;I)V

    .line 525
    invoke-virtual {v8, v3}, Le1;->a(La1;)V

    .line 526
    :cond_a2
    sget-object v2, Lrz0;->t:Le01;

    invoke-static {v0, v2}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo0;

    if-eqz v2, :cond_a3

    .line 527
    new-instance v3, La1;

    const/high16 v5, 0x80000

    .line 528
    iget-object v2, v2, Lo0;->a:Ljava/lang/String;

    .line 529
    invoke-direct {v3, v2, v5}, La1;-><init>(Ljava/lang/String;I)V

    .line 530
    invoke-virtual {v8, v3}, Le1;->a(La1;)V

    .line 531
    :cond_a3
    sget-object v2, Lrz0;->u:Le01;

    invoke-static {v0, v2}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo0;

    if-eqz v2, :cond_a4

    .line 532
    new-instance v3, La1;

    const/high16 v5, 0x100000

    .line 533
    iget-object v2, v2, Lo0;->a:Ljava/lang/String;

    .line 534
    invoke-direct {v3, v2, v5}, La1;-><init>(Ljava/lang/String;I)V

    .line 535
    invoke-virtual {v8, v3}, Le1;->a(La1;)V

    .line 536
    :cond_a4
    sget-object v2, Lrz0;->w:Le01;

    sget-object v3, Lrz0;->w:Le01;

    .line 537
    iget-object v5, v0, Lsz0;->d:Ljh0;

    invoke-virtual {v5, v3}, Ljh0;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_ae

    .line 538
    invoke-virtual {v0, v2}, Lsz0;->c(Le01;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 539
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sget-object v3, Lc4;->R:Ltg0;

    .line 540
    iget v5, v3, Ltg0;->b:I

    if-ge v2, v5, :cond_ad

    .line 541
    new-instance v2, Ll31;

    invoke-direct {v2}, Ll31;-><init>()V

    .line 542
    invoke-static {}, Ljk0;->a()Lch0;

    move-result-object v5

    move-object/from16 v6, v22

    .line 543
    iget-object v10, v6, Ll31;->d:[I

    .line 544
    iget v12, v6, Ll31;->f:I

    invoke-static {v10, v12, v4}, Lo30;->j([III)I

    move-result v10

    if-ltz v10, :cond_a5

    move v10, v13

    goto :goto_4b

    :cond_a5
    const/4 v10, 0x0

    :goto_4b
    if-eqz v10, :cond_ab

    .line 545
    invoke-virtual {v6, v4}, Ll31;->b(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lch0;

    .line 546
    new-array v9, v9, [I

    .line 547
    iget-object v12, v3, Ltg0;->a:[I

    .line 548
    iget v3, v3, Ltg0;->b:I

    move-object v14, v9

    const/4 v9, 0x0

    const/4 v13, 0x0

    :goto_4c
    if-ge v9, v3, :cond_a7

    .line 549
    aget v17, v12, v9

    move/from16 v20, v3

    add-int/lit8 v3, v13, 0x1

    move/from16 v22, v9

    .line 550
    array-length v9, v14

    if-ge v9, v3, :cond_a6

    .line 551
    array-length v9, v14

    const/16 v18, 0x3

    mul-int/lit8 v9, v9, 0x3

    const/16 v19, 0x2

    div-int/lit8 v9, v9, 0x2

    invoke-static {v3, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 552
    invoke-static {v14, v9}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v9

    move-object v14, v9

    goto :goto_4d

    :cond_a6
    const/16 v18, 0x3

    const/16 v19, 0x2

    .line 553
    :goto_4d
    aput v17, v14, v13

    add-int/lit8 v9, v22, 0x1

    move v13, v3

    move/from16 v3, v20

    goto :goto_4c

    .line 554
    :cond_a7
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 555
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v9

    if-gtz v9, :cond_aa

    .line 556
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_a8

    const/4 v13, 0x0

    goto :goto_4f

    :cond_a8
    const/4 v9, 0x0

    .line 557
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 558
    invoke-static {v0}, Lt1;->r(Ljava/lang/Object;)V

    if-gtz v13, :cond_a9

    .line 559
    const-string v0, "Index must be between 0 and size"

    .line 560
    invoke-static {v0}, Lxc;->f(Ljava/lang/String;)V

    :goto_4e
    const/4 v13, 0x0

    return-object v13

    :cond_a9
    const/4 v13, 0x0

    .line 561
    aget v0, v14, v9

    .line 562
    throw v13

    :cond_aa
    const/4 v9, 0x0

    const/4 v13, 0x0

    .line 563
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 564
    invoke-static {v0}, Lt1;->r(Ljava/lang/Object;)V

    .line 565
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v13

    :cond_ab
    const/4 v9, 0x0

    const/4 v13, 0x0

    .line 566
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v10

    if-gtz v10, :cond_ac

    .line 567
    :goto_4f
    iget-object v0, v7, Lc4;->v:Ll31;

    invoke-virtual {v0, v4, v2}, Ll31;->c(ILjava/lang/Object;)V

    .line 568
    invoke-virtual {v6, v4, v5}, Ll31;->c(ILjava/lang/Object;)V

    goto :goto_50

    .line 569
    :cond_ac
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 570
    invoke-static {v0}, Lt1;->r(Ljava/lang/Object;)V

    .line 571
    invoke-virtual {v3, v9}, Ltg0;->b(I)I

    .line 572
    throw v13

    .line 573
    :cond_ad
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 574
    iget v1, v3, Ltg0;->b:I

    .line 575
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Can\'t have more than "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 576
    const-string v1, " custom actions for one widget"

    .line 577
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 578
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 579
    :cond_ae
    :goto_50
    invoke-static {v11, v15}, Lrd0;->h(Lxz0;Landroid/content/res/Resources;)Z

    move-result v0

    .line 580
    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScreenReaderFocusable(Z)V

    .line 581
    iget-object v0, v7, Lc4;->F:Lsg0;

    invoke-virtual {v0, v4}, Lsg0;->d(I)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_af

    .line 582
    invoke-virtual/range {v21 .. v21}, Lw3;->getAndroidViewsHandler$ui()Lw6;

    move-result-object v3

    invoke-static {v3, v0}, Lu50;->A(Lw6;I)V

    move-object/from16 v3, v21

    .line 583
    invoke-virtual {v1, v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;I)V

    .line 584
    iget-object v0, v7, Lc4;->H:Ljava/lang/String;

    const/4 v13, 0x0

    .line 585
    invoke-virtual {v7, v4, v8, v0, v13}, Lc4;->b(ILe1;Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_51

    :cond_af
    move-object/from16 v3, v21

    .line 586
    :goto_51
    iget-object v0, v7, Lc4;->G:Lsg0;

    invoke-virtual {v0, v4}, Lsg0;->d(I)I

    move-result v0

    if-eq v0, v2, :cond_b0

    .line 587
    invoke-virtual {v3}, Lw3;->getAndroidViewsHandler$ui()Lw6;

    move-result-object v1

    invoke-static {v1, v0}, Lu50;->A(Lw6;I)V

    .line 588
    :cond_b0
    iget-object v0, v11, Lxz0;->d:Lsz0;

    .line 589
    sget-object v1, Lc01;->b:Le01;

    invoke-static {v0, v1}, Lw60;->v(Lsz0;Le01;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_b1

    .line 590
    invoke-virtual {v8, v0}, Le1;->f(Ljava/lang/String;)V

    :cond_b1
    move-object v5, v8

    .line 591
    :goto_52
    iget-boolean v0, v7, Lc4;->s:Z

    if-eqz v0, :cond_b3

    .line 592
    iget v0, v7, Lc4;->o:I

    if-ne v4, v0, :cond_b2

    .line 593
    iput-object v5, v7, Lc4;->q:Le1;

    .line 594
    :cond_b2
    iget v0, v7, Lc4;->p:I

    if-ne v4, v0, :cond_b3

    .line 595
    iput-object v5, v7, Lc4;->r:Le1;

    :cond_b3
    return-object v5

    .line 596
    :cond_b4
    invoke-static {}, Lxc;->d()V

    goto/16 :goto_4e

    :cond_b5
    move v4, v1

    .line 597
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "semanticsNode "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " has null parent"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 598
    invoke-static {v0}, Lw10;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lsg;

    .line 599
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 600
    throw v0
.end method

.method public m()Lxd0;
    .locals 0

    .line 1
    iget-object p0, p0, Ld;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lgp0;

    .line 4
    .line 5
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lxd0;

    .line 10
    .line 11
    return-object p0
.end method

.method public n(J)Landroid/view/autofill/AutofillId;
    .locals 1

    .line 1
    iget-object v0, p0, Ld;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/contentcapture/ContentCaptureSession;

    .line 4
    .line 5
    iget-object p0, p0, Ld;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {v0, p0, p1, p2}, Landroid/view/contentcapture/ContentCaptureSession;->newAutofillId(Landroid/view/autofill/AutofillId;J)Landroid/view/autofill/AutofillId;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public o()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh10;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Ld;->f:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Ld;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ln;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v0}, Ln;->D0(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public p(IIZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/Window;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    or-int/2addr p1, p2

    .line 18
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    not-int p1, p1

    .line 31
    and-int/2addr p1, p2

    .line 32
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object p0, p0, Ld;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Landroid/view/WindowInsetsController;

    .line 39
    .line 40
    if-eqz p3, :cond_2

    .line 41
    .line 42
    invoke-interface {p0, p2, p2}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    const/4 p1, 0x0

    .line 47
    invoke-interface {p0, p1, p2}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public q(Z)V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0, v0, p1}, Ld;->p(IIZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public r(Z)V
    .locals 2

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1, p1}, Ld;->p(IIZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Ld;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Bounds{lower="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ld;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Li20;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, " upper="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Ld;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Li20;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, "}"

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_0
    .end packed-switch
.end method
