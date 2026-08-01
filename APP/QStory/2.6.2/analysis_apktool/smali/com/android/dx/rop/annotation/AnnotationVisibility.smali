.class public final enum Lcom/android/dx/rop/annotation/AnnotationVisibility;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/util/ToHuman;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/android/dx/rop/annotation/AnnotationVisibility;",
        ">;",
        "Lcom/android/dx/util/ToHuman;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/android/dx/rop/annotation/AnnotationVisibility;

.field public static final enum BUILD:Lcom/android/dx/rop/annotation/AnnotationVisibility;

.field public static final enum EMBEDDED:Lcom/android/dx/rop/annotation/AnnotationVisibility;

.field public static final enum RUNTIME:Lcom/android/dx/rop/annotation/AnnotationVisibility;

.field public static final enum SYSTEM:Lcom/android/dx/rop/annotation/AnnotationVisibility;


# instance fields
.field private final human:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lcom/android/dx/rop/annotation/AnnotationVisibility;
    .locals 4

    .line 1
    sget-object v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;->RUNTIME:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dx/rop/annotation/AnnotationVisibility;->BUILD:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 4
    .line 5
    sget-object v2, Lcom/android/dx/rop/annotation/AnnotationVisibility;->SYSTEM:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 6
    .line 7
    sget-object v3, Lcom/android/dx/rop/annotation/AnnotationVisibility;->EMBEDDED:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "runtime"

    .line 5
    .line 6
    const-string v3, "RUNTIME"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/android/dx/rop/annotation/AnnotationVisibility;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;->RUNTIME:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 12
    .line 13
    new-instance v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "build"

    .line 17
    .line 18
    const-string v3, "BUILD"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lcom/android/dx/rop/annotation/AnnotationVisibility;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;->BUILD:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 24
    .line 25
    new-instance v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "system"

    .line 29
    .line 30
    const-string v3, "SYSTEM"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lcom/android/dx/rop/annotation/AnnotationVisibility;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;->SYSTEM:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 36
    .line 37
    new-instance v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "embedded"

    .line 41
    .line 42
    const-string v3, "EMBEDDED"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lcom/android/dx/rop/annotation/AnnotationVisibility;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;->EMBEDDED:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 48
    .line 49
    invoke-static {}, Lcom/android/dx/rop/annotation/AnnotationVisibility;->$values()[Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;->$VALUES:[Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 54
    .line 55
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/android/dx/rop/annotation/AnnotationVisibility;->human:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/android/dx/rop/annotation/AnnotationVisibility;
    .locals 1

    .line 1
    const-class v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/android/dx/rop/annotation/AnnotationVisibility;
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;->$VALUES:[Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/android/dx/rop/annotation/AnnotationVisibility;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/annotation/AnnotationVisibility;->human:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
