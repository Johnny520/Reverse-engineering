.class public final Lnet/bytebuddy/jar/asm/commons/ModuleHashesAttribute;
.super Lnet/bytebuddy/jar/asm/Attribute;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public algorithm:Ljava/lang/String;

.field public hashes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field public modules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, v0, v0, v0}, Lnet/bytebuddy/jar/asm/commons/ModuleHashesAttribute;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "[B>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "ModuleHashes"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/Attribute;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/commons/ModuleHashesAttribute;->algorithm:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p2, p0, Lnet/bytebuddy/jar/asm/commons/ModuleHashesAttribute;->modules:Ljava/util/List;

    .line 9
    .line 10
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/commons/ModuleHashesAttribute;->hashes:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public read(Lnet/bytebuddy/jar/asm/ClassReader;II[CI[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Attribute;
    .locals 6

    .line 1
    invoke-virtual {p1, p2, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    add-int/lit8 p3, p2, 0x2

    .line 6
    .line 7
    invoke-virtual {p1, p3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    add-int/lit8 p2, p2, 0x4

    .line 12
    .line 13
    new-instance p5, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p5, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    new-instance p6, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p6, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    move v1, v0

    .line 25
    :goto_0
    if-ge v1, p3, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, p2, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readModule(I[C)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    add-int/lit8 v3, p2, 0x2

    .line 32
    .line 33
    invoke-virtual {p5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/lit8 p2, p2, 0x4

    .line 41
    .line 42
    new-array v3, v2, [B

    .line 43
    .line 44
    move v4, v0

    .line 45
    :goto_1
    if-ge v4, v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readByte(I)I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    int-to-byte v5, v5

    .line 52
    aput-byte v5, v3, v4

    .line 53
    .line 54
    add-int/lit8 p2, p2, 0x1

    .line 55
    .line 56
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    invoke-virtual {p6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    new-instance p1, Lnet/bytebuddy/jar/asm/commons/ModuleHashesAttribute;

    .line 66
    .line 67
    invoke-direct {p1, p0, p5, p6}, Lnet/bytebuddy/jar/asm/commons/ModuleHashesAttribute;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 68
    .line 69
    .line 70
    return-object p1
.end method

.method public write(Lnet/bytebuddy/jar/asm/ClassWriter;[BIII)Lnet/bytebuddy/jar/asm/ByteVector;
    .locals 3

    .line 1
    new-instance p2, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    invoke-direct {p2}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/commons/ModuleHashesAttribute;->algorithm:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, p3}, Lnet/bytebuddy/jar/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    invoke-virtual {p2, p3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 13
    .line 14
    .line 15
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/commons/ModuleHashesAttribute;->modules:Ljava/util/List;

    .line 16
    .line 17
    const/4 p4, 0x0

    .line 18
    if-nez p3, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2, p4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    invoke-virtual {p2, p3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 29
    .line 30
    .line 31
    move p5, p4

    .line 32
    :goto_0
    if-ge p5, p3, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ModuleHashesAttribute;->modules:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v0, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/commons/ModuleHashesAttribute;->hashes:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v1, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, [B

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ClassWriter;->newModule(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p2, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    array-length v2, v1

    .line 59
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    array-length v2, v1

    .line 64
    invoke-virtual {v0, v1, p4, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 65
    .line 66
    .line 67
    add-int/lit8 p5, p5, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    return-object p2
.end method
