.class public final Lyt0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyt0$a;,
        Lyt0$b;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lyt0$b;


# instance fields
.field private final hookerClassName:Ljava/lang/String;

.field private final hookerId:Ljava/lang/String;

.field private final phase:Ljava/lang/String;

.field private final reason:Ljava/lang/String;

.field private final stackTrace:Ljava/lang/String;

.field private final throwableClassName:Ljava/lang/String;

.field private final throwableMessage:Ljava/lang/String;

.field private final timestamp:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyt0$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyt0$b;-><init>(Lc50;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyt0;->Companion:Lyt0$b;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLdp2;)V
    .locals 2

    .line 1
    and-int/lit8 p11, p1, 0xf

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/16 v1, 0xf

    .line 5
    .line 6
    if-ne v1, p11, :cond_4

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lyt0;->hookerId:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Lyt0;->hookerClassName:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p4, p0, Lyt0;->phase:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p5, p0, Lyt0;->reason:Ljava/lang/String;

    .line 18
    .line 19
    and-int/lit8 p2, p1, 0x10

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    iput-object v0, p0, Lyt0;->throwableClassName:Ljava/lang/String;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iput-object p6, p0, Lyt0;->throwableClassName:Ljava/lang/String;

    .line 27
    .line 28
    :goto_0
    and-int/lit8 p2, p1, 0x20

    .line 29
    .line 30
    if-nez p2, :cond_1

    .line 31
    .line 32
    iput-object v0, p0, Lyt0;->throwableMessage:Ljava/lang/String;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iput-object p7, p0, Lyt0;->throwableMessage:Ljava/lang/String;

    .line 36
    .line 37
    :goto_1
    and-int/lit8 p2, p1, 0x40

    .line 38
    .line 39
    if-nez p2, :cond_2

    .line 40
    .line 41
    iput-object v0, p0, Lyt0;->stackTrace:Ljava/lang/String;

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    iput-object p8, p0, Lyt0;->stackTrace:Ljava/lang/String;

    .line 45
    .line 46
    :goto_2
    and-int/lit16 p1, p1, 0x80

    .line 47
    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    iput-wide p1, p0, Lyt0;->timestamp:J

    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    iput-wide p9, p0, Lyt0;->timestamp:J

    .line 58
    .line 59
    return-void

    .line 60
    :cond_4
    sget-object p0, Lyt0$a;->INSTANCE:Lyt0$a;

    .line 61
    .line 62
    invoke-virtual {p0}, Lyt0$a;->e()Lyo2;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p1, v1, p0}, Leu;->b0(IILyo2;)V

    .line 67
    .line 68
    .line 69
    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lyt0;->hookerId:Ljava/lang/String;

    .line 72
    iput-object p2, p0, Lyt0;->hookerClassName:Ljava/lang/String;

    .line 73
    iput-object p3, p0, Lyt0;->phase:Ljava/lang/String;

    .line 74
    iput-object p4, p0, Lyt0;->reason:Ljava/lang/String;

    .line 75
    iput-object p5, p0, Lyt0;->throwableClassName:Ljava/lang/String;

    .line 76
    iput-object p6, p0, Lyt0;->throwableMessage:Ljava/lang/String;

    .line 77
    iput-object p7, p0, Lyt0;->stackTrace:Ljava/lang/String;

    .line 78
    iput-wide p8, p0, Lyt0;->timestamp:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILc50;)V
    .locals 1

    and-int/lit8 p11, p10, 0x10

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_1

    move-object p6, v0

    :cond_1
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_2

    move-object p7, v0

    :cond_2
    and-int/lit16 p10, p10, 0x80

    if-eqz p10, :cond_3

    .line 79
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p8

    .line 80
    :cond_3
    invoke-direct/range {p0 .. p9}, Lyt0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public static synthetic j(Lyt0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lyt0;
    .locals 0

    .line 1
    and-int/lit8 p11, p10, 0x1

    .line 2
    .line 3
    if-eqz p11, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lyt0;->hookerId:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p11, p10, 0x2

    .line 8
    .line 9
    if-eqz p11, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lyt0;->hookerClassName:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p11, p10, 0x4

    .line 14
    .line 15
    if-eqz p11, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lyt0;->phase:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p11, p10, 0x8

    .line 20
    .line 21
    if-eqz p11, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Lyt0;->reason:Ljava/lang/String;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p11, p10, 0x10

    .line 26
    .line 27
    if-eqz p11, :cond_4

    .line 28
    .line 29
    iget-object p5, p0, Lyt0;->throwableClassName:Ljava/lang/String;

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p11, p10, 0x20

    .line 32
    .line 33
    if-eqz p11, :cond_5

    .line 34
    .line 35
    iget-object p6, p0, Lyt0;->throwableMessage:Ljava/lang/String;

    .line 36
    .line 37
    :cond_5
    and-int/lit8 p11, p10, 0x40

    .line 38
    .line 39
    if-eqz p11, :cond_6

    .line 40
    .line 41
    iget-object p7, p0, Lyt0;->stackTrace:Ljava/lang/String;

    .line 42
    .line 43
    :cond_6
    and-int/lit16 p10, p10, 0x80

    .line 44
    .line 45
    if-eqz p10, :cond_7

    .line 46
    .line 47
    iget-wide p8, p0, Lyt0;->timestamp:J

    .line 48
    .line 49
    :cond_7
    move-wide p10, p8

    .line 50
    move-object p8, p6

    .line 51
    move-object p9, p7

    .line 52
    move-object p6, p4

    .line 53
    move-object p7, p5

    .line 54
    move-object p4, p2

    .line 55
    move-object p5, p3

    .line 56
    move-object p2, p0

    .line 57
    move-object p3, p1

    .line 58
    invoke-virtual/range {p2 .. p11}, Lyt0;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lyt0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public static final synthetic s(Lyt0;Lwx;Lyo2;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyt0;->hookerId:Ljava/lang/String;

    .line 2
    .line 3
    check-cast p1, Ldv2;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, p2, v1, v0}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iget-object v1, p0, Lyt0;->hookerClassName:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1, p2, v0, v1}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    iget-object v1, p0, Lyt0;->phase:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, p2, v0, v1}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    iget-object v1, p0, Lyt0;->reason:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1, p2, v0, v1}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Lyt0;->throwableClassName:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    :goto_0
    sget-object v0, Lnv2;->a:Lnv2;

    .line 39
    .line 40
    iget-object v0, p0, Lyt0;->throwableClassName:Ljava/lang/String;

    .line 41
    .line 42
    const/4 v1, 0x4

    .line 43
    invoke-interface {p1, p2, v1, v0}, Lwx;->h(Lyo2;ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    iget-object v0, p0, Lyt0;->throwableMessage:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    :goto_1
    sget-object v0, Lnv2;->a:Lnv2;

    .line 58
    .line 59
    iget-object v0, p0, Lyt0;->throwableMessage:Ljava/lang/String;

    .line 60
    .line 61
    const/4 v1, 0x5

    .line 62
    invoke-interface {p1, p2, v1, v0}, Lwx;->h(Lyo2;ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    iget-object v0, p0, Lyt0;->stackTrace:Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    :goto_2
    sget-object v0, Lnv2;->a:Lnv2;

    .line 77
    .line 78
    iget-object v0, p0, Lyt0;->stackTrace:Ljava/lang/String;

    .line 79
    .line 80
    const/4 v1, 0x6

    .line 81
    invoke-interface {p1, p2, v1, v0}, Lwx;->h(Lyo2;ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_5
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_6
    iget-wide v0, p0, Lyt0;->timestamp:J

    .line 92
    .line 93
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 94
    .line 95
    .line 96
    move-result-wide v2

    .line 97
    cmp-long v0, v0, v2

    .line 98
    .line 99
    if-eqz v0, :cond_7

    .line 100
    .line 101
    :goto_3
    iget-wide v0, p0, Lyt0;->timestamp:J

    .line 102
    .line 103
    const/4 p0, 0x7

    .line 104
    invoke-virtual {p1, p2, p0, v0, v1}, Ldv2;->v(Lyo2;IJ)V

    .line 105
    .line 106
    .line 107
    :cond_7
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt0;->hookerId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt0;->hookerClassName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt0;->phase:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt0;->reason:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt0;->throwableClassName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lyt0;

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
    check-cast p1, Lyt0;

    .line 12
    .line 13
    iget-object v1, p0, Lyt0;->hookerId:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lyt0;->hookerId:Ljava/lang/String;

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
    iget-object v1, p0, Lyt0;->hookerClassName:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lyt0;->hookerClassName:Ljava/lang/String;

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
    iget-object v1, p0, Lyt0;->phase:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lyt0;->phase:Ljava/lang/String;

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
    iget-object v1, p0, Lyt0;->reason:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lyt0;->reason:Ljava/lang/String;

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
    iget-object v1, p0, Lyt0;->throwableClassName:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lyt0;->throwableClassName:Ljava/lang/String;

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
    iget-object v1, p0, Lyt0;->throwableMessage:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lyt0;->throwableMessage:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Lyt0;->stackTrace:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lyt0;->stackTrace:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget-wide v3, p0, Lyt0;->timestamp:J

    .line 91
    .line 92
    iget-wide p0, p1, Lyt0;->timestamp:J

    .line 93
    .line 94
    cmp-long p0, v3, p0

    .line 95
    .line 96
    if-eqz p0, :cond_9

    .line 97
    .line 98
    return v2

    .line 99
    :cond_9
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt0;->throwableMessage:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt0;->stackTrace:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lyt0;->timestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lyt0;->hookerId:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, Lyt0;->hookerClassName:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lyt0;->phase:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lyt0;->reason:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lyt0;->throwableClassName:Ljava/lang/String;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    move v2, v3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    :goto_0
    add-int/2addr v0, v2

    .line 40
    mul-int/2addr v0, v1

    .line 41
    iget-object v2, p0, Lyt0;->throwableMessage:Ljava/lang/String;

    .line 42
    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    move v2, v3

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    :goto_1
    add-int/2addr v0, v2

    .line 52
    mul-int/2addr v0, v1

    .line 53
    iget-object v2, p0, Lyt0;->stackTrace:Ljava/lang/String;

    .line 54
    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    :goto_2
    add-int/2addr v0, v3

    .line 63
    mul-int/2addr v0, v1

    .line 64
    iget-wide v1, p0, Lyt0;->timestamp:J

    .line 65
    .line 66
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    add-int/2addr p0, v0

    .line 71
    return p0
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lyt0;
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
    new-instance p0, Lyt0;

    .line 14
    .line 15
    invoke-direct/range {p0 .. p9}, Lyt0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final k()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt0;->hookerClassName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final l()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt0;->hookerId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt0;->phase:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt0;->reason:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt0;->stackTrace:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt0;->throwableClassName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt0;->throwableMessage:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lyt0;->timestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    .line 1
    iget-object v0, p0, Lyt0;->hookerId:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lyt0;->hookerClassName:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lyt0;->phase:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lyt0;->reason:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lyt0;->throwableClassName:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lyt0;->throwableMessage:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lyt0;->stackTrace:Ljava/lang/String;

    .line 14
    .line 15
    iget-wide v7, p0, Lyt0;->timestamp:J

    .line 16
    .line 17
    const-string p0, ", hookerClassName="

    .line 18
    .line 19
    const-string v9, ", phase="

    .line 20
    .line 21
    const-string v10, "HookerDebugRecord(hookerId="

    .line 22
    .line 23
    invoke-static {v10, v0, p0, v1, v9}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v0, ", reason="

    .line 28
    .line 29
    const-string v1, ", throwableClassName="

    .line 30
    .line 31
    invoke-static {p0, v2, v0, v3, v1}, Lhk1;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v0, ", throwableMessage="

    .line 35
    .line 36
    const-string v1, ", stackTrace="

    .line 37
    .line 38
    invoke-static {p0, v4, v0, v5, v1}, Lhk1;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, ", timestamp="

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ")"

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method
