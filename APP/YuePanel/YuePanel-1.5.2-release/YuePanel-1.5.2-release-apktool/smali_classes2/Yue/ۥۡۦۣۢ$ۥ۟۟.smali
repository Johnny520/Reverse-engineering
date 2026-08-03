.class public final LYue/ۥۡۦۣۢ$ۥ۟۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠۠ۨ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۦۣۢ;->ۥ۟۟۟۟(Ljava/lang/CharSequence;I)LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "LYue/\u06e5\u06e1\u06df\u06df;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۦۣۢ;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/CharSequence;

.field public final synthetic ۥ۟۟۠ۥ:I


# direct methods
.method public constructor <init>(LYue/ۥۡۦۣۢ;Ljava/lang/CharSequence;I)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۡۦۣۢ;

    iput-object p2, p0, LYue/ۥۡۦۣۢ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/CharSequence;

    iput p3, p0, LYue/ۥۡۦۣۢ$ۥ۟۟;->ۥ۟۟۠ۥ:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۡۦۣۢ$ۥ۟۟;->ۥ۟۟()LYue/ۥۡ۟۟;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟()LYue/ۥۡ۟۟;
    .locals 3
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۢ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۡۦۣۢ;

    iget-object v1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/CharSequence;

    iget v2, p0, LYue/ۥۡۦۣۢ$ۥ۟۟;->ۥ۟۟۠ۥ:I

    invoke-virtual {v0, v1, v2}, LYue/ۥۡۦۣۢ;->ۥ۟۟(Ljava/lang/CharSequence;I)LYue/ۥۡ۟۟;

    move-result-object v0

    return-object v0
.end method
