.class public abstract Lnet/bytebuddy/matcher/ElementMatcher$Junction$AbstractBase;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/matcher/ElementMatcher$Junction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/matcher/ElementMatcher$Junction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractBase"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
        "TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:TV;>(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-TU;>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/ElementMatcher$Junction$Conjunction;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v1, v1, [Lnet/bytebuddy/matcher/ElementMatcher;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object p0, v1, v2

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    aput-object p1, v1, p0

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$Conjunction;-><init>([Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:TV;>(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-TU;>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/ElementMatcher$Junction$Disjunction;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v1, v1, [Lnet/bytebuddy/matcher/ElementMatcher;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object p0, v1, v2

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    aput-object p1, v1, p0

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$Disjunction;-><init>([Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
