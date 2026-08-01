.class public final Lx1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lqr;
.implements Lfv0;
.implements Lss0;
.implements Lhu;
.implements Lc8;


# static fields
.field public static final f:Lx1;


# instance fields
.field public final synthetic d:I

.field public e:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    new-instance v1, Lx1;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2, v0}, Lx1;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lx1;->f:Lx1;

    .line 15
    .line 16
    return-void

    .line 17
    :array_0
    .array-data 4
        0x3f652546    # 0.8951f
        -0x40bff2e5    # -0.7502f
        0x3d1f559b    # 0.0389f
        0x3e886595    # 0.2664f
        0x3fdb53f8    # 1.7135f
        -0x4273b646    # -0.0685f
        -0x41dab9f5    # -0.1614f
        0x3d1652bd    # 0.0367f
        0x3f83c9ef    # 1.0296f
    .end array-data
.end method

.method public constructor <init>(FF)V
    .locals 2

    const/16 v0, 0x1d

    iput v0, p0, Lx1;->d:I

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 157
    new-instance v0, Lfu;

    const v1, 0x3c23d70a    # 0.01f

    .line 158
    invoke-direct {v0, p1, p2, v1}, Lfu;-><init>(FFF)V

    .line 159
    iput-object v0, p0, Lx1;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(FFLb8;)V
    .locals 5

    const/16 v0, 0x1c

    iput v0, p0, Lx1;->d:I

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    invoke-virtual {p3}, Lb8;->b()I

    move-result v0

    new-array v1, v0, [Lfu;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 154
    new-instance v3, Lfu;

    invoke-virtual {p3, v2}, Lb8;->a(I)F

    move-result v4

    invoke-direct {v3, p1, p2, v4}, Lfu;-><init>(FFF)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 155
    :cond_0
    iput-object v1, p0, Lx1;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 1
    iput p1, p0, Lx1;->d:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    sparse-switch p1, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lb3;

    .line 11
    .line 12
    invoke-direct {p1}, Lb3;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lx1;->e:Ljava/lang/Object;

    .line 16
    .line 17
    return-void

    .line 18
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance p1, Landroid/graphics/Region;

    .line 22
    .line 23
    invoke-direct {p1}, Landroid/graphics/Region;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lx1;->e:Ljava/lang/Object;

    .line 27
    .line 28
    return-void

    .line 29
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance p1, Lub0;

    .line 33
    .line 34
    invoke-direct {p1}, Lub0;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lx1;->e:Ljava/lang/Object;

    .line 38
    .line 39
    return-void

    .line 40
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance p1, Ljo0;

    .line 44
    .line 45
    const/4 v0, 0x4

    .line 46
    invoke-direct {p1, v0}, Ljo0;-><init>(I)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lx1;->e:Ljava/lang/Object;

    .line 50
    .line 51
    return-void

    .line 52
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance p1, Ljava/util/ArrayList;

    .line 56
    .line 57
    const/16 v0, 0x20

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lx1;->e:Ljava/lang/Object;

    .line 63
    .line 64
    return-void

    .line 65
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    const/high16 v2, 0x3f400000    # 0.75f

    .line 72
    .line 73
    invoke-direct {p1, v1, v2, v0}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lx1;->e:Ljava/lang/Object;

    .line 77
    .line 78
    return-void

    .line 79
    :sswitch_5
    new-instance p1, Lbd0;

    .line 80
    .line 81
    invoke-direct {p1}, Lbd0;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Lx1;->e:Ljava/lang/Object;

    .line 88
    .line 89
    iget-boolean p0, p1, Lbd0;->e:Z

    .line 90
    .line 91
    if-eqz p0, :cond_0

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    iget-boolean p0, p1, Lbd0;->f:Z

    .line 95
    .line 96
    if-eqz p0, :cond_1

    .line 97
    .line 98
    const-string p0, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 99
    .line 100
    invoke-static {p0}, Lxr0;->a(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_1
    invoke-virtual {p1}, Lbd0;->a()V

    .line 104
    .line 105
    .line 106
    iput-boolean v0, p1, Lbd0;->f:Z

    .line 107
    .line 108
    :goto_0
    return-void

    .line 109
    :sswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    new-instance p1, Lh31;

    .line 113
    .line 114
    sget-object v0, Lrd0;->e:Lev;

    .line 115
    .line 116
    invoke-direct {p1, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 117
    .line 118
    .line 119
    iput-object p1, p0, Lx1;->e:Ljava/lang/Object;

    .line 120
    .line 121
    return-void

    .line 122
    nop

    .line 123
    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_6
        0xd -> :sswitch_5
        0xe -> :sswitch_4
        0x10 -> :sswitch_3
        0x12 -> :sswitch_2
        0x13 -> :sswitch_1
        0x18 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 128
    iput p1, p0, Lx1;->d:I

    iput-object p2, p0, Lx1;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 123
    iput p1, p0, Lx1;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lx1;->d:I

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lx1;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lym;)V
    .locals 2

    const/16 v0, 0x1a

    iput v0, p0, Lx1;->d:I

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    new-instance v0, Lau;

    .line 126
    sget v1, Lm31;->a:F

    .line 127
    invoke-direct {v0, v1, p1}, Lau;-><init>(FLym;)V

    iput-object v0, p0, Lx1;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([J)V
    .locals 5

    const/16 v0, 0x19

    iput v0, p0, Lx1;->d:I

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_4

    .line 130
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    .line 131
    new-instance v0, Lyg0;

    array-length v1, p1

    invoke-direct {v0, v1}, Lyg0;-><init>(I)V

    .line 132
    iget v1, v0, Lyg0;->b:I

    if-ltz v1, :cond_3

    .line 133
    array-length v2, p1

    if-nez v2, :cond_0

    goto :goto_0

    .line 134
    :cond_0
    array-length v2, p1

    add-int/2addr v2, v1

    .line 135
    iget-object v3, v0, Lyg0;->a:[J

    .line 136
    array-length v4, v3

    if-ge v4, v2, :cond_1

    .line 137
    array-length v4, v3

    mul-int/lit8 v4, v4, 0x3

    div-int/lit8 v4, v4, 0x2

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 138
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v2

    iput-object v2, v0, Lyg0;->a:[J

    .line 139
    :cond_1
    iget-object v2, v0, Lyg0;->a:[J

    .line 140
    iget v3, v0, Lyg0;->b:I

    if-eq v1, v3, :cond_2

    .line 141
    array-length v4, p1

    add-int/2addr v4, v1

    .line 142
    invoke-static {v2, v2, v4, v1, v3}, Lf9;->b0([J[JIII)V

    .line 143
    :cond_2
    array-length v3, p1

    const/4 v4, 0x0

    invoke-static {p1, v2, v1, v4, v3}, Lf9;->b0([J[JIII)V

    .line 144
    iget v1, v0, Lyg0;->b:I

    array-length p1, p1

    add-int/2addr v1, p1

    iput v1, v0, Lyg0;->b:I

    goto :goto_0

    .line 145
    :cond_3
    const-string p0, ""

    .line 146
    invoke-static {p0}, Lxc;->f(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    .line 147
    :cond_4
    new-instance v0, Lyg0;

    const/16 p1, 0x10

    .line 148
    invoke-direct {v0, p1}, Lyg0;-><init>(I)V

    .line 149
    :goto_0
    iput-object v0, p0, Lx1;->e:Ljava/lang/Object;

    return-void
.end method

.method public static t(Lx1;I)Lc80;
    .locals 10

    .line 1
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lc90;

    .line 4
    .line 5
    invoke-static {}, Lu50;->k()Ll21;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ll21;->e()Lsw;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    move-object v2, v0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    invoke-static {v1}, Lu50;->s(Ll21;)Ll21;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    :try_start_0
    iget-object v0, p0, Lc90;->f:Lgp0;

    .line 24
    .line 25
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lv80;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    invoke-static {v1, v3, v2}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 32
    .line 33
    .line 34
    iget-object v4, p0, Lc90;->p:Ld80;

    .line 35
    .line 36
    iget-wide v6, v0, Lv80;->j:J

    .line 37
    .line 38
    iget-boolean v8, p0, Lc90;->d:Z

    .line 39
    .line 40
    new-instance v9, Lpn;

    .line 41
    .line 42
    invoke-direct {v9, p1, v0}, Lpn;-><init>(ILv80;)V

    .line 43
    .line 44
    .line 45
    move v5, p1

    .line 46
    invoke-virtual/range {v4 .. v9}, Ld80;->a(IJZLsw;)Lc80;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    move-object p0, v0

    .line 53
    invoke-static {v1, v3, v2}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 54
    .line 55
    .line 56
    throw p0
.end method


# virtual methods
.method public a(Ls91;)V
    .locals 8

    .line 1
    new-instance v7, Lgj;

    .line 2
    .line 3
    const-string v0, "EmojiCompatInitializer"

    .line 4
    .line 5
    invoke-direct {v7, v0}, Lgj;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    new-instance v6, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 11
    .line 12
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    const-wide/16 v3, 0xf

    .line 18
    .line 19
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 20
    .line 21
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Ltr;

    .line 29
    .line 30
    invoke-direct {v1, p0, p1, v0}, Ltr;-><init>(Lx1;Ls91;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public b(Liu;Lik;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lu;

    .line 7
    .line 8
    iget v1, v0, Lu;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lu;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lu;-><init>(Lx1;Lik;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lu;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lu;->j:I

    .line 28
    .line 29
    sget-object v2, Lna1;->a:Lna1;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lu;->g:Lmw0;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_4

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Lmw0;

    .line 55
    .line 56
    invoke-interface {v0}, Lik;->e()Lpk;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-direct {p2, p1, v1}, Lmw0;-><init>(Liu;Lpk;)V

    .line 61
    .line 62
    .line 63
    :try_start_1
    iput-object p2, v0, Lu;->g:Lmw0;

    .line 64
    .line 65
    iput v3, v0, Lu;->j:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 66
    .line 67
    :try_start_2
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Lww;

    .line 70
    .line 71
    invoke-interface {p0, p2, v0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 75
    sget-object p1, Lzk;->d:Lzk;

    .line 76
    .line 77
    if-ne p0, p1, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move-object p0, v2

    .line 81
    :goto_1
    if-ne p0, p1, :cond_4

    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_4
    move-object p0, p2

    .line 85
    :goto_2
    invoke-virtual {p0}, Ljk;->n()V

    .line 86
    .line 87
    .line 88
    return-object v2

    .line 89
    :catchall_1
    move-exception p0

    .line 90
    move-object p1, p0

    .line 91
    :goto_3
    move-object p0, p2

    .line 92
    goto :goto_4

    .line 93
    :catchall_2
    move-exception p1

    .line 94
    goto :goto_3

    .line 95
    :goto_4
    invoke-virtual {p0}, Ljk;->n()V

    .line 96
    .line 97
    .line 98
    throw p1
.end method

.method public d()V
    .locals 1

    .line 1
    const-string p0, "DIAGNOSTIC_PROFILE_IS_COMPRESSED"

    .line 2
    .line 3
    const-string v0, "ProfileInstaller"

    .line 4
    .line 5
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e(Lb60;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lb60;->H()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DepthSortedSet.add called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lh31;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public f(ILjava/lang/Object;)V
    .locals 3

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, ""

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x6

    .line 37
    const-string v2, "ProfileInstaller"

    .line 38
    .line 39
    if-eq p1, v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x7

    .line 42
    if-eq p1, v1, :cond_0

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    if-eq p1, v1, :cond_0

    .line 47
    .line 48
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static {v2, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    :goto_1
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public g()V
    .locals 1

    .line 1
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    sget-object v0, Llp0;->b:Llp0;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public get(I)Leu;
    .locals 1

    .line 1
    iget v0, p0, Lx1;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lfu;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, [Lfu;

    .line 14
    .line 15
    aget-object p0, p0, p1

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method

.method public h()V
    .locals 0

    .line 1
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsi;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public i()Lw31;
    .locals 6

    .line 1
    invoke-static {}, Lrr;->a()Lrr;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lrr;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    new-instance p0, Lv00;

    .line 13
    .line 14
    invoke-direct {p0, v2}, Lv00;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {v1}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v3, Lzl;

    .line 25
    .line 26
    invoke-direct {v3, v1, p0}, Lzl;-><init>(Lgp0;Lx1;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, v0, Lrr;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 36
    .line 37
    .line 38
    :try_start_0
    iget p0, v0, Lrr;->c:I

    .line 39
    .line 40
    if-eq p0, v2, :cond_2

    .line 41
    .line 42
    iget p0, v0, Lrr;->c:I

    .line 43
    .line 44
    const/4 v2, 0x2

    .line 45
    if-ne p0, v2, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object p0, v0, Lrr;->b:Le9;

    .line 49
    .line 50
    invoke-virtual {p0, v3}, Le9;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    :goto_0
    iget-object p0, v0, Lrr;->d:Landroid/os/Handler;

    .line 57
    .line 58
    new-instance v2, Lpr;

    .line 59
    .line 60
    iget v4, v0, Lrr;->c:I

    .line 61
    .line 62
    filled-new-array {v3}, [Lzl;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    const/4 v5, 0x0

    .line 71
    invoke-direct {v2, v3, v4, v5}, Lpr;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    :goto_1
    iget-object p0, v0, Lrr;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 84
    .line 85
    .line 86
    return-object v1

    .line 87
    :goto_2
    iget-object v0, v0, Lrr;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 94
    .line 95
    .line 96
    throw p0
.end method

.method public j(F)V
    .locals 1

    .line 1
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    new-instance v0, Lsp0;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lsp0;-><init>(F)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public k(FFFF)V
    .locals 8

    .line 1
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lo8;->f()Lbd;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lo8;->h()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const/16 v3, 0x20

    .line 14
    .line 15
    shr-long/2addr v1, v3

    .line 16
    long-to-int v1, v1

    .line 17
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-float/2addr p3, p1

    .line 22
    sub-float/2addr v1, p3

    .line 23
    invoke-virtual {p0}, Lo8;->h()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    const-wide v6, 0xffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v4, v6

    .line 33
    long-to-int p3, v4

    .line 34
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    add-float/2addr p4, p2

    .line 39
    sub-float/2addr p3, p4

    .line 40
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result p4

    .line 44
    int-to-long v1, p4

    .line 45
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    int-to-long p3, p3

    .line 50
    shl-long/2addr v1, v3

    .line 51
    and-long/2addr p3, v6

    .line 52
    or-long/2addr p3, v1

    .line 53
    shr-long v1, p3, v3

    .line 54
    .line 55
    long-to-int v1, v1

    .line 56
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/4 v2, 0x0

    .line 61
    cmpl-float v1, v1, v2

    .line 62
    .line 63
    if-ltz v1, :cond_0

    .line 64
    .line 65
    and-long v3, p3, v6

    .line 66
    .line 67
    long-to-int v1, v3

    .line 68
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    cmpl-float v1, v1, v2

    .line 73
    .line 74
    if-ltz v1, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const-string v1, "Width and height must be greater than or equal to zero"

    .line 78
    .line 79
    invoke-static {v1}, Lv10;->a(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    invoke-virtual {p0, p3, p4}, Lo8;->q(J)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v0, p1, p2}, Lbd;->e(FF)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public l()J
    .locals 5

    .line 1
    iget v0, p0, Lx1;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lwv0;

    .line 9
    .line 10
    iget-wide v0, p0, Lwv0;->c:J

    .line 11
    .line 12
    return-wide v0

    .line 13
    :pswitch_0
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lum;

    .line 16
    .line 17
    iget-object v0, p0, Lum;->w:Lx1;

    .line 18
    .line 19
    invoke-virtual {v0}, Lx1;->l()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const-wide/16 v2, 0x10

    .line 24
    .line 25
    cmp-long v4, v0, v2

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v0, Luv0;->a:Lej;

    .line 31
    .line 32
    invoke-static {p0, v0}, Lpf1;->r(Lzi;Lat0;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lrv0;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-wide v0, v0, Lrv0;->a:J

    .line 41
    .line 42
    cmp-long v2, v0, v2

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    sget-object v0, Lxj;->a:Lej;

    .line 48
    .line 49
    invoke-static {p0, v0}, Lpf1;->r(Lzi;Lat0;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Lff;

    .line 54
    .line 55
    iget-wide v0, p0, Lff;->a:J

    .line 56
    .line 57
    :goto_0
    return-wide v0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public m(FF)V
    .locals 1

    .line 1
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    new-instance v0, Lop0;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Lop0;-><init>(FF)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public n(FF)V
    .locals 1

    .line 1
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    new-instance v0, Ltp0;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Ltp0;-><init>(FF)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public o(FF)V
    .locals 1

    .line 1
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    new-instance v0, Lpp0;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Lpp0;-><init>(FF)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public p(Landroid/view/View;IZ)V
    .locals 0

    .line 1
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/autofill/AutofillManager;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/autofill/AutofillManager;->notifyViewVisibilityChanged(Landroid/view/View;IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public q(Ld;Lw3;)Ld;
    .locals 38

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, Lx1;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lub0;

    .line 8
    .line 9
    new-instance v2, Lub0;

    .line 10
    .line 11
    iget-object v3, v0, Ld;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-direct {v2, v4}, Lub0;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/4 v6, 0x0

    .line 27
    :goto_0
    if-ge v6, v4, :cond_4

    .line 28
    .line 29
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    check-cast v7, Lpr0;

    .line 34
    .line 35
    iget-wide v8, v7, Lpr0;->a:J

    .line 36
    .line 37
    iget-object v10, v1, Lub0;->e:[J

    .line 38
    .line 39
    iget v11, v1, Lub0;->g:I

    .line 40
    .line 41
    invoke-static {v10, v11, v8, v9}, Lo30;->k([JIJ)I

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    if-ltz v10, :cond_0

    .line 46
    .line 47
    iget-object v11, v1, Lub0;->f:[Ljava/lang/Object;

    .line 48
    .line 49
    aget-object v10, v11, v10

    .line 50
    .line 51
    sget-object v11, Lrd0;->k:Ljava/lang/Object;

    .line 52
    .line 53
    if-ne v10, v11, :cond_1

    .line 54
    .line 55
    :cond_0
    const/4 v10, 0x0

    .line 56
    :cond_1
    check-cast v10, Lor0;

    .line 57
    .line 58
    if-nez v10, :cond_2

    .line 59
    .line 60
    iget-wide v10, v7, Lpr0;->b:J

    .line 61
    .line 62
    iget-wide v12, v7, Lpr0;->d:J

    .line 63
    .line 64
    move-wide/from16 v25, v10

    .line 65
    .line 66
    move-wide/from16 v27, v12

    .line 67
    .line 68
    const/16 v29, 0x0

    .line 69
    .line 70
    move-object/from16 v10, p2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    iget-wide v11, v10, Lor0;->a:J

    .line 74
    .line 75
    iget-boolean v13, v10, Lor0;->c:Z

    .line 76
    .line 77
    iget-wide v14, v10, Lor0;->b:J

    .line 78
    .line 79
    move-object/from16 v10, p2

    .line 80
    .line 81
    invoke-virtual {v10, v14, v15}, Lw3;->D(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide v14

    .line 85
    move-wide/from16 v25, v11

    .line 86
    .line 87
    move/from16 v29, v13

    .line 88
    .line 89
    move-wide/from16 v27, v14

    .line 90
    .line 91
    :goto_1
    iget-wide v11, v7, Lpr0;->a:J

    .line 92
    .line 93
    new-instance v16, Lnr0;

    .line 94
    .line 95
    iget-wide v13, v7, Lpr0;->b:J

    .line 96
    .line 97
    move v15, v6

    .line 98
    iget-wide v5, v7, Lpr0;->d:J

    .line 99
    .line 100
    move-object/from16 v36, v3

    .line 101
    .line 102
    iget-boolean v3, v7, Lpr0;->e:Z

    .line 103
    .line 104
    move/from16 v23, v3

    .line 105
    .line 106
    iget v3, v7, Lpr0;->f:F

    .line 107
    .line 108
    move/from16 v24, v3

    .line 109
    .line 110
    iget v3, v7, Lpr0;->g:I

    .line 111
    .line 112
    move/from16 v30, v3

    .line 113
    .line 114
    iget-object v3, v7, Lpr0;->i:Ljava/util/ArrayList;

    .line 115
    .line 116
    move-object/from16 v31, v3

    .line 117
    .line 118
    move/from16 v37, v4

    .line 119
    .line 120
    iget-wide v3, v7, Lpr0;->j:J

    .line 121
    .line 122
    move-wide/from16 v32, v3

    .line 123
    .line 124
    iget-wide v3, v7, Lpr0;->k:J

    .line 125
    .line 126
    move-wide/from16 v34, v3

    .line 127
    .line 128
    move-wide/from16 v21, v5

    .line 129
    .line 130
    move-wide/from16 v17, v11

    .line 131
    .line 132
    move-wide/from16 v19, v13

    .line 133
    .line 134
    invoke-direct/range {v16 .. v35}, Lnr0;-><init>(JJJZFJJZILjava/util/ArrayList;JJ)V

    .line 135
    .line 136
    .line 137
    move-object/from16 v5, v16

    .line 138
    .line 139
    move-wide/from16 v3, v17

    .line 140
    .line 141
    invoke-virtual {v2, v3, v4, v5}, Lub0;->b(JLjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    iget-boolean v3, v7, Lpr0;->e:Z

    .line 145
    .line 146
    if-eqz v3, :cond_3

    .line 147
    .line 148
    new-instance v16, Lor0;

    .line 149
    .line 150
    iget-wide v4, v7, Lpr0;->b:J

    .line 151
    .line 152
    iget-wide v6, v7, Lpr0;->c:J

    .line 153
    .line 154
    move/from16 v21, v3

    .line 155
    .line 156
    move-wide/from16 v17, v4

    .line 157
    .line 158
    move-wide/from16 v19, v6

    .line 159
    .line 160
    invoke-direct/range {v16 .. v21}, Lor0;-><init>(JJZ)V

    .line 161
    .line 162
    .line 163
    move-object/from16 v3, v16

    .line 164
    .line 165
    invoke-virtual {v1, v8, v9, v3}, Lub0;->b(JLjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_3
    invoke-virtual {v1, v8, v9}, Lub0;->c(J)V

    .line 170
    .line 171
    .line 172
    :goto_2
    add-int/lit8 v6, v15, 0x1

    .line 173
    .line 174
    move-object/from16 v3, v36

    .line 175
    .line 176
    move/from16 v4, v37

    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_4
    new-instance v1, Ld;

    .line 181
    .line 182
    const/4 v3, 0x5

    .line 183
    invoke-direct {v1, v3, v2, v0}, Ld;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    return-object v1
.end method

.method public r(Lb60;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lb60;->H()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DepthSortedSet.remove called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lh31;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public s(FFJ)V
    .locals 4

    .line 1
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lo8;->f()Lbd;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    shr-long v0, p3, v0

    .line 12
    .line 13
    long-to-int v0, v0

    .line 14
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p3, v2

    .line 24
    long-to-int p3, p3

    .line 25
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    invoke-interface {p0, v1, p4}, Lbd;->e(FF)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, p1, p2}, Lbd;->a(FF)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    neg-float p1, p1

    .line 40
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    neg-float p2, p2

    .line 45
    invoke-interface {p0, p1, p2}, Lbd;->e(FF)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lx1;->d:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

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
    :sswitch_0
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lh31;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :sswitch_1
    const-string p0, "Bradford"

    .line 21
    .line 22
    return-object p0

    .line 23
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x8 -> :sswitch_0
    .end sparse-switch
.end method

.method public u(FF)V
    .locals 0

    .line 1
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lo8;->f()Lbd;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0, p1, p2}, Lbd;->e(FF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public v(F)V
    .locals 1

    .line 1
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    new-instance v0, Lvp0;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lvp0;-><init>(F)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method
