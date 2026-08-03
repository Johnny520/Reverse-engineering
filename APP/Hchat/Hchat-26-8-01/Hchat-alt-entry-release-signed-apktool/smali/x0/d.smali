.class public final Lx0/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lm0/k0;
.implements Lwf/e;


# static fields
.field public static final h:Luf/d;


# instance fields
.field public final g:Li0/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Luf/d;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Luf/d;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lx0/d;->h:Luf/d;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Li0/h0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx0/d;->g:Li0/h0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge e(Lwf/g;)Lwf/g;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lf8/i;->q0(Lwf/e;Lwf/g;)Lwf/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final f(Ljava/lang/Integer;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p1, p0, Lx0/d;->g:Li0/h0;

    .line 2
    .line 3
    invoke-virtual {p1}, Li0/h0;->I()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final getKey()Lwf/f;
    .locals 1

    .line 1
    sget-object v0, Lx0/d;->h:Luf/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/d;->g:Li0/h0;

    .line 2
    .line 3
    iget-boolean v0, v0, Li0/h0;->C:Z

    .line 4
    .line 5
    return v0
.end method

.method public final k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final bridge s(Lwf/f;)Lwf/e;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lf8/i;->w(Lwf/e;Lwf/f;)Lwf/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final bridge t(Lwf/f;)Lwf/g;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lf8/i;->l0(Lwf/e;Lwf/f;)Lwf/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
