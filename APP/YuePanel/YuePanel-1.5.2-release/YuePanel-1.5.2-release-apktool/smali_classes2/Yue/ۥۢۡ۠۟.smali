.class public final LYue/ۥۢۡ۠۟;
.super LYue/ۥۣ۟۟ۡ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.9"
.end annotation

.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"
    }
.end annotation

.annotation build LYue/ۥۢۥ۠ۧ;
    markerClass = {
        LYue/ۥ۠ۡۥۡ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"
.end annotation


# instance fields
.field public ۥ۟۟۟:J


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, LYue/ۥۣ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۣ۠۠;

    invoke-direct {p0, v0}, LYue/ۥۣ۟۟ۡ;-><init>(LYue/ۥۣ۠۠;)V

    invoke-virtual {p0}, LYue/ۥۣ۟۟ۡ;->ۥ()LYue/ۥ۟ۦۡۦ;

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۢۡ۠۟;->ۥ۟۟۟:J

    return-wide v0
.end method

.method public final ۥ۟۟۟ۡ(J)V
    .locals 4

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TestTimeSource will overflow if its reading "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, LYue/ۥۢۡ۠۟;->ۥ۟۟۟:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۣ۟۟ۡ;->ۥ۟۟۟()LYue/ۥۣ۠۠;

    move-result-object v2

    invoke-static {v2}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۢ(LYue/ۥۣ۠۠;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is advanced by "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۥۡ(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۟ۢ(J)V
    .locals 8

    invoke-virtual {p0}, LYue/ۥۣ۟۟ۡ;->ۥ۟۟۟()LYue/ۥۣ۠۠;

    move-result-object v0

    invoke-static {p1, p2, v0}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۥ(JLYue/ۥۣ۠۠;)J

    move-result-wide v0

    const-wide/16 v2, 0x1

    sub-long v4, v0, v2

    or-long/2addr v4, v2

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v4, v4, v6

    if-nez v4, :cond_1

    const/4 v0, 0x2

    invoke-static {p1, p2, v0}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۠۟(JI)J

    move-result-wide v0

    invoke-virtual {p0}, LYue/ۥۣ۟۟ۡ;->ۥ۟۟۟()LYue/ۥۣ۠۠;

    move-result-object v4

    invoke-static {v0, v1, v4}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۥ(JLYue/ۥۣ۠۠;)J

    move-result-wide v4

    sub-long/2addr v4, v2

    or-long/2addr v2, v4

    cmp-long v2, v2, v6

    if-nez v2, :cond_0

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۡ۠۟;->ۥ۟۟۟ۡ(J)V

    goto :goto_0

    :cond_0
    iget-wide v2, p0, LYue/ۥۢۡ۠۟;->ۥ۟۟۟:J

    :try_start_0
    invoke-virtual {p0, v0, v1}, LYue/ۥۢۡ۠۟;->ۥ۟۟۟ۢ(J)V

    invoke-static {p1, p2, v0, v1}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۤ(JJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۡ۠۟;->ۥ۟۟۟ۢ(J)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iput-wide v2, p0, LYue/ۥۢۡ۠۟;->ۥ۟۟۟:J

    throw p1

    :cond_1
    iget-wide v2, p0, LYue/ۥۢۡ۠۟;->ۥ۟۟۟:J

    add-long v4, v2, v0

    xor-long/2addr v0, v2

    const-wide/16 v6, 0x0

    cmp-long v0, v0, v6

    if-ltz v0, :cond_2

    xor-long v0, v2, v4

    cmp-long v0, v0, v6

    if-gez v0, :cond_2

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۡ۠۟;->ۥ۟۟۟ۡ(J)V

    :cond_2
    iput-wide v4, p0, LYue/ۥۢۡ۠۟;->ۥ۟۟۟:J

    :goto_0
    return-void
.end method
