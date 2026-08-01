.class public interface abstract Lnet/bytebuddy/description/TypeVariableSource;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/description/ModifierReviewable$OfAbstraction;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/TypeVariableSource$AbstractBase;,
        Lnet/bytebuddy/description/TypeVariableSource$Visitor;
    }
.end annotation


# static fields
.field public static final UNDEFINED:Lnet/bytebuddy/description/TypeVariableSource;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# virtual methods
.method public abstract accept(Lnet/bytebuddy/description/TypeVariableSource$Visitor;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/description/TypeVariableSource$Visitor<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract findExpectedVariable(Ljava/lang/String;)Lnet/bytebuddy/description/type/TypeDescription$Generic;
.end method

.method public abstract findVariable(Ljava/lang/String;)Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract getEnclosingSource()Lnet/bytebuddy/description/TypeVariableSource;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;
.end method

.method public abstract isGenerified()Z
.end method

.method public abstract isInferrable()Z
.end method
