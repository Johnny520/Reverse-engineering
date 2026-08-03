.class public final LYue/ۥ۠ۤ۠۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۡ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,153:1\n51#2:154\n1#3:155\n86#4:156\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n63#1:154\n131#1:156\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,153:1\n51#2:154\n1#3:155\n86#4:156\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n63#1:154\n131#1:156\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/util/zip/Deflater;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:LYue/ۥ۟ۨۧۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۦ:Z

.field public final ۥ۟۟۠ۧ:Ljava/util/zip/CRC32;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣۢ۟ۡ;)V
    .locals 3
    .param p1    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYue/ۥۡۦ۠ۢ;

    invoke-direct {v0, p1}, LYue/ۥۡۦ۠ۢ;-><init>(LYue/ۥۣۢ۟ۡ;)V

    iput-object v0, p0, LYue/ۥ۠ۤ۠۟;->ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;

    new-instance p1, Ljava/util/zip/Deflater;

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-direct {p1, v1, v2}, Ljava/util/zip/Deflater;-><init>(IZ)V

    iput-object p1, p0, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۠ۤ:Ljava/util/zip/Deflater;

    new-instance v1, LYue/ۥ۟ۨۧۨ;

    invoke-direct {v1, v0, p1}, LYue/ۥ۟ۨۧۨ;-><init>(LYue/ۥۣۣ۟۟;Ljava/util/zip/Deflater;)V

    iput-object v1, p0, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۨۧۨ;

    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۠ۧ:Ljava/util/zip/CRC32;

    iget-object p1, v0, LYue/ۥۡۦ۠ۢ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    const/16 v0, 0x1f8b

    invoke-virtual {p1, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۠۟ۢ(I)LYue/ۥۣ۟ۢۨ;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۧ(I)LYue/ۥۣ۟ۢۨ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۧ(I)LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p1, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۠۟(I)LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p1, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۧ(I)LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p1, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۧ(I)LYue/ۥۣ۟ۢۨ;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۠ۦ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۨۧۨ;

    invoke-virtual {v0}, LYue/ۥ۟ۨۧۨ;->ۥ۟۟()V

    invoke-virtual {p0}, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۟۟()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_0
    :try_start_1
    iget-object v1, p0, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۠ۤ:Ljava/util/zip/Deflater;

    invoke-virtual {v1}, Ljava/util/zip/Deflater;->end()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    if-nez v0, :cond_1

    move-object v0, v1

    :cond_1
    :goto_1
    :try_start_2
    iget-object v1, p0, LYue/ۥ۠ۤ۠۟;->ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;

    invoke-virtual {v1}, LYue/ۥۡۦ۠ۢ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v1

    if-nez v0, :cond_2

    move-object v0, v1

    :cond_2
    :goto_2
    const/4 v1, 0x1

    iput-boolean v1, p0, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۠ۦ:Z

    if-nez v0, :cond_3

    return-void

    :cond_3
    throw v0
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۨۧۨ;

    invoke-virtual {v0}, LYue/ۥ۟ۨۧۨ;->flush()V

    return-void
.end method

.method public ۥ()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤ۠۟;->ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۢ;->ۥ()LYue/ۥۢۡۤۧ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟()Ljava/util/zip/Deflater;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "deflater"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_deflater"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۠ۤ:Ljava/util/zip/Deflater;

    return-object v0
.end method

.method public final ۥ۟۟()Ljava/util/zip/Deflater;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "deflater"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۠ۤ:Ljava/util/zip/Deflater;

    return-object v0
.end method

.method public final ۥ۟۟۟(LYue/ۥۣ۟ۢۨ;J)V
    .locals 4

    iget-object p1, p1, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_0

    iget v0, p1, LYue/ۥۡۧۨ;->ۥ۟۟:I

    iget v1, p1, LYue/ۥۡۧۨ;->ۥ۟:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    iget-object v1, p0, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۠ۧ:Ljava/util/zip/CRC32;

    iget-object v2, p1, LYue/ۥۡۧۨ;->ۥ:[B

    iget v3, p1, LYue/ۥۡۧۨ;->ۥ۟:I

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/zip/CRC32;->update([BII)V

    int-to-long v0, v0

    sub-long/2addr p2, v0

    iget-object p1, p1, LYue/ۥۡۧۨ;->ۥ۟۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۥ۟۟۟۟()V
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۤ۠۟;->ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;

    iget-object v1, p0, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۠ۧ:Ljava/util/zip/CRC32;

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {v0, v1}, LYue/ۥۡۦ۠ۢ;->ۥ۟۟ۡۢ(I)LYue/ۥۣۣ۟۟;

    iget-object v0, p0, LYue/ۥ۠ۤ۠۟;->ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;

    iget-object v1, p0, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۠ۤ:Ljava/util/zip/Deflater;

    invoke-virtual {v1}, Ljava/util/zip/Deflater;->getBytesRead()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {v0, v1}, LYue/ۥۡۦ۠ۢ;->ۥ۟۟ۡۢ(I)LYue/ۥۣۣ۟۟;

    return-void
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V
    .locals 2
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۟(LYue/ۥۣ۟ۢۨ;J)V

    iget-object v0, p0, LYue/ۥ۠ۤ۠۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۨۧۨ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥ۟ۨۧۨ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V

    return-void

    :cond_1
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
