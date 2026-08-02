.class public abstract Lu21;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lt21;


# instance fields
.field public final a:Lf31;

.field public final b:Li51;

.field public final c:Ln4;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lt21;

    .line 2
    .line 3
    new-instance v1, Lf31;

    .line 4
    .line 5
    sget-object v8, Lzs;->j:Lzs;

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    const-string v5, "    "

    .line 12
    .line 13
    const-string v6, "type"

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    invoke-direct/range {v1 .. v9}, Lf31;-><init>(ZZZLjava/lang/String;Ljava/lang/String;ZLzs;Z)V

    .line 17
    .line 18
    .line 19
    sget-object v2, Lrg3;->m:Li51;

    .line 20
    .line 21
    invoke-direct {v0, v1, v2}, Lu21;-><init>(Lf31;Li51;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lu21;->d:Lt21;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Lf31;Li51;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu21;->a:Lf31;

    .line 5
    .line 6
    iput-object p2, p0, Lu21;->b:Li51;

    .line 7
    .line 8
    new-instance p1, Ln4;

    .line 9
    .line 10
    const/16 p2, 0xc

    .line 11
    .line 12
    invoke-direct {p1, p2}, Ln4;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lu21;->c:Ln4;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Lw41;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p0, p2}, Lxe1;->b(Lu21;Ljava/lang/String;)Lqb2;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance v0, Lcv2;

    .line 6
    .line 7
    sget-object v1, Lfg3;->j:Lfg3;

    .line 8
    .line 9
    invoke-interface {p1}, Lw41;->e()Lyo2;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v0, p0, v1, p2, v2}, Lcv2;-><init>(Lu21;Lfg3;Lqb2;Lyo2;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcv2;->c(Lw41;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p2}, Lqb2;->f()B

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/16 v0, 0xa

    .line 25
    .line 26
    if-ne p1, v0, :cond_0

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string p1, "Expected EOF after parsing, but had "

    .line 32
    .line 33
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p2, Lqb2;->g:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Ljava/lang/String;

    .line 39
    .line 40
    iget v0, p2, Lqb2;->b:I

    .line 41
    .line 42
    add-int/lit8 v0, v0, -0x1

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p1, " instead"

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const/4 p1, 0x0

    .line 61
    const/4 v0, 0x6

    .line 62
    invoke-static {p2, p0, p1, v0}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    throw p0
.end method

.method public final b(Lw41;Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldk;

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v2, v1}, Ldk;-><init>(BI)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lrq;->c:Lrq;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    iget-object v2, v1, Lrq;->a:Lag;

    .line 15
    .line 16
    invoke-virtual {v2}, Lag;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    move-object v2, v4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v2}, Lag;->removeLast()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_0
    check-cast v2, [C

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    iget v3, v1, Lrq;->b:I

    .line 34
    .line 35
    array-length v4, v2

    .line 36
    sub-int/2addr v3, v4

    .line 37
    iput v3, v1, Lrq;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    move-object v4, v2

    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    :goto_1
    monitor-exit v1

    .line 44
    if-nez v4, :cond_2

    .line 45
    .line 46
    const/16 v1, 0x80

    .line 47
    .line 48
    new-array v4, v1, [C

    .line 49
    .line 50
    :cond_2
    iput-object v4, v0, Ldk;->j:Ljava/lang/Object;

    .line 51
    .line 52
    :try_start_1
    new-instance v1, Ldv2;

    .line 53
    .line 54
    sget-object v2, Lfg3;->j:Lfg3;

    .line 55
    .line 56
    sget-object v3, Lfg3;->o:Lyf0;

    .line 57
    .line 58
    invoke-virtual {v3}, Lyf0;->a()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    new-array v3, v3, [Ldv2;

    .line 63
    .line 64
    iget-object v4, p0, Lu21;->a:Lf31;

    .line 65
    .line 66
    iget-boolean v4, v4, Lf31;->b:Z

    .line 67
    .line 68
    if-eqz v4, :cond_3

    .line 69
    .line 70
    new-instance v4, Lux;

    .line 71
    .line 72
    invoke-direct {v4, v0, p0}, Lux;-><init>(Ldk;Lu21;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    new-instance v4, Lox;

    .line 77
    .line 78
    invoke-direct {v4, v0}, Lox;-><init>(Ldk;)V

    .line 79
    .line 80
    .line 81
    :goto_2
    invoke-direct {v1, v4, p0, v2, v3}, Ldv2;-><init>(Lox;Lu21;Lfg3;[Ldv2;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, p1, p2}, Ldv2;->e(Lw41;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ldk;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 91
    invoke-virtual {v0}, Ldk;->p()V

    .line 92
    .line 93
    .line 94
    return-object p0

    .line 95
    :catchall_1
    move-exception p0

    .line 96
    invoke-virtual {v0}, Ldk;->p()V

    .line 97
    .line 98
    .line 99
    throw p0

    .line 100
    :goto_3
    monitor-exit v1

    .line 101
    throw p0
.end method
