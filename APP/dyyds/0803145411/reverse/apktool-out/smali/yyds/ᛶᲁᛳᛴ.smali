.class public abstract Lyyds/ᛶᲁᛳᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Ljava/util/LinkedHashMap;

.field public static final ᛵᛸᛸᛷ:I

.field public static final ᲀᛲᛳᲀ:I

.field public static final ᲇᲈᛵᛷ:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛶᲁᛳᛴ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    const-wide v0, -0x2791fe68a836eL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    sput v0, Lyyds/ᛶᲁᛳᛴ;->ᛵᛸᛸᛷ:I

    .line 22
    .line 23
    const-wide v0, -0x2792fe68a836eL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sput v0, Lyyds/ᛶᲁᛳᛴ;->ᲀᛲᛳᲀ:I

    .line 37
    .line 38
    const-wide v0, -0x27942e68a836eL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    sput v0, Lyyds/ᛶᲁᛳᛴ;->ᲇᲈᛵᛷ:I

    .line 52
    .line 53
    return-void
.end method

.method public static ᛱᲈᲁ(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;
    .locals 4

    .line 1
    const-wide v0, -0x276bee68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const-wide v2, -0x276c5e68a836eL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v1, p1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move-object p1, v0

    .line 51
    :goto_0
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static ᛲᛲᲈᲈ(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lyyds/ᛶᲁᛳᛴ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Landroid/view/ViewTreeObserver$OnDrawListener;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0, v2}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static ᛲᛳᛶᲁ(Landroid/view/View;Lyyds/ᛷᛴᲈᲀ;)V
    .locals 5

    .line 1
    const-wide v0, -0x276a1e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x276a8e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, p0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    check-cast p0, Landroid/view/ViewGroup;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_0
    if-ge v1, v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-wide v3, -0x276aee68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-static {v2, p1}, Lyyds/ᛶᲁᛳᛴ;->ᛲᛳᛶᲁ(Landroid/view/View;Lyyds/ᛷᛴᲈᲀ;)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    return-void
.end method

.method public static ᛲᛴᛳᛲ(Landroid/app/Activity;Z)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide v0, -0x27770e68a836eL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    const-wide v0, -0x27769e68a836eL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    const/16 v0, 0x2000

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public static ᛲᲈᲁ(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-static {p0}, Lyyds/ᛶᲁᛳᛴ;->ᛲᛲᲈᲈ(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    move-object v0, p0

    .line 5
    check-cast v0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Lyyds/ᛱᛷᛸᲈ;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v3, Lyyds/ᛱᛷᛸᲈ;

    .line 21
    .line 22
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v4, Lyyds/ᛴᛴᛳᲀ;

    .line 26
    .line 27
    invoke-direct {v4, p0, v3, v0, v2}, Lyyds/ᛴᛴᛳᲀ;-><init>(Landroid/view/View;Lyyds/ᛱᛷᛸᲈ;Landroid/view/ViewGroup;Lyyds/ᛱᛷᛸᲈ;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lyyds/ᛶᲁᛳᛴ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-interface {p0, v1, v4}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Landroid/view/ViewTreeObserver$OnDrawListener;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static ᛵᛸᛸᛷ(Landroid/content/Context;Landroid/view/View;)Z
    .locals 7

    .line 1
    const-wide v0, -0x2779fe68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x277a7e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    sget-object v0, Lyyds/ᲈᛳᛱᛲ;->ᛲᲈᲁ:Lyyds/ᲈᛳᛱᛲ;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lyyds/ᲈᛳᛱᛲ;->ᛲᛳᛴᛸ()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    sget v3, Lyyds/ᲁᛸᛵᲁ;->ᛲᲈᲁ:I

    .line 31
    .line 32
    invoke-static {v0}, Lyyds/ᛲᲇᲁᛳ;->ᛷᛵᲇᲀ(Ljava/lang/Object;)Lyyds/ᲀᛵᲁᛴ;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lyyds/ᲀᛵᲁᛴ;->ᛶᲈᛴᲈ()Lyyds/ᛵᲀᲀᛶ;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-wide v3, -0x27a7de68a836eL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iput-object v3, v0, Lyyds/ᲇᛴᲇᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v0}, Lyyds/ᛵᲀᲀᛶ;->ᛲᲈᲁ()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lyyds/ᛷᛷᛶᲇ;->ᛸᛸᛷᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lyyds/ᛳᛲᛶᛴ;

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    new-array v3, v1, [Ljava/lang/Object;

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Lyyds/ᛳᛲᛶᛴ;->ᲀᛲᛱᛱ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move-object v0, v2

    .line 71
    :goto_0
    if-eqz v0, :cond_1

    .line 72
    .line 73
    sget v3, Lyyds/ᲁᛸᛵᲁ;->ᛲᲈᲁ:I

    .line 74
    .line 75
    invoke-static {v0}, Lyyds/ᛲᲇᲁᛳ;->ᛷᛵᲇᲀ(Ljava/lang/Object;)Lyyds/ᲀᛵᲁᛴ;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lyyds/ᲀᛵᲁᛴ;->ᲀᛲᛲᲇ()Lyyds/ᛴᛲᛶᛶ;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-wide v3, -0x27a74e68a836eL

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    iput-object v3, v0, Lyyds/ᲇᛴᲇᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v0}, Lyyds/ᛴᛲᛶᛶ;->ᛲᲈᲁ()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0}, Lyyds/ᛷᛷᛶᲇ;->ᛸᛸᛷᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Lyyds/ᛷᛵᛶᛳ;

    .line 103
    .line 104
    if-eqz v0, :cond_1

    .line 105
    .line 106
    invoke-virtual {v0}, Lyyds/ᛷᛵᛶᛳ;->ᛸᛸᛷᛱ()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Ljava/lang/String;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    move-object v0, v2

    .line 114
    :goto_1
    invoke-static {}, Lyyds/ᲈᛳᛱᛲ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-static {}, Lyyds/ᲈᛳᛱᛲ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    const-wide v5, -0x27a4fe68a836eL

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_2

    .line 136
    .line 137
    sget-object p1, Lyyds/ᲈᛲᛴᛸ;->ᛲᲈᲁ:Lyyds/ᛱᛲᛶᛱ;

    .line 138
    .line 139
    const-wide v2, -0x277ace68a836eL

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-static {p0, p1}, Lyyds/ᲈᛲᛴᛸ;->ᛲᲈᲁ(Landroid/content/Context;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return v1

    .line 152
    :cond_2
    if-nez v0, :cond_3

    .line 153
    .line 154
    const-wide v0, -0x277b3e68a836eL

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    :cond_3
    const-wide v4, -0x2777fe68a836eL

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    const-wide v4, -0x27786e68a836eL

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    const-wide v4, -0x2778ee68a836eL

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    const-wide v4, -0x27797e68a836eL

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    const p0, 0x660905a4

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    instance-of v4, v1, Lyyds/ᛱᛷᲁ;

    .line 203
    .line 204
    if-eqz v4, :cond_4

    .line 205
    .line 206
    move-object v2, v1

    .line 207
    check-cast v2, Lyyds/ᛱᛷᲁ;

    .line 208
    .line 209
    :cond_4
    const/4 v1, 0x1

    .line 210
    if-eqz v2, :cond_5

    .line 211
    .line 212
    const-wide v4, -0x214d1e68a836eL

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    const-wide v4, -0x214dae68a836eL

    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    iget-object v4, v2, Lyyds/ᛱᛷᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-eqz v4, :cond_5

    .line 235
    .line 236
    iget-object v4, v2, Lyyds/ᛱᛷᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    if-eqz v4, :cond_5

    .line 243
    .line 244
    iget-object p0, v2, Lyyds/ᛱᛷᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛶᛷᛲ;

    .line 245
    .line 246
    invoke-virtual {p0, p1}, Lyyds/ᲈᛶᛷᛲ;->ᛲᲈᲁ(Landroid/view/View;)V

    .line 247
    .line 248
    .line 249
    return v1

    .line 250
    :cond_5
    if-eqz v2, :cond_6

    .line 251
    .line 252
    invoke-virtual {p1}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    iget-object v5, v2, Lyyds/ᛱᛷᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛶᛷᛲ;

    .line 257
    .line 258
    invoke-virtual {v4, v5}, Landroid/view/ViewOverlay;->remove(Landroid/graphics/drawable/Drawable;)V

    .line 259
    .line 260
    .line 261
    iget-object v2, v2, Lyyds/ᛱᛷᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲀᛵᛶᲇ;

    .line 262
    .line 263
    invoke-virtual {p1, v2}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 264
    .line 265
    .line 266
    :cond_6
    new-instance v2, Lyyds/ᲈᛶᛷᛲ;

    .line 267
    .line 268
    invoke-direct {v2, v0, v3}, Lyyds/ᲈᛶᛷᛲ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    new-instance v4, Lyyds/ᲀᛵᛶᲇ;

    .line 272
    .line 273
    const/4 v5, 0x2

    .line 274
    invoke-direct {v4, v5, v2}, Lyyds/ᲀᛵᛶᲇ;-><init>(ILjava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    new-instance v5, Lyyds/ᛱᛷᲁ;

    .line 278
    .line 279
    invoke-direct {v5, v0, v3, v2, v4}, Lyyds/ᛱᛷᲁ;-><init>(Ljava/lang/String;Ljava/lang/String;Lyyds/ᲈᛶᛷᛲ;Lyyds/ᲀᛵᛶᲇ;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1, p0, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1, v4}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, p1}, Lyyds/ᲈᛶᛷᛲ;->ᛲᲈᲁ(Landroid/view/View;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    invoke-virtual {p0, v2}, Landroid/view/ViewOverlay;->add(Landroid/graphics/drawable/Drawable;)V

    .line 296
    .line 297
    .line 298
    new-instance p0, Lyyds/ᲈᛷᛲᛸ;

    .line 299
    .line 300
    const/16 v0, 0xe

    .line 301
    .line 302
    invoke-direct {p0, v2, v0, p1}, Lyyds/ᲈᛷᛲᛸ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 306
    .line 307
    .line 308
    return v1
.end method

.method public static ᛶᛷᛲᲁ(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;
    .locals 4

    .line 1
    const-wide v0, -0x2775fe68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-ge v1, v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    return-object v2

    .line 38
    :cond_1
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 39
    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    check-cast v2, Landroid/view/ViewGroup;

    .line 43
    .line 44
    invoke-static {v2, p1}, Lyyds/ᛶᲁᛳᛴ;->ᛶᛷᛲᲁ(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method

.method public static ᛷᛲᲈᛱ(Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, p0

    .line 16
    :goto_0
    check-cast v0, Landroid/view/ViewGroup;

    .line 17
    .line 18
    :cond_1
    return-object v0
.end method

.method public static ᛷᛵᲇᲀ(Landroid/view/MotionEvent;Landroid/content/Context;)I
    .locals 7

    .line 1
    const-wide v0, -0x27744e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x2774be68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 36
    .line 37
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛷᲇᛲᛱ()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/16 v2, 0x9

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x3

    .line 51
    const/4 v6, 0x2

    .line 52
    if-ne v1, v2, :cond_4

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawX()F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    div-int/lit8 v2, v0, 0x3

    .line 59
    .line 60
    int-to-float v2, v2

    .line 61
    cmpg-float v1, v1, v2

    .line 62
    .line 63
    if-gez v1, :cond_0

    .line 64
    .line 65
    move v0, v4

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawX()F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    mul-int/2addr v0, v6

    .line 72
    div-int/2addr v0, v5

    .line 73
    int-to-float v0, v0

    .line 74
    cmpg-float v0, v1, v0

    .line 75
    .line 76
    if-gez v0, :cond_1

    .line 77
    .line 78
    move v0, v3

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    move v0, v6

    .line 81
    :goto_0
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    div-int/lit8 v2, p1, 0x3

    .line 86
    .line 87
    int-to-float v2, v2

    .line 88
    cmpg-float v1, v1, v2

    .line 89
    .line 90
    if-gez v1, :cond_2

    .line 91
    .line 92
    move v3, v4

    .line 93
    goto :goto_1

    .line 94
    :cond_2
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    mul-int/2addr p1, v6

    .line 99
    div-int/2addr p1, v5

    .line 100
    int-to-float p1, p1

    .line 101
    cmpg-float p0, p0, p1

    .line 102
    .line 103
    if-gez p0, :cond_3

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    move v3, v6

    .line 107
    :goto_1
    mul-int/2addr v3, v5

    .line 108
    add-int/2addr v3, v0

    .line 109
    return v3

    .line 110
    :cond_4
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawX()F

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    div-int/2addr v0, v6

    .line 115
    int-to-float v0, v0

    .line 116
    cmpg-float v0, v1, v0

    .line 117
    .line 118
    if-gez v0, :cond_5

    .line 119
    .line 120
    move v0, v3

    .line 121
    goto :goto_2

    .line 122
    :cond_5
    move v0, v4

    .line 123
    :goto_2
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    div-int/2addr p1, v6

    .line 128
    int-to-float p1, p1

    .line 129
    cmpg-float p0, p0, p1

    .line 130
    .line 131
    if-gez p0, :cond_6

    .line 132
    .line 133
    move p0, v3

    .line 134
    goto :goto_3

    .line 135
    :cond_6
    move p0, v4

    .line 136
    :goto_3
    if-eqz v0, :cond_7

    .line 137
    .line 138
    if-eqz p0, :cond_7

    .line 139
    .line 140
    return v4

    .line 141
    :cond_7
    if-nez v0, :cond_8

    .line 142
    .line 143
    if-eqz p0, :cond_8

    .line 144
    .line 145
    return v3

    .line 146
    :cond_8
    if-eqz v0, :cond_9

    .line 147
    .line 148
    if-nez p0, :cond_9

    .line 149
    .line 150
    return v6

    .line 151
    :cond_9
    return v5
.end method

.method public static ᛷᲈᲈᲁ(I)I
    .locals 1

    .line 1
    int-to-float p0, p0

    .line 2
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 11
    .line 12
    mul-float/2addr p0, v0

    .line 13
    float-to-int p0, p0

    .line 14
    return p0
.end method

.method public static ᲀᛲᛳᲀ(Landroid/content/Context;F)I
    .locals 2

    .line 1
    const-wide v0, -0x27864e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 18
    .line 19
    mul-float/2addr p1, p0

    .line 20
    const/high16 p0, 0x3f000000    # 0.5f

    .line 21
    .line 22
    add-float/2addr p1, p0

    .line 23
    float-to-int p0, p1

    .line 24
    return p0
.end method

.method public static ᲇᲇᲇᛱ(Landroid/view/View;)Landroid/view/View;
    .locals 5

    .line 1
    const-wide v0, -0x2764ce68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-class v0, Landroid/widget/SeekBar;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    check-cast p0, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-ge v1, v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-wide v3, -0x27653e68a836eL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-static {v2}, Lyyds/ᛶᲁᛳᛴ;->ᲇᲇᲇᛱ(Landroid/view/View;)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 p0, 0x0

    .line 54
    return-object p0
.end method

.method public static ᲇᲈᛵᛷ(Landroid/content/Context;I)I
    .locals 2

    .line 1
    const-wide v0, -0x27710e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    int-to-float p1, p1

    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 19
    .line 20
    mul-float/2addr p1, p0

    .line 21
    float-to-int p0, p1

    .line 22
    return p0
.end method
