.class public final Lte/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:Lbc/k;

.field public final h:Lff/c;

.field public final i:La2/a;

.field public final j:Ljava/lang/ClassLoader;

.field public k:Ll3/w;

.field public final l:Ljava/util/ArrayList;

.field public m:Lfd/h;

.field public n:Z


# direct methods
.method public constructor <init>(Lbc/k;Lff/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lte/b;->l:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p1, p0, Lte/b;->g:Lbc/k;

    .line 12
    .line 13
    iput-object p2, p0, Lte/b;->h:Lff/c;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance p1, La2/a;

    .line 19
    .line 20
    const/16 p2, 0x19

    .line 21
    .line 22
    invoke-direct {p1, p2}, La2/a;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lte/b;->i:La2/a;

    .line 26
    .line 27
    const-class p1, Lff/c;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lte/b;->j:Ljava/lang/ClassLoader;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lte/b;->i:La2/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lte/b;

    .line 2
    .line 3
    invoke-virtual {p0}, Lte/b;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lte/b;->a()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lte/b;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    invoke-virtual {p0}, Lte/b;->a()V

    .line 12
    .line 13
    .line 14
    check-cast p1, Lte/b;

    .line 15
    .line 16
    invoke-virtual {p1}, Lte/b;->a()V

    .line 17
    .line 18
    .line 19
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lte/b;->a()V

    .line 2
    .line 3
    .line 4
    const v0, 0x5434294

    .line 5
    .line 6
    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lte/b;->a()V

    .line 2
    .line 3
    .line 4
    const-string v0, "dex-input"

    .line 5
    .line 6
    return-object v0
.end method
