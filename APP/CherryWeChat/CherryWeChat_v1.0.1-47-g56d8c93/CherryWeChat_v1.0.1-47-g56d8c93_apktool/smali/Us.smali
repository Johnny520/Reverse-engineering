.class public final LUs;
.super Lv;
.source ""

# interfaces
.implements Ldm;


# static fields
.field public static final b:LUs;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LUs;

    sget-object v1, Lgf;->f:Lgf;

    invoke-direct {v0, v1}, Lv;-><init>(LZb;)V

    sput-object v0, LUs;->b:LUs;

    return-void
.end method


# virtual methods
.method public final d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final i(Lkm;)Lh9;
    .locals 0

    sget-object p1, LVs;->a:LVs;

    return-object p1
.end method

.method public final o(ZZLgm;)Lje;
    .locals 0

    sget-object p1, LVs;->a:LVs;

    return-object p1
.end method

.method public final p()Ljava/util/concurrent/CancellationException;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job is always active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final r(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    return-void
.end method

.method public final start()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonCancellable"

    return-object v0
.end method
