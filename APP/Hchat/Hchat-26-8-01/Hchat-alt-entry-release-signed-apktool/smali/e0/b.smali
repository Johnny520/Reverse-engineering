.class public abstract Le0/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lx1/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    const/16 v1, 0xa

    .line 5
    .line 6
    int-to-float v1, v1

    .line 7
    new-instance v2, Lx1/l;

    .line 8
    .line 9
    invoke-direct {v2, v1, v0, v1, v0}, Lx1/l;-><init>(FFFF)V

    .line 10
    .line 11
    .line 12
    sput-object v2, Le0/b;->a:Lx1/l;

    .line 13
    .line 14
    return-void
.end method

.method public static final a(ZZLfg/a;)Ly0/o;
    .locals 1

    .line 1
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    sget-boolean p0, Le0/e;->a:Z

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance v0, Ls1/e0;

    .line 12
    .line 13
    sget-object p0, Le0/b;->a:Lx1/l;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Ls1/e0;-><init>(Lx1/l;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance p0, Le0/a;

    .line 19
    .line 20
    invoke-direct {p0, p2}, Le0/a;-><init>(Lfg/a;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, p0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    return-object v0
.end method
