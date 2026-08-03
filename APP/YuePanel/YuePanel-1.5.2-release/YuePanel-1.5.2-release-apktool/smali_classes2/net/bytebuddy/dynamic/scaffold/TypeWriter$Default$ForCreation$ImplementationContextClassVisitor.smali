.class public Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$ImplementationContextClassVisitor;
.super Lnet/bytebuddy/utility/visitor/ContextClassVisitor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ImplementationContextClassVisitor"
.end annotation


# instance fields
.field private final implementationContext:Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;

.field final synthetic this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;)V
    .locals 0

    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$ImplementationContextClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    invoke-direct {p0, p2}, Lnet/bytebuddy/utility/visitor/ContextClassVisitor;-><init>(Lnet/bytebuddy/jar/asm/ClassVisitor;)V

    iput-object p3, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$ImplementationContextClassVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;

    return-void
.end method


# virtual methods
.method public getAuxiliaryTypes()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$ImplementationContextClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->auxiliaryTypes:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$ImplementationContextClassVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;

    invoke-interface {v1}, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;->getAuxiliaryTypes()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getLoadedTypeInitializer()Lnet/bytebuddy/implementation/LoadedTypeInitializer;
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$ImplementationContextClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    return-object v0
.end method
