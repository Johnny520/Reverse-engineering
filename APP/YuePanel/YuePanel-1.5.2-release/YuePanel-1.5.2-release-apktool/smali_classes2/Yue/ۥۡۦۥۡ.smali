.class public interface abstract annotation LYue/ۥۡۦۥۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime LYue/ۥۡۦۤۡ;
.end annotation

.annotation runtime LYue/ۥۡۦۨۡ;
    value = .enum LYue/ۥۣ۟۠ۧ;->ۥۣ۟۟۠:LYue/ۥۣ۟۠ۧ;
.end annotation

.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.2"
.end annotation

.annotation runtime LYue/ۥۢ۠ۨۤ;
    allowedTargets = {
        .enum LYue/ۥ۟۠ۧۤ;->ۥۣ۟۟۠:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟ۡ۠:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟۠ۦ:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟ۡ۟:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟ۡۦ:LYue/ۥ۟۠ۧۤ;
    }
.end annotation

.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation LYue/ۥۡۦۥۡ;
        errorCode = -0x1
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = ""
        versionKind = .enum LYue/ۥۡۦۥۢ;->ۥۣ۟۟۠:LYue/ۥۡۦۥۢ;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۦۥۡ$ۥ;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Repeatable;
    value = LYue/ۥۡۦۥۡ$ۥ;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->SOURCE:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->CONSTRUCTOR:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract errorCode()I
.end method

.method public abstract level()LYue/ۥ۠;
.end method

.method public abstract message()Ljava/lang/String;
.end method

.method public abstract version()Ljava/lang/String;
.end method

.method public abstract versionKind()LYue/ۥۡۦۥۢ;
.end method
