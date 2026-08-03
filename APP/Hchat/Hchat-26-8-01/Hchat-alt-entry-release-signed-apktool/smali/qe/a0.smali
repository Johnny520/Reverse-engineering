.class public final Lqe/a0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final b:Lqe/a0;

.field public static final c:Lqe/a0;

.field public static final d:Lqe/a0;

.field public static final e:Lqe/a0;


# instance fields
.field public final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lqe/z;

    .line 3
    .line 4
    invoke-static {v0}, Lqe/a0;->a([Lqe/z;)Lqe/a0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lqe/a0;->b:Lqe/a0;

    .line 9
    .line 10
    sget-object v0, Lqe/z;->g:Lqe/z;

    .line 11
    .line 12
    filled-new-array {v0}, [Lqe/z;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Lqe/a0;->a([Lqe/z;)Lqe/a0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sput-object v1, Lqe/a0;->c:Lqe/a0;

    .line 21
    .line 22
    sget-object v1, Lqe/z;->h:Lqe/z;

    .line 23
    .line 24
    filled-new-array {v0, v1}, [Lqe/z;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Lqe/a0;->a([Lqe/z;)Lqe/a0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sput-object v1, Lqe/a0;->d:Lqe/a0;

    .line 33
    .line 34
    sget-object v1, Lqe/z;->j:Lqe/z;

    .line 35
    .line 36
    sget-object v2, Lqe/z;->i:Lqe/z;

    .line 37
    .line 38
    filled-new-array {v0, v1, v2}, [Lqe/z;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lqe/a0;->a([Lqe/z;)Lqe/a0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lqe/a0;->e:Lqe/a0;

    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>(Ljava/util/EnumSet;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqe/a0;->a:Ljava/util/Set;

    .line 5
    .line 6
    return-void
.end method

.method public static varargs a([Lqe/z;)Lqe/a0;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    const-class p0, Lqe/z;

    .line 5
    .line 6
    invoke-static {p0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    array-length v1, p0

    .line 14
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    array-length v1, p0

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v1, :cond_1

    .line 20
    .line 21
    aget-object v3, p0, v2

    .line 22
    .line 23
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :goto_1
    new-instance v0, Lqe/a0;

    .line 41
    .line 42
    invoke-direct {v0, p0}, Lqe/a0;-><init>(Ljava/util/EnumSet;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lqe/a0;->a:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
