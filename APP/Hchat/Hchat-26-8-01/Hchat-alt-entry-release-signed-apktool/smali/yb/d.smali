.class public abstract Lyb/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lf1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lf1/c0;->f()Lf1/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lf1/h;->v(I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lyb/d;->a:Lf1/h;

    .line 10
    .line 11
    return-void
.end method

.method public static final a(Ly0/o;Lv/d;Lfg/a;)Ly0/o;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Lyb/c;

    .line 11
    .line 12
    invoke-direct {v0, p1, p2}, Lyb/c;-><init>(Lf1/r0;Lfg/a;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
