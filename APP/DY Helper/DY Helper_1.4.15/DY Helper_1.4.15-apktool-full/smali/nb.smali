.class public final synthetic Lnb;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/reflect/Method;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/reflect/Method;)V
    .locals 0

    .line 1
    iput p1, p0, Lnb;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lnb;->ζ:Ljava/lang/reflect/Method;

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
    iget v0, p0, Lnb;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/reflect/Method;

    .line 7
    .line 8
    iget-object p0, p0, Lnb;->ζ:Ljava/lang/reflect/Method;

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p1, p0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 p0, 0x0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 44
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_0
    move-object v0, p1

    .line 50
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Lnb;->ζ:Ljava/lang/reflect/Method;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    const/4 v4, 0x6

    .line 65
    const/4 v5, 0x0

    .line 66
    const/4 v2, 0x0

    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 69
    .line 70
    .line 71
    const-string v1, "void"

    .line 72
    .line 73
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance p1, Ljava/util/ArrayList;

    .line 84
    .line 85
    array-length v1, p0

    .line 86
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    .line 88
    .line 89
    array-length v1, p0

    .line 90
    const/4 v2, 0x0

    .line 91
    move v3, v2

    .line 92
    :goto_2
    if-ge v3, v1, :cond_2

    .line 93
    .line 94
    aget-object v4, p0, v3

    .line 95
    .line 96
    const/4 v5, 0x1

    .line 97
    invoke-static {v4, p1, v3, v5}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    goto :goto_2

    .line 102
    :cond_2
    new-array p0, v2, [Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, [Ljava/lang/String;

    .line 109
    .line 110
    array-length p1, p0

    .line 111
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, [Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 118
    .line 119
    .line 120
    sget-object p0, Ls62;->α:Ls62;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_1
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    new-instance v0, Lnb;

    .line 129
    .line 130
    const/4 v1, 0x2

    .line 131
    iget-object p0, p0, Lnb;->ζ:Ljava/lang/reflect/Method;

    .line 132
    .line 133
    invoke-direct {v0, v1, p0}, Lnb;-><init>(ILjava/lang/reflect/Method;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 137
    .line 138
    .line 139
    sget-object p0, Ls62;->α:Ls62;

    .line 140
    .line 141
    return-object p0

    .line 142
    :pswitch_2
    check-cast p1, Ljava/lang/reflect/Method;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    iget-object p0, p0, Lnb;->ζ:Ljava/lang/reflect/Method;

    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
