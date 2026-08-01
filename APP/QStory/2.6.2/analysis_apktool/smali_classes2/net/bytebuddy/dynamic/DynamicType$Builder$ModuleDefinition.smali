.class public interface abstract Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/dynamic/DynamicType$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/DynamicType$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ModuleDefinition"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase;,
        Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$OpensDefinition;,
        Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$ExportsDefinition;,
        Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
        "TS;>;"
    }
.end annotation


# virtual methods
.method public abstract export(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract export(Ljava/lang/String;Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForModule$OfExport;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public varargs abstract export(Ljava/lang/String;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForModule$OfExport;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForModule$OfExport;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract exports(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public varargs abstract exports([Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract mainClass(Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .param p1    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract mainClass(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract mainClass(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .param p1    # Lnet/bytebuddy/description/type/TypeDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract open(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract open(Ljava/lang/String;Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForModule$OfOpen;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public varargs abstract open(Ljava/lang/String;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForModule$OfOpen;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForModule$OfOpen;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract opens(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public varargs abstract opens([Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract packages(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public varargs abstract packages([Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract provides(Ljava/lang/Class;Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/Collection<",
            "Ljava/lang/Class<",
            "*>;>;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public varargs abstract provides(Ljava/lang/Class;[Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract provides(Ljava/lang/String;Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public varargs abstract provides(Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract provides(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/Collection<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public varargs abstract provides(Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "[",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract require(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract require(Ljava/lang/String;Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForModule$OfRequire;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public varargs abstract require(Ljava/lang/String;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForModule$OfRequire;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForModule$OfRequire;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract requires(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public varargs abstract requires([Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract uses(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public varargs abstract uses([Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public varargs abstract uses([Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public varargs abstract uses([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract version(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TS;>;"
        }
    .end annotation
.end method
