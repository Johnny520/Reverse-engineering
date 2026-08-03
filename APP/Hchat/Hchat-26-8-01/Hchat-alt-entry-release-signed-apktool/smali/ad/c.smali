.class public final Lad/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lrf/b;


# static fields
.field public static final c:Lmh/b;


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Lrf/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lad/c;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lad/c;->c:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/util/EnumSet;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lad/c;->a:Ljava/util/Set;

    .line 5
    .line 6
    sget-object v0, Lzc/a;->i:Lzc/a;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance p1, Lrf/c;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object p1, Lrf/a;->a:Lrf/a;

    .line 21
    .line 22
    :goto_0
    iput-object p1, p0, Lad/c;->b:Lrf/b;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Lnf/a;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lad/c;->b:Lrf/b;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lrf/b;->a(Lnf/a;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lad/c;->b:Lrf/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lrf/b;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lad/c;->b:Lrf/b;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lrf/b;->c(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lad/c;->b:Lrf/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lrf/b;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
