.class public interface abstract annotation LYue/ۥۣۡۨ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime LYue/ۥۡۦۨۡ;
    value = .enum LYue/ۥۣ۟۠ۧ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟۠ۧ;
.end annotation

.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.6"
.end annotation

.annotation runtime LYue/ۥۢ۠ۨۤ;
    allowedTargets = {
        .enum LYue/ۥ۟۠ۧۤ;->ۥۣ۟۟۠:LYue/ۥ۟۠ۧۤ;
    }
.end annotation

.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation LYue/ۥۣۡۨ۟;
        b = {}
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->CLASS:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract b()[Ljava/lang/String;
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "b"
    .end annotation
.end method
