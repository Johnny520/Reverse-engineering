.class public final Lq10;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lq10;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Landroid/os/Handler;

.field public static final δ:Ljava/util/Map;

.field public static final ε:Ljava/util/Map;

.field public static volatile ζ:Ljava/lang/reflect/Field;

.field public static volatile η:Ljava/lang/reflect/Field;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lq10;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq10;->α:Lq10;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lq10;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Landroid/os/Handler;

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lq10;->γ:Landroid/os/Handler;

    .line 26
    .line 27
    new-instance v0, Ljava/util/WeakHashMap;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lq10;->δ:Ljava/util/Map;

    .line 37
    .line 38
    new-instance v0, Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lq10;->ε:Ljava/util/Map;

    .line 48
    .line 49
    return-void
.end method

.method public static final α(Lq10;Landroid/view/View;Landroid/view/View$OnClickListener;)V
    .locals 3

    .line 1
    const/4 p0, 0x0

    .line 2
    move-object v0, p1

    .line 3
    :goto_0
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    const/16 v2, 0x10

    .line 7
    .line 8
    if-gt p0, v2, :cond_2

    .line 9
    .line 10
    sget-object v2, Lq10;->δ:Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    new-instance v1, Ll91;

    .line 21
    .line 22
    invoke-direct {v1, v0, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    instance-of v2, v0, Landroid/view/View;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    check-cast v0, Landroid/view/View;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object v0, v1

    .line 38
    :goto_1
    add-int/lit8 p0, p0, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_2
    if-nez v1, :cond_3

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_3
    iget-object p0, v1, Ll91;->ε:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Landroid/view/View;

    .line 47
    .line 48
    iget-object v0, v1, Ll91;->ζ:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, p1, p2, p0}, Lq10;->μ(Ljava/lang/String;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/view/View;)Lo10;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-nez v0, :cond_4

    .line 57
    .line 58
    :goto_3
    return-void

    .line 59
    :cond_4
    invoke-static {p1, p0, v0, p2}, Lq10;->β(Landroid/view/View;Landroid/view/View;Lo10;Landroid/view/View$OnClickListener;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static β(Landroid/view/View;Landroid/view/View;Lo10;Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 1
    sget-object v0, Lq10;->ε:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    new-instance p3, Lp10;

    .line 21
    .line 22
    invoke-direct {p3, p2, v1, p1}, Lp10;-><init>(Lo10;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, p0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object p1, Lo10;->λ:Lo10;

    .line 29
    .line 30
    if-ne p2, p1, :cond_3

    .line 31
    .line 32
    const-string p1, "follow"

    .line 33
    .line 34
    invoke-static {}, Lui1;->Α()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_3

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, Lui1;->ω(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    new-instance p2, Leo1;

    .line 51
    .line 52
    invoke-direct {p2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object p1, p2

    .line 56
    :goto_1
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    instance-of p3, p1, Leo1;

    .line 59
    .line 60
    if-eqz p3, :cond_1

    .line 61
    .line 62
    move-object p1, p2

    .line 63
    :cond_1
    check-cast p1, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    new-instance p1, Lhb;

    .line 72
    .line 73
    const/16 p2, 0xd

    .line 74
    .line 75
    invoke-direct {p1, p0, p2}, Lhb;-><init>(Landroid/view/View;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    invoke-static {p2, p3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_2

    .line 91
    .line 92
    invoke-virtual {p1}, Lhb;->invoke()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    new-instance p2, Lν;

    .line 97
    .line 98
    const/16 p3, 0xc

    .line 99
    .line 100
    invoke-direct {p2, p3, p1}, Lν;-><init>(ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 104
    .line 105
    .line 106
    :cond_3
    :goto_2
    return-void
.end method

.method public static final γ(Lsm1;Ljava/lang/String;Landroid/view/View;Landroid/view/View;I)V
    .locals 4

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    if-gt p4, v0, :cond_4

    .line 4
    .line 5
    iget v0, p0, Lsm1;->ε:I

    .line 6
    .line 7
    const/16 v1, 0xf0

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    iput v0, p0, Lsm1;->ε:I

    .line 15
    .line 16
    invoke-static {p3}, Lq10;->λ(Landroid/view/View;)Landroid/view/View$OnClickListener;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p3}, Landroid/view/View;->hasOnClickListeners()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p3}, Landroid/view/View;->isClickable()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    :cond_1
    invoke-static {p1, p3, v0, p2}, Lq10;->μ(Ljava/lang/String;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/view/View;)Lo10;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-static {p3, p2, v1, v0}, Lq10;->β(Landroid/view/View;Landroid/view/View;Lo10;Landroid/view/View$OnClickListener;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    instance-of v0, p3, Landroid/view/ViewGroup;

    .line 44
    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    check-cast p3, Landroid/view/ViewGroup;

    .line 49
    .line 50
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x0

    .line 55
    :goto_0
    if-ge v1, v0, :cond_4

    .line 56
    .line 57
    invoke-virtual {p3, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    add-int/lit8 v3, p4, 0x1

    .line 65
    .line 66
    invoke-static {p0, p1, p2, v2, v3}, Lq10;->γ(Lsm1;Ljava/lang/String;Landroid/view/View;Landroid/view/View;I)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    :goto_1
    return-void
.end method

.method public static δ(Landroid/view/View$OnClickListener;)Ljava/util/LinkedHashSet;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {v1, v0, p0, v2}, Lq10;->ε(Ljava/util/Set;Ljava/util/LinkedHashSet;Landroid/view/View$OnClickListener;I)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public static final ε(Ljava/util/Set;Ljava/util/LinkedHashSet;Landroid/view/View$OnClickListener;I)V
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    if-gt p3, v0, :cond_5

    .line 3
    .line 4
    invoke-interface {p0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_3

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    :goto_0
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const-class v2, Ljava/lang/Object;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    invoke-static {v0, v1}, Llz1;->ι(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/16 v0, 0x10

    .line 48
    .line 49
    invoke-static {v1, v0}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_5

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/reflect/Field;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_2

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-interface {p1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    const/4 v2, 0x1

    .line 102
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    goto :goto_2

    .line 110
    :catchall_0
    move-exception v1

    .line 111
    new-instance v3, Leo1;

    .line 112
    .line 113
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    move-object v1, v3

    .line 117
    :goto_2
    instance-of v3, v1, Leo1;

    .line 118
    .line 119
    if-eqz v3, :cond_4

    .line 120
    .line 121
    const/4 v1, 0x0

    .line 122
    :cond_4
    instance-of v3, v1, Landroid/view/View$OnClickListener;

    .line 123
    .line 124
    if-eqz v3, :cond_2

    .line 125
    .line 126
    add-int/2addr v2, p3

    .line 127
    check-cast v1, Landroid/view/View$OnClickListener;

    .line 128
    .line 129
    invoke-static {p0, p1, v1, v2}, Lq10;->ε(Ljava/util/Set;Ljava/util/LinkedHashSet;Landroid/view/View$OnClickListener;I)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_5
    :goto_3
    return-void
.end method

.method public static ζ(Landroid/view/View;)Landroid/view/View;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x0

    .line 3
    if-eqz p0, :cond_4

    .line 4
    .line 5
    const/16 v2, 0x14

    .line 6
    .line 7
    if-gt v0, v2, :cond_4

    .line 8
    .line 9
    const-string v2, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F03474AEFAA0D9A94E4C21F0622A378CF61B87F8A576C81A592CCB282165A7"

    .line 10
    .line 11
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :goto_1
    if-eqz v3, :cond_1

    .line 20
    .line 21
    const-class v4, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_1

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v3, "VideoViewHolderRootView"

    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    invoke-static {v2, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    :goto_2
    return-object p0

    .line 63
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    instance-of v2, p0, Landroid/view/View;

    .line 68
    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    check-cast p0, Landroid/view/View;

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    move-object p0, v1

    .line 75
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    return-object v1
.end method

.method public static final η(Lqm1;Lsm1;Landroid/view/View;I)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lqm1;->ε:Z

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    if-gt p3, v0, :cond_5

    .line 8
    .line 9
    iget v0, p1, Lsm1;->ε:I

    .line 10
    .line 11
    const/16 v1, 0xf0

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_0
    const/4 v1, 0x1

    .line 17
    add-int/2addr v0, v1

    .line 18
    iput v0, p1, Lsm1;->ε:I

    .line 19
    .line 20
    invoke-static {p2}, Lq10;->λ(Landroid/view/View;)Landroid/view/View$OnClickListener;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/view/View;->hasOnClickListeners()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    check-cast p2, Landroid/view/ViewGroup;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/4 p2, 0x0

    .line 41
    :goto_0
    if-nez p2, :cond_3

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_3
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/4 v2, 0x0

    .line 49
    :goto_1
    if-ge v2, v0, :cond_5

    .line 50
    .line 51
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    add-int/lit8 v4, p3, 0x1

    .line 59
    .line 60
    invoke-static {p0, p1, v3, v4}, Lq10;->η(Lqm1;Lsm1;Landroid/view/View;I)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    :goto_2
    iput-boolean v1, p0, Lqm1;->ε:Z

    .line 67
    .line 68
    :cond_5
    :goto_3
    return-void
.end method

.method public static ι(Landroid/view/View;Landroid/view/View;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-eqz p0, :cond_2

    .line 4
    .line 5
    const/16 v2, 0x28

    .line 6
    .line 7
    if-gt v1, v2, :cond_2

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    instance-of v2, p0, Landroid/view/View;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    check-cast p0, Landroid/view/View;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    return v0
.end method

.method public static κ(Landroid/app/Activity;Lo10;)Z
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v3, 0xf

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    sget-object v2, Lq10;->γ:Landroid/os/Handler;

    .line 23
    .line 24
    new-instance v5, Lw1;

    .line 25
    .line 26
    invoke-direct {v5, v0, v3, v1}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    return v4

    .line 33
    :cond_0
    sget-object v2, Lq10;->δ:Ljava/util/Map;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    monitor-enter v2

    .line 39
    :try_start_0
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Ljava/lang/Iterable;

    .line 44
    .line 45
    new-instance v6, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/16 v7, 0xa

    .line 48
    .line 49
    invoke-static {v5, v7}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_1

    .line 65
    .line 66
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    check-cast v8, Ljava/util/Map$Entry;

    .line 71
    .line 72
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    new-instance v10, Ll91;

    .line 81
    .line 82
    invoke-direct {v10, v9, v8}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    goto/16 :goto_25

    .line 91
    .line 92
    :cond_1
    monitor-exit v2

    .line 93
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    const/4 v6, 0x4

    .line 102
    const/4 v8, 0x0

    .line 103
    if-eqz v5, :cond_9

    .line 104
    .line 105
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, Ll91;

    .line 110
    .line 111
    iget-object v9, v5, Ll91;->ε:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v9, Landroid/view/View;

    .line 114
    .line 115
    iget-object v5, v5, Ll91;->ζ:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v5, Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-eqz v10, :cond_8

    .line 127
    .line 128
    if-eq v10, v4, :cond_7

    .line 129
    .line 130
    const/4 v11, 0x2

    .line 131
    if-eq v10, v11, :cond_6

    .line 132
    .line 133
    const/4 v11, 0x3

    .line 134
    if-eq v10, v11, :cond_5

    .line 135
    .line 136
    if-eq v10, v6, :cond_4

    .line 137
    .line 138
    const/4 v6, 0x5

    .line 139
    if-ne v10, v6, :cond_3

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    invoke-static {}, Lγ;->κ()V

    .line 143
    .line 144
    .line 145
    return v8

    .line 146
    :cond_4
    :goto_2
    const-string v6, "avatar"

    .line 147
    .line 148
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    goto :goto_3

    .line 153
    :cond_5
    const-string v6, "share"

    .line 154
    .line 155
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    goto :goto_3

    .line 160
    :cond_6
    const-string v6, "collect"

    .line 161
    .line 162
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    goto :goto_3

    .line 167
    :cond_7
    const-string v6, "comment"

    .line 168
    .line 169
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    goto :goto_3

    .line 174
    :cond_8
    const-string v6, "digg"

    .line 175
    .line 176
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    :goto_3
    if-eqz v6, :cond_2

    .line 181
    .line 182
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    new-instance v6, Lsm1;

    .line 186
    .line 187
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-static {v6, v5, v9, v9, v8}, Lq10;->γ(Lsm1;Ljava/lang/String;Landroid/view/View;Landroid/view/View;I)V

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_9
    sget-object v2, Lpq;->α:Lpq;

    .line 195
    .line 196
    invoke-static {}, Lpq;->β()Lkq;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const/4 v5, 0x0

    .line 201
    if-nez v2, :cond_b

    .line 202
    .line 203
    :cond_a
    :goto_4
    move-object v9, v5

    .line 204
    goto :goto_8

    .line 205
    :cond_b
    iget-object v9, v2, Lkq;->γ:Landroid/view/View;

    .line 206
    .line 207
    if-nez v9, :cond_d

    .line 208
    .line 209
    iget-object v2, v2, Lkq;->α:Ljava/lang/Object;

    .line 210
    .line 211
    instance-of v9, v2, Landroid/view/View;

    .line 212
    .line 213
    if-eqz v9, :cond_c

    .line 214
    .line 215
    check-cast v2, Landroid/view/View;

    .line 216
    .line 217
    move-object v9, v2

    .line 218
    goto :goto_5

    .line 219
    :cond_c
    move-object v9, v5

    .line 220
    :goto_5
    if-nez v9, :cond_d

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_d
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    :goto_6
    instance-of v10, v2, Landroid/app/Activity;

    .line 228
    .line 229
    if-eqz v10, :cond_e

    .line 230
    .line 231
    check-cast v2, Landroid/app/Activity;

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_e
    instance-of v10, v2, Landroid/content/ContextWrapper;

    .line 235
    .line 236
    if-eqz v10, :cond_f

    .line 237
    .line 238
    check-cast v2, Landroid/content/ContextWrapper;

    .line 239
    .line 240
    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    goto :goto_6

    .line 245
    :cond_f
    move-object v2, v5

    .line 246
    :goto_7
    if-eq v2, v0, :cond_10

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_10
    invoke-virtual {v9}, Landroid/view/View;->isAttachedToWindow()Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-eqz v2, :cond_a

    .line 254
    .line 255
    invoke-virtual {v9}, Landroid/view/View;->isShown()Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-nez v2, :cond_11

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_11
    new-instance v2, Landroid/graphics/Rect;

    .line 263
    .line 264
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v9, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    if-eqz v10, :cond_a

    .line 272
    .line 273
    invoke-virtual {v2}, Landroid/graphics/Rect;->isEmpty()Z

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    if-eqz v2, :cond_12

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_12
    :goto_8
    sget-object v2, Lq10;->δ:Ljava/util/Map;

    .line 281
    .line 282
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    monitor-enter v2

    .line 286
    :try_start_1
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 287
    .line 288
    .line 289
    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 290
    monitor-exit v2

    .line 291
    sget-object v2, Lq10;->ε:Ljava/util/Map;

    .line 292
    .line 293
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    monitor-enter v2

    .line 297
    :try_start_2
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    check-cast v11, Ljava/lang/Iterable;

    .line 302
    .line 303
    instance-of v12, v11, Ljava/util/Collection;

    .line 304
    .line 305
    if-eqz v12, :cond_13

    .line 306
    .line 307
    move-object v12, v11

    .line 308
    check-cast v12, Ljava/util/Collection;

    .line 309
    .line 310
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 311
    .line 312
    .line 313
    move-result v12

    .line 314
    if-eqz v12, :cond_13

    .line 315
    .line 316
    move v12, v8

    .line 317
    goto :goto_b

    .line 318
    :catchall_1
    move-exception v0

    .line 319
    goto/16 :goto_24

    .line 320
    .line 321
    :cond_13
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 322
    .line 323
    .line 324
    move-result-object v11

    .line 325
    move v12, v8

    .line 326
    :cond_14
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result v13

    .line 330
    if-eqz v13, :cond_17

    .line 331
    .line 332
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v13

    .line 336
    check-cast v13, Lp10;

    .line 337
    .line 338
    iget-object v13, v13, Lp10;->α:Lo10;

    .line 339
    .line 340
    if-ne v13, v1, :cond_15

    .line 341
    .line 342
    move v13, v4

    .line 343
    goto :goto_a

    .line 344
    :cond_15
    move v13, v8

    .line 345
    :goto_a
    if-eqz v13, :cond_14

    .line 346
    .line 347
    add-int/lit8 v12, v12, 0x1

    .line 348
    .line 349
    if-ltz v12, :cond_16

    .line 350
    .line 351
    goto :goto_9

    .line 352
    :cond_16
    invoke-static {}, Lyh;->ф()V

    .line 353
    .line 354
    .line 355
    throw v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 356
    :cond_17
    :goto_b
    monitor-exit v2

    .line 357
    sget-object v2, Lq10;->ε:Ljava/util/Map;

    .line 358
    .line 359
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    monitor-enter v2

    .line 363
    :try_start_3
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    check-cast v11, Ljava/lang/Iterable;

    .line 368
    .line 369
    new-instance v13, Ljava/util/ArrayList;

    .line 370
    .line 371
    invoke-static {v11, v7}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 372
    .line 373
    .line 374
    move-result v7

    .line 375
    invoke-direct {v13, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 376
    .line 377
    .line 378
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 383
    .line 384
    .line 385
    move-result v11

    .line 386
    if-eqz v11, :cond_18

    .line 387
    .line 388
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v11

    .line 392
    check-cast v11, Ljava/util/Map$Entry;

    .line 393
    .line 394
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v14

    .line 398
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v11

    .line 402
    new-instance v15, Ll91;

    .line 403
    .line 404
    invoke-direct {v15, v14, v11}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    goto :goto_c

    .line 411
    :catchall_2
    move-exception v0

    .line 412
    goto/16 :goto_23

    .line 413
    .line 414
    :cond_18
    new-instance v7, Ljava/util/ArrayList;

    .line 415
    .line 416
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 420
    .line 421
    .line 422
    move-result-object v11

    .line 423
    :cond_19
    :goto_d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 424
    .line 425
    .line 426
    move-result v13

    .line 427
    if-eqz v13, :cond_1b

    .line 428
    .line 429
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v13

    .line 433
    move-object v14, v13

    .line 434
    check-cast v14, Ll91;

    .line 435
    .line 436
    iget-object v14, v14, Ll91;->ζ:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v14, Lp10;

    .line 439
    .line 440
    iget-object v14, v14, Lp10;->α:Lo10;

    .line 441
    .line 442
    if-ne v14, v1, :cond_1a

    .line 443
    .line 444
    move v14, v4

    .line 445
    goto :goto_e

    .line 446
    :cond_1a
    move v14, v8

    .line 447
    :goto_e
    if-eqz v14, :cond_19

    .line 448
    .line 449
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 450
    .line 451
    .line 452
    goto :goto_d

    .line 453
    :cond_1b
    monitor-exit v2

    .line 454
    new-instance v2, Ljava/util/ArrayList;

    .line 455
    .line 456
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 460
    .line 461
    .line 462
    move-result-object v7

    .line 463
    :cond_1c
    :goto_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 464
    .line 465
    .line 466
    move-result v11

    .line 467
    if-eqz v11, :cond_1e

    .line 468
    .line 469
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v11

    .line 473
    check-cast v11, Ll91;

    .line 474
    .line 475
    iget-object v13, v11, Ll91;->ε:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v13, Landroid/view/View;

    .line 478
    .line 479
    iget-object v11, v11, Ll91;->ζ:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v11, Lp10;

    .line 482
    .line 483
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    invoke-static {v0, v13, v11, v9, v1}, Lq10;->ν(Landroid/app/Activity;Landroid/view/View;Lp10;Landroid/view/View;Lo10;)I

    .line 490
    .line 491
    .line 492
    move-result v14

    .line 493
    const/high16 v15, -0x80000000

    .line 494
    .line 495
    if-ne v14, v15, :cond_1d

    .line 496
    .line 497
    move-object v15, v5

    .line 498
    goto :goto_10

    .line 499
    :cond_1d
    new-instance v15, Ld62;

    .line 500
    .line 501
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 502
    .line 503
    .line 504
    move-result-object v14

    .line 505
    invoke-direct {v15, v13, v11, v14}, Ld62;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    :goto_10
    if-eqz v15, :cond_1c

    .line 509
    .line 510
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    goto :goto_f

    .line 514
    :cond_1e
    new-instance v0, Lqt;

    .line 515
    .line 516
    invoke-direct {v0, v3}, Lqt;-><init>(I)V

    .line 517
    .line 518
    .line 519
    invoke-static {v2, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 524
    .line 525
    .line 526
    move-result-object v3

    .line 527
    move v7, v8

    .line 528
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    if-eqz v0, :cond_39

    .line 533
    .line 534
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    add-int/lit8 v11, v7, 0x1

    .line 539
    .line 540
    if-ltz v7, :cond_38

    .line 541
    .line 542
    check-cast v0, Ld62;

    .line 543
    .line 544
    iget-object v13, v0, Ld62;->ε:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast v13, Landroid/view/View;

    .line 547
    .line 548
    iget-object v14, v0, Ld62;->ζ:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v14, Lp10;

    .line 551
    .line 552
    iget-object v0, v0, Ld62;->η:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v0, Ljava/lang/Number;

    .line 555
    .line 556
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 557
    .line 558
    .line 559
    move-result v15

    .line 560
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    iget-object v0, v14, Lp10;->γ:Ljava/lang/ref/WeakReference;

    .line 564
    .line 565
    if-eqz v0, :cond_1f

    .line 566
    .line 567
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    check-cast v0, Landroid/view/View$OnClickListener;

    .line 572
    .line 573
    move/from16 v16, v8

    .line 574
    .line 575
    move-object v8, v0

    .line 576
    goto :goto_12

    .line 577
    :cond_1f
    move/from16 v16, v8

    .line 578
    .line 579
    move-object v8, v5

    .line 580
    :goto_12
    const-string v5, "\u76f4\u63a5\u8c03\u7528\u5bbf\u4e3b\u76d1\u542c\u5931\u8d25: "

    .line 581
    .line 582
    invoke-virtual {v13}, Landroid/view/View;->isEnabled()Z

    .line 583
    .line 584
    .line 585
    move-result v6

    .line 586
    if-nez v6, :cond_20

    .line 587
    .line 588
    :try_start_4
    invoke-virtual {v13, v4}, Landroid/view/View;->setEnabled(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 589
    .line 590
    .line 591
    goto :goto_13

    .line 592
    :catchall_3
    move-exception v0

    .line 593
    goto/16 :goto_22

    .line 594
    .line 595
    :cond_20
    :goto_13
    :try_start_5
    invoke-virtual {v13}, Landroid/view/View;->callOnClick()Z

    .line 596
    .line 597
    .line 598
    move-result v0

    .line 599
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 600
    .line 601
    .line 602
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 603
    move/from16 v18, v4

    .line 604
    .line 605
    goto :goto_14

    .line 606
    :catchall_4
    move-exception v0

    .line 607
    move/from16 v18, v4

    .line 608
    .line 609
    :try_start_6
    new-instance v4, Leo1;

    .line 610
    .line 611
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 612
    .line 613
    .line 614
    move-object v0, v4

    .line 615
    :goto_14
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 616
    .line 617
    move-object/from16 p0, v2

    .line 618
    .line 619
    instance-of v2, v0, Leo1;

    .line 620
    .line 621
    if-eqz v2, :cond_21

    .line 622
    .line 623
    move-object v0, v4

    .line 624
    :cond_21
    check-cast v0, Ljava/lang/Boolean;

    .line 625
    .line 626
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 627
    .line 628
    .line 629
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 630
    if-eqz v0, :cond_23

    .line 631
    .line 632
    invoke-virtual {v13}, Landroid/view/View;->isEnabled()Z

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    if-eq v0, v6, :cond_22

    .line 637
    .line 638
    :goto_15
    invoke-virtual {v13, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 639
    .line 640
    .line 641
    :cond_22
    move/from16 v0, v18

    .line 642
    .line 643
    goto :goto_19

    .line 644
    :cond_23
    :try_start_7
    invoke-virtual {v13}, Landroid/view/View;->performClick()Z

    .line 645
    .line 646
    .line 647
    move-result v0

    .line 648
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 649
    .line 650
    .line 651
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 652
    goto :goto_16

    .line 653
    :catchall_5
    move-exception v0

    .line 654
    :try_start_8
    new-instance v2, Leo1;

    .line 655
    .line 656
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 657
    .line 658
    .line 659
    move-object v0, v2

    .line 660
    :goto_16
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 661
    .line 662
    instance-of v4, v0, Leo1;

    .line 663
    .line 664
    if-eqz v4, :cond_24

    .line 665
    .line 666
    move-object v0, v2

    .line 667
    :cond_24
    check-cast v0, Ljava/lang/Boolean;

    .line 668
    .line 669
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 670
    .line 671
    .line 672
    move-result v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 673
    if-eqz v0, :cond_25

    .line 674
    .line 675
    invoke-virtual {v13}, Landroid/view/View;->isEnabled()Z

    .line 676
    .line 677
    .line 678
    move-result v0

    .line 679
    if-eq v0, v6, :cond_22

    .line 680
    .line 681
    goto :goto_15

    .line 682
    :cond_25
    if-eqz v8, :cond_27

    .line 683
    .line 684
    :try_start_9
    invoke-interface {v8, v13}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 685
    .line 686
    .line 687
    sget-object v0, Ls62;->α:Ls62;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 688
    .line 689
    goto :goto_17

    .line 690
    :catchall_6
    move-exception v0

    .line 691
    :try_start_a
    new-instance v2, Leo1;

    .line 692
    .line 693
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 694
    .line 695
    .line 696
    move-object v0, v2

    .line 697
    :goto_17
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 698
    .line 699
    .line 700
    move-result-object v2

    .line 701
    if-eqz v2, :cond_26

    .line 702
    .line 703
    const-string v4, "FeedGestureActionLauncher"

    .line 704
    .line 705
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    new-instance v8, Ljava/lang/StringBuilder;

    .line 710
    .line 711
    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v2

    .line 721
    const/4 v5, 0x4

    .line 722
    const/4 v8, 0x0

    .line 723
    invoke-static {v4, v2, v8, v5, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    :cond_26
    instance-of v0, v0, Leo1;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 727
    .line 728
    xor-int/lit8 v0, v0, 0x1

    .line 729
    .line 730
    goto :goto_18

    .line 731
    :cond_27
    move/from16 v0, v16

    .line 732
    .line 733
    :goto_18
    invoke-virtual {v13}, Landroid/view/View;->isEnabled()Z

    .line 734
    .line 735
    .line 736
    move-result v2

    .line 737
    if-eq v2, v6, :cond_28

    .line 738
    .line 739
    invoke-virtual {v13, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 740
    .line 741
    .line 742
    :cond_28
    :goto_19
    if-eqz v0, :cond_36

    .line 743
    .line 744
    invoke-static {v13}, Lq10;->λ(Landroid/view/View;)Landroid/view/View$OnClickListener;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    if-eqz v0, :cond_29

    .line 749
    .line 750
    invoke-static {v0}, Lq10;->δ(Landroid/view/View$OnClickListener;)Ljava/util/LinkedHashSet;

    .line 751
    .line 752
    .line 753
    move-result-object v2

    .line 754
    goto :goto_1a

    .line 755
    :cond_29
    const/4 v2, 0x0

    .line 756
    :goto_1a
    if-nez v2, :cond_2a

    .line 757
    .line 758
    sget-object v2, Lnz;->ε:Lnz;

    .line 759
    .line 760
    :cond_2a
    move-object/from16 v19, v2

    .line 761
    .line 762
    check-cast v19, Ljava/lang/Iterable;

    .line 763
    .line 764
    const-string v20, ","

    .line 765
    .line 766
    new-instance v2, Lq00;

    .line 767
    .line 768
    const/16 v3, 0x16

    .line 769
    .line 770
    invoke-direct {v2, v3}, Lq00;-><init>(I)V

    .line 771
    .line 772
    .line 773
    const/16 v25, 0x1e

    .line 774
    .line 775
    const/16 v21, 0x0

    .line 776
    .line 777
    const/16 v22, 0x0

    .line 778
    .line 779
    const/16 v23, 0x0

    .line 780
    .line 781
    move-object/from16 v24, v2

    .line 782
    .line 783
    invoke-static/range {v19 .. v25}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    const-string v3, "FeedGestureActionLauncher"

    .line 788
    .line 789
    iget-object v1, v1, Lo10;->ε:Ljava/lang/String;

    .line 790
    .line 791
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 792
    .line 793
    .line 794
    move-result-object v4

    .line 795
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v4

    .line 799
    iget-object v5, v14, Lp10;->β:Ljava/lang/ref/WeakReference;

    .line 800
    .line 801
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v5

    .line 805
    check-cast v5, Landroid/view/View;

    .line 806
    .line 807
    if-eqz v5, :cond_2b

    .line 808
    .line 809
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 810
    .line 811
    .line 812
    move-result-object v5

    .line 813
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v5

    .line 817
    goto :goto_1b

    .line 818
    :cond_2b
    const/4 v5, 0x0

    .line 819
    :goto_1b
    if-nez v5, :cond_2c

    .line 820
    .line 821
    const-string v5, ""

    .line 822
    .line 823
    :cond_2c
    if-eqz v9, :cond_2d

    .line 824
    .line 825
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 826
    .line 827
    .line 828
    move-result-object v6

    .line 829
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v6

    .line 833
    goto :goto_1c

    .line 834
    :cond_2d
    const/4 v6, 0x0

    .line 835
    :goto_1c
    if-nez v6, :cond_2e

    .line 836
    .line 837
    const-string v6, ""

    .line 838
    .line 839
    :cond_2e
    if-eqz v0, :cond_2f

    .line 840
    .line 841
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 842
    .line 843
    .line 844
    move-result-object v8

    .line 845
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v8

    .line 849
    goto :goto_1d

    .line 850
    :cond_2f
    const/4 v8, 0x0

    .line 851
    :goto_1d
    if-nez v8, :cond_30

    .line 852
    .line 853
    const-string v8, ""

    .line 854
    .line 855
    :cond_30
    if-eqz v0, :cond_35

    .line 856
    .line 857
    invoke-static {v0}, Lq10;->δ(Landroid/view/View$OnClickListener;)Ljava/util/LinkedHashSet;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 862
    .line 863
    .line 864
    move-result v9

    .line 865
    if-eqz v9, :cond_31

    .line 866
    .line 867
    goto :goto_20

    .line 868
    :cond_31
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    :goto_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 873
    .line 874
    .line 875
    move-result v9

    .line 876
    if-eqz v9, :cond_34

    .line 877
    .line 878
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v9

    .line 882
    check-cast v9, Ljava/lang/String;

    .line 883
    .line 884
    const-string v10, "OnCommentClick"

    .line 885
    .line 886
    move/from16 v11, v18

    .line 887
    .line 888
    invoke-static {v9, v10, v11}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 889
    .line 890
    .line 891
    move-result v10

    .line 892
    if-nez v10, :cond_33

    .line 893
    .line 894
    const-string v10, "FeedCommentPresenter"

    .line 895
    .line 896
    invoke-static {v9, v10, v11}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 897
    .line 898
    .line 899
    move-result v10

    .line 900
    if-nez v10, :cond_33

    .line 901
    .line 902
    const-string v10, "VideoCommentCountView"

    .line 903
    .line 904
    invoke-static {v9, v10, v11}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 905
    .line 906
    .line 907
    move-result v9

    .line 908
    if-eqz v9, :cond_32

    .line 909
    .line 910
    goto :goto_1f

    .line 911
    :cond_32
    const/16 v18, 0x1

    .line 912
    .line 913
    goto :goto_1e

    .line 914
    :cond_33
    :goto_1f
    const/16 v16, 0x1

    .line 915
    .line 916
    :cond_34
    :goto_20
    if-eqz v16, :cond_35

    .line 917
    .line 918
    const-string v0, "comment"

    .line 919
    .line 920
    goto :goto_21

    .line 921
    :cond_35
    const-string v0, "generic"

    .line 922
    .line 923
    :goto_21
    const/16 v9, 0xf0

    .line 924
    .line 925
    invoke-static {v2, v9}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v2

    .line 929
    const-string v9, "\u5df2\u8c03\u7528 Feed \u539f\u751f\u52a8\u4f5c action="

    .line 930
    .line 931
    const-string v10, " index="

    .line 932
    .line 933
    const-string v11, " score="

    .line 934
    .line 935
    invoke-static {v7, v9, v1, v10, v11}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 936
    .line 937
    .line 938
    move-result-object v1

    .line 939
    const-string v7, " target="

    .line 940
    .line 941
    const-string v9, " root="

    .line 942
    .line 943
    invoke-static {v1, v15, v7, v4, v9}, Llz1;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 944
    .line 945
    .line 946
    const-string v4, " selected="

    .line 947
    .line 948
    const-string v7, " listener="

    .line 949
    .line 950
    invoke-static {v1, v5, v4, v6, v7}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    const-string v4, " listenerRole="

    .line 954
    .line 955
    const-string v5, " listenerTypes="

    .line 956
    .line 957
    invoke-static {v1, v8, v4, v0, v5}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 958
    .line 959
    .line 960
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 961
    .line 962
    .line 963
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    const/4 v5, 0x4

    .line 968
    const/4 v8, 0x0

    .line 969
    invoke-static {v3, v0, v8, v5, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 970
    .line 971
    .line 972
    const/16 v18, 0x1

    .line 973
    .line 974
    return v18

    .line 975
    :cond_36
    move-object/from16 v2, p0

    .line 976
    .line 977
    move v7, v11

    .line 978
    move/from16 v8, v16

    .line 979
    .line 980
    move/from16 v4, v18

    .line 981
    .line 982
    const/4 v5, 0x0

    .line 983
    const/4 v6, 0x4

    .line 984
    goto/16 :goto_11

    .line 985
    .line 986
    :goto_22
    invoke-virtual {v13}, Landroid/view/View;->isEnabled()Z

    .line 987
    .line 988
    .line 989
    move-result v1

    .line 990
    if-eq v1, v6, :cond_37

    .line 991
    .line 992
    invoke-virtual {v13, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 993
    .line 994
    .line 995
    :cond_37
    throw v0

    .line 996
    :cond_38
    invoke-static {}, Lyh;->х()V

    .line 997
    .line 998
    .line 999
    const/16 v17, 0x0

    .line 1000
    .line 1001
    throw v17

    .line 1002
    :cond_39
    move-object/from16 p0, v2

    .line 1003
    .line 1004
    move/from16 v16, v8

    .line 1005
    .line 1006
    const-string v0, "FeedGestureActionLauncher"

    .line 1007
    .line 1008
    iget-object v1, v1, Lo10;->ε:Ljava/lang/String;

    .line 1009
    .line 1010
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 1011
    .line 1012
    .line 1013
    move-result v2

    .line 1014
    const-string v3, "\u6267\u884c Feed \u539f\u751f\u52a8\u4f5c\u5931\u8d25: \u672a\u6355\u83b7\u5f53\u524d\u76ee\u6807 action="

    .line 1015
    .line 1016
    const-string v4, " registeredRoots="

    .line 1017
    .line 1018
    const-string v5, " matchingBindings="

    .line 1019
    .line 1020
    invoke-static {v10, v3, v1, v4, v5}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v1

    .line 1024
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1025
    .line 1026
    .line 1027
    const-string v3, " visibleCandidates="

    .line 1028
    .line 1029
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v1

    .line 1039
    const/4 v5, 0x4

    .line 1040
    const/4 v8, 0x0

    .line 1041
    invoke-static {v0, v1, v8, v5, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1042
    .line 1043
    .line 1044
    return v16

    .line 1045
    :goto_23
    monitor-exit v2

    .line 1046
    throw v0

    .line 1047
    :goto_24
    monitor-exit v2

    .line 1048
    throw v0

    .line 1049
    :catchall_7
    move-exception v0

    .line 1050
    monitor-exit v2

    .line 1051
    throw v0

    .line 1052
    :goto_25
    monitor-exit v2

    .line 1053
    throw v0
.end method

.method public static λ(Landroid/view/View;)Landroid/view/View$OnClickListener;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lq10;->ζ:Ljava/lang/reflect/Field;

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-class v1, Landroid/view/View;

    .line 8
    .line 9
    const-string v3, "mListenerInfo"

    .line 10
    .line 11
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 16
    .line 17
    .line 18
    sput-object v1, Lq10;->ζ:Ljava/lang/reflect/Field;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    sget-object v1, Lq10;->η:Ljava/lang/reflect/Field;

    .line 31
    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v3, "mOnClickListener"

    .line 39
    .line 40
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Lq10;->η:Ljava/lang/reflect/Field;

    .line 48
    .line 49
    :cond_2
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    instance-of v1, p0, Landroid/view/View$OnClickListener;

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    check-cast p0, Landroid/view/View$OnClickListener;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    move-object p0, v0

    .line 61
    goto :goto_2

    .line 62
    :goto_1
    new-instance v1, Leo1;

    .line 63
    .line 64
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    move-object p0, v1

    .line 68
    :goto_2
    instance-of v1, p0, Leo1;

    .line 69
    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    move-object v0, p0

    .line 74
    :goto_3
    check-cast v0, Landroid/view/View$OnClickListener;

    .line 75
    .line 76
    return-object v0
.end method

.method public static μ(Ljava/lang/String;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/view/View;)Lo10;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    sparse-switch v0, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    goto/16 :goto_6

    .line 10
    .line 11
    :sswitch_0
    const-string p1, "comment"

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_0
    sget-object p0, Lo10;->η:Lo10;

    .line 22
    .line 23
    return-object p0

    .line 24
    :sswitch_1
    const-string p1, "collect"

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :cond_1
    sget-object p0, Lo10;->θ:Lo10;

    .line 35
    .line 36
    return-object p0

    .line 37
    :sswitch_2
    const-string p1, "share"

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    goto/16 :goto_6

    .line 46
    .line 47
    :cond_2
    sget-object p0, Lo10;->ι:Lo10;

    .line 48
    .line 49
    return-object p0

    .line 50
    :sswitch_3
    const-string p1, "digg"

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-nez p0, :cond_3

    .line 57
    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :cond_3
    sget-object p0, Lo10;->ζ:Lo10;

    .line 61
    .line 62
    return-object p0

    .line 63
    :sswitch_4
    const-string v0, "avatar"

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_4

    .line 70
    .line 71
    goto/16 :goto_6

    .line 72
    .line 73
    :cond_4
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 74
    .line 75
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 76
    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    move-object v2, p1

    .line 80
    move v3, v0

    .line 81
    :goto_0
    if-eqz v2, :cond_6

    .line 82
    .line 83
    const/4 v4, 0x6

    .line 84
    if-gt v3, v4, :cond_6

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-interface {p0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    if-eq v2, p3, :cond_6

    .line 98
    .line 99
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    instance-of v4, v2, Landroid/view/View;

    .line 104
    .line 105
    if-eqz v4, :cond_5

    .line 106
    .line 107
    check-cast v2, Landroid/view/View;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    move-object v2, v1

    .line 111
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_6
    if-eqz p2, :cond_7

    .line 115
    .line 116
    invoke-static {p2}, Lq10;->δ(Landroid/view/View$OnClickListener;)Ljava/util/LinkedHashSet;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    goto :goto_2

    .line 121
    :cond_7
    move-object p2, v1

    .line 122
    :goto_2
    if-nez p2, :cond_8

    .line 123
    .line 124
    sget-object p2, Lnz;->ε:Lnz;

    .line 125
    .line 126
    :cond_8
    check-cast p2, Ljava/lang/Iterable;

    .line 127
    .line 128
    invoke-static {p0, p2}, Lg81;->ο(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    sget-object v3, Lo10;->λ:Lo10;

    .line 137
    .line 138
    const/4 v4, 0x1

    .line 139
    if-eqz v2, :cond_9

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_9
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-eqz v5, :cond_c

    .line 151
    .line 152
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    check-cast v5, Ljava/lang/String;

    .line 157
    .line 158
    const-string v6, "Follow"

    .line 159
    .line 160
    invoke-static {v5, v6, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    if-nez v6, :cond_b

    .line 165
    .line 166
    const-string v6, "Relation"

    .line 167
    .line 168
    invoke-static {v5, v6, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-eqz v5, :cond_a

    .line 173
    .line 174
    :cond_b
    return-object v3

    .line 175
    :cond_c
    :goto_3
    instance-of v2, p2, Ljava/util/Collection;

    .line 176
    .line 177
    const-string v5, "FeedAvatarPresenter"

    .line 178
    .line 179
    if-eqz v2, :cond_e

    .line 180
    .line 181
    move-object v2, p2

    .line 182
    check-cast v2, Ljava/util/Collection;

    .line 183
    .line 184
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_e

    .line 189
    .line 190
    :cond_d
    move p2, v0

    .line 191
    goto :goto_4

    .line 192
    :cond_e
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    :cond_f
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_d

    .line 201
    .line 202
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    check-cast v2, Ljava/lang/String;

    .line 207
    .line 208
    invoke-static {v2, v5, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_f

    .line 213
    .line 214
    move p2, v4

    .line 215
    :goto_4
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    const-string v6, "AvatarBorder"

    .line 220
    .line 221
    const-string v7, "AvatarImage"

    .line 222
    .line 223
    if-eqz v2, :cond_10

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_10
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    :cond_11
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-eqz v2, :cond_13

    .line 235
    .line 236
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    check-cast v2, Ljava/lang/String;

    .line 241
    .line 242
    invoke-static {v2, v7, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 243
    .line 244
    .line 245
    move-result v8

    .line 246
    if-nez v8, :cond_12

    .line 247
    .line 248
    invoke-static {v2, v6, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_11

    .line 253
    .line 254
    :cond_12
    move v0, v4

    .line 255
    :cond_13
    :goto_5
    if-eqz p2, :cond_14

    .line 256
    .line 257
    instance-of p0, p1, Landroid/widget/ImageView;

    .line 258
    .line 259
    if-eqz p0, :cond_14

    .line 260
    .line 261
    if-nez v0, :cond_14

    .line 262
    .line 263
    return-object v3

    .line 264
    :cond_14
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 265
    .line 266
    .line 267
    move-result p0

    .line 268
    if-eqz p0, :cond_15

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_15
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    :cond_16
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    if-eqz p1, :cond_18

    .line 280
    .line 281
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    check-cast p1, Ljava/lang/String;

    .line 286
    .line 287
    invoke-static {p1, v5, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 288
    .line 289
    .line 290
    move-result p2

    .line 291
    if-nez p2, :cond_17

    .line 292
    .line 293
    invoke-static {p1, v7, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 294
    .line 295
    .line 296
    move-result p2

    .line 297
    if-nez p2, :cond_17

    .line 298
    .line 299
    invoke-static {p1, v6, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    if-eqz p1, :cond_16

    .line 304
    .line 305
    :cond_17
    sget-object p0, Lo10;->κ:Lo10;

    .line 306
    .line 307
    return-object p0

    .line 308
    :cond_18
    :goto_6
    return-object v1

    .line 309
    :sswitch_data_0
    .sparse-switch
        -0x53cd3ea7 -> :sswitch_4
        0x2f0c25 -> :sswitch_3
        0x6854fdf -> :sswitch_2
        0x3897612a -> :sswitch_1
        0x38a5ee5f -> :sswitch_0
    .end sparse-switch
.end method

.method public static ν(Landroid/app/Activity;Landroid/view/View;Lp10;Landroid/view/View;Lo10;)I
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    iget-object v4, v1, Lp10;->β:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Landroid/view/View;

    .line 16
    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    goto/16 :goto_1e

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    :goto_0
    instance-of v6, v5, Landroid/app/Activity;

    .line 26
    .line 27
    if-eqz v6, :cond_1

    .line 28
    .line 29
    check-cast v5, Landroid/app/Activity;

    .line 30
    .line 31
    :goto_1
    move-object/from16 v6, p0

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    instance-of v6, v5, Landroid/content/ContextWrapper;

    .line 35
    .line 36
    if-eqz v6, :cond_2

    .line 37
    .line 38
    check-cast v5, Landroid/content/ContextWrapper;

    .line 39
    .line 40
    invoke-virtual {v5}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 v5, 0x0

    .line 46
    goto :goto_1

    .line 47
    :goto_2
    if-eq v5, v6, :cond_3

    .line 48
    .line 49
    goto/16 :goto_1e

    .line 50
    .line 51
    :cond_3
    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_31

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez v5, :cond_4

    .line 62
    .line 63
    goto/16 :goto_1e

    .line 64
    .line 65
    :cond_4
    invoke-static {v4}, Lq10;->ζ(Landroid/view/View;)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    if-eqz v2, :cond_7

    .line 70
    .line 71
    invoke-static {v4, v2}, Lq10;->ι(Landroid/view/View;Landroid/view/View;)Z

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-nez v10, :cond_7

    .line 76
    .line 77
    invoke-static {v2, v4}, Lq10;->ι(Landroid/view/View;Landroid/view/View;)Z

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    if-eqz v10, :cond_5

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    invoke-static {v2}, Lq10;->ζ(Landroid/view/View;)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    if-eqz v5, :cond_6

    .line 89
    .line 90
    if-ne v5, v10, :cond_6

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_6
    const/4 v10, 0x0

    .line 94
    goto :goto_4

    .line 95
    :cond_7
    :goto_3
    const/4 v10, 0x1

    .line 96
    :goto_4
    invoke-static {v0}, Lq10;->λ(Landroid/view/View;)Landroid/view/View$OnClickListener;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    sget-object v12, Lo10;->η:Lo10;

    .line 101
    .line 102
    if-ne v3, v12, :cond_10

    .line 103
    .line 104
    if-ne v0, v4, :cond_10

    .line 105
    .line 106
    instance-of v12, v4, Landroid/view/ViewGroup;

    .line 107
    .line 108
    if-eqz v12, :cond_8

    .line 109
    .line 110
    move-object v12, v4

    .line 111
    check-cast v12, Landroid/view/ViewGroup;

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_8
    const/4 v12, 0x0

    .line 115
    :goto_5
    if-nez v12, :cond_9

    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    :goto_6
    const/4 v15, 0x1

    .line 119
    goto/16 :goto_9

    .line 120
    .line 121
    :cond_9
    sget-object v13, Lq10;->ε:Ljava/util/Map;

    .line 122
    .line 123
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    monitor-enter v13

    .line 127
    :try_start_0
    invoke-interface {v13}, Ljava/util/Map;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v14

    .line 131
    if-eqz v14, :cond_b

    .line 132
    .line 133
    :cond_a
    const/4 v9, 0x0

    .line 134
    goto :goto_7

    .line 135
    :cond_b
    invoke-interface {v13}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 136
    .line 137
    .line 138
    move-result-object v14

    .line 139
    invoke-interface {v14}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v14

    .line 143
    :cond_c
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v15

    .line 147
    if-eqz v15, :cond_a

    .line 148
    .line 149
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v15

    .line 153
    check-cast v15, Ljava/util/Map$Entry;

    .line 154
    .line 155
    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v16

    .line 159
    move-object/from16 v9, v16

    .line 160
    .line 161
    check-cast v9, Landroid/view/View;

    .line 162
    .line 163
    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v15

    .line 167
    check-cast v15, Lp10;

    .line 168
    .line 169
    iget-object v7, v15, Lp10;->α:Lo10;

    .line 170
    .line 171
    sget-object v8, Lo10;->η:Lo10;

    .line 172
    .line 173
    if-ne v7, v8, :cond_c

    .line 174
    .line 175
    if-eq v9, v4, :cond_c

    .line 176
    .line 177
    iget-object v7, v15, Lp10;->β:Ljava/lang/ref/WeakReference;

    .line 178
    .line 179
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    if-ne v7, v4, :cond_c

    .line 184
    .line 185
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-static {v9, v4}, Lq10;->ι(Landroid/view/View;Landroid/view/View;)Z

    .line 189
    .line 190
    .line 191
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    if-eqz v7, :cond_c

    .line 193
    .line 194
    const/4 v9, 0x1

    .line 195
    goto :goto_7

    .line 196
    :catchall_0
    move-exception v0

    .line 197
    goto :goto_a

    .line 198
    :goto_7
    monitor-exit v13

    .line 199
    if-eqz v9, :cond_d

    .line 200
    .line 201
    const/4 v7, 0x1

    .line 202
    goto :goto_6

    .line 203
    :cond_d
    new-instance v7, Lsm1;

    .line 204
    .line 205
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 206
    .line 207
    .line 208
    new-instance v8, Lqm1;

    .line 209
    .line 210
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12}, Landroid/view/ViewGroup;->getChildCount()I

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    const/4 v13, 0x0

    .line 218
    :goto_8
    if-ge v13, v9, :cond_e

    .line 219
    .line 220
    invoke-virtual {v12, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 221
    .line 222
    .line 223
    move-result-object v14

    .line 224
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    const/4 v15, 0x1

    .line 228
    invoke-static {v8, v7, v14, v15}, Lq10;->η(Lqm1;Lsm1;Landroid/view/View;I)V

    .line 229
    .line 230
    .line 231
    iget-boolean v14, v8, Lqm1;->ε:Z

    .line 232
    .line 233
    if-nez v14, :cond_f

    .line 234
    .line 235
    add-int/lit8 v13, v13, 0x1

    .line 236
    .line 237
    goto :goto_8

    .line 238
    :cond_e
    const/4 v15, 0x1

    .line 239
    :cond_f
    iget-boolean v7, v8, Lqm1;->ε:Z

    .line 240
    .line 241
    :goto_9
    if-eqz v7, :cond_11

    .line 242
    .line 243
    move v7, v15

    .line 244
    goto :goto_b

    .line 245
    :goto_a
    monitor-exit v13

    .line 246
    throw v0

    .line 247
    :cond_10
    const/4 v15, 0x1

    .line 248
    :cond_11
    const/4 v7, 0x0

    .line 249
    :goto_b
    if-eqz v7, :cond_12

    .line 250
    .line 251
    const-string v8, "FeedGestureActionLauncher"

    .line 252
    .line 253
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    const-string v12, "\u8bc4\u8bba\u6839\u8282\u70b9\u5019\u9009\u964d\u7ea7: \u68c0\u6d4b\u5230\u5bbf\u4e3b\u8bc4\u8bba\u5b50\u76d1\u542c root="

    .line 262
    .line 263
    invoke-virtual {v12, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    const/4 v12, 0x4

    .line 268
    const/4 v13, 0x0

    .line 269
    invoke-static {v8, v9, v13, v12, v13}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    goto :goto_c

    .line 273
    :cond_12
    const/4 v13, 0x0

    .line 274
    :goto_c
    if-eqz v2, :cond_13

    .line 275
    .line 276
    move v8, v15

    .line 277
    goto :goto_d

    .line 278
    :cond_13
    const/4 v8, 0x0

    .line 279
    :goto_d
    if-eqz v11, :cond_14

    .line 280
    .line 281
    move v9, v15

    .line 282
    goto :goto_e

    .line 283
    :cond_14
    const/4 v9, 0x0

    .line 284
    :goto_e
    iget-object v1, v1, Lp10;->γ:Ljava/lang/ref/WeakReference;

    .line 285
    .line 286
    if-eqz v1, :cond_15

    .line 287
    .line 288
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    check-cast v1, Landroid/view/View$OnClickListener;

    .line 293
    .line 294
    goto :goto_f

    .line 295
    :cond_15
    move-object v1, v13

    .line 296
    :goto_f
    if-eqz v1, :cond_16

    .line 297
    .line 298
    move v1, v15

    .line 299
    goto :goto_10

    .line 300
    :cond_16
    const/4 v1, 0x0

    .line 301
    :goto_10
    invoke-virtual {v0}, Landroid/view/View;->hasOnClickListeners()Z

    .line 302
    .line 303
    .line 304
    move-result v11

    .line 305
    invoke-virtual {v0}, Landroid/view/View;->isClickable()Z

    .line 306
    .line 307
    .line 308
    move-result v12

    .line 309
    if-ne v0, v4, :cond_17

    .line 310
    .line 311
    move v14, v15

    .line 312
    goto :goto_11

    .line 313
    :cond_17
    const/4 v14, 0x0

    .line 314
    :goto_11
    sget-object v13, Lo10;->η:Lo10;

    .line 315
    .line 316
    if-ne v3, v13, :cond_18

    .line 317
    .line 318
    goto :goto_12

    .line 319
    :cond_18
    const/4 v15, 0x0

    .line 320
    :goto_12
    const/4 v3, 0x0

    .line 321
    :goto_13
    if-eqz v0, :cond_1b

    .line 322
    .line 323
    const/16 v13, 0xc

    .line 324
    .line 325
    if-gt v3, v13, :cond_1b

    .line 326
    .line 327
    if-ne v0, v4, :cond_19

    .line 328
    .line 329
    goto :goto_15

    .line 330
    :cond_19
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    instance-of v13, v0, Landroid/view/View;

    .line 335
    .line 336
    if-eqz v13, :cond_1a

    .line 337
    .line 338
    check-cast v0, Landroid/view/View;

    .line 339
    .line 340
    goto :goto_14

    .line 341
    :cond_1a
    const/4 v0, 0x0

    .line 342
    :goto_14
    add-int/lit8 v3, v3, 0x1

    .line 343
    .line 344
    goto :goto_13

    .line 345
    :cond_1b
    const/4 v3, -0x1

    .line 346
    :goto_15
    const/16 v0, 0x14

    .line 347
    .line 348
    if-eqz v8, :cond_1c

    .line 349
    .line 350
    if-nez v10, :cond_1c

    .line 351
    .line 352
    :goto_16
    const/4 v1, 0x0

    .line 353
    goto :goto_18

    .line 354
    :cond_1c
    if-gez v3, :cond_1d

    .line 355
    .line 356
    goto :goto_16

    .line 357
    :cond_1d
    if-eqz v15, :cond_1e

    .line 358
    .line 359
    if-eqz v14, :cond_1e

    .line 360
    .line 361
    if-eqz v7, :cond_1e

    .line 362
    .line 363
    goto :goto_16

    .line 364
    :cond_1e
    if-nez v9, :cond_1f

    .line 365
    .line 366
    if-nez v11, :cond_1f

    .line 367
    .line 368
    if-nez v12, :cond_1f

    .line 369
    .line 370
    goto :goto_16

    .line 371
    :cond_1f
    if-eqz v9, :cond_20

    .line 372
    .line 373
    const/16 v7, 0xfa0

    .line 374
    .line 375
    goto :goto_17

    .line 376
    :cond_20
    const/4 v7, 0x0

    .line 377
    :goto_17
    if-eqz v1, :cond_21

    .line 378
    .line 379
    add-int/lit16 v7, v7, 0x7d0

    .line 380
    .line 381
    :cond_21
    if-eqz v11, :cond_22

    .line 382
    .line 383
    add-int/lit16 v7, v7, 0x3e8

    .line 384
    .line 385
    :cond_22
    if-eqz v12, :cond_23

    .line 386
    .line 387
    add-int/lit16 v7, v7, 0x190

    .line 388
    .line 389
    :cond_23
    if-eqz v14, :cond_24

    .line 390
    .line 391
    add-int/lit16 v7, v7, 0x320

    .line 392
    .line 393
    :cond_24
    if-le v3, v0, :cond_25

    .line 394
    .line 395
    move v3, v0

    .line 396
    :cond_25
    mul-int/lit8 v3, v3, 0x78

    .line 397
    .line 398
    sub-int/2addr v7, v3

    .line 399
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    :goto_18
    if-eqz v1, :cond_31

    .line 404
    .line 405
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-nez v5, :cond_2c

    .line 410
    .line 411
    if-eqz v2, :cond_27

    .line 412
    .line 413
    if-eqz v10, :cond_26

    .line 414
    .line 415
    goto :goto_19

    .line 416
    :cond_26
    const/4 v2, 0x0

    .line 417
    :goto_19
    move-object v5, v2

    .line 418
    goto :goto_1a

    .line 419
    :cond_27
    const/4 v5, 0x0

    .line 420
    :goto_1a
    if-nez v5, :cond_2c

    .line 421
    .line 422
    const/4 v9, 0x0

    .line 423
    :goto_1b
    if-eqz v4, :cond_2a

    .line 424
    .line 425
    if-gt v9, v0, :cond_2a

    .line 426
    .line 427
    new-instance v2, Landroid/graphics/Rect;

    .line 428
    .line 429
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    if-nez v3, :cond_28

    .line 437
    .line 438
    invoke-virtual {v4}, Landroid/view/View;->isShown()Z

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    if-eqz v3, :cond_28

    .line 443
    .line 444
    invoke-virtual {v4, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    if-eqz v3, :cond_28

    .line 449
    .line 450
    invoke-virtual {v2}, Landroid/graphics/Rect;->isEmpty()Z

    .line 451
    .line 452
    .line 453
    move-result v2

    .line 454
    if-nez v2, :cond_28

    .line 455
    .line 456
    move-object v7, v4

    .line 457
    goto :goto_1d

    .line 458
    :cond_28
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    instance-of v3, v2, Landroid/view/View;

    .line 463
    .line 464
    if-eqz v3, :cond_29

    .line 465
    .line 466
    check-cast v2, Landroid/view/View;

    .line 467
    .line 468
    move-object v4, v2

    .line 469
    goto :goto_1c

    .line 470
    :cond_29
    const/4 v4, 0x0

    .line 471
    :goto_1c
    add-int/lit8 v9, v9, 0x1

    .line 472
    .line 473
    goto :goto_1b

    .line 474
    :cond_2a
    const/4 v7, 0x0

    .line 475
    :goto_1d
    if-nez v7, :cond_2b

    .line 476
    .line 477
    goto :goto_1e

    .line 478
    :cond_2b
    move-object v5, v7

    .line 479
    :cond_2c
    invoke-virtual {v5}, Landroid/view/View;->isShown()Z

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    if-eqz v0, :cond_31

    .line 484
    .line 485
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    if-eqz v0, :cond_2d

    .line 490
    .line 491
    goto :goto_1e

    .line 492
    :cond_2d
    new-instance v0, Landroid/graphics/Rect;

    .line 493
    .line 494
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v5, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    if-eqz v2, :cond_31

    .line 502
    .line 503
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 504
    .line 505
    .line 506
    move-result v2

    .line 507
    if-eqz v2, :cond_2e

    .line 508
    .line 509
    goto :goto_1e

    .line 510
    :cond_2e
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 519
    .line 520
    div-int/lit8 v2, v2, 0x2

    .line 521
    .line 522
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    .line 523
    .line 524
    .line 525
    move-result v3

    .line 526
    sub-int/2addr v3, v2

    .line 527
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 532
    .line 533
    .line 534
    move-result v3

    .line 535
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 536
    .line 537
    .line 538
    move-result v0

    .line 539
    mul-int/2addr v0, v3

    .line 540
    div-int/lit16 v0, v0, 0x3e8

    .line 541
    .line 542
    const/16 v3, 0x2710

    .line 543
    .line 544
    if-le v0, v3, :cond_2f

    .line 545
    .line 546
    move v0, v3

    .line 547
    :cond_2f
    add-int/2addr v0, v3

    .line 548
    const/16 v3, 0x1388

    .line 549
    .line 550
    if-le v2, v3, :cond_30

    .line 551
    .line 552
    move v2, v3

    .line 553
    :cond_30
    sub-int/2addr v0, v2

    .line 554
    add-int/2addr v0, v1

    .line 555
    return v0

    .line 556
    :cond_31
    :goto_1e
    const/high16 v0, -0x80000000

    .line 557
    .line 558
    return v0
.end method


# virtual methods
.method public final θ(Ljava/lang/ClassLoader;)V
    .locals 9

    .line 1
    const-string v0, "FeedGestureActionLauncher"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    sget-object v1, Lq10;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 p1, 0x4

    .line 18
    const/4 v3, 0x0

    .line 19
    :try_start_0
    sget-object v4, Lxq0;->α:Lxq0;

    .line 20
    .line 21
    const-class v5, Landroid/view/View;

    .line 22
    .line 23
    const-string v6, "setOnClickListener"

    .line 24
    .line 25
    new-instance v7, Lnh;

    .line 26
    .line 27
    const/4 v8, 0x4

    .line 28
    invoke-direct {v7, v8, p0}, Lnh;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v5, v6, v7}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    const-string p0, "Feed \u539f\u751f\u4e92\u52a8\u76d1\u542c\u6355\u83b7 Hook \u5df2\u5b89\u88c5"

    .line 35
    .line 36
    invoke-static {v0, p0, v3, p1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    new-instance v4, Leo1;

    .line 44
    .line 45
    invoke-direct {v4, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    move-object p0, v4

    .line 49
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const-string v1, "Feed \u539f\u751f\u4e92\u52a8\u76d1\u542c\u6355\u83b7 Hook \u5b89\u88c5\u5931\u8d25: "

    .line 63
    .line 64
    invoke-static {v1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {v0, p0, v3, p1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    :goto_1
    return-void
.end method
