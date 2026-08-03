.class public final Lx5/b;
.super Lx5/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ls5/a;


# instance fields
.field public final h:I

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lx5/a;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lx5/b;->h:I

    .line 5
    .line 6
    iput-object p3, p0, Lx5/b;->i:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, Lx5/b;->j:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Lx5/b;->k:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lx5/b;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lx5/b;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lx5/b;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
