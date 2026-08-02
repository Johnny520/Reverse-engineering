.class public final Ljs;
.super Lt70;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw70;


# static fields
.field public static final d:Ljs;

.field public static final e:Ljava/lang/String;

.field public static final f:Lhx2;

.field public static final g:Lhx2;

.field public static final h:Lhx2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljs;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ljs;->d:Ljs;

    .line 8
    .line 9
    const-string v0, "ChattingUi"

    .line 10
    .line 11
    sput-object v0, Ljs;->e:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Lc0;

    .line 14
    .line 15
    const/16 v1, 0x16

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lc0;-><init>(I)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lhx2;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Ljs;->f:Lhx2;

    .line 26
    .line 27
    new-instance v0, Lc0;

    .line 28
    .line 29
    const/16 v1, 0x17

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lc0;-><init>(I)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lhx2;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 37
    .line 38
    .line 39
    sput-object v1, Ljs;->g:Lhx2;

    .line 40
    .line 41
    new-instance v0, Lc0;

    .line 42
    .line 43
    const/16 v1, 0x18

    .line 44
    .line 45
    invoke-direct {v0, v1}, Lc0;-><init>(I)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Lhx2;

    .line 49
    .line 50
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 51
    .line 52
    .line 53
    sput-object v1, Ljs;->h:Lhx2;

    .line 54
    .line 55
    return-void
.end method

.method public static j(Ljava/lang/Object;)Landroid/view/View;
    .locals 4

    .line 1
    const-class v0, Landroid/view/View;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-virtual {v2}, Ln4;->r()Lhi0;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Lzf1;->b()V

    .line 13
    .line 14
    .line 15
    const-string v3, "itemView"

    .line 16
    .line 17
    iput-object v3, v2, Lzf1;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2}, Lhi0;->c()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lpi0;

    .line 28
    .line 29
    invoke-virtual {v2}, Lpi0;->g0()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    instance-of v3, v2, Landroid/view/View;

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    check-cast v2, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v2, v1

    .line 43
    goto :goto_1

    .line 44
    :goto_0
    new-instance v3, Lx92;

    .line 45
    .line 46
    invoke-direct {v3, v2}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object v2, v3

    .line 50
    :goto_1
    nop

    .line 51
    instance-of v3, v2, Lx92;

    .line 52
    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    move-object v2, v1

    .line 56
    :cond_1
    check-cast v2, Landroid/view/View;

    .line 57
    .line 58
    if-nez v2, :cond_5

    .line 59
    .line 60
    :try_start_1
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ln4;->r()Lhi0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Lzf1;->b()V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v2}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-nez v2, :cond_2

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    move-object v0, v2

    .line 83
    :goto_2
    iput-object v0, p0, Lhi0;->g:Ljava/lang/Class;

    .line 84
    .line 85
    invoke-virtual {p0}, Lhi0;->c()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, Lpi0;

    .line 94
    .line 95
    invoke-virtual {p0}, Lpi0;->g0()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    instance-of v0, p0, Landroid/view/View;

    .line 100
    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    check-cast p0, Landroid/view/View;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :catchall_1
    move-exception p0

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    move-object p0, v1

    .line 109
    goto :goto_4

    .line 110
    :goto_3
    new-instance v0, Lx92;

    .line 111
    .line 112
    invoke-direct {v0, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    move-object p0, v0

    .line 116
    :goto_4
    nop

    .line 117
    instance-of v0, p0, Lx92;

    .line 118
    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_4
    move-object v1, p0

    .line 123
    :goto_5
    move-object v2, v1

    .line 124
    check-cast v2, Landroid/view/View;

    .line 125
    .line 126
    :cond_5
    return-object v2
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    sget-object p0, Lis;->b:Lis;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    sget-object p0, Lfs;->b:Lfs;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    sget-object p0, Lhs;->b:Lhs;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Ljs;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
