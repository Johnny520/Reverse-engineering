.class public interface abstract Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$ExportsDefinition;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ExportsDefinition"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$ExportsDefinition$Delegator;
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
.method public abstract to(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$ExportsDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$ExportsDefinition<",
            "TU;>;"
        }
    .end annotation
.end method

.method public varargs abstract to([Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$ExportsDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$ExportsDefinition<",
            "TU;>;"
        }
    .end annotation
.end method
