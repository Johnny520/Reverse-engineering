.class public LYue/ۥۡۤ۠۟;
.super LYue/ۥ۟ۦۥ۟;
.source "SourceFile"


# static fields
.field public static final ۥ۟۟۟ۡ:Ljava/lang/String; = "permessage-deflate"

.field public static final ۥ۟۟۟ۢ:Ljava/lang/String; = "server_no_context_takeover"

.field public static final ۥۣ۟۟۟:Ljava/lang/String; = "client_no_context_takeover"

.field public static final ۥ۟۟۟ۤ:Ljava/lang/String; = "server_max_window_bits"

.field public static final ۥ۟۟۟ۥ:Ljava/lang/String; = "client_max_window_bits"

.field public static final ۥ۟۟۟ۦ:I = 0x8000

.field public static final ۥ۟۟۟ۧ:I = 0x8000

.field public static final ۥ۟۟۟ۨ:[B

.field public static final ۥ۟۟۠:I = 0x400


# instance fields
.field public ۥ:I

.field public ۥ۟:Z

.field public ۥ۟۟:Z

.field public ۥ۟۟۟:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟۟:Ljava/util/zip/Inflater;

.field public ۥ۟۟۟۠:Ljava/util/zip/Deflater;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟ۨ:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        -0x1t
        -0x1t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, LYue/ۥ۟ۦۥ۟;-><init>()V

    const/16 v0, 0x400

    iput v0, p0, LYue/ۥۡۤ۠۟;->ۥ:I

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۡۤ۠۟;->ۥ۟:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟:Z

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟:Ljava/util/Map;

    new-instance v1, Ljava/util/zip/Inflater;

    invoke-direct {v1, v0}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object v1, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۟:Ljava/util/zip/Inflater;

    new-instance v1, Ljava/util/zip/Deflater;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v0}, Ljava/util/zip/Deflater;-><init>(IZ)V

    iput-object v1, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۠:Ljava/util/zip/Deflater;

    return-void
.end method

.method public static ۥ۟۟۟ۥ([B)Z
    .locals 5

    array-length v0, p0

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    array-length v0, p0

    move v1, v2

    :goto_0
    sget-object v3, LYue/ۥۡۤ۠۟;->ۥ۟۟۟ۨ:[B

    array-length v4, v3

    if-ge v1, v4, :cond_2

    aget-byte v4, v3, v1

    array-length v3, v3

    sub-int v3, v0, v3

    add-int/2addr v3, v1

    aget-byte v3, p0, v3

    if-eq v4, v3, :cond_1

    return v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "PerMessageDeflateExtension"

    return-object v0
.end method

.method public ۥ()LYue/ۥ۠ۥ۟۟;
    .locals 1

    new-instance v0, LYue/ۥۡۤ۠۟;

    invoke-direct {v0}, LYue/ۥۡۤ۠۟;-><init>()V

    return-object v0
.end method

.method public ۥ۟(Ljava/lang/String;)Z
    .locals 6

    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    invoke-static {v3}, LYue/ۥ۠ۡۥۨ;->ۥ۟۟(Ljava/lang/String;)LYue/ۥ۠ۡۥۨ;

    move-result-object v3

    invoke-virtual {v3}, LYue/ۥ۠ۡۥۨ;->ۥ()Ljava/lang/String;

    move-result-object v4

    const-string v5, "permessage-deflate"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, LYue/ۥ۠ۡۥۨ;->ۥ۟()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object p1, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟:Ljava/util/Map;

    const-string v0, "client_no_context_takeover"

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    iput-boolean v0, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟:Z

    :cond_1
    return v0

    :cond_2
    return v1
.end method

.method public ۥ۟۟(LYue/ۥۣ۠۠۠;)V
    .locals 7

    instance-of v0, p1, LYue/ۥ۟ۨۢۤ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v1, v0

    iget v2, p0, LYue/ۥۡۤ۠۟;->ۥ:I

    if-ge v1, v2, :cond_1

    return-void

    :cond_1
    instance-of v1, p1, LYue/ۥ۟ۧۥۡ;

    const/4 v2, 0x1

    if-nez v1, :cond_2

    move-object v1, p1

    check-cast v1, LYue/ۥ۟ۨۢۤ;

    invoke-virtual {v1, v2}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۧ(Z)V

    :cond_2
    iget-object v1, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۠:Ljava/util/zip/Deflater;

    invoke-virtual {v1, v0}, Ljava/util/zip/Deflater;->setInput([B)V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x400

    new-array v3, v1, [B

    :goto_0
    iget-object v4, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۠:Ljava/util/zip/Deflater;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-virtual {v4, v3, v6, v1, v5}, Ljava/util/zip/Deflater;->deflate([BIII)I

    move-result v4

    if-lez v4, :cond_3

    invoke-virtual {v0, v3, v6, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    array-length v1, v0

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۡ()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v0}, LYue/ۥۡۤ۠۟;->ۥ۟۟۟ۥ([B)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, LYue/ۥۡۤ۠۟;->ۥ۟۟۟ۨ:[B

    array-length v3, v3

    sub-int/2addr v1, v3

    :cond_4
    iget-boolean v3, p0, LYue/ۥۡۤ۠۟;->ۥ۟:Z

    if-eqz v3, :cond_5

    iget-object v3, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۠:Ljava/util/zip/Deflater;

    invoke-virtual {v3}, Ljava/util/zip/Deflater;->end()V

    new-instance v3, Ljava/util/zip/Deflater;

    const/4 v4, -0x1

    invoke-direct {v3, v4, v2}, Ljava/util/zip/Deflater;-><init>(IZ)V

    iput-object v3, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۠:Ljava/util/zip/Deflater;

    :cond_5
    check-cast p1, LYue/ۥۣ۠۠ۡ;

    invoke-static {v0, v6, v1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۦ(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public ۥ۟۟۟(LYue/ۥۣ۠۠۠;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    instance-of v0, p1, LYue/ۥ۟ۨۢۤ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟()LYue/ۥۣۣۡۢ;

    move-result-object v0

    sget-object v1, LYue/ۥۣۣۡۢ;->ۥۣ۟۟۠:LYue/ۥۣۣۡۢ;

    if-eq v0, v1, :cond_1

    return-void

    :cond_1
    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟()LYue/ۥۣۣۡۢ;

    move-result-object v0

    sget-object v1, LYue/ۥۣۣۡۢ;->ۥۣ۟۟۠:LYue/ۥۣۣۡۢ;

    const/16 v2, 0x3f0

    if-ne v0, v1, :cond_3

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, LYue/ۥ۠ۥۧۤ;

    const-string v0, "RSV1 bit can only be set for the first frame."

    invoke-direct {p1, v2, v0}, LYue/ۥ۠ۥۧۤ;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p0, v1, v0}, LYue/ۥۡۤ۠۟;->ۥ۟۟۟ۤ([BLjava/io/ByteArrayOutputStream;)V

    iget-object v1, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۟:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getRemaining()I

    move-result v1

    const/4 v3, 0x1

    if-lez v1, :cond_4

    new-instance v1, Ljava/util/zip/Inflater;

    invoke-direct {v1, v3}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object v1, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۟:Ljava/util/zip/Inflater;

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p0, v1, v0}, LYue/ۥۡۤ۠۟;->ۥ۟۟۟ۤ([BLjava/io/ByteArrayOutputStream;)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_4
    :goto_1
    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۡ()Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, LYue/ۥۡۤ۠۟;->ۥ۟۟۟ۨ:[B

    invoke-virtual {p0, v1, v0}, LYue/ۥۡۤ۠۟;->ۥ۟۟۟ۤ([BLjava/io/ByteArrayOutputStream;)V

    iget-boolean v1, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟:Z

    if-eqz v1, :cond_5

    new-instance v1, Ljava/util/zip/Inflater;

    invoke-direct {v1, v3}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object v1, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۟:Ljava/util/zip/Inflater;
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    check-cast p1, LYue/ۥۣ۠۠ۡ;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    invoke-static {v1, v2, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۦ(Ljava/nio/ByteBuffer;)V

    return-void

    :goto_2
    new-instance v0, LYue/ۥ۠ۥۧۤ;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1}, LYue/ۥ۠ۥۧۤ;-><init>(ILjava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟۟۟(Ljava/lang/String;)Z
    .locals 6

    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    invoke-static {v3}, LYue/ۥ۠ۡۥۨ;->ۥ۟۟(Ljava/lang/String;)LYue/ۥ۠ۡۥۨ;

    move-result-object v3

    invoke-virtual {v3}, LYue/ۥ۠ۡۥۨ;->ۥ()Ljava/lang/String;

    move-result-object v4

    const-string v5, "permessage-deflate"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, LYue/ۥ۠ۡۥۨ;->ۥ۟()Ljava/util/Map;

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public ۥ۟۟۟۠(LYue/ۥۣ۠۠۠;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    instance-of v0, p1, LYue/ۥ۟ۧۥۡ;

    if-eqz v0, :cond_1

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟۠()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۥۧۦ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bad rsv RSV1: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " RSV2: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " RSV3: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟۠()Z

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, LYue/ۥ۠ۥۧۦ;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-super {p0, p1}, LYue/ۥ۟ۦۥ۟;->ۥ۟۟۟۠(LYue/ۥۣ۠۠۠;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟:Ljava/util/Map;

    const-string v1, "client_no_context_takeover"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟:Ljava/util/Map;

    const-string v1, "server_no_context_takeover"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "permessage-deflate; server_no_context_takeover; client_no_context_takeover"

    return-object v0
.end method

.method public ۥ۟۟۟ۢ()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "permessage-deflate; server_no_context_takeover"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟:Z

    if-eqz v1, :cond_0

    const-string v1, "; client_no_context_takeover"

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟ۤ([BLjava/io/ByteArrayOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/zip/DataFormatException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۟:Ljava/util/zip/Inflater;

    invoke-virtual {v0, p1}, Ljava/util/zip/Inflater;->setInput([B)V

    const/16 p1, 0x400

    new-array p1, p1, [B

    :goto_0
    iget-object v0, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۟:Ljava/util/zip/Inflater;

    invoke-virtual {v0, p1}, Ljava/util/zip/Inflater;->inflate([B)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v1, v0}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟ۦ()Ljava/util/zip/Deflater;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۠:Ljava/util/zip/Deflater;

    return-object v0
.end method

.method public ۥ۟۟۟ۧ()Ljava/util/zip/Inflater;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۟:Ljava/util/zip/Inflater;

    return-object v0
.end method

.method public ۥ۟۟۟ۨ()I
    .locals 1

    iget v0, p0, LYue/ۥۡۤ۠۟;->ۥ:I

    return v0
.end method

.method public ۥ۟۟۠()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟:Z

    return v0
.end method

.method public ۥ۟۟۠۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۤ۠۟;->ۥ۟:Z

    return v0
.end method

.method public ۥ۟۟۠۠(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟:Z

    return-void
.end method

.method public ۥ۟۟۠ۡ(Ljava/util/zip/Deflater;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۠:Ljava/util/zip/Deflater;

    return-void
.end method

.method public ۥ۟۟۠ۢ(Ljava/util/zip/Inflater;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۤ۠۟;->ۥ۟۟۟۟:Ljava/util/zip/Inflater;

    return-void
.end method

.method public ۥۣ۟۟۠(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۡۤ۠۟;->ۥ۟:Z

    return-void
.end method

.method public ۥ۟۟۠ۤ(I)V
    .locals 0

    iput p1, p0, LYue/ۥۡۤ۠۟;->ۥ:I

    return-void
.end method
