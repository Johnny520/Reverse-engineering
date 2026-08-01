.class public interface abstract annotation Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$ToArgument;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$ToArgument;
        index = -0x1
        typing = .enum Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->STATIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2609
    name = "ToArgument"
.end annotation

.annotation runtime Ljava/lang/annotation/Repeatable;
    value = Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {}
.end annotation

.annotation runtime Lnet/bytebuddy/build/RepeatedAnnotationPlugin$Enhance;
    value = Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments;
.end annotation


# virtual methods
.method public abstract index()I
.end method

.method public abstract typing()Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;
.end method

.method public abstract value()I
.end method
