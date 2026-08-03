.class public final Lud/o;
.super Lmd/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lud/h;


# instance fields
.field public final i:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lmd/e;-><init>()V

    .line 17
    iput-object p1, p0, Lud/o;->i:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lud/p;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lmd/e;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lud/o;->i:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final g()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/o;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "IC"

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "InsnContainer"

    .line 2
    .line 3
    return-object v0
.end method
