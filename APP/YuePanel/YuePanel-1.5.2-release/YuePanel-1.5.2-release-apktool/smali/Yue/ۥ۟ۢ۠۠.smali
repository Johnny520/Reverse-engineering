.class public interface abstract annotation LYue/ۥ۟ۢ۠۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation LYue/ۥ۟ۢ۠۠;
        intMapping = {}
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۢ۠۠$ۥ;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->SOURCE:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract intMapping()[LYue/ۥ۟ۢ۠۠$ۥ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end method

.method public abstract value()Ljava/lang/String;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end method
