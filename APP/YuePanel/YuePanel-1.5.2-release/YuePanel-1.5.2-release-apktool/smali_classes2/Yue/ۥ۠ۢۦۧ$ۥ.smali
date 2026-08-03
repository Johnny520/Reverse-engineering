.class public final LYue/ۥ۠ۢۦۧ$ۥ;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۡ۠(LYue/ۥۣۡۧۧ;Z)LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
        "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۢۦۧ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۢۦۧ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۢۦۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۢۦۧ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۣۡۧۧ;

    invoke-virtual {p0, p1}, LYue/ۥ۠ۢۦۧ$ۥ;->ۥ۟۟(LYue/ۥۣۡۧۧ;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(LYue/ۥۣۡۧۧ;)LYue/ۥۣۡۧۧ;
    .locals 2
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۢۦۧ;

    const-string v1, "listRecursively"

    invoke-virtual {v0, p1, v1}, LYue/ۥ۠ۢۦۧ;->ۥۣ۟۟ۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    return-object p1
.end method
