.class public final LYue/ۥۡ۟۟۟$ۥ۟$ۥ;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡ۟۟۟$ۥ۟;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "Ljava/lang/Integer;",
        "LYue/\u06e5\u06e0\u06e8\u06e8\u06e8;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡ۟۟۟$ۥ۟;


# direct methods
.method public constructor <init>(LYue/ۥۡ۟۟۟$ۥ۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡ۟۟۟$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡ۟۟۟$ۥ۟;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥۡ۟۟۟$ۥ۟$ۥ;->ۥ۟۟(I)LYue/ۥ۠ۨۨۨ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(I)LYue/ۥ۠ۨۨۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡ۟۟۟$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡ۟۟۟$ۥ۟;

    invoke-virtual {v0, p1}, LYue/ۥۡ۟۟۟$ۥ۟;->get(I)LYue/ۥ۠ۨۨۨ;

    move-result-object p1

    return-object p1
.end method
