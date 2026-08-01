.class public abstract Lnet/bytebuddy/utility/visitor/ContextClassVisitor;
.super Lnet/bytebuddy/jar/asm/ClassVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private active:Z


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/ClassVisitor;)V
    .locals 1

    .line 1
    sget v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;-><init>(ILnet/bytebuddy/jar/asm/ClassVisitor;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public active()Lnet/bytebuddy/utility/visitor/ContextClassVisitor;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lnet/bytebuddy/utility/visitor/ContextClassVisitor;->active:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public abstract getAuxiliaryTypes()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getLoadedTypeInitializer()Lnet/bytebuddy/implementation/LoadedTypeInitializer;
.end method

.method public visitEnd()V
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitEnd()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lnet/bytebuddy/utility/visitor/ContextClassVisitor;->active:Z

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Lnet/bytebuddy/utility/visitor/ContextClassVisitor;->getAuxiliaryTypes()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lnet/bytebuddy/utility/visitor/ContextClassVisitor;->getLoadedTypeInitializer()Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Lnet/bytebuddy/implementation/LoadedTypeInitializer;->isAlive()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v0, " is not defined \'active\' but defines auxiliary types or an alive type initializer"

    .line 30
    .line 31
    invoke-static {p0, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
.end method
