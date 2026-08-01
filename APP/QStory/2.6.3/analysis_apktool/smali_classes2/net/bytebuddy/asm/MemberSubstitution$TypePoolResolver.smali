.class public interface abstract Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TypePoolResolver"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForClassFileLocator;,
        Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$ForExplicitPool;,
        Lnet/bytebuddy/asm/MemberSubstitution$TypePoolResolver$OfImplicitPool;
    }
.end annotation


# virtual methods
.method public abstract resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/pool/TypePool;
.end method
