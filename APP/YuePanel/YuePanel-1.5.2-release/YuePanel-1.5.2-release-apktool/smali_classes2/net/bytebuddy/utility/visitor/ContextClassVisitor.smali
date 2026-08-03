.class public abstract Lnet/bytebuddy/utility/visitor/ContextClassVisitor;
.super Lnet/bytebuddy/jar/asm/ClassVisitor;
.source "SourceFile"


# instance fields
.field private active:Z


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/ClassVisitor;)V
    .locals 1

    sget v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;-><init>(ILnet/bytebuddy/jar/asm/ClassVisitor;)V

    return-void
.end method


# virtual methods
.method public active()Lnet/bytebuddy/utility/visitor/ContextClassVisitor;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/bytebuddy/utility/visitor/ContextClassVisitor;->active:Z

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
    .locals 3

    invoke-super {p0}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitEnd()V

    iget-boolean v0, p0, Lnet/bytebuddy/utility/visitor/ContextClassVisitor;->active:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lnet/bytebuddy/utility/visitor/ContextClassVisitor;->getAuxiliaryTypes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lnet/bytebuddy/utility/visitor/ContextClassVisitor;->getLoadedTypeInitializer()Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    move-result-object v0

    invoke-interface {v0}, Lnet/bytebuddy/implementation/LoadedTypeInitializer;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is not defined \'active\' but defines auxiliary types or an alive type initializer"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method
