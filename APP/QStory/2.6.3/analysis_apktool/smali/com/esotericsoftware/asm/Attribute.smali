.class public Lcom/esotericsoftware/asm/Attribute;
.super Ljava/lang/Object;


# instance fields
.field a:Lcom/esotericsoftware/asm/Attribute;

.field b:[B

.field public final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/esotericsoftware/asm/Attribute;->type:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 35
    const/4 v0, 0x0

    :goto_0
    if-eqz p0, :cond_0

    add-int/lit8 v0, v0, 0x1

    iget-object p0, p0, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final a(Lcom/esotericsoftware/asm/ClassWriter;[BIII)I
    .locals 2

    .line 34
    const/4 v0, 0x0

    :goto_0
    if-eqz p0, :cond_0

    iget-object v1, p0, Lcom/esotericsoftware/asm/Attribute;->type:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    invoke-virtual/range {p0 .. p5}, Lcom/esotericsoftware/asm/Attribute;->write(Lcom/esotericsoftware/asm/ClassWriter;[BIII)Lcom/esotericsoftware/asm/ByteVector;

    move-result-object v1

    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    add-int/lit8 v1, v1, 0x6

    add-int/2addr v0, v1

    iget-object p0, p0, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final a(Lcom/esotericsoftware/asm/ClassWriter;[BIIILcom/esotericsoftware/asm/ByteVector;)V
    .locals 3

    .line 1
    :goto_0
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lcom/esotericsoftware/asm/Attribute;->write(Lcom/esotericsoftware/asm/ClassWriter;[BIII)Lcom/esotericsoftware/asm/ByteVector;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/esotericsoftware/asm/Attribute;->type:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v2, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 26
    .line 27
    invoke-virtual {p6, v1, v2, v0}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
.end method

.method public getLabels()[Lcom/esotericsoftware/asm/Label;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
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

.method public read(Lcom/esotericsoftware/asm/ClassReader;II[CI[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Attribute;
    .locals 0

    .line 1
    new-instance p4, Lcom/esotericsoftware/asm/Attribute;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/esotericsoftware/asm/Attribute;->type:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p4, p0}, Lcom/esotericsoftware/asm/Attribute;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-array p0, p3, [B

    .line 9
    .line 10
    iput-object p0, p4, Lcom/esotericsoftware/asm/Attribute;->b:[B

    .line 11
    .line 12
    iget-object p1, p1, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    .line 13
    .line 14
    const/4 p5, 0x0

    .line 15
    invoke-static {p1, p2, p0, p5, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    return-object p4
.end method

.method public write(Lcom/esotericsoftware/asm/ClassWriter;[BIII)Lcom/esotericsoftware/asm/ByteVector;
    .locals 0

    .line 1
    new-instance p1, Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/esotericsoftware/asm/Attribute;->b:[B

    .line 7
    .line 8
    iput-object p0, p1, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 9
    .line 10
    array-length p0, p0

    .line 11
    iput p0, p1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 12
    .line 13
    return-object p1
.end method
