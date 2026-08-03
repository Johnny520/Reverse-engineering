.class public final Lw0/t;
.super Lw0/w;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public c:Lo0/c;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(JLo0/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lw0/w;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lw0/t;->c:Lo0/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lw0/w;)V
    .locals 2

    .line 1
    sget-object v0, Lw0/q;->a:Ljava/lang/Object;

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
    check-cast v1, Lw0/t;

    .line 9
    .line 10
    iget-object v1, v1, Lw0/t;->c:Lo0/c;

    .line 11
    .line 12
    iput-object v1, p0, Lw0/t;->c:Lo0/c;

    .line 13
    .line 14
    move-object v1, p1

    .line 15
    check-cast v1, Lw0/t;

    .line 16
    .line 17
    iget v1, v1, Lw0/t;->d:I

    .line 18
    .line 19
    iput v1, p0, Lw0/t;->d:I

    .line 20
    .line 21
    check-cast p1, Lw0/t;

    .line 22
    .line 23
    iget p1, p1, Lw0/t;->e:I

    .line 24
    .line 25
    iput p1, p0, Lw0/t;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    monitor-exit v0

    .line 31
    throw p1
.end method

.method public final b(J)Lw0/w;
    .locals 2

    .line 1
    new-instance v0, Lw0/t;

    .line 2
    .line 3
    iget-object v1, p0, Lw0/t;->c:Lo0/c;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, v1}, Lw0/t;-><init>(JLo0/c;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
