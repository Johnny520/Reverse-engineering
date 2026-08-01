.class public final enum Lnet/bytebuddy/description/modifier/FieldManifestation;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/description/modifier/FieldManifestation;",
        ">;",
        "Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/description/modifier/FieldManifestation;

.field public static final enum FINAL:Lnet/bytebuddy/description/modifier/FieldManifestation;

.field public static final enum PLAIN:Lnet/bytebuddy/description/modifier/FieldManifestation;

.field public static final enum VOLATILE:Lnet/bytebuddy/description/modifier/FieldManifestation;


# instance fields
.field private final mask:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 2
    .line 3
    const-string v1, "PLAIN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lnet/bytebuddy/description/modifier/FieldManifestation;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/description/modifier/FieldManifestation;->PLAIN:Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const/16 v3, 0x10

    .line 15
    .line 16
    const-string v4, "FINAL"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/description/modifier/FieldManifestation;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lnet/bytebuddy/description/modifier/FieldManifestation;->FINAL:Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 22
    .line 23
    new-instance v2, Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    const/16 v4, 0x40

    .line 27
    .line 28
    const-string v5, "VOLATILE"

    .line 29
    .line 30
    invoke-direct {v2, v5, v3, v4}, Lnet/bytebuddy/description/modifier/FieldManifestation;-><init>(Ljava/lang/String;II)V

    .line 31
    .line 32
    .line 33
    sput-object v2, Lnet/bytebuddy/description/modifier/FieldManifestation;->VOLATILE:Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 34
    .line 35
    filled-new-array {v0, v1, v2}, [Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lnet/bytebuddy/description/modifier/FieldManifestation;->$VALUES:[Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 40
    .line 41
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
    iput p3, p0, Lnet/bytebuddy/description/modifier/FieldManifestation;->mask:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/description/modifier/FieldManifestation;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/description/modifier/FieldManifestation;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/modifier/FieldManifestation;->$VALUES:[Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/description/modifier/FieldManifestation;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getMask()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/modifier/FieldManifestation;->mask:I

    .line 2
    .line 3
    return p0
.end method

.method public getRange()I
    .locals 0

    .line 1
    const/16 p0, 0x50

    .line 2
    .line 3
    return p0
.end method

.method public isDefault()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/modifier/FieldManifestation;->PLAIN:Lnet/bytebuddy/description/modifier/FieldManifestation;

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
    iget p0, p0, Lnet/bytebuddy/description/modifier/FieldManifestation;->mask:I

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

.method public isPlain()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/modifier/FieldManifestation;->isFinal()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lnet/bytebuddy/description/modifier/FieldManifestation;->isVolatile()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public isVolatile()Z
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/modifier/FieldManifestation;->mask:I

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
