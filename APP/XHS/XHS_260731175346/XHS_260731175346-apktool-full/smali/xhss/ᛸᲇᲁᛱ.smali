.class public final Lxhss/ᛸᲇᲁᛱ;
.super Lxhss/ᲇᛷᛲᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᲇᲀᛷ;
.implements Lxhss/ᛱᛴᛶᛴ;


# static fields
.field public static final synthetic ᛸᛲᲀᛵ:J


# instance fields
.field private volatile synthetic _reusableCancellableContinuation$volatile:Ljava/lang/Object;

.field public final ᛷᛴᛷᛱ:Lxhss/ᛲᛶᲇᲇ;

.field public final ᛸᛴᛶᛳ:Ljava/lang/Object;

.field public ᲀᲇᛳᲁ:Ljava/lang/Object;

.field public final ᲇᛶᛴᲀ:Lxhss/ᛸᛴᛳᛷ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, Lxhss/ᛸᲇᲁᛱ;

    .line 4
    .line 5
    const-string v2, "_reusableCancellableContinuation$volatile"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lxhss/ᛸᲇᲁᛱ;->ᛸᛲᲀᛵ:J

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lxhss/ᛲᛶᲇᲇ;Lxhss/ᛸᛴᛳᛷ;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, v0}, Lxhss/ᲇᛷᛲᛱ;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lxhss/ᛸᲇᲁᛱ;->ᛷᛴᛷᛱ:Lxhss/ᛲᛶᲇᲇ;

    .line 6
    .line 7
    iput-object p2, p0, Lxhss/ᛸᲇᲁᛱ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛴᛳᛷ;

    .line 8
    .line 9
    sget-object p1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛲᛷᛵ;

    .line 10
    .line 11
    iput-object p1, p0, Lxhss/ᛸᲇᲁᛱ;->ᲀᲇᛳᲁ:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p1, p2, Lxhss/ᛸᛴᛳᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛵᛳᛵ;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    sget-object v0, Lxhss/ᛶᲈᛴᛲ;->ᲇᛶᛴᲀ:Lxhss/ᲁᛱᲀᛲ;

    .line 21
    .line 22
    invoke-interface {p1, p2, v0}, Lxhss/ᛴᛵᛳᛵ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lxhss/ᛸᲇᲁᛱ;->ᛸᛴᛶᛳ:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DispatchedContinuation["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lxhss/ᛸᲇᲁᛱ;->ᛷᛴᛷᛱ:Lxhss/ᛲᛶᲇᲇ;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lxhss/ᛸᲇᲁᛱ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛴᛳᛷ;

    .line 19
    .line 20
    invoke-static {p0}, Lxhss/ᛶᛵᛱ;->ᛲᛴᲀᲈ(Lxhss/ᛱᛴᛶᛴ;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 p0, 0x5d

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final ᛱᛱᛲᲇ()Lxhss/ᛱᛴᛶᛴ;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final ᛷᛴᛷᛱ()Lxhss/ᛱᲇᲀᛷ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛸᲇᲁᛱ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛴᛳᛷ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛸᛲᲀᛵ()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛸᲇᲁᛱ;->ᲀᲇᛳᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛲᛷᛵ;

    .line 4
    .line 5
    iput-object v1, p0, Lxhss/ᛸᲇᲁᛱ;->ᲀᲇᛳᲁ:Ljava/lang/Object;

    .line 6
    .line 7
    return-object v0
.end method

.method public final ᛸᛴᛶᛳ(Ljava/lang/Object;)V
    .locals 9

    .line 1
    invoke-static {p1}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    move-object v2, p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v2, Lxhss/ᛷᲁᲇᛷ;

    .line 11
    .line 12
    invoke-direct {v2, v0, v1}, Lxhss/ᛷᲁᲇᛷ;-><init>(Ljava/lang/Throwable;Z)V

    .line 13
    .line 14
    .line 15
    :goto_0
    iget-object v0, p0, Lxhss/ᛸᲇᲁᛱ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛴᛳᛷ;

    .line 16
    .line 17
    iget-object v3, v0, Lxhss/ᛸᛴᛳᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛵᛳᛵ;

    .line 18
    .line 19
    iget-object v4, p0, Lxhss/ᛸᲇᲁᛱ;->ᛷᛴᛷᛱ:Lxhss/ᛲᛶᲇᲇ;

    .line 20
    .line 21
    invoke-virtual {v4, v3}, Lxhss/ᛲᛶᲇᲇ;->ᛸᛶᲈᛶ(Lxhss/ᛴᛵᛳᛵ;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    iput-object v2, p0, Lxhss/ᛸᲇᲁᛱ;->ᲀᲇᛳᲁ:Ljava/lang/Object;

    .line 28
    .line 29
    iput v1, p0, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ:I

    .line 30
    .line 31
    invoke-virtual {v4, v3, p0}, Lxhss/ᛲᛶᲇᲇ;->ᛷᲁᲁ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    invoke-static {}, Lxhss/ᲀᛵᛷᛳ;->ᛷᛵᛵᲈ()Lxhss/ᛵᛸᛲᛲ;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-wide v5, v4, Lxhss/ᛵᛸᛲᛲ;->ᛳᲁᲇᛸ:J

    .line 40
    .line 41
    const-wide v7, 0x100000000L

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    cmp-long v5, v5, v7

    .line 47
    .line 48
    if-ltz v5, :cond_3

    .line 49
    .line 50
    iput-object v2, p0, Lxhss/ᛸᲇᲁᛱ;->ᲀᲇᛳᲁ:Ljava/lang/Object;

    .line 51
    .line 52
    iput v1, p0, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ:I

    .line 53
    .line 54
    iget-object p1, v4, Lxhss/ᛵᛸᛲᛲ;->ᛷᛴᛷᛱ:Lxhss/ᛸᲀᛷᛷ;

    .line 55
    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    new-instance p1, Lxhss/ᛸᲀᛷᛷ;

    .line 59
    .line 60
    invoke-direct {p1}, Lxhss/ᛸᲀᛷᛷ;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, v4, Lxhss/ᛵᛸᛲᛲ;->ᛷᛴᛷᛱ:Lxhss/ᛸᲀᛷᛷ;

    .line 64
    .line 65
    :cond_2
    invoke-virtual {p1, p0}, Lxhss/ᛸᲀᛷᛷ;->addLast(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    const/4 v1, 0x1

    .line 70
    invoke-virtual {v4, v1}, Lxhss/ᛵᛸᛲᛲ;->ᛳᛶᛷᲀ(Z)V

    .line 71
    .line 72
    .line 73
    :try_start_0
    iget-object v1, p0, Lxhss/ᛸᲇᲁᛱ;->ᛸᛴᛶᛳ:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-static {v3, v1}, Lxhss/ᛶᲈᛴᛲ;->ᲁᛲᛴᛴ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    :try_start_1
    invoke-virtual {v0, p1}, Lxhss/ᛷᛲᛳᛴ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    .line 81
    .line 82
    :try_start_2
    invoke-static {v3, v1}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_4
    invoke-virtual {v4}, Lxhss/ᛵᛸᛲᛲ;->ᲁᛴᲇᛲ()Z

    .line 86
    .line 87
    .line 88
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    if-nez p1, :cond_4

    .line 90
    .line 91
    :goto_1
    invoke-virtual {v4}, Lxhss/ᛵᛸᛲᛲ;->ᛳᲈᲈᛲ()V

    .line 92
    .line 93
    .line 94
    goto :goto_3

    .line 95
    :catchall_0
    move-exception p1

    .line 96
    goto :goto_2

    .line 97
    :catchall_1
    move-exception p1

    .line 98
    :try_start_3
    invoke-static {v3, v1}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 102
    :goto_2
    :try_start_4
    invoke-virtual {p0, p1}, Lxhss/ᲇᛷᛲᛱ;->ᲀᲇᛳᲁ(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :goto_3
    return-void

    .line 107
    :catchall_2
    move-exception p0

    .line 108
    invoke-virtual {v4}, Lxhss/ᛵᛸᛲᛲ;->ᛳᲈᲈᛲ()V

    .line 109
    .line 110
    .line 111
    throw p0
.end method

.method public final ᲇᛶᛴᲀ()Lxhss/ᛴᛵᛳᛵ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛸᲇᲁᛱ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛴᛳᛷ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛸᛴᛳᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛵᛳᛵ;

    .line 4
    .line 5
    return-object p0
.end method
