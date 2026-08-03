.class public final Lorg/luckypray/dexkit/schema/-TargetElementType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-TargetElementType$Companion;
    }
.end annotation


# static fields
.field public static final AnnotationType:B = 0x6t

.field public static final Companion:Lorg/luckypray/dexkit/schema/-TargetElementType$Companion;

.field public static final Constructor:B = 0x4t

.field public static final Field:B = 0x1t

.field public static final LocalVariable:B = 0x5t

.field public static final Method:B = 0x2t

.field public static final Package:B = 0x7t

.field public static final Parameter:B = 0x3t

.field public static final Type:B = 0x0t

.field public static final TypeParameter:B = 0x8t

.field public static final TypeUse:B = 0x9t


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-TargetElementType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-TargetElementType$Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-TargetElementType;->Companion:Lorg/luckypray/dexkit/schema/-TargetElementType$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
