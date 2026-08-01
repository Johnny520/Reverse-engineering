.class public abstract Lcom/android/dx/command/dump/BaseDumper;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/cf/iface/ParseObserver;


# instance fields
.field protected args:Lcom/android/dx/command/dump/Args;

.field private final bytes:[B

.field protected final dexOptions:Lcom/android/dx/dex/DexOptions;

.field private final filePath:Ljava/lang/String;

.field private final hexCols:I

.field private indent:I

.field private final out:Ljava/io/PrintStream;

.field private final rawBytes:Z

.field private readBytes:I

.field private separator:Ljava/lang/String;

.field private final strictParse:Z

.field private final width:I


# direct methods
.method public constructor <init>([BLjava/io/PrintStream;Ljava/lang/String;Lcom/android/dx/command/dump/Args;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/command/dump/BaseDumper;->bytes:[B

    .line 5
    .line 6
    iget-boolean p1, p4, Lcom/android/dx/command/dump/Args;->rawBytes:Z

    .line 7
    .line 8
    iput-boolean p1, p0, Lcom/android/dx/command/dump/BaseDumper;->rawBytes:Z

    .line 9
    .line 10
    iput-object p2, p0, Lcom/android/dx/command/dump/BaseDumper;->out:Ljava/io/PrintStream;

    .line 11
    .line 12
    iget p2, p4, Lcom/android/dx/command/dump/Args;->width:I

    .line 13
    .line 14
    if-gtz p2, :cond_0

    .line 15
    .line 16
    const/16 p2, 0x4f

    .line 17
    .line 18
    :cond_0
    iput p2, p0, Lcom/android/dx/command/dump/BaseDumper;->width:I

    .line 19
    .line 20
    iput-object p3, p0, Lcom/android/dx/command/dump/BaseDumper;->filePath:Ljava/lang/String;

    .line 21
    .line 22
    iget-boolean p3, p4, Lcom/android/dx/command/dump/Args;->strictParse:Z

    .line 23
    .line 24
    iput-boolean p3, p0, Lcom/android/dx/command/dump/BaseDumper;->strictParse:Z

    .line 25
    .line 26
    const/4 p3, 0x0

    .line 27
    iput p3, p0, Lcom/android/dx/command/dump/BaseDumper;->indent:I

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const-string p1, "|"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-string p1, ""

    .line 35
    .line 36
    :goto_0
    iput-object p1, p0, Lcom/android/dx/command/dump/BaseDumper;->separator:Ljava/lang/String;

    .line 37
    .line 38
    iput p3, p0, Lcom/android/dx/command/dump/BaseDumper;->readBytes:I

    .line 39
    .line 40
    iput-object p4, p0, Lcom/android/dx/command/dump/BaseDumper;->args:Lcom/android/dx/command/dump/Args;

    .line 41
    .line 42
    new-instance p1, Lcom/android/dx/dex/DexOptions;

    .line 43
    .line 44
    invoke-direct {p1}, Lcom/android/dx/dex/DexOptions;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lcom/android/dx/command/dump/BaseDumper;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 48
    .line 49
    add-int/lit8 p2, p2, -0x5

    .line 50
    .line 51
    div-int/lit8 p2, p2, 0xf

    .line 52
    .line 53
    add-int/lit8 p2, p2, 0x1

    .line 54
    .line 55
    and-int/lit8 p1, p2, -0x2

    .line 56
    .line 57
    const/4 p2, 0x6

    .line 58
    if-ge p1, p2, :cond_2

    .line 59
    .line 60
    :goto_1
    move p1, p2

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const/16 p2, 0xa

    .line 63
    .line 64
    if-le p1, p2, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    :goto_2
    iput p1, p0, Lcom/android/dx/command/dump/BaseDumper;->hexCols:I

    .line 68
    .line 69
    return-void
.end method

.method public static computeParamWidth(Lcom/android/dx/cf/code/ConcreteMethod;Z)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ConcreteMethod;->getEffectiveDescriptor()Lcom/android/dx/rop/type/Prototype;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/rop/type/StdTypeList;->getWordCount()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method


# virtual methods
.method public changeIndent(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/android/dx/command/dump/BaseDumper;->indent:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iput v0, p0, Lcom/android/dx/command/dump/BaseDumper;->indent:I

    .line 5
    .line 6
    iget-boolean p1, p0, Lcom/android/dx/command/dump/BaseDumper;->rawBytes:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string p1, "|"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p1, ""

    .line 14
    .line 15
    :goto_0
    iput-object p1, p0, Lcom/android/dx/command/dump/BaseDumper;->separator:Ljava/lang/String;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    :goto_1
    iget v0, p0, Lcom/android/dx/command/dump/BaseDumper;->indent:I

    .line 19
    .line 20
    if-ge p1, v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/android/dx/command/dump/BaseDumper;->separator:Ljava/lang/String;

    .line 28
    .line 29
    const-string v2, "  "

    .line 30
    .line 31
    invoke-static {v0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/android/dx/command/dump/BaseDumper;->separator:Ljava/lang/String;

    .line 36
    .line 37
    add-int/lit8 p1, p1, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    return-void
.end method

.method public endParsingMember(Lcom/android/dx/util/ByteArray;ILjava/lang/String;Ljava/lang/String;Lcom/android/dx/cf/iface/Member;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final getBytes()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dump/BaseDumper;->bytes:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFilePath()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dump/BaseDumper;->filePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRawBytes()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/command/dump/BaseDumper;->rawBytes:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getReadBytes()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/command/dump/BaseDumper;->readBytes:I

    .line 2
    .line 3
    return p0
.end method

.method public final getStrictParse()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/command/dump/BaseDumper;->strictParse:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getWidth1()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/command/dump/BaseDumper;->rawBytes:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Lcom/android/dx/command/dump/BaseDumper;->hexCols:I

    .line 6
    .line 7
    mul-int/lit8 v0, p0, 0x2

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x5

    .line 10
    .line 11
    div-int/lit8 p0, p0, 0x2

    .line 12
    .line 13
    add-int/2addr p0, v0

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final getWidth2()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/command/dump/BaseDumper;->rawBytes:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getWidth1()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    iget v1, p0, Lcom/android/dx/command/dump/BaseDumper;->width:I

    .line 14
    .line 15
    sub-int/2addr v1, v0

    .line 16
    iget p0, p0, Lcom/android/dx/command/dump/BaseDumper;->indent:I

    .line 17
    .line 18
    mul-int/lit8 p0, p0, 0x2

    .line 19
    .line 20
    sub-int/2addr v1, p0

    .line 21
    return v1
.end method

.method public final hexDump(II)Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/dump/BaseDumper;->bytes:[B

    .line 2
    .line 3
    iget v4, p0, Lcom/android/dx/command/dump/BaseDumper;->hexCols:I

    .line 4
    .line 5
    const/4 v5, 0x4

    .line 6
    move v3, p1

    .line 7
    move v1, p1

    .line 8
    move v2, p2

    .line 9
    invoke-static/range {v0 .. v5}, Lcom/android/dx/util/Hex;->dump([BIIIII)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lcom/android/dx/util/ByteArray;->underlyingOffset(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getRawBytes()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p3}, Lcom/android/dx/command/dump/BaseDumper;->hexDump(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p1, ""

    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0, p1, p4}, Lcom/android/dx/command/dump/BaseDumper;->twoColumns(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Lcom/android/dx/command/dump/BaseDumper;->print(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lcom/android/dx/command/dump/BaseDumper;->readBytes:I

    .line 26
    .line 27
    add-int/2addr p1, p3

    .line 28
    iput p1, p0, Lcom/android/dx/command/dump/BaseDumper;->readBytes:I

    .line 29
    .line 30
    return-void
.end method

.method public final print(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dump/BaseDumper;->out:Ljava/io/PrintStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final println(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dump/BaseDumper;->out:Ljava/io/PrintStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public startParsingMember(Lcom/android/dx/util/ByteArray;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final twoColumns(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getWidth1()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getWidth2()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    new-instance v0, Ljava/io/StringWriter;

    .line 16
    .line 17
    mul-int/lit8 v2, p1, 0x2

    .line 18
    .line 19
    invoke-direct {v0, v2}, Ljava/io/StringWriter;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lcom/android/dx/util/IndentingWriter;

    .line 23
    .line 24
    iget-object p0, p0, Lcom/android/dx/command/dump/BaseDumper;->separator:Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1, p0}, Lcom/android/dx/util/IndentingWriter;-><init>(Ljava/io/Writer;ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/16 p0, 0xa

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eq p1, p0, :cond_1

    .line 43
    .line 44
    :cond_0
    invoke-virtual {v2, p0}, Lcom/android/dx/util/IndentingWriter;->write(I)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {v2}, Ljava/io/Writer;->flush()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_2
    iget-object p0, p0, Lcom/android/dx/command/dump/BaseDumper;->separator:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {p1, v0, p0, p2, v1}, Lcom/android/dx/util/TwoColumnOutput;->toString(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    return-object p0

    .line 62
    :catch_0
    move-exception p0

    .line 63
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    return-object p0
.end method
