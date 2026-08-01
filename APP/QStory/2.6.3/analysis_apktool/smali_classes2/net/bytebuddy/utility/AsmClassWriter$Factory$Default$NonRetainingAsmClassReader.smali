.class public Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default$NonRetainingAsmClassReader;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/utility/AsmClassReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "NonRetainingAsmClassReader"
.end annotation


# instance fields
.field private final delegate:Lnet/bytebuddy/utility/AsmClassReader;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/utility/AsmClassReader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default$NonRetainingAsmClassReader;->delegate:Lnet/bytebuddy/utility/AsmClassReader;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public accept(Lnet/bytebuddy/jar/asm/ClassVisitor;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default$NonRetainingAsmClassReader;->delegate:Lnet/bytebuddy/utility/AsmClassReader;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/utility/AsmClassReader;->accept(Lnet/bytebuddy/jar/asm/ClassVisitor;I)V

    .line 4
    .line 5
    .line 6
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
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default$NonRetainingAsmClassReader;->delegate:Lnet/bytebuddy/utility/AsmClassReader;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/utility/AsmClassReader;->getInterfaceInternalNames()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getInternalName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default$NonRetainingAsmClassReader;->delegate:Lnet/bytebuddy/utility/AsmClassReader;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/utility/AsmClassReader;->getInternalName()Ljava/lang/String;

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
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default$NonRetainingAsmClassReader;->delegate:Lnet/bytebuddy/utility/AsmClassReader;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/utility/AsmClassReader;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getSuperClassInternalName()Ljava/lang/String;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default$NonRetainingAsmClassReader;->delegate:Lnet/bytebuddy/utility/AsmClassReader;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/utility/AsmClassReader;->getSuperClassInternalName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public toWriter(ILnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/AsmClassWriter;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public unwrap(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
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
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default$NonRetainingAsmClassReader;->delegate:Lnet/bytebuddy/utility/AsmClassReader;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lnet/bytebuddy/utility/AsmClassReader;->unwrap(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
