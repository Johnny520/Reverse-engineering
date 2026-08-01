.class public Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy$Delegating;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/utility/AsmClassWriter$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Delegating"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final classWriterStrategy:Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy$Delegating;->classWriterStrategy:Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;

    .line 5
    .line 6
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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy$Delegating;->classWriterStrategy:Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy$Delegating;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy$Delegating;->classWriterStrategy:Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

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
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy$Delegating;->classWriterStrategy:Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public make(I)Lnet/bytebuddy/utility/AsmClassWriter;
    .locals 1

    .line 30
    sget-object v0, Lnet/bytebuddy/pool/TypePool$Empty;->INSTANCE:Lnet/bytebuddy/pool/TypePool$Empty;

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy$Delegating;->make(ILnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/AsmClassWriter;

    move-result-object p0

    return-object p0
.end method

.method public make(ILnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/AsmClassWriter;
    .locals 1

    .line 29
    new-instance v0, Lnet/bytebuddy/utility/AsmClassWriter$ForAsm;

    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy$Delegating;->classWriterStrategy:Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;

    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;->resolve(ILnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/jar/asm/ClassWriter;

    move-result-object p0

    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/AsmClassWriter$ForAsm;-><init>(Lnet/bytebuddy/jar/asm/ClassWriter;)V

    return-object v0
.end method

.method public make(ILnet/bytebuddy/utility/AsmClassReader;)Lnet/bytebuddy/utility/AsmClassWriter;
    .locals 1

    .line 28
    sget-object v0, Lnet/bytebuddy/pool/TypePool$Empty;->INSTANCE:Lnet/bytebuddy/pool/TypePool$Empty;

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy$Delegating;->make(ILnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/AsmClassWriter;

    move-result-object p0

    return-object p0
.end method

.method public make(ILnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/AsmClassWriter;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/jar/asm/ClassReader;

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lnet/bytebuddy/utility/AsmClassReader;->unwrap(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lnet/bytebuddy/jar/asm/ClassReader;

    .line 8
    .line 9
    new-instance v0, Lnet/bytebuddy/utility/AsmClassWriter$ForAsm;

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy$Delegating;->classWriterStrategy:Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;

    .line 12
    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    invoke-interface {p0, p1, p3}, Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;->resolve(ILnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/jar/asm/ClassWriter;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {p0, p1, p3, p2}, Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;->resolve(ILnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/jar/asm/ClassReader;)Lnet/bytebuddy/jar/asm/ClassWriter;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/AsmClassWriter$ForAsm;-><init>(Lnet/bytebuddy/jar/asm/ClassWriter;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method
