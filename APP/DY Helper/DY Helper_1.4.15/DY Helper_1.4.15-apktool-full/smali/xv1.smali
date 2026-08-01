.class public abstract Lxv1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "\u4e0b\u8f7d\u97f3\u9891"

    .line 2
    .line 3
    invoke-static {v0}, Lw71;->γ(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "download_default"

    .line 8
    .line 9
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lxv1;->α:Ljava/util/List;

    .line 18
    .line 19
    return-void
.end method

.method public static α()Ljava/util/List;
    .locals 8

    .line 1
    const-string v0, "share_panel_actions"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_6

    .line 17
    .line 18
    :cond_0
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    .line 19
    .line 20
    invoke-direct {v2, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lyh;->χ()Lzt0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v5, 0x0

    .line 32
    move v6, v5

    .line 33
    :goto_0
    if-ge v6, v4, :cond_1

    .line 34
    .line 35
    invoke-virtual {v2, v6, v1}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v7}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v6, v6, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto :goto_3

    .line 50
    :cond_1
    invoke-static {v0}, Lyh;->μ(Lzt0;)Lzt0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 58
    .line 59
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v5}, Lzt0;->listIterator(I)Ljava/util/ListIterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :cond_2
    :goto_1
    move-object v2, v0

    .line 67
    check-cast v2, Lle0;

    .line 68
    .line 69
    invoke-virtual {v2}, Lle0;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    invoke-virtual {v2}, Lle0;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-lez v4, :cond_3

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    move-object v2, v3

    .line 97
    :goto_2
    if-eqz v2, :cond_2

    .line 98
    .line 99
    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    goto :goto_4

    .line 108
    :goto_3
    new-instance v1, Leo1;

    .line 109
    .line 110
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    move-object v0, v1

    .line 114
    :goto_4
    instance-of v1, v0, Leo1;

    .line 115
    .line 116
    if-eqz v1, :cond_5

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_5
    move-object v3, v0

    .line 120
    :goto_5
    check-cast v3, Ljava/util/List;

    .line 121
    .line 122
    :goto_6
    if-nez v3, :cond_6

    .line 123
    .line 124
    sget-object v3, Lxv1;->α:Ljava/util/List;

    .line 125
    .line 126
    :cond_6
    return-object v3
.end method
