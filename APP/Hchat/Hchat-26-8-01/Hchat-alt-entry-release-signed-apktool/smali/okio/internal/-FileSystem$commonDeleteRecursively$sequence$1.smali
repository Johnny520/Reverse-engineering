.class final Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokio/internal/-FileSystem;->commonDeleteRecursively(Lokio/FileSystem;Lokio/Path;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lyf/h;",
        "Lfg/p;"
    }
.end annotation

.annotation runtime Lyf/e;
    c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1"
    f = "FileSystem.kt"
    l = {
        0x4b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $fileOrDirectory:Lokio/Path;

.field final synthetic $this_commonDeleteRecursively:Lokio/FileSystem;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lokio/FileSystem;Lokio/Path;Lwf/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokio/FileSystem;",
            "Lokio/Path;",
            "Lwf/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;->$this_commonDeleteRecursively:Lokio/FileSystem;

    .line 2
    .line 3
    iput-object p2, p0, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;->$fileOrDirectory:Lokio/Path;

    .line 4
    .line 5
    invoke-direct {p0, p3}, Lyf/h;-><init>(Lwf/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lwf/c;",
            ")",
            "Lwf/c;"
        }
    .end annotation

    .line 1
    new-instance v0, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;

    .line 2
    .line 3
    iget-object v1, p0, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;->$this_commonDeleteRecursively:Lokio/FileSystem;

    .line 4
    .line 5
    iget-object v2, p0, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;->$fileOrDirectory:Lokio/Path;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;-><init>(Lokio/FileSystem;Lokio/Path;Lwf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lng/l;

    check-cast p2, Lwf/c;

    invoke-virtual {p0, p1, p2}, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;->invoke(Lng/l;Lwf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lng/l;Lwf/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lng/l;",
            "Lwf/c;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;

    .line 6
    .line 7
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;->label:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;->L$0:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v2, p1

    .line 25
    check-cast v2, Lng/l;

    .line 26
    .line 27
    iget-object v3, p0, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;->$this_commonDeleteRecursively:Lokio/FileSystem;

    .line 28
    .line 29
    new-instance v4, Ltf/k;

    .line 30
    .line 31
    invoke-direct {v4}, Ltf/k;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object v5, p0, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;->$fileOrDirectory:Lokio/Path;

    .line 35
    .line 36
    iput v1, p0, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;->label:I

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x1

    .line 40
    move-object v8, p0

    .line 41
    invoke-static/range {v2 .. v8}, Lokio/internal/-FileSystem;->collectRecursively(Lng/l;Lokio/FileSystem;Ltf/k;Lokio/Path;ZZLwf/c;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 46
    .line 47
    if-ne p1, v0, :cond_2

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 51
    .line 52
    return-object p1
.end method
