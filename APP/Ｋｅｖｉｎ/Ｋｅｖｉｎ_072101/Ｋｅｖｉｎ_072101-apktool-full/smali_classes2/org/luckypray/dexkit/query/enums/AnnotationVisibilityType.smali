.class public final enum Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;
.super Ljava/lang/Enum;
.source "AnnotationVisibilityType.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u0000 \u00062\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;",
        "",
        "(Ljava/lang/String;I)V",
        "Build",
        "Runtime",
        "System",
        "Companion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

.field public static final enum Build:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

.field public static final Companion:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;

.field public static final enum Runtime:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

.field public static final enum System:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;
    .locals 3

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Build:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Runtime:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->System:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    filled-new-array {v0, v1, v2}, [Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 34
    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    const-string v1, "Build"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Build:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 39
    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    const-string v1, "Runtime"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Runtime:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 44
    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    const-string v1, "System"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->System:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    invoke-static {}, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->$values()[Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    move-result-object v0

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Companion:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 30
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;
    .locals 1

    const-class v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    return-object v0
.end method

.method public static values()[Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;
    .locals 1

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    return-object v0
.end method
