.class public final Lc82;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lc82;

.field public static final β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final δ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ε:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final ζ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final η:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final θ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ι:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final κ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final λ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final μ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final ν:Ljava/util/List;

.field public static final ξ:Ljava/util/Set;

.field public static final ο:Ljava/util/List;

.field public static final π:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lc82;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc82;->α:Lc82;

    .line 7
    .line 8
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lc82;->β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 13
    .line 14
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lc82;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lc82;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lc82;->ε:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 32
    .line 33
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lc82;->ζ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lc82;->η:Ljava/util/concurrent/ConcurrentHashMap;

    .line 46
    .line 47
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lc82;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 53
    .line 54
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lc82;->ι:Ljava/util/concurrent/ConcurrentHashMap;

    .line 60
    .line 61
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lc82;->κ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 66
    .line 67
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lc82;->λ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 72
    .line 73
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 74
    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lc82;->μ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 80
    .line 81
    const-string v0, "itemList"

    .line 82
    .line 83
    const-string v1, "awemeList"

    .line 84
    .line 85
    const-string v2, "items"

    .line 86
    .line 87
    const-string v3, "itemsP"

    .line 88
    .line 89
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sput-object v0, Lc82;->ν:Ljava/util/List;

    .line 98
    .line 99
    const-string v0, "setItemList"

    .line 100
    .line 101
    const-string v1, "setAwemeList"

    .line 102
    .line 103
    const-string v2, "setItems"

    .line 104
    .line 105
    const-string v3, "setItemsP"

    .line 106
    .line 107
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sput-object v0, Lc82;->ξ:Ljava/util/Set;

    .line 116
    .line 117
    const-string v0, "awemeItem"

    .line 118
    .line 119
    const-string v1, "item"

    .line 120
    .line 121
    const-string v2, "aweme"

    .line 122
    .line 123
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    sput-object v0, Lc82;->ο:Ljava/util/List;

    .line 132
    .line 133
    const/16 v0, 0x65

    .line 134
    .line 135
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const/16 v1, 0x91

    .line 140
    .line 141
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    filled-new-array {v0, v1}, [Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    sput-object v0, Lc82;->π:Ljava/util/Set;

    .line 154
    .line 155
    return-void
.end method

.method public static β(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/16 v0, 0xd

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x9

    .line 22
    .line 23
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-lez p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-gt v0, p1, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {p0, p1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string p1, "..."

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    :cond_1
    :goto_0
    return-object p0
.end method

.method public static δ(Ljava/util/List;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 71

    .line 1
    invoke-static {}, Lui1;->Α()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    const-string v0, "filter_enabled"

    const/4 v3, 0x0

    .line 3
    invoke-static {v0, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    const/16 v23, 0x0

    goto/16 :goto_53

    .line 5
    :cond_1
    const-string v0, "filter_ads"

    invoke-static {v0, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    move-result v4

    .line 6
    const-string v0, "filter_live"

    invoke-static {v0, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    move-result v5

    .line 7
    const-string v0, "filter_live_replay"

    .line 8
    invoke-static {v0, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    move-result v6

    .line 9
    const-string v0, "filter_ecom_live"

    .line 10
    invoke-static {v0, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    move-result v7

    .line 11
    const-string v0, "filter_image"

    invoke-static {v0, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    move-result v8

    .line 12
    const-string v0, "filter_ai_video"

    .line 13
    invoke-static {v0, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    move-result v9

    .line 14
    const-string v0, "filter_keywords"

    invoke-static {v0}, Lc82;->χ(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 15
    new-instance v10, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v0, v11}, Lyh;->σ(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 17
    check-cast v12, Ljava/lang/String;

    .line 18
    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v12, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 20
    :cond_2
    invoke-static {v10}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v10

    .line 21
    const-string v0, "filter_user_ids"

    invoke-static {v0}, Lc82;->χ(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v12

    .line 22
    const-string v0, "filter_min_duration_sec"

    .line 23
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    move-result-object v13

    invoke-interface {v13, v0, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move v0, v3

    :goto_2
    if-gez v0, :cond_3

    move v0, v3

    :cond_3
    int-to-long v13, v0

    const-wide/16 v15, 0x3e8

    mul-long/2addr v13, v15

    .line 24
    const-string v0, "filter_max_duration_sec"

    move-wide/from16 v17, v15

    .line 25
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    move-result-object v15

    invoke-interface {v15, v0, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move v0, v3

    :goto_3
    if-gez v0, :cond_4

    move v0, v3

    :cond_4
    move-object/from16 v16, v12

    int-to-long v11, v0

    mul-long v11, v11, v17

    .line 26
    const-string v0, "filter_min_digg"

    .line 27
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    move-result-object v15

    invoke-interface {v15, v0, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_2
    move v0, v3

    :goto_4
    if-gez v0, :cond_5

    move v0, v3

    :cond_5
    move v15, v4

    move/from16 v18, v5

    int-to-long v4, v0

    .line 28
    const-string v0, "filter_long_video"

    .line 29
    invoke-static {v0, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    move-result v19

    .line 30
    const-string v0, "filter_short_video"

    .line 31
    invoke-static {v0, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    move-result v20

    .line 32
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v21, 0x0

    if-nez v15, :cond_6

    if-nez v18, :cond_6

    if-nez v6, :cond_6

    if-nez v7, :cond_6

    if-nez v8, :cond_6

    if-nez v9, :cond_6

    .line 33
    move-object v0, v10

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 34
    move-object/from16 v0, v16

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    cmp-long v0, v13, v21

    if-gtz v0, :cond_6

    cmp-long v0, v11, v21

    if-gtz v0, :cond_6

    cmp-long v0, v4, v21

    if-gtz v0, :cond_6

    if-nez v19, :cond_6

    if-eqz v20, :cond_0

    .line 35
    :cond_6
    :try_start_3
    const-string v0, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p1

    invoke-static {v0, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    .line 36
    new-instance v2, Leo1;

    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v2

    .line 37
    :goto_5
    instance-of v2, v0, Leo1;

    if-eqz v2, :cond_7

    const/4 v0, 0x0

    .line 38
    :cond_7
    move-object v2, v0

    check-cast v2, Ljava/lang/Class;

    .line 39
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    move-wide/from16 v25, v4

    .line 40
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 41
    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 42
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v27

    move/from16 v28, v6

    move/from16 v29, v7

    move/from16 v30, v8

    move/from16 v31, v9

    move-object/from16 v32, v10

    move-wide/from16 v33, v11

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_6
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    move/from16 p1, v12

    const-string v12, " reasons="

    move-wide/from16 v36, v13

    const-string v13, "source="

    if-eqz p1, :cond_87

    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v38, v11, 0x1

    if-ltz v11, :cond_86

    if-nez v14, :cond_8

    .line 43
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v44, v2

    move-object/from16 v60, v3

    move-object/from16 v59, v4

    move-object/from16 v55, v5

    move/from16 v40, v15

    :goto_7
    move-object/from16 v4, p2

    goto/16 :goto_51

    .line 44
    :cond_8
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v39

    move/from16 v40, v15

    invoke-virtual/range {v39 .. v39}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v5, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 45
    sget-object v15, Lc82;->α:Lc82;

    invoke-virtual {v15, v2, v14}, Lc82;->λ(Ljava/lang/Class;Ljava/lang/Object;)Z

    move-result v39

    move/from16 v41, v10

    if-eqz v39, :cond_9

    .line 46
    new-instance v10, Lz72;

    move/from16 v42, v8

    const/4 v8, 0x0

    invoke-direct {v10, v14, v8}, Lz72;-><init>(Ljava/lang/Object;Z)V

    move-object/from16 v44, v2

    goto :goto_a

    :cond_9
    move/from16 v42, v8

    .line 47
    sget-object v8, Lc82;->ο:Ljava/util/List;

    .line 48
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    move-object/from16 v43, v8

    .line 49
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-static {v8, v10}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    invoke-static {v14, v8}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_b

    :cond_a
    move-object/from16 v44, v2

    goto :goto_9

    .line 50
    :cond_b
    invoke-virtual {v15, v2, v8}, Lc82;->λ(Ljava/lang/Class;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    .line 51
    new-instance v10, Lz72;

    move-object/from16 v44, v2

    const/4 v2, 0x1

    invoke-direct {v10, v8, v2}, Lz72;-><init>(Ljava/lang/Object;Z)V

    goto :goto_a

    :goto_9
    move-object/from16 v8, v43

    move-object/from16 v2, v44

    goto :goto_8

    :cond_c
    move-object/from16 v44, v2

    const/4 v10, 0x0

    :goto_a
    if-nez v10, :cond_d

    .line 52
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v60, v3

    move-object/from16 v59, v4

    move-object/from16 v55, v5

    move/from16 v10, v41

    move/from16 v8, v42

    goto :goto_7

    .line 53
    :cond_d
    iget-object v2, v10, Lz72;->α:Ljava/lang/Object;

    .line 54
    iget-boolean v8, v10, Lz72;->β:Z

    if-eqz v8, :cond_e

    add-int/lit8 v6, v6, 0x1

    :goto_b
    move v8, v6

    move v6, v0

    goto :goto_c

    :cond_e
    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    .line 55
    :goto_c
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v15, v0}, Lc82;->α(Ljava/lang/Class;)La82;

    move-result-object v10

    iget-object v15, v10, La82;->ζ:Ljava/lang/reflect/Field;

    .line 56
    iget-object v0, v10, La82;->Ι:Ljava/lang/reflect/Field;

    move/from16 v43, v6

    .line 57
    invoke-static {v2, v0}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v6

    .line 58
    iget-object v0, v10, La82;->Κ:Ljava/lang/reflect/Field;

    move/from16 v45, v8

    .line 59
    invoke-static {v2, v0}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v8

    .line 60
    iget-object v0, v10, La82;->ε:Ljava/lang/reflect/Field;

    move/from16 v46, v7

    .line 61
    invoke-static {v2, v0}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v7

    move/from16 v54, v9

    .line 62
    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    .line 63
    iget-object v0, v10, La82;->η:Ljava/lang/reflect/Field;

    .line 64
    invoke-static {v2, v0}, Lc82;->π(Ljava/lang/Object;Ljava/lang/reflect/Field;)Z

    move-result v0

    move/from16 v47, v0

    .line 65
    iget-object v0, v10, La82;->Ν:Ljava/lang/reflect/Method;

    .line 66
    invoke-static {v0, v2}, Lc82;->ι(Ljava/lang/reflect/Method;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v47, :cond_f

    move/from16 v47, v0

    .line 67
    const-string v0, "isAd"

    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_f
    move/from16 v47, v0

    :goto_d
    if-eqz v47, :cond_10

    .line 68
    const-string v0, "getAd"

    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 69
    :cond_10
    iget-object v0, v10, La82;->Α:Ljava/lang/reflect/Field;

    .line 70
    invoke-static {v2, v0}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 71
    const-string v0, "feedAdPlayletExtraInfo"

    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 72
    :cond_11
    iget-object v0, v10, La82;->Β:Ljava/lang/reflect/Field;

    .line 73
    invoke-static {v2, v0}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 74
    const-string v0, "feedAdForcePlayletExtraInfo"

    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 75
    :cond_12
    iget-object v0, v10, La82;->Γ:Ljava/lang/reflect/Field;

    .line 76
    invoke-static {v2, v0}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 77
    const-string v0, "insertionAdConfig"

    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 78
    :cond_13
    iget-object v0, v10, La82;->Δ:Ljava/lang/reflect/Field;

    .line 79
    invoke-static {v2, v0}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 80
    const-string v0, "asyncAdInfo"

    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 81
    :cond_14
    iget-object v0, v10, La82;->ψ:Ljava/lang/reflect/Field;

    .line 82
    invoke-static {v2, v0}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v47, v0

    const/16 v0, 0x9

    if-eqz v47, :cond_16

    .line 83
    invoke-static/range {v47 .. v47}, Lc82;->μ(Ljava/lang/Object;)Z

    move-result v48

    if-eqz v48, :cond_15

    goto :goto_e

    :cond_15
    const/16 v47, 0x0

    :goto_e
    if-eqz v47, :cond_16

    move-object/from16 v55, v5

    move-object/from16 v56, v12

    move-object/from16 v1, v47

    goto :goto_12

    :cond_16
    move-object/from16 v55, v5

    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    move-object/from16 v56, v12

    .line 85
    new-instance v12, Lj72;

    invoke-direct {v12, v0}, Lj72;-><init>(I)V

    new-instance v0, Lc8;

    const/16 v1, 0xe

    invoke-direct {v0, v12, v1}, Lc8;-><init>(La80;I)V

    sget-object v1, Lc82;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v5, v0}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Ljava/util/List;

    .line 86
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    .line 87
    invoke-static {v2, v1}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v1

    instance-of v5, v1, Ljava/util/Map;

    if-eqz v5, :cond_18

    check-cast v1, Ljava/util/Map;

    goto :goto_f

    :cond_18
    const/4 v1, 0x0

    :goto_f
    if-eqz v1, :cond_19

    const-string v5, "awemeRawAd"

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_10

    :cond_19
    const/4 v1, 0x0

    :goto_10
    if-eqz v1, :cond_17

    goto :goto_11

    :cond_1a
    const/4 v1, 0x0

    :goto_11
    if-eqz v1, :cond_1b

    .line 88
    invoke-static {v1}, Lc82;->μ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_12

    :cond_1b
    const/4 v1, 0x0

    .line 89
    :goto_12
    iget-object v0, v10, La82;->ω:Ljava/lang/reflect/Field;

    .line 90
    invoke-static {v2, v0}, Lc82;->ρ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_13

    :cond_1c
    const/4 v0, 0x0

    .line 91
    :goto_13
    iget-object v5, v10, La82;->Ξ:Ljava/lang/reflect/Method;

    .line 92
    invoke-static {v5, v2}, Lc82;->κ(Ljava/lang/reflect/Method;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 93
    instance-of v12, v5, Ljava/lang/Number;

    if-eqz v12, :cond_1d

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v48

    invoke-static/range {v48 .. v49}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const/16 v12, 0xa

    goto :goto_14

    .line 94
    :cond_1d
    instance-of v12, v5, Ljava/lang/String;

    if-eqz v12, :cond_1e

    check-cast v5, Ljava/lang/String;

    const/16 v12, 0xa

    .line 95
    invoke-static {v5, v12}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    move-result-object v5

    goto :goto_14

    :cond_1e
    const/16 v12, 0xa

    const/4 v5, 0x0

    :goto_14
    if-eqz v5, :cond_1f

    .line 96
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v48

    goto :goto_15

    :cond_1f
    move-wide/from16 v48, v21

    :goto_15
    if-eqz v1, :cond_20

    if-eqz v0, :cond_20

    .line 97
    const-string v5, "rawAd+adSource"

    invoke-interface {v9, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_20
    if-eqz v1, :cond_21

    cmp-long v5, v48, v21

    if-lez v5, :cond_21

    .line 98
    const-string v5, "rawAd+adId"

    invoke-interface {v9, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_21
    if-eqz v0, :cond_22

    cmp-long v5, v48, v21

    if-lez v5, :cond_22

    .line 99
    const-string v5, "adSource+adId"

    invoke-interface {v9, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_22
    if-nez v1, :cond_24

    if-nez v0, :cond_24

    cmp-long v0, v48, v21

    if-lez v0, :cond_23

    goto :goto_16

    :cond_23
    move-object/from16 v60, v3

    move-object/from16 v59, v4

    move-object/from16 v50, v6

    move-object/from16 v51, v7

    move-object/from16 v49, v8

    move/from16 v57, v11

    move-object/from16 v58, v13

    move-object/from16 v52, v14

    goto/16 :goto_21

    .line 100
    :cond_24
    :goto_16
    sget-object v0, Lp00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 101
    iget-object v0, v10, La82;->Ε:Ljava/lang/reflect/Field;

    .line 102
    invoke-static {v2, v0}, Lc82;->υ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_25

    const-string v0, ""

    :cond_25
    move-object v1, v0

    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    if-nez v0, :cond_26

    move-object/from16 v60, v3

    move-object/from16 v59, v4

    move-object/from16 v50, v6

    move-object/from16 v51, v7

    move-object/from16 v49, v8

    move/from16 v57, v11

    move-object/from16 v58, v13

    move-object/from16 v52, v14

    :goto_17
    const/4 v0, 0x0

    goto/16 :goto_20

    .line 104
    :cond_26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    .line 105
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v12

    move/from16 v57, v11

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v58, v13

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, "@"

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 106
    sget-object v12, Lp00;->β:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v12, v11}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    if-eqz v13, :cond_27

    move-object/from16 v60, v3

    move-object/from16 v59, v4

    move-object/from16 v50, v6

    move-object/from16 v51, v7

    move-object/from16 v49, v8

    move-object/from16 v52, v14

    goto/16 :goto_1d

    .line 107
    :cond_27
    sget-object v13, Lox;->α:Ljava/lang/Object;

    .line 108
    sget-object v13, Lkx;->Х:Lkx;

    .line 109
    invoke-static {v13, v0}, Lox;->π(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_28

    sget-object v0, Ljz;->ε:Ljz;

    .line 110
    :cond_28
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 111
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v48

    if-eqz v48, :cond_2d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v48

    .line 112
    check-cast v48, Ljava/lang/Class;

    move-object/from16 v49, v0

    .line 113
    invoke-virtual/range {v48 .. v48}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v59, v4

    .line 114
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v60, v3

    .line 115
    array-length v3, v0

    move-object/from16 v48, v0

    const/4 v0, 0x0

    :goto_19
    if-ge v0, v3, :cond_2b

    move/from16 v50, v0

    aget-object v0, v48, v50

    .line 116
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v51

    invoke-static/range {v51 .. v51}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v51

    if-eqz v51, :cond_29

    move/from16 v51, v3

    .line 117
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v3

    move-object/from16 v52, v14

    sget-object v14, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v3, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2a

    .line 118
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    array-length v3, v3

    const/4 v14, 0x2

    if-ne v3, v14, :cond_2a

    .line 119
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    const/16 v24, 0x0

    aget-object v3, v3, v24

    invoke-virtual {v3, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_2a

    .line 120
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    const/16 v39, 0x1

    aget-object v3, v3, v39

    const-class v14, Ljava/lang/String;

    invoke-static {v3, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2a

    .line 121
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1a

    :cond_29
    move/from16 v51, v3

    move-object/from16 v52, v14

    :cond_2a
    :goto_1a
    add-int/lit8 v0, v50, 0x1

    move/from16 v3, v51

    move-object/from16 v14, v52

    goto :goto_19

    :cond_2b
    move-object/from16 v52, v14

    .line 122
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Method;

    const/4 v14, 0x1

    .line 123
    invoke-virtual {v3, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    goto :goto_1b

    .line 124
    :cond_2c
    new-instance v0, Lqt;

    const/4 v3, 0x7

    .line 125
    invoke-direct {v0, v3}, Lqt;-><init>(I)V

    .line 126
    invoke-static {v4, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .line 127
    invoke-static {v13, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    move-object/from16 v0, v49

    move-object/from16 v14, v52

    move-object/from16 v4, v59

    move-object/from16 v3, v60

    goto/16 :goto_18

    :cond_2d
    move-object/from16 v60, v3

    move-object/from16 v59, v4

    move-object/from16 v52, v14

    .line 128
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 129
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 130
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 131
    move-object v13, v5

    check-cast v13, Ljava/lang/reflect/Method;

    .line 132
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v35

    move-object/from16 v48, v4

    invoke-virtual/range {v35 .. v35}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x23

    .line 134
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 135
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x28

    .line 136
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 137
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v35, v13

    new-instance v13, Lhm;

    move-object/from16 v49, v8

    const/16 v8, 0x1b

    invoke-direct {v13, v8}, Lhm;-><init>(I)V

    const/16 v8, 0x1e

    move-object/from16 v50, v6

    const-string v6, ","

    move-object/from16 v51, v7

    const/4 v7, 0x0

    invoke-static {v4, v6, v7, v13, v8}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    const-string v4, "):"

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    invoke-virtual/range {v35 .. v35}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 141
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2e

    .line 142
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2e
    move-object/from16 v4, v48

    move-object/from16 v8, v49

    move-object/from16 v6, v50

    move-object/from16 v7, v51

    goto :goto_1c

    :cond_2f
    move-object/from16 v50, v6

    move-object/from16 v51, v7

    move-object/from16 v49, v8

    .line 143
    new-instance v0, Lqt;

    const/16 v4, 0x9

    .line 144
    invoke-direct {v0, v4}, Lqt;-><init>(I)V

    .line 145
    invoke-static {v3, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v13

    .line 146
    invoke-virtual {v12, v11, v13}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    :goto_1d
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_30

    goto/16 :goto_17

    .line 148
    :cond_30
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_31
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_34

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    .line 149
    :try_start_4
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v7, 0x0

    invoke-virtual {v0, v7, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v4, v0, Ljava/lang/Boolean;

    if-eqz v4, :cond_32

    check-cast v0, Ljava/lang/Boolean;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_1f

    :catchall_4
    move-exception v0

    goto :goto_1e

    :cond_32
    const/4 v0, 0x0

    goto :goto_1f

    .line 150
    :goto_1e
    new-instance v4, Leo1;

    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v4

    .line 151
    :goto_1f
    instance-of v4, v0, Leo1;

    if-eqz v4, :cond_33

    const/4 v0, 0x0

    .line 152
    :cond_33
    check-cast v0, Ljava/lang/Boolean;

    .line 153
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_31

    move-object v0, v4

    goto :goto_20

    .line 154
    :cond_34
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 155
    :goto_20
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 156
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_35

    .line 157
    const-string v0, "longPressAdPanel+metadata"

    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 158
    :cond_35
    :goto_21
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v3, v1, 0x1

    .line 159
    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 160
    iget-object v0, v10, La82;->Λ:Ljava/lang/reflect/Method;

    .line 161
    invoke-static {v0, v2}, Lc82;->ι(Ljava/lang/reflect/Method;Ljava/lang/Object;)Z

    move-result v5

    .line 162
    invoke-static {v2, v15}, Lc82;->ρ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Integer;

    move-result-object v6

    .line 163
    iget-object v0, v10, La82;->τ:Ljava/lang/reflect/Field;

    .line 164
    invoke-static {v2, v0}, Lc82;->π(Ljava/lang/Object;Ljava/lang/reflect/Field;)Z

    move-result v7

    if-eqz v5, :cond_36

    .line 165
    const-string v0, "isLive"

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 166
    :cond_36
    sget-object v0, Lc82;->π:Ljava/util/Set;

    move-object v8, v0

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v8, v6}, Lxh;->Б(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_37

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v11, "awemeType:"

    invoke-direct {v0, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 167
    :cond_37
    iget-object v0, v10, La82;->ξ:Ljava/lang/reflect/Field;

    .line 168
    invoke-static {v2, v0}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v0

    .line 169
    new-instance v11, Ll91;

    const-string v12, "liveRoom"

    invoke-direct {v11, v12, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 170
    iget-object v0, v10, La82;->ο:Ljava/lang/reflect/Field;

    .line 171
    invoke-static {v2, v0}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v0

    .line 172
    new-instance v12, Ll91;

    const-string v13, "newLiveRoomData"

    invoke-direct {v12, v13, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    iget-object v0, v10, La82;->π:Ljava/lang/reflect/Field;

    .line 174
    invoke-static {v2, v0}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v0

    .line 175
    new-instance v13, Ll91;

    const-string v14, "liveRoomStruct"

    invoke-direct {v13, v14, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 176
    iget-object v0, v10, La82;->Μ:Ljava/lang/reflect/Method;

    .line 177
    invoke-static {v0, v2}, Lc82;->κ(Ljava/lang/reflect/Method;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 178
    new-instance v14, Ll91;

    move/from16 v35, v1

    const-string v1, "getLiveRoom"

    invoke-direct {v14, v1, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 179
    filled-new-array {v11, v12, v13, v14}, [Ll91;

    move-result-object v0

    .line 180
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 181
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_38
    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_39

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll91;

    .line 182
    iget-object v12, v11, Ll91;->ε:Ljava/lang/Object;

    .line 183
    check-cast v12, Ljava/lang/String;

    .line 184
    iget-object v11, v11, Ll91;->ζ:Ljava/lang/Object;

    if-eqz v11, :cond_38

    .line 185
    invoke-interface {v4, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    goto :goto_22

    .line 186
    :cond_39
    iget-object v0, v10, La82;->ρ:Ljava/lang/reflect/Field;

    .line 187
    invoke-static {v2, v0}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_3a

    move/from16 v47, v1

    move/from16 v62, v5

    goto/16 :goto_2f

    .line 188
    :cond_3a
    const-string v0, "rawRoom"

    const-string v12, "mNewLiveRoomStruct"

    const-string v13, "room"

    filled-new-array {v13, v0, v12}, [Ljava/lang/String;

    move-result-object v0

    const/4 v12, 0x0

    :goto_23
    const/4 v13, 0x3

    if-ge v12, v13, :cond_3b

    .line 189
    aget-object v13, v0, v12

    .line 190
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    invoke-static {v14, v13}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v13

    invoke-static {v11, v13}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_3c

    add-int/lit8 v12, v12, 0x1

    goto :goto_23

    :cond_3b
    const/4 v13, 0x0

    :cond_3c
    if-eqz v13, :cond_3d

    move/from16 v62, v5

    goto/16 :goto_2e

    .line 191
    :cond_3d
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    .line 192
    sget-object v13, Lc82;->ι:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v13, v12}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    if-eqz v0, :cond_3e

    invoke-static {v0, v11}, Lc82;->κ(Ljava/lang/reflect/Method;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move/from16 v47, v1

    move/from16 v62, v5

    goto/16 :goto_2c

    .line 193
    :cond_3e
    sget-object v14, Lc82;->κ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    invoke-virtual {v14, v12}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3f

    move/from16 v47, v1

    move/from16 v62, v5

    :goto_24
    const/4 v0, 0x0

    goto/16 :goto_2c

    .line 194
    :cond_3f
    :try_start_5
    invoke-virtual {v12}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    move/from16 v47, v1

    .line 195
    :try_start_6
    array-length v1, v0

    move-object/from16 p1, v0

    const/4 v0, 0x0

    :goto_25
    if-ge v0, v1, :cond_43

    aget-object v48, p1, v0

    move/from16 v53, v0

    .line 196
    invoke-virtual/range {v48 .. v48}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v0, v0

    if-nez v0, :cond_41

    .line 197
    invoke-virtual/range {v48 .. v48}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    move/from16 v61, v1

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_40

    .line 198
    invoke-virtual/range {v48 .. v48}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LiveRoomStruct"
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    move/from16 v62, v5

    const/4 v5, 0x0

    .line 199
    :try_start_7
    invoke-static {v0, v1, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_42

    move-object/from16 v0, v48

    goto :goto_29

    :catchall_5
    move-exception v0

    goto :goto_2a

    :catchall_6
    move-exception v0

    :goto_26
    move/from16 v62, v5

    goto :goto_2a

    :cond_40
    :goto_27
    move/from16 v62, v5

    goto :goto_28

    :cond_41
    move/from16 v61, v1

    goto :goto_27

    :cond_42
    :goto_28
    add-int/lit8 v0, v53, 0x1

    move/from16 v1, v61

    move/from16 v5, v62

    goto :goto_25

    :cond_43
    move/from16 v62, v5

    const/4 v0, 0x0

    :goto_29
    if-eqz v0, :cond_44

    const/4 v1, 0x1

    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    goto :goto_2b

    :cond_44
    const/4 v0, 0x0

    goto :goto_2b

    :catchall_7
    move-exception v0

    move/from16 v47, v1

    goto :goto_26

    .line 201
    :goto_2a
    new-instance v1, Leo1;

    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 202
    :goto_2b
    instance-of v1, v0, Leo1;

    if-eqz v1, :cond_45

    const/4 v0, 0x0

    .line 203
    :cond_45
    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_46

    .line 204
    invoke-virtual {v14, v12}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    goto :goto_24

    .line 205
    :cond_46
    invoke-virtual {v13, v12, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    invoke-static {v0, v11}, Lc82;->κ(Ljava/lang/reflect/Method;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2c
    if-eqz v0, :cond_47

    goto :goto_2e

    .line 207
    :cond_47
    const-string v0, "tagId"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lc82;->τ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_48

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_2d

    :cond_48
    move-wide/from16 v0, v21

    :goto_2d
    cmp-long v0, v0, v21

    if-lez v0, :cond_4a

    .line 208
    const-string v0, "tag"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lc82;->φ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4a

    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_49

    goto :goto_2f

    .line 209
    :cond_49
    :goto_2e
    const-string v0, "mRoomFeedCellStruct"

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v47, 0x1

    .line 210
    :cond_4a
    :goto_2f
    iget-object v0, v10, La82;->σ:Ljava/lang/reflect/Field;

    .line 211
    invoke-static {v2, v0}, Lc82;->σ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_4b

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_30

    :cond_4b
    move-wide/from16 v0, v21

    :goto_30
    cmp-long v0, v0, v21

    if-lez v0, :cond_4c

    .line 212
    const-string v0, "liveId"

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v47, 0x1

    :cond_4c
    if-eqz v7, :cond_4d

    .line 213
    const-string v0, "isDetailLive"

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v47, 0x1

    .line 214
    :cond_4d
    iget-object v0, v10, La82;->υ:Ljava/lang/reflect/Field;

    .line 215
    invoke-static {v2, v0}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4e

    .line 216
    const-string v0, "liveFeedbackCard"

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    goto :goto_31

    :cond_4e
    move/from16 v0, v47

    :goto_31
    if-nez v62, :cond_50

    .line 217
    invoke-static {v8, v6}, Lxh;->Б(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_50

    if-eqz v7, :cond_4f

    goto :goto_32

    :cond_4f
    const/4 v8, 0x0

    goto :goto_33

    :cond_50
    :goto_32
    const/4 v8, 0x1

    .line 218
    :goto_33
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 219
    iget-object v5, v10, La82;->κ:Ljava/lang/reflect/Field;

    .line 220
    iget-object v6, v10, La82;->λ:Ljava/lang/reflect/Field;

    .line 221
    iget-object v7, v10, La82;->μ:Ljava/lang/reflect/Field;

    .line 222
    iget-object v11, v10, La82;->ν:Ljava/lang/reflect/Field;

    .line 223
    filled-new-array {v5, v6, v7, v11}, [Ljava/lang/reflect/Field;

    move-result-object v5

    .line 224
    invoke-static {v5}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 225
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_51
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_55

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/reflect/Field;

    .line 226
    invoke-static {v2, v6}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Ljava/util/List;

    if-eqz v7, :cond_52

    check-cast v6, Ljava/util/List;

    goto :goto_34

    :cond_52
    const/4 v6, 0x0

    :goto_34
    if-eqz v6, :cond_51

    .line 227
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_53
    :goto_35
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_51

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 228
    const-string v65, "title"

    const-string v66, "label"

    const-string v61, "text"

    const-string v62, "a"

    const-string v63, "labelText"

    const-string v64, "contentTag"

    filled-new-array/range {v61 .. v66}, [Ljava/lang/String;

    move-result-object v11

    invoke-static {v7, v11}, Lc82;->φ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_53

    .line 229
    invoke-static {v7}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_53

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v11

    if-lez v11, :cond_54

    goto :goto_36

    :cond_54
    const/4 v7, 0x0

    :goto_36
    if-eqz v7, :cond_53

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_35

    .line 230
    :cond_55
    iget-object v5, v10, La82;->α:Ljava/lang/reflect/Field;

    .line 231
    invoke-static {v2, v5}, Lc82;->υ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v5

    .line 232
    iget-object v6, v10, La82;->β:Ljava/lang/reflect/Field;

    .line 233
    invoke-static {v2, v6}, Lc82;->υ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v6

    .line 234
    iget-object v7, v10, La82;->γ:Ljava/lang/reflect/Field;

    .line 235
    invoke-static {v2, v7}, Lc82;->υ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v5, v6, v7}, [Ljava/lang/String;

    move-result-object v5

    .line 236
    invoke-static {v5}, Lg7;->Ω([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v61

    const/16 v66, 0x0

    const/16 v67, 0x3e

    .line 237
    const-string v62, "\n"

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    invoke-static/range {v61 .. v67}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    move-result-object v5

    .line 238
    iget-object v6, v10, La82;->Ζ:Ljava/lang/reflect/Field;

    .line 239
    invoke-static {v2, v6}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Ljava/util/List;

    if-eqz v7, :cond_56

    check-cast v6, Ljava/util/List;

    goto :goto_37

    :cond_56
    const/4 v6, 0x0

    :goto_37
    if-eqz v6, :cond_57

    .line 240
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_5a

    .line 241
    :cond_57
    iget-object v6, v10, La82;->Η:Ljava/lang/reflect/Field;

    .line 242
    invoke-static {v2, v6}, Lc82;->π(Ljava/lang/Object;Ljava/lang/reflect/Field;)Z

    move-result v6

    if-nez v6, :cond_5a

    .line 243
    iget-object v6, v10, La82;->Θ:Ljava/lang/reflect/Field;

    .line 244
    invoke-static {v2, v6}, Lc82;->π(Ljava/lang/Object;Ljava/lang/reflect/Field;)Z

    move-result v6

    if-nez v6, :cond_5a

    .line 245
    invoke-static {v2, v15}, Lc82;->ρ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Integer;

    move-result-object v6

    if-nez v6, :cond_58

    goto :goto_38

    :cond_58
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x44

    if-ne v6, v7, :cond_59

    goto :goto_39

    :cond_59
    :goto_38
    const/4 v6, 0x0

    goto :goto_3a

    :cond_5a
    :goto_39
    const/4 v6, 0x1

    .line 246
    :goto_3a
    iget-object v7, v10, La82;->θ:Ljava/lang/reflect/Field;

    .line 247
    invoke-static {v2, v7}, Lc82;->π(Ljava/lang/Object;Ljava/lang/reflect/Field;)Z

    move-result v7

    .line 248
    iget-object v11, v10, La82;->ι:Ljava/lang/reflect/Field;

    .line 249
    invoke-static {v2, v11}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_5b

    const/4 v11, 0x1

    goto :goto_3b

    :cond_5b
    const/4 v11, 0x0

    .line 250
    :goto_3b
    iget-object v12, v10, La82;->φ:Ljava/lang/reflect/Field;

    .line 251
    invoke-static {v2, v12}, Lc82;->π(Ljava/lang/Object;Ljava/lang/reflect/Field;)Z

    move-result v12

    .line 252
    iget-object v13, v10, La82;->χ:Ljava/lang/reflect/Field;

    .line 253
    invoke-static {v2, v13}, Lc82;->π(Ljava/lang/Object;Ljava/lang/reflect/Field;)Z

    move-result v13

    .line 254
    iget-object v10, v10, La82;->δ:Ljava/lang/reflect/Field;

    .line 255
    invoke-static {v2, v10}, Lc82;->υ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v10

    const-string v14, "id"

    if-nez v10, :cond_5c

    .line 256
    const-string v10, "uid"

    filled-new-array {v10, v14}, [Ljava/lang/String;

    move-result-object v10

    move-object/from16 v15, v51

    invoke-static {v15, v10}, Lc82;->φ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 257
    :cond_5c
    const-string v15, "durationMs"

    move/from16 p1, v0

    const-string v0, "x"

    move-object/from16 v61, v1

    const-string v1, "duration"

    filled-new-array {v1, v15, v0}, [Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v50

    invoke-static {v1, v0}, Lc82;->τ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    .line 258
    const-string v1, "digg_count"

    const-string v15, "d"

    move-object/from16 v47, v0

    const-string v0, "diggCount"

    filled-new-array {v0, v1, v15}, [Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v49

    invoke-static {v1, v0}, Lc82;->τ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-nez v35, :cond_5d

    add-int/lit8 v1, v46, 0x1

    move/from16 v46, v1

    :cond_5d
    if-nez v8, :cond_5f

    if-eqz p1, :cond_5e

    goto :goto_3c

    :cond_5e
    move/from16 v1, v42

    goto :goto_3d

    :cond_5f
    :goto_3c
    add-int/lit8 v1, v42, 0x1

    .line 259
    :goto_3d
    new-instance v15, Ljava/util/LinkedHashSet;

    invoke-direct {v15}, Ljava/util/LinkedHashSet;-><init>()V

    if-eqz v31, :cond_66

    if-eqz v7, :cond_61

    move-object/from16 v48, v0

    .line 260
    sget-object v0, Ld82;->ε:Ld82;

    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_60
    :goto_3e
    move/from16 v42, v1

    move-object/from16 v69, v4

    goto/16 :goto_41

    :cond_61
    move-object/from16 v48, v0

    if-eqz v11, :cond_62

    .line 261
    sget-object v0, Ld82;->ζ:Ld82;

    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3e

    .line 262
    :cond_62
    invoke-virtual/range {v61 .. v61}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_63

    goto :goto_3e

    .line 263
    :cond_63
    invoke-virtual/range {v61 .. v61}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v42

    if-eqz v42, :cond_60

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v42

    check-cast v42, Ljava/lang/String;

    move-object/from16 v49, v0

    .line 264
    invoke-static/range {v42 .. v42}, Lu81;->ν(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move/from16 v42, v1

    .line 265
    const-string v1, "aigc"

    move-object/from16 v69, v4

    const/4 v4, 0x0

    .line 266
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_65

    .line 267
    const-string v1, "ai\u751f\u6210"

    .line 268
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_65

    .line 269
    const-string v1, "\u7531ai\u751f\u6210"

    .line 270
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_65

    .line 271
    const-string v1, "\u4eba\u5de5\u667a\u80fd\u751f\u6210"

    .line 272
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_65

    .line 273
    const-string v1, "ai\u5408\u6210"

    .line 274
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_64

    goto :goto_40

    :cond_64
    move/from16 v1, v42

    move-object/from16 v0, v49

    move-object/from16 v4, v69

    goto :goto_3f

    .line 275
    :cond_65
    :goto_40
    sget-object v0, Ld82;->η:Ld82;

    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_41

    :cond_66
    move-object/from16 v48, v0

    goto :goto_3e

    :goto_41
    if-nez v8, :cond_67

    if-eqz p1, :cond_68

    :cond_67
    if-nez v12, :cond_68

    if-nez v13, :cond_68

    const/4 v0, 0x1

    goto :goto_42

    :cond_68
    const/4 v0, 0x0

    :goto_42
    if-eqz v18, :cond_69

    if-eqz v0, :cond_69

    .line 276
    sget-object v0, Ld82;->θ:Ld82;

    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_69
    if-eqz v28, :cond_6a

    if-eqz v12, :cond_6a

    .line 277
    sget-object v0, Ld82;->ι:Ld82;

    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_6a
    if-eqz v29, :cond_6b

    if-eqz v13, :cond_6b

    .line 278
    sget-object v0, Ld82;->κ:Ld82;

    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_6b
    if-eqz v40, :cond_6c

    if-nez v35, :cond_6c

    .line 279
    sget-object v0, Ld82;->λ:Ld82;

    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_6c
    if-eqz v30, :cond_6d

    if-eqz v6, :cond_6d

    .line 280
    sget-object v0, Ld82;->μ:Ld82;

    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 281
    :cond_6d
    invoke-static {v5}, Lu81;->ν(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 282
    move-object/from16 v1, v32

    check-cast v1, Ljava/lang/Iterable;

    .line 283
    instance-of v4, v1, Ljava/util/Collection;

    if-eqz v4, :cond_6f

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_6f

    :cond_6e
    move/from16 v70, v8

    const/4 v4, 0x0

    goto :goto_45

    .line 284
    :cond_6f
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_43
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 285
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 286
    invoke-static {v6, v4, v6}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 287
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v35, v1

    move/from16 v70, v8

    const/4 v1, 0x0

    .line 288
    :goto_44
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v1, v8, :cond_71

    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 289
    invoke-static {v8}, Ljx0;->Κ(C)Z

    move-result v49

    if-nez v49, :cond_70

    .line 290
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    :cond_70
    add-int/lit8 v1, v1, 0x1

    goto :goto_44

    .line 291
    :cond_71
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 292
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_72

    const/4 v4, 0x0

    .line 293
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_73

    .line 294
    sget-object v0, Ld82;->ν:Ld82;

    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_45

    :cond_72
    const/4 v4, 0x0

    :cond_73
    move-object/from16 v1, v35

    move/from16 v8, v70

    goto :goto_43

    .line 295
    :goto_45
    move-object/from16 v0, v16

    check-cast v0, Ljava/lang/Iterable;

    if-eqz v10, :cond_74

    invoke-static {v10}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_46

    :cond_74
    const/4 v1, 0x0

    :goto_46
    invoke-static {v0, v1}, Lxh;->Б(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_75

    .line 296
    sget-object v0, Ld82;->ξ:Ld82;

    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_75
    if-eqz v47, :cond_7a

    .line 297
    invoke-virtual/range {v47 .. v47}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, v21

    if-ltz v0, :cond_76

    move-object/from16 v0, v47

    goto :goto_47

    :cond_76
    const/4 v0, 0x0

    :goto_47
    if-eqz v0, :cond_7a

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    cmp-long v6, v36, v21

    if-lez v6, :cond_77

    cmp-long v6, v0, v36

    if-gez v6, :cond_77

    .line 298
    sget-object v6, Ld82;->ο:Ld82;

    invoke-interface {v15, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_77
    cmp-long v6, v33, v21

    if-lez v6, :cond_78

    cmp-long v6, v0, v33

    if-lez v6, :cond_78

    .line 299
    sget-object v6, Ld82;->π:Ld82;

    invoke-interface {v15, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_78
    if-eqz v19, :cond_79

    const-wide/32 v49, 0x927c0

    cmp-long v6, v0, v49

    if-lez v6, :cond_79

    .line 300
    sget-object v6, Ld82;->σ:Ld82;

    invoke-interface {v15, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_79
    if-eqz v20, :cond_7a

    const-wide/16 v49, 0x3a98

    cmp-long v0, v0, v49

    if-gez v0, :cond_7a

    .line 301
    sget-object v0, Ld82;->τ:Ld82;

    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_7a
    if-eqz v48, :cond_7c

    .line 302
    invoke-virtual/range {v48 .. v48}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, v21

    if-ltz v0, :cond_7b

    move-object/from16 v0, v48

    goto :goto_48

    :cond_7b
    const/4 v0, 0x0

    :goto_48
    if-eqz v0, :cond_7c

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    cmp-long v6, v25, v21

    if-lez v6, :cond_7c

    cmp-long v0, v0, v25

    if-gez v0, :cond_7c

    .line 303
    sget-object v0, Ld82;->ρ:Ld82;

    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 304
    :cond_7c
    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7d

    move-object/from16 v6, v52

    move-object/from16 v1, v60

    .line 305
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v4, p2

    move/from16 v10, v41

    :goto_49
    move/from16 v8, v42

    move/from16 v0, v43

    move/from16 v6, v45

    move/from16 v7, v46

    move/from16 v9, v54

    goto/16 :goto_51

    :cond_7d
    move-object/from16 v1, v60

    add-int/lit8 v10, v41, 0x1

    .line 306
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ld82;

    move-object/from16 v8, v59

    .line 307
    invoke-virtual {v8, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Ljava/lang/Integer;

    if-eqz v24, :cond_7e

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Integer;->intValue()I

    move-result v24

    :goto_4b
    const/16 v39, 0x1

    goto :goto_4c

    :cond_7e
    move/from16 v24, v4

    goto :goto_4b

    :goto_4c
    add-int/lit8 v24, v24, 0x1

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v59, v8

    const/4 v4, 0x0

    goto :goto_4a

    :cond_7f
    move-object/from16 v8, v59

    const/16 v39, 0x1

    .line 308
    const-string v0, "aid"

    const-string v4, "awemeId"

    filled-new-array {v0, v4, v14}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lc82;->φ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "unknown"

    if-nez v0, :cond_80

    move-object v0, v2

    :cond_80
    const/16 v4, 0x30

    .line 309
    invoke-static {v0, v4}, Lc82;->β(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    const/16 v4, 0x60

    .line 310
    invoke-static {v5, v4}, Lc82;->β(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 311
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_81

    const-string v4, "<empty>"

    .line 312
    :cond_81
    new-instance v5, Lj72;

    const/16 v6, 0x8

    invoke-direct {v5, v6}, Lj72;-><init>(I)V

    const/16 v68, 0x1e

    const-string v63, ","

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    move-object/from16 v67, v5

    move-object/from16 v62, v15

    invoke-static/range {v62 .. v68}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    move-result-object v5

    if-nez v48, :cond_82

    move-object v6, v2

    goto :goto_4d

    :cond_82
    move-object/from16 v6, v48

    :goto_4d
    if-nez v47, :cond_83

    goto :goto_4e

    :cond_83
    move-object/from16 v2, v47

    :goto_4e
    const/16 v52, 0x0

    const/16 v53, 0x3e

    .line 313
    const-string v48, "+"

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    move-object/from16 v47, v9

    invoke-static/range {v47 .. v53}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    move-result-object v9

    .line 314
    invoke-virtual/range {v61 .. v61}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-nez v70, :cond_85

    if-eqz p1, :cond_84

    goto :goto_4f

    :cond_84
    const/4 v15, 0x0

    goto :goto_50

    :cond_85
    :goto_4f
    move/from16 v15, v39

    :goto_50
    const/16 v66, 0x0

    const/16 v67, 0x3e

    .line 315
    const-string v62, "+"

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    move-object/from16 v60, v1

    move-object/from16 v61, v69

    invoke-static/range {v61 .. v67}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v59, v8

    .line 316
    const-string v8, " itemIndex="

    move/from16 p1, v10

    const-string v10, " aid="

    move-object/from16 v24, v4

    move/from16 v47, v12

    move/from16 v39, v13

    move/from16 v13, v57

    move-object/from16 v12, v58

    move-object/from16 v4, p2

    .line 317
    invoke-static {v13, v12, v4, v8, v10}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 318
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " digg="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " durationMs="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v56

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ad="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " adEvidence="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " aiMedia="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " aigcInfo="

    const-string v2, " labelCount="

    .line 319
    invoke-static {v8, v7, v0, v11, v2}, Lnx;->Δ(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 320
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " live="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " liveEvidence="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " replay="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v47

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " ecomLive="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v39

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " summary="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v24

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 321
    invoke-static {v0}, Lc82;->ο(Ljava/lang/String;)V

    move/from16 v10, p1

    goto/16 :goto_49

    :goto_51
    move-wide/from16 v13, v36

    move/from16 v11, v38

    move/from16 v15, v40

    move-object/from16 v2, v44

    move-object/from16 v5, v55

    move-object/from16 v4, v59

    move-object/from16 v3, v60

    goto/16 :goto_6

    .line 322
    :cond_86
    invoke-static {}, Lyh;->х()V

    const/16 v23, 0x0

    throw v23

    :cond_87
    move-object/from16 v60, v3

    move-object/from16 v59, v4

    move-object/from16 v55, v5

    move/from16 v46, v7

    move/from16 v42, v8

    move/from16 v54, v9

    move/from16 v41, v10

    move-object v2, v12

    move-object v12, v13

    move-object/from16 v4, p2

    .line 323
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v1

    move-object/from16 v3, v55

    const/4 v13, 0x3

    .line 324
    invoke-static {v3, v13}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v14

    const/16 v19, 0x0

    const/16 v20, 0x3e

    const-string v15, ","

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v14 .. v20}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_88

    const-string v3, "none"

    .line 325
    :cond_88
    const-string v5, "|"

    .line 326
    invoke-static {v4, v5, v3}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 327
    sget-object v7, Lc82;->λ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    invoke-virtual {v7, v5}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_89

    goto :goto_52

    .line 328
    :cond_89
    const-string v5, " items="

    const-string v7, " direct="

    .line 329
    const-string v8, "compat source="

    invoke-static {v1, v8, v4, v5, v7}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 330
    const-string v5, " wrapped="

    const-string v7, " skipped="

    .line 331
    invoke-static {v1, v0, v5, v6, v7}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 332
    const-string v0, " adSignals="

    const-string v5, " liveSignals="

    move/from16 v7, v46

    move/from16 v9, v54

    .line 333
    invoke-static {v1, v9, v0, v7, v5}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    move/from16 v8, v42

    .line 334
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " types="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 335
    invoke-static {v0}, Lc82;->ο(Ljava/lang/String;)V

    :goto_52
    if-nez v41, :cond_8a

    goto/16 :goto_0

    .line 336
    :cond_8a
    sget-object v0, Lc82;->μ:Ljava/util/concurrent/atomic/AtomicInteger;

    move/from16 v10, v41

    invoke-virtual {v0, v10}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    .line 337
    invoke-virtual/range {v59 .. v59}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Ljava/lang/Iterable;

    new-instance v1, Lj72;

    const/4 v3, 0x7

    invoke-direct {v1, v3}, Lj72;-><init>(I)V

    const/16 v19, 0x1e

    const-string v14, ","

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v1

    invoke-static/range {v13 .. v19}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    move-result-object v1

    .line 338
    const-string v3, " removed="

    const-string v5, " total="

    .line 339
    invoke-static {v10, v12, v4, v3, v5}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 340
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc82;->ο(Ljava/lang/String;)V

    return-object v60

    :goto_53
    return-object v23
.end method

.method public static ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, ":"

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, "#"

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v1, Lc82;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Ljava/lang/reflect/Field;

    .line 48
    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_0
    sget-object v2, Lc82;->ε:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    const/4 v4, 0x0

    .line 59
    if-eqz v3, :cond_1

    .line 60
    .line 61
    return-object v4

    .line 62
    :cond_1
    :goto_0
    if-eqz p0, :cond_5

    .line 63
    .line 64
    const-class v3, Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-nez v3, :cond_5

    .line 71
    .line 72
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 73
    .line 74
    .line 75
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception v3

    .line 78
    new-instance v5, Leo1;

    .line 79
    .line 80
    invoke-direct {v5, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    move-object v3, v5

    .line 84
    :goto_1
    instance-of v5, v3, Leo1;

    .line 85
    .line 86
    if-eqz v5, :cond_2

    .line 87
    .line 88
    move-object v3, v4

    .line 89
    :cond_2
    check-cast v3, Ljava/lang/reflect/Field;

    .line 90
    .line 91
    if-eqz v3, :cond_4

    .line 92
    .line 93
    const/4 p0, 0x1

    .line 94
    :try_start_1
    invoke-virtual {v3, p0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :catchall_1
    move-exception p0

    .line 102
    new-instance v3, Leo1;

    .line 103
    .line 104
    invoke-direct {v3, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    :goto_2
    instance-of p0, v3, Leo1;

    .line 108
    .line 109
    if-eqz p0, :cond_3

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_3
    move-object v4, v3

    .line 113
    :goto_3
    check-cast v4, Ljava/lang/reflect/Field;

    .line 114
    .line 115
    return-object v4

    .line 116
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    goto :goto_0

    .line 121
    :cond_5
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    return-object v4
.end method

.method public static ζ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 3

    .line 1
    :goto_0
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    const-class v1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_3

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p0, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    new-instance v2, Leo1;

    .line 19
    .line 20
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object v1, v2

    .line 24
    :goto_1
    instance-of v2, v1, Leo1;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    move-object v1, v0

    .line 29
    :cond_0
    check-cast v1, Ljava/lang/reflect/Method;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catchall_1
    move-exception p0

    .line 49
    new-instance v1, Leo1;

    .line 50
    .line 51
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :goto_2
    instance-of p0, v1, Leo1;

    .line 55
    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_1
    move-object v0, v1

    .line 60
    :goto_3
    check-cast v0, Ljava/lang/reflect/Method;

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    return-object v0
.end method

.method public static η(Ljava/lang/ClassLoader;)V
    .locals 10

    .line 1
    invoke-static {p0}, Lc82;->ξ(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p0, "\u672a\u627e\u5230 FeedItemList\uff0c\u8df3\u8fc7\u89e3\u7801\u8fc7\u6ee4"

    .line 8
    .line 9
    invoke-static {p0}, Lc82;->ο(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string v1, "ADAPTER"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    const-string p0, "\u672a\u627e\u5230 FeedItemList.ADAPTER\uff0c\u8df3\u8fc7\u89e3\u7801\u8fc7\u6ee4"

    .line 22
    .line 23
    invoke-static {p0}, Lc82;->ο(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    const/4 v2, 0x0

    .line 28
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    new-instance v3, Leo1;

    .line 35
    .line 36
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object v1, v3

    .line 40
    :goto_0
    instance-of v3, v1, Leo1;

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move-object v2, v1

    .line 46
    :goto_1
    if-nez v2, :cond_3

    .line 47
    .line 48
    const-string p0, "FeedItemList.ADAPTER \u4e3a\u7a7a\uff0c\u8df3\u8fc7\u89e3\u7801\u8fc7\u6ee4"

    .line 49
    .line 50
    invoke-static {p0}, Lc82;->ο(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v2, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    array-length v3, v1

    .line 71
    const/4 v4, 0x0

    .line 72
    move v5, v4

    .line 73
    :goto_2
    const/4 v6, 0x1

    .line 74
    if-ge v5, v3, :cond_5

    .line 75
    .line 76
    aget-object v7, v1, v5

    .line 77
    .line 78
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    const-string v9, "decode"

    .line 83
    .line 84
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_4

    .line 89
    .line 90
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    array-length v8, v8

    .line 95
    if-ne v8, v6, :cond_4

    .line 96
    .line 97
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    aget-object v6, v6, v4

    .line 102
    .line 103
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    const-string v8, "com.squareup.wire.ProtoReader"

    .line 108
    .line 109
    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_4

    .line 114
    .line 115
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eqz v4, :cond_7

    .line 135
    .line 136
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    move-object v5, v4

    .line 141
    check-cast v5, Ljava/lang/reflect/Method;

    .line 142
    .line 143
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-virtual {v0, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_6

    .line 152
    .line 153
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_9

    .line 162
    .line 163
    new-instance v0, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    :cond_8
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_a

    .line 177
    .line 178
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    move-object v5, v4

    .line 183
    check-cast v5, Ljava/lang/reflect/Method;

    .line 184
    .line 185
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    const-class v7, Ljava/lang/Object;

    .line 190
    .line 191
    invoke-static {v5, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eqz v5, :cond_8

    .line 196
    .line 197
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_9
    move-object v0, v1

    .line 202
    :cond_a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    :cond_b
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    if-eqz v4, :cond_c

    .line 211
    .line 212
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    check-cast v4, Ljava/lang/reflect/Method;

    .line 217
    .line 218
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    sget-object v7, Lc82;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 226
    .line 227
    invoke-virtual {v7, v5}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    if-eqz v5, :cond_b

    .line 232
    .line 233
    :try_start_1
    invoke-virtual {v4, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 234
    .line 235
    .line 236
    sget-object v5, Lxq0;->α:Lxq0;

    .line 237
    .line 238
    new-instance v8, Lbm;

    .line 239
    .line 240
    const/16 v9, 0xc

    .line 241
    .line 242
    invoke-direct {v8, p0, v9}, Lbm;-><init>(Ljava/lang/ClassLoader;I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v4, v8}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 246
    .line 247
    .line 248
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 249
    goto :goto_6

    .line 250
    :catchall_1
    move-exception v5

    .line 251
    new-instance v8, Leo1;

    .line 252
    .line 253
    invoke-direct {v8, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 254
    .line 255
    .line 256
    move-object v5, v8

    .line 257
    :goto_6
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    if-eqz v5, :cond_b

    .line 262
    .line 263
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    invoke-virtual {v7, v4}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    new-instance v5, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    const-string v7, "Hook FeedItemList.decode \u5931\u8d25: "

    .line 277
    .line 278
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    invoke-static {v4}, Lc82;->ο(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_c
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 293
    .line 294
    .line 295
    move-result p0

    .line 296
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    const-string v2, ", \u5019\u9009="

    .line 305
    .line 306
    const-string v3, ", \u534f\u53d8\u8fd4\u56de="

    .line 307
    .line 308
    const-string v4, "Feed \u89e3\u7801\u8fc7\u6ee4\u5165\u53e3\u6570\u91cf="

    .line 309
    .line 310
    invoke-static {v4, p0, v2, v0, v3}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    invoke-static {p0}, Lc82;->ο(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    return-void
.end method

.method public static θ(Ljava/lang/ClassLoader;)V
    .locals 8

    .line 1
    invoke-static {p0}, Lc82;->ξ(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    array-length v2, v0

    .line 21
    const/4 v3, 0x0

    .line 22
    move v4, v3

    .line 23
    :goto_0
    const/4 v5, 0x1

    .line 24
    if-ge v4, v2, :cond_4

    .line 25
    .line 26
    aget-object v6, v0, v4

    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    array-length v7, v7

    .line 33
    if-ne v7, v5, :cond_3

    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    aget-object v5, v5, v3

    .line 40
    .line 41
    const-class v7, Ljava/util/List;

    .line 42
    .line 43
    invoke-virtual {v7, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    sget-object v5, Lc82;->ξ:Ljava/util/Set;

    .line 51
    .line 52
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const-string v7, "set"

    .line 71
    .line 72
    invoke-static {v5, v7, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_3

    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {v5, v7}, Lq02;->н(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-static {v5}, Lc82;->ν(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_3

    .line 94
    .line 95
    :goto_1
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_6

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Ljava/lang/reflect/Method;

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    sget-object v4, Lc82;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 125
    .line 126
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_5

    .line 131
    .line 132
    :try_start_0
    invoke-virtual {v2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 133
    .line 134
    .line 135
    sget-object v3, Lxq0;->α:Lxq0;

    .line 136
    .line 137
    new-instance v6, Lqg;

    .line 138
    .line 139
    invoke-direct {v6, p0, v2}, Lqg;-><init>(Ljava/lang/ClassLoader;Ljava/lang/reflect/Method;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, v2, v6}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 143
    .line 144
    .line 145
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    goto :goto_4

    .line 147
    :catchall_0
    move-exception v3

    .line 148
    new-instance v6, Leo1;

    .line 149
    .line 150
    invoke-direct {v6, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    move-object v3, v6

    .line 154
    :goto_4
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    if-eqz v3, :cond_5

    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    invoke-virtual {v4, v6}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    new-instance v4, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v6, "Hook FeedItemList."

    .line 178
    .line 179
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v2, " \u5931\u8d25: "

    .line 186
    .line 187
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-static {v2}, Lc82;->ο(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v1, "Feed \u5217\u8868 setter \u8fc7\u6ee4\u5165\u53e3\u6570\u91cf="

    .line 208
    .line 209
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    invoke-static {p0}, Lc82;->ο(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    return-void
.end method

.method public static ι(Ljava/lang/reflect/Method;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {p0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of p1, p0, Ljava/lang/Boolean;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    check-cast p0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    instance-of p1, p0, Ljava/lang/Number;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    check-cast p0, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    :cond_2
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    new-instance p1, Leo1;

    .line 41
    .line 42
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object p0, p1

    .line 46
    :goto_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 47
    .line 48
    instance-of v0, p0, Leo1;

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    move-object p0, p1

    .line 53
    :cond_3
    check-cast p0, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    return p0
.end method

.method public static κ(Ljava/lang/reflect/Method;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    new-instance p1, Leo1;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move-object p0, p1

    .line 17
    :goto_0
    instance-of p1, p0, Leo1;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object v0, p0

    .line 23
    :goto_1
    return-object v0
.end method

.method public static μ(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB94312960CB3988361C888C5F8DF84352F8137AD2E89AB98"

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
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, ".AwemeRawAd"

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-static {v0, v1, v2}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string v0, "AwemeRawAd"

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return v2

    .line 48
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 49
    return p0
.end method

.method public static ν(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-static {v0, p0, v0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lc82;->ν:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    const-string p0, "item"

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    const-string p0, "aweme"

    .line 25
    .line 26
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return v1

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public static ξ(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA58ED8F989CACF999AC69E217F86CE29F98764059103120"

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
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    :cond_0
    check-cast p0, Ljava/lang/Class;

    .line 26
    .line 27
    return-object p0
.end method

.method public static ο(Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    const-string v2, "r5fe961931870831e"

    .line 4
    .line 5
    invoke-static {v2, p0, v0, v1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static π(Ljava/lang/Object;Ljava/lang/reflect/Field;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    instance-of p1, p0, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    instance-of p1, p0, Ljava/lang/String;

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    const-string p1, "1"

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    check-cast p0, Ljava/lang/String;

    .line 42
    .line 43
    const-string p1, "true"

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_3

    .line 50
    .line 51
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :cond_3
    const/4 p0, 0x0

    .line 54
    return p0
.end method

.method public static ρ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    instance-of p1, p0, Ljava/lang/Boolean;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    check-cast p0, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    instance-of p1, p0, Ljava/lang/String;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    check-cast p0, Ljava/lang/String;

    .line 40
    .line 41
    const/16 p1, 0xa

    .line 42
    .line 43
    invoke-static {p0, p1}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_2
    const/4 p0, 0x0

    .line 49
    return-object p0
.end method

.method public static σ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    instance-of p1, p0, Ljava/lang/String;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    check-cast p0, Ljava/lang/String;

    .line 25
    .line 26
    const/16 p1, 0xa

    .line 27
    .line 28
    invoke-static {p0, p1}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public static varargs τ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Long;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    array-length v0, p1

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    aget-object v2, p1, v1

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-static {v3, v2}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {p0, v2}, Lc82;->σ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-object v2

    .line 28
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public static υ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lc82;->ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/CharSequence;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    check-cast p0, Ljava/lang/CharSequence;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v0

    .line 14
    :goto_0
    if-nez p0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static varargs φ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    array-length v0, p1

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    aget-object v2, p1, v1

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-static {v3, v2}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {p0, v2}, Lc82;->υ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-object v2

    .line 28
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public static χ(Ljava/lang/String;)Ljava/util/Set;
    .locals 5

    .line 1
    const-string v0, "[]"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Lws1;

    .line 13
    .line 14
    invoke-direct {p0}, Lws1;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    if-ge v2, v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v3}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-lez v4, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    const/4 v3, 0x0

    .line 47
    :goto_1
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0, v3}, Lws1;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget-object v0, p0, Lws1;->ε:Lzw0;

    .line 56
    .line 57
    invoke-virtual {v0}, Lzw0;->β()Lzw0;

    .line 58
    .line 59
    .line 60
    iget v0, v0, Lzw0;->ν:I

    .line 61
    .line 62
    if-lez v0, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    sget-object p0, Lws1;->ζ:Lws1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    new-instance v0, Leo1;

    .line 70
    .line 71
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move-object p0, v0

    .line 75
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-nez v0, :cond_4

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    sget-object p0, Lnz;->ε:Lnz;

    .line 83
    .line 84
    :goto_3
    check-cast p0, Ljava/util/Set;

    .line 85
    .line 86
    return-object p0
.end method

.method public static ψ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    new-instance p1, Leo1;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    move-object p0, p1

    .line 19
    :goto_0
    instance-of p1, p0, Leo1;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move-object v0, p0

    .line 25
    :cond_2
    :goto_1
    return-object v0
.end method


# virtual methods
.method public final α(Ljava/lang/Class;)La82;
    .locals 8

    .line 1
    new-instance v0, Luu1;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/16 v7, 0x9

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v3, Lc82;

    .line 8
    .line 9
    const-string v4, "buildAwemeMembers"

    .line 10
    .line 11
    const-string v5, "buildAwemeMembers(Ljava/lang/Class;)Lcom/example/dyhelper/hook/VideoFilterHook$AwemeMembers;"

    .line 12
    .line 13
    move-object v2, p0

    .line 14
    invoke-direct/range {v0 .. v7}, Luu1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 15
    .line 16
    .line 17
    new-instance p0, Lc8;

    .line 18
    .line 19
    const/16 v1, 0xf

    .line 20
    .line 21
    invoke-direct {p0, v0, v1}, Lc8;-><init>(La80;I)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Lc82;->ζ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast p0, La82;

    .line 34
    .line 35
    return-object p0
.end method

.method public final γ(Ljava/lang/Object;Ljava/lang/ClassLoader;)V
    .locals 9

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    const-string v0, "filter_enabled"

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Luu1;

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    const/16 v8, 0xa

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    const-class v4, Lc82;

    .line 27
    .line 28
    const-string v5, "buildFeedListMembers"

    .line 29
    .line 30
    const-string v6, "buildFeedListMembers(Ljava/lang/Class;)Lcom/example/dyhelper/hook/VideoFilterHook$FeedListMembers;"

    .line 31
    .line 32
    move-object v3, p0

    .line 33
    invoke-direct/range {v1 .. v8}, Luu1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 34
    .line 35
    .line 36
    new-instance p0, Lc8;

    .line 37
    .line 38
    const/16 v2, 0xd

    .line 39
    .line 40
    invoke-direct {p0, v1, v2}, Lc8;-><init>(La80;I)V

    .line 41
    .line 42
    .line 43
    sget-object v1, Lc82;->η:Ljava/util/concurrent/ConcurrentHashMap;

    .line 44
    .line 45
    invoke-virtual {v1, v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    check-cast p0, Lb82;

    .line 53
    .line 54
    iget-object p0, p0, Lb82;->α:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    move-object v1, v0

    .line 71
    check-cast v1, Ljava/lang/reflect/Field;

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    instance-of v3, v0, Ljava/util/List;

    .line 79
    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    move-object v0, v2

    .line 88
    goto :goto_2

    .line 89
    :goto_1
    new-instance v3, Leo1;

    .line 90
    .line 91
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    move-object v0, v3

    .line 95
    :goto_2
    instance-of v3, v0, Leo1;

    .line 96
    .line 97
    if-eqz v3, :cond_2

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_2
    move-object v2, v0

    .line 101
    :goto_3
    check-cast v2, Ljava/util/List;

    .line 102
    .line 103
    if-nez v2, :cond_3

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_3
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-instance v3, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v4, "decode:"

    .line 113
    .line 114
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v2, p2, v0}, Lc82;->δ(Ljava/util/List;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-nez v0, :cond_4

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_4
    :try_start_1
    invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object v0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :catchall_1
    move-exception v0

    .line 138
    new-instance v2, Leo1;

    .line 139
    .line 140
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    move-object v0, v2

    .line 144
    :goto_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_0

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    new-instance v2, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    const-string v3, "\u5199\u56de "

    .line 161
    .line 162
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v1, " \u5931\u8d25: "

    .line 169
    .line 170
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, Lc82;->ο(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_5
    return-void
.end method

.method public final λ(Ljava/lang/Class;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_4

    .line 11
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lc82;->α(Ljava/lang/Class;)La82;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p1, p0, La82;->ζ:Ljava/lang/reflect/Field;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    if-nez p1, :cond_2

    .line 23
    .line 24
    iget-object p1, p0, La82;->Ι:Ljava/lang/reflect/Field;

    .line 25
    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    iget-object p1, p0, La82;->Ζ:Ljava/lang/reflect/Field;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move p1, p2

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    :goto_0
    move p1, v0

    .line 36
    :goto_1
    iget-object v1, p0, La82;->α:Ljava/lang/reflect/Field;

    .line 37
    .line 38
    if-nez v1, :cond_4

    .line 39
    .line 40
    iget-object v1, p0, La82;->β:Ljava/lang/reflect/Field;

    .line 41
    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    iget-object v1, p0, La82;->ε:Ljava/lang/reflect/Field;

    .line 45
    .line 46
    if-nez v1, :cond_4

    .line 47
    .line 48
    iget-object v1, p0, La82;->Κ:Ljava/lang/reflect/Field;

    .line 49
    .line 50
    if-nez v1, :cond_4

    .line 51
    .line 52
    iget-object p0, p0, La82;->η:Ljava/lang/reflect/Field;

    .line 53
    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    move p0, p2

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    :goto_2
    move p0, v0

    .line 60
    :goto_3
    if-eqz p1, :cond_5

    .line 61
    .line 62
    if-eqz p0, :cond_5

    .line 63
    .line 64
    :goto_4
    return v0

    .line 65
    :cond_5
    return p2
.end method
