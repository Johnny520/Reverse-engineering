.class public final Lyyds/ᛴᛶᛸᲇ;
.super Ljava/io/ByteArrayOutputStream;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛵᛵᲀᛶ;


# direct methods
.method public constructor <init>(Lyyds/ᛵᛵᲀᛶ;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛴᛶᛸᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛵᲀᛶ;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Ljava/io/ByteArrayOutputStream;->count:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 6
    .line 7
    add-int/lit8 v2, v0, -0x1

    .line 8
    .line 9
    aget-byte v1, v1, v2

    .line 10
    .line 11
    const/16 v3, 0xd

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    move v0, v2

    .line 16
    :cond_0
    :try_start_0
    new-instance v1, Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛴᛶᛸᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛵᲀᛶ;

    .line 21
    .line 22
    iget-object p0, p0, Lyyds/ᛵᛵᲀᛶ;->ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v1, v2, v3, v0, p0}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :catch_0
    move-exception p0

    .line 34
    new-instance v0, Ljava/lang/AssertionError;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    throw v0
.end method
