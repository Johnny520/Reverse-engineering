.class public interface abstract Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "JdkClassWriter"
.end annotation

.annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;
    value = "net.bytebuddy.jar.asmjdkbridge.JdkClassWriter"
.end annotation


# virtual methods
.method public abstract isInstance(Lnet/bytebuddy/jar/asm/ClassVisitor;)Z
    .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Instance;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;
        value = "isInstance"
    .end annotation
.end method

.method public abstract make(ILjava/lang/reflect/Method;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/ClassVisitor;
    .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$IsConstructor;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;
        value = "make"
    .end annotation
.end method

.method public abstract make(Ljava/lang/Object;ILjava/lang/reflect/Method;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/ClassVisitor;
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;
            value = "net.bytebuddy.jar.asmjdkbridge.JdkClassReader"
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$IsConstructor;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;
        value = "make"
    .end annotation
.end method

.method public abstract toByteArray(Lnet/bytebuddy/jar/asm/ClassVisitor;)[B
    .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;
        value = "toByteArray"
    .end annotation
.end method
