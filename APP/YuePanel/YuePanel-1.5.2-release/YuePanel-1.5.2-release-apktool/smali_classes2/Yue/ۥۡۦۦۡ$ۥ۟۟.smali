.class public final LYue/ۥۡۦۦۡ$ۥ۟۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۦۦۡ;->ۥۣ۟۟(Ljava/net/URL;)LYue/ۥۣۡۦ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "LYue/\u06e5\u06e2\u06e6\u06e3\u06e6;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۡۦۦۡ$ۥ۟۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۡۦۦۡ$ۥ۟۟;

    invoke-direct {v0}, LYue/ۥۡۦۦۡ$ۥ۟۟;-><init>()V

    sput-object v0, LYue/ۥۡۦۦۡ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۡۦۦۡ$ۥ۟۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۢۦۣۦ;

    invoke-virtual {p0, p1}, LYue/ۥۡۦۦۡ$ۥ۟۟;->ۥ۟۟(LYue/ۥۢۦۣۦ;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(LYue/ۥۢۦۣۦ;)Ljava/lang/Boolean;
    .locals 1
    .param p1    # LYue/ۥۢۦۣۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "entry"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LYue/ۥۡۦۦۡ;->ۥ۟۟ۢۢ()LYue/ۥۡۦۦۡ$ۥ;

    move-result-object v0

    invoke-virtual {p1}, LYue/ۥۢۦۣۦ;->ۥ()LYue/ۥۣۡۧۧ;

    move-result-object p1

    invoke-static {v0, p1}, LYue/ۥۡۦۦۡ$ۥ;->ۥ(LYue/ۥۡۦۦۡ$ۥ;LYue/ۥۣۡۧۧ;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
