.class public final Lxg/k;
.super Lqg/p;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:Lxg/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxg/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lqg/p;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxg/k;->i:Lxg/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object v0
.end method

.method public final w(Lwf/g;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object p1, Lxg/e;->j:Lxg/e;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p1, p1, Lxg/e;->i:Lxg/c;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, p2, v0, v1}, Lxg/c;->b(Ljava/lang/Runnable;ZZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final y(I)Lqg/p;
    .locals 1

    .line 1
    invoke-static {p1}, Lvg/a;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lxg/j;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lqg/p;->y(I)Lqg/p;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
