.class public Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$RegistryContextClassVisitor;
.super Lnet/bytebuddy/utility/visitor/ContextClassVisitor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "RegistryContextClassVisitor"
.end annotation


# instance fields
.field private final contextRegistry:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;

.field final synthetic this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;)V
    .locals 0

    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$RegistryContextClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;

    invoke-direct {p0, p2}, Lnet/bytebuddy/utility/visitor/ContextClassVisitor;-><init>(Lnet/bytebuddy/jar/asm/ClassVisitor;)V

    iput-object p3, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$RegistryContextClassVisitor;->contextRegistry:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;

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

    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$RegistryContextClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;

    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->auxiliaryTypes:Ljava/util/List;

    iget-object v1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$RegistryContextClassVisitor;->contextRegistry:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;

    invoke-virtual {v1}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;->getAuxiliaryTypes()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getLoadedTypeInitializer()Lnet/bytebuddy/implementation/LoadedTypeInitializer;
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$RegistryContextClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;

    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    return-object v0
.end method
