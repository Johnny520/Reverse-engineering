.class public final LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۟;
.super LYue/ۥ۠ۤۧۤ$ۥ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۧۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"
.end annotation


# instance fields
.field public ۥ۟۟۠ۦ:J

.field public final synthetic ۥ۟۟۠ۧ:LYue/ۥ۠ۤۧۤ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۤۧۤ;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۧۤ;

    invoke-direct {p0, p1}, LYue/ۥ۠ۤۧۤ$ۥ;-><init>(LYue/ۥ۠ۤۧۤ;)V

    iput-wide p2, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:J

    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-nez p1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۤۧۤ$ۥ;->ۥ۟۟۟()V

    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 4

    invoke-virtual {p0}, LYue/ۥ۠ۤۧۤ$ۥ;->ۥ۟()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0, v1}, LYue/ۥۣۢۥ۟;->ۥ۟۟۠ۦ(LYue/ۥۣۢ۟ۦ;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۧۤ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۠()LYue/ۥۡۦ۠ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۥ;->ۥۣ۟۟ۡ()V

    invoke-virtual {p0}, LYue/ۥ۠ۤۧۤ$ۥ;->ۥ۟۟۟()V

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LYue/ۥ۠ۤۧۤ$ۥ;->ۥ۟۟۟۟(Z)V

    return-void
.end method

.method public ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J
    .locals 7
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_4

    invoke-virtual {p0}, LYue/ۥ۠ۤۧۤ$ۥ;->ۥ۟()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_3

    iget-wide v2, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:J

    cmp-long v4, v2, v0

    const-wide/16 v5, -0x1

    if-nez v4, :cond_0

    return-wide v5

    :cond_0
    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, LYue/ۥ۠ۤۧۤ$ۥ;->ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J

    move-result-wide p1

    cmp-long p3, p1, v5

    if-eqz p3, :cond_2

    iget-wide v2, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:J

    sub-long/2addr v2, p1

    iput-wide v2, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:J

    cmp-long p3, v2, v0

    if-nez p3, :cond_1

    invoke-virtual {p0}, LYue/ۥ۠ۤۧۤ$ۥ;->ۥ۟۟۟()V

    :cond_1
    return-wide p1

    :cond_2
    iget-object p1, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۧۤ;

    invoke-virtual {p1}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۠()LYue/ۥۡۦ۠ۥ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۡۦ۠ۥ;->ۥۣ۟۟ۡ()V

    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠ۤۧۤ$ۥ;->ۥ۟۟۟()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount < 0: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
