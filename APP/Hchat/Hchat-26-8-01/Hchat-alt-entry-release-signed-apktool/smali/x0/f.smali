.class public final Lx0/f;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Lx0/a;


# direct methods
.method public constructor <init>(Lx0/a;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx0/f;->g:Lx0/a;

    .line 5
    .line 6
    iget-boolean v0, p1, Lx0/a;->b:Z

    .line 7
    .line 8
    if-nez v0, :cond_8

    .line 9
    .line 10
    const/16 v0, 0x9

    .line 11
    .line 12
    new-array v1, v0, [I

    .line 13
    .line 14
    fill-array-data v1, :array_0

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, Lx0/a;->a:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    move v5, v4

    .line 30
    :goto_0
    const/4 v6, 0x1

    .line 31
    if-ge v5, v2, :cond_6

    .line 32
    .line 33
    add-int/lit8 v7, v5, 0x1

    .line 34
    .line 35
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    check-cast v8, Lx0/b;

    .line 40
    .line 41
    iget v9, v8, Lx0/b;->a:I

    .line 42
    .line 43
    move v10, v4

    .line 44
    :goto_1
    if-ge v10, v0, :cond_1

    .line 45
    .line 46
    aget v11, v1, v10

    .line 47
    .line 48
    if-ne v9, v11, :cond_0

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_0
    add-int/lit8 v10, v10, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/4 v10, -0x1

    .line 55
    :goto_2
    if-ltz v10, :cond_2

    .line 56
    .line 57
    move v9, v6

    .line 58
    goto :goto_3

    .line 59
    :cond_2
    move v9, v4

    .line 60
    :goto_3
    if-nez v9, :cond_5

    .line 61
    .line 62
    iget v9, v8, Lx0/b;->a:I

    .line 63
    .line 64
    const/16 v10, 0x64

    .line 65
    .line 66
    if-ne v9, v10, :cond_4

    .line 67
    .line 68
    add-int/lit8 v5, v5, 0x2

    .line 69
    .line 70
    if-ge v5, v2, :cond_3

    .line 71
    .line 72
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Lx0/b;

    .line 77
    .line 78
    iget v5, v5, Lx0/b;->a:I

    .line 79
    .line 80
    const/16 v8, 0x3e8

    .line 81
    .line 82
    if-ne v5, v8, :cond_3

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_3
    invoke-static {v3}, Ltf/r;->j1(Ljava/util/AbstractList;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_4
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    :cond_5
    :goto_4
    move v5, v7

    .line 93
    goto :goto_0

    .line 94
    :cond_6
    :goto_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    new-array v0, p1, [Ljava/lang/StackTraceElement;

    .line 99
    .line 100
    :goto_6
    if-ge v4, p1, :cond_7

    .line 101
    .line 102
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Lx0/b;

    .line 107
    .line 108
    new-instance v2, Ljava/lang/StackTraceElement;

    .line 109
    .line 110
    new-instance v5, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v7, "m$"

    .line 113
    .line 114
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget v1, v1, Lx0/b;->a:I

    .line 118
    .line 119
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    const-string v5, "SourceFile"

    .line 127
    .line 128
    const-string v7, "$$compose"

    .line 129
    .line 130
    invoke-direct {v2, v7, v1, v5, v6}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 131
    .line 132
    .line 133
    aput-object v2, v0, v4

    .line 134
    .line 135
    add-int/lit8 v4, v4, 0x1

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_7
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 139
    .line 140
    .line 141
    :cond_8
    return-void

    .line 142
    nop

    .line 143
    :array_0
    .array-data 4
        0xc9
        0xca
        0xcc
        0xce
        0xcf
        0x7d
        -0x7f
        0x78cc281
        0xc8
    .end array-data
.end method


# virtual methods
.method public final fillInStackTrace()Ljava/lang/Throwable;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/StackTraceElement;

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lx0/f;->g:Lx0/a;

    .line 2
    .line 3
    iget-boolean v1, v0, Lx0/a;->b:Z

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "Composition stack when thrown:\n"

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, La/a;->E()Luf/c;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v0, v0, Lx0/a;->a:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v3, Log/g;

    .line 24
    .line 25
    invoke-direct {v3, v0}, Log/g;-><init>(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v4, 0x0

    .line 33
    move v5, v4

    .line 34
    :goto_0
    if-ge v5, v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v3, v5}, Log/g;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    check-cast v6, Lx0/b;

    .line 41
    .line 42
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    add-int/lit8 v5, v5, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {v2}, La/a;->t(Luf/c;)Luf/c;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v2, Log/g;

    .line 56
    .line 57
    invoke-direct {v2, v0}, Log/g;-><init>(Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    :goto_1
    if-ge v4, v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {v2, v4}, Log/g;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Ljava/lang/String;

    .line 71
    .line 72
    const-string v5, "\tat "

    .line 73
    .line 74
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const/16 v3, 0xa

    .line 81
    .line 82
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    add-int/lit8 v4, v4, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0

    .line 93
    :cond_2
    const-string v0, "Composition stack when thrown:"

    .line 94
    .line 95
    return-object v0
.end method
