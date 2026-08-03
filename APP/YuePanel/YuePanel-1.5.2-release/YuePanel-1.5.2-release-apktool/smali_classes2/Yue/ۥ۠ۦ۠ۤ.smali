.class public interface abstract annotation LYue/ۥ۠ۦ۠ۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime LYue/ۥ۟ۨۨۦ;
    level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
    message = "Switch to new -Xjvm-default modes: `all` or `all-compatibility`"
.end annotation

.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.2"
.end annotation

.annotation runtime LYue/ۥۢ۠ۨۤ;
    allowedTargets = {
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟ۡ۠:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟۠ۦ:LYue/ۥ۟۠ۧۤ;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;
    }
.end annotation
