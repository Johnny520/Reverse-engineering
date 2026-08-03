.class public abstract Lk/v0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Li0/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbi/c;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbi/c;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Li0/u;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Li0/u;-><init>(Lfg/a;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lk/v0;->a:Li0/u;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(Ly0/o;Ln/k;Lk/y0;)Ly0/o;
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    new-instance v0, Lk/w0;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, Lk/w0;-><init>(Ln/k;Lk/y0;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
