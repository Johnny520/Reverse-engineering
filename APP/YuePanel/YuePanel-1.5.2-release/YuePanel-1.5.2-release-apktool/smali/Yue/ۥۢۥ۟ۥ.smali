.class public interface abstract annotation LYue/ۥۢۥ۟ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime LYue/ۥۡۦۨۡ;
    value = .enum LYue/ۥۣ۟۠ۧ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟۠ۧ;
.end annotation

.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation LYue/ۥۢۥ۟ۥ;
        otherwise = 0x2
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۥ۟ۥ$ۥ;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->CLASS:Ljava/lang/annotation/RetentionPolicy;
.end annotation


# static fields
.field public static final ۥ۟۟۟ۤ:LYue/ۥۢۥ۟ۥ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۥ:I = 0x2

.field public static final ۥ۟۟۟ۦ:I = 0x3

.field public static final ۥ۟۟۟ۧ:I = 0x4

.field public static final ۥ۟۟۟ۨ:I = 0x5


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LYue/ۥۢۥ۟ۥ$ۥ;->ۥ:LYue/ۥۢۥ۟ۥ$ۥ;

    sput-object v0, LYue/ۥۢۥ۟ۥ;->ۥ۟۟۟ۤ:LYue/ۥۢۥ۟ۥ$ۥ;

    return-void
.end method


# virtual methods
.method public abstract otherwise()I
.end method
