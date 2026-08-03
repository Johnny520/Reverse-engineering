.class public final LYue/ۥۢ۠ۢۥ$ۥ۟۟۟۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢ۠ۢۥ;->ۥ۟ۡۦۡ(Ljava/lang/CharSequence;[CZI)LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "LYue/\u06e5\u06e0\u06e5\u06e3\u06e8;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢ۠ۢۥ$ۥ۟۟۟۟;->ۥۣ۟۟۠:Ljava/lang/CharSequence;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥ۠ۥۣۨ;

    invoke-virtual {p0, p1}, LYue/ۥۢ۠ۢۥ$ۥ۟۟۟۟;->ۥ۟۟(LYue/ۥ۠ۥۣۨ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(LYue/ۥ۠ۥۣۨ;)Ljava/lang/String;
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۢ۠ۢۥ$ۥ۟۟۟۟;->ۥۣ۟۟۠:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, LYue/ۥۢ۠ۢۥ;->ۥ۟ۡۧۤ(Ljava/lang/CharSequence;LYue/ۥ۠ۥۣۨ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
