.class public final LYue/ۥۡۦ۠ۢ$ۥ;
.super Ljava/io/OutputStream;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,142:1\n51#2:143\n51#2:144\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n*L\n111#1:143\n117#1:144\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۦ۠ۢ;->ۥ۟۟ۦۧ()Ljava/io/OutputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,142:1\n51#2:143\n51#2:144\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n*L\n111#1:143\n117#1:144\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;


# direct methods
.method public constructor <init>(LYue/ۥۡۦ۠ۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۦ۠ۢ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۦ۠ۢ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۢ;->close()V

    return-void
.end method

.method public flush()V
    .locals 2

    iget-object v0, p0, LYue/ۥۡۦ۠ۢ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;

    iget-boolean v1, v0, LYue/ۥۡۦ۠ۢ;->ۥ۟۟۠ۥ:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۢ;->flush()V

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LYue/ۥۡۦ۠ۢ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".outputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LYue/ۥۡۦ۠ۢ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;

    iget-boolean v1, v0, LYue/ۥۡۦ۠ۢ;->ۥ۟۟۠ۥ:Z

    if-nez v1, :cond_0

    .line 2
    iget-object v0, v0, LYue/ۥۡۦ۠ۢ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    int-to-byte p1, p1

    .line 3
    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۧ(I)LYue/ۥۣ۟ۢۨ;

    .line 4
    iget-object p1, p0, LYue/ۥۡۦ۠ۢ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;

    invoke-virtual {p1}, LYue/ۥۡۦ۠ۢ;->ۥۣ۟۟ۢ()LYue/ۥۣۣ۟۟;

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write([BII)V
    .locals 2
    .param p1    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, LYue/ۥۡۦ۠ۢ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;

    iget-boolean v1, v0, LYue/ۥۡۦ۠ۢ;->ۥ۟۟۠ۥ:Z

    if-nez v1, :cond_0

    .line 7
    iget-object v0, v0, LYue/ۥۡۦ۠ۢ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    .line 8
    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۦ([BII)LYue/ۥۣ۟ۢۨ;

    .line 9
    iget-object p1, p0, LYue/ۥۡۦ۠ۢ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦ۠ۢ;

    invoke-virtual {p1}, LYue/ۥۡۦ۠ۢ;->ۥۣ۟۟ۢ()LYue/ۥۣۣ۟۟;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
