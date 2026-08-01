.class public interface abstract Lnet/bytebuddy/description/type/TypeList;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

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
