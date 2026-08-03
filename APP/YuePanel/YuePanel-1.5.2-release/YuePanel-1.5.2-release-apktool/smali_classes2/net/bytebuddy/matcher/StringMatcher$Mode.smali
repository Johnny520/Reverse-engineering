.class public abstract enum Lnet/bytebuddy/matcher/StringMatcher$Mode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/matcher/StringMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Mode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/matcher/StringMatcher$Mode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum CONTAINS:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum CONTAINS_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum ENDS_WITH:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum ENDS_WITH_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum EQUALS_FULLY:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum EQUALS_FULLY_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum MATCHES:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum STARTS_WITH:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum STARTS_WITH_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;


# instance fields
.field private final description:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lnet/bytebuddy/matcher/StringMatcher$Mode$1;

    const/4 v1, 0x0

    const-string v2, "equals"

    const-string v3, "EQUALS_FULLY"

    invoke-direct {v0, v3, v1, v2}, Lnet/bytebuddy/matcher/StringMatcher$Mode$1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lnet/bytebuddy/matcher/StringMatcher$Mode;->EQUALS_FULLY:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    new-instance v2, Lnet/bytebuddy/matcher/StringMatcher$Mode$2;

    const/4 v3, 0x1

    const-string v4, "equalsIgnoreCase"

    const-string v5, "EQUALS_FULLY_IGNORE_CASE"

    invoke-direct {v2, v5, v3, v4}, Lnet/bytebuddy/matcher/StringMatcher$Mode$2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lnet/bytebuddy/matcher/StringMatcher$Mode;->EQUALS_FULLY_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    new-instance v4, Lnet/bytebuddy/matcher/StringMatcher$Mode$3;

    const/4 v5, 0x2

    const-string v6, "startsWith"

    const-string v7, "STARTS_WITH"

    invoke-direct {v4, v7, v5, v6}, Lnet/bytebuddy/matcher/StringMatcher$Mode$3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lnet/bytebuddy/matcher/StringMatcher$Mode;->STARTS_WITH:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    new-instance v6, Lnet/bytebuddy/matcher/StringMatcher$Mode$4;

    const/4 v7, 0x3

    const-string v8, "startsWithIgnoreCase"

    const-string v9, "STARTS_WITH_IGNORE_CASE"

    invoke-direct {v6, v9, v7, v8}, Lnet/bytebuddy/matcher/StringMatcher$Mode$4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lnet/bytebuddy/matcher/StringMatcher$Mode;->STARTS_WITH_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    new-instance v8, Lnet/bytebuddy/matcher/StringMatcher$Mode$5;

    const/4 v9, 0x4

    const-string v10, "endsWith"

    const-string v11, "ENDS_WITH"

    invoke-direct {v8, v11, v9, v10}, Lnet/bytebuddy/matcher/StringMatcher$Mode$5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lnet/bytebuddy/matcher/StringMatcher$Mode;->ENDS_WITH:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    new-instance v10, Lnet/bytebuddy/matcher/StringMatcher$Mode$6;

    const/4 v11, 0x5

    const-string v12, "endsWithIgnoreCase"

    const-string v13, "ENDS_WITH_IGNORE_CASE"

    invoke-direct {v10, v13, v11, v12}, Lnet/bytebuddy/matcher/StringMatcher$Mode$6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lnet/bytebuddy/matcher/StringMatcher$Mode;->ENDS_WITH_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    new-instance v12, Lnet/bytebuddy/matcher/StringMatcher$Mode$7;

    const/4 v13, 0x6

    const-string v14, "contains"

    const-string v15, "CONTAINS"

    invoke-direct {v12, v15, v13, v14}, Lnet/bytebuddy/matcher/StringMatcher$Mode$7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lnet/bytebuddy/matcher/StringMatcher$Mode;->CONTAINS:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    new-instance v14, Lnet/bytebuddy/matcher/StringMatcher$Mode$8;

    const/4 v15, 0x7

    const-string v13, "containsIgnoreCase"

    const-string v11, "CONTAINS_IGNORE_CASE"

    invoke-direct {v14, v11, v15, v13}, Lnet/bytebuddy/matcher/StringMatcher$Mode$8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v14, Lnet/bytebuddy/matcher/StringMatcher$Mode;->CONTAINS_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    new-instance v11, Lnet/bytebuddy/matcher/StringMatcher$Mode$9;

    const/16 v13, 0x8

    const-string v15, "matches"

    const-string v9, "MATCHES"

    invoke-direct {v11, v9, v13, v15}, Lnet/bytebuddy/matcher/StringMatcher$Mode$9;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lnet/bytebuddy/matcher/StringMatcher$Mode;->MATCHES:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    const/16 v9, 0x9

    new-array v9, v9, [Lnet/bytebuddy/matcher/StringMatcher$Mode;

    aput-object v0, v9, v1

    aput-object v2, v9, v3

    aput-object v4, v9, v5

    aput-object v6, v9, v7

    const/4 v0, 0x4

    aput-object v8, v9, v0

    const/4 v0, 0x5

    aput-object v10, v9, v0

    const/4 v0, 0x6

    aput-object v12, v9, v0

    const/4 v0, 0x7

    aput-object v14, v9, v0

    aput-object v11, v9, v13

    sput-object v9, Lnet/bytebuddy/matcher/StringMatcher$Mode;->$VALUES:[Lnet/bytebuddy/matcher/StringMatcher$Mode;

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

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput-object p3, p0, Lnet/bytebuddy/matcher/StringMatcher$Mode;->description:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Lnet/bytebuddy/matcher/StringMatcher$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/matcher/StringMatcher$Mode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/matcher/StringMatcher$Mode;
    .locals 1

    const-class v0, Lnet/bytebuddy/matcher/StringMatcher$Mode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/matcher/StringMatcher$Mode;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/matcher/StringMatcher$Mode;
    .locals 1

    sget-object v0, Lnet/bytebuddy/matcher/StringMatcher$Mode;->$VALUES:[Lnet/bytebuddy/matcher/StringMatcher$Mode;

    invoke-virtual {v0}, [Lnet/bytebuddy/matcher/StringMatcher$Mode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/matcher/StringMatcher$Mode;

    return-object v0
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/matcher/StringMatcher$Mode;->description:Ljava/lang/String;

    return-object v0
.end method

.method public abstract matches(Ljava/lang/String;Ljava/lang/String;)Z
.end method
