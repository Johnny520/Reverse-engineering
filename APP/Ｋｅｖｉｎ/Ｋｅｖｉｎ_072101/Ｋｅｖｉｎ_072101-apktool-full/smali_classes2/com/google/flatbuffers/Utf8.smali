.class public abstract Lcom/google/flatbuffers/Utf8;
.super Ljava/lang/Object;
.source "Utf8.java"


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

    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static encodeUtf8CodePoint(Ljava/lang/CharSequence;I[B)I
    .locals 10
    .param p0, "in"    # Ljava/lang/CharSequence;
    .param p1, "start"    # I
    .param p2, "out"    # [B

    .line 89
    nop

    .line 91
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 92
    .local v0, "inLength":I
    const/4 v1, 0x0

    if-lt p1, v0, :cond_0

    .line 93
    return v1

    .line 96
    :cond_0
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    .line 97
    .local v2, "c":C
    const/4 v3, 0x1

    const/16 v4, 0x80

    if-ge v2, v4, :cond_1

    .line 99
    int-to-byte v4, v2

    aput-byte v4, p2, v1

    .line 100
    return v3

    .line 101
    :cond_1
    const/16 v5, 0x800

    const/4 v6, 0x2

    if-ge v2, v5, :cond_2

    .line 103
    ushr-int/lit8 v5, v2, 0x6

    or-int/lit16 v5, v5, 0xc0

    int-to-byte v5, v5

    aput-byte v5, p2, v1

    .line 104
    and-int/lit8 v1, v2, 0x3f

    or-int/2addr v1, v4

    int-to-byte v1, v1

    aput-byte v1, p2, v3

    .line 105
    return v6

    .line 106
    :cond_2
    const v5, 0xd800

    const/4 v7, 0x3

    if-lt v2, v5, :cond_5

    const v5, 0xdfff

    if-ge v5, v2, :cond_3

    goto :goto_0

    .line 118
    :cond_3
    add-int/lit8 v5, p1, 0x1

    if-eq v5, v0, :cond_4

    add-int/lit8 v5, p1, 0x1

    invoke-interface {p0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    move v8, v5

    .local v8, "low":C
    invoke-static {v2, v5}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 121
    invoke-static {v2, v8}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v5

    .line 122
    .local v5, "codePoint":I
    ushr-int/lit8 v9, v5, 0x12

    or-int/lit16 v9, v9, 0xf0

    int-to-byte v9, v9

    aput-byte v9, p2, v1

    .line 123
    ushr-int/lit8 v1, v5, 0xc

    and-int/lit8 v1, v1, 0x3f

    or-int/2addr v1, v4

    int-to-byte v1, v1

    aput-byte v1, p2, v3

    .line 124
    ushr-int/lit8 v1, v5, 0x6

    and-int/lit8 v1, v1, 0x3f

    or-int/2addr v1, v4

    int-to-byte v1, v1

    aput-byte v1, p2, v6

    .line 125
    and-int/lit8 v1, v5, 0x3f

    or-int/2addr v1, v4

    int-to-byte v1, v1

    aput-byte v1, p2, v7

    .line 126
    const/4 v1, 0x4

    return v1

    .line 119
    .end local v5    # "codePoint":I
    .end local v8    # "low":C
    :cond_4
    new-instance v1, Lcom/google/flatbuffers/Utf8$UnpairedSurrogateException;

    invoke-direct {v1, p1, v0}, Lcom/google/flatbuffers/Utf8$UnpairedSurrogateException;-><init>(II)V

    throw v1

    .line 109
    :cond_5
    :goto_0
    ushr-int/lit8 v5, v2, 0xc

    or-int/lit16 v5, v5, 0xe0

    int-to-byte v5, v5

    aput-byte v5, p2, v1

    .line 110
    ushr-int/lit8 v1, v2, 0x6

    and-int/lit8 v1, v1, 0x3f

    or-int/2addr v1, v4

    int-to-byte v1, v1

    aput-byte v1, p2, v3

    .line 111
    and-int/lit8 v1, v2, 0x3f

    or-int/2addr v1, v4

    int-to-byte v1, v1

    aput-byte v1, p2, v6

    .line 112
    return v7
.end method

.method public static getDefault()Lcom/google/flatbuffers/Utf8;
    .locals 1

    .line 66
    sget-object v0, Lcom/google/flatbuffers/Utf8;->DEFAULT:Lcom/google/flatbuffers/Utf8;

    if-nez v0, :cond_0

    .line 67
    new-instance v0, Lcom/google/flatbuffers/Utf8Safe;

    invoke-direct {v0}, Lcom/google/flatbuffers/Utf8Safe;-><init>()V

    sput-object v0, Lcom/google/flatbuffers/Utf8;->DEFAULT:Lcom/google/flatbuffers/Utf8;

    .line 69
    :cond_0
    sget-object v0, Lcom/google/flatbuffers/Utf8;->DEFAULT:Lcom/google/flatbuffers/Utf8;

    return-object v0
.end method

.method public static setDefault(Lcom/google/flatbuffers/Utf8;)V
    .locals 0
    .param p0, "instance"    # Lcom/google/flatbuffers/Utf8;

    .line 77
    sput-object p0, Lcom/google/flatbuffers/Utf8;->DEFAULT:Lcom/google/flatbuffers/Utf8;

    .line 78
    return-void
.end method


# virtual methods
.method public abstract decodeUtf8(Ljava/nio/ByteBuffer;II)Ljava/lang/String;
.end method

.method public abstract encodeUtf8(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
.end method

.method public abstract encodedLength(Ljava/lang/CharSequence;)I
.end method
