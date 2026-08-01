.class public final Lyl;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lyl;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ζ:Ljava/util/Set;

.field public static final η:Ljava/util/Set;

.field public static final θ:Ljava/util/Map;

.field public static final ι:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyl;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyl;->α:Lyl;

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
    sput-object v0, Lyl;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lyl;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lyl;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lyl;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    new-instance v0, Landroid/os/Handler;

    .line 38
    .line 39
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sput-object v0, Lyl;->ζ:Ljava/util/Set;

    .line 59
    .line 60
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sput-object v0, Lyl;->η:Ljava/util/Set;

    .line 73
    .line 74
    new-instance v0, Ljava/util/WeakHashMap;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    sput-object v0, Lyl;->θ:Ljava/util/Map;

    .line 87
    .line 88
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 91
    .line 92
    .line 93
    sput-object v0, Lyl;->ι:Ljava/lang/ThreadLocal;

    .line 94
    .line 95
    return-void
.end method

.method public static final α(Landroid/view/View;Ljava/lang/String;)V
    .locals 7

    .line 1
    new-instance v0, Lum1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v4, Lvl;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v4, v0, v1}, Lvl;-><init>(Lum1;I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lsm1;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/16 v2, 0x200

    .line 19
    .line 20
    const/16 v3, 0xc

    .line 21
    .line 22
    move-object v5, p0

    .line 23
    invoke-static/range {v1 .. v6}, Lyl;->ο(Lsm1;IILa80;Landroid/view/View;I)V

    .line 24
    .line 25
    .line 26
    iget-object p0, v0, Lum1;->ε:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Landroid/widget/TextView;

    .line 29
    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const/4 v0, 0x0

    .line 38
    :goto_0
    instance-of v1, p0, Landroid/view/View;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    const/16 v1, 0x8

    .line 43
    .line 44
    if-ge v0, v1, :cond_2

    .line 45
    .line 46
    instance-of v1, p0, Landroid/widget/LinearLayout;

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-class v2, Landroid/widget/LinearLayout;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    check-cast p0, Landroid/view/View;

    .line 71
    .line 72
    :goto_1
    move-object v4, p0

    .line 73
    goto :goto_2

    .line 74
    :cond_1
    check-cast p0, Landroid/view/View;

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    const/4 p0, 0x0

    .line 84
    goto :goto_1

    .line 85
    :goto_2
    if-nez v4, :cond_3

    .line 86
    .line 87
    :goto_3
    return-void

    .line 88
    :cond_3
    new-instance v3, Lul;

    .line 89
    .line 90
    const/4 p0, 0x3

    .line 91
    invoke-direct {v3, p0}, Lul;-><init>(I)V

    .line 92
    .line 93
    .line 94
    new-instance v0, Lsm1;

    .line 95
    .line 96
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    const/4 v5, 0x0

    .line 100
    const/16 v1, 0x40

    .line 101
    .line 102
    const/4 v2, 0x4

    .line 103
    invoke-static/range {v0 .. v5}, Lyl;->ο(Lsm1;IILa80;Landroid/view/View;I)V

    .line 104
    .line 105
    .line 106
    invoke-static {v4, p1}, Lyl;->δ(Landroid/view/View;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public static final β(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V
    .locals 12

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p1}, Lyl;->η(Ljava/lang/reflect/Method;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    :goto_0
    return-void

    .line 11
    :cond_1
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v2, p1}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v5, Ljava/util/ArrayList;

    .line 39
    .line 40
    array-length v6, v4

    .line 41
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    array-length v6, v4

    .line 45
    const/4 v7, 0x0

    .line 46
    :goto_1
    if-ge v7, v6, :cond_2

    .line 47
    .line 48
    aget-object v8, v4, v7

    .line 49
    .line 50
    invoke-static {v8, v5, v7, v0}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 60
    .line 61
    .line 62
    const/4 v10, 0x0

    .line 63
    const/16 v11, 0x3e

    .line 64
    .line 65
    const-string v6, ","

    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    const/4 v9, 0x0

    .line 70
    invoke-static/range {v5 .. v11}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-string v4, "#"

    .line 75
    .line 76
    const-string v5, "("

    .line 77
    .line 78
    invoke-static {v1, v4, v2, v5, v0}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v1, "):"

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public static γ(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/lang/reflect/Method;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    move-object v5, v4

    .line 47
    check-cast v5, Ljava/lang/reflect/Method;

    .line 48
    .line 49
    invoke-static {v5}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-static {v7, v5}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v10, Ljava/util/ArrayList;

    .line 69
    .line 70
    array-length v11, v9

    .line 71
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    array-length v11, v9

    .line 75
    const/4 v12, 0x0

    .line 76
    :goto_2
    if-ge v12, v11, :cond_2

    .line 77
    .line 78
    aget-object v13, v9, v12

    .line 79
    .line 80
    invoke-static {v13, v10, v12, v2}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 90
    .line 91
    .line 92
    const/4 v15, 0x0

    .line 93
    const/16 v16, 0x3e

    .line 94
    .line 95
    const-string v11, ","

    .line 96
    .line 97
    const/4 v12, 0x0

    .line 98
    const/4 v13, 0x0

    .line 99
    const/4 v14, 0x0

    .line 100
    invoke-static/range {v10 .. v16}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    const-string v9, "#"

    .line 105
    .line 106
    const-string v10, "("

    .line 107
    .line 108
    invoke-static {v6, v9, v7, v10, v5}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const-string v6, "):"

    .line 113
    .line 114
    invoke-static {v5, v6, v8, v0}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_1

    .line 119
    .line 120
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    return-object v1
.end method

.method public static δ(Landroid/view/View;Ljava/lang/String;)V
    .locals 11

    .line 1
    sget-object v1, Lyl;->ι:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object v0, Lyl;->θ:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    new-instance v4, Lwl;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getImportantForAccessibility()I

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    invoke-direct/range {v4 .. v10}, Lwl;-><init>(IFZZZI)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, p0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const/16 v0, 0x8

    .line 60
    .line 61
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 76
    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 80
    .line 81
    .line 82
    const/4 v0, 0x4

    .line 83
    invoke-virtual {p0, v0}, Landroid/view/View;->setImportantForAccessibility(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string v0, "hidden comment keyboard entrance container, reason="

    .line 98
    .line 99
    const-string v1, ", view="

    .line 100
    .line 101
    const-string v2, "r931d7e30ef229d29"

    .line 102
    .line 103
    invoke-static {v0, p1, v1, p0, v2}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    move-object p0, v0

    .line 109
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 110
    .line 111
    .line 112
    throw p0
.end method

.method public static ζ()Z
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "hide_comment_keyboard_entrance_enabled"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    new-instance v1, Leo1;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object v0, v1

    .line 20
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    instance-of v2, v0, Leo1;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
.end method

.method public static η(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    array-length v0, v0

    .line 31
    const/4 v2, 0x2

    .line 32
    if-eq v0, v2, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    aget-object v0, v0, v1

    .line 40
    .line 41
    const-class v2, Landroid/view/View;

    .line 42
    .line 43
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const/4 v2, 0x1

    .line 55
    aget-object v0, v0, v2

    .line 56
    .line 57
    const-class v3, Landroid/os/Bundle;

    .line 58
    .line 59
    invoke-static {v0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-string v0, "~78BF3716A2F49FBB709742322D9206C6AF9F18144C2A2123893F917FD9A67DE75E87F835F5066DD2C20FA2028DA408323F4FAF162C0F9F8650E8E7270A57AFBA395C73DBE2F9D1A4C5B8"

    .line 75
    .line 76
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_6

    .line 85
    .line 86
    const-string v0, "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572EB9CAA062808381972FC64C3DABAEB2071701EBE921AE26D62D7F00E3C85643E31111547B42BE1A7D660631EA17BD042F86CB05D259E1A595"

    .line 87
    .line 88
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_5

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    :goto_0
    return v1

    .line 100
    :cond_6
    :goto_1
    return v2
.end method

.method public static θ(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    const-string v1, "~79044D353CB554BD2E6921EC694522A26B913DAA69168678EA59C385DC1D8578FBBACD15"

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
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, ".DuxCheckBox"

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-static {p0, v0, v1}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return v1

    .line 40
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 41
    return p0
.end method

.method public static ι(Ljava/lang/reflect/Method;)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    array-length v0, v0

    .line 33
    const/4 v2, 0x1

    .line 34
    if-eq v0, v2, :cond_2

    .line 35
    .line 36
    goto/16 :goto_4

    .line 37
    .line 38
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    aget-object v0, v0, v1

    .line 43
    .line 44
    const-class v3, Landroid/view/View;

    .line 45
    .line 46
    invoke-static {v0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    array-length v0, p0

    .line 66
    move v3, v1

    .line 67
    :goto_0
    if-ge v3, v0, :cond_5

    .line 68
    .line 69
    aget-object v4, p0, v3

    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    const-string v5, "~79044D353CB554BD2E6921EC694522A26B913DAA69168678EA59C385DC1D8578FBBACD15"

    .line 80
    .line 81
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_4

    .line 90
    .line 91
    move v0, v2

    .line 92
    goto :goto_1

    .line 93
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    move v0, v1

    .line 97
    :goto_1
    array-length v3, p0

    .line 98
    move v4, v1

    .line 99
    move v5, v4

    .line 100
    :goto_2
    if-ge v4, v3, :cond_7

    .line 101
    .line 102
    aget-object v6, p0, v4

    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    const-string v7, "~791C379118E47E8B07D05A90B0CB47BAE4B25E3CE56C7556A7BA2B119EDA86273BF6"

    .line 113
    .line 114
    invoke-static {v7}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    if-eqz v6, :cond_6

    .line 123
    .line 124
    add-int/lit8 v5, v5, 0x1

    .line 125
    .line 126
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    array-length v3, p0

    .line 130
    move v4, v1

    .line 131
    move v6, v4

    .line 132
    :goto_3
    if-ge v4, v3, :cond_9

    .line 133
    .line 134
    aget-object v7, p0, v4

    .line 135
    .line 136
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    const-class v8, Landroid/widget/LinearLayout;

    .line 141
    .line 142
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eqz v7, :cond_8

    .line 147
    .line 148
    add-int/lit8 v6, v6, 0x1

    .line 149
    .line 150
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_9
    if-eqz v0, :cond_a

    .line 154
    .line 155
    if-lt v5, v2, :cond_a

    .line 156
    .line 157
    if-lt v6, v2, :cond_a

    .line 158
    .line 159
    return v2

    .line 160
    :cond_a
    :goto_4
    return v1
.end method

.method public static κ(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    const-string v0, "~78BF3716A2F49FBB709742322D9206C6AF9F18144C2A2123893F917FD9A67DE75E87F835F5066DD2C20FA2028DA408323F4FAF162C0F9F8650E8E7270A57AFBA395C73DBE2F9D1A4C5B8"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572EB9CAA062808381972FC64C3DABAEB2071701EBE921AE26D62D7F00E3C85643E31111547B42BE1A7D660631EA17BD042F86CB05D259E1A595"

    .line 8
    .line 9
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p0, v2}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Ljava/lang/Class;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v1}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    move-object v2, v1

    .line 111
    check-cast v2, Ljava/lang/reflect/Method;

    .line 112
    .line 113
    invoke-static {v2}, Lyl;->η(Ljava/lang/reflect/Method;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_3

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    invoke-static {v0}, Lyl;->γ(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0
.end method

.method public static λ(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "X.C11ER"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Ljz;->ε:Ljz;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    array-length v1, p0

    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v1, :cond_2

    .line 27
    .line 28
    aget-object v3, p0, v2

    .line 29
    .line 30
    invoke-static {v3}, Lyl;->ι(Ljava/lang/reflect/Method;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Ljava/lang/reflect/Method;

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    return-object v0
.end method

.method public static μ(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 3

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->Ｂ:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-eqz v1, :cond_3

    .line 20
    .line 21
    new-instance p0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v1, v0

    .line 41
    check-cast v1, Ljava/lang/reflect/Method;

    .line 42
    .line 43
    invoke-static {v1}, Lyl;->η(Ljava/lang/reflect/Method;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-static {p0}, Lyl;->γ(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_3
    invoke-static {p0}, Lyl;->κ(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_5

    .line 67
    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    invoke-static {v0, v1}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-object v1

    .line 74
    :cond_5
    if-eqz p1, :cond_9

    .line 75
    .line 76
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_6

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_6
    new-instance p1, Lbb;

    .line 86
    .line 87
    const/16 v1, 0x12

    .line 88
    .line 89
    invoke-direct {p1, p0, v1}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 90
    .line 91
    .line 92
    const-string v1, "\u5b9a\u4f4d\u8bc4\u8bba\u952e\u76d8\u9762\u677f\u89c6\u56fe\u521d\u59cb\u5316\u5165\u53e3"

    .line 93
    .line 94
    invoke-static {v0, p0, v1, p1}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    new-instance p1, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :cond_7
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_8

    .line 112
    .line 113
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    move-object v1, v0

    .line 118
    check-cast v1, Ljava/lang/reflect/Method;

    .line 119
    .line 120
    invoke-static {v1}, Lyl;->η(Ljava/lang/reflect/Method;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_7

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_8
    invoke-static {p1}, Lyl;->γ(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :cond_9
    :goto_3
    sget-object p0, Ljz;->ε:Ljz;

    .line 136
    .line 137
    return-object p0
.end method

.method public static ν(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v1, Lkx;->Ａ:Lkx;

    .line 6
    .line 7
    invoke-static {v1, v0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v3, "):"

    .line 12
    .line 13
    const-string v4, "("

    .line 14
    .line 15
    const-string v5, "#"

    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    if-eqz v2, :cond_7

    .line 19
    .line 20
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    if-nez v8, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v2, 0x0

    .line 28
    :goto_0
    if-eqz v2, :cond_7

    .line 29
    .line 30
    new-instance v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    move-object v8, v2

    .line 50
    check-cast v8, Ljava/lang/reflect/Method;

    .line 51
    .line 52
    invoke-static {v8}, Lyl;->ι(Ljava/lang/reflect/Method;)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Ljava/lang/reflect/Method;

    .line 77
    .line 78
    invoke-virtual {v2, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    new-instance v1, Ljava/util/HashSet;

    .line 83
    .line 84
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 85
    .line 86
    .line 87
    new-instance v2, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_6

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    move-object v9, v8

    .line 107
    check-cast v9, Ljava/lang/reflect/Method;

    .line 108
    .line 109
    invoke-static {v9}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    invoke-static {v11, v9}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v12

    .line 121
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    new-instance v14, Ljava/util/ArrayList;

    .line 129
    .line 130
    array-length v15, v13

    .line 131
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 132
    .line 133
    .line 134
    array-length v15, v13

    .line 135
    const/4 v6, 0x0

    .line 136
    :goto_4
    if-ge v6, v15, :cond_4

    .line 137
    .line 138
    move-object/from16 p0, v0

    .line 139
    .line 140
    aget-object v0, v13, v6

    .line 141
    .line 142
    invoke-static {v0, v14, v6, v7}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    move-object/from16 v0, p0

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_4
    move-object/from16 p0, v0

    .line 150
    .line 151
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 156
    .line 157
    .line 158
    const/16 v19, 0x0

    .line 159
    .line 160
    const/16 v20, 0x3e

    .line 161
    .line 162
    const-string v15, ","

    .line 163
    .line 164
    const/16 v16, 0x0

    .line 165
    .line 166
    const/16 v17, 0x0

    .line 167
    .line 168
    const/16 v18, 0x0

    .line 169
    .line 170
    invoke-static/range {v14 .. v20}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v10, v5, v11, v4, v0}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0, v3, v12, v1}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_5

    .line 183
    .line 184
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    :cond_5
    move-object/from16 v0, p0

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_6
    return-object v2

    .line 191
    :cond_7
    if-eqz p1, :cond_f

    .line 192
    .line 193
    sget-object v2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-nez v2, :cond_8

    .line 200
    .line 201
    goto/16 :goto_9

    .line 202
    .line 203
    :cond_8
    new-instance v2, Lbb;

    .line 204
    .line 205
    const/16 v6, 0x13

    .line 206
    .line 207
    invoke-direct {v2, v0, v6}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 208
    .line 209
    .line 210
    const-string v6, "\u5b9a\u4f4d\u8bc4\u8bba\u8f93\u5165\u6846\u53d1\u5e03\u4f5c\u54c1\u9884\u89c8\u63a7\u4ef6\u521d\u59cb\u5316"

    .line 211
    .line 212
    invoke-static {v1, v0, v6, v2}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    new-instance v1, Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    :cond_9
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-eqz v2, :cond_a

    .line 230
    .line 231
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    move-object v6, v2

    .line 236
    check-cast v6, Ljava/lang/reflect/Method;

    .line 237
    .line 238
    invoke-static {v6}, Lyl;->ι(Ljava/lang/reflect/Method;)Z

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    if-eqz v6, :cond_9

    .line 243
    .line 244
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_a
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    if-eqz v2, :cond_b

    .line 257
    .line 258
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    check-cast v2, Ljava/lang/reflect/Method;

    .line 263
    .line 264
    invoke-virtual {v2, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 265
    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_b
    new-instance v0, Ljava/util/HashSet;

    .line 269
    .line 270
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 271
    .line 272
    .line 273
    new-instance v2, Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-eqz v6, :cond_e

    .line 287
    .line 288
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    move-object v8, v6

    .line 293
    check-cast v8, Ljava/lang/reflect/Method;

    .line 294
    .line 295
    invoke-static {v8}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    invoke-static {v10, v8}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v11

    .line 307
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object v12

    .line 311
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    new-instance v13, Ljava/util/ArrayList;

    .line 315
    .line 316
    array-length v14, v12

    .line 317
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 318
    .line 319
    .line 320
    array-length v14, v12

    .line 321
    const/4 v15, 0x0

    .line 322
    :goto_8
    if-ge v15, v14, :cond_c

    .line 323
    .line 324
    move-object/from16 p0, v1

    .line 325
    .line 326
    aget-object v1, v12, v15

    .line 327
    .line 328
    invoke-static {v1, v13, v15, v7}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 329
    .line 330
    .line 331
    move-result v15

    .line 332
    move-object/from16 v1, p0

    .line 333
    .line 334
    goto :goto_8

    .line 335
    :cond_c
    move-object/from16 p0, v1

    .line 336
    .line 337
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 342
    .line 343
    .line 344
    const/16 v18, 0x0

    .line 345
    .line 346
    const/16 v19, 0x3e

    .line 347
    .line 348
    const-string v14, ","

    .line 349
    .line 350
    const/4 v15, 0x0

    .line 351
    const/16 v16, 0x0

    .line 352
    .line 353
    const/16 v17, 0x0

    .line 354
    .line 355
    invoke-static/range {v13 .. v19}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-static {v9, v5, v10, v4, v1}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    invoke-static {v1, v3, v11, v0}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-eqz v1, :cond_d

    .line 368
    .line 369
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    :cond_d
    move-object/from16 v1, p0

    .line 373
    .line 374
    goto :goto_7

    .line 375
    :cond_e
    return-object v2

    .line 376
    :cond_f
    :goto_9
    invoke-static {v0}, Lyl;->λ(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    return-object v0
.end method

.method public static ξ()V
    .locals 6

    .line 1
    sget-object v0, Lyl;->θ:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Ljava/lang/Iterable;

    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    invoke-static {v1, v3}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/util/Map$Entry;

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    new-instance v5, Ll91;

    .line 46
    .line 47
    invoke-direct {v5, v4, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v1

    .line 55
    goto :goto_2

    .line 56
    :cond_0
    monitor-exit v0

    .line 57
    sget-object v0, Lyl;->ι:Ljava/lang/ThreadLocal;

    .line 58
    .line 59
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :try_start_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Ll91;

    .line 79
    .line 80
    iget-object v2, v1, Ll91;->ε:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, Landroid/view/View;

    .line 83
    .line 84
    iget-object v1, v1, Ll91;->ζ:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Lwl;

    .line 87
    .line 88
    iget v3, v1, Lwl;->α:I

    .line 89
    .line 90
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 91
    .line 92
    .line 93
    iget v3, v1, Lwl;->β:F

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 96
    .line 97
    .line 98
    iget-boolean v3, v1, Lwl;->γ:Z

    .line 99
    .line 100
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 101
    .line 102
    .line 103
    iget-boolean v3, v1, Lwl;->δ:Z

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Landroid/view/View;->setClickable(Z)V

    .line 106
    .line 107
    .line 108
    iget-boolean v3, v1, Lwl;->ε:Z

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 111
    .line 112
    .line 113
    iget v1, v1, Lwl;->ζ:I

    .line 114
    .line 115
    invoke-virtual {v2, v1}, Landroid/view/View;->setImportantForAccessibility(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    sget-object v0, Lyl;->ι:Ljava/lang/ThreadLocal;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 122
    .line 123
    .line 124
    sget-object v0, Lyl;->θ:Ljava/util/Map;

    .line 125
    .line 126
    monitor-enter v0

    .line 127
    :try_start_2
    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 128
    .line 129
    .line 130
    monitor-exit v0

    .line 131
    return-void

    .line 132
    :catchall_1
    move-exception v1

    .line 133
    monitor-exit v0

    .line 134
    throw v1

    .line 135
    :catchall_2
    move-exception v0

    .line 136
    sget-object v1, Lyl;->ι:Ljava/lang/ThreadLocal;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 139
    .line 140
    .line 141
    throw v0

    .line 142
    :goto_2
    monitor-exit v0

    .line 143
    throw v1
.end method

.method public static final ο(Lsm1;IILa80;Landroid/view/View;I)V
    .locals 8

    .line 1
    iget v0, p0, Lsm1;->ε:I

    .line 2
    .line 3
    if-ge v0, p1, :cond_3

    .line 4
    .line 5
    if-le p5, p2, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    iput v0, p0, Lsm1;->ε:I

    .line 11
    .line 12
    invoke-interface {p3, p4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    instance-of v0, p4, Landroid/view/ViewGroup;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    check-cast p4, Landroid/view/ViewGroup;

    .line 20
    .line 21
    invoke-virtual {p4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    :goto_0
    if-ge v1, v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p4, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    if-nez v6, :cond_1

    .line 33
    .line 34
    move-object v2, p0

    .line 35
    move v3, p1

    .line 36
    move v4, p2

    .line 37
    move-object v5, p3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    add-int/lit8 v7, p5, 0x1

    .line 40
    .line 41
    move-object v2, p0

    .line 42
    move v3, p1

    .line 43
    move v4, p2

    .line 44
    move-object v5, p3

    .line 45
    invoke-static/range {v2 .. v7}, Lyl;->ο(Lsm1;IILa80;Landroid/view/View;I)V

    .line 46
    .line 47
    .line 48
    iget p0, v2, Lsm1;->ε:I

    .line 49
    .line 50
    if-lt p0, v3, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    move-object p0, v2

    .line 56
    move p1, v3

    .line 57
    move p2, v4

    .line 58
    move-object p3, v5

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public final ε(Ljava/lang/ClassLoader;)V
    .locals 25

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lyl;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const-string v4, "r931d7e30ef229d29"

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :try_start_0
    new-instance v0, Lul;

    .line 20
    .line 21
    move-object/from16 v5, p0

    .line 22
    .line 23
    invoke-direct {v0, v5}, Lul;-><init>(Lyl;)V

    .line 24
    .line 25
    .line 26
    sget-object v5, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {v5, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    new-instance v5, Leo1;

    .line 36
    .line 37
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object v0, v5

    .line 41
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v5, "config listener skipped: "

    .line 52
    .line 53
    invoke-static {v5, v0, v4}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_1
    sget-object v0, Lyl;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    .line 58
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    sget-object v0, Lxq0;->α:Lxq0;

    .line 66
    .line 67
    new-instance v5, Lxl;

    .line 68
    .line 69
    const/4 v6, 0x1

    .line 70
    const/4 v7, 0x0

    .line 71
    invoke-direct {v5, v6, v7}, Lxl;-><init>(IB)V

    .line 72
    .line 73
    .line 74
    const-class v6, Landroid/view/ViewStub;

    .line 75
    .line 76
    const-string v7, "inflate"

    .line 77
    .line 78
    invoke-virtual {v0, v6, v7, v5}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    const-string v0, "hooked ViewStub.inflate"

    .line 82
    .line 83
    invoke-static {v4, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :goto_2
    sget-object v0, Lyl;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 87
    .line 88
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 93
    .line 94
    const-class v6, Landroid/view/View;

    .line 95
    .line 96
    if-nez v0, :cond_3

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    new-instance v0, Lxl;

    .line 100
    .line 101
    const/4 v7, 0x2

    .line 102
    const/4 v8, 0x0

    .line 103
    invoke-direct {v0, v7, v8}, Lxl;-><init>(IB)V

    .line 104
    .line 105
    .line 106
    filled-new-array {v5, v0}, [Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v7, "setVisibility"

    .line 111
    .line 112
    invoke-static {v6, v7, v0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 113
    .line 114
    .line 115
    :goto_3
    invoke-static {v1, v2}, Lyl;->ν(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    new-instance v7, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-eqz v9, :cond_11

    .line 133
    .line 134
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    check-cast v9, Ljava/lang/reflect/Method;

    .line 139
    .line 140
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v9}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    new-instance v11, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 157
    .line 158
    .line 159
    array-length v12, v10

    .line 160
    move v13, v2

    .line 161
    :goto_5
    if-ge v13, v12, :cond_6

    .line 162
    .line 163
    aget-object v14, v10, v13

    .line 164
    .line 165
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 166
    .line 167
    .line 168
    move-result v15

    .line 169
    invoke-static {v15}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 170
    .line 171
    .line 172
    move-result v15

    .line 173
    if-nez v15, :cond_4

    .line 174
    .line 175
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v15

    .line 179
    move/from16 v16, v2

    .line 180
    .line 181
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 182
    .line 183
    invoke-static {v15, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-eqz v2, :cond_5

    .line 188
    .line 189
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    array-length v2, v2

    .line 194
    if-ne v2, v3, :cond_5

    .line 195
    .line 196
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    aget-object v2, v2, v16

    .line 201
    .line 202
    invoke-static {v2, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-nez v2, :cond_5

    .line 207
    .line 208
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_4
    move/from16 v16, v2

    .line 213
    .line 214
    :cond_5
    :goto_6
    add-int/lit8 v13, v13, 0x1

    .line 215
    .line 216
    move/from16 v2, v16

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_6
    move/from16 v16, v2

    .line 220
    .line 221
    new-instance v2, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v11

    .line 234
    if-eqz v11, :cond_f

    .line 235
    .line 236
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    move-object v12, v11

    .line 241
    check-cast v12, Ljava/lang/reflect/Method;

    .line 242
    .line 243
    invoke-virtual {v9}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 244
    .line 245
    .line 246
    move-result-object v13

    .line 247
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    array-length v14, v13

    .line 251
    move/from16 v15, v16

    .line 252
    .line 253
    :goto_8
    if-ge v15, v14, :cond_e

    .line 254
    .line 255
    aget-object v17, v13, v15

    .line 256
    .line 257
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-result-object v17

    .line 261
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    const-string v17, "~79044D353CB554BD2E6921EC694522A26B913DAA69168678EA59C385DC1D8578FBBACD15"

    .line 266
    .line 267
    move-object/from16 p0, v6

    .line 268
    .line 269
    invoke-static/range {v17 .. v17}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    if-eqz v3, :cond_d

    .line 278
    .line 279
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    aget-object v3, v3, v16

    .line 284
    .line 285
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    array-length v12, v6

    .line 296
    move/from16 v13, v16

    .line 297
    .line 298
    move v14, v13

    .line 299
    :goto_9
    if-ge v13, v12, :cond_8

    .line 300
    .line 301
    aget-object v15, v6, v13

    .line 302
    .line 303
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    move-result-object v15

    .line 307
    invoke-static {v15, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v15

    .line 311
    if-eqz v15, :cond_7

    .line 312
    .line 313
    add-int/lit8 v14, v14, 0x1

    .line 314
    .line 315
    :cond_7
    add-int/lit8 v13, v13, 0x1

    .line 316
    .line 317
    goto :goto_9

    .line 318
    :cond_8
    array-length v12, v6

    .line 319
    move/from16 v13, v16

    .line 320
    .line 321
    move v15, v13

    .line 322
    :goto_a
    if-ge v13, v12, :cond_a

    .line 323
    .line 324
    aget-object v17, v6, v13

    .line 325
    .line 326
    move-object/from16 v18, v3

    .line 327
    .line 328
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    move-object/from16 v17, v5

    .line 333
    .line 334
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 335
    .line 336
    invoke-static {v3, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    if-eqz v3, :cond_9

    .line 341
    .line 342
    add-int/lit8 v15, v15, 0x1

    .line 343
    .line 344
    :cond_9
    add-int/lit8 v13, v13, 0x1

    .line 345
    .line 346
    move-object/from16 v5, v17

    .line 347
    .line 348
    move-object/from16 v3, v18

    .line 349
    .line 350
    goto :goto_a

    .line 351
    :cond_a
    move-object/from16 v18, v3

    .line 352
    .line 353
    move-object/from16 v17, v5

    .line 354
    .line 355
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    array-length v5, v3

    .line 363
    move/from16 v6, v16

    .line 364
    .line 365
    :goto_b
    if-ge v6, v5, :cond_b

    .line 366
    .line 367
    aget-object v12, v3, v6

    .line 368
    .line 369
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v12

    .line 373
    const-string v13, "X.InterfaceC902340ZJl"

    .line 374
    .line 375
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v12

    .line 379
    if-eqz v12, :cond_c

    .line 380
    .line 381
    const/4 v12, 0x1

    .line 382
    if-lt v14, v12, :cond_b

    .line 383
    .line 384
    if-lt v15, v12, :cond_b

    .line 385
    .line 386
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    :cond_b
    :goto_c
    move-object/from16 v6, p0

    .line 390
    .line 391
    move-object/from16 v5, v17

    .line 392
    .line 393
    const/4 v3, 0x1

    .line 394
    goto/16 :goto_7

    .line 395
    .line 396
    :cond_c
    add-int/lit8 v6, v6, 0x1

    .line 397
    .line 398
    goto :goto_b

    .line 399
    :cond_d
    move-object/from16 v17, v5

    .line 400
    .line 401
    add-int/lit8 v15, v15, 0x1

    .line 402
    .line 403
    move-object/from16 v6, p0

    .line 404
    .line 405
    const/4 v3, 0x1

    .line 406
    goto/16 :goto_8

    .line 407
    .line 408
    :cond_e
    move-object/from16 v17, v5

    .line 409
    .line 410
    move-object/from16 p0, v6

    .line 411
    .line 412
    goto :goto_c

    .line 413
    :cond_f
    move-object/from16 v17, v5

    .line 414
    .line 415
    move-object/from16 p0, v6

    .line 416
    .line 417
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-eqz v5, :cond_10

    .line 426
    .line 427
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    check-cast v5, Ljava/lang/reflect/Method;

    .line 432
    .line 433
    const/4 v12, 0x1

    .line 434
    invoke-virtual {v5, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 435
    .line 436
    .line 437
    goto :goto_d

    .line 438
    :cond_10
    invoke-static {v7, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 439
    .line 440
    .line 441
    move-object/from16 v6, p0

    .line 442
    .line 443
    move/from16 v2, v16

    .line 444
    .line 445
    move-object/from16 v5, v17

    .line 446
    .line 447
    const/4 v3, 0x1

    .line 448
    goto/16 :goto_4

    .line 449
    .line 450
    :cond_11
    move/from16 v16, v2

    .line 451
    .line 452
    invoke-static {v0, v7}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    :cond_12
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    const-string v3, "):"

    .line 465
    .line 466
    const-string v5, "("

    .line 467
    .line 468
    const-string v6, "#"

    .line 469
    .line 470
    if-eqz v2, :cond_14

    .line 471
    .line 472
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    check-cast v2, Ljava/lang/reflect/Method;

    .line 477
    .line 478
    invoke-static {v2}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v7

    .line 482
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v8

    .line 486
    invoke-static {v8, v2}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v9

    .line 490
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    move-result-object v10

    .line 494
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    new-instance v11, Ljava/util/ArrayList;

    .line 498
    .line 499
    array-length v12, v10

    .line 500
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 501
    .line 502
    .line 503
    array-length v12, v10

    .line 504
    move/from16 v13, v16

    .line 505
    .line 506
    :goto_f
    if-ge v13, v12, :cond_13

    .line 507
    .line 508
    aget-object v14, v10, v13

    .line 509
    .line 510
    const/4 v15, 0x1

    .line 511
    invoke-static {v14, v11, v13, v15}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 512
    .line 513
    .line 514
    move-result v13

    .line 515
    goto :goto_f

    .line 516
    :cond_13
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 517
    .line 518
    .line 519
    move-result v10

    .line 520
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 521
    .line 522
    .line 523
    const/16 v23, 0x0

    .line 524
    .line 525
    const/16 v24, 0x3e

    .line 526
    .line 527
    const-string v19, ","

    .line 528
    .line 529
    const/16 v20, 0x0

    .line 530
    .line 531
    const/16 v21, 0x0

    .line 532
    .line 533
    const/16 v22, 0x0

    .line 534
    .line 535
    move-object/from16 v18, v11

    .line 536
    .line 537
    invoke-static/range {v18 .. v24}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v10

    .line 541
    invoke-static {v7, v6, v8, v5, v10}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    move-result-object v5

    .line 545
    invoke-static {v5, v3, v9}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    sget-object v5, Lyl;->η:Ljava/util/Set;

    .line 550
    .line 551
    invoke-interface {v5, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    if-eqz v3, :cond_12

    .line 556
    .line 557
    const/4 v12, 0x1

    .line 558
    invoke-virtual {v2, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 559
    .line 560
    .line 561
    sget-object v3, Lxq0;->α:Lxq0;

    .line 562
    .line 563
    new-instance v5, Lxl;

    .line 564
    .line 565
    const/4 v7, 0x0

    .line 566
    const/4 v8, 0x0

    .line 567
    invoke-direct {v5, v7, v8}, Lxl;-><init>(IB)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v3, v2, v5}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    const-string v5, "hooked publish preview "

    .line 586
    .line 587
    invoke-static {v5, v3, v6, v2, v4}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    goto/16 :goto_e

    .line 591
    .line 592
    :cond_14
    move/from16 v2, v16

    .line 593
    .line 594
    invoke-static {v1, v2}, Lyl;->μ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 603
    .line 604
    .line 605
    move-result v1

    .line 606
    if-eqz v1, :cond_17

    .line 607
    .line 608
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    check-cast v1, Ljava/lang/reflect/Method;

    .line 613
    .line 614
    invoke-static {v1}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v7

    .line 618
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v8

    .line 622
    invoke-static {v8, v1}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v9

    .line 626
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    move-result-object v10

    .line 630
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    new-instance v11, Ljava/util/ArrayList;

    .line 634
    .line 635
    array-length v12, v10

    .line 636
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 637
    .line 638
    .line 639
    array-length v12, v10

    .line 640
    move v13, v2

    .line 641
    :goto_11
    if-ge v13, v12, :cond_15

    .line 642
    .line 643
    aget-object v14, v10, v13

    .line 644
    .line 645
    const/4 v15, 0x1

    .line 646
    invoke-static {v14, v11, v13, v15}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 647
    .line 648
    .line 649
    move-result v13

    .line 650
    goto :goto_11

    .line 651
    :cond_15
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 652
    .line 653
    .line 654
    move-result v10

    .line 655
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 656
    .line 657
    .line 658
    const/16 v16, 0x0

    .line 659
    .line 660
    const/16 v17, 0x3e

    .line 661
    .line 662
    const-string v12, ","

    .line 663
    .line 664
    const/4 v13, 0x0

    .line 665
    const/4 v14, 0x0

    .line 666
    const/4 v15, 0x0

    .line 667
    invoke-static/range {v11 .. v17}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v10

    .line 671
    invoke-static {v7, v6, v8, v5, v10}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    move-result-object v7

    .line 675
    invoke-static {v7, v3, v9}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v7

    .line 679
    sget-object v8, Lyl;->ζ:Ljava/util/Set;

    .line 680
    .line 681
    invoke-interface {v8, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    move-result v7

    .line 685
    if-nez v7, :cond_16

    .line 686
    .line 687
    const/4 v12, 0x1

    .line 688
    goto :goto_10

    .line 689
    :cond_16
    const/4 v12, 0x1

    .line 690
    invoke-virtual {v1, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 691
    .line 692
    .line 693
    sget-object v7, Lxq0;->α:Lxq0;

    .line 694
    .line 695
    new-instance v8, Lfb2;

    .line 696
    .line 697
    const/4 v9, 0x1

    .line 698
    invoke-direct {v8, v9}, Lfb2;-><init>(I)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v7, v1, v8}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    move-result-object v7

    .line 708
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v7

    .line 712
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    const-string v8, "hooked "

    .line 717
    .line 718
    invoke-static {v8, v7, v6, v1, v4}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    goto :goto_10

    .line 722
    :cond_17
    return-void
.end method
