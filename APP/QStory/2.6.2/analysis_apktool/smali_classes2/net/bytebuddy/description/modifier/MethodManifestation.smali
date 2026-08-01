.class public final enum Lnet/bytebuddy/description/modifier/MethodManifestation;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/description/modifier/MethodManifestation;",
        ">;",
        "Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/description/modifier/MethodManifestation;

.field public static final enum ABSTRACT:Lnet/bytebuddy/description/modifier/MethodManifestation;

.field public static final enum BRIDGE:Lnet/bytebuddy/description/modifier/MethodManifestation;

.field public static final enum FINAL:Lnet/bytebuddy/description/modifier/MethodManifestation;

.field public static final enum FINAL_BRIDGE:Lnet/bytebuddy/description/modifier/MethodManifestation;

.field public static final enum FINAL_NATIVE:Lnet/bytebuddy/description/modifier/MethodManifestation;

.field public static final enum NATIVE:Lnet/bytebuddy/description/modifier/MethodManifestation;

.field public static final enum PLAIN:Lnet/bytebuddy/description/modifier/MethodManifestation;


# instance fields
.field private final mask:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 2
    .line 3
    const-string v1, "PLAIN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lnet/bytebuddy/description/modifier/MethodManifestation;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/description/modifier/MethodManifestation;->PLAIN:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const/16 v3, 0x100

    .line 15
    .line 16
    const-string v4, "NATIVE"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/description/modifier/MethodManifestation;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lnet/bytebuddy/description/modifier/MethodManifestation;->NATIVE:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 22
    .line 23
    new-instance v2, Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    const/16 v4, 0x400

    .line 27
    .line 28
    const-string v5, "ABSTRACT"

    .line 29
    .line 30
    invoke-direct {v2, v5, v3, v4}, Lnet/bytebuddy/description/modifier/MethodManifestation;-><init>(Ljava/lang/String;II)V

    .line 31
    .line 32
    .line 33
    sput-object v2, Lnet/bytebuddy/description/modifier/MethodManifestation;->ABSTRACT:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 34
    .line 35
    new-instance v3, Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 36
    .line 37
    const/4 v4, 0x3

    .line 38
    const/16 v5, 0x10

    .line 39
    .line 40
    const-string v6, "FINAL"

    .line 41
    .line 42
    invoke-direct {v3, v6, v4, v5}, Lnet/bytebuddy/description/modifier/MethodManifestation;-><init>(Ljava/lang/String;II)V

    .line 43
    .line 44
    .line 45
    sput-object v3, Lnet/bytebuddy/description/modifier/MethodManifestation;->FINAL:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 46
    .line 47
    new-instance v4, Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 48
    .line 49
    const/4 v5, 0x4

    .line 50
    const/16 v6, 0x110

    .line 51
    .line 52
    const-string v7, "FINAL_NATIVE"

    .line 53
    .line 54
    invoke-direct {v4, v7, v5, v6}, Lnet/bytebuddy/description/modifier/MethodManifestation;-><init>(Ljava/lang/String;II)V

    .line 55
    .line 56
    .line 57
    sput-object v4, Lnet/bytebuddy/description/modifier/MethodManifestation;->FINAL_NATIVE:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 58
    .line 59
    new-instance v5, Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 60
    .line 61
    const/4 v6, 0x5

    .line 62
    const/16 v7, 0x40

    .line 63
    .line 64
    const-string v8, "BRIDGE"

    .line 65
    .line 66
    invoke-direct {v5, v8, v6, v7}, Lnet/bytebuddy/description/modifier/MethodManifestation;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    sput-object v5, Lnet/bytebuddy/description/modifier/MethodManifestation;->BRIDGE:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 70
    .line 71
    new-instance v6, Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 72
    .line 73
    const/4 v7, 0x6

    .line 74
    const/16 v8, 0x50

    .line 75
    .line 76
    const-string v9, "FINAL_BRIDGE"

    .line 77
    .line 78
    invoke-direct {v6, v9, v7, v8}, Lnet/bytebuddy/description/modifier/MethodManifestation;-><init>(Ljava/lang/String;II)V

    .line 79
    .line 80
    .line 81
    sput-object v6, Lnet/bytebuddy/description/modifier/MethodManifestation;->FINAL_BRIDGE:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 82
    .line 83
    filled-new-array/range {v0 .. v6}, [Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lnet/bytebuddy/description/modifier/MethodManifestation;->$VALUES:[Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 88
    .line 89
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/description/modifier/MethodManifestation;->mask:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/description/modifier/MethodManifestation;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/description/modifier/MethodManifestation;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/modifier/MethodManifestation;->$VALUES:[Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/description/modifier/MethodManifestation;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getMask()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/modifier/MethodManifestation;->mask:I

    .line 2
    .line 3
    return p0
.end method

.method public getRange()I
    .locals 0

    .line 1
    const/16 p0, 0x550

    .line 2
    .line 3
    return p0
.end method

.method public isAbstract()Z
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/modifier/MethodManifestation;->mask:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x400

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public isBridge()Z
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/modifier/MethodManifestation;->mask:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x40

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public isDefault()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/modifier/MethodManifestation;->PLAIN:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public isFinal()Z
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/modifier/MethodManifestation;->mask:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x10

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public isNative()Z
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/modifier/MethodManifestation;->mask:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x100

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method
