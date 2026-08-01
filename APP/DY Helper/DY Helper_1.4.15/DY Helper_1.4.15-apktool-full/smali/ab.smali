.class public final synthetic Lab;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/String;

.field public final synthetic η:Ljava/lang/String;

.field public final synthetic θ:Ljava/util/List;

.field public final synthetic ι:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)V
    .locals 0

    .line 1
    iput p5, p0, Lab;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lab;->ζ:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lab;->η:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lab;->θ:Ljava/util/List;

    .line 8
    .line 9
    iput-object p4, p0, Lab;->ι:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lab;->ε:I

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
    iget-object v2, p0, Lab;->ζ:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v5, 0x6

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    iget-object v2, p0, Lab;->η:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const/4 v5, 0x6

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 44
    .line 45
    .line 46
    :goto_1
    iget-object p1, p0, Lab;->θ:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v2, 0x0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    new-array v0, v2, [Ljava/lang/String;

    .line 56
    .line 57
    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, [Ljava/lang/String;

    .line 62
    .line 63
    array-length v0, p1

    .line 64
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, [Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 71
    .line 72
    .line 73
    :cond_3
    iget-object p0, p0, Lab;->ι:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_4

    .line 80
    .line 81
    new-array p1, v2, [Ljava/lang/String;

    .line 82
    .line 83
    invoke-interface {p0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, [Ljava/lang/String;

    .line 88
    .line 89
    array-length p1, p0

    .line 90
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, [Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 97
    .line 98
    .line 99
    :cond_4
    sget-object p0, Ls62;->α:Ls62;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_0
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    new-instance v0, Lab;

    .line 108
    .line 109
    const/4 v5, 0x1

    .line 110
    iget-object v1, p0, Lab;->ζ:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v2, p0, Lab;->η:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v3, p0, Lab;->θ:Ljava/util/List;

    .line 115
    .line 116
    iget-object v4, p0, Lab;->ι:Ljava/util/List;

    .line 117
    .line 118
    invoke-direct/range {v0 .. v5}, Lab;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 122
    .line 123
    .line 124
    sget-object p0, Ls62;->α:Ls62;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
