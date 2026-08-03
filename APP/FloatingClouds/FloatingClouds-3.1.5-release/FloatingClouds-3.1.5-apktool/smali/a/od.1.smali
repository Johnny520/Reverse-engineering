.class public final La/od;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rf;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "toolbar_title"

    const-string v1, "nav_title"

    const-string v2, "title"

    const-string v3, "action_bar"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, La/od;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Landroid/view/View;)Landroid/widget/TextView;
    .locals 2

    const-string v0, "rootView"

    invoke-static {p2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/qf;->a:La/qf;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La/qf;->b(Landroid/app/Activity;)I

    move-result p1

    new-instance v0, La/x2;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, La/x2;-><init>(Ljava/lang/Object;II)V

    invoke-static {p2, v0}, La/n9;->q(Landroid/view/View;La/D7;)Landroid/widget/TextView;

    move-result-object p1

    return-object p1
.end method
