.class public final Lorg/luckypray/dexkit/schema/-AnnotationVisibilityType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-AnnotationVisibilityType$Companion;
    }
.end annotation


# static fields
.field public static final Build:B = 0x0t

.field public static final Companion:Lorg/luckypray/dexkit/schema/-AnnotationVisibilityType$Companion;

.field public static final None:B = 0x3t

.field public static final Runtime:B = 0x1t

.field public static final System:B = 0x2t


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationVisibilityType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationVisibilityType$Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-AnnotationVisibilityType;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationVisibilityType$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
