.class public final LYue/ۥۡۨۢۦ$ۥ۟۟ۡ۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۨۢۦ;->ۥ۟۠ۨۦ(LYue/ۥۡۨۢ;)LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "TT;TT;",
        "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
        "+TT;+TT;>;>;"
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۡۨۢۦ$ۥ۟۟ۡ۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۡۨۢۦ$ۥ۟۟ۡ۟;

    invoke-direct {v0}, LYue/ۥۡۨۢۦ$ۥ۟۟ۡ۟;-><init>()V

    sput-object v0, LYue/ۥۡۨۢۦ$ۥ۟۟ۡ۟;->ۥۣ۟۟۠:LYue/ۥۡۨۢۦ$ۥ۟۟ۡ۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۨۢۦ$ۥ۟۟ۡ۟;->ۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۣۡۦ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۣۡۦ۠;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)",
            "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p1, p2}, LYue/ۥۢۢۢۡ;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۣۡۦ۠;

    move-result-object p1

    return-object p1
.end method
