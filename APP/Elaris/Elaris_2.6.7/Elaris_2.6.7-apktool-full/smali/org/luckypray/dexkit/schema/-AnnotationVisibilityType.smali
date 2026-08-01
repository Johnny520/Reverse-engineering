.class public final Lorg/luckypray/dexkit/schema/-AnnotationVisibilityType;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


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

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationVisibilityType$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationVisibilityType$Companion;-><init>(Lr2;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/schema/-AnnotationVisibilityType;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationVisibilityType$Companion;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
