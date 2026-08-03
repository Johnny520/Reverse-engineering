.class public final LYue/ۥ۟ۧۦۧ$ۥ۟۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۧۦۧ;->ۥ۟۟(LYue/ۥ۟ۧۦۥ;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "Ljava/lang/Boolean;",
        "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥ۟ۧۦۧ$ۥ۟۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۟ۧۦۧ$ۥ۟۟;

    invoke-direct {v0}, LYue/ۥ۟ۧۦۧ$ۥ۟۟;-><init>()V

    sput-object v0, LYue/ۥ۟ۧۦۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۧ$ۥ۟۟;

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

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, LYue/ۥ۟ۧۦۥ$ۥ۟;

    invoke-virtual {p0, p1, p2}, LYue/ۥ۟ۧۦۧ$ۥ۟۟;->ۥ۟۟(ZLYue/ۥ۟ۧۦۥ$ۥ۟;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(ZLYue/ۥ۟ۧۦۥ$ۥ۟;)Ljava/lang/Boolean;
    .locals 0
    .param p2    # LYue/ۥ۟ۧۦۥ$ۥ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    if-nez p1, :cond_1

    instance-of p1, p2, LYue/ۥ۟ۧۦۣ;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
