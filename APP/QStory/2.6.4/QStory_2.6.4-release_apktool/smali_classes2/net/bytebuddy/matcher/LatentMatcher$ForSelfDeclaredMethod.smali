.class public final enum Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/matcher/LatentMatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/matcher/LatentMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ForSelfDeclaredMethod"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;",
        ">;",
        "Lnet/bytebuddy/matcher/LatentMatcher<",
        "Lnet/bytebuddy/description/method/MethodDescription;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;

.field public static final enum DECLARED:Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;

.field public static final enum NOT_DECLARED:Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;


# instance fields
.field private final inverted:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;

    .line 2
    .line 3
    const-string v1, "DECLARED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;-><init>(Ljava/lang/String;IZ)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;->DECLARED:Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;

    .line 12
    .line 13
    const-string v2, "NOT_DECLARED"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;-><init>(Ljava/lang/String;IZ)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;->NOT_DECLARED:Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;->$VALUES:[Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;

    .line 26
    .line 27
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;->inverted:Z

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;->$VALUES:[Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;"
        }
    .end annotation

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/matcher/LatentMatcher$ForSelfDeclaredMethod;->inverted:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lnet/bytebuddy/matcher/ElementMatchers;->isDeclaredBy(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-static {p1}, Lnet/bytebuddy/matcher/ElementMatchers;->isDeclaredBy(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
