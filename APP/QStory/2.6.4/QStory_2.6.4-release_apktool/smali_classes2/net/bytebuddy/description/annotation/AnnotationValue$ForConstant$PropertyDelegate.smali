.class public interface abstract Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "PropertyDelegate"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;
    }
.end annotation


# virtual methods
.method public abstract copy(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(TS;)TS;"
        }
    .end annotation
.end method

.method public abstract equals(Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public abstract hashCode(Ljava/lang/Object;)I
.end method

.method public abstract toString(Ljava/lang/Object;)Ljava/lang/String;
.end method
