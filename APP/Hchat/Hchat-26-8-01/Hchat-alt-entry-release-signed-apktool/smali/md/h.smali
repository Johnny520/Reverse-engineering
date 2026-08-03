.class public final Lmd/h;
.super Loc/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Lud/r;

.field public final h:Lud/p;


# direct methods
.method public constructor <init>(Lud/r;Lud/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmd/h;->g:Lud/r;

    .line 5
    .line 6
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lmd/h;->h:Lud/p;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Loc/a;
    .locals 1

    .line 1
    sget-object v0, Lmd/b;->k:Lmd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lmd/h;->h:Lud/p;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "INIT{"

    .line 8
    .line 9
    const-string v2, "}"

    .line 10
    .line 11
    invoke-static {v1, v0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
