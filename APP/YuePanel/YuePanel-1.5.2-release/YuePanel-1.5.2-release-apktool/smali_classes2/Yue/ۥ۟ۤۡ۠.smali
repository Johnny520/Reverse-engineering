.class public abstract LYue/ۥ۟ۤۡ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠ۧ;


# annotations
.annotation build LYue/ۥ۠ۥۦۧ;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e3\u06e3\u06e7<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:I
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:LYue/ۥۣۣ۟;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۤۡ۠;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    iput p2, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۤ:I

    iput-object p3, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۥ:LYue/ۥۣۣ۟;

    return-void
.end method

.method public static synthetic ۥ۟۟۟۠(LYue/ۥ۟ۤۡ۠;LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LYue/ۥ۟ۤۡ۠$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, LYue/ۥ۟ۤۡ۠$ۥ;-><init>(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۤۡ۠;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0, p2}, LYue/ۥ۟ۧۧۦ;->ۥ۟۟۟ۡ(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 10
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, LYue/ۥ۟ۤۡ۠;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    sget-object v2, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    if-eq v1, v2, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "context="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥ۟ۤۡ۠;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget v1, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۤ:I

    const/4 v2, -0x3

    if-eq v1, v2, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "capacity="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۤ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v1, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۥ:LYue/ۥۣۣ۟;

    sget-object v2, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    if-eq v1, v2, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onBufferOverflow="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۥ:LYue/ۥۣۣ۟;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LYue/ۥۣ۟ۨۤ;->ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const-string v1, ", "

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, LYue/ۥ۟ۥۢ۠;->ۥ۟۠ۨۢ(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p1    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۟۠(LYue/ۥ۟ۤۡ۠;LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟(LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)LYue/ۥۣ۠ۢۡ;
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            ")",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۠;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    invoke-interface {p1, v0}, LYue/ۥ۟ۧۦۥ;->plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    sget-object v0, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    if-eq p3, v0, :cond_0

    goto :goto_2

    :cond_0
    iget p3, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۤ:I

    const/4 v0, -0x3

    if-ne p3, v0, :cond_1

    goto :goto_1

    :cond_1
    if-ne p2, v0, :cond_2

    :goto_0
    move p2, p3

    goto :goto_1

    :cond_2
    const/4 v0, -0x2

    if-ne p3, v0, :cond_3

    goto :goto_1

    :cond_3
    if-ne p2, v0, :cond_4

    goto :goto_0

    :cond_4
    add-int/2addr p2, p3

    if-ltz p2, :cond_5

    goto :goto_1

    :cond_5
    const p2, 0x7fffffff

    :goto_1
    iget-object p3, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۥ:LYue/ۥۣۣ۟;

    :goto_2
    iget-object v0, p0, LYue/ۥ۟ۤۡ۠;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget v0, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۤ:I

    if-ne p2, v0, :cond_6

    iget-object v0, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۥ:LYue/ۥۣۣ۟;

    if-ne p3, v0, :cond_6

    return-object p0

    :cond_6
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۟ۢ(LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)LYue/ۥ۟ۤۡ۠;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract ۥ۟۟۟ۡ(LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .param p1    # LYue/ۥۡۥۡۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۢ(LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)LYue/ۥ۟ۤۡ۠;
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            ")",
            "LYue/\u06e5\u06df\u06e4\u06e1\u06e0<",
            "TT;>;"
        }
    .end annotation
.end method

.method public ۥۣ۟۟۟()LYue/ۥۣ۠ۢۡ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۥ۟۟۟ۤ()LYue/ۥۣ۠ۢۢ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۤۡ۠$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LYue/ۥ۟ۤۡ۠$ۥ۟;-><init>(LYue/ۥ۟ۤۡ۠;LYue/ۥ۟ۧۤۢ;)V

    return-object v0
.end method

.method public final ۥ۟۟۟ۥ()I
    .locals 2

    iget v0, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۤ:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_0

    const/4 v0, -0x2

    :cond_0
    return v0
.end method

.method public ۥ۟۟۟ۧ(LYue/ۥ۟ۧۧۥ;)LYue/ۥۡۦۡۡ;
    .locals 9
    .param p1    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            ")",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TT;>;"
        }
    .end annotation

    iget-object v1, p0, LYue/ۥ۟ۤۡ۠;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    invoke-virtual {p0}, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۟ۥ()I

    move-result v2

    iget-object v3, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۥ:LYue/ۥۣۣ۟;

    sget-object v4, LYue/ۥ۟ۧۨ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۨ;

    invoke-virtual {p0}, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۟ۤ()LYue/ۥۣ۠ۢۢ;

    move-result-object v6

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v8}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟۠(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;LYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p1

    return-object p1
.end method
