.class public final Lxv0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lxv0;

.field public static final β:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxv0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxv0;->α:Lxv0;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lxv0;->β:Ljava/util/ArrayList;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final declared-synchronized α(Lmv0;Lqv0;)Ljava/util/List;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lxv0;->β:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-static {v0}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lθ;

    .line 9
    .line 10
    const/16 v2, 0x18

    .line 11
    .line 12
    invoke-direct {v1, v2, p1}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Ly30;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-direct {p1, v0, v2, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lwv0;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p2, v1}, Lwv0;-><init>(Lqv0;I)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Ly30;

    .line 28
    .line 29
    invoke-direct {v1, p1, v2, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Lwv0;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-direct {p1, p2, v0}, Lwv0;-><init>(Lqv0;I)V

    .line 36
    .line 37
    .line 38
    new-instance p2, Ly30;

    .line 39
    .line 40
    invoke-direct {p2, v1, v2, p1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Luh0;

    .line 44
    .line 45
    const/16 v0, 0xe

    .line 46
    .line 47
    invoke-direct {p1, v0}, Luh0;-><init>(I)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Lye;

    .line 51
    .line 52
    const/16 v1, 0x1b

    .line 53
    .line 54
    invoke-direct {v0, v1, p1}, Lye;-><init>(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p2}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1, v0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-nez p2, :cond_0

    .line 73
    .line 74
    sget-object p1, Ljz;->ε:Ljz;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_1

    .line 86
    .line 87
    invoke-static {p2}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    goto :goto_1

    .line 92
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-eqz p2, :cond_2

    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    move-object p1, v0

    .line 115
    :goto_1
    monitor-exit p0

    .line 116
    return-object p1

    .line 117
    :catchall_0
    move-exception p1

    .line 118
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    throw p1
.end method

.method public final declared-synchronized β(Lnv0;)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lxv0;->β:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lnv0;

    .line 20
    .line 21
    iget-object v2, v2, Lnv0;->α:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v3, p1, Lnv0;->α:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_3

    .line 37
    :cond_1
    const/4 v1, -0x1

    .line 38
    :goto_1
    const/4 v0, 0x4

    .line 39
    const/4 v2, 0x0

    .line 40
    if-ltz v1, :cond_2

    .line 41
    .line 42
    sget-object v3, Lxv0;->β:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v3, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    const-string v1, "r261e4968bb6c4671"

    .line 48
    .line 49
    iget-object v3, p1, Lnv0;->α:Ljava/lang/String;

    .line 50
    .line 51
    iget-object p1, p1, Lnv0;->β:Ljava/lang/String;

    .line 52
    .line 53
    new-instance v4, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v5, "replace action id="

    .line 59
    .line 60
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v3, ", title="

    .line 67
    .line 68
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {v1, p1, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    sget-object v1, Lxv0;->β:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    const-string v1, "r261e4968bb6c4671"

    .line 88
    .line 89
    iget-object v3, p1, Lnv0;->α:Ljava/lang/String;

    .line 90
    .line 91
    iget-object p1, p1, Lnv0;->β:Ljava/lang/String;

    .line 92
    .line 93
    new-instance v4, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v5, "register action id="

    .line 99
    .line 100
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v3, ", title="

    .line 107
    .line 108
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {v1, p1, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    .line 121
    :goto_2
    monitor-exit p0

    .line 122
    return-void

    .line 123
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    throw p1
.end method
