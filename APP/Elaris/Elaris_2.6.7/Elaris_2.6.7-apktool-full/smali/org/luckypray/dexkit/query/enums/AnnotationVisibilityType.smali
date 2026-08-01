.class public final enum Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;
.super Ljava/lang/Enum;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


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


# static fields
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

.field public static final enum Build:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

.field public static final Companion:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;

.field public static final enum Runtime:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

.field public static final enum System:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;
    .locals 3

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Build:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Runtime:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 4
    .line 5
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->System:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 2
    .line 3
    const-string v1, "Build"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Build:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 10
    .line 11
    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 12
    .line 13
    const-string v1, "Runtime"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Runtime:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 20
    .line 21
    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 22
    .line 23
    const-string v1, "System"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->System:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 30
    .line 31
    invoke-static {}, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->$values()[Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 36
    .line 37
    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;-><init>(Lr2;)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Companion:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;

    .line 44
    .line 45
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;
    .locals 1

    .line 1
    const-class v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 8
    .line 9
    return-object v0
.end method
