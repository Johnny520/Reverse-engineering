.class public Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ClassDefinitionAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/security/PrivilegedAction<",
        "Ljava/lang/Class<",
        "*>;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final binaryRepresentation:[B

.field private final name:Ljava/lang/String;

.field final synthetic this$0:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;Ljava/lang/String;[B)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->this$0:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->name:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->binaryRepresentation:[B

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->name:Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->name:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->binaryRepresentation:[B

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->binaryRepresentation:[B

    .line 36
    .line 37
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->this$0:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;

    .line 45
    .line 46
    iget-object p1, p1, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->this$0:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->name:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->binaryRepresentation:[B

    .line 19
    .line 20
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->this$0:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    add-int/2addr p0, v2

    .line 33
    return p0
.end method

.method public run()Ljava/lang/Class;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->name:Ljava/lang/String;

    .line 2
    .line 3
    const/16 v1, 0x2e

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->name:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->this$0:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;

    .line 20
    .line 21
    iget-object v1, v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->packageDefinitionStrategy:Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;

    .line 22
    .line 23
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->name:Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {v1, v0, v4, v2}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;->define(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->isDefined()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->access$100()Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PackageLookupStrategy;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->this$0:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;

    .line 40
    .line 41
    invoke-interface {v1, v2, v4}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PackageLookupStrategy;->apply(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;Ljava/lang/String;)Ljava/lang/Package;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-nez v1, :cond_0

    .line 46
    .line 47
    iget-object v3, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->this$0:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;

    .line 48
    .line 49
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->getSpecificationTitle()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->getSpecificationVersion()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->getSpecificationVendor()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->getImplementationTitle()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->getImplementationVersion()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->getImplementationVendor()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->getSealBase()Ljava/net/URL;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    invoke-static/range {v3 .. v11}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->access$200(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)Ljava/lang/Package;

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->isCompatibleTo(Ljava/lang/Package;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    new-instance p0, Ljava/lang/SecurityException;

    .line 89
    .line 90
    const-string v0, "Sealing violation for package "

    .line 91
    .line 92
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-direct {p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p0

    .line 100
    :cond_2
    :goto_0
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->this$0:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;

    .line 101
    .line 102
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->name:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v3, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->binaryRepresentation:[B

    .line 105
    .line 106
    array-length v5, v3

    .line 107
    iget-object v6, v1, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->protectionDomain:Ljava/security/ProtectionDomain;

    .line 108
    .line 109
    const/4 v4, 0x0

    .line 110
    invoke-static/range {v1 .. v6}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->access$300(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;Ljava/lang/String;[BIILjava/security/ProtectionDomain;)Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0
.end method

.method public bridge synthetic run()Ljava/lang/Object;
    .locals 0

    .line 115
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;->run()Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method
