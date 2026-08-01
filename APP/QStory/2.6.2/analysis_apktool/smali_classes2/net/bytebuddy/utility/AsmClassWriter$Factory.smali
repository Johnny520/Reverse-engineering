.class public interface abstract Lnet/bytebuddy/utility/AsmClassWriter$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
