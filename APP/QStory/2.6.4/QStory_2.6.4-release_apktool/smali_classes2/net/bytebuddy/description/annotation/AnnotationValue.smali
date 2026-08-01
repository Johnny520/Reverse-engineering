.class public interface abstract Lnet/bytebuddy/description/annotation/AnnotationValue;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/annotation/AnnotationValue$ForIncompatibleType;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingValue;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$ForMismatchedType;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$ForTypeDescription;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$ForEnumerationDescription;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$AbstractBase;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$State;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "S:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final UNDEFINED:Lnet/bytebuddy/description/annotation/AnnotationValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# virtual methods
.method public abstract filter(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            ")",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "TT;TS;>;"
        }
    .end annotation
.end method

.method public abstract filter(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ")",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "TT;TS;>;"
        }
    .end annotation
.end method

.method public abstract getSort()Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;
.end method

.method public abstract getState()Lnet/bytebuddy/description/annotation/AnnotationValue$State;
.end method

.method public abstract load(Ljava/lang/ClassLoader;)Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded<",
            "TS;>;"
        }
    .end annotation
.end method

.method public abstract resolve()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract resolve(Ljava/lang/Class;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<W:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "+TW;>;)TW;"
        }
    .end annotation
.end method
