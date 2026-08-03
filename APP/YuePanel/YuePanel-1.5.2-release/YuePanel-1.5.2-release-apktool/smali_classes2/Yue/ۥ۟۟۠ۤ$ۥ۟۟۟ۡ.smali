.class public final LYue/ۥ۟۟۠ۤ$ۥ۟۟۟ۡ;
.super LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06e1"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5$\u06e5\u06df\u06df\u06df\u06df<",
        "LYue/\u06e5\u06e1\u06e8\u06e0\u06e6;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbstractChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractChannel.kt\nkotlinx/coroutines/channels/AbstractChannel$TryPollDesc\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1132:1\n1#2:1133\n*E\n"
.end annotation


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۨ۠;)V
    .locals 0
    .param p1    # LYue/ۥۣ۠ۨ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0, p1}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;-><init>(LYue/ۥ۠ۨ۠ۥ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۟(LYue/ۥ۠ۨ۠ۥ;)Ljava/lang/Object;
    .locals 1
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    instance-of v0, p1, LYue/ۥ۟ۥ;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p1, LYue/ۥۡۨ۠ۦ;

    if-nez p1, :cond_1

    sget-object p1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public ۥ۟۟۟ۤ(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)Ljava/lang/Object;
    .locals 1
    .param p1    # LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p1, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ:LYue/ۥ۠ۨ۠ۥ;

    check-cast v0, LYue/ۥۡۨ۠ۦ;

    invoke-virtual {v0, p1}, LYue/ۥۡۨ۠ۦ;->ۥ۟۟ۦۧ(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)LYue/ۥۢ۠ۦۢ;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, LYue/ۥ۠ۨ۠ۦ;->ۥ:Ljava/lang/Object;

    return-object p1

    :cond_0
    sget-object v0, LYue/ۥ۟ۢ۟ۨ;->ۥ۟:Ljava/lang/Object;

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟۟ۥ(LYue/ۥ۠ۨ۠ۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    check-cast p1, LYue/ۥۡۨ۠ۦ;

    invoke-virtual {p1}, LYue/ۥۡۨ۠ۦ;->ۥ۟۟ۦۨ()V

    return-void
.end method
