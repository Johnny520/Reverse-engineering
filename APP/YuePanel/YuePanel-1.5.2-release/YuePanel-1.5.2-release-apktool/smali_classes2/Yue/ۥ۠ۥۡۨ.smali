.class public final LYue/ۥ۠ۥۡۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۦ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,147:1\n1#2:148\n86#3:149\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n73#1:149\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,147:1\n1#2:148\n86#3:149\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n73#1:149\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/util/zip/Inflater;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:Z


# direct methods
.method public constructor <init>(LYue/ۥۣۣ۟۠;Ljava/util/zip/Inflater;)V
    .locals 1
    .param p1    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/util/zip/Inflater;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inflater"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥ۠ۥۡۨ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    iput-object p2, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۤ:Ljava/util/zip/Inflater;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۢ۟ۦ;Ljava/util/zip/Inflater;)V
    .locals 1
    .param p1    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/util/zip/Inflater;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inflater"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, LYue/ۥۣۡۡ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;

    move-result-object p1

    invoke-direct {p0, p1, p2}, LYue/ۥ۠ۥۡۨ;-><init>(LYue/ۥۣۣ۟۠;Ljava/util/zip/Inflater;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۦ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۤ:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۦ:Z

    iget-object v0, p0, LYue/ۥ۠ۥۡۨ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۢ۟ۦ;->close()V

    return-void
.end method

.method public ۥ()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۥۡۨ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۢ۟ۦ;->ۥ()LYue/ۥۢۡۤۧ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟(LYue/ۥۣ۟ۢۨ;J)J
    .locals 5
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_4

    iget-boolean v3, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۦ:Z

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    if-eqz v3, :cond_3

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    :try_start_0
    invoke-virtual {p1, v4}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۡ(I)LYue/ۥۡۧۨ;

    move-result-object v2

    iget v3, v2, LYue/ۥۡۧۨ;->ۥ۟۟:I

    rsub-int v3, v3, 0x2000

    int-to-long v3, v3

    invoke-static {p2, p3, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int p2, p2

    invoke-virtual {p0}, LYue/ۥ۠ۥۡۨ;->ۥ۟۟()Z

    iget-object p3, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۤ:Ljava/util/zip/Inflater;

    iget-object v3, v2, LYue/ۥۡۧۨ;->ۥ:[B

    iget v4, v2, LYue/ۥۡۧۨ;->ۥ۟۟:I

    invoke-virtual {p3, v3, v4, p2}, Ljava/util/zip/Inflater;->inflate([BII)I

    move-result p2

    invoke-virtual {p0}, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۟()V

    if-lez p2, :cond_1

    iget p3, v2, LYue/ۥۡۧۨ;->ۥ۟۟:I

    add-int/2addr p3, p2

    iput p3, v2, LYue/ۥۡۧۨ;->ۥ۟۟:I

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    int-to-long p2, p2

    add-long/2addr v0, p2

    invoke-virtual {p1, v0, v1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۧۥ(J)V

    return-wide p2

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    iget p2, v2, LYue/ۥۡۧۨ;->ۥ۟:I

    iget p3, v2, LYue/ۥۡۧۨ;->ۥ۟۟:I

    if-ne p2, p3, :cond_2

    invoke-virtual {v2}, LYue/ۥۡۧۨ;->ۥ۟()LYue/ۥۡۧۨ;

    move-result-object p2

    iput-object p2, p1, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v2}, LYue/ۥۡۧۨۡ;->ۥ۟۟۟(LYue/ۥۡۧۨ;)V
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-wide v0

    :goto_0
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

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

.method public final ۥ۟۟()Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۤ:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsInput()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۥۡۨ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۣ۟۠;->ۥۣ۟۟ۡ()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    iget-object v0, p0, LYue/ۥ۠ۥۡۨ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۣ۟۠;->ۥ۟۟۟ۡ()LYue/ۥۣ۟ۢۨ;

    move-result-object v0

    iget-object v0, v0, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget v2, v0, LYue/ۥۡۧۨ;->ۥ۟۟:I

    iget v3, v0, LYue/ۥۡۧۨ;->ۥ۟:I

    sub-int/2addr v2, v3

    iput v2, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۥ:I

    iget-object v4, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۤ:Ljava/util/zip/Inflater;

    iget-object v0, v0, LYue/ۥۡۧۨ;->ۥ:[B

    invoke-virtual {v4, v0, v3, v2}, Ljava/util/zip/Inflater;->setInput([BII)V

    return v1
.end method

.method public final ۥ۟۟۟()V
    .locals 4

    iget v0, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۥ:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۤ:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getRemaining()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۥ:I

    sub-int/2addr v1, v0

    iput v1, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۥ:I

    iget-object v1, p0, LYue/ۥ۠ۥۡۨ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    int-to-long v2, v0

    invoke-interface {v1, v2, v3}, LYue/ۥۣۣ۟۠;->skip(J)V

    return-void
.end method

.method public ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J
    .locals 4
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۠ۥۡۨ;->ۥ۟(LYue/ۥۣ۟ۢۨ;J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    return-wide v0

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۤ:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LYue/ۥ۠ۥۡۨ;->ۥ۟۟۠ۤ:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsDictionary()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, LYue/ۥ۠ۥۡۨ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۣ۟۠;->ۥۣ۟۟ۡ()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "source exhausted prematurely"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    const-wide/16 p1, -0x1

    return-wide p1
.end method
