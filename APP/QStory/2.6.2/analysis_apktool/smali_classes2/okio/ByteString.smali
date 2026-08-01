.class public Lokio/ByteString;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Comparable<",
        "Lokio/ByteString;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0005\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0016\u0018\u0000 v2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001wB\u0011\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\tJ\r\u0010\u000f\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0007H\u0010\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0000H\u0010\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008 \u0010\tJ\u000f\u0010!\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008!\u0010\tJ\u000f\u0010\"\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\u0008\"\u0010\u0010J\u000f\u0010#\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\u0008#\u0010\u0010J#\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010%\u001a\u00020$2\u0008\u0008\u0002\u0010&\u001a\u00020$H\u0017\u00a2\u0006\u0004\u0008\'\u0010(J\u0017\u0010-\u001a\u00020*2\u0006\u0010)\u001a\u00020$H\u0010\u00a2\u0006\u0004\u0008+\u0010,J\u0018\u00100\u001a\u00020*2\u0006\u0010.\u001a\u00020$H\u0087\u0002\u00a2\u0006\u0004\u0008/\u0010,J\u000f\u00103\u001a\u00020$H\u0010\u00a2\u0006\u0004\u00081\u00102J\u000f\u00104\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u00084\u00105J\u000f\u00107\u001a\u00020\u0003H\u0010\u00a2\u0006\u0004\u00086\u00105J\u000f\u00109\u001a\u000208H\u0016\u00a2\u0006\u0004\u00089\u0010:J\u0017\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020;H\u0016\u00a2\u0006\u0004\u0008>\u0010?J\'\u0010>\u001a\u00020=2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020$H\u0010\u00a2\u0006\u0004\u0008D\u0010EJ/\u0010I\u001a\u00020H2\u0006\u0010B\u001a\u00020$2\u0006\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020$2\u0006\u0010C\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008I\u0010JJ/\u0010I\u001a\u00020H2\u0006\u0010B\u001a\u00020$2\u0006\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020$2\u0006\u0010C\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008I\u0010KJ3\u0010N\u001a\u00020=2\u0008\u0008\u0002\u0010B\u001a\u00020$2\u0006\u0010L\u001a\u00020\u00032\u0008\u0008\u0002\u0010M\u001a\u00020$2\u0006\u0010C\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008N\u0010OJ\u0015\u0010Q\u001a\u00020H2\u0006\u0010P\u001a\u00020\u0000\u00a2\u0006\u0004\u0008Q\u0010RJ\u0015\u0010Q\u001a\u00020H2\u0006\u0010P\u001a\u00020\u0003\u00a2\u0006\u0004\u0008Q\u0010SJ\u0015\u0010U\u001a\u00020H2\u0006\u0010T\u001a\u00020\u0000\u00a2\u0006\u0004\u0008U\u0010RJ\u0015\u0010U\u001a\u00020H2\u0006\u0010T\u001a\u00020\u0003\u00a2\u0006\u0004\u0008U\u0010SJ!\u0010W\u001a\u00020$2\u0006\u0010F\u001a\u00020\u00002\u0008\u0008\u0002\u0010V\u001a\u00020$H\u0007\u00a2\u0006\u0004\u0008W\u0010XJ!\u0010W\u001a\u00020$2\u0006\u0010F\u001a\u00020\u00032\u0008\u0008\u0002\u0010V\u001a\u00020$H\u0017\u00a2\u0006\u0004\u0008W\u0010YJ!\u0010Z\u001a\u00020$2\u0006\u0010F\u001a\u00020\u00002\u0008\u0008\u0002\u0010V\u001a\u00020$H\u0007\u00a2\u0006\u0004\u0008Z\u0010XJ!\u0010Z\u001a\u00020$2\u0006\u0010F\u001a\u00020\u00032\u0008\u0008\u0002\u0010V\u001a\u00020$H\u0017\u00a2\u0006\u0004\u0008Z\u0010YJ\u001a\u0010\\\u001a\u00020H2\u0008\u0010F\u001a\u0004\u0018\u00010[H\u0096\u0002\u00a2\u0006\u0004\u0008\\\u0010]J\u000f\u0010^\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008^\u00102J\u0018\u0010_\u001a\u00020$2\u0006\u0010F\u001a\u00020\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008_\u0010`J\u000f\u0010a\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008a\u0010\tJ\u0017\u0010/\u001a\u00020*2\u0006\u0010.\u001a\u00020$H\u0007\u00a2\u0006\u0004\u0008b\u0010,J\u000f\u0010d\u001a\u00020$H\u0007\u00a2\u0006\u0004\u0008c\u00102J\u0017\u0010g\u001a\u00020=2\u0006\u0010f\u001a\u00020eH\u0002\u00a2\u0006\u0004\u0008g\u0010hJ\u0017\u0010j\u001a\u00020=2\u0006\u0010<\u001a\u00020iH\u0002\u00a2\u0006\u0004\u0008j\u0010kR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010l\u001a\u0004\u0008m\u00105R\"\u0010^\u001a\u00020$8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008^\u0010n\u001a\u0004\u0008o\u00102\"\u0004\u0008p\u0010qR$\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010r\u001a\u0004\u0008s\u0010\t\"\u0004\u0008t\u0010uR\u0011\u0010d\u001a\u00020$8G\u00a2\u0006\u0006\u001a\u0004\u0008d\u00102\u00a8\u0006x"
    }
    d2 = {
        "Lokio/ByteString;",
        "Ljava/io/Serializable;",
        "",
        "",
        "data",
        "<init>",
        "([B)V",
        "",
        "utf8",
        "()Ljava/lang/String;",
        "Ljava/nio/charset/Charset;",
        "charset",
        "string",
        "(Ljava/nio/charset/Charset;)Ljava/lang/String;",
        "base64",
        "md5",
        "()Lokio/ByteString;",
        "sha1",
        "sha256",
        "sha512",
        "algorithm",
        "digest$okio",
        "(Ljava/lang/String;)Lokio/ByteString;",
        "digest",
        "key",
        "hmacSha1",
        "(Lokio/ByteString;)Lokio/ByteString;",
        "hmacSha256",
        "hmacSha512",
        "hmac$okio",
        "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;",
        "hmac",
        "base64Url",
        "hex",
        "toAsciiLowercase",
        "toAsciiUppercase",
        "",
        "beginIndex",
        "endIndex",
        "substring",
        "(II)Lokio/ByteString;",
        "pos",
        "",
        "internalGet$okio",
        "(I)B",
        "internalGet",
        "index",
        "getByte",
        "get",
        "getSize$okio",
        "()I",
        "getSize",
        "toByteArray",
        "()[B",
        "internalArray$okio",
        "internalArray",
        "Ljava/nio/ByteBuffer;",
        "asByteBuffer",
        "()Ljava/nio/ByteBuffer;",
        "Ljava/io/OutputStream;",
        "out",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "write",
        "(Ljava/io/OutputStream;)V",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u54f2\u82cf\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
        "buffer",
        "offset",
        "byteCount",
        "write$okio",
        "(L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u54f2\u82cf\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;II)V",
        "other",
        "otherOffset",
        "",
        "rangeEquals",
        "(ILokio/ByteString;II)Z",
        "(I[BII)Z",
        "target",
        "targetOffset",
        "copyInto",
        "(I[BII)V",
        "prefix",
        "startsWith",
        "(Lokio/ByteString;)Z",
        "([B)Z",
        "suffix",
        "endsWith",
        "fromIndex",
        "indexOf",
        "(Lokio/ByteString;I)I",
        "([BI)I",
        "lastIndexOf",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "compareTo",
        "(Lokio/ByteString;)I",
        "toString",
        "-deprecated_getByte",
        "-deprecated_size",
        "size",
        "Ljava/io/ObjectInputStream;",
        "in",
        "readObject",
        "(Ljava/io/ObjectInputStream;)V",
        "Ljava/io/ObjectOutputStream;",
        "writeObject",
        "(Ljava/io/ObjectOutputStream;)V",
        "[B",
        "getData$okio",
        "I",
        "getHashCode$okio",
        "setHashCode$okio",
        "(I)V",
        "Ljava/lang/String;",
        "getUtf8$okio",
        "setUtf8$okio",
        "(Ljava/lang/String;)V",
        "Companion",
        "\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u54f2\u82cf\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170",
        "okio"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;

.field public static final EMPTY:Lokio/ByteString;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final data:[B

.field private transient hashCode:I

.field private transient utf8:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lokio/ByteString;->Companion:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;

    .line 7
    .line 8
    new-instance v0, Lokio/ByteString;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    new-array v1, v1, [B

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lokio/ByteString;-><init>([B)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lokio/ByteString;->EMPTY:Lokio/ByteString;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lokio/ByteString;->data:[B

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic copyInto$default(Lokio/ByteString;I[BIIILjava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p6, :cond_2

    .line 2
    .line 3
    and-int/lit8 p6, p5, 0x1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p6, :cond_0

    .line 7
    .line 8
    move p1, v0

    .line 9
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 10
    .line 11
    if-eqz p5, :cond_1

    .line 12
    .line 13
    move p3, v0

    .line 14
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lokio/ByteString;->copyInto(I[BII)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_2
    const-string p0, "Super calls with default arguments not supported in this target, function: copyInto"

    .line 19
    .line 20
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static final decodeBase64(Ljava/lang/String;)Lokio/ByteString;
    .locals 14

    .line 1
    sget-object v0, Lokio/ByteString;->Companion:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object v0, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[B

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    :goto_0
    const/16 v1, 0x9

    .line 16
    .line 17
    const/16 v2, 0x20

    .line 18
    .line 19
    const/16 v3, 0xd

    .line 20
    .line 21
    const/16 v4, 0xa

    .line 22
    .line 23
    if-lez v0, :cond_1

    .line 24
    .line 25
    add-int/lit8 v5, v0, -0x1

    .line 26
    .line 27
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/16 v6, 0x3d

    .line 32
    .line 33
    if-eq v5, v6, :cond_0

    .line 34
    .line 35
    if-eq v5, v4, :cond_0

    .line 36
    .line 37
    if-eq v5, v3, :cond_0

    .line 38
    .line 39
    if-eq v5, v2, :cond_0

    .line 40
    .line 41
    if-eq v5, v1, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    :goto_1
    int-to-long v5, v0

    .line 48
    const-wide/16 v7, 0x6

    .line 49
    .line 50
    mul-long/2addr v5, v7

    .line 51
    const-wide/16 v7, 0x8

    .line 52
    .line 53
    div-long/2addr v5, v7

    .line 54
    long-to-int v5, v5

    .line 55
    new-array v6, v5, [B

    .line 56
    .line 57
    const/4 v7, 0x0

    .line 58
    move v8, v7

    .line 59
    move v9, v8

    .line 60
    move v10, v9

    .line 61
    :goto_2
    const/4 v11, 0x0

    .line 62
    if-ge v7, v0, :cond_b

    .line 63
    .line 64
    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    const/16 v13, 0x41

    .line 69
    .line 70
    if-gt v13, v12, :cond_2

    .line 71
    .line 72
    const/16 v13, 0x5b

    .line 73
    .line 74
    if-ge v12, v13, :cond_2

    .line 75
    .line 76
    add-int/lit8 v12, v12, -0x41

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_2
    const/16 v13, 0x61

    .line 80
    .line 81
    if-gt v13, v12, :cond_3

    .line 82
    .line 83
    const/16 v13, 0x7b

    .line 84
    .line 85
    if-ge v12, v13, :cond_3

    .line 86
    .line 87
    add-int/lit8 v12, v12, -0x47

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_3
    const/16 v13, 0x30

    .line 91
    .line 92
    if-gt v13, v12, :cond_4

    .line 93
    .line 94
    const/16 v13, 0x3a

    .line 95
    .line 96
    if-ge v12, v13, :cond_4

    .line 97
    .line 98
    add-int/lit8 v12, v12, 0x4

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_4
    const/16 v13, 0x2b

    .line 102
    .line 103
    if-eq v12, v13, :cond_9

    .line 104
    .line 105
    const/16 v13, 0x2d

    .line 106
    .line 107
    if-ne v12, v13, :cond_5

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_5
    const/16 v13, 0x2f

    .line 111
    .line 112
    if-eq v12, v13, :cond_8

    .line 113
    .line 114
    const/16 v13, 0x5f

    .line 115
    .line 116
    if-ne v12, v13, :cond_6

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_6
    if-eq v12, v4, :cond_a

    .line 120
    .line 121
    if-eq v12, v3, :cond_a

    .line 122
    .line 123
    if-eq v12, v2, :cond_a

    .line 124
    .line 125
    if-ne v12, v1, :cond_7

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_7
    move-object v6, v11

    .line 129
    goto :goto_8

    .line 130
    :cond_8
    :goto_3
    const/16 v12, 0x3f

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_9
    :goto_4
    const/16 v12, 0x3e

    .line 134
    .line 135
    :goto_5
    shl-int/lit8 v9, v9, 0x6

    .line 136
    .line 137
    or-int/2addr v9, v12

    .line 138
    add-int/lit8 v8, v8, 0x1

    .line 139
    .line 140
    rem-int/lit8 v11, v8, 0x4

    .line 141
    .line 142
    if-nez v11, :cond_a

    .line 143
    .line 144
    add-int/lit8 v11, v10, 0x1

    .line 145
    .line 146
    shr-int/lit8 v12, v9, 0x10

    .line 147
    .line 148
    int-to-byte v12, v12

    .line 149
    aput-byte v12, v6, v10

    .line 150
    .line 151
    add-int/lit8 v12, v10, 0x2

    .line 152
    .line 153
    shr-int/lit8 v13, v9, 0x8

    .line 154
    .line 155
    int-to-byte v13, v13

    .line 156
    aput-byte v13, v6, v11

    .line 157
    .line 158
    add-int/lit8 v10, v10, 0x3

    .line 159
    .line 160
    int-to-byte v11, v9

    .line 161
    aput-byte v11, v6, v12

    .line 162
    .line 163
    :cond_a
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_b
    rem-int/lit8 v8, v8, 0x4

    .line 167
    .line 168
    const/4 p0, 0x1

    .line 169
    if-eq v8, p0, :cond_7

    .line 170
    .line 171
    const/4 p0, 0x2

    .line 172
    if-eq v8, p0, :cond_d

    .line 173
    .line 174
    const/4 p0, 0x3

    .line 175
    if-eq v8, p0, :cond_c

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_c
    shl-int/lit8 p0, v9, 0x6

    .line 179
    .line 180
    add-int/lit8 v0, v10, 0x1

    .line 181
    .line 182
    shr-int/lit8 v1, p0, 0x10

    .line 183
    .line 184
    int-to-byte v1, v1

    .line 185
    aput-byte v1, v6, v10

    .line 186
    .line 187
    add-int/lit8 v10, v10, 0x2

    .line 188
    .line 189
    shr-int/lit8 p0, p0, 0x8

    .line 190
    .line 191
    int-to-byte p0, p0

    .line 192
    aput-byte p0, v6, v0

    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_d
    shl-int/lit8 p0, v9, 0xc

    .line 196
    .line 197
    add-int/lit8 v0, v10, 0x1

    .line 198
    .line 199
    shr-int/lit8 p0, p0, 0x10

    .line 200
    .line 201
    int-to-byte p0, p0

    .line 202
    aput-byte p0, v6, v10

    .line 203
    .line 204
    move v10, v0

    .line 205
    :goto_7
    if-ne v10, v5, :cond_e

    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_e
    invoke-static {v6, v10}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    :goto_8
    if-eqz v6, :cond_f

    .line 213
    .line 214
    new-instance p0, Lokio/ByteString;

    .line 215
    .line 216
    invoke-direct {p0, v6}, Lokio/ByteString;-><init>([B)V

    .line 217
    .line 218
    .line 219
    return-object p0

    .line 220
    :cond_f
    return-object v11
.end method

.method public static final decodeHex(Ljava/lang/String;)Lokio/ByteString;
    .locals 1

    .line 1
    sget-object v0, Lokio/ByteString;->Companion:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Lokio/ByteString;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final encodeString(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/ByteString;
    .locals 1

    .line 1
    sget-object v0, Lokio/ByteString;->Companion:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Lokio/ByteString;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0}, Lokio/ByteString;-><init>([B)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static final encodeUtf8(Ljava/lang/String;)Lokio/ByteString;
    .locals 1

    .line 1
    sget-object v0, Lokio/ByteString;->Companion:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Lokio/ByteString;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic indexOf$default(Lokio/ByteString;Lokio/ByteString;IILjava/lang/Object;)I
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lokio/ByteString;->indexOf(Lokio/ByteString;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_1
    const-string p0, "Super calls with default arguments not supported in this target, function: indexOf"

    .line 14
    .line 15
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public static synthetic indexOf$default(Lokio/ByteString;[BIILjava/lang/Object;)I
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 20
    :cond_0
    invoke-virtual {p0, p1, p2}, Lokio/ByteString;->indexOf([BI)I

    move-result p0

    return p0

    :cond_1
    const-string p0, "Super calls with default arguments not supported in this target, function: indexOf"

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic lastIndexOf$default(Lokio/ByteString;Lokio/ByteString;IILjava/lang/Object;)I
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const p2, -0x499602d2

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2}, Lokio/ByteString;->lastIndexOf(Lokio/ByteString;I)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :cond_1
    const-string p0, "Super calls with default arguments not supported in this target, function: lastIndexOf"

    .line 16
    .line 17
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static synthetic lastIndexOf$default(Lokio/ByteString;[BIILjava/lang/Object;)I
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const p2, -0x499602d2

    .line 22
    :cond_0
    invoke-virtual {p0, p1, p2}, Lokio/ByteString;->lastIndexOf([BI)I

    move-result p0

    return p0

    :cond_1
    const-string p0, "Super calls with default arguments not supported in this target, function: lastIndexOf"

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static final of(Ljava/nio/ByteBuffer;)Lokio/ByteString;
    .locals 1

    sget-object v0, Lokio/ByteString;->Companion:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    new-array v0, v0, [B

    .line 35
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 36
    new-instance p0, Lokio/ByteString;

    invoke-direct {p0, v0}, Lokio/ByteString;-><init>([B)V

    return-object p0
.end method

.method public static final varargs of([B)Lokio/ByteString;
    .locals 2

    sget-object v0, Lokio/ByteString;->Companion:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    new-instance v0, Lokio/ByteString;

    array-length v1, p0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    invoke-direct {v0, p0}, Lokio/ByteString;-><init>([B)V

    return-object v0
.end method

.method public static final of([BII)Lokio/ByteString;
    .locals 7

    .line 1
    sget-object v0, Lokio/ByteString;->Companion:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const v0, -0x499602d2

    .line 10
    .line 11
    .line 12
    if-ne p2, v0, :cond_0

    .line 13
    .line 14
    array-length p2, p0

    .line 15
    :cond_0
    array-length v0, p0

    .line 16
    int-to-long v1, v0

    .line 17
    int-to-long v3, p1

    .line 18
    int-to-long v5, p2

    .line 19
    invoke-static/range {v1 .. v6}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(JJJ)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lokio/ByteString;

    .line 23
    .line 24
    add-int/2addr p2, p1

    .line 25
    invoke-static {p1, p0, p2}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世兰哲苏楪(I[BI)[B

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Lokio/ByteString;-><init>([B)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public static final read(Ljava/io/InputStream;I)Lokio/ByteString;
    .locals 1

    .line 1
    sget-object v0, Lokio/ByteString;->Companion:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(Ljava/io/InputStream;I)Lokio/ByteString;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lokio/ByteString;->Companion:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(Ljava/io/InputStream;I)Lokio/ByteString;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-class v0, Lokio/ByteString;

    .line 15
    .line 16
    const-string v1, "data"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p1, Lokio/ByteString;->data:[B

    .line 27
    .line 28
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static synthetic substring$default(Lokio/ByteString;IIILjava/lang/Object;)Lokio/ByteString;
    .locals 0

    .line 1
    if-nez p4, :cond_2

    .line 2
    .line 3
    and-int/lit8 p4, p3, 0x1

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    const p2, -0x499602d2

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-virtual {p0, p1, p2}, Lokio/ByteString;->substring(II)Lokio/ByteString;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_2
    const-string p0, "Super calls with default arguments not supported in this target, function: substring"

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method private final writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/ByteString;->data:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lokio/ByteString;->data:[B

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/io/ObjectOutputStream;->write([B)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final -deprecated_getByte(I)B
    .locals 0
    .annotation runtime Lkotlin/飘花落叶言子楪世哲兰苏;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lokio/ByteString;->getByte(I)B

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final -deprecated_size()I
    .locals 0
    .annotation runtime Lkotlin/飘花落叶言子楪世哲兰苏;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public asByteBuffer()Ljava/nio/ByteBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Lokio/ByteString;->data:[B

    .line 2
    .line 3
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public base64()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[B

    .line 6
    .line 7
    invoke-static {p0, v0}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰([B[B)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public base64Url()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[B

    .line 6
    .line 7
    invoke-static {p0, v0}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰([B[B)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 50
    check-cast p1, Lokio/ByteString;

    invoke-virtual {p0, p1}, Lokio/ByteString;->compareTo(Lokio/ByteString;)I

    move-result p0

    return p0
.end method

.method public compareTo(Lokio/ByteString;)I
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    const/4 v5, -0x1

    .line 19
    const/4 v6, 0x1

    .line 20
    if-ge v4, v2, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, v4}, Lokio/ByteString;->getByte(I)B

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    and-int/lit16 v7, v7, 0xff

    .line 27
    .line 28
    invoke-virtual {p1, v4}, Lokio/ByteString;->getByte(I)B

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    and-int/lit16 v8, v8, 0xff

    .line 33
    .line 34
    if-ne v7, v8, :cond_0

    .line 35
    .line 36
    add-int/lit8 v4, v4, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    if-ge v7, v8, :cond_1

    .line 40
    .line 41
    return v5

    .line 42
    :cond_1
    return v6

    .line 43
    :cond_2
    if-ne v0, v1, :cond_3

    .line 44
    .line 45
    return v3

    .line 46
    :cond_3
    if-ge v0, v1, :cond_4

    .line 47
    .line 48
    return v5

    .line 49
    :cond_4
    return v6
.end method

.method public copyInto(I[BII)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    add-int/2addr p4, p1

    .line 9
    invoke-static {p0, p3, p2, p1, p4}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世哲兰苏楪([BI[BII)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public digest$okio(Ljava/lang/String;)Lokio/ByteString;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p0, Lokio/ByteString;->data:[B

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-virtual {p1, v0, v1, p0}, Ljava/security/MessageDigest;->update([BII)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance p1, Lokio/ByteString;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, p0}, Lokio/ByteString;-><init>([B)V

    .line 28
    .line 29
    .line 30
    return-object p1
.end method

.method public final endsWith(Lokio/ByteString;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sub-int/2addr v0, v1

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {p0, v0, p1, v1, v2}, Lokio/ByteString;->rangeEquals(ILokio/ByteString;II)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public final endsWith([B)Z
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    move-result v0

    array-length v1, p1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    array-length v2, p1

    invoke-virtual {p0, v0, p1, v1, v2}, Lokio/ByteString;->rangeEquals(I[BII)Z

    move-result p0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lokio/ByteString;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p1, Lokio/ByteString;

    .line 11
    .line 12
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    array-length v3, v3

    .line 21
    if-ne v1, v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    array-length p0, p0

    .line 32
    invoke-virtual {p1, v2, v1, v2, p0}, Lokio/ByteString;->rangeEquals(I[BII)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    return v0

    .line 39
    :cond_1
    return v2
.end method

.method public final getByte(I)B
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lokio/ByteString;->internalGet$okio(I)B

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final getData$okio()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lokio/ByteString;->data:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public final getHashCode$okio()I
    .locals 0

    .line 1
    iget p0, p0, Lokio/ByteString;->hashCode:I

    .line 2
    .line 3
    return p0
.end method

.method public getSize$okio()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length p0, p0

    .line 6
    return p0
.end method

.method public final getUtf8$okio()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lokio/ByteString;->utf8:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/ByteString;->getHashCode$okio()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0, v0}, Lokio/ByteString;->setHashCode$okio(I)V

    .line 17
    .line 18
    .line 19
    return v0
.end method

.method public hex()Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    mul-int/lit8 v0, v0, 0x2

    .line 7
    .line 8
    new-array v0, v0, [C

    .line 9
    .line 10
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    array-length v1, p0

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    if-ge v2, v1, :cond_0

    .line 18
    .line 19
    aget-byte v4, p0, v2

    .line 20
    .line 21
    add-int/lit8 v5, v3, 0x1

    .line 22
    .line 23
    shr-int/lit8 v6, v4, 0x4

    .line 24
    .line 25
    and-int/lit8 v6, v6, 0xf

    .line 26
    .line 27
    sget-object v7, Lokio/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[C

    .line 28
    .line 29
    aget-char v6, v7, v6

    .line 30
    .line 31
    aput-char v6, v0, v3

    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x2

    .line 34
    .line 35
    and-int/lit8 v4, v4, 0xf

    .line 36
    .line 37
    aget-char v4, v7, v4

    .line 38
    .line 39
    aput-char v4, v0, v5

    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 45
    .line 46
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 47
    .line 48
    .line 49
    return-object p0
.end method

.method public hmac$okio(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {p1}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    .line 12
    .line 13
    invoke-virtual {p2}, Lokio/ByteString;->toByteArray()[B

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-direct {v1, p2, p1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Lokio/ByteString;

    .line 24
    .line 25
    iget-object p0, p0, Lokio/ByteString;->data:[B

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, p0}, Lokio/ByteString;-><init>([B)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :catch_0
    move-exception p0

    .line 39
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method

.method public hmacSha1(Lokio/ByteString;)Lokio/ByteString;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "HmacSHA1"

    .line 5
    .line 6
    invoke-virtual {p0, v0, p1}, Lokio/ByteString;->hmac$okio(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public hmacSha256(Lokio/ByteString;)Lokio/ByteString;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "HmacSHA256"

    .line 5
    .line 6
    invoke-virtual {p0, v0, p1}, Lokio/ByteString;->hmac$okio(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public hmacSha512(Lokio/ByteString;)Lokio/ByteString;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "HmacSHA512"

    .line 5
    .line 6
    invoke-virtual {p0, v0, p1}, Lokio/ByteString;->hmac$okio(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final indexOf(Lokio/ByteString;)I
    .locals 3

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lokio/ByteString;->indexOf$default(Lokio/ByteString;Lokio/ByteString;IILjava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public final indexOf(Lokio/ByteString;I)I
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    invoke-virtual {p1}, Lokio/ByteString;->internalArray$okio()[B

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lokio/ByteString;->indexOf([BI)I

    move-result p0

    return p0
.end method

.method public final indexOf([B)I
    .locals 3

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lokio/ByteString;->indexOf$default(Lokio/ByteString;[BIILjava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public indexOf([BI)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    array-length v0, v0

    .line 9
    array-length v1, p1

    .line 10
    sub-int/2addr v0, v1

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-gt p2, v0, :cond_1

    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    array-length v3, p1

    .line 23
    invoke-static {v2, p2, p1, v1, v3}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏([BI[BII)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    return p2

    .line 30
    :cond_0
    if-eq p2, v0, :cond_1

    .line 31
    .line 32
    add-int/lit8 p2, p2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, -0x1

    .line 36
    return p0
.end method

.method public internalArray$okio()[B
    .locals 0

    .line 1
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public internalGet$okio(I)B
    .locals 0

    .line 1
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    aget-byte p0, p0, p1

    .line 6
    .line 7
    return p0
.end method

.method public final lastIndexOf(Lokio/ByteString;)I
    .locals 3

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lokio/ByteString;->lastIndexOf$default(Lokio/ByteString;Lokio/ByteString;IILjava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public final lastIndexOf(Lokio/ByteString;I)I
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    invoke-virtual {p1}, Lokio/ByteString;->internalArray$okio()[B

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lokio/ByteString;->lastIndexOf([BI)I

    move-result p0

    return p0
.end method

.method public final lastIndexOf([B)I
    .locals 3

    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lokio/ByteString;->lastIndexOf$default(Lokio/ByteString;[BIILjava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public lastIndexOf([BI)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, -0x499602d2

    .line 5
    .line 6
    .line 7
    if-ne p2, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    :cond_0
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    array-length v0, v0

    .line 18
    array-length v1, p1

    .line 19
    sub-int/2addr v0, v1

    .line 20
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    :goto_0
    const/4 v0, -0x1

    .line 25
    if-ge v0, p2, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x0

    .line 32
    array-length v2, p1

    .line 33
    invoke-static {v0, p2, p1, v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏([BI[BII)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    return p2

    .line 40
    :cond_1
    add-int/lit8 p2, p2, -0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return v0
.end method

.method public final md5()Lokio/ByteString;
    .locals 1

    .line 1
    const-string v0, "MD5"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lokio/ByteString;->digest$okio(Ljava/lang/String;)Lokio/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public rangeEquals(ILokio/ByteString;II)Z
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    move-result-object p0

    invoke-virtual {p2, p3, p0, p1, p4}, Lokio/ByteString;->rangeEquals(I[BII)Z

    move-result p0

    return p0
.end method

.method public rangeEquals(I[BII)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v0, v0

    .line 11
    sub-int/2addr v0, p4

    .line 12
    if-gt p1, v0, :cond_0

    .line 13
    .line 14
    if-ltz p3, :cond_0

    .line 15
    .line 16
    array-length v0, p2

    .line 17
    sub-int/2addr v0, p4

    .line 18
    if-gt p3, v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏([BI[BII)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public final setHashCode$okio(I)V
    .locals 0

    .line 1
    iput p1, p0, Lokio/ByteString;->hashCode:I

    .line 2
    .line 3
    return-void
.end method

.method public final setUtf8$okio(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokio/ByteString;->utf8:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final sha1()Lokio/ByteString;
    .locals 1

    .line 1
    const-string v0, "SHA-1"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lokio/ByteString;->digest$okio(Ljava/lang/String;)Lokio/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final sha256()Lokio/ByteString;
    .locals 1

    .line 1
    const-string v0, "SHA-256"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lokio/ByteString;->digest$okio(Ljava/lang/String;)Lokio/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final sha512()Lokio/ByteString;
    .locals 1

    .line 1
    const-string v0, "SHA-512"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lokio/ByteString;->digest$okio(Ljava/lang/String;)Lokio/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final size()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lokio/ByteString;->getSize$okio()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final startsWith(Lokio/ByteString;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0, v0, p1, v0, v1}, Lokio/ByteString;->rangeEquals(ILokio/ByteString;II)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final startsWith([B)Z
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 14
    array-length v1, p1

    invoke-virtual {p0, v0, p1, v0, v1}, Lokio/ByteString;->rangeEquals(I[BII)Z

    move-result p0

    return p0
.end method

.method public string(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/String;

    .line 5
    .line 6
    iget-object p0, p0, Lokio/ByteString;->data:[B

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final substring()Lokio/ByteString;
    .locals 3

    .line 83
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v2, v0, v1}, Lokio/ByteString;->substring$default(Lokio/ByteString;IIILjava/lang/Object;)Lokio/ByteString;

    move-result-object p0

    return-object p0
.end method

.method public final substring(I)Lokio/ByteString;
    .locals 3

    .line 82
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lokio/ByteString;->substring$default(Lokio/ByteString;IIILjava/lang/Object;)Lokio/ByteString;

    move-result-object p0

    return-object p0
.end method

.method public substring(II)Lokio/ByteString;
    .locals 2

    .line 1
    const v0, -0x499602d2

    .line 2
    .line 3
    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    if-ltz p1, :cond_4

    .line 12
    .line 13
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    array-length v1, v1

    .line 18
    if-gt p2, v1, :cond_3

    .line 19
    .line 20
    sub-int v1, p2, p1

    .line 21
    .line 22
    if-ltz v1, :cond_2

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    array-length v0, v0

    .line 31
    if-ne p2, v0, :cond_1

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    new-instance v0, Lokio/ByteString;

    .line 35
    .line 36
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p1, p0, p2}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世兰哲苏楪(I[BI)[B

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v0, p0}, Lokio/ByteString;-><init>([B)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    const-string p0, "endIndex < beginIndex"

    .line 49
    .line 50
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string p2, "endIndex > length("

    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    array-length p0, p0

    .line 66
    const/16 p2, 0x29

    .line 67
    .line 68
    invoke-static {p1, p0, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_4
    const-string p0, "beginIndex < 0"

    .line 77
    .line 78
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v0
.end method

.method public toAsciiLowercase()Lokio/ByteString;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    array-length v1, v1

    .line 7
    if-ge v0, v1, :cond_5

    .line 8
    .line 9
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    aget-byte v1, v1, v0

    .line 14
    .line 15
    const/16 v2, 0x41

    .line 16
    .line 17
    if-lt v1, v2, :cond_4

    .line 18
    .line 19
    const/16 v3, 0x5a

    .line 20
    .line 21
    if-le v1, v3, :cond_0

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_0
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    array-length v4, p0

    .line 29
    invoke-static {p0, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    add-int/lit8 v4, v0, 0x1

    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x20

    .line 36
    .line 37
    int-to-byte v1, v1

    .line 38
    aput-byte v1, p0, v0

    .line 39
    .line 40
    :goto_1
    array-length v0, p0

    .line 41
    if-ge v4, v0, :cond_3

    .line 42
    .line 43
    aget-byte v0, p0, v4

    .line 44
    .line 45
    if-lt v0, v2, :cond_2

    .line 46
    .line 47
    if-le v0, v3, :cond_1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    add-int/lit8 v0, v0, 0x20

    .line 51
    .line 52
    int-to-byte v0, v0

    .line 53
    aput-byte v0, p0, v4

    .line 54
    .line 55
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    new-instance v0, Lokio/ByteString;

    .line 59
    .line 60
    invoke-direct {v0, p0}, Lokio/ByteString;-><init>([B)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_4
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_5
    return-object p0
.end method

.method public toAsciiUppercase()Lokio/ByteString;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    array-length v1, v1

    .line 7
    if-ge v0, v1, :cond_5

    .line 8
    .line 9
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    aget-byte v1, v1, v0

    .line 14
    .line 15
    const/16 v2, 0x61

    .line 16
    .line 17
    if-lt v1, v2, :cond_4

    .line 18
    .line 19
    const/16 v3, 0x7a

    .line 20
    .line 21
    if-le v1, v3, :cond_0

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_0
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    array-length v4, p0

    .line 29
    invoke-static {p0, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    add-int/lit8 v4, v0, 0x1

    .line 34
    .line 35
    add-int/lit8 v1, v1, -0x20

    .line 36
    .line 37
    int-to-byte v1, v1

    .line 38
    aput-byte v1, p0, v0

    .line 39
    .line 40
    :goto_1
    array-length v0, p0

    .line 41
    if-ge v4, v0, :cond_3

    .line 42
    .line 43
    aget-byte v0, p0, v4

    .line 44
    .line 45
    if-lt v0, v2, :cond_2

    .line 46
    .line 47
    if-le v0, v3, :cond_1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    add-int/lit8 v0, v0, -0x20

    .line 51
    .line 52
    int-to-byte v0, v0

    .line 53
    aput-byte v0, p0, v4

    .line 54
    .line 55
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    new-instance v0, Lokio/ByteString;

    .line 59
    .line 60
    invoke-direct {v0, p0}, Lokio/ByteString;-><init>([B)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_4
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_5
    return-object p0
.end method

.method public toByteArray()[B
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, Lokio/ByteString;->getData$okio()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "[size=0]"

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lokio/ByteString;->getData$okio()[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    array-length v1, v0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    :cond_1
    :goto_0
    const/16 v7, 0x40

    .line 20
    .line 21
    if-ge v3, v1, :cond_2f

    .line 22
    .line 23
    aget-byte v8, v0, v3

    .line 24
    .line 25
    const v9, 0xfffd

    .line 26
    .line 27
    .line 28
    const/16 v10, 0xa0

    .line 29
    .line 30
    const/16 v11, 0x7f

    .line 31
    .line 32
    const/16 v12, 0x20

    .line 33
    .line 34
    const/16 v13, 0xd

    .line 35
    .line 36
    const/16 v14, 0xa

    .line 37
    .line 38
    const/high16 v15, 0x10000

    .line 39
    .line 40
    const/16 v16, 0x2

    .line 41
    .line 42
    const/16 v17, 0x1

    .line 43
    .line 44
    if-ltz v8, :cond_c

    .line 45
    .line 46
    add-int/lit8 v18, v5, 0x1

    .line 47
    .line 48
    if-ne v5, v7, :cond_2

    .line 49
    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :cond_2
    if-eq v8, v14, :cond_4

    .line 53
    .line 54
    if-eq v8, v13, :cond_4

    .line 55
    .line 56
    if-ltz v8, :cond_3

    .line 57
    .line 58
    if-ge v8, v12, :cond_3

    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    .line 62
    :cond_3
    if-gt v11, v8, :cond_4

    .line 63
    .line 64
    if-ge v8, v10, :cond_4

    .line 65
    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_4
    if-ne v8, v9, :cond_5

    .line 69
    .line 70
    goto/16 :goto_5

    .line 71
    .line 72
    :cond_5
    if-ge v8, v15, :cond_6

    .line 73
    .line 74
    move/from16 v5, v17

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_6
    move/from16 v5, v16

    .line 78
    .line 79
    :goto_1
    add-int/2addr v4, v5

    .line 80
    add-int/lit8 v3, v3, 0x1

    .line 81
    .line 82
    :goto_2
    move/from16 v5, v18

    .line 83
    .line 84
    if-ge v3, v1, :cond_1

    .line 85
    .line 86
    aget-byte v8, v0, v3

    .line 87
    .line 88
    if-ltz v8, :cond_1

    .line 89
    .line 90
    add-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    add-int/lit8 v18, v5, 0x1

    .line 93
    .line 94
    if-ne v5, v7, :cond_7

    .line 95
    .line 96
    goto/16 :goto_6

    .line 97
    .line 98
    :cond_7
    if-eq v8, v14, :cond_9

    .line 99
    .line 100
    if-eq v8, v13, :cond_9

    .line 101
    .line 102
    if-ltz v8, :cond_8

    .line 103
    .line 104
    if-ge v8, v12, :cond_8

    .line 105
    .line 106
    goto/16 :goto_5

    .line 107
    .line 108
    :cond_8
    if-gt v11, v8, :cond_9

    .line 109
    .line 110
    if-ge v8, v10, :cond_9

    .line 111
    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :cond_9
    if-ne v8, v9, :cond_a

    .line 115
    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :cond_a
    if-ge v8, v15, :cond_b

    .line 119
    .line 120
    move/from16 v5, v17

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_b
    move/from16 v5, v16

    .line 124
    .line 125
    :goto_3
    add-int/2addr v4, v5

    .line 126
    goto :goto_2

    .line 127
    :cond_c
    shr-int/lit8 v2, v8, 0x5

    .line 128
    .line 129
    const/4 v6, -0x2

    .line 130
    const/16 v15, 0x80

    .line 131
    .line 132
    if-ne v2, v6, :cond_15

    .line 133
    .line 134
    add-int/lit8 v2, v3, 0x1

    .line 135
    .line 136
    if-gt v1, v2, :cond_d

    .line 137
    .line 138
    if-ne v5, v7, :cond_2e

    .line 139
    .line 140
    goto/16 :goto_6

    .line 141
    .line 142
    :cond_d
    aget-byte v2, v0, v2

    .line 143
    .line 144
    and-int/lit16 v6, v2, 0xc0

    .line 145
    .line 146
    if-ne v6, v15, :cond_14

    .line 147
    .line 148
    xor-int/lit16 v2, v2, 0xf80

    .line 149
    .line 150
    shl-int/lit8 v6, v8, 0x6

    .line 151
    .line 152
    xor-int/2addr v2, v6

    .line 153
    if-ge v2, v15, :cond_e

    .line 154
    .line 155
    if-ne v5, v7, :cond_2e

    .line 156
    .line 157
    goto/16 :goto_6

    .line 158
    .line 159
    :cond_e
    add-int/lit8 v6, v5, 0x1

    .line 160
    .line 161
    if-ne v5, v7, :cond_f

    .line 162
    .line 163
    goto/16 :goto_6

    .line 164
    .line 165
    :cond_f
    if-eq v2, v14, :cond_11

    .line 166
    .line 167
    if-eq v2, v13, :cond_11

    .line 168
    .line 169
    if-ltz v2, :cond_10

    .line 170
    .line 171
    if-ge v2, v12, :cond_10

    .line 172
    .line 173
    goto/16 :goto_5

    .line 174
    .line 175
    :cond_10
    if-gt v11, v2, :cond_11

    .line 176
    .line 177
    if-ge v2, v10, :cond_11

    .line 178
    .line 179
    goto/16 :goto_5

    .line 180
    .line 181
    :cond_11
    if-ne v2, v9, :cond_12

    .line 182
    .line 183
    goto/16 :goto_5

    .line 184
    .line 185
    :cond_12
    const/high16 v5, 0x10000

    .line 186
    .line 187
    if-ge v2, v5, :cond_13

    .line 188
    .line 189
    move/from16 v16, v17

    .line 190
    .line 191
    :cond_13
    add-int v4, v4, v16

    .line 192
    .line 193
    add-int/lit8 v3, v3, 0x2

    .line 194
    .line 195
    :goto_4
    move v5, v6

    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_14
    if-ne v5, v7, :cond_2e

    .line 199
    .line 200
    goto/16 :goto_6

    .line 201
    .line 202
    :cond_15
    shr-int/lit8 v2, v8, 0x4

    .line 203
    .line 204
    const v9, 0xe000

    .line 205
    .line 206
    .line 207
    const v10, 0xd800

    .line 208
    .line 209
    .line 210
    if-ne v2, v6, :cond_20

    .line 211
    .line 212
    add-int/lit8 v2, v3, 0x2

    .line 213
    .line 214
    if-gt v1, v2, :cond_16

    .line 215
    .line 216
    if-ne v5, v7, :cond_2e

    .line 217
    .line 218
    goto/16 :goto_6

    .line 219
    .line 220
    :cond_16
    add-int/lit8 v6, v3, 0x1

    .line 221
    .line 222
    aget-byte v6, v0, v6

    .line 223
    .line 224
    and-int/lit16 v11, v6, 0xc0

    .line 225
    .line 226
    if-ne v11, v15, :cond_1f

    .line 227
    .line 228
    aget-byte v2, v0, v2

    .line 229
    .line 230
    and-int/lit16 v11, v2, 0xc0

    .line 231
    .line 232
    if-ne v11, v15, :cond_1e

    .line 233
    .line 234
    const v11, -0x1e080

    .line 235
    .line 236
    .line 237
    xor-int/2addr v2, v11

    .line 238
    shl-int/lit8 v6, v6, 0x6

    .line 239
    .line 240
    xor-int/2addr v2, v6

    .line 241
    shl-int/lit8 v6, v8, 0xc

    .line 242
    .line 243
    xor-int/2addr v2, v6

    .line 244
    const/16 v6, 0x800

    .line 245
    .line 246
    if-ge v2, v6, :cond_17

    .line 247
    .line 248
    if-ne v5, v7, :cond_2e

    .line 249
    .line 250
    goto/16 :goto_6

    .line 251
    .line 252
    :cond_17
    if-gt v10, v2, :cond_18

    .line 253
    .line 254
    if-ge v2, v9, :cond_18

    .line 255
    .line 256
    if-ne v5, v7, :cond_2e

    .line 257
    .line 258
    goto/16 :goto_6

    .line 259
    .line 260
    :cond_18
    add-int/lit8 v6, v5, 0x1

    .line 261
    .line 262
    if-ne v5, v7, :cond_19

    .line 263
    .line 264
    goto/16 :goto_6

    .line 265
    .line 266
    :cond_19
    if-eq v2, v14, :cond_1b

    .line 267
    .line 268
    if-eq v2, v13, :cond_1b

    .line 269
    .line 270
    if-ltz v2, :cond_1a

    .line 271
    .line 272
    if-ge v2, v12, :cond_1a

    .line 273
    .line 274
    goto/16 :goto_5

    .line 275
    .line 276
    :cond_1a
    const/16 v5, 0x7f

    .line 277
    .line 278
    if-gt v5, v2, :cond_1b

    .line 279
    .line 280
    const/16 v5, 0xa0

    .line 281
    .line 282
    if-ge v2, v5, :cond_1b

    .line 283
    .line 284
    goto/16 :goto_5

    .line 285
    .line 286
    :cond_1b
    const v5, 0xfffd

    .line 287
    .line 288
    .line 289
    if-ne v2, v5, :cond_1c

    .line 290
    .line 291
    goto/16 :goto_5

    .line 292
    .line 293
    :cond_1c
    const/high16 v5, 0x10000

    .line 294
    .line 295
    if-ge v2, v5, :cond_1d

    .line 296
    .line 297
    move/from16 v16, v17

    .line 298
    .line 299
    :cond_1d
    add-int v4, v4, v16

    .line 300
    .line 301
    add-int/lit8 v3, v3, 0x3

    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_1e
    if-ne v5, v7, :cond_2e

    .line 305
    .line 306
    goto/16 :goto_6

    .line 307
    .line 308
    :cond_1f
    if-ne v5, v7, :cond_2e

    .line 309
    .line 310
    goto/16 :goto_6

    .line 311
    .line 312
    :cond_20
    shr-int/lit8 v2, v8, 0x3

    .line 313
    .line 314
    if-ne v2, v6, :cond_2d

    .line 315
    .line 316
    add-int/lit8 v2, v3, 0x3

    .line 317
    .line 318
    if-gt v1, v2, :cond_21

    .line 319
    .line 320
    if-ne v5, v7, :cond_2e

    .line 321
    .line 322
    goto/16 :goto_6

    .line 323
    .line 324
    :cond_21
    add-int/lit8 v6, v3, 0x1

    .line 325
    .line 326
    aget-byte v6, v0, v6

    .line 327
    .line 328
    and-int/lit16 v11, v6, 0xc0

    .line 329
    .line 330
    if-ne v11, v15, :cond_2c

    .line 331
    .line 332
    add-int/lit8 v11, v3, 0x2

    .line 333
    .line 334
    aget-byte v11, v0, v11

    .line 335
    .line 336
    and-int/lit16 v12, v11, 0xc0

    .line 337
    .line 338
    if-ne v12, v15, :cond_2b

    .line 339
    .line 340
    aget-byte v2, v0, v2

    .line 341
    .line 342
    and-int/lit16 v12, v2, 0xc0

    .line 343
    .line 344
    if-ne v12, v15, :cond_2a

    .line 345
    .line 346
    const v12, 0x381f80

    .line 347
    .line 348
    .line 349
    xor-int/2addr v2, v12

    .line 350
    shl-int/lit8 v11, v11, 0x6

    .line 351
    .line 352
    xor-int/2addr v2, v11

    .line 353
    shl-int/lit8 v6, v6, 0xc

    .line 354
    .line 355
    xor-int/2addr v2, v6

    .line 356
    shl-int/lit8 v6, v8, 0x12

    .line 357
    .line 358
    xor-int/2addr v2, v6

    .line 359
    const v6, 0x10ffff

    .line 360
    .line 361
    .line 362
    if-le v2, v6, :cond_22

    .line 363
    .line 364
    if-ne v5, v7, :cond_2e

    .line 365
    .line 366
    goto :goto_6

    .line 367
    :cond_22
    if-gt v10, v2, :cond_23

    .line 368
    .line 369
    if-ge v2, v9, :cond_23

    .line 370
    .line 371
    if-ne v5, v7, :cond_2e

    .line 372
    .line 373
    goto :goto_6

    .line 374
    :cond_23
    const/high16 v6, 0x10000

    .line 375
    .line 376
    if-ge v2, v6, :cond_24

    .line 377
    .line 378
    if-ne v5, v7, :cond_2e

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_24
    add-int/lit8 v6, v5, 0x1

    .line 382
    .line 383
    if-ne v5, v7, :cond_25

    .line 384
    .line 385
    goto :goto_6

    .line 386
    :cond_25
    if-eq v2, v14, :cond_27

    .line 387
    .line 388
    if-eq v2, v13, :cond_27

    .line 389
    .line 390
    if-ltz v2, :cond_26

    .line 391
    .line 392
    const/16 v5, 0x20

    .line 393
    .line 394
    if-ge v2, v5, :cond_26

    .line 395
    .line 396
    goto :goto_5

    .line 397
    :cond_26
    const/16 v5, 0x7f

    .line 398
    .line 399
    if-gt v5, v2, :cond_27

    .line 400
    .line 401
    const/16 v5, 0xa0

    .line 402
    .line 403
    if-ge v2, v5, :cond_27

    .line 404
    .line 405
    goto :goto_5

    .line 406
    :cond_27
    const v5, 0xfffd

    .line 407
    .line 408
    .line 409
    if-ne v2, v5, :cond_28

    .line 410
    .line 411
    goto :goto_5

    .line 412
    :cond_28
    const/high16 v5, 0x10000

    .line 413
    .line 414
    if-ge v2, v5, :cond_29

    .line 415
    .line 416
    move/from16 v16, v17

    .line 417
    .line 418
    :cond_29
    add-int v4, v4, v16

    .line 419
    .line 420
    add-int/lit8 v3, v3, 0x4

    .line 421
    .line 422
    goto/16 :goto_4

    .line 423
    .line 424
    :cond_2a
    if-ne v5, v7, :cond_2e

    .line 425
    .line 426
    goto :goto_6

    .line 427
    :cond_2b
    if-ne v5, v7, :cond_2e

    .line 428
    .line 429
    goto :goto_6

    .line 430
    :cond_2c
    if-ne v5, v7, :cond_2e

    .line 431
    .line 432
    goto :goto_6

    .line 433
    :cond_2d
    if-ne v5, v7, :cond_2e

    .line 434
    .line 435
    goto :goto_6

    .line 436
    :cond_2e
    :goto_5
    const/4 v4, -0x1

    .line 437
    :cond_2f
    :goto_6
    const-string v0, "\u2026]"

    .line 438
    .line 439
    const-string v1, "[size="

    .line 440
    .line 441
    const/16 v2, 0x5d

    .line 442
    .line 443
    const/4 v3, -0x1

    .line 444
    if-ne v4, v3, :cond_33

    .line 445
    .line 446
    invoke-virtual/range {p0 .. p0}, Lokio/ByteString;->getData$okio()[B

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    array-length v3, v3

    .line 451
    if-gt v3, v7, :cond_30

    .line 452
    .line 453
    new-instance v0, Ljava/lang/StringBuilder;

    .line 454
    .line 455
    const-string v1, "[hex="

    .line 456
    .line 457
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {p0 .. p0}, Lokio/ByteString;->hex()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    return-object v0

    .line 475
    :cond_30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 476
    .line 477
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {p0 .. p0}, Lokio/ByteString;->getData$okio()[B

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    array-length v1, v1

    .line 485
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    const-string v1, " hex="

    .line 489
    .line 490
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {p0 .. p0}, Lokio/ByteString;->getData$okio()[B

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    array-length v1, v1

    .line 498
    if-gt v7, v1, :cond_32

    .line 499
    .line 500
    invoke-virtual/range {p0 .. p0}, Lokio/ByteString;->getData$okio()[B

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    array-length v1, v1

    .line 505
    if-ne v7, v1, :cond_31

    .line 506
    .line 507
    move-object/from16 v1, p0

    .line 508
    .line 509
    goto :goto_7

    .line 510
    :cond_31
    new-instance v1, Lokio/ByteString;

    .line 511
    .line 512
    invoke-virtual/range {p0 .. p0}, Lokio/ByteString;->getData$okio()[B

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    const/4 v4, 0x0

    .line 517
    invoke-static {v4, v3, v7}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世兰哲苏楪(I[BI)[B

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    invoke-direct {v1, v3}, Lokio/ByteString;-><init>([B)V

    .line 522
    .line 523
    .line 524
    :goto_7
    invoke-virtual {v1}, Lokio/ByteString;->hex()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    return-object v0

    .line 539
    :cond_32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 540
    .line 541
    const-string v1, "endIndex > length("

    .line 542
    .line 543
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {p0 .. p0}, Lokio/ByteString;->getData$okio()[B

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    array-length v1, v1

    .line 551
    const/16 v2, 0x29

    .line 552
    .line 553
    invoke-static {v0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    const/4 v0, 0x0

    .line 561
    return-object v0

    .line 562
    :cond_33
    invoke-virtual/range {p0 .. p0}, Lokio/ByteString;->utf8()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v3

    .line 566
    const/4 v5, 0x0

    .line 567
    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v5

    .line 571
    const-string v6, "\\"

    .line 572
    .line 573
    const-string v7, "\\\\"

    .line 574
    .line 575
    invoke-static {v5, v6, v7}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v5

    .line 579
    const-string v6, "\n"

    .line 580
    .line 581
    const-string v7, "\\n"

    .line 582
    .line 583
    invoke-static {v5, v6, v7}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v5

    .line 587
    const-string v6, "\r"

    .line 588
    .line 589
    const-string v7, "\\r"

    .line 590
    .line 591
    invoke-static {v5, v6, v7}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v5

    .line 595
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 596
    .line 597
    .line 598
    move-result v3

    .line 599
    if-ge v4, v3, :cond_34

    .line 600
    .line 601
    new-instance v2, Ljava/lang/StringBuilder;

    .line 602
    .line 603
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {p0 .. p0}, Lokio/ByteString;->getData$okio()[B

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    array-length v1, v1

    .line 611
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    const-string v1, " text="

    .line 615
    .line 616
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    return-object v0

    .line 630
    :cond_34
    const-string v0, "[text="

    .line 631
    .line 632
    invoke-static {v2, v0, v5}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏哲世兰(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    return-object v0
.end method

.method public utf8()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lokio/ByteString;->getUtf8$okio()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lokio/ByteString;->internalArray$okio()[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/lang/String;

    .line 15
    .line 16
    sget-object v2, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 17
    .line 18
    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lokio/ByteString;->setUtf8$okio(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_0
    return-object v0
.end method

.method public write(Ljava/io/OutputStream;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lokio/ByteString;->data:[B

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Ljava/io/OutputStream;->write([B)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public write$okio(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;II)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/ByteString;->getData$okio()[B

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p1, p0, p2, p3}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->write([BII)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
