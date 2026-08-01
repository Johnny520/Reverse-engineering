.class public final synthetic Lzl;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lf80;


# instance fields
.field public final synthetic ε:Lnv0;

.field public final synthetic ζ:Ljava/lang/Class;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lnv0;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzl;->ε:Lnv0;

    .line 5
    .line 6
    iput-object p2, p0, Lzl;->ζ:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lzl;->η:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lzl;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p2, Ljava/lang/reflect/Method;

    .line 2
    .line 3
    check-cast p3, [Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcm;->α:Ljava/util/Set;

    .line 12
    .line 13
    invoke-static {p1, p2, p3}, Lcm;->ζ(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    if-nez p3, :cond_1

    .line 22
    .line 23
    new-array v0, p1, [Ljava/lang/Object;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v0, p3

    .line 27
    :goto_0
    invoke-static {p2}, Lcm;->θ(Ljava/lang/reflect/Method;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget-object v2, p0, Lzl;->θ:Ljava/lang/Object;

    .line 32
    .line 33
    if-eqz v1, :cond_6

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    if-eqz p3, :cond_2

    .line 37
    .line 38
    invoke-static {v1, p3}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    if-eqz p3, :cond_2

    .line 43
    .line 44
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const/4 p3, 0x0

    .line 50
    :goto_1
    if-nez p3, :cond_3

    .line 51
    .line 52
    const-string p3, ""

    .line 53
    .line 54
    :cond_3
    iget-object v3, p0, Lzl;->ε:Lnv0;

    .line 55
    .line 56
    iget-object v4, v3, Lnv0;->α:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    if-eqz p3, :cond_5

    .line 63
    .line 64
    iget-object p2, p0, Lzl;->ζ:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    if-nez p3, :cond_4

    .line 71
    .line 72
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    :cond_4
    new-instance v0, Lxs0;

    .line 80
    .line 81
    iget-object p0, p0, Lzl;->η:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-direct {v0, p0, v3, p2, v1}, Lxs0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 84
    .line 85
    .line 86
    filled-new-array {p2}, [Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    new-instance p2, Lvv0;

    .line 91
    .line 92
    invoke-direct {p2, v0, p1}, Lvv0;-><init>(Lm80;I)V

    .line 93
    .line 94
    .line 95
    invoke-static {p3, p0, p2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_5
    invoke-static {v2, p2, v0}, Lcm;->η(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :cond_6
    invoke-static {v2, p2, v0}, Lcm;->η(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    if-nez p0, :cond_7

    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-static {p0}, Lcm;->ε(Ljava/lang/Class;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    :cond_7
    return-object p0
.end method
