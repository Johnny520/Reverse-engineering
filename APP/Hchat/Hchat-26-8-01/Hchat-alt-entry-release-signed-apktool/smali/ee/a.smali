.class public final Lee/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lud/r;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/HashSet;

.field public final e:Lee/b;

.field public final f:Lud/a;

.field public g:Lee/b;

.field public h:Ljava/util/List;

.field public i:I


# direct methods
.method public constructor <init>(Lud/r;Lud/a;Ljava/util/ArrayList;)V
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
    iput-object v0, p0, Lee/a;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lee/a;->d:Ljava/util/HashSet;

    .line 17
    .line 18
    new-instance v0, Lee/b;

    .line 19
    .line 20
    invoke-direct {v0}, Lee/b;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lee/a;->e:Lee/b;

    .line 24
    .line 25
    iput-object p1, p0, Lee/a;->a:Lud/r;

    .line 26
    .line 27
    iput-object p2, p0, Lee/a;->f:Lud/a;

    .line 28
    .line 29
    iput-object p3, p0, Lee/a;->b:Ljava/util/ArrayList;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lee/a;->e:Lee/b;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lee/a;->c:Ljava/util/ArrayList;

    .line 8
    .line 9
    const-string v2, "\n  "

    .line 10
    .line 11
    invoke-static {v1, v2}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "\n dups:\n  "

    .line 16
    .line 17
    const-string v3, "\n}"

    .line 18
    .line 19
    const-string v4, "FinallyExtractInfo{\n finally:\n  "

    .line 20
    .line 21
    invoke-static {v4, v0, v2, v1, v3}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method
