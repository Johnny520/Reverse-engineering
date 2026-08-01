.class public Lnet/bytebuddy/matcher/BooleanMatcher;
.super Lnet/bytebuddy/matcher/ElementMatcher$Junction$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lnet/bytebuddy/matcher/ElementMatcher$Junction$AbstractBase<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final FALSE:Lnet/bytebuddy/matcher/BooleanMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/BooleanMatcher<",
            "*>;"
        }
    .end annotation
.end field

.field private static final TRUE:Lnet/bytebuddy/matcher/BooleanMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/BooleanMatcher<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field protected final matches:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/BooleanMatcher;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/BooleanMatcher;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lnet/bytebuddy/matcher/BooleanMatcher;->TRUE:Lnet/bytebuddy/matcher/BooleanMatcher;

    .line 8
    .line 9
    new-instance v0, Lnet/bytebuddy/matcher/BooleanMatcher;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/BooleanMatcher;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lnet/bytebuddy/matcher/BooleanMatcher;->FALSE:Lnet/bytebuddy/matcher/BooleanMatcher;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lnet/bytebuddy/matcher/BooleanMatcher;->matches:Z

    .line 5
    .line 6
    return-void
.end method

.method public static of(Z)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(Z)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lnet/bytebuddy/matcher/BooleanMatcher;->TRUE:Lnet/bytebuddy/matcher/BooleanMatcher;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object p0, Lnet/bytebuddy/matcher/BooleanMatcher;->FALSE:Lnet/bytebuddy/matcher/BooleanMatcher;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-boolean p0, p0, Lnet/bytebuddy/matcher/BooleanMatcher;->matches:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/matcher/BooleanMatcher;

    .line 23
    .line 24
    iget-boolean p1, p1, Lnet/bytebuddy/matcher/BooleanMatcher;->matches:Z

    .line 25
    .line 26
    if-eq p0, p1, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-boolean p0, p0, Lnet/bytebuddy/matcher/BooleanMatcher;->matches:Z

    .line 12
    .line 13
    add-int/2addr v0, p0

    .line 14
    return v0
.end method

.method public matches(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/matcher/BooleanMatcher;->matches:Z

    .line 2
    .line 3
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/matcher/BooleanMatcher;->matches:Z

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
