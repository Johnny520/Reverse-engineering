.class public interface abstract Lnet/bytebuddy/implementation/LoadedTypeInitializer;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
