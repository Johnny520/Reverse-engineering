.class public interface abstract annotation LYue/ۥۡۦۨۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime LYue/ۥۢ۠ۨۤ;
    allowedTargets = {
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟۠ۤ:LYue/ۥ۟۠ۧۤ;
    }
.end annotation

.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation LYue/ۥۡۦۨۡ;
        value = .enum LYue/ۥۣ۟۠ۧ;->ۥ۟۟۠ۥ:LYue/ۥۣ۟۠ۧ;
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract value()LYue/ۥۣ۟۠ۧ;
.end method
