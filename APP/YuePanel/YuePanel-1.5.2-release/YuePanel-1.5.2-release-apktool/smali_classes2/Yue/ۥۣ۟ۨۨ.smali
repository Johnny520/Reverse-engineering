.class public interface abstract annotation LYue/ۥۣ۟ۨۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.3"
.end annotation

.annotation runtime LYue/ۥۢ۠ۨۤ;
    allowedTargets = {
        .enum LYue/ۥ۟۠ۧۤ;->ۥۣ۟۟۠:LYue/ۥ۟۠ۧۤ;
    }
.end annotation

.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation LYue/ۥۣ۟ۨۨ;
        c = ""
        f = ""
        i = {}
        l = {}
        m = ""
        n = {}
        s = {}
        v = 0x1
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract c()Ljava/lang/String;
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "c"
    .end annotation
.end method

.method public abstract f()Ljava/lang/String;
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "f"
    .end annotation
.end method

.method public abstract i()[I
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "i"
    .end annotation
.end method

.method public abstract l()[I
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "l"
    .end annotation
.end method

.method public abstract m()Ljava/lang/String;
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "m"
    .end annotation
.end method

.method public abstract n()[Ljava/lang/String;
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "n"
    .end annotation
.end method

.method public abstract s()[Ljava/lang/String;
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "s"
    .end annotation
.end method

.method public abstract v()I
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "v"
    .end annotation
.end method
