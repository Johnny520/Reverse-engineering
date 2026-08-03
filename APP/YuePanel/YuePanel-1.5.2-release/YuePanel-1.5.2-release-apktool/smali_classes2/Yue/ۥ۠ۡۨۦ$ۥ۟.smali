.class public final LYue/ۥ۠ۡۨۦ$ۥ۟;
.super LYue/ۥ۟۟ۡۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡۨۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ;,
        LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟;,
        LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;,
        LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟۟;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e1\u06e1<",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۥ:Ljava/util/ArrayDeque;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "LYue/\u06e5\u06e0\u06e1\u06e8\u06e6$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥ۠ۡۨۦ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۡۨۦ;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡۨۦ;

    invoke-direct {p0}, LYue/ۥ۟۟ۡۡ;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/util/ArrayDeque;

    invoke-static {p1}, LYue/ۥ۠ۡۨۦ;->ۥ۟۟۟ۢ(LYue/ۥ۠ۡۨۦ;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, LYue/ۥ۠ۡۨۦ;->ۥ۟۟۟ۢ(LYue/ۥ۠ۡۨۦ;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥ۟۟۟ۢ(Ljava/io/File;)LYue/ۥ۠ۡۨۦ$ۥ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LYue/ۥ۠ۡۨۦ;->ۥ۟۟۟ۢ(LYue/ۥ۠ۡۨۦ;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟;

    invoke-static {p1}, LYue/ۥ۠ۡۨۦ;->ۥ۟۟۟ۢ(LYue/ۥ۠ۡۨۦ;)Ljava/io/File;

    move-result-object p1

    invoke-direct {v1, p0, p1}, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟;-><init>(LYue/ۥ۠ۡۨۦ$ۥ۟;Ljava/io/File;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LYue/ۥ۟۟ۡۡ;->ۥ۟()V

    :goto_0
    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥۣ۟۟۟()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, LYue/ۥ۟۟ۡۡ;->ۥ۟۟(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۟۟ۡۡ;->ۥ۟()V

    :goto_0
    return-void
.end method

.method public final ۥ۟۟۟ۢ(Ljava/io/File;)LYue/ۥ۠ۡۨۦ$ۥ;
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡۨۦ;

    invoke-static {v0}, LYue/ۥ۠ۡۨۦ;->ۥ۟۟(LYue/ۥ۠ۡۨۦ;)LYue/ۥ۠ۢ۟ۢ;

    move-result-object v0

    sget-object v1, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟۟;->ۥ:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-instance v0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ;-><init>(LYue/ۥ۠ۡۨۦ$ۥ۟;Ljava/io/File;)V

    goto :goto_0

    :cond_0
    new-instance p1, LYue/ۥۣۣۡۢ;

    invoke-direct {p1}, LYue/ۥۣۣۡۢ;-><init>()V

    throw p1

    :cond_1
    new-instance v0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;-><init>(LYue/ۥ۠ۡۨۦ$ۥ۟;Ljava/io/File;)V

    :goto_0
    return-object v0
.end method

.method public final ۥۣ۟۟۟()Ljava/io/File;
    .locals 3

    :goto_0
    iget-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۡۨۦ$ۥ۟۟;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, LYue/ۥ۠ۡۨۦ$ۥ۟۟;->ۥ۟()Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LYue/ۥ۠ۡۨۦ$ۥ۟۟;->ۥ()Ljava/io/File;

    move-result-object v0

    invoke-static {v1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v0

    iget-object v2, p0, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡۨۦ;

    invoke-static {v2}, LYue/ۥ۠ۡۨۦ;->ۥ۟۟۟(LYue/ۥ۠ۡۨۦ;)I

    move-result v2

    if-lt v0, v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/util/ArrayDeque;

    invoke-virtual {p0, v1}, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥ۟۟۟ۢ(Ljava/io/File;)LYue/ۥ۠ۡۨۦ$ۥ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-object v1
.end method
