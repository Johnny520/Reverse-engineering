.class public interface abstract Lnet/bytebuddy/utility/AsmClassWriter$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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
