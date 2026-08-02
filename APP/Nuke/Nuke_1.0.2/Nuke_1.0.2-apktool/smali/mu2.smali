.class public final Lmu2;
.super Lru2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public c:Lc3;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(JLc3;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lru2;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lmu2;->c:Lc3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lru2;)V
    .locals 2

    .line 1
    sget-object v0, Ltl;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lmu2;

    .line 9
    .line 10
    iget-object v1, v1, Lmu2;->c:Lc3;

    .line 11
    .line 12
    iput-object v1, p0, Lmu2;->c:Lc3;

    .line 13
    .line 14
    move-object v1, p1

    .line 15
    check-cast v1, Lmu2;

    .line 16
    .line 17
    iget v1, v1, Lmu2;->d:I

    .line 18
    .line 19
    iput v1, p0, Lmu2;->d:I

    .line 20
    .line 21
    check-cast p1, Lmu2;

    .line 22
    .line 23
    iget p1, p1, Lmu2;->e:I

    .line 24
    .line 25
    iput p1, p0, Lmu2;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    monitor-exit v0

    .line 31
    throw p0
.end method

.method public final b(J)Lru2;
    .locals 1

    .line 1
    new-instance v0, Lmu2;

    .line 2
    .line 3
    iget-object p0, p0, Lmu2;->c:Lc3;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, p0}, Lmu2;-><init>(JLc3;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
