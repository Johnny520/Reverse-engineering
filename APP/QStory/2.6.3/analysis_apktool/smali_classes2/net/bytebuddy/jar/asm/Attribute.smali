.class public Lnet/bytebuddy/jar/asm/Attribute;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/jar/asm/Attribute$Set;
    }
.end annotation


# instance fields
.field private cachedContent:Lnet/bytebuddy/jar/asm/ByteVector;

.field nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

.field public final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/Attribute;->type:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static computeAttributesSize(Lnet/bytebuddy/jar/asm/SymbolTable;II)I
    .locals 3

    .line 1
    and-int/lit16 v0, p1, 0x1000

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/SymbolTable;->getMajorVersion()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v2, 0x31

    .line 11
    .line 12
    if-ge v0, v2, :cond_0

    .line 13
    .line 14
    const-string v0, "Synthetic"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move v0, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-eqz p2, :cond_1

    .line 23
    .line 24
    const-string p2, "Signature"

    .line 25
    .line 26
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x8

    .line 30
    .line 31
    :cond_1
    const/high16 p2, 0x20000

    .line 32
    .line 33
    and-int/2addr p1, p2

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    const-string p1, "Deprecated"

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    add-int/2addr v0, v1

    .line 42
    :cond_2
    return v0
.end method

.method private maybeWrite(Lnet/bytebuddy/jar/asm/ClassWriter;[BIII)Lnet/bytebuddy/jar/asm/ByteVector;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Attribute;->cachedContent:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/Attribute;->write(Lnet/bytebuddy/jar/asm/ClassWriter;[BIII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/Attribute;->cachedContent:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/Attribute;->cachedContent:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 12
    .line 13
    return-object p0
.end method

.method public static putAttributes(Lnet/bytebuddy/jar/asm/SymbolTable;IILnet/bytebuddy/jar/asm/ByteVector;)V
    .locals 3

    .line 1
    and-int/lit16 v0, p1, 0x1000

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/SymbolTable;->getMajorVersion()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v2, 0x31

    .line 11
    .line 12
    if-ge v0, v2, :cond_0

    .line 13
    .line 14
    const-string v0, "Synthetic"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p3, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 25
    .line 26
    .line 27
    :cond_0
    if-eqz p2, :cond_1

    .line 28
    .line 29
    const-string v0, "Signature"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p3, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v2, 0x2

    .line 40
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 45
    .line 46
    .line 47
    :cond_1
    const/high16 p2, 0x20000

    .line 48
    .line 49
    and-int/2addr p1, p2

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    const-string p1, "Deprecated"

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    invoke-virtual {p3, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
.end method

.method public static read(Lnet/bytebuddy/jar/asm/Attribute;Lnet/bytebuddy/jar/asm/ClassReader;II[CI[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Attribute;
    .locals 0

    .line 20
    invoke-virtual/range {p0 .. p6}, Lnet/bytebuddy/jar/asm/Attribute;->read(Lnet/bytebuddy/jar/asm/ClassReader;II[CI[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Attribute;

    move-result-object p0

    return-object p0
.end method

.method public static readLabel(Lnet/bytebuddy/jar/asm/ClassReader;I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static write(Lnet/bytebuddy/jar/asm/Attribute;Lnet/bytebuddy/jar/asm/ClassWriter;[BIII)[B
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/Attribute;->maybeWrite(Lnet/bytebuddy/jar/asm/ClassWriter;[BIII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p1, p0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 6
    .line 7
    new-array p2, p1, [B

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    invoke-static {p0, p3, p2, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    return-object p2
.end method


# virtual methods
.method public final computeAttributesSize(Lnet/bytebuddy/jar/asm/SymbolTable;)I
    .locals 6

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 47
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/Attribute;->computeAttributesSize(Lnet/bytebuddy/jar/asm/SymbolTable;[BIII)I

    move-result p0

    return p0
.end method

.method public final computeAttributesSize(Lnet/bytebuddy/jar/asm/SymbolTable;[BIII)I
    .locals 7

    .line 43
    iget-object v1, p1, Lnet/bytebuddy/jar/asm/SymbolTable;->classWriter:Lnet/bytebuddy/jar/asm/ClassWriter;

    const/4 v0, 0x0

    move v6, v0

    move-object v0, p0

    move p0, v6

    :goto_0
    if-eqz v0, :cond_0

    .line 44
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/Attribute;->type:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 45
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/Attribute;->maybeWrite(Lnet/bytebuddy/jar/asm/ClassWriter;[BIII)Lnet/bytebuddy/jar/asm/ByteVector;

    move-result-object p2

    iget p2, p2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    add-int/lit8 p2, p2, 0x6

    add-int/2addr p0, p2

    .line 46
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    move-object p2, v2

    goto :goto_0

    :cond_0
    return p0
.end method

.method public final getAttributeCount()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-eqz p0, :cond_0

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    return v0
.end method

.method public getLabels()[Lnet/bytebuddy/jar/asm/Label;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = false
    .end annotation

    .line 1
    const/4 p0, 0x0

    .line 2
    new-array p0, p0, [Lnet/bytebuddy/jar/asm/Label;

    .line 3
    .line 4
    return-object p0
.end method

.method public isCodeAttribute()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public isUnknown()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final putAttributes(Lnet/bytebuddy/jar/asm/SymbolTable;Lnet/bytebuddy/jar/asm/ByteVector;)V
    .locals 7

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v6, p2

    .line 71
    invoke-virtual/range {v0 .. v6}, Lnet/bytebuddy/jar/asm/Attribute;->putAttributes(Lnet/bytebuddy/jar/asm/SymbolTable;[BIIILnet/bytebuddy/jar/asm/ByteVector;)V

    return-void
.end method

.method public final putAttributes(Lnet/bytebuddy/jar/asm/SymbolTable;[BIIILnet/bytebuddy/jar/asm/ByteVector;)V
    .locals 6

    .line 66
    iget-object v1, p1, Lnet/bytebuddy/jar/asm/SymbolTable;->classWriter:Lnet/bytebuddy/jar/asm/ClassWriter;

    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_0

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 67
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/Attribute;->maybeWrite(Lnet/bytebuddy/jar/asm/ClassWriter;[BIII)Lnet/bytebuddy/jar/asm/ByteVector;

    move-result-object p0

    .line 68
    iget-object p2, v0, Lnet/bytebuddy/jar/asm/Attribute;->type:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p6, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    move-result-object p2

    iget p3, p0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    invoke-virtual {p2, p3}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 69
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    const/4 p3, 0x0

    iget p0, p0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    invoke-virtual {p6, p2, p3, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 70
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    move-object p2, v2

    move p3, v3

    goto :goto_0

    :cond_0
    return-void
.end method

.method public read(Lnet/bytebuddy/jar/asm/ClassReader;II[CI[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Attribute;
    .locals 0

    .line 1
    new-instance p4, Lnet/bytebuddy/jar/asm/Attribute;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/Attribute;->type:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p4, p0}, Lnet/bytebuddy/jar/asm/Attribute;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance p0, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 9
    .line 10
    invoke-virtual {p1, p2, p3}, Lnet/bytebuddy/jar/asm/ClassReader;->readBytes(II)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>([B)V

    .line 15
    .line 16
    .line 17
    iput-object p0, p4, Lnet/bytebuddy/jar/asm/Attribute;->cachedContent:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 18
    .line 19
    return-object p4
.end method

.method public write(Lnet/bytebuddy/jar/asm/ClassWriter;[BIII)Lnet/bytebuddy/jar/asm/ByteVector;
    .locals 0

    .line 16
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/Attribute;->cachedContent:Lnet/bytebuddy/jar/asm/ByteVector;

    return-object p0
.end method
