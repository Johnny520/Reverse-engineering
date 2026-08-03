.class public final enum Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;
.super Ljava/lang/Enum;
.source "SourceFile"


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

    new-instance v0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    const/4 v1, 0x0

    sget-object v2, Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;->FULLY_QUALIFIED_CLASS_NAME:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;

    const-string v3, "FULLY_QUALIFIED"

    invoke-direct {v0, v3, v1, v2}, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;)V

    sput-object v0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->FULLY_QUALIFIED:Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    new-instance v1, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    const/4 v2, 0x1

    sget-object v3, Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;->CANONICAL_CLASS_NAME:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;

    const-string v4, "CANONICAL"

    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;)V

    sput-object v1, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->CANONICAL:Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    new-instance v2, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    const/4 v3, 0x2

    sget-object v4, Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;->SIMPLE_CLASS_NAME:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;

    const-string v5, "SIMPLE"

    invoke-direct {v2, v5, v3, v4}, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;)V

    sput-object v2, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->SIMPLE:Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    filled-new-array {v0, v1, v2}, [Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->$VALUES:[Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

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

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->prefixResolver:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;
    .locals 1

    const-class v0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;
    .locals 1

    sget-object v0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->$VALUES:[Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    invoke-virtual {v0}, [Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;

    return-object v0
.end method


# virtual methods
.method public getPrefixResolver()Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/build/ToStringPlugin$Enhance$Prefix;->prefixResolver:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;

    return-object v0
.end method
