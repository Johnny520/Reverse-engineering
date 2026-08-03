.class public final Lgc/b;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final g:Lmh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lgc/b;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lgc/b;->g:Lmh/b;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method

.method public final f(Lud/u;)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    :try_start_0
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    :catch_0
    move-exception p1

    .line 4
    sget-object v0, Lgc/b;->g:Lmh/b;

    .line 5
    .line 6
    const-string v1, "Error in prepare pass init: {}"

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
