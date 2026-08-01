.class public interface abstract Lnet/bytebuddy/implementation/LoadedTypeInitializer;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/LoadedTypeInitializer$Compound;,
        Lnet/bytebuddy/implementation/LoadedTypeInitializer$ForStaticField;,
        Lnet/bytebuddy/implementation/LoadedTypeInitializer$NoOp;
    }
.end annotation


# virtual methods
.method public abstract isAlive()Z
.end method

.method public abstract onLoad(Ljava/lang/Class;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation
.end method
