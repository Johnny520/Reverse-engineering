.class public final LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟;
.super LYue/ۥ۠ۡۨۦ$ۥ۟۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡۨۦ$ۥ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"
.end annotation


# instance fields
.field public ۥ۟:Z

.field public final synthetic ۥ۟۟:LYue/ۥ۠ۡۨۦ$ۥ۟;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۡۨۦ$ۥ۟;Ljava/io/File;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۡۨۦ$ۥ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")V"
        }
    .end annotation

    const-string v0, "rootFile"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟;->ۥ۟۟:LYue/ۥ۠ۡۨۦ$ۥ۟;

    invoke-direct {p0, p2}, LYue/ۥ۠ۡۨۦ$ۥ۟۟;-><init>(Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public ۥ۟()Ljava/io/File;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-boolean v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟;->ۥ۟:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟;->ۥ۟:Z

    invoke-virtual {p0}, LYue/ۥ۠ۡۨۦ$ۥ۟۟;->ۥ()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
