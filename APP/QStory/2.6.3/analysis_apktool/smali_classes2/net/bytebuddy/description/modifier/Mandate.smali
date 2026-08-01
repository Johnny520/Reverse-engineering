.class public final enum Lnet/bytebuddy/description/modifier/Mandate;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;
.implements Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;
.implements Lnet/bytebuddy/description/modifier/ModifierContributor$ForParameter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/description/modifier/Mandate;",
        ">;",
        "Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;",
        "Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;",
        "Lnet/bytebuddy/description/modifier/ModifierContributor$ForParameter;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/description/modifier/Mandate;

.field public static final enum MANDATED:Lnet/bytebuddy/description/modifier/Mandate;

.field public static final enum PLAIN:Lnet/bytebuddy/description/modifier/Mandate;


# instance fields
.field private final mask:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/description/modifier/Mandate;

    .line 2
    .line 3
    const-string v1, "PLAIN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lnet/bytebuddy/description/modifier/Mandate;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/description/modifier/Mandate;->PLAIN:Lnet/bytebuddy/description/modifier/Mandate;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/description/modifier/Mandate;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const v3, 0x8000

    .line 15
    .line 16
    .line 17
    const-string v4, "MANDATED"

    .line 18
    .line 19
    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/description/modifier/Mandate;-><init>(Ljava/lang/String;II)V

    .line 20
    .line 21
    .line 22
    sput-object v1, Lnet/bytebuddy/description/modifier/Mandate;->MANDATED:Lnet/bytebuddy/description/modifier/Mandate;

    .line 23
    .line 24
    filled-new-array {v0, v1}, [Lnet/bytebuddy/description/modifier/Mandate;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lnet/bytebuddy/description/modifier/Mandate;->$VALUES:[Lnet/bytebuddy/description/modifier/Mandate;

    .line 29
    .line 30
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
    iput p3, p0, Lnet/bytebuddy/description/modifier/Mandate;->mask:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/description/modifier/Mandate;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/description/modifier/Mandate;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/description/modifier/Mandate;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/description/modifier/Mandate;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/modifier/Mandate;->$VALUES:[Lnet/bytebuddy/description/modifier/Mandate;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/description/modifier/Mandate;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/description/modifier/Mandate;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getMask()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/modifier/Mandate;->mask:I

    .line 2
    .line 3
    return p0
.end method

.method public getRange()I
    .locals 0

    .line 1
    const p0, 0x8000

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public isDefault()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/modifier/Mandate;->PLAIN:Lnet/bytebuddy/description/modifier/Mandate;

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

.method public isMandated()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/modifier/Mandate;->MANDATED:Lnet/bytebuddy/description/modifier/Mandate;

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
