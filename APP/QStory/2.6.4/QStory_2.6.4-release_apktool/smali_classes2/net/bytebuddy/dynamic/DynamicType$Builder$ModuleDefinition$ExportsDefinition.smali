.class public interface abstract Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$ExportsDefinition;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

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
