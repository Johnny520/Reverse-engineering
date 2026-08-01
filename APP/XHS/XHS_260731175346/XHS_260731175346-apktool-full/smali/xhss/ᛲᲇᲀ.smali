.class public abstract Lxhss/ᛲᲇᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛲ;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "kotlinx.coroutines.fast.service.loader"

    .line 2
    .line 3
    sget v1, Lxhss/ᲀᲀᲈᛱ;->ᛷᛵᛵᲈ:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-object v0, v1

    .line 12
    :goto_0
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    :try_start_1
    new-instance v0, Lxhss/ᲈᲁᲈᛵ;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    filled-new-array {v0}, [Lxhss/ᲈᲁᲈᛵ;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    new-instance v2, Lxhss/ᲈᛱᛱᲀ;

    .line 35
    .line 36
    const/4 v3, 0x3

    .line 37
    invoke-direct {v2, v3, v0}, Lxhss/ᲈᛱᛱᲀ;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Lxhss/ᛸᲀᛶᛳ;

    .line 41
    .line 42
    invoke-direct {v0, v2}, Lxhss/ᛸᲀᛶᛳ;-><init>(Lxhss/ᲈᛱᛱᲀ;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lxhss/ᛷᛴᛲᲇ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛷᛴᲇ;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move-object v2, v1

    .line 72
    check-cast v2, Lxhss/ᲈᲁᲈᛵ;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Lxhss/ᲈᲁᲈᛵ;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_3

    .line 91
    .line 92
    :goto_1
    check-cast v1, Lxhss/ᲈᲁᲈᛵ;

    .line 93
    .line 94
    if-eqz v1, :cond_5

    .line 95
    .line 96
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    new-instance v1, Lxhss/ᛵᛷᲈᛲ;

    .line 103
    .line 104
    invoke-static {v0}, Lxhss/ᛶᛳᛵᛴ;->ᛷᛵᛵᲈ(Landroid/os/Looper;)Landroid/os/Handler;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const/4 v2, 0x0

    .line 109
    invoke-direct {v1, v0, v2}, Lxhss/ᛵᛷᲈᛲ;-><init>(Landroid/os/Handler;Z)V

    .line 110
    .line 111
    .line 112
    sput-object v1, Lxhss/ᛲᲇᲀ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛲ;

    .line 113
    .line 114
    return-void

    .line 115
    :cond_4
    const-string v0, "The main looper is not available"

    .line 116
    .line 117
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_5
    const-string v0, "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. \'kotlinx-coroutines-android\' and ensure it has the same version as \'kotlinx-coroutines-core\'"

    .line 122
    .line 123
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :catchall_0
    move-exception v0

    .line 128
    new-instance v1, Ljava/util/ServiceConfigurationError;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-direct {v1, v2, v0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    throw v1
.end method
