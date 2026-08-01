.class public interface abstract Lnet/bytebuddy/asm/Advice$Dispatcher;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Dispatcher"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$Inlining;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$Inactive;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$Resolved;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$Unresolved;
    }
.end annotation


# static fields
.field public static final IGNORE_ANNOTATION:Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field

.field public static final IGNORE_METHOD:Lnet/bytebuddy/jar/asm/MethodVisitor;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# virtual methods
.method public abstract getAdviceType()Lnet/bytebuddy/description/type/TypeDefinition;
.end method

.method public abstract isAlive()Z
.end method
