.class public abstract Lh30;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;


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
    sput-object v0, Lh30;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public static α(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 3

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
    new-instance p0, Lf7;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-direct {p0, v1, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Ls20;

    .line 28
    .line 29
    const/16 v1, 0xd

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ls20;-><init>(I)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ly30;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-direct {v1, p0, v2, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, Ls9;

    .line 41
    .line 42
    const/16 v0, 0x18

    .line 43
    .line 44
    invoke-direct {p0, p2, v0}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    new-instance p2, Ly30;

    .line 48
    .line 49
    invoke-direct {p2, v1, v2, p0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 50
    .line 51
    .line 52
    new-instance p0, Ls20;

    .line 53
    .line 54
    const/16 v0, 0x14

    .line 55
    .line 56
    invoke-direct {p0, v0}, Ls20;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-static {p2, p0}, Lus1;->Γ(Lss1;La80;)Lt52;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iget-object p2, p0, Lt52;->α:Lss1;

    .line 64
    .line 65
    invoke-interface {p2}, Lss1;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    iget-object v0, p0, Lt52;->β:La80;

    .line 76
    .line 77
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    move-object v1, v0

    .line 86
    check-cast v1, Ljava/lang/reflect/Field;

    .line 87
    .line 88
    invoke-static {v1}, Lh30;->θ(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v1, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    const/4 v0, 0x0

    .line 100
    :goto_1
    check-cast v0, Ljava/lang/reflect/Field;

    .line 101
    .line 102
    return-object v0
.end method

.method public static β(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v0, Lkx;->С:Lkx;

    .line 7
    .line 8
    invoke-static {v0, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    sget-object p0, Ljz;->ε:Ljz;

    .line 15
    .line 16
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    move-object v2, v1

    .line 36
    check-cast v2, Ljava/lang/reflect/Method;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    array-length v3, v3

    .line 46
    if-nez v3, :cond_1

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const-string v4, "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8057C9CA539AF329A0030D8C8B05C9AC10C29CF5CAFEBBC86"

    .line 57
    .line 58
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_2

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const-string v3, "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"

    .line 77
    .line 78
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_1

    .line 87
    .line 88
    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_4

    .line 101
    .line 102
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Ljava/lang/reflect/Method;

    .line 107
    .line 108
    const/4 v2, 0x1

    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    return-object v0
.end method

.method public static γ(Ljava/lang/ClassLoader;Lg30;)Ljava/lang/reflect/Field;
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B718B9AE6B1"

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
    iget-object v0, p1, Lg30;->ζ:Ljava/lang/String;

    .line 32
    .line 33
    iget-object p1, p1, Lg30;->η:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p0, v0, p1}, Lh30;->α(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public static δ(Lg30;Ljava/lang/ClassLoader;Z)V
    .locals 4

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v0, p0, Lg30;->ε:Lkx;

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
    iget-object p2, p0, Lg30;->ε:Lkx;

    .line 27
    .line 28
    iget-object v0, p2, Lkx;->ζ:Ljava/lang/String;

    .line 29
    .line 30
    new-instance v2, Lwa;

    .line 31
    .line 32
    const/16 v3, 0xe

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
    invoke-static {p1, p0}, Lh30;->γ(Ljava/lang/ClassLoader;Lg30;)Ljava/lang/reflect/Field;

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

.method public static ε(Ljava/lang/ClassLoader;Z)V
    .locals 6

    .line 1
    invoke-static {p0}, Lh30;->β(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    :try_start_0
    const-string v0, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B718B9AE6B1"

    .line 14
    .line 15
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {v0, v1, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    new-instance v1, Leo1;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object v0, v1

    .line 32
    :goto_0
    instance-of v1, v0, Leo1;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    :cond_1
    check-cast v0, Ljava/lang/Class;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    sget-object v2, Ljz;->ε:Ljz;

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v3, Ls20;

    .line 57
    .line 58
    const/16 v4, 0x11

    .line 59
    .line 60
    invoke-direct {v3, v4}, Ls20;-><init>(I)V

    .line 61
    .line 62
    .line 63
    new-instance v4, Ly30;

    .line 64
    .line 65
    invoke-direct {v4, v0, v1, v3}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Ls20;

    .line 69
    .line 70
    const/16 v3, 0x12

    .line 71
    .line 72
    invoke-direct {v0, v3}, Ls20;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-static {v4, v0}, Lus1;->Γ(Lss1;La80;)Lt52;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    new-instance v4, Lqt;

    .line 80
    .line 81
    invoke-direct {v4, v3}, Lqt;-><init>(I)V

    .line 82
    .line 83
    .line 84
    new-instance v3, Ls20;

    .line 85
    .line 86
    const/16 v5, 0x13

    .line 87
    .line 88
    invoke-direct {v3, v5}, Ls20;-><init>(I)V

    .line 89
    .line 90
    .line 91
    new-instance v5, Lbu;

    .line 92
    .line 93
    invoke-static {v0}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0, v4}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-direct {v5, v0, v3}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_3

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_4

    .line 123
    .line 124
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    goto :goto_2

    .line 129
    :cond_4
    invoke-static {v0}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_5

    .line 138
    .line 139
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    sget-object v3, Lkx;->С:Lkx;

    .line 152
    .line 153
    if-nez v0, :cond_7

    .line 154
    .line 155
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_6

    .line 164
    .line 165
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Ljava/lang/reflect/Method;

    .line 170
    .line 171
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_6
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 176
    .line 177
    invoke-static {v3, v2}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_7
    if-eqz p1, :cond_9

    .line 182
    .line 183
    sget-object p1, Lox;->α:Ljava/lang/Object;

    .line 184
    .line 185
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-nez p1, :cond_8

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_8
    new-instance p1, Lt20;

    .line 195
    .line 196
    const/4 v0, 0x2

    .line 197
    invoke-direct {p1, p0, v0}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 198
    .line 199
    .line 200
    const-string v0, "\u5b9a\u4f4d\u89c6\u9891\u64ad\u653e\u5730\u5740\u6a21\u578b Getter \u65b9\u6cd5"

    .line 201
    .line 202
    invoke-static {v3, p0, v0, p1}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-eqz p1, :cond_9

    .line 215
    .line 216
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    check-cast p1, Ljava/lang/reflect/Method;

    .line 221
    .line 222
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_9
    :goto_5
    return-void
.end method

.method public static ζ(Ljava/lang/reflect/Field;Lg30;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B718B9AE6B1"

    .line 10
    .line 11
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/16 v0, 0x3e8

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    add-int/lit16 v0, v0, 0x12c

    .line 36
    .line 37
    :cond_1
    invoke-static {p0}, Lh30;->θ(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v2, p1, Lg30;->ζ:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p1, p1, Lg30;->η:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    add-int/lit16 v0, v0, 0x1388

    .line 52
    .line 53
    :cond_2
    const-string v1, "java.util.List"

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    const-class v1, Ljava/util/List;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    add-int/lit16 v0, v0, 0x320

    .line 74
    .line 75
    return v0

    .line 76
    :cond_3
    const-string v1, "boolean"

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_5

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 89
    .line 90
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-class v2, Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_5

    .line 107
    .line 108
    :cond_4
    add-int/lit16 v0, v0, 0x320

    .line 109
    .line 110
    return v0

    .line 111
    :cond_5
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-eqz p0, :cond_6

    .line 124
    .line 125
    add-int/lit16 v0, v0, 0x320

    .line 126
    .line 127
    :cond_6
    return v0
.end method

.method public static η(Ljava/lang/reflect/Method;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B718B9AE6B1"

    .line 10
    .line 11
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/16 v0, 0x3e8

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    add-int/lit16 v0, v0, 0x12c

    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    array-length v1, v1

    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    add-int/lit16 v0, v0, 0x12c

    .line 48
    .line 49
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-string v1, "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8057C9CA539AF329A0030D8C8B05C9AC10C29CF5CAFEBBC86"

    .line 58
    .line 59
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    add-int/lit16 v0, v0, 0x258

    .line 70
    .line 71
    return v0

    .line 72
    :cond_3
    const-string v1, "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"

    .line 73
    .line 74
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_4

    .line 83
    .line 84
    add-int/lit16 v0, v0, 0x1f4

    .line 85
    .line 86
    :cond_4
    return v0
.end method

.method public static θ(Ljava/lang/reflect/Field;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lh62;->л([Ljava/lang/Object;)Lτ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lτ;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0}, Lτ;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/annotation/Annotation;

    .line 21
    .line 22
    invoke-static {v0}, Lln0;->Ζ(Ljava/lang/annotation/Annotation;)Lwf;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v2}, Lln0;->Λ(Lwf;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-string v4, "com.google.gson.annotations.SerializedName"

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    :try_start_0
    const-string p0, "value"

    .line 43
    .line 44
    invoke-virtual {v2, p0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    instance-of v0, p0, Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move-object p0, v1

    .line 62
    goto :goto_1

    .line 63
    :goto_0
    new-instance v0, Leo1;

    .line 64
    .line 65
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    move-object p0, v0

    .line 69
    :goto_1
    instance-of v0, p0, Leo1;

    .line 70
    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move-object v1, p0

    .line 75
    :goto_2
    check-cast v1, Ljava/lang/String;

    .line 76
    .line 77
    :cond_3
    return-object v1
.end method
