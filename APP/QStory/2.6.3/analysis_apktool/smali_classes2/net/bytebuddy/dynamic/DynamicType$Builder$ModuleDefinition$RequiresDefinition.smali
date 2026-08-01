.class public interface abstract Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RequiresDefinition"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition$Delegator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
        "TU;>;"
    }
.end annotation


# virtual methods
.method public abstract requiredVersion(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition<",
            "TU;>;"
        }
    .end annotation
.end method
