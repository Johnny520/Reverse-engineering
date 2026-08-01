.class public Lnet/bytebuddy/utility/AsmClassReader$ForAsm;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/utility/AsmClassReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/AsmClassReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForAsm"
.end annotation


# instance fields
.field private final classReader:Lnet/bytebuddy/jar/asm/ClassReader;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/ClassReader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/utility/AsmClassReader$ForAsm;->classReader:Lnet/bytebuddy/jar/asm/ClassReader;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public accept(Lnet/bytebuddy/jar/asm/ClassVisitor;I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForAsm;->classReader:Lnet/bytebuddy/jar/asm/ClassReader;

    .line 2
    .line 3
    sget-object v0, Lnet/bytebuddy/utility/AsmClassReader;->NO_ATTRIBUTES:[Lnet/bytebuddy/jar/asm/Attribute;

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->accept(Lnet/bytebuddy/jar/asm/ClassVisitor;[Lnet/bytebuddy/jar/asm/Attribute;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public getInterfaceInternalNames()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForAsm;->classReader:Lnet/bytebuddy/jar/asm/ClassReader;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/ClassReader;->getInterfaces()[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getInternalName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForAsm;->classReader:Lnet/bytebuddy/jar/asm/ClassReader;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/ClassReader;->getClassName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForAsm;->classReader:Lnet/bytebuddy/jar/asm/ClassReader;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/ClassReader;->getAccess()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getSuperClassInternalName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForAsm;->classReader:Lnet/bytebuddy/jar/asm/ClassReader;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/ClassReader;->getSuperName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public unwrap(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForAsm;->classReader:Lnet/bytebuddy/jar/asm/ClassReader;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForAsm;->classReader:Lnet/bytebuddy/jar/asm/ClassReader;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method
