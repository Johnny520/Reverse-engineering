.class public final Lz5/a;
.super Li5/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz5/a;->j:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lz5/a;->k:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lz5/a;->l:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public static g1(Li5/a;)Lz5/a;
    .locals 3

    .line 1
    instance-of v0, p0, Lz5/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lz5/a;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Lz5/a;

    .line 9
    .line 10
    invoke-virtual {p0}, Li5/a;->f1()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0}, Li5/a;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {p0}, Li5/a;->getType()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, v1, v2, p0}, Lz5/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method


# virtual methods
.method public final f1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/a;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/a;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/a;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
