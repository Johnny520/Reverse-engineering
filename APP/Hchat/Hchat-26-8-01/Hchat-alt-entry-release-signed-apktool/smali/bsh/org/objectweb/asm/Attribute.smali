.class public Lbsh/org/objectweb/asm/Attribute;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/org/objectweb/asm/Attribute$Set;
    }
.end annotation


# instance fields
.field private content:[B

.field nextAttribute:Lbsh/org/objectweb/asm/Attribute;

.field public final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/org/objectweb/asm/Attribute;->type:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final computeAttributesSize(Lbsh/org/objectweb/asm/SymbolTable;)I
    .locals 6

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 31
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/Attribute;->computeAttributesSize(Lbsh/org/objectweb/asm/SymbolTable;[BIII)I

    move-result p1

    return p1
.end method

.method public final computeAttributesSize(Lbsh/org/objectweb/asm/SymbolTable;[BIII)I
    .locals 7

    .line 1
    iget-object v1, p1, Lbsh/org/objectweb/asm/SymbolTable;->classWriter:Lbsh/org/objectweb/asm/ClassWriter;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    move v6, v0

    .line 5
    move-object v0, p0

    .line 6
    :goto_0
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v2, v0, Lbsh/org/objectweb/asm/Attribute;->type:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-object v2, p2

    .line 14
    move v3, p3

    .line 15
    move v4, p4

    .line 16
    move v5, p5

    .line 17
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/Attribute;->write(Lbsh/org/objectweb/asm/ClassWriter;[BIII)Lbsh/org/objectweb/asm/ByteVector;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget p2, p2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 22
    .line 23
    add-int/lit8 p2, p2, 0x6

    .line 24
    .line 25
    add-int/2addr v6, p2

    .line 26
    iget-object v0, v0, Lbsh/org/objectweb/asm/Attribute;->nextAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 27
    .line 28
    move-object p2, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return v6
.end method

.method public final getAttributeCount()I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, p0

    .line 3
    :goto_0
    if-eqz v1, :cond_0

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    iget-object v1, v1, Lbsh/org/objectweb/asm/Attribute;->nextAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return v0
.end method

.method public getLabels()[Lbsh/org/objectweb/asm/Label;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lbsh/org/objectweb/asm/Label;

    .line 3
    .line 4
    return-object v0
.end method

.method public isCodeAttribute()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isUnknown()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final putAttributes(Lbsh/org/objectweb/asm/SymbolTable;Lbsh/org/objectweb/asm/ByteVector;)V
    .locals 7

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v6, p2

    .line 44
    invoke-virtual/range {v0 .. v6}, Lbsh/org/objectweb/asm/Attribute;->putAttributes(Lbsh/org/objectweb/asm/SymbolTable;[BIIILbsh/org/objectweb/asm/ByteVector;)V

    return-void
.end method

.method public final putAttributes(Lbsh/org/objectweb/asm/SymbolTable;[BIIILbsh/org/objectweb/asm/ByteVector;)V
    .locals 6

    .line 1
    iget-object v1, p1, Lbsh/org/objectweb/asm/SymbolTable;->classWriter:Lbsh/org/objectweb/asm/ClassWriter;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    :goto_0
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v2, p2

    .line 7
    move v3, p3

    .line 8
    move v4, p4

    .line 9
    move v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/Attribute;->write(Lbsh/org/objectweb/asm/ClassWriter;[BIII)Lbsh/org/objectweb/asm/ByteVector;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iget-object p3, v0, Lbsh/org/objectweb/asm/Attribute;->type:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, p3}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-virtual {p6, p3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    iget p4, p2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 25
    .line 26
    invoke-virtual {p3, p4}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 27
    .line 28
    .line 29
    iget-object p3, p2, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 30
    .line 31
    const/4 p4, 0x0

    .line 32
    iget p2, p2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 33
    .line 34
    invoke-virtual {p6, p3, p4, p2}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 35
    .line 36
    .line 37
    iget-object v0, v0, Lbsh/org/objectweb/asm/Attribute;->nextAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 38
    .line 39
    move-object p2, v2

    .line 40
    move p3, v3

    .line 41
    move p4, v4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-void
.end method

.method public write(Lbsh/org/objectweb/asm/ClassWriter;[BIII)Lbsh/org/objectweb/asm/ByteVector;
    .locals 0

    .line 1
    new-instance p1, Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget-object p2, p0, Lbsh/org/objectweb/asm/Attribute;->content:[B

    .line 4
    .line 5
    invoke-direct {p1, p2}, Lbsh/org/objectweb/asm/ByteVector;-><init>([B)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method
