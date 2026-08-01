.class public final synthetic Lth1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/String;

.field public final synthetic η:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;[Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lth1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lth1;->ζ:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lth1;->η:[Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lth1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lth1;->ζ:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setName(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "void"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setReturnType(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lth1;->η:[Ljava/lang/String;

    .line 22
    .line 23
    array-length v0, p0

    .line 24
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, [Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 31
    .line 32
    .line 33
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v0, Lth1;

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    iget-object v2, p0, Lth1;->ζ:Ljava/lang/String;

    .line 45
    .line 46
    iget-object p0, p0, Lth1;->η:[Ljava/lang/String;

    .line 47
    .line 48
    invoke-direct {v0, v2, p0, v1}, Lth1;-><init>(Ljava/lang/String;[Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
