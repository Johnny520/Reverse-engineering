.class public abstract Lcom/google/flatbuffers/Utf8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/Utf8$UnpairedSurrogateException;,
        Lcom/google/flatbuffers/Utf8$DecodeUtil;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static DEFAULT:Lcom/google/flatbuffers/Utf8;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static encodeUtf8CodePoint(Ljava/lang/CharSequence;I[B)I
    .locals 8

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lt p1, v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0x80

    if-ge v2, v4, :cond_1

    int-to-byte p0, v2

    aput-byte p0, p2, v1

    return v3

    :cond_1
    const/16 v5, 0x800

    const/4 v6, 0x2

    if-ge v2, v5, :cond_2

    ushr-int/lit8 p0, v2, 0x6

    or-int/lit16 p0, p0, 0xc0

    int-to-byte p0, p0

    aput-byte p0, p2, v1

    and-int/lit8 p0, v2, 0x3f

    or-int/2addr p0, v4

    int-to-byte p0, p0

    aput-byte p0, p2, v3

    return v6

    :cond_2
    const v5, 0xd800

    const/4 v7, 0x3

    if-lt v2, v5, :cond_5

    const v5, 0xdfff

    if-ge v5, v2, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v5, p1, 0x1

    if-eq v5, v0, :cond_4

    invoke-interface {p0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    invoke-static {v2, p0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v2, p0}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result p0

    ushr-int/lit8 p1, p0, 0x12

    or-int/lit16 p1, p1, 0xf0

    int-to-byte p1, p1

    aput-byte p1, p2, v1

    ushr-int/lit8 p1, p0, 0xc

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p1, v4

    int-to-byte p1, p1

    aput-byte p1, p2, v3

    ushr-int/lit8 p1, p0, 0x6

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p1, v4

    int-to-byte p1, p1

    aput-byte p1, p2, v6

    and-int/lit8 p0, p0, 0x3f

    or-int/2addr p0, v4

    int-to-byte p0, p0

    aput-byte p0, p2, v7

    const/4 p0, 0x4

    return p0

    :cond_4
    new-instance p0, Lcom/google/flatbuffers/Utf8$UnpairedSurrogateException;

    invoke-direct {p0, p1, v0}, Lcom/google/flatbuffers/Utf8$UnpairedSurrogateException;-><init>(II)V

    throw p0

    :cond_5
    :goto_0
    ushr-int/lit8 p0, v2, 0xc

    or-int/lit16 p0, p0, 0xe0

    int-to-byte p0, p0

    aput-byte p0, p2, v1

    ushr-int/lit8 p0, v2, 0x6

    and-int/lit8 p0, p0, 0x3f

    or-int/2addr p0, v4

    int-to-byte p0, p0

    aput-byte p0, p2, v3

    and-int/lit8 p0, v2, 0x3f

    or-int/2addr p0, v4

    int-to-byte p0, p0

    aput-byte p0, p2, v6

    return v7
.end method

.method public static getDefault()Lcom/google/flatbuffers/Utf8;
    .locals 1

    sget-object v0, Lcom/google/flatbuffers/Utf8;->DEFAULT:Lcom/google/flatbuffers/Utf8;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/flatbuffers/Utf8Safe;

    invoke-direct {v0}, Lcom/google/flatbuffers/Utf8Safe;-><init>()V

    sput-object v0, Lcom/google/flatbuffers/Utf8;->DEFAULT:Lcom/google/flatbuffers/Utf8;

    :cond_0
    sget-object v0, Lcom/google/flatbuffers/Utf8;->DEFAULT:Lcom/google/flatbuffers/Utf8;

    return-object v0
.end method

.method public static setDefault(Lcom/google/flatbuffers/Utf8;)V
    .locals 0

    sput-object p0, Lcom/google/flatbuffers/Utf8;->DEFAULT:Lcom/google/flatbuffers/Utf8;

    return-void
.end method


# virtual methods
.method public abstract decodeUtf8(Ljava/nio/ByteBuffer;II)Ljava/lang/String;
.end method

.method public abstract encodeUtf8(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
.end method

.method public abstract encodedLength(Ljava/lang/CharSequence;)I
.end method
