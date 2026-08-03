.class public final LYue/ۥۣۡۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۡ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n86#2:240\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n55#1:240\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n86#2:240\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n55#1:240\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/io/OutputStream;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:LYue/ۥۢۡۤۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;LYue/ۥۢۡۤۧ;)V
    .locals 1
    .param p1    # Ljava/io/OutputStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۡۤۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "out"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡۥ;->ۥۣ۟۟۠:Ljava/io/OutputStream;

    iput-object p2, p0, LYue/ۥۣۡۥ;->ۥ۟۟۠ۤ:LYue/ۥۢۡۤۧ;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۥ;->ۥۣ۟۟۠:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۥ;->ۥۣ۟۟۠:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sink("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۣۡۥ;->ۥۣ۟۟۠:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۥ;->ۥ۟۟۠ۤ:LYue/ۥۢۡۤۧ;

    return-object v0
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V
    .locals 7
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, LYue/ۥ۟۟۠۟;->ۥ۟۟۟۟(JJJ)V

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_1

    iget-object v0, p0, LYue/ۥۣۡۥ;->ۥ۟۟۠ۤ:LYue/ۥۢۡۤۧ;

    invoke-virtual {v0}, LYue/ۥۢۡۤۧ;->ۥۣ۟۟۟()V

    iget-object v0, p1, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget v1, v0, LYue/ۥۡۧۨ;->ۥ۟۟:I

    iget v2, v0, LYue/ۥۡۧۨ;->ۥ۟:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    iget-object v2, p0, LYue/ۥۣۡۥ;->ۥۣ۟۟۠:Ljava/io/OutputStream;

    iget-object v3, v0, LYue/ۥۡۧۨ;->ۥ:[B

    iget v4, v0, LYue/ۥۡۧۨ;->ۥ۟:I

    invoke-virtual {v2, v3, v4, v1}, Ljava/io/OutputStream;->write([BII)V

    iget v2, v0, LYue/ۥۡۧۨ;->ۥ۟:I

    add-int/2addr v2, v1

    iput v2, v0, LYue/ۥۡۧۨ;->ۥ۟:I

    int-to-long v1, v1

    sub-long/2addr p2, v1

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v3

    sub-long/2addr v3, v1

    invoke-virtual {p1, v3, v4}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۧۥ(J)V

    iget v1, v0, LYue/ۥۡۧۨ;->ۥ۟:I

    iget v2, v0, LYue/ۥۡۧۨ;->ۥ۟۟:I

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, LYue/ۥۡۧۨ;->ۥ۟()LYue/ۥۡۧۨ;

    move-result-object v1

    iput-object v1, p1, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v0}, LYue/ۥۡۧۨۡ;->ۥ۟۟۟(LYue/ۥۡۧۨ;)V

    goto :goto_0

    :cond_1
    return-void
.end method
