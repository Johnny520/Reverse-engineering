.class public final Lfo1;
.super Lq2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lk21;


# static fields
.field public static final i:Lfo1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfo1;

    .line 2
    .line 3
    sget-object v1, Lsn;->K:Lsn;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq2;-><init>(Lz10;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lfo1;->i:Lfo1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final A(Lu00;)Ljava/lang/Object;
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

.method public final B(ZZLe2;)Lca0;
    .locals 0

    .line 1
    sget-object p0, Lgo1;->h:Lgo1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final c(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final j(Lr21;)Lms;
    .locals 0

    .line 1
    sget-object p0, Lgo1;->h:Lgo1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q()Ljava/util/concurrent/CancellationException;
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

.method public final start()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final t(Lin0;)Lca0;
    .locals 0

    .line 1
    sget-object p0, Lgo1;->h:Lgo1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "NonCancellable"

    .line 2
    .line 3
    return-object p0
.end method
