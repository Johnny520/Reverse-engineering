.class public final Lmd/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Loc/b;


# instance fields
.field public final g:Lmd/b;

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lmd/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lmd/c;->h:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p1, p0, Lmd/c;->g:Lmd/b;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Loc/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lmd/c;->g:Lmd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lmd/c;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    const-string v1, ", "

    .line 4
    .line 5
    invoke-static {v0, v1}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
