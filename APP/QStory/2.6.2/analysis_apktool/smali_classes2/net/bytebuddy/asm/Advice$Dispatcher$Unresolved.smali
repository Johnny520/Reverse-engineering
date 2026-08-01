.class public interface abstract Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$Dispatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Unresolved"
.end annotation


# virtual methods
.method public abstract asMethodEnter(Ljava/util/List;Lnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;)Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;
    .param p2    # Lnet/bytebuddy/utility/AsmClassReader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
            "*>;>;",
            "Lnet/bytebuddy/utility/AsmClassReader;",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;",
            "Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;",
            ")",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodEnter;"
        }
    .end annotation
.end method

.method public abstract asMethodExit(Ljava/util/List;Lnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;)Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;
    .param p2    # Lnet/bytebuddy/utility/AsmClassReader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
            "*>;>;",
            "Lnet/bytebuddy/utility/AsmClassReader;",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;",
            "Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;",
            ")",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved$ForMethodExit;"
        }
    .end annotation
.end method

.method public abstract getNamedTypes()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isBinary()Z
.end method
