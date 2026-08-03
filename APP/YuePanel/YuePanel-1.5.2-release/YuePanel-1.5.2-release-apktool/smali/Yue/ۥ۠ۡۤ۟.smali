.class public interface abstract annotation LYue/ۥ۠ۡۤ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime LYue/ۥ۟ۨۨۦ;
    message = "This annotation has been replaced by `@RequiresOptIn`"
    replaceWith = .subannotation LYue/ۥۡۦۣۤ;
        expression = "RequiresOptIn"
        imports = {
            "androidx.annotation.RequiresOptIn"
        }
    .end subannotation
.end annotation

.annotation runtime LYue/ۥۡۦۨۡ;
    value = .enum LYue/ۥۣ۟۠ۧ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟۠ۧ;
.end annotation

.annotation runtime LYue/ۥۢ۠ۨۤ;
    allowedTargets = {
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟۠ۤ:LYue/ۥ۟۠ۧۤ;
    }
.end annotation

.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation LYue/ۥ۠ۡۤ۟;
        level = .enum LYue/ۥ۠ۡۤ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۡۤ۟$ۥ;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۡۤ۟$ۥ;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->CLASS:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract level()LYue/ۥ۠ۡۤ۟$ۥ;
.end method
