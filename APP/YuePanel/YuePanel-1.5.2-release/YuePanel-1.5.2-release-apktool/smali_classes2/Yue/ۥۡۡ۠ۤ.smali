.class public interface abstract annotation LYue/ۥۡۡ۠ۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime LYue/ۥۡۦۨۡ;
    value = .enum LYue/ۥۣ۟۠ۧ;->ۥ۟۟۠ۥ:LYue/ۥۣ۟۠ۧ;
.end annotation

.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.3"
.end annotation

.annotation runtime LYue/ۥۢ۠ۨۤ;
    allowedTargets = {
        .enum LYue/ۥ۟۠ۧۤ;->ۥۣ۟۟۠:LYue/ۥ۟۠ۧۤ;
    }
.end annotation

.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation LYue/ۥۡۡ۠ۤ;
        bv = {
            0x1,
            0x0,
            0x3
        }
        d1 = {}
        d2 = {}
        k = 0x1
        mv = {}
        pn = ""
        xi = 0x0
        xs = ""
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۡ۠ۤ$ۥ;
    }
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
.method public abstract bv()[I
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "bv"
    .end annotation
.end method

.method public abstract d1()[Ljava/lang/String;
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "d1"
    .end annotation
.end method

.method public abstract d2()[Ljava/lang/String;
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "d2"
    .end annotation
.end method

.method public abstract k()I
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "k"
    .end annotation
.end method

.method public abstract mv()[I
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "mv"
    .end annotation
.end method

.method public abstract pn()Ljava/lang/String;
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "pn"
    .end annotation
.end method

.method public abstract xi()I
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "xi"
    .end annotation
.end method

.method public abstract xs()Ljava/lang/String;
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "xs"
    .end annotation
.end method
