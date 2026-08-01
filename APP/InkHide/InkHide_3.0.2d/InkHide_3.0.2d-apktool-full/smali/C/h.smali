.class public final LC/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC/i;
.implements Lu/b;


# static fields
.field public static e:LC/h;


# instance fields
.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, LC/h;->b:Ljava/lang/Object;

    .line 10
    iput-object p2, p0, LC/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/P;Landroidx/lifecycle/O;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    sget-object v0, LJ/a;->b:LJ/a;

    .line 7
    invoke-direct {p0, p1, p2, v0}, LC/h;-><init>(Landroidx/lifecycle/P;Landroidx/lifecycle/O;LJ/b;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/P;Landroidx/lifecycle/O;LJ/b;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LC/h;->b:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LC/h;->c:Ljava/lang/Object;

    .line 5
    iput-object p3, p0, LC/h;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC/h;->b:Ljava/lang/Object;

    iput-object p2, p0, LC/h;->c:Ljava/lang/Object;

    iput-object p3, p0, LC/h;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static t(Landroid/content/Context;Landroid/util/AttributeSet;[II)LC/h;
    .locals 2

    .line 1
    new-instance v0, LC/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {v0, p0, p1}, LC/h;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static u()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedClassVersionError;

    .line 9
    .line 10
    const-string v1, "This function can only be used for API Level < 29."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedClassVersionError;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method


# virtual methods
.method public a()Landroid/content/ClipDescription;
    .locals 1

    .line 1
    iget-object v0, p0, LC/h;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/ClipDescription;

    .line 4
    .line 5
    return-object v0
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public c()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, LC/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/Uri;

    .line 4
    .line 5
    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public e()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, LC/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/Uri;

    .line 4
    .line 5
    return-object v0
.end method

.method public f(Landroidx/fragment/app/l;)V
    .locals 3

    .line 1
    iget-object v0, p0, LC/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LC/h;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p0, LC/h;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p1, Landroidx/fragment/app/l;->l:Z

    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p1

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "Fragment already added: "

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method public g(Ljava/lang/String;)Landroidx/fragment/app/l;
    .locals 1

    .line 1
    iget-object v0, p0, LC/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroidx/fragment/app/F;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return-object p1
.end method

.method public h(Ljava/lang/String;)Landroidx/fragment/app/l;
    .locals 3

    .line 1
    iget-object v0, p0, LC/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroidx/fragment/app/F;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object v1, v1, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 28
    .line 29
    iget-object v2, v1, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v1, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 39
    .line 40
    iget-object v1, v1, Landroidx/fragment/app/z;->c:LC/h;

    .line 41
    .line 42
    invoke-virtual {v1, p1}, LC/h;->h(Ljava/lang/String;)Landroidx/fragment/app/l;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    if-eqz v1, :cond_0

    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_2
    const/4 p1, 0x0

    .line 50
    return-object p1
.end method

.method public i(Ljava/lang/Class;)Landroidx/lifecycle/L;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, p1, v0}, LC/h;->j(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/L;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public j(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/L;
    .locals 5

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC/h;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/lifecycle/P;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Landroidx/lifecycle/P;->a:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroidx/lifecycle/L;

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iget-object v3, p0, LC/h;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Landroidx/lifecycle/O;

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    instance-of p1, v3, Landroidx/lifecycle/J;

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    check-cast v3, Landroidx/lifecycle/J;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v3, 0x0

    .line 39
    :goto_0
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-static {v1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v3, Landroidx/lifecycle/J;->e:Landroidx/lifecycle/u;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    iget-object p2, v3, Landroidx/lifecycle/J;->f:LM/d;

    .line 49
    .line 50
    invoke-static {p2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v1, p2, p1}, Landroidx/lifecycle/G;->a(Landroidx/lifecycle/L;LM/d;Landroidx/lifecycle/u;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    .line 57
    .line 58
    invoke-static {v1, p1}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_2
    new-instance v1, LJ/c;

    .line 63
    .line 64
    iget-object v2, p0, LC/h;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, LJ/b;

    .line 67
    .line 68
    invoke-direct {v1, v2}, LJ/c;-><init>(LJ/b;)V

    .line 69
    .line 70
    .line 71
    sget-object v2, Landroidx/lifecycle/M;->c:Landroidx/lifecycle/M;

    .line 72
    .line 73
    iget-object v4, v1, LJ/b;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v4, Ljava/util/LinkedHashMap;

    .line 76
    .line 77
    invoke-interface {v4, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :try_start_0
    invoke-interface {v3, p1, v1}, Landroidx/lifecycle/O;->h(Ljava/lang/Class;LJ/c;)Landroidx/lifecycle/L;

    .line 81
    .line 82
    .line 83
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    goto :goto_1

    .line 85
    :catch_0
    invoke-interface {v3, p1}, Landroidx/lifecycle/O;->e(Ljava/lang/Class;)Landroidx/lifecycle/L;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :goto_1
    const-string v1, "viewModel"

    .line 90
    .line 91
    invoke-static {p1, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    check-cast p2, Landroidx/lifecycle/L;

    .line 99
    .line 100
    if-eqz p2, :cond_3

    .line 101
    .line 102
    invoke-virtual {p2}, Landroidx/lifecycle/L;->b()V

    .line 103
    .line 104
    .line 105
    :cond_3
    return-object p1
.end method

.method public k()Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LC/h;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroidx/fragment/app/F;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-object v0
.end method

.method public l(I)Landroid/content/res/ColorStateList;
    .locals 3

    .line 1
    iget-object v0, p0, LC/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, LC/h;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v2, v1}, Lb1/h;->w(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public m(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, LC/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, LC/h;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p1, v1}, Lb1/h;->y(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public n(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    iget-object v0, p0, LC/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LC/h;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/content/res/TypedArray;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {}, Li/u;->a()Li/u;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, LC/h;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/content/Context;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    iget-object v2, v0, Li/u;->a:Li/N0;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-virtual {v2, v1, p1, v3}, Li/N0;->d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit v0

    .line 39
    return-object p1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    return-object p1
.end method

.method public o()V
    .locals 2

    .line 1
    iget-object v0, p0, LC/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LC/h;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/view/ViewGroup;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LC/h;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroidx/fragment/app/f;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/fragment/app/g;->d()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public p(IILi/W;)Landroid/graphics/Typeface;
    .locals 11

    .line 1
    const/4 v0, 0x3

    .line 2
    iget-object v1, p0, LC/h;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Landroid/content/res/TypedArray;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-virtual {v1, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 8
    .line 9
    .line 10
    move-result v6

    .line 11
    const/4 p1, 0x0

    .line 12
    if-nez v6, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v1, p0, LC/h;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Landroid/util/TypedValue;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    new-instance v1, Landroid/util/TypedValue;

    .line 22
    .line 23
    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, LC/h;->d:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, LC/h;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Landroid/util/TypedValue;

    .line 31
    .line 32
    sget-object v2, Lq/m;->a:Ljava/lang/ThreadLocal;

    .line 33
    .line 34
    iget-object v2, p0, LC/h;->b:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v3, v2

    .line 37
    check-cast v3, Landroid/content/Context;

    .line 38
    .line 39
    invoke-virtual {v3}, Landroid/content/Context;->isRestricted()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    :goto_0
    return-object p1

    .line 46
    :cond_2
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    const/4 v2, 0x1

    .line 51
    invoke-virtual {v5, v6, v1, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 52
    .line 53
    .line 54
    const-string v2, "ResourcesCompat"

    .line 55
    .line 56
    iget-object v4, v1, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 57
    .line 58
    if-eqz v4, :cond_9

    .line 59
    .line 60
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    const-string v4, "res/"

    .line 65
    .line 66
    invoke-virtual {v7, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_3

    .line 71
    .line 72
    invoke-virtual {p3}, Li/W;->a()V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_7

    .line 76
    .line 77
    :cond_3
    iget v4, v1, Landroid/util/TypedValue;->assetCookie:I

    .line 78
    .line 79
    sget-object v9, Lr/f;->b:Ll/f;

    .line 80
    .line 81
    invoke-static {v5, v6, v7, v4, p2}, Lr/f;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v9, v4}, Ll/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, Landroid/graphics/Typeface;

    .line 90
    .line 91
    if-eqz v4, :cond_4

    .line 92
    .line 93
    new-instance p1, Landroid/os/Handler;

    .line 94
    .line 95
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 100
    .line 101
    .line 102
    new-instance p2, LA0/m;

    .line 103
    .line 104
    invoke-direct {p2, p3, v4, v0}, LA0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 108
    .line 109
    .line 110
    move-object p1, v4

    .line 111
    goto/16 :goto_7

    .line 112
    .line 113
    :cond_4
    :try_start_0
    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    const-string v8, ".xml"

    .line 118
    .line 119
    invoke-virtual {v4, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_6

    .line 124
    .line 125
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v0, v5}, Lq/b;->c(Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources;)Lq/e;

    .line 130
    .line 131
    .line 132
    move-result-object v4
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    .line 133
    if-nez v4, :cond_5

    .line 134
    .line 135
    :try_start_1
    const-string p2, "Failed to find font-family tag"

    .line 136
    .line 137
    invoke-static {v2, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    invoke-virtual {p3}, Li/W;->a()V
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 141
    .line 142
    .line 143
    goto/16 :goto_7

    .line 144
    .line 145
    :catch_0
    move-exception v0

    .line 146
    move-object p2, v0

    .line 147
    move-object v10, p3

    .line 148
    goto :goto_4

    .line 149
    :catch_1
    move-exception v0

    .line 150
    move-object p2, v0

    .line 151
    move-object v10, p3

    .line 152
    goto :goto_5

    .line 153
    :cond_5
    :try_start_2
    iget v8, v1, Landroid/util/TypedValue;->assetCookie:I
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 154
    .line 155
    move v9, p2

    .line 156
    move-object v10, p3

    .line 157
    :try_start_3
    invoke-static/range {v3 .. v10}, Lr/f;->a(Landroid/content/Context;Lq/e;Landroid/content/res/Resources;ILjava/lang/String;IILi/W;)Landroid/graphics/Typeface;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    goto :goto_7

    .line 162
    :catch_2
    move-exception v0

    .line 163
    :goto_1
    move-object p2, v0

    .line 164
    goto :goto_4

    .line 165
    :catch_3
    move-exception v0

    .line 166
    :goto_2
    move-object p2, v0

    .line 167
    goto :goto_5

    .line 168
    :catch_4
    move-exception v0

    .line 169
    move-object v10, p3

    .line 170
    goto :goto_1

    .line 171
    :catch_5
    move-exception v0

    .line 172
    move-object v10, p3

    .line 173
    goto :goto_2

    .line 174
    :cond_6
    move v8, p2

    .line 175
    move-object v10, p3

    .line 176
    iget p2, v1, Landroid/util/TypedValue;->assetCookie:I

    .line 177
    .line 178
    move-object v4, v3

    .line 179
    sget-object v3, Lr/f;->a:Lb1/h;

    .line 180
    .line 181
    invoke-virtual/range {v3 .. v8}, Lb1/h;->o(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    .line 182
    .line 183
    .line 184
    move-result-object p3

    .line 185
    if-eqz p3, :cond_7

    .line 186
    .line 187
    invoke-static {v5, v6, v7, p2, v8}, Lr/f;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-virtual {v9, p2, p3}, Ll/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    :cond_7
    if-eqz p3, :cond_8

    .line 195
    .line 196
    new-instance p2, Landroid/os/Handler;

    .line 197
    .line 198
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-direct {p2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 203
    .line 204
    .line 205
    new-instance v1, LA0/m;

    .line 206
    .line 207
    invoke-direct {v1, v10, p3, v0}, LA0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 211
    .line 212
    .line 213
    :goto_3
    move-object p1, p3

    .line 214
    goto :goto_7

    .line 215
    :cond_8
    invoke-virtual {v10}, Li/W;->a()V
    :try_end_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :goto_4
    const-string p3, "Failed to read xml resource "

    .line 220
    .line 221
    invoke-virtual {p3, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p3

    .line 225
    invoke-static {v2, p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 226
    .line 227
    .line 228
    goto :goto_6

    .line 229
    :goto_5
    const-string p3, "Failed to parse xml resource "

    .line 230
    .line 231
    invoke-virtual {p3, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p3

    .line 235
    invoke-static {v2, p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 236
    .line 237
    .line 238
    :goto_6
    invoke-virtual {v10}, Li/W;->a()V

    .line 239
    .line 240
    .line 241
    :goto_7
    return-object p1

    .line 242
    :cond_9
    new-instance p1, Landroid/content/res/Resources$NotFoundException;

    .line 243
    .line 244
    new-instance p2, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const-string p3, "Resource \""

    .line 247
    .line 248
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p3

    .line 255
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    const-string p3, "\" ("

    .line 259
    .line 260
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p3

    .line 267
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    const-string p3, ") is not a Font: "

    .line 271
    .line 272
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    invoke-direct {p1, p2}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw p1
.end method

.method public q()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, LC/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, LC/h;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v2, p0, LC/h;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-object v1

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw v1
.end method

.method public r(Landroidx/fragment/app/F;)V
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LC/h;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v1, v0, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-static {p1}, Landroidx/fragment/app/z;->E(I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Added fragment to active set "

    .line 31
    .line 32
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v0, "FragmentManager"

    .line 43
    .line 44
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public s(Landroidx/fragment/app/F;)V
    .locals 3

    .line 1
    iget-object p1, p1, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 2
    .line 3
    iget-boolean v0, p1, Landroidx/fragment/app/l;->B:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LC/h;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroidx/fragment/app/B;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/fragment/app/B;->c(Landroidx/fragment/app/l;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LC/h;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/HashMap;

    .line 17
    .line 18
    iget-object v1, p1, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroidx/fragment/app/F;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v0, 0x2

    .line 31
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v1, "Removed fragment from active set "

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "FragmentManager"

    .line 52
    .line 53
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_0
    return-void
.end method

.method public v()V
    .locals 1

    .line 1
    iget-object v0, p0, LC/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
