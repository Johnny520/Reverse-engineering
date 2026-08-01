.class public abstract enum Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/EqualsMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "TypePropertyComparator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;",
        ">;",
        "Ljava/util/Comparator<",
        "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

.field public static final enum FOR_ENUMERATION_TYPES:Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

.field public static final enum FOR_PRIMITIVE_TYPES:Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

.field public static final enum FOR_PRIMITIVE_WRAPPER_TYPES:Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

.field public static final enum FOR_STRING_TYPES:Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator$1;

    .line 2
    .line 3
    const-string v1, "FOR_PRIMITIVE_TYPES"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->FOR_PRIMITIVE_TYPES:Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator$2;

    .line 12
    .line 13
    const-string v3, "FOR_ENUMERATION_TYPES"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->FOR_ENUMERATION_TYPES:Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

    .line 20
    .line 21
    new-instance v3, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator$3;

    .line 22
    .line 23
    const-string v5, "FOR_STRING_TYPES"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator$3;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->FOR_STRING_TYPES:Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

    .line 30
    .line 31
    new-instance v5, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator$4;

    .line 32
    .line 33
    const-string v7, "FOR_PRIMITIVE_WRAPPER_TYPES"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator$4;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->FOR_PRIMITIVE_WRAPPER_TYPES:Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    new-array v7, v7, [Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

    .line 43
    .line 44
    aput-object v0, v7, v2

    .line 45
    .line 46
    aput-object v1, v7, v4

    .line 47
    .line 48
    aput-object v3, v7, v6

    .line 49
    .line 50
    aput-object v5, v7, v8

    .line 51
    .line 52
    sput-object v7, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->$VALUES:[Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

    .line 53
    .line 54
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

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/implementation/EqualsMethod$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->$VALUES:[Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 47
    check-cast p1, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    check-cast p2, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->compare(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)I

    move-result p0

    return p0
.end method

.method public compare(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)I
    .locals 1

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->resolve(Lnet/bytebuddy/description/type/TypeDefinition;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p2}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->resolve(Lnet/bytebuddy/description/type/TypeDefinition;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 p0, -0x1

    .line 22
    return p0

    .line 23
    :cond_0
    invoke-interface {p1}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->resolve(Lnet/bytebuddy/description/type/TypeDefinition;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    invoke-interface {p2}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->resolve(Lnet/bytebuddy/description/type/TypeDefinition;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :cond_1
    const/4 p0, 0x0

    .line 46
    return p0
.end method

.method public abstract resolve(Lnet/bytebuddy/description/type/TypeDefinition;)Z
.end method
