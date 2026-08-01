.class public final synthetic Lrv0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ltv0;


# direct methods
.method public synthetic constructor <init>(Ltv0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lrv0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lrv0;->ζ:Ltv0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lrv0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lrv0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iget-object p0, p0, Lrv0;->ζ:Ltv0;

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, Lrv0;-><init>(Ltv0;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 20
    .line 21
    .line 22
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    move-object v0, p1

    .line 26
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v4, 0x6

    .line 32
    const/4 v5, 0x0

    .line 33
    const-string v1, "java.util.List"

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lrv0;->ζ:Ltv0;

    .line 41
    .line 42
    iget-object p1, p0, Ltv0;->α:Ljava/lang/String;

    .line 43
    .line 44
    iget-object p0, p0, Ltv0;->β:Ljava/lang/String;

    .line 45
    .line 46
    filled-new-array {p1, p0}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
