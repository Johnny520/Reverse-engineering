.class public final LVc;
.super Lyg;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final b:LVc;

.field public static final c:Lbc;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LVc;

    invoke-direct {v0}, Lbc;-><init>()V

    sput-object v0, LVc;->b:LVc;

    sget-object v0, LZC;->b:LZC;

    sget v1, LeA;->a:I

    const/16 v2, 0x40

    if-ge v2, v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const/16 v2, 0xc

    const-string v3, "kotlinx.coroutines.io.parallelism"

    invoke-static {v3, v1, v2}, LQj;->H(Ljava/lang/String;II)I

    move-result v1

    invoke-virtual {v0, v1}, LZC;->v(I)Lbc;

    move-result-object v0

    sput-object v0, LVc;->c:Lbc;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot be invoked on Dispatchers.IO"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, LIf;->a:LIf;

    invoke-virtual {p0, v0, p1}, LVc;->t(Lac;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final t(Lac;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, LVc;->c:Lbc;

    invoke-virtual {v0, p1, p2}, Lbc;->t(Lac;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method
