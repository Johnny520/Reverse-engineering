.class public interface abstract Lnet/bytebuddy/description/type/TypeList;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/matcher/FilterableList;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/type/TypeList$Generic;,
        Lnet/bytebuddy/description/type/TypeList$Empty;,
        Lnet/bytebuddy/description/type/TypeList$Explicit;,
        Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;,
        Lnet/bytebuddy/description/type/TypeList$AbstractBase;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/matcher/FilterableList<",
        "Lnet/bytebuddy/description/type/TypeDescription;",
        "Lnet/bytebuddy/description/type/TypeList;",
        ">;"
    }
.end annotation


# static fields
.field public static final NO_INTERFACES:[Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field

.field public static final UNDEFINED:Lnet/bytebuddy/description/type/TypeList;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# virtual methods
.method public abstract asGenericTypes()Lnet/bytebuddy/description/type/TypeList$Generic;
.end method

.method public abstract getStackSize()I
.end method

.method public abstract toInternalNames()[Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method
