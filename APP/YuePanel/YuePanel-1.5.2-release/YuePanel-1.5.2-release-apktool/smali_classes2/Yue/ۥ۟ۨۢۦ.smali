.class public final LYue/ۥ۟ۨۢۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۨۢۦ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ:Ljava/util/regex/Pattern;

.field public static final ۥ۟:Ljava/nio/charset/Charset;

.field public static final ۥ۟۟:Ljava/lang/String;

.field public static final ۥ۟۟۟:I = 0x1400

.field public static final ۥ۟۟۟۟:[C

.field public static final ۥ۟۟۟۠:I = 0x20


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "(?i)\\bcharset=\\s*(?:[\"\'])?([^\\s,;\"\']*)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۨۢۦ;->ۥ:Ljava/util/regex/Pattern;

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۨۢۦ;->ۥ۟:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۨۢۦ;->ۥ۟۟:Ljava/lang/String;

    const-string v0, "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۨۢۦ;->ۥ۟۟۟۟:[C

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const v0, 0x8000

    new-array v0, v0, [B

    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۥ۟(Ljava/nio/ByteBuffer;)LYue/ۥ۟ۨۢۦ$ۥ;
    .locals 8

    invoke-virtual {p0}, Ljava/nio/Buffer;->mark()Ljava/nio/Buffer;

    const/4 v0, 0x4

    new-array v1, v0, [B

    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    if-lt v2, v0, :cond_0

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    :cond_0
    const/4 p0, 0x0

    aget-byte v0, v1, p0

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, -0x1

    const/4 v5, -0x2

    const/4 v6, 0x1

    if-nez v0, :cond_1

    aget-byte v7, v1, v6

    if-nez v7, :cond_1

    aget-byte v7, v1, v3

    if-ne v7, v5, :cond_1

    aget-byte v7, v1, v2

    if-eq v7, v4, :cond_2

    :cond_1
    if-ne v0, v4, :cond_3

    aget-byte v7, v1, v6

    if-ne v7, v5, :cond_3

    aget-byte v7, v1, v3

    if-nez v7, :cond_3

    aget-byte v2, v1, v2

    if-nez v2, :cond_3

    :cond_2
    new-instance v0, LYue/ۥ۟ۨۢۦ$ۥ;

    const-string v1, "UTF-32"

    invoke-direct {v0, v1, p0}, LYue/ۥ۟ۨۢۦ$ۥ;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :cond_3
    if-ne v0, v5, :cond_4

    aget-byte v2, v1, v6

    if-eq v2, v4, :cond_5

    :cond_4
    if-ne v0, v4, :cond_6

    aget-byte v2, v1, v6

    if-ne v2, v5, :cond_6

    :cond_5
    new-instance v0, LYue/ۥ۟ۨۢۦ$ۥ;

    const-string v1, "UTF-16"

    invoke-direct {v0, v1, p0}, LYue/ۥ۟ۨۢۦ$ۥ;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :cond_6
    const/16 p0, -0x11

    if-ne v0, p0, :cond_7

    aget-byte p0, v1, v6

    const/16 v0, -0x45

    if-ne p0, v0, :cond_7

    aget-byte p0, v1, v3

    const/16 v0, -0x41

    if-ne p0, v0, :cond_7

    new-instance p0, LYue/ۥ۟ۨۢۦ$ۥ;

    const-string v0, "UTF-8"

    invoke-direct {p0, v0, v6}, LYue/ۥ۟ۨۢۦ$ۥ;-><init>(Ljava/lang/String;Z)V

    return-object p0

    :cond_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۥ۟۟()Ljava/nio/ByteBuffer;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    sget-object v1, LYue/ۥ۟ۨۢۦ;->ۥ:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string v0, "charset="

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۟ۨۢۦ;->ۥ۟۟۟ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0
.end method

.method public static ۥ۟۟۟۟(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠۟ۧۥ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {}, LYue/ۥۣۡۧۦ;->ۥ۟۟۟()LYue/ۥۣۡۧۦ;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, LYue/ۥ۟ۨۢۦ;->ۥ۟۟۟۠(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;LYue/ۥۣۡۧۦ;)LYue/ۥ۠۟ۧۥ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۠(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;LYue/ۥۣۡۧۦ;)LYue/ۥ۠۟ۧۥ;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۡۢۤۨ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ".gz"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, ".z"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v1

    const/16 v2, 0x1f

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v2, 0x8b

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    if-eqz v1, :cond_2

    new-instance v0, Ljava/util/zip/GZIPInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    :cond_3
    :goto_1
    invoke-static {v0, p1, p2, p3}, LYue/ۥ۟ۨۢۦ;->ۥ۟۟۟ۤ(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;LYue/ۥۣۡۧۦ;)LYue/ۥ۠۟ۧۥ;

    move-result-object p0

    return-object p0

    :goto_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    throw p0
.end method

.method public static ۥ۟۟۟ۡ(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠۟ۧۥ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {}, LYue/ۥۣۡۧۦ;->ۥ۟۟۟()LYue/ۥۣۡۧۦ;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, LYue/ۥ۟ۨۢۦ;->ۥ۟۟۟ۤ(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;LYue/ۥۣۡۧۦ;)LYue/ۥ۠۟ۧۥ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۢ(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;LYue/ۥۣۡۧۦ;)LYue/ۥ۠۟ۧۥ;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, LYue/ۥ۟ۨۢۦ;->ۥ۟۟۟ۤ(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;LYue/ۥۣۡۧۦ;)LYue/ۥ۠۟ۧۥ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥۣ۟۟۟()Ljava/lang/String;
    .locals 5

    invoke-static {}, LYue/ۥۢ۠ۡۤ;->ۥ۟()Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x20

    if-ge v2, v3, :cond_0

    sget-object v3, LYue/ۥ۟ۨۢۦ;->ۥ۟۟۟۟:[C

    array-length v4, v3

    invoke-virtual {v1, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    aget-char v3, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۠۠(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟۟۟ۤ(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;LYue/ۥۣۡۧۦ;)LYue/ۥ۠۟ۧۥ;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "charset"

    if-nez p0, :cond_0

    new-instance p0, LYue/ۥ۠۟ۧۥ;

    invoke-direct {p0, p2}, LYue/ۥ۠۟ۧۥ;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_0
    const v1, 0x8000

    const/4 v2, 0x0

    invoke-static {p0, v1, v2}, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۟ۢ(Ljava/io/InputStream;II)LYue/ۥ۟ۧۥۧ;

    move-result-object p0

    :try_start_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->mark(I)V

    const/16 v3, 0x13ff

    invoke-static {p0, v3}, LYue/ۥ۟ۨۢۦ;->ۥ۟۟۟ۥ(Ljava/io/InputStream;I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v4

    const/4 v5, -0x1

    const/4 v6, 0x1

    if-ne v4, v5, :cond_1

    move v4, v6

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_0
    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V

    invoke-static {v3}, LYue/ۥ۟ۨۢۦ;->ۥ۟(Ljava/nio/ByteBuffer;)LYue/ۥ۟ۨۢۦ$ۥ;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-static {v5}, LYue/ۥ۟ۨۢۦ$ۥ;->ۥ(LYue/ۥ۟ۨۢۦ$ۥ;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_a

    :cond_2
    :goto_1
    const/4 v7, 0x0

    if-nez p1, :cond_d

    :try_start_1
    sget-object v8, LYue/ۥ۟ۨۢۦ;->ۥ۟:Ljava/nio/charset/Charset;

    invoke-virtual {v8, v3}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/CharBuffer;->hasArray()Z

    move-result v8

    if-eqz v8, :cond_3

    new-instance v8, Ljava/io/CharArrayReader;

    invoke-virtual {v3}, Ljava/nio/CharBuffer;->array()[C

    move-result-object v9

    invoke-virtual {v3}, Ljava/nio/CharBuffer;->arrayOffset()I

    move-result v10

    invoke-virtual {v3}, Ljava/nio/Buffer;->limit()I

    move-result v3

    invoke-direct {v8, v9, v10, v3}, Ljava/io/CharArrayReader;-><init>([CII)V

    invoke-virtual {p3, v8, p2}, LYue/ۥۣۡۧۦ;->ۥ۟۟۟ۨ(Ljava/io/Reader;Ljava/lang/String;)LYue/ۥ۠۟ۧۥ;

    move-result-object v3

    goto :goto_2

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_3
    invoke-virtual {v3}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3, p2}, LYue/ۥۣۡۧۦ;->ۥ۟۟۠(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠۟ۧۥ;

    move-result-object v3
    :try_end_1
    .catch Ljava/io/UncheckedIOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    :try_start_2
    const-string v8, "meta[http-equiv=content-type], meta[charset]"

    invoke-virtual {v3, v8}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦ(Ljava/lang/String;)LYue/ۥ۠۠ۥۧ;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object v9, v7

    :cond_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LYue/ۥ۠۠ۥۥ;

    const-string v11, "http-equiv"

    invoke-virtual {v10, v11}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۡۨ(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_5

    const-string v9, "content"

    invoke-virtual {v10, v9}, LYue/ۥۣۡۢۤ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, LYue/ۥ۟ۨۢۦ;->ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    :cond_5
    if-nez v9, :cond_6

    invoke-virtual {v10, v0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۡۨ(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-virtual {v10, v0}, LYue/ۥۣۡۢۤ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    :cond_6
    if-eqz v9, :cond_4

    :cond_7
    if-nez v9, :cond_a

    invoke-virtual {v3}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟۠ۢ()I

    move-result v0

    if-lez v0, :cond_a

    invoke-virtual {v3, v2}, LYue/ۥۣۡۢۤ;->ۥ۟۟۠۠(I)LYue/ۥۣۡۢۤ;

    move-result-object v0

    instance-of v8, v0, LYue/ۥۢۦۣ;

    if-eqz v8, :cond_8

    check-cast v0, LYue/ۥۢۦۣ;

    goto :goto_3

    :cond_8
    instance-of v8, v0, LYue/ۥ۟ۥۤۤ;

    if-eqz v8, :cond_9

    check-cast v0, LYue/ۥ۟ۥۤۤ;

    invoke-virtual {v0}, LYue/ۥ۟ۥۤۤ;->ۥ۟۟ۦۣ()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-virtual {v0}, LYue/ۥ۟ۥۤۤ;->ۥ۟۟ۦ۠()LYue/ۥۢۦۣ;

    move-result-object v0

    goto :goto_3

    :cond_9
    move-object v0, v7

    :goto_3
    if-eqz v0, :cond_a

    invoke-virtual {v0}, LYue/ۥۢۦۣ;->ۥ۟۟ۦۣ()Ljava/lang/String;

    move-result-object v8

    const-string v10, "xml"

    invoke-virtual {v8, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_a

    const-string v8, "encoding"

    invoke-virtual {v0, v8}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    :cond_a
    invoke-static {v9}, LYue/ۥ۟ۨۢۦ;->ۥ۟۟۟ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    sget-object v8, LYue/ۥ۟ۨۢۦ;->ۥ۟۟:Ljava/lang/String;

    invoke-virtual {v0, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_b

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v0, "[\"\']"

    const-string v3, ""

    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    :cond_b
    if-nez v4, :cond_c

    goto :goto_5

    :cond_c
    move-object v7, v3

    goto :goto_5

    :goto_4
    invoke-virtual {p1}, Ljava/io/UncheckedIOException;->getCause()Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_d
    const-string v0, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML"

    invoke-static {p1, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :goto_5
    if-nez v7, :cond_13

    if-nez p1, :cond_e

    sget-object p1, LYue/ۥ۟ۨۢۦ;->ۥ۟۟:Ljava/lang/String;

    :cond_e
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v3, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v5, :cond_10

    :try_start_3
    invoke-static {v5}, LYue/ۥ۟ۨۢۦ$ۥ;->ۥ۟(LYue/ۥ۟ۨۢۦ$ۥ;)Z

    move-result v1

    if-eqz v1, :cond_10

    const-wide/16 v3, 0x1

    invoke-virtual {v0, v3, v4}, Ljava/io/BufferedReader;->skip(J)J

    move-result-wide v7

    cmp-long v1, v7, v3

    if-nez v1, :cond_f

    move v2, v6

    :cond_f
    invoke-static {v2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۢ(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_8

    :cond_10
    :goto_6
    :try_start_4
    invoke-virtual {p3, v0, p2}, LYue/ۥۣۡۧۦ;->ۥ۟۟۟ۨ(Ljava/io/Reader;Ljava/lang/String;)LYue/ۥ۠۟ۧۥ;

    move-result-object v7
    :try_end_4
    .catch Ljava/io/UncheckedIOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    sget-object p2, LYue/ۥ۟ۨۢۦ;->ۥ۟۟:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_11

    sget-object p1, LYue/ۥ۟ۨۢۦ;->ۥ۟:Ljava/nio/charset/Charset;

    goto :goto_7

    :cond_11
    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1

    :goto_7
    invoke-virtual {v7}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟ۢ()LYue/ۥ۠۟ۧۥ$ۥ;

    move-result-object p2

    invoke-virtual {p2, p1}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۟(Ljava/nio/charset/Charset;)LYue/ۥ۠۟ۧۥ$ۥ;

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->canEncode()Z

    move-result p1

    if-nez p1, :cond_12

    sget-object p1, LYue/ۥ۟ۨۢۦ;->ۥ۟:Ljava/nio/charset/Charset;

    invoke-virtual {v7, p1}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨۡ(Ljava/nio/charset/Charset;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_12
    :try_start_6
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_9

    :catch_1
    move-exception p1

    :try_start_7
    invoke-virtual {p1}, Ljava/io/UncheckedIOException;->getCause()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_8
    :try_start_8
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :cond_13
    :goto_9
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object v7

    :goto_a
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    throw p1
.end method

.method public static ۥ۟۟۟ۥ(Ljava/io/InputStream;I)Ljava/nio/ByteBuffer;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۟(Ljava/io/InputStream;I)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۦ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string v1, "[\"\']"

    const-string v2, ""

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :try_start_0
    invoke-static {p0}, Ljava/nio/charset/Charset;->isSupported(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object p0

    :cond_1
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/nio/charset/Charset;->isSupported(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/nio/charset/IllegalCharsetNameException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_2

    return-object p0

    :catch_0
    :cond_2
    :goto_0
    return-object v0
.end method
