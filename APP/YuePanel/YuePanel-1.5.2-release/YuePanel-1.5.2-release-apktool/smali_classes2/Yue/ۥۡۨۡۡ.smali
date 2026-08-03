.class public LYue/ۥۡۨۡۡ;
.super LYue/ۥۡۨ۠ۦ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e1\u06e8\u06e0\u06e6;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbstractChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractChannel.kt\nkotlinx/coroutines/channels/SendElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1132:1\n1#2:1133\n*E\n"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۦ:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;LYue/ۥۣ۟ۨ۟;)V
    .locals 0
    .param p2    # LYue/ۥۣ۟ۨ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, LYue/ۥۡۨ۠ۦ;-><init>()V

    iput-object p1, p0, LYue/ۥۡۨۡۡ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object p2, p0, LYue/ۥۡۨۡۡ;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LYue/ۥۣ۟ۨۤ;->ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LYue/ۥۣ۟ۨۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۡۨۡۡ;->ۥ۟۟ۦۥ()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۦۤ()V
    .locals 2

    iget-object v0, p0, LYue/ۥۡۨۡۡ;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    sget-object v1, LYue/ۥۣ۟ۨۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    invoke-interface {v0, v1}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟ۧ(Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۦۥ()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۨۡۡ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    return-object v0
.end method

.method public ۥ۟۟ۦۦ(LYue/ۥ۟ۥ;)V
    .locals 2
    .param p1    # LYue/ۥ۟ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۨۡۡ;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-virtual {p1}, LYue/ۥ۟ۥ;->ۥ۟۟ۧۡ()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۦۧ(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)LYue/ۥۢ۠ۦۢ;
    .locals 4
    .param p1    # LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۨۡۡ;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    iget-object v3, p1, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ$ۥ;

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-interface {v0, v1, v3}, LYue/ۥۣ۟ۨ۟;->ۥ۟۟۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v2

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟۟()V

    :cond_2
    sget-object p1, LYue/ۥۣ۟ۨۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    return-object p1
.end method
