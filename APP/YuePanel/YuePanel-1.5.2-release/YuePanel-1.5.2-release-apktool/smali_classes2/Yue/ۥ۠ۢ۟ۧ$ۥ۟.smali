.class public final LYue/ۥ۠ۢ۟ۧ$ۥ۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢ۟ۧ;->ۥ۟۟ۢۡ(Ljava/io/File;Ljava/io/File;ZLYue/ۥۣ۠ۢۢ;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "Ljava/io/File;",
        "Ljava/io/IOException;",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۠ۢۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "Ljava/io/File;",
            "Ljava/io/IOException;",
            "LYue/\u06e5\u06e1\u06e3\u06e1\u06e8;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۢۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/io/File;",
            "-",
            "Ljava/io/IOException;",
            "+",
            "LYue/\u06e5\u06e1\u06e3\u06e1\u06e8;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۢ۟ۧ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۠ۢۢ;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/io/File;

    check-cast p2, Ljava/io/IOException;

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۢ۟ۧ$ۥ۟;->ۥ۟۟(Ljava/io/File;Ljava/io/IOException;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/io/File;Ljava/io/IOException;)V
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/io/IOException;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "f"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۢ۟ۧ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۠ۢۢ;

    invoke-interface {v0, p1, p2}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LYue/ۥۣۡۡۨ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۡۨ;

    if-eq p2, v0, :cond_0

    return-void

    :cond_0
    new-instance p2, LYue/ۥۢۡ۟ۨ;

    invoke-direct {p2, p1}, LYue/ۥۢۡ۟ۨ;-><init>(Ljava/io/File;)V

    throw p2
.end method
