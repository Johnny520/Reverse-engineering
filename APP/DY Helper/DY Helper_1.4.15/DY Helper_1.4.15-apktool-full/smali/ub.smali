.class public final synthetic Lub;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/String;

.field public final synthetic η:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lub;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lub;->ζ:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lub;->η:Ljava/lang/String;

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
    .locals 6

    .line 1
    iget v0, p0, Lub;->ε:I

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
    new-instance v0, Lub;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    iget-object v2, p0, Lub;->ζ:Ljava/lang/String;

    .line 15
    .line 16
    iget-object p0, p0, Lub;->η:Ljava/lang/String;

    .line 17
    .line 18
    invoke-direct {v0, v1, v2, p0}, Lub;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 22
    .line 23
    .line 24
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    move-object v0, p1

    .line 28
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x6

    .line 34
    const/4 v5, 0x0

    .line 35
    iget-object v1, p0, Lub;->ζ:Ljava/lang/String;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lub;->η:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_1
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v0, Lub;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    iget-object v2, p0, Lub;->ζ:Ljava/lang/String;

    .line 57
    .line 58
    iget-object p0, p0, Lub;->η:Ljava/lang/String;

    .line 59
    .line 60
    invoke-direct {v0, v1, v2, p0}, Lub;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :pswitch_2
    move-object v0, p1

    .line 68
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lub;->ζ:Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_0

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_0
    const/4 v4, 0x6

    .line 85
    const/4 v5, 0x0

    .line 86
    const/4 v2, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 89
    .line 90
    .line 91
    :cond_1
    :goto_1
    iget-object v1, p0, Lub;->η:Ljava/lang/String;

    .line 92
    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eqz p0, :cond_2

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    const/4 v4, 0x6

    .line 103
    const/4 v5, 0x0

    .line 104
    const/4 v2, 0x0

    .line 105
    const/4 v3, 0x0

    .line 106
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 107
    .line 108
    .line 109
    :cond_3
    :goto_2
    const/4 p0, 0x0

    .line 110
    new-array p0, p0, [Ljava/lang/String;

    .line 111
    .line 112
    sget-object p1, Ljz;->ε:Ljz;

    .line 113
    .line 114
    invoke-static {p1, p0}, Ls1;->Ε(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, [Ljava/lang/String;

    .line 119
    .line 120
    array-length p1, p0

    .line 121
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, [Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
