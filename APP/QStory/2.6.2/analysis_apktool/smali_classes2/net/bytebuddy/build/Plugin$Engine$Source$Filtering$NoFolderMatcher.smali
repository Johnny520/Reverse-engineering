.class public final enum Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/matcher/ElementMatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "NoFolderMatcher"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;",
        ">;",
        "Lnet/bytebuddy/matcher/ElementMatcher<",
        "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
        ">;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;

.field public static final enum INSTANCE:Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;->INSTANCE:Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;->$VALUES:[Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;

    .line 16
    .line 17
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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;->$VALUES:[Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public bridge synthetic matches(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 20
    check-cast p1, Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    invoke-virtual {p0, p1}, Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering$NoFolderMatcher;->matches(Lnet/bytebuddy/build/Plugin$Engine$Source$Element;)Z

    move-result p0

    return p0
.end method

.method public matches(Lnet/bytebuddy/build/Plugin$Engine$Source$Element;)Z
    .locals 0
    .param p1    # Lnet/bytebuddy/build/Plugin$Engine$Source$Element;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/build/Plugin$Engine$Source$Element;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string p1, "/"

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method
