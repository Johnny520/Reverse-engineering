.class public abstract Ls00;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ls00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ls00;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Ls00;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 21
    .line 22
    return-void
.end method

.method public static α(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-class v0, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-class v0, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public static β(Ljava/lang/Class;Lr00;)Ljava/lang/reflect/Field;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-static {p0, v0}, Llz1;->ι(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {v0, p1}, Ls00;->ε(Ljava/util/AbstractCollection;Lr00;)Ljava/lang/reflect/Field;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static γ(Ljava/lang/ClassLoader;Lr00;)Ljava/lang/reflect/Field;
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    new-instance v0, Leo1;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p0, v0

    .line 20
    :goto_0
    instance-of v0, p0, Leo1;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    move-object p0, v1

    .line 26
    :cond_0
    check-cast p0, Ljava/lang/Class;

    .line 27
    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    invoke-static {p0, p1}, Ls00;->β(Ljava/lang/Class;Lr00;)Ljava/lang/reflect/Field;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static δ(Lr00;Ljava/lang/ClassLoader;Z)V
    .locals 4

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v0, p0, Lr00;->ε:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lox;->ρ(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    if-eqz p2, :cond_2

    .line 17
    .line 18
    sget-object p2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_2

    .line 25
    .line 26
    iget-object p2, p0, Lr00;->ε:Lkx;

    .line 27
    .line 28
    iget-object v0, p2, Lkx;->ζ:Ljava/lang/String;

    .line 29
    .line 30
    new-instance v2, Lwa;

    .line 31
    .line 32
    const/16 v3, 0xa

    .line 33
    .line 34
    invoke-direct {v2, p1, v3, p0}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p2, p1, v0, v2}, Lox;->κ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/lang/reflect/Field;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 44
    .line 45
    .line 46
    :cond_1
    if-eqz p2, :cond_2

    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    invoke-static {p1, p0}, Ls00;->γ(Ljava/lang/ClassLoader;Lr00;)Ljava/lang/reflect/Field;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_3

    .line 54
    .line 55
    invoke-virtual {p0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 56
    .line 57
    .line 58
    :cond_3
    return-void
.end method

.method public static ε(Ljava/util/AbstractCollection;Lr00;)Ljava/lang/reflect/Field;
    .locals 4

    .line 1
    new-instance v0, Lf7;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1, p0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Lq00;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p0, v1}, Lq00;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ly30;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v1, v0, v2, p0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lθ;

    .line 20
    .line 21
    const/16 v0, 0xe

    .line 22
    .line 23
    invoke-direct {p0, v0, p1}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, Lt52;

    .line 27
    .line 28
    invoke-direct {p1, v1, p0}, Lt52;-><init>(Lss1;La80;)V

    .line 29
    .line 30
    .line 31
    new-instance p0, Lqt;

    .line 32
    .line 33
    const/16 v0, 0xa

    .line 34
    .line 35
    invoke-direct {p0, v0}, Lqt;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1, p0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_0

    .line 54
    .line 55
    sget-object p0, Ljz;->ε:Ljz;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    invoke-static {p1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-static {p1}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    move-object p0, p1

    .line 92
    :goto_1
    invoke-static {p0}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Ll91;

    .line 97
    .line 98
    if-nez p1, :cond_3

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    iget-object v0, p1, Ll91;->ζ:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    const/16 v3, 0xbb8

    .line 110
    .line 111
    if-ge v1, v3, :cond_4

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    invoke-static {v2, p0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, Ll91;

    .line 119
    .line 120
    if-eqz p0, :cond_5

    .line 121
    .line 122
    iget-object p0, p0, Ll91;->ζ:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p0, Ljava/lang/Number;

    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-ne p0, v0, :cond_5

    .line 135
    .line 136
    :goto_2
    const/4 p0, 0x0

    .line 137
    return-object p0

    .line 138
    :cond_5
    iget-object p0, p1, Ll91;->ε:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p0, Ljava/lang/reflect/Field;

    .line 141
    .line 142
    invoke-virtual {p0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 143
    .line 144
    .line 145
    return-object p0
.end method
