.class interface abstract Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$ForLegacyVm;,
        Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$ForJava9CapableVm;,
        Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$CreationAction;
    }
.end annotation


# virtual methods
.method public abstract make(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;
.end method
