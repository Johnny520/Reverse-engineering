.class public final synthetic LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۠$ۥ;
.super LYue/ۥۣۣ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۠;->ۥ۟۟(LYue/ۥ۠ۢ۟۟;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e3\u06e3\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "Ljava/nio/file/Path;",
        "Ljava/nio/file/attribute/BasicFileAttributes;",
        "Ljava/nio/file/FileVisitResult;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۠ۢۤ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e1;",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e2;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۤ:Ljava/nio/file/Path;

.field public final synthetic ۥ۟۟۠ۥ:Ljava/nio/file/Path;

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۤ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            "Ljava/lang/Exception;",
            "LYue/\u06e5\u06e1\u06e3\u06e2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۢۤ;Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e1;",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/Path;",
            "+",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e2;",
            ">;",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/lang/Exception;",
            "+",
            "LYue/\u06e5\u06e1\u06e3\u06e2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۢۤ;

    iput-object p2, p0, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۤ:Ljava/nio/file/Path;

    iput-object p3, p0, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۥ:Ljava/nio/file/Path;

    iput-object p4, p0, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۤ;

    const-string v4, "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;"

    const/4 v5, 0x0

    const/4 v1, 0x2

    const-class v2, LYue/ۥ۠ۥۧ۠$ۥ;

    const-string v3, "copy"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LYue/ۥۣۣ۠ۦ;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/nio/file/Path;

    check-cast p2, Ljava/nio/file/attribute/BasicFileAttributes;

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۠$ۥ;->ۥ۟۟ۡۦ(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟ۡۦ(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 7
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/nio/file/attribute/BasicFileAttributes;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "p0"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۢۤ;

    iget-object v2, p0, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۤ:Ljava/nio/file/Path;

    iget-object v3, p0, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۥ:Ljava/nio/file/Path;

    iget-object v4, p0, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۤ;

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v1 .. v6}, LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۡۦ(LYue/ۥۣ۠ۢۤ;Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;

    move-result-object p1

    return-object p1
.end method
