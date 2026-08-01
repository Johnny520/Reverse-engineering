.class public Lnet/bytebuddy/jar/asm/commons/ModuleRemapper;
.super Lnet/bytebuddy/jar/asm/ModuleVisitor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field protected final remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;


# direct methods
.method public constructor <init>(ILnet/bytebuddy/jar/asm/ModuleVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ModuleVisitor;-><init>(ILnet/bytebuddy/jar/asm/ModuleVisitor;)V

    .line 8
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/commons/ModuleRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/jar/asm/ModuleVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V
    .locals 1

    .line 1
    const/high16 v0, 0x90000

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2}, Lnet/bytebuddy/jar/asm/commons/ModuleRemapper;-><init>(ILnet/bytebuddy/jar/asm/ModuleVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public varargs visitExport(Ljava/lang/String;I[Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    array-length v0, p3

    .line 4
    new-array v0, v0, [Ljava/lang/String;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    array-length v2, p3

    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/commons/ModuleRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 11
    .line 12
    aget-object v3, p3, v1

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapModuleName(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    aput-object v2, v0, v1

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :cond_1
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/commons/ModuleRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 25
    .line 26
    invoke-virtual {p3, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-super {p0, p1, p2, v0}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitExport(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public visitMainClass(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ModuleRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitMainClass(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public varargs visitOpen(Ljava/lang/String;I[Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    array-length v0, p3

    .line 4
    new-array v0, v0, [Ljava/lang/String;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    array-length v2, p3

    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/commons/ModuleRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 11
    .line 12
    aget-object v3, p3, v1

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapModuleName(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    aput-object v2, v0, v1

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :cond_1
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/commons/ModuleRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 25
    .line 26
    invoke-virtual {p3, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-super {p0, p1, p2, v0}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitOpen(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public visitPackage(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ModuleRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitPackage(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public varargs visitProvide(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 4

    .line 1
    array-length v0, p2

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p2

    .line 6
    iget-object v3, p0, Lnet/bytebuddy/jar/asm/commons/ModuleRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 7
    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    aget-object v2, p2, v1

    .line 11
    .line 12
    invoke-virtual {v3, v2}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    aput-object v2, v0, v1

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v3, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-super {p0, p1, v0}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitProvide(Ljava/lang/String;[Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public visitRequire(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ModuleRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapModuleName(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-super {p0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitRequire(Ljava/lang/String;ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public visitUse(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ModuleRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitUse(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
