.class public final LYue/ۥۡۧۢ۠$ۥ;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۧۢ۠;-><init>(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۦۥ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "Ljava/lang/Integer;",
        "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۡۧۢ۠$ۥ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۡۧۢ۠$ۥ;

    invoke-direct {v0}, LYue/ۥۡۧۢ۠$ۥ;-><init>()V

    sput-object v0, LYue/ۥۡۧۢ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۧۢ۠$ۥ;

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

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, LYue/ۥ۟ۧۦۥ$ۥ۟;

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۧۢ۠$ۥ;->ۥ۟۟(ILYue/ۥ۟ۧۦۥ$ۥ۟;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(ILYue/ۥ۟ۧۦۥ$ۥ۟;)Ljava/lang/Integer;
    .locals 0
    .param p2    # LYue/ۥ۟ۧۦۥ$ۥ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    add-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
