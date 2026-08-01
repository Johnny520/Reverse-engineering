.class public abstract enum Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/matcher/MethodSortMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Sort"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

.field public static final enum CONSTRUCTOR:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

.field public static final enum DEFAULT_METHOD:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

.field public static final enum METHOD:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

.field public static final enum TYPE_INITIALIZER:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

.field public static final enum VIRTUAL:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;


# instance fields
.field private final description:Ljava/lang/String;

.field private final matcher:Lnet/bytebuddy/matcher/MethodSortMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/MethodSortMatcher<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort$1;

    .line 2
    .line 3
    const-string v1, "isMethod()"

    .line 4
    .line 5
    const-string v2, "METHOD"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort$1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->METHOD:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort$2;

    .line 14
    .line 15
    const-string v2, "isConstructor()"

    .line 16
    .line 17
    const-string v4, "CONSTRUCTOR"

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v4, v5, v2}, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort$2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->CONSTRUCTOR:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 24
    .line 25
    new-instance v2, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort$3;

    .line 26
    .line 27
    const-string v4, "isTypeInitializer()"

    .line 28
    .line 29
    const-string v6, "TYPE_INITIALIZER"

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    invoke-direct {v2, v6, v7, v4}, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort$3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->TYPE_INITIALIZER:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 36
    .line 37
    new-instance v4, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort$4;

    .line 38
    .line 39
    const-string v6, "isVirtual()"

    .line 40
    .line 41
    const-string v8, "VIRTUAL"

    .line 42
    .line 43
    const/4 v9, 0x3

    .line 44
    invoke-direct {v4, v8, v9, v6}, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort$4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v4, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->VIRTUAL:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 48
    .line 49
    new-instance v6, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort$5;

    .line 50
    .line 51
    const-string v8, "isDefaultMethod()"

    .line 52
    .line 53
    const-string v10, "DEFAULT_METHOD"

    .line 54
    .line 55
    const/4 v11, 0x4

    .line 56
    invoke-direct {v6, v10, v11, v8}, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort$5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v6, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->DEFAULT_METHOD:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 60
    .line 61
    const/4 v8, 0x5

    .line 62
    new-array v8, v8, [Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 63
    .line 64
    aput-object v0, v8, v3

    .line 65
    .line 66
    aput-object v1, v8, v5

    .line 67
    .line 68
    aput-object v2, v8, v7

    .line 69
    .line 70
    aput-object v4, v8, v9

    .line 71
    .line 72
    aput-object v6, v8, v11

    .line 73
    .line 74
    sput-object v8, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->$VALUES:[Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 75
    .line 76
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
    iput-object p3, p0, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->description:Ljava/lang/String;

    .line 5
    .line 6
    new-instance p1, Lnet/bytebuddy/matcher/MethodSortMatcher;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lnet/bytebuddy/matcher/MethodSortMatcher;-><init>(Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->matcher:Lnet/bytebuddy/matcher/MethodSortMatcher;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Lnet/bytebuddy/matcher/MethodSortMatcher$1;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->$VALUES:[Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMatcher()Lnet/bytebuddy/matcher/MethodSortMatcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/matcher/MethodSortMatcher<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->matcher:Lnet/bytebuddy/matcher/MethodSortMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract isSort(Lnet/bytebuddy/description/method/MethodDescription;)Z
.end method
