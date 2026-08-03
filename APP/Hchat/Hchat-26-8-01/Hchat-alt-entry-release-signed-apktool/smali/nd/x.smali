.class public final Lnd/x;
.super Loc/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Ljava/util/List;

.field public h:Ljava/util/SortedSet;

.field public final i:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/SortedSet;Ljava/util/HashSet;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnd/x;->g:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lnd/x;->h:Ljava/util/SortedSet;

    .line 7
    .line 8
    iput-object p3, p0, Lnd/x;->i:Ljava/util/HashSet;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Loc/a;
    .locals 1

    .line 1
    sget-object v0, Lmd/b;->r:Lmd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lnd/x;->i:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "METHOD_OVERRIDE: "

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method
