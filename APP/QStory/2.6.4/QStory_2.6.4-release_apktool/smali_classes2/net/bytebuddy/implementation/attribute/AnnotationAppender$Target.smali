.class public interface abstract Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/attribute/AnnotationAppender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Target"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target$OnRecordComponent;,
        Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target$OnMethodParameter;,
        Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target$OnMethod;,
        Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target$OnField;,
        Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target$OnType;
    }
.end annotation


# virtual methods
.method public abstract visit(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract visit(Ljava/lang/String;ZILjava/lang/String;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method
