.class public final Lcom/github/megatronking/stringfog/Base64;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/megatronking/stringfog/Base64$Decoder;,
        Lcom/github/megatronking/stringfog/Base64$Encoder;,
        Lcom/github/megatronking/stringfog/Base64$Coder;
    }
.end annotation


# static fields
.field private static final CRLF:I = 0x4

.field public static final DEFAULT:I = 0x0

.field public static final NO_PADDING:I = 0x1

.field public static final NO_WRAP:I = 0x2

.field private static final URL_SAFE:I = 0x8


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static decode(Ljava/lang/String;I)[B
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-static {p0, p1}, Lcom/github/megatronking/stringfog/Base64;->decode([BI)[B

    move-result-object p0

    return-object p0
.end method

.method public static decode([BI)[B
    .locals 2

    const/4 v0, 0x0

    .line 2
    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lcom/github/megatronking/stringfog/Base64;->decode([BIII)[B

    move-result-object p0

    return-object p0
.end method

.method private static decode([BIII)[B
    .locals 3

    .line 3
    new-instance v0, Lcom/github/megatronking/stringfog/Base64$Decoder;

    mul-int/lit8 v1, p2, 0x3

    div-int/lit8 v1, v1, 0x4

    new-array v1, v1, [B

    const/4 v2, 0x0

    invoke-direct {v0, v1, p3, v2}, Lcom/github/megatronking/stringfog/Base64$Decoder;-><init>([BII)V

    const/4 p3, 0x1

    .line 4
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/github/megatronking/stringfog/Base64$Decoder;->process([BIIZ)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 5
    iget p0, v0, Lcom/github/megatronking/stringfog/Base64$Coder;->op:I

    iget-object p1, v0, Lcom/github/megatronking/stringfog/Base64$Coder;->output:[B

    array-length p2, p1

    if-ne p0, p2, :cond_0

    return-object p1

    .line 6
    :cond_0
    new-array p2, p0, [B

    .line 7
    invoke-static {p1, v2, p2, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p2

    .line 8
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "bad base-64"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static encode(Ljava/lang/String;I)[B
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-static {p0, p1}, Lcom/github/megatronking/stringfog/Base64;->encode([BI)[B

    move-result-object p0

    return-object p0
.end method

.method public static encode([BI)[B
    .locals 2

    const/4 v0, 0x0

    .line 2
    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lcom/github/megatronking/stringfog/Base64;->encode([BIII)[B

    move-result-object p0

    return-object p0
.end method

.method private static encode([BIII)[B
    .locals 5

    .line 3
    new-instance v0, Lcom/github/megatronking/stringfog/Base64$Encoder;

    invoke-direct {v0, p3}, Lcom/github/megatronking/stringfog/Base64$Encoder;-><init>(I)V

    .line 4
    div-int/lit8 p3, p2, 0x3

    mul-int/lit8 p3, p3, 0x4

    .line 5
    iget-boolean v1, v0, Lcom/github/megatronking/stringfog/Base64$Encoder;->do_padding:Z

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    .line 6
    rem-int/lit8 v1, p2, 0x3

    if-lez v1, :cond_3

    add-int/lit8 p3, p3, 0x4

    goto :goto_0

    .line 7
    :cond_0
    rem-int/lit8 v1, p2, 0x3

    if-eq v1, v3, :cond_2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 p3, p3, 0x3

    goto :goto_0

    :cond_2
    add-int/lit8 p3, p3, 0x2

    .line 8
    :cond_3
    :goto_0
    iget-boolean v1, v0, Lcom/github/megatronking/stringfog/Base64$Encoder;->do_newline:Z

    if-eqz v1, :cond_5

    if-lez p2, :cond_5

    add-int/lit8 v1, p2, -0x1

    .line 9
    div-int/lit8 v1, v1, 0x39

    add-int/2addr v1, v3

    .line 10
    iget-boolean v4, v0, Lcom/github/megatronking/stringfog/Base64$Encoder;->do_cr:Z

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    move v2, v3

    :goto_1
    mul-int/2addr v1, v2

    add-int/2addr p3, v1

    .line 11
    :cond_5
    new-array p3, p3, [B

    iput-object p3, v0, Lcom/github/megatronking/stringfog/Base64$Coder;->output:[B

    .line 12
    invoke-virtual {v0, p0, p1, p2, v3}, Lcom/github/megatronking/stringfog/Base64$Encoder;->process([BIIZ)Z

    .line 13
    iget-object p0, v0, Lcom/github/megatronking/stringfog/Base64$Coder;->output:[B

    return-object p0
.end method
