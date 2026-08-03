.class public interface abstract annotation LYue/ۥ۠ۢۥۣ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime LYue/ۥۡۡۦۥ;
.end annotation

.annotation build LYue/ۥۡۦۥۧ;
    level = .enum LYue/ۥۡۦۥۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۥۧ$ۥ;
    message = "This declaration is in a preview state and can be changed in a backwards-incompatible manner with a best-effort migration. Its usage should be marked with \'@kotlinx.coroutines.FlowPreview\' or \'@OptIn(kotlinx.coroutines.FlowPreview::class)\' if you accept the drawback of relying on preview API"
.end annotation

.annotation runtime LYue/ۥۡۦۨۡ;
    value = .enum LYue/ۥۣ۟۠ۧ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟۠ۧ;
.end annotation

.annotation runtime LYue/ۥۢ۠ۨۤ;
    allowedTargets = {
        .enum LYue/ۥ۟۠ۧۤ;->ۥۣ۟۟۠:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟ۡ۠:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟ۡۦ:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟۠ۦ:LYue/ۥ۟۠ۧۤ;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Documented;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->CLASS:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;
    }
.end annotation
