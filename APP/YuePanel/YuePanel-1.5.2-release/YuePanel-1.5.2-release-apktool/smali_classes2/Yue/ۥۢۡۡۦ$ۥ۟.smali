.class public final LYue/ۥۢۡۡۦ$ۥ۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۡۡۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "LYue/\u06e5\u06e2\u06e1\u06e1\u06e4<",
        "*>;",
        "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
        "LYue/\u06e5\u06e2\u06e1\u06e1\u06e4<",
        "*>;>;"
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۢۡۡۦ$ۥ۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۢۡۡۦ$ۥ۟;

    invoke-direct {v0}, LYue/ۥۢۡۡۦ$ۥ۟;-><init>()V

    sput-object v0, LYue/ۥۢۡۡۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۢۡۡۦ$ۥ۟;

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

    check-cast p1, LYue/ۥۢۡۡۤ;

    check-cast p2, LYue/ۥ۟ۧۦۥ$ۥ۟;

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۡۡۦ$ۥ۟;->ۥ۟۟(LYue/ۥۢۡۡۤ;LYue/ۥ۟ۧۦۥ$ۥ۟;)LYue/ۥۢۡۡۤ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(LYue/ۥۢۡۡۤ;LYue/ۥ۟ۧۦۥ$ۥ۟;)LYue/ۥۢۡۡۤ;
    .locals 0
    .param p1    # LYue/ۥۢۡۡۤ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ$ۥ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e1\u06e1\u06e4<",
            "*>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            ")",
            "LYue/\u06e5\u06e2\u06e1\u06e1\u06e4<",
            "*>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    instance-of p1, p2, LYue/ۥۢۡۡۤ;

    if-eqz p1, :cond_1

    check-cast p2, LYue/ۥۢۡۡۤ;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method
