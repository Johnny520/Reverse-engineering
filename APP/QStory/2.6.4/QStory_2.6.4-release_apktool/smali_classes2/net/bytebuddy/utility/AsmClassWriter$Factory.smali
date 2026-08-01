.class public interface abstract Lnet/bytebuddy/utility/AsmClassWriter$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/AsmClassWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/AsmClassWriter$Factory$Suppressing;,
        Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;
    }
.end annotation


# virtual methods
.method public abstract make(I)Lnet/bytebuddy/utility/AsmClassWriter;
.end method

.method public abstract make(ILnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/AsmClassWriter;
.end method

.method public abstract make(ILnet/bytebuddy/utility/AsmClassReader;)Lnet/bytebuddy/utility/AsmClassWriter;
.end method

.method public abstract make(ILnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/AsmClassWriter;
.end method
