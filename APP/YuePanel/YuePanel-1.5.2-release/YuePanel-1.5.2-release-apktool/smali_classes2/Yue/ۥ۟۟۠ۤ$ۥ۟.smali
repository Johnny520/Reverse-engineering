.class public LYue/ۥ۟۟۠ۤ$ۥ۟;
.super LYue/ۥۡۦۡ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e1\u06e6\u06e1\u06e0<",
        "TE;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbstractChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractChannel.kt\nkotlinx/coroutines/channels/AbstractChannel$ReceiveElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AbstractChannel.kt\nkotlinx/coroutines/channels/AbstractChannelKt\n*L\n1#1,1132:1\n1#2:1133\n1131#3:1134\n*S KotlinDebug\n*F\n+ 1 AbstractChannel.kt\nkotlinx/coroutines/channels/AbstractChannel$ReceiveElement\n*L\n912#1:1134\n*E\n"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۦ:LYue/ۥۣ۟ۨ۟;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۧ:I
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۨ۟;I)V
    .locals 0
    .param p1    # LYue/ۥۣ۟ۨ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "Ljava/lang/Object;",
            ">;I)V"
        }
    .end annotation

    invoke-direct {p0}, LYue/ۥۡۦۡ۠;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۨ۟;

    iput p2, p0, LYue/ۥ۟۟۠ۤ$ۥ۟;->ۥ۟۟۠ۧ:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReceiveElement@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LYue/ۥۣ۟ۨۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[receiveMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟;->ۥ۟۟۠ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠ۤ(Ljava/lang/Object;LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)LYue/ۥۢ۠ۦۢ;
    .locals 4
    .param p2    # LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5$\u06e5\u06df\u06df\u06df;",
            ")",
            "LYue/\u06e5\u06e2\u06e0\u06e6\u06e2;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۨ۟;

    invoke-virtual {p0, p1}, LYue/ۥ۟۟۠ۤ$ۥ۟;->ۥ۟۟ۦۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    iget-object v3, p2, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ$ۥ;

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual {p0, p1}, LYue/ۥۡۦۡ۠;->ۥ۟۟ۦۥ(Ljava/lang/Object;)LYue/ۥۣ۠ۡ۟;

    move-result-object p1

    invoke-interface {v0, v1, v3, p1}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v2

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟۟()V

    :cond_2
    sget-object p1, LYue/ۥۣ۟ۨۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    return-object p1
.end method

.method public ۥ۟۟ۡۧ(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    iget-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۨ۟;

    sget-object v0, LYue/ۥۣ۟ۨۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    invoke-interface {p1, v0}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟ۧ(Ljava/lang/Object;)V

    return-void
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

    iget v0, p0, LYue/ۥ۟۟۠ۤ$ۥ۟;->ۥ۟۟۠ۧ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۨ۟;

    sget-object v1, LYue/ۥ۟ۤۢ۟;->ۥ۟:LYue/ۥ۟ۤۢ۟$ۥ۟;

    iget-object p1, p1, LYue/ۥ۟ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Throwable;

    invoke-virtual {v1, p1}, LYue/ۥ۟ۤۢ۟$ۥ۟;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۟ۤۢ۟;->ۥ۟(Ljava/lang/Object;)LYue/ۥ۟ۤۢ۟;

    move-result-object p1

    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {p1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۨ۟;

    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-virtual {p1}, LYue/ۥ۟ۥ;->ۥ۟۟ۧ۠()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final ۥ۟۟ۦۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget v0, p0, LYue/ۥ۟۟۠ۤ$ۥ۟;->ۥ۟۟۠ۧ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, LYue/ۥ۟ۤۢ۟;->ۥ۟:LYue/ۥ۟ۤۢ۟$ۥ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۤۢ۟$ۥ۟;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۟ۤۢ۟;->ۥ۟(Ljava/lang/Object;)LYue/ۥ۟ۤۢ۟;

    move-result-object p1

    :cond_0
    return-object p1
.end method
