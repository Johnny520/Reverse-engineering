.class public final synthetic Lm81;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 1
    iput p1, p0, Lm81;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lm81;->ζ:Ljava/util/List;

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
    .locals 7

    .line 1
    iget v0, p0, Lm81;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x6

    .line 13
    const/4 v6, 0x0

    .line 14
    const-string v2, "java.lang.String"

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 19
    .line 20
    .line 21
    sget-object p1, Lki1;->β:Ljava/util/List;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    new-array v2, v0, [Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {p1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, [Ljava/lang/String;

    .line 31
    .line 32
    array-length v2, p1

    .line 33
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, [Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 40
    .line 41
    .line 42
    new-array p1, v0, [Ljava/lang/String;

    .line 43
    .line 44
    iget-object p0, p0, Lm81;->ζ:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {p0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, [Ljava/lang/String;

    .line 51
    .line 52
    array-length p1, p0

    .line 53
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, [Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 60
    .line 61
    .line 62
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_0
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance v0, Lm81;

    .line 71
    .line 72
    const/4 v1, 0x3

    .line 73
    iget-object p0, p0, Lm81;->ζ:Ljava/util/List;

    .line 74
    .line 75
    invoke-direct {v0, v1, p0}, Lm81;-><init>(ILjava/util/List;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :pswitch_1
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    const-string v0, "void"

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setReturnType(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const-string v0, "~79285FCA4BF93B20DAE3F7561F6F9778B9C5EA825069EB9A10DE90A4B36D7D429A65E398626709F07A2B641B8F22F3"

    .line 93
    .line 94
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v1, "android.content.Context"

    .line 99
    .line 100
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setParamTypes(Ljava/util/Collection;)V

    .line 109
    .line 110
    .line 111
    iget-object p0, p0, Lm81;->ζ:Ljava/util/List;

    .line 112
    .line 113
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setUsingStrings(Ljava/util/Collection;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :pswitch_2
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v0, Lm81;

    .line 123
    .line 124
    const/4 v1, 0x1

    .line 125
    iget-object p0, p0, Lm81;->ζ:Ljava/util/List;

    .line 126
    .line 127
    invoke-direct {v0, v1, p0}, Lm81;-><init>(ILjava/util/List;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
