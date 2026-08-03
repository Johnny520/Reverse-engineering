.class public interface abstract annotation LYue/ۥ۠ۥۣۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime LYue/ۥ۟ۨۨۦ;
    message = "Replaced by the {@code androidx.resourceinpsection} package."
.end annotation

.annotation runtime LYue/ۥۡۦۨۡ;
    value = .enum LYue/ۥۣ۟۠ۧ;->ۥۣ۟۟۠:LYue/ۥۣ۟۠ۧ;
.end annotation

.annotation runtime LYue/ۥۢ۠ۨۤ;
    allowedTargets = {
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟ۡ۠:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟ۡۡ:LYue/ۥ۟۠ۧۤ;,
        .enum LYue/ۥ۟۠ۧۤ;->ۥ۟۟ۡۢ:LYue/ۥ۟۠ۧۤ;
    }
.end annotation

.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation LYue/ۥ۠ۥۣۢ;
        attributeId = 0x0
        enumMapping = {}
        flagMapping = {}
        hasAttributeId = true
        name = ""
        valueType = .enum LYue/ۥ۠ۥۣۢ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۥۣۢ$ۥ۟۟;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۥۣۢ$ۥ۟۟;,
        LYue/ۥ۠ۥۣۢ$ۥ;,
        LYue/ۥ۠ۥۣۢ$ۥ۟;
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
.method public abstract attributeId()I
.end method

.method public abstract enumMapping()[LYue/ۥ۠ۥۣۢ$ۥ;
.end method

.method public abstract flagMapping()[LYue/ۥ۠ۥۣۢ$ۥ۟;
.end method

.method public abstract hasAttributeId()Z
.end method

.method public abstract name()Ljava/lang/String;
.end method

.method public abstract valueType()LYue/ۥ۠ۥۣۢ$ۥ۟۟;
.end method
