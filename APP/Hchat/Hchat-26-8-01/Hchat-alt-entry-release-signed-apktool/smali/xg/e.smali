.class public final Lxg/e;
.super Lqg/m0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final j:Lxg/e;


# instance fields
.field public i:Lxg/c;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lxg/e;

    .line 2
    .line 3
    sget v2, Lxg/j;->c:I

    .line 4
    .line 5
    sget v3, Lxg/j;->d:I

    .line 6
    .line 7
    sget-wide v4, Lxg/j;->e:J

    .line 8
    .line 9
    sget-object v6, Lxg/j;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, Lqg/p;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lxg/c;

    .line 15
    .line 16
    invoke-direct/range {v1 .. v6}, Lxg/c;-><init>(IIJLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lxg/e;->i:Lxg/c;

    .line 20
    .line 21
    sput-object v0, Lxg/e;->j:Lxg/e;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Dispatchers.Default cannot be closed"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.Default"

    .line 2
    .line 3
    return-object v0
.end method

.method public final w(Lwf/g;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lxg/e;->i:Lxg/c;

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    invoke-static {p1, p2, v0}, Lxg/c;->c(Lxg/c;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
