.class public final LYue/ۥۣ۟ۢۨ$ۥ۟;
.super Ljava/io/InputStream;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n74#2:642\n86#2:643\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n*L\n126#1:642\n136#1:643\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۟()Ljava/io/InputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n74#2:642\n86#2:643\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n*L\n126#1:642\n136#1:643\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۟ۢۨ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۢۨ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۟ۢۨ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۢۨ;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public available()I
    .locals 4

    iget-object v0, p0, LYue/ۥۣ۟ۢۨ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    const v2, 0x7fffffff

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public read()I
    .locals 4

    .line 1
    iget-object v0, p0, LYue/ۥۣ۟ۢۨ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, LYue/ۥۣ۟ۢۨ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public read([BII)I
    .locals 1
    .param p1    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, LYue/ۥۣ۟ۢۨ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۣ۟ۢۨ;->read([BII)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LYue/ۥۣ۟ۢۨ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".inputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
