.class public final synthetic LYue/ۥۡۨۢۦ$ۥۣ۟۟۟;
.super LYue/ۥۣۣ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۨۢۦ;->ۥ۟۟ۦۣ(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e3\u06e3\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "LYue/\u06e5\u06e1\u06e8\u06e2<",
        "+TR;>;",
        "Ljava/util/Iterator<",
        "+TR;>;>;"
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۡۨۢۦ$ۥۣ۟۟۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۡۨۢۦ$ۥۣ۟۟۟;

    invoke-direct {v0}, LYue/ۥۡۨۢۦ$ۥۣ۟۟۟;-><init>()V

    sput-object v0, LYue/ۥۡۨۢۦ$ۥۣ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۨۢۦ$ۥۣ۟۟۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "iterator()Ljava/util/Iterator;"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, LYue/ۥۡۨۢ;

    const-string v3, "iterator"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LYue/ۥۣۣ۠ۦ;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۡۨۢ;

    invoke-virtual {p0, p1}, LYue/ۥۡۨۢۦ$ۥۣ۟۟۟;->ۥ۟۟ۡۦ(LYue/ۥۡۨۢ;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟ۡۦ(LYue/ۥۡۨۢ;)Ljava/util/Iterator;
    .locals 1
    .param p1    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TR;>;)",
            "Ljava/util/Iterator<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "p0"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
