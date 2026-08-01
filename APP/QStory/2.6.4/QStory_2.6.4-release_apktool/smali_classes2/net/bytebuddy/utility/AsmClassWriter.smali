.class public interface abstract Lnet/bytebuddy/utility/AsmClassWriter;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
