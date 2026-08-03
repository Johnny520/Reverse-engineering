.class public final LYue/ۥۣ۟ۥۤ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n271#2:365\n275#2,3:366\n282#2,3:369\n289#2,2:372\n295#2:374\n297#2,7:376\n1#3:375\n1#3:383\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n*L\n234#1:365\n239#1:366,3\n251#1:369,3\n259#1:372,2\n262#1:374\n262#1:376,7\n262#1:375\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۥۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n271#2:365\n275#2,3:366\n282#2,3:369\n289#2,2:372\n295#2:374\n297#2,7:376\n1#3:375\n1#3:383\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n*L\n234#1:365\n239#1:366,3\n251#1:369,3\n259#1:372,2\n262#1:374\n262#1:376,7\n262#1:375\n*E\n"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۣ۟ۥۤ$ۥ;-><init>()V

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۥ(LYue/ۥۣ۟ۥۤ$ۥ;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)LYue/ۥۣ۟ۥۤ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    sget-object p2, LYue/ۥ۟ۤۤ۠;->ۥ۟:Ljava/nio/charset/Charset;

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/nio/charset/Charset;)LYue/ۥۣ۟ۥۤ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۠۟(LYue/ۥۣ۟ۥۤ$ۥ;[BIIILjava/lang/Object;)LYue/ۥۣ۟ۥۤ;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    invoke-static {}, LYue/ۥ۟۟۠۟;->ۥ۟۟۟۠()I

    move-result p3

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۠([BII)LYue/ۥۣ۟ۥۤ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۥ(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "string.decodeBase64()"
            imports = {
                "okio.ByteString.Companion.decodeBase64"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_decodeBase64"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "string"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۟ۢ(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "string.decodeHex()"
            imports = {
                "okio.ByteString.Companion.decodeHex"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_decodeHex"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "string"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥۣ۟۟۟(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/lang/String;Ljava/nio/charset/Charset;)LYue/ۥۣ۟ۥۤ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/nio/charset/Charset;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "string.encode(charset)"
            imports = {
                "okio.ByteString.Companion.encode"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_encodeString"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "string"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/nio/charset/Charset;)LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "string.encodeUtf8()"
            imports = {
                "okio.ByteString.Companion.encodeUtf8"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_encodeUtf8"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "string"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟۟(Ljava/nio/ByteBuffer;)LYue/ۥۣ۟ۥۤ;
    .locals 1
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "buffer.toByteString()"
            imports = {
                "okio.ByteString.Companion.toByteString"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_of"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "buffer"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۟ۧ(Ljava/nio/ByteBuffer;)LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟۠([BII)LYue/ۥۣ۟ۥۤ;
    .locals 1
    .param p1    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "array.toByteString(offset, byteCount)"
            imports = {
                "okio.ByteString.Companion.toByteString"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_of"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "array"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۠([BII)LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟ۡ(Ljava/io/InputStream;I)LYue/ۥۣ۟ۥۤ;
    .locals 1
    .param p1    # Ljava/io/InputStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "inputstream.readByteString(byteCount)"
            imports = {
                "okio.ByteString.Companion.readByteString"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_read"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "inputstream"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۠۠(Ljava/io/InputStream;I)LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟ۢ(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥ;->ۥ(Ljava/lang/String;)[B

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, LYue/ۥۣ۟ۥۤ;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۥۤ;-><init>([B)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final ۥۣ۟۟۟(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v3, v2, 0x2

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, LYue/ۥ۟۟;->ۥ۟(C)I

    move-result v4

    shl-int/lit8 v4, v4, 0x4

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, LYue/ۥ۟۟;->ۥ۟(C)I

    move-result v3

    add-int/2addr v4, v3

    int-to-byte v3, v4

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, LYue/ۥۣ۟ۥۤ;

    invoke-direct {p1, v1}, LYue/ۥۣ۟ۥۤ;-><init>([B)V

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected hex string: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/nio/charset/Charset;)LYue/ۥۣ۟ۥۤ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/nio/charset/Charset;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "encodeString"
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣ۟ۥۤ;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string p2, "this as java.lang.String).getBytes(charset)"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۥۤ;-><init>([B)V

    return-object v0
.end method

.method public final ۥ۟۟۟ۦ(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣ۟ۥۤ;

    invoke-static {p1}, LYue/ۥۢۦۤ۟;->ۥ(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥۣ۟ۥۤ;-><init>([B)V

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۥۤ;->ۥۣ۟۟ۧ(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۥ۟۟۟ۧ(Ljava/nio/ByteBuffer;)LYue/ۥۣ۟ۥۤ;
    .locals 1
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "of"
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance p1, LYue/ۥۣ۟ۥۤ;

    invoke-direct {p1, v0}, LYue/ۥۣ۟ۥۤ;-><init>([B)V

    return-object p1
.end method

.method public final varargs ۥ۟۟۟ۨ([B)LYue/ۥۣ۟ۥۤ;
    .locals 2
    .param p1    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣ۟ۥۤ;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    const-string v1, "copyOf(this, size)"

    invoke-static {p1, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۥۤ;-><init>([B)V

    return-object v0
.end method

.method public final ۥ۟۟۠([BII)LYue/ۥۣ۟ۥۤ;
    .locals 7
    .param p1    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "of"
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, LYue/ۥ۟۟۠۟;->ۥ۟۟۟ۧ([BI)I

    move-result p3

    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, LYue/ۥ۟۟۠۟;->ۥ۟۟۟۟(JJJ)V

    new-instance v0, LYue/ۥۣ۟ۥۤ;

    add-int/2addr p3, p2

    invoke-static {p1, p2, p3}, LYue/ۥ۟ۢ۟۟;->ۥ۟۟ۨۥ([BII)[B

    move-result-object p1

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۥۤ;-><init>([B)V

    return-object v0
.end method

.method public final ۥ۟۟۠۠(Ljava/io/InputStream;I)LYue/ۥۣ۟ۥۤ;
    .locals 4
    .param p1    # Ljava/io/InputStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "read"
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p2, :cond_2

    new-array v0, p2, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    sub-int v2, p2, v1

    invoke-virtual {p1, v0, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, LYue/ۥۣ۟ۥۤ;

    invoke-direct {p1, v0}, LYue/ۥۣ۟ۥۤ;-><init>([B)V

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount < 0: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
