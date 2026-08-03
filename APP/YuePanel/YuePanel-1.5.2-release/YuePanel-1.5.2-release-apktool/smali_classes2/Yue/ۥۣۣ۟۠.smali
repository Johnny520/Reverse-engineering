.class public interface abstract LYue/ۥۣۣ۟۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۦ;
.implements Ljava/nio/channels/ReadableByteChannel;


# virtual methods
.method public abstract peek()LYue/ۥۣۣ۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end method

.method public abstract read([B)I
    .param p1    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract read([BII)I
    .param p1    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract readByte()B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract readFully([B)V
    .param p1    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract readInt()I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract readLong()J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract readShort()S
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract skip(J)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟۠()LYue/ۥۣ۟ۢۨ;
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "moved to val: use getBuffer() instead"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "buffer"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۡ()LYue/ۥۣ۟ۢۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end method

.method public abstract ۥۣ۟۟۟()Ljava/io/InputStream;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۥ(J)Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۠۟(J)LYue/ۥۣ۟ۥۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۠ۥ(LYue/ۥۣ۟ۥۤ;J)J
    .param p1    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۡ۟()[B
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥۣ۟۟ۡ()Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۡۤ(LYue/ۥۣ۟ۥۤ;J)J
    .param p1    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۡۥ(LYue/ۥۣۢ۟ۡ;)J
    .param p1    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۡۨ(BJ)J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۢ۟(JLYue/ۥۣ۟ۥۤ;II)Z
    .param p3    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۢ۠(BJJ)J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۢۡ()Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۢۤ()J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۢۦ(J)Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥۣ۟۟ۢ(LYue/ۥۣ۟ۥۤ;)J
    .param p1    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥۣ۟۟ۥ(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .param p1    # Ljava/nio/charset/Charset;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥۣ۟۟ۦ(LYue/ۥۣۡۤۥ;)I
    .param p1    # LYue/ۥۣۡۤۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥۣ۟۟ۧ()I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۤ۟(JLYue/ۥۣ۟ۥۤ;)Z
    .param p3    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۤ۠()LYue/ۥۣ۟ۥۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥۣ۟۟ۤ(J)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۤۧ()Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۥ()I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۥۣ(J)[B
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۥۤ()Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۥۥ(LYue/ۥۣ۟ۥۤ;)J
    .param p1    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۥۦ(LYue/ۥۣ۟ۢۨ;J)V
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۥۧ(JLjava/nio/charset/Charset;)Ljava/lang/String;
    .param p3    # Ljava/nio/charset/Charset;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۦ۠()S
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۦۢ()J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۦۥ(J)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۦۨ(B)J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۧ()J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
