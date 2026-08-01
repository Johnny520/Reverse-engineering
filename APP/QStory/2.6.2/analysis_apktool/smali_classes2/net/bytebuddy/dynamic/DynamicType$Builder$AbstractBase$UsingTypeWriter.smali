.class public abstract Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$UsingTypeWriter;
.super Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "UsingTypeWriter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        ">",
        "Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase<",
        "TU;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public make(Lnet/bytebuddy/dynamic/TypeResolutionStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Unloaded;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/TypeResolutionStrategy;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Unloaded<",
            "TU;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$UsingTypeWriter;->toTypeWriter()Lnet/bytebuddy/dynamic/scaffold/TypeWriter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/TypeResolutionStrategy;->resolve()Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter;->make(Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;)Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public make(Lnet/bytebuddy/dynamic/TypeResolutionStrategy;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/dynamic/DynamicType$Unloaded;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/TypeResolutionStrategy;",
            "Lnet/bytebuddy/pool/TypePool;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Unloaded<",
            "TU;>;"
        }
    .end annotation

    .line 14
    invoke-virtual {p0, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$UsingTypeWriter;->toTypeWriter(Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter;

    move-result-object p0

    invoke-interface {p1}, Lnet/bytebuddy/dynamic/TypeResolutionStrategy;->resolve()Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;

    move-result-object p1

    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter;->make(Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Resolved;)Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    move-result-object p0

    return-object p0
.end method

.method public abstract toTypeWriter()Lnet/bytebuddy/dynamic/scaffold/TypeWriter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter<",
            "TU;>;"
        }
    .end annotation
.end method

.method public abstract toTypeWriter(Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/pool/TypePool;",
            ")",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter<",
            "TU;>;"
        }
    .end annotation
.end method

.method public wrap(Lnet/bytebuddy/jar/asm/ClassVisitor;II)Lnet/bytebuddy/utility/visitor/ContextClassVisitor;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$UsingTypeWriter;->toTypeWriter()Lnet/bytebuddy/dynamic/scaffold/TypeWriter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2, p3}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter;->wrap(Lnet/bytebuddy/jar/asm/ClassVisitor;II)Lnet/bytebuddy/utility/visitor/ContextClassVisitor;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public wrap(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/pool/TypePool;II)Lnet/bytebuddy/utility/visitor/ContextClassVisitor;
    .locals 0

    .line 10
    invoke-virtual {p0, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$UsingTypeWriter;->toTypeWriter(Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter;

    move-result-object p0

    invoke-interface {p0, p1, p3, p4}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter;->wrap(Lnet/bytebuddy/jar/asm/ClassVisitor;II)Lnet/bytebuddy/utility/visitor/ContextClassVisitor;

    move-result-object p0

    return-object p0
.end method
