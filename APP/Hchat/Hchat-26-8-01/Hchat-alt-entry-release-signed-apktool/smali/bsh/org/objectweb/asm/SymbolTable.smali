.class final Lbsh/org/objectweb/asm/SymbolTable;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/org/objectweb/asm/SymbolTable$Entry;
    }
.end annotation


# instance fields
.field private bootstrapMethodCount:I

.field private bootstrapMethods:Lbsh/org/objectweb/asm/ByteVector;

.field private className:Ljava/lang/String;

.field final classWriter:Lbsh/org/objectweb/asm/ClassWriter;

.field private constantPool:Lbsh/org/objectweb/asm/ByteVector;

.field private constantPoolCount:I

.field private entries:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

.field private entryCount:I

.field private majorVersion:I

.field private typeCount:I

.field private typeTable:[Lbsh/org/objectweb/asm/SymbolTable$Entry;


# direct methods
.method public constructor <init>(Lbsh/org/objectweb/asm/ClassWriter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/org/objectweb/asm/SymbolTable;->classWriter:Lbsh/org/objectweb/asm/ClassWriter;

    .line 5
    .line 6
    const/16 p1, 0x100

    .line 7
    .line 8
    new-array p1, p1, [Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 9
    .line 10
    iput-object p1, p0, Lbsh/org/objectweb/asm/SymbolTable;->entries:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    iput p1, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 14
    .line 15
    new-instance p1, Lbsh/org/objectweb/asm/ByteVector;

    .line 16
    .line 17
    invoke-direct {p1}, Lbsh/org/objectweb/asm/ByteVector;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPool:Lbsh/org/objectweb/asm/ByteVector;

    .line 21
    .line 22
    return-void
.end method

.method private add(Lbsh/org/objectweb/asm/SymbolTable$Entry;)V
    .locals 3

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->entryCount:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->entryCount:I

    .line 6
    .line 7
    iget v0, p1, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    .line 8
    .line 9
    iget-object v1, p0, Lbsh/org/objectweb/asm/SymbolTable;->entries:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    rem-int/2addr v0, v2

    .line 13
    aget-object v2, v1, v0

    .line 14
    .line 15
    iput-object v2, p1, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 16
    .line 17
    aput-object p1, v1, v0

    .line 18
    .line 19
    return-void
.end method

.method private addBootstrapMethod(III)Lbsh/org/objectweb/asm/Symbol;
    .locals 8

    .line 108
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->bootstrapMethods:Lbsh/org/objectweb/asm/ByteVector;

    iget-object v0, v0, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 109
    invoke-direct {p0, p3}, Lbsh/org/objectweb/asm/SymbolTable;->get(I)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_3

    .line 110
    iget v2, v1, Lbsh/org/objectweb/asm/Symbol;->tag:I

    const/16 v3, 0x40

    if-ne v2, v3, :cond_2

    iget v2, v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    if-ne v2, p3, :cond_2

    .line 111
    iget-wide v2, v1, Lbsh/org/objectweb/asm/Symbol;->data:J

    long-to-int v2, v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, p2, :cond_1

    add-int v4, p1, v3

    .line 112
    aget-byte v4, v0, v4

    add-int v5, v2, v3

    aget-byte v5, v0, v5

    if-eq v4, v5, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 113
    :cond_1
    iget-object p2, p0, Lbsh/org/objectweb/asm/SymbolTable;->bootstrapMethods:Lbsh/org/objectweb/asm/ByteVector;

    iput p1, p2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    return-object v1

    .line 114
    :cond_2
    :goto_2
    iget-object v1, v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    goto :goto_0

    .line 115
    :cond_3
    new-instance v2, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    iget v3, p0, Lbsh/org/objectweb/asm/SymbolTable;->bootstrapMethodCount:I

    add-int/lit8 p2, v3, 0x1

    iput p2, p0, Lbsh/org/objectweb/asm/SymbolTable;->bootstrapMethodCount:I

    const/16 v4, 0x40

    int-to-long v5, p1

    move v7, p3

    invoke-direct/range {v2 .. v7}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IIJI)V

    invoke-direct {p0, v2}, Lbsh/org/objectweb/asm/SymbolTable;->put(Lbsh/org/objectweb/asm/SymbolTable$Entry;)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    move-result-object p1

    return-object p1
.end method

.method private addConstantDynamicOrInvokeDynamicReference(ILjava/lang/String;Ljava/lang/String;I)Lbsh/org/objectweb/asm/Symbol;
    .locals 9

    .line 1
    invoke-static {p1, p2, p3, p4}, Lbsh/org/objectweb/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;I)I

    .line 2
    .line 3
    .line 4
    move-result v8

    .line 5
    invoke-direct {p0, v8}, Lbsh/org/objectweb/asm/SymbolTable;->get(I)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, v0, Lbsh/org/objectweb/asm/Symbol;->tag:I

    .line 12
    .line 13
    if-ne v1, p1, :cond_0

    .line 14
    .line 15
    iget v1, v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    .line 16
    .line 17
    if-ne v1, v8, :cond_0

    .line 18
    .line 19
    iget-wide v1, v0, Lbsh/org/objectweb/asm/Symbol;->data:J

    .line 20
    .line 21
    int-to-long v3, p4

    .line 22
    cmp-long v1, v1, v3

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    iget-object v1, v0, Lbsh/org/objectweb/asm/Symbol;->name:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    iget-object v1, v0, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_0
    iget-object v0, v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPool:Lbsh/org/objectweb/asm/ByteVector;

    .line 47
    .line 48
    invoke-virtual {p0, p2, p3}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantNameAndType(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v0, p1, p4, v1}, Lbsh/org/objectweb/asm/ByteVector;->put122(III)Lbsh/org/objectweb/asm/ByteVector;

    .line 53
    .line 54
    .line 55
    new-instance v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 56
    .line 57
    iget v1, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 58
    .line 59
    add-int/lit8 v2, v1, 0x1

    .line 60
    .line 61
    iput v2, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    int-to-long v6, p4

    .line 65
    move v2, p1

    .line 66
    move-object v4, p2

    .line 67
    move-object v5, p3

    .line 68
    invoke-direct/range {v0 .. v8}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->put(Lbsh/org/objectweb/asm/SymbolTable$Entry;)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1
.end method

.method private addConstantDynamicOrInvokeDynamicReference(IILjava/lang/String;Ljava/lang/String;I)V
    .locals 9

    .line 76
    invoke-static {p1, p3, p4, p5}, Lbsh/org/objectweb/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;I)I

    move-result v8

    .line 77
    new-instance v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    const/4 v3, 0x0

    int-to-long v6, p5

    move v2, p1

    move v1, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v8}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->add(Lbsh/org/objectweb/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addConstantInteger(II)Lbsh/org/objectweb/asm/Symbol;
    .locals 6

    .line 1
    invoke-static {p1, p2}, Lbsh/org/objectweb/asm/SymbolTable;->hash(II)I

    .line 2
    .line 3
    .line 4
    move-result v5

    .line 5
    invoke-direct {p0, v5}, Lbsh/org/objectweb/asm/SymbolTable;->get(I)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, v0, Lbsh/org/objectweb/asm/Symbol;->tag:I

    .line 12
    .line 13
    if-ne v1, p1, :cond_0

    .line 14
    .line 15
    iget v1, v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    .line 16
    .line 17
    if-ne v1, v5, :cond_0

    .line 18
    .line 19
    iget-wide v1, v0, Lbsh/org/objectweb/asm/Symbol;->data:J

    .line 20
    .line 21
    int-to-long v3, p2

    .line 22
    cmp-long v1, v1, v3

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    iget-object v0, v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPool:Lbsh/org/objectweb/asm/ByteVector;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, p2}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 37
    .line 38
    .line 39
    new-instance v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 40
    .line 41
    iget v1, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 42
    .line 43
    add-int/lit8 v2, v1, 0x1

    .line 44
    .line 45
    iput v2, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 46
    .line 47
    int-to-long v3, p2

    .line 48
    move v2, p1

    .line 49
    invoke-direct/range {v0 .. v5}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IIJI)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->put(Lbsh/org/objectweb/asm/SymbolTable$Entry;)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
.end method

.method private addConstantInteger(III)V
    .locals 6

    .line 58
    new-instance v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    int-to-long v3, p3

    invoke-static {p2, p3}, Lbsh/org/objectweb/asm/SymbolTable;->hash(II)I

    move-result v5

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IIJI)V

    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->add(Lbsh/org/objectweb/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addConstantLong(IJ)Lbsh/org/objectweb/asm/Symbol;
    .locals 6

    .line 1
    invoke-static {p1, p2, p3}, Lbsh/org/objectweb/asm/SymbolTable;->hash(IJ)I

    .line 2
    .line 3
    .line 4
    move-result v5

    .line 5
    invoke-direct {p0, v5}, Lbsh/org/objectweb/asm/SymbolTable;->get(I)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, v0, Lbsh/org/objectweb/asm/Symbol;->tag:I

    .line 12
    .line 13
    if-ne v1, p1, :cond_0

    .line 14
    .line 15
    iget v1, v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    .line 16
    .line 17
    if-ne v1, v5, :cond_0

    .line 18
    .line 19
    iget-wide v1, v0, Lbsh/org/objectweb/asm/Symbol;->data:J

    .line 20
    .line 21
    cmp-long v1, v1, p2

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    iget-object v0, v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget v1, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 30
    .line 31
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPool:Lbsh/org/objectweb/asm/ByteVector;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, p2, p3}, Lbsh/org/objectweb/asm/ByteVector;->putLong(J)Lbsh/org/objectweb/asm/ByteVector;

    .line 38
    .line 39
    .line 40
    iget v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x2

    .line 43
    .line 44
    iput v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 45
    .line 46
    new-instance v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 47
    .line 48
    move v2, p1

    .line 49
    move-wide v3, p2

    .line 50
    invoke-direct/range {v0 .. v5}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IIJI)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->put(Lbsh/org/objectweb/asm/SymbolTable$Entry;)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
.end method

.method private addConstantLong(IIJ)V
    .locals 6

    .line 59
    new-instance v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    invoke-static {p2, p3, p4}, Lbsh/org/objectweb/asm/SymbolTable;->hash(IJ)I

    move-result v5

    move v1, p1

    move v2, p2

    move-wide v3, p3

    invoke-direct/range {v0 .. v5}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IIJI)V

    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->add(Lbsh/org/objectweb/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addConstantMemberReference(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbsh/org/objectweb/asm/SymbolTable$Entry;
    .locals 9

    .line 1
    invoke-static {p1, p2, p3, p4}, Lbsh/org/objectweb/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v8

    .line 5
    invoke-direct {p0, v8}, Lbsh/org/objectweb/asm/SymbolTable;->get(I)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, v0, Lbsh/org/objectweb/asm/Symbol;->tag:I

    .line 12
    .line 13
    if-ne v1, p1, :cond_0

    .line 14
    .line 15
    iget v1, v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    .line 16
    .line 17
    if-ne v1, v8, :cond_0

    .line 18
    .line 19
    iget-object v1, v0, Lbsh/org/objectweb/asm/Symbol;->owner:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object v1, v0, Lbsh/org/objectweb/asm/Symbol;->name:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    iget-object v1, v0, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_0
    iget-object v0, v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPool:Lbsh/org/objectweb/asm/ByteVector;

    .line 48
    .line 49
    invoke-virtual {p0, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget v1, v1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 54
    .line 55
    invoke-virtual {p0, p3, p4}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantNameAndType(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {v0, p1, v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->put122(III)Lbsh/org/objectweb/asm/ByteVector;

    .line 60
    .line 61
    .line 62
    new-instance v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 63
    .line 64
    iget v1, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 65
    .line 66
    add-int/lit8 v2, v1, 0x1

    .line 67
    .line 68
    iput v2, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 69
    .line 70
    const-wide/16 v6, 0x0

    .line 71
    .line 72
    move v2, p1

    .line 73
    move-object v3, p2

    .line 74
    move-object v4, p3

    .line 75
    move-object v5, p4

    .line 76
    invoke-direct/range {v0 .. v8}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    .line 77
    .line 78
    .line 79
    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->put(Lbsh/org/objectweb/asm/SymbolTable$Entry;)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1
.end method

.method private addConstantMemberReference(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 84
    new-instance v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    const-wide/16 v6, 0x0

    invoke-static {p2, p3, p4, p5}, Lbsh/org/objectweb/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v8

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v8}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->add(Lbsh/org/objectweb/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addConstantMethodHandle(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    const/16 v0, 0xf

    .line 102
    invoke-static {v0, p3, p4, p5, p2}, Lbsh/org/objectweb/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I

    move-result v9

    .line 103
    new-instance v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    const/16 v3, 0xf

    int-to-long v7, p2

    move v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v9}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    invoke-direct {p0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->add(Lbsh/org/objectweb/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addConstantNameAndType(ILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 78
    new-instance v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    const/16 v1, 0xc

    invoke-static {v1, p2, p3}, Lbsh/org/objectweb/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;)I

    move-result v5

    const/16 v2, 0xc

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;I)V

    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->add(Lbsh/org/objectweb/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addConstantUtf8(ILjava/lang/String;)V
    .locals 3

    .line 61
    new-instance v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    const/4 v1, 0x1

    invoke-static {v1, p2}, Lbsh/org/objectweb/asm/SymbolTable;->hash(ILjava/lang/String;)I

    move-result v2

    invoke-direct {v0, p1, v1, p2, v2}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;I)V

    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->add(Lbsh/org/objectweb/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addConstantUtf8Reference(ILjava/lang/String;)Lbsh/org/objectweb/asm/Symbol;
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lbsh/org/objectweb/asm/SymbolTable;->hash(ILjava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->get(I)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :goto_0
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iget v2, v1, Lbsh/org/objectweb/asm/Symbol;->tag:I

    .line 12
    .line 13
    if-ne v2, p1, :cond_0

    .line 14
    .line 15
    iget v2, v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    .line 16
    .line 17
    if-ne v2, v0, :cond_0

    .line 18
    .line 19
    iget-object v2, v1, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_0
    iget-object v1, v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v1, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPool:Lbsh/org/objectweb/asm/ByteVector;

    .line 32
    .line 33
    invoke-virtual {p0, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v1, p1, v2}, Lbsh/org/objectweb/asm/ByteVector;->put12(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 38
    .line 39
    .line 40
    new-instance v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 41
    .line 42
    iget v2, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 43
    .line 44
    add-int/lit8 v3, v2, 0x1

    .line 45
    .line 46
    iput v3, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 47
    .line 48
    invoke-direct {v1, v2, p1, p2, v0}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->put(Lbsh/org/objectweb/asm/SymbolTable$Entry;)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1
.end method

.method private addConstantUtf8Reference(IILjava/lang/String;)V
    .locals 2

    .line 56
    new-instance v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    invoke-static {p2, p3}, Lbsh/org/objectweb/asm/SymbolTable;->hash(ILjava/lang/String;)I

    move-result v1

    invoke-direct {v0, p1, p2, p3, v1}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;I)V

    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->add(Lbsh/org/objectweb/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addType(Lbsh/org/objectweb/asm/SymbolTable$Entry;)I
    .locals 4

    .line 47
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->typeTable:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

    if-nez v0, :cond_0

    const/16 v0, 0x10

    .line 48
    new-array v0, v0, [Lbsh/org/objectweb/asm/SymbolTable$Entry;

    iput-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->typeTable:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 49
    :cond_0
    iget v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->typeCount:I

    iget-object v1, p0, Lbsh/org/objectweb/asm/SymbolTable;->typeTable:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

    array-length v2, v1

    if-ne v0, v2, :cond_1

    .line 50
    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 51
    array-length v2, v1

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 52
    iput-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->typeTable:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 53
    :cond_1
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->typeTable:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

    iget v1, p0, Lbsh/org/objectweb/asm/SymbolTable;->typeCount:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lbsh/org/objectweb/asm/SymbolTable;->typeCount:I

    aput-object p1, v0, v1

    .line 54
    invoke-direct {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->put(Lbsh/org/objectweb/asm/SymbolTable$Entry;)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    move-result-object p1

    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    return p1
.end method

.method private get(I)Lbsh/org/objectweb/asm/SymbolTable$Entry;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->entries:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    rem-int/2addr p1, v1

    .line 5
    aget-object p1, v0, p1

    .line 6
    .line 7
    return-object p1
.end method

.method private static hash(II)I
    .locals 1

    .line 28
    const v0, 0x7fffffff

    add-int/2addr p0, p1

    and-int/2addr p0, v0

    return p0
.end method

.method private static hash(IJ)I
    .locals 1

    .line 22
    long-to-int v0, p1

    add-int/2addr p0, v0

    const/16 v0, 0x20

    ushr-long/2addr p1, v0

    long-to-int p1, p1

    add-int/2addr p0, p1

    const p1, 0x7fffffff

    and-int/2addr p0, p1

    return p0
.end method

.method private static hash(ILjava/lang/String;)I
    .locals 0

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    add-int/2addr p1, p0

    const p0, 0x7fffffff

    and-int/2addr p0, p1

    return p0
.end method

.method private static hash(ILjava/lang/String;I)I
    .locals 0

    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    add-int/2addr p1, p0

    add-int/2addr p1, p2

    const p0, 0x7fffffff

    and-int/2addr p0, p1

    return p0
.end method

.method private static hash(ILjava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    mul-int/2addr p2, p1

    add-int/2addr p2, p0

    const p0, 0x7fffffff

    and-int/2addr p0, p2

    return p0
.end method

.method private static hash(ILjava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 26
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    mul-int/2addr p2, p1

    add-int/lit8 p3, p3, 0x1

    mul-int/2addr p3, p2

    add-int/2addr p3, p0

    const p0, 0x7fffffff

    and-int/2addr p0, p3

    return p0
.end method

.method private static hash(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 27
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    mul-int/2addr p2, p1

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result p1

    mul-int/2addr p1, p2

    add-int/2addr p1, p0

    const p0, 0x7fffffff

    and-int/2addr p0, p1

    return p0
.end method

.method private static hash(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    mul-int/2addr p2, p1

    .line 10
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    mul-int/2addr p1, p2

    .line 15
    mul-int/2addr p1, p4

    .line 16
    add-int/2addr p1, p0

    .line 17
    const p0, 0x7fffffff

    .line 18
    .line 19
    .line 20
    and-int/2addr p0, p1

    .line 21
    return p0
.end method

.method private put(Lbsh/org/objectweb/asm/SymbolTable$Entry;)Lbsh/org/objectweb/asm/SymbolTable$Entry;
    .locals 7

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->entryCount:I

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/org/objectweb/asm/SymbolTable;->entries:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    mul-int/lit8 v2, v2, 0x3

    .line 7
    .line 8
    div-int/lit8 v2, v2, 0x4

    .line 9
    .line 10
    if-le v0, v2, :cond_2

    .line 11
    .line 12
    array-length v0, v1

    .line 13
    mul-int/lit8 v1, v0, 0x2

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    new-array v2, v1, [Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    :goto_0
    if-ltz v0, :cond_1

    .line 22
    .line 23
    iget-object v3, p0, Lbsh/org/objectweb/asm/SymbolTable;->entries:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 24
    .line 25
    aget-object v3, v3, v0

    .line 26
    .line 27
    :goto_1
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget v4, v3, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    .line 30
    .line 31
    rem-int/2addr v4, v1

    .line 32
    iget-object v5, v3, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 33
    .line 34
    aget-object v6, v2, v4

    .line 35
    .line 36
    iput-object v6, v3, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 37
    .line 38
    aput-object v3, v2, v4

    .line 39
    .line 40
    move-object v3, v5

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iput-object v2, p0, Lbsh/org/objectweb/asm/SymbolTable;->entries:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 46
    .line 47
    :cond_2
    iget v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->entryCount:I

    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    iput v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->entryCount:I

    .line 52
    .line 53
    iget v0, p1, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    .line 54
    .line 55
    iget-object v1, p0, Lbsh/org/objectweb/asm/SymbolTable;->entries:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 56
    .line 57
    array-length v2, v1

    .line 58
    rem-int/2addr v0, v2

    .line 59
    aget-object v2, v1, v0

    .line 60
    .line 61
    iput-object v2, p1, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 62
    .line 63
    aput-object p1, v1, v0

    .line 64
    .line 65
    return-object p1
.end method


# virtual methods
.method public varargs addBootstrapMethod(Lbsh/org/objectweb/asm/Handle;[Ljava/lang/Object;)Lbsh/org/objectweb/asm/Symbol;
    .locals 9

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->bootstrapMethods:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lbsh/org/objectweb/asm/ByteVector;

    .line 6
    .line 7
    invoke-direct {v0}, Lbsh/org/objectweb/asm/ByteVector;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->bootstrapMethods:Lbsh/org/objectweb/asm/ByteVector;

    .line 11
    .line 12
    :cond_0
    array-length v1, p2

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v3, v1, :cond_1

    .line 16
    .line 17
    aget-object v4, p2, v3

    .line 18
    .line 19
    invoke-virtual {p0, v4}, Lbsh/org/objectweb/asm/SymbolTable;->addConstant(Ljava/lang/Object;)Lbsh/org/objectweb/asm/Symbol;

    .line 20
    .line 21
    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget v1, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 26
    .line 27
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Handle;->getTag()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Handle;->getOwner()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Handle;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Handle;->getDesc()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Handle;->isInterface()Z

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    move-object v3, p0

    .line 48
    invoke-virtual/range {v3 .. v8}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantMethodHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lbsh/org/objectweb/asm/Symbol;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    iget v4, v4, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 53
    .line 54
    invoke-virtual {v0, v4}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 55
    .line 56
    .line 57
    array-length v4, p2

    .line 58
    invoke-virtual {v0, v4}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 59
    .line 60
    .line 61
    array-length v4, p2

    .line 62
    move v5, v2

    .line 63
    :goto_1
    if-ge v5, v4, :cond_2

    .line 64
    .line 65
    aget-object v6, p2, v5

    .line 66
    .line 67
    invoke-virtual {p0, v6}, Lbsh/org/objectweb/asm/SymbolTable;->addConstant(Ljava/lang/Object;)Lbsh/org/objectweb/asm/Symbol;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    iget v6, v6, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 72
    .line 73
    invoke-virtual {v0, v6}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 74
    .line 75
    .line 76
    add-int/lit8 v5, v5, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    iget v0, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 80
    .line 81
    sub-int/2addr v0, v1

    .line 82
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Handle;->hashCode()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    array-length v4, p2

    .line 87
    :goto_2
    if-ge v2, v4, :cond_3

    .line 88
    .line 89
    aget-object v5, p2, v2

    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    xor-int/2addr p1, v5

    .line 96
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    const p2, 0x7fffffff

    .line 100
    .line 101
    .line 102
    and-int/2addr p1, p2

    .line 103
    invoke-direct {p0, v1, v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addBootstrapMethod(III)Lbsh/org/objectweb/asm/Symbol;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1
.end method

.method public addConstant(Ljava/lang/Object;)Lbsh/org/objectweb/asm/Symbol;
    .locals 6

    .line 1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantInteger(I)Lbsh/org/objectweb/asm/Symbol;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    instance-of v0, p1, Ljava/lang/Byte;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p1, Ljava/lang/Byte;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Byte;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantInteger(I)Lbsh/org/objectweb/asm/Symbol;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_1
    instance-of v0, p1, Ljava/lang/Character;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    check-cast p1, Ljava/lang/Character;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantInteger(I)Lbsh/org/objectweb/asm/Symbol;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_2
    instance-of v0, p1, Ljava/lang/Short;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    check-cast p1, Ljava/lang/Short;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Short;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantInteger(I)Lbsh/org/objectweb/asm/Symbol;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :cond_3
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    check-cast p1, Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantInteger(I)Lbsh/org/objectweb/asm/Symbol;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :cond_4
    instance-of v0, p1, Ljava/lang/Float;

    .line 77
    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    check-cast p1, Ljava/lang/Float;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantFloat(F)Lbsh/org/objectweb/asm/Symbol;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :cond_5
    instance-of v0, p1, Ljava/lang/Long;

    .line 92
    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    check-cast p1, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    invoke-virtual {p0, v0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantLong(J)Lbsh/org/objectweb/asm/Symbol;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1

    .line 106
    :cond_6
    instance-of v0, p1, Ljava/lang/Double;

    .line 107
    .line 108
    if-eqz v0, :cond_7

    .line 109
    .line 110
    check-cast p1, Ljava/lang/Double;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 113
    .line 114
    .line 115
    move-result-wide v0

    .line 116
    invoke-virtual {p0, v0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantDouble(D)Lbsh/org/objectweb/asm/Symbol;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    return-object p1

    .line 121
    :cond_7
    instance-of v0, p1, Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    check-cast p1, Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantString(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    return-object p1

    .line 132
    :cond_8
    instance-of v0, p1, Lbsh/org/objectweb/asm/Type;

    .line 133
    .line 134
    if-eqz v0, :cond_b

    .line 135
    .line 136
    check-cast p1, Lbsh/org/objectweb/asm/Type;

    .line 137
    .line 138
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Type;->getSort()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    const/16 v1, 0xa

    .line 143
    .line 144
    if-ne v0, v1, :cond_9

    .line 145
    .line 146
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Type;->getInternalName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    return-object p1

    .line 155
    :cond_9
    const/16 v1, 0xb

    .line 156
    .line 157
    if-ne v0, v1, :cond_a

    .line 158
    .line 159
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantMethodType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    return-object p1

    .line 168
    :cond_a
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    return-object p1

    .line 177
    :cond_b
    instance-of v0, p1, Lbsh/org/objectweb/asm/Handle;

    .line 178
    .line 179
    if-eqz v0, :cond_c

    .line 180
    .line 181
    check-cast p1, Lbsh/org/objectweb/asm/Handle;

    .line 182
    .line 183
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Handle;->getTag()I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Handle;->getOwner()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Handle;->getName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Handle;->getDesc()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Handle;->isInterface()Z

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    move-object v0, p0

    .line 204
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantMethodHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lbsh/org/objectweb/asm/Symbol;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    return-object p1

    .line 209
    :cond_c
    const-string v0, "value "

    .line 210
    .line 211
    invoke-static {p1, v0}, Lg1/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const/4 p1, 0x0

    .line 215
    return-object p1
.end method

.method public addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-direct {p0, v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8Reference(ILjava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public addConstantDouble(D)Lbsh/org/objectweb/asm/Symbol;
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 3
    .line 4
    .line 5
    move-result-wide p1

    .line 6
    invoke-direct {p0, v0, p1, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantLong(IJ)Lbsh/org/objectweb/asm/Symbol;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public varargs addConstantDynamic(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/Handle;[Ljava/lang/Object;)Lbsh/org/objectweb/asm/Symbol;
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p4}, Lbsh/org/objectweb/asm/SymbolTable;->addBootstrapMethod(Lbsh/org/objectweb/asm/Handle;[Ljava/lang/Object;)Lbsh/org/objectweb/asm/Symbol;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    const/16 p4, 0x11

    .line 6
    .line 7
    iget p3, p3, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 8
    .line 9
    invoke-direct {p0, p4, p1, p2, p3}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantDynamicOrInvokeDynamicReference(ILjava/lang/String;Ljava/lang/String;I)Lbsh/org/objectweb/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public addConstantFieldref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2, p3}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantMemberReference(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public addConstantFloat(F)Lbsh/org/objectweb/asm/Symbol;
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    invoke-direct {p0, v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantInteger(II)Lbsh/org/objectweb/asm/Symbol;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public addConstantInteger(I)Lbsh/org/objectweb/asm/Symbol;
    .locals 1

    const/4 v0, 0x3

    .line 57
    invoke-direct {p0, v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantInteger(II)Lbsh/org/objectweb/asm/Symbol;

    move-result-object p1

    return-object p1
.end method

.method public varargs addConstantInvokeDynamic(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/Handle;[Ljava/lang/Object;)Lbsh/org/objectweb/asm/Symbol;
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p4}, Lbsh/org/objectweb/asm/SymbolTable;->addBootstrapMethod(Lbsh/org/objectweb/asm/Handle;[Ljava/lang/Object;)Lbsh/org/objectweb/asm/Symbol;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    const/16 p4, 0x12

    .line 6
    .line 7
    iget p3, p3, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 8
    .line 9
    invoke-direct {p0, p4, p1, p2, p3}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantDynamicOrInvokeDynamicReference(ILjava/lang/String;Ljava/lang/String;I)Lbsh/org/objectweb/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public addConstantLong(J)Lbsh/org/objectweb/asm/Symbol;
    .locals 1

    const/4 v0, 0x5

    .line 58
    invoke-direct {p0, v0, p1, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantLong(IJ)Lbsh/org/objectweb/asm/Symbol;

    move-result-object p1

    return-object p1
.end method

.method public addConstantMethodHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lbsh/org/objectweb/asm/Symbol;
    .locals 10

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    invoke-static {v0, p2, p3, p4, p1}, Lbsh/org/objectweb/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I

    .line 4
    .line 5
    .line 6
    move-result v9

    .line 7
    invoke-direct {p0, v9}, Lbsh/org/objectweb/asm/SymbolTable;->get(I)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget v2, v1, Lbsh/org/objectweb/asm/Symbol;->tag:I

    .line 14
    .line 15
    if-ne v2, v0, :cond_0

    .line 16
    .line 17
    iget v2, v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    .line 18
    .line 19
    if-ne v2, v9, :cond_0

    .line 20
    .line 21
    iget-wide v2, v1, Lbsh/org/objectweb/asm/Symbol;->data:J

    .line 22
    .line 23
    int-to-long v4, p1

    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    iget-object v2, v1, Lbsh/org/objectweb/asm/Symbol;->owner:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    iget-object v2, v1, Lbsh/org/objectweb/asm/Symbol;->name:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    iget-object v2, v1, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_0
    iget-object v1, v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object v1, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPool:Lbsh/org/objectweb/asm/ByteVector;

    .line 57
    .line 58
    const/4 v2, 0x4

    .line 59
    if-gt p1, v2, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0, p2, p3, p4}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantFieldref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 62
    .line 63
    .line 64
    move-result-object p5

    .line 65
    iget p5, p5, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 66
    .line 67
    invoke-virtual {v1, v0, p1, p5}, Lbsh/org/objectweb/asm/ByteVector;->put112(III)Lbsh/org/objectweb/asm/ByteVector;

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {p0, p2, p3, p4, p5}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantMethodref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lbsh/org/objectweb/asm/Symbol;

    .line 72
    .line 73
    .line 74
    move-result-object p5

    .line 75
    iget p5, p5, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 76
    .line 77
    invoke-virtual {v1, v0, p1, p5}, Lbsh/org/objectweb/asm/ByteVector;->put112(III)Lbsh/org/objectweb/asm/ByteVector;

    .line 78
    .line 79
    .line 80
    :goto_1
    new-instance v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 81
    .line 82
    iget v2, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 83
    .line 84
    add-int/lit8 p5, v2, 0x1

    .line 85
    .line 86
    iput p5, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 87
    .line 88
    const/16 v3, 0xf

    .line 89
    .line 90
    int-to-long v7, p1

    .line 91
    move-object v4, p2

    .line 92
    move-object v5, p3

    .line 93
    move-object v6, p4

    .line 94
    invoke-direct/range {v1 .. v9}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    .line 95
    .line 96
    .line 97
    invoke-direct {p0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->put(Lbsh/org/objectweb/asm/SymbolTable$Entry;)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1
.end method

.method public addConstantMethodType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8Reference(ILjava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public addConstantMethodref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lbsh/org/objectweb/asm/Symbol;
    .locals 0

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    const/16 p4, 0xb

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/16 p4, 0xa

    .line 7
    .line 8
    :goto_0
    invoke-direct {p0, p4, p1, p2, p3}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantMemberReference(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public addConstantModule(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;
    .locals 1

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8Reference(ILjava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public addConstantNameAndType(Ljava/lang/String;Ljava/lang/String;)I
    .locals 7

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lbsh/org/objectweb/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v6

    .line 7
    invoke-direct {p0, v6}, Lbsh/org/objectweb/asm/SymbolTable;->get(I)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget v2, v1, Lbsh/org/objectweb/asm/Symbol;->tag:I

    .line 14
    .line 15
    if-ne v2, v0, :cond_0

    .line 16
    .line 17
    iget v2, v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    .line 18
    .line 19
    if-ne v2, v6, :cond_0

    .line 20
    .line 21
    iget-object v2, v1, Lbsh/org/objectweb/asm/Symbol;->name:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object v2, v1, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    iget p1, v1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 38
    .line 39
    return p1

    .line 40
    :cond_0
    iget-object v1, v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v1, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPool:Lbsh/org/objectweb/asm/ByteVector;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {p0, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {v1, v0, v2, v3}, Lbsh/org/objectweb/asm/ByteVector;->put122(III)Lbsh/org/objectweb/asm/ByteVector;

    .line 54
    .line 55
    .line 56
    new-instance v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 57
    .line 58
    iget v2, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 59
    .line 60
    add-int/lit8 v0, v2, 0x1

    .line 61
    .line 62
    iput v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 63
    .line 64
    const/16 v3, 0xc

    .line 65
    .line 66
    move-object v4, p1

    .line 67
    move-object v5, p2

    .line 68
    invoke-direct/range {v1 .. v6}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;I)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->put(Lbsh/org/objectweb/asm/SymbolTable$Entry;)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 76
    .line 77
    return p1
.end method

.method public addConstantPackage(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8Reference(ILjava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public addConstantString(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8Reference(ILjava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public addConstantUtf8(Ljava/lang/String;)I
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->hash(ILjava/lang/String;)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-direct {p0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->get(I)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    :goto_0
    if-eqz v2, :cond_1

    .line 11
    .line 12
    iget v3, v2, Lbsh/org/objectweb/asm/Symbol;->tag:I

    .line 13
    .line 14
    if-ne v3, v0, :cond_0

    .line 15
    .line 16
    iget v3, v2, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    .line 17
    .line 18
    if-ne v3, v1, :cond_0

    .line 19
    .line 20
    iget-object v3, v2, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    iget p1, v2, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 29
    .line 30
    return p1

    .line 31
    :cond_0
    iget-object v2, v2, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v2, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPool:Lbsh/org/objectweb/asm/ByteVector;

    .line 35
    .line 36
    invoke-virtual {v2, v0}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2, p1}, Lbsh/org/objectweb/asm/ByteVector;->putUTF8(Ljava/lang/String;)Lbsh/org/objectweb/asm/ByteVector;

    .line 41
    .line 42
    .line 43
    new-instance v2, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 44
    .line 45
    iget v3, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 46
    .line 47
    add-int/lit8 v4, v3, 0x1

    .line 48
    .line 49
    iput v4, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 50
    .line 51
    invoke-direct {v2, v3, v0, p1, v1}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, v2}, Lbsh/org/objectweb/asm/SymbolTable;->put(Lbsh/org/objectweb/asm/SymbolTable$Entry;)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 59
    .line 60
    return p1
.end method

.method public addMergedType(II)I
    .locals 10

    .line 1
    int-to-long v0, p1

    .line 2
    int-to-long v2, p2

    .line 3
    const/16 v4, 0x20

    .line 4
    .line 5
    shl-long/2addr v2, v4

    .line 6
    or-long v7, v0, v2

    .line 7
    .line 8
    add-int v0, p1, p2

    .line 9
    .line 10
    const/16 v1, 0x82

    .line 11
    .line 12
    invoke-static {v1, v0}, Lbsh/org/objectweb/asm/SymbolTable;->hash(II)I

    .line 13
    .line 14
    .line 15
    move-result v9

    .line 16
    invoke-direct {p0, v9}, Lbsh/org/objectweb/asm/SymbolTable;->get(I)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget v2, v0, Lbsh/org/objectweb/asm/Symbol;->tag:I

    .line 23
    .line 24
    if-ne v2, v1, :cond_0

    .line 25
    .line 26
    iget v2, v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    .line 27
    .line 28
    if-ne v2, v9, :cond_0

    .line 29
    .line 30
    iget-wide v2, v0, Lbsh/org/objectweb/asm/Symbol;->data:J

    .line 31
    .line 32
    cmp-long v2, v2, v7

    .line 33
    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    iget p1, v0, Lbsh/org/objectweb/asm/Symbol;->info:I

    .line 37
    .line 38
    return p1

    .line 39
    :cond_0
    iget-object v0, v0, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->typeTable:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 43
    .line 44
    aget-object p1, v0, p1

    .line 45
    .line 46
    iget-object p1, p1, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 47
    .line 48
    aget-object p2, v0, p2

    .line 49
    .line 50
    iget-object p2, p2, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->classWriter:Lbsh/org/objectweb/asm/ClassWriter;

    .line 53
    .line 54
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/ClassWriter;->getCommonSuperClass(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    new-instance v4, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 63
    .line 64
    iget v5, p0, Lbsh/org/objectweb/asm/SymbolTable;->typeCount:I

    .line 65
    .line 66
    const/16 v6, 0x82

    .line 67
    .line 68
    invoke-direct/range {v4 .. v9}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IIJI)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p0, v4}, Lbsh/org/objectweb/asm/SymbolTable;->put(Lbsh/org/objectweb/asm/SymbolTable$Entry;)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    iput p1, p2, Lbsh/org/objectweb/asm/Symbol;->info:I

    .line 76
    .line 77
    return p1
.end method

.method public addType(Ljava/lang/String;)I
    .locals 4

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->hash(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {p0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->get(I)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    :goto_0
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget v3, v2, Lbsh/org/objectweb/asm/Symbol;->tag:I

    .line 14
    .line 15
    if-ne v3, v0, :cond_0

    .line 16
    .line 17
    iget v3, v2, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    .line 18
    .line 19
    if-ne v3, v1, :cond_0

    .line 20
    .line 21
    iget-object v3, v2, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget p1, v2, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 30
    .line 31
    return p1

    .line 32
    :cond_0
    iget-object v2, v2, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-instance v2, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 36
    .line 37
    iget v3, p0, Lbsh/org/objectweb/asm/SymbolTable;->typeCount:I

    .line 38
    .line 39
    invoke-direct {v2, v3, v0, p1, v1}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Lbsh/org/objectweb/asm/SymbolTable$Entry;)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1
.end method

.method public addUninitializedType(Ljava/lang/String;I)I
    .locals 8

    .line 1
    const/16 v0, 0x81

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lbsh/org/objectweb/asm/SymbolTable;->hash(ILjava/lang/String;I)I

    .line 4
    .line 5
    .line 6
    move-result v7

    .line 7
    invoke-direct {p0, v7}, Lbsh/org/objectweb/asm/SymbolTable;->get(I)Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget v2, v1, Lbsh/org/objectweb/asm/Symbol;->tag:I

    .line 14
    .line 15
    if-ne v2, v0, :cond_0

    .line 16
    .line 17
    iget v2, v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;->hashCode:I

    .line 18
    .line 19
    if-ne v2, v7, :cond_0

    .line 20
    .line 21
    iget-wide v2, v1, Lbsh/org/objectweb/asm/Symbol;->data:J

    .line 22
    .line 23
    int-to-long v4, p2

    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    iget-object v2, v1, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    iget p1, v1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 37
    .line 38
    return p1

    .line 39
    :cond_0
    iget-object v1, v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;->next:Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    new-instance v1, Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 43
    .line 44
    iget v2, p0, Lbsh/org/objectweb/asm/SymbolTable;->typeCount:I

    .line 45
    .line 46
    const/16 v3, 0x81

    .line 47
    .line 48
    int-to-long v5, p2

    .line 49
    move-object v4, p1

    .line 50
    invoke-direct/range {v1 .. v7}, Lbsh/org/objectweb/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;JI)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Lbsh/org/objectweb/asm/SymbolTable$Entry;)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1
.end method

.method public computeBootstrapMethodsSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->bootstrapMethods:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "BootstrapMethods"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->bootstrapMethods:Lbsh/org/objectweb/asm/ByteVector;

    .line 11
    .line 12
    iget v0, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x8

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public getClassName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->className:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getConstantPoolCount()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 2
    .line 3
    return v0
.end method

.method public getConstantPoolLength()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPool:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 4
    .line 5
    return v0
.end method

.method public getMajorVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->majorVersion:I

    .line 2
    .line 3
    return v0
.end method

.method public getType(I)Lbsh/org/objectweb/asm/Symbol;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->typeTable:[Lbsh/org/objectweb/asm/SymbolTable$Entry;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public putBootstrapMethods(Lbsh/org/objectweb/asm/ByteVector;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->bootstrapMethods:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "BootstrapMethods"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->bootstrapMethods:Lbsh/org/objectweb/asm/ByteVector;

    .line 16
    .line 17
    iget v0, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->bootstrapMethodCount:I

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->bootstrapMethods:Lbsh/org/objectweb/asm/ByteVector;

    .line 32
    .line 33
    iget-object v1, v0, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    iget v0, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 37
    .line 38
    invoke-virtual {p1, v1, v2, v0}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public putConstantPool(Lbsh/org/objectweb/asm/ByteVector;)V
    .locals 3

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPoolCount:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lbsh/org/objectweb/asm/SymbolTable;->constantPool:Lbsh/org/objectweb/asm/ByteVector;

    .line 8
    .line 9
    iget-object v1, v0, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iget v0, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 13
    .line 14
    invoke-virtual {p1, v1, v2, v0}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setMajorVersionAndClassName(ILjava/lang/String;)I
    .locals 0

    .line 1
    iput p1, p0, Lbsh/org/objectweb/asm/SymbolTable;->majorVersion:I

    .line 2
    .line 3
    iput-object p2, p0, Lbsh/org/objectweb/asm/SymbolTable;->className:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 10
    .line 11
    return p1
.end method
