.class public interface abstract annotation LYue/ۥ۟ۢ۠۠$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation LYue/ۥ۟ۢ۠۠$ۥ;
        mask = 0x0
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۢ۠۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2609
    name = "\u06e5"
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->SOURCE:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {}
.end annotation


# virtual methods
.method public abstract mask()I
.end method

.method public abstract name()Ljava/lang/String;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end method

.method public abstract value()I
.end method
