.class final enum Lnet/bytebuddy/matcher/MethodSortMatcher$Sort$4;
.super Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;-><init>(Ljava/lang/String;ILjava/lang/String;Lnet/bytebuddy/matcher/MethodSortMatcher$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public isSort(Lnet/bytebuddy/description/method/MethodDescription;)Z
    .locals 0

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->isVirtual()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
