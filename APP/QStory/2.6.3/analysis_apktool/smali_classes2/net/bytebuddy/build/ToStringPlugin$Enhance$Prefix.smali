.class public final enum Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/ToStringPlugin$Enhance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Prefix"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

.field public static final enum CANONICAL:Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

.field public static final enum FULLY_QUALIFIED:Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

.field public static final enum SIMPLE:Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;


# instance fields
.field private final prefixResolver:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;->FULLY_QUALIFIED_CLASS_NAME:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;

    .line 5
    .line 6
    const-string v3, "FULLY_QUALIFIED"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->FULLY_QUALIFIED:Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    sget-object v3, Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;->CANONICAL_CLASS_NAME:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;

    .line 17
    .line 18
    const-string v4, "CANONICAL"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->CANONICAL:Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    .line 24
    .line 25
    new-instance v2, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    sget-object v4, Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;->SIMPLE_CLASS_NAME:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;

    .line 29
    .line 30
    const-string v5, "SIMPLE"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->SIMPLE:Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    .line 36
    .line 37
    filled-new-array {v0, v1, v2}, [Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->$VALUES:[Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    .line 42
    .line 43
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->prefixResolver:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->$VALUES:[Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getPrefixResolver()Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->prefixResolver:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;

    .line 2
    .line 3
    return-object p0
.end method
