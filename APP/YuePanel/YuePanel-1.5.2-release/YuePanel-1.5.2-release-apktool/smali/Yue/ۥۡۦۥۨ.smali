.class public interface abstract annotation LYue/ۥۡۦۥۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime LYue/ۥۡۡۦۥ;
.end annotation

.annotation runtime LYue/ۥۡۦۨۡ;
    value = .enum LYue/ۥۣ۟۠ۧ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟۠ۧ;
.end annotation

.annotation runtime LYue/ۥۢ۠ۨۤ;
    allowedTargets = {
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟۠ۤ:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟ۡ۠:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟ۡۡ:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟ۡۢ:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟ۡ۟:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟۠ۧ:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟ۡ:LYue/ۥ۟۠ۧۤ;
    }
.end annotation

.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation LYue/ۥۡۦۥۨ;
        allOf = {}
        anyOf = {}
        conditional = false
        value = ""
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۦۥۨ$ۥ;,
        LYue/ۥۡۦۥۨ$ۥ۟;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Documented;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->CLASS:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->PARAMETER:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->CONSTRUCTOR:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract allOf()[Ljava/lang/String;
.end method

.method public abstract anyOf()[Ljava/lang/String;
.end method

.method public abstract conditional()Z
.end method

.method public abstract value()Ljava/lang/String;
.end method
