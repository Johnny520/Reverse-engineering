.class public final Lwj0;
.super Lt;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lc40;


# static fields
.field public static final e:Lwj0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwj0;

    .line 2
    .line 3
    sget-object v1, Ln2;->I:Ln2;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lt;-><init>(Lok;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lwj0;->e:Lwj0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final g(Lj40;)Lde;
    .locals 0

    .line 1
    sget-object p0, Lxj0;->d:Lxj0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o()Ljava/util/concurrent/CancellationException;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final r(Lsw;)Lpo;
    .locals 0

    .line 1
    sget-object p0, Lxj0;->d:Lxj0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final start()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "NonCancellable"

    .line 2
    .line 3
    return-object p0
.end method

.method public final v(Ljk;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final w(ZZLf;)Lpo;
    .locals 0

    .line 1
    sget-object p0, Lxj0;->d:Lxj0;

    .line 2
    .line 3
    return-object p0
.end method
