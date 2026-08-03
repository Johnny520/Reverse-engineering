.class public final Lj6/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lh6/o;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final j:Lj6/d;


# instance fields
.field public g:Z

.field public final h:Ljava/util/List;

.field public final i:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj6/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lj6/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj6/d;->j:Lj6/d;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lj6/d;->g:Z

    .line 6
    .line 7
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    iput-object v0, p0, Lj6/d;->h:Ljava/util/List;

    .line 10
    .line 11
    iput-object v0, p0, Lj6/d;->i:Ljava/util/List;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Lh6/f;Ln6/a;)Lh6/n;
    .locals 3

    .line 1
    iget-object v0, p2, Ln6/a;->a:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Lj6/d;->c(Ljava/lang/Class;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {p0, v0, v2}, Lj6/d;->c(Ljava/lang/Class;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance v0, Lj6/c;

    .line 20
    .line 21
    invoke-direct {v0, p0, v1, p1, p2}, Lj6/c;-><init>(Lj6/d;ZLh6/f;Ln6/a;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public final b()Lj6/d;
    .locals 1

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lj6/d;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    invoke-static {v0}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public final c(Ljava/lang/Class;Z)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lj6/d;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Class;->isMemberClass()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Ll6/c;->a:Lf8/i;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    return v1

    .line 25
    :cond_0
    if-nez p2, :cond_2

    .line 26
    .line 27
    const-class v0, Ljava/lang/Enum;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    sget-object v0, Ll6/c;->a:Lf8/i;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Class;->isLocalClass()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    :cond_1
    return v1

    .line 60
    :cond_2
    if-eqz p2, :cond_3

    .line 61
    .line 62
    iget-object p1, p0, Lj6/d;->h:Ljava/util/List;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    iget-object p1, p0, Lj6/d;->i:Ljava/util/List;

    .line 66
    .line 67
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    const/4 v0, 0x0

    .line 76
    if-nez p2, :cond_4

    .line 77
    .line 78
    return v0

    .line 79
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {}, Lah/a;->d()V

    .line 87
    .line 88
    .line 89
    return v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj6/d;->b()Lj6/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
