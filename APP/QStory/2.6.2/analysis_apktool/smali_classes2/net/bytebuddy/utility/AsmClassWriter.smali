.class public interface abstract Lnet/bytebuddy/utility/AsmClassWriter;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/AsmClassWriter$SuperClassResolvingJdkClassWriter;,
        Lnet/bytebuddy/utility/AsmClassWriter$FrameComputingClassWriter;,
        Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;,
        Lnet/bytebuddy/utility/AsmClassWriter$ForAsm;,
        Lnet/bytebuddy/utility/AsmClassWriter$Factory;
    }
.end annotation


# virtual methods
.method public abstract getBinaryRepresentation()[B
.end method

.method public abstract getVisitor()Lnet/bytebuddy/jar/asm/ClassVisitor;
.end method
