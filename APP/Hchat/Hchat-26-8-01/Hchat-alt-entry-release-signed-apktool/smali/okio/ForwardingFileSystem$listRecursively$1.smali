.class final Lokio/ForwardingFileSystem$listRecursively$1;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokio/ForwardingFileSystem;->listRecursively(Lokio/Path;Z)Lng/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgg/m;",
        "Lfg/l;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lokio/ForwardingFileSystem;


# direct methods
.method public constructor <init>(Lokio/ForwardingFileSystem;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokio/ForwardingFileSystem$listRecursively$1;->this$0:Lokio/ForwardingFileSystem;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    check-cast p1, Lokio/Path;

    invoke-virtual {p0, p1}, Lokio/ForwardingFileSystem$listRecursively$1;->invoke(Lokio/Path;)Lokio/Path;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lokio/Path;)Lokio/Path;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokio/ForwardingFileSystem$listRecursively$1;->this$0:Lokio/ForwardingFileSystem;

    .line 5
    .line 6
    const-string v1, "listRecursively"

    .line 7
    .line 8
    invoke-virtual {v0, p1, v1}, Lokio/ForwardingFileSystem;->onPathResult(Lokio/Path;Ljava/lang/String;)Lokio/Path;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
