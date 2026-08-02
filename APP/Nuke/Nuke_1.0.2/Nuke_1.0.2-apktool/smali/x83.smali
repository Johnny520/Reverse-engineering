.class public final Lx83;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx83$a;,
        Lx83$b;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lx83$b;


# instance fields
.field private final avatarFilePath:Ljava/lang/String;

.field private final config:Ljava/lang/String;

.field private final cookies:Ljava/lang/String;

.field private final deviceInfo:Lo70;

.field private final hostInfo:Lnu0;

.field private final lastLoginTime:J

.field private final loginUin:Ljava/lang/String;

.field private final nickname:Ljava/lang/String;

.field private final premium:Lt22;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lx83$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lx83$b;-><init>(Lc50;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lx83;->Companion:Lx83$b;

    .line 8
    .line 9
    sget v0, Lnu0;->$stable:I

    .line 10
    .line 11
    sget v1, Lo70;->$stable:I

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    sget v1, Lt22;->$stable:I

    .line 15
    .line 16
    or-int/2addr v0, v1

    .line 17
    sput v0, Lx83;->$stable:I

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(ILt22;Lo70;Lnu0;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldp2;)V
    .locals 1

    .line 1
    and-int/lit8 p12, p1, 0x3f

    .line 2
    .line 3
    const/16 v0, 0x3f

    .line 4
    .line 5
    if-ne v0, p12, :cond_3

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lx83;->premium:Lt22;

    .line 11
    .line 12
    iput-object p3, p0, Lx83;->deviceInfo:Lo70;

    .line 13
    .line 14
    iput-object p4, p0, Lx83;->hostInfo:Lnu0;

    .line 15
    .line 16
    iput-object p5, p0, Lx83;->loginUin:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p6, p0, Lx83;->nickname:Ljava/lang/String;

    .line 19
    .line 20
    iput-wide p7, p0, Lx83;->lastLoginTime:J

    .line 21
    .line 22
    and-int/lit8 p2, p1, 0x40

    .line 23
    .line 24
    const-string p3, ""

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    iput-object p3, p0, Lx83;->config:Ljava/lang/String;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iput-object p9, p0, Lx83;->config:Ljava/lang/String;

    .line 32
    .line 33
    :goto_0
    and-int/lit16 p2, p1, 0x80

    .line 34
    .line 35
    if-nez p2, :cond_1

    .line 36
    .line 37
    iput-object p3, p0, Lx83;->cookies:Ljava/lang/String;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    iput-object p10, p0, Lx83;->cookies:Ljava/lang/String;

    .line 41
    .line 42
    :goto_1
    and-int/lit16 p1, p1, 0x100

    .line 43
    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    iput-object p3, p0, Lx83;->avatarFilePath:Ljava/lang/String;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    iput-object p11, p0, Lx83;->avatarFilePath:Ljava/lang/String;

    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    sget-object p0, Lx83$a;->INSTANCE:Lx83$a;

    .line 53
    .line 54
    invoke-virtual {p0}, Lx83$a;->e()Lyo2;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p1, v0, p0}, Leu;->b0(IILyo2;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    throw p0
.end method

.method public constructor <init>(Lt22;Lo70;Lnu0;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lx83;->premium:Lt22;

    .line 65
    iput-object p2, p0, Lx83;->deviceInfo:Lo70;

    .line 66
    iput-object p3, p0, Lx83;->hostInfo:Lnu0;

    .line 67
    iput-object p4, p0, Lx83;->loginUin:Ljava/lang/String;

    .line 68
    iput-object p5, p0, Lx83;->nickname:Ljava/lang/String;

    .line 69
    iput-wide p6, p0, Lx83;->lastLoginTime:J

    .line 70
    iput-object p8, p0, Lx83;->config:Ljava/lang/String;

    .line 71
    iput-object p9, p0, Lx83;->cookies:Ljava/lang/String;

    .line 72
    iput-object p10, p0, Lx83;->avatarFilePath:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lt22;Lo70;Lnu0;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILc50;)V
    .locals 1

    and-int/lit8 p12, p11, 0x40

    .line 73
    const-string v0, ""

    if-eqz p12, :cond_0

    move-object p8, v0

    :cond_0
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_1

    move-object p9, v0

    :cond_1
    and-int/lit16 p11, p11, 0x100

    if-eqz p11, :cond_2

    move-object p10, v0

    :cond_2
    invoke-direct/range {p0 .. p10}, Lx83;-><init>(Lt22;Lo70;Lnu0;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic k(Lx83;Lt22;Lo70;Lnu0;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lx83;
    .locals 0

    .line 1
    and-int/lit8 p12, p11, 0x1

    .line 2
    .line 3
    if-eqz p12, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lx83;->premium:Lt22;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p12, p11, 0x2

    .line 8
    .line 9
    if-eqz p12, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lx83;->deviceInfo:Lo70;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p12, p11, 0x4

    .line 14
    .line 15
    if-eqz p12, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lx83;->hostInfo:Lnu0;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p12, p11, 0x8

    .line 20
    .line 21
    if-eqz p12, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Lx83;->loginUin:Ljava/lang/String;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p12, p11, 0x10

    .line 26
    .line 27
    if-eqz p12, :cond_4

    .line 28
    .line 29
    iget-object p5, p0, Lx83;->nickname:Ljava/lang/String;

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p12, p11, 0x20

    .line 32
    .line 33
    if-eqz p12, :cond_5

    .line 34
    .line 35
    iget-wide p6, p0, Lx83;->lastLoginTime:J

    .line 36
    .line 37
    :cond_5
    and-int/lit8 p12, p11, 0x40

    .line 38
    .line 39
    if-eqz p12, :cond_6

    .line 40
    .line 41
    iget-object p8, p0, Lx83;->config:Ljava/lang/String;

    .line 42
    .line 43
    :cond_6
    and-int/lit16 p12, p11, 0x80

    .line 44
    .line 45
    if-eqz p12, :cond_7

    .line 46
    .line 47
    iget-object p9, p0, Lx83;->cookies:Ljava/lang/String;

    .line 48
    .line 49
    :cond_7
    and-int/lit16 p11, p11, 0x100

    .line 50
    .line 51
    if-eqz p11, :cond_8

    .line 52
    .line 53
    iget-object p10, p0, Lx83;->avatarFilePath:Ljava/lang/String;

    .line 54
    .line 55
    :cond_8
    move-object p11, p9

    .line 56
    move-object p12, p10

    .line 57
    move-object p10, p8

    .line 58
    move-wide p8, p6

    .line 59
    move-object p6, p4

    .line 60
    move-object p7, p5

    .line 61
    move-object p4, p2

    .line 62
    move-object p5, p3

    .line 63
    move-object p2, p0

    .line 64
    move-object p3, p1

    .line 65
    invoke-virtual/range {p2 .. p12}, Lx83;->j(Lt22;Lo70;Lnu0;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lx83;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method public static final synthetic u(Lx83;Lwx;Lyo2;)V
    .locals 3

    .line 1
    sget-object v0, Lt22$a;->INSTANCE:Lt22$a;

    .line 2
    .line 3
    iget-object v1, p0, Lx83;->premium:Lt22;

    .line 4
    .line 5
    check-cast p1, Ldv2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1, p2, v2, v0, v1}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lo70$a;->INSTANCE:Lo70$a;

    .line 12
    .line 13
    iget-object v1, p0, Lx83;->deviceInfo:Lo70;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {p1, p2, v2, v0, v1}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lnu0$a;->INSTANCE:Lnu0$a;

    .line 20
    .line 21
    iget-object v1, p0, Lx83;->hostInfo:Lnu0;

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-virtual {p1, p2, v2, v0, v1}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    iget-object v1, p0, Lx83;->loginUin:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1, p2, v0, v1}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    iget-object v1, p0, Lx83;->nickname:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1, p2, v0, v1}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x5

    .line 40
    iget-wide v1, p0, Lx83;->lastLoginTime:J

    .line 41
    .line 42
    invoke-virtual {p1, p2, v0, v1, v2}, Ldv2;->v(Lyo2;IJ)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const-string v1, ""

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iget-object v0, p0, Lx83;->config:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    :goto_0
    iget-object v0, p0, Lx83;->config:Ljava/lang/String;

    .line 63
    .line 64
    const/4 v2, 0x6

    .line 65
    invoke-virtual {p1, p2, v2, v0}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    iget-object v0, p0, Lx83;->cookies:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_3

    .line 82
    .line 83
    :goto_1
    iget-object v0, p0, Lx83;->cookies:Ljava/lang/String;

    .line 84
    .line 85
    const/4 v2, 0x7

    .line 86
    invoke-virtual {p1, p2, v2, v0}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    iget-object v0, p0, Lx83;->avatarFilePath:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_5

    .line 103
    .line 104
    :goto_2
    iget-object p0, p0, Lx83;->avatarFilePath:Ljava/lang/String;

    .line 105
    .line 106
    const/16 v0, 0x8

    .line 107
    .line 108
    invoke-virtual {p1, p2, v0, p0}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_5
    return-void
.end method


# virtual methods
.method public final a()Lt22;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->premium:Lt22;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Lo70;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->deviceInfo:Lo70;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()Lnu0;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->hostInfo:Lnu0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->loginUin:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->nickname:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lx83;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lx83;

    .line 12
    .line 13
    iget-object v1, p0, Lx83;->premium:Lt22;

    .line 14
    .line 15
    iget-object v3, p1, Lx83;->premium:Lt22;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lx83;->deviceInfo:Lo70;

    .line 25
    .line 26
    iget-object v3, p1, Lx83;->deviceInfo:Lo70;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lx83;->hostInfo:Lnu0;

    .line 36
    .line 37
    iget-object v3, p1, Lx83;->hostInfo:Lnu0;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lx83;->loginUin:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lx83;->loginUin:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lx83;->nickname:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lx83;->nickname:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-wide v3, p0, Lx83;->lastLoginTime:J

    .line 69
    .line 70
    iget-wide v5, p1, Lx83;->lastLoginTime:J

    .line 71
    .line 72
    cmp-long v1, v3, v5

    .line 73
    .line 74
    if-eqz v1, :cond_7

    .line 75
    .line 76
    return v2

    .line 77
    :cond_7
    iget-object v1, p0, Lx83;->config:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v3, p1, Lx83;->config:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_8

    .line 86
    .line 87
    return v2

    .line 88
    :cond_8
    iget-object v1, p0, Lx83;->cookies:Ljava/lang/String;

    .line 89
    .line 90
    iget-object v3, p1, Lx83;->cookies:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_9

    .line 97
    .line 98
    return v2

    .line 99
    :cond_9
    iget-object p0, p0, Lx83;->avatarFilePath:Ljava/lang/String;

    .line 100
    .line 101
    iget-object p1, p1, Lx83;->avatarFilePath:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-nez p0, :cond_a

    .line 108
    .line 109
    return v2

    .line 110
    :cond_a
    return v0
.end method

.method public final f()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lx83;->lastLoginTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final g()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->config:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->cookies:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lx83;->premium:Lt22;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt22;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lx83;->deviceInfo:Lo70;

    .line 11
    .line 12
    invoke-virtual {v2}, Lo70;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lx83;->hostInfo:Lnu0;

    .line 19
    .line 20
    invoke-virtual {v0}, Lnu0;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-object v2, p0, Lx83;->loginUin:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, Lx83;->nickname:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-wide v2, p0, Lx83;->lastLoginTime:J

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, Lx83;->config:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, Lx83;->cookies:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object p0, p0, Lx83;->avatarFilePath:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    add-int/2addr p0, v0

    .line 63
    return p0
.end method

.method public final i()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->avatarFilePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j(Lt22;Lo70;Lnu0;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lx83;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance p0, Lx83;

    .line 26
    .line 27
    invoke-direct/range {p0 .. p10}, Lx83;-><init>(Lt22;Lo70;Lnu0;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public final l()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->avatarFilePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->config:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->cookies:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o()Lo70;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->deviceInfo:Lo70;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p()Lnu0;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->hostInfo:Lnu0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lx83;->lastLoginTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final r()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->loginUin:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final s()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->nickname:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final t()Lt22;
    .locals 0

    .line 1
    iget-object p0, p0, Lx83;->premium:Lt22;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    .line 1
    iget-object v0, p0, Lx83;->premium:Lt22;

    .line 2
    .line 3
    iget-object v1, p0, Lx83;->deviceInfo:Lo70;

    .line 4
    .line 5
    iget-object v2, p0, Lx83;->hostInfo:Lnu0;

    .line 6
    .line 7
    iget-object v3, p0, Lx83;->loginUin:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lx83;->nickname:Ljava/lang/String;

    .line 10
    .line 11
    iget-wide v5, p0, Lx83;->lastLoginTime:J

    .line 12
    .line 13
    iget-object v7, p0, Lx83;->config:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v8, p0, Lx83;->cookies:Ljava/lang/String;

    .line 16
    .line 17
    iget-object p0, p0, Lx83;->avatarFilePath:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v9, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v10, "User(premium="

    .line 22
    .line 23
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ", deviceInfo="

    .line 30
    .line 31
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, ", hostInfo="

    .line 38
    .line 39
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, ", loginUin="

    .line 46
    .line 47
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v0, ", nickname="

    .line 54
    .line 55
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, ", lastLoginTime="

    .line 62
    .line 63
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v9, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v0, ", config="

    .line 70
    .line 71
    const-string v1, ", cookies="

    .line 72
    .line 73
    invoke-static {v9, v0, v7, v1, v8}, Lhk1;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v0, ", avatarFilePath="

    .line 77
    .line 78
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p0, ")"

    .line 85
    .line 86
    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method
