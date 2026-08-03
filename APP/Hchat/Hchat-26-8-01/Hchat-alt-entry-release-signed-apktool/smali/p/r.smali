.class public final Lp/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lp/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp/r;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp/r;->a:Lp/r;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ly0/o;Ly0/c;)Ly0/o;
    .locals 2

    .line 1
    new-instance v0, Lp/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lp/k;-><init>(Ly0/c;Z)V

    .line 5
    .line 6
    .line 7
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static b()Ly0/o;
    .locals 3

    .line 1
    new-instance v0, Lp/k;

    .line 2
    .line 3
    sget-object v1, Ly0/b;->k:Ly0/g;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Lp/k;-><init>(Ly0/c;Z)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
