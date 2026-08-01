.class public interface abstract annotation Lnet/bytebuddy/implementation/bind/annotation/Argument;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lnet/bytebuddy/implementation/bind/annotation/Argument;
        bindingMechanic = .enum Lnet/bytebuddy/implementation/bind/annotation/Argument$BindingMechanic;->UNIQUE:Lnet/bytebuddy/implementation/bind/annotation/Argument$BindingMechanic;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bind/annotation/Argument$Binder;,
        Lnet/bytebuddy/implementation/bind/annotation/Argument$BindingMechanic;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Documented;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->PARAMETER:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract bindingMechanic()Lnet/bytebuddy/implementation/bind/annotation/Argument$BindingMechanic;
.end method

.method public abstract value()I
.end method
