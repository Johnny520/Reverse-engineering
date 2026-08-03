.class public final LYue/ۥۣۢۤۧ$ۥ۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۢۤۧ;->ۥ(Landroid/view/View;)LYue/ۥۡۧۤۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "Landroid/view/View;",
        "LYue/\u06e5\u06e1\u06e7\u06e4\u06e2;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۣۢۤۧ$ۥ۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۣۢۤۧ$ۥ۟;

    invoke-direct {v0}, LYue/ۥۣۢۤۧ$ۥ۟;-><init>()V

    sput-object v0, LYue/ۥۣۢۤۧ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۢۤۧ$ۥ۟;

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

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LYue/ۥۣۢۤۧ$ۥ۟;->ۥ۟۟(Landroid/view/View;)LYue/ۥۡۧۤۢ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(Landroid/view/View;)LYue/ۥۡۧۤۢ;
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, LYue/ۥۡۥۦۨ$ۥ;->ۥ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LYue/ۥۡۧۤۢ;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥۡۧۤۢ;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
