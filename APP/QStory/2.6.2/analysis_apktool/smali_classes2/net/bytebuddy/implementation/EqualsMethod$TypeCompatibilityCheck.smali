.class public abstract enum Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/EqualsMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "TypeCompatibilityCheck"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

.field public static final enum EXACT:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

.field protected static final GET_CLASS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field public static final enum SUBCLASS:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck$1;

    .line 2
    .line 3
    const-string v1, "EXACT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;->EXACT:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck$2;

    .line 12
    .line 13
    const-string v3, "SUBCLASS"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;->SUBCLASS:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    new-array v3, v3, [Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 23
    .line 24
    aput-object v0, v3, v2

    .line 25
    .line 26
    aput-object v1, v3, v4

    .line 27
    .line 28
    sput-object v3, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;->$VALUES:[Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 29
    .line 30
    const-class v0, Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "getClass"

    .line 41
    .line 42
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 51
    .line 52
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 57
    .line 58
    sput-object v0, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;->GET_CLASS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 59
    .line 60
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
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;->$VALUES:[Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract resolve(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method
