.class public abstract Laq1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Laq1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Lop1;Lop1;[Lvj;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    sget-object v1, Laq1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string v0, "Dex_Cache_Sum_Sign"

    .line 22
    .line 23
    const-string v1, "hooker_debug_records"

    .line 24
    .line 25
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Leu;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Lop1;->g(Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Leu;->E()Lpb1;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v0, "security_mode"

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lpb1;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    array-length v0, p2

    .line 46
    :goto_0
    if-ge v2, v0, :cond_1

    .line 47
    .line 48
    aget-object v1, p2, v2

    .line 49
    .line 50
    invoke-virtual {v1}, Lvj;->d()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p1, v1}, Lpb1;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-static {p1}, Leu;->z(Lpb1;)Lpb1;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0, p1}, Lop1;->g(Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lnuke/data/cipher/NativeCrypto;->INSTANCE:Lnuke/data/cipher/NativeCrypto;

    .line 68
    .line 69
    invoke-virtual {p0}, Lnuke/data/cipher/NativeCrypto;->warmUpAsync()V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lsq1;->a:Lsq1;

    .line 73
    .line 74
    sget-object p1, Lup0;->i:Landroid/content/Context;

    .line 75
    .line 76
    if-eqz p1, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lsq1;->d(Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_2
    const-string p0, "hostContext"

    .line 83
    .line 84
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    throw p0
.end method
