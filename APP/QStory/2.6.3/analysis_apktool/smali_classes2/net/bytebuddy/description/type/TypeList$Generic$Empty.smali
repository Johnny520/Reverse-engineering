.class public Lnet/bytebuddy/description/type/TypeList$Generic$Empty;
.super Lnet/bytebuddy/matcher/FilterableList$Empty;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/description/type/TypeList$Generic;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeList$Generic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Empty"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/matcher/FilterableList$Empty<",
        "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
        "Lnet/bytebuddy/description/type/TypeList$Generic;",
        ">;",
        "Lnet/bytebuddy/description/type/TypeList$Generic;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/matcher/FilterableList$Empty;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/description/type/TypeList$Generic;"
        }
    .end annotation

    .line 1
    new-instance p0, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public asErasures()Lnet/bytebuddy/description/type/TypeList;
    .locals 0

    .line 1
    new-instance p0, Lnet/bytebuddy/description/type/TypeList$Empty;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeList$Empty;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public asRawTypes()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 0

    .line 1
    return-object p0
.end method

.method public asTokenList(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList<",
            "Lnet/bytebuddy/description/type/TypeVariableToken;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    new-array p1, p1, [Lnet/bytebuddy/description/type/TypeVariableToken;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;-><init>([Lnet/bytebuddy/description/ByteCodeElement$Token;)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public getStackSize()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
